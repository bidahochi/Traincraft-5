//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: sd70m
// Model Creator: bidahochi
// Created on: 15.02.2025 - 14:06:03
// Last changed on: 15.02.2025 - 14:06:03

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelHTCR2_new;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

public class ModelSD70M extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD70M() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[455];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 8, 145, textureX, textureY); // Box 226
		bodyModel[1] = new ModelRendererTurbo(this, 236, 84, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 6, 132, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 2, 226, textureX, textureY); // Box 23
		bodyModel[4] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 63
		bodyModel[5] = new ModelRendererTurbo(this, 233, 90, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 439, 155, textureX, textureY); // Box 225
		bodyModel[7] = new ModelRendererTurbo(this, 236, 84, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 437, 142, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 226, 86, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 226, 86, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 238, 84, textureX, textureY); // Box 170
		bodyModel[12] = new ModelRendererTurbo(this, 260, 78, textureX, textureY); // Box 159
		bodyModel[13] = new ModelRendererTurbo(this, 260, 101, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 232, 150, textureX, textureY); // Box 489
		bodyModel[15] = new ModelRendererTurbo(this, 251, 122, textureX, textureY); // Box 278 early fuel tank
		bodyModel[16] = new ModelRendererTurbo(this, 235, 176, textureX, textureY); // Box 288
		bodyModel[17] = new ModelRendererTurbo(this, 251, 122, textureX, textureY); // Box 315 early fuel tank
		bodyModel[18] = new ModelRendererTurbo(this, 305, 172, textureX, textureY); // Box 564
		bodyModel[19] = new ModelRendererTurbo(this, 301, 146, textureX, textureY); // Box 566
		bodyModel[20] = new ModelRendererTurbo(this, 301, 120, textureX, textureY); // Box 567 early fuel tank
		bodyModel[21] = new ModelRendererTurbo(this, 301, 128, textureX, textureY); // Box 568
		bodyModel[22] = new ModelRendererTurbo(this, 301, 120, textureX, textureY); // Box 569 early fuel tank
		bodyModel[23] = new ModelRendererTurbo(this, 306, 137, textureX, textureY); // Box 19 filler up please
		bodyModel[24] = new ModelRendererTurbo(this, 301, 137, textureX, textureY); // Box 560 filler up please
		bodyModel[25] = new ModelRendererTurbo(this, 312, 132, textureX, textureY); // Box 380 fuel tank gauge
		bodyModel[26] = new ModelRendererTurbo(this, 312, 132, textureX, textureY); // Box 381 fuel tank gauge
		bodyModel[27] = new ModelRendererTurbo(this, 262, 112, textureX, textureY); // Box airtank
		bodyModel[28] = new ModelRendererTurbo(this, 262, 107, textureX, textureY); // Box airtank
		bodyModel[29] = new ModelRendererTurbo(this, 455, 108, textureX, textureY); // Box 318 sandcap rear roof
		bodyModel[30] = new ModelRendererTurbo(this, 456, 112, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[31] = new ModelRendererTurbo(this, 456, 112, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[32] = new ModelRendererTurbo(this, 453, 117, textureX, textureY); // Box 31 i dont care who cubed sends im not raising this headlight
		bodyModel[33] = new ModelRendererTurbo(this, 249, 44, textureX, textureY); // Box 34 the hooH
		bodyModel[34] = new ModelRendererTurbo(this, 438, 117, textureX, textureY); // Box 7
		bodyModel[35] = new ModelRendererTurbo(this, 460, 117, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 470, 109, textureX, textureY, "numberboard").setLightFixtureId("rear_numberboard_body_36"); // Box 115 numberboard rear
		bodyModel[37] = new ModelRendererTurbo(this, 470, 109, textureX, textureY, "numberboard").setLightFixtureId("rear_numberboard_body_37"); // Box 116 numberboard rear
		bodyModel[38] = new ModelRendererTurbo(this, 463, 112, textureX, textureY, "marker").setLightFixtureId("rear_marker_low"); // Box 71 markerlight rear low
		bodyModel[39] = new ModelRendererTurbo(this, 463, 112, textureX, textureY, "lamp"); // Box 1208 makrerlight rear low
		bodyModel[40] = new ModelRendererTurbo(this, 449, 112, textureX, textureY, "marker").setLightFixtureId("rear_marker_high"); // Box 71 markerlight rear high
		bodyModel[41] = new ModelRendererTurbo(this, 449, 112, textureX, textureY, "lamp"); // Box 1208 makrerlight rear high
		bodyModel[42] = new ModelRendererTurbo(this, 461, 22, textureX, textureY); // Box 298 ph1 radiator grill
		bodyModel[43] = new ModelRendererTurbo(this, 483, 12, textureX, textureY); // Box 704 radiator fan
		bodyModel[44] = new ModelRendererTurbo(this, 439, 12, textureX, textureY); // Box 705 radiator fan
		bodyModel[45] = new ModelRendererTurbo(this, 461, 9, textureX, textureY); // Box 706 radiator fan
		bodyModel[46] = new ModelRendererTurbo(this, 487, 5, textureX, textureY); // Box 715 radiator fan
		bodyModel[47] = new ModelRendererTurbo(this, 443, 5, textureX, textureY); // Box 234 radiator fan
		bodyModel[48] = new ModelRendererTurbo(this, 465, 2, textureX, textureY); // Box 235 radiator fan
		bodyModel[49] = new ModelRendererTurbo(this, 461, 22, textureX, textureY); // Box 430 ph1 radiator grill
		bodyModel[50] = new ModelRendererTurbo(this, 461, 22, textureX, textureY); // Box 431 ph1 radiator grill
		bodyModel[51] = new ModelRendererTurbo(this, 461, 22, textureX, textureY); // Box 432 ph1 radiator grill
		bodyModel[52] = new ModelRendererTurbo(this, 392, 22, textureX, textureY, "cull"); // Box 69 cull radiator fan container thing
		bodyModel[53] = new ModelRendererTurbo(this, 408, 5, textureX, textureY); // ehaust silencer
		bodyModel[54] = new ModelRendererTurbo(this, 394, 2, textureX, textureY); // Box 274 exhausting
		bodyModel[55] = new ModelRendererTurbo(this, 344, 108, textureX, textureY, "cull"); // Box 677 cull vent sus
		bodyModel[56] = new ModelRendererTurbo(this, 367, 7, textureX, textureY); // Box 700
		bodyModel[57] = new ModelRendererTurbo(this, 325, 1, textureX, textureY); // Box 402 dyn fan
		bodyModel[58] = new ModelRendererTurbo(this, 411, 108, textureX, textureY); // Box 674 dynamic grid
		bodyModel[59] = new ModelRendererTurbo(this, 396, 107, textureX, textureY); // Box 675
		bodyModel[60] = new ModelRendererTurbo(this, 400, 114, textureX, textureY); // Box 676
		bodyModel[61] = new ModelRendererTurbo(this, 399, 12, textureX, textureY); // Box 286
		bodyModel[62] = new ModelRendererTurbo(this, 399, 12, textureX, textureY); // Box 285
		bodyModel[63] = new ModelRendererTurbo(this, 216, 26, textureX, textureY); // Box 83
		bodyModel[64] = new ModelRendererTurbo(this, 288, 29, textureX, textureY); // Box 84 engine hood roof phase 1-2a
		bodyModel[65] = new ModelRendererTurbo(this, 460, 153, textureX, textureY, "cull"); // Box 386 anticlimber b
		bodyModel[66] = new ModelRendererTurbo(this, 436, 153, textureX, textureY, "cull"); // Box 387 anticlimber b
		bodyModel[67] = new ModelRendererTurbo(this, 29, 143, textureX, textureY, "cull"); // Box 386 anticlimber b
		bodyModel[68] = new ModelRendererTurbo(this, 5, 143, textureX, textureY, "cull"); // Box 387 anticlimber b
		bodyModel[69] = new ModelRendererTurbo(this, 314, 10, textureX, textureY); // Box 89 dustbin hatch
		bodyModel[70] = new ModelRendererTurbo(this, 238, 132, textureX, textureY); // Box 559
		bodyModel[71] = new ModelRendererTurbo(this, 1, 220, textureX, textureY); // Box 282
		bodyModel[72] = new ModelRendererTurbo(this, 24, 220, textureX, textureY); // Box 283
		bodyModel[73] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 4
		bodyModel[74] = new ModelRendererTurbo(this, 1, 213, textureX, textureY); // Box 448
		bodyModel[75] = new ModelRendererTurbo(this, 24, 217, textureX, textureY); // Box 322
		bodyModel[76] = new ModelRendererTurbo(this, 28, 213, textureX, textureY); // Box 323
		bodyModel[77] = new ModelRendererTurbo(this, 1, 207, textureX, textureY); // Box 280
		bodyModel[78] = new ModelRendererTurbo(this, 28, 207, textureX, textureY); // Box 285
		bodyModel[79] = new ModelRendererTurbo(this, 1, 210, textureX, textureY); // Box 361
		bodyModel[80] = new ModelRendererTurbo(this, 28, 210, textureX, textureY); // Box 362
		bodyModel[81] = new ModelRendererTurbo(this, 38, 158, textureX, textureY); // Box 274
		bodyModel[82] = new ModelRendererTurbo(this, 53, 188, textureX, textureY); // Box 272
		bodyModel[83] = new ModelRendererTurbo(this, 53, 183, textureX, textureY); // Box 273
		bodyModel[84] = new ModelRendererTurbo(this, 257, 102, textureX, textureY); // Box 244
		bodyModel[85] = new ModelRendererTurbo(this, 249, 102, textureX, textureY); // Box 245
		bodyModel[86] = new ModelRendererTurbo(this, 85, 170, textureX, textureY); // Box 248
		bodyModel[87] = new ModelRendererTurbo(this, 53, 178, textureX, textureY); // Box 249
		bodyModel[88] = new ModelRendererTurbo(this, 83, 173, textureX, textureY, "cull"); // Box 251 cull stairs
		bodyModel[89] = new ModelRendererTurbo(this, 55, 186, textureX, textureY); // Box 253
		bodyModel[90] = new ModelRendererTurbo(this, 55, 181, textureX, textureY); // Box 254
		bodyModel[91] = new ModelRendererTurbo(this, 56, 176, textureX, textureY); // Box 255
		bodyModel[92] = new ModelRendererTurbo(this, 233, 90, textureX, textureY); // Box 256
		bodyModel[93] = new ModelRendererTurbo(this, 83, 179, textureX, textureY, "cull"); // Box 257 cull stairs
		bodyModel[94] = new ModelRendererTurbo(this, 62, 188, textureX, textureY); // Box 258
		bodyModel[95] = new ModelRendererTurbo(this, 62, 183, textureX, textureY); // Box 259
		bodyModel[96] = new ModelRendererTurbo(this, 76, 170, textureX, textureY); // Box 260
		bodyModel[97] = new ModelRendererTurbo(this, 62, 178, textureX, textureY); // Box 261
		bodyModel[98] = new ModelRendererTurbo(this, 74, 173, textureX, textureY, "cull"); // Box 262 cull stairs
		bodyModel[99] = new ModelRendererTurbo(this, 64, 186, textureX, textureY); // Box 263
		bodyModel[100] = new ModelRendererTurbo(this, 64, 181, textureX, textureY); // Box 264
		bodyModel[101] = new ModelRendererTurbo(this, 65, 176, textureX, textureY); // Box 265
		bodyModel[102] = new ModelRendererTurbo(this, 74, 179, textureX, textureY, "cull"); // Box 266 cull stairs
		bodyModel[103] = new ModelRendererTurbo(this, 257, 79, textureX, textureY); // Box 267
		bodyModel[104] = new ModelRendererTurbo(this, 249, 79, textureX, textureY); // Box 268
		bodyModel[105] = new ModelRendererTurbo(this, 101, 179, textureX, textureY, "cull"); // Box 269 cull stairs
		bodyModel[106] = new ModelRendererTurbo(this, 449, 102, textureX, textureY); // Box 270
		bodyModel[107] = new ModelRendererTurbo(this, 445, 102, textureX, textureY); // Box 271
		bodyModel[108] = new ModelRendererTurbo(this, 103, 170, textureX, textureY); // Box 272
		bodyModel[109] = new ModelRendererTurbo(this, 53, 188, textureX, textureY); // Box 273
		bodyModel[110] = new ModelRendererTurbo(this, 53, 183, textureX, textureY); // Box 274
		bodyModel[111] = new ModelRendererTurbo(this, 53, 178, textureX, textureY); // Box 275
		bodyModel[112] = new ModelRendererTurbo(this, 38, 158, textureX, textureY); // Box 276
		bodyModel[113] = new ModelRendererTurbo(this, 56, 176, textureX, textureY); // Box 277
		bodyModel[114] = new ModelRendererTurbo(this, 55, 181, textureX, textureY); // Box 278
		bodyModel[115] = new ModelRendererTurbo(this, 55, 186, textureX, textureY); // Box 279
		bodyModel[116] = new ModelRendererTurbo(this, 101, 173, textureX, textureY, "cull"); // Box 280 cull stairs
		bodyModel[117] = new ModelRendererTurbo(this, 92, 173, textureX, textureY, "cull"); // Box 281 cull stairs
		bodyModel[118] = new ModelRendererTurbo(this, 92, 179, textureX, textureY, "cull"); // Box 282 cull stairs
		bodyModel[119] = new ModelRendererTurbo(this, 94, 170, textureX, textureY); // Box 283
		bodyModel[120] = new ModelRendererTurbo(this, 62, 188, textureX, textureY); // Box 284
		bodyModel[121] = new ModelRendererTurbo(this, 64, 186, textureX, textureY); // Box 285
		bodyModel[122] = new ModelRendererTurbo(this, 62, 183, textureX, textureY); // Box 286
		bodyModel[123] = new ModelRendererTurbo(this, 64, 181, textureX, textureY); // Box 287
		bodyModel[124] = new ModelRendererTurbo(this, 65, 176, textureX, textureY); // Box 288
		bodyModel[125] = new ModelRendererTurbo(this, 62, 178, textureX, textureY); // Box 289
		bodyModel[126] = new ModelRendererTurbo(this, 449, 79, textureX, textureY); // Box 290
		bodyModel[127] = new ModelRendererTurbo(this, 445, 79, textureX, textureY); // Box 291
		bodyModel[128] = new ModelRendererTurbo(this, 84, 188, textureX, textureY); // Box 293 dont forget me
		bodyModel[129] = new ModelRendererTurbo(this, 75, 188, textureX, textureY); // Box 294 dont forget me
		bodyModel[130] = new ModelRendererTurbo(this, 102, 188, textureX, textureY); // Box 295 dont forget me
		bodyModel[131] = new ModelRendererTurbo(this, 93, 188, textureX, textureY); // Box 296 dont forget me
		bodyModel[132] = new ModelRendererTurbo(this, 52, 84, textureX, textureY); // Box 442
		bodyModel[133] = new ModelRendererTurbo(this, 112, 41, textureX, textureY); // Box 100
		bodyModel[134] = new ModelRendererTurbo(this, 149, 54, textureX, textureY); // Box 314 door swing right shortcab
		bodyModel[135] = new ModelRendererTurbo(this, 114, 165, textureX, textureY); // Box 137
		bodyModel[136] = new ModelRendererTurbo(this, 167, 57, textureX, textureY); // Box 72 cab wall engineer
		bodyModel[137] = new ModelRendererTurbo(this, 78, 57, textureX, textureY); // Box 154 cab wall fireman
		bodyModel[138] = new ModelRendererTurbo(this, 33, 165, textureX, textureY); // Box 445 handrail ph1b+
		bodyModel[139] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 446 handrail ph1b+
		bodyModel[140] = new ModelRendererTurbo(this, 15, 47, textureX, textureY); // Box 174
		bodyModel[141] = new ModelRendererTurbo(this, 19, 46, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 182
		bodyModel[143] = new ModelRendererTurbo(this, 9, 110, textureX, textureY); // Box 188
		bodyModel[144] = new ModelRendererTurbo(this, 67, 103, textureX, textureY); // Box 193
		bodyModel[145] = new ModelRendererTurbo(this, 44, 99, textureX, textureY); // Box 194
		bodyModel[146] = new ModelRendererTurbo(this, 10, 99, textureX, textureY); // Box 196
		bodyModel[147] = new ModelRendererTurbo(this, 21, 76, textureX, textureY); // Box 201
		bodyModel[148] = new ModelRendererTurbo(this, 1, 103, textureX, textureY); // Box 205
		bodyModel[149] = new ModelRendererTurbo(this, 44, 47, textureX, textureY); // Box 206
		bodyModel[150] = new ModelRendererTurbo(this, 26, 84, textureX, textureY); // Box 211
		bodyModel[151] = new ModelRendererTurbo(this, 91, 78, textureX, textureY); // Box 215
		bodyModel[152] = new ModelRendererTurbo(this, 117, 78, textureX, textureY); // Box 216
		bodyModel[153] = new ModelRendererTurbo(this, 106, 79, textureX, textureY); // Box 217
		bodyModel[154] = new ModelRendererTurbo(this, 80, 82, textureX, textureY); // Box 218
		bodyModel[155] = new ModelRendererTurbo(this, 80, 76, textureX, textureY); // Box 219
		bodyModel[156] = new ModelRendererTurbo(this, 132, 82, textureX, textureY); // Box 220
		bodyModel[157] = new ModelRendererTurbo(this, 132, 76, textureX, textureY); // Box 221
		bodyModel[158] = new ModelRendererTurbo(this, 196, 57, textureX, textureY); // Box 224 cab wall bit
		bodyModel[159] = new ModelRendererTurbo(this, 69, 57, textureX, textureY); // Box 228 cab wall bit
		bodyModel[160] = new ModelRendererTurbo(this, 29, 52, textureX, textureY); // Box 225
		bodyModel[161] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 226
		bodyModel[162] = new ModelRendererTurbo(this, 43, 20, textureX, textureY); // Box 229
		bodyModel[163] = new ModelRendererTurbo(this, 59, 46, textureX, textureY); // Box 230
		bodyModel[164] = new ModelRendererTurbo(this, 149, 47, textureX, textureY); // Box 150 door swing right shortcab
		bodyModel[165] = new ModelRendererTurbo(this, 54, 14, textureX, textureY); // Box 232
		bodyModel[166] = new ModelRendererTurbo(this, 80, 36, textureX, textureY); // Box 233
		bodyModel[167] = new ModelRendererTurbo(this, 53, 36, textureX, textureY); // Box 234
		bodyModel[168] = new ModelRendererTurbo(this, 40, 7, textureX, textureY); // Box 235
		bodyModel[169] = new ModelRendererTurbo(this, 40, 36, textureX, textureY); // Box 236
		bodyModel[170] = new ModelRendererTurbo(this, 37, 14, textureX, textureY); // Box 237 cab forehead
		bodyModel[171] = new ModelRendererTurbo(this, 37, 24, textureX, textureY); // Box 238 cab forehead
		bodyModel[172] = new ModelRendererTurbo(this, 11, 50, textureX, textureY); // Box 31 high mounted headlight holder
		bodyModel[173] = new ModelRendererTurbo(this, 8, 49, textureX, textureY, "lamp"); // Box 247 headlight cab
		bodyModel[174] = new ModelRendererTurbo(this, 1, 49, textureX, textureY, "lamp"); // Box 248 headlight cab
		bodyModel[175] = new ModelRendererTurbo(this, 1, 37, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_175"); // Box 242 cab numberboard
		bodyModel[176] = new ModelRendererTurbo(this, 1, 37, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_176"); // Box 243 cab numberboard
		bodyModel[177] = new ModelRendererTurbo(this, 59, 42, textureX, textureY); // Box 244
		bodyModel[178] = new ModelRendererTurbo(this, 166, 176, textureX, textureY); // Box 245
		bodyModel[179] = new ModelRendererTurbo(this, 208, 180, textureX, textureY); // Box 495
		bodyModel[180] = new ModelRendererTurbo(this, 205, 180, textureX, textureY); // Box 498
		bodyModel[181] = new ModelRendererTurbo(this, 163, 167, textureX, textureY); // Box 248
		bodyModel[182] = new ModelRendererTurbo(this, 162, 171, textureX, textureY); // Box 249
		bodyModel[183] = new ModelRendererTurbo(this, 228, 61, textureX, textureY); // Box 483 sd70m blower
		bodyModel[184] = new ModelRendererTurbo(this, 481, 31, textureX, textureY); // Box 251 the little small vent on the firemans side
		bodyModel[185] = new ModelRendererTurbo(this, 211, 180, textureX, textureY); // Box 252
		bodyModel[186] = new ModelRendererTurbo(this, 161, 175, textureX, textureY); // Box 254
		bodyModel[187] = new ModelRendererTurbo(this, 161, 175, textureX, textureY); // Box 255
		bodyModel[188] = new ModelRendererTurbo(this, 78, 114, textureX, textureY); // Box 256 door schnoz
		bodyModel[189] = new ModelRendererTurbo(this, 78, 132, textureX, textureY); // Box 257 door schnoz
		bodyModel[190] = new ModelRendererTurbo(this, 85, 113, textureX, textureY); // Box 258 door schnoz
		bodyModel[191] = new ModelRendererTurbo(this, 75, 114, textureX, textureY); // Box 259 door schnoz
		bodyModel[192] = new ModelRendererTurbo(this, 67, 97, textureX, textureY); // Box 271
		bodyModel[193] = new ModelRendererTurbo(this, 45, 93, textureX, textureY); // Box 272
		bodyModel[194] = new ModelRendererTurbo(this, 67, 90, textureX, textureY); // Box 273
		bodyModel[195] = new ModelRendererTurbo(this, 39, 99, textureX, textureY, "lamp"); // Box 274 headlight nose
		bodyModel[196] = new ModelRendererTurbo(this, 39, 99, textureX, textureY, "lamp"); // Box 275 headlight nose
		bodyModel[197] = new ModelRendererTurbo(this, 46, 99, textureX, textureY, "cull"); // Box 276 cull nose headlight cutout
		bodyModel[198] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Box 278
		bodyModel[199] = new ModelRendererTurbo(this, 15, 93, textureX, textureY); // Box 279
		bodyModel[200] = new ModelRendererTurbo(this, 7, 90, textureX, textureY); // Box 280
		bodyModel[201] = new ModelRendererTurbo(this, 34, 99, textureX, textureY, "cull"); // Box 281 cull nose headlight cutout
		bodyModel[202] = new ModelRendererTurbo(this, 40, 96, textureX, textureY, "marker").setLightFixtureId("front_marker_bugeye_body_202"); // Box 364 markerlight bugeye front
		bodyModel[203] = new ModelRendererTurbo(this, 40, 96, textureX, textureY, "marker").setLightFixtureId("front_marker_bugeye_body_203"); // Box 283 markerlight bugeye front
		bodyModel[204] = new ModelRendererTurbo(this, 38, 91, textureX, textureY); // Box 351 sandcap nose
		bodyModel[205] = new ModelRendererTurbo(this, 38, 91, textureX, textureY); // Box 285 sandcap nose
		bodyModel[206] = new ModelRendererTurbo(this, 247, 114, textureX, textureY); // Box 440 bogie mount
		bodyModel[207] = new ModelRendererTurbo(this, 247, 114, textureX, textureY); // Box 424 bogie mount
		bodyModel[208] = new ModelRendererTurbo(this, 306, 247, textureX, textureY); // Box 220 ph2 radiator
		bodyModel[209] = new ModelRendererTurbo(this, 403, 227, textureX, textureY); // Box 221 ph2 radiator
		bodyModel[210] = new ModelRendererTurbo(this, 403, 223, textureX, textureY); // Box 223 ph2 radiator
		bodyModel[211] = new ModelRendererTurbo(this, 305, 238, textureX, textureY); // Box 225 ph2 radiator
		bodyModel[212] = new ModelRendererTurbo(this, 332, 219, textureX, textureY, "cull"); // Box 297 cull ph2 radiator container housing thing
		bodyModel[213] = new ModelRendererTurbo(this, 419, 231, textureX, textureY); // Box 298 ph2 radiator grill
		bodyModel[214] = new ModelRendererTurbo(this, 419, 231, textureX, textureY); // Box 299 ph2 radiator grill
		bodyModel[215] = new ModelRendererTurbo(this, 365, 240, textureX, textureY); // Box 84 engine hood roof phase 2d+
		bodyModel[216] = new ModelRendererTurbo(this, 339, 223, textureX, textureY); // Box 301 i think emd should be put out in the field and fucking shot
		bodyModel[217] = new ModelRendererTurbo(this, 330, 223, textureX, textureY); // Box 302who the fuck thought this was a good idea fr
		bodyModel[218] = new ModelRendererTurbo(this, 419, 231, textureX, textureY); // Box 303 ph2 radiator grill
		bodyModel[219] = new ModelRendererTurbo(this, 419, 231, textureX, textureY); // Box 304 ph2 radiator grill
		bodyModel[220] = new ModelRendererTurbo(this, 293, 235, textureX, textureY); // Box 305 ph2 radiator
		bodyModel[221] = new ModelRendererTurbo(this, 295, 232, textureX, textureY); // Box 306 ph2 radiator
		bodyModel[222] = new ModelRendererTurbo(this, 412, 19, textureX, textureY); // Box 307 ph1 radiator fan spacer housing
		bodyModel[223] = new ModelRendererTurbo(this, 412, 19, textureX, textureY); // Box 308 ph1 radiator fan spacer housing
		bodyModel[224] = new ModelRendererTurbo(this, 388, 237, textureX, textureY); // Box 307 ph2 radiator fan spacer housing
		bodyModel[225] = new ModelRendererTurbo(this, 388, 237, textureX, textureY); // Box 308 ph2 radiator fan spacer housing
		bodyModel[226] = new ModelRendererTurbo(this, 438, 119, textureX, textureY, "cull"); // Box 507 cull notcher sand filler
		bodyModel[227] = new ModelRendererTurbo(this, 431, 119, textureX, textureY, "cull"); // Box 508 cull notched sand filler
		bodyModel[228] = new ModelRendererTurbo(this, 430, 131, textureX, textureY); // Box 509 notched sand filler bit
		bodyModel[229] = new ModelRendererTurbo(this, 430, 128, textureX, textureY); // Box 510 notched sand filler bit
		bodyModel[230] = new ModelRendererTurbo(this, 429, 124, textureX, textureY); // Box 315 notched sand cab
		bodyModel[231] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 355 take a brake (wheel)
		bodyModel[232] = new ModelRendererTurbo(this, 428, 40, textureX, textureY); // Box 110 i guess
		bodyModel[233] = new ModelRendererTurbo(this, 410, 43, textureX, textureY); // Box 118 brakewheel spindle
		bodyModel[234] = new ModelRendererTurbo(this, 410, 47, textureX, textureY); // Box 321
		bodyModel[235] = new ModelRendererTurbo(this, 432, 47, textureX, textureY); // Box 322
		bodyModel[236] = new ModelRendererTurbo(this, 417, 47, textureX, textureY, "cull"); // Box 323 cull hood brake cutout
		bodyModel[237] = new ModelRendererTurbo(this, 214, 115, textureX, textureY); // Box 615 htcr truck mount
		bodyModel[238] = new ModelRendererTurbo(this, 221, 115, textureX, textureY); // Box 616 htcr truck mount
		bodyModel[239] = new ModelRendererTurbo(this, 199, 119, textureX, textureY); // Box 617 htcr truck mount
		bodyModel[240] = new ModelRendererTurbo(this, 239, 115, textureX, textureY); // Box 619 htcr truck mount
		bodyModel[241] = new ModelRendererTurbo(this, 206, 106, textureX, textureY); // Box 468
		bodyModel[242] = new ModelRendererTurbo(this, 211, 93, textureX, textureY); // Box 291 dont forget
		bodyModel[243] = new ModelRendererTurbo(this, 206, 101, textureX, textureY); // Box 471
		bodyModel[244] = new ModelRendererTurbo(this, 230, 115, textureX, textureY); // Box 472
		bodyModel[245] = new ModelRendererTurbo(this, 206, 101, textureX, textureY); // Box 473
		bodyModel[246] = new ModelRendererTurbo(this, 214, 115, textureX, textureY); // Box 615 htcr truck mount
		bodyModel[247] = new ModelRendererTurbo(this, 221, 115, textureX, textureY); // Box 616 htcr truck mount
		bodyModel[248] = new ModelRendererTurbo(this, 199, 119, textureX, textureY); // Box 617 htcr truck mount
		bodyModel[249] = new ModelRendererTurbo(this, 239, 115, textureX, textureY); // Box 619 htcr truck mount
		bodyModel[250] = new ModelRendererTurbo(this, 206, 106, textureX, textureY); // Box 468
		bodyModel[251] = new ModelRendererTurbo(this, 211, 93, textureX, textureY); // Box 291 dont forget
		bodyModel[252] = new ModelRendererTurbo(this, 230, 115, textureX, textureY); // Box 472
		bodyModel[253] = new ModelRendererTurbo(this, 227, 6, textureX, textureY); // Box 570 ane horn
		bodyModel[254] = new ModelRendererTurbo(this, 227, 12, textureX, textureY); // Box 567 ane horn
		bodyModel[255] = new ModelRendererTurbo(this, 222, 9, textureX, textureY); // Box 895 ane horn
		bodyModel[256] = new ModelRendererTurbo(this, 227, 9, textureX, textureY); // Box 894 ane horn
		bodyModel[257] = new ModelRendererTurbo(this, 204, 9, textureX, textureY); // Box 351
		bodyModel[258] = new ModelRendererTurbo(this, 215, 9, textureX, textureY); // Box 352
		bodyModel[259] = new ModelRendererTurbo(this, 206, 12, textureX, textureY); // Box 353
		bodyModel[260] = new ModelRendererTurbo(this, 206, 6, textureX, textureY); // Box 354
		bodyModel[261] = new ModelRendererTurbo(this, 176, 12, textureX, textureY); // Box 332 ane horn
		bodyModel[262] = new ModelRendererTurbo(this, 176, 6, textureX, textureY); // Box 331 ane horn
		bodyModel[263] = new ModelRendererTurbo(this, 183, 9, textureX, textureY); // Box 330 ane horn
		bodyModel[264] = new ModelRendererTurbo(this, 174, 15, textureX, textureY); // Box 329 ane horn
		bodyModel[265] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 328 ane horn
		bodyModel[266] = new ModelRendererTurbo(this, 172, 9, textureX, textureY); // Box 327 ane horn
		bodyModel[267] = new ModelRendererTurbo(this, 450, 109, textureX, textureY, "marker").setLightFixtureId("rear_marker_bugeye_body_267"); // Box 364 markerlight bugeye rear
		bodyModel[268] = new ModelRendererTurbo(this, 450, 109, textureX, textureY, "marker").setLightFixtureId("rear_marker_bugeye_body_268"); // Box 364 markerlight bugeye rear
		bodyModel[269] = new ModelRendererTurbo(this, 30, 146, textureX, textureY); // Box 396
		bodyModel[270] = new ModelRendererTurbo(this, 30, 146, textureX, textureY); // Box 397
		bodyModel[271] = new ModelRendererTurbo(this, 30, 141, textureX, textureY, "ditch"); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[272] = new ModelRendererTurbo(this, 30, 141, textureX, textureY, "ditch"); // Box 399 ditchlight
		bodyModel[273] = new ModelRendererTurbo(this, 133, 202, textureX, textureY); // Box 311
		bodyModel[274] = new ModelRendererTurbo(this, 268, 205, textureX, textureY); // Box 250
		bodyModel[275] = new ModelRendererTurbo(this, 269, 203, textureX, textureY); // Box 542
		bodyModel[276] = new ModelRendererTurbo(this, 267, 202, textureX, textureY); // Box 289
		bodyModel[277] = new ModelRendererTurbo(this, 107, 216, textureX, textureY); // Box 290
		bodyModel[278] = new ModelRendererTurbo(this, 273, 205, textureX, textureY); // Box 291
		bodyModel[279] = new ModelRendererTurbo(this, 274, 203, textureX, textureY); // Box 292
		bodyModel[280] = new ModelRendererTurbo(this, 274, 202, textureX, textureY); // Box 293
		bodyModel[281] = new ModelRendererTurbo(this, 104, 202, textureX, textureY); // Box 294
		bodyModel[282] = new ModelRendererTurbo(this, 101, 202, textureX, textureY); // Box 295
		bodyModel[283] = new ModelRendererTurbo(this, 222, 94, textureX, textureY); // Box 296 some up thing
		bodyModel[284] = new ModelRendererTurbo(this, 312, 137, textureX, textureY); // Box 297 fuel tank gauge
		bodyModel[285] = new ModelRendererTurbo(this, 312, 137, textureX, textureY); // Box 298 fuel tank gauge
		bodyModel[286] = new ModelRendererTurbo(this, 257, 50, textureX, textureY); // Box 78
		bodyModel[287] = new ModelRendererTurbo(this, 257, 47, textureX, textureY); // Box 74
		bodyModel[288] = new ModelRendererTurbo(this, 257, 47, textureX, textureY); // Box 114
		bodyModel[289] = new ModelRendererTurbo(this, 256, 43, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[290] = new ModelRendererTurbo(this, 199, 9, textureX, textureY); // Box 347
		bodyModel[291] = new ModelRendererTurbo(this, 190, 3, textureX, textureY); // Box 348
		bodyModel[292] = new ModelRendererTurbo(this, 188, 9, textureX, textureY); // Box 349
		bodyModel[293] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 350
		bodyModel[294] = new ModelRendererTurbo(this, 252, 110, textureX, textureY); // Box 307 fuel shutoff
		bodyModel[295] = new ModelRendererTurbo(this, 252, 110, textureX, textureY); // Box 308 fuel shutoff
		bodyModel[296] = new ModelRendererTurbo(this, 102, 211, textureX, textureY); // Box 309
		bodyModel[297] = new ModelRendererTurbo(this, 99, 216, textureX, textureY); // Box 310
		bodyModel[298] = new ModelRendererTurbo(this, 213, 92, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[299] = new ModelRendererTurbo(this, 44, 169, textureX, textureY); // Box 319 handrail ph1b+
		bodyModel[300] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 323 handrail
		bodyModel[301] = new ModelRendererTurbo(this, 64, 148, textureX, textureY); // Box 324 handrails ph1a1-1a2
		bodyModel[302] = new ModelRendererTurbo(this, 35, 179, textureX, textureY); // Box 445 handrail ph1a1-1a2
		bodyModel[303] = new ModelRendererTurbo(this, 11, 179, textureX, textureY); // Box 446 handrail ph1a1-1a2
		bodyModel[304] = new ModelRendererTurbo(this, 22, 178, textureX, textureY); // Box 447 handrail ph1a1-1a2
		bodyModel[305] = new ModelRendererTurbo(this, 1, 184, textureX, textureY, "cull"); // Box 870 cull handrail ph1a1-1a2
		bodyModel[306] = new ModelRendererTurbo(this, 46, 183, textureX, textureY); // Box 559 handrial ph1a1-1a2
		bodyModel[307] = new ModelRendererTurbo(this, 6, 183, textureX, textureY, "cull"); // Box 444 cull handrail ph1a1-1a2
		bodyModel[308] = new ModelRendererTurbo(this, 49, 183, textureX, textureY); // Box 333 handrail ph1a1-1a2
		bodyModel[309] = new ModelRendererTurbo(this, 442, 188, textureX, textureY); // Box 445 handrail ph1a1-1a2
		bodyModel[310] = new ModelRendererTurbo(this, 466, 188, textureX, textureY); // Box 446 handrail ph1a1-1a2
		bodyModel[311] = new ModelRendererTurbo(this, 453, 187, textureX, textureY); // Box 447 handrail ph1a1-1a2
		bodyModel[312] = new ModelRendererTurbo(this, 432, 193, textureX, textureY, "cull"); // Box 870 cull handrail ph1a1-1a2
		bodyModel[313] = new ModelRendererTurbo(this, 477, 192, textureX, textureY); // Box 559 handrial ph1a1-1a2
		bodyModel[314] = new ModelRendererTurbo(this, 437, 192, textureX, textureY, "cull"); // Box 444 cull handrail ph1a1-1a2
		bodyModel[315] = new ModelRendererTurbo(this, 480, 192, textureX, textureY); // Box 333 handrail ph1a1-1a2
		bodyModel[316] = new ModelRendererTurbo(this, 59, 142, textureX, textureY, "cull"); // Box 342 cull handrails ph1a2
		bodyModel[317] = new ModelRendererTurbo(this, 61, 146, textureX, textureY, "cull"); // Box 343 cull handrails ph1a1
		bodyModel[318] = new ModelRendererTurbo(this, 76, 146, textureX, textureY, "cull"); // Box 344 cull handrails ph1a1
		bodyModel[319] = new ModelRendererTurbo(this, 75, 148, textureX, textureY); // Box 345 handrails ph1a1-1a2
		bodyModel[320] = new ModelRendererTurbo(this, 76, 142, textureX, textureY, "cull"); // Box 346 cull handrails ph1a2
		bodyModel[321] = new ModelRendererTurbo(this, 67, 156, textureX, textureY); // Box 347 handrail
		bodyModel[322] = new ModelRendererTurbo(this, 72, 148, textureX, textureY); // Box 348 handrails ph1b+
		bodyModel[323] = new ModelRendererTurbo(this, 67, 148, textureX, textureY); // Box 349 handrails ph1b+
		bodyModel[324] = new ModelRendererTurbo(this, 66, 142, textureX, textureY, "cull"); // Box 350 cull handrails ph1b+
		bodyModel[325] = new ModelRendererTurbo(this, 71, 142, textureX, textureY, "cull"); // Box 351 cull handrails ph1b+
		bodyModel[326] = new ModelRendererTurbo(this, 44, 174, textureX, textureY); // Box 352 handrail ph1b+
		bodyModel[327] = new ModelRendererTurbo(this, 44, 171, textureX, textureY); // Box 353 handrail ph1b+
		bodyModel[328] = new ModelRendererTurbo(this, 24, 166, textureX, textureY); // Box 354 handrail ph1b+
		bodyModel[329] = new ModelRendererTurbo(this, 98, 113, textureX, textureY); // Box 256 door schnoz ph1a1 demo
		bodyModel[330] = new ModelRendererTurbo(this, 94, 113, textureX, textureY); // Box 258 door schnoz ph1a1 demo
		bodyModel[331] = new ModelRendererTurbo(this, 106, 114, textureX, textureY); // Box 259 door schnoz ph1a1 demo
		bodyModel[332] = new ModelRendererTurbo(this, 98, 131, textureX, textureY); // Box 257 door schnoz ph1a1 demo
		bodyModel[333] = new ModelRendererTurbo(this, 10, 169, textureX, textureY); // Box 359 handrail ph1b+
		bodyModel[334] = new ModelRendererTurbo(this, 10, 174, textureX, textureY); // Box 360 handrail ph1b+
		bodyModel[335] = new ModelRendererTurbo(this, 10, 171, textureX, textureY); // Box 361 handrail ph1b+
		bodyModel[336] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 445 handrail ph1b+
		bodyModel[337] = new ModelRendererTurbo(this, 464, 175, textureX, textureY); // Box 446 handrail ph1b+
		bodyModel[338] = new ModelRendererTurbo(this, 441, 179, textureX, textureY); // Box 319 handrail ph1b+
		bodyModel[339] = new ModelRendererTurbo(this, 441, 184, textureX, textureY); // Box 352 handrail ph1b+
		bodyModel[340] = new ModelRendererTurbo(this, 441, 181, textureX, textureY); // Box 353 handrail ph1b+
		bodyModel[341] = new ModelRendererTurbo(this, 455, 176, textureX, textureY); // Box 354 handrail ph1b+
		bodyModel[342] = new ModelRendererTurbo(this, 475, 179, textureX, textureY); // Box 359 handrail ph1b+
		bodyModel[343] = new ModelRendererTurbo(this, 475, 184, textureX, textureY); // Box 360 handrail ph1b+
		bodyModel[344] = new ModelRendererTurbo(this, 475, 181, textureX, textureY); // Box 361 handrail ph1b+
		bodyModel[345] = new ModelRendererTurbo(this, 230, 43, textureX, textureY); // Box 371 sd75m bulgy
		bodyModel[346] = new ModelRendererTurbo(this, 251, 127, textureX, textureY); // Box 372 late fuel tank
		bodyModel[347] = new ModelRendererTurbo(this, 301, 125, textureX, textureY); // Box 373 late fuel tank
		bodyModel[348] = new ModelRendererTurbo(this, 251, 127, textureX, textureY); // Box 374 late fuel tank
		bodyModel[349] = new ModelRendererTurbo(this, 301, 125, textureX, textureY); // Box 375 late fuel tank
		bodyModel[350] = new ModelRendererTurbo(this, 306, 132, textureX, textureY); // Box 19 filler up please
		bodyModel[351] = new ModelRendererTurbo(this, 301, 132, textureX, textureY); // Box 560 filler up please
		bodyModel[352] = new ModelRendererTurbo(this, 8, 45, textureX, textureY, "cull"); // Box 309 cull baffle
		bodyModel[353] = new ModelRendererTurbo(this, 1, 45, textureX, textureY, "cull"); // Box 309 cull baffle
		bodyModel[354] = new ModelRendererTurbo(this, 32, 204, textureX, textureY); // Box 356
		bodyModel[355] = new ModelRendererTurbo(this, 32, 201, textureX, textureY); // Box 357
		bodyModel[356] = new ModelRendererTurbo(this, 1, 204, textureX, textureY); // Box 358
		bodyModel[357] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 359
		bodyModel[358] = new ModelRendererTurbo(this, 249, 43, textureX, textureY); // Box 245
		bodyModel[359] = new ModelRendererTurbo(this, 250, 50, textureX, textureY); // Box 78
		bodyModel[360] = new ModelRendererTurbo(this, 250, 47, textureX, textureY); // Box 74
		bodyModel[361] = new ModelRendererTurbo(this, 250, 47, textureX, textureY); // Box 114
		bodyModel[362] = new ModelRendererTurbo(this, 192, 6, textureX, textureY); // Box 377
		bodyModel[363] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); // Box 378
		bodyModel[364] = new ModelRendererTurbo(this, 98, 2, textureX, textureY); // Box 368 ptc block
		bodyModel[365] = new ModelRendererTurbo(this, 119, 4, textureX, textureY); // Box 369 ptc block
		bodyModel[366] = new ModelRendererTurbo(this, 99, 20, textureX, textureY, "cull"); // Box 415 cull ptc sinclair
		bodyModel[367] = new ModelRendererTurbo(this, 101, 18, textureX, textureY); // Box 371 ptc
		bodyModel[368] = new ModelRendererTurbo(this, 101, 16, textureX, textureY); // Box 372 ptc
		bodyModel[369] = new ModelRendererTurbo(this, 122, 6, textureX, textureY); // Box 373 ptc
		bodyModel[370] = new ModelRendererTurbo(this, 122, 10, textureX, textureY); // Box 374 ptc
		bodyModel[371] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 372 up ptc blocc bigger
		bodyModel[372] = new ModelRendererTurbo(this, 99, 23, textureX, textureY); // Box 373 up ptc shit
		bodyModel[373] = new ModelRendererTurbo(this, 99, 23, textureX, textureY); // Box 374 up ptc shit
		bodyModel[374] = new ModelRendererTurbo(this, 124, 8, textureX, textureY); // Box 375 ptc smol
		bodyModel[375] = new ModelRendererTurbo(this, 138, 2, textureX, textureY); // Box 376 early up radome thing
		bodyModel[376] = new ModelRendererTurbo(this, 122, 4, textureX, textureY); // Box 377 early up antenna
		bodyModel[377] = new ModelRendererTurbo(this, 138, 6, textureX, textureY); // Box 378 early up radome thing2
		bodyModel[378] = new ModelRendererTurbo(this, 99, 8, textureX, textureY); // Box 364 prime base
		bodyModel[379] = new ModelRendererTurbo(this, 99, 4, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[380] = new ModelRendererTurbo(this, 99, 4, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[381] = new ModelRendererTurbo(this, 99, 4, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[382] = new ModelRendererTurbo(this, 99, 4, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[383] = new ModelRendererTurbo(this, 55, 214, textureX, textureY); // Box 350 mu plug
		bodyModel[384] = new ModelRendererTurbo(this, 48, 209, textureX, textureY); // Box 351 mu plug
		bodyModel[385] = new ModelRendererTurbo(this, 48, 210, textureX, textureY); // Box 352 hoser
		bodyModel[386] = new ModelRendererTurbo(this, 48, 214, textureX, textureY); // Box 387
		bodyModel[387] = new ModelRendererTurbo(this, 138, 10, textureX, textureY); // Box 388 csx radome thing
		bodyModel[388] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 389 gee whiz csx, why does emd led you have 3 MU plugs?
		bodyModel[389] = new ModelRendererTurbo(this, 123, 16, textureX, textureY); // Box 307 beansniff ptc bubble
		bodyModel[390] = new ModelRendererTurbo(this, 148, 12, textureX, textureY); // Box 391
		bodyModel[391] = new ModelRendererTurbo(this, 148, 12, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[392] = new ModelRendererTurbo(this, 148, 4, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[393] = new ModelRendererTurbo(this, 152, 10, textureX, textureY); // Box 563
		bodyModel[394] = new ModelRendererTurbo(this, 152, 2, textureX, textureY); // Box 564
		bodyModel[395] = new ModelRendererTurbo(this, 1, 197, textureX, textureY); // Box 396
		bodyModel[396] = new ModelRendererTurbo(this, 24, 197, textureX, textureY); // Box 397
		bodyModel[397] = new ModelRendererTurbo(this, 1, 194, textureX, textureY); // Box 398
		bodyModel[398] = new ModelRendererTurbo(this, 32, 194, textureX, textureY); // Box 399
		bodyModel[399] = new ModelRendererTurbo(this, 99, 97, textureX, textureY); // Box 236
		bodyModel[400] = new ModelRendererTurbo(this, 126, 94, textureX, textureY); // Box 86
		bodyModel[401] = new ModelRendererTurbo(this, 138, 97, textureX, textureY); // Box 403
		bodyModel[402] = new ModelRendererTurbo(this, 116, 97, textureX, textureY); // Box 404
		bodyModel[403] = new ModelRendererTurbo(this, 94, 96, textureX, textureY); // Box 405
		bodyModel[404] = new ModelRendererTurbo(this, 115, 108, textureX, textureY); // Box 406
		bodyModel[405] = new ModelRendererTurbo(this, 115, 114, textureX, textureY); // Box 407
		bodyModel[406] = new ModelRendererTurbo(this, 112, 120, textureX, textureY); // Box 408
		bodyModel[407] = new ModelRendererTurbo(this, 143, 83, textureX, textureY); // Box 409
		bodyModel[408] = new ModelRendererTurbo(this, 139, 100, textureX, textureY); // Box 409
		bodyModel[409] = new ModelRendererTurbo(this, 156, 94, textureX, textureY); // Box 410 this conductor screen thing isnt stock usually
		bodyModel[410] = new ModelRendererTurbo(this, 169, 93, textureX, textureY); // Box 411
		bodyModel[411] = new ModelRendererTurbo(this, 157, 92, textureX, textureY); // Box 412
		bodyModel[412] = new ModelRendererTurbo(this, 96, 202, textureX, textureY, "cull"); // Box 413 cull handrail filler
		bodyModel[413] = new ModelRendererTurbo(this, 44, 48, textureX, textureY, "cull"); // Box 414 cull window partition box
		bodyModel[414] = new ModelRendererTurbo(this, 59, 53, textureX, textureY); // Box 123
		bodyModel[415] = new ModelRendererTurbo(this, 59, 50, textureX, textureY); // Box 311
		bodyModel[416] = new ModelRendererTurbo(this, 35, 48, textureX, textureY); // Box 417
		bodyModel[417] = new ModelRendererTurbo(this, 38, 48, textureX, textureY); // Box 418
		bodyModel[418] = new ModelRendererTurbo(this, 483, 160, textureX, textureY); // Box 419
		bodyModel[419] = new ModelRendererTurbo(this, 483, 164, textureX, textureY); // Box 420
		bodyModel[420] = new ModelRendererTurbo(this, 490, 164, textureX, textureY); // Box 421
		bodyModel[421] = new ModelRendererTurbo(this, 143, 78, textureX, textureY); // Box 422
		bodyModel[422] = new ModelRendererTurbo(this, 140, 92, textureX, textureY); // Box 423
		bodyModel[423] = new ModelRendererTurbo(this, 127, 115, textureX, textureY); // Box 424
		bodyModel[424] = new ModelRendererTurbo(this, 147, 90, textureX, textureY); // Box 425 fridge
		bodyModel[425] = new ModelRendererTurbo(this, 165, 103, textureX, textureY); // Box 426 cab backpannel
		bodyModel[426] = new ModelRendererTurbo(this, 278, 202, textureX, textureY, "cull"); // Box 402 cull lots of little pipes
		bodyModel[427] = new ModelRendererTurbo(this, 278, 210, textureX, textureY, "cull"); // Box 382 cull lots of little pipes
		bodyModel[428] = new ModelRendererTurbo(this, 483, 159, textureX, textureY); // Box 396
		bodyModel[429] = new ModelRendererTurbo(this, 483, 159, textureX, textureY); // Box 397
		bodyModel[430] = new ModelRendererTurbo(this, 490, 159, textureX, textureY, "ditch"); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[431] = new ModelRendererTurbo(this, 490, 159, textureX, textureY, "ditch"); // Box 399 ditchlight
		bodyModel[432] = new ModelRendererTurbo(this, 82, 97, textureX, textureY); // Box 434 nose interior cover
		bodyModel[433] = new ModelRendererTurbo(this, 82, 97, textureX, textureY); // Box 435 nose interior cover
		bodyModel[434] = new ModelRendererTurbo(this, 316, 123, textureX, textureY); // Box 19 filler up please
		bodyModel[435] = new ModelRendererTurbo(this, 321, 123, textureX, textureY); // Box 560 filler up please
		bodyModel[436] = new ModelRendererTurbo(this, 297, 107, textureX, textureY); // Box 452 airtank 2
		bodyModel[437] = new ModelRendererTurbo(this, 297, 112, textureX, textureY); // Box 453 airtank 2
		bodyModel[438] = new ModelRendererTurbo(this, 221, 5, textureX, textureY); // Box 409 commander base rco
		bodyModel[439] = new ModelRendererTurbo(this, 221, 1, textureX, textureY, "commander"); // Box 410 commander beacon RCO
		bodyModel[440] = new ModelRendererTurbo(this, 221, 5, textureX, textureY); // Box 409 commander base rco
		bodyModel[441] = new ModelRendererTurbo(this, 221, 1, textureX, textureY, "commander"); // Box 410 commander beacon RCO
		bodyModel[442] = new ModelRendererTurbo(this, 497, 164, textureX, textureY); // Box 466 alaska is greedy and wants a third one
		bodyModel[443] = new ModelRendererTurbo(this, 62, 88, textureX, textureY); // Box 351 sandcap nose 2
		bodyModel[444] = new ModelRendererTurbo(this, 62, 88, textureX, textureY); // Box 285 sandcap nose 2
		bodyModel[445] = new ModelRendererTurbo(this, 279, 13, textureX, textureY, "cull"); // Box 455 cull arr winterization hatch
		bodyModel[446] = new ModelRendererTurbo(this, 185, 12, textureX, textureY); // Box 464
		bodyModel[447] = new ModelRendererTurbo(this, 185, 6, textureX, textureY); // Box 465
		bodyModel[448] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 467 is this seriously how they do extended range db i am going to shit myself
		bodyModel[449] = new ModelRendererTurbo(this, 226, 43, textureX, textureY); // Box 467 is this seriously how they do extended range db i am going to shit myself
		bodyModel[450] = new ModelRendererTurbo(this, 90, 8, textureX, textureY); // Box 364 prime base
		bodyModel[451] = new ModelRendererTurbo(this, 90, 4, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[452] = new ModelRendererTurbo(this, 90, 4, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[453] = new ModelRendererTurbo(this, 90, 4, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[454] = new ModelRendererTurbo(this, 90, 4, textureX, textureY, "prime4"); // Box 9 PRIME2-4

		bodyModel[0].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[0].setRotationPoint(-51F, 8F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[1].setRotationPoint(-55F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 3
		bodyModel[2].setRotationPoint(-51.01F, -2F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 102, 2, 12, 0F); // Box 23
		bodyModel[3].setRotationPoint(-51F, 0.5F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 102, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[4].setRotationPoint(-51F, 2.5F, -6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[5].setRotationPoint(-51F, 2.5F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[6].setRotationPoint(51F, 8F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[7].setRotationPoint(52F, 3F, -1.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 3
		bodyModel[8].setRotationPoint(51.01F, -2F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[9].setRotationPoint(51F, 2.5F, -2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[10].setRotationPoint(-52F, 2.5F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 102, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[11].setRotationPoint(-51F, -1F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 90, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[12].setRotationPoint(-45F, -1F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 90, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-45F, -1F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 23, 3, 22, 0F); // Box 489
		bodyModel[14].setRotationPoint(-13.5F, 3F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278 early fuel tank
		bodyModel[15].setRotationPoint(-13.5F, 2F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 23, 3, 18, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[16].setRotationPoint(-13.5F, 6F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315 early fuel tank
		bodyModel[17].setRotationPoint(-13.5F, 2F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[18].setRotationPoint(9.5F, 6F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[19].setRotationPoint(9.5F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567 early fuel tank
		bodyModel[20].setRotationPoint(9.5F, 2F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[21].setRotationPoint(9.5F, 2F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569 early fuel tank
		bodyModel[22].setRotationPoint(9.5F, 2F, 8F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19 filler up please
		bodyModel[23].setRotationPoint(-13F, 2F, -11.25F);
		bodyModel[23].rotateAngleX = 1.02974426F;

		bodyModel[24].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560 filler up please
		bodyModel[24].setRotationPoint(-13F, 2F, 11.25F);
		bodyModel[24].rotateAngleX = 1.02974426F;
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 380 fuel tank gauge
		bodyModel[25].setRotationPoint(-8F, 2F, -11.15F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 381 fuel tank gauge
		bodyModel[26].setRotationPoint(-8F, 2F, 10.15F);

		bodyModel[27].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box airtank
		bodyModel[27].setRotationPoint(-3F, 1F, -9.7F);
		bodyModel[27].rotateAngleX = 0.78539816F;

		bodyModel[28].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box airtank
		bodyModel[28].setRotationPoint(-3F, 1F, 9.7F);
		bodyModel[28].rotateAngleX = 0.78539816F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 318 sandcap rear roof
		bodyModel[29].setRotationPoint(47.75F, -22.5F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[30].setRotationPoint(49.5F, -19F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[31].setRotationPoint(49.5F, -19F, -2F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 i dont care who cubed sends im not raising this headlight
		bodyModel[32].setRotationPoint(48.25F, -19F, -2F);

		bodyModel[33].addBox(0F, 0F, 0F, 74, 20, 14, 0F); // Box 34 the hooH
		bodyModel[33].setRotationPoint(-27F, -21F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[34].setRotationPoint(47F, -22F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[35].setRotationPoint(47F, -22F, 0F);

		bodyModel[36].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[36].setRotationPoint(47.5F, -16.5F, -6F);
		bodyModel[36].rotateAngleY = -0.41887902F;

		bodyModel[37].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[37].setRotationPoint(47.5F, -16.5F, 6F);
		bodyModel[37].rotateAngleY = 0.41887902F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight rear low
		bodyModel[38].setRotationPoint(46.7F, -13.5F, -6.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight rear low
		bodyModel[39].setRotationPoint(46.7F, -13.5F, 4.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight rear high
		bodyModel[40].setRotationPoint(46.7F, -20F, -6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight rear high
		bodyModel[41].setRotationPoint(46.7F, -20F, 4.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298 ph1 radiator grill
		bodyModel[42].setRotationPoint(21.5F, -21F, -7.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 704 radiator fan
		bodyModel[43].setRotationPoint(38.5F, -22.75F, -3.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 705 radiator fan
		bodyModel[44].setRotationPoint(22F, -22.75F, -3.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 706 radiator fan
		bodyModel[45].setRotationPoint(30.25F, -22.75F, -3.5F);

		bodyModel[46].addShapeBox(1F, -1F, 1F, 5, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 715 radiator fan
		bodyModel[46].setRotationPoint(38.5F, -22.75F, -3.5F);

		bodyModel[47].addShapeBox(1F, -1F, 1F, 5, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 234 radiator fan
		bodyModel[47].setRotationPoint(22F, -22.75F, -3.5F);

		bodyModel[48].addShapeBox(1F, -1F, 1F, 5, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 235 radiator fan
		bodyModel[48].setRotationPoint(30.25F, -22.75F, -3.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430 ph1 radiator grill
		bodyModel[49].setRotationPoint(34F, -21F, -7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431 ph1 radiator grill
		bodyModel[50].setRotationPoint(34F, -21F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 432 ph1 radiator grill
		bodyModel[51].setRotationPoint(21.5F, -21F, 6.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 27, 1, 14, 0F); // Box 69 cull radiator fan container thing
		bodyModel[52].setRotationPoint(20F, -22F, -7F);

		bodyModel[53].addShapeBox(-2F, 0F, -7F, 12, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // ehaust silencer
		bodyModel[53].setRotationPoint(-6F, -23F, -4F);
		bodyModel[53].rotateAngleY = 1.57079633F;

		bodyModel[54].addBox(0F, 0F, -3F, 6, 1, 3, 0F); // Box 274 exhausting
		bodyModel[54].setRotationPoint(-3F, -22.75F, -3F);
		bodyModel[54].rotateAngleY = 1.57079633F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 18, 10, 14, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 677 cull vent sus
		bodyModel[55].setRotationPoint(-24F, -19F, -7F);

		bodyModel[56].addBox(0F, 0F, 0F, 9, 1, 13, 0F); // Box 700
		bodyModel[56].setRotationPoint(-24F, -22.5F, -6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 0, 18, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F); // Box 402 dyn fan
		bodyModel[57].setRotationPoint(-24F, -22.51F, -4.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 674 dynamic grid
		bodyModel[58].setRotationPoint(-24F, -16F, -3F);

		bodyModel[59].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 675
		bodyModel[59].setRotationPoint(-22F, -19F, -2.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 676
		bodyModel[60].setRotationPoint(-21F, -18F, -1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 22, 5, 1, 0F,-0.25F, 0F, 0F, -11.25F, 0F, 0F, -11.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -11.25F, 0F, 0F, -11.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 286
		bodyModel[61].setRotationPoint(-14.25F, -21.5F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 5, 1, 0F,-0.25F, 0F, 0F, -11.25F, 0F, 0F, -11.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -11.25F, 0F, 0F, -11.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 285
		bodyModel[62].setRotationPoint(-14.25F, -21.5F, -7.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 29, 1, 14, 0F); // Box 83
		bodyModel[63].setRotationPoint(-27F, -22F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 45, 1, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 84 engine hood roof phase 1-2a
		bodyModel[64].setRotationPoint(2F, -22F, -6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 anticlimber b
		bodyModel[65].setRotationPoint(51F, -1F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 387 anticlimber b
		bodyModel[66].setRotationPoint(51F, -1F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 anticlimber b
		bodyModel[67].setRotationPoint(-54F, -1F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 387 anticlimber b
		bodyModel[68].setRotationPoint(-54F, -1F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 89 dustbin hatch
		bodyModel[69].setRotationPoint(-14F, -23F, -5F);

		bodyModel[70].addBox(0F, 0F, 0F, 23, 1, 16, 0F); // Box 559
		bodyModel[70].setRotationPoint(-13.5F, 2F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, -1F, 10, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 2F, -1F, 0F, -2.5F, 0F, 0F, 0F); // Box 282
		bodyModel[71].setRotationPoint(-55F, 7F, 0F);
		bodyModel[71].rotateAngleY = 1.57079633F;

		bodyModel[72].addShapeBox(0F, 0F, -1F, 10, 2, 1, 0F,0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, -1F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -2.5F); // Box 283
		bodyModel[72].setRotationPoint(-55F, 7F, -10F);
		bodyModel[72].rotateAngleY = 1.57079633F;

		bodyModel[73].addShapeBox(0F, 0F, -1F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 4
		bodyModel[73].setRotationPoint(-54F, 6F, 0F);
		bodyModel[73].rotateAngleY = 1.57079633F;

		bodyModel[74].addShapeBox(0F, 0F, -1F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 448
		bodyModel[74].setRotationPoint(-54F, 4F, 2F);
		bodyModel[74].rotateAngleY = 1.57079633F;

		bodyModel[75].addShapeBox(0F, 0F, -1F, 10, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 322
		bodyModel[75].setRotationPoint(-54F, 6F, -10F);
		bodyModel[75].rotateAngleY = 1.57079633F;

		bodyModel[76].addShapeBox(0F, 0F, -1F, 8, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 323
		bodyModel[76].setRotationPoint(-54F, 4F, -10F);
		bodyModel[76].rotateAngleY = 1.57079633F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 280
		bodyModel[77].setRotationPoint(-53F, 4F, 2F);
		bodyModel[77].rotateAngleY = 1.57079633F;

		bodyModel[78].addShapeBox(-2F, 0F, -1F, 8, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 285
		bodyModel[78].setRotationPoint(-54F, 4F, -8F);
		bodyModel[78].rotateAngleY = 1.57079633F;

		bodyModel[79].addShapeBox(0F, 0F, -1F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 361
		bodyModel[79].setRotationPoint(-54F, 3F, 2F);
		bodyModel[79].rotateAngleY = 1.57079633F;

		bodyModel[80].addShapeBox(-2F, 0F, -1F, 8, 1, 1, 0F,0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 1F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 362
		bodyModel[80].setRotationPoint(-54F, 3F, -8F);
		bodyModel[80].rotateAngleY = 1.57079633F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 0, 17, 0F,0F, 0F, -0.25F, -0.325F, 0F, -0.25F, -0.325F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.325F, 0F, -0.25F, -0.325F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 274
		bodyModel[81].setRotationPoint(-51F, 1.25F, -8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0.175F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.175F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 272
		bodyModel[82].setRotationPoint(-51F, 8F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[83].setRotationPoint(-51F, 5.75F, -9.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[84].setRotationPoint(-47F, -1F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 245
		bodyModel[85].setRotationPoint(-47F, -1F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.175F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.175F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 248
		bodyModel[86].setRotationPoint(-47F, 7F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[87].setRotationPoint(-51F, 3.5F, -9F);

		bodyModel[88].addShapeBox(-1F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251 cull stairs
		bodyModel[88].setRotationPoint(-47.33F, 0F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 253
		bodyModel[89].setRotationPoint(-51F, 7F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[90].setRotationPoint(-51F, 4.75F, -7.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[91].setRotationPoint(-51F, 2.5F, -7F);

		bodyModel[92].addShapeBox(-5F, 0F, -4F, 5, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[92].setRotationPoint(46F, 2.5F, -2F);
		bodyModel[92].rotateAngleY = -3.14159265F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 257 cull stairs
		bodyModel[93].setRotationPoint(-47F, 0F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.175F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.175F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 258
		bodyModel[94].setRotationPoint(-51F, 8F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[95].setRotationPoint(-51F, 5.75F, 7.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.175F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.175F, 0F, -0.5F); // Box 260
		bodyModel[96].setRotationPoint(-47F, 7F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[97].setRotationPoint(-51F, 3.5F, 7F);

		bodyModel[98].addShapeBox(-1F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262 cull stairs
		bodyModel[98].setRotationPoint(-47.33F, 0F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 263
		bodyModel[99].setRotationPoint(-51F, 7F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[100].setRotationPoint(-51F, 4.75F, 7.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[101].setRotationPoint(-51F, 2.5F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 266 cull stairs
		bodyModel[102].setRotationPoint(-47F, 0F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 267
		bodyModel[103].setRotationPoint(-47F, -1F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[104].setRotationPoint(-47F, -1F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 269 cull stairs
		bodyModel[105].setRotationPoint(46F, 0F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[106].setRotationPoint(45F, -1F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[107].setRotationPoint(45F, -1F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.5F, -0.175F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, -0.175F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 272
		bodyModel[108].setRotationPoint(46F, 7F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.175F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.175F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 273
		bodyModel[109].setRotationPoint(47F, 8F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 274
		bodyModel[110].setRotationPoint(47F, 5.75F, -9.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 275
		bodyModel[111].setRotationPoint(47F, 3.5F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 0, 17, 0F,-0.325F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.325F, 0F, -0.25F, -0.325F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.325F, 0F, -0.25F); // Box 276
		bodyModel[112].setRotationPoint(47F, 1.25F, -8.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[113].setRotationPoint(48F, 2.5F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 278
		bodyModel[114].setRotationPoint(47F, 4.75F, -7.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 279
		bodyModel[115].setRotationPoint(47F, 7F, -9F);

		bodyModel[116].addShapeBox(-1F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280 cull stairs
		bodyModel[116].setRotationPoint(48.33F, 0F, -9F);

		bodyModel[117].addShapeBox(-1F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 281 cull stairs
		bodyModel[117].setRotationPoint(48.33F, 0F, 6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 282 cull stairs
		bodyModel[118].setRotationPoint(46F, 0F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.175F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.175F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 283
		bodyModel[119].setRotationPoint(46F, 7F, 10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.175F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.175F, 0F, -0.5F); // Box 284
		bodyModel[120].setRotationPoint(47F, 8F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 285
		bodyModel[121].setRotationPoint(47F, 7F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 286
		bodyModel[122].setRotationPoint(47F, 5.75F, 7.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 287
		bodyModel[123].setRotationPoint(47F, 4.75F, 7.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[124].setRotationPoint(48F, 2.5F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 289
		bodyModel[125].setRotationPoint(47F, 3.5F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[126].setRotationPoint(45F, -1F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 291
		bodyModel[127].setRotationPoint(45F, -1F, 10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, 0F, -1F, 0.675F, 0F, -1F); // Box 293 dont forget me
		bodyModel[128].setRotationPoint(-47F, 3F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.675F, 0F, -1F, -0.675F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294 dont forget me
		bodyModel[129].setRotationPoint(-47F, 3F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.675F, 0F, -1F, -0.675F, 0F, -1F); // Box 295 dont forget me
		bodyModel[130].setRotationPoint(47F, 3F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, 0F, -1F, 0.675F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296 dont forget me
		bodyModel[131].setRotationPoint(47F, 3F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.277F, 0F, 0F, 0F, 0F, 0.65F, -0.45F, 0F, 0F, 0.277F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[132].setRotationPoint(-41F, -14F, -10F);

		bodyModel[133].addShapeBox(3F, 0F, 0F, 1, 14, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[133].setRotationPoint(-31F, -20F, -10F);

		bodyModel[134].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right shortcab
		bodyModel[134].setRotationPoint(-27.5F, -20F, 10.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 14, 5, 22, 0F); // Box 137
		bodyModel[135].setRotationPoint(-41F, -6F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 72 cab wall engineer
		bodyModel[136].setRotationPoint(-40F, -20F, 10F);

		bodyModel[137].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 154 cab wall fireman
		bodyModel[137].setRotationPoint(-40F, -20F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 445 handrail ph1b+
		bodyModel[138].setRotationPoint(-53.5F, -9F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 446 handrail ph1b+
		bodyModel[139].setRotationPoint(-53.5F, -9F, 2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[140].setRotationPoint(-41F, -20F, 0F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 6, 22, 0F); // Box 175
		bodyModel[141].setRotationPoint(-41F, -12F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2.5F, 0F, 0F); // Box 182
		bodyModel[142].setRotationPoint(-47F, -12F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 11, 9, 0F,2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 188
		bodyModel[143].setRotationPoint(-47F, -12F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0.277F, 0F, 0F, -0.277F, 0F, 2F, -0.277F, 0F, -1F, 0.277F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -1F, 0.277F, 0F, -1F); // Box 193
		bodyModel[144].setRotationPoint(-47F, -14F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0.277F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 2.5F, 0F, -1F, 0.277F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 2.5F, 0F, -1F); // Box 194
		bodyModel[145].setRotationPoint(-47F, -14F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,2.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.277F, 0F, 1F, 2.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.277F, 0F, 1F); // Box 196
		bodyModel[146].setRotationPoint(-47F, -14F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0.39F, -0.5F, -1F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0.39F, -0.5F, -3F, 0.39F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0.39F, 0F, -3F); // Box 201
		bodyModel[147].setRotationPoint(-48F, -16F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0.277F, 0F, -1F, -0.277F, 0F, -1F, -0.277F, 0F, 2F, 0.277F, 0F, 0F, 0.277F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 1F); // Box 205
		bodyModel[148].setRotationPoint(-47F, -14F, 7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 206
		bodyModel[149].setRotationPoint(-41F, -20F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.277F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0.65F, 0.277F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 211
		bodyModel[150].setRotationPoint(-41F, -14F, 9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[151].setRotationPoint(-40F, -16F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[152].setRotationPoint(-40F, -16F, 2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[153].setRotationPoint(-40F, -16F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[154].setRotationPoint(-40F, -14F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[155].setRotationPoint(-40F, -16F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[156].setRotationPoint(-40F, -14F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[157].setRotationPoint(-40F, -16F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224 cab wall bit
		bodyModel[158].setRotationPoint(-41F, -20F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228 cab wall bit
		bodyModel[159].setRotationPoint(-41F, -20F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.155F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.425F, -1.5F, 0F, 0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 225
		bodyModel[160].setRotationPoint(-40.75F, -16F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.425F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.155F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.55F, 0F, 0F); // Box 226
		bodyModel[161].setRotationPoint(-40.75F, -16F, -10F);

		bodyModel[162].addShapeBox(3F, 0F, 0F, 11, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 229
		bodyModel[162].setRotationPoint(-41F, -22F, -7F);

		bodyModel[163].addShapeBox(0F, 0F, -1F, 14, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[163].setRotationPoint(-28F, -22F, -7F);
		bodyModel[163].rotateAngleY = 1.57079633F;

		bodyModel[164].addShapeBox(-0.5F, 0F, -3.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150 door swing right shortcab
		bodyModel[164].setRotationPoint(-27.5F, -22F, 10.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 232
		bodyModel[165].setRotationPoint(-37F, -21F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[166].setRotationPoint(-28F, -21F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 234
		bodyModel[167].setRotationPoint(-37F, -21F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,1.09F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 1.09F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 235
		bodyModel[168].setRotationPoint(-38F, -21F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 1.09F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1.09F, -1F, 0F); // Box 236
		bodyModel[169].setRotationPoint(-38F, -21F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.91F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.91F, 0F, 0F); // Box 237 cab forehead
		bodyModel[170].setRotationPoint(-41F, -22F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-1.91F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.91F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 238 cab forehead
		bodyModel[171].setRotationPoint(-41F, -22F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, 0F, 0F, 0F); // Box 31 high mounted headlight holder
		bodyModel[172].setRotationPoint(-40.46F, -22F, -2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 headlight cab
		bodyModel[173].setRotationPoint(-40.72F, -22F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 headlight cab
		bodyModel[174].setRotationPoint(-40.72F, -22F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,-0.475F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.475F, -0.125F, 0F, -0.475F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.475F, -0.125F, 0F); // Box 242 cab numberboard
		bodyModel[175].setRotationPoint(-41F, -22F, -2.25F);
		bodyModel[175].rotateAngleY = 0.27052603F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.475F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.475F, -0.125F, 0F, -0.475F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.475F, -0.125F, 0F); // Box 243 cab numberboard
		bodyModel[176].setRotationPoint(-41F, -22F, 2.25F);
		bodyModel[176].rotateAngleY = -0.27052603F;

		bodyModel[177].addShapeBox(0F, 0F, -1F, 14, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[177].setRotationPoint(-38F, -22F, -7F);
		bodyModel[177].rotateAngleY = 1.57079633F;

		bodyModel[178].addBox(0F, 0F, 0F, 15, 6, 4, 0F); // Box 245
		bodyModel[178].setRotationPoint(-27F, -7F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[179].setRotationPoint(-11F, -7F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 498
		bodyModel[180].setRotationPoint(-12F, -7F, -11F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 248
		bodyModel[181].setRotationPoint(-12F, -5.5F, -11F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 249
		bodyModel[182].setRotationPoint(-12F, -3F, -11F);

		bodyModel[183].addBox(0F, 0F, 0F, 8, 15, 2, 0F); // Box 483 sd70m blower
		bodyModel[183].setRotationPoint(-11.25F, -16F, -8.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 14, 7, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 251 the little small vent on the firemans side
		bodyModel[184].setRotationPoint(38F, -14F, -7.6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[185].setRotationPoint(-25F, -7F, 11F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 254
		bodyModel[186].setRotationPoint(-27F, -5F, 7F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 255
		bodyModel[187].setRotationPoint(-26F, -3F, 7F);

		bodyModel[188].addBox(-0.5F, 0F, 0F, 1, 12, 4, 0F); // Box 256 door schnoz
		bodyModel[188].setRotationPoint(-49F, -14F, 1F);
		bodyModel[188].rotateAngleY = -0.27925268F;

		bodyModel[189].addShapeBox(-0.5F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 257 door schnoz
		bodyModel[189].setRotationPoint(-49F, -2F, 1F);
		bodyModel[189].rotateAngleY = -0.27925268F;

		bodyModel[190].addShapeBox(-0.5F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 258 door schnoz
		bodyModel[190].setRotationPoint(-49F, -14F, 1F);
		bodyModel[190].rotateAngleY = -0.27925268F;

		bodyModel[191].addShapeBox(-0.5F, -1F, 3F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 259 door schnoz
		bodyModel[191].setRotationPoint(-49F, -14F, 1F);
		bodyModel[191].rotateAngleY = -0.27925268F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1.39F, 0F, 0F, -2.39F, 0F, 0F, -2.39F, 0F, 0F, 2.5F, 0F, 0F, 1.39F, 0F, 0F, -2.39F, 0F, 0F, -2.39F, 0F, 0F, 2.5F, 0F, 0F); // Box 271
		bodyModel[192].setRotationPoint(-47F, -15F, -4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0.277F, -2F, 0F, 0F, -2F, 2.65F, -1F, -0.5F, -2F, 1.39F, -0.5F, 1F, 0.277F, 0F, 0F, 0F, 0F, 2.65F, -1F, 0F, -2F, 1.39F, 0F, 1F); // Box 272
		bodyModel[193].setRotationPoint(-47F, -16F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1.39F, -0.5F, 0F, -2.39F, -0.5F, 0F, -2.39F, -0.5F, 0F, 2.5F, -0.5F, 0F, 1.39F, 0F, 0F, -2.39F, 0F, 0F, -2.39F, 0F, 0F, 2.5F, 0F, 0F); // Box 273
		bodyModel[194].setRotationPoint(-47F, -16F, -4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 274 headlight nose
		bodyModel[195].setRotationPoint(-49.3F, -15F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 headlight nose
		bodyModel[196].setRotationPoint(-49.3F, -13F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.275F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F); // Box 276 cull nose headlight cutout
		bodyModel[197].setRotationPoint(-49.5F, -15F, -1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,2.5F, 0F, 0F, -2.39F, 0F, 0F, -2.39F, 0F, 0F, 1.39F, 0F, 0F, 2.5F, 0F, 0F, -2.39F, 0F, 0F, -2.39F, 0F, 0F, 1.39F, 0F, 0F); // Box 278
		bodyModel[198].setRotationPoint(-47F, -15F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,1.39F, -0.5F, 1F, -1F, -0.5F, -2F, 0F, -2F, 2.65F, 0.277F, -2F, 0F, 1.39F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 2.65F, 0.277F, 0F, 0F); // Box 279
		bodyModel[199].setRotationPoint(-47F, -16F, 5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,2.5F, -0.5F, 0F, -2.39F, -0.5F, 0F, -2.39F, -0.5F, 0F, 1.39F, -0.5F, 0F, 2.5F, 0F, 0F, -2.39F, 0F, 0F, -2.39F, 0F, 0F, 1.39F, 0F, 0F); // Box 280
		bodyModel[200].setRotationPoint(-47F, -16F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.275F, 0F, 0F); // Box 281 cull nose headlight cutout
		bodyModel[201].setRotationPoint(-49.5F, -15F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F); // Box 364 markerlight bugeye front
		bodyModel[202].setRotationPoint(-47.75F, -13.75F, 6.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 283 markerlight bugeye front
		bodyModel[203].setRotationPoint(-47.75F, -13.75F, -7.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap nose
		bodyModel[204].setRotationPoint(-46.25F, -15.5F, 5.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 285 sandcap nose
		bodyModel[205].setRotationPoint(-46.25F, -15.5F, -7.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 bogie mount
		bodyModel[206].setRotationPoint(-35.5F, 2F, -2F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 424 bogie mount
		bodyModel[207].setRotationPoint(31.5F, 2F, -2F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 27, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220 ph2 radiator
		bodyModel[208].setRotationPoint(20F, -21F, -9F);

		bodyModel[209].addBox(0F, 0F, 0F, 27, 1, 2, 0F); // Box 221 ph2 radiator
		bodyModel[209].setRotationPoint(20F, -22F, -9F);

		bodyModel[210].addBox(0F, 0F, 0F, 27, 1, 2, 0F); // Box 223 ph2 radiator
		bodyModel[210].setRotationPoint(20F, -22F, 7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 27, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 225 ph2 radiator
		bodyModel[211].setRotationPoint(20F, -21F, 7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 27, 1, 16, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 297 cull ph2 radiator container housing thing
		bodyModel[212].setRotationPoint(20F, -23F, -8F);

		bodyModel[213].addShapeBox(0F, -6F, 0F, 24, 7, 1, 0F,0F, -0.25F, 0F, -12F, -0.25F, 0F, -12F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -12F, -0.75F, 0F, -12F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 298 ph2 radiator grill
		bodyModel[213].setRotationPoint(21F, -15.5F, 6.5F);
		bodyModel[213].rotateAngleX = -0.33161256F;

		bodyModel[214].addShapeBox(0F, -6F, 0F, 24, 7, 1, 0F,0F, -0.25F, 0F, -12F, -0.25F, 0F, -12F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -12F, -0.75F, 0F, -12F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 299 ph2 radiator grill
		bodyModel[214].setRotationPoint(34F, -15.5F, 6.5F);
		bodyModel[214].rotateAngleX = -0.33161256F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 45, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84 engine hood roof phase 2d+
		bodyModel[215].setRotationPoint(2F, -22F, -7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2.625F, 0F, 0F, -2.625F); // Box 301 i think emd should be put out in the field and fucking shot
		bodyModel[216].setRotationPoint(47F, -21F, 6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.625F, -0.75F, 0F, -2.625F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 302who the fuck thought this was a good idea fr
		bodyModel[217].setRotationPoint(47F, -21F, -9F);

		bodyModel[218].addShapeBox(0F, -6F, -1F, 24, 7, 1, 0F,0F, -0.25F, 0F, -12F, -0.25F, 0F, -12F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -12F, -0.75F, 0F, -12F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 303 ph2 radiator grill
		bodyModel[218].setRotationPoint(21F, -15.5F, -6.5F);
		bodyModel[218].rotateAngleX = 0.33161256F;

		bodyModel[219].addShapeBox(0F, -6F, -1F, 24, 7, 1, 0F,0F, -0.25F, 0F, -12F, -0.25F, 0F, -12F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -12F, -0.75F, 0F, -12F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 304 ph2 radiator grill
		bodyModel[219].setRotationPoint(34F, -15.5F, -6.5F);
		bodyModel[219].rotateAngleX = 0.33161256F;

		bodyModel[220].addShapeBox(0F, 0F, -1F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 ph2 radiator
		bodyModel[220].setRotationPoint(47F, -22F, -9F);
		bodyModel[220].rotateAngleY = 1.57079633F;

		bodyModel[221].addShapeBox(0F, 0F, -1F, 16, 1, 1, 0F,0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 306 ph2 radiator
		bodyModel[221].setRotationPoint(47F, -23F, -8F);
		bodyModel[221].rotateAngleY = 1.57079633F;

		bodyModel[222].addShapeBox(0F, 0F, -1F, 12, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 307 ph1 radiator fan spacer housing
		bodyModel[222].setRotationPoint(29.13F, -22F, -6F);
		bodyModel[222].rotateAngleY = 1.57079633F;

		bodyModel[223].addShapeBox(0F, 0F, -1F, 12, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 308 ph1 radiator fan spacer housing
		bodyModel[223].setRotationPoint(37.37F, -22F, -6F);
		bodyModel[223].rotateAngleY = 1.57079633F;

		bodyModel[224].addShapeBox(0F, 0F, -1F, 14, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 307 ph2 radiator fan spacer housing
		bodyModel[224].setRotationPoint(29.13F, -22.5F, -7F);
		bodyModel[224].rotateAngleY = 1.57079633F;

		bodyModel[225].addShapeBox(0F, 0F, -1F, 14, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 308 ph2 radiator fan spacer housing
		bodyModel[225].setRotationPoint(37.37F, -22.5F, -7F);
		bodyModel[225].rotateAngleY = 1.57079633F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.425F, -0.15F, 0F, 0F, -0.75F, 0F); // Box 507 cull notcher sand filler
		bodyModel[226].setRotationPoint(48F, -14F, 0F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.425F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 508 cull notched sand filler
		bodyModel[227].setRotationPoint(48F, -14F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.425F, -0.85F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509 notched sand filler bit
		bodyModel[228].setRotationPoint(48F, -12F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -1F, 0F, -0.425F, -0.85F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 510 notched sand filler bit
		bodyModel[229].setRotationPoint(48F, -12F, 0F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 315 notched sand cab
		bodyModel[230].setRotationPoint(48.2F, -12.3F, -1F);
		bodyModel[230].rotateAngleZ = -0.43633231F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 take a brake (wheel)
		bodyModel[231].setRotationPoint(35F, -12F, 6.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110 i guess
		bodyModel[232].setRotationPoint(35F, -5F, 5F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 118 brakewheel spindle
		bodyModel[233].setRotationPoint(37F, -10F, 4.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 321
		bodyModel[234].setRotationPoint(35F, -13F, 5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 322
		bodyModel[235].setRotationPoint(39F, -13F, 5F);

		bodyModel[236].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Box 323 cull hood brake cutout
		bodyModel[236].setRotationPoint(35F, -13F, 5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 615 htcr truck mount
		bodyModel[237].setRotationPoint(-27F, 1.5F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 616 htcr truck mount
		bodyModel[238].setRotationPoint(-28F, 1.5F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, -3F, 22, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617 htcr truck mount
		bodyModel[239].setRotationPoint(-28F, 0.5F, -11F);
		bodyModel[239].rotateAngleY = 1.57079633F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 619 htcr truck mount
		bodyModel[240].setRotationPoint(-27F, 1.5F, 9F);

		bodyModel[241].addShapeBox(0F, 0F, -3F, 18, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 468
		bodyModel[241].setRotationPoint(-28F, 2F, -9F);
		bodyModel[241].rotateAngleY = 1.57079633F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 0, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291 dont forget
		bodyModel[242].setRotationPoint(-26.5F, 0F, -9F);

		bodyModel[243].addBox(0F, 0F, -3F, 18, 1, 3, 0F); // Box 471
		bodyModel[243].setRotationPoint(-39F, 2F, -9F);
		bodyModel[243].rotateAngleY = 1.57079633F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Box 472
		bodyModel[244].setRotationPoint(-28F, 1.5F, 9F);

		bodyModel[245].addBox(0F, 0F, -3F, 18, 1, 3, 0F); // Box 473
		bodyModel[245].setRotationPoint(36F, 2F, -9F);
		bodyModel[245].rotateAngleY = 1.57079633F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 615 htcr truck mount
		bodyModel[246].setRotationPoint(26F, 1.5F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 616 htcr truck mount
		bodyModel[247].setRotationPoint(25F, 1.5F, -10F);

		bodyModel[248].addShapeBox(0F, 0F, -3F, 22, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617 htcr truck mount
		bodyModel[248].setRotationPoint(25F, 0.5F, -11F);
		bodyModel[248].rotateAngleY = 1.57079633F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 619 htcr truck mount
		bodyModel[249].setRotationPoint(26F, 1.5F, 9F);

		bodyModel[250].addShapeBox(0F, 0F, -3F, 18, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 468
		bodyModel[250].setRotationPoint(25F, 2F, -9F);
		bodyModel[250].rotateAngleY = 1.57079633F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291 dont forget
		bodyModel[251].setRotationPoint(26.5F, 0F, -9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Box 472
		bodyModel[252].setRotationPoint(25F, 1.5F, 9F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 570 ane horn
		bodyModel[253].setRotationPoint(44.5F, -23.75F, 5.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 567 ane horn
		bodyModel[254].setRotationPoint(46F, -23.75F, 3.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895 ane horn
		bodyModel[255].setRotationPoint(46F, -23F, 4.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894 ane horn
		bodyModel[256].setRotationPoint(46F, -24F, 4.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 351
		bodyModel[257].setRotationPoint(15F, -24F, -0.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 352
		bodyModel[258].setRotationPoint(17.5F, -23F, -0.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 353
		bodyModel[259].setRotationPoint(15.5F, -23.75F, -1.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[260].setRotationPoint(16F, -23.75F, 0.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332 ane horn
		bodyModel[261].setRotationPoint(4F, -24F, -7F);

		bodyModel[262].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 ane horn
		bodyModel[262].setRotationPoint(4F, -24F, -5.75F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330 ane horn
		bodyModel[263].setRotationPoint(5F, -22F, -6.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329 ane horn
		bodyModel[264].setRotationPoint(3F, -22.75F, -7.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328 ane horn
		bodyModel[265].setRotationPoint(3.5F, -22.75F, -5.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327 ane horn
		bodyModel[266].setRotationPoint(2.5F, -23F, -6.5F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364 markerlight bugeye rear
		bodyModel[267].setRotationPoint(47.25F, -13F, -6F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364 markerlight bugeye rear
		bodyModel[268].setRotationPoint(47.25F, -13F, 5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[269].setRotationPoint(-53F, -3F, -6F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[270].setRotationPoint(-53F, -3F, 4F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[271].setRotationPoint(-53.25F, -3F, -6F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 ditchlight
		bodyModel[272].setRotationPoint(-53.25F, -3F, 4F);

		bodyModel[273].addBox(0F, 0F, 0F, 55, 8, 0, 0F); // Box 311
		bodyModel[273].setRotationPoint(-10F, -9F, -11F);

		bodyModel[274].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 250
		bodyModel[274].setRotationPoint(47F, -9F, -11F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[275].setRotationPoint(47.01F, -3F, -11.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 289
		bodyModel[276].setRotationPoint(45F, -9F, -11F);

		bodyModel[277].addBox(0F, 0F, 0F, 68, 8, 0, 0F); // Box 290
		bodyModel[277].setRotationPoint(-23F, -9F, 11F);

		bodyModel[278].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 291
		bodyModel[278].setRotationPoint(47F, -9F, 9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 292
		bodyModel[279].setRotationPoint(47.01F, -3F, 10.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 293
		bodyModel[280].setRotationPoint(45F, -9F, 11F);

		bodyModel[281].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 294
		bodyModel[281].setRotationPoint(-27F, -15F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, -3F, 1F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 1F, 0F); // Box 295
		bodyModel[282].setRotationPoint(-13F, -15F, -11.01F);

		bodyModel[283].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 296 some up thing
		bodyModel[283].setRotationPoint(14F, 0F, -10.5F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 297 fuel tank gauge
		bodyModel[284].setRotationPoint(-13F, 2.75F, -11.15F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 298 fuel tank gauge
		bodyModel[285].setRotationPoint(-13F, 2.75F, 10.15F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[286].setRotationPoint(-15.25F, 1.75F, -10.25F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[287].setRotationPoint(-15.5F, 0.25F, -10.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[288].setRotationPoint(-15.5F, 1.25F, -10.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[289].setRotationPoint(-15.5F, -0.75F, -10.9F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 347
		bodyModel[290].setRotationPoint(11F, -22.5F, -0.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 348
		bodyModel[291].setRotationPoint(9.5F, -23.25F, 0.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 349
		bodyModel[292].setRotationPoint(8.5F, -23.5F, -0.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 350
		bodyModel[293].setRotationPoint(9F, -23.25F, -1.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 307 fuel shutoff
		bodyModel[294].setRotationPoint(-11F, 0F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 308 fuel shutoff
		bodyModel[295].setRotationPoint(-11F, 0F, 9F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 14, 0, 0F); // Box 309
		bodyModel[296].setRotationPoint(-27F, -15F, 11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, -2F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 1F, 0F); // Box 310
		bodyModel[297].setRotationPoint(-25F, -15F, 11.01F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[298].setRotationPoint(-16F, 0F, 8.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319 handrail ph1b+
		bodyModel[299].setRotationPoint(-52F, -9F, -8F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 handrail
		bodyModel[300].setRotationPoint(-47F, -2F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,1F, -1F, 2.5F, -1F, -1F, 2.5F, -1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324 handrails ph1a1-1a2
		bodyModel[301].setRotationPoint(-47F, -9F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 445 handrail ph1a1-1a2
		bodyModel[302].setRotationPoint(-53.5F, -9F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 446 handrail ph1a1-1a2
		bodyModel[303].setRotationPoint(-53.5F, -9F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447 handrail ph1a1-1a2
		bodyModel[304].setRotationPoint(-53F, -9F, -3F);

		bodyModel[305].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, -0.5F, 0F, 15F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 15F, -1F, 0.25F, 15F); // Box 870 cull handrail ph1a1-1a2
		bodyModel[305].setRotationPoint(-51.01F, -8F, -8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559 handrial ph1a1-1a2
		bodyModel[306].setRotationPoint(-51F, -9F, 9F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F); // Box 444 cull handrail ph1a1-1a2
		bodyModel[307].setRotationPoint(-52F, -9F, -8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 333 handrail ph1a1-1a2
		bodyModel[308].setRotationPoint(-51F, -9F, -8F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 445 handrail ph1a1-1a2
		bodyModel[309].setRotationPoint(53.5F, -9F, -8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 446 handrail ph1a1-1a2
		bodyModel[310].setRotationPoint(53.5F, -9F, 3F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447 handrail ph1a1-1a2
		bodyModel[311].setRotationPoint(53F, -9F, -3F);

		bodyModel[312].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 15F, 0F, 0F, 15F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 15F, 0F, 0.25F, 15F); // Box 870 cull handrail ph1a1-1a2
		bodyModel[312].setRotationPoint(51.99F, -8F, -8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559 handrial ph1a1-1a2
		bodyModel[313].setRotationPoint(51F, -9F, 9F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F); // Box 444 cull handrail ph1a1-1a2
		bodyModel[314].setRotationPoint(51F, -9F, -8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 333 handrail ph1a1-1a2
		bodyModel[315].setRotationPoint(51F, -9F, -8F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 342 cull handrails ph1a2
		bodyModel[316].setRotationPoint(-48F, -9F, 6F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 343 cull handrails ph1a1
		bodyModel[317].setRotationPoint(-48F, -9F, 7F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344 cull handrails ph1a1
		bodyModel[318].setRotationPoint(-48F, -9F, -8F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,1F, 0F, -3F, -1F, 0F, -3F, -1F, -1F, 2.5F, 1F, -1F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345 handrails ph1a1-1a2
		bodyModel[319].setRotationPoint(-47F, -9F, -11F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346 cull handrails ph1a2
		bodyModel[320].setRotationPoint(-48F, -9F, -8F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347 handrail
		bodyModel[321].setRotationPoint(-47F, -2F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 4F, 1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 handrails ph1b+
		bodyModel[322].setRotationPoint(-47F, -9F, -11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349 handrails ph1b+
		bodyModel[323].setRotationPoint(-47F, -9F, 10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350 cull handrails ph1b+
		bodyModel[324].setRotationPoint(-48F, -14F, 6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351 cull handrails ph1b+
		bodyModel[325].setRotationPoint(-48F, -14F, -7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352 handrail ph1b+
		bodyModel[326].setRotationPoint(-51F, -6F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353 handrail ph1b+
		bodyModel[327].setRotationPoint(-51F, -8F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354 handrail ph1b+
		bodyModel[328].setRotationPoint(-53F, -9F, -2F);

		bodyModel[329].addBox(-0.5F, 0F, -4F, 1, 12, 4, 0F); // Box 256 door schnoz ph1a1 demo
		bodyModel[329].setRotationPoint(-49F, -14F, -1F);
		bodyModel[329].rotateAngleY = 0.27925268F;

		bodyModel[330].addShapeBox(-0.5F, -1F, -3F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258 door schnoz ph1a1 demo
		bodyModel[330].setRotationPoint(-49F, -14F, -1F);
		bodyModel[330].rotateAngleY = 0.27925268F;

		bodyModel[331].addShapeBox(-0.5F, -1F, -5F, 1, 1, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 259 door schnoz ph1a1 demo
		bodyModel[331].setRotationPoint(-49F, -14F, -1F);
		bodyModel[331].rotateAngleY = 0.27925268F;

		bodyModel[332].addShapeBox(-0.5F, 0F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 257 door schnoz ph1a1 demo
		bodyModel[332].setRotationPoint(-49F, -2F, -1F);
		bodyModel[332].rotateAngleY = 0.27925268F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359 handrail ph1b+
		bodyModel[333].setRotationPoint(-52F, -9F, 7F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360 handrail ph1b+
		bodyModel[334].setRotationPoint(-51F, -6F, 10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361 handrail ph1b+
		bodyModel[335].setRotationPoint(-51F, -8F, 8F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 445 handrail ph1b+
		bodyModel[336].setRotationPoint(53.5F, -9F, -7F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 446 handrail ph1b+
		bodyModel[337].setRotationPoint(53.5F, -9F, 2F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319 handrail ph1b+
		bodyModel[338].setRotationPoint(52F, -9F, -8F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352 handrail ph1b+
		bodyModel[339].setRotationPoint(51F, -6F, -11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353 handrail ph1b+
		bodyModel[340].setRotationPoint(51F, -8F, -9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354 handrail ph1b+
		bodyModel[341].setRotationPoint(53F, -9F, -2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359 handrail ph1b+
		bodyModel[342].setRotationPoint(52F, -9F, 7F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360 handrail ph1b+
		bodyModel[343].setRotationPoint(51F, -6F, 10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,-1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361 handrail ph1b+
		bodyModel[344].setRotationPoint(51F, -8F, 8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 6, 15, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371 sd75m bulgy
		bodyModel[345].setRotationPoint(-10F, -16F, 6.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372 late fuel tank
		bodyModel[346].setRotationPoint(-13.5F, 2F, -11F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373 late fuel tank
		bodyModel[347].setRotationPoint(9.5F, 2F, -11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374 late fuel tank
		bodyModel[348].setRotationPoint(-13.5F, 2F, 8F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375 late fuel tank
		bodyModel[349].setRotationPoint(9.5F, 2F, 8F);

		bodyModel[350].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19 filler up please
		bodyModel[350].setRotationPoint(-10F, 2F, -11.25F);
		bodyModel[350].rotateAngleX = 1.02974426F;

		bodyModel[351].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560 filler up please
		bodyModel[351].setRotationPoint(-10F, 2F, 11.25F);
		bodyModel[351].rotateAngleX = 1.02974426F;
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 309 cull baffle
		bodyModel[352].setRotationPoint(-41.48F, -21F, -2F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 309 cull baffle
		bodyModel[353].setRotationPoint(-41.48F, -21F, 0F);

		bodyModel[354].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F); // Box 356
		bodyModel[354].setRotationPoint(-54F, 5F, -10F);
		bodyModel[354].rotateAngleY = 1.57079633F;

		bodyModel[355].addShapeBox(-2F, 0F, -1F, 6, 1, 1, 0F,0F, 1F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F); // Box 357
		bodyModel[355].setRotationPoint(-54F, 4F, -8F);
		bodyModel[355].rotateAngleY = 1.57079633F;

		bodyModel[356].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -1F); // Box 358
		bodyModel[356].setRotationPoint(-54F, 5F, 4F);
		bodyModel[356].rotateAngleY = 1.57079633F;

		bodyModel[357].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -1F); // Box 359
		bodyModel[357].setRotationPoint(-54F, 4F, 4F);
		bodyModel[357].rotateAngleY = 1.57079633F;

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[358].setRotationPoint(20F, -22F, 6.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[359].setRotationPoint(20.25F, -19.5F, 7.95F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[360].setRotationPoint(20F, -21F, 7.7F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[361].setRotationPoint(20F, -20F, 7.7F);

		bodyModel[362].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 377
		bodyModel[362].setRotationPoint(10F, -24.5F, 0.25F);

		bodyModel[363].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 378
		bodyModel[363].setRotationPoint(10F, -24.5F, -1F);

		bodyModel[364].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 368 ptc block
		bodyModel[364].setRotationPoint(-38.5F, -22.5F, -5F);

		bodyModel[365].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 369 ptc block
		bodyModel[365].setRotationPoint(-32.5F, -22.5F, -5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 415 cull ptc sinclair
		bodyModel[366].setRotationPoint(-37.5F, -23.25F, -3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371 ptc
		bodyModel[367].setRotationPoint(-37.75F, -23.25F, 0F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372 ptc
		bodyModel[368].setRotationPoint(-37.25F, -23.25F, 1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373 ptc
		bodyModel[369].setRotationPoint(-32.25F, -23.25F, 2F);
		bodyModel[369].rotateAngleY = 0.45378561F;

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374 ptc
		bodyModel[370].setRotationPoint(-32.25F, -23.25F, -2F);
		bodyModel[370].rotateAngleY = -0.45378561F;

		bodyModel[371].addBox(0F, 0F, 0F, 5, 1, 12, 0F); // Box 372 up ptc blocc bigger
		bodyModel[371].setRotationPoint(-38.5F, -22.5F, -6F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 373 up ptc shit
		bodyModel[372].setRotationPoint(-38F, -23F, -5.5F);

		bodyModel[373].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 374 up ptc shit
		bodyModel[373].setRotationPoint(-38F, -23F, 4.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375 ptc smol
		bodyModel[374].setRotationPoint(-30.75F, -23.25F, 0F);

		bodyModel[375].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 376 early up radome thing
		bodyModel[375].setRotationPoint(-36F, -23F, -6F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377 early up antenna
		bodyModel[376].setRotationPoint(-31.75F, -23F, 5F);

		bodyModel[377].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 378 early up radome thing2
		bodyModel[377].setRotationPoint(-38F, -23F, -1F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[378].setRotationPoint(-39F, -23F, -1F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[379].setRotationPoint(-39F, -23.5F, -1F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[380].setRotationPoint(-39F, -23.5F, -1F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[381].setRotationPoint(-39F, -23.5F, -1F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[382].setRotationPoint(-39F, -23.5F, -1F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350 mu plug
		bodyModel[383].setRotationPoint(-51.5F, -0.5F, 3F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 351 mu plug
		bodyModel[384].setRotationPoint(-52F, -0.5F, -5F);

		bodyModel[385].addBox(0F, 0F, 0F, 0, 4, 9, 0F); // Box 352 hoser
		bodyModel[385].setRotationPoint(-51.75F, 0F, -4.5F);
		bodyModel[385].rotateAngleY = -0.03490659F;
		bodyModel[385].rotateAngleZ = -0.40142573F;

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[386].setRotationPoint(-51.5F, -0.5F, -5F);

		bodyModel[387].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 388 csx radome thing
		bodyModel[387].setRotationPoint(-27F, -23F, 3F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 389 gee whiz csx, why does emd led you have 3 MU plugs?
		bodyModel[388].setRotationPoint(-51.5F, -0.5F, -7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 307 beansniff ptc bubble
		bodyModel[389].setRotationPoint(-37F, -23F, -2.5F);

		bodyModel[390].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 391
		bodyModel[390].setRotationPoint(-28.75F, -24F, 0F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[391].setRotationPoint(-35F, -23F, -9.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[392].setRotationPoint(-35F, -23F, 6.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[393].setRotationPoint(-34.5F, -24F, -8F);

		bodyModel[394].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[394].setRotationPoint(-34.5F, -24F, 8F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -2.5F, -1F, 0F, 2F, 0F, 0F, -0.5F); // Box 396
		bodyModel[395].setRotationPoint(55F, 7F, 0F);
		bodyModel[395].rotateAngleY = 1.57079633F;

		bodyModel[396].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 3F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 2F); // Box 397
		bodyModel[396].setRotationPoint(55F, 7F, -10F);
		bodyModel[396].rotateAngleY = 1.57079633F;

		bodyModel[397].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0.5F); // Box 398
		bodyModel[397].setRotationPoint(53F, 6F, 4F);
		bodyModel[397].rotateAngleY = 1.57079633F;

		bodyModel[398].addShapeBox(-2F, 0F, -1F, 6, 1, 1, 0F,0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 1F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F); // Box 399
		bodyModel[398].setRotationPoint(53F, 6F, -8F);
		bodyModel[398].rotateAngleY = 1.57079633F;

		bodyModel[399].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 236
		bodyModel[399].setRotationPoint(-38F, -14F, 2F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, -7.5F, 0F, -2F, -7.5F, 0F, -2F, 3F, 0F, -2F, 3F); // Box 86
		bodyModel[400].setRotationPoint(-38F, -16F, -5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[401].setRotationPoint(-38F, -16F, 7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 404
		bodyModel[402].setRotationPoint(-38F, -16F, 2F);

		bodyModel[403].addBox(0F, 0F, 0F, 4, 6, 2, 0F); // Box 405
		bodyModel[403].setRotationPoint(-38F, -13F, 2F);

		bodyModel[404].addBox(0F, 0F, -4F, 8, 1, 4, 0F); // Box 406
		bodyModel[404].setRotationPoint(-38F, -7F, 2F);
		bodyModel[404].rotateAngleY = 1.57079633F;

		bodyModel[405].addShapeBox(0F, 0F, -4F, 8, 1, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[405].setRotationPoint(-34F, -7F, 2F);
		bodyModel[405].rotateAngleY = 1.57079633F;

		bodyModel[406].addBox(0F, 0F, 0F, 10, 1, 5, 0F); // Box 408
		bodyModel[406].setRotationPoint(-38F, -7F, -10F);

		bodyModel[407].addShapeBox(0F, 0F, -3F, 9, 2, 3, 0F,-0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -1.5F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -2F, -0.1F, -1F, 0.4F); // Box 409
		bodyModel[407].setRotationPoint(-40F, -21F, 0F);
		bodyModel[407].rotateAngleY = 1.57079633F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[408].setRotationPoint(-38F, -14F, -10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, -7.5F, 0F, -2F, -7.5F, 0F, -2F, 3F, 0F, -2F, 3F); // Box 410 this conductor screen thing isnt stock usually
		bodyModel[409].setRotationPoint(-38F, -16F, -17F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 411
		bodyModel[410].setRotationPoint(-38F, -13F, -5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[411].setRotationPoint(-34F, -14F, -4F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -0.5F, 0F, 21F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -0.5F, 0F, 21F); // Box 413 cull handrail filler
		bodyModel[412].setRotationPoint(-27F, -15F, -11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F); // Box 414 cull window partition box
		bodyModel[413].setRotationPoint(-33.5F, -19F, -11F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[414].setRotationPoint(-37F, -19.5F, -11F);
		bodyModel[414].rotateAngleX = -0.78539816F;

		bodyModel[415].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[415].setRotationPoint(-37F, -19.5F, 11F);
		bodyModel[415].rotateAngleX = 0.78539816F;

		bodyModel[416].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 417
		bodyModel[416].setRotationPoint(-35F, -19F, -12F);

		bodyModel[417].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 418
		bodyModel[417].setRotationPoint(-35F, -19F, 11F);

		bodyModel[418].addBox(0F, 0F, 0F, 0, 4, 9, 0F); // Box 419
		bodyModel[418].setRotationPoint(51.25F, 0F, -4.5F);
		bodyModel[418].rotateAngleZ = 0.40142573F;

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 420
		bodyModel[419].setRotationPoint(50.5F, -0.5F, -5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 421
		bodyModel[420].setRotationPoint(50.5F, -0.5F, 3F);

		bodyModel[421].addShapeBox(0F, 0F, -3F, 9, 1, 3, 0F,-0.1F, -0.125F, 0.25F, -1.1F, -0.5F, 0.25F, -1.1F, -0.5F, -2F, -0.1F, -0.125F, 0.4F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -2F, -0.1F, 0F, 0.4F); // Box 422
		bodyModel[421].setRotationPoint(-40F, -22F, 0F);
		bodyModel[421].rotateAngleY = 1.57079633F;

		bodyModel[422].addShapeBox(0F, 0F, 0F, 0, 4, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -9.1F, 0F, 0F, -9.1F, 0.25F, -2F, -0.1F, -0.25F, -2F, -0.1F, -0.25F, -2F, -9.1F, 0.25F, -2F, -9.1F); // Box 423
		bodyModel[422].setRotationPoint(-36.74F, -21F, 0F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 8, 0, 16, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, -8F); // Box 424
		bodyModel[423].setRotationPoint(-38F, -14.01F, 2F);

		bodyModel[424].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // Box 425 fridge
		bodyModel[424].setRotationPoint(-37.5F, -12.5F, -3F);

		bodyModel[425].addBox(0F, 0F, 0F, 1, 15, 12, 0F); // Box 426 cab backpannel
		bodyModel[425].setRotationPoint(-28.5F, -21F, -6F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 94, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F); // Box 402 cull lots of little pipes
		bodyModel[426].setRotationPoint(-47F, 2F, -6.4F);
		bodyModel[426].rotateAngleX = 2.26892803F;

		bodyModel[427].addShapeBox(0F, 0F, -2F, 94, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F); // Box 382 cull lots of little pipes
		bodyModel[427].setRotationPoint(-47F, 2F, 6.4F);
		bodyModel[427].rotateAngleX = -2.26892803F;

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 396
		bodyModel[428].setRotationPoint(52F, -3F, -6F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 397
		bodyModel[429].setRotationPoint(52F, -3F, 4F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[430].setRotationPoint(52.25F, -3F, -6F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 399 ditchlight
		bodyModel[431].setRotationPoint(52.25F, -3F, 4F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 434 nose interior cover
		bodyModel[432].setRotationPoint(-42F, -15.51F, 0F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 0, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435 nose interior cover
		bodyModel[433].setRotationPoint(-42F, -15.51F, -7F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19 filler up please
		bodyModel[434].setRotationPoint(12.15F, 2F, -11.25F);
		bodyModel[434].rotateAngleX = 1.02974426F;

		bodyModel[435].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560 filler up please
		bodyModel[435].setRotationPoint(12.15F, 2F, 11.25F);
		bodyModel[435].rotateAngleX = 1.02974426F;
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 452 airtank 2
		bodyModel[436].setRotationPoint(0F, 1F, 9.7F);
		bodyModel[436].rotateAngleX = 0.78539816F;

		bodyModel[437].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 453 airtank 2
		bodyModel[437].setRotationPoint(0F, 1F, -9.7F);
		bodyModel[437].rotateAngleX = 0.78539816F;

		bodyModel[438].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base rco
		bodyModel[438].setRotationPoint(-36F, -23F, 9F);
		bodyModel[438].rotateAngleX = -0.4712389F;

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon RCO
		bodyModel[439].setRotationPoint(-36F, -23F, 9F);
		bodyModel[439].rotateAngleX = -0.4712389F;

		bodyModel[440].addShapeBox(0F, 1F, -1F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base rco
		bodyModel[440].setRotationPoint(-36F, -23F, -9F);
		bodyModel[440].rotateAngleX = 0.4712389F;

		bodyModel[441].addShapeBox(0F, 0F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon RCO
		bodyModel[441].setRotationPoint(-36F, -23F, -9F);
		bodyModel[441].rotateAngleX = 0.4712389F;

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 466 alaska is greedy and wants a third one
		bodyModel[442].setRotationPoint(50.5F, -0.5F, 5.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap nose 2
		bodyModel[443].setRotationPoint(-44.25F, -16F, 5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 285 sandcap nose 2
		bodyModel[444].setRotationPoint(-44.25F, -16F, -7F);

		bodyModel[445].addBox(0F, 0F, 0F, 12, 2, 10, 0F); // Box 455 cull arr winterization hatch
		bodyModel[445].setRotationPoint(17.5F, -23.5F, -5F);

		bodyModel[446].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 464
		bodyModel[446].setRotationPoint(10F, -23F, -2.5F);

		bodyModel[447].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 465
		bodyModel[447].setRotationPoint(10F, -23F, 1.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 467 is this seriously how they do extended range db i am going to shit myself
		bodyModel[448].setRotationPoint(-24F, -22F, 7F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 467 is this seriously how they do extended range db i am going to shit myself
		bodyModel[449].setRotationPoint(-24F, -22F, -8F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[450].setRotationPoint(-35F, -23F, -1F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[451].setRotationPoint(-35F, -23.5F, -1F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[452].setRotationPoint(-35F, -23.5F, -1F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[453].setRotationPoint(-35F, -23.5F, -1F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[454].setRotationPoint(-35F, -23.5F, -1F);
	}
	ModelHTCR2_new bogie = new ModelHTCR2_new();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 1) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_itsilver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.01F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.015F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 1213) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_bnsilver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.01F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.015F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 232) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_upgrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.01F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.015F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.01F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.015F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
	}
}