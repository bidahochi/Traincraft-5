package train.client.render.embedded;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Presents one captured host block to vanilla RenderBlocks while delegating other block, metadata, tile, and solidity
 * queries to the real world. An optional render-pass light override instead redirects every packed-light query to one
 * fixed sample in the host column. True embedded rails need this because the
 * world coordinate now contains the rail/gag tile, but icon, metadata, tint,
 * and side-solid lookups must behave as if the replaced host block were still
 * there for this render pass.
 */
public final class CapturedHostBlockAccess implements IBlockAccess
{
	private final World world;
	private final int hostX;
	private final int hostY;
	private final int hostZ;
	private final Block hostBlock;
	private final int hostMetadata;
	private final int hostLightSampleY;

	/**
	 * Creates a block-access view that substitutes one captured host coordinate.
	 *
	 * @param world real client world used for all other coordinates
	 * @param hostX substituted host X coordinate
	 * @param hostY substituted host Y coordinate
	 * @param hostZ substituted host Z coordinate
	 * @param hostBlock captured block returned at the host coordinate
	 * @param hostMetadata captured metadata returned at the host coordinate
	 */
	public CapturedHostBlockAccess(World world, int hostX, int hostY, int hostZ, Block hostBlock, int hostMetadata)
	{
		this(world, hostX, hostY, hostZ, hostBlock, hostMetadata, hostY);
	}

	/**
	 * Creates a block-access view with one light sample for the complete substituted-host render pass. Vanilla's block
	 * renderer samples neighboring coordinates for vertical faces, so overriding only the host coordinate would leave
	 * those faces lit by the replacement block instead of the captured material.
	 *
	 * @param world real client world used for all other coordinates
	 * @param hostX substituted host X coordinate
	 * @param hostY substituted host Y coordinate
	 * @param hostZ substituted host Z coordinate
	 * @param hostBlock captured block returned at the host coordinate
	 * @param hostMetadata captured metadata returned at the host coordinate
	 * @param hostLightSampleY world Y coordinate used to light the substituted host
	 */
	public CapturedHostBlockAccess(World world, int hostX, int hostY, int hostZ,
			Block hostBlock, int hostMetadata, int hostLightSampleY)
	{
		this.world = world;
		this.hostX = hostX;
		this.hostY = hostY;
		this.hostZ = hostZ;
		this.hostBlock = hostBlock;
		this.hostMetadata = hostMetadata;
		this.hostLightSampleY = hostLightSampleY;
	}

	/**
	 * Returns the captured host at its substituted coordinate or the real world block elsewhere.
	 *
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @return block visible through this access view
	 */
	@Override
	public Block getBlock(int x, int y, int z)
	{
		return isHostPosition(x, y, z) ? hostBlock : world.getBlock(x, y, z);
	}

	/**
	 * Returns no tile entity for the captured host and delegates other coordinates to the world.
	 *
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @return tile entity outside the host coordinate, or {@code null} at the host
	 */
	@Override
	public TileEntity getTileEntity(int x, int y, int z)
	{
		return isHostPosition(x, y, z) ? null : world.getTileEntity(x, y, z);
	}

	/**
	 * Samples packed light from the real world. When an alternate host sample Y was configured, the supplied coordinates
	 * are intentionally ignored and every query uses the fixed host X/Z and alternate Y for this render pass.
	 *
	 * @param x sampled X coordinate, ignored when an alternate host sample Y is active
	 * @param y sampled Y coordinate, ignored when an alternate host sample Y is active
	 * @param z sampled Z coordinate, ignored when an alternate host sample Y is active
	 * @param minBlockLight minimum block-light lane value
	 * @return packed sky and block light
	 */
	@Override
	public int getLightBrightnessForSkyBlocks(int x, int y, int z, int minBlockLight)
	{
		if (hostLightSampleY != hostY)
		{
			return world.getLightBrightnessForSkyBlocks(hostX, hostLightSampleY, hostZ, minBlockLight);
		}
		return world.getLightBrightnessForSkyBlocks(x, y, z, minBlockLight);
	}

	/**
	 * Returns captured metadata at the substituted coordinate or real metadata elsewhere.
	 *
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @return metadata visible through this access view
	 */
	@Override
	public int getBlockMetadata(int x, int y, int z)
	{
		return isHostPosition(x, y, z) ? hostMetadata : world.getBlockMetadata(x, y, z);
	}

	/**
	 * Delegates redstone power queries to the real world.
	 *
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @param side queried block side
	 * @return provided redstone power level
	 */
	@Override
	public int isBlockProvidingPowerTo(int x, int y, int z, int side)
	{
		return world.isBlockProvidingPowerTo(x, y, z, side);
	}

	/**
	 * Treats the substituted host as non-air and delegates other coordinates.
	 *
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @return whether the visible block is air
	 */
	@Override
	public boolean isAirBlock(int x, int y, int z)
	{
		return isHostPosition(x, y, z) ? false : world.isAirBlock(x, y, z);
	}

	/**
	 * Returns the real-world biome at horizontal coordinates.
	 *
	 * @param x queried X coordinate
	 * @param z queried Z coordinate
	 * @return biome used for captured-host tinting
	 */
	@Override
	public BiomeGenBase getBiomeGenForCoords(int x, int z)
	{
		return world.getBiomeGenForCoords(x, z);
	}

	/**
	 * Returns the real world's build height.
	 *
	 * @return world height in blocks
	 */
	@Override
	public int getHeight()
	{
		return world.getHeight();
	}

	/**
	 * Reports that this world-backed view does not use extended chunk-cache levels.
	 *
	 * @return always {@code false}
	 */
	@Override
	public boolean extendedLevelsInChunkCache()
	{
		return false;
	}

	/**
	 * Queries side solidity using the captured host at its substituted coordinate.
	 *
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @param side queried side
	 * @param defaultValue fallback value used by the real world
	 * @return whether the visible block side is solid
	 */
	@Override
	public boolean isSideSolid(int x, int y, int z, ForgeDirection side, boolean defaultValue)
	{
		if (isHostPosition(x, y, z))
		{
			return hostBlock.isSideSolid(this, x, y, z, side);
		}
		return world.isSideSolid(x, y, z, side, defaultValue);
	}

	/**
	 * Returns whether coordinates identify the substituted host cell.
	 *
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @return whether all coordinates match the captured host
	 */
	private boolean isHostPosition(int x, int y, int z)
	{
		return x == hostX && y == hostY && z == hostZ;
	}
}
