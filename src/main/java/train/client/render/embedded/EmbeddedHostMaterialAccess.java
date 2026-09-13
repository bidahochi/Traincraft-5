package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.BlockVine;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.common.library.track.TrackHostConstants;

/**
 * Resolves icons and biome tint as if the captured host block still occupied the rail cell.
 *
 * <p>World coordinates point at a rail or gag block, so material queries combine the surrounding world with captured
 * block identity and metadata. Builders should use this layer instead of querying the replacement rail for an icon or
 * tint.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedHostMaterialAccess
{
	/** Creates no instances; captured-material access is stateless. */
	private EmbeddedHostMaterialAccess()
	{
	}

	/**
	 * Resolves a captured host's icon as if it still occupied the rail cell.
	 *
	 * @param rail rail tile defining the host-map origin
	 * @param host captured host entry
	 * @param block captured block type
	 * @param side requested block side
	 * @return icon selected by the captured block and metadata
	 */
	public static IIcon getIcon(TileTCRail rail, TileTCRailHostData.CapturedHostBlock host, Block block, int side)
	{
		World world = rail.getWorldObj();
		if (world == null)
		{
			return block.getIcon(side, host.metadata);
		}
		int x = rail.xCoord + host.offsetX;
		int y = rail.yCoord + host.offsetY;
		int z = rail.zCoord + host.offsetZ;
		return block.getIcon(new CapturedHostBlockAccess(world, x, y, z, block, host.metadata), x, y, z, side);
	}

	/**
	 * Returns a normalized captured-host tint: supported biome-tinted blocks sample the world when available or use the
	 * saved tint otherwise, while unsupported blocks and zero-valued tints resolve to opaque white.
	 *
	 * @param rail rail tile defining the host-map origin
	 * @param block captured block type
	 * @param metadata captured block metadata
	 * @param offsetX rail-relative host X offset
	 * @param offsetY rail-relative host Y offset
	 * @param offsetZ rail-relative host Z offset
	 * @param capturedTint saved fallback tint
	 * @return normalized RGB tint for the captured material
	 */
	public static int getTint(TileTCRail rail, Block block, int metadata, int offsetX, int offsetY, int offsetZ, int capturedTint)
	{
		if (usesBiomeTint(block) == false)
		{
			return TrackHostConstants.DEFAULT_HOST_TINT;
		}
		World world = rail.getWorldObj();
		if (world == null)
		{
			return normalize(capturedTint);
		}
		int x = rail.xCoord + offsetX;
		int y = rail.yCoord + offsetY;
		int z = rail.zCoord + offsetZ;
		IBlockAccess capturedAccess = new CapturedHostBlockAccess(world, x, y, z, block, metadata);
		return normalize(block.colorMultiplier(capturedAccess, x, y, z));
	}

	/**
	 * Replaces a missing zero tint with opaque white.
	 *
	 * @param tint captured or computed RGB tint
	 * @return usable RGB tint
	 */
	private static int normalize(int tint)
	{
		return tint == 0 ? TrackHostConstants.DEFAULT_HOST_TINT : tint;
	}

	/**
	 * Returns whether a captured block belongs to the supported vanilla set whose tint is sampled from the world.
	 *
	 * @param block captured block type
	 * @return whether this supported vanilla block requires a world color-multiplier query
	 */
	private static boolean usesBiomeTint(Block block)
	{
		return block instanceof BlockGrass
				|| block instanceof BlockLeavesBase
				|| block instanceof BlockVine
				|| block == Blocks.tallgrass
				|| block == Blocks.double_plant
				|| block == Blocks.waterlily
				|| block == Blocks.reeds;
	}
}
