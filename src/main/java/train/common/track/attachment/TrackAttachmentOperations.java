package train.common.track.attachment;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.common.library.track.path.TrackPathGeometry;
import train.common.library.track.path.TrackPathSample;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Resolves, targets, installs, and removes generic attachments across legacy multi-cell tracks. */
public final class TrackAttachmentOperations
{
	private static final double CELL_CENTER = 0.5D;
	private static final double ITEM_DROP_HEIGHT = 0.6D;
	private static final double TARGET_REACH = 6.0D;
	private static final long CURRENT_TARGET_NANOS = 250_000_000L;
	private static final int ITEM_PICKUP_DELAY_TICKS = 10;

	private static int recentTargetDimension;
	private static int recentTargetX;
	private static int recentTargetY;
	private static int recentTargetZ;
	private static int recentTargetOwnerX;
	private static int recentTargetOwnerY;
	private static int recentTargetOwnerZ;
	private static int recentTargetOffsetX;
	private static int recentTargetOffsetY;
	private static int recentTargetOffsetZ;
	private static String recentTargetSlotId;
	private static String recentTargetTypeId;
	private static long recentTargetTime;

	private TrackAttachmentOperations()
	{
	}

	/**
	 * Resolves the path/model owner represented by one selected track cell. Gags retain their local model origin while
	 * linked parent rails independently lead to the compound track's greatest owner.
	 *
	 * @param access world or block-access view containing the track
	 * @param cellX selected world X coordinate
	 * @param cellY selected world Y coordinate
	 * @param cellZ selected world Z coordinate
	 * @return authoritative render owner, or {@code null} when the cell has no resolvable rail tile
	 */
	public static TileTCRail resolveRenderOwner(IBlockAccess access, int cellX, int cellY, int cellZ)
	{
		TileTCRail rail = resolvePathOwner(access, cellX, cellY, cellZ);
		if (rail == null || rail.getWorldObj() == null)
		{
			return rail;
		}
		TileTCRail parent = rail.getGreatestParent(rail.getWorldObj());
		return rail.hasModel || parent == null ? rail : parent;
	}

	/**
	 * Resolves the immediate rail whose geometry covers one selected cell. Unlike {@link #resolveRenderOwner}, this
	 * does not follow compound-track links, because linked switch and parallel-turn sections can have different circle
	 * centers and radii.
	 *
	 * @return local path owner, or {@code null} when the cell has no resolvable rail tile
	 */
	public static TileTCRail resolvePathOwner(IBlockAccess access, int cellX, int cellY, int cellZ)
	{
		if (access == null)
		{
			return null;
		}
		TileEntity selected = access.getTileEntity(cellX, cellY, cellZ);
		if (selected instanceof TileTCRail)
		{
			return (TileTCRail)selected;
		}
		if (selected instanceof TileTCRailGag)
		{
			TileTCRailGag gag = (TileTCRailGag)selected;
			TileEntity origin = access.getTileEntity(gag.originX, gag.originY, gag.originZ);
			return origin instanceof TileTCRail ? (TileTCRail)origin : null;
		}
		return null;
	}

	/**
	 * Tests the player's current view ray against attachment geometry in the selected world cell.
	 *
	 * @return whether the view ray intersects the attachment bounds
	 */
	public static boolean isPlayerAimingAtAttachment(World world, int x, int y, int z, EntityPlayer player)
	{
		AttachmentHit hit = findPlayerAttachmentHit(world, x, y, z, player);
		if (hit != null && world.isRemote)
		{
			rememberTarget(world, x, y, z, hit);
		}
		return hit != null;
	}

	/**
	 * Returns the attachment bounds selected by the most recent nearest-hit calculation.
	 *
	 * @param world client world containing the selected track cell
	 * @param x selected world X coordinate
	 * @param y selected world Y coordinate
	 * @param z selected world Z coordinate
	 * @return exact targeted attachment bounds, or {@code null} when the base track was nearer
	 */
	public static AxisAlignedBB getTargetedAttachmentBounds(World world, int x, int y, int z)
	{
		return getRememberedTargetBounds(world, x, y, z);
	}

