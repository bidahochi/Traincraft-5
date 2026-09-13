package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.client.render.embedded.EmbeddedHostFace.CuboidBounds;
import train.client.render.embedded.EmbeddedHostFace.QuadTextureCoordinates;
import train.client.render.embedded.EmbeddedHostFace.QuadVertices;
import train.common.tile.TileTCRail;

/**
 * Draws prepared host faces while preserving captured-block texture orientation.
 *
	 * <p>The emitter performs no lighting, tint, or ambient-occlusion sampling and must not change cached face data.
	 * Contextual cuboid icon lookup may use world-backed captured-block access. Faces are submitted in stored order to
	 * the caller-owned tessellator batch; {@link EmbeddedHostRenderState} owns batching and temporary GL state. UV changes
	 * belong here only when they apply to a captured block style rather than one trench shape.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedHostFaceEmitter
{
	/** Minecraft 1.7.10's fixed side indexes, also used by {@link RenderBlocks}. */
	private static final int BLOCK_SIDE_BOTTOM = 0;
	private static final int BLOCK_SIDE_TOP = 1;
	private static final int BLOCK_SIDE_NORTH = 2;
	private static final int BLOCK_SIDE_SOUTH = 3;
	private static final int BLOCK_SIDE_WEST = 4;
	private static final int BLOCK_SIDE_EAST = 5;
	/** Internal marker for a top face whose corners do not form an axis-aligned box. */
	private static final int CUSTOM_TOP_FACE = -2;
	/** Vanilla log metadata stores the placed axis in bits 2 and 3. */
	private static final int PILLAR_AXIS_METADATA_MASK = 12;
	private static final int PILLAR_AXIS_X = 4;
	private static final int PILLAR_AXIS_Z = 8;
	/** Vanilla 1.7.10 render-type numbers for logs and quartz pillars. */
	private static final int LOG_RENDER_TYPE = 31;
	private static final int QUARTZ_RENDER_TYPE = 39;
	private static final int QUARTZ_X_AXIS_METADATA = 3;
	private static final int QUARTZ_Z_AXIS_METADATA = 4;
	/** RGB tint channels use the usual eight-bit packed-color layout. */
	private static final int COLOUR_CHANNEL_MASK = 255;
	private static final int RED_CHANNEL_SHIFT = 16;
	private static final int GREEN_CHANNEL_SHIFT = 8;
	/** An icon spans sixteen texture pixels across one block face. */
	private static final double ICON_INTERPOLATION_PIXELS = 16.0D;
	/** Treats shorter wall segments as points so texture distance never divides by rounding noise. */
	private static final double LENGTH_EPSILON = 0.0001D;

	/** Creates no instances; face emission is static. */
	private EmbeddedHostFaceEmitter()
	{
	}

	/**
	 * Submits one prepared face. The supplied position is the visible rail render source;
	 * the face's saved offset has already been rebased from the storage owner.
	 *
	 * @param tessellator active Minecraft tessellator receiving the face vertices
	 * @param renderer reusable vanilla block renderer used for axis-aligned faces
	 * @param railTile visible rail tile supplying world coordinates and captured material context
	 * @param face prepared host face to submit
	 * @param renderX rendered X position of the visible rail tile
	 * @param renderY rendered Y position of the visible rail tile
	 * @param renderZ rendered Z position of the visible rail tile
	 */
	public static void render(Tessellator tessellator, RenderBlocks renderer, TileTCRail railTile,
			EmbeddedHostFace face, double renderX, double renderY, double renderZ)
	{
		int tint = face.getCachedTint();
		float shade = face.getDirectionalShade();
		float red = (float)((tint >> RED_CHANNEL_SHIFT) & COLOUR_CHANNEL_MASK) / COLOUR_CHANNEL_MASK * shade;
		float green = (float)((tint >> GREEN_CHANNEL_SHIFT) & COLOUR_CHANNEL_MASK) / COLOUR_CHANNEL_MASK * shade;
		float blue = (float)(tint & COLOUR_CHANNEL_MASK) / COLOUR_CHANNEL_MASK * shade;
		double blockX = renderX + face.getOffsetX();
		double blockY = renderY + face.getOffsetY();
		double blockZ = renderZ + face.getOffsetZ();

		tessellator.setBrightness(face.getCachedFaceBrightness());
		tessellator.setColorRGBA_F(red, green, blue, face.getCachedAlpha());
		tessellator.setNormal(face.getNormalX(), face.getNormalY(), face.getNormalZ());
		if (face.isQuad())
		{
			renderCustomQuad(tessellator, face, blockX, blockY, blockZ);
		}
		else if (face.getSide() == BLOCK_SIDE_TOP && face.getCachedPillarAxis() != 0)
		{
			renderAxisLikeTopFace(tessellator, face, blockX, blockY, blockZ);
		}
		else
		{
			renderVanillaFace(renderer, railTile, face, blockX, blockY, blockZ, red, green, blue);
		}
	}

	/**
	 * Resolves log-like texture direction once while the render cache is prepared.
	 *
	 * @param railTile visible rail tile supplying captured-world icon context
	 * @param face captured host face whose metadata and icons describe the possible pillar
	 * @return vanilla pillar-axis metadata, or zero when the block is not pillar-like
	 */
	public static int resolvePillarAxis(TileTCRail railTile, EmbeddedHostFace face)
	{
		int axis = face.getMetadata() & PILLAR_AXIS_METADATA_MASK;
		if (axis != PILLAR_AXIS_X && axis != PILLAR_AXIS_Z)
		{
			return 0;
		}
		if (face.getBlock().getRenderType() == LOG_RENDER_TYPE)
		{
			return axis;
		}
		return hasPillarStyleIconLayout(railTile, face, axis) ? axis : 0;
	}

	/**
	 * Emits either a projected top polygon or a distance-mapped trench wall.
	 *
	 * @param tessellator active tessellator receiving vertices
	 * @param face prepared custom quad
	 * @param blockX rendered X origin of the captured host block
	 * @param blockY rendered Y origin of the captured host block
	 * @param blockZ rendered Z origin of the captured host block
	 */
	private static void renderCustomQuad(Tessellator tessellator, EmbeddedHostFace face,
			double blockX, double blockY, double blockZ)
	{
		QuadVertices quad = face.getQuadVertices();
		if (face.getQuadTextureCoordinates() != null)
		{
			renderExplicitlyTexturedQuad(tessellator, face, quad, face.getQuadTextureCoordinates(),
					blockX, blockY, blockZ);
			return;
		}
		if (face.getSide() == CUSTOM_TOP_FACE)
		{
			boolean rotate = face.getCachedPillarAxis() == PILLAR_AXIS_X;
			addTopVertex(tessellator, face, blockX, blockY, blockZ,
					quad.firstX, quad.firstY, quad.firstZ, 0, rotate);
			addTopVertex(tessellator, face, blockX, blockY, blockZ,
					quad.secondX, quad.secondY, quad.secondZ, 1, rotate);
			addTopVertex(tessellator, face, blockX, blockY, blockZ,
					quad.thirdX, quad.thirdY, quad.thirdZ, 2, rotate);
			addTopVertex(tessellator, face, blockX, blockY, blockZ,
					quad.fourthX, quad.fourthY, quad.fourthZ, 3, rotate);
			return;
		}
		double length = Math.sqrt((quad.secondX - quad.firstX) * (quad.secondX - quad.firstX)
				+ (quad.secondZ - quad.firstZ) * (quad.secondZ - quad.firstZ));
		addSideVertex(tessellator, face, blockX, blockY, blockZ,
				quad.firstX, quad.firstY, quad.firstZ, 0, 0.0D, length, getSideTextureY(face, quad, quad.firstY));
		addSideVertex(tessellator, face, blockX, blockY, blockZ,
				quad.secondX, quad.secondY, quad.secondZ, 1, length, length, getSideTextureY(face, quad, quad.secondY));
		addSideVertex(tessellator, face, blockX, blockY, blockZ,
				quad.thirdX, quad.thirdY, quad.thirdZ, 2, length, length, getSideTextureY(face, quad, quad.thirdY));
		addSideVertex(tessellator, face, blockX, blockY, blockZ,
				quad.fourthX, quad.fourthY, quad.fourthZ, 3, 0.0D, length, getSideTextureY(face, quad, quad.fourthY));
	}

	/**
	 * Emits a custom quad with already resolved icon-local UV coordinates.
	 *
	 * @param tessellator active tessellator receiving vertices
	 * @param face prepared face supplying icon, tint, and cached lighting
	 * @param quad geometric vertices in submission order
	 * @param textureCoordinates icon-local UV pairs in matching submission order
	 * @param blockX rendered X origin of the captured host block
	 * @param blockY rendered Y origin of the captured host block
	 * @param blockZ rendered Z origin of the captured host block
	 */
	private static void renderExplicitlyTexturedQuad(Tessellator tessellator, EmbeddedHostFace face,
			QuadVertices quad, QuadTextureCoordinates textureCoordinates,
			double blockX, double blockY, double blockZ)
	{
		addVertex(tessellator, face, blockX + quad.firstX, blockY + quad.firstY, blockZ + quad.firstZ,
				textureCoordinates.firstU, textureCoordinates.firstV, 0);
		addVertex(tessellator, face, blockX + quad.secondX, blockY + quad.secondY, blockZ + quad.secondZ,
				textureCoordinates.secondU, textureCoordinates.secondV, 1);
		addVertex(tessellator, face, blockX + quad.thirdX, blockY + quad.thirdY, blockZ + quad.thirdZ,
				textureCoordinates.thirdU, textureCoordinates.thirdV, 2);
		addVertex(tessellator, face, blockX + quad.fourthX, blockY + quad.fourthY, blockZ + quad.fourthZ,
				textureCoordinates.fourthU, textureCoordinates.fourthV, 3);
	}

	/**
	 * Resolves the vertical texture coordinate for an ordinary side or a short side translated uniformly to the icon's
	 * top edge. A single offset preserves horizontal texture rows instead of shearing them along the sloped boundary.
	 *
	 * @param face prepared face declaring whether its side texture is top-anchored
	 * @param quad complete custom side quad containing the vertex
	 * @param localY geometric Y coordinate of the queried vertex
	 * @return icon-local vertical coordinate from zero to one
	 */
	public static double getSideTextureY(EmbeddedHostFace face, QuadVertices quad, double localY)
	{
		if (face.isTopAnchoredSideTexture() == false)
		{
			return getSideTextureY(quad, localY);
		}
		double maximumY = Math.max(Math.max(quad.firstY, quad.secondY), Math.max(quad.thirdY, quad.fourthY));
		return Math.max(0.0D, Math.min(1.0D, localY + 1.0D - maximumY));
	}

	/**
	 * Converts a side vertex's geometric Y into a safe icon-local texture coordinate. Ordinary zero-to-one faces
	 * retain their block-aligned projection. Faces extending outside a block, such as embedded half-height slope
	 * sides, normalize across their own vertical span so interpolation cannot escape into a neighboring atlas icon.
	 *
	 * @param quad complete custom side quad containing the vertex
	 * @param localY geometric Y coordinate of the queried vertex
	 * @return icon-local vertical coordinate from zero to one
	 */
	public static double getSideTextureY(QuadVertices quad, double localY)
	{
		double minY = Math.min(Math.min(quad.firstY, quad.secondY), Math.min(quad.thirdY, quad.fourthY));
		double maxY = Math.max(Math.max(quad.firstY, quad.secondY), Math.max(quad.thirdY, quad.fourthY));
		if (minY >= 0.0D && maxY <= 1.0D)
		{
			return localY;
		}
		double height = maxY - minY;
		return height > LENGTH_EPSILON ? (localY - minY) / height : 0.0D;
	}

	/**
	 * Emits a cuboid top manually when a horizontal pillar axis rotates its texture.
	 *
	 * @param tessellator active tessellator receiving vertices
	 * @param face prepared cuboid top face
	 * @param blockX rendered X origin of the captured host block
	 * @param blockY rendered Y origin of the captured host block
	 * @param blockZ rendered Z origin of the captured host block
	 */
	private static void renderAxisLikeTopFace(Tessellator tessellator, EmbeddedHostFace face,
			double blockX, double blockY, double blockZ)
	{
		CuboidBounds bounds = face.getCuboidBounds();
		boolean rotate = face.getCachedPillarAxis() == PILLAR_AXIS_X;
		addTopVertex(tessellator, face, blockX, blockY, blockZ, bounds.maxX, bounds.maxY, bounds.maxZ, 0, rotate);
		addTopVertex(tessellator, face, blockX, blockY, blockZ, bounds.maxX, bounds.maxY, bounds.minZ, 1, rotate);
		addTopVertex(tessellator, face, blockX, blockY, blockZ, bounds.minX, bounds.maxY, bounds.minZ, 2, rotate);
		addTopVertex(tessellator, face, blockX, blockY, blockZ, bounds.minX, bounds.maxY, bounds.maxZ, 3, rotate);
	}

	/**
	 * Adds one top vertex with ordinary or horizontal-pillar texture projection.
	 *
	 * @param tessellator active tessellator receiving the vertex
	 * @param face prepared face supplying icon and cached light
	 * @param blockX rendered X origin of the captured host block
	 * @param blockY rendered Y origin of the captured host block
	 * @param blockZ rendered Z origin of the captured host block
	 * @param localX vertex X coordinate within the captured host block
	 * @param localY vertex Y coordinate within the captured host block
	 * @param localZ vertex Z coordinate within the captured host block
	 * @param vertexIndex vertex-light index in submission order
	 * @param rotate whether the horizontal pillar axis rotates the top texture
	 */
	private static void addTopVertex(Tessellator tessellator, EmbeddedHostFace face,
			double blockX, double blockY, double blockZ, double localX, double localY, double localZ,
			int vertexIndex, boolean rotate)
	{
		double textureU = rotate ? localZ : localX;
		double textureV = rotate ? 1.0D - localX : localZ;
		addVertex(tessellator, face, blockX + localX, blockY + localY, blockZ + localZ,
				textureU, textureV, vertexIndex);
	}

	/**
	 * Adds one wall vertex using the captured block's axis-aware side projection.
	 *
	 * @param tessellator active tessellator receiving the vertex
	 * @param face prepared face supplying icon, side, axis, and cached light
	 * @param blockX rendered X origin of the captured host block
	 * @param blockY rendered Y origin of the captured host block
	 * @param blockZ rendered Z origin of the captured host block
	 * @param localX vertex X coordinate within the captured host block
	 * @param localY vertex Y coordinate within the captured host block
	 * @param localZ vertex Z coordinate within the captured host block
	 * @param vertexIndex vertex-light index in submission order
	 * @param segmentU distance from the start of an oblique wall, in blocks
	 * @param segmentLength total oblique wall length, in blocks
	 * @param textureY icon-local vertical coordinate constrained to the face's texture span
	 */
	private static void addSideVertex(Tessellator tessellator, EmbeddedHostFace face,
			double blockX, double blockY, double blockZ, double localX, double localY, double localZ,
			int vertexIndex, double segmentU, double segmentLength, double textureY)
	{
		double textureU;
		double textureV;
		if (face.getCachedPillarAxis() == PILLAR_AXIS_X && face.getSide() == BLOCK_SIDE_NORTH)
		{
			textureU = textureY;
			textureV = localX;
		}
		else if (face.getCachedPillarAxis() == PILLAR_AXIS_X && face.getSide() == BLOCK_SIDE_SOUTH)
		{
			textureU = 1.0D - textureY;
			textureV = 1.0D - localX;
		}
		else if (face.getCachedPillarAxis() == PILLAR_AXIS_Z && face.getSide() == BLOCK_SIDE_WEST)
		{
			textureU = 1.0D - textureY;
			textureV = 1.0D - localZ;
		}
		else if (face.getCachedPillarAxis() == PILLAR_AXIS_Z && face.getSide() == BLOCK_SIDE_EAST)
		{
			textureU = textureY;
			textureV = localZ;
		}
		else
		{
			textureU = getSideU(face.getSide(), localX, localZ, segmentU, segmentLength);
			textureV = 1.0D - textureY;
		}
		addVertex(tessellator, face, blockX + localX, blockY + localY, blockZ + localZ,
				textureU, textureV, vertexIndex);
	}

	/**
	 * Submits one fully positioned and lit vertex to the active tessellator batch.
	 *
	 * @param tessellator active tessellator receiving the vertex
	 * @param face prepared face supplying icon and cached light
	 * @param worldX rendered vertex X coordinate
	 * @param worldY rendered vertex Y coordinate
	 * @param worldZ rendered vertex Z coordinate
	 * @param textureU horizontal texture coordinate in normalized block-face units
	 * @param textureV vertical texture coordinate in normalized block-face units
	 * @param vertexIndex vertex-light index in submission order
	 */
	private static void addVertex(Tessellator tessellator, EmbeddedHostFace face,
			double worldX, double worldY, double worldZ, double textureU, double textureV, int vertexIndex)
	{
		tessellator.setBrightness(face.getCachedVertexBrightness(vertexIndex));
		applyVertexColor(tessellator, face, vertexIndex);
		tessellator.addVertexWithUV(worldX, worldY, worldZ,
				face.getIcon().getInterpolatedU(textureU * ICON_INTERPOLATION_PIXELS),
				face.getIcon().getInterpolatedV(textureV * ICON_INTERPOLATION_PIXELS));
	}

	/**
	 * Applies captured tint, directional shading, and vanilla-style ambient occlusion to one custom vertex.
	 *
	 * @param tessellator active tessellator receiving the vertex color
	 * @param face prepared face supplying cached tint and ambient occlusion
	 * @param vertexIndex zero-based vertex index in submission order
	 */
	private static void applyVertexColor(Tessellator tessellator, EmbeddedHostFace face, int vertexIndex)
	{
		int tint = face.getCachedTint();
		float shade = face.getDirectionalShade() * face.getCachedVertexAmbientOcclusion(vertexIndex);
		float red = (float)((tint >> RED_CHANNEL_SHIFT) & COLOUR_CHANNEL_MASK) / COLOUR_CHANNEL_MASK * shade;
		float green = (float)((tint >> GREEN_CHANNEL_SHIFT) & COLOUR_CHANNEL_MASK) / COLOUR_CHANNEL_MASK * shade;
		float blue = (float)(tint & COLOUR_CHANNEL_MASK) / COLOUR_CHANNEL_MASK * shade;
		tessellator.setColorRGBA_F(red, green, blue, face.getCachedAlpha());
	}

	/**
	 * Returns the horizontal texture coordinate for a block side or oblique wall segment.
	 *
	 * @param side Minecraft block side or custom oblique-wall marker
	 * @param localX vertex X coordinate within the host block
	 * @param localZ vertex Z coordinate within the host block
	 * @param segmentU distance from the start of an oblique wall, in blocks
	 * @param segmentLength total oblique wall length, in blocks
	 * @return normalized horizontal texture coordinate
	 */
	private static double getSideU(int side, double localX, double localZ, double segmentU, double segmentLength)
	{
		switch (side)
		{
			case BLOCK_SIDE_NORTH:
				return 1.0D - localX;
			case BLOCK_SIDE_SOUTH:
				return localX;
			case BLOCK_SIDE_WEST:
				return localZ;
			case BLOCK_SIDE_EAST:
				return 1.0D - localZ;
			default:
				return segmentLength <= LENGTH_EPSILON ? 0.0D : segmentU;
		}
	}

	/**
	 * Replays a cuboid face through {@link RenderBlocks} while temporarily exposing the captured block to icon lookup.
	 * The original block access is restored in {@code finally}; ambient occlusion and UV rotations are reset to their
	 * neutral values before returning.
	 *
	 * @param renderer reusable vanilla block renderer whose state is temporarily changed
	 * @param railTile visible rail tile supplying world coordinates
	 * @param face prepared cuboid face
	 * @param blockX rendered X origin of the captured host block
	 * @param blockY rendered Y origin of the captured host block
	 * @param blockZ rendered Z origin of the captured host block
	 * @param red prepared red tint and shade multiplier
	 * @param green prepared green tint and shade multiplier
	 * @param blue prepared blue tint and shade multiplier
	 */
	private static void renderVanillaFace(RenderBlocks renderer, TileTCRail railTile, EmbeddedHostFace face,
			double blockX, double blockY, double blockZ, float red, float green, float blue)
	{
		World world = railTile.getWorldObj();
		IBlockAccess originalBlockAccess = renderer.blockAccess;
		int worldX = railTile.xCoord + face.getOffsetX();
		int worldY = railTile.yCoord + face.getOffsetY();
		int worldZ = railTile.zCoord + face.getOffsetZ();
		if (world != null)
		{
			renderer.blockAccess = new CapturedHostBlockAccess(world, worldX, worldY, worldZ,
					face.getBlock(), face.getMetadata());
		}
		clearUvRotation(renderer);
		CuboidBounds bounds = face.getCuboidBounds();
		renderer.setRenderBounds(bounds.minX, bounds.minY, bounds.minZ, bounds.maxX, bounds.maxY, bounds.maxZ);
		applyLighting(renderer, face, red, green, blue);
		applyUvRotation(renderer, face);
		try
		{
			IIcon icon = renderer.blockAccess != null
					? renderer.getBlockIcon(face.getBlock(), renderer.blockAccess, worldX, worldY, worldZ, face.getSide())
					: face.getIcon();
			renderVanillaSide(renderer, face, icon, blockX, blockY, blockZ);
		}
		finally
		{
			renderer.enableAO = false;
			clearUvRotation(renderer);
			renderer.blockAccess = originalBlockAccess;
		}
	}

	/**
	 * Dispatches one cuboid face to the matching vanilla side-render method.
	 *
	 * @param renderer vanilla block renderer receiving the face
	 * @param face prepared cuboid face selecting the side and block
	 * @param icon resolved captured-block icon for the selected side
	 * @param blockX rendered X origin of the captured host block
	 * @param blockY rendered Y origin of the captured host block
	 * @param blockZ rendered Z origin of the captured host block
	 */
	private static void renderVanillaSide(RenderBlocks renderer, EmbeddedHostFace face, IIcon icon,
			double blockX, double blockY, double blockZ)
	{
		switch (face.getSide())
		{
			case BLOCK_SIDE_BOTTOM:
				renderer.renderFaceYNeg(face.getBlock(), blockX, blockY, blockZ, icon);
				break;
			case BLOCK_SIDE_TOP:
				renderer.renderFaceYPos(face.getBlock(), blockX, blockY, blockZ, icon);
				break;
			case BLOCK_SIDE_NORTH:
				renderer.renderFaceZNeg(face.getBlock(), blockX, blockY, blockZ, icon);
				break;
			case BLOCK_SIDE_SOUTH:
				renderer.renderFaceZPos(face.getBlock(), blockX, blockY, blockZ, icon);
				break;
			case BLOCK_SIDE_WEST:
				renderer.renderFaceXNeg(face.getBlock(), blockX, blockY, blockZ, icon);
				break;
			case BLOCK_SIDE_EAST:
				renderer.renderFaceXPos(face.getBlock(), blockX, blockY, blockZ, icon);
				break;
			default:
				break;
		}
	}

	/**
	 * Copies prepared vertex light and tint into the reusable vanilla block renderer.
	 *
	 * @param renderer reusable vanilla block renderer receiving temporary light state
	 * @param face prepared face supplying four packed-light values
	 * @param red red tint and directional shade multiplier
	 * @param green green tint and directional shade multiplier
	 * @param blue blue tint and directional shade multiplier
	 */
	private static void applyLighting(RenderBlocks renderer, EmbeddedHostFace face, float red, float green, float blue)
	{
		renderer.brightnessTopLeft = face.getCachedVertexBrightness(0);
		renderer.brightnessBottomLeft = face.getCachedVertexBrightness(1);
		renderer.brightnessBottomRight = face.getCachedVertexBrightness(2);
		renderer.brightnessTopRight = face.getCachedVertexBrightness(3);
		renderer.colorRedTopLeft = red * face.getCachedVertexAmbientOcclusion(0);
		renderer.colorRedBottomLeft = red * face.getCachedVertexAmbientOcclusion(1);
		renderer.colorRedBottomRight = red * face.getCachedVertexAmbientOcclusion(2);
		renderer.colorRedTopRight = red * face.getCachedVertexAmbientOcclusion(3);
		renderer.colorGreenTopLeft = green * face.getCachedVertexAmbientOcclusion(0);
		renderer.colorGreenBottomLeft = green * face.getCachedVertexAmbientOcclusion(1);
		renderer.colorGreenBottomRight = green * face.getCachedVertexAmbientOcclusion(2);
		renderer.colorGreenTopRight = green * face.getCachedVertexAmbientOcclusion(3);
		renderer.colorBlueTopLeft = blue * face.getCachedVertexAmbientOcclusion(0);
		renderer.colorBlueBottomLeft = blue * face.getCachedVertexAmbientOcclusion(1);
		renderer.colorBlueBottomRight = blue * face.getCachedVertexAmbientOcclusion(2);
		renderer.colorBlueTopRight = blue * face.getCachedVertexAmbientOcclusion(3);
		renderer.enableAO = true;
	}

	/**
	 * Applies the UV rotations that vanilla uses for the captured block's orientation.
	 *
	 * @param renderer reusable vanilla block renderer receiving temporary UV flags
	 * @param face captured host face supplying side, axis, block, and metadata
	 */
	private static void applyUvRotation(RenderBlocks renderer, EmbeddedHostFace face)
	{
		if (face.getSide() == BLOCK_SIDE_NORTH)
		{
			renderer.field_152631_f = true;
		}
		switch (face.getCachedPillarAxis())
		{
			case PILLAR_AXIS_X:
				renderer.uvRotateEast = renderer.uvRotateWest = renderer.uvRotateTop = renderer.uvRotateBottom = 1;
				break;
			case PILLAR_AXIS_Z:
				renderer.uvRotateSouth = renderer.uvRotateNorth = 1;
				break;
			default:
				applyQuartzUvRotation(renderer, face);
				break;
		}
	}

	/**
	 * Applies vanilla quartz-pillar rotations when log-style axis detection does not apply.
	 *
	 * @param renderer reusable vanilla block renderer receiving temporary UV flags
	 * @param face captured quartz face supplying render type and metadata
	 */
	private static void applyQuartzUvRotation(RenderBlocks renderer, EmbeddedHostFace face)
	{
		if (face.getBlock().getRenderType() != QUARTZ_RENDER_TYPE)
		{
			return;
		}
		if (face.getMetadata() == QUARTZ_X_AXIS_METADATA)
		{
			renderer.uvRotateEast = renderer.uvRotateWest = renderer.uvRotateTop = renderer.uvRotateBottom = 1;
		}
		else if (face.getMetadata() == QUARTZ_Z_AXIS_METADATA)
		{
			renderer.uvRotateSouth = renderer.uvRotateNorth = 1;
		}
	}

	/**
	 * Detects modded pillars whose end and side icons follow the vanilla log arrangement.
	 *
	 * @param railTile visible rail tile supplying captured-world icon context
	 * @param face captured host face to inspect
	 * @param axis candidate horizontal pillar axis from block metadata
	 * @return whether the captured icons support the candidate pillar axis
	 */
	private static boolean hasPillarStyleIconLayout(TileTCRail railTile, EmbeddedHostFace face, int axis)
	{
		IIcon top = getCapturedIcon(railTile, face, BLOCK_SIDE_TOP);
		IIcon north = getCapturedIcon(railTile, face, BLOCK_SIDE_NORTH);
		IIcon south = getCapturedIcon(railTile, face, BLOCK_SIDE_SOUTH);
		IIcon west = getCapturedIcon(railTile, face, BLOCK_SIDE_WEST);
		IIcon east = getCapturedIcon(railTile, face, BLOCK_SIDE_EAST);
		if (axis == PILLAR_AXIS_X)
		{
			return iconsMatch(top, north) && iconsMatch(top, south) && iconsDiffer(top, west) && iconsDiffer(top, east);
		}
		return iconsMatch(top, west) && iconsMatch(top, east) && iconsDiffer(top, north) && iconsDiffer(top, south);
	}

	/**
	 * Resolves an icon as if the saved host block still occupied the rail coordinate.
	 *
	 * @param railTile visible rail tile supplying world coordinates
	 * @param face captured host face supplying block, metadata, and rebased offset
	 * @param side Minecraft block side whose icon is requested
	 * @return captured-world icon, or the block's metadata icon when no world exists
	 */
	private static IIcon getCapturedIcon(TileTCRail railTile, EmbeddedHostFace face, int side)
	{
		World world = railTile.getWorldObj();
		if (world == null)
		{
			return face.getBlock().getIcon(side, face.getMetadata());
		}
		int worldX = railTile.xCoord + face.getOffsetX();
		int worldY = railTile.yCoord + face.getOffsetY();
		int worldZ = railTile.zCoord + face.getOffsetZ();
		return face.getBlock().getIcon(new CapturedHostBlockAccess(world, worldX, worldY, worldZ,
				face.getBlock(), face.getMetadata()), worldX, worldY, worldZ, side);
	}

	/**
	 * Returns whether two icons are the same object or carry the same registered name.
	 *
	 * @param first first icon, which may be {@code null}
	 * @param second second icon, which may be {@code null}
	 * @return whether both references are identical, including two {@code null} references, or name the same texture
	 */
	private static boolean iconsMatch(IIcon first, IIcon second)
	{
		if (first == second)
		{
			return true;
		}
		if (first == null || second == null)
		{
			return false;
		}
		return first.getIconName() != null && first.getIconName().equals(second.getIconName());
	}

	/**
	 * Returns whether two present icons have different registered identities.
	 *
	 * @param first first icon, which may be {@code null}
	 * @param second second icon, which may be {@code null}
	 * @return whether both icons are present and do not match
	 */
	private static boolean iconsDiffer(IIcon first, IIcon second)
	{
		return first != null && second != null && iconsMatch(first, second) == false;
	}

	/**
	 * Clears every mutable UV flag touched while replaying a captured block face.
	 *
	 * @param renderer reusable vanilla renderer whose temporary UV state is cleared
	 */
	private static void clearUvRotation(RenderBlocks renderer)
	{
		renderer.flipTexture = false;
		renderer.field_152631_f = false;
		renderer.uvRotateEast = 0;
		renderer.uvRotateWest = 0;
		renderer.uvRotateSouth = 0;
		renderer.uvRotateNorth = 0;
		renderer.uvRotateTop = 0;
		renderer.uvRotateBottom = 0;
	}
}
