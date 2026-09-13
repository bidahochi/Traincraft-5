package train.common.track.attachment;

/** Supplies the design identity and physical dimensions for an attachable block item. */
public interface ITrackAttachmentSource
{
	/** @return stable startup-registered attachment type identifier */
	public String getTrackAttachmentTypeId();

	/**
	 * Returns the stable design key shared by common attachment data and its optional client renderer.
	 *
	 * @return stable attachment design identifier
	 */
	public String getTrackAttachmentDesignId();

	/**
	 * Returns the attachment's selection and collision dimensions.
	 *
	 * @return immutable local-space bounds
	 */
	public TrackAttachmentBounds getTrackAttachmentBounds();
}
