package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class ElectricPCC extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.ElectricPCCCar;
	}
	public ElectricPCC(World world) {
		super(world);
		initOverlayTextures();
		getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
				"Destination Sign",
				40, 12, 11, EnumOverlayFonts.OxygenSansSmall, 16f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
				new Point[]{new Point(334, 141)})
		);
	}



	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 2.1547F, -0.2F, -0.2562F, SeatRole.DRIVER)
		};
	}


	@Override
	public String getInventoryName() {
		return "PCC Streetcar";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.83F;
	}

	
	
}