//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F3a
// Model Creator: Bidahochi
// Created on: 22.06.2020 - 11:10:51
// Last changed on: 22.06.2020 - 11:10:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelF9b extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelF9b() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[323];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 248, 148, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 215, 172, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 215, 180, textureX, textureY); // Box 1 coupler
		bodyModel[3] = new ModelRendererTurbo(this, 252, 105, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 252, 78, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 240, 180, textureX, textureY, "cull"); // Box 1 cull rear draft gear
		bodyModel[6] = new ModelRendererTurbo(this, 235, 193, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 250, 193, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 369, 85, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 226, 24, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 223, 16, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 226, 10, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 227, 30, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 227, 5, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 228, 35, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 228, 2, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 357, 86, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 375, 94, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 113, 38, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 249, 46, textureX, textureY); // Box 0 dynamic fan large
		bodyModel[20] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 45
		bodyModel[21] = new ModelRendererTurbo(this, 306, 211, textureX, textureY); // Box 50
		bodyModel[22] = new ModelRendererTurbo(this, 239, 209, textureX, textureY); // Box 139
		bodyModel[23] = new ModelRendererTurbo(this, 266, 221, textureX, textureY); // Box 140 fuel tank filler panel
		bodyModel[24] = new ModelRendererTurbo(this, 257, 221, textureX, textureY); // Box 141 fuel tank filler panel
		bodyModel[25] = new ModelRendererTurbo(this, 177, 47, textureX, textureY, "cull"); // Box 153 cull handrails
		bodyModel[26] = new ModelRendererTurbo(this, 162, 47, textureX, textureY, "cull"); // Box 154 cull handrails
		bodyModel[27] = new ModelRendererTurbo(this, 190, 47, textureX, textureY, "cull"); // Box 178 cull handrails
		bodyModel[28] = new ModelRendererTurbo(this, 149, 47, textureX, textureY, "cull"); // Box 180 cull handrails
		bodyModel[29] = new ModelRendererTurbo(this, 313, 57, textureX, textureY, "cull"); // Box 186 winterization hatch cull
		bodyModel[30] = new ModelRendererTurbo(this, 472, 176, textureX, textureY); // Box 187 Steam/HEP gen exhaust
		bodyModel[31] = new ModelRendererTurbo(this, 491, 176, textureX, textureY); // Box 188 Steam/HEP gen exhaust
		bodyModel[32] = new ModelRendererTurbo(this, 203, 47, textureX, textureY, "cull"); // Box 199 cull handrails
		bodyModel[33] = new ModelRendererTurbo(this, 140, 47, textureX, textureY, "cull"); // Box 201 cull handrails
		bodyModel[34] = new ModelRendererTurbo(this, 364, 79, textureX, textureY); // Box 202
		bodyModel[35] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 203
		bodyModel[36] = new ModelRendererTurbo(this, 182, 6, textureX, textureY); // Box 131 cs hostler ab shit
		bodyModel[37] = new ModelRendererTurbo(this, 181, 10, textureX, textureY); // Box 131 cs hostler ab shit
		bodyModel[38] = new ModelRendererTurbo(this, 371, 81, textureX, textureY); // Box 231
		bodyModel[39] = new ModelRendererTurbo(this, 199, 166, textureX, textureY); // Box 222 mu hoses
		bodyModel[40] = new ModelRendererTurbo(this, 396, 160, textureX, textureY); // Box 438
		bodyModel[41] = new ModelRendererTurbo(this, 396, 160, textureX, textureY); // Box 439
		bodyModel[42] = new ModelRendererTurbo(this, 255, 172, textureX, textureY); // Box 441
		bodyModel[43] = new ModelRendererTurbo(this, 320, 108, textureX, textureY); // Box 329 door swing left hood
		bodyModel[44] = new ModelRendererTurbo(this, 320, 81, textureX, textureY); // Box 332 door swing right hood
		bodyModel[45] = new ModelRendererTurbo(this, 332, 105, textureX, textureY); // Box 333
		bodyModel[46] = new ModelRendererTurbo(this, 332, 78, textureX, textureY); // Box 334
		bodyModel[47] = new ModelRendererTurbo(this, 320, 74, textureX, textureY); // Box 335
		bodyModel[48] = new ModelRendererTurbo(this, 320, 101, textureX, textureY); // Box 336
		bodyModel[49] = new ModelRendererTurbo(this, 320, 93, textureX, textureY); // Box 337
		bodyModel[50] = new ModelRendererTurbo(this, 320, 120, textureX, textureY); // Box 338
		bodyModel[51] = new ModelRendererTurbo(this, 393, 86, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[52] = new ModelRendererTurbo(this, 272, 56, textureX, textureY); // Box 464 gn fuckshit cube
		bodyModel[53] = new ModelRendererTurbo(this, 417, 191, textureX, textureY); // Box 5
		bodyModel[54] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 6
		bodyModel[55] = new ModelRendererTurbo(this, 409, 229, textureX, textureY); // Box 10
		bodyModel[56] = new ModelRendererTurbo(this, 358, 242, textureX, textureY); // Box 13
		bodyModel[57] = new ModelRendererTurbo(this, 461, 229, textureX, textureY); // Box 14
		bodyModel[58] = new ModelRendererTurbo(this, 471, 243, textureX, textureY); // Box 9
		bodyModel[59] = new ModelRendererTurbo(this, 466, 238, textureX, textureY); // Box 21
		bodyModel[60] = new ModelRendererTurbo(this, 94, 35, textureX, textureY); // Box 13
		bodyModel[61] = new ModelRendererTurbo(this, 370, 217, textureX, textureY); // Box 10
		bodyModel[62] = new ModelRendererTurbo(this, 370, 217, textureX, textureY); // Box 10
		bodyModel[63] = new ModelRendererTurbo(this, 417, 184, textureX, textureY); // Box 7
		bodyModel[64] = new ModelRendererTurbo(this, 95, 38, textureX, textureY); // Box 513
		bodyModel[65] = new ModelRendererTurbo(this, 373, 246, textureX, textureY); // Box 522
		bodyModel[66] = new ModelRendererTurbo(this, 392, 218, textureX, textureY); // Box 523
		bodyModel[67] = new ModelRendererTurbo(this, 53, 63, textureX, textureY); // Box 404 she wheel on my antenna till i wagon
		bodyModel[68] = new ModelRendererTurbo(this, 40, 63, textureX, textureY); // Box 405 she wheel on my antenna till i wagon
		bodyModel[69] = new ModelRendererTurbo(this, 288, 57, textureX, textureY, "cull"); // Box 186 winterization hatch cull tall
		bodyModel[70] = new ModelRendererTurbo(this, 444, 158, textureX, textureY, "cull"); // Box 522 atsf tall arrestor cull
		bodyModel[71] = new ModelRendererTurbo(this, 450, 152, textureX, textureY); // Box 523 atsf tall arrestor tip
		bodyModel[72] = new ModelRendererTurbo(this, 444, 158, textureX, textureY, "cull"); // Box 522 atsf tall arrestor cull
		bodyModel[73] = new ModelRendererTurbo(this, 450, 152, textureX, textureY); // Box 523 atsf tall arrestor tip
		bodyModel[74] = new ModelRendererTurbo(this, 198, 208, textureX, textureY); // Box 342
		bodyModel[75] = new ModelRendererTurbo(this, 191, 208, textureX, textureY); // Box 343
		bodyModel[76] = new ModelRendererTurbo(this, 229, 208, textureX, textureY); // Box 345
		bodyModel[77] = new ModelRendererTurbo(this, 200, 211, textureX, textureY); // Box 456
		bodyModel[78] = new ModelRendererTurbo(this, 198, 215, textureX, textureY); // Box 458
		bodyModel[79] = new ModelRendererTurbo(this, 229, 215, textureX, textureY); // Box 459
		bodyModel[80] = new ModelRendererTurbo(this, 191, 215, textureX, textureY); // Box 461
		bodyModel[81] = new ModelRendererTurbo(this, 197, 211, textureX, textureY); // Box 462
		bodyModel[82] = new ModelRendererTurbo(this, 227, 211, textureX, textureY); // Box 463
		bodyModel[83] = new ModelRendererTurbo(this, 200, 218, textureX, textureY); // Box 464
		bodyModel[84] = new ModelRendererTurbo(this, 227, 218, textureX, textureY); // Box 465
		bodyModel[85] = new ModelRendererTurbo(this, 197, 218, textureX, textureY); // Box 466
		bodyModel[86] = new ModelRendererTurbo(this, 338, 209, textureX, textureY); // Box 46
		bodyModel[87] = new ModelRendererTurbo(this, 339, 220, textureX, textureY); // Box 48
		bodyModel[88] = new ModelRendererTurbo(this, 313, 220, textureX, textureY); // Box 99
		bodyModel[89] = new ModelRendererTurbo(this, 312, 209, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 277, 213, textureX, textureY); // Box 96 air tank pipe
		bodyModel[91] = new ModelRendererTurbo(this, 282, 212, textureX, textureY); // Box 130 FUCK FUCK FUCK FUCK AAAUGGGHHHH IM PRESSURIZED STEEWWWIE IM SO FULL OF COMPRESSED AIR AND CONDENSATIONS STEWWIEEE YOU NEED TO OPEN THE SPITTER VALE AND DRAIN MEEEE AUUGHHH STEWWIEEEE
		bodyModel[92] = new ModelRendererTurbo(this, 283, 213, textureX, textureY); // Box 131
		bodyModel[93] = new ModelRendererTurbo(this, 283, 213, textureX, textureY); // Box 132
		bodyModel[94] = new ModelRendererTurbo(this, 232, 178, textureX, textureY); // Box 485
		bodyModel[95] = new ModelRendererTurbo(this, 254, 189, textureX, textureY); // Box 719
		bodyModel[96] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 129
		bodyModel[97] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 130
		bodyModel[98] = new ModelRendererTurbo(this, 392, 160, textureX, textureY); // Box 133
		bodyModel[99] = new ModelRendererTurbo(this, 392, 160, textureX, textureY); // Box 134
		bodyModel[100] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 726
		bodyModel[101] = new ModelRendererTurbo(this, 393, 154, textureX, textureY); // Box 727
		bodyModel[102] = new ModelRendererTurbo(this, 393, 154, textureX, textureY); // Box 728
		bodyModel[103] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 729
		bodyModel[104] = new ModelRendererTurbo(this, 392, 152, textureX, textureY); // Box 730
		bodyModel[105] = new ModelRendererTurbo(this, 392, 152, textureX, textureY); // Box 731
		bodyModel[106] = new ModelRendererTurbo(this, 359, 82, textureX, textureY); // Box 734
		bodyModel[107] = new ModelRendererTurbo(this, 377, 82, textureX, textureY); // Box 735
		bodyModel[108] = new ModelRendererTurbo(this, 403, 182, textureX, textureY); // Box 184 stack
		bodyModel[109] = new ModelRendererTurbo(this, 403, 182, textureX, textureY); // Box 185 stack
		bodyModel[110] = new ModelRendererTurbo(this, 218, 39, textureX, textureY, "cull"); // Box 501 cull pipe cooler gn thing
		bodyModel[111] = new ModelRendererTurbo(this, 261, 228, textureX, textureY); // Box 502 fuel filler no pannel
		bodyModel[112] = new ModelRendererTurbo(this, 261, 228, textureX, textureY); // Box 503 fuel filler no pannel
		bodyModel[113] = new ModelRendererTurbo(this, 423, 86, textureX, textureY); // Box 128 rear diaphram
		bodyModel[114] = new ModelRendererTurbo(this, 436, 86, textureX, textureY); // Box 153 rear diaphram
		bodyModel[115] = new ModelRendererTurbo(this, 424, 90, textureX, textureY); // Box 128 rear diaphram
		bodyModel[116] = new ModelRendererTurbo(this, 405, 79, textureX, textureY); // Box 190 rear mu plug
		bodyModel[117] = new ModelRendererTurbo(this, 149, 60, textureX, textureY, "cull"); // Box 631 cull
		bodyModel[118] = new ModelRendererTurbo(this, 136, 55, textureX, textureY, "cull"); // Box 636 cull
		bodyModel[119] = new ModelRendererTurbo(this, 162, 65, textureX, textureY, "cull"); // Box 637 cull
		bodyModel[120] = new ModelRendererTurbo(this, 203, 55, textureX, textureY, "cull"); // Box 638 cull
		bodyModel[121] = new ModelRendererTurbo(this, 190, 60, textureX, textureY, "cull"); // Box 639 cull
		bodyModel[122] = new ModelRendererTurbo(this, 177, 65, textureX, textureY, "cull"); // Box 640 cull
		bodyModel[123] = new ModelRendererTurbo(this, 360, 88, textureX, textureY); // Box 815
		bodyModel[124] = new ModelRendererTurbo(this, 375, 88, textureX, textureY); // Box 816
		bodyModel[125] = new ModelRendererTurbo(this, 361, 94, textureX, textureY); // Box 817
		bodyModel[126] = new ModelRendererTurbo(this, 341, 39, textureX, textureY, "cull"); // Box 444 CULL f3a mesh grill
		bodyModel[127] = new ModelRendererTurbo(this, 317, 46, textureX, textureY); // Box 683 fan
		bodyModel[128] = new ModelRendererTurbo(this, 269, 49, textureX, textureY); // Box 450 fan
		bodyModel[129] = new ModelRendererTurbo(this, 285, 46, textureX, textureY); // Box 451 fan
		bodyModel[130] = new ModelRendererTurbo(this, 301, 49, textureX, textureY); // Box 452 fan
		bodyModel[131] = new ModelRendererTurbo(this, 341, 1, textureX, textureY, "cull"); // Box 455 CULL f3a mesh grill
		bodyModel[132] = new ModelRendererTurbo(this, 253, 39, textureX, textureY); // Box 457 dynamic fan small
		bodyModel[133] = new ModelRendererTurbo(this, 285, 39, textureX, textureY); // Box 458 f3a tall fan
		bodyModel[134] = new ModelRendererTurbo(this, 301, 42, textureX, textureY); // Box 459 f3a tall fan
		bodyModel[135] = new ModelRendererTurbo(this, 317, 39, textureX, textureY); // Box 460 f3a tall fan
		bodyModel[136] = new ModelRendererTurbo(this, 269, 42, textureX, textureY); // Box 461 f3a tall fan
		bodyModel[137] = new ModelRendererTurbo(this, 389, 225, textureX, textureY); // Box 298
		bodyModel[138] = new ModelRendererTurbo(this, 383, 233, textureX, textureY); // Box 299
		bodyModel[139] = new ModelRendererTurbo(this, 389, 248, textureX, textureY); // Box 300
		bodyModel[140] = new ModelRendererTurbo(this, 411, 241, textureX, textureY); // Box 465
		bodyModel[141] = new ModelRendererTurbo(this, 411, 214, textureX, textureY); // Box 466
		bodyModel[142] = new ModelRendererTurbo(this, 409, 198, textureX, textureY); // Box 467
		bodyModel[143] = new ModelRendererTurbo(this, 389, 200, textureX, textureY); // Box 468
		bodyModel[144] = new ModelRendererTurbo(this, 372, 225, textureX, textureY); // Box 469
		bodyModel[145] = new ModelRendererTurbo(this, 372, 225, textureX, textureY); // Box 470
		bodyModel[146] = new ModelRendererTurbo(this, 411, 228, textureX, textureY); // Box 471
		bodyModel[147] = new ModelRendererTurbo(this, 392, 194, textureX, textureY); // Box 472
		bodyModel[148] = new ModelRendererTurbo(this, 392, 194, textureX, textureY); // Box 473
		bodyModel[149] = new ModelRendererTurbo(this, 372, 231, textureX, textureY); // Box 474
		bodyModel[150] = new ModelRendererTurbo(this, 374, 240, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 374, 240, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 483, 229, textureX, textureY, "cull"); // Box 477 cull equipment rack
		bodyModel[153] = new ModelRendererTurbo(this, 491, 247, textureX, textureY); // Box 478
		bodyModel[154] = new ModelRendererTurbo(this, 491, 247, textureX, textureY); // Box 479
		bodyModel[155] = new ModelRendererTurbo(this, 484, 219, textureX, textureY); // Box 480 lube filter
		bodyModel[156] = new ModelRendererTurbo(this, 468, 211, textureX, textureY); // Box 481 engine water tank
		bodyModel[157] = new ModelRendererTurbo(this, 475, 232, textureX, textureY); // Box 482
		bodyModel[158] = new ModelRendererTurbo(this, 467, 189, textureX, textureY); // Box 0 Steam/HEP gen
		bodyModel[159] = new ModelRendererTurbo(this, 486, 189, textureX, textureY); // Box 485 Steam/HEP gen
		bodyModel[160] = new ModelRendererTurbo(this, 337, 229, textureX, textureY); // Box 429 dynamics internal
		bodyModel[161] = new ModelRendererTurbo(this, 239, 217, textureX, textureY); // Box 423
		bodyModel[162] = new ModelRendererTurbo(this, 239, 213, textureX, textureY); // Box 424
		bodyModel[163] = new ModelRendererTurbo(this, 341, 65, textureX, textureY, "cull"); // Box 416 late grills CULL
		bodyModel[164] = new ModelRendererTurbo(this, 341, 26, textureX, textureY, "cull"); // Box 417 late grills CULL
		bodyModel[165] = new ModelRendererTurbo(this, 462, 94, textureX, textureY); // Box 410
		bodyModel[166] = new ModelRendererTurbo(this, 462, 100, textureX, textureY); // Box 411
		bodyModel[167] = new ModelRendererTurbo(this, 463, 83, textureX, textureY); // Box 412
		bodyModel[168] = new ModelRendererTurbo(this, 463, 88, textureX, textureY); // Box 414
		bodyModel[169] = new ModelRendererTurbo(this, 463, 106, textureX, textureY); // Box 415
		bodyModel[170] = new ModelRendererTurbo(this, 461, 112, textureX, textureY); // Box 416 interior engine bit
		bodyModel[171] = new ModelRendererTurbo(this, 461, 112, textureX, textureY); // Box 417 interior engine bit
		bodyModel[172] = new ModelRendererTurbo(this, 227, 98, textureX, textureY); // Box 418 sandcap fill
		bodyModel[173] = new ModelRendererTurbo(this, 331, 101, textureX, textureY); // Box 419 sandcap fill
		bodyModel[174] = new ModelRendererTurbo(this, 405, 84, textureX, textureY, "lamp"); // Box 420 headlight rear very high
		bodyModel[175] = new ModelRendererTurbo(this, 261, 234, textureX, textureY); // Box 420 fuel filler with skirting OR extra thicc tank fuel filler
		bodyModel[176] = new ModelRendererTurbo(this, 261, 234, textureX, textureY); // Box 421 fuel filler with skirting OR extra thicc tank fuel filler
		bodyModel[177] = new ModelRendererTurbo(this, 208, 231, textureX, textureY); // Box 450 fuel tank embiggened
		bodyModel[178] = new ModelRendererTurbo(this, 212, 243, textureX, textureY); // Box 451 fuel tank embiggened
		bodyModel[179] = new ModelRendererTurbo(this, 210, 221, textureX, textureY); // Box 452 fuel tank embiggened
		bodyModel[180] = new ModelRendererTurbo(this, 268, 221, textureX, textureY); // Box 453 fuel tank standard
		bodyModel[181] = new ModelRendererTurbo(this, 266, 231, textureX, textureY); // Box 454 fuel tank standard
		bodyModel[182] = new ModelRendererTurbo(this, 270, 243, textureX, textureY); // Box 455 fuel tank standard
		bodyModel[183] = new ModelRendererTurbo(this, 319, 250, textureX, textureY); // Box 456 fuel tank wp extensions
		bodyModel[184] = new ModelRendererTurbo(this, 317, 244, textureX, textureY); // Box 457 fuel tank wp extensions
		bodyModel[185] = new ModelRendererTurbo(this, 269, 58, textureX, textureY); // Box 440 spark arrestor cap
		bodyModel[186] = new ModelRendererTurbo(this, 269, 58, textureX, textureY); // Box 441 spark arrestor cap
		bodyModel[187] = new ModelRendererTurbo(this, 78, 72, textureX, textureY); // Box 364 prime base
		bodyModel[188] = new ModelRendererTurbo(this, 78, 68, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[189] = new ModelRendererTurbo(this, 78, 68, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[190] = new ModelRendererTurbo(this, 78, 68, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[191] = new ModelRendererTurbo(this, 78, 68, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[192] = new ModelRendererTurbo(this, 88, 73, textureX, textureY); // Box 409 commander base
		bodyModel[193] = new ModelRendererTurbo(this, 88, 69, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[194] = new ModelRendererTurbo(this, 60, 65, textureX, textureY); // Box 449 firecracker antenna
		bodyModel[195] = new ModelRendererTurbo(this, 430, 77, textureX, textureY); // Box 454 rear end no diagphram
		bodyModel[196] = new ModelRendererTurbo(this, 412, 89, textureX, textureY, "lamp"); // Box 455 headlight rear erected outwards
		bodyModel[197] = new ModelRendererTurbo(this, 436, 82, textureX, textureY); // Box 460 rear door step
		bodyModel[198] = new ModelRendererTurbo(this, 405, 89, textureX, textureY, "lamp"); // Box 462 headlight rear boner lower
		bodyModel[199] = new ModelRendererTurbo(this, 405, 94, textureX, textureY, "lamp"); // Box 465 headlight rear boner right
		bodyModel[200] = new ModelRendererTurbo(this, 448, 96, textureX, textureY); // Box 466 rear diaphram
		bodyModel[201] = new ModelRendererTurbo(this, 455, 96, textureX, textureY); // Box 467 rear diaphram
		bodyModel[202] = new ModelRendererTurbo(this, 423, 93, textureX, textureY); // Box 468 rear diaphram
		bodyModel[203] = new ModelRendererTurbo(this, 421, 83, textureX, textureY); // Box 469 rear diaphram
		bodyModel[204] = new ModelRendererTurbo(this, 307, 57, textureX, textureY, "cull"); // Box 478 cull trapezoid spark arrestor
		bodyModel[205] = new ModelRendererTurbo(this, 307, 57, textureX, textureY, "cull"); // Box 479 cull trapezoid spark arrestor
		bodyModel[206] = new ModelRendererTurbo(this, 88, 80, textureX, textureY); // Box 409 commander base
		bodyModel[207] = new ModelRendererTurbo(this, 88, 76, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[208] = new ModelRendererTurbo(this, 86, 83, textureX, textureY, "cull"); // Box 88 cull mkt beacon platform
		bodyModel[209] = new ModelRendererTurbo(this, 49, 61, textureX, textureY); // Box 287 sinclair antenna
		bodyModel[210] = new ModelRendererTurbo(this, 318, 66, textureX, textureY); // Box 492 "round" spark arrestor
		bodyModel[211] = new ModelRendererTurbo(this, 318, 66, textureX, textureY); // Box 493 "round" spark arrestor
		bodyModel[212] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 506 tube exhaust
		bodyModel[213] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 507 tube exhaust
		bodyModel[214] = new ModelRendererTurbo(this, 220, 62, textureX, textureY); // Box 504 F3 DYNAMICS
		bodyModel[215] = new ModelRendererTurbo(this, 152, 79, textureX, textureY, "cull"); // Box 505 cull mysterious F9 roof radiator pipes
		bodyModel[216] = new ModelRendererTurbo(this, 79, 80, textureX, textureY); // Box 409 commander base
		bodyModel[217] = new ModelRendererTurbo(this, 79, 76, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[218] = new ModelRendererTurbo(this, 26, 57, textureX, textureY, "cull"); // Box 512 cull fmsr number mount
		bodyModel[219] = new ModelRendererTurbo(this, 26, 61, textureX, textureY, "cull"); // Box 513 cull fmsr number mount
		bodyModel[220] = new ModelRendererTurbo(this, 1, 103, textureX, textureY); // Box 635 locomotive plate
		bodyModel[221] = new ModelRendererTurbo(this, 232, 178, textureX, textureY); // Box 527
		bodyModel[222] = new ModelRendererTurbo(this, 240, 180, textureX, textureY, "cull"); // Box 1 cull rear draft gear
		bodyModel[223] = new ModelRendererTurbo(this, 235, 193, textureX, textureY); // Box 1
		bodyModel[224] = new ModelRendererTurbo(this, 250, 193, textureX, textureY); // Box 1
		bodyModel[225] = new ModelRendererTurbo(this, 63, 104, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 194, 174, textureX, textureY); // Box 532 mu hosers
		bodyModel[227] = new ModelRendererTurbo(this, 190, 16, textureX, textureY); // Box 533
		bodyModel[228] = new ModelRendererTurbo(this, 199, 10, textureX, textureY); // Box 534
		bodyModel[229] = new ModelRendererTurbo(this, 202, 5, textureX, textureY); // Box 535
		bodyModel[230] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 536
		bodyModel[231] = new ModelRendererTurbo(this, 199, 24, textureX, textureY); // Box 537
		bodyModel[232] = new ModelRendererTurbo(this, 202, 30, textureX, textureY); // Box 538
		bodyModel[233] = new ModelRendererTurbo(this, 205, 35, textureX, textureY); // Box 539
		bodyModel[234] = new ModelRendererTurbo(this, 69, 113, textureX, textureY); // Box 540
		bodyModel[235] = new ModelRendererTurbo(this, 51, 105, textureX, textureY); // Box 541
		bodyModel[236] = new ModelRendererTurbo(this, 69, 107, textureX, textureY); // Box 542
		bodyModel[237] = new ModelRendererTurbo(this, 54, 107, textureX, textureY); // Box 543
		bodyModel[238] = new ModelRendererTurbo(this, 55, 113, textureX, textureY); // Box 544
		bodyModel[239] = new ModelRendererTurbo(this, 224, 108, textureX, textureY); // Box 329 door swing left hood
		bodyModel[240] = new ModelRendererTurbo(this, 224, 81, textureX, textureY); // Box 332 door swing right hood
		bodyModel[241] = new ModelRendererTurbo(this, 224, 93, textureX, textureY); // Box 337
		bodyModel[242] = new ModelRendererTurbo(this, 224, 120, textureX, textureY); // Box 338
		bodyModel[243] = new ModelRendererTurbo(this, 224, 74, textureX, textureY); // Box 549
		bodyModel[244] = new ModelRendererTurbo(this, 224, 101, textureX, textureY); // Box 550
		bodyModel[245] = new ModelRendererTurbo(this, 236, 105, textureX, textureY); // Box 551
		bodyModel[246] = new ModelRendererTurbo(this, 236, 78, textureX, textureY); // Box 552
		bodyModel[247] = new ModelRendererTurbo(this, 306, 148, textureX, textureY); // Box 553
		bodyModel[248] = new ModelRendererTurbo(this, 204, 105, textureX, textureY); // Box 554
		bodyModel[249] = new ModelRendererTurbo(this, 204, 85, textureX, textureY); // Box 555
		bodyModel[250] = new ModelRendererTurbo(this, 58, 98, textureX, textureY); // Box 556
		bodyModel[251] = new ModelRendererTurbo(this, 55, 100, textureX, textureY); // Box 557
		bodyModel[252] = new ModelRendererTurbo(this, 53, 101, textureX, textureY); // Box 558
		bodyModel[253] = new ModelRendererTurbo(this, 65, 100, textureX, textureY); // Box 559
		bodyModel[254] = new ModelRendererTurbo(this, 71, 101, textureX, textureY); // Box 560
		bodyModel[255] = new ModelRendererTurbo(this, 421, 77, textureX, textureY); // Box 453 rear end bit
		bodyModel[256] = new ModelRendererTurbo(this, 412, 77, textureX, textureY); // Box 454 rear end bit
		bodyModel[257] = new ModelRendererTurbo(this, 456, 77, textureX, textureY); // Box 456 rear end no diagphram
		bodyModel[258] = new ModelRendererTurbo(this, 449, 77, textureX, textureY); // Box 457 rear end no diagphram
		bodyModel[259] = new ModelRendererTurbo(this, 463, 77, textureX, textureY); // Box 458 rear end no diagphram
		bodyModel[260] = new ModelRendererTurbo(this, 463, 77, textureX, textureY); // Box 459 rear end no diagphram
		bodyModel[261] = new ModelRendererTurbo(this, 380, 93, textureX, textureY); // Box 461 rear door top lip thing
		bodyModel[262] = new ModelRendererTurbo(this, 383, 78, textureX, textureY); // Box 463 lifting nuts
		bodyModel[263] = new ModelRendererTurbo(this, 383, 78, textureX, textureY); // Box 464 lifting nuts
		bodyModel[264] = new ModelRendererTurbo(this, 115, 96, textureX, textureY); // Box 453 front end bit
		bodyModel[265] = new ModelRendererTurbo(this, 106, 96, textureX, textureY); // Box 454 front end bit
		bodyModel[266] = new ModelRendererTurbo(this, 150, 96, textureX, textureY); // Box 456 front end no diagphram
		bodyModel[267] = new ModelRendererTurbo(this, 143, 96, textureX, textureY); // Box 457 front end no diagphram
		bodyModel[268] = new ModelRendererTurbo(this, 157, 96, textureX, textureY); // Box 458 front end no diagphram
		bodyModel[269] = new ModelRendererTurbo(this, 157, 96, textureX, textureY); // Box 459 front end no diagphram
		bodyModel[270] = new ModelRendererTurbo(this, 74, 112, textureX, textureY); // Box 461 front door top lip thing
		bodyModel[271] = new ModelRendererTurbo(this, 77, 97, textureX, textureY); // Box 463 lifting nuts
		bodyModel[272] = new ModelRendererTurbo(this, 77, 97, textureX, textureY); // Box 464 lifting nuts
		bodyModel[273] = new ModelRendererTurbo(this, 430, 77, textureX, textureY); // Box 454 front end no diagphram
		bodyModel[274] = new ModelRendererTurbo(this, 393, 86, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[275] = new ModelRendererTurbo(this, 436, 82, textureX, textureY); // Box 460 front door step
		bodyModel[276] = new ModelRendererTurbo(this, 203, 39, textureX, textureY, "cull"); // Box 199 cull handrails
		bodyModel[277] = new ModelRendererTurbo(this, 140, 39, textureX, textureY, "cull"); // Box 201 cull handrails
		bodyModel[278] = new ModelRendererTurbo(this, 136, 63, textureX, textureY, "cull"); // Box 636 cull
		bodyModel[279] = new ModelRendererTurbo(this, 203, 63, textureX, textureY, "cull"); // Box 638 cull
		bodyModel[280] = new ModelRendererTurbo(this, 412, 89, textureX, textureY, "lamp"); // Box 455 headlight front erected outwards
		bodyModel[281] = new ModelRendererTurbo(this, 405, 89, textureX, textureY, "lamp"); // Box 462 headlight front boner lower
		bodyModel[282] = new ModelRendererTurbo(this, 405, 94, textureX, textureY, "lamp"); // Box 465 headlight front boner right
		bodyModel[283] = new ModelRendererTurbo(this, 423, 86, textureX, textureY); // Box 128 front diaphram
		bodyModel[284] = new ModelRendererTurbo(this, 436, 86, textureX, textureY); // Box 153 front diaphram
		bodyModel[285] = new ModelRendererTurbo(this, 424, 90, textureX, textureY); // Box 128 front diaphram
		bodyModel[286] = new ModelRendererTurbo(this, 448, 96, textureX, textureY); // Box 466 front diaphram
		bodyModel[287] = new ModelRendererTurbo(this, 455, 96, textureX, textureY); // Box 467 front diaphram
		bodyModel[288] = new ModelRendererTurbo(this, 423, 93, textureX, textureY); // Box 468 front diaphram
		bodyModel[289] = new ModelRendererTurbo(this, 421, 83, textureX, textureY); // Box 469 front diaphram
		bodyModel[290] = new ModelRendererTurbo(this, 174, 11, textureX, textureY); // Box 596 cs hostler shitfuark
		bodyModel[291] = new ModelRendererTurbo(this, 113, 30, textureX, textureY, "cull"); // Box 597 cull electrical shelf
		bodyModel[292] = new ModelRendererTurbo(this, 116, 11, textureX, textureY); // Box 598 electrical shelf
		bodyModel[293] = new ModelRendererTurbo(this, 437, 136, textureX, textureY, "cull"); // Box 444 CULL f3a mesh grill
		bodyModel[294] = new ModelRendererTurbo(this, 437, 124, textureX, textureY, "cull"); // Box 455 CULL f3a mesh grill
		bodyModel[295] = new ModelRendererTurbo(this, 118, 66, textureX, textureY); // Box 378 bell HAYSI
		bodyModel[296] = new ModelRendererTurbo(this, 118, 66, textureX, textureY); // Box 380 bell HAYSI
		bodyModel[297] = new ModelRendererTurbo(this, 117, 69, textureX, textureY); // Box 314 haysi bell holder
		bodyModel[298] = new ModelRendererTurbo(this, 175, 196, textureX, textureY); // Box 315 haysi stepp
		bodyModel[299] = new ModelRendererTurbo(this, 176, 197, textureX, textureY); // Box 316 haysi step bit
		bodyModel[300] = new ModelRendererTurbo(this, 187, 197, textureX, textureY); // Box 317 haysi stepp bit
		bodyModel[301] = new ModelRendererTurbo(this, 182, 196, textureX, textureY); // Box 318 haysi stepp
		bodyModel[302] = new ModelRendererTurbo(this, 475, 52, textureX, textureY, "cull"); // Box 501 cull pipe cooler AMTK thing WHY DID THE MOVE THIS HERE
		bodyModel[303] = new ModelRendererTurbo(this, 484, 158, textureX, textureY); // Box 320 bunit ab equipment
		bodyModel[304] = new ModelRendererTurbo(this, 471, 161, textureX, textureY, "cull"); // Box 321 CULL bunit ab shit
		bodyModel[305] = new ModelRendererTurbo(this, 472, 155, textureX, textureY); // Box 322 bunit ab shit
		bodyModel[306] = new ModelRendererTurbo(this, 111, 3, textureX, textureY); // Box 323 bunit water tank
		bodyModel[307] = new ModelRendererTurbo(this, 421, 164, textureX, textureY, "lamp"); // Box 585 numberboard glow wp steam light
		bodyModel[308] = new ModelRendererTurbo(this, 421, 164, textureX, textureY, "lamp"); // Box 584 numberboard glow wp steam headilght
		bodyModel[309] = new ModelRendererTurbo(this, 420, 158, textureX, textureY); // Box 256 wp steam headlight bit
		bodyModel[310] = new ModelRendererTurbo(this, 421, 168, textureX, textureY); // Box 254 wp steam headlight bit
		bodyModel[311] = new ModelRendererTurbo(this, 421, 168, textureX, textureY); // Box 253 wp steam headlight bit
		bodyModel[312] = new ModelRendererTurbo(this, 420, 151, textureX, textureY, "lamp"); // Box 146  HEADLIHGHT REAR wp steam headlight bit
		bodyModel[313] = new ModelRendererTurbo(this, 428, 156, textureX, textureY); // Box 56 wp steam headlight bit
		bodyModel[314] = new ModelRendererTurbo(this, 111, 67, textureX, textureY); // Box 318 horn blatt (that one ex canada wp f9 the museum has)
		bodyModel[315] = new ModelRendererTurbo(this, 362, 136, textureX, textureY, "cull"); // Box 416 late grills CULL
		bodyModel[316] = new ModelRendererTurbo(this, 362, 124, textureX, textureY, "cull"); // Box 417 late grills CULL
		bodyModel[317] = new ModelRendererTurbo(this, 166, 11, textureX, textureY); // Box 131 cs1 haysi
		bodyModel[318] = new ModelRendererTurbo(this, 157, 9, textureX, textureY); // Box 131 cs1 haysi
		bodyModel[319] = new ModelRendererTurbo(this, 152, 11, textureX, textureY); // Box 131 cs1 haysi
		bodyModel[320] = new ModelRendererTurbo(this, 157, 4, textureX, textureY); // Box 131 cs1 haysi
		bodyModel[321] = new ModelRendererTurbo(this, 166, 4, textureX, textureY); // Box 360 cs haysi ab shit
		bodyModel[322] = new ModelRendererTurbo(this, 99, 98, textureX, textureY); // Box 190 front mu plug

		bodyModel[0].addBox(0F, 0F, 0F, 59, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-29F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(-34F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[2].setRotationPoint(30F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 32, 17, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-13F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 32, 17, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-13F, -15F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 1 cull rear draft gear
		bodyModel[5].setRotationPoint(30F, 2F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[6].setRotationPoint(30F, 2F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[7].setRotationPoint(30F, 2F, 4F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 0
		bodyModel[8].setRotationPoint(30F, -16F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-21F, -19F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 52, 1, 6, 0F); // Box 0
		bodyModel[10].setRotationPoint(-21F, -19F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-21F, -19F, 3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-21F, -18.5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-21F, -18.5F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-21F, -16F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-21F, -16F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[16].setRotationPoint(30F, -18F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(30F, -18F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-13F, -18F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0 dynamic fan large
		bodyModel[19].setRotationPoint(-11F, -20F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[20].setRotationPoint(-6.5F, 3.5F, -10.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[21].setRotationPoint(-6.5F, 3.5F, 9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[22].setRotationPoint(-6F, 2F, -8.5F);
		bodyModel[22].rotateAngleY = 1.57079633F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140 fuel tank filler panel
		bodyModel[23].setRotationPoint(2.5F, 1.5F, -10.45F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141 fuel tank filler panel
		bodyModel[24].setRotationPoint(2.5F, 1.5F, 9.45F);

		bodyModel[25].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 153 cull handrails
		bodyModel[25].setRotationPoint(-23.5F, -9.5F, -11.75F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 154 cull handrails
		bodyModel[26].setRotationPoint(-23.5F, -9.5F, 10.75F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 178 cull handrails
		bodyModel[27].setRotationPoint(18.5F, -9.5F, -11.75F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 180 cull handrails
		bodyModel[28].setRotationPoint(18.5F, -9.5F, 10.75F);

		bodyModel[29].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186 winterization hatch cull
		bodyModel[29].setRotationPoint(17.4F, -21F, -3F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 187 Steam/HEP gen exhaust
		bodyModel[30].setRotationPoint(26F, -20F, -3F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 188 Steam/HEP gen exhaust
		bodyModel[31].setRotationPoint(27.5F, -20F, 1F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 199 cull handrails
		bodyModel[32].setRotationPoint(27.5F, -4.5F, -11.75F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 201 cull handrails
		bodyModel[33].setRotationPoint(27.5F, -4.5F, 10.75F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 202
		bodyModel[34].setRotationPoint(31F, -19F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[35].setRotationPoint(31F, -19F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 131 cs hostler ab shit
		bodyModel[36].setRotationPoint(-10.5F, -7F, 9F);
		bodyModel[36].rotateAngleY = 0.50614548F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 131 cs hostler ab shit
		bodyModel[37].setRotationPoint(-11F, -6F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
		bodyModel[38].setRotationPoint(31F, -19F, 3F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 222 mu hoses
		bodyModel[39].setRotationPoint(31.01F, 2F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[40].setRotationPoint(16.5F, 2.5F, -2F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[41].setRotationPoint(-20.5F, 2.5F, -2F);

		bodyModel[42].addBox(0F, 0F, 0F, 60, 2, 12, 0F); // Box 441
		bodyModel[42].setRotationPoint(-30F, 0.75F, -6F);

		bodyModel[43].addShapeBox(-3.5F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[43].setRotationPoint(22.5F, -10F, -10.5F);

		bodyModel[44].addShapeBox(-3.5F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[44].setRotationPoint(22.5F, -10F, 10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 333
		bodyModel[45].setRotationPoint(23F, -15F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 334
		bodyModel[46].setRotationPoint(23F, -15F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[47].setRotationPoint(19F, -15F, 10F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[48].setRotationPoint(19F, -15F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 337
		bodyModel[49].setRotationPoint(19F, 0F, 10F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 338
		bodyModel[50].setRotationPoint(19F, 0F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 13, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[51].setRotationPoint(31F, -13F, -2F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 464 gn fuckshit cube
		bodyModel[52].setRotationPoint(-4.5F, -20F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[53].setRotationPoint(0F, -14F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[54].setRotationPoint(0F, -14F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 10
		bodyModel[55].setRotationPoint(-1F, -16F, -2F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 13
		bodyModel[56].setRotationPoint(-1F, -10F, -3F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[57].setRotationPoint(19F, -5F, -6F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[58].setRotationPoint(19F, -12F, -4F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[59].setRotationPoint(19F, -8F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 18, 12, 0F); // Box 13
		bodyModel[60].setRotationPoint(-14F, -18F, -6F);

		bodyModel[61].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 10
		bodyModel[61].setRotationPoint(-6F, -13F, 2F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 10
		bodyModel[62].setRotationPoint(-6F, -13F, -6F);

		bodyModel[63].addBox(0F, 0F, 0F, 19, 2, 4, 0F); // Box 7
		bodyModel[63].setRotationPoint(0F, -14F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[64].setRotationPoint(-13F, -18F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[65].setRotationPoint(-10F, -6F, -1.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 523
		bodyModel[66].setRotationPoint(-5F, -12F, -1.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404 she wheel on my antenna till i wagon
		bodyModel[67].setRotationPoint(-25.5F, -23F, 0F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405 she wheel on my antenna till i wagon
		bodyModel[68].setRotationPoint(-27F, -21F, -2F);

		bodyModel[69].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186 winterization hatch cull tall
		bodyModel[69].setRotationPoint(17.4F, -23F, -3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 atsf tall arrestor cull
		bodyModel[70].setRotationPoint(3F, -23F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523 atsf tall arrestor tip
		bodyModel[71].setRotationPoint(3F, -24F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 atsf tall arrestor cull
		bodyModel[72].setRotationPoint(15.5F, -23F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523 atsf tall arrestor tip
		bodyModel[73].setRotationPoint(15.5F, -24F, -2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 15, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[74].setRotationPoint(-7F, 2F, -10.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[75].setRotationPoint(-10F, 2F, -10.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[76].setRotationPoint(8F, 2F, -10.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 456
		bodyModel[77].setRotationPoint(-6F, 4F, -10.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[78].setRotationPoint(-7F, 2F, 10.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[79].setRotationPoint(8F, 2F, 10.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 461
		bodyModel[80].setRotationPoint(-10F, 2F, 10.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Box 462
		bodyModel[81].setRotationPoint(-7.5F, 4F, -10.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F); // Box 463
		bodyModel[82].setRotationPoint(7.5F, 4F, -10.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 464
		bodyModel[83].setRotationPoint(-6F, 4F, 10.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 465
		bodyModel[84].setRotationPoint(-7.5F, 4F, 10.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F); // Box 466
		bodyModel[85].setRotationPoint(7.5F, 4F, 10.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[86].setRotationPoint(-6.5F, 3.5F, -9.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[87].setRotationPoint(-6.5F, 6.5F, -8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 99
		bodyModel[88].setRotationPoint(-6.5F, 6.5F, 2.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[89].setRotationPoint(-6.5F, 3.5F, 2.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 96 air tank pipe
		bodyModel[90].setRotationPoint(-7.5F, 2F, -0.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 130 FUCK FUCK FUCK FUCK AAAUGGGHHHH IM PRESSURIZED STEEWWWIE IM SO FULL OF COMPRESSED AIR AND CONDENSATIONS STEWWIEEE YOU NEED TO OPEN THE SPITTER VALE AND DRAIN MEEEE AUUGHHH STEWWIEEEE
		bodyModel[91].setRotationPoint(-6.5F, 4F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[92].setRotationPoint(-6.5F, 5F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[93].setRotationPoint(-6.5F, 5F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 485
		bodyModel[94].setRotationPoint(27F, 2.5F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 60, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 719
		bodyModel[95].setRotationPoint(-30F, 2.75F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[96].setRotationPoint(-20F, 1.75F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[97].setRotationPoint(-20F, 1.75F, 6.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 133
		bodyModel[98].setRotationPoint(-19F, 2F, -10.95F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 134
		bodyModel[99].setRotationPoint(-19F, 2F, 8.95F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[100].setRotationPoint(17F, 1.75F, -10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 727
		bodyModel[101].setRotationPoint(18F, 2F, -10.95F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 728
		bodyModel[102].setRotationPoint(18F, 2F, 8.95F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 729
		bodyModel[103].setRotationPoint(17F, 1.75F, 6.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[104].setRotationPoint(-20F, 0.75F, -10.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[105].setRotationPoint(17F, 0.75F, -10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[106].setRotationPoint(31F, -18.5F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F); // Box 735
		bodyModel[107].setRotationPoint(31F, -18.5F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,-0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F); // Box 184 stack
		bodyModel[108].setRotationPoint(3F, -20.75F, -1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,-0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F); // Box 185 stack
		bodyModel[109].setRotationPoint(15.5F, -20.75F, -1.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -5F, 0F, -0.5F, -5F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0.5F, 0F, -5F); // Box 501 cull pipe cooler gn thing
		bodyModel[110].setRotationPoint(-9.5F, -20.75F, -3F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 502 fuel filler no pannel
		bodyModel[111].setRotationPoint(3.5F, 3F, 7.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 503 fuel filler no pannel
		bodyModel[112].setRotationPoint(3.5F, 3F, -10.5F);

		bodyModel[113].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, -2F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 rear diaphram
		bodyModel[113].setRotationPoint(32.5F, -17F, -4F);
		bodyModel[113].rotateAngleY = 1.57079633F;

		bodyModel[114].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, -0.75F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153 rear diaphram
		bodyModel[114].setRotationPoint(32.5F, -17F, 0F);
		bodyModel[114].rotateAngleY = 1.57079633F;

		bodyModel[115].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 128 rear diaphram
		bodyModel[115].setRotationPoint(32.5F, -15F, -4.5F);
		bodyModel[115].rotateAngleY = 1.57079633F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 rear mu plug
		bodyModel[116].setRotationPoint(31F, -15F, -2F);
		bodyModel[116].rotateAngleZ = -0.27925268F;

		bodyModel[117].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 631 cull
		bodyModel[117].setRotationPoint(19F, 2F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 636 cull
		bodyModel[118].setRotationPoint(27F, 2F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 637 cull
		bodyModel[119].setRotationPoint(-23F, 2F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 638 cull
		bodyModel[120].setRotationPoint(27F, 2F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 639 cull
		bodyModel[121].setRotationPoint(19F, 2F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 640 cull
		bodyModel[122].setRotationPoint(-23F, 2F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		bodyModel[123].setRotationPoint(30F, -19F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		bodyModel[124].setRotationPoint(30F, -19F, 3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		bodyModel[125].setRotationPoint(30F, -18F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, 0F, -42F, -5F, 0F, -42F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 444 CULL f3a mesh grill
		bodyModel[126].setRotationPoint(-12F, -15F, -11.01F);

		bodyModel[127].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 683 fan
		bodyModel[127].setRotationPoint(17.5F, -20F, -2.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 450 fan
		bodyModel[128].setRotationPoint(-2F, -20F, -2.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 451 fan
		bodyModel[129].setRotationPoint(5F, -20F, -2.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 452 fan
		bodyModel[130].setRotationPoint(10.5F, -20F, -2.5F);

		bodyModel[131].addShapeBox(0F, 0F, -1F, 84, 10, 1, 0F,0F, 0F, -0.5F, -42F, 0F, -0.5F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, -42F, -5F, -0.5F, -42F, -5F, 0F, 0F, -5F, 0F); // Box 455 CULL f3a mesh grill
		bodyModel[131].setRotationPoint(-12F, -15F, 11.01F);

		bodyModel[132].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 457 dynamic fan small
		bodyModel[132].setRotationPoint(-10F, -20F, -2.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458 f3a tall fan
		bodyModel[133].setRotationPoint(5F, -21F, -2.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459 f3a tall fan
		bodyModel[134].setRotationPoint(10.5F, -21F, -2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460 f3a tall fan
		bodyModel[135].setRotationPoint(17.5F, -21F, -2.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461 f3a tall fan
		bodyModel[136].setRotationPoint(-2F, -21F, -2.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 298
		bodyModel[137].setRotationPoint(-7F, -9F, -2F);

		bodyModel[138].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 299
		bodyModel[138].setRotationPoint(-7F, -6F, -5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[139].setRotationPoint(-7F, -2F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 19, 4, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 465
		bodyModel[140].setRotationPoint(0F, -4F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 466
		bodyModel[141].setRotationPoint(0F, -9F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 19, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[142].setRotationPoint(0F, -12F, -6F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 468
		bodyModel[143].setRotationPoint(-1F, -13F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 469
		bodyModel[144].setRotationPoint(-5F, -10F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 470
		bodyModel[145].setRotationPoint(-5F, -10F, -5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 19, 2, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 471
		bodyModel[146].setRotationPoint(0F, -6F, -5F);

		bodyModel[147].addShapeBox(0F, -1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[147].setRotationPoint(1F, -15F, 0F);
		bodyModel[147].rotateAngleX = 0.78539816F;

		bodyModel[148].addShapeBox(0F, -1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[148].setRotationPoint(10.5F, -15F, 0F);
		bodyModel[148].rotateAngleX = 0.78539816F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[149].setRotationPoint(-10F, -8.5F, -2.5F);

		bodyModel[150].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[150].setRotationPoint(-8F, -4.3F, 1F);
		bodyModel[150].rotateAngleX = -1.10828408F;

		bodyModel[151].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[151].setRotationPoint(-8F, -4.3F, -1F);
		bodyModel[151].rotateAngleX = 1.10828408F;

		bodyModel[152].addBox(0F, 0F, 0F, 4, 11, 6, 0F); // Box 477 cull equipment rack
		bodyModel[152].setRotationPoint(20.5F, -11F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 478
		bodyModel[153].setRotationPoint(22.5F, -3F, -4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 479
		bodyModel[154].setRotationPoint(19.5F, -3F, 1F);

		bodyModel[155].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 480 lube filter
		bodyModel[155].setRotationPoint(22.5F, -8F, -3F);
		bodyModel[155].rotateAngleZ = 0.78539816F;

		bodyModel[156].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // Box 481 engine water tank
		bodyModel[156].setRotationPoint(21.5F, -16.01F, -3F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 482
		bodyModel[157].setRotationPoint(20.5F, -18.01F, -1F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 10, 5, 0F); // Box 0 Steam/HEP gen
		bodyModel[158].setRotationPoint(25.5F, -10F, -6F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 10, 5, 0F); // Box 485 Steam/HEP gen
		bodyModel[159].setRotationPoint(26F, -10F, 0F);

		bodyModel[160].addBox(0F, 0F, 0F, 9, 3, 8, 0F); // Box 429 dynamics internal
		bodyModel[160].setRotationPoint(-10.5F, -18F, -4F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[161].setRotationPoint(7.5F, 2F, -8.5F);
		bodyModel[161].rotateAngleY = 1.57079633F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[162].setRotationPoint(-0.5F, 2F, -8.5F);
		bodyModel[162].rotateAngleY = 1.57079633F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -5F, 0F, -42F, -5F, 0F, -42F, -5F, -0.35F, 0F, -5F, -0.35F); // Box 416 late grills CULL
		bodyModel[163].setRotationPoint(-12F, -15F, -11.15F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, -0.35F, -42F, 0F, -0.35F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.35F, -42F, -5F, -0.35F, -42F, -5F, 0F, 0F, -5F, 0F); // Box 417 late grills CULL
		bodyModel[164].setRotationPoint(-12F, -15F, 10.15F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[165].setRotationPoint(7F, -13F, 11F);
		bodyModel[165].rotateAngleY = -1.57079633F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[166].setRotationPoint(11F, -13F, 11F);
		bodyModel[166].rotateAngleY = -1.57079633F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 412
		bodyModel[167].setRotationPoint(-10F, -14F, 11F);
		bodyModel[167].rotateAngleY = -1.57079633F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 414
		bodyModel[168].setRotationPoint(-4F, -14F, 11F);
		bodyModel[168].rotateAngleY = -1.57079633F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 415
		bodyModel[169].setRotationPoint(22F, -13F, 11F);
		bodyModel[169].rotateAngleY = -1.57079633F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 19, 3, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416 interior engine bit
		bodyModel[170].setRotationPoint(-1F, -16F, 5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 19, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 417 interior engine bit
		bodyModel[171].setRotationPoint(-1F, -16F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.01F, 0F, 0F, 19.01F, 0F, 0F, 19.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 19.01F, 0F, 0F, 19.01F, 0F, 0F, 0.01F, 0F, 0F); // Box 418 sandcap fill
		bodyModel[172].setRotationPoint(-27.5F, -7.5F, 11F);
		bodyModel[172].rotateAngleY = -1.57079633F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.02F, 0F, 0F, 19.02F, 0F, 0F, 19.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 19.02F, 0F, 0F, 19.02F, 0F, 0F, 0.02F, 0F, 0F); // Box 419 sandcap fill
		bodyModel[173].setRotationPoint(12.5F, -7.5F, 11F);
		bodyModel[173].rotateAngleY = -1.57079633F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 420 headlight rear very high
		bodyModel[174].setRotationPoint(30.5F, -18F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 fuel filler with skirting OR extra thicc tank fuel filler
		bodyModel[175].setRotationPoint(3.5F, 2.5F, 7.85F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 421 fuel filler with skirting OR extra thicc tank fuel filler
		bodyModel[176].setRotationPoint(3.5F, 2.5F, -10.85F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 450 fuel tank embiggened
		bodyModel[177].setRotationPoint(7F, 4F, -10F);
		bodyModel[177].rotateAngleY = 1.57079633F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 451 fuel tank embiggened
		bodyModel[178].setRotationPoint(7F, 7F, -8F);
		bodyModel[178].rotateAngleY = 1.57079633F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F); // Box 452 fuel tank embiggened
		bodyModel[179].setRotationPoint(7F, 3.25F, -9F);
		bodyModel[179].rotateAngleY = 1.57079633F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 453 fuel tank standard
		bodyModel[180].setRotationPoint(7F, 3.25F, -9F);
		bodyModel[180].rotateAngleY = 1.57079633F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454 fuel tank standard
		bodyModel[181].setRotationPoint(7F, 4F, -10F);
		bodyModel[181].rotateAngleY = 1.57079633F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 455 fuel tank standard
		bodyModel[182].setRotationPoint(7F, 7F, -8F);
		bodyModel[182].rotateAngleY = 1.57079633F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0.75F, 0F, -0.05F, 4.75F, 0F, -0.05F, 4.75F, 0F, 0.125F, 0.75F, 0F, 0.125F, 0.75F, 0F, -0.05F, 4.75F, 0F, -0.05F, 4.75F, 0F, 0.125F, 0.75F, 0F, 0.125F); // Box 456 fuel tank wp extensions
		bodyModel[183].setRotationPoint(7F, 2.75F, -10F);
		bodyModel[183].rotateAngleY = 1.57079633F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0.75F, 0F, 0.125F, 4.75F, 0F, 0.125F, 4.75F, 0F, -0.05F, 0.75F, 0F, -0.05F, 0.75F, 0F, 0.125F, 4.75F, 0F, 0.125F, 4.75F, 0F, -0.05F, 0.75F, 0F, -0.05F); // Box 457 fuel tank wp extensions
		bodyModel[184].setRotationPoint(3F, 2.75F, -10F);
		bodyModel[184].rotateAngleY = 1.57079633F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F); // Box 440 spark arrestor cap
		bodyModel[185].setRotationPoint(3.5F, -21.5F, -2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F); // Box 441 spark arrestor cap
		bodyModel[186].setRotationPoint(16F, -21.5F, -2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[187].setRotationPoint(-26.75F, -20F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[188].setRotationPoint(-26.75F, -20.5F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[189].setRotationPoint(-26.75F, -20.5F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[190].setRotationPoint(-26.75F, -20.5F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[191].setRotationPoint(-26.75F, -20.5F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 409 commander base
		bodyModel[192].setRotationPoint(-30F, -20.5F, -0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[193].setRotationPoint(-30F, -21.5F, -0.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 449 firecracker antenna
		bodyModel[194].setRotationPoint(-23.5F, -21F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, -2F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 454 rear end no diagphram
		bodyModel[195].setRotationPoint(31F, 1F, -3.5F);
		bodyModel[195].rotateAngleY = 1.57079633F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 455 headlight rear erected outwards
		bodyModel[196].setRotationPoint(31F, -12F, -9F);

		bodyModel[197].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 460 rear door step
		bodyModel[197].setRotationPoint(31F, 0F, -2F);
		bodyModel[197].rotateAngleY = 1.57079633F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 462 headlight rear boner lower
		bodyModel[198].setRotationPoint(31F, -4F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 465 headlight rear boner right
		bodyModel[199].setRotationPoint(31F, -12F, 7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 466 rear diaphram
		bodyModel[200].setRotationPoint(32.5F, -14F, -5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 467 rear diaphram
		bodyModel[201].setRotationPoint(32.5F, -14F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, -1F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 468 rear diaphram
		bodyModel[202].setRotationPoint(32F, 1F, -5F);
		bodyModel[202].rotateAngleY = 1.57079633F;

		bodyModel[203].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469 rear diaphram
		bodyModel[203].setRotationPoint(32.5F, -14F, -3F);
		bodyModel[203].rotateAngleY = 1.57079633F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F); // Box 478 cull trapezoid spark arrestor
		bodyModel[204].setRotationPoint(3F, -22.75F, -1.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F); // Box 479 cull trapezoid spark arrestor
		bodyModel[205].setRotationPoint(15.5F, -22.75F, -1.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[206].setRotationPoint(-16.25F, -20.5F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[207].setRotationPoint(-16.25F, -21.5F, -0.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 88 cull mkt beacon platform
		bodyModel[208].setRotationPoint(-16.75F, -19.5F, -1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287 sinclair antenna
		bodyModel[209].setRotationPoint(-20.5F, -20F, 0F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 492 "round" spark arrestor
		bodyModel[210].setRotationPoint(2.5F, -22.75F, -1.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 493 "round" spark arrestor
		bodyModel[211].setRotationPoint(15F, -22.75F, -1.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506 tube exhaust
		bodyModel[212].setRotationPoint(3F, -23.75F, -1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507 tube exhaust
		bodyModel[213].setRotationPoint(15.5F, -23.75F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 14, 0, 10, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, -5F); // Box 504 F3 DYNAMICS
		bodyModel[214].setRotationPoint(-11F, -19.01F, -2.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 505 cull mysterious F9 roof radiator pipes
		bodyModel[215].setRotationPoint(-3F, -19F, -5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 409 commander base
		bodyModel[216].setRotationPoint(29F, -20.5F, -0.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[217].setRotationPoint(29F, -21.5F, -0.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 512 cull fmsr number mount
		bodyModel[218].setRotationPoint(-2.5F, -17F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513 cull fmsr number mount
		bodyModel[219].setRotationPoint(-2.5F, -17F, 10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 21.02F, 0F, -0.125F, 21.02F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 21.02F, 0F, -3.125F, 21.02F); // Box 635 locomotive plate
		bodyModel[220].setRotationPoint(-27F, -2.5F, -11.01F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[221].setRotationPoint(-30F, 2.5F, -2F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 1 cull rear draft gear
		bodyModel[222].setRotationPoint(-30F, 2F, 4F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[223].setRotationPoint(-30F, 2F, 10F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[224].setRotationPoint(-30F, 2F, -4F);
		bodyModel[224].rotateAngleY = -3.14159265F;

		bodyModel[225].addBox(-1F, 0F, -20F, 1, 18, 20, 0F); // Box 0
		bodyModel[225].setRotationPoint(-31F, -16F, -10F);
		bodyModel[225].rotateAngleY = -3.14159265F;

		bodyModel[226].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 532 mu hosers
		bodyModel[226].setRotationPoint(-31.01F, 2F, -10F);

		bodyModel[227].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 533
		bodyModel[227].setRotationPoint(-31F, -19F, -3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 534
		bodyModel[228].setRotationPoint(-30F, -19F, 3F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 535
		bodyModel[229].setRotationPoint(-30F, -18.5F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[230].setRotationPoint(-31F, -16F, 10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[231].setRotationPoint(-30F, -19F, -7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[232].setRotationPoint(-30F, -18.5F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[233].setRotationPoint(-31F, -16F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[234].setRotationPoint(-30F, -18F, -7F);
		bodyModel[234].rotateAngleY = 3.14159265F;

		bodyModel[235].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 541
		bodyModel[235].setRotationPoint(-30F, -18F, 7F);
		bodyModel[235].rotateAngleY = 3.14159265F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[236].setRotationPoint(-30F, -19F, -3F);
		bodyModel[236].rotateAngleY = 3.14159265F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[237].setRotationPoint(-30F, -19F, 7F);
		bodyModel[237].rotateAngleY = 3.14159265F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[238].setRotationPoint(-30F, -18F, 10F);
		bodyModel[238].rotateAngleY = 3.14159265F;

		bodyModel[239].addShapeBox(-3.5F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[239].setRotationPoint(-19.5F, -10F, -10.5F);

		bodyModel[240].addShapeBox(-3.5F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[240].setRotationPoint(-19.5F, -10F, 10.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 337
		bodyModel[241].setRotationPoint(-23F, 0F, 10F);

		bodyModel[242].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 338
		bodyModel[242].setRotationPoint(-23F, 0F, -11F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 549
		bodyModel[243].setRotationPoint(-23F, -15F, 10F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 550
		bodyModel[244].setRotationPoint(-23F, -15F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 6, 17, 1, 0F); // Box 551
		bodyModel[245].setRotationPoint(-19F, -15F, -11F);

		bodyModel[246].addBox(0F, 0F, 0F, 6, 17, 1, 0F); // Box 552
		bodyModel[246].setRotationPoint(-19F, -15F, 10F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 553
		bodyModel[247].setRotationPoint(-30F, 0F, -10F);

		bodyModel[248].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 554
		bodyModel[248].setRotationPoint(-31F, -15F, -11F);

		bodyModel[249].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 555
		bodyModel[249].setRotationPoint(-31F, -15F, 10F);

		bodyModel[250].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 556
		bodyModel[250].setRotationPoint(-33F, -19F, -3F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[251].setRotationPoint(-33F, -19F, -7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[252].setRotationPoint(-32F, -18.5F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 559
		bodyModel[253].setRotationPoint(-33F, -19F, 3F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F); // Box 560
		bodyModel[254].setRotationPoint(-32F, -18.5F, 7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453 rear end bit
		bodyModel[255].setRotationPoint(31F, -15F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Box 454 rear end bit
		bodyModel[256].setRotationPoint(31F, -15F, -3F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 456 rear end no diagphram
		bodyModel[257].setRotationPoint(31F, -15F, -4F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457 rear end no diagphram
		bodyModel[258].setRotationPoint(31F, -15F, 3F);

		bodyModel[259].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,-0.5F, -1F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458 rear end no diagphram
		bodyModel[259].setRotationPoint(31F, -16F, -4F);
		bodyModel[259].rotateAngleY = 1.57079633F;

		bodyModel[260].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0F, -0.625F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.625F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 459 rear end no diagphram
		bodyModel[260].setRotationPoint(31F, -16F, 0F);
		bodyModel[260].rotateAngleY = 1.57079633F;

		bodyModel[261].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 461 rear door top lip thing
		bodyModel[261].setRotationPoint(31.25F, -13.01F, -3F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, -1.75F); // Box 463 lifting nuts
		bodyModel[262].setRotationPoint(31.25F, -16F, -3.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F); // Box 464 lifting nuts
		bodyModel[263].setRotationPoint(31.25F, -16F, 0.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453 front end bit
		bodyModel[264].setRotationPoint(-31F, -15F, 0F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Box 454 front end bit
		bodyModel[265].setRotationPoint(-31F, -15F, 3F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456 front end no diagphram
		bodyModel[266].setRotationPoint(-31F, -15F, -3F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 457 front end no diagphram
		bodyModel[267].setRotationPoint(-31F, -15F, 4F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,-0.5F, -1F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458 front end no diagphram
		bodyModel[268].setRotationPoint(-31F, -16F, 4F);
		bodyModel[268].rotateAngleY = -1.57079633F;

		bodyModel[269].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0F, -0.625F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.625F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 459 front end no diagphram
		bodyModel[269].setRotationPoint(-31F, -16F, 0F);
		bodyModel[269].rotateAngleY = -1.57079633F;

		bodyModel[270].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 461 front door top lip thing
		bodyModel[270].setRotationPoint(-31.25F, -13.01F, 3F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F); // Box 463 lifting nuts
		bodyModel[271].setRotationPoint(-31.25F, -16F, -0.75F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, -1.75F); // Box 464 lifting nuts
		bodyModel[272].setRotationPoint(-31.25F, -16F, 3.75F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 454 front end no diagphram
		bodyModel[273].setRotationPoint(-33F, 1F, 3.5F);
		bodyModel[273].rotateAngleY = -1.57079633F;

		bodyModel[274].addBox(0F, 0F, -4F, 1, 13, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[274].setRotationPoint(-31F, -13F, -2F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 460 front door step
		bodyModel[275].setRotationPoint(-33F, 0F, 2F);
		bodyModel[275].rotateAngleY = -1.57079633F;

		bodyModel[276].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 199 cull handrails
		bodyModel[276].setRotationPoint(-30.5F, -4.5F, -11.75F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 201 cull handrails
		bodyModel[277].setRotationPoint(-30.5F, -4.5F, 10.75F);

		bodyModel[278].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 636 cull
		bodyModel[278].setRotationPoint(-31F, 2F, 11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 638 cull
		bodyModel[279].setRotationPoint(-31F, 2F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 455 headlight front erected outwards
		bodyModel[280].setRotationPoint(-31F, -12F, 9F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 462 headlight front boner lower
		bodyModel[281].setRotationPoint(-31F, -4F, 9F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 465 headlight front boner right
		bodyModel[282].setRotationPoint(-31F, -12F, -7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, -2F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 front diaphram
		bodyModel[283].setRotationPoint(-32.5F, -17F, 4F);
		bodyModel[283].rotateAngleY = -1.57079633F;

		bodyModel[284].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, -0.75F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153 front diaphram
		bodyModel[284].setRotationPoint(-32.5F, -17F, 0F);
		bodyModel[284].rotateAngleY = -1.57079633F;

		bodyModel[285].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 128 front diaphram
		bodyModel[285].setRotationPoint(-32.5F, -15F, 4.5F);
		bodyModel[285].rotateAngleY = -1.57079633F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 466 front diaphram
		bodyModel[286].setRotationPoint(-32.5F, -14F, -3F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 467 front diaphram
		bodyModel[287].setRotationPoint(-32.5F, -14F, 5F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addShapeBox(0F, 0F, -1F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 468 front diaphram
		bodyModel[288].setRotationPoint(-32F, 1F, 5F);
		bodyModel[288].rotateAngleY = -1.57079633F;

		bodyModel[289].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469 front diaphram
		bodyModel[289].setRotationPoint(-32.5F, -14F, 3F);
		bodyModel[289].rotateAngleY = -1.57079633F;

		bodyModel[290].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 596 cs hostler shitfuark
		bodyModel[290].setRotationPoint(-8.5F, -5F, 9F);

		bodyModel[291].addBox(0F, 0F, -3F, 12, 4, 3, 0F); // Box 597 cull electrical shelf
		bodyModel[291].setRotationPoint(-17F, -5F, -6F);
		bodyModel[291].rotateAngleY = 1.57079633F;

		bodyModel[292].addBox(0F, 0F, 0F, 0, 6, 12, 0F); // Box 598 electrical shelf
		bodyModel[292].setRotationPoint(-17F, -11F, -6F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, 0F, -18F, -5F, 0F, -18F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 444 CULL f3a mesh grill
		bodyModel[293].setRotationPoint(-30F, -15F, -11.01F);

		bodyModel[294].addShapeBox(0F, 0F, -1F, 36, 10, 1, 0F,0F, 0F, -0.5F, -18F, 0F, -0.5F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, -18F, -5F, -0.5F, -18F, -5F, 0F, 0F, -5F, 0F); // Box 455 CULL f3a mesh grill
		bodyModel[294].setRotationPoint(-30F, -15F, 11.01F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378 bell HAYSI
		bodyModel[295].setRotationPoint(-32.5F, -15.8F, -7.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380 bell HAYSI
		bodyModel[296].setRotationPoint(-32.5F, -14.8F, -7.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314 haysi bell holder
		bodyModel[297].setRotationPoint(-32.5F, -16.8F, -7.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 315 haysi stepp
		bodyModel[298].setRotationPoint(-34F, 8F, 5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316 haysi step bit
		bodyModel[299].setRotationPoint(-31.02F, 6F, 5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317 haysi stepp bit
		bodyModel[300].setRotationPoint(31.02F, 6F, -10F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 318 haysi stepp
		bodyModel[301].setRotationPoint(31F, 8F, -10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -5F, 0F, -0.5F, -5F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0.5F, 0F, -5F); // Box 501 cull pipe cooler AMTK thing WHY DID THE MOVE THIS HERE
		bodyModel[302].setRotationPoint(-16.5F, -20.75F, -3F);

		bodyModel[303].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 320 bunit ab equipment
		bodyModel[303].setRotationPoint(-29.5F, -12F, 5F);

		bodyModel[304].addBox(0F, 0F, 0F, 4, 9, 4, 0F); // Box 321 CULL bunit ab shit
		bodyModel[304].setRotationPoint(-30F, -8.5F, 5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 322 bunit ab shit
		bodyModel[305].setRotationPoint(-30F, -10F, 5.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 7, 9, 10, 0F); // Box 323 bunit water tank
		bodyModel[306].setRotationPoint(-24.75F, -9F, -6F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0.05F); // Box 585 numberboard glow wp steam light
		bodyModel[307].setRotationPoint(29F, -21.5F, 1.51F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.1F, -0.25F, 0.05F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 584 numberboard glow wp steam headilght
		bodyModel[308].setRotationPoint(29F, -21.5F, -2.51F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256 wp steam headlight bit
		bodyModel[309].setRotationPoint(30F, -21F, -1.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 254 wp steam headlight bit
		bodyModel[310].setRotationPoint(29F, -21.5F, 1.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253 wp steam headlight bit
		bodyModel[311].setRotationPoint(29F, -21.5F, -2.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146  HEADLIHGHT REAR wp steam headlight bit
		bodyModel[312].setRotationPoint(31.5F, -22F, -1.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 56 wp steam headlight bit
		bodyModel[313].setRotationPoint(31F, -22F, -1.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 318 horn blatt (that one ex canada wp f9 the museum has)
		bodyModel[314].setRotationPoint(-32F, -16F, 8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -5F, 0F, -18F, -5F, 0F, -18F, -5F, -0.35F, 0F, -5F, -0.35F); // Box 416 late grills CULL
		bodyModel[315].setRotationPoint(-30F, -15F, -11.15F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F,0F, 0F, -0.35F, -18F, 0F, -0.35F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.35F, -18F, -5F, -0.35F, -18F, -5F, 0F, 0F, -5F, 0F); // Box 417 late grills CULL
		bodyModel[316].setRotationPoint(-30F, -15F, 10.15F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131 cs1 haysi
		bodyModel[317].setRotationPoint(-28F, -6.5F, -5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 cs1 haysi
		bodyModel[318].setRotationPoint(-29F, -6.5F, -6F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131 cs1 haysi
		bodyModel[319].setRotationPoint(-30F, -6.5F, -5F);

		bodyModel[320].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,-0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 131 cs1 haysi
		bodyModel[320].setRotationPoint(-28.5F, -8.5F, -4.5F);
		bodyModel[320].rotateAngleY = -0.78539816F;

		bodyModel[321].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360 cs haysi ab shit
		bodyModel[321].setRotationPoint(-30F, -10.5F, -4F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 front mu plug
		bodyModel[322].setRotationPoint(-31F, -15F, 2F);
		bodyModel[322].rotateAngleY = -3.14159265F;
		bodyModel[322].rotateAngleZ = -0.27925268F;
	}

	ModelBlombergBnew theTrucc = new ModelBlombergBnew();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 356
				|| GetColor(entity) == 20
				|| GetColor(entity) == 11
				|| GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.16, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//front
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.16, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//rear
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 16) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Espee.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.16, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//front
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.16, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//rear
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.16, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//front
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.16, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//rear
			GL11.glPopMatrix();
		}
	}
}