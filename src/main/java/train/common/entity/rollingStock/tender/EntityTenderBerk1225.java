package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;


public class EntityTenderBerk1225 extends Tender
{
	public EntityTenderBerk1225(World world)
	{
		super(world, LiquidManager.WATER_FILTER);
	}

	@Override
	public String getInventoryName() {
		return "Berkshire 1225 Tender";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.875F;
	}

	@Override
	public int getTankCapacity()
	{
		return 15000;
	}
}