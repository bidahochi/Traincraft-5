package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

/**
 * Hidden block used only by true embedded gag cells.
 *
 * It keeps the normal gag block's tile, collision, cleanup, and light-opacity behavior while reporting the same
 * static ambient-occlusion inputs as ordinary opaque terrain to neighboring vanilla block renders.
 */
public class BlockTCRailGagEmbedded extends BlockTCRailGag
{
	/**
	 * Reports full captured-host opacity even before the placement transaction links this gag to its parent. The
	 * dedicated full-host block ID lets vanilla calculate the final lighting during the initial replacement.
	 *
	 * @param world block-access view containing the embedded gag; its parent link may not yet be initialized
	 * @param x embedded gag world X coordinate
	 * @param y embedded gag world Y coordinate
	 * @param z embedded gag world Z coordinate
	 * @return full-block light opacity
	 */
	@Override
	public int getLightOpacity(IBlockAccess world, int x, int y, int z)
	{
		return TrackHostBlockSupport.getLightOpacity(false);
	}

	/**
	 * Matches the ambient-light multiplier used by ordinary opaque host blocks.
	 *
	 * @return the full-host ambient-light multiplier
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public float getAmbientOcclusionLightValue()
	{
		return TrackHostBlockSupport.getNeighborAmbientOcclusionLightValue();
	}

	/**
	 * Matches the corner-light sampling flag used by ordinary opaque host blocks.
	 *
	 * @return the opaque-terrain grass-blocking flag
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public boolean getCanBlockGrass()
	{
		return TrackHostBlockSupport.getCanBlockGrass();
	}
}
