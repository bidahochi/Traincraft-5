package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;
import train.common.library.GuiIDs;

public class EntityMailWagen_DB extends AbstractWorkCart
{

	public EntityMailWagen_DB(World world) {
		super(world);
	}

	public EntityMailWagen_DB(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return 0.15F;
	}

	@Override
	public String getInventoryName() {
		return "Mail Wagen";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.84F;
	}
}