	/**
	 * Recalculates the player's current attachment hit for selection outlines that are requested after Minecraft has
	 * already reduced the ray result to the underlying rail block.
	 *
	 * @param world client world containing the selected track cell
	 * @param x selected world X coordinate
	 * @param y selected world Y coordinate
	 * @param z selected world Z coordinate
	 * @param player player whose view ray selects the attachment
	 * @return exact targeted attachment bounds, or {@code null} when the ray misses attachment geometry
	 */
	public static AxisAlignedBB findPlayerTargetedAttachmentBounds(World world, int x, int y, int z,
			EntityPlayer player)
	{
		AttachmentHit hit = findPlayerAttachmentHit(world, x, y, z, player);
		if (hit == null)
		{
			return null;
		}
		if (world.isRemote)
		{
			rememberTarget(world, x, y, z, hit);
		}
		return hit.bounds;
	}

	/** Resolves the short-lived target identity back to its current attachment bounds. */
	private static AxisAlignedBB getRememberedTargetBounds(World world, int x, int y, int z)
	{
		if (isCurrentClientAttachmentTarget(world, x, y, z) == false)
		{
			return null;
		}
		TileEntity tile = world.getTileEntity(recentTargetOwnerX, recentTargetOwnerY, recentTargetOwnerZ);
		if (tile instanceof TileTCRail == false)
		{
			return null;
		}
		TileTCRail owner = (TileTCRail)tile;
		for (TrackAttachment attachment : owner.getTrackAttachments())
		{
			if (attachment.occupiesSlot(recentTargetOffsetX, recentTargetOffsetY,
					recentTargetOffsetZ, recentTargetSlotId)
					&& attachment.getType().getId().equals(recentTargetTypeId))
			{
				return getAttachmentBounds(owner, attachment);
			}
		}
		return null;
	}

	/** Casts the player's view ray and returns the nearest attachment in the selected track cell. */
	private static AttachmentHit findPlayerAttachmentHit(World world, int x, int y, int z, EntityPlayer player)
	{
		if (world == null || player == null)
		{
			return null;
		}
		Vec3 start = Vec3.createVectorHelper(player.posX, player.posY + player.getEyeHeight(), player.posZ);
		Vec3 look = player.getLookVec();
		Vec3 end = start.addVector(look.xCoord * TARGET_REACH, look.yCoord * TARGET_REACH,
				look.zCoord * TARGET_REACH);
		return findNearestAttachmentHit(world, x, y, z, start, end);
	}

	/** Tests every attachment in the selected cell and retains the closest ray intersection. */
	private static AttachmentHit findNearestAttachmentHit(IBlockAccess access, int x, int y, int z,
			Vec3 rayStart, Vec3 rayEnd)
	{
		TileTCRail owner = resolveAttachmentOwner(access, x, y, z, TrackAttachmentType.RENDERS);
		if (owner == null)
		{
			return null;
		}
		AttachmentHit nearest = null;
		double nearestDistance = Double.POSITIVE_INFINITY;
		for (TrackAttachment attachment : owner.getTrackAttachments())
		{
			if (attachment.getType().hasBehavior(TrackAttachmentType.RENDERS) == false)
			{
				continue;
			}
			AxisAlignedBB bounds = getAttachmentBounds(owner, attachment);
			MovingObjectPosition intersection = bounds.calculateIntercept(rayStart, rayEnd);
			if (intersection == null)
			{
				continue;
			}
			double distance = rayStart.squareDistanceTo(intersection.hitVec);
			if (distance < nearestDistance)
			{
				nearestDistance = distance;
				nearest = new AttachmentHit(owner, attachment, bounds, intersection);
			}
		}
		return nearest;
	}

