package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamShay3Truck extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.Steam3Truck;
	}
	public SteamShay3Truck(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.775F, 0F, 0.3462F, SeatRole.DRIVER)
		};
	}

	/*@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX-0.35F, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.0F, posZ+0.1F);// default
	}*/

	@Override
	public String getInventoryName() {
		return "Class 3-PC-13 3-Truck Shay";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

}