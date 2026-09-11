package train.common.track.attachment;

import net.minecraft.item.ItemStack;

import java.util.LinkedHashMap;
import java.util.Map;

/** Registry of attachment identities, independent from their placement and rendering state. */
public final class TrackAttachmentTypes
{
	private static final String UNKNOWN_TYPE_ID = "tc:unknown_attachment";
	private static final Map<String, TrackAttachmentType> TYPES = new LinkedHashMap<String, TrackAttachmentType>();
	private static final TrackAttachmentType UNKNOWN = new TrackAttachmentType(UNKNOWN_TYPE_ID, 0, null,
			"", TrackAttachmentBounds.EMPTY, TrackAttachmentSlopeAlignment.WORLD_UPRIGHT);

	private TrackAttachmentTypes()
	{
	}

	/**
	 * Registers one complete attachment definition during startup and rejects conflicting identities.
	 *
	 * @param id stable namespaced persistence and network identifier
	 * @param behaviorMask attachment behavior flags
	 * @param removalDrop item stack returned by survival removal
	 * @param designId stable client model design identifier
	 * @param bounds canonical attachment-local selection and collision bounds
	 * @param slopeAlignment policy controlling whether geometry follows track pitch
	 * @return immutable registered type
	 */
	public static synchronized TrackAttachmentType register(String id, int behaviorMask, ItemStack removalDrop,
			String designId, TrackAttachmentBounds bounds, TrackAttachmentSlopeAlignment slopeAlignment)
	{
		return register(id, behaviorMask, removalDrop, designId, bounds, null, slopeAlignment);
	}

	/**
	 * Registers a type whose bounds may vary with its mounted-track geometry.
	 *
	 * @param id stable namespaced persistence and network identifier
	 * @param behaviorMask attachment behavior flags
	 * @param removalDrop item stack returned by survival removal
	 * @param designId stable client model design identifier
	 * @param bounds default local bounds and startup validation dimensions
	 * @param boundsResolver owner-aware geometry bounds resolver
	 * @param slopeAlignment policy controlling whether geometry follows track pitch
	 * @return immutable registered type
	 */
	public static synchronized TrackAttachmentType register(String id, int behaviorMask, ItemStack removalDrop,
			String designId, TrackAttachmentBounds bounds, TrackAttachmentBoundsResolver boundsResolver,
			TrackAttachmentSlopeAlignment slopeAlignment)
	{
		TrackAttachmentType candidate = new TrackAttachmentType(
				id, behaviorMask, removalDrop, designId, bounds, boundsResolver, slopeAlignment);
		TrackAttachmentType existing = TYPES.get(id);
		if (existing != null)
		{
			throw new IllegalArgumentException("Duplicate track attachment registration: " + id);
		}
		TYPES.put(id, candidate);
		return candidate;
	}

	/**
	 * Resolves a persisted identity to its startup-registered definition or the inert unknown type.
	 *
	 * @param id stable namespaced attachment type identifier
	 * @return registered type, or an inert type when optional or corrupted data cannot be resolved
	 */
	public static synchronized TrackAttachmentType byId(String id)
	{
		TrackAttachmentType existing = TYPES.get(id);
		return existing == null ? UNKNOWN : existing;
	}
}
