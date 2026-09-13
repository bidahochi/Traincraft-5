package train.common.track.attachment;

/** Controls whether attachment-local geometry follows the owning track surface pitch. */
public enum TrackAttachmentSlopeAlignment
{
	/** Rotate attachment-local geometry to follow the track surface. */
	TRACK_SURFACE,
	/** Preserve world-vertical geometry while translating it to the track surface height. */
	WORLD_UPRIGHT
}
