package train.common.blocks.stoppers.legacy;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockAmericanStopper;
import train.common.library.track.TrackItemIDs;
import train.common.tile.tileStopper.legacy.wood_type2.TileWoodType2_AmericanStopper;

import java.util.ArrayList;

public class wood_type2_americanstopper extends BlockAmericanStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileWoodType2_AmericanStopper(meta);
    }

	/** Returns the spruce-wood 1x1 track and original American buffer. */
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		return getDeprecatedDrops(TrackItemIDs.tcRail_WOOD_TYPE2_SmallStraight.item);
	}
}
