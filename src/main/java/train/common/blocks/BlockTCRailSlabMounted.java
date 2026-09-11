package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

/** Hidden parent block for any supported track mounted on captured lower-half slabs. */
public final class BlockTCRailSlabMounted extends BlockTCRailEmbedded
{
	/**
	 * Reports single-slab opacity before and after captured-host data is attached. The slab-specific block ID provides
	 * the shape during placement, so vanilla can preserve surrounding light without a post-placement relight sweep.
	 *
	 * @param world block-access view containing the slab-mounted rail
	 * @param x slab-mounted rail world X coordinate
	 * @param y slab-mounted rail world Y coordinate
	 * @param z slab-mounted rail world Z coordinate
	 * @return non-opaque single-slab light opacity
	 */
	@Override
	public int getLightOpacity(IBlockAccess world, int x, int y, int z)
	{
		return TrackHostBlockSupport.getLightOpacity(true);
	}

	/**
	 * Matches the ambient-light multiplier used by an ordinary non-opaque slab.
	 *
	 * @return the single-slab ambient-light multiplier
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public float getAmbientOcclusionLightValue()
	{
		return TrackHostBlockSupport.getSlabNeighborAmbientOcclusionLightValue();
	}
}