	/**
	 * Tests whether this world cell was the client's most recently targeted attachment. The short-lived result bridges
	 * neighboring base-block hit calculations without persisting selection state.
	 */
	private static boolean isCurrentClientAttachmentTarget(World world, int x, int y, int z)
	{
		return world != null && world.isRemote && recentTargetDimension == world.provider.dimensionId
				&& recentTargetX == x && recentTargetY == y && recentTargetZ == z
				&& System.nanoTime() - recentTargetTime <= CURRENT_TARGET_NANOS;
	}

	/** Records exact attachment identity briefly so Minecraft's separate outline query can reuse the ray result. */
	private static void rememberTarget(World world, int x, int y, int z, AttachmentHit hit)
	{
		recentTargetDimension = world.provider.dimensionId;
		recentTargetX = x;
		recentTargetY = y;
		recentTargetZ = z;
		recentTargetOwnerX = hit.owner.xCoord;
		recentTargetOwnerY = hit.owner.yCoord;
		recentTargetOwnerZ = hit.owner.zCoord;
		recentTargetOffsetX = hit.attachment.getOffsetX();
		recentTargetOffsetY = hit.attachment.getOffsetY();
		recentTargetOffsetZ = hit.attachment.getOffsetZ();
		recentTargetSlotId = hit.attachment.getSlotId();
		recentTargetTypeId = hit.attachment.getType().getId();
		recentTargetTime = System.nanoTime();
	}

	/** Invalidates a cached attachment target when the base track wins the nearest-hit comparison. */
	private static void clearTarget(IBlockAccess access, int x, int y, int z)
	{
		if (access instanceof World == false || ((World)access).isRemote == false)
		{
			return;
		}
		World world = (World)access;
		if (recentTargetDimension == world.provider.dimensionId
				&& recentTargetX == x && recentTargetY == y && recentTargetZ == z)
		{
			recentTargetTime = 0L;
		}
	}

	/**
	 * Adds the intersecting attachment bounds owned by one selected track cell to Minecraft's collision result.
	 *
	 * @param access world or block-access view containing the track
	 * @param x selected world X coordinate
	 * @param y selected world Y coordinate
	 * @param z selected world Z coordinate
	 * @param collisionMask moving entity bounds used to reject non-intersecting attachments
	 * @param collisions mutable collision result supplied by Minecraft
	 */
	public static void addAttachmentCollisionBoxes(IBlockAccess access, int x, int y, int z,
			AxisAlignedBB collisionMask, List collisions)
	{
		TileTCRail owner = resolveAttachmentOwner(access, x, y, z, TrackAttachmentType.RENDERS);
		if (owner == null)
		{
			return;
		}
		for (TrackAttachment attachment : owner.getTrackAttachments())
		{
			if (attachment.getType().hasBehavior(TrackAttachmentType.RENDERS))
			{
				AxisAlignedBB attachmentBounds = getAttachmentBounds(owner, attachment);
				if (collisionMask.intersectsWith(attachmentBounds))
				{
					collisions.add(attachmentBounds);
				}
			}
		}
	}

	private static AxisAlignedBB getAttachmentBounds(TileTCRail owner, TrackAttachment attachment)
	{
		TrackPathSample pathSample = getAttachmentPathSample(owner, attachment);
		double centerX = pathSample.getWorldX();
		double centerZ = pathSample.getWorldZ();
		double baseY = owner.yCoord + attachment.getOffsetY() + getAttachmentRenderYOffset(owner, attachment);
		TrackAttachmentBounds bounds = attachment.getType().getBounds(owner, attachment);
		return transformedBounds(owner, attachment, centerX, baseY, centerZ, bounds);
	}

