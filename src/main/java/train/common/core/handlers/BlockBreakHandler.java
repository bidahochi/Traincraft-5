package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.world.BlockEvent;
import train.common.blocks.BlockSwitchStand;
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.entity.TrustedPlayer;
import train.common.items.ItemPadlock;
import train.common.tile.TileSwitchStand;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

public class BlockBreakHandler {
    @SubscribeEvent
    public void onBlockBreakEvent(BlockEvent.BreakEvent breakEvent) {
        if (breakEvent.block instanceof BlockSwitchStand || breakEvent.world.getBlock(breakEvent.x, breakEvent.y + 1, breakEvent.z) instanceof  BlockSwitchStand) {
            TileSwitchStand switchStand;
            if (breakEvent.block instanceof  BlockSwitchStand) {
                switchStand =  ((TileSwitchStand) breakEvent.world.getTileEntity(breakEvent.x, breakEvent.y, breakEvent.z));
            } else {
                switchStand =  ((TileSwitchStand) breakEvent.world.getTileEntity(breakEvent.x, breakEvent.y + 1, breakEvent.z));
            }
            if (switchStand.isLocked() &&
                    (!(breakEvent.getPlayer().getDisplayName().equalsIgnoreCase(switchStand.getOwner())) && !TrustedPlayer.isPlayerTrustedToBreak(breakEvent.getPlayer().getDisplayName(), switchStand.getTrustedList()))) {
                if (breakEvent.getPlayer().canCommandSenderUseCommand(2, "") && breakEvent.getPlayer().inventory.getCurrentItem() != null &&
                        breakEvent.getPlayer().inventory.getCurrentItem().getItem() instanceof ItemPadlock) {
                    breakEvent.getPlayer().addChatMessage(new ChatComponentText("Broke switch stand owned by " + switchStand.getOwner() + " with operator permission."));
                } else {
                    breakEvent.setCanceled(true);
                    breakEvent.getPlayer().addChatMessage(new ChatComponentText("This switch stand is locked by " + switchStand.getOwner() + "!"));
                }
            }
        }
        else if (breakEvent.block instanceof BlockTCRail) {
            if (breakEvent.getPlayer() == null) {
                return;
            }
            if (!breakEvent.getPlayer().capabilities.isCreativeMode) {
                TileTCRail tileEntity = (TileTCRail) breakEvent.world.getTileEntity(breakEvent.x, breakEvent.y, breakEvent.z);
                while (tileEntity.isLinkedToRail) {
                    if (breakEvent.world.getTileEntity(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ) instanceof TileTCRailGag) {
                        TileTCRailGag tile = (TileTCRailGag) breakEvent.world.getTileEntity(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ);
                        while (breakEvent.world.getTileEntity(tile.originX, tile.originY, tile.originZ) instanceof TileTCRailGag) {
                            tile = (TileTCRailGag) breakEvent.world.getTileEntity(tile.originX, tile.originY, tile.originZ);
                        }
                        tileEntity = (TileTCRail) breakEvent.world.getTileEntity(tile.originX, tile.originY, tile.originZ);
                    } else {
                        tileEntity = (TileTCRail) breakEvent.world.getTileEntity(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ);
                    }
                }
                ItemStack stack =  new ItemStack(tileEntity.idDrop, 1, 0);
                breakEvent.world.spawnEntityInWorld(new EntityItem(breakEvent.world, breakEvent.x, breakEvent.y, breakEvent.z, stack));
            }
        }
        else if (breakEvent.block instanceof BlockTCRailGag) {
            if (breakEvent.getPlayer() == null) {
                return;
            }
            if (!breakEvent.getPlayer().capabilities.isCreativeMode) {
                TileTCRailGag tileEntity = (TileTCRailGag) breakEvent.world.getTileEntity(breakEvent.x, breakEvent.y, breakEvent.z);
                while (breakEvent.world.getTileEntity(tileEntity.originX, tileEntity.originY, tileEntity.originZ) instanceof TileTCRailGag) {
                    tileEntity = (TileTCRailGag) breakEvent.world.getTileEntity(tileEntity.originX, tileEntity.originY, tileEntity.originZ);
                }
                TileTCRail tile = (TileTCRail) breakEvent.world.getTileEntity(tileEntity.originX, tileEntity.originY, tileEntity.originZ);
                ItemStack stack =  new ItemStack(tile.idDrop, 1, 0);
                breakEvent.world.spawnEntityInWorld(new EntityItem(breakEvent.world, breakEvent.x, breakEvent.y, breakEvent.z, stack));
            }
        }
    }
}