package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;
import train.client.core.handlers.SeatGuiNavigationHandler.ReturnTarget;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.seats.RollingStockSeatLayout;
import train.common.seats.SeatDefinition;
import train.common.seats.SeatFunction;
import train.common.seats.SeatRole;
import train.client.gui.SeatSelectionButtons.SeatButton;
import train.client.gui.SeatSelectionButtons.WideButton;
import train.common.core.network.PacketSeatSelection;

/** Responsive schematic rolling-stock seat picker opened by sneak-use. */
@SideOnly(Side.CLIENT)
public final class GuiSeatSelection extends GuiScreen
{
	private static final int PANEL_MAX_WIDTH = 520;
	private static final int PANEL_MAX_HEIGHT = 300;
	private static final int PANEL_MARGIN = 10;
	private static final int HEADER_HEIGHT = 42;
	private static final int FOOTER_HEIGHT = 64;
	private static final int SEAT_BUTTON_SIZE = 20;
	private static final int SEAT_BUTTON_BASE_ID = 1000;
	private static final int DOUBLE_CLICK_MILLISECONDS = 350;
	private static final int CHANGE_SEAT_ID = 1;
	private static final int TRANSFER_ID = 2;
	private static final int EMERGENCY_ID = 3;
	private static final int RESET_EMERGENCY_ID = 4;
	private static final int PARKING_BRAKE_ID = 5;
	private static final int BACK_ID = 6;
	private static final int LIVESTOCK_BOARDING_ID = 7;

	private final EntityRollingStock rollingStock;
	private final ReturnTarget returnTarget;
	private int panelLeft;
	private int panelTop;
	private int panelWidth;
	private int panelHeight;
	private int mapLeft;
	private int mapTop;
	private int mapRight;
	private int mapBottom;
	private int detailsLeft;
	private int detailsRight;
	private int selectedSeatIndex = -1;
	private int lastClickedSeatIndex = -1;
	private long lastSeatClickAt;
	private RollingStockSeatLayout displayedSeatLayout;
	private SeatSelectionMapLayout mapLayout;

	public GuiSeatSelection(EntityRollingStock rollingStock)
	{
		this(rollingStock, ReturnTarget.NONE);
	}

