package train.common.api.locomotive;

import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;
import train.common.api.SteamTrain;
import train.common.api.control.SteamFiringType;

/**
 * Retains the original oil-fired superclass for existing add-ons that extend it.
 *
 * @deprecated Extend {@link SteamTrain} and declare the firing type and liquid fuel capacity there.
 */
@Deprecated
public abstract class AbstractLiquidFiredSteamEngine extends SteamTrain
{
    /** Retains the original constructor with the default boiler filter. */
    public AbstractLiquidFiredSteamEngine(World world)
    {
        super(world);
    }

    /** Retains the original constructor for add-ons that supply a boiler filter. */
    public AbstractLiquidFiredSteamEngine(World world, FluidStack waterFilter)
    {
        super(world, waterFilter);
    }

    /** Declares oil for every skin, including the common base constructor's initial mode lookup. */
    @Override
    public SteamFiringType defaultFiringTypeForSkin(int skin)
    {
        return SteamFiringType.OIL;
    }

    /** Preserves the legacy virtual capacity hook, in millibuckets, during tank construction. */
    @Override
    protected int liquidFuelCapacity()
    {
        return getSecondaryTankCapacity();
    }

    /** Returns the stock's oil capacity in millibuckets; legacy add-ons may override this hook. */
    @Override
    public int getSecondaryTankCapacity()
    {
        return trainSpec.getSecondaryTankCapacity();
    }
}
