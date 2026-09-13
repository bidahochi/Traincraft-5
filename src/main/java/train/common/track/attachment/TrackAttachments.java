package train.common.track.attachment;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Mutable attachment collection owned by a track render tile. */
public final class TrackAttachments
{
	private static final int COMPOUND_TAG_TYPE = 10;

	/** Stable NBT list containing every attachment owned by a rail render tile. */
	public static final String NBT_KEY = "TrackAttachments";

	private final List<TrackAttachment> entries = new ArrayList<TrackAttachment>();
	private final List<TrackAttachment> entriesView = Collections.unmodifiableList(entries);
	private int behaviorMask;

	/** Creates an empty attachment collection for one authoritative track owner. */
	public TrackAttachments()
	{
	}

	/** @return an immutable live view of the installed attachments */
	public List<TrackAttachment> entries()
	{
		return entriesView;
	}

	/** @return whether no attachments are installed */
	public boolean isEmpty()
	{
		return entries.isEmpty();
	}

	/** @return whether any installed attachment supplies the requested behavior */
	public boolean hasBehavior(int mask)
	{
		return (behaviorMask & mask) == mask;
	}

	/**
	 * Adds an attachment when it does not conflict with an existing occupant.
	 *
	 * @param attachment immutable attachment to add
	 * @return whether the attachment was accepted
	 */
	public boolean add(TrackAttachment attachment)
	{
		if (canAdd(attachment) == false)
		{
			return false;
		}
		entries.add(attachment);
		behaviorMask |= attachment.behaviorMask();
		return true;
	}

	/**
	 * Returns whether an attachment could be added without changing this collection.
	 *
	 * @param attachment candidate attachment
	 * @return whether the candidate has no duplicate identity or occupied-slot conflict
	 */
	public boolean canAdd(TrackAttachment attachment)
	{
		return attachment != null && entries.contains(attachment) == false
				&& conflictsWithExistingAttachment(attachment) == false;
	}

	/** Returns whether the candidate's mounting slot is already occupied in the same owner-relative cell. */
	private boolean conflictsWithExistingAttachment(TrackAttachment attachment)
	{
		for (TrackAttachment existing : entries)
		{
			if (existing.occupiesSlot(attachment.getOffsetX(), attachment.getOffsetY(), attachment.getOffsetZ(),
					attachment.getSlotId()))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Removes the attachment occupying one exact owner-relative mounting slot.
	 *
	 * @param x owner-relative track-cell X coordinate
	 * @param y owner-relative track-cell Y coordinate
	 * @param z owner-relative track-cell Z coordinate
	 * @param slotId namespaced mounting slot to remove
	 * @return removed attachment, or {@code null} when the slot is empty
	 */
	public TrackAttachment removeAtSlot(int x, int y, int z, String slotId)
	{
		for (int index = 0; index < entries.size(); index++)
		{
			TrackAttachment attachment = entries.get(index);
			if (attachment.occupiesSlot(x, y, z, slotId))
			{
				entries.remove(index);
				rebuildBehaviorMask();
				return attachment;
			}
		}
		return null;
	}

	/** Removes and returns all attachments. */
	public List<TrackAttachment> removeAll()
	{
		List<TrackAttachment> removed = new ArrayList<TrackAttachment>(entries);
		clear();
		return removed;
	}

	/**
	 * Replaces the collection while enforcing normal conflict rules. A {@code null} source is treated as an empty
	 * replacement so network and persistence callers cannot leave stale entries.
	 *
	 * @param attachments replacement entries, or {@code null} to clear the collection
	 */
	public void replace(List<TrackAttachment> attachments)
	{
		clear();
		if (attachments != null)
		{
			for (TrackAttachment attachment : attachments)
			{
				add(attachment);
			}
		}
	}

	/** Removes every attachment without producing drops. */
	public void clear()
	{
		entries.clear();
		behaviorMask = 0;
	}

	/** Rebuilds the aggregate behavior mask after removal so no behavior remains cached without an owner. */
	private void rebuildBehaviorMask()
	{
		behaviorMask = 0;
		for (TrackAttachment attachment : entries)
		{
			behaviorMask |= attachment.behaviorMask();
		}
	}

	/** @return the serialized attachment list */
	public NBTTagList writeToNBT()
	{
		NBTTagList list = new NBTTagList();
		for (TrackAttachment attachment : entries)
		{
			list.appendTag(attachment.writeToNBT());
		}
		return list;
	}

	/**
	 * Replaces this collection from the current attachment NBT list, ignoring conflicting later entries.
	 *
	 * @param tag rail tile compound containing {@link #NBT_KEY}
	 */
	public void readFromNBT(NBTTagCompound tag)
	{
		clear();
		NBTTagList list = tag.getTagList(NBT_KEY, COMPOUND_TAG_TYPE);
		for (int index = 0; index < list.tagCount(); index++)
		{
			add(TrackAttachment.readFromNBT(list.getCompoundTagAt(index)));
		}
	}
}
