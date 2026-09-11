package train.common.track.attachment;

/** Track-path geometry families understood by road-crossing attachments. */
public enum RoadCrossingGeometry
{
	/** Straight path aligned with one horizontal world axis. */
	CARDINAL_STRAIGHT,
	/** Straight path crossing a block cell diagonally; recognized but not yet registered for placement. */
	DIAGONAL_STRAIGHT
}
