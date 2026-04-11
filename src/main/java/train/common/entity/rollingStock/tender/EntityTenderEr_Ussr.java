package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;


public class EntityTenderEr_Ussr extends Tender
{
	public EntityTenderEr_Ussr(World world)
	{
		super(world, LiquidManager.WATER_FILTER);
	}

	@Override
	public String getInventoryName()
	{
		return "USSR 0-5-0's Tender";
	}

	@Override
	public boolean canBeRidden()
	{
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.67F;
	}

	@Override
	public int getTankCapacity()
	{
		return 16000;
	}
}