package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class EntityCaboose3 extends AbstractWorkCart
{

	public EntityCaboose3(World world) {
		super(world);
	}

	public EntityCaboose3(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
	}
}