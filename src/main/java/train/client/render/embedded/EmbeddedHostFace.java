package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import train.common.tile.TileTCRailHostData;

/**
 * One cuboid face or custom four-vertex face in a cached embedded-host mesh.
 *
 * <p>Coordinates are local to the captured host block. The block offset is already rebased to the visible render
 * source. Geometry and material identity remain fixed, while prepared tint, brightness, ambient occlusion, and pillar
 * orientation are refreshed when cached appearance or lighting inputs change.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedHostFace
{
	private final int offsetX;
	private final int offsetY;
	private final int offsetZ;
	private final int colour;
	private final Block block;
	private final int metadata;
	private final IIcon icon;
	private final int side;
	private final int normalX;
	private final int normalY;
	private final int normalZ;
	private final float directionalShade;
	private final FaceKind kind;
	private final CuboidBounds cuboidBounds;
	private final QuadVertices quadVertices;
	private final QuadTextureCoordinates quadTextureCoordinates;
	private int cachedTint = -1;
	private float cachedAlpha = 1.0F;
	private int cachedFaceBrightness;
	private int[] cachedVertexBrightness = new int[0];
	private float[] cachedVertexAmbientOcclusion = new float[0];
	private int cachedPillarAxis;
	private boolean virtualTrenchWall;
	private boolean topAnchoredSideTexture;

	/**
	 * Creates a face from one host block whose offsets are already relative to the visible render source.
	 *
	 * @param hostBlock captured host material and visible-source-relative block offset
	 * @param block captured Minecraft block
	 * @param icon captured icon selected for this side
	 * @param side Minecraft side or custom-face marker
	 * @param normalX outward X normal component
	 * @param normalY outward Y normal component
	 * @param normalZ outward Z normal component
	 * @param directionalShade vanilla-style face shade multiplier
	 * @param kind cuboid or custom-quad storage form
	 * @param cuboidBounds local bounds, or {@code null} for a custom quad
	 * @param quadVertices custom vertices, or {@code null} for a cuboid
	 * @param quadTextureCoordinates explicit custom-quad texture coordinates, or {@code null} for projected mapping
	 */
	private EmbeddedHostFace(TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			int side, int normalX, int normalY, int normalZ, float directionalShade,
			FaceKind kind, CuboidBounds cuboidBounds, QuadVertices quadVertices,
			QuadTextureCoordinates quadTextureCoordinates)
	{
		this.offsetX = hostBlock.offsetX;
		this.offsetY = hostBlock.offsetY;
		this.offsetZ = hostBlock.offsetZ;
		this.colour = hostBlock.colour;
		this.block = block;
		this.metadata = hostBlock.metadata;
		this.icon = icon;
		this.side = side;
		this.normalX = normalX;
		this.normalY = normalY;
		this.normalZ = normalZ;
		this.directionalShade = directionalShade;
		this.kind = kind;
		this.cuboidBounds = cuboidBounds;
		this.quadVertices = quadVertices;
		this.quadTextureCoordinates = quadTextureCoordinates;
	}

	/**
	 * Creates one axis-aligned face with named local bounds.
	 *
	 * @param hostBlock captured host material and visible-source-relative offset
	 * @param block captured Minecraft block
	 * @param icon captured icon for the selected side
	 * @param side Minecraft block side
	 * @param normalX outward X normal component
	 * @param normalY outward Y normal component
	 * @param normalZ outward Z normal component
	 * @param directionalShade vanilla-style face shade multiplier
	 * @param bounds face bounds in host-local block coordinates
	 * @return prepared cuboid face awaiting cached appearance data
	 */
	public static EmbeddedHostFace cuboid(TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, IIcon icon, int side, int normalX, int normalY, int normalZ,
			float directionalShade, CuboidBounds bounds)
	{
		return new EmbeddedHostFace(hostBlock, block, icon, side, normalX, normalY, normalZ,
				directionalShade, FaceKind.CUBOID, bounds, null, null);
	}

	/**
	 * Creates one custom face with vertices stored in submission order.
	 *
	 * @param hostBlock captured host material and visible-source-relative offset
	 * @param block captured Minecraft block
	 * @param icon captured icon for the face
	 * @param side Minecraft side or custom-face marker
	 * @param normalX outward X normal component
	 * @param normalY outward Y normal component
	 * @param normalZ outward Z normal component
	 * @param directionalShade vanilla-style face shade multiplier
	 * @param vertices face vertices in tessellator submission order
	 * @return prepared custom face awaiting cached appearance data
	 */
	public static EmbeddedHostFace quad(TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, IIcon icon, int side, int normalX, int normalY, int normalZ,
			float directionalShade, QuadVertices vertices)
	{
		return new EmbeddedHostFace(hostBlock, block, icon, side, normalX, normalY, normalZ,
				directionalShade, FaceKind.QUAD, null, vertices, null);
	}

	/**
	 * Creates one custom face whose icon coordinates are supplied explicitly in tessellator submission order.
	 *
	 * @param hostBlock captured host material and visible-source-relative offset
	 * @param block captured Minecraft block
	 * @param icon captured icon for the face
	 * @param side Minecraft side or custom-face marker
	 * @param normalX outward X normal component
	 * @param normalY outward Y normal component
	 * @param normalZ outward Z normal component
	 * @param directionalShade vanilla-style face shade multiplier
	 * @param vertices face vertices in tessellator submission order
	 * @param textureCoordinates icon-local texture coordinates in matching submission order
	 * @return prepared explicitly textured custom face awaiting cached appearance data
	 */
	public static EmbeddedHostFace texturedQuad(TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, IIcon icon, int side, int normalX, int normalY, int normalZ,
			float directionalShade, QuadVertices vertices, QuadTextureCoordinates textureCoordinates)
	{
		return new EmbeddedHostFace(hostBlock, block, icon, side, normalX, normalY, normalZ,
				directionalShade, FaceKind.QUAD, null, vertices, textureCoordinates);
	}

	/**
	 * Returns the host block's X offset from the visible rail tile, in blocks.
	 *
	 * @return visible-source-relative X block offset
	 */
	public int getOffsetX()
	{
		return offsetX;
	}

	/**
	 * Returns the host block's Y offset from the visible rail tile, in blocks.
	 *
	 * @return visible-source-relative Y block offset
	 */
	public int getOffsetY()
	{
		return offsetY;
	}

	/**
	 * Returns the host block's Z offset from the visible rail tile, in blocks.
	 *
	 * @return visible-source-relative Z block offset
	 */
	public int getOffsetZ()
	{
		return offsetZ;
	}

	/**
	 * Returns the captured host color used when a world tint cannot be resolved.
	 *
	 * @return packed RGB fallback color
	 */
	public int getColour()
	{
		return colour;
	}

	/**
	 * Returns the block whose material and texture this face reproduces.
	 *
	 * @return captured Minecraft block
	 */
	public Block getBlock()
	{
		return block;
	}

	/**
	 * Returns the captured metadata for the reproduced block.
	 *
	 * @return captured block metadata
	 */
	public int getMetadata()
	{
		return metadata;
	}

	/**
	 * Returns the icon selected while this face was built.
	 *
	 * @return captured face icon
	 */
	public IIcon getIcon()
	{
		return icon;
	}

	/**
	 * Returns the Minecraft block-side index or the renderer's custom-face marker.
	 *
	 * @return side index or custom-face marker
	 */
	public int getSide()
	{
		return side;
	}

	/**
	 * Returns the X component of the outward face normal.
	 *
	 * @return outward X normal component
	 */
	public int getNormalX()
	{
		return normalX;
	}

	/**
	 * Returns the Y component of the outward face normal.
	 *
	 * @return outward Y normal component
	 */
	public int getNormalY()
	{
		return normalY;
	}

	/**
	 * Returns the Z component of the outward face normal.
	 *
	 * @return outward Z normal component
	 */
	public int getNormalZ()
	{
		return normalZ;
	}

	/**
	 * Returns the vanilla-style directional shade assigned to this face.
	 *
	 * @return directional shade multiplier
	 */
	public float getDirectionalShade()
	{
		return directionalShade;
	}

	/**
	 * Returns whether this face uses four custom vertices instead of cuboid bounds.
	 *
	 * @return whether the custom-quad representation is active
	 */
	public boolean isQuad()
	{
		return kind == FaceKind.QUAD;
	}

	/**
	 * Returns local cuboid bounds, or {@code null} when this is a custom quad.
	 *
	 * @return host-local cuboid bounds or {@code null}
	 */
	public CuboidBounds getCuboidBounds()
	{
		return cuboidBounds;
	}

	/**
	 * Returns custom vertices, or {@code null} when this is a cuboid face.
	 *
	 * @return custom vertices or {@code null}
	 */
	public QuadVertices getQuadVertices()
	{
		return quadVertices;
	}

	/**
	 * Returns explicit icon-local coordinates for this custom quad when projected mapping is disabled.
	 *
	 * @return explicit quad texture coordinates, or {@code null} when the emitter should project the icon
	 */
	public QuadTextureCoordinates getQuadTextureCoordinates()
	{
		return quadTextureCoordinates;
	}

	/**
	 * Returns the RGB tint resolved during cache preparation.
	 *
	 * @return packed RGB tint
	 */
	public int getCachedTint()
	{
		return cachedTint;
	}

	/**
	 * Stores the RGB tint resolved before per-frame rendering begins.
	 *
	 * @param cachedTint packed RGB tint
	 */
	public void setCachedTint(int cachedTint)
	{
		this.cachedTint = cachedTint;
	}

	/**
	 * Returns the alpha multiplier prepared for this face.
	 *
	 * @return alpha multiplier from zero through one
	 */
	public float getCachedAlpha()
	{
		return cachedAlpha;
	}

	/**
	 * Stores the alpha multiplier used by translucent generated previews.
	 *
	 * @param cachedAlpha alpha multiplier from zero through one
	 */
	public void setCachedAlpha(float cachedAlpha)
	{
		this.cachedAlpha = cachedAlpha;
	}

	/**
	 * Returns the packed light value sampled beyond the face.
	 *
	 * @return packed sky-light and block-light value
	 */
	public int getCachedFaceBrightness()
	{
		return cachedFaceBrightness;
	}

	/**
	 * Stores the packed light sampled during cache preparation.
	 *
	 * @param cachedFaceBrightness packed sky-light and block-light value
	 */
	public void setCachedFaceBrightness(int cachedFaceBrightness)
	{
		this.cachedFaceBrightness = cachedFaceBrightness;
	}

	/**
	 * Returns packed light for one vertex in tessellator submission order.
	 *
	 * @param vertexIndex zero-based vertex index in submission order
	 * @return packed sky-light and block-light value
	 */
	public int getCachedVertexBrightness(int vertexIndex)
	{
		return cachedVertexBrightness[vertexIndex];
	}

	/**
	 * Stores an owned copy so callers cannot mutate cached lighting after preparation.
	 *
	 * @param cachedVertexBrightness packed vertex lights in submission order
	 */
	public void setCachedVertexBrightness(int[] cachedVertexBrightness)
	{
		this.cachedVertexBrightness = cachedVertexBrightness.clone();
	}

	/**
	 * Returns the ambient-occlusion color multiplier for one vertex in submission order.
	 *
	 * @param vertexIndex zero-based vertex index in submission order
	 * @return ambient-occlusion multiplier from zero to one
	 */
	public float getCachedVertexAmbientOcclusion(int vertexIndex)
	{
		return cachedVertexAmbientOcclusion[vertexIndex];
	}

	/**
	 * Stores an owned copy of the prepared per-vertex ambient-occlusion multipliers.
	 *
	 * @param cachedVertexAmbientOcclusion per-vertex multipliers in submission order
	 */
	public void setCachedVertexAmbientOcclusion(float[] cachedVertexAmbientOcclusion)
	{
		this.cachedVertexAmbientOcclusion = cachedVertexAmbientOcclusion.clone();
	}

	/**
	 * Returns the captured block's resolved texture axis, or zero when it has none.
	 *
	 * @return vanilla pillar-axis metadata or zero
	 */
	public int getCachedPillarAxis()
	{
		return cachedPillarAxis;
	}

	/**
	 * Stores the texture axis resolved during cache preparation.
	 *
	 * @param cachedPillarAxis vanilla pillar-axis metadata or zero
	 */
	public void setCachedPillarAxis(int cachedPillarAxis)
	{
		this.cachedPillarAxis = cachedPillarAxis;
	}

	/**
	 * Returns whether this face was generated beside the renderer's virtual trench cavity.
	 * The classification is fixed with the mesh so later lighting refreshes cannot reinterpret
	 * a captured-cell boundary as an ordinary exterior face.
	 *
	 * @return whether virtual-cavity lighting applies to this face
	 */
	public boolean isVirtualTrenchWall()
	{
		return virtualTrenchWall;
	}

	/**
	 * Stores the geometry-time virtual-cavity classification for later lighting refreshes.
	 *
	 * @param virtualTrenchWall whether this face borders the virtual trench cavity
	 */
	public void setVirtualTrenchWall(boolean virtualTrenchWall)
	{
		this.virtualTrenchWall = virtualTrenchWall;
	}

	/**
	 * Returns whether this short side face maps its visible height to the topmost portion of the block-side icon.
	 *
	 * @return whether side texture coordinates are anchored to the icon's top edge
	 */
	public boolean isTopAnchoredSideTexture()
	{
		return topAnchoredSideTexture;
	}

	/**
	 * Selects top-anchored side texture mapping for a short face whose geometry represents the exposed top portion of
	 * a block rather than a section beginning at the block's bottom.
	 *
	 * @param topAnchoredSideTexture whether the face should use the icon's topmost vertical portion
	 */
	public void setTopAnchoredSideTexture(boolean topAnchoredSideTexture)
	{
		this.topAnchoredSideTexture = topAnchoredSideTexture;
	}

	private enum FaceKind
	{
		CUBOID,
		QUAD
	}

	/** Axis-aligned face bounds in one host block's local 0..1 coordinate space. */
	public static final class CuboidBounds
	{
		/** Minimum X coordinate within the host cell, in blocks. */
		public final double minX;
		/** Minimum Y coordinate within the host cell, in blocks. */
		public final double minY;
		/** Minimum Z coordinate within the host cell, in blocks. */
		public final double minZ;
		/** Maximum X coordinate within the host cell, in blocks. */
		public final double maxX;
		/** Maximum Y coordinate within the host cell, in blocks. */
		public final double maxY;
		/** Maximum Z coordinate within the host cell, in blocks. */
		public final double maxZ;

		/**
		 * Creates bounds in one host block's local zero-to-one coordinate space.
		 *
		 * @param minX minimum local X coordinate
		 * @param minY minimum local Y coordinate
		 * @param minZ minimum local Z coordinate
		 * @param maxX maximum local X coordinate
		 * @param maxY maximum local Y coordinate
		 * @param maxZ maximum local Z coordinate
		 */
		public CuboidBounds(double minX, double minY, double minZ,
				double maxX, double maxY, double maxZ)
		{
			this.minX = minX;
			this.minY = minY;
			this.minZ = minZ;
			this.maxX = maxX;
			this.maxY = maxY;
			this.maxZ = maxZ;
		}
	}

	/** Four vertices in the exact order submitted to the tessellator. */
	public static final class QuadVertices
	{
		/** First submitted vertex X coordinate within the host cell, in blocks. */
		public final double firstX;
		/** First submitted vertex Y coordinate within the host cell, in blocks. */
		public final double firstY;
		/** First submitted vertex Z coordinate within the host cell, in blocks. */
		public final double firstZ;
		/** Second submitted vertex X coordinate within the host cell, in blocks. */
		public final double secondX;
		/** Second submitted vertex Y coordinate within the host cell, in blocks. */
		public final double secondY;
		/** Second submitted vertex Z coordinate within the host cell, in blocks. */
		public final double secondZ;
		/** Third submitted vertex X coordinate within the host cell, in blocks. */
		public final double thirdX;
		/** Third submitted vertex Y coordinate within the host cell, in blocks. */
		public final double thirdY;
		/** Third submitted vertex Z coordinate within the host cell, in blocks. */
		public final double thirdZ;
		/** Fourth submitted vertex X coordinate within the host cell, in blocks. */
		public final double fourthX;
		/** Fourth submitted vertex Y coordinate within the host cell, in blocks. */
		public final double fourthY;
		/** Fourth submitted vertex Z coordinate within the host cell, in blocks. */
		public final double fourthZ;

		/**
		 * Creates four local vertices in their final tessellator submission order.
		 *
		 * @param firstX first vertex local X coordinate, in blocks
		 * @param firstY first vertex local Y coordinate, in blocks
		 * @param firstZ first vertex local Z coordinate, in blocks
		 * @param secondX second vertex local X coordinate, in blocks
		 * @param secondY second vertex local Y coordinate, in blocks
		 * @param secondZ second vertex local Z coordinate, in blocks
		 * @param thirdX third vertex local X coordinate, in blocks
		 * @param thirdY third vertex local Y coordinate, in blocks
		 * @param thirdZ third vertex local Z coordinate, in blocks
		 * @param fourthX fourth vertex local X coordinate, in blocks
		 * @param fourthY fourth vertex local Y coordinate, in blocks
		 * @param fourthZ fourth vertex local Z coordinate, in blocks
		 */
		public QuadVertices(double firstX, double firstY, double firstZ,
				double secondX, double secondY, double secondZ,
				double thirdX, double thirdY, double thirdZ,
				double fourthX, double fourthY, double fourthZ)
		{
			this.firstX = firstX;
			this.firstY = firstY;
			this.firstZ = firstZ;
			this.secondX = secondX;
			this.secondY = secondY;
			this.secondZ = secondZ;
			this.thirdX = thirdX;
			this.thirdY = thirdY;
			this.thirdZ = thirdZ;
			this.fourthX = fourthX;
			this.fourthY = fourthY;
			this.fourthZ = fourthZ;
		}
	}

	/** Four icon-local UV pairs in the exact order submitted to the tessellator. */
	public static final class QuadTextureCoordinates
	{
		/** First submitted vertex U coordinate within the selected icon. */
		public final double firstU;
		/** First submitted vertex V coordinate within the selected icon. */
		public final double firstV;
		/** Second submitted vertex U coordinate within the selected icon. */
		public final double secondU;
		/** Second submitted vertex V coordinate within the selected icon. */
		public final double secondV;
		/** Third submitted vertex U coordinate within the selected icon. */
		public final double thirdU;
		/** Third submitted vertex V coordinate within the selected icon. */
		public final double thirdV;
		/** Fourth submitted vertex U coordinate within the selected icon. */
		public final double fourthU;
		/** Fourth submitted vertex V coordinate within the selected icon. */
		public final double fourthV;

		/**
		 * Creates four explicit icon-local UV pairs in tessellator submission order.
		 *
		 * @param firstU first vertex U coordinate
		 * @param firstV first vertex V coordinate
		 * @param secondU second vertex U coordinate
		 * @param secondV second vertex V coordinate
		 * @param thirdU third vertex U coordinate
		 * @param thirdV third vertex V coordinate
		 * @param fourthU fourth vertex U coordinate
		 * @param fourthV fourth vertex V coordinate
		 */
		public QuadTextureCoordinates(double firstU, double firstV, double secondU, double secondV,
				double thirdU, double thirdV, double fourthU, double fourthV)
		{
			this.firstU = firstU;
			this.firstV = firstV;
			this.secondU = secondU;
			this.secondV = secondV;
			this.thirdU = thirdU;
			this.thirdV = thirdV;
			this.fourthU = fourthU;
			this.fourthV = fourthV;
		}
	}
}
