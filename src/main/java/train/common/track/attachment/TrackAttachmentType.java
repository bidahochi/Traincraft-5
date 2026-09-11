package train.common.track.attachment;

import net.minecraft.item.ItemStack;
import train.common.tile.TileTCRail;

import java.util.regex.Pattern;

/** Registered identity and shared behavior of one kind of track attachment. */
public final class TrackAttachmentType
{
	private static final Pattern NAMESPACED_ID_PATTERN = Pattern.compile("[a-z0-9_.-]+:[a-z0-9_./-]+");
	/** Indicates that the attachment contributes client-side geometry. */
	public static final int RENDERS = 1;
	/** Indicates that the attachment behaves as a track-end buffer. */
	public static final int BUFFER = 2;

	private final String id;
	private final int behaviorMask;
	private final ItemStack removalDrop;
	private final String designId;
	private final TrackAttachmentBounds bounds;
	private final TrackAttachmentBoundsResolver boundsResolver;
	private final TrackAttachmentSlopeAlignment slopeAlignment;

	/**
	 * Creates a registered attachment identity and its shared physical behavior.
	 *
	 * @param id stable namespaced persistence and network identifier
	 * @param behaviorMask attachment behavior flags
	 * @param removalDrop item stack returned by survival removal, defensively copied
	 * @param designId stable client model design identifier
	 * @param bounds canonical attachment-local selection and collision bounds
	 * @param slopeAlignment policy controlling whether geometry follows track pitch
	 */
	public TrackAttachmentType(String id, int behaviorMask, ItemStack removalDrop,
			String designId, TrackAttachmentBounds bounds, TrackAttachmentSlopeAlignment slopeAlignment)
	{
		this(id, behaviorMask, removalDrop, designId, bounds, null, slopeAlignment);
	}

	/**
	 * Creates a type whose mounted track geometry may refine its local bounds.
	 *
	 * @param id stable namespaced persistence and network identifier
	 * @param behaviorMask attachment behavior flags
	 * @param removalDrop item stack returned by survival removal
	 * @param designId stable client model design identifier
	 * @param bounds default local bounds and startup validation dimensions
	 * @param boundsResolver optional owner-aware bounds resolver
	 * @param slopeAlignment policy controlling whether geometry follows track pitch
	 */
	TrackAttachmentType(String id, int behaviorMask, ItemStack removalDrop,
			String designId, TrackAttachmentBounds bounds, TrackAttachmentBoundsResolver boundsResolver,
			TrackAttachmentSlopeAlignment slopeAlignment)
	{
		if (id == null || NAMESPACED_ID_PATTERN.matcher(id).matches() == false)
		{
			throw new IllegalArgumentException("Invalid namespaced track attachment type id: " + id);
		}
		this.id = id;
		if (designId == null)
		{
			throw new IllegalArgumentException("Track attachment design id cannot be null: " + id);
		}
		if (bounds == null)
		{
			throw new IllegalArgumentException("Track attachment bounds cannot be null: " + id);
		}
		if (slopeAlignment == null)
		{
			throw new IllegalArgumentException("Track attachment slope alignment cannot be null: " + id);
		}
		boolean renders = (behaviorMask & RENDERS) != 0;
		boolean isBuffer = (behaviorMask & BUFFER) != 0;
		if (renders && (designId.length() == 0 || bounds.isEmpty()))
		{
			throw new IllegalArgumentException("Rendered track attachment requires a design and bounds: " + id);
		}
		if (isBuffer && renders == false)
		{
			throw new IllegalArgumentException("Track buffer attachment must also render: " + id);
		}
		if (behaviorMask != 0 && removalDrop == null)
		{
			throw new IllegalArgumentException("Active track attachment requires a removal drop: " + id);
		}
		this.behaviorMask = behaviorMask;
		this.removalDrop = removalDrop == null ? null : removalDrop.copy();
		this.designId = designId;
		this.bounds = bounds;
		this.boundsResolver = boundsResolver;
		this.slopeAlignment = slopeAlignment;
	}

	/** @return the stable persisted identifier */
	public String getId()
	{
		return id;
	}

	/** @return the complete bitwise behavior mask */
	public int getBehaviorMask()
	{
		return behaviorMask;
	}

	/** @return a defensive copy of the removal drop, or {@code null} for an inert type */
	public ItemStack getRemovalDrop()
	{
		return removalDrop == null ? null : removalDrop.copy();
	}

	/** @return stable design identifier, or an empty string when this type has no visible design */
	public String getDesignId()
	{
		return designId;
	}

	/** @return immutable selection and collision dimensions */
	public TrackAttachmentBounds getBounds()
	{
		return bounds;
	}

	/**
	 * Returns local bounds refined for the mounted track geometry when the type supplies a resolver.
	 *
	 * @param owner authoritative track owner
	 * @param attachment installed attachment
	 * @return local selection and collision bounds
	 */
	public TrackAttachmentBounds getBounds(TileTCRail owner, TrackAttachment attachment)
	{
		return boundsResolver != null ? boundsResolver.resolveBounds(owner, attachment) : bounds;
	}

	/** @return how this attachment responds to track slope pitch */
	public TrackAttachmentSlopeAlignment getSlopeAlignment()
	{
		return slopeAlignment;
	}

	/** @return whether every requested behavior bit is present */
	public boolean hasBehavior(int behavior)
	{
		return (behaviorMask & behavior) == behavior;
	}

	@Override
	public boolean equals(Object other)
	{
		return other instanceof TrackAttachmentType && id.equals(((TrackAttachmentType)other).id);
	}

	@Override
	public int hashCode()
	{
		return id.hashCode();
	}
}
