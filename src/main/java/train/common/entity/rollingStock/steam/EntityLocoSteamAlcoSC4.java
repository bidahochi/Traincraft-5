package train.common.entity.rollingStock.steam;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class EntityLocoSteamAlcoSC4 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamAlcoSC4;
	}
	public EntityLocoSteamAlcoSC4(World world) {
		super(world, LiquidManager.WATER_FILTER);
		initOverlayTextures();
		getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
				"Engine Number",
				11, 9, 2, EnumOverlayFonts.OxygenSansMid, 16f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
				new Point[]{ new Point(7, 2), new Point(30, 10) }
		));
	}

	

	

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.6F;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.4062F, 0.5f, 0.37F, SeatRole.DRIVER),
			new SeatDefinition("crew_1", -0.4062F, 0.5f, -0.37F, SeatRole.CREW)
		};
	}

}
