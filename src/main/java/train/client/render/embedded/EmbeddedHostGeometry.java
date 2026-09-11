package train.client.render.embedded;

import java.util.Arrays;

/**
 * Pure 2D geometry helpers for true embedded host-surface rendering.
 *
 * <p>This class intentionally has no Minecraft rendering dependencies. It clips
 * diagonal and curved trench polygons against a single captured host block's
 * normalized X/Z unit square.</p>
 */
public final class EmbeddedHostGeometry
{
	private static final double GEOMETRY_EPSILON = 0.0001D;
	private static final int MAXIMUM_CLIP_INTERSECTIONS = 4;

	/** Creates no instances; all geometry helpers are static. */
	private EmbeddedHostGeometry()
	{
	}

	/**
	 * Clips a polygon against one side of an arbitrary line.
	 *
	 * @param input polygon vertices in winding order
	 * @param inputCount number of valid entries in {@code input}
	 * @param line clipping line
	 * @param limit retained line-value boundary
	 * @param keepGreater whether values greater than the limit are retained
	 * @return clipped polygon
	 */
	public static ClipResult clipPolygonByLine(PointXZ[] input, int inputCount, LineXZ line, double limit, boolean keepGreater)
	{
		PointXZ[] output = new PointXZ[inputCount + MAXIMUM_CLIP_INTERSECTIONS];
		int outputCount = 0;
		for (int i = 0; i < inputCount; i++)
		{
			PointXZ start = input[i];
			PointXZ end = input[(i + 1) % inputCount];
			double startValue = line.value(start);
			double endValue = line.value(end);
			boolean startInside = keepGreater ? startValue >= limit - GEOMETRY_EPSILON : startValue <= limit + GEOMETRY_EPSILON;
			boolean endInside = keepGreater ? endValue >= limit - GEOMETRY_EPSILON : endValue <= limit + GEOMETRY_EPSILON;

			if (startInside && endInside)
			{
				output[outputCount++] = end;
			}
			else if (startInside)
			{
				output[outputCount++] = intersectLineSegment(limit, start, end, startValue, endValue);
			}
			else if (endInside)
			{
				output[outputCount++] = intersectLineSegment(limit, start, end, startValue, endValue);
				output[outputCount++] = end;
			}
		}
		return new ClipResult(output, outputCount);
	}

	/**
	 * Finds the portion of a line that crosses the normalized host cell.
	 *
	 * @param line line equation
	 * @param limit required line value
	 * @return clipped segment, or {@code null} when the line misses the cell
	 */
	public static SegmentXZ getLineSegmentInUnitSquare(LineXZ line, double limit)
	{
		PointXZ[] points = new PointXZ[MAXIMUM_CLIP_INTERSECTIONS];
		int count = 0;
		count = addLineIntersection(points, count, 0.0D, line.solveZ(limit, 0.0D));
		count = addLineIntersection(points, count, 1.0D, line.solveZ(limit, 1.0D));
		count = addLineIntersection(points, count, line.solveX(limit, 0.0D), 0.0D);
		count = addLineIntersection(points, count, line.solveX(limit, 1.0D), 1.0D);
		if (count < 2)
		{
			return null;
		}
		return new SegmentXZ(points[0], points[1]);
	}

	/**
	 * Clips a polygon to the normalized zero-to-one host-cell square.
	 *
	 * @param polygon polygon vertices in winding order
	 * @param count number of valid entries in {@code polygon}
	 * @return clipped polygon
	 */
	public static ClipResult clipPolygonToUnitSquare(PointXZ[] polygon, int count)
	{
		ClipResult clipped = clipPolygonByAxis(polygon, count, ClipAxis.X, 0.0D, true);
		clipped = clipPolygonByAxis(clipped.points, clipped.count, ClipAxis.X, 1.0D, false);
		clipped = clipPolygonByAxis(clipped.points, clipped.count, ClipAxis.Z, 0.0D, true);
		return clipPolygonByAxis(clipped.points, clipped.count, ClipAxis.Z, 1.0D, false);
	}

	/**
	 * Clips a line segment to the normalized zero-to-one host-cell square.
	 *
	 * @param start segment start
	 * @param end segment end
	 * @return clipped segment, or {@code null} when the segment misses the cell
	 */
	public static SegmentXZ clipLineSegmentToUnitSquare(PointXZ start, PointXZ end)
	{
		double directionX = end.x - start.x;
		double directionZ = end.z - start.z;
		ClipRange range = new ClipRange(0.0D, 1.0D);
		if (clipLineParameter(-directionX, start.x, range) == false
				|| clipLineParameter(directionX, 1.0D - start.x, range) == false
				|| clipLineParameter(-directionZ, start.z, range) == false
				|| clipLineParameter(directionZ, 1.0D - start.z, range) == false)
		{
			return null;
		}
		return new SegmentXZ(
				new PointXZ(start.x + directionX * range.min, start.z + directionZ * range.min),
				new PointXZ(start.x + directionX * range.max, start.z + directionZ * range.max));
	}

