package train.client.core.handlers;

import train.common.seats.RollingStockSeatManager;

import com.jcirmodelsquad.tcjcir.features.geometry.GuiGeometryCar;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc.ExperimentalGeometryCar;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.Vec3;
import org.lwjgl.input.Keyboard;
import train.client.gui.GuiMTCInfo;
import train.client.gui.GuiSleeperCar;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractControlCar;
import train.common.api.EntityRollingStock;
import train.common.api.AbstractWorkCart;
import train.common.api.Locomotive;
import train.common.api.SteamTrain;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketKeyPress;

public class TCKeyHandler {
	public static KeyBinding horn;
	public static KeyBinding inventory;
	public static KeyBinding up;
	public static KeyBinding down;
	public static KeyBinding idle;
	public static KeyBinding furnace;
	public static KeyBinding MTCScreen;
	public static KeyBinding toggleATO;
	public static KeyBinding mtcOverride;
	public static KeyBinding overspeedOverride;
	public static KeyBinding remoteControlForward;
	public static KeyBinding remoteControlBackwards;
	public static KeyBinding remoteControlHorn;
	public static KeyBinding remoteControlBrake;
	public static KeyBinding bell;

	public long bellTimerMillis = System.currentTimeMillis();
	public long storedMillis = System.currentTimeMillis();

