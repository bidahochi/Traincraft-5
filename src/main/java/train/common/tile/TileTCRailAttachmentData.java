package train.common.tile;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.nbt.NBTTagCompound;
import train.common.Traincraft;
import train.common.core.network.PacketTrackAttachmentState;
import train.common.track.attachment.TrackAttachment;
import train.common.track.attachment.TrackAttachments;

import java.util.List;

/** Owns a rail tile's attachment collection, persistence, and focused synchronization. */
public final class TileTCRailAttachmentData
{
	private final TileTCRail owner;
	private final TrackAttachments attachments = new TrackAttachments();

	/**
	 * Creates attachment state whose mutations are synchronized by the supplied rail owner.
	 *
	 * @param owner rail tile that persists and synchronizes this state
	 */
	public TileTCRailAttachmentData(TileTCRail owner)
	{
		if (owner == null)
		{
			throw new IllegalArgumentException("Track attachment state requires an owner");
		}
		this.owner = owner;
	}

	/** @return an immutable live view used by attachment queries and packet snapshots */
	public List<TrackAttachment> getAttachments()
	{
		return attachments.entries();
	}

	/**
	 * Returns whether the candidate can be installed without conflicting with an existing attachment.
	 *
	 * @param attachment candidate attachment
	 * @return whether the candidate can be installed
	 */
	public boolean canAdd(TrackAttachment attachment)
	{
		return attachments.canAdd(attachment);
	}

	/**
	 * Returns whether an installed attachment supplies the requested behavior.
	 *
	 * @param behavior attachment behavior mask
	 * @return whether the behavior is present
	 */
	public boolean hasBehavior(int behavior)
	{
		return attachments.hasBehavior(behavior);
	}

	/**
	 * Adds a non-conflicting attachment and synchronizes the resulting state.
	 *
	 * @param attachment validated attachment to install
	 * @return {@code true} when the attachment was installed
	 */
	public boolean add(TrackAttachment attachment)
	{
		if (attachments.add(attachment) == false)
		{
			return false;
		}
		markChanged();
		return true;
	}

	/**
	 * Removes and synchronizes the occupant of one owner-relative mounting slot.
	 *
	 * @param offsetX owner-relative track-cell X coordinate
	 * @param offsetY owner-relative track-cell Y coordinate
	 * @param offsetZ owner-relative track-cell Z coordinate
	 * @param slotId namespaced mounting slot to clear
	 * @return removed attachment, or {@code null} when the slot is empty
	 */
	public TrackAttachment removeAtSlot(int offsetX, int offsetY, int offsetZ, String slotId)
	{
		TrackAttachment removed = attachments.removeAtSlot(offsetX, offsetY, offsetZ, slotId);
		if (removed != null)
		{
			markChanged();
		}
		return removed;
	}

	/** Removes every attachment without synchronizing because the owning rail is being destroyed. */
	public List<TrackAttachment> removeAll()
	{
		return attachments.removeAll();
	}

	/**
	 * Replaces client attachment state received from the focused attachment packet.
	 *
	 * @param replacement complete attachment collection received from the server
	 */
	public void replaceFromNetwork(List<TrackAttachment> replacement)
	{
		attachments.replace(replacement);
	}

	/** @return whether the owner has no installed attachments */
	public boolean isEmpty()
	{
		return attachments.isEmpty();
	}

	/**
	 * Loads the attachment collection from the owning rail's persisted data.
	 *
	 * @param nbt owning rail's persisted data
	 */
	public void readFromNBT(NBTTagCompound nbt)
	{
		attachments.readFromNBT(nbt);
	}

	/**
	 * Writes non-empty attachment state into the owning rail's persisted data.
	 *
	 * @param nbt owning rail's mutable persisted data
	 */
	public void writeToNBT(NBTTagCompound nbt)
	{
		if (attachments.isEmpty() == false)
		{
			nbt.setTag(TrackAttachments.NBT_KEY, attachments.writeToNBT());
		}
	}

	private void markChanged()
	{
		owner.markDirty();
		if (owner.getWorldObj() != null && owner.getWorldObj().isRemote == false)
		{
			Traincraft.modChannel.sendToAllAround(new PacketTrackAttachmentState(owner),
					new NetworkRegistry.TargetPoint(owner.getWorldObj().provider.dimensionId,
							owner.xCoord + 0.5D, owner.yCoord + 0.5D, owner.zCoord + 0.5D, 256.0D));
		}
	}
}
