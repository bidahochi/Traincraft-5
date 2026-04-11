//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: rotary
// Model Creator: bidahochi
// Created on: 05.11.2023 - 19:41:44
// Last changed on: 05.11.2023 - 19:41:44

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Modelrotary_foxtruck;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.RotaryPlow1;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelRotaryPlow extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelRotaryPlow() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[306];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 198, 62, textureX, textureY); // Box 421
		bodyModel[1] = new ModelRendererTurbo(this, 198, 39, textureX, textureY); // Box 422
		bodyModel[2] = new ModelRendererTurbo(this, 178, 88, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 218, 5, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 218, 34, textureX, textureY); // Box 16
		bodyModel[5] = new ModelRendererTurbo(this, 213, 26, textureX, textureY); // Box 17
		bodyModel[6] = new ModelRendererTurbo(this, 213, 8, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 211, 16, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 132, 137, textureX, textureY, "cull"); // Box 178 cull ladder grabs
		bodyModel[9] = new ModelRendererTurbo(this, 132, 137, textureX, textureY, "cull"); // Box 180 cull ladder grabs
		bodyModel[10] = new ModelRendererTurbo(this, 148, 122, textureX, textureY); // Box 189
		bodyModel[11] = new ModelRendererTurbo(this, 139, 122, textureX, textureY); // Box 190
		bodyModel[12] = new ModelRendererTurbo(this, 310, 61, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 191, 5, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 204, 10, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 182, 10, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 22, 161, textureX, textureY); // Box 73
		bodyModel[17] = new ModelRendererTurbo(this, 54, 173, textureX, textureY); // Box 76
		bodyModel[18] = new ModelRendererTurbo(this, 22, 185, textureX, textureY); // Box 79
		bodyModel[19] = new ModelRendererTurbo(this, 8, 173, textureX, textureY); // Box 82
		bodyModel[20] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 83
		bodyModel[21] = new ModelRendererTurbo(this, 47, 185, textureX, textureY); // Box 84
		bodyModel[22] = new ModelRendererTurbo(this, 47, 161, textureX, textureY); // Box 85
		bodyModel[23] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 86
		bodyModel[24] = new ModelRendererTurbo(this, 34, 137, textureX, textureY); // Box 140
		bodyModel[25] = new ModelRendererTurbo(this, 14, 121, textureX, textureY); // Box 143
		bodyModel[26] = new ModelRendererTurbo(this, 27, 123, textureX, textureY); // Box 144
		bodyModel[27] = new ModelRendererTurbo(this, 19, 138, textureX, textureY); // Box 145
		bodyModel[28] = new ModelRendererTurbo(this, 58, 142, textureX, textureY); // Box 152
		bodyModel[29] = new ModelRendererTurbo(this, 66, 126, textureX, textureY); // Box 153
		bodyModel[30] = new ModelRendererTurbo(this, 53, 125, textureX, textureY); // Box 154
		bodyModel[31] = new ModelRendererTurbo(this, 19, 111, textureX, textureY); // Box 158
		bodyModel[32] = new ModelRendererTurbo(this, 34, 110, textureX, textureY); // Box 159
		bodyModel[33] = new ModelRendererTurbo(this, 58, 115, textureX, textureY); // Box 160
		bodyModel[34] = new ModelRendererTurbo(this, 40, 124, textureX, textureY); // Box 164
		bodyModel[35] = new ModelRendererTurbo(this, 1, 119, textureX, textureY); // Box 165
		bodyModel[36] = new ModelRendererTurbo(this, 9, 78, textureX, textureY, "rotary"); // Box 166 rotor shaft main
		bodyModel[37] = new ModelRendererTurbo(this, 1, 79, textureX, textureY, "rotary"); // Box 205 rotor blade
		bodyModel[38] = new ModelRendererTurbo(this, 34, 79, textureX, textureY, "rotary"); // Box 207 rotor blade
		bodyModel[39] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "rotary"); // Box 208 rotor blade
		bodyModel[40] = new ModelRendererTurbo(this, 34, 91, textureX, textureY, "rotary"); // Box 209 rotor blade
		bodyModel[41] = new ModelRendererTurbo(this, 12, 79, textureX, textureY, "rotary"); // Box 210 rotor blade
		bodyModel[42] = new ModelRendererTurbo(this, 45, 79, textureX, textureY, "rotary"); // Box 211 rotor blade
		bodyModel[43] = new ModelRendererTurbo(this, 12, 91, textureX, textureY, "rotary"); // Box 212 rotor blade
		bodyModel[44] = new ModelRendererTurbo(this, 45, 91, textureX, textureY, "rotary"); // Box 213 rotor blade
		bodyModel[45] = new ModelRendererTurbo(this, 23, 79, textureX, textureY, "rotary"); // Box 214 rotor blade
		bodyModel[46] = new ModelRendererTurbo(this, 56, 79, textureX, textureY, "rotary"); // Box 215 rotor blade
		bodyModel[47] = new ModelRendererTurbo(this, 23, 91, textureX, textureY, "rotary"); // Box 216 rotor blade
		bodyModel[48] = new ModelRendererTurbo(this, 56, 91, textureX, textureY, "rotary"); // Box 217 rotor blade
		bodyModel[49] = new ModelRendererTurbo(this, 1, 78, textureX, textureY, "rotary"); // Box 219 rotor shaft
		bodyModel[50] = new ModelRendererTurbo(this, 67, 59, textureX, textureY); // Box 221
		bodyModel[51] = new ModelRendererTurbo(this, 28, 173, textureX, textureY, "cull"); // Box 222 snow chute cull
		bodyModel[52] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 223 snow guide l
		bodyModel[53] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 224 snow guide r
		bodyModel[54] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // Box 160
		bodyModel[55] = new ModelRendererTurbo(this, 119, 12, textureX, textureY); // Box 169
		bodyModel[56] = new ModelRendererTurbo(this, 121, 20, textureX, textureY); // Box 309
		bodyModel[57] = new ModelRendererTurbo(this, 121, 32, textureX, textureY); // Box 165
		bodyModel[58] = new ModelRendererTurbo(this, 121, 6, textureX, textureY); // Box 167
		bodyModel[59] = new ModelRendererTurbo(this, 165, 62, textureX, textureY); // Box 242
		bodyModel[60] = new ModelRendererTurbo(this, 165, 39, textureX, textureY); // Box 243
		bodyModel[61] = new ModelRendererTurbo(this, 121, 39, textureX, textureY); // Box 244
		bodyModel[62] = new ModelRendererTurbo(this, 110, 6, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 108, 26, textureX, textureY); // Box 161
		bodyModel[64] = new ModelRendererTurbo(this, 108, 14, textureX, textureY); // Box 163
		bodyModel[65] = new ModelRendererTurbo(this, 110, 34, textureX, textureY); // Box 248
		bodyModel[66] = new ModelRendererTurbo(this, 312, 3, textureX, textureY); // Box 249
		bodyModel[67] = new ModelRendererTurbo(this, 312, 12, textureX, textureY); // Box 250
		bodyModel[68] = new ModelRendererTurbo(this, 313, 29, textureX, textureY); // Box 251
		bodyModel[69] = new ModelRendererTurbo(this, 313, 35, textureX, textureY); // Box 252
		bodyModel[70] = new ModelRendererTurbo(this, 311, 17, textureX, textureY); // Box 253
		bodyModel[71] = new ModelRendererTurbo(this, 173, 19, textureX, textureY); // Box 86
		bodyModel[72] = new ModelRendererTurbo(this, 156, 31, textureX, textureY); // Box 87
		bodyModel[73] = new ModelRendererTurbo(this, 156, 6, textureX, textureY); // Box 88
		bodyModel[74] = new ModelRendererTurbo(this, 154, 14, textureX, textureY); // Box 89
		bodyModel[75] = new ModelRendererTurbo(this, 152, 22, textureX, textureY); // Box 90
		bodyModel[76] = new ModelRendererTurbo(this, 184, 115, textureX, textureY); // Box 69
		bodyModel[77] = new ModelRendererTurbo(this, 184, 115, textureX, textureY); // Box 164
		bodyModel[78] = new ModelRendererTurbo(this, 194, 114, textureX, textureY); // Box 165
		bodyModel[79] = new ModelRendererTurbo(this, 135, 118, textureX, textureY); // Box 282
		bodyModel[80] = new ModelRendererTurbo(this, 112, 118, textureX, textureY); // Box 283
		bodyModel[81] = new ModelRendererTurbo(this, 137, 115, textureX, textureY); // Box 445
		bodyModel[82] = new ModelRendererTurbo(this, 114, 115, textureX, textureY); // Box 446
		bodyModel[83] = new ModelRendererTurbo(this, 118, 112, textureX, textureY); // Box 173
		bodyModel[84] = new ModelRendererTurbo(this, 118, 112, textureX, textureY); // Box 174
		bodyModel[85] = new ModelRendererTurbo(this, 139, 104, textureX, textureY); // Box 175
		bodyModel[86] = new ModelRendererTurbo(this, 101, 218, textureX, textureY); // Box 176
		bodyModel[87] = new ModelRendererTurbo(this, 378, 18, textureX, textureY); // Box 185
		bodyModel[88] = new ModelRendererTurbo(this, 385, 17, textureX, textureY, "lamp"); // Box 247 Headlight Front
		bodyModel[89] = new ModelRendererTurbo(this, 375, 17, textureX, textureY, "lamp"); // Box 248 Headlight Front
		bodyModel[90] = new ModelRendererTurbo(this, 368, 1, textureX, textureY, "prime1"); // Box 6 PRIME3-1
		bodyModel[91] = new ModelRendererTurbo(this, 368, 1, textureX, textureY, "prime3"); // Box 7 PRIME3-3
		bodyModel[92] = new ModelRendererTurbo(this, 368, 1, textureX, textureY, "prime2"); // Box 8 PRIME3-2
		bodyModel[93] = new ModelRendererTurbo(this, 368, 1, textureX, textureY, "prime4"); // Box 9 PRIME3-4
		bodyModel[94] = new ModelRendererTurbo(this, 368, 5, textureX, textureY); // Box 428 prime base
		bodyModel[95] = new ModelRendererTurbo(this, 362, 49, textureX, textureY); // Box 48
		bodyModel[96] = new ModelRendererTurbo(this, 352, 51, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[97] = new ModelRendererTurbo(this, 352, 51, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[98] = new ModelRendererTurbo(this, 351, 48, textureX, textureY, "cull"); // Box 192 cull
		bodyModel[99] = new ModelRendererTurbo(this, 21, 226, textureX, textureY); // Box 193 snow guide linkage
		bodyModel[100] = new ModelRendererTurbo(this, 21, 223, textureX, textureY); // Box 194 snow guide linkage
		bodyModel[101] = new ModelRendererTurbo(this, 21, 204, textureX, textureY); // Box 195 snow guide linkage
		bodyModel[102] = new ModelRendererTurbo(this, 21, 207, textureX, textureY); // Box 196 snow guide linkage
		bodyModel[103] = new ModelRendererTurbo(this, 131, 151, textureX, textureY, "cull"); // Box 198 cull ladder grabs
		bodyModel[104] = new ModelRendererTurbo(this, 131, 151, textureX, textureY, "cull"); // Box 199 cull ladder grabs
		bodyModel[105] = new ModelRendererTurbo(this, 112, 122, textureX, textureY); // Box 201
		bodyModel[106] = new ModelRendererTurbo(this, 121, 122, textureX, textureY); // Box 202
		bodyModel[107] = new ModelRendererTurbo(this, 399, 18, textureX, textureY); // Box 203 window snow wiper
		bodyModel[108] = new ModelRendererTurbo(this, 399, 18, textureX, textureY); // Box 204 window snow wiper
		bodyModel[109] = new ModelRendererTurbo(this, 397, 12, textureX, textureY); // Box 205 window snow wiper
		bodyModel[110] = new ModelRendererTurbo(this, 397, 12, textureX, textureY); // Box 206 window snow wiper
		bodyModel[111] = new ModelRendererTurbo(this, 146, 123, textureX, textureY); // Box 207
		bodyModel[112] = new ModelRendererTurbo(this, 385, 23, textureX, textureY); // Box 208
		bodyModel[113] = new ModelRendererTurbo(this, 392, 22, textureX, textureY, "lamp"); // Box 209 headlight front plow
		bodyModel[114] = new ModelRendererTurbo(this, 392, 22, textureX, textureY, "lamp"); // Box 210 headlight front plow
		bodyModel[115] = new ModelRendererTurbo(this, 385, 23, textureX, textureY); // Box 211
		bodyModel[116] = new ModelRendererTurbo(this, 392, 22, textureX, textureY, "lamp"); // Box 212 headlight front plow
		bodyModel[117] = new ModelRendererTurbo(this, 392, 22, textureX, textureY, "lamp"); // Box 213 headlight front plow
		bodyModel[118] = new ModelRendererTurbo(this, 370, 15, textureX, textureY); // Box 418
		bodyModel[119] = new ModelRendererTurbo(this, 361, 12, textureX, textureY); // Box 419
		bodyModel[120] = new ModelRendererTurbo(this, 359, 15, textureX, textureY); // Box 420
		bodyModel[121] = new ModelRendererTurbo(this, 361, 18, textureX, textureY); // Box 421
		bodyModel[122] = new ModelRendererTurbo(this, 358, 5, textureX, textureY); // Box 409 commander base
		bodyModel[123] = new ModelRendererTurbo(this, 358, 1, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[124] = new ModelRendererTurbo(this, 371, 12, textureX, textureY); // Box 220
		bodyModel[125] = new ModelRendererTurbo(this, 382, 12, textureX, textureY); // Box 221
		bodyModel[126] = new ModelRendererTurbo(this, 387, 9, textureX, textureY); // Box 222 exhaust 1
		bodyModel[127] = new ModelRendererTurbo(this, 354, 32, textureX, textureY); // Box 223
		bodyModel[128] = new ModelRendererTurbo(this, 172, 70, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[129] = new ModelRendererTurbo(this, 193, 75, textureX, textureY); // Box 350
		bodyModel[130] = new ModelRendererTurbo(this, 313, 8, textureX, textureY); // Box 227
		bodyModel[131] = new ModelRendererTurbo(this, 78, 146, textureX, textureY); // Box 228
		bodyModel[132] = new ModelRendererTurbo(this, 85, 155, textureX, textureY); // Box 229
		bodyModel[133] = new ModelRendererTurbo(this, 105, 155, textureX, textureY); // Box 230
		bodyModel[134] = new ModelRendererTurbo(this, 103, 195, textureX, textureY); // Box 231
		bodyModel[135] = new ModelRendererTurbo(this, 85, 195, textureX, textureY); // Box 232
		bodyModel[136] = new ModelRendererTurbo(this, 352, 42, textureX, textureY, "lamp"); // Box 247 headlight rear left
		bodyModel[137] = new ModelRendererTurbo(this, 359, 42, textureX, textureY, "lamp"); // Box 418 headlight rear right
		bodyModel[138] = new ModelRendererTurbo(this, 368, 5, textureX, textureY); // Box 242
		bodyModel[139] = new ModelRendererTurbo(this, 371, 25, textureX, textureY); // Box 243
		bodyModel[140] = new ModelRendererTurbo(this, 378, 25, textureX, textureY, "ditch"); // Box 244 headlight front single
		bodyModel[141] = new ModelRendererTurbo(this, 371, 25, textureX, textureY); // Box 245
		bodyModel[142] = new ModelRendererTurbo(this, 378, 25, textureX, textureY, "ditch"); // Box 246 headlight front single
		bodyModel[143] = new ModelRendererTurbo(this, 144, 121, textureX, textureY); // Box 247
		bodyModel[144] = new ModelRendererTurbo(this, 152, 220, textureX, textureY); // Box 361
		bodyModel[145] = new ModelRendererTurbo(this, 1, 157, textureX, textureY); // Box 174 static support
		bodyModel[146] = new ModelRendererTurbo(this, 1, 157, textureX, textureY); // Box 175 static support
		bodyModel[147] = new ModelRendererTurbo(this, 351, 6, textureX, textureY); // Box 176
		bodyModel[148] = new ModelRendererTurbo(this, 351, 11, textureX, textureY, "ditch"); // Box 177 headlight side roof
		bodyModel[149] = new ModelRendererTurbo(this, 351, 6, textureX, textureY); // Box 178
		bodyModel[150] = new ModelRendererTurbo(this, 351, 11, textureX, textureY, "ditch"); // Box 179 headlight side roof
		bodyModel[151] = new ModelRendererTurbo(this, 298, 11, textureX, textureY); // Box 180
		bodyModel[152] = new ModelRendererTurbo(this, 158, 102, textureX, textureY); // Box 130
		bodyModel[153] = new ModelRendererTurbo(this, 159, 98, textureX, textureY); // Box 131
		bodyModel[154] = new ModelRendererTurbo(this, 159, 98, textureX, textureY); // Box 132
		bodyModel[155] = new ModelRendererTurbo(this, 158, 115, textureX, textureY); // Box 184
		bodyModel[156] = new ModelRendererTurbo(this, 159, 111, textureX, textureY); // Box 185
		bodyModel[157] = new ModelRendererTurbo(this, 159, 111, textureX, textureY); // Box 186
		bodyModel[158] = new ModelRendererTurbo(this, 398, 2, textureX, textureY); // Box 187 exhaust 2
		bodyModel[159] = new ModelRendererTurbo(this, 400, 10, textureX, textureY); // Box 188 exhaust 2 air vent
		bodyModel[160] = new ModelRendererTurbo(this, 3, 72, textureX, textureY); // Box 189 cylinder for wings
		bodyModel[161] = new ModelRendererTurbo(this, 2, 65, textureX, textureY); // Box 190 cylinder for wings
		bodyModel[162] = new ModelRendererTurbo(this, 3, 72, textureX, textureY); // Box 191 cylinder for wings
		bodyModel[163] = new ModelRendererTurbo(this, 14, 72, textureX, textureY); // Box 192 cylinder for wings
		bodyModel[164] = new ModelRendererTurbo(this, 13, 65, textureX, textureY); // Box 193 cylinder for wings
		bodyModel[165] = new ModelRendererTurbo(this, 14, 72, textureX, textureY); // Box 194 cylinder for wings
		bodyModel[166] = new ModelRendererTurbo(this, 43, 72, textureX, textureY, "cull"); // Box 195 cull
		bodyModel[167] = new ModelRendererTurbo(this, 23, 70, textureX, textureY); // Box 196
		bodyModel[168] = new ModelRendererTurbo(this, 43, 68, textureX, textureY, "cull"); // Box 197 cull
		bodyModel[169] = new ModelRendererTurbo(this, 23, 73, textureX, textureY); // Box 198
		bodyModel[170] = new ModelRendererTurbo(this, 308, 42, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[171] = new ModelRendererTurbo(this, 330, 42, textureX, textureY); // Box 453 rear end bit
		bodyModel[172] = new ModelRendererTurbo(this, 330, 42, textureX, textureY); // Box 454 rear end bit
		bodyModel[173] = new ModelRendererTurbo(this, 330, 51, textureX, textureY); // Box 190 rear mu plug
		bodyModel[174] = new ModelRendererTurbo(this, 330, 56, textureX, textureY); // Box 454 rear end no diagphram
		bodyModel[175] = new ModelRendererTurbo(this, 323, 42, textureX, textureY); // Box 456 rear end no diagphram
		bodyModel[176] = new ModelRendererTurbo(this, 323, 42, textureX, textureY); // Box 457 rear end no diagphram
		bodyModel[177] = new ModelRendererTurbo(this, 330, 47, textureX, textureY); // Box 458 rear end no diagphram
		bodyModel[178] = new ModelRendererTurbo(this, 330, 47, textureX, textureY); // Box 459 rear end no diagphram
		bodyModel[179] = new ModelRendererTurbo(this, 339, 43, textureX, textureY); // Box 460 rear door step
		bodyModel[180] = new ModelRendererTurbo(this, 189, 131, textureX, textureY); // Box 1 coupler
		bodyModel[181] = new ModelRendererTurbo(this, 189, 137, textureX, textureY, "cull"); // Box 1 cull rear draft gear
		bodyModel[182] = new ModelRendererTurbo(this, 174, 129, textureX, textureY); // Box 485
		bodyModel[183] = new ModelRendererTurbo(this, 337, 51, textureX, textureY); // Box 213 rear mu plug
		bodyModel[184] = new ModelRendererTurbo(this, 344, 51, textureX, textureY); // Box 491 MU plug
		bodyModel[185] = new ModelRendererTurbo(this, 211, 138, textureX, textureY); // Box 131 tm
		bodyModel[186] = new ModelRendererTurbo(this, 230, 143, textureX, textureY); // Box 133 tm
		bodyModel[187] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 319 propane tank to supply the gas for all your to run yoru all your things the coffee maker and everything else you have
		bodyModel[188] = new ModelRendererTurbo(this, 258, 156, textureX, textureY); // Box 320 propane tank
		bodyModel[189] = new ModelRendererTurbo(this, 258, 156, textureX, textureY); // Box 321 propane tank
		bodyModel[190] = new ModelRendererTurbo(this, 337, 123, textureX, textureY); // Box 188 Steam gen exhaust
		bodyModel[191] = new ModelRendererTurbo(this, 300, 136, textureX, textureY); // Box 485 Steam Gen
		bodyModel[192] = new ModelRendererTurbo(this, 324, 143, textureX, textureY); // Box 222
		bodyModel[193] = new ModelRendererTurbo(this, 320, 123, textureX, textureY); // Box 223 steam gen component
		bodyModel[194] = new ModelRendererTurbo(this, 263, 158, textureX, textureY); // Box 224 main electrical cabinent
		bodyModel[195] = new ModelRendererTurbo(this, 266, 146, textureX, textureY); // Box 225
		bodyModel[196] = new ModelRendererTurbo(this, 265, 146, textureX, textureY); // Box 226
		bodyModel[197] = new ModelRendererTurbo(this, 266, 146, textureX, textureY); // Box 227
		bodyModel[198] = new ModelRendererTurbo(this, 268, 140, textureX, textureY); // Box 228
		bodyModel[199] = new ModelRendererTurbo(this, 142, 190, textureX, textureY); // Box 229 electrical conduit raceway high voltage no touchyyy
		bodyModel[200] = new ModelRendererTurbo(this, 172, 168, textureX, textureY); // Box 479 blower motore
		bodyModel[201] = new ModelRendererTurbo(this, 189, 164, textureX, textureY); // Box 231 blower motor
		bodyModel[202] = new ModelRendererTurbo(this, 280, 149, textureX, textureY); // Box 232 16 hundred gallon watertank above us up there on the cieling
		bodyModel[203] = new ModelRendererTurbo(this, 211, 138, textureX, textureY); // Box 131 tm
		bodyModel[204] = new ModelRendererTurbo(this, 230, 143, textureX, textureY); // Box 133 tm
		bodyModel[205] = new ModelRendererTurbo(this, 230, 143, textureX, textureY); // Box 242 tm
		bodyModel[206] = new ModelRendererTurbo(this, 211, 138, textureX, textureY); // Box 243 tm
		bodyModel[207] = new ModelRendererTurbo(this, 211, 138, textureX, textureY); // Box 244 tm
		bodyModel[208] = new ModelRendererTurbo(this, 230, 143, textureX, textureY); // Box 245 tm
		bodyModel[209] = new ModelRendererTurbo(this, 230, 170, textureX, textureY); // Box 247 low voltage generator
		bodyModel[210] = new ModelRendererTurbo(this, 231, 166, textureX, textureY); // Box 248 low voltage generator
		bodyModel[211] = new ModelRendererTurbo(this, 231, 166, textureX, textureY); // Box 249 low voltage generator
		bodyModel[212] = new ModelRendererTurbo(this, 169, 183, textureX, textureY); // Box 257 tm blower ducting
		bodyModel[213] = new ModelRendererTurbo(this, 179, 177, textureX, textureY); // Box 258 tm blower ducting
		bodyModel[214] = new ModelRendererTurbo(this, 168, 177, textureX, textureY); // Box 263 tm blower ducting
		bodyModel[215] = new ModelRendererTurbo(this, 168, 177, textureX, textureY); // Box 264 tm blower ducting
		bodyModel[216] = new ModelRendererTurbo(this, 161, 171, textureX, textureY); // Box 265 tm blower ducting
		bodyModel[217] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 266 tm blower ducting
		bodyModel[218] = new ModelRendererTurbo(this, 161, 171, textureX, textureY); // Box 267 tm blower ducting
		bodyModel[219] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 268 tm blower ducting
		bodyModel[220] = new ModelRendererTurbo(this, 222, 127, textureX, textureY, "cull"); // Box 269 CULL WALKWAY
		bodyModel[221] = new ModelRendererTurbo(this, 164, 28, textureX, textureY); // Box 270
		bodyModel[222] = new ModelRendererTurbo(this, 191, 154, textureX, textureY, "rotary"); // Box 251 rotor shaft
		bodyModel[223] = new ModelRendererTurbo(this, 191, 159, textureX, textureY, "rotary"); // Box 252 rotor shaft
		bodyModel[224] = new ModelRendererTurbo(this, 210, 164, textureX, textureY); // Box 273 THE SUPER GEARBOX
		bodyModel[225] = new ModelRendererTurbo(this, 203, 164, textureX, textureY); // Box 274 THE SUPER GEARBOX
		bodyModel[226] = new ModelRendererTurbo(this, 139, 183, textureX, textureY); // Box 275
		bodyModel[227] = new ModelRendererTurbo(this, 140, 176, textureX, textureY); // Box 276
		bodyModel[228] = new ModelRendererTurbo(this, 140, 176, textureX, textureY); // Box 277
		bodyModel[229] = new ModelRendererTurbo(this, 216, 169, textureX, textureY); // Box 278 aux gen driveline
		bodyModel[230] = new ModelRendererTurbo(this, 216, 169, textureX, textureY); // Box 279 aux gen driveline
		bodyModel[231] = new ModelRendererTurbo(this, 210, 171, textureX, textureY); // Box 280 aux gen driveline
		bodyModel[232] = new ModelRendererTurbo(this, 180, 2, textureX, textureY, "cull"); // Box 281 cull walkway
		bodyModel[233] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 282
		bodyModel[234] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 283
		bodyModel[235] = new ModelRendererTurbo(this, 88, 129, textureX, textureY); // Box 284
		bodyModel[236] = new ModelRendererTurbo(this, 88, 129, textureX, textureY); // Box 285
		bodyModel[237] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 286
		bodyModel[238] = new ModelRendererTurbo(this, 130, 122, textureX, textureY); // Box 287
		bodyModel[239] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 288
		bodyModel[240] = new ModelRendererTurbo(this, 142, 151, textureX, textureY, "cull"); // Box 290 cull ladder grabs
		bodyModel[241] = new ModelRendererTurbo(this, 321, 159, textureX, textureY); // Box 291 at the end of the walkway is a 1000 gallon water tank
		bodyModel[242] = new ModelRendererTurbo(this, 215, 130, textureX, textureY); // Box 292
		bodyModel[243] = new ModelRendererTurbo(this, 319, 135, textureX, textureY); // Box 293 steam gen component
		bodyModel[244] = new ModelRendererTurbo(this, 329, 124, textureX, textureY); // Box 294 steam gen air intake period questionmark
		bodyModel[245] = new ModelRendererTurbo(this, 302, 127, textureX, textureY); // Box 295 steam gen component
		bodyModel[246] = new ModelRendererTurbo(this, 367, 19, textureX, textureY); // Box 296 Airhorn
		bodyModel[247] = new ModelRendererTurbo(this, 337, 135, textureX, textureY); // Box 297 steam gen exhaust
		bodyModel[248] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 298 steam gen exhaust
		bodyModel[249] = new ModelRendererTurbo(this, 286, 166, textureX, textureY, "cull"); // Box 299 cull watertank support
		bodyModel[250] = new ModelRendererTurbo(this, 286, 166, textureX, textureY, "cull"); // Box 300 cull watertank support
		bodyModel[251] = new ModelRendererTurbo(this, 247, 166, textureX, textureY); // Box 301
		bodyModel[252] = new ModelRendererTurbo(this, 211, 218, textureX, textureY); // Box 302
		bodyModel[253] = new ModelRendererTurbo(this, 197, 195, textureX, textureY); // Box 303
		bodyModel[254] = new ModelRendererTurbo(this, 147, 203, textureX, textureY); // Box 304
		bodyModel[255] = new ModelRendererTurbo(this, 152, 218, textureX, textureY); // Box 305
		bodyModel[256] = new ModelRendererTurbo(this, 166, 203, textureX, textureY); // Box 306
		bodyModel[257] = new ModelRendererTurbo(this, 183, 208, textureX, textureY); // Box 307
		bodyModel[258] = new ModelRendererTurbo(this, 192, 224, textureX, textureY); // Box 308
		bodyModel[259] = new ModelRendererTurbo(this, 210, 186, textureX, textureY); // Box 309
		bodyModel[260] = new ModelRendererTurbo(this, 161, 197, textureX, textureY); // Box 310
		bodyModel[261] = new ModelRendererTurbo(this, 198, 218, textureX, textureY); // Box 311 radiophone
		bodyModel[262] = new ModelRendererTurbo(this, 130, 203, textureX, textureY); // Box 312
		bodyModel[263] = new ModelRendererTurbo(this, 121, 208, textureX, textureY); // Box 313
		bodyModel[264] = new ModelRendererTurbo(this, 178, 200, textureX, textureY); // Box 314
		bodyModel[265] = new ModelRendererTurbo(this, 187, 195, textureX, textureY); // Box 315
		bodyModel[266] = new ModelRendererTurbo(this, 219, 207, textureX, textureY); // Box 131 cs an shit
		bodyModel[267] = new ModelRendererTurbo(this, 210, 207, textureX, textureY); // Box 131 cs ab shit
		bodyModel[268] = new ModelRendererTurbo(this, 201, 207, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[269] = new ModelRendererTurbo(this, 192, 208, textureX, textureY); // Box 307 spedo dont glow it stoopid
		bodyModel[270] = new ModelRendererTurbo(this, 1, 136, textureX, textureY); // Box 320
		bodyModel[271] = new ModelRendererTurbo(this, 76, 144, textureX, textureY); // Box 321
		bodyModel[272] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 322
		bodyModel[273] = new ModelRendererTurbo(this, 1, 109, textureX, textureY); // Box 323
		bodyModel[274] = new ModelRendererTurbo(this, 385, 2, textureX, textureY); // Box 324 exhaust 3
		bodyModel[275] = new ModelRendererTurbo(this, 371, 32, textureX, textureY, "cull"); // Box 325 cull roof walkway
		bodyModel[276] = new ModelRendererTurbo(this, 354, 24, textureX, textureY); // Box 326
		bodyModel[277] = new ModelRendererTurbo(this, 363, 5, textureX, textureY); // Box 409 commander base
		bodyModel[278] = new ModelRendererTurbo(this, 363, 1, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[279] = new ModelRendererTurbo(this, 363, 8, textureX, textureY); // Box 329
		bodyModel[280] = new ModelRendererTurbo(this, 305, 7, textureX, textureY, "cull"); // Box 330 cull lifting lugs
		bodyModel[281] = new ModelRendererTurbo(this, 305, 7, textureX, textureY, "cull"); // Box 330 cull lifting lugs
		bodyModel[282] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 336
		bodyModel[283] = new ModelRendererTurbo(this, 16, 200, textureX, textureY); // Box 337 snow guide pivot
		bodyModel[284] = new ModelRendererTurbo(this, 21, 201, textureX, textureY); // Box 338 snow guide linkage
		bodyModel[285] = new ModelRendererTurbo(this, 21, 210, textureX, textureY); // Box 339 snow guide linkage
		bodyModel[286] = new ModelRendererTurbo(this, 21, 210, textureX, textureY); // Box 340 snow guide linkage
		bodyModel[287] = new ModelRendererTurbo(this, 21, 210, textureX, textureY); // Box 341 snow guide linkage
		bodyModel[288] = new ModelRendererTurbo(this, 32, 210, textureX, textureY); // Box 342
		bodyModel[289] = new ModelRendererTurbo(this, 32, 210, textureX, textureY); // Box 343
		bodyModel[290] = new ModelRendererTurbo(this, 32, 210, textureX, textureY); // Box 344
		bodyModel[291] = new ModelRendererTurbo(this, 37, 209, textureX, textureY); // Box 345
		bodyModel[292] = new ModelRendererTurbo(this, 21, 229, textureX, textureY); // Box 346 snow guide linkage
		bodyModel[293] = new ModelRendererTurbo(this, 21, 232, textureX, textureY); // Box 347 snow guide linkage
		bodyModel[294] = new ModelRendererTurbo(this, 21, 232, textureX, textureY); // Box 348 snow guide linkage
		bodyModel[295] = new ModelRendererTurbo(this, 21, 232, textureX, textureY); // Box 349 snow guide linkage
		bodyModel[296] = new ModelRendererTurbo(this, 32, 232, textureX, textureY); // Box 350
		bodyModel[297] = new ModelRendererTurbo(this, 32, 232, textureX, textureY); // Box 351
		bodyModel[298] = new ModelRendererTurbo(this, 32, 232, textureX, textureY); // Box 352
		bodyModel[299] = new ModelRendererTurbo(this, 37, 231, textureX, textureY); // Box 353
		bodyModel[300] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 354
		bodyModel[301] = new ModelRendererTurbo(this, 353, 21, textureX, textureY); // Box 355 whistle
		bodyModel[302] = new ModelRendererTurbo(this, 16, 222, textureX, textureY); // Box 356 snow guide pivot
		bodyModel[303] = new ModelRendererTurbo(this, 408, 2, textureX, textureY); // Box 404 she wheel on my antenna till i wagon
		bodyModel[304] = new ModelRendererTurbo(this, 411, 2, textureX, textureY); // Box 287 sinclair antenna PC
		bodyModel[305] = new ModelRendererTurbo(this, 154, 151, textureX, textureY, "cull"); // Box 305 cull sp roof ladder

		bodyModel[0].addBox(0F, 0F, 0F, 53, 20, 1, 0F); // Box 421
		bodyModel[0].setRotationPoint(-21.5F, -18F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 53, 20, 1, 0F); // Box 422
		bodyModel[1].setRotationPoint(-21.5F, -18F, 10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 53, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[2].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[3].setRotationPoint(-6.5F, -19F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[4].setRotationPoint(-6.5F, -19F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 39, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[5].setRotationPoint(-6.5F, -20F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 39, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 18
		bodyModel[6].setRotationPoint(-6.5F, -20F, 4F);

		bodyModel[7].addBox(0F, 0F, 0F, 39, 1, 8, 0F); // Box 19
		bodyModel[7].setRotationPoint(-6.5F, -21F, -4F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 178 cull ladder grabs
		bodyModel[8].setRotationPoint(28.49F, -9F, -11.75F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 180 cull ladder grabs
		bodyModel[9].setRotationPoint(28.49F, -9F, 10.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[10].setRotationPoint(28.5F, 3F, -11.01F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[11].setRotationPoint(28.5F, 3F, 11.01F);

		bodyModel[12].addBox(0F, 0F, 0F, 22, 21, 1, 0F); // Box 0
		bodyModel[12].setRotationPoint(32.5F, -18F, -11F);
		bodyModel[12].rotateAngleY = 1.57079633F;

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 27
		bodyModel[13].setRotationPoint(31.5F, -20F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[14].setRotationPoint(31.5F, -20F, 4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[15].setRotationPoint(31.5F, -20F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 73
		bodyModel[16].setRotationPoint(-28.5F, -16.5F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 7, 10, 1, 0F); // Box 76
		bodyModel[17].setRotationPoint(-28.5F, -8.5F, -13F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 79
		bodyModel[18].setRotationPoint(-28.5F, 8.5F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 7, 10, 1, 0F); // Box 82
		bodyModel[19].setRotationPoint(-28.5F, -8.5F, 12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 83
		bodyModel[20].setRotationPoint(-28.5F, 8.5F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[21].setRotationPoint(-28.5F, 8.5F, -13F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[22].setRotationPoint(-28.5F, -16.5F, -13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F); // Box 86
		bodyModel[23].setRotationPoint(-28.5F, -16.5F, 5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[24].setRotationPoint(-33.5F, 8.5F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[25].setRotationPoint(-33.5F, -8.5F, 12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[26].setRotationPoint(-33.5F, 1.5F, 12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 145
		bodyModel[27].setRotationPoint(-33.5F, 8.5F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[28].setRotationPoint(-33.5F, 8.5F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -1F); // Box 153
		bodyModel[29].setRotationPoint(-33.5F, 1.5F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 154
		bodyModel[30].setRotationPoint(-33.5F, -8.5F, -13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Box 158
		bodyModel[31].setRotationPoint(-33.5F, -16.5F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 159
		bodyModel[32].setRotationPoint(-33.5F, -16.5F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 160
		bodyModel[33].setRotationPoint(-33.5F, -16.5F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 164
		bodyModel[34].setRotationPoint(-33.5F, -15.5F, -13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, -1F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[35].setRotationPoint(-33.5F, -15.5F, 12F);

		bodyModel[36].addShapeBox(0F, -1F, -1F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 166 rotor shaft main
		bodyModel[36].setRotationPoint(-28F, -3.5F, 0F);

		bodyModel[37].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 205 rotor blade
		bodyModel[37].setRotationPoint(-27.5F, -3.5F, 0F);

		bodyModel[38].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 207 rotor blade
		bodyModel[38].setRotationPoint(-27.5F, -3.5F, 0F);
		bodyModel[38].rotateAngleX = 1.57079633F;

		bodyModel[39].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 208 rotor blade
		bodyModel[39].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[39].rotateAngleX = 3.14159265F;

		bodyModel[40].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 209 rotor blade
		bodyModel[40].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[40].rotateAngleX = 4.71238898F;

		bodyModel[41].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 210 rotor blade
		bodyModel[41].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[41].rotateAngleX = 0.52359878F;

		bodyModel[42].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 211 rotor blade
		bodyModel[42].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[42].rotateAngleX = 2.0943951F;

		bodyModel[43].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 212 rotor blade
		bodyModel[43].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[43].rotateAngleX = 3.66519143F;

		bodyModel[44].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 213 rotor blade
		bodyModel[44].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[44].rotateAngleX = 5.23598776F;

		bodyModel[45].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 214 rotor blade
		bodyModel[45].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[45].rotateAngleX = 1.04719755F;

		bodyModel[46].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 215 rotor blade
		bodyModel[46].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[46].rotateAngleX = 2.61799388F;

		bodyModel[47].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 216 rotor blade
		bodyModel[47].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[47].rotateAngleX = 4.1887902F;

		bodyModel[48].addShapeBox(0F, 0.5F, -2.5F, 0, 11, 5, 0F,0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, -0.125F, 0F, -2F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 217 rotor blade
		bodyModel[48].setRotationPoint(-27.5F, -3.5F, 0F);
		//bodyModel[48].rotateAngleX = 5.75958653F;

		bodyModel[49].addShapeBox(-1F, -1F, -1F, 1, 2, 2, 0F,0.5F, -1F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -1F, -1F); // Box 219 rotor shaft
		bodyModel[49].setRotationPoint(-28F, -3.5F, 0F);

		bodyModel[50].addBox(0F, -12F, -12F, 0, 24, 24, 0F); // Box 221
		bodyModel[50].setRotationPoint(-23.5F, -3.5F, 0F);

		bodyModel[51].addShapeBox(0F, -1F, -5F, 6, 5, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 222 snow chute cull
		bodyModel[51].setRotationPoint(-28.5F, -16.5F, 0F);

		bodyModel[52].addBox(-6F, 0F, 0F, 6, 19, 0, 0F); // Box 223 snow guide l
		bodyModel[52].setRotationPoint(-33.5F, -9.5F, -13F);
		bodyModel[52].rotateAngleY = 0.34906585F;

		bodyModel[53].addBox(-6F, 0F, 0F, 6, 19, 0, 0F); // Box 224 snow guide r
		bodyModel[53].setRotationPoint(-33.5F, -9.5F, 13F);
		bodyModel[53].rotateAngleY = -0.34906585F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[54].setRotationPoint(-20.5F, -25F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[55].setRotationPoint(-20.5F, -25F, 1F);

		bodyModel[56].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // Box 309
		bodyModel[56].setRotationPoint(-21.5F, -25F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[57].setRotationPoint(-20.5F, -22F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[58].setRotationPoint(-20.5F, -22F, 7F);

		bodyModel[59].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 242
		bodyModel[59].setRotationPoint(-21.5F, -21F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 243
		bodyModel[60].setRotationPoint(-21.5F, -21F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 20, 26, 1, 0F); // Box 244
		bodyModel[61].setRotationPoint(-20.5F, -24F, -10F);
		bodyModel[61].rotateAngleY = 1.57079633F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[62].setRotationPoint(-21.5F, -24F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[63].setRotationPoint(-21.5F, -25F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[64].setRotationPoint(-21.5F, -25F, 1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[65].setRotationPoint(-21.5F, -24F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[66].setRotationPoint(-6.5F, -25F, 1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[67].setRotationPoint(-6.5F, -25F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[68].setRotationPoint(-6.5F, -24.5F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[69].setRotationPoint(-6.5F, -24.5F, -5F);

		bodyModel[70].addBox(0F, 0F, 0F, 16, 3, 8, 0F); // Box 253
		bodyModel[70].setRotationPoint(-6.5F, -24F, -4F);

		bodyModel[71].addBox(0F, 0F, 0F, 17, 17, 1, 0F); // Box 86
		bodyModel[71].setRotationPoint(-6.5F, -24F, -7F);
		bodyModel[71].rotateAngleY = 1.57079633F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[72].setRotationPoint(-7.5F, -24F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[73].setRotationPoint(-7.5F, -24F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[74].setRotationPoint(-7.5F, -25F, 1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[75].setRotationPoint(-7.5F, -25F, -7F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[76].setRotationPoint(-14F, 3.75F, -2F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		bodyModel[77].setRotationPoint(12F, 3.75F, -2F);

		bodyModel[78].addBox(0F, 0F, 0F, 51, 1, 8, 0F); // Box 165
		bodyModel[78].setRotationPoint(-21.5F, 3.5F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 2F, -1F, 0F, -2.5F, 0F, 0F, 0F); // Box 282
		bodyModel[79].setRotationPoint(-2.5F, 7.5F, 0F);
		bodyModel[79].rotateAngleY = 1.57079633F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, -1F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -2.5F); // Box 283
		bodyModel[80].setRotationPoint(-2.5F, 7.5F, -10F);
		bodyModel[80].rotateAngleY = 1.57079633F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 445
		bodyModel[81].setRotationPoint(-1.5F, 6.5F, 2F);
		bodyModel[81].rotateAngleY = 1.57079633F;

		bodyModel[82].addShapeBox(0F, 0F, -2F, 8, 1, 1, 0F,0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 1F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 446
		bodyModel[82].setRotationPoint(-3.5F, 6.5F, -10F);
		bodyModel[82].rotateAngleY = 1.57079633F;

		bodyModel[83].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 173
		bodyModel[83].setRotationPoint(-1.5F, 7F, -5F);
		bodyModel[83].rotateAngleZ = 0.45378561F;

		bodyModel[84].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 174
		bodyModel[84].setRotationPoint(-1.5F, 7F, 5F);
		bodyModel[84].rotateAngleZ = 0.45378561F;

		bodyModel[85].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 175
		bodyModel[85].setRotationPoint(-1.75F, 4.5F, -3F);

		bodyModel[86].addBox(0F, 0F, 0F, 14, 1, 20, 0F); // Box 176
		bodyModel[86].setRotationPoint(-20.5F, -7F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 185
		bodyModel[87].setRotationPoint(-22.5F, -25F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front
		bodyModel[88].setRotationPoint(-23.25F, -24.95F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front
		bodyModel[89].setRotationPoint(-23.25F, -24.95F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[90].setRotationPoint(-12F, -26.5F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[91].setRotationPoint(-12F, -26.5F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[92].setRotationPoint(-12F, -26.5F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[93].setRotationPoint(-12F, -26.5F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[94].setRotationPoint(-12F, -26F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[95].setRotationPoint(-32.5F, -20.5F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[96].setRotationPoint(-32.75F, -20.5F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[97].setRotationPoint(-32.75F, -18.5F, -1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 192 cull
		bodyModel[98].setRotationPoint(-33.5F, -20.5F, -2F);

		bodyModel[99].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 193 snow guide linkage
		bodyModel[99].setRotationPoint(-36.3F, -1.5F, 14F);
		bodyModel[99].rotateAngleY = -0.06981317F;

		bodyModel[100].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 194 snow guide linkage
		bodyModel[100].setRotationPoint(-36.3F, -7.5F, 14F);
		bodyModel[100].rotateAngleY = -0.06981317F;

		bodyModel[101].addBox(0F, 0F, -1F, 9, 1, 1, 0F); // Box 195 snow guide linkage
		bodyModel[101].setRotationPoint(-36.3F, -1.5F, -14F);
		bodyModel[101].rotateAngleY = 0.06981317F;

		bodyModel[102].addBox(0F, 0F, -1F, 9, 1, 1, 0F); // Box 196 snow guide linkage
		bodyModel[102].setRotationPoint(-36.3F, 4.5F, -14F);
		bodyModel[102].rotateAngleY = 0.06981317F;

		bodyModel[103].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 198 cull ladder grabs
		bodyModel[103].setRotationPoint(-11.5F, -18F, 10.75F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 199 cull ladder grabs
		bodyModel[104].setRotationPoint(-11.5F, -18F, -11.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[105].setRotationPoint(-11.5F, 3F, -11.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[106].setRotationPoint(-11.5F, 3F, 11.01F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 203 window snow wiper
		bodyModel[107].setRotationPoint(-21.51F, -20F, 6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 204 window snow wiper
		bodyModel[108].setRotationPoint(-21.51F, -20F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 205 window snow wiper
		bodyModel[109].setRotationPoint(-21.51F, -22F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 206 window snow wiper
		bodyModel[110].setRotationPoint(-21.51F, -22F, 2F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 4, 14, 0F); // Box 207
		bodyModel[111].setRotationPoint(23F, 4F, -7F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 208
		bodyModel[112].setRotationPoint(-33.5F, -18.5F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 209 headlight front plow
		bodyModel[113].setRotationPoint(-34.25F, -18.45F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 210 headlight front plow
		bodyModel[114].setRotationPoint(-34.25F, -18.45F, -10F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 211
		bodyModel[115].setRotationPoint(-33.5F, -18.5F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 212 headlight front plow
		bodyModel[116].setRotationPoint(-34.25F, -18.45F, 8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 213 headlight front plow
		bodyModel[117].setRotationPoint(-34.25F, -18.45F, 6F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[118].setRotationPoint(22.5F, -20.5F, -9.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[119].setRotationPoint(21F, -21.25F, -8.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[120].setRotationPoint(20F, -21.5F, -9.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[121].setRotationPoint(21.5F, -21.25F, -10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[122].setRotationPoint(29F, -22F, -0.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[123].setRotationPoint(29F, -23F, -0.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 220
		bodyModel[124].setRotationPoint(-18F, -23.5F, 9.3F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 221
		bodyModel[125].setRotationPoint(-15.5F, -22.5F, 9.3F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 222 exhaust 1
		bodyModel[126].setRotationPoint(27F, -23F, 3F);

		bodyModel[127].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 223
		bodyModel[127].setRotationPoint(14F, -21.5F, 4F);
		bodyModel[127].rotateAngleX = -0.31415927F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[128].setRotationPoint(-19.5F, -21F, 10F);

		bodyModel[129].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[129].setRotationPoint(-20F, -20F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 16, 1, 2, 0F); // Box 227
		bodyModel[130].setRotationPoint(-6.5F, -25F, -1F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 24, 24, 0F); // Box 228
		bodyModel[131].setRotationPoint(-22.5F, -15.5F, -12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[132].setRotationPoint(-22.5F, 1.5F, -12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 230
		bodyModel[133].setRotationPoint(-22.5F, 1.5F, 5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[134].setRotationPoint(-22.5F, -15.5F, 5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[135].setRotationPoint(-22.5F, -15.5F, -12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[136].setRotationPoint(32F, -10.5F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[137].setRotationPoint(32F, -10.5F, 7F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 242
		bodyModel[138].setRotationPoint(-14F, -26.5F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[139].setRotationPoint(-22F, -21F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 244 headlight front single
		bodyModel[140].setRotationPoint(-22.75F, -20.95F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[141].setRotationPoint(-22F, -21F, 9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 246 headlight front single
		bodyModel[142].setRotationPoint(-22.75F, -20.95F, 9F);

		bodyModel[143].addBox(0F, 0F, 0F, 0, 6, 22, 0F); // Box 247
		bodyModel[143].setRotationPoint(32.51F, 3F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 9, 2, 20, 0F); // Box 361
		bodyModel[144].setRotationPoint(-20.5F, -9F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, -1F, 21, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 174 static support
		bodyModel[145].setRotationPoint(-33.3F, 7.5F, -12.75F);
		bodyModel[145].rotateAngleY = 0.12217305F;
		bodyModel[145].rotateAngleZ = 0.2268928F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 175 static support
		bodyModel[146].setRotationPoint(-33.3F, 7.5F, 12.75F);
		bodyModel[146].rotateAngleY = -0.12217305F;
		bodyModel[146].rotateAngleZ = 0.2268928F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[147].setRotationPoint(9F, -21.5F, 8F);
		bodyModel[147].rotateAngleY = -0.43633231F;
		bodyModel[147].rotateAngleZ = 0.12217305F;

		bodyModel[148].addShapeBox(-0.75F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 177 headlight side roof
		bodyModel[148].setRotationPoint(9F, -21.5F, 8F);
		bodyModel[148].rotateAngleY = -0.43633231F;
		bodyModel[148].rotateAngleZ = 0.12217305F;

		bodyModel[149].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[149].setRotationPoint(9F, -21.5F, -8F);
		bodyModel[149].rotateAngleY = 0.43633231F;
		bodyModel[149].rotateAngleZ = 0.12217305F;

		bodyModel[150].addShapeBox(-0.75F, 0F, -2F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 179 headlight side roof
		bodyModel[150].setRotationPoint(9F, -21.5F, -8F);
		bodyModel[150].rotateAngleY = 0.43633231F;
		bodyModel[150].rotateAngleZ = 0.12217305F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[151].setRotationPoint(9.5F, -24F, -4F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 130
		bodyModel[152].setRotationPoint(-3F, 3.5F, 7.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 131
		bodyModel[153].setRotationPoint(-3F, 4.5F, 6.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 132
		bodyModel[154].setRotationPoint(-3F, 4.5F, 9.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[155].setRotationPoint(-3F, 3.5F, -9.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[156].setRotationPoint(-3F, 4.5F, -7.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 186
		bodyModel[157].setRotationPoint(-3F, 4.5F, -10.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 187 exhaust 2
		bodyModel[158].setRotationPoint(25F, -23F, 6F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 188 exhaust 2 air vent
		bodyModel[159].setRotationPoint(29F, -21.5F, 6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 189 cylinder for wings
		bodyModel[160].setRotationPoint(-25F, -14.5F, -12.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190 cylinder for wings
		bodyModel[161].setRotationPoint(-25F, -15.5F, -11.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 191 cylinder for wings
		bodyModel[162].setRotationPoint(-25F, -14.5F, -9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 192 cylinder for wings
		bodyModel[163].setRotationPoint(-25F, -14.5F, 11.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 193 cylinder for wings
		bodyModel[164].setRotationPoint(-25F, -15.5F, 9.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 194 cylinder for wings
		bodyModel[165].setRotationPoint(-25F, -14.5F, 8.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195 cull
		bodyModel[166].setRotationPoint(-27F, -10F, -13.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 8, 0, 2, 0F); // Box 196
		bodyModel[167].setRotationPoint(-21F, -8F, -13F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 197 cull
		bodyModel[168].setRotationPoint(-27F, -10F, 11.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 8, 0, 2, 0F); // Box 198
		bodyModel[169].setRotationPoint(-21F, -8F, 11F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 13, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[170].setRotationPoint(30.5F, -13F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453 rear end bit
		bodyModel[171].setRotationPoint(32.5F, -15F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Box 454 rear end bit
		bodyModel[172].setRotationPoint(32.5F, -15F, -3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 rear mu plug
		bodyModel[173].setRotationPoint(32.5F, -15F, -2F);
		bodyModel[173].rotateAngleZ = -0.27925268F;

		bodyModel[174].addShapeBox(0F, 0F, -2F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 454 rear end no diagphram
		bodyModel[174].setRotationPoint(32.5F, 1F, -3.5F);
		bodyModel[174].rotateAngleY = 1.57079633F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 456 rear end no diagphram
		bodyModel[175].setRotationPoint(32.5F, -15F, -4F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457 rear end no diagphram
		bodyModel[176].setRotationPoint(32.5F, -15F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,-0.5F, -1F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458 rear end no diagphram
		bodyModel[177].setRotationPoint(32.5F, -16F, -4F);
		bodyModel[177].rotateAngleY = 1.57079633F;

		bodyModel[178].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0F, -0.625F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.625F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 459 rear end no diagphram
		bodyModel[178].setRotationPoint(32.5F, -16F, 0F);
		bodyModel[178].rotateAngleY = 1.57079633F;

		bodyModel[179].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 460 rear door step
		bodyModel[179].setRotationPoint(32.5F, 0F, -2F);
		bodyModel[179].rotateAngleY = 1.57079633F;

		bodyModel[180].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[180].setRotationPoint(31.5F, 3F, -1.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 1 cull rear draft gear
		bodyModel[181].setRotationPoint(31.5F, 3F, -4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 485
		bodyModel[182].setRotationPoint(28.5F, 2.5F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 213 rear mu plug
		bodyModel[183].setRotationPoint(32.5F, -15F, 0F);
		bodyModel[183].rotateAngleZ = -0.27925268F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 491 MU plug
		bodyModel[184].setRotationPoint(32F, -0.5F, 4.75F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 131 tm
		bodyModel[185].setRotationPoint(13F, -3F, -9F);
		bodyModel[185].rotateAngleY = 1.57079633F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 133 tm
		bodyModel[186].setRotationPoint(13F, -2F, -5F);
		bodyModel[186].rotateAngleY = 1.57079633F;

		bodyModel[187].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 319 propane tank to supply the gas for all your to run yoru all your things the coffee maker and everything else you have
		bodyModel[187].setRotationPoint(-2.5F, -6F, 7.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 320 propane tank
		bodyModel[188].setRotationPoint(-3.5F, -6F, 8.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 321 propane tank
		bodyModel[189].setRotationPoint(-1.5F, -6F, 8.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 188 Steam gen exhaust
		bodyModel[190].setRotationPoint(27F, -18F, 6F);

		bodyModel[191].addBox(0F, 0F, 0F, 4, 6, 5, 0F); // Box 485 Steam Gen
		bodyModel[191].setRotationPoint(26.5F, -4F, 5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[192].setRotationPoint(24F, -20F, 2.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 223 steam gen component
		bodyModel[193].setRotationPoint(23.75F, -7F, 5F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 17, 8, 0F); // Box 224 main electrical cabinent
		bodyModel[194].setRotationPoint(20F, -15F, -6.15F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.25F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 1F, 0F); // Box 225
		bodyModel[195].setRotationPoint(22.5F, -18.5F, -5.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 226
		bodyModel[196].setRotationPoint(20.5F, -19.5F, -5.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -0.25F, 0F); // Box 227
		bodyModel[197].setRotationPoint(19.5F, -18.5F, -5.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 228
		bodyModel[198].setRotationPoint(20.5F, -16F, -4F);

		bodyModel[199].addBox(0F, 0F, 0F, 30, 1, 3, 0F); // Box 229 electrical conduit raceway high voltage no touchyyy
		bodyModel[199].setRotationPoint(-7F, -8F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 479 blower motore
		bodyModel[200].setRotationPoint(17F, -2F, 3F);
		bodyModel[200].rotateAngleY = 1.57079633F;

		bodyModel[201].addBox(0F, 0F, 0F, 3, 7, 7, 0F); // Box 231 blower motor
		bodyModel[201].setRotationPoint(16F, -4F, 1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 13, 5, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232 16 hundred gallon watertank above us up there on the cieling
		bodyModel[202].setRotationPoint(-4F, -20F, -5F);

		bodyModel[203].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 131 tm
		bodyModel[203].setRotationPoint(-1F, -3F, -9F);
		bodyModel[203].rotateAngleY = 1.57079633F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 133 tm
		bodyModel[204].setRotationPoint(-1F, -2F, -5F);
		bodyModel[204].rotateAngleY = 1.57079633F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 242 tm
		bodyModel[205].setRotationPoint(3F, -2F, 5F);
		bodyModel[205].rotateAngleY = -1.57079633F;

		bodyModel[206].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 243 tm
		bodyModel[206].setRotationPoint(3F, -3F, 9F);
		bodyModel[206].rotateAngleY = -1.57079633F;

		bodyModel[207].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 244 tm
		bodyModel[207].setRotationPoint(-11F, -3F, 9F);
		bodyModel[207].rotateAngleY = -1.57079633F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 245 tm
		bodyModel[208].setRotationPoint(-11F, -2F, 5F);
		bodyModel[208].rotateAngleY = -1.57079633F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 247 low voltage generator
		bodyModel[209].setRotationPoint(16.5F, -1.5F, -6.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 248 low voltage generator
		bodyModel[210].setRotationPoint(16.5F, -0.5F, -7.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 249 low voltage generator
		bodyModel[211].setRotationPoint(16.5F, -0.5F, -4.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 30, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 257 tm blower ducting
		bodyModel[212].setRotationPoint(-11F, -6.5F, 2F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 2F, 0F, -0.25F, 2F); // Box 258 tm blower ducting
		bodyModel[213].setRotationPoint(16F, -4.75F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263 tm blower ducting
		bodyModel[214].setRotationPoint(4F, -6F, 5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264 tm blower ducting
		bodyModel[215].setRotationPoint(-10F, -6F, 5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -1.25F, 1.5F, 0F, -1.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265 tm blower ducting
		bodyModel[216].setRotationPoint(9F, -6F, -7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 266 tm blower ducting
		bodyModel[217].setRotationPoint(9F, -6.5F, -4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -1.25F, 1.5F, 0F, -1.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267 tm blower ducting
		bodyModel[218].setRotationPoint(-5F, -6F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 268 tm blower ducting
		bodyModel[219].setRotationPoint(-5F, -6.5F, -4F);

		bodyModel[220].addBox(0F, 0F, 0F, 33, 6, 4, 0F); // Box 269 CULL WALKWAY
		bodyModel[220].setRotationPoint(-6.5F, -11F, -10F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 270
		bodyModel[221].setRotationPoint(-7.5F, -21F, -10F);

		bodyModel[222].addShapeBox(0F, -1F, -1F, 18, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 251 rotor shaft
		bodyModel[222].setRotationPoint(-15F, -1F, -5F);

		bodyModel[223].addShapeBox(0F, -1F, -1F, 29, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 rotor shaft
		bodyModel[223].setRotationPoint(-15F, -1F, 5F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 5, 13, 0F); // Box 273 THE SUPER GEARBOX
		bodyModel[224].setRotationPoint(-19F, -2.5F, -6.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 274 THE SUPER GEARBOX
		bodyModel[225].setRotationPoint(-19F, -4.5F, -1.5F);

		bodyModel[226].addShapeBox(0F, -1.5F, -1.5F, 5, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275
		bodyModel[226].setRotationPoint(-16F, -1F, 0F);
		bodyModel[226].rotateAngleX = 0.78539816F;

		bodyModel[227].addShapeBox(0F, -1.5F, -1.5F, 4, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276
		bodyModel[227].setRotationPoint(-16.5F, -1F, 5F);
		bodyModel[227].rotateAngleX = 0.78539816F;

		bodyModel[228].addShapeBox(0F, -1.5F, -1.5F, 4, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 277
		bodyModel[228].setRotationPoint(-16.5F, -1F, -5F);
		bodyModel[228].rotateAngleX = 0.78539816F;

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 278 aux gen driveline
		bodyModel[229].setRotationPoint(13F, -1.5F, -5.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 279 aux gen driveline
		bodyModel[230].setRotationPoint(15F, 0F, -6F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 280 aux gen driveline
		bodyModel[231].setRotationPoint(14.5F, -1.25F, -6.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 281 cull walkway
		bodyModel[232].setRotationPoint(31.75F, -18.5F, -3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 0, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[233].setRotationPoint(28.5F, 8F, -12F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 0, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[234].setRotationPoint(28.5F, 5F, -12F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 0, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[235].setRotationPoint(-11.5F, 5F, -12F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 0, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[236].setRotationPoint(-11.5F, 8F, -12F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[237].setRotationPoint(21.5F, 5F, -12F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[238].setRotationPoint(21.5F, 3F, -11.01F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[239].setRotationPoint(21.5F, 8F, -12F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 290 cull ladder grabs
		bodyModel[240].setRotationPoint(21.5F, -18F, -11.75F);

		bodyModel[241].addBox(0F, 0F, 0F, 5, 17, 7, 0F); // Box 291 at the end of the walkway is a 1000 gallon water tank
		bodyModel[241].setRotationPoint(26.5F, -15F, -10F);

		bodyModel[242].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 292
		bodyModel[242].setRotationPoint(23.5F, -5F, -6F);

		bodyModel[243].addBox(0F, 0F, 0F, 3, 10, 2, 0F); // Box 293 steam gen component
		bodyModel[243].setRotationPoint(23.5F, -8F, 7F);

		bodyModel[244].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 294 steam gen air intake period questionmark
		bodyModel[244].setRotationPoint(24.5F, -17F, 7F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 295 steam gen component
		bodyModel[245].setRotationPoint(27F, -8F, 5.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 296 Airhorn
		bodyModel[246].setRotationPoint(30F, -16F, 8.25F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 297 steam gen exhaust
		bodyModel[247].setRotationPoint(28F, -12F, 6F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298 steam gen exhaust
		bodyModel[248].setRotationPoint(28F, -15F, 6F);

		bodyModel[249].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 299 cull watertank support
		bodyModel[249].setRotationPoint(7F, -15F, -5F);
		bodyModel[249].rotateAngleY = 1.57079633F;

		bodyModel[250].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 300 cull watertank support
		bodyModel[250].setRotationPoint(-0.99F, -15F, -5F);
		bodyModel[250].rotateAngleY = 1.57079633F;

		bodyModel[251].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 301
		bodyModel[251].setRotationPoint(-7F, -15F, -6F);

		bodyModel[252].addBox(0F, 0F, 0F, 0, 6, 12, 0F); // Box 302
		bodyModel[252].setRotationPoint(-11.5F, -15F, -6F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Box 303
		bodyModel[253].setRotationPoint(-21F, -24F, -2F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 8, 6, 0F); // Box 304
		bodyModel[254].setRotationPoint(-21F, -17F, -3F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 305
		bodyModel[255].setRotationPoint(-18.25F, -16F, 0.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 306
		bodyModel[256].setRotationPoint(-21F, -16F, 3F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[257].setRotationPoint(-20F, -15F, 7F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 6, 6, 0F); // Box 308
		bodyModel[258].setRotationPoint(-16.5F, -15F, -3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -4F, 0F, -6F, -4F); // Box 309
		bodyModel[259].setRotationPoint(-18.99F, -23F, -2F);

		bodyModel[260].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 310
		bodyModel[260].setRotationPoint(-17F, -24.25F, -1.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 311 radiophone
		bodyModel[261].setRotationPoint(-14.5F, -18F, -1F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 312
		bodyModel[262].setRotationPoint(-21F, -16F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[263].setRotationPoint(-20F, -15F, -10F);

		bodyModel[264].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 314
		bodyModel[264].setRotationPoint(-20F, -18F, -3F);
		bodyModel[264].rotateAngleY = -0.17453293F;

		bodyModel[265].addShapeBox(2.01F, 0F, 0F, 0, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -3F, -2F); // Box 315
		bodyModel[265].setRotationPoint(-20F, -18F, -3F);
		bodyModel[265].rotateAngleY = -0.17453293F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 131 cs an shit
		bodyModel[266].setRotationPoint(-19F, -15.5F, -4.5F);
		bodyModel[266].rotateAngleY = -0.71558499F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 131 cs ab shit
		bodyModel[267].setRotationPoint(-19.5F, -14.5F, -5.5F);

		bodyModel[268].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[268].setRotationPoint(-19F, -22.5F, 6F);
		bodyModel[268].rotateAngleY = -0.64577182F;
		bodyModel[268].rotateAngleZ = -0.12217305F;

		bodyModel[269].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo dont glow it stoopid
		bodyModel[269].setRotationPoint(-19F, -22.5F, 6F);
		bodyModel[269].rotateAngleY = -0.64577182F;
		bodyModel[269].rotateAngleZ = -0.12217305F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-0.5F, -3.5F, -4F, 0.5F, -2.5F, 3F, 0.5F, 4.5F, -3F, -0.5F, -2.5F, -2F, -0.5F, 2.5F, -4F, 0.5F, 2.5F, 3F, 0.5F, -5.5F, -2F, -0.5F, 1.5F, -2F); // Box 320
		bodyModel[270].setRotationPoint(-34F, 6F, 8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-0.5F, -2.5F, -2F, 0.5F, 4.5F, -3F, 0.5F, -2.5F, 3F, -0.5F, -3.5F, -4F, -0.5F, 1.5F, -2F, 0.5F, -5.5F, -2F, 0.5F, 2.5F, 3F, -0.5F, 2.5F, -4F); // Box 321
		bodyModel[271].setRotationPoint(-34F, 6F, -15F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-0.5F, 1.5F, -2F, 0.5F, -5.5F, -2F, 0.5F, 2.5F, 3F, -0.5F, 2.5F, -4F, -0.5F, -2.5F, -2F, 0.5F, 4.5F, -3F, 0.5F, -2.5F, 3F, -0.5F, -3.5F, -4F); // Box 322
		bodyModel[272].setRotationPoint(-34F, -14F, -15F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-0.5F, 2.5F, -4F, 0.5F, 2.5F, 3F, 0.5F, -5.5F, -2F, -0.5F, 1.5F, -2F, -0.5F, -3.5F, -4F, 0.5F, -2.5F, 3F, 0.5F, 4.5F, -3F, -0.5F, -2.5F, -2F); // Box 323
		bodyModel[273].setRotationPoint(-34F, -14F, 8F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 324 exhaust 3
		bodyModel[274].setRotationPoint(24F, -22F, 5F);

		bodyModel[275].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 325 cull roof walkway
		bodyModel[275].setRotationPoint(10F, -21.25F, -2F);

		bodyModel[276].addBox(0F, 0F, -6F, 5, 1, 6, 0F); // Box 326
		bodyModel[276].setRotationPoint(14F, -21.5F, -4F);
		bodyModel[276].rotateAngleX = 0.31415927F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[277].setRotationPoint(29F, -21F, -8.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[278].setRotationPoint(29F, -22F, -8.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[279].setRotationPoint(29F, -20F, -8.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 19F, -0.5F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, 19F); // Box 330 cull lifting lugs
		bodyModel[280].setRotationPoint(-5F, -21F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 19F, -0.5F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, 19F); // Box 330 cull lifting lugs
		bodyModel[281].setRotationPoint(19F, -21F, -10F);

		bodyModel[282].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 336
		bodyModel[282].setRotationPoint(-30F, -14F, -10.5F);

		bodyModel[283].addBox(-0.5F, 0F, -0.5F, 1, 18, 1, 0F); // Box 337 snow guide pivot
		bodyModel[283].setRotationPoint(-33F, -10F, -13.5F);
		bodyModel[283].rotateAngleY = -0.78539816F;

		bodyModel[284].addBox(0F, 0F, -1F, 9, 1, 1, 0F); // Box 338 snow guide linkage
		bodyModel[284].setRotationPoint(-36.3F, -7.5F, -14F);
		bodyModel[284].rotateAngleY = 0.06981317F;

		bodyModel[285].addShapeBox(9F, -0.5F, -1F, 4, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 339 snow guide linkage
		bodyModel[285].setRotationPoint(-36.3F, -7.5F, -14F);
		bodyModel[285].rotateAngleY = 0.06981317F;

		bodyModel[286].addShapeBox(9F, -0.5F, -1F, 4, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 340 snow guide linkage
		bodyModel[286].setRotationPoint(-36.3F, -1.5F, -14F);
		bodyModel[286].rotateAngleY = 0.06981317F;

		bodyModel[287].addShapeBox(9F, -0.5F, -1F, 4, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 341 snow guide linkage
		bodyModel[287].setRotationPoint(-36.3F, 4.5F, -14F);
		bodyModel[287].rotateAngleY = 0.06981317F;

		bodyModel[288].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 342
		bodyModel[288].setRotationPoint(-25.3F, -7.5F, -13F);

		bodyModel[289].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 343
		bodyModel[289].setRotationPoint(-25.3F, -1.5F, -13F);

		bodyModel[290].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 344
		bodyModel[290].setRotationPoint(-25.3F, 4.5F, -13F);

		bodyModel[291].addShapeBox(0F, 0F, -1F, 1, 3, 4, 0F,0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 345
		bodyModel[291].setRotationPoint(-24.3F, 2.5F, -13F);

		bodyModel[292].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 346 snow guide linkage
		bodyModel[292].setRotationPoint(-36.3F, 4.5F, 14F);
		bodyModel[292].rotateAngleY = -0.06981317F;

		bodyModel[293].addShapeBox(9F, -0.5F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 347 snow guide linkage
		bodyModel[293].setRotationPoint(-36.3F, -7.5F, 14F);
		bodyModel[293].rotateAngleY = -0.06981317F;

		bodyModel[294].addShapeBox(9F, -0.5F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 348 snow guide linkage
		bodyModel[294].setRotationPoint(-36.3F, -1.5F, 14F);
		bodyModel[294].rotateAngleY = -0.06981317F;

		bodyModel[295].addShapeBox(9F, -0.5F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 349 snow guide linkage
		bodyModel[295].setRotationPoint(-36.3F, 4.5F, 14F);
		bodyModel[295].rotateAngleY = -0.06981317F;

		bodyModel[296].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 350
		bodyModel[296].setRotationPoint(-25.3F, -7.5F, 14F);

		bodyModel[297].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 351
		bodyModel[297].setRotationPoint(-25.3F, -1.5F, 14F);

		bodyModel[298].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 352
		bodyModel[298].setRotationPoint(-25.3F, 4.5F, 14F);

		bodyModel[299].addShapeBox(0F, 0F, -1F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 353
		bodyModel[299].setRotationPoint(-24.3F, 2.5F, 11F);

		bodyModel[300].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 354
		bodyModel[300].setRotationPoint(-30F, -14F, 10.5F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355 whistle
		bodyModel[301].setRotationPoint(24F, -22F, 3F);

		bodyModel[302].addBox(-0.5F, 0F, -0.5F, 1, 18, 1, 0F); // Box 356 snow guide pivot
		bodyModel[302].setRotationPoint(-33F, -10F, 13.5F);
		bodyModel[302].rotateAngleY = -0.78539816F;

		bodyModel[303].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404 she wheel on my antenna till i wagon
		bodyModel[303].setRotationPoint(16F, -25F, 0F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287 sinclair antenna PC
		bodyModel[304].setRotationPoint(-19F, -26F, 0F);

		bodyModel[305].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 305 cull sp roof ladder
		bodyModel[305].setRotationPoint(28.49F, -18F, -11.75F);

		lastframe = System.nanoTime();

		blade = 0.0F;

		long now2 = System.nanoTime();
		int elapsed2 = (int) ((now2 - lastframe) / (1000 * 1000));
		blade -= (float) elapsed2 / 500.0f;//300 default, the higher the number the slower it rotates. 150 for normal run speed and 500 for idle?

		bodyModel[36].rotateAngleX = blade1 + blade;//main shaft
		bodyModel[37].rotateAngleX = blade1 + blade;//box 205 0
		bodyModel[38].rotateAngleX = blade2 + blade;//box 207 90
		bodyModel[39].rotateAngleX = blade3 + blade;//box 208 180
		bodyModel[40].rotateAngleX = blade4 + blade;//box 209 270
		bodyModel[41].rotateAngleX = blade5 + blade;//box 210 30
		bodyModel[42].rotateAngleX = blade6 + blade;//box 211 120
		bodyModel[43].rotateAngleX = blade7 + blade;//box 212 210
		bodyModel[44].rotateAngleX = blade8 + blade;//box 213 300
		bodyModel[45].rotateAngleX = blade9 + blade;//box 214 60
		bodyModel[46].rotateAngleX = blade10 + blade;//box 215 150
		bodyModel[47].rotateAngleX = blade11 + blade;//box 216 240
		bodyModel[48].rotateAngleX = blade12 + blade;//box 217 300
		bodyModel[49].rotateAngleX = blade1 + blade;//rotor shaft cap
		bodyModel[222].rotateAngleX = blade1 + blade;//interior shaft
		bodyModel[223].rotateAngleX = blade1 + blade;//interior shaft
	}
	Modelrotary_foxtruck truc = new Modelrotary_foxtruck();

	public float blade1 = 0.0F;
	public float blade2 = 1.5707963268F;
	public float blade3 = 3.1415926536F;
	public float blade4 = 4.7123889804F;
	public float blade5 = 0.5235987756F;
	public float blade6 = 2.0943951024F;
	public float blade7 = 3.6651914292F;
	public float blade8 = 5.235987756F;
	public float blade9 = 1.0471975512F;
	public float blade10 = 2.617993878F;
	public float blade11 = 4.1887902048F;
	public float blade12 = 5.75958653F;

	public float blade00 = 0.4188790204786391F; //24 degrees
	//public float propel2 = 5.759586531581287F;//330 degrees
	private long lastframe;
	private float blade;


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 6546) {
			//silver truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_longjohns.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			truc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.5F, 0.0F, 0);
			truc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//black truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/rotary_foxtruck_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(0.85F, 0.0F, 0F);
			truc.render(entity, f, f1, f2, f3, f4, f5);
			//GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-1.625F, 0.0F, 0);
			truc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);

		//for(ModelRendererTurbo m :bodyModel) {

		/*System.out.println( lastframe + "   LAST FRAME");
		System.out.println( blade + "   BLADE");
		System.out.println( blade1 + "   BLADE1");
		System.out.println( blade2 + "   BLADE2!!!!!!");*/
		//System.out.println( blade8 + blade + "   BLADE8");

			//if (((RotaryPlow1) entity).isLocoTurnedOn() && ((RotaryPlow1) entity).getCustomSpeed() <= 0 /*&& m.boxName.equals("rotary")*/) {//36-49, 222-223
				//if (m.boxName.equals("rotary")) {
					//if (((RotaryPlow1) entity).getCustomSpeed() <= 0) {


						//lastframe = System.nanoTime();
		//				blade = 0.0F;
//
		//				long now2 = System.nanoTime();
		//				int elapsed2 = (int) ((now2 - lastframe) / (1000 * 1000));
		//				blade -= (float) elapsed2 / 500.0f;//300 default, the higher the number the slower it rotates. 150 for normal run speed and 500 for idle?
		//				//lastframe = now2;
		//bodyModel[36].rotateAngleX = blade1 + blade;//main shaft
		//bodyModel[37].rotateAngleX = blade1 + blade;//box 205 0
		//bodyModel[38].rotateAngleX = blade2 + blade;//box 207 90
		//bodyModel[39].rotateAngleX = blade3 + blade;//box 208 180
		//bodyModel[40].rotateAngleX = blade4 + blade;//box 209 270
		//bodyModel[41].rotateAngleX = blade5 + blade;//box 210 30
		//bodyModel[42].rotateAngleX = blade6 + blade;//box 211 120
		//bodyModel[43].rotateAngleX = blade7 + blade;//box 212 210
		//bodyModel[44].rotateAngleX = blade8 + blade;//box 213 300
		//bodyModel[45].rotateAngleX = blade9 + blade;//box 214 60
		//bodyModel[46].rotateAngleX = blade10 + blade;//box 215 150
		//bodyModel[47].rotateAngleX = blade11 + blade;//box 216 240
		//bodyModel[48].rotateAngleX = blade12 + blade;//box 217 300
		//bodyModel[49].rotateAngleX = blade1 + blade;//rotor shaft cap
		//bodyModel[222].rotateAngleX = blade1 + blade;//interior shaft
		//bodyModel[223].rotateAngleX = blade1 + blade;//interior shaft


					//} /*else if (((RotaryPlow1) entity).getCustomSpeed() > 0) {

						/*long now23 = System.nanoTime();
						int elapsed23 = (int) ((now23 - lastframe) / (1000 * 1000));
						blade -= (float) elapsed23 / 500.0f;
						lastframe = now23;

						bodyModel[36].rotateAngleX = blade + blade1;
						bodyModel[37].rotateAngleX = blade + blade1;
						bodyModel[38].rotateAngleX = blade + blade1;
						bodyModel[39].rotateAngleX = blade + blade1;
						bodyModel[40].rotateAngleX = blade + blade1;
						bodyModel[41].rotateAngleX = blade + blade1;
						bodyModel[42].rotateAngleX = blade + blade1;
						bodyModel[43].rotateAngleX = blade + blade1;
						bodyModel[44].rotateAngleX = blade + blade1;
						bodyModel[45].rotateAngleX = blade + blade1;
						bodyModel[46].rotateAngleX = blade + blade1;
						bodyModel[47].rotateAngleX = blade + blade1;
						bodyModel[48].rotateAngleX = blade + blade1;
						bodyModel[49].rotateAngleX = blade + blade1;
						bodyModel[222].rotateAngleX = blade + blade1;
						bodyModel[223].rotateAngleX = blade + blade1;*/

					//}*/
				//}
			/*} else {
				bodyModel[37].rotateAngleX = 0F;
				bodyModel[38].rotateAngleX = 1.57079633F;
				bodyModel[39].rotateAngleX = 3.14159265F;
				bodyModel[40].rotateAngleX = 4.71238898F;
				bodyModel[41].rotateAngleX = 0.52359878F;
				bodyModel[42].rotateAngleX = 2.0943951F;
				bodyModel[43].rotateAngleX = 3.66519143F;
				bodyModel[44].rotateAngleX = 5.23598776F;
				bodyModel[45].rotateAngleX = 1.04719755F;
				bodyModel[46].rotateAngleX = 2.61799388F;
				bodyModel[47].rotateAngleX = 4.1887902F;
				bodyModel[48].rotateAngleX = 5.75958653F;*/
			//}
		//}

	}
		//getCustomSpeed  if(m.boxName.equals("rotary")){


}