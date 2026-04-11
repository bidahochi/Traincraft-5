package train.common.slots;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.LiquidManager;
import train.common.core.handlers.FuelHandler;
import train.common.core.handlers.ItemHandler;

public class SlotTender extends Slot {

	public SlotTender(IInventory iinventory, int i, int j, int k) {
		super(iinventory, i, j, k);
	}
	
	@Override
	public boolean isItemValid(ItemStack itemStack)
	{
		Block block = Block.getBlockFromItem(itemStack.getItem());
		if (block == null || ItemHandler.isBanned(itemStack))
		{
			return false;
		}
		if (LiquidManager.getInstance().isContainer(itemStack))
			return true;
		if (FuelHandler.steamFuelLast(itemStack) > 0) {
			return true;
		}
		return false;
	}
}
