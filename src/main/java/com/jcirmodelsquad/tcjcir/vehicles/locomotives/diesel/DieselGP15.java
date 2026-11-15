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

public class DieselGP15 extends DieselTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.DieselGP15;
	}
	public DieselGP15(World world) {
		super(world, LiquidManager.dieselFilter());
		
		InsertTexture(0, "UPY");
		InsertTexture(1, "FURRX"); // (old nasty ass texture if i see this in game somewhjer i will kill you)
		InsertTexture(2, "Lisha & Watson", LockoutGroup.LW);
		InsertTexture(3, "Atlas & Red Sands Railroad", LockoutGroup.BIDA);
		InsertTexture(4, "Southern Port Belt");
		InsertTexture(5, "GLC (Ex SPB)");
		InsertTexture(6, "CSXT (Yn3)");
		InsertTexture(7, "CSXT (Ex-Conrail)");
		InsertTexture(8, "Conrail (As Delivered)");
		InsertTexture(9, "Conrail (Post-93)");
		InsertTexture(10, "Conrail (OLS)");
		InsertTexture(11, "Conrail (Just Do It Boston Marathon Unit");
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
		return "EMD GP15-1";
	}

	@Override
	public String transportYear() {
		return "1976-1982";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.0F);
	}


}