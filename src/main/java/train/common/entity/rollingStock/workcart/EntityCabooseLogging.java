package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;
import train.common.library.GuiIDs;

public class EntityCabooseLogging extends AbstractWorkCart {

	public EntityCabooseLogging(World world) {
		super(world);
	}

	public EntityCabooseLogging(World world, double posX, double posY, double posZ)
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
		return "Logging Caboose";
	}


	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.0F;
	}
}