	public TCKeyHandler() {
		horn = new KeyBinding("key.traincraft.horn", Keyboard.KEY_H, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(horn);
		inventory = new KeyBinding("key.traincraft.inventory", Keyboard.KEY_R, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(inventory);
		up = new KeyBinding("key.traincraft.up", Keyboard.KEY_NONE, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(up);
		down = new KeyBinding("key.traincraft.down", Keyboard.KEY_NONE, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(down);
		idle = new KeyBinding("key.traincraft.idle", Keyboard.KEY_C, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(idle);
		furnace = new KeyBinding("key.traincraft.furnace", Keyboard.KEY_F, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(furnace);
		bell = new KeyBinding("Locomotive Bell", Keyboard.KEY_B, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(bell);


			MTCScreen = new KeyBinding("key.traincraft.showMTCScreen", Keyboard.KEY_NONE, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(MTCScreen);
			toggleATO = new KeyBinding("key.traincraft.toggleATO", Keyboard.KEY_NONE, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(toggleATO);
			mtcOverride = new KeyBinding("key.traincraft.mtcOverride", Keyboard.KEY_NONE, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(mtcOverride);
			overspeedOverride = new KeyBinding("key.traincraft.overspeedOverride", Keyboard.KEY_NONE, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(overspeedOverride);

		remoteControlForward = new KeyBinding("Remote Control Forward", Keyboard.KEY_NUMPAD8, "key.categories.traincraft");
        remoteControlBackwards = new KeyBinding("Remote Control Backwards", Keyboard.KEY_NUMPAD8, "key.categories.traincraft");
        remoteControlBrake = new KeyBinding("Remote Control Brake", Keyboard.KEY_NUMPAD0, "key.categories.traincraft");
        remoteControlHorn = new KeyBinding("Remote Control Horn", Keyboard.KEY_NUMPADENTER, "key.categories.traincraft");

        ClientRegistry.registerKeyBinding(remoteControlForward);
        ClientRegistry.registerKeyBinding(remoteControlBackwards);
        ClientRegistry.registerKeyBinding(remoteControlBrake);
        ClientRegistry.registerKeyBinding(remoteControlHorn);

	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		if (Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen() == false)
		{
			if (up.getIsKeyPressed()) {
				sendKeyControlsPacket(0);
			}
			if (down.getIsKeyPressed()) {
				sendKeyControlsPacket(2);
			}
			if (idle.isPressed()) {
				sendKeyControlsPacket(6);
			}
			if (inventory.isPressed())
			{
				Minecraft minecraft = Minecraft.getMinecraft();
				Entity riddenTransport = minecraft.thePlayer == null ? null : minecraft.thePlayer.ridingEntity;
				EntityRollingStock rollingStock = RollingStockSeatManager.getRidingStock(minecraft.thePlayer);
				if (rollingStock instanceof AbstractPassengerCar && ((AbstractPassengerCar) rollingStock).hasSleepingBunk())
				{
					minecraft.displayGuiScreen(new GuiSleeperCar((AbstractPassengerCar) rollingStock));
				}
				else if (riddenTransport instanceof ExperimentalGeometryCar)
				{
					sendKeyControlsPacket(7);
					minecraft.displayGuiScreen(new GuiGeometryCar(minecraft.thePlayer));
				}
				else
				{
					boolean directWorkCart = rollingStock instanceof AbstractWorkCart
							&& Minecraft.getMinecraft().thePlayer.ridingEntity == rollingStock;
					boolean directControlCar = rollingStock instanceof AbstractControlCar
							&& Minecraft.getMinecraft().thePlayer.ridingEntity == rollingStock;
					if (rollingStock != null && rollingStock.isActiveDriver(Minecraft.getMinecraft().thePlayer) == false
							&& directWorkCart == false && directControlCar == false)
					{
						SeatGuiNavigationHandler.openSeatSelection(null);
					}
					else
					{
						sendKeyControlsPacket(7);
					}
				}
			}
			if (horn.isPressed()) {
				sendKeyControlsPacket(8);
			}
			/*if (lampControl.isPressed()) {
				if (Minecraft.getMinecraft().thePlayer.ridingEntity != null && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;

					if (train.lampOn) {
						train.lampOn = true;
						//((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("lampOn true"));
						//System.out.println(train.lampOn);
					} else {
						train.lampOn = false;
					}
					//train.lightsOn = train.lightsOn * -1;
					//train.lampOn = !train.lampOn;
					//System.out.println(train.lampOn);
					//lamp is t/f light is number
				}
				sendKeyControlsPacket(19);
			}*/
			/*if (lampControl.isPressed()) {//TODO: make lights work eventually
				/*if (Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					if(storedMillis+ 1000 <System.currentTimeMillis()){//15000 for 15 seconds
						storedMillis=System.currentTimeMillis();
					}
				}
				sendKeyControlsPacket(19);
			}*/

			/*if (bell.isPressed()) {
				if (Minecraft.getMinecraft().thePlayer.ridingEntity != null && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;
						if(bellTimerMillis+ 1000 <System.currentTimeMillis()){//15000 for 15 seconds
							bellTimerMillis=System.currentTimeMillis();
							train.bellPressed=!train.bellPressed;

						}
					//train.bellPressed=!train.bellPressed;
					if (train.bellPressed) {
						train.bellPressed = true;//BELLPRESSED NEEDS TO BE TRUE
						System.out.println(true);// WHY AREYOUNT TRUE
					} else {
						train.bellPressed = false;
						System.out.println(false);
					}
				}
				sendKeyControlsPacket(10);
			}*/
			if (bell.isPressed()) {
				if (Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					if(bellTimerMillis+ 1000 <System.currentTimeMillis()){//15000 for 15 seconds
						bellTimerMillis=System.currentTimeMillis();
					}
				}
				sendKeyControlsPacket(10);
			}


			if (furnace.isPressed()) {
				sendKeyControlsPacket(9);
			}


                EntityRollingStock stock = RollingStockSeatManager.getRidingStock(Minecraft.getMinecraft().thePlayer);
                boolean openMtc = MTCScreen.isPressed();
                boolean toggleAto = toggleATO.isPressed();
                boolean overrideMtc = mtcOverride.isPressed();
                boolean overrideOverspeed = overspeedOverride.isPressed();
                if (stock instanceof Locomotive && stock.isActiveDriver(Minecraft.getMinecraft().thePlayer)
                        && stock.isProtectedControlAuthorized(Minecraft.getMinecraft().thePlayer))
                {
                    if (openMtc && FMLClientHandler.instance().isGUIOpen(GuiMTCInfo.class) == false)
                    {
                        Minecraft.getMinecraft().displayGuiScreen(new GuiMTCInfo(stock));
                    }
                    if (toggleAto)
                    {
                        sendKeyControlsPacket(16);
                    }
                    if (overrideMtc)
                    {
                        sendKeyControlsPacket(17);
                    }
                    if (overrideOverspeed)
                    {
                        sendKeyControlsPacket(18);
                    }
                }

		}



		if (FMLClientHandler.instance().getClient().gameSettings.keyBindSneak.isPressed() && Keyboard.isKeyDown(Keyboard.KEY_F3)) {
			sendKeyControlsPacket(404);
		}
	}


	
	private static void sendKeyControlsPacket(int key)
	{
		Traincraft.keyChannel.sendToServer(new PacketKeyPress(key));
	}
}
