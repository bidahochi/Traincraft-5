package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;


public class EntityTenderMILW extends Tender
{
	public EntityTenderMILW(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public String getInventoryName() {
		return "MILW Tender";
	}
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.9F;
	}

	@Override
	public int getTankCapacity()
	{
		return 16000;
	}
}