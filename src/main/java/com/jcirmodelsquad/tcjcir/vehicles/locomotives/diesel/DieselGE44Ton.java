package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselGE44Ton extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.Diesel44Ton;
	}
	public DieselGE44Ton(World world) {
		super(world, LiquidManager.dieselFilter());
		
		InsertTexture(0, "VGN");
		InsertTexture(1, "VGN");
		InsertTexture(2, "Blandsville & Blankerston (Late)");
		InsertTexture(3, "Blandsville & Blankerston (Early)");
		InsertTexture(4, "DRGW");
		InsertTexture(5, "TIR");
		InsertTexture(6, "TIR");
		InsertTexture(7, "Generic Industrial");
		InsertTexture(8, "Generic Industrial");
		InsertTexture(9, "DLMR", LockoutGroup.DLMR);
		InsertTexture(10, "TNRJ (Temporarily Named Spawn Railroad Company of JCIR)");
		InsertTexture(11, "D(eez)N(uts)", LockoutGroup.DLMR);
		InsertTexture(12, "WM (Fireball Early)");
		InsertTexture(13, "WM (Fireball Late)");
		InsertTexture(14, "Wickersham Railroad Industries", LockoutGroup.BIDA);
		InsertTexture(15, "WICK (extra poo version)", LockoutGroup.BIDA);
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}



	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 0F, 0.1F, 0F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "GE 44 Ton Switcher";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.75F);
	}
}