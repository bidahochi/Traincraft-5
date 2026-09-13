package train.common.blocks.stoppers.legacy;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockAmericanStopper;
import train.common.library.track.TrackItemIDs;
import train.common.tile.tileStopper.legacy.concrete_type1.TileConcreteType1_AmericanStopper;

import java.util.ArrayList;

public class concrete_type1_americanstopper extends BlockAmericanStopper
{


    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileConcreteType1_AmericanStopper(meta);
    }

	/** Returns the Concrete Type 1 1x1 track and original American buffer. */
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		return getDeprecatedDrops(TrackItemIDs.tcRail_CONCRETE_TYPE1_SmallStraight.item);
	}
}
