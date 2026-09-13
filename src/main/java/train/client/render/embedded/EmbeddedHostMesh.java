package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import train.common.tile.TileTCRailHostData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Owns an ordered generated-face mesh and the aggregate bounds used for view culling.
 *
 * <p>Builders may append or replace faces only during construction. Rendering reads the stable unmodifiable view.
 * Bounds use complete host cells rather than cut faces so narrow trenches do not underestimate visibility.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedHostMesh
{
	private final List<EmbeddedHostFace> faces = new ArrayList<EmbeddedHostFace>();
	private final List<EmbeddedHostFace> faceView = Collections.unmodifiableList(faces);
	private int hostCount;
	private double minX = Double.POSITIVE_INFINITY;
	private double minY = Double.POSITIVE_INFINITY;
	private double minZ = Double.POSITIVE_INFINITY;
	private double maxX = Double.NEGATIVE_INFINITY;
	private double maxY = Double.NEGATIVE_INFINITY;
	private double maxZ = Double.NEGATIVE_INFINITY;
	private double centerX;
	private double centerY;
	private double centerZ;
	private double radius;

	/**
	 * Adds one generated face. This list is built once and then only read while rendering.
	 *
	 * @param face prepared host face transferred to this mesh's ownership
	 */
	public void addFace(EmbeddedHostFace face)
	{
		faces.add(face);
	}

	/**
	 * Adds a completed group of generated faces during mesh assembly.
	 *
	 * @param additions prepared faces transferred into this mesh
	 */
	public void addFaces(Collection<EmbeddedHostFace> additions)
	{
		faces.addAll(additions);
	}

	/**
	 * Replaces one build-phase face after a geometry-preserving slope transform.
	 *
	 * @param index zero-based face position
	 * @param face transformed replacement face
	 */
	public void setFace(int index, EmbeddedHostFace face)
	{
		faces.set(index, face);
	}

	/**
	 * Returns a stable read-only view of the cache-owned faces without allocating on the render path.
	 *
	 * @return read-only ordered face view
	 */
	public List<EmbeddedHostFace> getFaces()
	{
		return faceView;
	}

	/**
	 * Expands the culling bounds with one saved host block in visible-render coordinates.
	 *
	 * @param hostBlock captured host block with offsets rebased to the visible rail tile
	 */
	public void includeHost(TileTCRailHostData.CapturedHostBlock hostBlock)
	{
		hostCount++;
		minX = Math.min(minX, hostBlock.offsetX);
		minY = Math.min(minY, hostBlock.offsetY);
		minZ = Math.min(minZ, hostBlock.offsetZ);
		maxX = Math.max(maxX, hostBlock.offsetX + 1.0D);
		maxY = Math.max(maxY, hostBlock.offsetY + 1.0D);
		maxZ = Math.max(maxZ, hostBlock.offsetZ + 1.0D);
		centerX = (minX + maxX) * 0.5D;
		centerY = (minY + maxY) * 0.5D;
		centerZ = (minZ + maxZ) * 0.5D;
		double width = maxX - minX;
		double height = maxY - minY;
		double depth = maxZ - minZ;
		radius = Math.sqrt(width * width + height * height + depth * depth) * 0.5D;
	}

	/**
	 * Returns the number of captured host blocks included in the culling bounds.
	 *
	 * @return included host-block count
	 */
	public int getHostCount()
	{
		return hostCount;
	}

	/**
	 * Returns the culling center's X offset from the visible rail tile, in blocks.
	 *
	 * @return visible-source-relative X center
	 */
	public double getCenterX()
	{
		return centerX;
	}

	/**
	 * Returns the culling center's Y offset from the visible rail tile, in blocks.
	 *
	 * @return visible-source-relative Y center
	 */
	public double getCenterY()
	{
		return centerY;
	}

	/**
	 * Returns the culling center's Z offset from the visible rail tile, in blocks.
	 *
	 * @return visible-source-relative Z center
	 */
	public double getCenterZ()
	{
		return centerZ;
	}

	/**
	 * Returns the radius, in blocks, of the sphere enclosing all captured host cells.
	 *
	 * @return culling sphere radius in blocks
	 */
	public double getRadius()
	{
		return radius;
	}
}
