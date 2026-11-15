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

public class DieselGP15T extends DieselTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.DieselGP15T;
	}
	public DieselGP15T(World world) {
		super(world, LiquidManager.dieselFilter());
		
		InsertTexture(0, "Chessie System");
		InsertTexture(1, "CSXT (Bluedown)");
		InsertTexture(2, "CSXT (Stripe)");
		InsertTexture(3, "CSXT (Yn1)");
		InsertTexture(4, "CSXT (Yn2)");
		InsertTexture(5, "CSXT (Yn3)");
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
			new SeatDefinition("driver", 1.1375F, 0.2F, 0F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "EMD GP15T";
	}

	@Override
	public String transportYear() { return "1976-1983";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.0F);
	}


}