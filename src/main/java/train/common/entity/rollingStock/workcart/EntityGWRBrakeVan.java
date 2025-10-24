package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;
import train.common.core.util.TraincraftUtil;
import train.common.library.GuiIDs;

public class EntityGWRBrakeVan extends AbstractWorkCart {

	public EntityGWRBrakeVan(World world) {
		super(world);
	}

	public EntityGWRBrakeVan(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, -1, 0.2);
	}

	@Override
	public String getInventoryName() {
		return "GWR Brake Van";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.4F;
	}
}