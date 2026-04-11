package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;


public class EntityTenderFowler4F extends Tender
{
	public EntityTenderFowler4F(World world)
	{
		super(world, LiquidManager.WATER_FILTER);
	}

	@Override
	public String getInventoryName() {
		return "Fowler 4F Tender";
	}
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.8F;
	}

	@Override
	public int getTankCapacity()
	{
		return 15000;
	}
}