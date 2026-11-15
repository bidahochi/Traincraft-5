package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricKawasakiLRV extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.ElectricKawasakiLRV;
	}
	public ElectricKawasakiLRV(World world) {
		super(world);
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 2.2531F, -0.2F, 0F, SeatRole.DRIVER)
		};
	}


	@Override
	public String getInventoryName() {
		return "Kawasaki LRV";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.2F;
	}

	
	
}