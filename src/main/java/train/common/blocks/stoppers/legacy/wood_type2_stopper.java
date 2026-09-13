package train.common.blocks.stoppers.legacy;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockStopper;
import train.common.library.track.TrackItemIDs;
import train.common.tile.tileStopper.legacy.wood_type2.TileWoodType2_Generic_Stopper;

import java.util.ArrayList;

public class wood_type2_stopper extends BlockStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileWoodType2_Generic_Stopper(meta);
    }

	/** Returns the spruce-wood 1x1 track and original generic buffer. */
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		return getDeprecatedDrops(TrackItemIDs.tcRail_WOOD_TYPE2_SmallStraight.item);
	}
}

