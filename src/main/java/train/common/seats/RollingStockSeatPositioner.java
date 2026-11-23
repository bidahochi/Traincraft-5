package train.common.seats;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;
import train.common.api.EntityRollingStock;
import train.common.core.util.TraincraftUtil;
import train.common.entity.EntityPassengerSeat;

/**
 * Owns body-frame seat transforms, nearest-seat selection, and rider render history for one
 * rolling-stock entity.
 */
public final class RollingStockSeatPositioner
{
	private static final double TELEPORT_DISTANCE_SQUARED = 64.0D;
	private static final double RAY_DISTANCE_TIE_BREAKER = 0.001D;
	private final EntityRollingStock rollingStock;
	private final double[] positionScratch = new double[3];
	private Entity directSeatPositionRider;
	private int directSeatPositionIndex = -1;
	private int directSeatPositionTick = Integer.MIN_VALUE;
	private double directSeatPreviousX;
	private double directSeatPreviousY;
	private double directSeatPreviousZ;

	public RollingStockSeatPositioner(EntityRollingStock rollingStock)
	{
		this.rollingStock = rollingStock;
	}

	/** Chooses the free seat nearest the player's current eye ray. */
	public int findNearestFreeSeat(EntityPlayer player)
	{
		if (player == null)
		{
			return -1;
		}
		Vec3 eye = Vec3.createVectorHelper(player.posX, player.posY + player.getEyeHeight(), player.posZ);
		Vec3 look = player.getLook(1.0F);
		double bestScore = Double.MAX_VALUE;
		int bestIndex = -1;
		for (int seatIndex = 0; seatIndex < rollingStock.getSeatCount(); seatIndex++)
		{
			if (rollingStock.isSeatAvailable(seatIndex) == false)
			{
				continue;
			}
			double[] seat = getSeatWorldPosition(seatIndex);
			if (seat == null)
			{
				continue;
			}
			double deltaX = seat[0] - eye.xCoord;
			double deltaY = seat[1] - eye.yCoord;
			double deltaZ = seat[2] - eye.zCoord;
			double alongRay = Math.max(0.0D,
					deltaX * look.xCoord + deltaY * look.yCoord + deltaZ * look.zCoord);
			double rayX = eye.xCoord + look.xCoord * alongRay;
			double rayY = eye.yCoord + look.yCoord * alongRay;
			double rayZ = eye.zCoord + look.zCoord * alongRay;
			double score = square(seat[0] - rayX) + square(seat[1] - rayY)
					+ square(seat[2] - rayZ) + alongRay * RAY_DISTANCE_TIE_BREAKER;
			if (score < bestScore)
			{
				bestScore = score;
				bestIndex = seatIndex;
			}
		}
		return bestIndex;
	}

	public void positionPassengerSeat(EntityPassengerSeat passengerSeat)
	{
		if (passengerSeat != null)
		{
			positionEntityAtSeat(passengerSeat, passengerSeat.getSeatIndex());
		}
	}

	/** Positions the root-mounted rider while preserving stock-derived interpolation history. */
	public void positionDirectRider(Entity rider, int seatIndex)
	{
		if (rider == null || writeSeatWorldPosition(seatIndex, positionScratch) == false)
		{
			return;
		}

		double targetX = positionScratch[0];
		double targetY = positionScratch[1] + rider.getYOffset();
		double targetZ = positionScratch[2];
		double previousX = targetX;
		double previousY = targetY;
		double previousZ = targetZ;
		boolean continuousSeatUpdate = directSeatPositionRider == rider
				&& directSeatPositionIndex == seatIndex
				&& directSeatPositionTick >= rollingStock.ticksExisted - 1;
		if (continuousSeatUpdate)
		{
			previousX = directSeatPreviousX;
			previousY = directSeatPreviousY;
			previousZ = directSeatPreviousZ;
			if (square(targetX - previousX) + square(targetY - previousY)
					+ square(targetZ - previousZ) > TELEPORT_DISTANCE_SQUARED)
			{
				previousX = targetX;
				previousY = targetY;
				previousZ = targetZ;
			}
		}

		rider.setPosition(targetX, targetY, targetZ);
		rider.lastTickPosX = rider.prevPosX = previousX;
		rider.lastTickPosY = rider.prevPosY = previousY;
		rider.lastTickPosZ = rider.prevPosZ = previousZ;
		directSeatPositionRider = rider;
		directSeatPositionIndex = seatIndex;
		directSeatPositionTick = rollingStock.ticksExisted;
		directSeatPreviousX = targetX;
		directSeatPreviousY = targetY;
		directSeatPreviousZ = targetZ;
	}

	public double[] getSeatWorldPosition(int seatIndex)
	{
		double[] position = new double[3];
		return writeSeatWorldPosition(seatIndex, position) ? position : null;
	}

	/** Applies one body-frame transform and preserves the auxiliary entity's interpolation origin. */
	private void positionEntityAtSeat(Entity entity, int seatIndex)
	{
		if (writeSeatWorldPosition(seatIndex, positionScratch) == false)
		{
			return;
		}
		double previousX = entity.posX;
		double previousY = entity.posY;
		double previousZ = entity.posZ;
		entity.setPosition(positionScratch[0], positionScratch[1], positionScratch[2]);
		double movementSquared = square(entity.posX - previousX) + square(entity.posY - previousY)
				+ square(entity.posZ - previousZ);
		if (movementSquared > TELEPORT_DISTANCE_SQUARED)
		{
			previousX = entity.posX;
			previousY = entity.posY;
			previousZ = entity.posZ;
		}
		entity.lastTickPosX = entity.prevPosX = previousX;
		entity.lastTickPosY = entity.prevPosY = previousY;
		entity.lastTickPosZ = entity.prevPosZ = previousZ;
	}

