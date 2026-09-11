package train.common.adminbook;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.network.AdminBook.PacketAdminBookClient;
import train.common.library.track.TrackCellResolver;
import train.common.items.ItemAbstractRollingStock;
import train.common.library.Info;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

/**
 * <h1>Key Item</h1>
 * the key used to allow people other than the owner to interact with a locked train or rollingstock.
 * @author Eternal Blue Flame
 */
public class ItemAdminBook extends Item {
    private static final String TAG_LOADED_RESTORE_PATH = "tcAdminBookRestorePath";

    public ItemAdminBook(){
        setCreativeTab(Traincraft.tcTab);
        setUnlocalizedName("adminbook");
    }

    /**
     * <h2>Description text</h2>
     * Allows items to add custom lines of information to the mouseover description, by adding new lines to stringList.
     * Each string added defines a new line.
     * We can cover the key and ticket description here, to simplify other classes.
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack thisStack, EntityPlayer player, List stringList, boolean p_77624_4_) {
        stringList.add("This book is for Operators ONLY, and allows the following:");
        stringList.add("- drop trains/rollingstock and their inventory lost during a crash");
        stringList.add("- Lock or unlock trains/rollingstock");
        String restorePath = getLoadedRestorePath(thisStack);
        if (restorePath.length() > 0) {
            stringList.add("Loaded restore: " + restorePath.substring(restorePath.lastIndexOf("/") + 1));
            stringList.add("Right-click valid track to restore it.");
        }
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        try {
            if (world.isRemote) {
                return stack;
            } else if (!player.canCommandSenderUseCommand(2, "")) {
                return stack;
            }

            PacketAdminBookClient.Handler.sendAdminBookPage(player.getEntityId(), "");
            return stack;
        } catch (Exception e){
            e.printStackTrace();
        }
        return super.onItemRightClick(stack, world, player);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        String restorePath = getLoadedRestorePath(stack);
        if (restorePath.length() == 0) {
            return false;
        }
        if (world.isRemote) {
            return true;
        }
        if (player == null || !player.canCommandSenderUseCommand(2, "")) {
            return false;
        }
        if (!isRailPlacementTarget(world, x, y, z)) {
            player.addChatMessage(new ChatComponentText("Loaded restore kept. Right-click a valid track to place it."));
            return false;
        }

        File backupFile = ServerLogger.getAdminBookBackupFile(restorePath);
        if (backupFile == null || !backupFile.exists() || !backupFile.isFile()) {
            clearLoadedRestore(stack);
            player.addChatMessage(new ChatComponentText("The loaded rolling stock backup no longer exists."));
            return false;
        }

        List<ItemStack> restoreItems;
        try {
            restoreItems = ServerLogger.getItems(new String(Files.readAllBytes(backupFile.toPath()), "UTF-8"));
        } catch (Exception e) {
            clearLoadedRestore(stack);
            player.addChatMessage(new ChatComponentText("Could not read the loaded rolling stock backup."));
            return false;
        }

        if (restoreItems.isEmpty() || restoreItems.get(0) == null || !(restoreItems.get(0).getItem() instanceof ItemAbstractRollingStock)) {
            clearLoadedRestore(stack);
            player.addChatMessage(new ChatComponentText("The loaded backup does not contain a valid rolling stock item."));
            return false;
        }

        ItemStack cartStack = restoreItems.get(0).copy();
        cartStack.stackSize = 1;
        EntityMinecart placed = ((ItemAbstractRollingStock) cartStack.getItem()).placeCart(player, cartStack, world, x, y, z);
        if (!(placed instanceof EntityRollingStock) || placed.isDead) {
            player.addChatMessage(new ChatComponentText("Loaded restore kept. The rolling stock could not be placed there."));
            return false;
        }

        EntityRollingStock stock = (EntityRollingStock) placed;
        restoreOwnerFromCartTag(cartStack, stock);
        int overflow = restoreInventoryContents(stock, restoreItems);
        clearLoadedRestore(stack);
        player.addChatMessage(new ChatComponentText("Restored rolling stock from admin book backup." + (overflow > 0 ? " Dropped " + overflow + " overflow stack(s)." : "")));
        return true;
    }

    public static String getLoadedRestorePath(ItemStack stack) {
        if (stack == null || !stack.hasTagCompound()) {
            return "";
        }
        return stack.getTagCompound().getString(TAG_LOADED_RESTORE_PATH);
    }

    public static void setLoadedRestorePath(ItemStack stack, String path) {
        if (stack == null) {
            return;
        }
        NBTTagCompound tag = stack.getTagCompound();
        if (tag == null) {
            tag = new NBTTagCompound();
            stack.setTagCompound(tag);
        }
        tag.setString(TAG_LOADED_RESTORE_PATH, path == null ? "" : path);
    }

    public static void clearLoadedRestore(ItemStack stack) {
        if (stack != null && stack.hasTagCompound()) {
            stack.getTagCompound().removeTag(TAG_LOADED_RESTORE_PATH);
        }
    }

    /**
     * Tests whether a world cell can serve as a rail placement target.
     *
     * @param world world containing the candidate cell
     * @param x candidate X coordinate
     * @param y candidate Y coordinate
     * @param z candidate Z coordinate
     * @return whether the cell is replaceable or contains a supported embedded host
     */
    private boolean isRailPlacementTarget(World world, int x, int y, int z) {
        return TrackCellResolver.isRailBlockAt(world, x, y, z);
    }

