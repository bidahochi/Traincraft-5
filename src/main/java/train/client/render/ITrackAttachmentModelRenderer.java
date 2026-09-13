package train.client.render;

/** Renders one registered attachment model at the transform prepared by the track renderer. */
public interface ITrackAttachmentModelRenderer
{
	/**
	 * Renders attachment-local geometry without changing the caller's persistent graphics state.
	 *
	 * @param context placed attachment, authoritative owner, and sampled path information
	 */
	public void renderTrackAttachment(TrackAttachmentRenderContext context);
}
