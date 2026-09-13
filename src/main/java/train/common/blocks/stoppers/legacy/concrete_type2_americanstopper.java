package train.common.blocks.stoppers.legacy;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockAmericanStopper;
import train.common.library.track.TrackItemIDs;
import train.common.tile.tileStopper.legacy.concrete_type2.TileConcreteType2_AmericanStopper;

import java.util.ArrayList;

public class concrete_type2_americanstopper extends BlockAmericanStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileConcreteType2_AmericanStopper(meta);
    }

	/** Returns the Concrete Type 2 1x1 track and original American buffer. */
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		return getDeprecatedDrops(TrackItemIDs.tcRail_CONCRETE_TYPE2_SmallStraight.item);
	}
}
