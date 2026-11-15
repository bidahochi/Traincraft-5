package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractTrains;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.api.control.SteamFiringType;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamGS4 extends SteamTrain {
	private static final int LIQUID_FUEL_CAPACITY_MB = 8800;
	private static final int ORANGE_SKIN = AbstractTrains.getColorFromString("Orange");
	private static final int WHITE_SKIN = AbstractTrains.getColorFromString("White");

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamGS4;
	}
	public EntityLocoSteamGS4(World world)
	{
		super(world, LiquidManager.WATER_FILTER);
	}

	/** Orange and White skins use oil; other skins retain the common steam default. */
	@Override
	public SteamFiringType defaultFiringTypeForSkin(int skin)
	{
		if (skin == ORANGE_SKIN || skin == WHITE_SKIN)
		{
			return SteamFiringType.OIL;
		}

		return super.defaultFiringTypeForSkin(skin);
	}

	/** Supplies the oil tank capacity in millibuckets during common steam construction. */
	@Override
	protected int liquidFuelCapacity()
	{
		return LIQUID_FUEL_CAPACITY_MB;
	}

	
	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -3.0875F, 0.5F, 0F, SeatRole.DRIVER)
		};
	}
@Override
	public String getInventoryName() {
		return "Daylight";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.62F;
	}
}
