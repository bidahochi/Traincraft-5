package train.client.render.embedded;

import train.common.library.track.EnumCoreTrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Builds fixed terrain-cut shapes from the OBJ models used to draw complex rails.
 * Switch shapes include the top rail paths from both switch positions, so changing
 * the visible switch position does not move the terrain. S-curves and crossings use
 * their one visible model through the same cached path-building code.
 */
public final class EmbeddedSwitchTerrainProfiles
{
	/**
	 * Distance, in blocks, cut on each side of a rail's center line. It was matched
	 * by eye to the existing straight-track trench, then reduced from 0.075 until
	 * switches and straight tracks had the same outer margin. The final 0.063 value
	 * preserves smooth cuts while keeping neighboring rails separate.
	 */
	private static final double CLEARANCE_HALF_WIDTH = 0.063D;
	/**
	 * Widest model face, in blocks, accepted as the top of a rail. This includes the
	 * narrowing switch blades, but rejects wider sleepers, plates, and moving parts.
	 * Those wider parts previously caused repeated bumps along the trench.
	 */
	private static final double MAX_CROWN_WIDTH = 0.105D;
	/**
	 * Shortest rail-top face kept from the OBJ, in blocks. Faces below this length
	 * were nails or tiny pieces created by the model exporter. Real switch-blade and
	 * crossing pieces were longer.
	 */
	private static final double MIN_FACE_LENGTH = 0.035D;
	/**
	 * Minimum amount that a face must point up or down to count as a rail top. The
	 * 0.55 limit keeps sloped switch-blade tops but rejects mostly vertical rail
	 * sides. Checking both up and down also handles OBJ faces whose points are listed
	 * in reverse order.
	 */
	private static final double MIN_UP_NORMAL = 0.55D;
	/**
	 * Maximum distance below the model's highest point at which a face can count as
	 * a rail top. Rail height changes slightly around switch blades and crossings,
	 * so requiring one exact height loses real rail pieces. A larger range starts to
	 * include the parts directly below the rail top.
	 */
	private static final double CROWN_HEIGHT_BAND = 0.020D;
	/**
	 * Largest gap, in model coordinates, that may be joined between two rail-top
	 * pieces. It bridges small gaps between separately exported model parts, but is
	 * too short to join the next rail.
	 */
	private static final double ENDPOINT_MERGE_DISTANCE = 0.085D;
	/**
	 * How closely two nearby pieces must point in the same direction before they are
	 * joined. A value of 0.65 allows a bend of about 49 degrees, enough for a rail
	 * curve across a model seam but not for a crosswise nail.
	 */
	private static final double ENDPOINT_MERGE_MIN_DIRECTION_DOT = 0.65D;
	/**
	 * Minimum total length, in blocks, for a connected set of model pieces. Sets
	 * shorter than 0.30 were loose hardware or exporter leftovers. Actual switch
	 * blades and crossing rails form longer connected sets.
	 */
	private static final double MIN_COMPONENT_LENGTH = 0.30D;
	/**
	 * Sideways distance at which a model rail is treated as a copy of a known-good
	 * straight rail. The limit is wider than small OBJ alignment errors, but narrower
	 * than the gap between neighboring rails.
	 */
	private static final double AUTHORED_CORRIDOR_DUPLICATE_DISTANCE = 0.10D;
	/**
	 * How closely a model rail must follow a known-good straight rail before the copy
	 * is removed. A value of 0.92 allows about 23 degrees of difference. This removes
	 * nearly parallel copies while keeping a real branch as it leaves the straight.
	 */
	private static final double AUTHORED_CORRIDOR_MIN_DIRECTION_DOT = 0.92D;
	/**
	 * Three small smoothing passes removed visible ridges where exported faces meet.
	 * More passes made no useful visual difference because each point's movement is
	 * limited by {@link #MAX_MODEL_PATH_FAIRING_SHIFT}.
	 */
	private static final int MODEL_PATH_FAIRING_PASSES = 3;
	/**
	 * Farthest a smoothed point may move sideways from the model rail, in blocks.
	 * One hundredth of a block hides small model seams without creating the broad,
	 * unwanted curves produced by the earlier unrestricted smoothing.
	 */
	private static final double MAX_MODEL_PATH_FAIRING_SHIFT = 0.010D;
	/**
	 * Number of terrain-cut samples per model-space block. A value of 64 makes each
	 * sample 1/64 of a block wide and places about four samples across the 0.063-block
	 * cut width. This is fine enough for a smooth edge. The completed result is cached
	 * instead of being rebuilt every frame.
	 */
	private static final int MASK_RESOLUTION = 64;
	/**
	 * Maximum endpoint difference when removing duplicate rail-top pieces from the
	 * active and inactive models. It allows for tiny exporter alignment errors, but
	 * is much smaller than the width of a rail.
	 */
	private static final double CROWN_SEGMENT_DUPLICATE_TOLERANCE = 0.018D;
	/* Stores the model X and Z lookup-grid positions together in one long value. */
	private static final int BUCKET_X_SHIFT = 32;
	private static final long UNSIGNED_INTEGER_MASK = 0xFFFFFFFFL;
	private static final int DEGREES_PER_QUARTER_TURN = 90;
	/**
	 * The 4x11 model combines a central switch with straight model parts drawn later.
	 * These coordinates come from the center lines of those visible straight rails.
	 * Their Z endpoints stop where the model parts meet, allowing the extracted curves
	 * to join them without moving or smoothing the known-good straight sections. The
	 * left-handed version mirrors the two positive branch X positions.
	 */
	private static final double MEDIUM_PARALLEL_MAIN_LEFT_X = -0.31D;
	private static final double MEDIUM_PARALLEL_MAIN_RIGHT_X = 0.31D;
	private static final double MEDIUM_PARALLEL_RIGHT_BRANCH_LEFT_X = 2.67D;
	private static final double MEDIUM_PARALLEL_RIGHT_BRANCH_RIGHT_X = 3.33D;
	private static final double MEDIUM_PARALLEL_MODEL_START_Z = -8.5D;
	private static final double MEDIUM_PARALLEL_BRANCH_JOIN_Z = -6.85D;
	private static final double MEDIUM_PARALLEL_BRANCH_EXIT_Z = -0.65D;
	private static final double MEDIUM_PARALLEL_MODEL_END_Z = 0.5D;
	private static final Map<String, Profile> CACHE = new HashMap<String, Profile>();
	private static final Map<EnumCoreTrack, Profile> CORE_CACHE = new EnumMap<EnumCoreTrack, Profile>(EnumCoreTrack.class);

	/** Creates no instances; model-derived terrain profiles are cached statically. */
	private EmbeddedSwitchTerrainProfiles()
	{
	}

	/**
	 * Returns the cached terrain-cut profile for a supported model-derived track core.
	 *
	 * @param coreTrack model-derived track core to resolve
	 * @return resolved profile, or {@code null} when the core has no supported model profile
	 */
	public static Profile get(EnumCoreTrack coreTrack)
	{
		if (coreTrack == null)
		{
			return null;
		}
		Profile cachedCore = CORE_CACHE.get(coreTrack);
		if (cachedCore != null)
		{
			return cachedCore == Profile.EMPTY ? null : cachedCore;
		}
		Spec spec = Spec.forCore(coreTrack);
		if (spec == null)
		{
			return null;
		}
		Profile profile = CACHE.get(spec.key);
		if (profile == null)
		{
			profile = build(spec);
			CACHE.put(spec.key, profile);
		}
		CORE_CACHE.put(coreTrack, profile);
		return profile.isEmpty() ? null : profile;
	}

	/**
	 * Loads and combines the resources described by a model-derived track specification.
	 *
	 * @param spec model resources, transform, and authored corridors
	 * @return built profile, or the empty profile when loading fails
	 */
	private static Profile build(Spec spec)
	{
		List<Face> activeFaces = loadFaces(spec.activeResource);
		List<Face> inactiveFaces = spec.activeResource.equals(spec.inactiveResource)
				? activeFaces : loadFaces(spec.inactiveResource);
		if (activeFaces == null || inactiveFaces == null)
		{
			return Profile.EMPTY;
		}
		if (activeFaces == inactiveFaces)
		{
			return buildProfile(activeFaces, spec.transform, spec.authoredRoutes);
		}
		List<Face> faces = new ArrayList<Face>(activeFaces.size() + inactiveFaces.size());
		faces.addAll(activeFaces);
		faces.addAll(inactiveFaces);
		return buildProfile(faces, spec.transform, spec.authoredRoutes);
	}

