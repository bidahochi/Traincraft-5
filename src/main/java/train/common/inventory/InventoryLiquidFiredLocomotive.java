package train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.SteamTrain;
import train.common.slots.SpecialSlots;
import train.common.slots.StandardRollingStockSlot;

public class InventoryLiquidFiredLocomotive extends AbstractTrainContainer
{
    private final SteamTrain locomotive;
    private final int locomotiveSlotCount;

    public InventoryLiquidFiredLocomotive(
            InventoryPlayer playerInventory,
            SteamTrain locomotive
    )
    {
        if (SteamTrain.isOilFiredSteam(locomotive) == false)
        {
            throw new IllegalArgumentException("Liquid service requires an oil-fired steam locomotive");
        }
        this.locomotive = locomotive;
        this.locomotiveSlotCount = locomotive.getSizeInventory();

        SpecialSlots specialSlots = SpecialSlots.getInstance();

        addSlotToContainer(specialSlots.new SlotFilteredLiquid(
                (IInventory) locomotive, 0, 8, 34, locomotive
        ));
        addSlotToContainer(specialSlots.new SlotFilteredLiquid(
                (IInventory) locomotive, 1, 8, 53, locomotive
        ));

        int firstCargoRowY = locomotive.numCargoSlots1 == 0 && locomotive.numCargoSlots2 == 0 ? 54 : 18;
        int nextSlot = addCargoRow(2, locomotive.numCargoSlots, firstCargoRowY);
        nextSlot = addCargoRow(nextSlot, locomotive.numCargoSlots1, 36);
        addCargoRow(nextSlot, locomotive.numCargoSlots2, 54);

        addPlayerInventory(playerInventory);
    }

    /** Adds one row of locomotive cargo and returns the next free inventory slot. */
    private int addCargoRow(int firstSlot, int slotCount, int rowY)
    {
        for (int column = 0; column < slotCount; column++)
        {
            addSlotToContainer(new StandardRollingStockSlot(locomotive, firstSlot + column, 80 + column * 18, rowY));
        }
        return firstSlot + slotCount;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return SteamTrain.isOilFiredSteam(locomotive) && locomotive.isDead == false
                && locomotive.isActiveDriver(player) && locomotive.isProtectedControlAuthorized(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        Slot slot = (Slot) inventorySlots.get(slotIndex);

        if (slot == null || !slot.getHasStack()) {
            return null;
        }

        ItemStack stack = slot.getStack();
        ItemStack original = stack.copy();

        if (slotIndex < locomotiveSlotCount)
        {
            if (mergeItemStack(stack, locomotiveSlotCount, inventorySlots.size(), true) == false)
            {
                return null;
            }
        }
        else if (((Slot) inventorySlots.get(0)).isItemValid(stack)) {
            if (!mergeItemStack(stack, 0, 1, false)) {
                return null;
            }
        }
        else if (((Slot) inventorySlots.get(1)).isItemValid(stack)) {
            if (!mergeItemStack(stack, 1, 2, false)) {
                return null;
            }
        }
        else if (mergeItemStack(stack, 2, locomotiveSlotCount, false) == false)
        {
            return null;
        }

        if (stack.stackSize == 0) {
            slot.putStack(null);
        }
        else {
            slot.onSlotChanged();
        }

        return original;
    }
}
