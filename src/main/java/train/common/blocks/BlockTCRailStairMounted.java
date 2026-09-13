package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

/** Hidden parent block for supported tracks mounted on captured stairs with a complete top face. */
public final class BlockTCRailStairMounted extends BlockTCRailEmbedded
{
	/** {@inheritDoc} */
	@Override
	public int getLightOpacity(IBlockAccess world, int x, int y, int z)
	{
		return TrackHostBlockSupport.getLightOpacity(true);
	}

	/** {@inheritDoc} */
	@Override
	@SideOnly(Side.CLIENT)
	public float getAmbientOcclusionLightValue()
	{
		return TrackHostBlockSupport.getSlabNeighborAmbientOcclusionLightValue();
	}
}