	/**
	 * Builds a profile from extracted model crowns and authoritative route segments.
	 *
	 * @param faces parsed model faces
	 * @param transform model-to-world transform
	 * @param authoredRoutes authoritative corridors added before extracted segments
	 * @return built profile, possibly empty
	 */
	private static Profile buildProfile(List<Face> faces, Transform transform, List<RawSegment> authoredRoutes)
	{
		if (faces.isEmpty() && authoredRoutes.isEmpty())
		{
			return Profile.EMPTY;
		}
		double modelTop = Double.NEGATIVE_INFINITY;
		for (Face face : faces)
		{
			modelTop = Math.max(modelTop, face.maxY());
		}
		List<RawSegment> raw = new ArrayList<RawSegment>();
		for (Face face : faces)
		{
			RawSegment segment = extractCrownSegment(face, modelTop);
			segment = trimAgainstAuthoredCorridors(segment, authoredRoutes);
			if (segment != null && containsEquivalent(raw, segment) == false)
			{
				raw.add(segment);
			}
		}
		List<RouteSegment> routes = buildModelFollowingRoutes(raw, authoredRoutes);
		return routes.isEmpty() ? Profile.EMPTY : new Profile(transform, routes);
	}

	/**
	 * Removes portions of an extracted segment duplicated by authored corridors.
	 *
	 * @param candidate extracted model segment
	 * @param authoredRoutes authoritative corridors
	 * @return remaining candidate portion, or {@code null} when fully covered
	 */
	public static RawSegment trimAgainstAuthoredCorridors(RawSegment candidate, List<RawSegment> authoredRoutes)
	{
		if (candidate == null || authoredRoutes == null)
		{
			return candidate;
		}
		RawSegment result = candidate;
		for (RawSegment corridor : authoredRoutes)
		{
			result = trimAgainstAuthoredCorridor(result, corridor);
			if (result == null)
			{
				return null;
			}
		}
		return result;
	}

	/**
	 * Trims one extracted segment against one sufficiently parallel authored corridor.
	 *
	 * @param candidate extracted model segment
	 * @param corridor authoritative corridor
	 * @return remaining candidate portion, or {@code null} when fully covered
	 */
	private static RawSegment trimAgainstAuthoredCorridor(RawSegment candidate, RawSegment corridor)
	{
		double candidateX = candidate.endX - candidate.startX;
		double candidateZ = candidate.endZ - candidate.startZ;
		double candidateLength = Math.sqrt(candidateX * candidateX + candidateZ * candidateZ);
		if (candidateLength <= 1.0E-12D)
		{
			return null;
		}
		double centerX = (candidate.startX + candidate.endX) * 0.5D;
		double centerZ = (candidate.startZ + candidate.endZ) * 0.5D;
		double corridorX = corridor.endX - corridor.startX;
		double corridorZ = corridor.endZ - corridor.startZ;
		double corridorLengthSquared = corridorX * corridorX + corridorZ * corridorZ;
		if (corridorLengthSquared <= 1.0E-12D)
		{
			return candidate;
		}
		double corridorLength = Math.sqrt(corridorLengthSquared);
		double dot = Math.abs((candidateX * corridorX + candidateZ * corridorZ)
				/ (candidateLength * corridorLength));
		if (dot < AUTHORED_CORRIDOR_MIN_DIRECTION_DOT)
		{
			return candidate;
		}
		double centerProgress = ((centerX - corridor.startX) * corridorX
				+ (centerZ - corridor.startZ) * corridorZ) / corridorLengthSquared;
		double centerLineX = corridor.startX + centerProgress * corridorX;
		double centerLineZ = corridor.startZ + centerProgress * corridorZ;
		if (distanceSquared(centerX, centerZ, centerLineX, centerLineZ)
				> AUTHORED_CORRIDOR_DUPLICATE_DISTANCE * AUTHORED_CORRIDOR_DUPLICATE_DISTANCE)
		{
			return candidate;
		}
		double startProgress = ((candidate.startX - corridor.startX) * corridorX
				+ (candidate.startZ - corridor.startZ) * corridorZ) / corridorLengthSquared;
		double endProgress = ((candidate.endX - corridor.startX) * corridorX
				+ (candidate.endZ - corridor.startZ) * corridorZ) / corridorLengthSquared;
		boolean startInside = startProgress >= 0.0D && startProgress <= 1.0D;
		boolean endInside = endProgress >= 0.0D && endProgress <= 1.0D;
		if (startInside && endInside)
		{
			return null;
		}
		if (startInside == endInside)
		{
			return candidate;
		}
		boolean crossesStart = Math.min(startProgress, endProgress) < 0.0D;
		double joinX = crossesStart ? corridor.startX : corridor.endX;
		double joinZ = crossesStart ? corridor.startZ : corridor.endZ;
		return startInside
				? new RawSegment(joinX, joinZ, candidate.endX, candidate.endZ)
				: new RawSegment(candidate.startX, candidate.startZ, joinX, joinZ);
	}

	/**
	 * Extracts the longitudinal center line from one narrow, upward-facing crown face.
	 *
	 * @param face candidate model face
	 * @param modelTop greatest model Y used to reject lower geometry
	 * @return extracted crown segment, or {@code null} when the face is unsuitable
	 */
	public static RawSegment extractCrownSegment(Face face, double modelTop)
	{
		if (face == null || face.points.size() < 3 || face.maxY() < modelTop - CROWN_HEIGHT_BAND)
		{
			return null;
		}
		double normalY = Math.abs(face.normalY());
		if (normalY < MIN_UP_NORMAL)
		{
			return null;
		}
		double centerX = 0.0D;
		double centerZ = 0.0D;
		for (Point3 point : face.points)
		{
			centerX += point.x;
			centerZ += point.z;
		}
		centerX /= face.points.size();
		centerZ /= face.points.size();
		double covarianceXX = 0.0D;
		double covarianceXZ = 0.0D;
		double covarianceZZ = 0.0D;
		for (Point3 point : face.points)
		{
			double offsetX = point.x - centerX;
			double offsetZ = point.z - centerZ;
			covarianceXX += offsetX * offsetX;
			covarianceXZ += offsetX * offsetZ;
			covarianceZZ += offsetZ * offsetZ;
		}
		double angle = 0.5D * Math.atan2(2.0D * covarianceXZ, covarianceXX - covarianceZZ);
		double axisX = Math.cos(angle);
		double axisZ = Math.sin(angle);
		double sideX = -axisZ;
		double sideZ = axisX;
		double minAlong = Double.POSITIVE_INFINITY;
		double maxAlong = Double.NEGATIVE_INFINITY;
		double minAcross = Double.POSITIVE_INFINITY;
		double maxAcross = Double.NEGATIVE_INFINITY;
		for (Point3 point : face.points)
		{
			double offsetX = point.x - centerX;
			double offsetZ = point.z - centerZ;
			double distanceAlongAxis = offsetX * axisX + offsetZ * axisZ;
			double distanceAcrossAxis = offsetX * sideX + offsetZ * sideZ;
			minAlong = Math.min(minAlong, distanceAlongAxis);
			maxAlong = Math.max(maxAlong, distanceAlongAxis);
			minAcross = Math.min(minAcross, distanceAcrossAxis);
			maxAcross = Math.max(maxAcross, distanceAcrossAxis);
		}
		double length = maxAlong - minAlong;
		double width = maxAcross - minAcross;
		if (length < MIN_FACE_LENGTH || width > MAX_CROWN_WIDTH || width > length)
		{
			return null;
		}
		double acrossCenter = (minAcross + maxAcross) * 0.5D;
		double baseX = centerX + sideX * acrossCenter;
		double baseZ = centerZ + sideZ * acrossCenter;
		return new RawSegment(baseX + axisX * minAlong, baseZ + axisZ * minAlong,
				baseX + axisX * maxAlong, baseZ + axisZ * maxAlong);
	}

