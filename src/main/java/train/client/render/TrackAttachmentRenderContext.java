package train.client.render;

import train.common.library.track.path.TrackPathSample;
import train.common.tile.TileTCRail;
import train.common.track.attachment.TrackAttachment;

/** Immutable client render inputs for one attachment after its world transform has been prepared. */
public final class TrackAttachmentRenderContext
{
	private final TileTCRail owner;
	private final TrackAttachment attachment;
	private final TrackPathSample pathSample;
	private final int selectedCellX;
	private final int selectedCellY;
	private final int selectedCellZ;

	/**
	 * Creates the model-facing view of one transformed attachment.
	 *
	 * @param owner authoritative track owner
	 * @param attachment placed attachment
	 * @param pathSample sampled attachment position and tangent
	 */
	public TrackAttachmentRenderContext(TileTCRail owner, TrackAttachment attachment, TrackPathSample pathSample)
	{
		this.owner = owner;
		this.attachment = attachment;
		this.pathSample = pathSample;
		this.selectedCellX = owner.xCoord + attachment.getOffsetX();
		this.selectedCellY = owner.yCoord + attachment.getOffsetY();
		this.selectedCellZ = owner.zCoord + attachment.getOffsetZ();
	}

	/** @return authoritative track owner */
	public TileTCRail getOwner()
	{
		return owner;
	}

	/** @return placed attachment */
	public TrackAttachment getAttachment()
	{
		return attachment;
	}

	/** @return path position and tangent used by the shared transform */
	public TrackPathSample getPathSample()
	{
		return pathSample;
	}

	/** @return selected attachment-bearing cell's world X coordinate */
	public int getSelectedCellX()
	{
		return selectedCellX;
	}

	/** @return selected attachment-bearing cell's world Y coordinate */
	public int getSelectedCellY()
	{
		return selectedCellY;
	}

	/** @return selected attachment-bearing cell's world Z coordinate */
	public int getSelectedCellZ()
	{
		return selectedCellZ;
	}
}
