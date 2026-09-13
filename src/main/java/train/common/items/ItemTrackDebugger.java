package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import train.common.library.Info;
import train.common.library.track.TrackCellResolver;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.List;

public class ItemTrackDebugger extends Item
{
    public ItemTrackDebugger() {
        super();
        maxStackSize = 1;
        setCreativeTab(null);
    }

    /**
     * Inspects the clicked rail cell and reports its resolved parent and placement state.
     *
     * @param itemstack held debugger stack
     * @param player using player
     * @param world target world
     * @param x clicked X coordinate
     * @param y clicked Y coordinate
     * @param z clicked Z coordinate
     * @param par7 clicked side
     * @param par8 hit X within the block
     * @param par9 hit Y within the block
     * @param par10 hit Z within the block
     * @return whether the click was handled
     */
    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {



        if (!world.isRemote) {

            //if (!(player.canCommandSenderUseCommand(2, "") && player.capabilities.isCreativeMode)){
            //    player.addChatMessage(new ChatComponentText("You are not allowed to to that!"));
            //    return false;
            //}

            Block block = world.getBlock(x, y, z);
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            if (TrackCellResolver.isTraincraftRailBlock(block)
                    && TrackCellResolver.isTraincraftGagBlock(block) == false){
                TileTCRail tile = TrackCellResolver.resolveParent(world, x, y, z);

                if (tile == null) {
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Traincraft rail has no resolvable parent tile"));
                    return false;
                }
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "TileTCRail"));
                player.addChatMessage(new ChatComponentText( EnumChatFormatting.GOLD + "Name: " +  EnumChatFormatting.WHITE + tile.getType() + EnumChatFormatting.GOLD + " ItemID " + EnumChatFormatting.WHITE + (tile.getTrackTypeByLabel() == null ? "NULL" : tile.getTrackTypeByLabel().getItem())));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "x: "    +  EnumChatFormatting.WHITE +  tile.xCoord + EnumChatFormatting.GOLD +  " y: " +  EnumChatFormatting.WHITE +tile.yCoord +  EnumChatFormatting.GOLD + " z: "+  EnumChatFormatting.WHITE + tile.zCoord));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Meta: " +  EnumChatFormatting.WHITE + tile.getBlockMetadata()));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Exit dir: " + EnumChatFormatting.WHITE + tile.exitDirection));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "cx: "   +  EnumChatFormatting.WHITE + tile.cx  + EnumChatFormatting.GOLD + " cy: "+ EnumChatFormatting.WHITE + tile.cy  + EnumChatFormatting.GOLD + " cz: " + EnumChatFormatting.WHITE + tile.cz));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "r: " + EnumChatFormatting.WHITE + tile.r));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "SwitchState: " + EnumChatFormatting.WHITE + tile.getSwitchState() + EnumChatFormatting.GOLD + " ManualOverride: " +  EnumChatFormatting.GOLD + " SwitchSize: " + EnumChatFormatting.WHITE + tile.getType()));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "LinkedX: "    +  EnumChatFormatting.WHITE +  tile.linkedX + EnumChatFormatting.GOLD +  " LinkedY: " +  EnumChatFormatting.WHITE +tile.linkedY +  EnumChatFormatting.GOLD + " LinkedZ: "+  EnumChatFormatting.WHITE + tile.linkedZ));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "SlopeLength: "    +  EnumChatFormatting.WHITE +  tile.slopeLength + EnumChatFormatting.GOLD +  " SlopeHeight: " +  EnumChatFormatting.WHITE +  EnumChatFormatting.GOLD + " SlopeAngle: "+  EnumChatFormatting.WHITE + tile.slopeAngle));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "BallastMaterial: "    +  EnumChatFormatting.WHITE +  Block.getBlockById(tile.getBallastMaterial()).getLocalizedName() + EnumChatFormatting.GOLD +  " BallastMetadata: " +  EnumChatFormatting.WHITE +tile.ballastMetadata +  EnumChatFormatting.GOLD + " BallastColour: "+  EnumChatFormatting.WHITE + tile.ballastColour));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Number of paired detectors: "    +  EnumChatFormatting.WHITE +  tile.getPairedDetectors().size()));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Track Owner: " + EnumChatFormatting.WHITE + tile.getOwnerUUID()));
                player.addChatMessage(new ChatComponentText(" "));
            }
            else if (TrackCellResolver.isTraincraftGagBlock(block)){
                TileTCRailGag tile = tileEntity instanceof TileTCRailGag ? (TileTCRailGag) tileEntity : null;
                if (tile != null) {
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "TileTCGag"));
                    player.addChatMessage(new ChatComponentText( EnumChatFormatting.GOLD + "Name: " +  EnumChatFormatting.WHITE + tile.type));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "x: "    +  EnumChatFormatting.WHITE +  tile.xCoord + EnumChatFormatting.GOLD +  " y: " +  EnumChatFormatting.WHITE + tile.yCoord +  EnumChatFormatting.GOLD + " z: "+  EnumChatFormatting.WHITE + tile.zCoord));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Meta: " +  EnumChatFormatting.WHITE + tile.getBlockMetadata()));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "OriginX: "    +  EnumChatFormatting.WHITE +  tile.originX + EnumChatFormatting.GOLD +  " OriginY: " +  EnumChatFormatting.WHITE + tile.originY +  EnumChatFormatting.GOLD + " OriginZ: "+  EnumChatFormatting.WHITE + tile.originZ));
                    player.addChatMessage(new ChatComponentText(" "));

                }
            }

            else if (BlockRailBase.func_150051_a(block)) {
                TileEntity tile = world.getTileEntity(x, y, z);
                if (tile == null) {
                    return false;
                }


                player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "BlockRailBase"));

            }
            else {
                player.addChatMessage(new ChatComponentText("Not a rail"));
                return false;
            }





        }



        return super.onItemUse(itemstack, player, world, x, y, z, par7, par8, par9, par10);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":item_track_debugger");
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77Inspects track tile data");
		par3List.add("\u00a77Hold and aim at track to show its attachment path");
    }
}