	/**
	 * Expands a rail tile's client render bounds to include every attachment rendered by that tile. Minecraft tests a
	 * tile renderer's declared box before invoking it, so attachments outside the base model footprint must participate
	 * in that box or they can disappear near the edge of the camera frustum.
	 *
	 * @param owner attachment-owning rail tile
	 * @param railBounds base rail-model bounds
	 * @return bounds enclosing the rail model and all rendered attachments
	 */
	public static AxisAlignedBB includeAttachmentRenderBounds(TileTCRail owner, AxisAlignedBB railBounds)
	{
		if (owner == null || railBounds == null)
		{
			return railBounds;
		}
		double minimumX = railBounds.minX;
		double minimumY = railBounds.minY;
		double minimumZ = railBounds.minZ;
		double maximumX = railBounds.maxX;
		double maximumY = railBounds.maxY;
		double maximumZ = railBounds.maxZ;
		for (TrackAttachment attachment : owner.getTrackAttachments())
		{
			if (attachment.getType().hasBehavior(TrackAttachmentType.RENDERS) == false)
			{
				continue;
			}
			AxisAlignedBB attachmentBounds = getAttachmentBounds(owner, attachment);
			minimumX = Math.min(minimumX, attachmentBounds.minX);
			minimumY = Math.min(minimumY, attachmentBounds.minY);
			minimumZ = Math.min(minimumZ, attachmentBounds.minZ);
			maximumX = Math.max(maximumX, attachmentBounds.maxX);
			maximumY = Math.max(maximumY, attachmentBounds.maxY);
			maximumZ = Math.max(maximumZ, attachmentBounds.maxZ);
		}
		return AxisAlignedBB.getBoundingBox(minimumX, minimumY, minimumZ,
				maximumX, maximumY, maximumZ);
	}

	/**
	 * Applies canonical yaw and optional track-surface pitch to all local bound corners, then returns their world-axis
	 * envelope because Minecraft 1.7 collision boxes cannot themselves be rotated.
	 */
	private static AxisAlignedBB transformedBounds(TileTCRail owner, TrackAttachment attachment,
			double centerX, double baseY, double centerZ, TrackAttachmentBounds bounds)
	{
		double yaw = Math.toRadians(attachment.getYawDegrees());
		double yawSine = Math.sin(yaw);
		double yawCosine = Math.cos(yaw);
		double gradientX = TrackPathGeometry.getSlopeGradientX(owner);
		double gradientZ = TrackPathGeometry.getSlopeGradientZ(owner);
		double magnitude = Math.sqrt(gradientX * gradientX + gradientZ * gradientZ);
		boolean followsSlope = attachment.getType().getSlopeAlignment()
				== TrackAttachmentSlopeAlignment.TRACK_SURFACE && magnitude != 0.0D;
		double axisX = followsSlope ? -gradientZ / magnitude : 0.0D;
		double axisZ = followsSlope ? gradientX / magnitude : 0.0D;
		double pitch = followsSlope ? Math.atan(magnitude) : 0.0D;
		double pitchSine = Math.sin(pitch);
		double pitchCosine = Math.cos(pitch);
		double oneMinusPitchCosine = 1.0D - pitchCosine;
		double minX = Double.POSITIVE_INFINITY;
		double minY = Double.POSITIVE_INFINITY;
		double minZ = Double.POSITIVE_INFINITY;
		double maxX = Double.NEGATIVE_INFINITY;
		double maxY = Double.NEGATIVE_INFINITY;
		double maxZ = Double.NEGATIVE_INFINITY;
		for (int xIndex = 0; xIndex < 2; xIndex++)
		{
			for (int yIndex = 0; yIndex < 2; yIndex++)
			{
				for (int zIndex = 0; zIndex < 2; zIndex++)
				{
					double localX = xIndex == 0 ? bounds.getMinimumX() : bounds.getMaximumX();
					double localY = yIndex == 0 ? bounds.getMinimumY() : bounds.getMaximumY();
					double localZ = zIndex == 0 ? bounds.getMinimumZ() : bounds.getMaximumZ();
					double yawX = localX * yawCosine + localZ * yawSine;
					double yawZ = -localX * yawSine + localZ * yawCosine;
					double dot = axisX * yawX + axisZ * yawZ;
					double rotatedX = yawX * pitchCosine - axisZ * localY * pitchSine
							+ axisX * dot * oneMinusPitchCosine;
					double rotatedY = localY * pitchCosine + (axisZ * yawX - axisX * yawZ) * pitchSine;
					double rotatedZ = yawZ * pitchCosine + axisX * localY * pitchSine
							+ axisZ * dot * oneMinusPitchCosine;
					minX = Math.min(minX, rotatedX);
					minY = Math.min(minY, rotatedY);
					minZ = Math.min(minZ, rotatedZ);
					maxX = Math.max(maxX, rotatedX);
					maxY = Math.max(maxY, rotatedY);
					maxZ = Math.max(maxZ, rotatedZ);
				}
			}
		}
		return AxisAlignedBB.getBoundingBox(centerX + minX, baseY + minY, centerZ + minZ,
				centerX + maxX, baseY + maxY, centerZ + maxZ);
	}

