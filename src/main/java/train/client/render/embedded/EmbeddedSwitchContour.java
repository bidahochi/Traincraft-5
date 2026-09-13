package train.client.render.embedded;

import train.client.render.embedded.EmbeddedHostGeometry.PointXZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Extracts continuous zero-clearance contours from the triangulated model-switch sample grid.
 *
 * <p>The triangulation and interpolation deliberately match the renderer's top-surface clipping.
 * Stitching therefore changes only wall batching: it neither resamples nor moves a cutout edge.</p>
 */
public final class EmbeddedSwitchContour
{
	private static final double POINT_EPSILON = 1.0E-10D;
	private static final double COLLINEAR_EPSILON = 1.0E-12D;
	private static final double INTERPOLATION_EPSILON = 0.0001D;

	/** Creates no instances; contour extraction is static. */
	private EmbeddedSwitchContour()
	{
	}

	/**
	 * Extracts and stitches every zero crossing from a square sample grid.
	 *
	 * @param clearanceSamples signed corner samples indexed by X and Z
	 * @param centerSamples signed center samples for resolving checkerboard cells
	 * @param gridSize number of cells along each grid axis
	 * @return continuous contour polylines in normalized host-cell coordinates
	 */
	public static List<List<PointXZ>> extract(double[][] clearanceSamples, double[][] centerSamples, int gridSize)
	{
		List<Segment> segments = new ArrayList<Segment>();
		for (int xIndex = 0; xIndex < gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex < gridSize; zIndex++)
			{
				addCellSegments(segments, clearanceSamples, centerSamples, xIndex, zIndex, gridSize);
			}
		}
		return stitch(segments);
	}

	/**
	 * Adds the zero crossings from the same two triangles used for one rendered grid cell.
	 *
	 * @param segments destination for extracted contour segments
	 * @param clearanceSamples signed corner samples indexed by X and Z
	 * @param centerSamples signed center samples for checkerboard cells
	 * @param cellXIndex grid-cell X index
	 * @param cellZIndex grid-cell Z index
	 * @param gridSize number of cells along each grid axis
	 */
	private static void addCellSegments(List<Segment> segments, double[][] clearanceSamples,
			double[][] centerSamples, int cellXIndex, int cellZIndex, int gridSize)
	{
		double minX = cellXIndex / (double)gridSize;
		double maxX = (cellXIndex + 1.0D) / gridSize;
		double minZ = cellZIndex / (double)gridSize;
		double maxZ = (cellZIndex + 1.0D) / gridSize;
		PointXZ minimumCorner = new PointXZ(minX, minZ);
		PointXZ maximumXCorner = new PointXZ(maxX, minZ);
		PointXZ maximumCorner = new PointXZ(maxX, maxZ);
		PointXZ maximumZCorner = new PointXZ(minX, maxZ);
		double clearance00 = clearanceSamples[cellXIndex][cellZIndex];
		double clearance10 = clearanceSamples[cellXIndex + 1][cellZIndex];
		double clearance11 = clearanceSamples[cellXIndex + 1][cellZIndex + 1];
		double clearance01 = clearanceSamples[cellXIndex][cellZIndex + 1];
		boolean pocket00 = clearance00 >= 0.0D;
		boolean pocket10 = clearance10 >= 0.0D;
		boolean pocket11 = clearance11 >= 0.0D;
		boolean pocket01 = clearance01 >= 0.0D;
		boolean checker = pocket00 == pocket11 && pocket10 == pocket01 && pocket00 != pocket10;
		boolean diagonal00To11 = checker
				? (centerSamples[cellXIndex][cellZIndex] >= 0.0D) == pocket00
				: ((cellXIndex + cellZIndex) & 1) == 0;
		if (diagonal00To11)
		{
			addTriangleSegment(segments,
					new PointXZ[] { minimumCorner, maximumXCorner, maximumCorner },
					new double[] { clearance00, clearance10, clearance11 });
			addTriangleSegment(segments,
					new PointXZ[] { minimumCorner, maximumCorner, maximumZCorner },
					new double[] { clearance00, clearance11, clearance01 });
		}
		else
		{
			addTriangleSegment(segments,
					new PointXZ[] { minimumCorner, maximumXCorner, maximumZCorner },
					new double[] { clearance00, clearance10, clearance01 });
			addTriangleSegment(segments,
					new PointXZ[] { maximumXCorner, maximumCorner, maximumZCorner },
					new double[] { clearance10, clearance11, clearance01 });
		}
	}

	/**
	 * Adds one segment when a triangle contains exactly two sign-changing edges.
	 *
	 * @param segments destination for extracted contour segments
	 * @param triangle triangle points in normalized host-cell coordinates
	 * @param clearance signed clearance corresponding to each triangle point
	 */
	private static void addTriangleSegment(List<Segment> segments, PointXZ[] triangle, double[] clearance)
	{
		PointXZ[] crossings = new PointXZ[2];
		int crossingCount = 0;
		for (int triangleIndex = 0; triangleIndex < triangle.length; triangleIndex++)
		{
			int nextIndex = (triangleIndex + 1) % triangle.length;
			if ((clearance[triangleIndex] >= 0.0D) != (clearance[nextIndex] >= 0.0D))
			{
				crossings[crossingCount++] = intersection(triangle[triangleIndex], triangle[nextIndex],
						clearance[triangleIndex], clearance[nextIndex]);
			}
		}
		if (crossingCount == 2 && samePoint(crossings[0], crossings[1]) == false)
		{
			segments.add(new Segment(crossings[0], crossings[1]));
		}
	}

	/**
	 * Stitches unordered segments by matching endpoints and removes only collinear interior points.
	 *
	 * @param segments unordered contour segments
	 * @return stitched contour polylines
	 */
	private static List<List<PointXZ>> stitch(List<Segment> segments)
	{
		if (segments.isEmpty())
		{
			return Collections.emptyList();
		}
		boolean[] consumed = new boolean[segments.size()];
		List<List<PointXZ>> polylines = new ArrayList<List<PointXZ>>();
		for (int segmentIndex = 0; segmentIndex < segments.size(); segmentIndex++)
		{
			if (consumed[segmentIndex])
			{
				continue;
			}
			Segment seed = segments.get(segmentIndex);
			consumed[segmentIndex] = true;
			List<PointXZ> points = new ArrayList<PointXZ>();
			points.add(seed.start);
			points.add(seed.end);
			extend(points, segments, consumed, false);
			extend(points, segments, consumed, true);
			polylines.add(removeCollinearPoints(points));
		}
		return polylines;
	}

	/**
	 * Extends one end of a polyline until no unused segment shares its endpoint.
	 *
	 * @param points polyline being extended
	 * @param segments all extracted contour segments
	 * @param consumed flags identifying segments already assigned to a polyline
	 * @param prepend whether to extend the first rather than last point
	 */
	private static void extend(List<PointXZ> points, List<Segment> segments, boolean[] consumed, boolean prepend)
	{
		boolean extended;
		do
		{
			extended = false;
			PointXZ endpoint = points.get(prepend ? 0 : points.size() - 1);
			for (int segmentIndex = 0; segmentIndex < segments.size(); segmentIndex++)
			{
				if (consumed[segmentIndex])
				{
					continue;
				}
				Segment segment = segments.get(segmentIndex);
				PointXZ added = samePoint(endpoint, segment.start) ? segment.end
						: samePoint(endpoint, segment.end) ? segment.start : null;
				if (added != null)
				{
					consumed[segmentIndex] = true;
					points.add(prepend ? 0 : points.size(), added);
					extended = true;
					break;
				}
			}
		}
		while (extended);
	}

	/**
	 * Removes an interior point only when it lies on the straight segment between its neighbors.
	 *
	 * @param points stitched contour points
	 * @return contour points with redundant collinear entries removed
	 */
	private static List<PointXZ> removeCollinearPoints(List<PointXZ> points)
	{
		if (points.size() < 3)
		{
			return points;
		}
		List<PointXZ> reduced = new ArrayList<PointXZ>();
		reduced.add(points.get(0));
		for (int pointIndex = 1; pointIndex < points.size() - 1; pointIndex++)
		{
			PointXZ previous = reduced.get(reduced.size() - 1);
			PointXZ current = points.get(pointIndex);
			PointXZ next = points.get(pointIndex + 1);
			double cross = (current.x - previous.x) * (next.z - current.z)
					- (current.z - previous.z) * (next.x - current.x);
			double forwardProgress = (current.x - previous.x) * (next.x - current.x)
					+ (current.z - previous.z) * (next.z - current.z);
			if (Math.abs(cross) > COLLINEAR_EPSILON || forwardProgress < 0.0D)
			{
				reduced.add(current);
			}
		}
		reduced.add(points.get(points.size() - 1));
		return reduced;
	}

	/**
	 * Interpolates one signed zero crossing without changing the renderer's precision.
	 *
	 * @param first first edge point
	 * @param second second edge point
	 * @param firstClearance signed clearance at {@code first}
	 * @param secondClearance signed clearance at {@code second}
	 * @return interpolated zero-crossing point
	 */
	private static PointXZ intersection(PointXZ first, PointXZ second,
			double firstClearance, double secondClearance)
	{
		double denominator = firstClearance - secondClearance;
		double progress = Math.abs(denominator) <= INTERPOLATION_EPSILON ? 0.5D : firstClearance / denominator;
		progress = Math.max(0.0D, Math.min(1.0D, progress));
		return new PointXZ(first.x + (second.x - first.x) * progress,
				first.z + (second.z - first.z) * progress);
	}

	/**
	 * Compares two independently interpolated shared-edge points.
	 *
	 * @param first first point
	 * @param second second point
	 * @return whether both coordinates represent the same contour endpoint
	 */
	private static boolean samePoint(PointXZ first, PointXZ second)
	{
		return Math.abs(first.x - second.x) <= POINT_EPSILON
				&& Math.abs(first.z - second.z) <= POINT_EPSILON;
	}

	/** One zero-clearance segment extracted from a rendered switch triangle. */
	private static final class Segment
	{
		private final PointXZ start;
		private final PointXZ end;

		/**
		 * Creates an extracted contour segment.
		 *
		 * @param start first zero-crossing endpoint
		 * @param end second zero-crossing endpoint
		 */
		private Segment(PointXZ start, PointXZ end)
		{
			this.start = start;
			this.end = end;
		}
	}
}
