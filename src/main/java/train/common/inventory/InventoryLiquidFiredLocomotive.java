package train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.locomotive.AbstractLiquidFiredSteamEngine;
import train.common.slots.SpecialSlots;
import train.common.slots.StandardRollingStockSlot;

public class InventoryLiquidFiredLocomotive extends AbstractTrainContainer
{
    private static final int LOCOMOTIVE_SLOT_COUNT = 5;

    private final AbstractLiquidFiredSteamEngine locomotive;

    public InventoryLiquidFiredLocomotive(
            InventoryPlayer playerInventory,
            AbstractLiquidFiredSteamEngine locomotive
    ) {
        this.locomotive = locomotive;

        SpecialSlots specialSlots = SpecialSlots.getInstance();

        addSlotToContainer(specialSlots.new SlotFilteredLiquid(
                (IInventory) locomotive, 0, 8, 34, locomotive
        ));
        addSlotToContainer(specialSlots.new SlotFilteredLiquid(
                (IInventory) locomotive, 1, 8, 53, locomotive
        ));

        addSlotToContainer(new StandardRollingStockSlot((IInventory) locomotive, 2, 80, 54));
        addSlotToContainer(new StandardRollingStockSlot((IInventory) locomotive, 3, 98, 54));
        addSlotToContainer(new StandardRollingStockSlot((IInventory) locomotive, 4, 116, 54));

        addPlayerInventory(playerInventory);
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return locomotive.isDead == false && locomotive.isActiveDriver(player) && locomotive.isProtectedControlAuthorized(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        Slot slot = (Slot) inventorySlots.get(slotIndex);

        if (slot == null || !slot.getHasStack()) {
            return null;
        }

        ItemStack stack = slot.getStack();
        ItemStack original = stack.copy();

        if (slotIndex < LOCOMOTIVE_SLOT_COUNT) {
            if (!mergeItemStack(stack, LOCOMOTIVE_SLOT_COUNT, inventorySlots.size(), true)) {
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
        else if (!mergeItemStack(stack, 2, LOCOMOTIVE_SLOT_COUNT, false)) {
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
