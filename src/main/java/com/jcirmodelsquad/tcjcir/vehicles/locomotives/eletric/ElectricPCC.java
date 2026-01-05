package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
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
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.65, -0.2, 0.25); }


	@Override
	public String getInventoryName() {
		return "PCC Streetcar";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.83F;
	}

	
	
}