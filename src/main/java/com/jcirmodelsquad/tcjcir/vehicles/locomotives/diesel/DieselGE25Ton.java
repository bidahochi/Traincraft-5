package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGE25Ton extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.Diesel25Ton;
	}
	public DieselGE25Ton(World world) {
		super(world, LiquidManager.dieselFilter());

		InsertTexture(0, "NPS (Golden Spike National Park)");
		InsertTexture(1, "PW (Shop Switcher)");
		InsertTexture(2, "Duke Power Company");
		InsertTexture(3, "some cement company thing idk they not important");
		InsertTexture(4, "oh brother heres another forgotten about bigj railroad");
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
			new SeatDefinition("driver", -0.5F, -0.2F, -0.0156F, SeatRole.DRIVER)
		};
	}



	



	@Override
	public String getInventoryName() {
		return "GE 25 Ton Switcher";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.6F);
	}
}