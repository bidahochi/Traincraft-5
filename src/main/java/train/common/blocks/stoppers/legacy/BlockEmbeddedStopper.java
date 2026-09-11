package train.common.blocks.stoppers.legacy;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockStopper;
import train.common.library.track.TrackItemIDs;
import train.common.tile.tileStopper.legacy.sleeperless.TileEmbeddedGenericStopper;

import java.util.ArrayList;

public class BlockEmbeddedStopper extends BlockStopper
{
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEmbeddedGenericStopper(meta);
    }

	/** Returns the sleeperless 1x1 track and original generic buffer. */
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		return getDeprecatedDrops(TrackItemIDs.tcRailEmbeddedSmallStraight.item);
	}
}