	public GuiSeatSelection(EntityRollingStock rollingStock, ReturnTarget returnTarget)
	{
		this.rollingStock = rollingStock;
		this.returnTarget = returnTarget == null ? ReturnTarget.NONE : returnTarget;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void initGui()
	{
		displayedSeatLayout = rollingStock.getSeatLayoutForRuntime();
		panelWidth = Math.min(PANEL_MAX_WIDTH, width - PANEL_MARGIN * 2);
		panelHeight = Math.min(PANEL_MAX_HEIGHT, height - PANEL_MARGIN * 2);
		panelLeft = (width - panelWidth) / 2;
		panelTop = (height - panelHeight) / 2;

		int detailsWidth = panelWidth >= 430 ? 150 : 112;
		mapLeft = panelLeft + 12;
		mapTop = panelTop + HEADER_HEIGHT;
		mapRight = panelLeft + panelWidth - detailsWidth - 18;
		mapBottom = panelTop + panelHeight - FOOTER_HEIGHT;
		detailsLeft = mapRight + 8;
		detailsRight = panelLeft + panelWidth - 12;

		buttonList.clear();
		int actionY = panelTop + panelHeight - 56;
		int actionWidth = Math.max(40, (panelWidth - 44) / 5);
		boolean compactActions = panelWidth < 420;
		buttonList.add(new WideButton(CHANGE_SEAT_ID, panelLeft + 14, actionY, actionWidth, 20,
				translate(compactActions ? "seat.selection.button.move" : "seat.selection.button.changeSeat")));
		buttonList.add(new WideButton(TRANSFER_ID, panelLeft + 18 + actionWidth, actionY, actionWidth, 20,
				translate(compactActions ? "seat.selection.button.transfer"
						: "seat.selection.button.transferControls")));
		buttonList.add(new WideButton(EMERGENCY_ID, panelLeft + 22 + actionWidth * 2, actionY,
				actionWidth, 20, translate(compactActions ? "seat.selection.button.emergency"
						: "seat.selection.button.emergencyBrake")));
		buttonList.add(new WideButton(RESET_EMERGENCY_ID, panelLeft + 26 + actionWidth * 3, actionY,
				actionWidth, 20, translate(compactActions ? "seat.selection.button.reset"
						: "seat.selection.button.resetEmergency")));
		buttonList.add(new WideButton(PARKING_BRAKE_ID, panelLeft + 30 + actionWidth * 4, actionY,
				actionWidth, 20, translate(compactActions ? "seat.selection.button.parking"
						: "seat.selection.button.setParkingBrake")));
		int backWidth = returnTarget == ReturnTarget.NONE ? 0 : 54;
		int livestockWidth = displayedSeatLayout.hasLivestockSeats() ? 120 : 0;
		buttonList.add(new WideButton(BACK_ID, panelLeft + 14, panelTop + panelHeight - 32,
				backWidth, 20, translate("seat.selection.button.back")));
		buttonList.add(new WideButton(0, panelLeft + 18 + backWidth, panelTop + panelHeight - 32,
				panelWidth - 32 - backWidth - livestockWidth, 20, translate("seat.selection.button.autoSelect")));
		if (livestockWidth > 0)
		{
			buttonList.add(new WideButton(LIVESTOCK_BOARDING_ID, panelLeft + panelWidth - 14 - livestockWidth,
					panelTop + panelHeight - 32, livestockWidth, 20, ""));
		}
		addSeatButtons();
		updateActionButtons();
	}

	@SuppressWarnings("unchecked")
	private void addSeatButtons()
	{
		mapLayout = new SeatSelectionMapLayout(rollingStock,
				mapLeft, mapTop, mapRight, mapBottom, SEAT_BUTTON_SIZE);
		for (int seatIndex = 0; seatIndex < rollingStock.getSeatCount(); seatIndex++)
		{
			SeatButton button = new SeatButton(SEAT_BUTTON_BASE_ID + seatIndex,
					mapLayout.getSeatLeft(seatIndex), mapLayout.getSeatTop(seatIndex),
					mapLayout.getButtonSize(), seatIndex, rollingStock.getSeatDefinition(seatIndex).getRole());
			button.updateState(rollingStock.isSeatAvailable(seatIndex), false, false, false);
			buttonList.add(button);
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTick)
	{
		if (displayedSeatLayout != rollingStock.getSeatLayoutForRuntime())
		{
			selectedSeatIndex = -1;
			lastClickedSeatIndex = -1;
			initGui();
		}
		drawDefaultBackground();
		drawPanel();
		updateSeatButtons();
		super.drawScreen(mouseX, mouseY, partialTick);
		drawDetailsPanel();
	}

	private void drawPanel()
	{
		drawRect(panelLeft, panelTop, panelLeft + panelWidth, panelTop + panelHeight, 0xEE121923);
		drawRect(panelLeft + 4, panelTop + 4, panelLeft + panelWidth - 4, panelTop + panelHeight - 4, 0xFF25313E);
		drawRect(panelLeft + 8, panelTop + HEADER_HEIGHT - 4,
				panelLeft + panelWidth - 8, panelTop + HEADER_HEIGHT - 2, 0xFF435466);
		drawCenteredString(fontRendererObj, rollingStock.getTrainName(), panelLeft + panelWidth / 2,
				panelTop + 11, 0xFFFFFFFF);
		drawCenteredString(fontRendererObj, rollingStock.isPassengerOfThis(mc.thePlayer)
				? translate("seat.selection.hint.move") : translate("seat.selection.hint.board"),
				panelLeft + panelWidth / 2, panelTop + 25, 0xFFB8C7D9);

		drawRect(mapLeft, mapTop, mapRight, mapBottom, 0xFF151D26);
		int bodyLeft = mapLayout.getBodyLeft();
		int bodyRight = mapLayout.getBodyRight();
		int bodyTop = mapLayout.getBodyTop();
		int bodyBottom = mapLayout.getBodyBottom();
		drawRect(bodyLeft, bodyTop, bodyRight, bodyBottom, 0xFF9EAFBF);
		drawRect(bodyLeft + 2, bodyTop + 2, bodyRight - 2, bodyBottom - 2, 0xFF202D39);
		fontRendererObj.drawString(translate("seat.selection.map.rear"),
				bodyLeft, bodyTop - 12, 0xFF9EAFBF);
		String frontLabel = translate("seat.selection.map.front");
		fontRendererObj.drawString(frontLabel,
				bodyRight - fontRendererObj.getStringWidth(frontLabel), bodyTop - 12, 0xFF9EAFBF);

		drawRect(detailsLeft, mapTop, detailsRight, mapBottom, 0xFF18232D);
		drawRect(detailsLeft + 1, mapTop + 1, detailsRight - 1, mapBottom - 1, 0xFF202D39);
	}

	private void updateSeatButtons()
	{
		for (Object object : buttonList)
		{
			if (object instanceof SeatButton)
			{
				SeatButton seatButton = (SeatButton) object;
				int seatIndex = seatButton.getSeatIndex();
				seatButton.updateState(rollingStock.isSeatAvailable(seatIndex),
						seatIndex == selectedSeatIndex,
						seatIndex == rollingStock.getSeatIndexForPassenger(mc.thePlayer),
						seatIndex == rollingStock.getActiveControlSeatIndex());
			}
		}
		updateActionButtons();
	}

	private void updateActionButtons()
	{
		boolean onboard = rollingStock.isPassengerOfThis(mc.thePlayer);
		int currentSeat = rollingStock.getSeatIndexForPassenger(mc.thePlayer);
		SeatDefinition currentDefinition = rollingStock.getSeatDefinition(currentSeat);
		SeatDefinition selectedDefinition = rollingStock.getSeatDefinition(selectedSeatIndex);
		for (Object object : buttonList)
		{
			if ((object instanceof GuiButton) == false)
			{
				continue;
			}
			GuiButton button = (GuiButton) object;
			if (button.id == 0)
			{
				button.displayString = onboard ? translate("seat.selection.button.moveClosest")
						: translate("seat.selection.button.autoSelect");
			}
			else if (button.id == CHANGE_SEAT_ID)
			{
				button.visible = onboard && selectedSeatIndex != currentSeat && rollingStock.isSeatAvailable(selectedSeatIndex);
			}
			else if (button.id == TRANSFER_ID)
			{
				Entity targetOccupant = rollingStock.getSeatOccupant(selectedSeatIndex);
				boolean handingOver = rollingStock.isActiveDriver(mc.thePlayer) && targetOccupant != null
						&& targetOccupant != mc.thePlayer;
				boolean takingControls = rollingStock.isActiveDriver(mc.thePlayer) == false
						&& selectedSeatIndex == currentSeat;
				button.visible = onboard && selectedDefinition != null
						&& selectedDefinition.hasFunction(SeatFunction.DRIVE)
						&& targetOccupant instanceof net.minecraft.entity.player.EntityPlayer
						&& rollingStock.isProtectedControlAuthorized(mc.thePlayer)
						&& rollingStock.isProtectedControlAuthorized((net.minecraft.entity.player.EntityPlayer) targetOccupant)
						&& (handingOver || takingControls);
				boolean changingCab = rollingStock.getActiveControlStationId().length() > 0
						&& rollingStock.getActiveControlStationId().equals(selectedDefinition == null
						? "" : selectedDefinition.getControlStationId()) == false;
				boolean parkingBrakeRequired = handingOver && changingCab || takingControls
						&& (rollingStock.getActiveControlSeatIndex() >= 0 || changingCab);
				button.enabled = button.visible && (parkingBrakeRequired == false
						|| rollingStock.getParkingBrakeFromPacket());
				button.displayString = button.enabled == false && button.visible
						? translate("seat.selection.button.parkingRequired")
						: takingControls ? translate("seat.selection.button.takeControls")
						: translate("seat.selection.button.handOverControls");
			}
			else if (button.id == EMERGENCY_ID)
			{
				button.visible = onboard && rollingStock.isEmergencyBrakeApplied() == false && currentDefinition != null
						&& currentDefinition.hasFunction(SeatFunction.EMERGENCY_BRAKE);
			}
			else if (button.id == RESET_EMERGENCY_ID)
			{
				button.visible = onboard && rollingStock.isEmergencyBrakeApplied();
				button.enabled = button.visible && Math.abs(rollingStock.getSpeed()) < 0.1D
						&& rollingStock.isProtectedControlAuthorized(mc.thePlayer)
						&& (rollingStock.isActiveDriver(mc.thePlayer) || currentDefinition != null
						&& currentDefinition.isCabSeat());
			}
			else if (button.id == PARKING_BRAKE_ID)
			{
				button.visible = onboard && rollingStock.getActiveControlSeatIndex() < 0
						&& rollingStock.getParkingBrakeFromPacket() == false && currentDefinition != null
						&& currentDefinition.isCabSeat()
						&& rollingStock.isProtectedControlAuthorized(mc.thePlayer);
				button.enabled = button.visible && Math.abs(rollingStock.getSpeed()) < 10.0D;
			}
			else if (button.id == BACK_ID)
			{
				button.visible = returnTarget != ReturnTarget.NONE;
			}
			else if (button.id == LIVESTOCK_BOARDING_ID)
			{
				button.enabled = rollingStock.isProtectedControlAuthorized(mc.thePlayer)
						&& (onboard || mc.thePlayer.getDistanceSqToEntity(rollingStock) <= 64.0D);
				button.displayString = translate(rollingStock.isLivestockUnloading()
						? "seat.selection.button.allowLivestock" : "seat.selection.button.unloadLivestock");
			}
		}
	}

	private void drawDetailsPanel()
	{
		int textLeft = detailsLeft + 8;
		int textWidth = detailsRight - detailsLeft - 16;
		int mapHeight = mapBottom - mapTop;
		boolean compact = mapHeight < 175;
		boolean veryCompact = mapHeight < 145;
		fontRendererObj.drawString(translate("seat.selection.details.title"), textLeft, mapTop + 9, 0xFFD5E1EC);
		String activeDriver = rollingStock.getActiveDriverName();
		String activeCab = rollingStock.getActiveControlStationId();
		fontRendererObj.drawString(format("seat.selection.details.driver",
				activeDriver.length() == 0 ? translate("seat.selection.none") : activeDriver),
				textLeft, mapTop + 21, 0xFFB8C7D9);
		fontRendererObj.drawString(format("seat.selection.details.cab",
				activeCab.length() == 0 ? translate("seat.selection.none") : activeCab.replace('_', ' ')),
				textLeft, mapTop + 32, 0xFFB8C7D9);
		if (selectedSeatIndex < 0)
		{
			fontRendererObj.drawSplitString(translate("seat.selection.details.empty"),
					textLeft, mapTop + 48, textWidth, 0xFF9EAFBF);
		}
		else
		{
			SeatDefinition definition = rollingStock.getSeatDefinition(selectedSeatIndex);
			SeatRole role = definition.getRole();
			boolean available = rollingStock.isSeatAvailable(selectedSeatIndex);
			float[] offset = rollingStock.getSeatOffset(selectedSeatIndex);
			Entity occupant = rollingStock.getSeatOccupant(selectedSeatIndex);
			fontRendererObj.drawString(format("seat.selection.details.seat", selectedSeatIndex + 1)
					+ (rollingStock.getSeatIndexForPassenger(mc.thePlayer) == selectedSeatIndex
					? translate("seat.selection.details.you") : ""),
					textLeft, mapTop + 48, 0xFFFFFFFF);
			fontRendererObj.drawString(formatRole(role), textLeft, mapTop + 60,
					SeatSelectionButtons.colorForRole(role));
			int availabilityY = veryCompact ? mapTop + 72 : mapTop + 84;
			if (veryCompact == false)
			{
				fontRendererObj.drawString(offset[0] >= 0.0F
								? translate("seat.selection.details.frontSection")
								: translate("seat.selection.details.rearSection"),
						textLeft, mapTop + 72, 0xFFB8C7D9);
			}
			String availability = available ? translate("seat.selection.details.available") : formatOccupant(occupant);
			fontRendererObj.drawString(availability, textLeft, availabilityY,
					available ? 0xFF74D99F : 0xFF8C969F);
			if (veryCompact == false)
			{
				fontRendererObj.drawString(format("seat.selection.details.station",
								formatStation(definition.getControlStationId())),
						textLeft, mapTop + 96, 0xFFB8C7D9);
				fontRendererObj.drawString(format("seat.selection.details.function",
								formatFunctions(definition)),
						textLeft, mapTop + 108, 0xFFB8C7D9);
			}
			if (compact == false)
			{
				fontRendererObj.drawString(format("seat.selection.details.protectedActions",
								rollingStock.isProtectedControlAuthorized(mc.thePlayer)
								? translate("seat.selection.yes") : translate("seat.selection.no")),
						textLeft, mapTop + 120, 0xFF9EAFBF);
			}
		}

		drawCompactLegend(textLeft, textWidth);
	}

	private void drawCompactLegend(int textLeft, int textWidth)
	{
		if (displayedSeatLayout.hasLivestockSeats())
		{
			drawLegendEntry(textLeft, mapBottom - 27, SeatSelectionButtons.colorForRole(SeatRole.LIVESTOCK),
					translate("seat.selection.legend.livestock"));
			drawLegendEntry(textLeft, mapBottom - 12, 0xFF545B63, translate("seat.selection.legend.blocked"));
			return;
		}
		int legendTop = mapBottom - 27;
		if (textWidth < 125)
		{
			int itemWidth = textWidth / 4;
			drawLegendEntry(textLeft, mapBottom - 12, 0xFFD89A2B,
					translate("seat.selection.legend.driver.short"));
			drawLegendEntry(textLeft + itemWidth, mapBottom - 12, 0xFF377EAE,
					translate("seat.selection.legend.crew.short"));
			drawLegendEntry(textLeft + itemWidth * 2, mapBottom - 12, 0xFF3D9965,
					translate("seat.selection.legend.passenger.short"));
			drawLegendEntry(textLeft + itemWidth * 3, mapBottom - 12, 0xFF545B63,
					translate("seat.selection.legend.blocked.short"));
			return;
		}
		int columnWidth = textWidth / 2;
		drawLegendEntry(textLeft, legendTop, 0xFFD89A2B, translate("seat.selection.legend.driver"));
		drawLegendEntry(textLeft + columnWidth, legendTop, 0xFF377EAE, translate("seat.selection.legend.crew"));
		drawLegendEntry(textLeft, legendTop + 12, 0xFF3D9965, translate("seat.selection.legend.passenger"));
		drawLegendEntry(textLeft + columnWidth, legendTop + 12, 0xFF545B63,
				translate("seat.selection.legend.blocked"));
	}

	private static String formatOccupant(Entity occupant)
	{
		return occupant == null ? translate("seat.selection.details.unavailable")
				: format("seat.selection.details.occupiedBy", occupant.getCommandSenderName());
	}

	private static String formatStation(String stationId)
	{
		return stationId.length() == 0 ? translate("seat.selection.none") : stationId;
	}

	private static String formatFunctions(SeatDefinition definition)
	{
		boolean drive = definition.hasFunction(SeatFunction.DRIVE);
		boolean emergencyBrake = definition.hasFunction(SeatFunction.EMERGENCY_BRAKE);
		if (drive && emergencyBrake)
		{
			return translate("seat.selection.function.driveEmergency");
		}
		if (drive)
		{
			return translate("seat.selection.function.drive");
		}
		if (emergencyBrake)
		{
			return translate("seat.selection.function.emergencyBrake");
		}
		return translate("seat.selection.none");
	}

	private void drawLegendEntry(int x, int y, int color, String label)
	{
		drawRect(x, y, x + 8, y + 8, 0xFF080B0F);
		drawRect(x + 1, y + 1, x + 7, y + 7, color);
		fontRendererObj.drawString(label, x + 12, y, 0xFFB8C7D9);
	}

	private static String formatRole(SeatRole role)
	{
		if (role == SeatRole.LIVESTOCK)
		{
			return translate("seat.selection.role.livestock");
		}
		if (role == SeatRole.DRIVER)
		{
			return translate("seat.selection.role.driver");
		}
		if (role == SeatRole.CREW)
		{
			return translate("seat.selection.role.crew");
		}
		return translate("seat.selection.role.passenger");
	}

	private static String translate(String key)
	{
		return StatCollector.translateToLocal(key);
	}

	private static String format(String key, Object... arguments)
	{
		return StatCollector.translateToLocalFormatted(key, arguments);
	}

	@Override
	protected void keyTyped(char typedChar, int keyCode)
	{
		if (keyCode != Keyboard.KEY_NONE && keyCode == mc.gameSettings.keyBindInventory.getKeyCode())
		{
			keyCode = Keyboard.KEY_ESCAPE;
		}
		super.keyTyped(typedChar, keyCode);
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		if (button.enabled == false)
		{
			return;
		}
		if (button.id == 0)
		{
			Traincraft.modChannel.sendToServer(PacketSeatSelection.auto(rollingStock));
			mc.thePlayer.closeScreen();
			return;
		}
		if (button.id == CHANGE_SEAT_ID)
		{
			Traincraft.modChannel.sendToServer(PacketSeatSelection.move(rollingStock, selectedSeatIndex));
			mc.thePlayer.closeScreen();
			return;
		}
		if (button.id == TRANSFER_ID)
		{
			Traincraft.modChannel.sendToServer(PacketSeatSelection.transfer(rollingStock, selectedSeatIndex));
			return;
		}
		if (button.id == EMERGENCY_ID)
		{
			Traincraft.modChannel.sendToServer(PacketSeatSelection.applyEmergency(rollingStock));
			return;
		}
		if (button.id == RESET_EMERGENCY_ID)
		{
			Traincraft.modChannel.sendToServer(PacketSeatSelection.resetEmergency(rollingStock));
			return;
		}
		if (button.id == PARKING_BRAKE_ID)
		{
			Traincraft.modChannel.sendToServer(PacketSeatSelection.applyParking(rollingStock));
			return;
		}
		if (button.id == BACK_ID)
		{
			returnTarget.open(rollingStock);
			return;
		}
		if (button.id == LIVESTOCK_BOARDING_ID)
		{
			Traincraft.modChannel.sendToServer(PacketSeatSelection.setLivestockBoarding(
					rollingStock, rollingStock.isLivestockUnloading()));
			return;
		}
		if (button.id < SEAT_BUTTON_BASE_ID)
		{
			return;
		}

		int seatIndex = button.id - SEAT_BUTTON_BASE_ID;
		long clickTime = Minecraft.getSystemTime();
		boolean isDoubleClick = seatIndex == selectedSeatIndex && seatIndex == lastClickedSeatIndex
				&& clickTime - lastSeatClickAt <= DOUBLE_CLICK_MILLISECONDS;
		selectedSeatIndex = seatIndex;
		lastClickedSeatIndex = seatIndex;
		lastSeatClickAt = clickTime;
		if (isDoubleClick && rollingStock.isSeatAvailable(seatIndex))
		{
			Traincraft.modChannel.sendToServer(rollingStock.isPassengerOfThis(mc.thePlayer)
					? PacketSeatSelection.move(rollingStock, seatIndex)
					: PacketSeatSelection.select(rollingStock, seatIndex));
			mc.thePlayer.closeScreen();
		}
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}

}
