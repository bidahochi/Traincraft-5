package train.common.track.attachment.legacy;

import net.minecraft.util.MathHelper;
import train.common.enums.TCTrackDirection;

/** Converts standalone buffer placement yaw into Traincraft's historical metadata convention. */
public final class TrackBufferOrientation
{
	private static final float YAW_SECTOR_COUNT = 8.0F;
	private static final float FULL_ROTATION_DEGREES = 360.0F;
	private static final double YAW_ROUNDING_OFFSET = 0.5D;

	private TrackBufferOrientation()
	{
	}

	/**
	 * Converts player yaw to the corrected eight-way orientation expected by legacy standalone buffer tiles.
	 *
	 * @param playerYawDegrees player yaw in degrees
	 * @return corrected Traincraft buffer orientation
	 */
	public static byte fromPlayerYaw(float playerYawDegrees)
	{
		int yawSector = MathHelper.floor_double(
				playerYawDegrees * YAW_SECTOR_COUNT / FULL_ROTATION_DEGREES + YAW_ROUNDING_OFFSET);
		byte direction = TCTrackDirection.ConvertDiagonalDirectionInput(
				(byte)normalize(yawSector));
		switch (direction)
		{
			case 0:
				return 3;
			case 1:
			case 2:
			case 3:
				return (byte)(direction - 1);
			default:
				return direction;
		}
	}

	/** @return the supplied legacy orientation wrapped into the eight-way range */
	public static int normalize(int orientation)
	{
		return (orientation % 8 + 8) % 8;
	}
}
