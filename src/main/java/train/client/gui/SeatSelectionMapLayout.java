package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;

/** Computes bounded screen coordinates for every authored seat in a schematic carriage map. */
@SideOnly(Side.CLIENT)
public final class SeatSelectionMapLayout
{
	private static final int MAP_HORIZONTAL_PADDING = 13;
	private static final int MAP_VERTICAL_PADDING = 21;
	private static final double MAX_PIXELS_PER_BLOCK = 40.0D;
	private static final int BODY_PADDING = 8;
	private final int[] seatLeft;
	private final int[] seatTop;
	private int buttonSize;
	private int bodyLeft;
	private int bodyTop;
	private int bodyRight;
	private int bodyBottom;

	/**
	 * Fits the stock's forward/left seat plane inside the supplied GUI bounds while reserving the
	 * complete button footprint and direction-marker padding.
	 */
	public SeatSelectionMapLayout(EntityRollingStock rollingStock, int mapLeft, int mapTop,
			int mapRight, int mapBottom, int seatButtonSize)
	{
		buttonSize = seatButtonSize;
		bodyLeft = mapLeft + MAP_HORIZONTAL_PADDING - BODY_PADDING;
		bodyRight = mapRight - MAP_HORIZONTAL_PADDING + BODY_PADDING;
		bodyTop = (mapTop + mapBottom) / 2 - 20;
		bodyBottom = bodyTop + 40;
		if (rollingStock == null)
		{
			Traincraft.tcLog.warn("[Seat selection] Cannot build seat map without rolling stock");
			seatLeft = new int[0];
			seatTop = new int[0];
			return;
		}
		int seatCount = rollingStock.getSeatCount();
		seatLeft = new int[seatCount];
		seatTop = new int[seatCount];
		if (seatCount == 0)
		{
			return;
		}

		double minForward = Double.MAX_VALUE;
		double maxForward = -Double.MAX_VALUE;
		double minLeft = Double.MAX_VALUE;
		double maxLeft = -Double.MAX_VALUE;
		double closestSeat = Double.MAX_VALUE;
		float[][] offsets = new float[seatCount][];
		for (int seatIndex = 0; seatIndex < seatCount; seatIndex++)
		{
			float[] offset = rollingStock.getSeatOffset(seatIndex);
			offsets[seatIndex] = offset;
			minForward = Math.min(minForward, offset[0]);
			maxForward = Math.max(maxForward, offset[0]);
			minLeft = Math.min(minLeft, offset[2]);
			maxLeft = Math.max(maxLeft, offset[2]);
			for (int previous = 0; previous < seatIndex; previous++)
			{
				// Square markers need clearance on either axis, not the diagonal distance.
				double separation = Math.max(Math.abs(offset[0] - offsets[previous][0]),
						Math.abs(offset[2] - offsets[previous][2]));
				if (separation > 0.0D)
				{
					closestSeat = Math.min(closestSeat, separation);
				}
			}
		}

		int halfButton = seatButtonSize / 2;
		int innerLeft = mapLeft + MAP_HORIZONTAL_PADDING + halfButton;
		int innerRight = mapRight - MAP_HORIZONTAL_PADDING - halfButton;
		int innerTop = mapTop + MAP_VERTICAL_PADDING + halfButton;
		int innerBottom = mapBottom - MAP_VERTICAL_PADDING - halfButton;
		double forwardSpan = Math.max(1.0D, maxForward - minForward);
		double leftSpan = Math.max(1.0D, maxLeft - minLeft);
		double scale = Math.max(0.0D, Math.min(MAX_PIXELS_PER_BLOCK,
				Math.min((innerRight - innerLeft) / forwardSpan, (innerBottom - innerTop) / leftSpan)));
		buttonSize = Math.max(10, (int) Math.min(seatButtonSize, closestSeat * scale * 0.9D));
		halfButton = buttonSize / 2;
		double forwardMiddle = (minForward + maxForward) * 0.5D;
		double leftMiddle = (minLeft + maxLeft) * 0.5D;
		int mapCenterX = (innerLeft + innerRight) / 2;
		int mapCenterY = (innerTop + innerBottom) / 2;

		for (int seatIndex = 0; seatIndex < seatCount; seatIndex++)
		{
			float[] offset = offsets[seatIndex];
			// Match Fanto's schematic: forward runs right and lateral offsets run down.
			int seatCenterX = mapCenterX + (int) Math.round((offset[0] - forwardMiddle) * scale);
			int seatCenterY = mapCenterY + (int) Math.round((offset[2] - leftMiddle) * scale);
			seatLeft[seatIndex] = seatCenterX - halfButton;
			seatTop[seatIndex] = seatCenterY - halfButton;
		}
		// A schematic body around the seat footprint, rather than a border around the whole panel.
		int bodyWidth = Math.min(mapRight - mapLeft - 10,
				Math.max(100, (int) Math.ceil((maxForward - minForward) * scale) + buttonSize + BODY_PADDING * 2));
		int bodyHeight = Math.min(mapBottom - mapTop - 26,
				Math.max(44, (int) Math.ceil((maxLeft - minLeft) * scale) + buttonSize + BODY_PADDING * 2));
		bodyLeft = mapCenterX - bodyWidth / 2;
		bodyRight = bodyLeft + bodyWidth;
		bodyTop = mapCenterY - bodyHeight / 2;
		bodyBottom = bodyTop + bodyHeight;
	}

	public int getButtonSize()
	{
		return buttonSize;
	}

	public int getBodyLeft()
	{
		return bodyLeft;
	}

	public int getBodyRight()
	{
		return bodyRight;
	}

	public int getBodyTop()
	{
		return bodyTop;
	}

	public int getBodyBottom()
	{
		return bodyBottom;
	}

	public int getSeatLeft(int seatIndex)
	{
		return seatLeft[seatIndex];
	}

	public int getSeatTop(int seatIndex)
	{
		return seatTop[seatIndex];
	}
}
