//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP38-39-40
// Model Creator: Bida
// Created on: 28.02.2022 - 07:22:48
// Last changed on: 28.02.2022 - 07:22:48
//getting real tired of having people submit things last second, i got dealines to meet people comeon!
package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelSDL39Truck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelSDL39 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSDL39() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[296];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 102, textureX, textureY); // Box 352
		bodyModel[1] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[2] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 354
		bodyModel[3] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 356
		bodyModel[4] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[5] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 355
		bodyModel[6] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 5
		bodyModel[9] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 272, 92, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 164
		bodyModel[12] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 259
		bodyModel[14] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[15] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[16] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[17] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[18] = new ModelRendererTurbo(this, 46, 136, textureX, textureY); // Box 143
		bodyModel[19] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 63
		bodyModel[21] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[22] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[23] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[24] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[25] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[26] = new ModelRendererTurbo(this, 14, 137, textureX, textureY); // Box 226
		bodyModel[27] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[28] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 271
		bodyModel[29] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[30] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[31] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[32] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[33] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[34] = new ModelRendererTurbo(this, 367, 151, textureX, textureY); // Box 164
		bodyModel[35] = new ModelRendererTurbo(this, 399, 151, textureX, textureY); // Box 259
		bodyModel[36] = new ModelRendererTurbo(this, 374, 148, textureX, textureY); // Box 261
		bodyModel[37] = new ModelRendererTurbo(this, 392, 148, textureX, textureY); // Box 262
		bodyModel[38] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 264
		bodyModel[39] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 265
		bodyModel[40] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 375, 167, textureX, textureY); // Box 80
		bodyModel[43] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 81
		bodyModel[44] = new ModelRendererTurbo(this, 380, 159, textureX, textureY); // Box 234
		bodyModel[45] = new ModelRendererTurbo(this, 375, 165, textureX, textureY); // Box 236
		bodyModel[46] = new ModelRendererTurbo(this, 377, 176, textureX, textureY); // Box 202
		bodyModel[47] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 204
		bodyModel[48] = new ModelRendererTurbo(this, 397, 165, textureX, textureY); // Box 206
		bodyModel[49] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[50] = new ModelRendererTurbo(this, 370, 180, textureX, textureY); // Box 225
		bodyModel[51] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 301
		bodyModel[52] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[53] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[54] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[55] = new ModelRendererTurbo(this, 290, 107, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 289, 70, textureX, textureY); // Box 112
		bodyModel[57] = new ModelRendererTurbo(this, 363, 114, textureX, textureY); // Box 113
		bodyModel[58] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 116
		bodyModel[59] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[60] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[61] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[62] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "numberboard").setLightFixtureId("front_numberboard_body_62"); // Box 117 numberboard front
		bodyModel[63] = new ModelRendererTurbo(this, 93, 45, textureX, textureY, "numberboard").setLightFixtureId("front_numberboard_body_63"); // Box 118 numberboard front
		bodyModel[64] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight front up 1
		bodyModel[65] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight front up 2
		bodyModel[66] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[67] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[68] = new ModelRendererTurbo(this, 2, 45, textureX, textureY); // Box 43
		bodyModel[69] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[70] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[71] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[72] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[73] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 nose brake cover
		bodyModel[74] = new ModelRendererTurbo(this, 261, 74, textureX, textureY); // Box 163
		bodyModel[75] = new ModelRendererTurbo(this, 405, 113, textureX, textureY); // Box 166
		bodyModel[76] = new ModelRendererTurbo(this, 429, 94, textureX, textureY); // Box 408
		bodyModel[77] = new ModelRendererTurbo(this, 233, 90, textureX, textureY); // Box 409
		bodyModel[78] = new ModelRendererTurbo(this, 335, 29, textureX, textureY); // Box 19 the hooh
		bodyModel[79] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[80] = new ModelRendererTurbo(this, 461, 85, textureX, textureY); // Box 40
		bodyModel[81] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 41
		bodyModel[82] = new ModelRendererTurbo(this, 465, 76, textureX, textureY, "numberboard").setLightFixtureId("rear_numberboard_body_82"); // Box 115 numberboard rear
		bodyModel[83] = new ModelRendererTurbo(this, 491, 76, textureX, textureY, "numberboard").setLightFixtureId("rear_numberboard_body_83"); // Box 116 numberboard rear
		bodyModel[84] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[85] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[86] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[87] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[88] = new ModelRendererTurbo(this, 460, 150, textureX, textureY); // Box 297 vent 2 part f
		bodyModel[89] = new ModelRendererTurbo(this, 460, 150, textureX, textureY); // Box 299 vent 2 part e
		bodyModel[90] = new ModelRendererTurbo(this, 420, 150, textureX, textureY); // Box 272 vent 2 part f
		bodyModel[91] = new ModelRendererTurbo(this, 420, 150, textureX, textureY); // Box 273 vent 2 part e
		bodyModel[92] = new ModelRendererTurbo(this, 322, 116, textureX, textureY); // Box 36
		bodyModel[93] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[94] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[95] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[96] = new ModelRendererTurbo(this, 480, 80, textureX, textureY); // Box 351 sandcap
		bodyModel[97] = new ModelRendererTurbo(this, 270, 123, textureX, textureY); // Box 63
		bodyModel[98] = new ModelRendererTurbo(this, 270, 76, textureX, textureY); // Box 170
		bodyModel[99] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[100] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[101] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[102] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[103] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[104] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[105] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[106] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[107] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[108] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[109] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[110] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[111] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[112] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[113] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[114] = new ModelRendererTurbo(this, 285, 114, textureX, textureY); // Box 129
		bodyModel[115] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Box 130
		bodyModel[116] = new ModelRendererTurbo(this, 282, 114, textureX, textureY); // Box 133
		bodyModel[117] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 134
		bodyModel[118] = new ModelRendererTurbo(this, 300, 114, textureX, textureY); // Box 192
		bodyModel[119] = new ModelRendererTurbo(this, 297, 114, textureX, textureY); // Box 193
		bodyModel[120] = new ModelRendererTurbo(this, 443, 65, textureX, textureY); // Box 194
		bodyModel[121] = new ModelRendererTurbo(this, 440, 65, textureX, textureY); // Box 195
		bodyModel[122] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[123] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 197
		bodyModel[124] = new ModelRendererTurbo(this, 368, 67, textureX, textureY); // Box 198
		bodyModel[125] = new ModelRendererTurbo(this, 326, 67, textureX, textureY); // Box 199
		bodyModel[126] = new ModelRendererTurbo(this, 377, 67, textureX, textureY); // Box 200
		bodyModel[127] = new ModelRendererTurbo(this, 371, 67, textureX, textureY); // Box 201
		bodyModel[128] = new ModelRendererTurbo(this, 248, 81, textureX, textureY); // Box 4
		bodyModel[129] = new ModelRendererTurbo(this, 449, 72, textureX, textureY); // Box 203
		bodyModel[130] = new ModelRendererTurbo(this, 244, 156, textureX, textureY); // Box 489
		bodyModel[131] = new ModelRendererTurbo(this, 220, 213, textureX, textureY); // Box 278
		bodyModel[132] = new ModelRendererTurbo(this, 221, 218, textureX, textureY); // Box 281
		bodyModel[133] = new ModelRendererTurbo(this, 248, 182, textureX, textureY); // Box 288
		bodyModel[134] = new ModelRendererTurbo(this, 306, 213, textureX, textureY); // Box 315
		bodyModel[135] = new ModelRendererTurbo(this, 307, 218, textureX, textureY); // Box 316
		bodyModel[136] = new ModelRendererTurbo(this, 256, 172, textureX, textureY); // Box 19
		bodyModel[137] = new ModelRendererTurbo(this, 250, 138, textureX, textureY); // Box 559
		bodyModel[138] = new ModelRendererTurbo(this, 300, 172, textureX, textureY); // Box 560
		bodyModel[139] = new ModelRendererTurbo(this, 220, 208, textureX, textureY); // Box 562
		bodyModel[140] = new ModelRendererTurbo(this, 306, 208, textureX, textureY); // Box 563
		bodyModel[141] = new ModelRendererTurbo(this, 17, 187, textureX, textureY); // Box 811
		bodyModel[142] = new ModelRendererTurbo(this, 373, 150, textureX, textureY); // Box 812
		bodyModel[143] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 44
		bodyModel[144] = new ModelRendererTurbo(this, 90, 103, textureX, textureY); // Box 45
		bodyModel[145] = new ModelRendererTurbo(this, 91, 113, textureX, textureY); // Box 56
		bodyModel[146] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 178
		bodyModel[147] = new ModelRendererTurbo(this, 102, 134, textureX, textureY); // Box 61
		bodyModel[148] = new ModelRendererTurbo(this, 54, 127, textureX, textureY); // Box 81
		bodyModel[149] = new ModelRendererTurbo(this, 51, 128, textureX, textureY); // Box 81
		bodyModel[150] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 174
		bodyModel[151] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 176
		bodyModel[152] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[153] = new ModelRendererTurbo(this, 100, 136, textureX, textureY); // Box 191
		bodyModel[154] = new ModelRendererTurbo(this, 99, 125, textureX, textureY); // Box 227
		bodyModel[155] = new ModelRendererTurbo(this, 104, 139, textureX, textureY); // Box 293
		bodyModel[156] = new ModelRendererTurbo(this, 96, 123, textureX, textureY); // Box 258
		bodyModel[157] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 300
		bodyModel[158] = new ModelRendererTurbo(this, 475, 3, textureX, textureY); // Box 276 gp38/39 fan
		bodyModel[159] = new ModelRendererTurbo(this, 456, 6, textureX, textureY); // Box 277 gp38/39 fan
		bodyModel[160] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[161] = new ModelRendererTurbo(this, 117, 107, textureX, textureY); // Box 303
		bodyModel[162] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 304
		bodyModel[163] = new ModelRendererTurbo(this, 112, 107, textureX, textureY); // Box 305
		bodyModel[164] = new ModelRendererTurbo(this, 108, 102, textureX, textureY); // Box 836
		bodyModel[165] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[166] = new ModelRendererTurbo(this, 334, 2, textureX, textureY); // Box 274 gp39/40 exhaust
		bodyModel[167] = new ModelRendererTurbo(this, 341, 2, textureX, textureY); // Box 275
		bodyModel[168] = new ModelRendererTurbo(this, 109, 125, textureX, textureY); // Box 38R
		bodyModel[169] = new ModelRendererTurbo(this, 117, 136, textureX, textureY); // Box 176
		bodyModel[170] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[171] = new ModelRendererTurbo(this, 407, 161, textureX, textureY); // Box 244
		bodyModel[172] = new ModelRendererTurbo(this, 367, 161, textureX, textureY); // Box 249
		bodyModel[173] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 250
		bodyModel[174] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 313
		bodyModel[175] = new ModelRendererTurbo(this, 177, 134, textureX, textureY); // Box 315
		bodyModel[176] = new ModelRendererTurbo(this, 179, 136, textureX, textureY); // Box 316
		bodyModel[177] = new ModelRendererTurbo(this, 125, 123, textureX, textureY); // Box 306
		bodyModel[178] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 307
		bodyModel[179] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 868
		bodyModel[180] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[181] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[182] = new ModelRendererTurbo(this, 402, 166, textureX, textureY); // Box 871
		bodyModel[183] = new ModelRendererTurbo(this, 372, 166, textureX, textureY); // Box 872
		bodyModel[184] = new ModelRendererTurbo(this, 309, 25, textureX, textureY); // Box 308
		bodyModel[185] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 309
		bodyModel[186] = new ModelRendererTurbo(this, 307, 15, textureX, textureY); // Box 310
		bodyModel[187] = new ModelRendererTurbo(this, 295, 15, textureX, textureY); // Box 311
		bodyModel[188] = new ModelRendererTurbo(this, 82, 2, textureX, textureY); // box64
		bodyModel[189] = new ModelRendererTurbo(this, 34, 2, textureX, textureY); // box65
		bodyModel[190] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412 cs
		bodyModel[191] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413 cs
		bodyModel[192] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86 cs
		bodyModel[193] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "instrument").setLightFixtureId("cab_speedometer_body_193"); // Box 71 glow speedometer
		bodyModel[194] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307 spedo
		bodyModel[195] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 78
		bodyModel[196] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 188
		bodyModel[197] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front a
		bodyModel[198] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front a
		bodyModel[199] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 239
		bodyModel[200] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear a
		bodyModel[201] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear a
		bodyModel[202] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 242
		bodyModel[203] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 250
		bodyModel[204] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 251 ditchlight front b
		bodyModel[205] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 252 ditchlight front b
		bodyModel[206] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 253
		bodyModel[207] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 254
		bodyModel[208] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 255
		bodyModel[209] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 256 ditchlight rear b
		bodyModel[210] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 257 ditchlight rear b
		bodyModel[211] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[212] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 349 ditchlight front c
		bodyModel[213] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 350 ditchlight front c
		bodyModel[214] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 351 cull
		bodyModel[215] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 352 cull
		bodyModel[216] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 353 cull
		bodyModel[217] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 354 ditchlight rear c
		bodyModel[218] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 355 ditchlight rear c
		bodyModel[219] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 114
		bodyModel[220] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 74
		bodyModel[221] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 78
		bodyModel[222] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 245
		bodyModel[223] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[224] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[225] = new ModelRendererTurbo(this, 129, 75, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[226] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[227] = new ModelRendererTurbo(this, 129, 91, textureX, textureY, "cull"); // Box 1087 cull
		bodyModel[228] = new ModelRendererTurbo(this, 131, 86, textureX, textureY); // Box 1088
		bodyModel[229] = new ModelRendererTurbo(this, 375, 7, textureX, textureY); // Box 317
		bodyModel[230] = new ModelRendererTurbo(this, 238, 12, textureX, textureY); // Box 421 prime base
		bodyModel[231] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[232] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[233] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[234] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[235] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 401
		bodyModel[236] = new ModelRendererTurbo(this, 191, 21, textureX, textureY); // Box 402
		bodyModel[237] = new ModelRendererTurbo(this, 4, 182, textureX, textureY); // Box 22
		bodyModel[238] = new ModelRendererTurbo(this, 38, 182, textureX, textureY); // Box 23
		bodyModel[239] = new ModelRendererTurbo(this, 4, 195, textureX, textureY); // Box 24
		bodyModel[240] = new ModelRendererTurbo(this, 38, 195, textureX, textureY); // Box 25
		bodyModel[241] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[242] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[243] = new ModelRendererTurbo(this, 6, 160, textureX, textureY); // Box 280
		bodyModel[244] = new ModelRendererTurbo(this, 40, 160, textureX, textureY); // Box 285
		bodyModel[245] = new ModelRendererTurbo(this, 441, 188, textureX, textureY); // Box 1163
		bodyModel[246] = new ModelRendererTurbo(this, 424, 185, textureX, textureY); // Box 1164
		bodyModel[247] = new ModelRendererTurbo(this, 456, 191, textureX, textureY); // Box 1165
		bodyModel[248] = new ModelRendererTurbo(this, 409, 188, textureX, textureY); // Box 1166
		bodyModel[249] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 1167
		bodyModel[250] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 1168
		bodyModel[251] = new ModelRendererTurbo(this, 441, 165, textureX, textureY); // Box 1169
		bodyModel[252] = new ModelRendererTurbo(this, 426, 163, textureX, textureY); // Box 1170
		bodyModel[253] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[254] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[255] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[256] = new ModelRendererTurbo(this, 172, 23, textureX, textureY); // Box 342
		bodyModel[257] = new ModelRendererTurbo(this, 172, 20, textureX, textureY); // Box 343
		bodyModel[258] = new ModelRendererTurbo(this, 170, 26, textureX, textureY); // Box 344
		bodyModel[259] = new ModelRendererTurbo(this, 179, 23, textureX, textureY); // Box 345
		bodyModel[260] = new ModelRendererTurbo(this, 111, 113, textureX, textureY); // Box 1203
		bodyModel[261] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "marker").setLightFixtureId("marker_two_body_261"); // Box 71 markerlight twO
		bodyModel[262] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[263] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "marker").setLightFixtureId("marker_two_body_263"); // Box 71 markerlight twO
		bodyModel[264] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[265] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[266] = new ModelRendererTurbo(this, 152, 25, textureX, textureY); // Box 446
		bodyModel[267] = new ModelRendererTurbo(this, 449, 30, textureX, textureY, "cull"); // Box 196 winterization hatch cull
		bodyModel[268] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 272
		bodyModel[269] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 273
		bodyModel[270] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 400
		bodyModel[271] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 401
		bodyModel[272] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 541
		bodyModel[273] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 542
		bodyModel[274] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 543
		bodyModel[275] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 544
		bodyModel[276] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 545
		bodyModel[277] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 546
		bodyModel[278] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[279] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 452
		bodyModel[280] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[281] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[282] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[283] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[284] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 553
		bodyModel[285] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 554
		bodyModel[286] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 555
		bodyModel[287] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 556
		bodyModel[288] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 557
		bodyModel[289] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 558
		bodyModel[290] = new ModelRendererTurbo(this, 16, 136, textureX, textureY); // Box 559
		bodyModel[291] = new ModelRendererTurbo(this, 402, 168, textureX, textureY); // Box 560
		bodyModel[292] = new ModelRendererTurbo(this, 372, 168, textureX, textureY); // Box 561
		bodyModel[293] = new ModelRendererTurbo(this, 133, 168, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[294] = new ModelRendererTurbo(this, 273, 114, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[295] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 178

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[0].setRotationPoint(-35F, -8F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[1].setRotationPoint(-35F, -10F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[2].setRotationPoint(-35F, -10F, 1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[3].setRotationPoint(-35F, -13F, 1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[4].setRotationPoint(-35F, -13F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[5].setRotationPoint(-35F, -8F, 0F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[6].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[8].setRotationPoint(38F, 3F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[9].setRotationPoint(37F, 2.5F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 74, 2, 12, 0F); // Box 23
		bodyModel[10].setRotationPoint(-37F, 1F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[11].setRotationPoint(-33F, 1F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[12].setRotationPoint(-37F, 0F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[13].setRotationPoint(-33F, 1F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[14].setRotationPoint(-33F, 0F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[15].setRotationPoint(-33F, 5F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[16].setRotationPoint(-33F, 5F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[17].setRotationPoint(-33F, 0F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[18].setRotationPoint(-37F, -8F, -8F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[19].setRotationPoint(-37F, -1F, 10F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[20].setRotationPoint(-37F, -1F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[21].setRotationPoint(-37F, -8F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[22].setRotationPoint(-37F, -8F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[23].setRotationPoint(-38F, -8F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[24].setRotationPoint(-37F, -8F, 4F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[25].setRotationPoint(-37F, -8F, 6F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 226
		bodyModel[26].setRotationPoint(-37F, 8F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[27].setRotationPoint(-37F, 7F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[28].setRotationPoint(-37F, 0F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[29].setRotationPoint(-37F, 3F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[30].setRotationPoint(-38F, 0F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[31].setRotationPoint(-38F, 0F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[32].setRotationPoint(-38F, 0F, -6F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[33].setRotationPoint(37F, 0F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[34].setRotationPoint(32F, 1F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[35].setRotationPoint(32F, 1F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[36].setRotationPoint(32F, 0F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[37].setRotationPoint(32F, 0F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[38].setRotationPoint(32F, 5F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[39].setRotationPoint(32F, 5F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[40].setRotationPoint(37F, -1F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[41].setRotationPoint(37F, -1F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[42].setRotationPoint(37F, -8F, -8F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[43].setRotationPoint(37F, -8F, 6F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[44].setRotationPoint(38F, -8F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[45].setRotationPoint(37F, -8F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[46].setRotationPoint(37F, 0F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[47].setRotationPoint(37F, 0F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[48].setRotationPoint(37F, -8F, 4F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[49].setRotationPoint(37F, 7F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 225
		bodyModel[50].setRotationPoint(37F, 8F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[51].setRotationPoint(37F, 0F, 5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[52].setRotationPoint(-33.98F, -13F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[53].setRotationPoint(-35F, -13F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[54].setRotationPoint(-35F, -13F, -1F);

		bodyModel[55].addBox(0F, 0F, 0F, 64, 1, 4, 0F); // Box 0
		bodyModel[55].setRotationPoint(-32F, 0F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 64, 1, 4, 0F); // Box 112
		bodyModel[56].setRotationPoint(-32F, 0F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 19, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[57].setRotationPoint(13F, 1F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[58].setRotationPoint(-13F, 1F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[59].setRotationPoint(-26F, -21F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[60].setRotationPoint(-26F, -21F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[61].setRotationPoint(-26F, -21F, 1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[62].setRotationPoint(-24.05F, -19.5F, -6F);
		bodyModel[62].rotateAngleY = 0.38397244F;

		bodyModel[63].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[63].setRotationPoint(-24.05F, -19.5F, 6F);
		bodyModel[63].rotateAngleY = -0.38397244F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front up 1
		bodyModel[64].setRotationPoint(-26.5F, -21F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front up 2
		bodyModel[65].setRotationPoint(-26.5F, -19F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[66].setRotationPoint(-23F, -21F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[67].setRotationPoint(-14F, -20F, -6F);

		bodyModel[68].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 43
		bodyModel[68].setRotationPoint(-30F, -13F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[69].setRotationPoint(-32F, -13F, -6F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[70].setRotationPoint(-32F, -13F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[71].setRotationPoint(-5.5F, -8.5F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[72].setRotationPoint(-5F, -6.5F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 nose brake cover
		bodyModel[73].setRotationPoint(-32F, -9F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[74].setRotationPoint(-22.5F, 3F, -2F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[75].setRotationPoint(19F, 3F, -2F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[76].setRotationPoint(19.5F, 1F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[77].setRotationPoint(-22F, 1F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 43, 21, 14, 0F); // Box 19 the hooh
		bodyModel[78].setRotationPoint(-12F, -21F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[79].setRotationPoint(32.25F, -18F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[80].setRotationPoint(31F, -21F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[81].setRotationPoint(31F, -21F, 0F);

		bodyModel[82].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[82].setRotationPoint(31.45F, -15.5F, -6F);
		bodyModel[82].rotateAngleY = -0.41887902F;

		bodyModel[83].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[83].setRotationPoint(31.45F, -15.5F, 6F);
		bodyModel[83].rotateAngleY = 0.41887902F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[84].setRotationPoint(33.5F, -18F, -2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[85].setRotationPoint(33.5F, -18F, 0F);

		bodyModel[86].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[86].setRotationPoint(-10.5F, -20.5F, -7.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[87].setRotationPoint(-10.5F, -20.5F, 6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 297 vent 2 part f
		bodyModel[88].setRotationPoint(21.5F, -19.5F, -7.25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 299 vent 2 part e
		bodyModel[89].setRotationPoint(21.5F, -19.5F, 6.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, -1F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 272 vent 2 part f
		bodyModel[90].setRotationPoint(12F, -20.5F, -7.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, -1F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 273 vent 2 part e
		bodyModel[91].setRotationPoint(12F, -20.5F, 6.25F);

		bodyModel[92].addBox(0F, 0F, 0F, 31, 2, 4, 0F); // Box 36
		bodyModel[92].setRotationPoint(-12F, -2F, -11F);

		bodyModel[93].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[93].setRotationPoint(-10F, -13F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[94].setRotationPoint(-10F, -15F, -9F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[95].setRotationPoint(-12F, -10F, -10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[96].setRotationPoint(31.5F, -21.5F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 74, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[97].setRotationPoint(-37F, 3F, -6.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 74, 1, 14, 0F); // Box 170
		bodyModel[98].setRotationPoint(-37F, 0F, -7F);

		bodyModel[99].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[99].setRotationPoint(-23.5F, -18F, -10.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[100].setRotationPoint(-13F, -18F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[101].setRotationPoint(-23F, -18F, 10F);

		bodyModel[102].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[102].setRotationPoint(-23F, -18F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[103].setRotationPoint(-24F, -18F, -7F);

		bodyModel[104].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[104].setRotationPoint(-12.5F, -18F, 10.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[105].setRotationPoint(-24F, -4F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[106].setRotationPoint(-24F, -21F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[107].setRotationPoint(-13F, -21F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[108].setRotationPoint(-24F, -21F, -7F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[109].setRotationPoint(-13F, -21F, -7F);

		bodyModel[110].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[110].setRotationPoint(-23F, -21F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[111].setRotationPoint(-23F, -21F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[112].setRotationPoint(-13F, -21F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[113].setRotationPoint(-24F, -21F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[114].setRotationPoint(-22F, 2F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[115].setRotationPoint(-22F, 2F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[116].setRotationPoint(-21F, 2F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[117].setRotationPoint(-21F, 2F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[118].setRotationPoint(19.5F, 2F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[119].setRotationPoint(20.5F, 2F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[120].setRotationPoint(19.5F, 2F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[121].setRotationPoint(20.5F, 2F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 19, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[122].setRotationPoint(-32F, 1F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[123].setRotationPoint(12F, 1F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[124].setRotationPoint(-13F, 1F, 11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 19, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[125].setRotationPoint(-32F, 1F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 19, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[126].setRotationPoint(13F, 1F, 11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[127].setRotationPoint(12F, 1F, 11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[128].setRotationPoint(-37F, 3F, -2.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[129].setRotationPoint(32F, 3F, -2.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 14, 3, 22, 0F); // Box 489
		bodyModel[130].setRotationPoint(-8F, 3F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[131].setRotationPoint(-8F, 2F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[132].setRotationPoint(-8F, 6F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 14, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[133].setRotationPoint(-8F, 6F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[134].setRotationPoint(-8F, 2F, 8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[135].setRotationPoint(-8F, 6F, 9F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[136].setRotationPoint(-6F, 2F, -11.25F);
		bodyModel[136].rotateAngleX = 1.02974426F;

		bodyModel[137].addBox(0F, 0F, 0F, 14, 1, 16, 0F); // Box 559
		bodyModel[137].setRotationPoint(-8F, 2F, -8F);

		bodyModel[138].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[138].setRotationPoint(-6F, 2F, 11.25F);
		bodyModel[138].rotateAngleX = 1.02974426F;
		bodyModel[138].rotateAngleY = -3.14159265F;

		bodyModel[139].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[139].setRotationPoint(-3F, 1.3F, -9.5F);
		bodyModel[139].rotateAngleX = 0.78539816F;

		bodyModel[140].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[140].setRotationPoint(-3F, 1.3F, 9.5F);
		bodyModel[140].rotateAngleX = 0.78539816F;

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 811
		bodyModel[141].setRotationPoint(-37F, 1F, -7F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 812
		bodyModel[142].setRotationPoint(36F, 1F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[143].setRotationPoint(-30F, -2F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 45
		bodyModel[144].setRotationPoint(-30F, -4F, 7F);

		bodyModel[145].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 56
		bodyModel[145].setRotationPoint(-29F, -4F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[146].setRotationPoint(-31F, -4F, -11F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[147].setRotationPoint(-33F, -10F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 81
		bodyModel[148].setRotationPoint(-33F, -10F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[149].setRotationPoint(-33F, -8F, -11.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[150].setRotationPoint(-30F, -11F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[151].setRotationPoint(-33F, -10F, 10.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[152].setRotationPoint(-33F, -12F, 9F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 191
		bodyModel[153].setRotationPoint(-31F, -9F, -11.01F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 227
		bodyModel[154].setRotationPoint(-30F, -11F, 11F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 293
		bodyModel[155].setRotationPoint(-28F, -12F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Box 258
		bodyModel[156].setRotationPoint(-33F, -12F, 11F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 300
		bodyModel[157].setRotationPoint(-31F, -2F, 7F);

		bodyModel[158].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276 gp38/39 fan
		bodyModel[158].setRotationPoint(22.25F, -22.25F, -3F);

		bodyModel[159].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277 gp38/39 fan
		bodyModel[159].setRotationPoint(13.75F, -22.25F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[160].setRotationPoint(-26F, -17F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[161].setRotationPoint(-10F, -4F, 11F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[162].setRotationPoint(-11F, -2F, 7F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[163].setRotationPoint(-12F, -4F, 11F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[164].setRotationPoint(-12F, -4F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[165].setRotationPoint(-10F, -22F, -5.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 gp39/40 exhaust
		bodyModel[166].setRotationPoint(-0.5F, -22.5F, -2.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[167].setRotationPoint(-2F, -21.5F, -4F);

		bodyModel[168].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[168].setRotationPoint(-7F, -8F, 11F);

		bodyModel[169].addBox(0F, 0F, 0F, 27, 8, 0, 0F); // Box 176
		bodyModel[169].setRotationPoint(-10F, -10F, -11F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[170].setRotationPoint(33F, -8F, 9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[171].setRotationPoint(33F, -6F, 10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[172].setRotationPoint(33F, -6F, -11.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[173].setRotationPoint(33F, -8F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[174].setRotationPoint(-12F, -12F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[175].setRotationPoint(17F, -10F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 316
		bodyModel[176].setRotationPoint(19F, -8F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[177].setRotationPoint(-12F, -12F, 11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[178].setRotationPoint(-11F, -12F, 11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[179].setRotationPoint(-8F, -8F, 11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[180].setRotationPoint(-37.01F, -7F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[181].setRotationPoint(-37.01F, -7F, 7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[182].setRotationPoint(37.01F, -7F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[183].setRotationPoint(37.01F, -7F, -8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[184].setRotationPoint(-12F, -21F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[185].setRotationPoint(-3F, -21F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[186].setRotationPoint(-12F, -21F, 7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[187].setRotationPoint(-3F, -21F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[188].setRotationPoint(-21F, -18F, 11F);
		bodyModel[188].rotateAngleX = 0.26179939F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[189].setRotationPoint(-21F, -18.25F, -11.97F);
		bodyModel[189].rotateAngleX = -0.26179939F;

		bodyModel[190].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412 cs
		bodyModel[190].setRotationPoint(-23F, -13F, -3F);

		bodyModel[191].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413 cs
		bodyModel[191].setRotationPoint(-23.1F, -12F, -5F);
		bodyModel[191].rotateAngleY = -0.38397244F;

		bodyModel[192].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[192].setRotationPoint(-21.5F, -14F, -5F);
		bodyModel[192].rotateAngleY = -0.38397244F;

		bodyModel[193].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[193].setRotationPoint(-20.5F, -16.25F, -4F);
		bodyModel[193].rotateAngleY = 0.78539816F;

		bodyModel[194].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[194].setRotationPoint(-20.5F, -16.25F, -4F);
		bodyModel[194].rotateAngleY = 0.78539816F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[195].setRotationPoint(-37.5F, -2F, 4.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[196].setRotationPoint(-37.5F, -2F, -6.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front a
		bodyModel[197].setRotationPoint(-37.75F, -2F, 4.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front a
		bodyModel[198].setRotationPoint(-37.75F, -2F, -6.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[199].setRotationPoint(36.5F, -2F, -6.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear a
		bodyModel[200].setRotationPoint(36.75F, -2F, -6.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear a
		bodyModel[201].setRotationPoint(36.75F, -2F, 4.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[202].setRotationPoint(36.5F, -2F, 4.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[203].setRotationPoint(-37.5F, 0F, 6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 251 ditchlight front b
		bodyModel[204].setRotationPoint(-37.75F, 0F, 6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 ditchlight front b
		bodyModel[205].setRotationPoint(-37.75F, 0F, -8F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[206].setRotationPoint(-37.5F, 0F, -8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[207].setRotationPoint(36.5F, 0F, 6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255
		bodyModel[208].setRotationPoint(36.5F, 0F, -8F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear b
		bodyModel[209].setRotationPoint(36.75F, 0F, -8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257 ditchlight rear b
		bodyModel[210].setRotationPoint(36.75F, 0F, 6F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348 cull
		bodyModel[211].setRotationPoint(-37.5F, 1F, -5.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 ditchlight front c
		bodyModel[212].setRotationPoint(-37.75F, 1F, -5.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350 ditchlight front c
		bodyModel[213].setRotationPoint(-37.75F, 1F, 3.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351 cull
		bodyModel[214].setRotationPoint(-37.5F, 1F, 3.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352 cull
		bodyModel[215].setRotationPoint(36.5F, 1F, -5.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 353 cull
		bodyModel[216].setRotationPoint(36.5F, 1F, 3.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 354 ditchlight rear c
		bodyModel[217].setRotationPoint(36.75F, 1F, 3.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 ditchlight rear c
		bodyModel[218].setRotationPoint(36.75F, 1F, -5.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[219].setRotationPoint(-11.5F, -19.25F, -8.7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[220].setRotationPoint(-11.5F, -20.25F, -8.7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[221].setRotationPoint(-11.25F, -18.75F, -8.45F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[222].setRotationPoint(-11.5F, -21.25F, -8.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[223].setRotationPoint(-21F, -16F, -12F);

		bodyModel[224].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[224].setRotationPoint(-21F, -16F, 11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[225].setRotationPoint(-21F, -17F, 10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[226].setRotationPoint(-21F, -18F, 10F);

		bodyModel[227].addShapeBox(0F, 0F, -2F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087 cull
		bodyModel[227].setRotationPoint(-21F, -17F, -13F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[228].setRotationPoint(-21F, -18F, -13F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[229].setRotationPoint(10F, -22F, -1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[230].setRotationPoint(-22F, -22F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[231].setRotationPoint(-22F, -22.5F, -7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[232].setRotationPoint(-22F, -22.5F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[233].setRotationPoint(-22F, -22.5F, -7F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[234].setRotationPoint(-22F, -22.5F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[235].setRotationPoint(-24.5F, -23F, -3.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[236].setRotationPoint(-23.5F, -23F, -3.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[237].setRotationPoint(-41F, 7F, 0F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[238].setRotationPoint(-41F, 7F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[239].setRotationPoint(-40F, 6F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[240].setRotationPoint(-40F, 6F, -10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[241].setRotationPoint(-40F, 6F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[242].setRotationPoint(-40F, 6F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[243].setRotationPoint(-40F, 5F, 2F);

		bodyModel[244].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[244].setRotationPoint(-40F, 5F, -8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 1163
		bodyModel[245].setRotationPoint(40F, 7F, 0F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1164
		bodyModel[246].setRotationPoint(40F, 7F, -10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1165
		bodyModel[247].setRotationPoint(39F, 6F, 0F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1166
		bodyModel[248].setRotationPoint(39F, 6F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1167
		bodyModel[249].setRotationPoint(37F, 6F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1168
		bodyModel[250].setRotationPoint(37F, 6F, 0F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1169
		bodyModel[251].setRotationPoint(39F, 5F, 2F);

		bodyModel[252].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1170
		bodyModel[252].setRotationPoint(39F, 5F, -8F);

		bodyModel[253].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[253].setRotationPoint(-20.5F, -23F, -2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[254].setRotationPoint(-21.5F, -23F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 366
		bodyModel[255].setRotationPoint(-21.5F, -22F, -2F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 342
		bodyModel[256].setRotationPoint(-24.75F, -22.5F, -0.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 343
		bodyModel[257].setRotationPoint(-25.75F, -22.5F, 0.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 344
		bodyModel[258].setRotationPoint(-26.75F, -22.5F, -1.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 345
		bodyModel[259].setRotationPoint(-24.75F, -21.5F, -0.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203
		bodyModel[260].setRotationPoint(-29F, -8F, 7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[261].setRotationPoint(-32.65F, -12F, -6.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[262].setRotationPoint(-32.65F, -12F, 4.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[263].setRotationPoint(30.65F, -12F, -6.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[264].setRotationPoint(30.65F, -12F, 4.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[265].setRotationPoint(-33F, -13.5F, -1F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 446
		bodyModel[266].setRotationPoint(-16F, -23F, 3F);

		bodyModel[267].addBox(0F, 0F, 0F, 12, 2, 9, 0F); // Box 196 winterization hatch cull
		bodyModel[267].setRotationPoint(9F, -23F, -4.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[268].setRotationPoint(-37F, 8F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[269].setRotationPoint(-37F, 5F, -10F);

		bodyModel[270].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[270].setRotationPoint(-37F, 7F, -9F);

		bodyModel[271].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[271].setRotationPoint(-37F, 4F, -8F);

		bodyModel[272].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[272].setRotationPoint(33F, 4F, -8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[273].setRotationPoint(33F, 5F, -10F);

		bodyModel[274].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[274].setRotationPoint(33F, 7F, -9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[275].setRotationPoint(33F, 8F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[276].setRotationPoint(33F, 3F, -9F);

		bodyModel[277].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[277].setRotationPoint(33F, 0F, -8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[278].setRotationPoint(-37F, 3F, 7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[279].setRotationPoint(-37F, 0F, 7F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[280].setRotationPoint(-37F, 5F, 8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[281].setRotationPoint(-37F, 8F, 9F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[282].setRotationPoint(-37F, 7F, 9F);

		bodyModel[283].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[283].setRotationPoint(-37F, 4F, 8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[284].setRotationPoint(33F, 3F, 7F);

		bodyModel[285].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 554
		bodyModel[285].setRotationPoint(33F, 0F, 7F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[286].setRotationPoint(33F, 4F, 8F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 556
		bodyModel[287].setRotationPoint(33F, 5F, 8F);

		bodyModel[288].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[288].setRotationPoint(33F, 7F, 9F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[289].setRotationPoint(33F, 8F, 9F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[290].setRotationPoint(-37F, -8F, 9F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[291].setRotationPoint(37F, -8F, 9F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[292].setRotationPoint(37F, -8F, -8F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[293].setRotationPoint(-23F, -11F, -4F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[294].setRotationPoint(-11F, 1F, 8.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 178
		bodyModel[295].setRotationPoint(-30F, -4F, -11F);
	}
	ModelSDL39Truck theTrucks = new ModelSDL39Truck();

	//fuf
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/sdl39_lightweight_truck.png"));

		GL11.glPushMatrix();
		GL11.glTranslatef(-1.55F, -0.0F, 0F);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.55F, -0.0F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}