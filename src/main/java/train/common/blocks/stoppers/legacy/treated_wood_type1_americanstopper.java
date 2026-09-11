package train.common.blocks.stoppers.legacy;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockAmericanStopper;
import train.common.library.track.TrackItemIDs;
import train.common.tile.tileStopper.legacy.wood_type1.TileWoodType1_AmericanStopper;

import java.util.ArrayList;

public class treated_wood_type1_americanstopper extends BlockAmericanStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileWoodType1_AmericanStopper(meta);
    }

	/** Returns the treated-wood 1x1 track and original American buffer. */
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		return getDeprecatedDrops(TrackItemIDs.tcRail_WOOD_TYPE1_SmallStraight.item);
	}
}
