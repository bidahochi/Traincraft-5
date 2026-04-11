//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.02.2022 - 17:26:25
// Last changed on: 26.02.2022 - 17:26:25

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTrimountTrucc;
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

public class ModelRSD15 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelRSD15() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[598];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 99, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 0, 103, textureX, textureY); // Box 28
		bodyModel[2] = new ModelRendererTurbo(this, 342, 128, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 388, 159, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 342, 152, textureX, textureY); // Box 157
		bodyModel[5] = new ModelRendererTurbo(this, 379, 126, textureX, textureY); // Box 158
		bodyModel[6] = new ModelRendererTurbo(this, 352, 120, textureX, textureY); // Box 159
		bodyModel[7] = new ModelRendererTurbo(this, 285, 90, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 259, 73, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 275, 66, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[11] = new ModelRendererTurbo(this, 379, 133, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 16, 19, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 329, 119, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 272, 98, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 369, 152, textureX, textureY); // Box 148
		bodyModel[17] = new ModelRendererTurbo(this, 339, 159, textureX, textureY); // Box 149
		bodyModel[18] = new ModelRendererTurbo(this, 396, 128, textureX, textureY); // Box 150
		bodyModel[19] = new ModelRendererTurbo(this, 154, 103, textureX, textureY); // Box 153
		bodyModel[20] = new ModelRendererTurbo(this, 150, 97, textureX, textureY); // Box 154
		bodyModel[21] = new ModelRendererTurbo(this, 144, 97, textureX, textureY); // Box 155
		bodyModel[22] = new ModelRendererTurbo(this, 143, 103, textureX, textureY); // Box 156
		bodyModel[23] = new ModelRendererTurbo(this, 155, 97, textureX, textureY); // Box 157
		bodyModel[24] = new ModelRendererTurbo(this, 147, 97, textureX, textureY); // Box 158
		bodyModel[25] = new ModelRendererTurbo(this, 155, 99, textureX, textureY); // Box 159
		bodyModel[26] = new ModelRendererTurbo(this, 4, 97, textureX, textureY); // Box 160
		bodyModel[27] = new ModelRendererTurbo(this, 142, 153, textureX, textureY); // Box 10
		bodyModel[28] = new ModelRendererTurbo(this, 142, 142, textureX, textureY); // Box 12
		bodyModel[29] = new ModelRendererTurbo(this, 143, 124, textureX, textureY); // Box 13
		bodyModel[30] = new ModelRendererTurbo(this, 144, 145, textureX, textureY); // Box 138
		bodyModel[31] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 139
		bodyModel[32] = new ModelRendererTurbo(this, 144, 116, textureX, textureY); // Box 166
		bodyModel[33] = new ModelRendererTurbo(this, 143, 136, textureX, textureY); // Box 167
		bodyModel[34] = new ModelRendererTurbo(this, 2, 107, textureX, textureY); // Box 170
		bodyModel[35] = new ModelRendererTurbo(this, 5, 112, textureX, textureY); // Box 171
		bodyModel[36] = new ModelRendererTurbo(this, 139, 97, textureX, textureY); // Box 172
		bodyModel[37] = new ModelRendererTurbo(this, 154, 103, textureX, textureY); // Box 173
		bodyModel[38] = new ModelRendererTurbo(this, 134, 103, textureX, textureY); // Box 174
		bodyModel[39] = new ModelRendererTurbo(this, 147, 100, textureX, textureY); // Box 175
		bodyModel[40] = new ModelRendererTurbo(this, 158, 98, textureX, textureY); // Box 176
		bodyModel[41] = new ModelRendererTurbo(this, 143, 105, textureX, textureY); // Box 177
		bodyModel[42] = new ModelRendererTurbo(this, 136, 98, textureX, textureY); // Box 178
		bodyModel[43] = new ModelRendererTurbo(this, 150, 99, textureX, textureY); // Box 179
		bodyModel[44] = new ModelRendererTurbo(this, 142, 150, textureX, textureY); // Box 180
		bodyModel[45] = new ModelRendererTurbo(this, 150, 153, textureX, textureY); // Box 181
		bodyModel[46] = new ModelRendererTurbo(this, 143, 127, textureX, textureY); // Box 182
		bodyModel[47] = new ModelRendererTurbo(this, 144, 145, textureX, textureY); // Box 183
		bodyModel[48] = new ModelRendererTurbo(this, 151, 138, textureX, textureY); // Box 184
		bodyModel[49] = new ModelRendererTurbo(this, 144, 118, textureX, textureY); // Box 185
		bodyModel[50] = new ModelRendererTurbo(this, 151, 136, textureX, textureY); // Box 186
		bodyModel[51] = new ModelRendererTurbo(this, 158, 100, textureX, textureY); // Box 187
		bodyModel[52] = new ModelRendererTurbo(this, 149, 103, textureX, textureY); // Box 189
		bodyModel[53] = new ModelRendererTurbo(this, 154, 110, textureX, textureY); // Box 190
		bodyModel[54] = new ModelRendererTurbo(this, 136, 100, textureX, textureY); // Box 191
		bodyModel[55] = new ModelRendererTurbo(this, 147, 102, textureX, textureY); // Box 192
		bodyModel[56] = new ModelRendererTurbo(this, 143, 107, textureX, textureY); // Box 193
		bodyModel[57] = new ModelRendererTurbo(this, 143, 103, textureX, textureY); // Box 194
		bodyModel[58] = new ModelRendererTurbo(this, 138, 103, textureX, textureY); // Box 195
		bodyModel[59] = new ModelRendererTurbo(this, 143, 109, textureX, textureY); // Box 196
		bodyModel[60] = new ModelRendererTurbo(this, 134, 110, textureX, textureY); // Box 197
		bodyModel[61] = new ModelRendererTurbo(this, 158, 102, textureX, textureY); // Box 198
		bodyModel[62] = new ModelRendererTurbo(this, 136, 102, textureX, textureY); // Box 199
		bodyModel[63] = new ModelRendererTurbo(this, 55, 98, textureX, textureY); // Box 200
		bodyModel[64] = new ModelRendererTurbo(this, 144, 99, textureX, textureY); // Box 201
		bodyModel[65] = new ModelRendererTurbo(this, 57, 96, textureX, textureY); // Box 202
		bodyModel[66] = new ModelRendererTurbo(this, 139, 99, textureX, textureY); // Box 203
		bodyModel[67] = new ModelRendererTurbo(this, 53, 102, textureX, textureY); // Box 204
		bodyModel[68] = new ModelRendererTurbo(this, 155, 102, textureX, textureY); // Box 205
		bodyModel[69] = new ModelRendererTurbo(this, 150, 102, textureX, textureY); // Box 206
		bodyModel[70] = new ModelRendererTurbo(this, 55, 106, textureX, textureY); // Box 207
		bodyModel[71] = new ModelRendererTurbo(this, 58, 111, textureX, textureY); // Box 208
		bodyModel[72] = new ModelRendererTurbo(this, 144, 102, textureX, textureY); // Box 209
		bodyModel[73] = new ModelRendererTurbo(this, 139, 102, textureX, textureY); // Box 210
		bodyModel[74] = new ModelRendererTurbo(this, 150, 150, textureX, textureY); // Box 211
		bodyModel[75] = new ModelRendererTurbo(this, 136, 145, textureX, textureY); // Box 212
		bodyModel[76] = new ModelRendererTurbo(this, 150, 142, textureX, textureY); // Box 213
		bodyModel[77] = new ModelRendererTurbo(this, 143, 130, textureX, textureY); // Box 214
		bodyModel[78] = new ModelRendererTurbo(this, 144, 120, textureX, textureY); // Box 215
		bodyModel[79] = new ModelRendererTurbo(this, 139, 136, textureX, textureY); // Box 216
		bodyModel[80] = new ModelRendererTurbo(this, 147, 136, textureX, textureY); // Box 217
		bodyModel[81] = new ModelRendererTurbo(this, 144, 122, textureX, textureY); // Box 218
		bodyModel[82] = new ModelRendererTurbo(this, 143, 133, textureX, textureY); // Box 219
		bodyModel[83] = new ModelRendererTurbo(this, 136, 138, textureX, textureY); // Box 220
		bodyModel[84] = new ModelRendererTurbo(this, 134, 142, textureX, textureY); // Box 221
		bodyModel[85] = new ModelRendererTurbo(this, 151, 145, textureX, textureY); // Box 222
		bodyModel[86] = new ModelRendererTurbo(this, 134, 150, textureX, textureY); // Box 223
		bodyModel[87] = new ModelRendererTurbo(this, 475, 79, textureX, textureY); // Box 490
		bodyModel[88] = new ModelRendererTurbo(this, 82, 68, textureX, textureY); // Box 502
		bodyModel[89] = new ModelRendererTurbo(this, 466, 23, textureX, textureY); // Box 503
		bodyModel[90] = new ModelRendererTurbo(this, 479, 52, textureX, textureY); // Box 504
		bodyModel[91] = new ModelRendererTurbo(this, 100, 53, textureX, textureY); // Box 155
		bodyModel[92] = new ModelRendererTurbo(this, 485, 23, textureX, textureY); // Box 156
		bodyModel[93] = new ModelRendererTurbo(this, 84, 53, textureX, textureY); // Box 157
		bodyModel[94] = new ModelRendererTurbo(this, 483, 44, textureX, textureY); // Box 160
		bodyModel[95] = new ModelRendererTurbo(this, 498, 42, textureX, textureY); // Box 161
		bodyModel[96] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 276
		bodyModel[97] = new ModelRendererTurbo(this, 468, 44, textureX, textureY); // Box 241
		bodyModel[98] = new ModelRendererTurbo(this, 498, 47, textureX, textureY); // Box 242
		bodyModel[99] = new ModelRendererTurbo(this, 333, 30, textureX, textureY); // Box 2
		bodyModel[100] = new ModelRendererTurbo(this, 342, 10, textureX, textureY); // Box 244
		bodyModel[101] = new ModelRendererTurbo(this, 342, 17, textureX, textureY); // Box 245
		bodyModel[102] = new ModelRendererTurbo(this, 96, 170, textureX, textureY); // Box 129
		bodyModel[103] = new ModelRendererTurbo(this, 95, 166, textureX, textureY); // Box 130
		bodyModel[104] = new ModelRendererTurbo(this, 94, 139, textureX, textureY); // Box 132
		bodyModel[105] = new ModelRendererTurbo(this, 42, 150, textureX, textureY); // Box 135
		bodyModel[106] = new ModelRendererTurbo(this, 9, 156, textureX, textureY); // Box 194
		bodyModel[107] = new ModelRendererTurbo(this, 8, 181, textureX, textureY); // Box 195
		bodyModel[108] = new ModelRendererTurbo(this, 95, 162, textureX, textureY); // Box 278
		bodyModel[109] = new ModelRendererTurbo(this, 26, 170, textureX, textureY); // Box 29
		bodyModel[110] = new ModelRendererTurbo(this, 61, 181, textureX, textureY); // Box 315 door swing right
		bodyModel[111] = new ModelRendererTurbo(this, 26, 184, textureX, textureY); // Box 32
		bodyModel[112] = new ModelRendererTurbo(this, 40, 180, textureX, textureY); // Box 405
		bodyModel[113] = new ModelRendererTurbo(this, 1, 180, textureX, textureY); // Box 406
		bodyModel[114] = new ModelRendererTurbo(this, 1, 190, textureX, textureY); // Box 413
		bodyModel[115] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // Box 416
		bodyModel[116] = new ModelRendererTurbo(this, 1, 182, textureX, textureY); // Box 417
		bodyModel[117] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 428
		bodyModel[118] = new ModelRendererTurbo(this, 22, 150, textureX, textureY); // Box 57
		bodyModel[119] = new ModelRendererTurbo(this, 60, 137, textureX, textureY); // Box 57
		bodyModel[120] = new ModelRendererTurbo(this, 95, 158, textureX, textureY); // Box 58
		bodyModel[121] = new ModelRendererTurbo(this, 9, 170, textureX, textureY); // Box 706
		bodyModel[122] = new ModelRendererTurbo(this, 200, 69, textureX, textureY); // Box 95
		bodyModel[123] = new ModelRendererTurbo(this, 47, 40, textureX, textureY); // Box 276
		bodyModel[124] = new ModelRendererTurbo(this, 101, 78, textureX, textureY); // Box 277
		bodyModel[125] = new ModelRendererTurbo(this, 99, 69, textureX, textureY); // Box 278
		bodyModel[126] = new ModelRendererTurbo(this, 99, 60, textureX, textureY); // Box 282
		bodyModel[127] = new ModelRendererTurbo(this, 84, 60, textureX, textureY); // Box 283
		bodyModel[128] = new ModelRendererTurbo(this, 47, 45, textureX, textureY); // Box 284
		bodyModel[129] = new ModelRendererTurbo(this, 67, 34, textureX, textureY); // Box 285
		bodyModel[130] = new ModelRendererTurbo(this, 46, 46, textureX, textureY); // Box 286
		bodyModel[131] = new ModelRendererTurbo(this, 1, 53, textureX, textureY); // Box 287
		bodyModel[132] = new ModelRendererTurbo(this, 310, 130, textureX, textureY); // Box 561
		bodyModel[133] = new ModelRendererTurbo(this, 310, 137, textureX, textureY); // Box 292
		bodyModel[134] = new ModelRendererTurbo(this, 1, 157, textureX, textureY); // Box 293
		bodyModel[135] = new ModelRendererTurbo(this, 15, 150, textureX, textureY); // Box 294
		bodyModel[136] = new ModelRendererTurbo(this, 11, 164, textureX, textureY); // Box 295
		bodyModel[137] = new ModelRendererTurbo(this, 53, 158, textureX, textureY); // Box 296
		bodyModel[138] = new ModelRendererTurbo(this, 1, 194, textureX, textureY); // Box 297
		bodyModel[139] = new ModelRendererTurbo(this, 1, 165, textureX, textureY); // Box 298
		bodyModel[140] = new ModelRendererTurbo(this, 24, 155, textureX, textureY); // Box 299
		bodyModel[141] = new ModelRendererTurbo(this, 1, 173, textureX, textureY); // Box 300
		bodyModel[142] = new ModelRendererTurbo(this, 2, 87, textureX, textureY); // Box 301
		bodyModel[143] = new ModelRendererTurbo(this, 40, 81, textureX, textureY); // Box 302
		bodyModel[144] = new ModelRendererTurbo(this, 1, 80, textureX, textureY); // Box 303
		bodyModel[145] = new ModelRendererTurbo(this, 120, 61, textureX, textureY); // Box 304
		bodyModel[146] = new ModelRendererTurbo(this, 120, 47, textureX, textureY); // Box 305
		bodyModel[147] = new ModelRendererTurbo(this, 135, 69, textureX, textureY); // Box 306
		bodyModel[148] = new ModelRendererTurbo(this, 137, 61, textureX, textureY); // Box 307
		bodyModel[149] = new ModelRendererTurbo(this, 47, 50, textureX, textureY); // Box 308
		bodyModel[150] = new ModelRendererTurbo(this, 137, 46, textureX, textureY); // Box 309
		bodyModel[151] = new ModelRendererTurbo(this, 47, 55, textureX, textureY); // Box 310
		bodyModel[152] = new ModelRendererTurbo(this, 135, 54, textureX, textureY); // Box 311
		bodyModel[153] = new ModelRendererTurbo(this, 120, 54, textureX, textureY); // Box 312
		bodyModel[154] = new ModelRendererTurbo(this, 108, 24, textureX, textureY); // Box 313
		bodyModel[155] = new ModelRendererTurbo(this, 109, 31, textureX, textureY); // Box 314
		bodyModel[156] = new ModelRendererTurbo(this, 108, 37, textureX, textureY); // Box 315
		bodyModel[157] = new ModelRendererTurbo(this, 82, 32, textureX, textureY); // Box 317
		bodyModel[158] = new ModelRendererTurbo(this, 268, 42, textureX, textureY); // Box 318
		bodyModel[159] = new ModelRendererTurbo(this, 467, 32, textureX, textureY); // Box 319
		bodyModel[160] = new ModelRendererTurbo(this, 485, 35, textureX, textureY); // Box 320
		bodyModel[161] = new ModelRendererTurbo(this, 495, 33, textureX, textureY); // Box 321
		bodyModel[162] = new ModelRendererTurbo(this, 152, 187, textureX, textureY); // Box 344
		bodyModel[163] = new ModelRendererTurbo(this, 127, 193, textureX, textureY); // Box 345
		bodyModel[164] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Box 346
		bodyModel[165] = new ModelRendererTurbo(this, 110, 187, textureX, textureY); // Box 347
		bodyModel[166] = new ModelRendererTurbo(this, 118, 202, textureX, textureY); // Box 348
		bodyModel[167] = new ModelRendererTurbo(this, 110, 194, textureX, textureY); // Box 349
		bodyModel[168] = new ModelRendererTurbo(this, 106, 202, textureX, textureY); // Box 350
		bodyModel[169] = new ModelRendererTurbo(this, 79, 178, textureX, textureY); // Box 351
		bodyModel[170] = new ModelRendererTurbo(this, 127, 185, textureX, textureY); // Box 352
		bodyModel[171] = new ModelRendererTurbo(this, 94, 202, textureX, textureY); // Box 353
		bodyModel[172] = new ModelRendererTurbo(this, 80, 188, textureX, textureY); // Box 354
		bodyModel[173] = new ModelRendererTurbo(this, 79, 202, textureX, textureY); // Box 356
		bodyModel[174] = new ModelRendererTurbo(this, 127, 189, textureX, textureY); // Box 358
		bodyModel[175] = new ModelRendererTurbo(this, 80, 195, textureX, textureY); // Box 359
		bodyModel[176] = new ModelRendererTurbo(this, 160, 62, textureX, textureY); // Box 360
		bodyModel[177] = new ModelRendererTurbo(this, 158, 64, textureX, textureY); // Box 361
		bodyModel[178] = new ModelRendererTurbo(this, 179, 52, textureX, textureY); // Box 362
		bodyModel[179] = new ModelRendererTurbo(this, 223, 37, textureX, textureY); // Box 363
		bodyModel[180] = new ModelRendererTurbo(this, 1, 236, textureX, textureY); // Box 159
		bodyModel[181] = new ModelRendererTurbo(this, 2, 212, textureX, textureY); // Box 160
		bodyModel[182] = new ModelRendererTurbo(this, 23, 212, textureX, textureY); // Box 161
		bodyModel[183] = new ModelRendererTurbo(this, 19, 222, textureX, textureY); // Box 162
		bodyModel[184] = new ModelRendererTurbo(this, 42, 237, textureX, textureY); // Box 284
		bodyModel[185] = new ModelRendererTurbo(this, 2, 222, textureX, textureY); // Box 372
		bodyModel[186] = new ModelRendererTurbo(this, 2, 229, textureX, textureY); // Box 373
		bodyModel[187] = new ModelRendererTurbo(this, 19, 229, textureX, textureY); // Box 374
		bodyModel[188] = new ModelRendererTurbo(this, 106, 242, textureX, textureY); // Box 233
		bodyModel[189] = new ModelRendererTurbo(this, 107, 237, textureX, textureY); // Box 234
		bodyModel[190] = new ModelRendererTurbo(this, 107, 248, textureX, textureY); // Box 235
		bodyModel[191] = new ModelRendererTurbo(this, 109, 230, textureX, textureY); // exhaust
		bodyModel[192] = new ModelRendererTurbo(this, 270, 29, textureX, textureY); // Box 379
		bodyModel[193] = new ModelRendererTurbo(this, 277, 18, textureX, textureY); // Box 380
		bodyModel[194] = new ModelRendererTurbo(this, 93, 190, textureX, textureY); // Box 381
		bodyModel[195] = new ModelRendererTurbo(this, 121, 192, textureX, textureY); // Box 382
		bodyModel[196] = new ModelRendererTurbo(this, 93, 196, textureX, textureY); // Box 383
		bodyModel[197] = new ModelRendererTurbo(this, 121, 195, textureX, textureY); // Box 384
		bodyModel[198] = new ModelRendererTurbo(this, 127, 204, textureX, textureY); // Box 385
		bodyModel[199] = new ModelRendererTurbo(this, 127, 201, textureX, textureY); // Box 386
		bodyModel[200] = new ModelRendererTurbo(this, 266, 168, textureX, textureY); // Box 387
		bodyModel[201] = new ModelRendererTurbo(this, 251, 168, textureX, textureY); // Box 388
		bodyModel[202] = new ModelRendererTurbo(this, 272, 156, textureX, textureY); // Box 389
		bodyModel[203] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 390
		bodyModel[204] = new ModelRendererTurbo(this, 230, 154, textureX, textureY); // Box 391
		bodyModel[205] = new ModelRendererTurbo(this, 243, 158, textureX, textureY); // Box 393
		bodyModel[206] = new ModelRendererTurbo(this, 230, 152, textureX, textureY); // Box 396
		bodyModel[207] = new ModelRendererTurbo(this, 166, 135, textureX, textureY); // Box 135
		bodyModel[208] = new ModelRendererTurbo(this, 166, 124, textureX, textureY); // Box 135
		bodyModel[209] = new ModelRendererTurbo(this, 207, 148, textureX, textureY); // Box 399
		bodyModel[210] = new ModelRendererTurbo(this, 198, 148, textureX, textureY); // Box 400
		bodyModel[211] = new ModelRendererTurbo(this, 189, 148, textureX, textureY); // Box 401
		bodyModel[212] = new ModelRendererTurbo(this, 221, 147, textureX, textureY); // Box 116
		bodyModel[213] = new ModelRendererTurbo(this, 221, 145, textureX, textureY); // Box 404
		bodyModel[214] = new ModelRendererTurbo(this, 163, 135, textureX, textureY); // Box 405
		bodyModel[215] = new ModelRendererTurbo(this, 160, 135, textureX, textureY); // Box 406
		bodyModel[216] = new ModelRendererTurbo(this, 157, 74, textureX, textureY); // Box 407
		bodyModel[217] = new ModelRendererTurbo(this, 136, 168, textureX, textureY); // Box 408
		bodyModel[218] = new ModelRendererTurbo(this, 142, 158, textureX, textureY); // Box 409
		bodyModel[219] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 410
		bodyModel[220] = new ModelRendererTurbo(this, 263, 156, textureX, textureY); // Box 411
		bodyModel[221] = new ModelRendererTurbo(this, 157, 121, textureX, textureY); // Box 412
		bodyModel[222] = new ModelRendererTurbo(this, 140, 121, textureX, textureY); // Box 413
		bodyModel[223] = new ModelRendererTurbo(this, 154, 121, textureX, textureY); // Box 414
		bodyModel[224] = new ModelRendererTurbo(this, 169, 135, textureX, textureY); // Box 415
		bodyModel[225] = new ModelRendererTurbo(this, 180, 148, textureX, textureY); // Box 416
		bodyModel[226] = new ModelRendererTurbo(this, 163, 124, textureX, textureY); // Box 417
		bodyModel[227] = new ModelRendererTurbo(this, 171, 148, textureX, textureY); // Box 418
		bodyModel[228] = new ModelRendererTurbo(this, 162, 148, textureX, textureY); // Box 419
		bodyModel[229] = new ModelRendererTurbo(this, 221, 149, textureX, textureY); // Box 420
		bodyModel[230] = new ModelRendererTurbo(this, 169, 124, textureX, textureY); // Box 421
		bodyModel[231] = new ModelRendererTurbo(this, 221, 151, textureX, textureY); // Box 422
		bodyModel[232] = new ModelRendererTurbo(this, 160, 124, textureX, textureY); // Box 423
		bodyModel[233] = new ModelRendererTurbo(this, 254, 156, textureX, textureY); // Box 424
		bodyModel[234] = new ModelRendererTurbo(this, 283, 168, textureX, textureY); // Box 426
		bodyModel[235] = new ModelRendererTurbo(this, 236, 156, textureX, textureY); // Box 427
		bodyModel[236] = new ModelRendererTurbo(this, 201, 62, textureX, textureY); // Box 428
		bodyModel[237] = new ModelRendererTurbo(this, 194, 52, textureX, textureY); // Box 429
		bodyModel[238] = new ModelRendererTurbo(this, 245, 156, textureX, textureY); // Box 430
		bodyModel[239] = new ModelRendererTurbo(this, 273, 158, textureX, textureY); // Box 431
		bodyModel[240] = new ModelRendererTurbo(this, 160, 55, textureX, textureY); // Box 432
		bodyModel[241] = new ModelRendererTurbo(this, 161, 46, textureX, textureY); // Box 433
		bodyModel[242] = new ModelRendererTurbo(this, 51, 15, textureX, textureY); // Box 354
		bodyModel[243] = new ModelRendererTurbo(this, 16, 27, textureX, textureY); // Box 355
		bodyModel[244] = new ModelRendererTurbo(this, 11, 27, textureX, textureY); // Box 357
		bodyModel[245] = new ModelRendererTurbo(this, 30, 15, textureX, textureY); // Box 358
		bodyModel[246] = new ModelRendererTurbo(this, 31, 10, textureX, textureY); // Box 359
		bodyModel[247] = new ModelRendererTurbo(this, 31, 13, textureX, textureY); // Box 360
		bodyModel[248] = new ModelRendererTurbo(this, 41, 13, textureX, textureY); // Box 364
		bodyModel[249] = new ModelRendererTurbo(this, 44, 23, textureX, textureY); // Box 365
		bodyModel[250] = new ModelRendererTurbo(this, 31, 16, textureX, textureY); // Box 368
		bodyModel[251] = new ModelRendererTurbo(this, 41, 4, textureX, textureY); // Box 369
		bodyModel[252] = new ModelRendererTurbo(this, 31, 19, textureX, textureY); // Box 370
		bodyModel[253] = new ModelRendererTurbo(this, 6, 27, textureX, textureY); // Box 371
		bodyModel[254] = new ModelRendererTurbo(this, 52, 1, textureX, textureY); // Box 372
		bodyModel[255] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 373
		bodyModel[256] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 374
		bodyModel[257] = new ModelRendererTurbo(this, 66, 32, textureX, textureY); // Box 375
		bodyModel[258] = new ModelRendererTurbo(this, 123, 104, textureX, textureY); // Box 376
		bodyModel[259] = new ModelRendererTurbo(this, 118, 61, textureX, textureY); // Box 377
		bodyModel[260] = new ModelRendererTurbo(this, 113, 61, textureX, textureY); // Box 378
		bodyModel[261] = new ModelRendererTurbo(this, 124, 113, textureX, textureY); // Box 379
		bodyModel[262] = new ModelRendererTurbo(this, 427, 154, textureX, textureY); // Box 92
		bodyModel[263] = new ModelRendererTurbo(this, 319, 125, textureX, textureY); // Box 383
		bodyModel[264] = new ModelRendererTurbo(this, 172, 141, textureX, textureY); // Box 253
		bodyModel[265] = new ModelRendererTurbo(this, 172, 144, textureX, textureY); // Box 385
		bodyModel[266] = new ModelRendererTurbo(this, 312, 125, textureX, textureY); // Box 387
		bodyModel[267] = new ModelRendererTurbo(this, 305, 125, textureX, textureY); // Box 390
		bodyModel[268] = new ModelRendererTurbo(this, 398, 152, textureX, textureY); // Box 391
		bodyModel[269] = new ModelRendererTurbo(this, 298, 125, textureX, textureY); // Box 392
		bodyModel[270] = new ModelRendererTurbo(this, 338, 172, textureX, textureY); // Box 395
		bodyModel[271] = new ModelRendererTurbo(this, 223, 126, textureX, textureY); // Box 396
		bodyModel[272] = new ModelRendererTurbo(this, 223, 120, textureX, textureY); // Box 397
		bodyModel[273] = new ModelRendererTurbo(this, 338, 166, textureX, textureY); // Box 398
		bodyModel[274] = new ModelRendererTurbo(this, 225, 133, textureX, textureY); // Box 399
		bodyModel[275] = new ModelRendererTurbo(this, 310, 137, textureX, textureY); // Box 400
		bodyModel[276] = new ModelRendererTurbo(this, 310, 148, textureX, textureY); // Box 278
		bodyModel[277] = new ModelRendererTurbo(this, 310, 178, textureX, textureY); // Box 279
		bodyModel[278] = new ModelRendererTurbo(this, 298, 129, textureX, textureY); // Box 280
		bodyModel[279] = new ModelRendererTurbo(this, 301, 129, textureX, textureY); // Box 281
		bodyModel[280] = new ModelRendererTurbo(this, 307, 130, textureX, textureY); // Box 282
		bodyModel[281] = new ModelRendererTurbo(this, 304, 130, textureX, textureY); // Box 283
		bodyModel[282] = new ModelRendererTurbo(this, 281, 156, textureX, textureY); // Box 284
		bodyModel[283] = new ModelRendererTurbo(this, 157, 237, textureX, textureY); // Box 197
		bodyModel[284] = new ModelRendererTurbo(this, 150, 233, textureX, textureY); // Box 197
		bodyModel[285] = new ModelRendererTurbo(this, 136, 233, textureX, textureY); // Box 197
		bodyModel[286] = new ModelRendererTurbo(this, 138, 242, textureX, textureY); // Box 296
		bodyModel[287] = new ModelRendererTurbo(this, 143, 233, textureX, textureY); // Box 197
		bodyModel[288] = new ModelRendererTurbo(this, 158, 244, textureX, textureY); // Box 197
		bodyModel[289] = new ModelRendererTurbo(this, 176, 245, textureX, textureY); // Box 197
		bodyModel[290] = new ModelRendererTurbo(this, 170, 245, textureX, textureY); // Box 197
		bodyModel[291] = new ModelRendererTurbo(this, 181, 245, textureX, textureY); // Box 197
		bodyModel[292] = new ModelRendererTurbo(this, 152, 238, textureX, textureY); // Box 303
		bodyModel[293] = new ModelRendererTurbo(this, 147, 202, textureX, textureY); // Box 295
		bodyModel[294] = new ModelRendererTurbo(this, 167, 202, textureX, textureY); // Box 296
		bodyModel[295] = new ModelRendererTurbo(this, 88, 23, textureX, textureY); // Box 297
		bodyModel[296] = new ModelRendererTurbo(this, 121, 76, textureX, textureY); // Box 298
		bodyModel[297] = new ModelRendererTurbo(this, 128, 87, textureX, textureY); // Box 299
		bodyModel[298] = new ModelRendererTurbo(this, 76, 21, textureX, textureY); // Box 300
		bodyModel[299] = new ModelRendererTurbo(this, 174, 14, textureX, textureY); // Box 301
		bodyModel[300] = new ModelRendererTurbo(this, 146, 12, textureX, textureY); // Box 302
		bodyModel[301] = new ModelRendererTurbo(this, 78, 14, textureX, textureY); // Box 303
		bodyModel[302] = new ModelRendererTurbo(this, 135, 12, textureX, textureY); // Box 304
		bodyModel[303] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 280
		bodyModel[304] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 281
		bodyModel[305] = new ModelRendererTurbo(this, 307, 207, textureX, textureY); // Box 282
		bodyModel[306] = new ModelRendererTurbo(this, 293, 209, textureX, textureY); // Box 332
		bodyModel[307] = new ModelRendererTurbo(this, 345, 240, textureX, textureY); // Box 339
		bodyModel[308] = new ModelRendererTurbo(this, 332, 222, textureX, textureY); // Box 317
		bodyModel[309] = new ModelRendererTurbo(this, 321, 239, textureX, textureY); // Box 320
		bodyModel[310] = new ModelRendererTurbo(this, 268, 209, textureX, textureY); // Box 321
		bodyModel[311] = new ModelRendererTurbo(this, 254, 211, textureX, textureY); // Box 322
		bodyModel[312] = new ModelRendererTurbo(this, 240, 213, textureX, textureY); // Box 323
		bodyModel[313] = new ModelRendererTurbo(this, 333, 236, textureX, textureY); // Box 324
		bodyModel[314] = new ModelRendererTurbo(this, 282, 207, textureX, textureY); // Box 325
		bodyModel[315] = new ModelRendererTurbo(this, 223, 216, textureX, textureY); // Box 4
		bodyModel[316] = new ModelRendererTurbo(this, 206, 226, textureX, textureY); // Box 4
		bodyModel[317] = new ModelRendererTurbo(this, 304, 241, textureX, textureY); // Box 4
		bodyModel[318] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Box 4
		bodyModel[319] = new ModelRendererTurbo(this, 206, 216, textureX, textureY); // Box 446
		bodyModel[320] = new ModelRendererTurbo(this, 191, 218, textureX, textureY); // Box 447
		bodyModel[321] = new ModelRendererTurbo(this, 317, 227, textureX, textureY); // Box 448
		bodyModel[322] = new ModelRendererTurbo(this, 302, 225, textureX, textureY); // Box 449
		bodyModel[323] = new ModelRendererTurbo(this, 240, 227, textureX, textureY); // Box 168
		bodyModel[324] = new ModelRendererTurbo(this, 240, 240, textureX, textureY); // Box 169
		bodyModel[325] = new ModelRendererTurbo(this, 189, 229, textureX, textureY); // Box 170
		bodyModel[326] = new ModelRendererTurbo(this, 206, 239, textureX, textureY); // Box 171
		bodyModel[327] = new ModelRendererTurbo(this, 291, 240, textureX, textureY); // Box 244
		bodyModel[328] = new ModelRendererTurbo(this, 287, 223, textureX, textureY); // Box 245
		bodyModel[329] = new ModelRendererTurbo(this, 272, 225, textureX, textureY); // Box 246
		bodyModel[330] = new ModelRendererTurbo(this, 257, 227, textureX, textureY); // Box 247
		bodyModel[331] = new ModelRendererTurbo(this, 276, 242, textureX, textureY); // Box 360
		bodyModel[332] = new ModelRendererTurbo(this, 225, 231, textureX, textureY); // Box 361
		bodyModel[333] = new ModelRendererTurbo(this, 225, 244, textureX, textureY); // Box 362
		bodyModel[334] = new ModelRendererTurbo(this, 191, 244, textureX, textureY); // Box 363
		bodyModel[335] = new ModelRendererTurbo(this, 116, 92, textureX, textureY); // Box 346
		bodyModel[336] = new ModelRendererTurbo(this, 124, 10, textureX, textureY); // Box 347
		bodyModel[337] = new ModelRendererTurbo(this, 157, 14, textureX, textureY); // Box 348
		bodyModel[338] = new ModelRendererTurbo(this, 75, 3, textureX, textureY); // Box 349
		bodyModel[339] = new ModelRendererTurbo(this, 161, 2, textureX, textureY); // Box 352
		bodyModel[340] = new ModelRendererTurbo(this, 148, 3, textureX, textureY); // Box 353
		bodyModel[341] = new ModelRendererTurbo(this, 113, 10, textureX, textureY); // Box 354
		bodyModel[342] = new ModelRendererTurbo(this, 99, 92, textureX, textureY); // Box 355
		bodyModel[343] = new ModelRendererTurbo(this, 131, 3, textureX, textureY); // Box 356
		bodyModel[344] = new ModelRendererTurbo(this, 118, 3, textureX, textureY); // Box 357
		bodyModel[345] = new ModelRendererTurbo(this, 102, 10, textureX, textureY); // Box 358
		bodyModel[346] = new ModelRendererTurbo(this, 82, 92, textureX, textureY); // Box 359
		bodyModel[347] = new ModelRendererTurbo(this, 91, 10, textureX, textureY); // Box 360
		bodyModel[348] = new ModelRendererTurbo(this, 105, 3, textureX, textureY); // Box 361
		bodyModel[349] = new ModelRendererTurbo(this, 82, 80, textureX, textureY); // Box 362
		bodyModel[350] = new ModelRendererTurbo(this, 88, 3, textureX, textureY); // Box 363
		bodyModel[351] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 352
		bodyModel[352] = new ModelRendererTurbo(this, 213, 191, textureX, textureY); // Box 277
		bodyModel[353] = new ModelRendererTurbo(this, 213, 201, textureX, textureY); // Box 460
		bodyModel[354] = new ModelRendererTurbo(this, 205, 191, textureX, textureY); // Box 274
		bodyModel[355] = new ModelRendererTurbo(this, 205, 200, textureX, textureY); // Box 275
		bodyModel[356] = new ModelRendererTurbo(this, 213, 179, textureX, textureY); // Box 300
		bodyModel[357] = new ModelRendererTurbo(this, 234, 179, textureX, textureY); // Box 299
		bodyModel[358] = new ModelRendererTurbo(this, 213, 185, textureX, textureY); // Box 298
		bodyModel[359] = new ModelRendererTurbo(this, 234, 185, textureX, textureY); // Box 297
		bodyModel[360] = new ModelRendererTurbo(this, 189, 201, textureX, textureY); // Box 272
		bodyModel[361] = new ModelRendererTurbo(this, 242, 193, textureX, textureY); // Box 271
		bodyModel[362] = new ModelRendererTurbo(this, 310, 163, textureX, textureY); // Box 363
		bodyModel[363] = new ModelRendererTurbo(this, 310, 133, textureX, textureY); // Box 364
		bodyModel[364] = new ModelRendererTurbo(this, 176, 23, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[365] = new ModelRendererTurbo(this, 184, 23, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[366] = new ModelRendererTurbo(this, 183, 28, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[367] = new ModelRendererTurbo(this, 183, 33, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[368] = new ModelRendererTurbo(this, 1, 63, textureX, textureY); // Box 402
		bodyModel[369] = new ModelRendererTurbo(this, 115, 54, textureX, textureY); // Box 385
		bodyModel[370] = new ModelRendererTurbo(this, 120, 54, textureX, textureY); // Box 386
		bodyModel[371] = new ModelRendererTurbo(this, 223, 18, textureX, textureY, "lamp"); // Box alt numb headlight r
		bodyModel[372] = new ModelRendererTurbo(this, 216, 18, textureX, textureY, "lamp"); // Box alt numb headlight l
		bodyModel[373] = new ModelRendererTurbo(this, 200, 11, textureX, textureY); // Box 317
		bodyModel[374] = new ModelRendererTurbo(this, 196, 9, textureX, textureY, "lamp"); // Box 316 lamp sp front gyralight
		bodyModel[375] = new ModelRendererTurbo(this, 218, 41, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[376] = new ModelRendererTurbo(this, 210, 44, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[377] = new ModelRendererTurbo(this, 202, 41, textureX, textureY, "lamp"); // Box 392  numb bord glow
		bodyModel[378] = new ModelRendererTurbo(this, 194, 44, textureX, textureY, "lamp"); // Box 393 numb bord glow
		bodyModel[379] = new ModelRendererTurbo(this, 186, 41, textureX, textureY); // Box 390
		bodyModel[380] = new ModelRendererTurbo(this, 178, 44, textureX, textureY); // Box 391
		bodyModel[381] = new ModelRendererTurbo(this, 95, 37, textureX, textureY); // Box 394
		bodyModel[382] = new ModelRendererTurbo(this, 95, 45, textureX, textureY); // Box 395
		bodyModel[383] = new ModelRendererTurbo(this, 392, 210, textureX, textureY); // Box 148
		bodyModel[384] = new ModelRendererTurbo(this, 399, 205, textureX, textureY); // Box 149
		bodyModel[385] = new ModelRendererTurbo(this, 416, 205, textureX, textureY); // Box 150
		bodyModel[386] = new ModelRendererTurbo(this, 356, 217, textureX, textureY); // Box 293
		bodyModel[387] = new ModelRendererTurbo(this, 426, 186, textureX, textureY); // Box 298
		bodyModel[388] = new ModelRendererTurbo(this, 370, 209, textureX, textureY); // Box 342
		bodyModel[389] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 349
		bodyModel[390] = new ModelRendererTurbo(this, 368, 225, textureX, textureY); // Box 350
		bodyModel[391] = new ModelRendererTurbo(this, 380, 184, textureX, textureY); // Box 283
		bodyModel[392] = new ModelRendererTurbo(this, 335, 184, textureX, textureY); // Box 284
		bodyModel[393] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 362
		bodyModel[394] = new ModelRendererTurbo(this, 347, 209, textureX, textureY); // Box 364
		bodyModel[395] = new ModelRendererTurbo(this, 384, 225, textureX, textureY); // Box 365
		bodyModel[396] = new ModelRendererTurbo(this, 379, 217, textureX, textureY); // Box 366
		bodyModel[397] = new ModelRendererTurbo(this, 434, 214, textureX, textureY); // Box 369
		bodyModel[398] = new ModelRendererTurbo(this, 434, 205, textureX, textureY); // Box 370
		bodyModel[399] = new ModelRendererTurbo(this, 440, 223, textureX, textureY); // Box 371
		bodyModel[400] = new ModelRendererTurbo(this, 358, 225, textureX, textureY); // Box 277
		bodyModel[401] = new ModelRendererTurbo(this, 425, 184, textureX, textureY); // Box 278
		bodyModel[402] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 279
		bodyModel[403] = new ModelRendererTurbo(this, 358, 229, textureX, textureY); // Box 291
		bodyModel[404] = new ModelRendererTurbo(this, 190, 35, textureX, textureY); // Box 486
		bodyModel[405] = new ModelRendererTurbo(this, 191, 32, textureX, textureY); // Box 487
		bodyModel[406] = new ModelRendererTurbo(this, 176, 36, textureX, textureY); // Box 488
		bodyModel[407] = new ModelRendererTurbo(this, 173, 30, textureX, textureY); // Box 489
		bodyModel[408] = new ModelRendererTurbo(this, 199, 29, textureX, textureY); // Box 241
		bodyModel[409] = new ModelRendererTurbo(this, 208, 24, textureX, textureY); // Box 242
		bodyModel[410] = new ModelRendererTurbo(this, 176, 33, textureX, textureY); // Box 243
		bodyModel[411] = new ModelRendererTurbo(this, 190, 24, textureX, textureY); // Box 244
		bodyModel[412] = new ModelRendererTurbo(this, 208, 27, textureX, textureY); // Box 279
		bodyModel[413] = new ModelRendererTurbo(this, 178, 30, textureX, textureY); // Box 280
		bodyModel[414] = new ModelRendererTurbo(this, 192, 29, textureX, textureY); // Box 281
		bodyModel[415] = new ModelRendererTurbo(this, 208, 30, textureX, textureY); // Box 282
		bodyModel[416] = new ModelRendererTurbo(this, 201, 32, textureX, textureY, BoxName.commander); // Box 346 commander beacon
		bodyModel[417] = new ModelRendererTurbo(this, 199, 36, textureX, textureY); // Box 347
		bodyModel[418] = new ModelRendererTurbo(this, 208, 17, textureX, textureY, BoxName.commander); // Box 346 commander beacon
		bodyModel[419] = new ModelRendererTurbo(this, 208, 21, textureX, textureY); // Box 347
		bodyModel[420] = new ModelRendererTurbo(this, 208, 33, textureX, textureY); // Box 292
		bodyModel[421] = new ModelRendererTurbo(this, 207, 36, textureX, textureY); // Box 293
		bodyModel[422] = new ModelRendererTurbo(this, 211, 36, textureX, textureY); // Box 294
		bodyModel[423] = new ModelRendererTurbo(this, 212, 41, textureX, textureY); // Box 295
		bodyModel[424] = new ModelRendererTurbo(this, 212, 15, textureX, textureY); // Box 287
		bodyModel[425] = new ModelRendererTurbo(this, 209, 14, textureX, textureY); // Box 298
		bodyModel[426] = new ModelRendererTurbo(this, 211, 11, textureX, textureY); // Box 327
		bodyModel[427] = new ModelRendererTurbo(this, 206, 10, textureX, textureY, BoxName.commander); // Box 328 commander beacon
		bodyModel[428] = new ModelRendererTurbo(this, 274, 130, textureX, textureY); // Box 3 cull
		bodyModel[429] = new ModelRendererTurbo(this, 379, 121, textureX, textureY); // Box 5
		bodyModel[430] = new ModelRendererTurbo(this, 213, 7, textureX, textureY); // Box 323
		bodyModel[431] = new ModelRendererTurbo(this, 220, 24, textureX, textureY); // Box 364 prime base
		bodyModel[432] = new ModelRendererTurbo(this, 220, 28, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[433] = new ModelRendererTurbo(this, 220, 28, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[434] = new ModelRendererTurbo(this, 220, 28, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[435] = new ModelRendererTurbo(this, 220, 28, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[436] = new ModelRendererTurbo(this, 225, 4, textureX, textureY); // Box 356 support cull
		bodyModel[437] = new ModelRendererTurbo(this, 178, 2, textureX, textureY); // Box 380
		bodyModel[438] = new ModelRendererTurbo(this, 189, 11, textureX, textureY); // Box 381
		bodyModel[439] = new ModelRendererTurbo(this, 182, 9, textureX, textureY); // Box 382
		bodyModel[440] = new ModelRendererTurbo(this, 220, 32, textureX, textureY); // Box 364 prime base
		bodyModel[441] = new ModelRendererTurbo(this, 220, 36, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[442] = new ModelRendererTurbo(this, 220, 36, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[443] = new ModelRendererTurbo(this, 220, 36, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[444] = new ModelRendererTurbo(this, 220, 36, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[445] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 344 cull
		bodyModel[446] = new ModelRendererTurbo(this, 220, 9, textureX, textureY); // Box 114
		bodyModel[447] = new ModelRendererTurbo(this, 220, 3, textureX, textureY); // Box 74
		bodyModel[448] = new ModelRendererTurbo(this, 220, 6, textureX, textureY); // Box 78
		bodyModel[449] = new ModelRendererTurbo(this, 208, 5, textureX, textureY); // Box 875
		bodyModel[450] = new ModelRendererTurbo(this, 208, 7, textureX, textureY); // Box 876
		bodyModel[451] = new ModelRendererTurbo(this, 199, 4, textureX, textureY); // Box 877
		bodyModel[452] = new ModelRendererTurbo(this, 212, 4, textureX, textureY); // Box 481
		bodyModel[453] = new ModelRendererTurbo(this, 357, 234, textureX, textureY); // Box 464
		bodyModel[454] = new ModelRendererTurbo(this, 380, 234, textureX, textureY); // Box 465
		bodyModel[455] = new ModelRendererTurbo(this, 191, 20, textureX, textureY); // Box 521 prr shiot
		bodyModel[456] = new ModelRendererTurbo(this, 198, 21, textureX, textureY); // Box 522 pee are are
		bodyModel[457] = new ModelRendererTurbo(this, 120, 49, textureX, textureY, "lamp"); // Box 362 markerlight glow
		bodyModel[458] = new ModelRendererTurbo(this, 120, 46, textureX, textureY, "lamp"); // Box 363 markerlight glow
		bodyModel[459] = new ModelRendererTurbo(this, 230, 20, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[460] = new ModelRendererTurbo(this, 230, 20, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[461] = new ModelRendererTurbo(this, 230, 20, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[462] = new ModelRendererTurbo(this, 230, 20, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[463] = new ModelRendererTurbo(this, 230, 24, textureX, textureY); // Box 463
		bodyModel[464] = new ModelRendererTurbo(this, 263, 2, textureX, textureY); // Box 184 ac front cab
		bodyModel[465] = new ModelRendererTurbo(this, 236, 2, textureX, textureY); // AC rear cab
		bodyModel[466] = new ModelRendererTurbo(this, 255, 21, textureX, textureY); // Box 327
		bodyModel[467] = new ModelRendererTurbo(this, 239, 21, textureX, textureY); // Box 328
		bodyModel[468] = new ModelRendererTurbo(this, 246, 25, textureX, textureY); // Box 329
		bodyModel[469] = new ModelRendererTurbo(this, 266, 21, textureX, textureY); // Box 330
		bodyModel[470] = new ModelRendererTurbo(this, 248, 21, textureX, textureY); // Box 331
		bodyModel[471] = new ModelRendererTurbo(this, 239, 25, textureX, textureY); // Box 332
		bodyModel[472] = new ModelRendererTurbo(this, 110, 46, textureX, textureY); // Box 474
		bodyModel[473] = new ModelRendererTurbo(this, 110, 49, textureX, textureY); // Box 475
		bodyModel[474] = new ModelRendererTurbo(this, 115, 46, textureX, textureY, "lamp"); // Box 362 markerlight glow
		bodyModel[475] = new ModelRendererTurbo(this, 115, 49, textureX, textureY, "lamp"); // Box 362 markerlight glow
		bodyModel[476] = new ModelRendererTurbo(this, 230, 28, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[477] = new ModelRendererTurbo(this, 230, 28, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[478] = new ModelRendererTurbo(this, 230, 28, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[479] = new ModelRendererTurbo(this, 230, 32, textureX, textureY); // Box 481
		bodyModel[480] = new ModelRendererTurbo(this, 230, 28, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[481] = new ModelRendererTurbo(this, 266, 33, textureX, textureY); // Box 240
		bodyModel[482] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 241
		bodyModel[483] = new ModelRendererTurbo(this, 248, 33, textureX, textureY); // Box 242
		bodyModel[484] = new ModelRendererTurbo(this, 239, 31, textureX, textureY); // Box 243
		bodyModel[485] = new ModelRendererTurbo(this, 248, 31, textureX, textureY); // Box 372
		bodyModel[486] = new ModelRendererTurbo(this, 15, 50, textureX, textureY); // Box 488
		bodyModel[487] = new ModelRendererTurbo(this, 182, 15, textureX, textureY); // Box 489
		bodyModel[488] = new ModelRendererTurbo(this, 203, 21, textureX, textureY); // Box 490
		bodyModel[489] = new ModelRendererTurbo(this, 237, 141, textureX, textureY); // Box 94
		bodyModel[490] = new ModelRendererTurbo(this, 366, 3, textureX, textureY); // Box 493
		bodyModel[491] = new ModelRendererTurbo(this, 273, 141, textureX, textureY); // Box 497
		bodyModel[492] = new ModelRendererTurbo(this, 347, 3, textureX, textureY); // Box 498
		bodyModel[493] = new ModelRendererTurbo(this, 198, 18, textureX, textureY); // Box 499
		bodyModel[494] = new ModelRendererTurbo(this, 200, 25, textureX, textureY); // Box 500
		bodyModel[495] = new ModelRendererTurbo(this, 267, 26, textureX, textureY); // Box 501
		bodyModel[496] = new ModelRendererTurbo(this, 254, 25, textureX, textureY); // Box 502
		bodyModel[497] = new ModelRendererTurbo(this, 262, 26, textureX, textureY); // Box 503
		bodyModel[498] = new ModelRendererTurbo(this, 105, 47, textureX, textureY, "lamp"); // Box 362 markerlight glow
		bodyModel[499] = new ModelRendererTurbo(this, 105, 44, textureX, textureY, "lamp"); // Box 362 markerlight glow

		bodyModel[0].addBox(0F, 0F, 0F, 0, 5, 20, 0F); // Box 6
		bodyModel[0].setRotationPoint(-47.01F, 2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 28
		bodyModel[1].setRotationPoint(-47.01F, 7F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 10, 7, 16, 0F); // Box 2
		bodyModel[2].setRotationPoint(-16F, 2F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 10, 4, 3, 0F); // Box 10
		bodyModel[3].setRotationPoint(-16F, 2F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[4].setRotationPoint(-16F, 6F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 158
		bodyModel[5].setRotationPoint(-16F, 6F, 8F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 4, 3, 0F); // Box 159
		bodyModel[6].setRotationPoint(-16F, 2F, 8F);

		bodyModel[7].addBox(0F, 0F, 0F, 90, 2, 4, 0F); // Box 0
		bodyModel[7].setRotationPoint(-44F, -1F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 96, 2, 14, 0F); // Box 14
		bodyModel[8].setRotationPoint(-47F, -1F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 90, 2, 4, 0F); // Box 15
		bodyModel[9].setRotationPoint(-44F, -1F, 7F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[10].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-47F, 2F, -3F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 23
		bodyModel[12].setRotationPoint(50F, 3F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(49F, 2.5F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(44F, 2F, -3F);

		bodyModel[15].addBox(0F, 0F, 0F, 96, 2, 10, 0F); // Box 18
		bodyModel[15].setRotationPoint(-47F, 1F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[16].setRotationPoint(-5.5F, 6F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 21, 2, 3, 0F); // Box 149
		bodyModel[17].setRotationPoint(-5.5F, 2F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 21, 7, 16, 0F); // Box 150
		bodyModel[18].setRotationPoint(-5.5F, 2F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 6, 4, 0F); // Box 153
		bodyModel[19].setRotationPoint(-44.01F, 1F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[20].setRotationPoint(-44.01F, 1F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[21].setRotationPoint(-44.01F, 6F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Box 156
		bodyModel[22].setRotationPoint(-44.01F, 7F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[23].setRotationPoint(-47.01F, 6F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[24].setRotationPoint(-47.01F, 0F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[25].setRotationPoint(-47.01F, 0F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[26].setRotationPoint(-47.01F, -1F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 10
		bodyModel[27].setRotationPoint(-47F, 7.5F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 12
		bodyModel[28].setRotationPoint(-47F, 4.5F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 13
		bodyModel[29].setRotationPoint(-47F, 1.5F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 138
		bodyModel[30].setRotationPoint(-47F, 4.5F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 139
		bodyModel[31].setRotationPoint(-47F, 1.5F, -8F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 166
		bodyModel[32].setRotationPoint(-47F, -1F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[33].setRotationPoint(-45F, -1F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 170
		bodyModel[34].setRotationPoint(-47.01F, 8F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		bodyModel[35].setRotationPoint(-47.01F, 9F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 172
		bodyModel[36].setRotationPoint(-47.01F, 8F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 173
		bodyModel[37].setRotationPoint(-44.01F, 8F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 6, 4, 0F); // Box 174
		bodyModel[38].setRotationPoint(-44.01F, 1F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 175
		bodyModel[39].setRotationPoint(-44.01F, 1F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[40].setRotationPoint(-44.01F, 6F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Box 177
		bodyModel[41].setRotationPoint(-44.01F, 7F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[42].setRotationPoint(-47.01F, 6F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[43].setRotationPoint(-47.01F, 0F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 180
		bodyModel[44].setRotationPoint(-47F, 7.5F, 9F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 181
		bodyModel[45].setRotationPoint(-47F, 4.5F, 8F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 182
		bodyModel[46].setRotationPoint(-47F, 1.5F, 7F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 183
		bodyModel[47].setRotationPoint(-47F, 4.5F, 9F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 184
		bodyModel[48].setRotationPoint(-47F, 1.5F, 8F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 185
		bodyModel[49].setRotationPoint(-47F, -1F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 186
		bodyModel[50].setRotationPoint(-45F, -1F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 187
		bodyModel[51].setRotationPoint(-47.01F, 8F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 189
		bodyModel[52].setRotationPoint(-44.01F, 8F, 9F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 6, 4, 0F); // Box 190
		bodyModel[53].setRotationPoint(46F, 1F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[54].setRotationPoint(46F, 1F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[55].setRotationPoint(46F, 6F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Box 193
		bodyModel[56].setRotationPoint(46F, 7F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[57].setRotationPoint(46F, 8F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 195
		bodyModel[58].setRotationPoint(46F, 8F, 9F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Box 196
		bodyModel[59].setRotationPoint(46F, 7F, 6F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 6, 4, 0F); // Box 197
		bodyModel[60].setRotationPoint(46F, 1F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[61].setRotationPoint(46F, 6F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 199
		bodyModel[62].setRotationPoint(46F, 1F, 10F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 5, 20, 0F); // Box 200
		bodyModel[63].setRotationPoint(49.01F, 2F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[64].setRotationPoint(49.01F, 0F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[65].setRotationPoint(49.01F, -1F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[66].setRotationPoint(49.01F, 0F, 9F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 204
		bodyModel[67].setRotationPoint(49.01F, 7F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[68].setRotationPoint(49.01F, 6F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 206
		bodyModel[69].setRotationPoint(49.01F, 8F, 10F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 207
		bodyModel[70].setRotationPoint(49.01F, 8F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 208
		bodyModel[71].setRotationPoint(49.01F, 9F, -8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209
		bodyModel[72].setRotationPoint(49.01F, 8F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[73].setRotationPoint(49.01F, 6F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 211
		bodyModel[74].setRotationPoint(46F, 7.5F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 212
		bodyModel[75].setRotationPoint(46F, 4.5F, -9F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 213
		bodyModel[76].setRotationPoint(46F, 4.5F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 214
		bodyModel[77].setRotationPoint(46F, 1.5F, -9F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 215
		bodyModel[78].setRotationPoint(46F, -1F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[79].setRotationPoint(46F, -1F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 217
		bodyModel[80].setRotationPoint(46F, -1F, 8F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 218
		bodyModel[81].setRotationPoint(46F, -1F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 219
		bodyModel[82].setRotationPoint(46F, 1.5F, 7F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 220
		bodyModel[83].setRotationPoint(46F, 1.5F, 8F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 221
		bodyModel[84].setRotationPoint(46F, 4.5F, 8F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 222
		bodyModel[85].setRotationPoint(46F, 4.5F, 9F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 223
		bodyModel[86].setRotationPoint(46F, 7.5F, 9F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 14, 14, 0F); // Box 490
		bodyModel[87].setRotationPoint(42F, -15F, -7F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 502
		bodyModel[88].setRotationPoint(-44F, -22F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[89].setRotationPoint(42F, -21F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 14, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 504
		bodyModel[90].setRotationPoint(45F, -15F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 155
		bodyModel[91].setRotationPoint(-42F, -22F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[92].setRotationPoint(42F, -21F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 157
		bodyModel[93].setRotationPoint(-42F, -22F, 2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[94].setRotationPoint(43F, -18F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 161
		bodyModel[95].setRotationPoint(42F, -18F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 53, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[96].setRotationPoint(-11F, -22F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[97].setRotationPoint(43F, -18F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.8F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[98].setRotationPoint(42F, -18F, 6F);

		bodyModel[99].addBox(0F, 0F, 0F, 53, 20, 14, 0F); // Box 2
		bodyModel[99].setRotationPoint(-11F, -21F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[100].setRotationPoint(-11F, -22F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[101].setRotationPoint(-11F, -22F, 2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[102].setRotationPoint(-24F, -21F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[103].setRotationPoint(-25F, -20F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[104].setRotationPoint(-25F, -23F, 3F);

		bodyModel[105].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 135
		bodyModel[105].setRotationPoint(-25F, -23F, -3F);

		bodyModel[106].addBox(-0.5F, -2F, -0.5F, 1, 2, 3, 0F); // Box 194
		bodyModel[106].setRotationPoint(-11.5F, -18F, 7.5F);

		bodyModel[107].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 195
		bodyModel[107].setRotationPoint(-11.5F, -18F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[108].setRotationPoint(-25F, -20F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // Box 29
		bodyModel[109].setRotationPoint(-24F, -18F, -11F);

		bodyModel[110].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[110].setRotationPoint(-24.5F, -18F, -7.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // Box 32
		bodyModel[111].setRotationPoint(-24F, -18F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 405
		bodyModel[112].setRotationPoint(-25F, -18F, -7F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 406
		bodyModel[113].setRotationPoint(-12F, -18F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[114].setRotationPoint(-25F, -21F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[115].setRotationPoint(-12F, -21F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[116].setRotationPoint(-25F, -21F, 8F);

		bodyModel[117].addBox(-0.5F, -2F, -2.5F, 1, 2, 3, 0F); // Box 428
		bodyModel[117].setRotationPoint(-24.5F, -18F, -7.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 57
		bodyModel[118].setRotationPoint(-25F, -20F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[119].setRotationPoint(-25F, -23F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[120].setRotationPoint(-24F, -21F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
		bodyModel[121].setRotationPoint(-25F, -22F, -8F);

		bodyModel[122].addBox(0F, 0F, 0F, 14, 5, 22, 0F); // Box 95
		bodyModel[122].setRotationPoint(-25F, -6F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 276
		bodyModel[123].setRotationPoint(-44F, -18F, 6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[124].setRotationPoint(-44F, -18F, 2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 278
		bodyModel[125].setRotationPoint(-44F, -21F, 2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[126].setRotationPoint(-44F, -21F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -3F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[127].setRotationPoint(-44F, -18F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[128].setRotationPoint(-44F, -18F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 285
		bodyModel[129].setRotationPoint(-44F, -15F, -6F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 6, 14, 0F); // Box 286
		bodyModel[130].setRotationPoint(-43F, -15F, -7F);

		bodyModel[131].addBox(0F, 0F, 0F, 15, 12, 14, 0F); // Box 287
		bodyModel[131].setRotationPoint(-40F, -21F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 561
		bodyModel[132].setRotationPoint(-5F, 1F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[133].setRotationPoint(-5F, 5F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[134].setRotationPoint(-25F, -22F, 3F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 294
		bodyModel[135].setRotationPoint(-25F, -22F, -3F);

		bodyModel[136].addBox(-0.5F, -2F, 0.5F, 1, 2, 3, 0F); // Box 295
		bodyModel[136].setRotationPoint(-11.5F, -18F, -10.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 296
		bodyModel[137].setRotationPoint(-12F, -20F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[138].setRotationPoint(-12F, -21F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[139].setRotationPoint(-12F, -22F, 3F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 299
		bodyModel[140].setRotationPoint(-12F, -22F, -3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[141].setRotationPoint(-12F, -22F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[142].setRotationPoint(-40F, -22F, 2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[143].setRotationPoint(-40F, -22F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[144].setRotationPoint(-40F, -22F, -7F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 304
		bodyModel[145].setRotationPoint(-43F, -14F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 305
		bodyModel[146].setRotationPoint(-42F, -14F, -7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[147].setRotationPoint(-44F, -13F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -3F, 0F, 0.2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[148].setRotationPoint(-44F, -12F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[149].setRotationPoint(-44F, -12F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[150].setRotationPoint(-44F, -12F, 2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 310
		bodyModel[151].setRotationPoint(-44F, -12F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 311
		bodyModel[152].setRotationPoint(-44F, -13F, 2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 312
		bodyModel[153].setRotationPoint(-42F, -14F, 2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[154].setRotationPoint(-40F, -14F, 2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[155].setRotationPoint(-40F, -14F, -2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[156].setRotationPoint(-40F, -14F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[157].setRotationPoint(-44F, -9F, -6F);

		bodyModel[158].addBox(0F, 0F, 0F, 18, 8, 14, 0F); // Box 318
		bodyModel[158].setRotationPoint(-43F, -9F, -7F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 319
		bodyModel[159].setRotationPoint(42F, -22F, -2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[160].setRotationPoint(42F, -22F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[161].setRotationPoint(42F, -22F, 2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 344
		bodyModel[162].setRotationPoint(-26F, -21F, -7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 345
		bodyModel[163].setRotationPoint(-27F, -23F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 346
		bodyModel[164].setRotationPoint(-26F, -21F, 1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-2F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F); // Box 347
		bodyModel[165].setRotationPoint(-27F, -23F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[166].setRotationPoint(-27F, -23F, -3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.65F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -2F, -1.2F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 349
		bodyModel[167].setRotationPoint(-27F, -23F, 3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F); // Box 350
		bodyModel[168].setRotationPoint(-27F, -23F, 1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[169].setRotationPoint(-28F, -23F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[170].setRotationPoint(-28F, -23F, -3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 353
		bodyModel[171].setRotationPoint(-27F, -21F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-2F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 354
		bodyModel[172].setRotationPoint(-27F, -23F, -7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 356
		bodyModel[173].setRotationPoint(-27F, -21F, 2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 358
		bodyModel[174].setRotationPoint(-28F, -23F, 2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -2F, -1.2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 359
		bodyModel[175].setRotationPoint(-27F, -23F, 3F);

		bodyModel[176].addBox(0F, 0F, 0F, 8, 5, 22, 0F); // Box 360
		bodyModel[176].setRotationPoint(-33F, -6F, -11F);

		bodyModel[177].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 361
		bodyModel[177].setRotationPoint(-40F, -6F, 7F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 362
		bodyModel[178].setRotationPoint(-11F, -6F, 7F);

		bodyModel[179].addBox(0F, 0F, 0F, 15, 4, 14, 0F); // Box 363
		bodyModel[179].setRotationPoint(-40F, -13F, -7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 159
		bodyModel[180].setRotationPoint(31.5F, -22.5F, -7F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 160
		bodyModel[181].setRotationPoint(27.5F, -22.5F, -3F);

		bodyModel[182].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 161
		bodyModel[182].setRotationPoint(37.5F, -22.5F, -3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 162
		bodyModel[183].setRotationPoint(27.5F, -22.5F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 14, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[184].setRotationPoint(27.5F, -22.55F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F); // Box 372
		bodyModel[185].setRotationPoint(27.5F, -22.5F, 3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, 0F); // Box 373
		bodyModel[186].setRotationPoint(37.5F, -22.5F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 374
		bodyModel[187].setRotationPoint(37.5F, -22.5F, -7F);

		bodyModel[188].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 233
		bodyModel[188].setRotationPoint(20F, -22.5F, -2F);

		bodyModel[189].addBox(0F, 0F, -3F, 5, 1, 3, 0F); // Box 234
		bodyModel[189].setRotationPoint(20F, -22.5F, -2F);
		bodyModel[189].rotateAngleX = 0.19198622F;

		bodyModel[190].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 235
		bodyModel[190].setRotationPoint(20F, -22.5F, 2F);
		bodyModel[190].rotateAngleX = -0.19198622F;

		bodyModel[191].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // exhaust
		bodyModel[191].setRotationPoint(20.5F, -23F, -2F);

		bodyModel[192].addBox(0F, 0F, 0F, 20, 2, 10, 0F); // Box 379
		bodyModel[192].setRotationPoint(-2.5F, -22.5F, -5F);

		bodyModel[193].addBox(0F, 0F, 0F, 14, 1, 9, 0F); // Box 380
		bodyModel[193].setRotationPoint(0.5F, -23F, -4.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 0, 5, 0F,0F, 0F, 0F, -0.6F, 0F, -4.2F, -0.6F, 0F, 0.25F, -1.9F, 0F, 0.25F, 0F, 0F, 0F, -0.6F, 0F, -4.2F, -0.6F, 0F, 0.25F, -1.9F, 0F, 0.25F); // Box 381
		bodyModel[194].setRotationPoint(-27.4F, -23F, 3F);
		bodyModel[194].rotateAngleX = -0.28797933F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F); // Box 382
		bodyModel[195].setRotationPoint(-26F, -21.5F, 8F);

		bodyModel[196].addShapeBox(0F, 0F, -5F, 3, 0, 5, 0F,-1.9F, 0F, 0.25F, -0.6F, 0F, 0.25F, -0.6F, 0F, -4.2F, 0F, 0F, 0F, -1.9F, 0F, 0.25F, -0.6F, 0F, 0.25F, -0.6F, 0F, -4.2F, 0F, 0F, 0F); // Box 383
		bodyModel[196].setRotationPoint(-27.4F, -23F, -3F);
		bodyModel[196].rotateAngleX = 0.28797933F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 384
		bodyModel[197].setRotationPoint(-26F, -21.5F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 1F); // Box 385
		bodyModel[198].setRotationPoint(-26F, -20F, 10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 386
		bodyModel[199].setRotationPoint(-26F, -20F, -10F);

		bodyModel[200].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 387
		bodyModel[200].setRotationPoint(-44F, -9F, -11F);

		bodyModel[201].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 388
		bodyModel[201].setRotationPoint(-32F, -14F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[202].setRotationPoint(-36F, -9F, -11F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // Box 390
		bodyModel[203].setRotationPoint(-45F, -9F, -11F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 391
		bodyModel[204].setRotationPoint(-44F, 4F, -11F);

		bodyModel[205].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 393
		bodyModel[205].setRotationPoint(-39F, -14F, 11F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 396
		bodyModel[206].setRotationPoint(-44F, 4F, 10F);

		bodyModel[207].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 135
		bodyModel[207].setRotationPoint(-47F, -11F, -3F);

		bodyModel[208].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 135
		bodyModel[208].setRotationPoint(-47F, -11F, 2F);

		bodyModel[209].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 399
		bodyModel[209].setRotationPoint(-47F, -9F, -7F);

		bodyModel[210].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 400
		bodyModel[210].setRotationPoint(-47F, -9F, 3F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 401
		bodyModel[211].setRotationPoint(-47F, -11F, -2F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[212].setRotationPoint(-47F, -9F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 404
		bodyModel[213].setRotationPoint(-47F, -9F, 7F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 405
		bodyModel[214].setRotationPoint(-47F, -5F, -11F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 406
		bodyModel[215].setRotationPoint(-47F, -5F, 10F);

		bodyModel[216].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 407
		bodyModel[216].setRotationPoint(-11F, -6F, -11F);

		bodyModel[217].addBox(0F, 0F, 0F, 57, 8, 0, 0F); // Box 408
		bodyModel[217].setRotationPoint(-11F, -9F, -11F);

		bodyModel[218].addBox(0F, 0F, 0F, 50, 8, 0, 0F); // Box 409
		bodyModel[218].setRotationPoint(-4F, -9F, 11F);

		bodyModel[219].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 410
		bodyModel[219].setRotationPoint(-44F, -9F, 11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[220].setRotationPoint(-36F, -9F, 11F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // Box 412
		bodyModel[221].setRotationPoint(-45F, -9F, 11F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // Box 413
		bodyModel[222].setRotationPoint(46F, -9F, -11F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // Box 414
		bodyModel[223].setRotationPoint(46F, -9F, 11F);

		bodyModel[224].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 415
		bodyModel[224].setRotationPoint(49F, -11F, -3F);

		bodyModel[225].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 416
		bodyModel[225].setRotationPoint(49F, -11F, -2F);

		bodyModel[226].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 417
		bodyModel[226].setRotationPoint(49F, -11F, 2F);

		bodyModel[227].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 418
		bodyModel[227].setRotationPoint(49F, -9F, 3F);

		bodyModel[228].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 419
		bodyModel[228].setRotationPoint(49F, -9F, -7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 420
		bodyModel[229].setRotationPoint(49F, -9F, 7F);

		bodyModel[230].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 421
		bodyModel[230].setRotationPoint(49F, -5F, 10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[231].setRotationPoint(49F, -9F, -11F);

		bodyModel[232].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 423
		bodyModel[232].setRotationPoint(49F, -5F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 424
		bodyModel[233].setRotationPoint(-8F, -9F, 11F);

		bodyModel[234].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 426
		bodyModel[234].setRotationPoint(-11F, -14F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 427
		bodyModel[235].setRotationPoint(-4F, -9F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 428
		bodyModel[236].setRotationPoint(-11F, -6F, 7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[237].setRotationPoint(2F, -6F, 7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 430
		bodyModel[238].setRotationPoint(2F, -9F, 11F);

		bodyModel[239].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 431
		bodyModel[239].setRotationPoint(-11F, -14F, 11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[240].setRotationPoint(-4.5F, -5.5F, 7.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[241].setRotationPoint(-10.5F, -5F, 7.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[242].setRotationPoint(-48F, 8F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[243].setRotationPoint(-49.5F, 9F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[244].setRotationPoint(-49.5F, 9F, 3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[245].setRotationPoint(-48F, 8F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[246].setRotationPoint(-49.5F, 7.5F, -3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[247].setRotationPoint(-49.5F, 7.5F, 3F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[248].setRotationPoint(-49.5F, 7.5F, -3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[249].setRotationPoint(-48F, 2.5F, -2F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 368
		bodyModel[250].setRotationPoint(49.5F, 7.5F, -3F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 369
		bodyModel[251].setRotationPoint(49.5F, 7.5F, -3F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 370
		bodyModel[252].setRotationPoint(49.5F, 7.5F, 3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[253].setRotationPoint(49.5F, 9F, 3F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[254].setRotationPoint(49F, 8F, 3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[255].setRotationPoint(49.5F, 9F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[256].setRotationPoint(49F, 8F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 375
		bodyModel[257].setRotationPoint(-44F, -9F, 1F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 376
		bodyModel[258].setRotationPoint(-44F, -14F, -2F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 377
		bodyModel[259].setRotationPoint(-44F, -10F, -2F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 378
		bodyModel[260].setRotationPoint(-44F, -10F, 1F);

		bodyModel[261].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 379
		bodyModel[261].setRotationPoint(-44F, -10F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 92
		bodyModel[262].setRotationPoint(-32F, 1F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[263].setRotationPoint(-32F, 2F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[264].setRotationPoint(-42.5F, 1F, -9F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[265].setRotationPoint(-42.5F, 1F, 8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[266].setRotationPoint(-32F, 2F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[267].setRotationPoint(28F, 2F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[268].setRotationPoint(27F, 1F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[269].setRotationPoint(28F, 2F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 395
		bodyModel[270].setRotationPoint(-5.5F, 6F, 8F);

		bodyModel[271].addBox(0F, 0F, 0F, 21, 2, 3, 0F); // Box 396
		bodyModel[271].setRotationPoint(-5.5F, 2F, 8F);

		bodyModel[272].addBox(0F, 0F, 0F, 21, 2, 3, 0F); // Box 397
		bodyModel[272].setRotationPoint(-5.5F, 4F, 8F);

		bodyModel[273].addBox(0F, 0F, 0F, 21, 2, 3, 0F); // Box 398
		bodyModel[273].setRotationPoint(-5.5F, 4F, -11F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 399
		bodyModel[274].setRotationPoint(-5F, 1F, -11F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[275].setRotationPoint(-5F, 1.5F, 8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 0, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -6F, 0F, -7F, -6F); // Box 278
		bodyModel[276].setRotationPoint(-5.01F, 1F, 5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 0, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -6F, 0F, -7F, -6F); // Box 279
		bodyModel[277].setRotationPoint(15.01F, 1F, 5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[278].setRotationPoint(-2F, 1F, 11.1F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[279].setRotationPoint(11.5F, 1F, 11.1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 282
		bodyModel[280].setRotationPoint(-16.01F, 1F, 9.1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[281].setRotationPoint(-16.01F, 1F, -10.1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[282].setRotationPoint(-43F, -9F, 11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[283].setRotationPoint(-23.5F, -15F, 4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 197
		bodyModel[284].setRotationPoint(-24.5F, -13F, 7.25F);
		bodyModel[284].rotateAngleY = -0.78539816F;

		bodyModel[285].addShapeBox(-0.5F, 0F, -0.5F, 2, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F); // Box 197
		bodyModel[285].setRotationPoint(-23F, -14F, 7.25F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[286].setRotationPoint(-24.5F, -12F, 3.5F);

		bodyModel[287].addShapeBox(-1F, 0F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[287].setRotationPoint(-22.75F, -16F, 2.55F);
		bodyModel[287].rotateAngleY = -0.97738438F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[288].setRotationPoint(-21.5F, -14F, 1.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[289].setRotationPoint(-18.5F, -14F, 1.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[290].setRotationPoint(-18.5F, -14F, 2.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 197
		bodyModel[291].setRotationPoint(-23.5F, -14F, 2.5F);
		bodyModel[291].rotateAngleY = -0.78539816F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 303
		bodyModel[292].setRotationPoint(-22.5F, -15F, 8.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, -2F, -0.5F, 0F, 2F, -0.5F, 0F, -0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F); // Box 295
		bodyModel[293].setRotationPoint(-27F, -18.5F, -7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0.35F, 0F, 0F, -0.35F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 296
		bodyModel[294].setRotationPoint(-27F, -18.5F, 0F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[295].setRotationPoint(-43F, -14F, -7F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 298
		bodyModel[296].setRotationPoint(-43F, -13F, -7F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 299
		bodyModel[297].setRotationPoint(-43F, -13F, 2F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[298].setRotationPoint(-43F, -14F, 2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[299].setRotationPoint(-44F, -14F, -7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[300].setRotationPoint(-44F, -13F, -6F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 303
		bodyModel[301].setRotationPoint(-44F, -14F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 304
		bodyModel[302].setRotationPoint(-44F, -13F, 2F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, -1F, -0.5F, -0.5F, -1F, -0.5F, 3F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 280
		bodyModel[303].setRotationPoint(-51F, 4F, 2F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 281
		bodyModel[304].setRotationPoint(-51F, 6F, 0F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 282
		bodyModel[305].setRotationPoint(-52F, 7F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, -1.5F, -3.5F, 0F, -1.5F); // Box 332
		bodyModel[306].setRotationPoint(-53F, 8F, 0F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-1F, -2.5F, -1F, 0F, -2.5F, -1F, 3F, 0.5F, 0F, -4F, 0F, 0F, -1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 4F, -0.5F, 0F, -4.5F, -0.5F, 0F); // Box 339
		bodyModel[307].setRotationPoint(-52.5F, 0.5F, 2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.5F, -1F, -1F, 0F, -1F, -1F, 3.5F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 4F, -1F, 0F, -4.5F, -1F, 0F); // Box 317
		bodyModel[308].setRotationPoint(-52F, 2F, 2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 320
		bodyModel[309].setRotationPoint(-51F, 4F, -11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[310].setRotationPoint(-51F, 6F, -11F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, -0.5F, 3F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[311].setRotationPoint(-52F, 7F, -11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-4.5F, 0F, -0.5F, 4F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, -1.5F, 3F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[312].setRotationPoint(-53F, 8F, -11F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-4F, 0F, 0F, 3F, 0.5F, 0F, 0F, -2.5F, -1F, -1F, -2.5F, -1F, -4.5F, -0.5F, 0F, 4F, -0.5F, 0F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F); // Box 324
		bodyModel[313].setRotationPoint(-52.5F, 0.5F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-4F, 0F, 0F, 3.5F, 0F, 0F, 0F, -1F, -1F, -0.5F, -1F, -1F, -4.5F, -1F, 0F, 4F, -1F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 325
		bodyModel[314].setRotationPoint(-52F, 2F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[315].setRotationPoint(-50F, 6F, 0F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[316].setRotationPoint(-50F, 7F, 0F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[317].setRotationPoint(-50F, 6F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[318].setRotationPoint(-50F, 7F, -10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[319].setRotationPoint(-50.5F, 4F, -10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[320].setRotationPoint(-50F, 4F, 2F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[321].setRotationPoint(-50F, 5F, 2F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[322].setRotationPoint(-50F, 5F, -10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[323].setRotationPoint(49F, 7F, 0F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 169
		bodyModel[324].setRotationPoint(49F, 7F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 170
		bodyModel[325].setRotationPoint(49F, 8F, -10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 171
		bodyModel[326].setRotationPoint(49F, 8F, 0F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[327].setRotationPoint(49F, 6F, 2F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 245
		bodyModel[328].setRotationPoint(49F, 6F, -10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 246
		bodyModel[329].setRotationPoint(49.5F, 5F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[330].setRotationPoint(49F, 5F, 2F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 360
		bodyModel[331].setRotationPoint(-50.5F, 3F, -10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F); // Box 361
		bodyModel[332].setRotationPoint(-50.5F, 3F, 2F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F); // Box 362
		bodyModel[333].setRotationPoint(49.5F, 4F, 2F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 363
		bodyModel[334].setRotationPoint(49.5F, 4F, -10F);

		bodyModel[335].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // Box 346
		bodyModel[335].setRotationPoint(42F, -21F, -7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[336].setRotationPoint(45F, -21F, -6F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[337].setRotationPoint(42F, -22F, -7F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[338].setRotationPoint(45F, -22F, -7F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[339].setRotationPoint(42F, -22F, 2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 353
		bodyModel[340].setRotationPoint(45F, -22F, 2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 354
		bodyModel[341].setRotationPoint(45F, -21F, 2F);

		bodyModel[342].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // Box 355
		bodyModel[342].setRotationPoint(42F, -21F, 2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[343].setRotationPoint(-43F, -22F, 2F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 357
		bodyModel[344].setRotationPoint(-44F, -22F, 2F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 358
		bodyModel[345].setRotationPoint(-44F, -21F, 2F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // Box 359
		bodyModel[346].setRotationPoint(-43F, -21F, -2F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[347].setRotationPoint(-44F, -21F, -6F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[348].setRotationPoint(-44F, -22F, -7F);

		bodyModel[349].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // Box 362
		bodyModel[349].setRotationPoint(-43F, -21F, -7F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[350].setRotationPoint(-43F, -22F, -7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[351].setRotationPoint(23F, -22F, -7F);

		bodyModel[352].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 277
		bodyModel[352].setRotationPoint(24.5F, -23.25F, -3.5F);

		bodyModel[353].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 460
		bodyModel[353].setRotationPoint(33.5F, -23.25F, -3.5F);

		bodyModel[354].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 274
		bodyModel[354].setRotationPoint(0F, -23.5F, -2.5F);

		bodyModel[355].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 275
		bodyModel[355].setRotationPoint(13F, -23.5F, -2.5F);

		bodyModel[356].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 300
		bodyModel[356].setRotationPoint(23.25F, -21F, 6.25F);

		bodyModel[357].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 299
		bodyModel[357].setRotationPoint(32.75F, -21F, 6.25F);

		bodyModel[358].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 298
		bodyModel[358].setRotationPoint(23.25F, -21F, -7.25F);

		bodyModel[359].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 297
		bodyModel[359].setRotationPoint(32.75F, -21F, -7.25F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[360].setRotationPoint(-5F, -15F, -9F);

		bodyModel[361].addBox(0F, 0F, 0F, 8, 13, 2, 0F); // Box 271
		bodyModel[361].setRotationPoint(-5F, -14F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 0, 14, 12, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 363
		bodyModel[362].setRotationPoint(-5.01F, 1F, -17F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 0, 14, 12, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 364
		bodyModel[363].setRotationPoint(15.01F, 1F, -17F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[364].setRotationPoint(-27.5F, -22.5F, -1F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[365].setRotationPoint(-27.5F, -20.5F, -1F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[366].setRotationPoint(-45F, -14F, -2F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[367].setRotationPoint(-45F, -14F, 0F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[368].setRotationPoint(-42F, -14.5F, -1F);

		bodyModel[369].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 385
		bodyModel[369].setRotationPoint(-43F, -11.5F, -5.5F);
		bodyModel[369].rotateAngleY = 0.61086524F;
		bodyModel[369].rotateAngleZ = 0.83775804F;

		bodyModel[370].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 386
		bodyModel[370].setRotationPoint(-43F, -11.5F, 5.5F);
		bodyModel[370].rotateAngleY = -0.66322512F;
		bodyModel[370].rotateAngleZ = 0.83775804F;

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box alt numb headlight r
		bodyModel[371].setRotationPoint(-29F, -20.5F, -2F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box alt numb headlight l
		bodyModel[372].setRotationPoint(-29F, -20.5F, 0F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[373].setRotationPoint(-28.48F, -22.5F, -1.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp front gyralight
		bodyModel[374].setRotationPoint(-29.5F, -22.5F, -1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[375].setRotationPoint(-25.25F, -20.75F, -6.75F);
		bodyModel[375].rotateAngleY = 0.54105207F;

		bodyModel[376].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[376].setRotationPoint(-25.25F, -20.75F, 6.75F);
		bodyModel[376].rotateAngleY = -0.54105207F;

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 392  numb bord glow
		bodyModel[377].setRotationPoint(-25.2F, -20.75F, -6.75F);
		bodyModel[377].rotateAngleY = 0.31852259F;

		bodyModel[378].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 393 numb bord glow
		bodyModel[378].setRotationPoint(-25.2F, -20.75F, 6.75F);
		bodyModel[378].rotateAngleY = -0.31852259F;

		bodyModel[379].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[379].setRotationPoint(-40.6F, -20.05F, 6.5F);
		bodyModel[379].rotateAngleY = -0.68067841F;

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[380].setRotationPoint(-40.6F, -20.05F, -6.5F);
		bodyModel[380].rotateAngleY = 0.68067841F;

		bodyModel[381].addShapeBox(-0.5F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[381].setRotationPoint(42.5F, -20.05F, -6.5F);
		bodyModel[381].rotateAngleY = -0.68067841F;

		bodyModel[382].addShapeBox(-0.5F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[382].setRotationPoint(42.5F, -20.05F, 6.5F);
		bodyModel[382].rotateAngleY = 0.68067841F;

		bodyModel[383].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[383].setRotationPoint(46F, -22F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[384].setRotationPoint(46F, -22F, 1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[385].setRotationPoint(46F, -22F, -8F);

		bodyModel[386].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 293
		bodyModel[386].setRotationPoint(35F, -14F, -7.75F);

		bodyModel[387].addBox(0F, 0F, 0F, 21, 2, 16, 0F); // Box 298
		bodyModel[387].setRotationPoint(25F, -22F, -8F);

		bodyModel[388].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 342
		bodyModel[388].setRotationPoint(29.5F, -14F, -7.75F);

		bodyModel[389].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 349
		bodyModel[389].setRotationPoint(26F, -7.5F, 6.75F);

		bodyModel[390].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 350
		bodyModel[390].setRotationPoint(26F, -7.5F, -7.75F);

		bodyModel[391].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 283
		bodyModel[391].setRotationPoint(25F, -20F, -7.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 284
		bodyModel[392].setRotationPoint(25F, -20F, 6.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 362
		bodyModel[393].setRotationPoint(32F, -14F, -7.75F);

		bodyModel[394].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 364
		bodyModel[394].setRotationPoint(35F, -14F, 6.75F);

		bodyModel[395].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 365
		bodyModel[395].setRotationPoint(32F, -14F, 6.75F);

		bodyModel[396].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 366
		bodyModel[396].setRotationPoint(29.5F, -14F, 6.75F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[397].setRotationPoint(25F, -23F, 1F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[398].setRotationPoint(25F, -23F, -8F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[399].setRotationPoint(25F, -23F, -1F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[400].setRotationPoint(45F, -23F, -1F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[401].setRotationPoint(46F, -23F, -8F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[402].setRotationPoint(46F, -23F, 1F);

		bodyModel[403].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[403].setRotationPoint(46F, -23.25F, 0F);

		bodyModel[404].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[404].setRotationPoint(-26F, -24.5F, 1F);

		bodyModel[405].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 487
		bodyModel[405].setRotationPoint(-26.5F, -24.5F, 3F);

		bodyModel[406].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 488
		bodyModel[406].setRotationPoint(-25F, -25F, 2F);

		bodyModel[407].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 489
		bodyModel[407].setRotationPoint(-25F, -24F, 2F);

		bodyModel[408].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 241
		bodyModel[408].setRotationPoint(-25.5F, -22F, -10F);

		bodyModel[409].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 242
		bodyModel[409].setRotationPoint(-26.5F, -23F, -8F);

		bodyModel[410].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 243
		bodyModel[410].setRotationPoint(-25.5F, -22.5F, -9F);

		bodyModel[411].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 244
		bodyModel[411].setRotationPoint(-24.5F, -21F, -10F);
		bodyModel[411].rotateAngleX = 0.48869219F;

		bodyModel[412].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[412].setRotationPoint(-26.5F, -25F, -3F);

		bodyModel[413].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 280
		bodyModel[413].setRotationPoint(-25.5F, -24F, -3F);

		bodyModel[414].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 281
		bodyModel[414].setRotationPoint(-25.5F, -24.5F, -4F);

		bodyModel[415].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 282
		bodyModel[415].setRotationPoint(-26.5F, -24.5F, -2F);

		bodyModel[416].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 346 commander beacon
		bodyModel[416].setRotationPoint(-25.5F, -24F, 0.5F);

		bodyModel[417].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 347
		bodyModel[417].setRotationPoint(-25.35F, -24F, 0.5F);

		bodyModel[418].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 346 commander beacon
		bodyModel[418].setRotationPoint(-20.5F, -24F, 0.5F);

		bodyModel[419].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 347
		bodyModel[419].setRotationPoint(-20.35F, -24F, 0.5F);

		bodyModel[420].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 292
		bodyModel[420].setRotationPoint(-26.5F, -23F, 7F);

		bodyModel[421].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 293
		bodyModel[421].setRotationPoint(-24.5F, -22.5F, 8F);

		bodyModel[422].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 294
		bodyModel[422].setRotationPoint(-24.5F, -21F, 10F);
		bodyModel[422].rotateAngleX = -0.48869219F;

		bodyModel[423].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[423].setRotationPoint(-26.5F, -22F, 9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[424].setRotationPoint(-19F, -23F, 6F);

		bodyModel[425].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 298
		bodyModel[425].setRotationPoint(-18F, -25F, 0F);

		bodyModel[426].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 327
		bodyModel[426].setRotationPoint(-15.34F, -24F, 0.5F);

		bodyModel[427].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 328 commander beacon
		bodyModel[427].setRotationPoint(-15.5F, -24F, 0.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[428].setRotationPoint(-21F, -18F, 10F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[429].setRotationPoint(-21F, -19F, 10F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[430].setRotationPoint(-22F, -24F, 0F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[431].setRotationPoint(-15.5F, -23F, 7F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[432].setRotationPoint(-15.5F, -23.5F, 7F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[433].setRotationPoint(-15.5F, -23.5F, 7F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[434].setRotationPoint(-15.5F, -23.5F, 7F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[435].setRotationPoint(-15.5F, -23.5F, 7F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[436].setRotationPoint(-16F, -22F, 7F);

		bodyModel[437].addBox(0F, 0F, -2F, 6, 2, 4, 0F); // Box 380
		bodyModel[437].setRotationPoint(-23F, -24.25F, -6F);
		bodyModel[437].rotateAngleX = 0.29670597F;

		bodyModel[438].addShapeBox(-1F, 1F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 381
		bodyModel[438].setRotationPoint(-23F, -24.25F, -6F);
		bodyModel[438].rotateAngleX = 0.29670597F;

		bodyModel[439].addShapeBox(-1F, 0F, -2F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[439].setRotationPoint(-23F, -24.25F, -6F);
		bodyModel[439].rotateAngleX = 0.29670597F;

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[440].setRotationPoint(-23F, -24F, 5.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[441].setRotationPoint(-23F, -24.5F, 5.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[442].setRotationPoint(-23F, -24.5F, 5.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[443].setRotationPoint(-23F, -24.5F, 5.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[444].setRotationPoint(-23F, -24.5F, 5.5F);

		bodyModel[445].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 344 cull
		bodyModel[445].setRotationPoint(-23F, -23F, 5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[446].setRotationPoint(-30F, -21.75F, -0.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[447].setRotationPoint(-30F, -22.75F, -0.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[448].setRotationPoint(-29.75F, -21.25F, -0.25F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[449].setRotationPoint(-30F, -23F, -1F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[450].setRotationPoint(-30F, -23F, 1F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[451].setRotationPoint(-29.75F, -23.25F, -1.5F);

		bodyModel[452].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 481
		bodyModel[452].setRotationPoint(-30F, -23F, -1F);

		bodyModel[453].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 464
		bodyModel[453].setRotationPoint(35F, -7F, 6.75F);

		bodyModel[454].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 465
		bodyModel[454].setRotationPoint(35F, -7F, -7.75F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 521 prr shiot
		bodyModel[455].setRotationPoint(-9F, -24F, -5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522 pee are are
		bodyModel[456].setRotationPoint(-7.5F, -23F, -4.5F);

		bodyModel[457].addBox(0.1F, 0F, -1F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[457].setRotationPoint(-42.4F, -13.25F, -4.5F);
		bodyModel[457].rotateAngleY = 0.68067841F;

		bodyModel[458].addBox(0.1F, 0F, 0F, 1, 1, 1, 0F); // Box 363 markerlight glow
		bodyModel[458].setRotationPoint(-42.4F, -13.25F, 4.5F);
		bodyModel[458].rotateAngleY = -0.68067841F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[459].setRotationPoint(-26.5F, -24.5F, -1F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[460].setRotationPoint(-26.5F, -24.5F, -1F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[461].setRotationPoint(-26.5F, -24.5F, -1F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[462].setRotationPoint(-26.5F, -24.5F, -1F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[463].setRotationPoint(-26.5F, -24F, -1F);

		bodyModel[464].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 ac front cab
		bodyModel[464].setRotationPoint(-24F, -24.5F, -4F);

		bodyModel[465].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // AC rear cab
		bodyModel[465].setRotationPoint(-17F, -24.5F, -4F);

		bodyModel[466].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[466].setRotationPoint(-22.5F, -24.5F, -0.5F);

		bodyModel[467].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[467].setRotationPoint(-21.5F, -24.25F, 0.5F);

		bodyModel[468].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[468].setRotationPoint(-22F, -24.25F, -1.5F);

		bodyModel[469].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[469].setRotationPoint(-20F, -23.5F, -0.5F);

		bodyModel[470].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[470].setRotationPoint(-21F, -25.5F, 0.25F);

		bodyModel[471].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[471].setRotationPoint(-21F, -25.5F, -1F);

		bodyModel[472].addBox(0.1F, 0F, 0F, 1, 1, 1, 0F); // Box 474
		bodyModel[472].setRotationPoint(-42.4F, -21.25F, 4.5F);
		bodyModel[472].rotateAngleY = -0.68067841F;

		bodyModel[473].addBox(0.1F, 0F, -1F, 1, 1, 1, 0F); // Box 475
		bodyModel[473].setRotationPoint(-42.4F, -21.25F, -4.5F);
		bodyModel[473].rotateAngleY = 0.68067841F;

		bodyModel[474].addBox(0.1F, 0F, 0F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[474].setRotationPoint(42.75F, -21.25F, -4.5F);
		bodyModel[474].rotateAngleY = -0.68067841F;

		bodyModel[475].addBox(0.1F, 0F, -1F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[475].setRotationPoint(42.75F, -21.25F, 4.5F);
		bodyModel[475].rotateAngleY = 0.68067841F;

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[476].setRotationPoint(-21.5F, -24.5F, -1F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[477].setRotationPoint(-21.5F, -24.5F, -1F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[478].setRotationPoint(-21.5F, -24.5F, -1F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[479].setRotationPoint(-21.5F, -24F, -1F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[480].setRotationPoint(-21.5F, -24.5F, -1F);

		bodyModel[481].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[481].setRotationPoint(-43F, -23.5F, 2F);

		bodyModel[482].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 241
		bodyModel[482].setRotationPoint(-41.5F, -23.5F, 3F);

		bodyModel[483].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 242
		bodyModel[483].setRotationPoint(-42.5F, -23.5F, 4F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		bodyModel[484].setRotationPoint(-41F, -22.5F, 2F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[485].setRotationPoint(-34F, -23F, 1.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 488
		bodyModel[486].setRotationPoint(-31F, -21F, -8F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 489
		bodyModel[487].setRotationPoint(-30.5F, -24F, -7.75F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[488].setRotationPoint(-30.5F, -23F, -7.25F);

		bodyModel[489].addBox(0F, 0F, 0F, 16, 13, 1, 0F); // Box 94
		bodyModel[489].setRotationPoint(26F, -15F, -7.25F);

		bodyModel[490].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 493
		bodyModel[490].setRotationPoint(17F, -20.5F, -7.5F);

		bodyModel[491].addBox(0F, 0F, 0F, 16, 13, 1, 0F); // Box 497
		bodyModel[491].setRotationPoint(26F, -15F, 6.25F);

		bodyModel[492].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 498
		bodyModel[492].setRotationPoint(17F, -20.5F, 6.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[493].setRotationPoint(-15.5F, -24F, -5.25F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 500
		bodyModel[494].setRotationPoint(-15.5F, -25F, -5.75F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[495].setRotationPoint(-29F, -22F, -1F);

		bodyModel[496].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 502
		bodyModel[496].setRotationPoint(-29F, -22F, -1F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[497].setRotationPoint(-29F, -22F, 1F);

		bodyModel[498].addBox(0.1F, 0F, -1F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[498].setRotationPoint(-26.1F, -22.25F, -4.5F);
		bodyModel[498].rotateAngleY = 0.31415927F;

		bodyModel[499].addBox(0.1F, 0F, 0F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[499].setRotationPoint(-26.1F, -22.25F, 4.5F);
		bodyModel[499].rotateAngleY = -0.31415927F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 261, 28, textureX, textureY); // Box 506
		bodyModel[501] = new ModelRendererTurbo(this, 271, 28, textureX, textureY); // Box 507
		bodyModel[502] = new ModelRendererTurbo(this, 255, 28, textureX, textureY); // Box 508
		bodyModel[503] = new ModelRendererTurbo(this, 266, 28, textureX, textureY); // Box 509
		bodyModel[504] = new ModelRendererTurbo(this, 239, 18, textureX, textureY); // Box 510
		bodyModel[505] = new ModelRendererTurbo(this, 248, 18, textureX, textureY); // Box 511
		bodyModel[506] = new ModelRendererTurbo(this, 257, 18, textureX, textureY); // Box 512
		bodyModel[507] = new ModelRendererTurbo(this, 266, 18, textureX, textureY); // Box 513
		bodyModel[508] = new ModelRendererTurbo(this, 176, 39, textureX, textureY, "lamp"); // Box 514 vert headlight glow
		bodyModel[509] = new ModelRendererTurbo(this, 183, 39, textureX, textureY, "lamp"); // Box 515 vert headlight glow
		bodyModel[510] = new ModelRendererTurbo(this, 162, 39, textureX, textureY, "lamp"); // Box 516 headlight glow
		bodyModel[511] = new ModelRendererTurbo(this, 155, 39, textureX, textureY, "lamp"); // Box 517 headlight glow
		bodyModel[512] = new ModelRendererTurbo(this, 169, 39, textureX, textureY, "lamp"); // Box 518 cad headlight glow
		bodyModel[513] = new ModelRendererTurbo(this, 155, 34, textureX, textureY, "lamp"); // Box 519 headlight glow
		bodyModel[514] = new ModelRendererTurbo(this, 169, 39, textureX, textureY, "lamp"); // Box 520 cad headlight glow
		bodyModel[515] = new ModelRendererTurbo(this, 169, 23, textureX, textureY, "lamp"); // Box 521 headlight glow
		bodyModel[516] = new ModelRendererTurbo(this, 460, 16, textureX, textureY); // Box 524
		bodyModel[517] = new ModelRendererTurbo(this, 493, 16, textureX, textureY); // Box 517
		bodyModel[518] = new ModelRendererTurbo(this, 474, 9, textureX, textureY); // Box 518
		bodyModel[519] = new ModelRendererTurbo(this, 501, 9, textureX, textureY); // Box 519
		bodyModel[520] = new ModelRendererTurbo(this, 482, 16, textureX, textureY); // Box 520
		bodyModel[521] = new ModelRendererTurbo(this, 471, 16, textureX, textureY); // Box 521
		bodyModel[522] = new ModelRendererTurbo(this, 492, 9, textureX, textureY); // Box 522
		bodyModel[523] = new ModelRendererTurbo(this, 483, 9, textureX, textureY); // Box 523
		bodyModel[524] = new ModelRendererTurbo(this, 130, 46, textureX, textureY, "lamp"); // Box 524 cad markerlight glow
		bodyModel[525] = new ModelRendererTurbo(this, 125, 44, textureX, textureY, "lamp"); // Box 525 cad markerlight glow
		bodyModel[526] = new ModelRendererTurbo(this, 130, 49, textureX, textureY); // Box 526
		bodyModel[527] = new ModelRendererTurbo(this, 135, 46, textureX, textureY); // Box 527
		bodyModel[528] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 528
		bodyModel[529] = new ModelRendererTurbo(this, 110, 80, textureX, textureY); // Box 576
		bodyModel[530] = new ModelRendererTurbo(this, 98, 113, textureX, textureY); // Box 577
		bodyModel[531] = new ModelRendererTurbo(this, 115, 117, textureX, textureY); // Box 578
		bodyModel[532] = new ModelRendererTurbo(this, 98, 105, textureX, textureY, "lamp"); // Box 579 numberboard chop B
		bodyModel[533] = new ModelRendererTurbo(this, 111, 105, textureX, textureY, "lamp"); // Box 580 numberboard chop B
		bodyModel[534] = new ModelRendererTurbo(this, 152, 49, textureX, textureY, "lamp"); // Box 396 gmd makerlight glow
		bodyModel[535] = new ModelRendererTurbo(this, 149, 54, textureX, textureY, "lamp"); // Box 397 gmd markerlight glow
		bodyModel[536] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 537
		bodyModel[537] = new ModelRendererTurbo(this, 9, 58, textureX, textureY); // Box 34
		bodyModel[538] = new ModelRendererTurbo(this, 8, 51, textureX, textureY); // Box 34
		bodyModel[539] = new ModelRendererTurbo(this, 255, 2, textureX, textureY); // Box 541
		bodyModel[540] = new ModelRendererTurbo(this, 263, 7, textureX, textureY); // Box 542
		bodyModel[541] = new ModelRendererTurbo(this, 260, 2, textureX, textureY); // Box 543
		bodyModel[542] = new ModelRendererTurbo(this, 262, 2, textureX, textureY); // Box 544
		bodyModel[543] = new ModelRendererTurbo(this, 255, 4, textureX, textureY); // Box 545
		bodyModel[544] = new ModelRendererTurbo(this, 255, 7, textureX, textureY); // Box 546
		bodyModel[545] = new ModelRendererTurbo(this, 260, 7, textureX, textureY); // Box 547
		bodyModel[546] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 78
		bodyModel[547] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 188
		bodyModel[548] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 189 rocklight front
		bodyModel[549] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 190 rocklight front
		bodyModel[550] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 550 ditchlight front
		bodyModel[551] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 551
		bodyModel[552] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 552 ditchlight front
		bodyModel[553] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 553
		bodyModel[554] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 554 ditchlight rear
		bodyModel[555] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 555
		bodyModel[556] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 556 ditchlight rear
		bodyModel[557] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 557
		bodyModel[558] = new ModelRendererTurbo(this, 63, 76, textureX, textureY); // Box 43
		bodyModel[559] = new ModelRendererTurbo(this, 60, 71, textureX, textureY); // Box 43
		bodyModel[560] = new ModelRendererTurbo(this, 271, 18, textureX, textureY); // underbell1
		bodyModel[561] = new ModelRendererTurbo(this, 281, 18, textureX, textureY); // underbell2
		bodyModel[562] = new ModelRendererTurbo(this, 276, 18, textureX, textureY); // underbellclappa
		bodyModel[563] = new ModelRendererTurbo(this, 194, 39, textureX, textureY, "lamp"); // SP headlight rear low l
		bodyModel[564] = new ModelRendererTurbo(this, 201, 39, textureX, textureY, "lamp"); // SP headlight rear low r
		bodyModel[565] = new ModelRendererTurbo(this, 167, 98, textureX, textureY); // Box 438
		bodyModel[566] = new ModelRendererTurbo(this, 82, 80, textureX, textureY); // Box 566
		bodyModel[567] = new ModelRendererTurbo(this, 163, 114, textureX, textureY); // Box 293 prr trainphoje
		bodyModel[568] = new ModelRendererTurbo(this, 187, 131, textureX, textureY); // Box 520 prr bullshit
		bodyModel[569] = new ModelRendererTurbo(this, 192, 133, textureX, textureY); // Box 570
		bodyModel[570] = new ModelRendererTurbo(this, 177, 126, textureX, textureY); // Box 571
		bodyModel[571] = new ModelRendererTurbo(this, 182, 131, textureX, textureY); // Box 572
		bodyModel[572] = new ModelRendererTurbo(this, 181, 124, textureX, textureY); // Box 573
		bodyModel[573] = new ModelRendererTurbo(this, 172, 122, textureX, textureY); // Box 574
		bodyModel[574] = new ModelRendererTurbo(this, 182, 127, textureX, textureY); // Box 576
		bodyModel[575] = new ModelRendererTurbo(this, 197, 131, textureX, textureY); // Box 575
		bodyModel[576] = new ModelRendererTurbo(this, 164, 33, textureX, textureY); // Box 576
		bodyModel[577] = new ModelRendererTurbo(this, 169, 36, textureX, textureY); // Box 577
		bodyModel[578] = new ModelRendererTurbo(this, 164, 26, textureX, textureY); // Box 578
		bodyModel[579] = new ModelRendererTurbo(this, 164, 30, textureX, textureY); // Box 579
		bodyModel[580] = new ModelRendererTurbo(this, 23, 35, textureX, textureY); // Box 412
		bodyModel[581] = new ModelRendererTurbo(this, 2, 37, textureX, textureY); // Box 413
		bodyModel[582] = new ModelRendererTurbo(this, 36, 32, textureX, textureY); // Box 86
		bodyModel[583] = new ModelRendererTurbo(this, 43, 100, textureX, textureY); // Box 584
		bodyModel[584] = new ModelRendererTurbo(this, 42, 94, textureX, textureY); // Box 585
		bodyModel[585] = new ModelRendererTurbo(this, 43, 89, textureX, textureY); // Box 586
		bodyModel[586] = new ModelRendererTurbo(this, 64, 27, textureX, textureY, "lamp"); // Box 402 glow markerlight
		bodyModel[587] = new ModelRendererTurbo(this, 64, 27, textureX, textureY, "lamp"); // Box 403 glow markerlight
		bodyModel[588] = new ModelRendererTurbo(this, 64, 27, textureX, textureY); // Box 589
		bodyModel[589] = new ModelRendererTurbo(this, 64, 27, textureX, textureY); // Box 590
		bodyModel[590] = new ModelRendererTurbo(this, 230, 152, textureX, textureY); // Box 591
		bodyModel[591] = new ModelRendererTurbo(this, 230, 154, textureX, textureY); // Box 592
		bodyModel[592] = new ModelRendererTurbo(this, 471, 144, textureX, textureY); // Box 592
		bodyModel[593] = new ModelRendererTurbo(this, 456, 152, textureX, textureY); // Box 594
		bodyModel[594] = new ModelRendererTurbo(this, 471, 148, textureX, textureY); // Box 595
		bodyModel[595] = new ModelRendererTurbo(this, 456, 164, textureX, textureY); // Box 596
		bodyModel[596] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[597] = new ModelRendererTurbo(this, 97, 151, textureX, textureY); // Box 307 spedo

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 506
		bodyModel[500].setRotationPoint(-29F, -20.75F, -0.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[501].setRotationPoint(-29F, -21.75F, -0.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 508
		bodyModel[502].setRotationPoint(-28.75F, -22.25F, -1.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 509
		bodyModel[503].setRotationPoint(-28.75F, -20.25F, -0.25F);

		bodyModel[504].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 510
		bodyModel[504].setRotationPoint(-28F, -24.5F, -1.5F);

		bodyModel[505].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 511
		bodyModel[505].setRotationPoint(-28F, -25F, -0.5F);

		bodyModel[506].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 512
		bodyModel[506].setRotationPoint(-28.5F, -24.5F, 0.5F);

		bodyModel[507].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 513
		bodyModel[507].setRotationPoint(-27F, -24F, -0.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 514 vert headlight glow
		bodyModel[508].setRotationPoint(-45F, -14F, -1F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 515 vert headlight glow
		bodyModel[509].setRotationPoint(-45F, -12F, -1F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 516 headlight glow
		bodyModel[510].setRotationPoint(-45F, -22F, -1F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 517 headlight glow
		bodyModel[511].setRotationPoint(-45F, -20F, -1F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 518 cad headlight glow
		bodyModel[512].setRotationPoint(-45F, -18F, -1F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 519 headlight glow
		bodyModel[513].setRotationPoint(46F, -20F, -1F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 520 cad headlight glow
		bodyModel[514].setRotationPoint(46F, -18F, -1F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 521 headlight glow
		bodyModel[515].setRotationPoint(46F, -22F, -1F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.5F, 1.25F, 0F, -0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.25F, 0F, -0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[516].setRotationPoint(45F, -19F, 3F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 1.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.05F, 0F, 0F, 1.25F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 517
		bodyModel[517].setRotationPoint(45F, -19F, -7F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,-1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0.05F, 0F, 0F, -0.05F, 0F, 0F, -1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 518
		bodyModel[518].setRotationPoint(46.02F, -19F, 3F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,-0.05F, 0F, 0F, 0.05F, 0F, 0F, 1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.05F, 0F, 0F, 0.05F, 0F, 0F, 1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F); // Box 519
		bodyModel[519].setRotationPoint(46.02F, -19F, -7F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.05F, 0F, 0F, 1.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 520
		bodyModel[520].setRotationPoint(-44F, -19F, 3F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.25F, 0F, -0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.25F, 0F, -0.5F); // Box 521
		bodyModel[521].setRotationPoint(-44F, -19F, -7F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.05F, 0F, 0F, 0.05F, 0F, 0F, 1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 522
		bodyModel[522].setRotationPoint(-44.02F, -19F, 3F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0.05F, 0F, 0F, -0.05F, 0F, 0F, -1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0.05F, 0F, 0F, -0.05F, 0F, 0F, -1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F); // Box 523
		bodyModel[523].setRotationPoint(-44.02F, -19F, -7F);

		bodyModel[524].addBox(0.5F, 0.5F, 0.25F, 1, 1, 1, 0F); // Box 524 cad markerlight glow
		bodyModel[524].setRotationPoint(-44.5F, -21.25F, 6.5F);
		bodyModel[524].rotateAngleY = -0.82030475F;

		bodyModel[525].addBox(0.5F, 0.5F, -1.25F, 1, 1, 1, 0F); // Box 525 cad markerlight glow
		bodyModel[525].setRotationPoint(-44.5F, -21.25F, -6.5F);
		bodyModel[525].rotateAngleY = 0.82030475F;

		bodyModel[526].addBox(-0.1F, 0.5F, 0.25F, 1, 1, 1, 0F); // Box 526
		bodyModel[526].setRotationPoint(44.5F, -21.25F, -6.5F);
		bodyModel[526].rotateAngleY = -0.82030475F;

		bodyModel[527].addBox(-0.1F, 0.5F, -1.25F, 1, 1, 1, 0F); // Box 527
		bodyModel[527].setRotationPoint(44.5F, -21.25F, 6.5F);
		bodyModel[527].rotateAngleY = 0.82030475F;

		bodyModel[528].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 528
		bodyModel[528].setRotationPoint(46F, 1.5F, -8F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 576
		bodyModel[529].setRotationPoint(-26.5F, -23F, -7F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 577
		bodyModel[530].setRotationPoint(-26.5F, -23F, 1F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 578
		bodyModel[531].setRotationPoint(-26.5F, -23F, -1F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 579 numberboard chop B
		bodyModel[532].setRotationPoint(-25.15F, -21.05F, -6.5F);
		bodyModel[532].rotateAngleY = 0.2443461F;

		bodyModel[533].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 580 numberboard chop B
		bodyModel[533].setRotationPoint(-25.15F, -21.05F, 6.5F);
		bodyModel[533].rotateAngleY = -0.2443461F;

		bodyModel[534].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396 gmd makerlight glow
		bodyModel[534].setRotationPoint(-25.4F, -22.75F, 6F);
		bodyModel[534].rotateAngleY = -0.2443461F;

		bodyModel[535].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 397 gmd markerlight glow
		bodyModel[535].setRotationPoint(-25.5F, -22.75F, -6F);
		bodyModel[535].rotateAngleY = 0.2443461F;

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 537
		bodyModel[536].setRotationPoint(-42F, -14.5F, -1.5F);

		bodyModel[537].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[537].setRotationPoint(-44.5F, -9.5F, -0.5F);

		bodyModel[538].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 34
		bodyModel[538].setRotationPoint(-44.5F, -10.5F, -1.5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[539].setRotationPoint(-28.5F, -23F, -1F);

		bodyModel[540].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 542
		bodyModel[540].setRotationPoint(-28.5F, -23F, -1F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[541].setRotationPoint(-28.5F, -23F, 1F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 544
		bodyModel[542].setRotationPoint(-28.25F, -23.25F, -1.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[543].setRotationPoint(-28.5F, -22.75F, -0.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 546
		bodyModel[544].setRotationPoint(-28.5F, -21.75F, -0.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 547
		bodyModel[545].setRotationPoint(-28.25F, -21.25F, -0.25F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[546].setRotationPoint(-47F, -3F, 3.75F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[547].setRotationPoint(-47F, -3F, -5.75F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 rocklight front
		bodyModel[548].setRotationPoint(-47.25F, -3F, 3.75F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 rocklight front
		bodyModel[549].setRotationPoint(-47.25F, -3F, -5.75F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 550 ditchlight front
		bodyModel[550].setRotationPoint(-47.75F, -1F, 4.75F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[551].setRotationPoint(-47.5F, -1F, 4.75F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 552 ditchlight front
		bodyModel[552].setRotationPoint(-47.75F, -1F, -6.75F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[553].setRotationPoint(-47.5F, -1F, -6.75F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 554 ditchlight rear
		bodyModel[554].setRotationPoint(48.75F, -1F, 4.75F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 555
		bodyModel[555].setRotationPoint(48.5F, -1F, 4.75F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 556 ditchlight rear
		bodyModel[556].setRotationPoint(48.75F, -1F, -6.75F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 557
		bodyModel[557].setRotationPoint(48.5F, -1F, -6.75F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[558].setRotationPoint(-44F, -9F, -0.5F);

		bodyModel[559].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 43
		bodyModel[559].setRotationPoint(-44F, -7.5F, 0F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // underbell1
		bodyModel[560].setRotationPoint(-18F, 1F, -9.3F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // underbell2
		bodyModel[561].setRotationPoint(-18F, 2F, -9.3F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // underbellclappa
		bodyModel[562].setRotationPoint(-17.75F, 2.5F, -9.05F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // SP headlight rear low l
		bodyModel[563].setRotationPoint(45.5F, -16F, -2F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // SP headlight rear low r
		bodyModel[564].setRotationPoint(45.5F, -16F, 0F);

		bodyModel[565].addBox(0F, 0F, 0F, 50, 4, 0, 0F); // Box 438
		bodyModel[565].setRotationPoint(-23.5F, -25F, -6F);

		bodyModel[566].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // Box 566
		bodyModel[566].setRotationPoint(-43F, -21F, 2F);

		bodyModel[567].addBox(0F, 0F, 0F, 81, 4, 0, 0F); // Box 293 prr trainphoje
		bodyModel[567].setRotationPoint(-39.5F, -25F, 6F);

		bodyModel[568].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 520 prr bullshit
		bodyModel[568].setRotationPoint(41.5F, -25F, 6F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 570
		bodyModel[569].setRotationPoint(41.5F, -18F, 6F);

		bodyModel[570].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 571
		bodyModel[570].setRotationPoint(42.5F, -13F, 6F);

		bodyModel[571].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 572
		bodyModel[571].setRotationPoint(-39.5F, -25F, 6F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[572].setRotationPoint(-39.5F, -18F, 6F);

		bodyModel[573].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 574
		bodyModel[573].setRotationPoint(-34.5F, -17F, 6F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[574].setRotationPoint(-36.5F, -19F, 7F);

		bodyModel[575].addBox(0F, 0F, 0F, 0, 4, 2, 0F); // Box 575
		bodyModel[575].setRotationPoint(-23.5F, -25F, -8F);

		bodyModel[576].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 576
		bodyModel[576].setRotationPoint(-7F, -24F, -4.5F);

		bodyModel[577].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 577
		bodyModel[577].setRotationPoint(-8F, -23.5F, -5.5F);

		bodyModel[578].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 578
		bodyModel[578].setRotationPoint(-7F, -23F, -4.5F);

		bodyModel[579].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 579
		bodyModel[579].setRotationPoint(-8F, -23.5F, -3.5F);

		bodyModel[580].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[580].setRotationPoint(-24F, -15F, 3F);

		bodyModel[581].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[581].setRotationPoint(-24.1F, -14F, 1F);
		bodyModel[581].rotateAngleY = -0.38397244F;

		bodyModel[582].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[582].setRotationPoint(-22.5F, -16F, 1F);
		bodyModel[582].rotateAngleY = -0.38397244F;

		bodyModel[583].addBox(0F, 0F, -3F, 13, 1, 3, 0F); // Box 584
		bodyModel[583].setRotationPoint(-39F, -14.25F, -2F);
		bodyModel[583].rotateAngleX = 0.19198622F;

		bodyModel[584].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Box 585
		bodyModel[584].setRotationPoint(-39F, -14.25F, -2F);

		bodyModel[585].addBox(0F, 0F, 0F, 13, 1, 3, 0F); // Box 586
		bodyModel[585].setRotationPoint(-39F, -14.25F, 2F);
		bodyModel[585].rotateAngleX = -0.19198622F;

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 402 glow markerlight
		bodyModel[586].setRotationPoint(45.25F, -4F, 3F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 403 glow markerlight
		bodyModel[587].setRotationPoint(45.25F, -4F, -5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 589
		bodyModel[588].setRotationPoint(-44.25F, -4F, 3F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 590
		bodyModel[589].setRotationPoint(-44.25F, -4F, -5F);

		bodyModel[590].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 591
		bodyModel[590].setRotationPoint(46F, 4F, 10F);

		bodyModel[591].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 592
		bodyModel[591].setRotationPoint(46F, 4F, -11F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 15, 0, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[592].setRotationPoint(30F, -22F, -11F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 15, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[593].setRotationPoint(30F, -20F, -11F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 15, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 595
		bodyModel[594].setRotationPoint(30F, -22F, 8F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 15, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[595].setRotationPoint(30F, -20F, 11F);

		bodyModel[596].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[596].setRotationPoint(-20.5F, -18.25F, 2F);
		bodyModel[596].rotateAngleY = 0.78539816F;

		bodyModel[597].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[597].setRotationPoint(-20.5F, -18.25F, 2F);
		bodyModel[597].rotateAngleY = 0.78539816F;
	}
	ModelTrimountTrucc theTruc = new ModelTrimountTrucc();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 14321){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/trimount1_Black.png"));//1 brake cylinder vs 2
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/trimount2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.9, -0.03, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.8, 0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}