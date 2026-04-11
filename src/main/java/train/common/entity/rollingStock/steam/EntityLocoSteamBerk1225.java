package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class EntityLocoSteamBerk1225 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamBerk1225;
	}

	public EntityLocoSteamBerk1225(World world) {
		super(world, LiquidManager.WATER_FILTER);
		initOverlayTextures();
		getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
				"Road Name",
				53, 5, 16, EnumOverlayFonts.OxygenSansSmall, 16f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
				new Point[]{ new Point(1025, 1460), new Point(1081, 1472) }
		));
		getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
				"Engine Number",
				38, 19, 4, EnumOverlayFonts.OxygenSansSmall, 32f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
				new Point[]{ new Point(1149, 1458), new Point(1193, 1478) }
		));
	}

	



	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, -1.125, 0.375);
	}



	

	
@Override
	public String getInventoryName() {
		return "Berkshire 1225";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.375F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 2775;
	}

	@Override
	public int getTankCapacity()
	{
		return 10000;
	}
	
}