    private void restoreOwnerFromCartTag(ItemStack cartStack, EntityRollingStock stock) {
        if (cartStack != null && cartStack.hasTagCompound() && cartStack.getTagCompound().hasKey("theOwner")) {
            String owner = cartStack.getTagCompound().getString("theOwner");
            if (owner != null && owner.length() > 0) {
                stock.trainOwner = owner;
                stock.setInformation(stock.trainType, stock.trainOwner, stock.trainCreator, stock.trainName, stock.uniqueID);
            }
        }
    }

    private int restoreInventoryContents(EntityRollingStock stock, List<ItemStack> restoreItems) {
        int overflow = 0;
        if (!(stock instanceof IInventory)) {
            for (int i = 1; i < restoreItems.size(); i++) {
                if (dropOverflow(stock, restoreItems.get(i))) {
                    overflow++;
                }
            }
            return overflow;
        }

        IInventory inventory = (IInventory) stock;
        int slot = 0;
        for (int i = 1; i < restoreItems.size(); i++) {
            ItemStack remaining = restoreItems.get(i) == null ? null : restoreItems.get(i).copy();
            while (remaining != null && remaining.stackSize > 0) {
                while (slot < inventory.getSizeInventory() && inventory.getStackInSlot(slot) != null) {
                    slot++;
                }
                if (slot >= inventory.getSizeInventory()) {
                    if (dropOverflow(stock, remaining)) {
                        overflow++;
                    }
                    remaining = null;
                } else {
                    int amount = Math.min(remaining.stackSize, Math.min(inventory.getInventoryStackLimit(), remaining.getMaxStackSize()));
                    ItemStack inserted = remaining.copy();
                    inserted.stackSize = amount;
                    inventory.setInventorySlotContents(slot, inserted);
                    remaining.stackSize -= amount;
                    slot++;
                }
            }
        }
        inventory.markDirty();
        return overflow;
    }

    private boolean dropOverflow(EntityRollingStock stock, ItemStack stack) {
        if (stack == null || stack.getItem() == null || stack.stackSize <= 0) {
            return false;
        }
        ItemStack drop = stack.copy();
        EntityItem entityitem = new EntityItem(stock.worldObj, stock.posX, stock.posY + 1, stock.posZ, drop);
        entityitem.delayBeforeCanPickup = 20;
        stock.worldObj.spawnEntityInWorld(entityitem);
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":parts/item_book_black");
    }
}
