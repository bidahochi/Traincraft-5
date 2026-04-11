package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;


public class EntityTender4_4_0 extends Tender
{
	public EntityTender4_4_0(World world)
	{
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public String getInventoryName() {
		return "Tender";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.15F;
	}

	@Override
	public int getTankCapacity()
	{
		return 8000;
	}
}