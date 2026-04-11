//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: S12 & DS44-1000
// Model Creator: Bidahochi
// Created on: 30.09.2022 - 12:51:47
// Last changed on: 30.09.2022 - 12:51:47

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

import java.util.ArrayList;

public class ModelS12 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelS12() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[393];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 20, 199, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 3, 187, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 3, 187, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 156, 214, textureX, textureY); // box04
		bodyModel[4] = new ModelRendererTurbo(this, 157, 180, textureX, textureY); // Box 713
		bodyModel[5] = new ModelRendererTurbo(this, 157, 180, textureX, textureY); // Box 792
		bodyModel[6] = new ModelRendererTurbo(this, 4, 179, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 301
		bodyModel[9] = new ModelRendererTurbo(this, 161, 102, textureX, textureY); // Box 217
		bodyModel[10] = new ModelRendererTurbo(this, 216, 102, textureX, textureY); // Box 514
		bodyModel[11] = new ModelRendererTurbo(this, 20, 173, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 25, 210, textureX, textureY); // Box 133
		bodyModel[13] = new ModelRendererTurbo(this, 25, 166, textureX, textureY); // Box 134
		bodyModel[14] = new ModelRendererTurbo(this, 149, 186, textureX, textureY); // Box 250
		bodyModel[15] = new ModelRendererTurbo(this, 166, 186, textureX, textureY); // Box 251
		bodyModel[16] = new ModelRendererTurbo(this, 25, 207, textureX, textureY); // Box 252
		bodyModel[17] = new ModelRendererTurbo(this, 25, 170, textureX, textureY); // Box 253
		bodyModel[18] = new ModelRendererTurbo(this, 149, 186, textureX, textureY); // Box 254
		bodyModel[19] = new ModelRendererTurbo(this, 166, 186, textureX, textureY); // Box 255
		bodyModel[20] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // box70
		bodyModel[21] = new ModelRendererTurbo(this, 188, 199, textureX, textureY); // box81
		bodyModel[22] = new ModelRendererTurbo(this, 188, 199, textureX, textureY); // box82
		bodyModel[23] = new ModelRendererTurbo(this, 169, 203, textureX, textureY); // Box 134
		bodyModel[24] = new ModelRendererTurbo(this, 188, 199, textureX, textureY); // Box 708
		bodyModel[25] = new ModelRendererTurbo(this, 169, 203, textureX, textureY); // Box 710
		bodyModel[26] = new ModelRendererTurbo(this, 188, 199, textureX, textureY); // Box 712
		bodyModel[27] = new ModelRendererTurbo(this, 169, 199, textureX, textureY); // Box 245
		bodyModel[28] = new ModelRendererTurbo(this, 169, 199, textureX, textureY); // Box 246
		bodyModel[29] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 247
		bodyModel[30] = new ModelRendererTurbo(this, 188, 206, textureX, textureY); // Box 299
		bodyModel[31] = new ModelRendererTurbo(this, 188, 206, textureX, textureY); // Box 300
		bodyModel[32] = new ModelRendererTurbo(this, 142, 50, textureX, textureY); // box03
		bodyModel[33] = new ModelRendererTurbo(this, 120, 63, textureX, textureY); // box03
		bodyModel[34] = new ModelRendererTurbo(this, 157, 31, textureX, textureY); // box03
		bodyModel[35] = new ModelRendererTurbo(this, 168, 45, textureX, textureY); // box03
		bodyModel[36] = new ModelRendererTurbo(this, 168, 28, textureX, textureY); // box03
		bodyModel[37] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // box03
		bodyModel[38] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // box03
		bodyModel[39] = new ModelRendererTurbo(this, 337, 30, textureX, textureY); // box20
		bodyModel[40] = new ModelRendererTurbo(this, 387, 49, textureX, textureY); // box21
		bodyModel[41] = new ModelRendererTurbo(this, 463, 49, textureX, textureY); // box22
		bodyModel[42] = new ModelRendererTurbo(this, 410, 41, textureX, textureY); // box23
		bodyModel[43] = new ModelRendererTurbo(this, 287, 54, textureX, textureY); // Box 878
		bodyModel[44] = new ModelRendererTurbo(this, 431, 47, textureX, textureY); // Box 314 door swing right
		bodyModel[45] = new ModelRendererTurbo(this, 376, 46, textureX, textureY); // Box 315 door swing right
		bodyModel[46] = new ModelRendererTurbo(this, 442, 41, textureX, textureY); // Box 883
		bodyModel[47] = new ModelRendererTurbo(this, 377, 34, textureX, textureY); // Box 372
		bodyModel[48] = new ModelRendererTurbo(this, 377, 6, textureX, textureY); // Box 467
		bodyModel[49] = new ModelRendererTurbo(this, 386, 34, textureX, textureY); // Box 230
		bodyModel[50] = new ModelRendererTurbo(this, 413, 34, textureX, textureY); // Box 231
		bodyModel[51] = new ModelRendererTurbo(this, 384, 27, textureX, textureY); // Box 232
		bodyModel[52] = new ModelRendererTurbo(this, 415, 27, textureX, textureY); // Box 233
		bodyModel[53] = new ModelRendererTurbo(this, 381, 19, textureX, textureY); // Box 234
		bodyModel[54] = new ModelRendererTurbo(this, 384, 12, textureX, textureY); // Box 235
		bodyModel[55] = new ModelRendererTurbo(this, 415, 12, textureX, textureY); // Box 236
		bodyModel[56] = new ModelRendererTurbo(this, 386, 7, textureX, textureY); // Box 237
		bodyModel[57] = new ModelRendererTurbo(this, 413, 6, textureX, textureY); // Box 238
		bodyModel[58] = new ModelRendererTurbo(this, 432, 21, textureX, textureY); // Box 239
		bodyModel[59] = new ModelRendererTurbo(this, 371, 12, textureX, textureY); // Box 290
		bodyModel[60] = new ModelRendererTurbo(this, 371, 27, textureX, textureY); // Box 291
		bodyModel[61] = new ModelRendererTurbo(this, 372, 36, textureX, textureY); // Box 307
		bodyModel[62] = new ModelRendererTurbo(this, 136, 63, textureX, textureY); // Box 308
		bodyModel[63] = new ModelRendererTurbo(this, 118, 57, textureX, textureY); // Box 309
		bodyModel[64] = new ModelRendererTurbo(this, 62, 32, textureX, textureY); // Box 310 front grill
		bodyModel[65] = new ModelRendererTurbo(this, 125, 63, textureX, textureY); // Box 311
		bodyModel[66] = new ModelRendererTurbo(this, 141, 85, textureX, textureY); // Box 312
		bodyModel[67] = new ModelRendererTurbo(this, 138, 85, textureX, textureY); // Box 315
		bodyModel[68] = new ModelRendererTurbo(this, 135, 85, textureX, textureY); // Box 317
		bodyModel[69] = new ModelRendererTurbo(this, 132, 85, textureX, textureY); // Box 319
		bodyModel[70] = new ModelRendererTurbo(this, 129, 85, textureX, textureY); // Box 321
		bodyModel[71] = new ModelRendererTurbo(this, 126, 85, textureX, textureY); // Box 323
		bodyModel[72] = new ModelRendererTurbo(this, 123, 85, textureX, textureY); // Box 325
		bodyModel[73] = new ModelRendererTurbo(this, 120, 85, textureX, textureY); // Box 327
		bodyModel[74] = new ModelRendererTurbo(this, 117, 85, textureX, textureY); // Box 329
		bodyModel[75] = new ModelRendererTurbo(this, 114, 85, textureX, textureY); // Box 331
		bodyModel[76] = new ModelRendererTurbo(this, 111, 85, textureX, textureY); // Box 333
		bodyModel[77] = new ModelRendererTurbo(this, 108, 85, textureX, textureY); // Box 335
		bodyModel[78] = new ModelRendererTurbo(this, 105, 85, textureX, textureY); // Box 337
		bodyModel[79] = new ModelRendererTurbo(this, 102, 85, textureX, textureY); // Box 339
		bodyModel[80] = new ModelRendererTurbo(this, 118, 60, textureX, textureY); // Box 342
		bodyModel[81] = new ModelRendererTurbo(this, 118, 82, textureX, textureY); // Box 343
		bodyModel[82] = new ModelRendererTurbo(this, 137, 26, textureX, textureY); // Box 879
		bodyModel[83] = new ModelRendererTurbo(this, 133, 44, textureX, textureY); // Box 879
		bodyModel[84] = new ModelRendererTurbo(this, 133, 41, textureX, textureY); // Box 879
		bodyModel[85] = new ModelRendererTurbo(this, 135, 37, textureX, textureY); // Box 879
		bodyModel[86] = new ModelRendererTurbo(this, 112, 48, textureX, textureY); // Box 147
		bodyModel[87] = new ModelRendererTurbo(this, 102, 48, textureX, textureY, "lamp"); // Box 169 headlight front big
		bodyModel[88] = new ModelRendererTurbo(this, 25, 140, textureX, textureY); // Box 353
		bodyModel[89] = new ModelRendererTurbo(this, 95, 140, textureX, textureY); // Box 354
		bodyModel[90] = new ModelRendererTurbo(this, 262, 72, textureX, textureY); // box24
		bodyModel[91] = new ModelRendererTurbo(this, 262, 62, textureX, textureY); // box25
		bodyModel[92] = new ModelRendererTurbo(this, 99, 85, textureX, textureY); // Box 357
		bodyModel[93] = new ModelRendererTurbo(this, 480, 37, textureX, textureY); // Box 147
		bodyModel[94] = new ModelRendererTurbo(this, 492, 37, textureX, textureY, "lamp"); // Box 169 headlight rear big
		bodyModel[95] = new ModelRendererTurbo(this, 108, 46, textureX, textureY, "lamp"); // Box 171 headlight front 2beam
		bodyModel[96] = new ModelRendererTurbo(this, 108, 46, textureX, textureY, "lamp"); // Box 172 headlight front 2beam
		bodyModel[97] = new ModelRendererTurbo(this, 488, 35, textureX, textureY, "lamp"); // Box 171 headlight rear 2beam
		bodyModel[98] = new ModelRendererTurbo(this, 488, 35, textureX, textureY, "lamp"); // Box 172 headlight rear 2beam
		bodyModel[99] = new ModelRendererTurbo(this, 238, 21, textureX, textureY); // Box 364
		bodyModel[100] = new ModelRendererTurbo(this, 238, 14, textureX, textureY); // Box 365
		bodyModel[101] = new ModelRendererTurbo(this, 310, 139, textureX, textureY); // Box 106
		bodyModel[102] = new ModelRendererTurbo(this, 310, 137, textureX, textureY); // Box 372
		bodyModel[103] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 376
		bodyModel[104] = new ModelRendererTurbo(this, 310, 127, textureX, textureY); // Box 109
		bodyModel[105] = new ModelRendererTurbo(this, 310, 125, textureX, textureY); // Box 110
		bodyModel[106] = new ModelRendererTurbo(this, 313, 125, textureX, textureY); // Box 111
		bodyModel[107] = new ModelRendererTurbo(this, 161, 115, textureX, textureY); // Box 116
		bodyModel[108] = new ModelRendererTurbo(this, 195, 115, textureX, textureY); // Box 117
		bodyModel[109] = new ModelRendererTurbo(this, 184, 118, textureX, textureY); // Box 120
		bodyModel[110] = new ModelRendererTurbo(this, 174, 118, textureX, textureY); // Box 121
		bodyModel[111] = new ModelRendererTurbo(this, 163, 126, textureX, textureY); // Box 250
		bodyModel[112] = new ModelRendererTurbo(this, 431, 41, textureX, textureY); // Box 120
		bodyModel[113] = new ModelRendererTurbo(this, 404, 107, textureX, textureY); // Box 187
		bodyModel[114] = new ModelRendererTurbo(this, 404, 107, textureX, textureY); // Box 188
		bodyModel[115] = new ModelRendererTurbo(this, 302, 71, textureX, textureY); // Box 123
		bodyModel[116] = new ModelRendererTurbo(this, 195, 193, textureX, textureY); // Box 217
		bodyModel[117] = new ModelRendererTurbo(this, 211, 186, textureX, textureY); // Box 301
		bodyModel[118] = new ModelRendererTurbo(this, 211, 193, textureX, textureY); // Box 301
		bodyModel[119] = new ModelRendererTurbo(this, 213, 196, textureX, textureY); // Box 301
		bodyModel[120] = new ModelRendererTurbo(this, 213, 189, textureX, textureY); // Box 301
		bodyModel[121] = new ModelRendererTurbo(this, 195, 189, textureX, textureY); // Box 217
		bodyModel[122] = new ModelRendererTurbo(this, 195, 184, textureX, textureY); // Box 217
		bodyModel[123] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Box 217
		bodyModel[124] = new ModelRendererTurbo(this, 251, 193, textureX, textureY); // Box 217
		bodyModel[125] = new ModelRendererTurbo(this, 211, 186, textureX, textureY); // Box 301
		bodyModel[126] = new ModelRendererTurbo(this, 211, 193, textureX, textureY); // Box 301
		bodyModel[127] = new ModelRendererTurbo(this, 213, 196, textureX, textureY); // Box 301
		bodyModel[128] = new ModelRendererTurbo(this, 213, 189, textureX, textureY); // Box 301
		bodyModel[129] = new ModelRendererTurbo(this, 249, 189, textureX, textureY); // Box 217
		bodyModel[130] = new ModelRendererTurbo(this, 247, 184, textureX, textureY); // Box 217
		bodyModel[131] = new ModelRendererTurbo(this, 246, 190, textureX, textureY); // Box 217
		bodyModel[132] = new ModelRendererTurbo(this, 208, 193, textureX, textureY); // Box 217
		bodyModel[133] = new ModelRendererTurbo(this, 225, 186, textureX, textureY); // Box 301
		bodyModel[134] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 301
		bodyModel[135] = new ModelRendererTurbo(this, 227, 196, textureX, textureY); // Box 301
		bodyModel[136] = new ModelRendererTurbo(this, 227, 189, textureX, textureY); // Box 301
		bodyModel[137] = new ModelRendererTurbo(this, 206, 189, textureX, textureY); // Box 217
		bodyModel[138] = new ModelRendererTurbo(this, 204, 184, textureX, textureY); // Box 217
		bodyModel[139] = new ModelRendererTurbo(this, 203, 190, textureX, textureY); // Box 217
		bodyModel[140] = new ModelRendererTurbo(this, 238, 193, textureX, textureY); // Box 217
		bodyModel[141] = new ModelRendererTurbo(this, 225, 186, textureX, textureY); // Box 301
		bodyModel[142] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 301
		bodyModel[143] = new ModelRendererTurbo(this, 227, 196, textureX, textureY); // Box 301
		bodyModel[144] = new ModelRendererTurbo(this, 227, 189, textureX, textureY); // Box 301
		bodyModel[145] = new ModelRendererTurbo(this, 238, 189, textureX, textureY); // Box 217
		bodyModel[146] = new ModelRendererTurbo(this, 238, 184, textureX, textureY); // Box 217
		bodyModel[147] = new ModelRendererTurbo(this, 243, 190, textureX, textureY); // Box 217
		bodyModel[148] = new ModelRendererTurbo(this, 278, 72, textureX, textureY); // Box 43
		bodyModel[149] = new ModelRendererTurbo(this, 278, 62, textureX, textureY); // Box 160
		bodyModel[150] = new ModelRendererTurbo(this, 123, 48, textureX, textureY); // Box 161
		bodyModel[151] = new ModelRendererTurbo(this, 294, 106, textureX, textureY); // Box 162
		bodyModel[152] = new ModelRendererTurbo(this, 337, 71, textureX, textureY); // box64
		bodyModel[153] = new ModelRendererTurbo(this, 337, 67, textureX, textureY); // box65
		bodyModel[154] = new ModelRendererTurbo(this, 363, 28, textureX, textureY); // Box 165
		bodyModel[155] = new ModelRendererTurbo(this, 363, 13, textureX, textureY); // Box 166
		bodyModel[156] = new ModelRendererTurbo(this, 362, 20, textureX, textureY); // Box 167
		bodyModel[157] = new ModelRendererTurbo(this, 365, 36, textureX, textureY); // Box 168
		bodyModel[158] = new ModelRendererTurbo(this, 365, 8, textureX, textureY); // Box 169
		bodyModel[159] = new ModelRendererTurbo(this, 425, 35, textureX, textureY); // Box 170
		bodyModel[160] = new ModelRendererTurbo(this, 423, 28, textureX, textureY); // Box 171
		bodyModel[161] = new ModelRendererTurbo(this, 422, 20, textureX, textureY); // Box 172
		bodyModel[162] = new ModelRendererTurbo(this, 423, 13, textureX, textureY); // Box 173
		bodyModel[163] = new ModelRendererTurbo(this, 425, 8, textureX, textureY); // Box 174
		bodyModel[164] = new ModelRendererTurbo(this, 174, 20, textureX, textureY); // Box 175
		bodyModel[165] = new ModelRendererTurbo(this, 160, 11, textureX, textureY); // Box 114
		bodyModel[166] = new ModelRendererTurbo(this, 160, 11, textureX, textureY); // Box 74
		bodyModel[167] = new ModelRendererTurbo(this, 160, 14, textureX, textureY); // Box 78
		bodyModel[168] = new ModelRendererTurbo(this, 259, 5, textureX, textureY); // Box 354
		bodyModel[169] = new ModelRendererTurbo(this, 268, 8, textureX, textureY); // Box 355
		bodyModel[170] = new ModelRendererTurbo(this, 257, 11, textureX, textureY); // Box 356
		bodyModel[171] = new ModelRendererTurbo(this, 259, 8, textureX, textureY); // Box 357
		bodyModel[172] = new ModelRendererTurbo(this, 202, 4, textureX, textureY); // Box 183
		bodyModel[173] = new ModelRendererTurbo(this, 193, 4, textureX, textureY); // Box 184
		bodyModel[174] = new ModelRendererTurbo(this, 251, 11, textureX, textureY); // Box 185
		bodyModel[175] = new ModelRendererTurbo(this, 251, 14, textureX, textureY); // Box 186
		bodyModel[176] = new ModelRendererTurbo(this, 251, 11, textureX, textureY); // Box 187
		bodyModel[177] = new ModelRendererTurbo(this, 249, 4, textureX, textureY, "cull"); // Box 188 cull holder
		bodyModel[178] = new ModelRendererTurbo(this, 158, 4, textureX, textureY, "cull"); // Box 189 cull holder
		bodyModel[179] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 190
		bodyModel[180] = new ModelRendererTurbo(this, 377, 123, textureX, textureY); // Box 191
		bodyModel[181] = new ModelRendererTurbo(this, 368, 137, textureX, textureY); // Box 192
		bodyModel[182] = new ModelRendererTurbo(this, 368, 125, textureX, textureY); // Box 193
		bodyModel[183] = new ModelRendererTurbo(this, 230, 149, textureX, textureY); // Box 194 mu stepup box SINGLE
		bodyModel[184] = new ModelRendererTurbo(this, 243, 149, textureX, textureY); // Box 195 mu stepup step SINGLE
		bodyModel[185] = new ModelRendererTurbo(this, 216, 155, textureX, textureY); // Box 400 mu plug SINGLE
		bodyModel[186] = new ModelRendererTurbo(this, 218, 126, textureX, textureY); // Box 197
		bodyModel[187] = new ModelRendererTurbo(this, 216, 115, textureX, textureY); // Box 198
		bodyModel[188] = new ModelRendererTurbo(this, 229, 118, textureX, textureY); // Box 199
		bodyModel[189] = new ModelRendererTurbo(this, 239, 118, textureX, textureY); // Box 200
		bodyModel[190] = new ModelRendererTurbo(this, 250, 115, textureX, textureY); // Box 201
		bodyModel[191] = new ModelRendererTurbo(this, 216, 116, textureX, textureY); // Box 202
		bodyModel[192] = new ModelRendererTurbo(this, 256, 116, textureX, textureY); // Box 204
		bodyModel[193] = new ModelRendererTurbo(this, 310, 85, textureX, textureY); // Box 879
		bodyModel[194] = new ModelRendererTurbo(this, 401, 107, textureX, textureY); // Box 206
		bodyModel[195] = new ModelRendererTurbo(this, 401, 107, textureX, textureY); // Box 207
		bodyModel[196] = new ModelRendererTurbo(this, 240, 124, textureX, textureY); // Box 208
		bodyModel[197] = new ModelRendererTurbo(this, 131, 124, textureX, textureY); // Box 209
		bodyModel[198] = new ModelRendererTurbo(this, 273, 7, textureX, textureY); // Box 409 commander base
		bodyModel[199] = new ModelRendererTurbo(this, 273, 3, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[200] = new ModelRendererTurbo(this, 117, 29, textureX, textureY); // Box 212 army squared off box moment
		bodyModel[201] = new ModelRendererTurbo(this, 238, 8, textureX, textureY); // Box 213
		bodyModel[202] = new ModelRendererTurbo(this, 232, 7, textureX, textureY); // Box 409 commander base
		bodyModel[203] = new ModelRendererTurbo(this, 232, 3, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[204] = new ModelRendererTurbo(this, 232, 10, textureX, textureY, "cull"); // Box 216 cull beacon holder
		bodyModel[205] = new ModelRendererTurbo(this, 175, 149, textureX, textureY); // Box 194 mu stepup box SINGLE
		bodyModel[206] = new ModelRendererTurbo(this, 199, 155, textureX, textureY); // Box 400 mu plug SINGLE
		bodyModel[207] = new ModelRendererTurbo(this, 248, 18, textureX, textureY); // Box 217
		bodyModel[208] = new ModelRendererTurbo(this, 5, 219, textureX, textureY); // Box 114
		bodyModel[209] = new ModelRendererTurbo(this, 5, 219, textureX, textureY); // Box 74
		bodyModel[210] = new ModelRendererTurbo(this, 5, 222, textureX, textureY); // Box 78
		bodyModel[211] = new ModelRendererTurbo(this, 2, 214, textureX, textureY); // Box 224
		bodyModel[212] = new ModelRendererTurbo(this, 161, 116, textureX, textureY); // Box 226
		bodyModel[213] = new ModelRendererTurbo(this, 201, 116, textureX, textureY); // Box 227
		bodyModel[214] = new ModelRendererTurbo(this, 211, 199, textureX, textureY, "cull"); // Box 225 STAIR END CULL
		bodyModel[215] = new ModelRendererTurbo(this, 225, 199, textureX, textureY, "cull"); // Box 225 STAIR END CULL
		bodyModel[216] = new ModelRendererTurbo(this, 211, 199, textureX, textureY, "cull"); // Box 225 STAIR END CULL
		bodyModel[217] = new ModelRendererTurbo(this, 225, 199, textureX, textureY, "cull"); // Box 225 STAIR END CULL
		bodyModel[218] = new ModelRendererTurbo(this, 38, 75, textureX, textureY, "lamp"); // Box 171 headlight front sw refit
		bodyModel[219] = new ModelRendererTurbo(this, 50, 75, textureX, textureY, "lamp"); // Box 172 headlight front sw refit
		bodyModel[220] = new ModelRendererTurbo(this, 43, 78, textureX, textureY); // Box 383 sw headlight refit
		bodyModel[221] = new ModelRendererTurbo(this, 52, 80, textureX, textureY); // Box 384 sw headlight refit
		bodyModel[222] = new ModelRendererTurbo(this, 36, 80, textureX, textureY); // Box 387 sw headlight refit
		bodyModel[223] = new ModelRendererTurbo(this, 44, 84, textureX, textureY, "lamp"); // Box 168 numberboard front sw refit
		bodyModel[224] = new ModelRendererTurbo(this, 44, 84, textureX, textureY, "lamp"); // Box 167 numberboard front sw reft
		bodyModel[225] = new ModelRendererTurbo(this, 178, 102, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[226] = new ModelRendererTurbo(this, 178, 96, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[227] = new ModelRendererTurbo(this, 233, 102, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[228] = new ModelRendererTurbo(this, 233, 96, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[229] = new ModelRendererTurbo(this, 34, 64, textureX, textureY); // Box 240 MEGA SP SCHNOZ
		bodyModel[230] = new ModelRendererTurbo(this, 36, 56, textureX, textureY); // Box 241 MEGA SP SCHNOZ
		bodyModel[231] = new ModelRendererTurbo(this, 33, 65, textureX, textureY, "lamp"); // Box 242 headlight sp schnoz
		bodyModel[232] = new ModelRendererTurbo(this, 53, 65, textureX, textureY, "?"); // Box 243 uhh other sp schoz thingy
		bodyModel[233] = new ModelRendererTurbo(this, 457, 21, textureX, textureY); // Box 240 MEGA SP SCHNOZ
		bodyModel[234] = new ModelRendererTurbo(this, 459, 13, textureX, textureY); // Box 241 MEGA SP SCHNOZ
		bodyModel[235] = new ModelRendererTurbo(this, 476, 22, textureX, textureY, "lamp"); // Box 242 headlight sp schnoz
		bodyModel[236] = new ModelRendererTurbo(this, 456, 22, textureX, textureY, "?"); // Box 243 uhh other sp schoz thingy
		bodyModel[237] = new ModelRendererTurbo(this, 215, 13, textureX, textureY); // Box 183
		bodyModel[238] = new ModelRendererTurbo(this, 226, 21, textureX, textureY); // Box 252 cp ds44-1000 moment
		bodyModel[239] = new ModelRendererTurbo(this, 261, 19, textureX, textureY); // Box 364 prime base
		bodyModel[240] = new ModelRendererTurbo(this, 261, 15, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[241] = new ModelRendererTurbo(this, 261, 15, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[242] = new ModelRendererTurbo(this, 261, 15, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[243] = new ModelRendererTurbo(this, 261, 15, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[244] = new ModelRendererTurbo(this, 111, 65, textureX, textureY); // Box 2
		bodyModel[245] = new ModelRendererTurbo(this, 113, 77, textureX, textureY, "lamp"); // Box Glow
		bodyModel[246] = new ModelRendererTurbo(this, 112, 73, textureX, textureY, "lamp"); // Box Glow
		bodyModel[247] = new ModelRendererTurbo(this, 112, 70, textureX, textureY); // Box 2
		bodyModel[248] = new ModelRendererTurbo(this, 111, 65, textureX, textureY); // Box 2
		bodyModel[249] = new ModelRendererTurbo(this, 113, 77, textureX, textureY, "lamp"); // Box Glow
		bodyModel[250] = new ModelRendererTurbo(this, 112, 73, textureX, textureY, "lamp"); // Box Glow
		bodyModel[251] = new ModelRendererTurbo(this, 112, 70, textureX, textureY); // Box 2
		bodyModel[252] = new ModelRendererTurbo(this, 283, 7, textureX, textureY); // Box 409 commander base
		bodyModel[253] = new ModelRendererTurbo(this, 283, 3, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[254] = new ModelRendererTurbo(this, 278, 7, textureX, textureY); // Box 409 commander base
		bodyModel[255] = new ModelRendererTurbo(this, 278, 3, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[256] = new ModelRendererTurbo(this, 212, 13, textureX, textureY); // Box 184
		bodyModel[257] = new ModelRendererTurbo(this, 224, 15, textureX, textureY); // Box 271
		bodyModel[258] = new ModelRendererTurbo(this, 115, 44, textureX, textureY); // Box 409 commander base
		bodyModel[259] = new ModelRendererTurbo(this, 115, 40, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[260] = new ModelRendererTurbo(this, 471, 38, textureX, textureY); // Box 389
		bodyModel[261] = new ModelRendererTurbo(this, 414, 46, textureX, textureY); // Box 390 cab vent
		bodyModel[262] = new ModelRendererTurbo(this, 407, 66, textureX, textureY); // Box 391 cab floor raised
		bodyModel[263] = new ModelRendererTurbo(this, 359, 92, textureX, textureY); // Box 277
		bodyModel[264] = new ModelRendererTurbo(this, 353, 86, textureX, textureY); // Box 355 brakewheel
		bodyModel[265] = new ModelRendererTurbo(this, 364, 86, textureX, textureY); // Box 394
		bodyModel[266] = new ModelRendererTurbo(this, 376, 68, textureX, textureY); // Box 395 cs
		bodyModel[267] = new ModelRendererTurbo(this, 392, 68, textureX, textureY); // Box 396 cs
		bodyModel[268] = new ModelRendererTurbo(this, 392, 75, textureX, textureY, "cull"); // Box 397 cull cs dial shield
		bodyModel[269] = new ModelRendererTurbo(this, 369, 70, textureX, textureY); // Box 398 cs
		bodyModel[270] = new ModelRendererTurbo(this, 376, 79, textureX, textureY); // Box 399 cs
		bodyModel[271] = new ModelRendererTurbo(this, 350, 44, textureX, textureY); // Box 390 cab vent
		bodyModel[272] = new ModelRendererTurbo(this, 387, 69, textureX, textureY); // Box 401 cs
		bodyModel[273] = new ModelRendererTurbo(this, 397, 80, textureX, textureY); // Box 402 cs ab
		bodyModel[274] = new ModelRendererTurbo(this, 389, 81, textureX, textureY); // Box 403 cs ab
		bodyModel[275] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 404 cs ab
		bodyModel[276] = new ModelRendererTurbo(this, 334, 81, textureX, textureY); // Box 405
		bodyModel[277] = new ModelRendererTurbo(this, 340, 92, textureX, textureY); // Box 406
		bodyModel[278] = new ModelRendererTurbo(this, 345, 85, textureX, textureY); // Box 407
		bodyModel[279] = new ModelRendererTurbo(this, 377, 79, textureX, textureY); // Box 408 cab pannel
		bodyModel[280] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 409 ds44-1000 frame bend
		bodyModel[281] = new ModelRendererTurbo(this, 12, 177, textureX, textureY); // Box 409 ds44-1000 frame bend
		bodyModel[282] = new ModelRendererTurbo(this, 13, 209, textureX, textureY); // Box 411 ds44-1000 frame
		bodyModel[283] = new ModelRendererTurbo(this, 18, 209, textureX, textureY); // Box 412 ds44-1000 frame
		bodyModel[284] = new ModelRendererTurbo(this, 13, 173, textureX, textureY); // Box 411 ds44-1000 frame
		bodyModel[285] = new ModelRendererTurbo(this, 18, 173, textureX, textureY); // Box 412 ds44-1000 frame
		bodyModel[286] = new ModelRendererTurbo(this, 146, 208, textureX, textureY); // Box 411 ds44-1000 frame
		bodyModel[287] = new ModelRendererTurbo(this, 141, 208, textureX, textureY); // Box 412 ds44-1000 frame
		bodyModel[288] = new ModelRendererTurbo(this, 147, 173, textureX, textureY); // Box 411 ds44-1000 frame
		bodyModel[289] = new ModelRendererTurbo(this, 142, 173, textureX, textureY); // Box 412 ds44-1000 frame
		bodyModel[290] = new ModelRendererTurbo(this, 307, 139, textureX, textureY); // Box 421 ds handrail
		bodyModel[291] = new ModelRendererTurbo(this, 307, 127, textureX, textureY); // Box 422 ds handrail
		bodyModel[292] = new ModelRendererTurbo(this, 316, 115, textureX, textureY); // Box 423 ds handrail (ONLY COLOR 2 MB)
		bodyModel[293] = new ModelRendererTurbo(this, 193, 8, textureX, textureY); // Box 424
		bodyModel[294] = new ModelRendererTurbo(this, 202, 8, textureX, textureY); // Box 425
		bodyModel[295] = new ModelRendererTurbo(this, 209, 13, textureX, textureY); // Box 426
		bodyModel[296] = new ModelRendererTurbo(this, 190, 206, textureX, textureY); // Box 427
		bodyModel[297] = new ModelRendererTurbo(this, 190, 206, textureX, textureY); // Box 428
		bodyModel[298] = new ModelRendererTurbo(this, 303, 5, textureX, textureY); // Box 429 baldwin mystery box
		bodyModel[299] = new ModelRendererTurbo(this, 226, 112, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[300] = new ModelRendererTurbo(this, 226, 106, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[301] = new ModelRendererTurbo(this, 240, 112, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[302] = new ModelRendererTurbo(this, 240, 106, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[303] = new ModelRendererTurbo(this, 185, 112, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[304] = new ModelRendererTurbo(this, 185, 106, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[305] = new ModelRendererTurbo(this, 171, 112, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[306] = new ModelRendererTurbo(this, 171, 106, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[307] = new ModelRendererTurbo(this, 384, 105, textureX, textureY); // Box 438 amador central FPE
		bodyModel[308] = new ModelRendererTurbo(this, 384, 113, textureX, textureY); // Box 438 amador central FPE
		bodyModel[309] = new ModelRendererTurbo(this, 239, 162, textureX, textureY); // Box 440
		bodyModel[310] = new ModelRendererTurbo(this, 230, 162, textureX, textureY); // Box 441
		bodyModel[311] = new ModelRendererTurbo(this, 174, 162, textureX, textureY); // Box 442
		bodyModel[312] = new ModelRendererTurbo(this, 184, 162, textureX, textureY); // Box 443
		bodyModel[313] = new ModelRendererTurbo(this, 192, 149, textureX, textureY, "cull"); // Box 444 cull AIR MU DOUBLE
		bodyModel[314] = new ModelRendererTurbo(this, 156, 149, textureX, textureY); // Box 195 mu stepup step SINGLE
		bodyModel[315] = new ModelRendererTurbo(this, 199, 150, textureX, textureY); // Box 446 mu plug DOUBLE
		bodyModel[316] = new ModelRendererTurbo(this, 216, 150, textureX, textureY); // Box 447 mu plug DOUBLE
		bodyModel[317] = new ModelRendererTurbo(this, 185, 157, textureX, textureY); // Box 448 technically a lamp
		bodyModel[318] = new ModelRendererTurbo(this, 182, 157, textureX, textureY); // Box 449 AIR MU HOSE
		bodyModel[319] = new ModelRendererTurbo(this, 182, 157, textureX, textureY); // Box 450 AIR MU HOSE
		bodyModel[320] = new ModelRendererTurbo(this, 182, 157, textureX, textureY); // Box 451 AIR MU HOSE
		bodyModel[321] = new ModelRendererTurbo(this, 166, 151, textureX, textureY); // Box 452
		bodyModel[322] = new ModelRendererTurbo(this, 223, 149, textureX, textureY, "cull"); // Box 444 cull AIR MU DOUBLE
		bodyModel[323] = new ModelRendererTurbo(this, 230, 157, textureX, textureY); // Box 448 technically a lamp
		bodyModel[324] = new ModelRendererTurbo(this, 241, 151, textureX, textureY); // Box 452
		bodyModel[325] = new ModelRendererTurbo(this, 237, 157, textureX, textureY); // Box 449 AIR MU HOSE
		bodyModel[326] = new ModelRendererTurbo(this, 237, 157, textureX, textureY); // Box 450 AIR MU HOSE
		bodyModel[327] = new ModelRendererTurbo(this, 237, 157, textureX, textureY); // Box 451 AIR MU HOSE
		bodyModel[328] = new ModelRendererTurbo(this, 212, 3, textureX, textureY); // Box 623
		bodyModel[329] = new ModelRendererTurbo(this, 212, 7, textureX, textureY, "lamp"); // Box 625 sp numerbboard
		bodyModel[330] = new ModelRendererTurbo(this, 212, 7, textureX, textureY, "lamp"); // Box 626 sp numberboard
		bodyModel[331] = new ModelRendererTurbo(this, 212, 3, textureX, textureY); // Box 627
		bodyModel[332] = new ModelRendererTurbo(this, 223, 4, textureX, textureY); // Box 355
		bodyModel[333] = new ModelRendererTurbo(this, 461, 5, textureX, textureY); // Box 468 SP MEGA SCHNOZ REAR
		bodyModel[334] = new ModelRendererTurbo(this, 223, 4, textureX, textureY); // Box 469
		bodyModel[335] = new ModelRendererTurbo(this, 288, 18, textureX, textureY); // Box 470 dynamic brake blister
		bodyModel[336] = new ModelRendererTurbo(this, 288, 21, textureX, textureY); // Box 471 dynamic brake blister
		bodyModel[337] = new ModelRendererTurbo(this, 259, 10, textureX, textureY); // Box 472 dynamic brake blister
		bodyModel[338] = new ModelRendererTurbo(this, 293, 16, textureX, textureY); // Box 473 dynamic brake blister
		bodyModel[339] = new ModelRendererTurbo(this, 289, 13, textureX, textureY); // Box 474 dynamic brake blister
		bodyModel[340] = new ModelRendererTurbo(this, 173, 3, textureX, textureY); // Box 354
		bodyModel[341] = new ModelRendererTurbo(this, 182, 9, textureX, textureY); // Box 355
		bodyModel[342] = new ModelRendererTurbo(this, 171, 9, textureX, textureY); // Box 356
		bodyModel[343] = new ModelRendererTurbo(this, 173, 15, textureX, textureY); // Box 357
		bodyModel[344] = new ModelRendererTurbo(this, 175, 12, textureX, textureY); // Box 358
		bodyModel[345] = new ModelRendererTurbo(this, 175, 6, textureX, textureY); // Box 359
		bodyModel[346] = new ModelRendererTurbo(this, 13, 206, textureX, textureY); // Box 411 ds44-1000 frame
		bodyModel[347] = new ModelRendererTurbo(this, 13, 170, textureX, textureY); // Box 411 ds44-1000 frame
		bodyModel[348] = new ModelRendererTurbo(this, 151, 207, textureX, textureY); // Box 352
		bodyModel[349] = new ModelRendererTurbo(this, 152, 172, textureX, textureY); // Box 353
		bodyModel[350] = new ModelRendererTurbo(this, 161, 116, textureX, textureY); // Box 354
		bodyModel[351] = new ModelRendererTurbo(this, 193, 116, textureX, textureY); // Box 355
		bodyModel[352] = new ModelRendererTurbo(this, 248, 116, textureX, textureY); // Box 356
		bodyModel[353] = new ModelRendererTurbo(this, 216, 116, textureX, textureY); // Box 357
		bodyModel[354] = new ModelRendererTurbo(this, 93, 48, textureX, textureY, "cull"); // Box 358 cull headlight ring
		bodyModel[355] = new ModelRendererTurbo(this, 487, 28, textureX, textureY, "cull"); // Box 358 cull headlight ring
		bodyModel[356] = new ModelRendererTurbo(this, 343, 6, textureX, textureY); // Box 364
		bodyModel[357] = new ModelRendererTurbo(this, 336, 9, textureX, textureY); // Box 365
		bodyModel[358] = new ModelRendererTurbo(this, 336, 9, textureX, textureY); // Box 366
		bodyModel[359] = new ModelRendererTurbo(this, 333, 9, textureX, textureY); // Box 363
		bodyModel[360] = new ModelRendererTurbo(this, 324, 3, textureX, textureY); // Box 364
		bodyModel[361] = new ModelRendererTurbo(this, 322, 9, textureX, textureY); // Box 365
		bodyModel[362] = new ModelRendererTurbo(this, 324, 15, textureX, textureY); // Box 366
		bodyModel[363] = new ModelRendererTurbo(this, 326, 12, textureX, textureY); // Box 367
		bodyModel[364] = new ModelRendererTurbo(this, 326, 6, textureX, textureY); // Box 368
		bodyModel[365] = new ModelRendererTurbo(this, 488, 50, textureX, textureY); // Box 2
		bodyModel[366] = new ModelRendererTurbo(this, 490, 62, textureX, textureY, "lamp"); // Box Glow
		bodyModel[367] = new ModelRendererTurbo(this, 489, 58, textureX, textureY, "lamp"); // Box Glow
		bodyModel[368] = new ModelRendererTurbo(this, 489, 55, textureX, textureY); // Box 2
		bodyModel[369] = new ModelRendererTurbo(this, 488, 50, textureX, textureY); // Box 2
		bodyModel[370] = new ModelRendererTurbo(this, 490, 62, textureX, textureY, "lamp"); // Box Glow
		bodyModel[371] = new ModelRendererTurbo(this, 489, 58, textureX, textureY, "lamp"); // Box Glow
		bodyModel[372] = new ModelRendererTurbo(this, 489, 55, textureX, textureY); // Box 2
		bodyModel[373] = new ModelRendererTurbo(this, 486, 14, textureX, textureY, "lamp"); // Box 171 headlight rear sw refit
		bodyModel[374] = new ModelRendererTurbo(this, 498, 14, textureX, textureY, "lamp"); // Box 172 headlight rear sw refit
		bodyModel[375] = new ModelRendererTurbo(this, 491, 17, textureX, textureY); // Box 383 sw headlight refit
		bodyModel[376] = new ModelRendererTurbo(this, 484, 19, textureX, textureY); // Box 384 sw headlight refit
		bodyModel[377] = new ModelRendererTurbo(this, 500, 19, textureX, textureY); // Box 387 sw headlight refit
		bodyModel[378] = new ModelRendererTurbo(this, 492, 23, textureX, textureY, "lamp"); // Box 168 numberboard reart sw refit
		bodyModel[379] = new ModelRendererTurbo(this, 492, 23, textureX, textureY, "lamp"); // Box 167 numberboard rear sw reft
		bodyModel[380] = new ModelRendererTurbo(this, 248, 31, textureX, textureY); // Box 384
		bodyModel[381] = new ModelRendererTurbo(this, 363, 36, textureX, textureY); // Box 385 hot dog french fries comeon baby tell me your lies
		bodyModel[382] = new ModelRendererTurbo(this, 251, 50, textureX, textureY, "lamp"); // Box 386 side numberboard glow
		bodyModel[383] = new ModelRendererTurbo(this, 251, 50, textureX, textureY, "lamp"); // Box 387 sied numberboard glow
		bodyModel[384] = new ModelRendererTurbo(this, 404, 79, textureX, textureY); // Box 291 mug
		bodyModel[385] = new ModelRendererTurbo(this, 404, 79, textureX, textureY); // Box 294 mug
		bodyModel[386] = new ModelRendererTurbo(this, 404, 79, textureX, textureY); // Box 291 mug
		bodyModel[387] = new ModelRendererTurbo(this, 404, 79, textureX, textureY); // Box 294 mug
		bodyModel[388] = new ModelRendererTurbo(this, 409, 78, textureX, textureY, "cull"); // Box 353 mug cull
		bodyModel[389] = new ModelRendererTurbo(this, 108, 41, textureX, textureY, "lamp"); // Box 171 headlight front 2beam2
		bodyModel[390] = new ModelRendererTurbo(this, 108, 41, textureX, textureY, "lamp"); // Box 172 headlight front 2beam2
		bodyModel[391] = new ModelRendererTurbo(this, 488, 44, textureX, textureY, "lamp"); // Box 171 headlight rear 2beam2
		bodyModel[392] = new ModelRendererTurbo(this, 488, 44, textureX, textureY, "lamp"); // Box 172 headlight rear 2beam2

		bodyModel[0].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 0
		bodyModel[0].setRotationPoint(-28.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[1].setRotationPoint(-36.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[2].setRotationPoint(33.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // box04
		bodyModel[3].setRotationPoint(-6F, 4F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		bodyModel[4].setRotationPoint(-19.5F, 4F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 792
		bodyModel[5].setRotationPoint(15.5F, 4F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 2
		bodyModel[6].setRotationPoint(-33.5F, 2.5F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 2
		bodyModel[7].setRotationPoint(32.5F, 2.5F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 65, 3, 12, 0F); // Box 301
		bodyModel[8].setRotationPoint(-32.5F, 1F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 21, 22, 0F); // Box 217
		bodyModel[9].setRotationPoint(-32.51F, -12F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 21, 22, 0F); // Box 514
		bodyModel[10].setRotationPoint(32.51F, -12F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 16
		bodyModel[11].setRotationPoint(-28.5F, 1F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 57, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 133
		bodyModel[12].setRotationPoint(-28.5F, 2F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 57, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 134
		bodyModel[13].setRotationPoint(-28.5F, 2F, 11F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 250
		bodyModel[14].setRotationPoint(-19F, 2F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 251
		bodyModel[15].setRotationPoint(16F, 2F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 57, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 252
		bodyModel[16].setRotationPoint(-28.5F, 2F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 57, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[17].setRotationPoint(-28.5F, 2F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 254
		bodyModel[18].setRotationPoint(-19F, 2F, 6F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 255
		bodyModel[19].setRotationPoint(16F, 2F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // box70
		bodyModel[20].setRotationPoint(-3F, 5F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // box81
		bodyModel[21].setRotationPoint(5F, 1.5F, -8.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // box82
		bodyModel[22].setRotationPoint(-6F, 1.5F, -8.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 134
		bodyModel[23].setRotationPoint(-3F, 4F, -8.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 708
		bodyModel[24].setRotationPoint(5F, 1.5F, 7.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 710
		bodyModel[25].setRotationPoint(-5F, 4F, 7.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 712
		bodyModel[26].setRotationPoint(-6F, 1.5F, 7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 245
		bodyModel[27].setRotationPoint(-3F, 5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 246
		bodyModel[28].setRotationPoint(-5F, 5F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 247
		bodyModel[29].setRotationPoint(-5F, 5F, 6F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 299
		bodyModel[30].setRotationPoint(3F, 5.5F, 7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 300
		bodyModel[31].setRotationPoint(-5F, 5.5F, -8.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 44, 17, 14, 0F); // box03
		bodyModel[32].setRotationPoint(-27.5F, -16F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // box03
		bodyModel[33].setRotationPoint(-28.5F, -16F, 6F);

		bodyModel[34].addBox(0F, 0F, 0F, 44, 1, 12, 0F); // box03
		bodyModel[34].setRotationPoint(-27.5F, -17F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[35].setRotationPoint(-27.5F, -17F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[36].setRotationPoint(-27.5F, -17F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.35F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // box03
		bodyModel[37].setRotationPoint(-28.5F, -17F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[38].setRotationPoint(-28.5F, -17F, -7F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 16, 18, 0F); // box20
		bodyModel[39].setRotationPoint(16.5F, -20F, -7F);

		bodyModel[40].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // box21
		bodyModel[40].setRotationPoint(17.5F, -18F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // box22
		bodyModel[41].setRotationPoint(17.5F, -18F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 14, 9, 0F); // box23
		bodyModel[42].setRotationPoint(27.5F, -18F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 878
		bodyModel[43].setRotationPoint(16.5F, -4F, -11F);

		bodyModel[44].addShapeBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 314 door swing right
		bodyModel[44].setRotationPoint(28F, -17F, 1.5F);

		bodyModel[45].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[45].setRotationPoint(17F, -18F, -10.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 14, 9, 0F); // Box 883
		bodyModel[46].setRotationPoint(27.5F, -18F, 2F);

		bodyModel[47].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[47].setRotationPoint(17F, -20F, -10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[48].setRotationPoint(16.5F, -20F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[49].setRotationPoint(17.5F, -20F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[50].setRotationPoint(27.5F, -20F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[51].setRotationPoint(17.5F, -21F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[52].setRotationPoint(27.5F, -21F, -8F);

		bodyModel[53].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 234
		bodyModel[53].setRotationPoint(16.5F, -21F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 235
		bodyModel[54].setRotationPoint(17.5F, -21F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[55].setRotationPoint(27.5F, -21F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 237
		bodyModel[56].setRotationPoint(17.5F, -20F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[57].setRotationPoint(27.5F, -20F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 239
		bodyModel[58].setRotationPoint(27.5F, -20F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[59].setRotationPoint(16.5F, -21F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[60].setRotationPoint(16.5F, -21F, -8F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 307
		bodyModel[61].setRotationPoint(16.5F, -20F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[62].setRotationPoint(-28.5F, -16F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[63].setRotationPoint(-27.5F, -17F, -6F);
		bodyModel[63].rotateAngleY = 1.57079633F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 30, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, -12F, 0F, -15F, -12F); // Box 310 front grill
		bodyModel[64].setRotationPoint(-28.5F, -15F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 311
		bodyModel[65].setRotationPoint(-28.5F, -15F, -0.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 312
		bodyModel[66].setRotationPoint(-28.25F, -14.5F, -6F);
		bodyModel[66].rotateAngleZ = 0.76794487F;

		bodyModel[67].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 315
		bodyModel[67].setRotationPoint(-28.25F, -13.5F, -6F);
		bodyModel[67].rotateAngleZ = 0.76794487F;

		bodyModel[68].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 317
		bodyModel[68].setRotationPoint(-28.25F, -12.5F, -6F);
		bodyModel[68].rotateAngleZ = 0.76794487F;

		bodyModel[69].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 319
		bodyModel[69].setRotationPoint(-28.25F, -11.5F, -6F);
		bodyModel[69].rotateAngleZ = 0.76794487F;

		bodyModel[70].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 321
		bodyModel[70].setRotationPoint(-28.25F, -10.5F, -6F);
		bodyModel[70].rotateAngleZ = 0.76794487F;

		bodyModel[71].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 323
		bodyModel[71].setRotationPoint(-28.25F, -9.5F, -6F);
		bodyModel[71].rotateAngleZ = 0.76794487F;

		bodyModel[72].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 325
		bodyModel[72].setRotationPoint(-28.25F, -8.5F, -6F);
		bodyModel[72].rotateAngleZ = 0.76794487F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 327
		bodyModel[73].setRotationPoint(-28.25F, -7.5F, -6F);
		bodyModel[73].rotateAngleZ = 0.76794487F;

		bodyModel[74].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 329
		bodyModel[74].setRotationPoint(-28.25F, -6.5F, -6F);
		bodyModel[74].rotateAngleZ = 0.76794487F;

		bodyModel[75].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 331
		bodyModel[75].setRotationPoint(-28.25F, -5.5F, -6F);
		bodyModel[75].rotateAngleZ = 0.76794487F;

		bodyModel[76].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 333
		bodyModel[76].setRotationPoint(-28.25F, -4.5F, -6F);
		bodyModel[76].rotateAngleZ = 0.76794487F;

		bodyModel[77].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 335
		bodyModel[77].setRotationPoint(-28.25F, -3.5F, -6F);
		bodyModel[77].rotateAngleZ = 0.76794487F;

		bodyModel[78].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 337
		bodyModel[78].setRotationPoint(-28.25F, -2.5F, -6F);
		bodyModel[78].rotateAngleZ = 0.76794487F;

		bodyModel[79].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 339
		bodyModel[79].setRotationPoint(-28.25F, -1.5F, -6F);
		bodyModel[79].rotateAngleZ = 0.76794487F;

		bodyModel[80].addBox(0F, 0F, -1F, 12, 1, 1, 0F); // Box 342
		bodyModel[80].setRotationPoint(-28.5F, -16F, -6F);
		bodyModel[80].rotateAngleY = 1.57079633F;

		bodyModel[81].addBox(0F, 0F, -1F, 12, 1, 1, 0F); // Box 343
		bodyModel[81].setRotationPoint(-28.5F, 0F, -6F);
		bodyModel[81].rotateAngleY = 1.57079633F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[82].setRotationPoint(-26.5F, -18.5F, -4.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[83].setRotationPoint(-26.5F, -18.5F, -5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[84].setRotationPoint(-26.5F, -18.5F, 4.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[85].setRotationPoint(-26.5F, -17.5F, -5.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[86].setRotationPoint(-29F, -19F, -1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[87].setRotationPoint(-29.25F, -18.75F, -1.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 353
		bodyModel[88].setRotationPoint(-28.5F, 2F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 354
		bodyModel[89].setRotationPoint(28.5F, 2F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // box24
		bodyModel[90].setRotationPoint(9.5F, -4F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // box25
		bodyModel[91].setRotationPoint(9.5F, -4F, 7F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 357
		bodyModel[92].setRotationPoint(-28.25F, -0.5F, -6F);
		bodyModel[92].rotateAngleZ = 0.76794487F;

		bodyModel[93].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[93].setRotationPoint(27F, -20.5F, -1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight rear big
		bodyModel[94].setRotationPoint(28.25F, -20.25F, -1.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam
		bodyModel[95].setRotationPoint(-29.25F, -19F, -0.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam
		bodyModel[96].setRotationPoint(-29.25F, -17.5F, -0.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight rear 2beam
		bodyModel[97].setRotationPoint(28.25F, -20.5F, -0.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight rear 2beam
		bodyModel[98].setRotationPoint(28.25F, -19F, -0.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 364
		bodyModel[99].setRotationPoint(4F, -20F, -4F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 365
		bodyModel[100].setRotationPoint(4F, -21F, -4F);

		bodyModel[101].addBox(0F, 0F, 0F, 33, 8, 0, 0F); // Box 106
		bodyModel[101].setRotationPoint(-28.5F, -7F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[102].setRotationPoint(-28.5F, -7F, -11.01F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[103].setRotationPoint(-22.5F, -7F, -11.01F);

		bodyModel[104].addBox(0F, 0F, 0F, 33, 8, 0, 0F); // Box 109
		bodyModel[104].setRotationPoint(-28.5F, -7F, 11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[105].setRotationPoint(-28.5F, -7F, 11.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[106].setRotationPoint(-22.5F, -7F, 11.01F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[107].setRotationPoint(-32.5F, -7F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 117
		bodyModel[108].setRotationPoint(-32.5F, -7F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[109].setRotationPoint(-32.5F, -1F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 121
		bodyModel[110].setRotationPoint(-32.5F, -1F, 1F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 2, 20, 0F); // Box 250
		bodyModel[111].setRotationPoint(-32.52F, -0.5F, -10F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 120
		bodyModel[112].setRotationPoint(27.5F, -18F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 187
		bodyModel[113].setRotationPoint(28.25F, -15F, 2.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 188
		bodyModel[114].setRotationPoint(28.25F, -15F, -2.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 123
		bodyModel[115].setRotationPoint(28.5F, -2.01F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[116].setRotationPoint(-32.5F, 6.5F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 301
		bodyModel[117].setRotationPoint(-32.5F, 3.5F, -8F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 301
		bodyModel[118].setRotationPoint(-32.5F, 6.5F, -9.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 301
		bodyModel[119].setRotationPoint(-32.5F, 6.5F, -9F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 301
		bodyModel[120].setRotationPoint(-32.5F, 3.5F, -7.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[121].setRotationPoint(-28.5F, 6.5F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 217
		bodyModel[122].setRotationPoint(-28.5F, 3.5F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 217
		bodyModel[123].setRotationPoint(-28.5F, 6.5F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[124].setRotationPoint(32.5F, 6.5F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 301
		bodyModel[125].setRotationPoint(28.5F, 3.5F, -8F);

		bodyModel[126].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 301
		bodyModel[126].setRotationPoint(28.5F, 6.5F, -9.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 301
		bodyModel[127].setRotationPoint(28.5F, 6.5F, -9F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 301
		bodyModel[128].setRotationPoint(28.5F, 3.5F, -7.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[129].setRotationPoint(28.5F, 6.5F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 217
		bodyModel[130].setRotationPoint(28.5F, 3.5F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 217
		bodyModel[131].setRotationPoint(28.5F, 6.5F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[132].setRotationPoint(-32.5F, 6.5F, 10F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 301
		bodyModel[133].setRotationPoint(-32.5F, 3.5F, 6F);

		bodyModel[134].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 301
		bodyModel[134].setRotationPoint(-32.5F, 6.5F, 7.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 301
		bodyModel[135].setRotationPoint(-32.5F, 6.5F, 9F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 301
		bodyModel[136].setRotationPoint(-32.5F, 3.5F, 7.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[137].setRotationPoint(-28.5F, 6.5F, 9F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 217
		bodyModel[138].setRotationPoint(-28.5F, 3.5F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 217
		bodyModel[139].setRotationPoint(-28.5F, 6.5F, 8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[140].setRotationPoint(32.5F, 6.5F, 10F);

		bodyModel[141].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 301
		bodyModel[141].setRotationPoint(28.5F, 3.5F, 6F);

		bodyModel[142].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 301
		bodyModel[142].setRotationPoint(28.5F, 6.5F, 7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 301
		bodyModel[143].setRotationPoint(28.5F, 6.5F, 9F);

		bodyModel[144].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 301
		bodyModel[144].setRotationPoint(28.5F, 3.5F, 7.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[145].setRotationPoint(28.5F, 6.5F, 9F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 217
		bodyModel[146].setRotationPoint(28.5F, 3.5F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 217
		bodyModel[147].setRotationPoint(28.5F, 6.5F, 8F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 43
		bodyModel[148].setRotationPoint(8F, -1.5F, -10.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 160
		bodyModel[149].setRotationPoint(8F, -1.5F, 7.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 161
		bodyModel[150].setRotationPoint(-27F, -19F, -1.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 36, 0, 16, 0F); // Box 162
		bodyModel[151].setRotationPoint(-22.5F, -12.5F, -8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[152].setRotationPoint(19.5F, -18F, 11F);
		bodyModel[152].rotateAngleX = 0.26179939F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[153].setRotationPoint(19.5F, -18.25F, -11.97F);
		bodyModel[153].rotateAngleX = -0.26179939F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-0.375F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 165
		bodyModel[154].setRotationPoint(15.5F, -21F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.375F, 1F, 0F); // Box 166
		bodyModel[155].setRotationPoint(15.5F, -21F, 3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 167
		bodyModel[156].setRotationPoint(15.5F, -21F, -3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.375F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.375F, 1F, 0F, -0.375F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.375F, -1F, 0F); // Box 168
		bodyModel[157].setRotationPoint(15.5F, -19F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.375F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.375F, 1F, 0F); // Box 169
		bodyModel[158].setRotationPoint(15.5F, -19F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.375F, 1F, 0F, -0.375F, -1F, 0F, 0F, -1F, 0F); // Box 170
		bodyModel[159].setRotationPoint(28.5F, -19F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.375F, 1F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[160].setRotationPoint(28.5F, -21F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[161].setRotationPoint(28.5F, -21F, -3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 1F, 0F, 0F, 1F, 0F); // Box 173
		bodyModel[162].setRotationPoint(28.5F, -21F, 3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 1F, 0F, -0.375F, 1F, 0F, -0.375F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, 1F, 0F, 0F, 1F, 0F); // Box 174
		bodyModel[163].setRotationPoint(28.5F, -19F, 8F);

		bodyModel[164].addBox(0F, 0F, 0F, 14, 1, 5, 0F); // Box 175
		bodyModel[164].setRotationPoint(-11.5F, -17.5F, -2.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[165].setRotationPoint(-13.5F, -19F, -0.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[166].setRotationPoint(-13.5F, -20F, -0.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[167].setRotationPoint(-13.25F, -18.5F, -0.25F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[168].setRotationPoint(15.5F, -22.25F, 0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[169].setRotationPoint(17F, -21.5F, -0.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[170].setRotationPoint(14.5F, -22.25F, -1.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[171].setRotationPoint(16.5F, -22.5F, -0.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 183
		bodyModel[172].setRotationPoint(8.5F, -17.5F, -0.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[173].setRotationPoint(6.5F, -18.5F, -0.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[174].setRotationPoint(10F, -20F, -2.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 186
		bodyModel[175].setRotationPoint(10.25F, -18.5F, -2.25F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 187
		bodyModel[176].setRotationPoint(10F, -19F, -2.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188 cull holder
		bodyModel[177].setRotationPoint(10F, -20F, -3.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189 cull holder
		bodyModel[178].setRotationPoint(-13.5F, -20F, -1.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 8, 13, 0, 0F); // Box 190
		bodyModel[179].setRotationPoint(8.5F, -12F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 8, 13, 0, 0F); // Box 191
		bodyModel[180].setRotationPoint(8.5F, -12F, 11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[181].setRotationPoint(4.5F, -7F, -11.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[182].setRotationPoint(4.5F, -7F, 11.01F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 194 mu stepup box SINGLE
		bodyModel[183].setRotationPoint(28.5F, -2F, -2F);

		bodyModel[184].addBox(0F, 0F, 0F, 4, 0, 7, 0F); // Box 195 mu stepup step SINGLE
		bodyModel[184].setRotationPoint(28.5F, 0F, -3.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 400 mu plug SINGLE
		bodyModel[185].setRotationPoint(31.75F, -1F, -1F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 2, 20, 0F); // Box 197
		bodyModel[186].setRotationPoint(32.52F, -0.5F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[187].setRotationPoint(32.5F, -7F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[188].setRotationPoint(32.5F, -1F, -5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 200
		bodyModel[189].setRotationPoint(32.5F, -1F, 1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 201
		bodyModel[190].setRotationPoint(32.5F, -7F, 6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 202
		bodyModel[191].setRotationPoint(32.5F, -8F, -5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 204
		bodyModel[192].setRotationPoint(32.5F, -8F, 3F);

		bodyModel[193].addBox(0F, 0F, 0F, 0, 4, 16, 0F); // Box 879
		bodyModel[193].setRotationPoint(-22.5F, -12.5F, -8F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 206
		bodyModel[194].setRotationPoint(28.25F, -12F, 10.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 207
		bodyModel[195].setRotationPoint(28.25F, -12F, -10.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 208
		bodyModel[196].setRotationPoint(32.5F, 9F, -11F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 209
		bodyModel[197].setRotationPoint(-35.5F, 9F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[198].setRotationPoint(27F, -22F, -0.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[199].setRotationPoint(27F, -23F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212 army squared off box moment
		bodyModel[200].setRotationPoint(-26.5F, -17.5F, -4.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 213
		bodyModel[201].setRotationPoint(4F, -24F, -4F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[202].setRotationPoint(16.5F, -22.5F, -0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[203].setRotationPoint(16.5F, -23.5F, -0.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 216 cull beacon holder
		bodyModel[204].setRotationPoint(16.5F, -21.5F, -0.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 194 mu stepup box SINGLE
		bodyModel[205].setRotationPoint(-32.5F, -2F, -2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 400 mu plug SINGLE
		bodyModel[206].setRotationPoint(-32.75F, -1F, -1F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 217
		bodyModel[207].setRotationPoint(4F, -22F, -5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[208].setRotationPoint(-28F, 4.5F, -9.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[209].setRotationPoint(-28F, 3.5F, -9.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[210].setRotationPoint(-27.75F, 5F, -9.25F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[211].setRotationPoint(-28F, 3.5F, -9.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226
		bodyModel[212].setRotationPoint(-32.5F, -8F, -5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 227
		bodyModel[213].setRotationPoint(-32.5F, -8F, 3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 225 STAIR END CULL
		bodyModel[214].setRotationPoint(-32.5F, 8.5F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 225 STAIR END CULL
		bodyModel[215].setRotationPoint(-32.5F, 8.5F, 9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 225 STAIR END CULL
		bodyModel[216].setRotationPoint(28.5F, 8.5F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 225 STAIR END CULL
		bodyModel[217].setRotationPoint(28.5F, 8.5F, 9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front sw refit
		bodyModel[218].setRotationPoint(-30.75F, -19F, -0.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front sw refit
		bodyModel[219].setRotationPoint(-30.75F, -17.5F, -0.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 383 sw headlight refit
		bodyModel[220].setRotationPoint(-30.5F, -19F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384 sw headlight refit
		bodyModel[221].setRotationPoint(-30.5F, -18.5F, -2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 387 sw headlight refit
		bodyModel[222].setRotationPoint(-30.5F, -18.5F, 1F);

		bodyModel[223].addBox(0.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard front sw refit
		bodyModel[223].setRotationPoint(-30.5F, -18F, 1F);
		bodyModel[223].rotateAngleY = 0.4712389F;

		bodyModel[224].addBox(0.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard front sw reft
		bodyModel[224].setRotationPoint(-30.5F, -18F, -1F);
		bodyModel[224].rotateAngleY = -0.4712389F;

		bodyModel[225].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[225].setRotationPoint(-32.5F, -2F, -2F);

		bodyModel[226].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[226].setRotationPoint(-32.5F, -2F, -2F);

		bodyModel[227].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[227].setRotationPoint(32.5F, -2F, -2F);

		bodyModel[228].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[228].setRotationPoint(32.5F, -2F, -2F);

		bodyModel[229].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 240 MEGA SP SCHNOZ
		bodyModel[229].setRotationPoint(-31.5F, -18.5F, -4F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 241 MEGA SP SCHNOZ
		bodyModel[230].setRotationPoint(-31.5F, -19.5F, -3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 242 headlight sp schnoz
		bodyModel[231].setRotationPoint(-31.75F, -19.5F, 0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 243 uhh other sp schoz thingy
		bodyModel[232].setRotationPoint(-31.75F, -19.75F, -3.25F);

		bodyModel[233].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 240 MEGA SP SCHNOZ
		bodyModel[233].setRotationPoint(26.5F, -20.5F, -4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 241 MEGA SP SCHNOZ
		bodyModel[234].setRotationPoint(26.5F, -21.5F, -3F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 242 headlight sp schnoz
		bodyModel[235].setRotationPoint(30.75F, -21.5F, 0.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 243 uhh other sp schoz thingy
		bodyModel[236].setRotationPoint(30.75F, -21.75F, -3.25F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[237].setRotationPoint(20F, -22F, 0F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252 cp ds44-1000 moment
		bodyModel[238].setRotationPoint(4F, -23F, -4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[239].setRotationPoint(23.5F, -22F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[240].setRotationPoint(23.5F, -22.5F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[241].setRotationPoint(23.5F, -22.5F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[242].setRotationPoint(23.5F, -22.5F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[243].setRotationPoint(23.5F, -22.5F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[244].setRotationPoint(-30.5F, -17F, 5.25F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[245].setRotationPoint(-30.85F, -16.5F, 5.75F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[246].setRotationPoint(-30F, -16.5F, 5.25F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[247].setRotationPoint(-29.75F, -15.25F, 5.75F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[248].setRotationPoint(-30.5F, -17F, -7.25F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[249].setRotationPoint(-30.85F, -16.5F, -6.75F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[250].setRotationPoint(-30F, -16.5F, -7.25F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[251].setRotationPoint(-29.75F, -15.25F, -6.75F);

		bodyModel[252].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[252].setRotationPoint(22.5F, -21F, 7.5F);
		bodyModel[252].rotateAngleX = -0.20943951F;

		bodyModel[253].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[253].setRotationPoint(22.5F, -21F, 7.5F);
		bodyModel[253].rotateAngleX = -0.20943951F;

		bodyModel[254].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[254].setRotationPoint(22.5F, -21F, -7.5F);
		bodyModel[254].rotateAngleX = 0.20943951F;

		bodyModel[255].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[255].setRotationPoint(22.5F, -21F, -7.5F);
		bodyModel[255].rotateAngleX = 0.20943951F;

		bodyModel[256].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 184
		bodyModel[256].setRotationPoint(11F, -19F, 2F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 271
		bodyModel[257].setRotationPoint(3.5F, -23F, -4.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[258].setRotationPoint(-28.5F, -20F, -0.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[259].setRotationPoint(-28.5F, -21F, -0.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[260].setRotationPoint(26F, -20.5F, -1.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 390 cab vent
		bodyModel[261].setRotationPoint(28.5F, -20F, -4F);
		bodyModel[261].rotateAngleZ = 0.52359878F;

		bodyModel[262].addBox(0F, 0F, 0F, 10, 2, 7, 0F); // Box 391 cab floor raised
		bodyModel[262].setRotationPoint(17.5F, -5.5F, 3F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[263].setRotationPoint(21F, -10F, 0.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[264].setRotationPoint(19F, -12F, 0.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 394
		bodyModel[265].setRotationPoint(20.5F, -10.5F, 1F);

		bodyModel[266].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 395 cs
		bodyModel[266].setRotationPoint(18F, -12F, 3.75F);
		bodyModel[266].rotateAngleY = -0.52359878F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 396 cs
		bodyModel[267].setRotationPoint(18F, -15F, 3.75F);
		bodyModel[267].rotateAngleY = -0.52359878F;

		bodyModel[268].addShapeBox(0F, 0F, 1F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397 cull cs dial shield
		bodyModel[268].setRotationPoint(18F, -15F, 3.75F);
		bodyModel[268].rotateAngleY = -0.52359878F;

		bodyModel[269].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 398 cs
		bodyModel[269].setRotationPoint(18F, -15F, 3.74F);
		bodyModel[269].rotateAngleY = -0.52359878F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 399 cs
		bodyModel[270].setRotationPoint(21.5F, -12F, 2F);

		bodyModel[271].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 390 cab vent
		bodyModel[271].setRotationPoint(16.5F, -20F, 6F);
		bodyModel[271].rotateAngleZ = -0.52359878F;

		bodyModel[272].addShapeBox(1F, 0F, 2F, 1, 8, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401 cs
		bodyModel[272].setRotationPoint(18F, -12F, 3.75F);
		bodyModel[272].rotateAngleY = -0.52359878F;

		bodyModel[273].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402 cs ab
		bodyModel[273].setRotationPoint(18F, -12F, 8F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 403 cs ab
		bodyModel[274].setRotationPoint(18F, -10F, 6F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 404 cs ab
		bodyModel[275].setRotationPoint(18F, -11F, 6F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 405
		bodyModel[276].setRotationPoint(26F, -12F, -7.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 406
		bodyModel[277].setRotationPoint(26F, -10F, -5.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 407
		bodyModel[278].setRotationPoint(26.5F, -10.5F, -6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, -4F, -6F); // Box 408 cab pannel
		bodyModel[279].setRotationPoint(17.51F, -17F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409 ds44-1000 frame bend
		bodyModel[280].setRotationPoint(-28.5F, 1F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 409 ds44-1000 frame bend
		bodyModel[281].setRotationPoint(-28.5F, 1F, 10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 411 ds44-1000 frame
		bodyModel[282].setRotationPoint(-28.5F, 3F, -10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 412 ds44-1000 frame
		bodyModel[283].setRotationPoint(-26.5F, 3F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 411 ds44-1000 frame
		bodyModel[284].setRotationPoint(-28.5F, 3F, 10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 412 ds44-1000 frame
		bodyModel[285].setRotationPoint(-26.5F, 3F, 11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411 ds44-1000 frame
		bodyModel[286].setRotationPoint(26.5F, 3F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 412 ds44-1000 frame
		bodyModel[287].setRotationPoint(24.5F, 3F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411 ds44-1000 frame
		bodyModel[288].setRotationPoint(26.5F, 3F, 11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 412 ds44-1000 frame
		bodyModel[289].setRotationPoint(24.5F, 3F, 11F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 421 ds handrail
		bodyModel[290].setRotationPoint(-28.5F, 1F, -11.01F);

		bodyModel[291].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 422 ds handrail
		bodyModel[291].setRotationPoint(-28.5F, 1F, 11.01F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 1, 22, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 423 ds handrail (ONLY COLOR 2 MB)
		bodyModel[292].setRotationPoint(-28.51F, 5F, -11F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 424
		bodyModel[293].setRotationPoint(13F, -18.5F, -0.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 425
		bodyModel[294].setRotationPoint(15F, -17.5F, -0.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[295].setRotationPoint(25.5F, -23F, 0F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 427
		bodyModel[296].setRotationPoint(-4.5F, 3.5F, -10.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[297].setRotationPoint(3.5F, 3.5F, 5.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 429 baldwin mystery box
		bodyModel[298].setRotationPoint(13.5F, -21F, -3F);

		bodyModel[299].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[299].setRotationPoint(32.5F, -2F, -5F);

		bodyModel[300].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[300].setRotationPoint(32.5F, -2F, -5F);

		bodyModel[301].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[301].setRotationPoint(32.5F, -2F, 1F);

		bodyModel[302].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[302].setRotationPoint(32.5F, -2F, 1F);

		bodyModel[303].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[303].setRotationPoint(-32.5F, -2F, -5F);

		bodyModel[304].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[304].setRotationPoint(-32.5F, -2F, -5F);

		bodyModel[305].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[305].setRotationPoint(-32.5F, -2F, 1F);

		bodyModel[306].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[306].setRotationPoint(-32.5F, -2F, 1F);

		bodyModel[307].addShapeBox(-1F, 0F, -1F, 2, 5, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 438 amador central FPE
		bodyModel[307].setRotationPoint(29.5F, -4F, 3.5F);
		bodyModel[307].rotateAngleY = -0.78539816F;

		bodyModel[308].addShapeBox(-1F, 0F, -1F, 2, 5, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 438 amador central FPE
		bodyModel[308].setRotationPoint(29.5F, -4F, -3.5F);
		bodyModel[308].rotateAngleY = -0.78539816F;

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[309].setRotationPoint(32.5F, 6F, 0F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[310].setRotationPoint(32.5F, 6F, -2F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 442
		bodyModel[311].setRotationPoint(-34.5F, 6F, 0F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[312].setRotationPoint(-34.5F, 6F, -2F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 444 cull AIR MU DOUBLE
		bodyModel[313].setRotationPoint(-32.75F, -10F, -1F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 0, 7, 0F); // Box 195 mu stepup step SINGLE
		bodyModel[314].setRotationPoint(-32.5F, 0F, -3.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 446 mu plug DOUBLE
		bodyModel[315].setRotationPoint(-33F, -1F, -1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 447 mu plug DOUBLE
		bodyModel[316].setRotationPoint(32F, -1F, -1F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448 technically a lamp
		bodyModel[317].setRotationPoint(-33.01F, -9.99F, -1F);

		bodyModel[318].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 449 AIR MU HOSE
		bodyModel[318].setRotationPoint(-32.75F, -9F, 0.5F);
		bodyModel[318].rotateAngleX = -0.10471976F;
		bodyModel[318].rotateAngleY = 0.64577182F;
		bodyModel[318].rotateAngleZ = -0.13962634F;

		bodyModel[319].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 450 AIR MU HOSE
		bodyModel[319].setRotationPoint(-32.75F, -7F, 0.5F);
		bodyModel[319].rotateAngleY = 0.64577182F;
		bodyModel[319].rotateAngleZ = -0.13962634F;

		bodyModel[320].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 451 AIR MU HOSE
		bodyModel[320].setRotationPoint(-32.75F, -5F, 0.5F);
		bodyModel[320].rotateAngleX = 0.10471976F;
		bodyModel[320].rotateAngleY = 0.64577182F;
		bodyModel[320].rotateAngleZ = -0.13962634F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 452
		bodyModel[321].setRotationPoint(-32.5F, -1.5F, -3F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 444 cull AIR MU DOUBLE
		bodyModel[322].setRotationPoint(31.75F, -10F, -1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448 technically a lamp
		bodyModel[323].setRotationPoint(32.01F, -9.99F, -1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 452
		bodyModel[324].setRotationPoint(31.5F, -1.5F, -3F);

		bodyModel[325].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 449 AIR MU HOSE
		bodyModel[325].setRotationPoint(32.75F, -9F, -0.5F);
		bodyModel[325].rotateAngleX = -0.10471976F;
		bodyModel[325].rotateAngleY = -2.49582083F;
		bodyModel[325].rotateAngleZ = -0.13962634F;

		bodyModel[326].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 450 AIR MU HOSE
		bodyModel[326].setRotationPoint(32.75F, -7F, -0.5F);
		bodyModel[326].rotateAngleY = -2.49582083F;
		bodyModel[326].rotateAngleZ = -0.13962634F;

		bodyModel[327].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 451 AIR MU HOSE
		bodyModel[327].setRotationPoint(32.75F, -5F, -0.5F);
		bodyModel[327].rotateAngleX = 0.10471976F;
		bodyModel[327].rotateAngleY = -2.49582083F;
		bodyModel[327].rotateAngleZ = -0.13962634F;

		bodyModel[328].addBox(-2.5F, 0F, -1F, 4, 2, 1, 0F); // Box 623
		bodyModel[328].setRotationPoint(14.5F, -20.5F, -5F);
		bodyModel[328].rotateAngleY = -0.78539816F;

		bodyModel[329].addShapeBox(-1.5F, 0F, 0.1F, 4, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 625 sp numerbboard
		bodyModel[329].setRotationPoint(14.5F, -20.5F, -5F);
		bodyModel[329].rotateAngleY = 2.35619449F;

		bodyModel[330].addShapeBox(-2.5F, 0F, 0.1F, 4, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 sp numberboard
		bodyModel[330].setRotationPoint(14.5F, -20.5F, 5F);
		bodyModel[330].rotateAngleY = 0.78539816F;

		bodyModel[331].addBox(-2.5F, 0F, 0F, 4, 2, 1, 0F); // Box 627
		bodyModel[331].setRotationPoint(14.5F, -20.5F, 5F);
		bodyModel[331].rotateAngleY = 0.78539816F;

		bodyModel[332].addBox(-1.5F, 0F, -1F, 1, 2, 2, 0F); // Box 355
		bodyModel[332].setRotationPoint(14.5F, -18.5F, -4.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 468 SP MEGA SCHNOZ REAR
		bodyModel[333].setRotationPoint(23.5F, -21.5F, -3F);

		bodyModel[334].addBox(-1.5F, 0F, -1F, 1, 2, 2, 0F); // Box 469
		bodyModel[334].setRotationPoint(14.5F, -18.5F, 4.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470 dynamic brake blister
		bodyModel[335].setRotationPoint(9.5F, -20F, 6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471 dynamic brake blister
		bodyModel[336].setRotationPoint(9.5F, -20F, -7F);

		bodyModel[337].addBox(0F, 0F, 0F, 7, 3, 14, 0F); // Box 472 dynamic brake blister
		bodyModel[337].setRotationPoint(9.5F, -19F, -7F);

		bodyModel[338].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 473 dynamic brake blister
		bodyModel[338].setRotationPoint(9.5F, -20F, -6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 474 dynamic brake blister
		bodyModel[339].setRotationPoint(9.5F, -21F, -1.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[340].setRotationPoint(8.5F, -22.25F, 2F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[341].setRotationPoint(10F, -21.5F, 1F);

		bodyModel[342].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[342].setRotationPoint(7.5F, -22.5F, 1F);

		bodyModel[343].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[343].setRotationPoint(8F, -22.25F, 0F);

		bodyModel[344].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[344].setRotationPoint(9F, -23.5F, 0.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[345].setRotationPoint(9F, -23.5F, 1.75F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 411 ds44-1000 frame
		bodyModel[346].setRotationPoint(-28.5F, 2F, -10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 411 ds44-1000 frame
		bodyModel[347].setRotationPoint(-28.5F, 2F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[348].setRotationPoint(28.5F, 3F, -11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[349].setRotationPoint(28.5F, 3F, 10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F); // Box 354
		bodyModel[350].setRotationPoint(-32.5F, -7F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 355
		bodyModel[351].setRotationPoint(-32.5F, -7F, 5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 356
		bodyModel[352].setRotationPoint(32.5F, -7F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F); // Box 357
		bodyModel[353].setRotationPoint(32.5F, -7F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[354].setRotationPoint(-30F, -19F, -1.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[355].setRotationPoint(29F, -20.5F, -1.5F);

		bodyModel[356].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[356].setRotationPoint(20.5F, -23F, -2F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[357].setRotationPoint(19.5F, -23F, -2F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[358].setRotationPoint(19.5F, -22F, -2F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363
		bodyModel[359].setRotationPoint(22F, -22F, -0.5F);

		bodyModel[360].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[360].setRotationPoint(20.5F, -22.75F, 0.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 365
		bodyModel[361].setRotationPoint(19.5F, -23F, -0.5F);

		bodyModel[362].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 366
		bodyModel[362].setRotationPoint(21F, -22.75F, -1.5F);

		bodyModel[363].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 367
		bodyModel[363].setRotationPoint(21F, -24F, -1F);

		bodyModel[364].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 368
		bodyModel[364].setRotationPoint(22F, -24F, 0.25F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[365].setRotationPoint(28.5F, -17F, 9.25F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[366].setRotationPoint(29.85F, -16.5F, 9.75F);

		bodyModel[367].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[367].setRotationPoint(29F, -16.5F, 9.25F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[368].setRotationPoint(27.75F, -15.25F, 9.75F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[369].setRotationPoint(28.5F, -17F, -11.25F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[370].setRotationPoint(29.85F, -16.5F, -10.75F);

		bodyModel[371].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[371].setRotationPoint(29F, -16.5F, -11.25F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[372].setRotationPoint(27.75F, -15.25F, -10.75F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight rear sw refit
		bodyModel[373].setRotationPoint(29.75F, -20.5F, -0.75F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight rear sw refit
		bodyModel[374].setRotationPoint(29.75F, -19F, -0.75F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 383 sw headlight refit
		bodyModel[375].setRotationPoint(28.5F, -20.5F, -1F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384 sw headlight refit
		bodyModel[376].setRotationPoint(28.5F, -20F, -2F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 387 sw headlight refit
		bodyModel[377].setRotationPoint(28.5F, -20F, 1F);

		bodyModel[378].addBox(-2.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard reart sw refit
		bodyModel[378].setRotationPoint(30.5F, -19.5F, 1F);
		bodyModel[378].rotateAngleY = -0.4712389F;

		bodyModel[379].addBox(-2.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard rear sw reft
		bodyModel[379].setRotationPoint(30.5F, -19.5F, -1F);
		bodyModel[379].rotateAngleY = 0.4712389F;

		bodyModel[380].addShapeBox(0F, 0F, 0F, 16, 0, 22, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -11F, 0F, 0F, -11F); // Box 384
		bodyModel[380].setRotationPoint(-21.5F, -17.01F, -5.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385 hot dog french fries comeon baby tell me your lies
		bodyModel[381].setRotationPoint(16.49F, -19F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 386 side numberboard glow
		bodyModel[382].setRotationPoint(-10F, -14.5F, -7.01F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 387 sied numberboard glow
		bodyModel[383].setRotationPoint(-6F, -14.5F, 7.01F);
		bodyModel[383].rotateAngleY = -3.14159265F;

		bodyModel[384].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 291 mug
		bodyModel[384].setRotationPoint(22.5F, -13F, 3F);
		bodyModel[384].rotateAngleY = 0.52359878F;

		bodyModel[385].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.125F, 0F, -0.125F); // Box 294 mug
		bodyModel[385].setRotationPoint(22.5F, -13F, 3F);
		bodyModel[385].rotateAngleY = 0.52359878F;

		bodyModel[386].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 291 mug
		bodyModel[386].setRotationPoint(22.5F, -13F, 3F);
		bodyModel[386].rotateAngleY = 0.52359878F;

		bodyModel[387].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, -0.125F, -0.5F, 0F, 0F); // Box 294 mug
		bodyModel[387].setRotationPoint(22.5F, -13F, 3F);
		bodyModel[387].rotateAngleY = 0.52359878F;

		bodyModel[388].addShapeBox(0.4F, 0F, -0.85F, 1, 2, 1, 0F,0F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 353 mug cull
		bodyModel[388].setRotationPoint(22.5F, -13.6F, 3F);
		bodyModel[388].rotateAngleY = 0.52359878F;

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 171 headlight front 2beam2
		bodyModel[389].setRotationPoint(-29.25F, -18.75F, 0F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 172 headlight front 2beam2
		bodyModel[390].setRotationPoint(-29.25F, -18.25F, -1.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 171 headlight rear 2beam2
		bodyModel[391].setRotationPoint(28.75F, -20.25F, 0F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 172 headlight rear 2beam2
		bodyModel[392].setRotationPoint(28.75F, -19.75F, -1.5F);
	}
	ModelTypeAnew theTypeA = new ModelTypeAnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 3246) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, -0.03, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 3) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_greygray_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.1, -0.02, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 17 || GetColor(entity) == 18) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_silvers_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.1, -0.02, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
		else if (GetColor(entity) == 20) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_silvers_FRICK.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.1, -0.02, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
		else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.1, -0.02, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}