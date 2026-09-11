package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import train.client.render.embedded.EmbeddedHostFace.QuadVertices;
import train.client.render.embedded.EmbeddedHostGeometry.PointXZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Bounded cache of validated, material-independent model-switch top geometry.
 *
 * <p>Templates contain copied geometry only: no world, tile, block, icon, tint, or lighting references. Callers bind
	 * placement-local values after lookup. Validation rejects structurally incomplete or invalid candidates so a failed
	 * entry can fall back to sampled construction.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedModelSwitchTopCache
{
	/** Maximum number of validated switch-top templates retained process-wide. */
	public static final int MAX_TEMPLATES = 128;
	private static final double VALIDATION_EPSILON = 0.0001D;
	private static final Map<Key, Template> TEMPLATES = new LinkedHashMap<Key, Template>(16, 0.75F, true)
	{
		/**
		 * Evicts the least-recently-used template after the fixed bound is exceeded.
		 *
		 * @param eldest least-recently-accessed entry
		 * @return whether the eldest entry must be removed
		 */
		@Override
		protected boolean removeEldestEntry(Map.Entry<Key, Template> eldest)
		{
			return size() > MAX_TEMPLATES;
		}
	};

	/** Creates no instances; template-cache access is static. */
	private EmbeddedModelSwitchTopCache()
	{
	}

	/**
	 * Returns the validated model-switch top-geometry template cached for the supplied topology key, or
	 * {@code null} when the cache has no match.
	 *
	 * @param key complete material-independent switch key
	 * @return cached template, or {@code null} on a miss
	 */
	public static Template get(Key key)
	{
		return TEMPLATES.get(key);
	}

	/**
	 * Validates a completed model-switch top-geometry template and caches it under the supplied topology key only when
	 * valid; rejected templates are not cached.
	 *
	 * @param key complete material-independent switch key
	 * @param template completed candidate template
	 * @return the stored template, or {@code null} when validation rejects it
	 */
	public static Template putIfValid(Key key, Template template)
	{
		if (template == null || template.isValid() == false)
		{
			return null;
		}
		TEMPLATES.put(key, template);
		return template;
	}

	/** Clears all reusable switch-top templates. */
	public static void clear()
	{
		TEMPLATES.clear();
	}

	/**
	 * Returns the number of validated model-switch top-geometry templates currently retained by the bounded cache.
	 *
	 * @return number of retained templates
	 */
	public static int size()
	{
		return TEMPLATES.size();
	}

	/** Immutable cache key assembled by the renderer from topology-only inputs. */
	public static final class Key
	{
		private final String value;

		/**
		 * Creates a model-switch top-geometry cache key from a canonical signature containing the track core and profile,
		 * facing, captured-host footprint, linked-straight corridors, and surface height.
		 *
		 * @param value core/profile, facing, footprint, corridor, and surface signature
		 */
		public Key(String value)
		{
			this.value = value;
		}

		/**
		 * Returns the hash of this model-switch top-geometry cache key's canonical topology signature.
		 *
		 * @return canonical-signature hash
		 */
		@Override
		public int hashCode()
		{
			return value.hashCode();
		}

		/**
		 * Returns whether the supplied object is a model-switch top-geometry cache key with the same canonical topology
		 * signature as this key.
		 *
		 * @param candidate possible model-switch key
		 * @return whether both keys represent identical topology inputs
		 */
		@Override
		public boolean equals(Object candidate)
		{
			return candidate instanceof Key && value.equals(((Key)candidate).value);
		}
	}

	/** Completed switch template divided into owner-relative host sections. */
	public static final class Template
	{
		private final Map<String, Section> sections;
		private final int expectedSections;
		private final double raisedTop;
		private final double pocketTop;

		/**
		 * Creates an uncached model-switch top-geometry template from its owner-relative host sections, expected section
		 * count, and permitted surface heights so it can be validated before reuse.
		 *
		 * @param sections owner-relative host sections
		 * @param expectedSections number of captured host cells expected in the template
		 * @param raisedTop numeric uncut top height
		 * @param pocketTop numeric trench-floor height
		 */
		public Template(Map<String, Section> sections, int expectedSections, double raisedTop, double pocketTop)
		{
			Map<String, Section> ownedSections = new LinkedHashMap<String, Section>(sections);
			for (Section section : ownedSections.values())
			{
				if (section != null)
				{
					section.freeze();
				}
			}
			this.sections = Collections.unmodifiableMap(ownedSections);
			this.expectedSections = expectedSections;
			this.raisedTop = raisedTop;
			this.pocketTop = pocketTop;
		}

		/**
		 * Returns the cached model-switch top-geometry section for an owner-relative captured-host coordinate, or
		 * {@code null} when that host is absent.
		 *
		 * @param hostKey owner-relative coordinate key
		 * @return section, or {@code null} when absent
		 */
		public Section getSection(String hostKey)
		{
			return sections.get(hostKey);
		}

		/**
		 * Validates expected section count, numeric bounds, winding, allowed heights, and aggregate projected-area
		 * consistency. The area check is a structural sanity check and does not prove that sections are gap-free or
		 * non-overlapping.
		 *
		 * @return whether every expected host passes the structural and aggregate-area checks
		 */
		private boolean isValid()
		{
			if (expectedSections <= 0 || sections.size() != expectedSections)
			{
				return false;
			}
			for (Section section : sections.values())
			{
				if (section == null || section.isValid(raisedTop, pocketTop) == false)
				{
					return false;
				}
			}
			return true;
		}
	}

	/** Reusable top faces and sampled support data for one host cell. */
	public static final class Section
	{
		private final List<TopRectangle> rectangles = new ArrayList<TopRectangle>();
		private final List<TopRectangle> rectangleView = Collections.unmodifiableList(rectangles);
		private final List<QuadVertices> quads = new ArrayList<QuadVertices>();
		private final List<QuadVertices> quadView = Collections.unmodifiableList(quads);
		private final double[][] clearanceSamples;
		private final List<List<PointXZ>> contours;
		private boolean frozen;

		/**
		 * Creates an empty section around the samples used by placement-specific walls and sides.
		 *
		 * @param clearanceSamples signed corner samples
		 * @param contours stitched zero-clearance contours used by placement-specific walls
		 */
		public Section(double[][] clearanceSamples, List<List<PointXZ>> contours)
		{
			this.clearanceSamples = copySamples(clearanceSamples);
			this.contours = copyContours(contours);
		}

		/**
		 * Adds one completed merged top rectangle while this section is being assembled.
		 *
		 * @param rectangle immutable rectangle descriptor to retain
		 */
		public void addRectangle(TopRectangle rectangle)
		{
			ensureMutable();
			rectangles.add(rectangle);
		}

		/**
		 * Adds one completed top quad while this section is being assembled.
		 *
		 * @param quad immutable quad descriptor to retain
		 */
		public void addQuad(QuadVertices quad)
		{
			ensureMutable();
			quads.add(quad);
		}

		/**
		 * Returns a read-only view of the completed rectangle descriptors.
		 *
		 * @return read-only top rectangles in emission order
		 */
		public List<TopRectangle> getRectangles()
		{
			return rectangleView;
		}

		/**
		 * Returns a read-only view of the completed quad descriptors.
		 *
		 * @return read-only top quads in emission order
		 */
		public List<QuadVertices> getQuads()
		{
			return quadView;
		}

		/**
		 * Returns the immutable contour polylines used to emit trench walls.
		 *
		 * @return deeply read-only contour list
		 */
		public List<List<PointXZ>> getContours()
		{
			return contours;
		}

		/**
		 * Returns an independent clearance grid for one placement-owned mesh build.
		 *
		 * @return defensive copy of the signed clearance samples
		 */
		public double[][] copyClearanceSamples()
		{
			return copySamples(clearanceSamples);
		}

		/**
		 * Validates that the section has finite, bounded descriptors at allowed heights with positive winding and an
		 * aggregate projected area of one host cell.
		 *
		 * @param raisedTop allowed uncut height
		 * @param pocketTop allowed pocket height
		 * @return whether the section passes the structural and aggregate-area checks required before substitution
		 */
		private boolean isValid(double raisedTop, double pocketTop)
		{
			if (rectangles.isEmpty() && quads.isEmpty())
			{
				return false;
			}
			double area = 0.0D;
			for (TopRectangle rectangle : rectangles)
			{
				if (rectangle.isValid(raisedTop, pocketTop) == false)
				{
					return false;
				}
				area += (rectangle.maxX - rectangle.minX) * (rectangle.maxZ - rectangle.minZ);
			}
			for (QuadVertices quad : quads)
			{
				if (isFiniteAndBounded(quad) == false || isAllowedY(quad.firstY, raisedTop, pocketTop) == false
						|| isAllowedY(quad.secondY, raisedTop, pocketTop) == false
						|| isAllowedY(quad.thirdY, raisedTop, pocketTop) == false
						|| isAllowedY(quad.fourthY, raisedTop, pocketTop) == false)
				{
					return false;
				}
				double signedArea = ((quad.secondX - quad.firstX) * (quad.thirdZ - quad.firstZ)
						- (quad.thirdX - quad.firstX) * (quad.secondZ - quad.firstZ)) * 0.5D;
				if (signedArea <= 0.0D)
				{
					return false;
				}
				area += signedArea;
			}
			return Math.abs(area - 1.0D) <= VALIDATION_EPSILON;
		}

		/** Prevents further builder mutations after a section becomes part of a shared template. */
		private void freeze()
		{
			frozen = true;
		}

		/**
		 * Rejects attempts to mutate topology after ownership transfers to a shared template.
		 *
		 * @throws IllegalStateException when the section is already frozen
		 */
		private void ensureMutable()
		{
			if (frozen)
			{
				throw new IllegalStateException("Cannot modify a cached embedded switch-top section");
			}
		}
	}

	/** Numeric merged top rectangle produced by the existing grid-merging algorithm. */
	public static final class TopRectangle
	{
		private final double minX;
		private final double minZ;
		private final double maxX;
		private final double maxZ;
		private final double y;

		/**
		 * Creates one numeric top rectangle.
		 *
		 * @param minX minimum local X
		 * @param minZ minimum local Z
		 * @param maxX maximum local X
		 * @param maxZ maximum local Z
		 * @param y final numeric top height
		 */
		public TopRectangle(double minX, double minZ, double maxX, double maxZ, double y)
		{
			this.minX = minX;
			this.minZ = minZ;
			this.maxX = maxX;
			this.maxZ = maxZ;
			this.y = y;
		}

		/** @return minimum local X coordinate */
		public double getMinimumX()
		{
			return minX;
		}

		/** @return minimum local Z coordinate */
		public double getMinimumZ()
		{
			return minZ;
		}

		/** @return maximum local X coordinate */
		public double getMaximumX()
		{
			return maxX;
		}

		/** @return maximum local Z coordinate */
		public double getMaximumZ()
		{
			return maxZ;
		}

		/** @return rendered top height in local block coordinates */
		public double getY()
		{
			return y;
		}

		/**
		 * Validates rectangle bounds, size, finiteness, and numeric height.
		 *
		 * @param raisedTop permitted uncut height
		 * @param pocketTop permitted trench-floor height
		 * @return whether the rectangle is safe to render
		 */
		private boolean isValid(double raisedTop, double pocketTop)
		{
			return finite(minX) && finite(minZ) && finite(maxX) && finite(maxZ) && finite(y)
					&& minX >= -VALIDATION_EPSILON && minZ >= -VALIDATION_EPSILON
					&& maxX <= 1.0D + VALIDATION_EPSILON && maxZ <= 1.0D + VALIDATION_EPSILON
					&& maxX - minX > VALIDATION_EPSILON && maxZ - minZ > VALIDATION_EPSILON
					&& isAllowedY(y, raisedTop, pocketTop);
		}
	}

	/**
	 * Copies a rectangular numeric sample grid so cached topology cannot be changed through a caller-owned array.
	 *
	 * @param source caller-owned sample grid
	 * @return independent sample grid
	 */
	private static double[][] copySamples(double[][] source)
	{
		double[][] copy = new double[source.length][];
		for (int index = 0; index < source.length; index++)
		{
			copy[index] = source[index].clone();
		}
		return copy;
	}

	/**
	 * Copies and freezes every contour list while reusing immutable coordinate values.
	 *
	 * @param source caller-owned contour collection
	 * @return deeply read-only contour collection
	 */
	private static List<List<PointXZ>> copyContours(List<List<PointXZ>> source)
	{
		List<List<PointXZ>> copy = new ArrayList<List<PointXZ>>(source.size());
		for (List<PointXZ> contour : source)
		{
			copy.add(Collections.unmodifiableList(new ArrayList<PointXZ>(contour)));
		}
		return Collections.unmodifiableList(copy);
	}

	/**
	 * Checks every quad coordinate for a finite value and every projected coordinate for host-cell bounds.
	 *
	 * @param quad final numeric top quad
	 * @return whether all coordinates are finite and all X/Z values remain in the host cell
	 */
	private static boolean isFiniteAndBounded(QuadVertices quad)
	{
		return finite(quad.firstX) && finite(quad.firstY) && finite(quad.firstZ)
				&& finite(quad.secondX) && finite(quad.secondY) && finite(quad.secondZ)
				&& finite(quad.thirdX) && finite(quad.thirdY) && finite(quad.thirdZ)
				&& finite(quad.fourthX) && finite(quad.fourthY) && finite(quad.fourthZ)
				&& bounded(quad.firstX) && bounded(quad.firstZ) && bounded(quad.secondX) && bounded(quad.secondZ)
				&& bounded(quad.thirdX) && bounded(quad.thirdZ) && bounded(quad.fourthX) && bounded(quad.fourthZ);
	}

	/**
	 * Checks one vertex against the two permitted top levels.
	 *
	 * @param y numeric vertex height
	 * @param raisedTop permitted uncut height
	 * @param pocketTop permitted trench-floor height
	 * @return whether the height matches either permitted level within geometry tolerance
	 */
	private static boolean isAllowedY(double y, double raisedTop, double pocketTop)
	{
		return Math.abs(y - raisedTop) <= VALIDATION_EPSILON || Math.abs(y - pocketTop) <= VALIDATION_EPSILON;
	}

	/**
	 * Checks one projected coordinate against the local host-cell interval.
	 *
	 * @param value local X or Z coordinate
	 * @return whether the coordinate lies in zero-to-one bounds within geometry tolerance
	 */
	private static boolean bounded(double value)
	{
		return value >= -VALIDATION_EPSILON && value <= 1.0D + VALIDATION_EPSILON;
	}

	/**
	 * Checks one coordinate for a usable numeric value.
	 *
	 * @param value coordinate to inspect
	 * @return whether the coordinate is neither NaN nor infinite
	 */
	private static boolean finite(double value)
	{
		return Double.isNaN(value) == false && Double.isInfinite(value) == false;
	}
}
