package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import train.common.seats.SeatRole;

@SideOnly(Side.CLIENT)
public final class SeatSelectionButtons
{
	private SeatSelectionButtons()
	{
	}

	public static int colorForRole(SeatRole role)
	{
		if (role == SeatRole.LIVESTOCK)
		{
			return 0xFFC9956B;
		}
		if (role == SeatRole.DRIVER)
		{
			return 0xFFFFC857;
		}
		if (role == SeatRole.CREW)
		{
			return 0xFF67C1FF;
		}
		return 0xFF74D99F;
	}

	/** Wide footer control that does not rely on vanilla's 200-pixel widget texture. */
	public static final class WideButton extends GuiButton
	{
		public WideButton(int id, int x, int y, int width, int height, String label)
		{
			super(id, x, y, width, height, label);
		}

		@Override
		public void drawButton(Minecraft minecraft, int mouseX, int mouseY)
		{
			if (visible == false)
			{
				return;
			}
			boolean hovered = mouseX >= xPosition && mouseY >= yPosition
					&& mouseX < xPosition + width && mouseY < yPosition + height;
			int borderColor = hovered ? 0xFFB8D8F2 : 0xFF080B0F;
			int fillColor;
			if (enabled == false)
			{
				fillColor = 0xFF303840;
			}
			else
			{
				fillColor = hovered ? 0xFF50677B : 0xFF3B4C5C;
			}
			drawRect(xPosition, yPosition, xPosition + width, yPosition + height, borderColor);
			drawRect(xPosition + 2, yPosition + 2, xPosition + width - 2,
					yPosition + height - 2, fillColor);
			drawCenteredString(minecraft.fontRenderer, displayString,
					xPosition + width / 2, yPosition + (height - 8) / 2,
					enabled ? 0xFFFFFFFF : 0xFF8C969F);
		}
	}

	/** Compact color-coded seat marker with current, active, hover, and selection outlines. */
	public static final class SeatButton extends GuiButton
	{
		private final int seatIndex;
		private final SeatRole role;
		private boolean selected;
		private boolean available;
		private boolean current;
		private boolean active;

		public SeatButton(int id, int x, int y, int size, int seatIndex,
				SeatRole role)
		{
			super(id, x, y, size, size, Integer.toString(seatIndex + 1));
			this.seatIndex = seatIndex;
			this.role = role;
		}

		public void updateState(boolean available, boolean selected, boolean current, boolean active)
		{
			this.available = available;
			this.selected = selected;
			this.current = current;
			this.active = active;
		}

		public int getSeatIndex()
		{
			return seatIndex;
		}

		@Override
		public void drawButton(Minecraft minecraft, int mouseX, int mouseY)
		{
			if (visible == false)
			{
				return;
			}
			boolean hovered = isMouseOver(mouseX, mouseY);
			int borderColor = getBorderColor(hovered);
			int seatColor = available ? colorForRole(role) : 0xFF545B63;
			drawRect(xPosition, yPosition, xPosition + width, yPosition + height, borderColor);
			drawRect(xPosition + 2, yPosition + 2, xPosition + width - 2,
					yPosition + height - 2, seatColor);
			if (hovered || selected)
			{
				drawRect(xPosition + 4, yPosition + 4, xPosition + width - 4,
						yPosition + height - 4, available ? 0x55FFFFFF : 0x33FFFFFF);
			}
			FontRenderer font = minecraft.fontRenderer;
			if (font.getStringWidth(displayString) <= width - 4)
			{
				drawCenteredString(font, displayString, xPosition + width / 2,
						yPosition + (height - 8) / 2, 0xFFFFFFFF);
			}
		}

		private boolean isMouseOver(int mouseX, int mouseY)
		{
			return mouseX >= xPosition && mouseY >= yPosition
					&& mouseX < xPosition + width && mouseY < yPosition + height;
		}

		private int getBorderColor(boolean hovered)
		{
			if (selected)
			{
				return 0xFFFFFFFF;
			}
			if (current)
			{
				return 0xFF67C1FF;
			}
			if (active)
			{
				return 0xFFFFC857;
			}
			return hovered ? 0xFFB8D8F2 : 0xFF080B0F;
		}
	}
}
