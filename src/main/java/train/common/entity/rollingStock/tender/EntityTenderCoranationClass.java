package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;


public class EntityTenderCoranationClass extends Tender
{
	public EntityTenderCoranationClass(World world)
	{
		super(world, LiquidManager.WATER_FILTER);
	}

	@Override
	public String getInventoryName() {
		return "Coronation Tender";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2F;
	}

	@Override
	public int getTankCapacity()
	{
		return 20000;
	}
}