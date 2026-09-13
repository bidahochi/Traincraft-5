package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

/** Hidden gag block for any supported track mounted on captured lower-half slabs. */
public final class BlockTCRailGagSlabMounted extends BlockTCRailGagEmbedded
{
	/**
	 * Reports single-slab opacity before and after this gag receives its parent link. The slab-specific block ID lets
	 * vanilla preserve the final lighting during the initial replacement without a later footprint-wide relight.
	 *
	 * @param world block-access view containing the slab-mounted gag cell
	 * @param x slab-mounted gag world X coordinate
	 * @param y slab-mounted gag world Y coordinate
	 * @param z slab-mounted gag world Z coordinate
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
