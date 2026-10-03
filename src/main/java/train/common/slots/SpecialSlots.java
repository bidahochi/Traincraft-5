package train.common.slots;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.LiquidManager;
import train.common.core.handlers.ItemHandler;

public class SpecialSlots extends Slot {
	public SpecialSlots(IInventory iinventory, int i, int j, int k) {
		super(iinventory, i, j, k);
	}

	private static SpecialSlots instance;

	public static SpecialSlots getInstance() {
		if (instance == null) {
			instance = new SpecialSlots(null, 0, 0, 0);
		}
		return instance;
	}

	public class SlotFuel extends Slot {
		public SlotFuel(IInventory iinventory, int i, int j, int k) {
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

			return true;
		}
	}

	public class SlotLiquid extends Slot {
		public SlotLiquid(IInventory iinventory, int i, int j, int k) {
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

			return LiquidManager.getInstance().isContainer(itemStack);
		}
	}

	public class SlotFilteredLiquid extends Slot {
		private final IFluidContainerSlotValidator validator;
		private final int inputSlot;

		public SlotFilteredLiquid(
				IInventory inventory,
				int index,
				int x,
				int y,
				IFluidContainerSlotValidator validator
		) {
			super(inventory, index, x, y);
			this.validator = validator;
			this.inputSlot = index;
		}

		@Override
		public boolean isItemValid(ItemStack itemstack)
		{
			Block block = Block.getBlockFromItem(itemstack.getItem());
			if (block == null || ItemHandler.isBanned(itemstack))
			{
				return false;
			}

			return validator != null
					&& validator.isContainerValidForInputSlot(inputSlot, itemstack);
		}
	}

	public class SlotBuilder extends Slot {
		public SlotBuilder(IInventory par1iInventory, int par2, int par3, int par4) {
			super(par1iInventory, par2, par3, par4);
		}
		
		@Override
		public boolean isItemValid(ItemStack itemstack) {
			return false;
		}
	}
}
