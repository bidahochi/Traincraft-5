package train.client.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.event.GuiScreenEvent;
import train.common.Traincraft;
import train.client.gui.AbstractGuiLocomotive;
import train.client.gui.GuiSeatSelection;
import train.client.gui.GuiSleeperCar;
import train.common.api.AbstractPassengerCar;
import train.common.api.EntityRollingStock;
import train.common.core.network.PacketSeatSelection;
import static train.common.seats.RollingStockSeatManager.getRidingStock;

@SideOnly(Side.CLIENT)
public final class SeatGuiNavigationHandler
{
	private static final int SEATS_BUTTON_ID = 19351;

	@SubscribeEvent
	@SuppressWarnings("unchecked")
	public void onGuiInitialized(GuiScreenEvent.InitGuiEvent.Post event)
	{
		if (event.gui instanceof GuiContainer)
		{
			addSeatNavigationButton((GuiContainer) event.gui, event.buttonList);
		}
	}

	public static void addSeatNavigationButton(GuiContainer screen, List<GuiButton> buttons)
	{
		if (getRidingStock(Minecraft.getMinecraft().thePlayer) == null)
		{
			return;
		}
		for (GuiButton button : buttons)
		{
			if (button.id == SEATS_BUTTON_ID)
			{
				return;
			}
		}
		GuiButton seatsButton = screen instanceof AbstractGuiLocomotive
				? ((AbstractGuiLocomotive) screen).createSeatNavigationButton(SEATS_BUTTON_ID)
				: new GuiButton(SEATS_BUTTON_ID, screen.width - 58, 6, 52, 20,
						StatCollector.translateToLocal("seat.selection.button.seats"));
		buttons.add(seatsButton);
	}

	@SubscribeEvent
	public void onButtonPressed(GuiScreenEvent.ActionPerformedEvent.Pre event)
	{
		if (event.button.id != SEATS_BUTTON_ID)
		{
			return;
		}
		EntityRollingStock rollingStock = getRidingStock(Minecraft.getMinecraft().thePlayer);
		if (rollingStock != null)
		{
			event.setCanceled(true);
			openSeatSelection(event.gui);
		}
	}

	public static boolean openSeatSelection(GuiScreen originatingScreen)
	{
		EntityRollingStock rollingStock = getRidingStock(Minecraft.getMinecraft().thePlayer);
		if (rollingStock == null)
		{
			return false;
		}
		Minecraft.getMinecraft().displayGuiScreen(
				new GuiSeatSelection(rollingStock, ReturnTarget.fromScreen(originatingScreen)));
		return true;
	}

	/** Safe destinations which never reuse a container that has already been closed. */
	public enum ReturnTarget
	{
		NONE,
		PLAYER_INVENTORY,
		SLEEPER_CAR,
		ROLLING_STOCK_GUI;

		public static ReturnTarget fromScreen(GuiScreen screen)
		{
			if (screen instanceof GuiSleeperCar)
			{
				return SLEEPER_CAR;
			}
			if (screen instanceof GuiInventory)
			{
				return PLAYER_INVENTORY;
			}
			if (screen instanceof GuiContainer)
			{
				return ROLLING_STOCK_GUI;
			}
			return NONE;
		}

		public void open(EntityRollingStock rollingStock)
		{
			Minecraft minecraft = Minecraft.getMinecraft();
			switch (this)
			{
				case SLEEPER_CAR:
					if (getRidingStock(minecraft.thePlayer) == rollingStock
							&& rollingStock instanceof AbstractPassengerCar && rollingStock.isDead == false
							&& ((AbstractPassengerCar) rollingStock).hasSleepingBunk())
					{
						minecraft.displayGuiScreen(new GuiSleeperCar((AbstractPassengerCar) rollingStock));
						break;
					}
					minecraft.displayGuiScreen(null);
					break;
				case PLAYER_INVENTORY:
					minecraft.displayGuiScreen(new GuiInventory(minecraft.thePlayer));
					break;
				case ROLLING_STOCK_GUI:
					minecraft.displayGuiScreen(null);
					Traincraft.modChannel.sendToServer(PacketSeatSelection.reopenRollingStockGui(rollingStock));
					break;
				default:
					minecraft.displayGuiScreen(null);
					break;
			}
		}
	}

}
