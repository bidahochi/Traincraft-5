package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class EntityLocoSteamSouthern1102 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamSouthern1102;
	}
	public EntityLocoSteamSouthern1102(World world) {
		super(world, LiquidManager.WATER_FILTER);
		initOverlayTextures();
		getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
				"Engine Number",
				23, 7, 4, EnumOverlayFonts.OxygenSansSmall, 16f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
				new Point[]{ new Point(1, 2), new Point(24, 10) }
		));
	}

	

	
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -2.1104F, 0.3F, 0F, SeatRole.DRIVER)
		};
	}



	

	@Override
	public String getInventoryName() {
		return "Southern 1102";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.65F;
	}
}