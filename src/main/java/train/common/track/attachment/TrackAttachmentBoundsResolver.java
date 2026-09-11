package train.common.track.attachment;

import train.common.tile.TileTCRail;

/** Resolves attachment-local bounds when the mounted track geometry affects their dimensions. */
public interface TrackAttachmentBoundsResolver
{
	/**
	 * Resolves local bounds for one attachment and its authoritative track owner.
	 *
	 * @param owner authoritative track owner
	 * @param attachment installed attachment
	 * @return local selection and collision bounds
	 */
	public TrackAttachmentBounds resolveBounds(TileTCRail owner, TrackAttachment attachment);
}