	/**
	 * Clips a polygon against one axis-aligned boundary.
	 *
	 * @param input polygon vertices
	 * @param inputCount number of valid input entries
	 * @param axis clipping axis
	 * @param limit retained coordinate boundary
	 * @param keepGreater whether coordinates greater than the limit are retained
	 * @return clipped polygon
	 */
	private static ClipResult clipPolygonByAxis(PointXZ[] input, int inputCount, ClipAxis axis, double limit, boolean keepGreater)
	{
		if (inputCount < 3)
		{
			return new ClipResult(input, inputCount);
		}
		PointXZ[] output = new PointXZ[inputCount + MAXIMUM_CLIP_INTERSECTIONS];
		int outputCount = 0;
		for (int i = 0; i < inputCount; i++)
		{
			PointXZ start = input[i];
			PointXZ end = input[(i + 1) % inputCount];
			double startValue = start.coordinate(axis);
			double endValue = end.coordinate(axis);
			boolean startInside = keepGreater ? startValue >= limit - GEOMETRY_EPSILON : startValue <= limit + GEOMETRY_EPSILON;
			boolean endInside = keepGreater ? endValue >= limit - GEOMETRY_EPSILON : endValue <= limit + GEOMETRY_EPSILON;
			if (startInside && endInside)
			{
				output[outputCount++] = end;
			}
			else if (startInside)
			{
				output[outputCount++] = intersectAxisSegment(axis, limit, start, end, startValue, endValue);
			}
			else if (endInside)
			{
				output[outputCount++] = intersectAxisSegment(axis, limit, start, end, startValue, endValue);
				output[outputCount++] = end;
			}
		}
		return new ClipResult(output, outputCount);
	}

	/**
	 * Adds a unique, in-bounds line intersection to an output array.
	 *
	 * @param points destination points
	 * @param count current valid point count
	 * @param x candidate X coordinate
	 * @param z candidate Z coordinate
	 * @return updated valid point count
	 */
	private static int addLineIntersection(PointXZ[] points, int count, double x, double z)
	{
		if (Double.isNaN(x) || Double.isNaN(z) || x < -GEOMETRY_EPSILON || x > 1.0D + GEOMETRY_EPSILON || z < -GEOMETRY_EPSILON || z > 1.0D + GEOMETRY_EPSILON)
		{
			return count;
		}
		x = Math.max(0.0D, Math.min(1.0D, x));
		z = Math.max(0.0D, Math.min(1.0D, z));
		for (int i = 0; i < count; i++)
		{
			if (Math.abs(points[i].x - x) < GEOMETRY_EPSILON && Math.abs(points[i].z - z) < GEOMETRY_EPSILON)
			{
				return count;
			}
		}
		if (count >= points.length)
		{
			return count;
		}
		points[count] = new PointXZ(x, z);
		return count + 1;
	}

	/**
	 * Interpolates the intersection of a segment with an arbitrary clipping line.
	 *
	 * @param limit required line value
	 * @param start segment start
	 * @param end segment end
	 * @param startValue line value at {@code start}
	 * @param endValue line value at {@code end}
	 * @return interpolated intersection
	 */
	private static PointXZ intersectLineSegment(double limit, PointXZ start, PointXZ end, double startValue, double endValue)
	{
		double intersectionProgress = (limit - startValue) / (endValue - startValue);
		intersectionProgress = Math.max(0.0D, Math.min(1.0D, intersectionProgress));
		return new PointXZ(
				start.x + (end.x - start.x) * intersectionProgress,
				start.z + (end.z - start.z) * intersectionProgress);
	}

	/**
	 * Interpolates the intersection of a segment with an axis-aligned boundary.
	 *
	 * @param axis clipping axis
	 * @param limit required axis coordinate
	 * @param start segment start
	 * @param end segment end
	 * @param startValue axis coordinate at {@code start}
	 * @param endValue axis coordinate at {@code end}
	 * @return interpolated intersection
	 */
	private static PointXZ intersectAxisSegment(ClipAxis axis, double limit, PointXZ start, PointXZ end, double startValue, double endValue)
	{
		double intersectionProgress = Math.abs(endValue - startValue) < GEOMETRY_EPSILON
				? 0.0D : (limit - startValue) / (endValue - startValue);
		intersectionProgress = Math.max(0.0D, Math.min(1.0D, intersectionProgress));
		return new PointXZ(
				start.x + (end.x - start.x) * intersectionProgress,
				start.z + (end.z - start.z) * intersectionProgress);
	}

