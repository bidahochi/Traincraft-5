package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.Traincraft;
import train.common.core.handlers.SleeperCarSleep;

/** Wire messages for requesting a bunk session and synchronizing its state to the rider. */
public final class PacketSleeperCar
{
    private static final int PAYLOAD_BYTES = Integer.BYTES * 2 + 1;

    private PacketSleeperCar()
    {
    }

    /** Result codes for a sleep request or the end of an active bunk session. */
    public enum Status
    {
        SLEEPING(0),
        AWAKE(1),
        DAYTIME(2),
        UNAVAILABLE(3);

        private final int wireId;

        private Status(int wireId)
        {
            this.wireId = wireId;
        }

        /** Resolves a stable wire ID, returning null when the peer sent an unknown code. */
        private static Status fromWireId(int wireId)
        {
            for (Status status : values())
            {
                if (status.wireId == wireId)
                {
                    return status;
                }
            }
            return null;
        }
    }

    /** Starts or cancels a bunk session for the rider who sent the packet. */
    public static final class Request implements IMessage
    {
        private int carId;
        private int requestId;
        private boolean sleep;
        private boolean valid;

        /** Creates an empty message for Forge to decode. */
        public Request()
        {
        }

        /**
         * Identifies the sleeper car entity and the menu request that owns the session.
         * A false sleep flag cancels that specific request.
         */
        public Request(int carId, int requestId, boolean sleep)
        {
            this.carId = carId;
            this.requestId = requestId;
            this.sleep = sleep;
            this.valid = true;
        }

        /** Reads a fixed-size request and rejects unknown action bytes. */
        @Override
        public void fromBytes(ByteBuf buffer)
        {
            valid = false;
            if (buffer.readableBytes() != PAYLOAD_BYTES)
            {
                return;
            }
            carId = buffer.readInt();
            requestId = buffer.readInt();
            int action = buffer.readUnsignedByte();
            if (action == 0 || action == 1)
            {
                sleep = action == 1;
                valid = true;
            }
        }

        /** Writes the car ID, the menu request ID, and the sleep flag in wire order. */
        @Override
        public void toBytes(ByteBuf buffer)
        {
            buffer.writeInt(carId);
            buffer.writeInt(requestId);
            buffer.writeBoolean(sleep);
        }
    }

    /** Reports the server's decision or closes the rider's matching sleep screen. */
    public static final class State implements IMessage
    {
        private int carId;
        private int requestId;
        private Status status;

        /** Creates an empty message for Forge to decode. */
        public State()
        {
        }

        /** Identifies the client request and car to which this server result applies. */
        public State(int carId, int requestId, Status status)
        {
            this.carId = carId;
            this.requestId = requestId;
            this.status = status;
        }

        /** Reads a fixed-size state message and leaves invalid input without a result. */
        @Override
        public void fromBytes(ByteBuf buffer)
        {
            status = null;
            if (buffer.readableBytes() != PAYLOAD_BYTES)
            {
                return;
            }
            carId = buffer.readInt();
            requestId = buffer.readInt();
            int wireId = buffer.readUnsignedByte();
            status = Status.fromWireId(wireId);
        }

        /** Writes the result using its stable status ID. */
        @Override
        public void toBytes(ByteBuf buffer)
        {
            buffer.writeInt(carId);
            buffer.writeInt(requestId);
            buffer.writeByte(status.wireId);
        }
    }

    /** Hands valid network requests to the server tick for authorization. */
    public static final class RequestHandler implements IMessageHandler<Request, IMessage>
    {
        /** Queues a valid packet using the authenticated connection's player. */
        @Override
        public IMessage onMessage(Request message, MessageContext context)
        {
            if (message.valid)
            {
                SleeperCarSleep.INSTANCE.enqueue(context.getServerHandler().playerEntity,
                        message.carId, message.requestId, message.sleep);
            }
            return null;
        }
    }

    /** Routes server results through the client proxy without linking client classes here. */
    public static final class StateHandler implements IMessageHandler<State, IMessage>
    {
        /** Forwards a valid result to the sided proxy. */
        @Override
        public IMessage onMessage(State message, MessageContext context)
        {
            if (message.status != null)
            {
                Traincraft.proxy.applySleeperCarState(message.carId, message.requestId, message.status);
            }
            return null;
        }
    }
}