	/**
	 * Calculates the attachment's owner-local vertical render offset, including progress along a slope.
	 *
	 * @param owner authoritative rail render tile
	 * @param attachment attachment positioned in owner-relative cell coordinates
	 * @return local Y translation in blocks
	 */
	public static double getAttachmentRenderYOffset(TileTCRail owner, TrackAttachment attachment)
	{
		if (owner == null || attachment == null)
		{
			return 0.0D;
		}
		double baseOffset = owner.getTrackRenderYOffset();
		if (owner.slopeHeight <= 0.0D || owner.slopeLength <= 0.0D)
		{
			return baseOffset;
		}
		double progress = TrackPathGeometry.getLinearProgress(owner,
				attachment.getOffsetX(), attachment.getOffsetZ());
		progress = Math.max(0.0D, Math.min(owner.slopeLength, progress));
		return baseOffset + owner.slopeHeight * progress / owner.slopeLength;
	}

	/**
	 * Returns the path sample used to position one attachment, falling back to its selected cell center.
	 *
	 * @param owner authoritative attachment owner
	 * @param attachment installed attachment with owner-relative cell coordinates
	 * @return resolved path position and tangent
	 */
	public static TrackPathSample getAttachmentPathSample(TileTCRail owner, TrackAttachment attachment)
	{
		int cellX = owner.xCoord + attachment.getOffsetX();
		int cellY = owner.yCoord + attachment.getOffsetY();
		int cellZ = owner.zCoord + attachment.getOffsetZ();
		TileTCRail pathOwner = owner.getWorldObj() == null ? owner
				: resolvePathOwner(owner.getWorldObj(), cellX, cellY, cellZ);
		TrackPathSample pathSample = TrackPathGeometry.sampleAttachmentPath(
				pathOwner != null ? pathOwner : owner, cellX, cellZ);
		return pathSample != null ? pathSample : new TrackPathSample(
				cellX + CELL_CENTER, cellZ + CELL_CENTER, 0.0D, 1.0D);
	}

	/**
	 * Returns the nearest attachment hit, or the underlying track hit when the ray misses every attachment. Attachment
	 * bounds take priority because sloped track and captured-host geometry can overlap visible attachment hardware.
	 *
	 * @param access world or block-access view containing the track
	 * @param x selected world X coordinate
	 * @param y selected world Y coordinate
	 * @param z selected world Z coordinate
	 * @param rayStart world-space ray origin
	 * @param rayEnd world-space ray endpoint
	 * @param baseHit underlying track intersection, or {@code null}
	 * @return nearest hit, or {@code null} when neither geometry intersects the ray
	 */
	public static MovingObjectPosition selectNearestHit(IBlockAccess access, int x, int y, int z,
			Vec3 rayStart, Vec3 rayEnd, MovingObjectPosition baseHit)
	{
		AttachmentHit hit = findNearestAttachmentHit(access, x, y, z, rayStart, rayEnd);
		if (hit == null)
		{
			clearTarget(access, x, y, z);
			return baseHit;
		}
		MovingObjectPosition attachmentHit = new MovingObjectPosition(x, y, z, hit.intersection.sideHit,
				hit.intersection.hitVec);
		if (access instanceof World && ((World)access).isRemote)
		{
			rememberTarget((World)access, x, y, z, hit);
		}
		return attachmentHit;
	}

