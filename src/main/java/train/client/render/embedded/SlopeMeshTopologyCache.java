package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import train.client.render.embedded.EmbeddedHostFace.CuboidBounds;
import train.client.render.embedded.EmbeddedHostFace.QuadTextureCoordinates;
import train.client.render.embedded.EmbeddedHostFace.QuadVertices;
import train.common.tile.TileTCRailHostData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Shares immutable slope face geometry between equivalent placements while leaving material and lighting data local
 * to each rendered rail tile.
 *
 * <p>An entry stores face coordinates plus the captured icon side required for rebinding. It must not retain an icon or
 * block from the placement that populated the cache. Capacity and access-order eviction bound shared geometry
 * independently of the controller's weak per-tile cache.</p>
 */
@SideOnly(Side.CLIENT)
public final class SlopeMeshTopologyCache
{
	/** Maximum number of distinct slope geometries retained across placed tracks. */
	public static final int MAX_TEMPLATES = 128;
	private static final Map<String, Template> TEMPLATES =
			new LinkedHashMap<String, Template>(16, 0.75F, true)
			{
				/**
				 * Evicts the least-recently accessed topology after an insertion exceeds the fixed cache bound.
				 *
				 * @param eldest least-recently accessed topology entry
				 * @return whether the eldest entry must be removed
				 */
				@Override
				protected boolean removeEldestEntry(Map.Entry<String, Template> eldest)
				{
					return size() > MAX_TEMPLATES;
				}
			};

	/** Creates no instances; the renderer owns this process-wide topology cache. */
	private SlopeMeshTopologyCache()
	{
	}

	/**
	 * Returns the most recently used immutable topology matching an exact geometry key.
	 *
	 * @param key canonical material-independent slope geometry key
	 * @return cached topology, or {@code null} when the geometry has not been built
	 */
	public static Template get(String key)
	{
		return TEMPLATES.get(key);
	}

	/**
	 * Stores a completed immutable topology unless an equivalent entry already exists.
	 *
	 * @param key canonical material-independent slope geometry key
	 * @param template completed slope topology to retain
	 * @return the existing equivalent topology, or {@code template} when it was newly cached
	 */
	public static Template putIfAbsent(String key, Template template)
	{
		Template existing = TEMPLATES.get(key);
		if (existing != null)
		{
			return existing;
		}
		TEMPLATES.put(key, template);
		return template;
	}

	/** Removes every shared slope topology during renderer or resource-cache reset. */
	public static void clear()
	{
		TEMPLATES.clear();
	}

	/** Immutable ordered face topology for one material-independent slope mesh. */
	public static final class Template
	{
		private final List<Face> faces;

		/**
		 * Takes an owned immutable copy of the completed slope faces.
		 *
		 * @param faces ordered material-independent faces in tessellator submission order
		 */
		public Template(List<Face> faces)
		{
			this.faces = Collections.unmodifiableList(new ArrayList<Face>(faces));
		}

		/**
		 * Returns the immutable faces in their original renderer submission order.
		 *
		 * @return ordered slope face topologies
		 */
		public List<Face> getFaces()
		{
			return faces;
		}
	}

	/** One immutable face with geometry and UV layout but no captured material or prepared lighting. */
	public static final class Face
	{
		private final int offsetX;
		private final int offsetY;
		private final int offsetZ;
		private final int textureSide;
		private final int side;
		private final int normalX;
		private final int normalY;
		private final int normalZ;
		private final float directionalShade;
		private final CuboidBounds cuboidBounds;
		private final QuadVertices quadVertices;
		private final QuadTextureCoordinates quadTextureCoordinates;
		private final boolean topAnchoredSideTexture;

		/**
		 * Captures the immutable geometry fields from one fully generated slope face.
		 *
		 * @param source generated placement face supplying offsets, geometry, normals, UVs, and shade
		 * @param textureSide captured block side used to resolve this face's placement-local icon
		 */
		public Face(EmbeddedHostFace source, int textureSide)
		{
			this.offsetX = source.getOffsetX();
			this.offsetY = source.getOffsetY();
			this.offsetZ = source.getOffsetZ();
			this.textureSide = textureSide;
			this.side = source.getSide();
			this.normalX = source.getNormalX();
			this.normalY = source.getNormalY();
			this.normalZ = source.getNormalZ();
			this.directionalShade = source.getDirectionalShade();
			this.cuboidBounds = source.getCuboidBounds();
			this.quadVertices = source.getQuadVertices();
			this.quadTextureCoordinates = source.getQuadTextureCoordinates();
			this.topAnchoredSideTexture = source.isTopAnchoredSideTexture();
		}

		/**
		 * Returns the owner-relative captured-host key required to bind this face at one placement.
		 *
		 * @return unchanged coordinate key for the face's host cell
		 */
		public String getHostKey()
		{
			return TileTCRailHostData.key(offsetX, offsetY, offsetZ);
		}

		/**
		 * Returns the captured block side whose icon must be selected for this face.
		 *
		 * @return Minecraft block-side index from zero through five
		 */
		public int getTextureSide()
		{
			return textureSide;
		}

		/**
		 * Creates a fresh placement-owned face from this shared topology and the placement's captured material.
		 * Prepared tint, brightness, ambient occlusion, and pillar direction remain unset for local calculation.
		 *
		 * @param hostBlock placement-local captured host material and owner-relative offset
		 * @param block placement-local captured Minecraft block
		 * @param icon placement-local icon resolved for {@link #getTextureSide()}
		 * @return fresh face containing shared geometry and no inherited appearance state
		 */
		public EmbeddedHostFace bind(TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon)
		{
			EmbeddedHostFace bound;
			if (quadVertices != null)
			{
				bound = quadTextureCoordinates != null
						? EmbeddedHostFace.texturedQuad(hostBlock, block, icon, side, normalX, normalY, normalZ,
							directionalShade, quadVertices, quadTextureCoordinates)
						: EmbeddedHostFace.quad(hostBlock, block, icon, side, normalX, normalY, normalZ,
							directionalShade, quadVertices);
			}
			else
			{
				bound = EmbeddedHostFace.cuboid(hostBlock, block, icon, side, normalX, normalY, normalZ,
						directionalShade, cuboidBounds);
			}
			bound.setTopAnchoredSideTexture(topAnchoredSideTexture);
			return bound;
		}
	}
}
