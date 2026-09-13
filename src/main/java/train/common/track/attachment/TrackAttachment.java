package train.common.track.attachment;

import net.minecraft.nbt.NBTTagCompound;

/** Immutable placed attachment value. Offsets are relative to its authoritative rendering owner. */
public final class TrackAttachment
{
	private static final String TYPE_TAG = "Type";
	private static final String SLOT_TAG = "Slot";
	private static final String YAW_TAG = "Yaw";
	private static final String OFFSET_X_TAG = "OffsetX";
	private static final String OFFSET_Y_TAG = "OffsetY";
	private static final String OFFSET_Z_TAG = "OffsetZ";

	private final TrackAttachmentType type;
	private final String slotId;
	private final float yawDegrees;
	private final int offsetX;
	private final int offsetY;
	private final int offsetZ;

	/**
	 * Creates an attachment at one owner-relative cell using the supplied mounting placement.
	 *
	 * @param type registered attachment behavior and rendering definition
	 * @param placement validated mounting slot and canonical yaw
	 * @param offsetX owner-relative track-cell X coordinate
	 * @param offsetY owner-relative track-cell Y coordinate
	 * @param offsetZ owner-relative track-cell Z coordinate
	 */
	public TrackAttachment(TrackAttachmentType type, TrackAttachmentPlacement placement,
			int offsetX, int offsetY, int offsetZ)
	{
		if (type == null)
		{
			throw new IllegalArgumentException("Track attachment type cannot be null");
		}
		if (placement == null)
		{
			throw new IllegalArgumentException("Track attachment placement cannot be null");
		}
		this.type = type;
		this.slotId = placement.getSlotId();
		this.yawDegrees = placement.getYawDegrees();
		this.offsetX = offsetX;
		this.offsetY = offsetY;
		this.offsetZ = offsetZ;
	}

	/** @return the registered attachment type */
	public TrackAttachmentType getType()
	{
		return type;
	}

	/** @return the namespaced mounting slot */
	public String getSlotId()
	{
		return slotId;
	}

	/** @return normalized canonical world yaw in degrees */
	public float getYawDegrees()
	{
		return yawDegrees;
	}

	/** @return the owner-relative X coordinate */
	public int getOffsetX()
	{
		return offsetX;
	}

	/** @return the owner-relative Y coordinate */
	public int getOffsetY()
	{
		return offsetY;
	}

	/** @return the owner-relative Z coordinate */
	public int getOffsetZ()
	{
		return offsetZ;
	}

	/** @return whether this attachment occupies the supplied owner-relative cell */
	public boolean occupies(int x, int y, int z)
	{
		return offsetX == x && offsetY == y && offsetZ == z;
	}

	/** @return whether this attachment occupies the supplied owner-relative cell and mounting slot */
	public boolean occupiesSlot(int x, int y, int z, String candidateSlotId)
	{
		return occupies(x, y, z) && slotId.equals(candidateSlotId);
	}

	/** @return the behaviors supplied by this attachment's type */
	public int behaviorMask()
	{
		return type.getBehaviorMask();
	}

	/** @return a newly allocated persisted representation */
	public NBTTagCompound writeToNBT()
	{
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString(TYPE_TAG, type.getId());
		tag.setString(SLOT_TAG, slotId);
		tag.setFloat(YAW_TAG, yawDegrees);
		tag.setInteger(OFFSET_X_TAG, offsetX);
		tag.setInteger(OFFSET_Y_TAG, offsetY);
		tag.setInteger(OFFSET_Z_TAG, offsetZ);
		return tag;
	}

	/** Restores an attachment from the current pre-production persisted representation. */
	public static TrackAttachment readFromNBT(NBTTagCompound tag)
	{
		TrackAttachmentPlacement placement = new TrackAttachmentPlacement(
				tag.getString(SLOT_TAG), tag.getFloat(YAW_TAG));
		return new TrackAttachment(TrackAttachmentTypes.byId(tag.getString(TYPE_TAG)), placement,
				tag.getInteger(OFFSET_X_TAG), tag.getInteger(OFFSET_Y_TAG), tag.getInteger(OFFSET_Z_TAG));
	}

	@Override
	public boolean equals(Object other)
	{
		if ((other instanceof TrackAttachment) == false)
		{
			return false;
		}
		TrackAttachment attachment = (TrackAttachment)other;
		return type.equals(attachment.type) && slotId.equals(attachment.slotId)
				&& Float.compare(yawDegrees, attachment.yawDegrees) == 0
				&& occupies(attachment.offsetX, attachment.offsetY, attachment.offsetZ);
	}

	@Override
	public int hashCode()
	{
		int result = type.hashCode();
		result = 31 * result + slotId.hashCode();
		result = 31 * result + Float.floatToIntBits(yawDegrees);
		result = 31 * result + offsetX;
		result = 31 * result + offsetY;
		return 31 * result + offsetZ;
	}
}
