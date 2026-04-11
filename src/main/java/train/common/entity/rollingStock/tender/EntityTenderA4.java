package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;


public class EntityTenderA4 extends Tender
{
	public EntityTenderA4(World world)
	{
		super(world, LiquidManager.WATER_FILTER);
	}

	@Override
	public String getInventoryName() {
		return "A4 Tender";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.1F;
	}

	@Override
	public int getTankCapacity()
	{
		return 6000;
	}
}