	/**
	 * Removes exactly the attachment intersected by the player's view ray.
	 *
	 * @param world server world containing the selected track
	 * @param x selected world X coordinate
	 * @param y selected world Y coordinate
	 * @param z selected world Z coordinate
	 * @param player player completing the protected block-mining action
	 * @return whether an attachment was removed
	 */
	public static boolean removeTargeted(World world, int x, int y, int z, EntityPlayer player)
	{
		AttachmentHit hit = findPlayerAttachmentHit(world, x, y, z, player);
		if (hit == null)
		{
			return false;
		}
		TrackAttachment removed = hit.owner.removeAttachmentAtSlot(hit.attachment.getOffsetX(),
				hit.attachment.getOffsetY(), hit.attachment.getOffsetZ(), hit.attachment.getSlotId());
		if (removed == null)
		{
			return false;
		}
		if (world.isRemote == false && (player == null || player.capabilities.isCreativeMode == false))
		{
			drop(world, x, y, z, removed);
		}
		return true;
	}

	/**
	 * Follows render and linked-owner relationships until it finds the tile storing attachments with the requested
	 * behavior. Their transformed bounds, rather than their mounting coordinates, decide whether they affect the
	 * selected cell's ray or collision query.
	 * Visited coordinates prevent malformed cyclic links from trapping collision or removal calls.
	 */
	private static TileTCRail resolveAttachmentOwner(IBlockAccess access, int x, int y, int z, int behavior)
	{
		TileTCRail immediate = resolveRenderOwner(access, x, y, z);
		if (immediate == null)
		{
			return null;
		}
		Set<TileTCRail> visited = new HashSet<TileTCRail>();
		TileTCRail candidate = immediate;
		while (candidate != null)
		{
			if (visited.add(candidate) == false)
			{
				break;
			}
			if (candidate.hasAttachmentBehavior(behavior))
			{
				return candidate;
			}
			if (candidate.isLinkedToRail == false)
			{
				break;
			}
			TileEntity linked = access.getTileEntity(candidate.linkedX, candidate.linkedY, candidate.linkedZ);
			if (linked instanceof TileTCRail)
			{
				candidate = (TileTCRail)linked;
			}
			else if (linked instanceof TileTCRailGag)
			{
				TileTCRailGag gag = (TileTCRailGag)linked;
				TileEntity origin = access.getTileEntity(gag.originX, gag.originY, gag.originZ);
				candidate = origin instanceof TileTCRail ? (TileTCRail)origin : null;
			}
			else
			{
				candidate = null;
			}
		}
		return null;
	}

	/**
	 * Spawns the removed attachment type's registered item stack.
	 *
	 * @param world server world receiving the item entities
	 * @param x world X coordinate used as the drop origin
	 * @param y world Y coordinate used as the drop origin
	 * @param z world Z coordinate used as the drop origin
	 * @param attachment removed attachment whose definition supplies the drop
	 */
	public static void drop(World world, int x, int y, int z, TrackAttachment attachment)
	{
		if (world == null || attachment == null)
		{
			return;
		}
		ItemStack drop = attachment.getType().getRemovalDrop();
		if (drop == null)
		{
			return;
		}
		EntityItem entity = new EntityItem(world, x + CELL_CENTER, y + ITEM_DROP_HEIGHT, z + CELL_CENTER,
				drop);
		entity.delayBeforeCanPickup = ITEM_PICKUP_DELAY_TICKS;
		world.spawnEntityInWorld(entity);
	}

	private static final class AttachmentHit
	{
		private final TileTCRail owner;
		private final TrackAttachment attachment;
		private final AxisAlignedBB bounds;
		private final MovingObjectPosition intersection;

		private AttachmentHit(TileTCRail owner, TrackAttachment attachment, AxisAlignedBB bounds,
				MovingObjectPosition intersection)
		{
			this.owner = owner;
			this.attachment = attachment;
			this.bounds = bounds;
			this.intersection = intersection;
		}
	}
}
