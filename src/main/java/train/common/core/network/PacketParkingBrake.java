package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import train.common.api.AbstractControlCar;
import train.common.api.EntityRollingStock;

public class PacketParkingBrake implements IMessage {

	boolean	ParkingBrake;
	int		entityID;
    public PacketParkingBrake() {}

	public PacketParkingBrake(boolean parking, int trainEntity) {
		this.ParkingBrake = parking;
		this.entityID = trainEntity;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {
		this.ParkingBrake = bbuf.readBoolean();
		this.entityID = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {
		bbuf.writeBoolean(this.ParkingBrake);
		bbuf.writeInt(this.entityID);
    }

    public static class Handler implements IMessageHandler<PacketParkingBrake, IMessage> {

        @Override
        public IMessage onMessage(PacketParkingBrake message, MessageContext context)
        {
			
            EntityPlayer player = context.getServerHandler().playerEntity;
            Entity entity = player.worldObj.getEntityByID(message.entityID);
            if ((entity instanceof EntityRollingStock) == false || entity.isDead)
            {
                return null;
            }
            EntityRollingStock stock = (EntityRollingStock) entity;
            if (stock.isProtectedControlAuthorized(player) == false)
            {
                return null;
            }
            if (stock.isActiveDriver(player) == false)
            {
                if ((player.ridingEntity instanceof AbstractControlCar) == false)
                {
                    return null;
                }
                AbstractControlCar controlCar = (AbstractControlCar) player.ridingEntity;
                if (controlCar.isDead || controlCar.riddenByEntity != player
                        || controlCar.isProtectedControlAuthorized(player) == false
                        || controlCar.connectedLocomotive != stock
                        || controlCar.cartLinked1 == null || controlCar.cartLinked1.trainHandler == null
                        || controlCar.cartLinked1.trainHandler.getTrains().contains(stock) == false)
                {
                    return null;
                }
            }
            stock.setParkingBrakeFromPacket(message.ParkingBrake);
            stock.isBraking = message.ParkingBrake;

            return null;
        }
    }
}