	/**
	 * Narrows a parametric line range using one Liang-Barsky boundary.
	 *
	 * @param directionTerm signed direction term
	 * @param boundaryDistance signed boundary distance
	 * @param range mutable accepted parameter range
	 * @return whether any accepted range remains
	 */
	private static boolean clipLineParameter(double directionTerm, double boundaryDistance, ClipRange range)
	{
		if (Math.abs(directionTerm) < GEOMETRY_EPSILON)
		{
			return boundaryDistance >= -GEOMETRY_EPSILON;
		}
		double boundaryProgress = boundaryDistance / directionTerm;
		if (directionTerm < 0.0D)
		{
			if (boundaryProgress > range.max)
			{
				return false;
			}
			if (boundaryProgress > range.min)
			{
				range.min = boundaryProgress;
			}
		}
		else
		{
			if (boundaryProgress < range.min)
			{
				return false;
			}
			if (boundaryProgress < range.max)
			{
				range.max = boundaryProgress;
			}
		}
		return true;
	}

	private enum ClipAxis
	{
		X,
		Z
	}

	public static final class PointXZ
	{
		public final double x;
		public final double z;

		/**
		 * Creates a two-dimensional point.
		 *
		 * @param x X coordinate
		 * @param z Z coordinate
		 */
		public PointXZ(double x, double z)
		{
			this.x = x;
			this.z = z;
		}

		/**
		 * Returns the coordinate selected by an axis.
		 *
		 * @param axis coordinate axis
		 * @return X or Z coordinate
		 */
		private double coordinate(ClipAxis axis)
		{
			switch (axis)
			{
				case X:
					return this.x;
				case Z:
				default:
					return this.z;
			}
		}
	}

	public static final class LineXZ
	{
		private final double xCoefficient;
		private final double zCoefficient;
		private final double constant;

		/**
		 * Creates a line-value equation.
		 *
		 * @param xCoefficient X coefficient
		 * @param zCoefficient Z coefficient
		 * @param constant constant term
		 */
		public LineXZ(double xCoefficient, double zCoefficient, double constant)
		{
			this.xCoefficient = xCoefficient;
			this.zCoefficient = zCoefficient;
			this.constant = constant;
		}

		/**
		 * Evaluates this line equation at a point.
		 *
		 * @param point point to evaluate
		 * @return equation value
		 */
		private double value(PointXZ point)
		{
			return this.xCoefficient * point.x + this.zCoefficient * point.z + this.constant;
		}

		/**
		 * Solves the equation for X at a fixed Z coordinate.
		 *
		 * @param value required equation value
		 * @param z fixed Z coordinate
		 * @return solved X, or NaN when the equation has no X term
		 */
		private double solveX(double value, double z)
		{
			return Math.abs(this.xCoefficient) < GEOMETRY_EPSILON ? Double.NaN : (value - this.zCoefficient * z - this.constant) / this.xCoefficient;
		}

		/**
		 * Solves the equation for Z at a fixed X coordinate.
		 *
		 * @param value required equation value
		 * @param x fixed X coordinate
		 * @return solved Z, or NaN when the equation has no Z term
		 */
		private double solveZ(double value, double x)
		{
			return Math.abs(this.zCoefficient) < GEOMETRY_EPSILON ? Double.NaN : (value - this.xCoefficient * x - this.constant) / this.zCoefficient;
		}
	}

	public static final class SegmentXZ
	{
		public final PointXZ start;
		public final PointXZ end;

		/**
		 * Creates a clipped line segment.
		 *
		 * @param start segment start
		 * @param end segment end
		 */
		private SegmentXZ(PointXZ start, PointXZ end)
		{
			this.start = start;
			this.end = end;
		}
	}

	private static final class ClipRange
	{
		private double min;
		private double max;

		/**
		 * Creates a mutable parametric clip range.
		 *
		 * @param min minimum parameter
		 * @param max maximum parameter
		 */
		private ClipRange(double min, double max)
		{
			this.min = min;
			this.max = max;
		}
	}

	public static final class ClipResult
	{
		private final PointXZ[] points;
		private final int count;

		/**
		 * Creates an immutable clipped-polygon result.
		 *
		 * @param points source point array
		 * @param count number of valid source points
		 */
		private ClipResult(PointXZ[] points, int count)
		{
			this.points = Arrays.copyOf(points, count);
			this.count = count;
		}

		/**
		 * Returns an independent array containing the valid clipped polygon points.
		 *
		 * @return copied clipped points
		 */
		public PointXZ[] getPoints()
		{
			return Arrays.copyOf(points, count);
		}

		/**
		 * Returns the number of valid points in this clipped polygon.
		 *
		 * @return valid point count
		 */
		public int getCount()
		{
			return count;
		}
	}
}