	/**
	 * Tests whether a raw segment list already contains an equivalent segment.
	 *
	 * @param segments previously accepted segments
	 * @param candidate segment to compare
	 * @return whether an equivalent segment is already present
	 */
	private static boolean containsEquivalent(List<RawSegment> segments, RawSegment candidate)
	{
		for (RawSegment segment : segments)
		{
			if (segment.equivalent(candidate, CROWN_SEGMENT_DUPLICATE_TOLERANCE))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Connects authored and extracted segments, preserving authored nodes while fairing model paths.
	 *
	 * @param raw extracted segments
	 * @param authoredRoutes authoritative route segments
	 * @return connected route segments
	 */
	private static List<RouteSegment> buildModelFollowingRoutes(List<RawSegment> raw,
			List<RawSegment> authoredRoutes)
	{
		if (raw.isEmpty() && authoredRoutes.isEmpty())
		{
			return Collections.emptyList();
		}
		Graph graph = new Graph();
		for (RawSegment segment : authoredRoutes)
		{
			graph.add(segment, true);
		}
		for (RawSegment segment : raw)
		{
			graph.add(segment, false);
		}
		graph.removeShortComponents();
		return graph.traceModelPaths();
	}

	/**
	 * Parses one optional OBJ resource atomically.
	 *
	 * @param resource classpath resource path
	 * @return all faces from a completely parsed resource, or {@code null} when
	 *         the resource is absent or malformed so the caller can use the
	 *         established terrain fallback without publishing partial routes
	 */
	private static List<Face> loadFaces(String resource)
	{
		InputStream stream = EmbeddedSwitchTerrainProfiles.class.getClassLoader().getResourceAsStream(resource);
		return parseFaces(stream);
	}

	/**
	 * Parses vertices and polygon faces from an OBJ stream atomically.
	 *
	 * @param stream OBJ input stream, or {@code null}
	 * @return parsed faces, or {@code null} when the stream is absent or malformed
	 */
	private static List<Face> parseFaces(InputStream stream)
	{
		if (stream == null)
		{
			return null;
		}
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8)))
		{
			List<Point3> vertices = new ArrayList<Point3>();
			List<Face> parsedFaces = new ArrayList<Face>();
			String line;
			while ((line = reader.readLine()) != null)
			{
				line = line.trim();
				if (line.startsWith("v "))
				{
					String[] parts = line.split("\\s+");
					if (parts.length >= 4)
					{
						vertices.add(new Point3(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), Double.parseDouble(parts[3])));
					}
				}
				else if (line.startsWith("f "))
				{
					String[] parts = line.split("\\s+");
					List<Point3> points = new ArrayList<Point3>();
					for (int i = 1; i < parts.length; i++)
					{
						String indexText = parts[i].split("/")[0];
						int index = Integer.parseInt(indexText);
						index = index < 0 ? vertices.size() + index : index - 1;
						if (index >= 0 && index < vertices.size())
						{
							points.add(vertices.get(index));
						}
					}
					if (points.size() >= 3)
					{
						parsedFaces.add(new Face(points));
					}
				}
			}
			return parsedFaces;
		}
		catch (IOException failure)
		{
			return null;
		}
		catch (NumberFormatException failure)
		{
			return null;
		}
	}

	/**
	 * Fixed terrain-cut result for one switch family and its left or right version.
	 *
	 * <p>{@code routes} are connected center lines for the rail tops, measured in OBJ
	 * model-space blocks. The cached mask combines the terrain cut around every route
	 * at {@link #MASK_RESOLUTION}. It fills only tiny patches of terrain trapped inside
	 * the cut. {@code contours} hold the outside edges used to draw trench walls.
	 * Keeping these together ensures the top surface, trench floor, and walls all use
	 * the same switch shape.</p>
	 */
	public static final class Profile
	{
		private static final Profile EMPTY = new Profile(Transform.IDENTITY, Collections.<RouteSegment>emptyList());
		private final Transform transform;
		private final List<RouteSegment> routes;
		private final List<RouteSegment> contours;
		private final double minX;
		private final double minZ;
		private final int width;
		private final int depth;
		private final boolean[] mask;
		private final boolean[] filledIslands;
		private final Map<Long, List<RouteSegment>> routeBuckets;

		/**
		 * Creates a rasterized terrain profile from connected model-space routes.
		 *
		 * @param transform model/world coordinate transform
		 * @param routes connected route center lines
		 */
		private Profile(Transform transform, List<RouteSegment> routes)
		{
			this.transform = transform;
			this.routes = Collections.unmodifiableList(new ArrayList<RouteSegment>(routes));
			if (routes.isEmpty())
			{
				minX = minZ = 0.0D;
				width = depth = 0;
				mask = new boolean[0];
				filledIslands = new boolean[0];
				contours = Collections.emptyList();
				routeBuckets = Collections.emptyMap();
				return;
			}
			double lowX = Double.POSITIVE_INFINITY;
			double lowZ = Double.POSITIVE_INFINITY;
			double highX = Double.NEGATIVE_INFINITY;
			double highZ = Double.NEGATIVE_INFINITY;
			for (RouteSegment route : routes)
			{
				lowX = Math.min(lowX, Math.min(route.startX, route.endX) - CLEARANCE_HALF_WIDTH);
				lowZ = Math.min(lowZ, Math.min(route.startZ, route.endZ) - CLEARANCE_HALF_WIDTH);
				highX = Math.max(highX, Math.max(route.startX, route.endX) + CLEARANCE_HALF_WIDTH);
				highZ = Math.max(highZ, Math.max(route.startZ, route.endZ) + CLEARANCE_HALF_WIDTH);
			}
			minX = Math.floor(lowX * MASK_RESOLUTION) / MASK_RESOLUTION - 1.0D / MASK_RESOLUTION;
			minZ = Math.floor(lowZ * MASK_RESOLUTION) / MASK_RESOLUTION - 1.0D / MASK_RESOLUTION;
			width = Math.max(1, (int)Math.ceil((highX - minX) * MASK_RESOLUTION) + 1);
			depth = Math.max(1, (int)Math.ceil((highZ - minZ) * MASK_RESOLUTION) + 1);
			mask = new boolean[width * depth];
			filledIslands = new boolean[width * depth];
			rasterizeRoutes();
			fillTinyIslands();
			contours = Collections.unmodifiableList(buildContours());
			routeBuckets = buildRouteBuckets();
		}

		/**
		 * Reports whether this profile has no terrain-cut routes.
		 *
		 * @return whether the profile is empty
		 */
		public boolean isEmpty()
		{
			return routes.isEmpty();
		}

		/**
		 * Returns whether an OBJ model point is inside the combined terrain cut.
		 *
		 * @param modelX model-space X
		 * @param modelZ model-space Z
		 * @return whether the point is inside the rasterized cut
		 */
		public boolean contains(double modelX, double modelZ)
		{
			int x = (int)Math.floor((modelX - minX) * MASK_RESOLUTION);
			int z = (int)Math.floor((modelZ - minZ) * MASK_RESOLUTION);
			return x >= 0 && x < width && z >= 0 && z < depth && mask[z * width + x];
		}

		/**
		 * Returns whether a block offset from the parent track is inside the combined terrain cut.
		 *
		 * @param facing placed track facing
		 * @param worldOffsetX parent-relative world X
		 * @param worldOffsetZ parent-relative world Z
		 * @return whether the transformed point is inside the cut
		 */
		public boolean containsWorld(int facing, double worldOffsetX, double worldOffsetZ)
		{
			return contains(transform.modelX(facing, worldOffsetX, worldOffsetZ),
					transform.modelZ(facing, worldOffsetX, worldOffsetZ));
		}

		/**
		 * Returns distance from the cut edge in blocks. The result is positive inside
		 * the combined cut or a filled tiny terrain patch, zero at the edge, and negative
		 * outside.
		 *
		 * @param facing placed track facing
		 * @param worldOffsetX parent-relative world X
		 * @param worldOffsetZ parent-relative world Z
		 * @return signed clearance in blocks
		 */
		public double clearanceWorld(int facing, double worldOffsetX, double worldOffsetZ)
		{
			return clearance(transform.modelX(facing, worldOffsetX, worldOffsetZ),
					transform.modelZ(facing, worldOffsetX, worldOffsetZ));
		}

		/**
		 * Returns signed distance from the combined terrain-cut boundary at one model-space point: positive inside the cut
		 * or a deliberately filled tiny island, zero at the edge, and negative outside; points without nearby routes
		 * return negative one block.
		 *
		 * @param modelX model-space X
		 * @param modelZ model-space Z
		 * @return signed clearance in blocks
		 */
		private double clearance(double modelX, double modelZ)
		{
			List<RouteSegment> candidates = routeBuckets.get(bucketKey((int)Math.floor(modelX), (int)Math.floor(modelZ)));
			if (candidates == null || candidates.isEmpty())
			{
				return -1.0D;
			}
			double nearest = Double.POSITIVE_INFINITY;
			for (RouteSegment route : candidates)
			{
				nearest = Math.min(nearest, Math.sqrt(route.distanceSquared(modelX, modelZ)));
			}
			double clearance = CLEARANCE_HALF_WIDTH - nearest;
			if (clearance < 0.0D && isFilledIsland(modelX, modelZ))
			{
				// The raster pass fills only small, enclosed terrain components.
				// Giving those cells a positive sign removes the internal wall while
				// retaining continuous distance boundaries everywhere else.
				return 1.0D / MASK_RESOLUTION;
			}
			return clearance;
		}

		/**
		 * Tests whether a model point lies in a deliberately filled tiny island.
		 *
		 * @param modelX model-space X
		 * @param modelZ model-space Z
		 * @return whether the point lies in a filled island cell
		 */
		private boolean isFilledIsland(double modelX, double modelZ)
		{
			int x = (int)Math.floor((modelX - minX) * MASK_RESOLUTION);
			int z = (int)Math.floor((modelZ - minZ) * MASK_RESOLUTION);
			return x >= 0 && x < width && z >= 0 && z < depth && filledIslands[z * width + x];
		}

		/**
		 * Indexes routes into integer model-space cells for clearance queries.
		 *
		 * @return route buckets keyed by integer X/Z cell
		 */
		private Map<Long, List<RouteSegment>> buildRouteBuckets()
		{
			Map<Long, List<RouteSegment>> buckets = new HashMap<Long, List<RouteSegment>>();
			double lookupPadding = CLEARANCE_HALF_WIDTH;
			for (RouteSegment route : routes)
			{
				int lowX = (int)Math.floor(Math.min(route.startX, route.endX) - lookupPadding);
				int highX = (int)Math.floor(Math.max(route.startX, route.endX) + lookupPadding);
				int lowZ = (int)Math.floor(Math.min(route.startZ, route.endZ) - lookupPadding);
				int highZ = (int)Math.floor(Math.max(route.startZ, route.endZ) + lookupPadding);
				for (int z = lowZ; z <= highZ; z++)
				{
					for (int x = lowX; x <= highX; x++)
					{
						Long key = bucketKey(x, z);
						List<RouteSegment> bucket = buckets.get(key);
						if (bucket == null)
						{
							bucket = new ArrayList<RouteSegment>();
							buckets.put(key, bucket);
						}
						bucket.add(route);
					}
				}
			}
			return buckets;
		}

		/**
		 * Packs two signed integer bucket coordinates into one key.
		 *
		 * @param x bucket X
		 * @param z bucket Z
		 * @return packed bucket key
		 */
		private static long bucketKey(int x, int z)
		{
			return ((long)x << BUCKET_X_SHIFT) ^ ((long)z & UNSIGNED_INTEGER_MASK);
		}

		/** Rasterizes route clearance into the profile mask. */
		private void rasterizeRoutes()
		{
			double maxDistanceSquared = CLEARANCE_HALF_WIDTH * CLEARANCE_HALF_WIDTH;
			for (RouteSegment route : routes)
			{
				double lowX = Math.min(route.startX, route.endX) - CLEARANCE_HALF_WIDTH;
				double highX = Math.max(route.startX, route.endX) + CLEARANCE_HALF_WIDTH;
				double lowZ = Math.min(route.startZ, route.endZ) - CLEARANCE_HALF_WIDTH;
				double highZ = Math.max(route.startZ, route.endZ) + CLEARANCE_HALF_WIDTH;
				int startX = Math.max(0, (int)Math.floor((lowX - minX) * MASK_RESOLUTION) - 1);
				int endX = Math.min(width - 1, (int)Math.ceil((highX - minX) * MASK_RESOLUTION) + 1);
				int startZ = Math.max(0, (int)Math.floor((lowZ - minZ) * MASK_RESOLUTION) - 1);
				int endZ = Math.min(depth - 1, (int)Math.ceil((highZ - minZ) * MASK_RESOLUTION) + 1);
				for (int z = startZ; z <= endZ; z++)
				{
					double sampleZ = minZ + (z + 0.5D) / MASK_RESOLUTION;
					for (int x = startX; x <= endX; x++)
					{
						double sampleX = minX + (x + 0.5D) / MASK_RESOLUTION;
						if (route.distanceSquared(sampleX, sampleZ) <= maxDistanceSquared)
						{
							mask[z * width + x] = true;
						}
					}
				}
			}
		}

		/** Fills only small enclosed mask holes that would create stray internal walls. */
		private void fillTinyIslands()
		{
			boolean[] visited = new boolean[mask.length];
			// Four times half-width squared is the area of a square one clearance
			// diameter wide. Enclosed components no larger than that are raster artifacts,
			// not useful terrain between distinct tracks. Four cells is the stable floor
			// for very small clearances or future lower mask resolutions.
			int maximumIsland = Math.max(4, (int)Math.ceil(4.0D * CLEARANCE_HALF_WIDTH * CLEARANCE_HALF_WIDTH
					* MASK_RESOLUTION * MASK_RESOLUTION));
			for (int index = 0; index < mask.length; index++)
			{
				if (mask[index] || visited[index])
				{
					continue;
				}
				List<Integer> component = new ArrayList<Integer>();
				ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
				queue.add(index);
				visited[index] = true;
				boolean boundary = false;
				while (queue.isEmpty() == false)
				{
					int current = queue.removeFirst();
					component.add(current);
					int gridX = current % width;
					int gridZ = current / width;
					if (gridX == 0 || gridZ == 0 || gridX == width - 1 || gridZ == depth - 1)
					{
						boundary = true;
					}
					int[] neighbors = { current - 1, current + 1, current - width, current + width };
					for (int neighbor : neighbors)
					{
						if (neighbor < 0 || neighbor >= mask.length || visited[neighbor] || mask[neighbor])
						{
							continue;
						}
						int neighborX = neighbor % width;
						int neighborZ = neighbor / width;
						if (Math.abs(neighborX - gridX) + Math.abs(neighborZ - gridZ) != 1)
						{
							continue;
						}
						visited[neighbor] = true;
						queue.add(neighbor);
					}
				}
				if (boundary == false && component.size() <= maximumIsland)
				{
					for (Integer cell : component)
					{
						mask[cell] = true;
						filledIslands[cell] = true;
					}
				}
			}
		}

		/**
		 * Extracts axis-aligned boundaries around the rasterized cut mask.
		 *
		 * @return merged contour segments
		 */
		private List<RouteSegment> buildContours()
		{
			List<RouteSegment> result = new ArrayList<RouteSegment>();
			double cell = 1.0D / MASK_RESOLUTION;
			for (int z = 0; z < depth; z++)
			{
				for (int x = 0; x < width; x++)
				{
					if (mask[z * width + x] == false)
					{
						continue;
					}
					double x0 = minX + x * cell;
					double z0 = minZ + z * cell;
					double x1 = x0 + cell;
					double z1 = z0 + cell;
					if (filled(x - 1, z) == false)
					{
						result.add(new RouteSegment(x0, z1, x0, z0));
					}
					if (filled(x + 1, z) == false)
					{
						result.add(new RouteSegment(x1, z0, x1, z1));
					}
					if (filled(x, z - 1) == false)
					{
						result.add(new RouteSegment(x0, z0, x1, z0));
					}
					if (filled(x, z + 1) == false)
					{
						result.add(new RouteSegment(x1, z1, x0, z1));
					}
				}
			}
			return mergeCollinear(result);
		}

		/**
		 * Tests one raster cell with out-of-bounds cells treated as empty.
		 *
		 * @param x mask X index
		 * @param z mask Z index
		 * @return whether the mask cell is filled
		 */
		private boolean filled(int x, int z)
		{
			return x >= 0 && x < width && z >= 0 && z < depth && mask[z * width + x];
		}
	}

	/**
	 * Merges adjacent collinear contour segments without changing their path.
	 *
	 * @param source unmerged contour segments
	 * @return merged contour segments
	 */
	private static List<RouteSegment> mergeCollinear(List<RouteSegment> source)
	{
		List<RouteSegment> result = new ArrayList<RouteSegment>();
		for (RouteSegment segment : source)
		{
			boolean merged = false;
			for (int i = 0; i < result.size(); i++)
			{
				RouteSegment existing = result.get(i);
				RouteSegment combined = existing.mergeAxisAligned(segment);
				if (combined != null)
				{
					result.set(i, combined);
					merged = true;
					break;
				}
			}
			if (merged == false)
			{
				result.add(segment);
			}
		}
		return result;
	}

	public static final class RouteSegment
	{
		public final double startX;
		public final double startZ;
		public final double endX;
		public final double endZ;
		/**
		 * Creates one model-space route segment.
		 *
		 * @param startX start X
		 * @param startZ start Z
		 * @param endX end X
		 * @param endZ end Z
		 */
		private RouteSegment(double startX, double startZ, double endX, double endZ)
		{
			this.startX = startX;
			this.startZ = startZ;
			this.endX = endX;
			this.endZ = endZ;
		}
		/**
		 * Computes squared distance from a point to this finite segment.
		 *
		 * @param x point X
		 * @param z point Z
		 * @return squared distance
		 */
		private double distanceSquared(double x, double z)
		{
			double segmentX = endX - startX;
			double segmentZ = endZ - startZ;
			double lengthSquared = segmentX * segmentX + segmentZ * segmentZ;
			double progress = lengthSquared <= 1.0E-12D ? 0.0D
					: ((x - startX) * segmentX + (z - startZ) * segmentZ) / lengthSquared;
			progress = Math.max(0.0D, Math.min(1.0D, progress));
			double closestX = startX + segmentX * progress;
			double closestZ = startZ + segmentZ * progress;
			double differenceX = x - closestX;
			double differenceZ = z - closestZ;
			return differenceX * differenceX + differenceZ * differenceZ;
		}
		/**
		 * Merges an exactly adjoining axis-aligned segment.
		 *
		 * @param other candidate adjoining segment
		 * @return combined segment, or {@code null} when they cannot merge
		 */
		private RouteSegment mergeAxisAligned(RouteSegment other)
		{
			double epsilon = 1.0E-9D;
			if (Math.abs(startX - endX) < epsilon && Math.abs(other.startX - other.endX) < epsilon
					&& Math.abs(startX - other.startX) < epsilon)
			{
				if (Math.abs(endZ - other.startZ) < epsilon)
				{
					return new RouteSegment(startX, startZ, other.endX, other.endZ);
				}
				if (Math.abs(other.endZ - startZ) < epsilon)
				{
					return new RouteSegment(other.startX, other.startZ, endX, endZ);
				}
			}
			if (Math.abs(startZ - endZ) < epsilon && Math.abs(other.startZ - other.endZ) < epsilon
					&& Math.abs(startZ - other.startZ) < epsilon)
			{
				if (Math.abs(endX - other.startX) < epsilon)
				{
					return new RouteSegment(startX, startZ, other.endX, other.endZ);
				}
				if (Math.abs(other.endX - startX) < epsilon)
				{
					return new RouteSegment(other.startX, other.startZ, endX, endZ);
				}
			}
			return null;
		}
	}

	public static final class Point
	{
		public final double x;
		public final double z;

		/**
		 * Creates a two-dimensional model or world point.
		 *
		 * @param x X coordinate
		 * @param z Z coordinate
		 */
		private Point(double x, double z)
		{
			this.x = x;
			this.z = z;
		}
	}

	public static final class Transform
	{
		private static final int STANDARD_ROTATION = 0;
		private static final int TURN_ROTATION = 1;
		private static final int NO_ROTATION = 2;
		private static final int DIAMOND_ROTATION = 3;
		public static final Transform IDENTITY = new Transform(NO_ROTATION, 0.0D, 0.0D);
		private final int rotationMode;
		private final double translateX;
		private final double translateZ;
		/**
		 * Creates a transform using legacy-turn or standard facing conventions.
		 *
		 * @param turnConvention whether legacy turn rotations apply
		 * @param translateX pre-rotation model X translation
		 * @param translateZ pre-rotation model Z translation
		 */
		private Transform(boolean turnConvention, double translateX, double translateZ)
		{
			this(turnConvention ? TURN_ROTATION : STANDARD_ROTATION, translateX, translateZ);
		}
		/**
		 * Creates a transform with an explicit rotation mode.
		 *
		 * @param rotationMode rotation convention constant
		 * @param translateX pre-rotation model X translation
		 * @param translateZ pre-rotation model Z translation
		 */
		private Transform(int rotationMode, double translateX, double translateZ)
		{
			this.rotationMode = rotationMode;
			this.translateX = translateX;
			this.translateZ = translateZ;
		}
		/**
		 * Converts a placed facing into clockwise model quarter turns.
		 *
		 * @param facing placed track facing
		 * @return normalized quarter-turn count
		 */
		private int quarterTurns(int facing)
		{
			int rotationDegrees;
			switch (rotationMode)
			{
				case TURN_ROTATION:
					rotationDegrees = turnConventionRotationDegrees(facing);
					break;
				case NO_ROTATION:
					rotationDegrees = 0;
					break;
				case DIAMOND_ROTATION:
					rotationDegrees = facing == 1 || facing == 3 ? DEGREES_PER_QUARTER_TURN : 0;
					break;
				default:
					rotationDegrees = standardRotationDegrees(facing);
					break;
			}
			return Math.floorMod(rotationDegrees / DEGREES_PER_QUARTER_TURN, 4);
		}

		/**
		 * Maps legacy turn facings to the rotation used by their visible model renderer.
		 *
		 * @param facing placed track facing
		 * @return rotation in degrees
		 */
		private int turnConventionRotationDegrees(int facing)
		{
			switch (facing)
			{
				case 0:
					return -DEGREES_PER_QUARTER_TURN;
				case 1:
					return DEGREES_PER_QUARTER_TURN * 2;
				case 2:
					return DEGREES_PER_QUARTER_TURN;
				default:
					return 0;
			}
		}

		/**
		 * Maps ordinary switch facings to the rotation used by their visible model renderer.
		 *
		 * @param facing placed track facing
		 * @return rotation in degrees
		 */
		private int standardRotationDegrees(int facing)
		{
			switch (facing)
			{
				case 0:
					return DEGREES_PER_QUARTER_TURN * 2;
				case 1:
					return DEGREES_PER_QUARTER_TURN;
				case 3:
					return -DEGREES_PER_QUARTER_TURN;
				default:
					return 0;
			}
		}
		/**
		 * Converts a world point to its model X coordinate.
		 *
		 * @param facing placed track facing
		 * @param worldX parent-relative world X
		 * @param worldZ parent-relative world Z
		 * @return model-space X
		 */
		private double modelX(int facing, double worldX, double worldZ)
		{
			switch (quarterTurns(facing))
			{
				case 1:
					return -worldZ - translateX;
				case 2:
					return -worldX - translateX;
				case 3:
					return worldZ - translateX;
				default:
					return worldX - translateX;
			}
		}
		/**
		 * Converts a world point to its model Z coordinate.
		 *
		 * @param facing placed track facing
		 * @param worldX parent-relative world X
		 * @param worldZ parent-relative world Z
		 * @return model-space Z
		 */
		private double modelZ(int facing, double worldX, double worldZ)
		{
			switch (quarterTurns(facing))
			{
				case 1:
					return worldX - translateZ;
				case 2:
					return -worldZ - translateZ;
				case 3:
					return -worldX - translateZ;
				default:
					return worldZ - translateZ;
			}
		}
	}

	public static final class Point3
	{
		public final double x;
		public final double y;
		public final double z;

		/**
		 * Creates a parsed three-dimensional OBJ point.
		 *
		 * @param x model X
		 * @param y model Y
		 * @param z model Z
		 */
		public Point3(double x, double y, double z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	public static final class Face
	{
		public final List<Point3> points;

		/**
		 * Creates an immutable parsed OBJ face.
		 *
		 * @param points face vertices in OBJ winding order
		 */
		public Face(List<Point3> points)
		{
			this.points = Collections.unmodifiableList(new ArrayList<Point3>(points));
		}

		/**
		 * Returns this face's greatest model Y coordinate.
		 *
		 * @return maximum Y
		 */
		private double maxY()
		{
			double maximumY = Double.NEGATIVE_INFINITY;
			for (Point3 point : points)
			{
				maximumY = Math.max(maximumY, point.y);
			}
			return maximumY;
		}

		/**
		 * Computes the normalized Y component of the face normal.
		 *
		 * @return normalized Y component
		 */
		private double normalY()
		{
			Point3 firstPoint = points.get(0);
			Point3 secondPoint = points.get(1);
			Point3 thirdPoint = points.get(2);
			double firstEdgeX = secondPoint.x - firstPoint.x;
			double firstEdgeY = secondPoint.y - firstPoint.y;
			double firstEdgeZ = secondPoint.z - firstPoint.z;
			double secondEdgeX = thirdPoint.x - firstPoint.x;
			double secondEdgeY = thirdPoint.y - firstPoint.y;
			double secondEdgeZ = thirdPoint.z - firstPoint.z;
			double normalX = firstEdgeY * secondEdgeZ - firstEdgeZ * secondEdgeY;
			double normalY = firstEdgeZ * secondEdgeX - firstEdgeX * secondEdgeZ;
			double normalZ = firstEdgeX * secondEdgeY - firstEdgeY * secondEdgeX;
			double length = Math.sqrt(normalX * normalX + normalY * normalY + normalZ * normalZ);
			return length <= 1.0E-12D ? 0.0D : normalY / length;
		}
	}

	public static final class RawSegment
	{
		public final double startX;
		public final double startZ;
		public final double endX;
		public final double endZ;

		/**
		 * Creates one extracted or authored raw segment.
		 *
		 * @param startX start X
		 * @param startZ start Z
		 * @param endX end X
		 * @param endZ end Z
		 */
		public RawSegment(double startX, double startZ, double endX, double endZ)
		{
			this.startX = startX;
			this.startZ = startZ;
			this.endX = endX;
			this.endZ = endZ;
		}

		/**
		 * Returns the length of this extracted rail-top piece in OBJ model blocks.
		 *
		 * @return segment length
		 */
		public double length()
		{
			double deltaX = endX - startX;
			double deltaZ = endZ - startZ;
			return Math.sqrt(deltaX * deltaX + deltaZ * deltaZ);
		}

		/**
		 * Checks whether both endpoints match within the allowed model-coordinate difference.
		 *
		 * @param other segment to compare
		 * @param tolerance maximum endpoint distance
		 * @return whether the segments are equivalent in either direction
		 */
		public boolean equivalent(RawSegment other, double tolerance)
		{
			double limit = tolerance * tolerance;
			return (distanceSquared(startX, startZ, other.startX, other.startZ) <= limit && distanceSquared(endX, endZ, other.endX, other.endZ) <= limit)
					|| (distanceSquared(startX, startZ, other.endX, other.endZ) <= limit && distanceSquared(endX, endZ, other.startX, other.startZ) <= limit);
		}
	}

	/**
	 * Computes squared distance between two model-space points.
	 *
	 * @param x1 first X
	 * @param z1 first Z
	 * @param x2 second X
	 * @param z2 second Z
	 * @return squared distance
	 */
	private static double distanceSquared(double x1, double z1, double x2, double z2)
	{
		double deltaX = x2 - x1;
		double deltaZ = z2 - z1;
		return deltaX * deltaX + deltaZ * deltaZ;
	}

	private static final class Graph
	{
		private final List<Node> nodes = new ArrayList<Node>();
		private final List<Edge> edges = new ArrayList<Edge>();
		/**
		 * Adds one non-authoritative segment to the graph.
		 *
		 * @param segment segment to add
		 */
		private void add(RawSegment segment)
		{
			add(segment, false);
		}
		/**
		 * Adds one segment and merges compatible endpoints into graph nodes.
		 *
		 * @param segment segment to add
		 * @param authoritative whether its endpoints must remain exact
		 */
		private void add(RawSegment segment, boolean authoritative)
		{
			Node a = node(segment.startX, segment.startZ, segment.endX - segment.startX, segment.endZ - segment.startZ, authoritative);
			Node b = node(segment.endX, segment.endZ, segment.startX - segment.endX, segment.startZ - segment.endZ, authoritative);
			if (a == b)
			{
				return;
			}
			for (Edge edge : edges)
			{
				if (edge.connects(a, b))
				{
					return;
				}
			}
			Edge edge = new Edge(a, b);
			edges.add(edge);
			a.edges.add(edge);
			b.edges.add(edge);
		}

		/**
		 * Finds or creates a direction-compatible graph node.
		 *
		 * @param x endpoint X
		 * @param z endpoint Z
		 * @param directionX outgoing direction X
		 * @param directionZ outgoing direction Z
		 * @param authoritative whether the endpoint must replace averaged coordinates
		 * @return compatible existing node or newly created node
		 */
		private Node node(double x, double z, double directionX, double directionZ, boolean authoritative)
		{
			double max = ENDPOINT_MERGE_DISTANCE * ENDPOINT_MERGE_DISTANCE;
			for (Node node : nodes)
			{
				if (distanceSquared(x, z, node.x, node.z) <= max && node.acceptsDirection(directionX, directionZ))
				{
					if (authoritative)
					{
						node.x = x;
						node.z = z;
						node.authoritative = true;
					}
					else if (node.authoritative == false)
					{
						node.include(x, z);
					}
					return node;
				}
			}
			Node node = new Node(x, z);
			node.authoritative = authoritative;
			nodes.add(node);
			return node;
		}
		/** Removes disconnected graph components shorter than the minimum useful rail length. */
		private void removeShortComponents()
		{
			Set<Node> visited = new HashSet<Node>();
			for (Node start : new ArrayList<Node>(nodes))
			{
				if (visited.contains(start))
				{
					continue;
				}
				Set<Node> component = new HashSet<Node>();
				ArrayDeque<Node> queue = new ArrayDeque<Node>();
				queue.add(start);
				visited.add(start);
				double length = 0.0D;
				while (queue.isEmpty() == false)
				{
					Node node = queue.removeFirst();
					component.add(node);
					for (Edge edge : node.edges)
					{
						length += edge.length() * 0.5D;
						Node other = edge.other(node);
						if (visited.add(other))
						{
							queue.add(other);
						}
					}
				}
				if (length < MIN_COMPONENT_LENGTH)
				{
					for (Node node : component)
					{
						edges.removeAll(node.edges);
						for (Edge edge : new ArrayList<Edge>(node.edges))
						{
							edge.other(node).edges.remove(edge);
						}
						node.edges.clear();
					}
				}
			}
		}
		/**
		 * Traces every graph edge into connected model paths.
		 *
		 * @return route segments covering every retained edge
		 */
		private List<RouteSegment> traceModelPaths()
		{
			List<RouteSegment> result = new ArrayList<RouteSegment>();
			Set<Edge> used = new HashSet<Edge>();
			for (Node node : nodes)
			{
				if (node.edges.size() == 2)
				{
					continue;
				}
				for (Edge edge : node.edges)
				{
					if (used.contains(edge) == false)
					{
						appendModelPath(result, trace(node, edge, used));
					}
				}
			}
			for (Edge edge : edges)
			{
				if (used.contains(edge) == false)
				{
					appendModelPath(result, trace(edge.a, edge, used));
				}
			}
			return result;
		}
		/**
		 * Traces one path from an endpoint or branch until another branch is reached.
		 *
		 * @param start starting graph node
		 * @param first first edge
		 * @param used shared set of already traced edges
		 * @return ordered path nodes
		 */
		private List<Node> trace(Node start, Edge first, Set<Edge> used)
		{
			List<Node> path = new ArrayList<Node>();
			path.add(start);
			Node current = start;
			Edge edge = first;
			while (edge != null && used.add(edge))
			{
				current = edge.other(current);
				path.add(current);
				if (current.edges.size() != 2)
				{
					break;
				}
				edge = current.edges.get(0) == edge ? current.edges.get(1) : current.edges.get(0);
			}
			return path;
		}
		/**
		 * Applies bounded fairing to one node path and appends its route segments.
		 *
		 * @param output destination route list
		 * @param path ordered graph nodes
		 */
		private void appendModelPath(List<RouteSegment> output, List<Node> path)
		{
			if (path.size() < 2)
			{
				return;
			}
			// Crown faces already describe the rendered rail. Interpolating those
			// vertices with an unconstrained spline invents lateral motion that is
			// not present in the model. Fair only internal chain joints and clamp
			// every point to a very small radius around its extracted crown point.
			// Endpoints are branch/frog boundaries and must remain exact.
			List<Point> modelPoints = new ArrayList<Point>();
			List<Point> fairPoints = new ArrayList<Point>();
			for (Node node : path)
			{
				Point point = new Point(node.x, node.z);
				modelPoints.add(point);
				fairPoints.add(point);
			}
			for (int pass = 0; pass < MODEL_PATH_FAIRING_PASSES && fairPoints.size() > 2; pass++)
			{
				List<Point> next = new ArrayList<Point>(fairPoints);
				for (int i = 1; i < fairPoints.size() - 1; i++)
				{
					if (path.get(i).authoritative)
					{
						continue;
					}
					Point previous = fairPoints.get(i - 1);
					Point current = fairPoints.get(i);
					Point following = fairPoints.get(i + 1);
					double targetX = (previous.x + 2.0D * current.x + following.x) * 0.25D;
					double targetZ = (previous.z + 2.0D * current.z + following.z) * 0.25D;
					Point model = modelPoints.get(i);
					double shiftX = targetX - model.x;
					double shiftZ = targetZ - model.z;
					double shift = Math.sqrt(shiftX * shiftX + shiftZ * shiftZ);
					if (shift > MAX_MODEL_PATH_FAIRING_SHIFT)
					{
						double scale = MAX_MODEL_PATH_FAIRING_SHIFT / shift;
						shiftX *= scale;
						shiftZ *= scale;
					}
					next.set(i, new Point(model.x + shiftX, model.z + shiftZ));
				}
				fairPoints = next;
			}
			for (int i = 0; i < fairPoints.size() - 1; i++)
			{
				Point a = fairPoints.get(i);
				Point b = fairPoints.get(i + 1);
				if (distanceSquared(a.x, a.z, b.x, b.z) > 1.0E-12D)
				{
					output.add(new RouteSegment(a.x, a.z, b.x, b.z));
				}
			}
		}
	}

	private static final class Node
	{
		private double x;
		private double z;
		private int samples = 1;
		private boolean authoritative;
		private final List<Edge> edges = new ArrayList<Edge>();

		/**
		 * Creates one graph endpoint.
		 *
		 * @param x model X
		 * @param z model Z
		 */
		private Node(double x, double z)
		{
			this.x = x;
			this.z = z;
		}

		/**
		 * Averages another compatible endpoint into this non-authoritative node.
		 *
		 * @param pointX endpoint X
		 * @param pointZ endpoint Z
		 */
		private void include(double pointX, double pointZ)
		{
			samples++;
			x += (pointX - x) / samples;
			z += (pointZ - z) / samples;
		}

		/**
		 * Tests whether another endpoint direction can safely merge into this node.
		 *
		 * @param directionX candidate direction X
		 * @param directionZ candidate direction Z
		 * @return whether the direction is compatible with an attached edge
		 */
		private boolean acceptsDirection(double directionX, double directionZ)
		{
			if (edges.isEmpty())
			{
				return true;
			}
			double candidateLength = Math.sqrt(directionX * directionX + directionZ * directionZ);
			if (candidateLength <= 1.0E-12D)
			{
				return false;
			}
			for (Edge edge : edges)
			{
				Node other = edge.other(this);
				double edgeX = other.x - x;
				double edgeZ = other.z - z;
				double edgeLength = Math.sqrt(edgeX * edgeX + edgeZ * edgeZ);
				if (edgeLength <= 1.0E-12D)
				{
					continue;
				}
				double dot = Math.abs((directionX * edgeX + directionZ * edgeZ) / (candidateLength * edgeLength));
				if (dot >= ENDPOINT_MERGE_MIN_DIRECTION_DOT)
				{
					return true;
				}
			}
			return false;
		}
	}
	private static final class Edge
	{
		private final Node a;
		private final Node b;

		/**
		 * Creates an undirected graph edge.
		 *
		 * @param a first endpoint
		 * @param b second endpoint
		 */
		private Edge(Node a, Node b)
		{
			this.a = a;
			this.b = b;
		}

		/**
		 * Tests whether this edge connects the supplied endpoints in either order.
		 *
		 * @param first first candidate node
		 * @param second second candidate node
		 * @return whether this edge connects both nodes
		 */
		private boolean connects(Node first, Node second)
		{
			return (a == first && b == second) || (a == second && b == first);
		}

		/**
		 * Returns the endpoint opposite a supplied endpoint.
		 *
		 * @param node one endpoint
		 * @return opposite endpoint
		 */
		private Node other(Node node)
		{
			return node == a ? b : a;
		}

		/**
		 * Returns the Euclidean edge length.
		 *
		 * @return edge length in model blocks
		 */
		private double length()
		{
			return Math.sqrt(distanceSquared(a.x, a.z, b.x, b.z));
		}
	}

	private static final class Spec
	{
		/**
		 * Position adjustments copied from the visible switch renderer before it rotates
		 * the model. They account for the different starting points used by the OBJ files;
		 * they do not tune the trench shape. The older 4x4 and 6x6 left/right models use
		 * different starting points, centered models use the usual half-block adjustment,
		 * and 4x8 has its own adjustment along the track. These adjustments keep the
		 * terrain and visible model positions aligned for every facing.
		 */
		private static final double SWITCH_4X4_TRANSLATE_X = -1.0D;
		private static final double SWITCH_4X4_LEFT_TRANSLATE_Z = 1.0D;
		private static final double SWITCH_4X4_RIGHT_TRANSLATE_Z = 3.0D;
		private static final double SWITCH_6X6_LEFT_TRANSLATE_Z = -4.0D;
		private static final double SWITCH_6X6_RIGHT_TRANSLATE_Z = 4.0D;
		private static final double STANDARD_HALF_BLOCK_TRANSLATE_X = -0.5D;
		private static final double STANDARD_HALF_BLOCK_TRANSLATE_Z = 0.5D;
		private static final double SWITCH_4X8_TRANSLATE_Z = 1.5D;

		private final String key;
		private final String activeResource;
		private final String inactiveResource;
		private final Transform transform;
		private final List<RawSegment> authoredRoutes = new ArrayList<RawSegment>();

		/**
		 * Creates an active/inactive handed switch specification.
		 *
		 * @param size model size token
		 * @param right whether the right-handed resources apply
		 * @param turnConvention whether legacy turn facing rotations apply
		 * @param translateX model X translation
		 * @param translateZ model Z translation
		 */
		private Spec(String size, boolean right, boolean turnConvention, double translateX, double translateZ)
		{
			String hand = right ? "right" : "left";
			key = size + "_" + hand;
			activeResource = "assets/tc/models/track/switch/active/" + size + "_" + hand + ".obj";
			inactiveResource = "assets/tc/models/track/switch/inactive/" + size + "_" + hand + ".obj";
			transform = new Transform(turnConvention, translateX, translateZ);
		}

		/**
		 * Creates a single-resource model profile specification.
		 *
		 * @param key cache key
		 * @param resource OBJ resource path
		 * @param transform model/world transform
		 */
		private Spec(String key, String resource, Transform transform)
		{
			this.key = key;
			this.activeResource = resource;
			this.inactiveResource = resource;
			this.transform = transform;
		}

		/**
		 * Adds exact straight corridors omitted from the combined medium-switch OBJ crown extraction.
		 *
		 * @param right whether right-handed corridor coordinates apply
		 * @return this specification
		 */
		private Spec withMediumParallelCorridors(boolean right)
		{
			authoredRoutes.add(new RawSegment(MEDIUM_PARALLEL_MAIN_LEFT_X, MEDIUM_PARALLEL_MODEL_START_Z,
					MEDIUM_PARALLEL_MAIN_LEFT_X, MEDIUM_PARALLEL_MODEL_END_Z));
			authoredRoutes.add(new RawSegment(MEDIUM_PARALLEL_MAIN_RIGHT_X, MEDIUM_PARALLEL_MODEL_START_Z,
					MEDIUM_PARALLEL_MAIN_RIGHT_X, MEDIUM_PARALLEL_MODEL_END_Z));
			double firstBranchX = right
					? MEDIUM_PARALLEL_RIGHT_BRANCH_LEFT_X : -MEDIUM_PARALLEL_RIGHT_BRANCH_RIGHT_X;
			double secondBranchX = right
					? MEDIUM_PARALLEL_RIGHT_BRANCH_RIGHT_X : -MEDIUM_PARALLEL_RIGHT_BRANCH_LEFT_X;
			authoredRoutes.add(new RawSegment(firstBranchX, MEDIUM_PARALLEL_MODEL_START_Z,
					firstBranchX, MEDIUM_PARALLEL_BRANCH_JOIN_Z));
			authoredRoutes.add(new RawSegment(secondBranchX, MEDIUM_PARALLEL_MODEL_START_Z,
					secondBranchX, MEDIUM_PARALLEL_BRANCH_JOIN_Z));
			authoredRoutes.add(new RawSegment(firstBranchX, MEDIUM_PARALLEL_BRANCH_EXIT_Z,
					firstBranchX, MEDIUM_PARALLEL_MODEL_END_Z));
			authoredRoutes.add(new RawSegment(secondBranchX, MEDIUM_PARALLEL_BRANCH_EXIT_Z,
					secondBranchX, MEDIUM_PARALLEL_MODEL_END_Z));
			return this;
		}
		/**
		 * Maps a supported core track to its model-profile specification.
		 *
		 * @param core core track
		 * @return profile specification, or {@code null} when unsupported
		 */
		private static Spec forCore(EnumCoreTrack core)
		{
			if (core == null)
			{
				return null;
			}
			String name = core.name();
			boolean left = name.endsWith("_L");
			switch (core)
			{
				case CORE_4x4_SWITCH:
				case CORE_4x4_SWITCH_L:
				case CORE_4x4_SWITCH_R:
					return new Spec("4x4", left == false, true, SWITCH_4X4_TRANSLATE_X,
							left ? SWITCH_4X4_LEFT_TRANSLATE_Z : SWITCH_4X4_RIGHT_TRANSLATE_Z);
				case CORE_6x6_SWITCH:
				case CORE_6x6_SWITCH_L:
				case CORE_6x6_SWITCH_R:
					return new Spec("6x6", left == false, true, 0.0D,
							left ? SWITCH_6X6_LEFT_TRANSLATE_Z : SWITCH_6X6_RIGHT_TRANSLATE_Z);
				case CORE_11x11_SWITCH:
				case CORE_11x11_SWITCH_L:
				case CORE_11x11_SWITCH_R:
					return new Spec("11x11", left == false, false,
							STANDARD_HALF_BLOCK_TRANSLATE_X, STANDARD_HALF_BLOCK_TRANSLATE_Z);
				case CORE_4x11_PARALLEL_SWITCH:
				case CORE_4x11_PARALLEL_SWITCH_L:
				case CORE_4x11_PARALLEL_SWITCH_R:
					return new Spec("4x11", left == false, false, 0.0D, 0.0D)
							.withMediumParallelCorridors(left == false);
				case CORE_4x17_PARALLEL_SWITCH:
				case CORE_4x17_PARALLEL_SWITCH_L:
				case CORE_4x17_PARALLEL_SWITCH_R:
					return new Spec("4x17", left == false, false,
							STANDARD_HALF_BLOCK_TRANSLATE_X, STANDARD_HALF_BLOCK_TRANSLATE_Z);
				case CORE_3x5_45DEGREE_SWITCH:
				case CORE_3x5_45DEGREE_SWITCH_L:
				case CORE_3x5_45DEGREE_SWITCH_R:
					return new Spec("3x5", left == false, false, 0.0D, 0.0D);
				case CORE_4x8_45DEGREE_SWITCH:
				case CORE_4x8_45DEGREE_SWITCH_L:
				case CORE_4x8_45DEGREE_SWITCH_R:
					return new Spec("4x8", left == false, false,
							STANDARD_HALF_BLOCK_TRANSLATE_X, SWITCH_4X8_TRANSLATE_Z);
				case CORE_10x2_CROSSOVER_SWITCH:
				case CORE_10x2_CROSSOVER_SWITCH_L:
			case CORE_10x2_CROSSOVER_SWITCH_R:
					return new Spec("crossover_10x2", left == false, false,
							STANDARD_HALF_BLOCK_TRANSLATE_X, STANDARD_HALF_BLOCK_TRANSLATE_Z);
				case CORE_S_CURVE_2x8:
				case CORE_S_CURVE_2x8_R:
					return modelSpec("s_2x8_right", "curve/s/2x8_right.obj", false);
				case CORE_S_CURVE_2x8_L:
					return modelSpec("s_2x8_left", "curve/s/2x8_left.obj", false);
				case CORE_S_CURVE_3x12:
				case CORE_S_CURVE_3x12_R:
					return modelSpec("s_3x12_right", "curve/s/3x12_right.obj", false);
				case CORE_S_CURVE_3x12_L:
					return modelSpec("s_3x12_left", "curve/s/3x12_left.obj", false);
				case CORE_S_CURVE_4x16:
				case CORE_S_CURVE_4x16_R:
					return modelSpec("s_4x16_right", "curve/s/4x16_right.obj", false);
				case CORE_S_CURVE_4x16_L:
					return modelSpec("s_4x16_left", "curve/s/4x16_left.obj", false);
				case CORE_S_CURVE_20x2:
				case CORE_S_CURVE_20x2_R:
					return modelSpec("s_20x2_right", "curve/s/20x2_right.obj", false);
				case CORE_S_CURVE_20x2_L:
					return modelSpec("s_20x2_left", "curve/s/20x2_left.obj", false);
				case CORE_TWO_WAYS_CROSSING:
					return modelSpec("crossing_standard", "crossing/standard.obj", true);
				case CORE_DIAGONAL_TWO_WAYS_CROSSING:
					return modelSpec("crossing_diagonal", "crossing/45-deg_standard.obj", true);
				case CORE_FOUR_WAYS_CROSSING:
					return modelSpec("crossing_four_way", "crossing/double_diamond_plus.obj", true);
				case CORE_DOUBLE_DIAMOND_CROSSING:
					return diamondSpec("crossing_double_diamond", "crossing/double_diamond.obj");
				case CORE_DIAMOND_CROSSING:
				case CORE_DIAMOND_CROSSING_R:
					return diamondSpec("crossing_diamond_right", "crossing/diamond_right.obj");
				case CORE_DIAMOND_CROSSING_L:
					return diamondSpec("crossing_diamond_left", "crossing/diamond_left.obj");
				default:
					return null;
			}
		}

		/**
		 * Creates a specification for a general track-model resource.
		 *
		 * @param key cache key
		 * @param resource path below the track-model directory
		 * @param fixedFacing whether the resource ignores placed facing
		 * @return model specification
		 */
		private static Spec modelSpec(String key, String resource, boolean fixedFacing)
		{
			Transform transform = new Transform(fixedFacing ? Transform.NO_ROTATION : Transform.STANDARD_ROTATION,
					0.0D, 0.0D);
			return new Spec(key, "assets/tc/models/track/" + resource, transform);
		}

		/**
		 * Creates a specification using the diamond-crossing facing convention.
		 *
		 * @param key cache key
		 * @param resource path below the track-model directory
		 * @return diamond-crossing specification
		 */
		private static Spec diamondSpec(String key, String resource)
		{
			return new Spec(key, "assets/tc/models/track/" + resource,
					new Transform(Transform.DIAMOND_ROTATION, 0.0D, 0.0D));
		}
	}
}
