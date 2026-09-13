package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

/**
 * Hidden block used only by true embedded parent rail cells.
 *
 * Surface rails and true embedded rails cannot share every static block-render property in Minecraft 1.7. This
 * embedded-only ID retains the true embedded placement identity and reports the same static ambient-occlusion
 * inputs as ordinary opaque terrain so neighboring vanilla faces choose matching corner-light samples.
 */
public class BlockTCRailEmbedded extends BlockTCRail
{
	/**
	 * Reports full captured-host opacity even before the placement transaction attaches its captured block data. The
	 * dedicated full-host block ID makes that shape unambiguous and lets vanilla update lighting correctly during the
	 * original block replacement instead of requiring a second relight pass over the completed footprint.
	 *
	 * @param world block-access view containing the embedded rail; it may not yet expose captured-host tile data
	 * @param x embedded rail world X coordinate
	 * @param y embedded rail world Y coordinate
	 * @param z embedded rail world Z coordinate
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
