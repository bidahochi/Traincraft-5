/*******************************************************************************
 * Copyright (c) 20getNetworkID()2 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import com.jcirmodelsquad.tcjcir.extras.packets.MissionStatusPacket;
import com.jcirmodelsquad.tcjcir.extras.packets.RemoteControlKeyPacket;
import com.jcirmodelsquad.tcjcir.extras.packets.UpdateGeometryCar;
import com.jcirmodelsquad.tcjcir.features.aipkitinterface.PacketInterfaceAction;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import train.common.Traincraft;
import train.common.core.network.*;
import train.common.core.network.AdminBook.PacketAdminBook;
import train.common.core.network.AdminBook.PacketAdminBookClient;
import train.common.core.network.AdminBook.PacketAdminBookToggleChunkLoading;
import train.common.core.network.lockout.PacketLockoutAddUserToSkinGroup;
import train.common.core.network.lockout.PacketPaintBrushClientSideUpdate;
import train.common.library.Info;
import train.common.mtc.network.*;

public class PacketHandler {

	public static void init(){
		Traincraft.tcLog.info("Initializing Packets");
		Traincraft.modChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.channel);
		Traincraft.keyChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.keyChannel);
		Traincraft.rotationChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.rotationChannel);


		Traincraft.slotschannel = NetworkRegistry.INSTANCE.newSimpleChannel("slots");
		Traincraft.ignitionChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ignition");
		Traincraft.brakeChannel = NetworkRegistry.INSTANCE.newSimpleChannel("brake");
		Traincraft.rollingStockLightsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("rollingStockLights");
		Traincraft.rollingStockBeaconChannel = NetworkRegistry.INSTANCE.newSimpleChannel("rollingStockBeacon");
		Traincraft.rollingStockDitchLightsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ditchLights");
		Traincraft.lockChannel = NetworkRegistry.INSTANCE.newSimpleChannel("lock");
		Traincraft.builderChannel = NetworkRegistry.INSTANCE.newSimpleChannel("builder");
		Traincraft.paintbrushColorChannel = NetworkRegistry.INSTANCE.newSimpleChannel("paintbrushColor");
        Traincraft.overlayTextureChannel = NetworkRegistry.INSTANCE.newSimpleChannel("overlayTexture");
		Traincraft.switchStandLockChannel = NetworkRegistry.INSTANCE.newSimpleChannel("switchStandLock");
		Traincraft.cargoSelectionChannel = NetworkRegistry.INSTANCE.newSimpleChannel("cargoSelection");
		Traincraft.interchangeChannel = NetworkRegistry.INSTANCE.newSimpleChannel("reportChannel");
		Traincraft.toggleChunkLoadingChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ToggleChunkLoading");
		Traincraft.lockoutCommChannel = NetworkRegistry.INSTANCE.newSimpleChannel("lockoutCommChannel");


		Traincraft.keyChannel.registerMessage(PacketAdminBook.Handler.class, PacketAdminBook.class, 4, Side.CLIENT);
		Traincraft.keyChannel.registerMessage(PacketAdminBookClient.Handler.class, PacketAdminBookClient.class, 5, Side.SERVER);
		Traincraft.toggleChunkLoadingChannel.registerMessage(PacketAdminBookToggleChunkLoading.Handler.class, PacketAdminBookToggleChunkLoading.class, 22, Side.SERVER);

		Traincraft.keyChannel.registerMessage(PacketKeyPress.Handler.class, PacketKeyPress.class, 1,
				Side.SERVER);
		Traincraft.rotationChannel.registerMessage(PacketRollingStockRotation.Handler.class,
				PacketRollingStockRotation.class, 2, Side.CLIENT);
		Traincraft.modChannel.registerMessage(PacketSetJukeboxStreamingUrl.Handler.class,
				PacketSetJukeboxStreamingUrl.class, 1, Side.SERVER);
		Traincraft.slotschannel.registerMessage(PacketSlotsFilled.Handler.class, PacketSlotsFilled.class,
				3, Side.CLIENT);
		Traincraft.brakeChannel.registerMessage(PacketParkingBrake.Handler.class, PacketParkingBrake.class,
				4, Side.SERVER);
		Traincraft.rollingStockLightsChannel.registerMessage(PacketRollingStockLights.Handler.class, PacketRollingStockLights.class,
				19, Side.SERVER);
		Traincraft.rollingStockBeaconChannel.registerMessage(PacketRollingStockBeacon.Handler.class, PacketRollingStockBeacon.class,
				20, Side.SERVER);
		Traincraft.rollingStockDitchLightsChannel.registerMessage(PacketRollingStockDitchLights.Handler.class, PacketRollingStockDitchLights.class,
				21, Side.SERVER);

		Traincraft.lockChannel.registerMessage(PacketSetTrainLockedToClient.Handler.class,
				PacketSetTrainLockedToClient.class, 6, Side.SERVER);
		Traincraft.lockChannel.registerMessage(PacketSetTrainLockedToClient.Handler.class,
				PacketSetTrainLockedToClient.class, 18, Side.CLIENT);
		Traincraft.lockChannel.registerMessage(PacketAddNote.Handler.class,
				PacketAddNote.class, 10, Side.SERVER);
		Traincraft.ignitionChannel.registerMessage(PacketSetLocoTurnedOn.Handler.class, PacketSetLocoTurnedOn.class,
				6, Side.SERVER);
		Traincraft.modChannel.registerMessage(PacketLantern.Handler.class, PacketLantern.class, 7,
				Side.SERVER);
		Traincraft.builderChannel.registerMessage(PacketTrackBuilderHeight.Handler.class,
				PacketTrackBuilderHeight.class, 8, Side.SERVER);
		Traincraft.builderChannel.registerMessage(PacketTrackBuilderFollow.Handler.class,
				PacketTrackBuilderFollow.class, 9, Side.SERVER);
		Traincraft.paintbrushColorChannel.registerMessage(PacketPaintbrushColor.Handler.class, PacketPaintbrushColor.class, 11, Side.SERVER);
		Traincraft.paintbrushColorChannel.registerMessage(PacketPaintBrushClientSideUpdate.Handler.class, PacketPaintBrushClientSideUpdate.class, 27, Side.CLIENT);
        Traincraft.overlayTextureChannel.registerMessage(PacketTextureOverlayConfig.Handler.class, PacketTextureOverlayConfig.class, 14, Side.CLIENT);
        Traincraft.overlayTextureChannel.registerMessage(PacketTextureOverlayConfig.Handler.class, PacketTextureOverlayConfig.class, 15, Side.SERVER);
		Traincraft.ignitionChannel.registerMessage(PacketDropFire.Handler.class, PacketDropFire.class, 28, Side.SERVER);

		Traincraft.switchStandLockChannel.registerMessage(PacketUpdateSwitchStand.Handler.class,
				PacketUpdateSwitchStand.class, 17, Side.SERVER);
		Traincraft.cargoSelectionChannel.registerMessage(PacketCargoSelection.Handler.class,
				PacketCargoSelection.class, 16, Side.CLIENT);
		Traincraft.cargoSelectionChannel.registerMessage(PacketCargoSelection.Handler.class,
				PacketCargoSelection.class, 16, Side.SERVER);

		Traincraft.mtcBlockChannel.registerMessage(HANDLERS[0], PacketUpdateSpeedTransmitter.class, 200, Side.SERVER);
		Traincraft.mtcBlockChannel.registerMessage(HANDLERS[1], PacketUpdateStopPointTransmitter.class, 201, Side.SERVER);
		Traincraft.mtcChannel.registerMessage(HANDLERS[2], PacketSpeedLimit.class, 202, Side.CLIENT);
		Traincraft.mtcChannel.registerMessage(HANDLERS[3], PacketStopPoint.class, 203, Side.CLIENT);
		Traincraft.mtcChannel.registerMessage(HANDLERS[4], PacketMTCStatus.class, 204, Side.CLIENT);
		Traincraft.mtcChannel.registerMessage(HANDLERS[5], PacketATO.class, 205, Side.CLIENT);
		Traincraft.mtcChannel.registerMessage(HANDLERS[8], PacketInterfaceAction.class, 209, Side.SERVER);
		Traincraft.geometryCarChannel.registerMessage(HANDLERS[6], UpdateGeometryCar.class, 206, Side.SERVER);
		Traincraft.geometryCarChannel.registerMessage(HANDLERS[7], MissionStatusPacket.class, 207, Side.SERVER);
		Traincraft.remoteControlKey.registerMessage(RemoteControlKeyPacket.Handler.class, RemoteControlKeyPacket.class, 208, Side.SERVER);


		Traincraft.interchangeChannel.registerMessage(PacketClientSideEvent.Handler.class, PacketClientSideEvent.class, 25, Side.CLIENT);

		Traincraft.lockoutCommChannel.registerMessage(PacketLockoutAddUserToSkinGroup.Handler.class, PacketLockoutAddUserToSkinGroup.class, 26, Side.SERVER);
	}

	private static final IMessageHandler[] HANDLERS = new IMessageHandler[]{
			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			},
			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			},
			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			},
			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			},
			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			},
			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			},

			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			},

			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			},
			new IMessageHandler<IMessage, IMessage>() {
				@Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
			}
	};
}