	/** Writes one body-frame transform into caller-owned three-component storage. */
	private boolean writeSeatWorldPosition(int seatIndex, double[] position)
	{
		if (seatIndex < 0 || seatIndex >= rollingStock.getSeatCount())
		{
			return false;
		}
		RollingStockSeatLayout layout = rollingStock.getSeatLayoutForRuntime();
		float bodyYaw = rollingStock.worldObj.isRemote
				? rollingStock.getClientBodyYaw(1.0F) : rollingStock.serverRealRotation;
		float bodyPitch = rollingStock.worldObj.isRemote
				? rollingStock.getClientBodyPitch(1.0F) : rollingStock.serverRealPitch * 60.0F;
		String sectionId = layout.getDefinition(seatIndex).getSectionId();
		SeatSection section = "body".equals(sectionId) ? null : rollingStock.getSeatSection(sectionId);
		double bogiePosition = rollingStock.getTrainSpec().getBogieLocoPosition();
		SeatHorizontalAlignment alignment = bogiePosition == 0D ? null
				: SeatHorizontalAlignment.get(rollingStock.getClass().getName());
		writeRelativeSeatPosition(layout, seatIndex, section, bogiePosition,
				bodyYaw, bodyPitch, alignment, position);
		position[0] += rollingStock.posX;
		position[1] += rollingStock.posY + rollingStock.getMountedYOffset();
		position[2] += rollingStock.posZ;
		return true;
	}

	/** Calculates body slope without mixing horizontal distance into the angle. */
	public static double bogiePitchRadians(double deltaX, double deltaY, double deltaZ)
	{
		double horizontalDistance = Math.hypot(deltaX, deltaZ);
		// Coincident bogies have no usable slope, including during initial placement.
		return horizontalDistance == 0.0D ? 0.0D : Math.atan(deltaY / horizontalDistance);
	}

	/**
	 * Measures rise along body-forward travel in radians, retaining the last target at a stop.
	 * Reversing travel reverses both rise and forward distance, preserving body pitch.
	 * Known level track overrides vertical settling steps when leaving a slope.
	 */
	public static float motionPitchRadians(boolean levelTrack, double deltaX, double deltaY, double deltaZ,
			float forwardYawDegrees, float previousTargetRadians)
	{
		if (levelTrack)
		{
			return 0.0F;
		}
		double yawRadians = Math.toRadians(forwardYawDegrees);
		double forwardDistance = deltaX * Math.cos(yawRadians) + deltaZ * Math.sin(yawRadians);
		if (Math.abs(forwardDistance) <= 0.0001D)
		{
			return previousTargetRadians;
		}
		return (float) Math.atan(deltaY / forwardDistance);
	}

	/** Approaches the measured target even at a stop, snapping the final small difference exactly. */
	public static float smoothPitchRadians(float previousPitchRadians, float targetPitchRadians)
	{
		float difference = targetPitchRadians - previousPitchRadians;
		float maximumStep = Math.abs(difference) > 0.05F ? 0.05F : (0.5F / 60.0F);
		return Math.abs(difference) <= maximumStep
				? targetPitchRadians : previousPitchRadians + Math.copySign(maximumStep, difference);
	}

	/**
	 * Converts a vanilla rail tangent to the body's directed pitch in legacy radians.
	 * Vanilla rendering uses atan of normalized rise times 73 degrees; divide by the
	 * packet's factor of 60 so seats receive the same angle without movement-height steps.
	 */
	public static float vanillaRailPitchRadians(double railX, double railY, double railZ,
			float forwardYawDegrees)
	{
		double yawRadians = Math.toRadians(forwardYawDegrees);
		double forwardDistance = railX * Math.cos(yawRadians) + railZ * Math.sin(yawRadians);
		double tangentLength = Math.sqrt(railX * railX + railY * railY + railZ * railZ);
		if (Math.abs(forwardDistance) <= 0.0001D || tangentLength == 0.0D)
		{
			return 0.0F;
		}
		double forwardRise = Math.copySign(1.0D, forwardDistance) * railY / tangentLength;
		return (float) (Math.atan(forwardRise) * 73.0D / 60.0D);
	}

	/** Shared transform for both sides, before world origin and rider height are added. */
	static void writeRelativeSeatPosition(RollingStockSeatLayout layout, int seatIndex, SeatSection section, double bogiePosition,
			float bodyYaw, float bodyPitch, SeatHorizontalAlignment alignment, double[] position)
	{
		position[0] = layout.getForwardOffset(seatIndex);
		position[1] = layout.getUpOffset(seatIndex);
		position[2] = layout.getLeftOffset(seatIndex);
		if (section != null)
		{
			section.transform(position);
		}
		float forwardYaw = bodyYaw + (bogiePosition != 0.0D ? 90.0F : 180.0F);
		double forwardRadians = Math.toRadians(forwardYaw);
		double leftRadians = Math.toRadians(forwardYaw - 90.0F);
		if (alignment == null)
		{
			position[0] -= bogiePosition;
		}
		else
		{
			// The adapter already accounts for the legacy entity origin; do not subtract the bogie again.
			alignment.transform(position);
		}
		double forward = position[0];
		double up = position[1];
		double left = position[2];
		position[0] = Math.cos(forwardRadians) * forward
				+ Math.cos(leftRadians) * left;
		position[1] = up
				+ Math.tan(bodyPitch * TraincraftUtil.radian) * forward;
		position[2] = Math.sin(forwardRadians) * forward
				+ Math.sin(leftRadians) * left;
	}

	private static double square(double value)
	{
		return value * value;
	}
}
