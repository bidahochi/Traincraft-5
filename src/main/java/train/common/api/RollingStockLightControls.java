package train.common.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import net.minecraft.nbt.NBTTagCompound;
import train.common.utils.SharedJsonParser;

/** Shared manual lighting state and server synchronization for mutable control owners. */
public final class RollingStockLightControls implements IRollingStockLightControls
{
    /** Narrow entity boundary; client reads never initiate authoritative mutations. */
    public interface IHost
    {
        /** Whether state is being read on a client. */
        public boolean isClient();
        /** Whether authoritative state may be changed. */
        public boolean isServer();
        /** Current client watcher value. */
        public int readWatcher();
        /** Creates the watcher at the owner's existing initialization point. */
        public void initializeWatcher(int packed);
        /** Publishes effective and manual state on the server. */
        public void publish(int packed);
        /** Whether the generic server horn window is active. */
        public boolean hornActive();
    }

    private static final Pattern SOURCE_ID = Pattern.compile("[a-z0-9_.-]+:[a-z0-9_./-]+");
    private final IHost host;
    private RollingStockHeadlightLevel front = RollingStockHeadlightLevel.OFF;
    private RollingStockHeadlightLevel rear = RollingStockHeadlightLevel.OFF;
    private int manualChannels;
    private Set<String> emergencyReasons;

    /** Binds controls to one entity without initializing its watcher prematurely. */
    public RollingStockLightControls(final EntityRollingStock owner)
    {
        this(new IHost()
        {
            @Override
            public boolean isClient()
            {
                return owner.worldObj != null && owner.worldObj.isRemote;
            }

            @Override
            public boolean isServer()
            {
                return owner.worldObj != null && owner.worldObj.isRemote == false;
            }

            @Override
            public int readWatcher()
            {
                return owner.getDataWatcher().getWatchableObjectInt(RollingStockLightStateCodec.WATCHER_SLOT);
            }

            @Override
            public void initializeWatcher(int packed)
            {
                owner.getDataWatcher().addObject(RollingStockLightStateCodec.WATCHER_SLOT, packed);
            }

            @Override
            public void publish(int packed)
            {
                owner.getDataWatcher().updateObject(RollingStockLightStateCodec.WATCHER_SLOT, packed);
            }

            @Override
            public boolean hornActive()
            {
                return owner.responseTicksRemaining(EntityRollingStock.HORN_RESPONSE_ID) > 0;
            }
        });
    }

    /** Binds a host adapter; the host owns side checks and watcher access. */
    public RollingStockLightControls(IHost host)
    {
        if (host == null)
        {
            throw new IllegalArgumentException("Lighting controls require a host");
        }
        this.host = host;
    }

    /** Called once where the owning entity previously registered watcher slot 28. */
    public void initialize()
    {
        host.initializeWatcher(RollingStockLightStateCodec.pack(front, rear, false, false, false, false));
    }

    /** Returns effective server state or the synchronized client snapshot. */
    public int packedState()
    {
        if (host.isClient())
        {
            return host.readWatcher();
        }
        return RollingStockLightStateCodec.pack(front, rear,
            manual(RollingStockLightChannel.DITCH), manual(RollingStockLightChannel.BEACON),
            manual(RollingStockLightChannel.AUX), manual(RollingStockLightChannel.GYRA), host.hornActive(),
            manual(RollingStockLightChannel.EMERGENCY), emergencyReasons != null && emergencyReasons.isEmpty() == false);
    }

    /** Reads local operator intent without including transient forcing. */
    private boolean manual(RollingStockLightChannel channel)
    {
        return (manualChannels & channel.mask()) != 0;
    }

    /** Publishes only on the server, including after a generic horn-response transition. */
    public void synchronize()
    {
        if (host.isServer())
        {
            host.publish(packedState());
        }
    }

    @Override
    public RollingStockHeadlightLevel getFrontHeadlightLevel()
    {
        return RollingStockLightStateCodec.front(packedState());
    }

    @Override
    public RollingStockHeadlightLevel getRearHeadlightLevel()
    {
        return RollingStockLightStateCodec.rear(packedState());
    }

    @Override
    public void setFrontHeadlightLevel(RollingStockHeadlightLevel level)
    {
        if (host.isServer())
        {
            front = level == null ? RollingStockHeadlightLevel.OFF : level;
            synchronize();
        }
    }

    @Override
    public void setRearHeadlightLevel(RollingStockHeadlightLevel level)
    {
        if (host.isServer())
        {
            rear = level == null ? RollingStockHeadlightLevel.OFF : level;
            synchronize();
        }
    }

    @Override
    public boolean isLightChannelEnabled(RollingStockLightChannel channel)
    {
        return RollingStockLightStateCodec.enabled(packedState(), channel);
    }

    @Override
    public boolean isLightChannelManuallyEnabled(RollingStockLightChannel channel)
    {
        return RollingStockLightStateCodec.manualEnabled(packedState(), channel);
    }

    @Override
    public boolean isEmergencyLightForced()
    {
        return RollingStockLightStateCodec.emergencyForced(packedState());
    }

    @Override
    public boolean isTransientLightSignalEnabled(RollingStockTransientLightSignal signal)
    {
        return RollingStockLightStateCodec.transientEnabled(packedState(), signal);
    }

    @Override
    public void setLightChannelEnabled(RollingStockLightChannel channel, boolean enabled)
    {
        if (host.isServer() == false || channel == null)
        {
            return;
        }
        if (channel == RollingStockLightChannel.HEADLIGHT)
        {
            if (enabled == false)
            {
                front = RollingStockHeadlightLevel.OFF;
                rear = RollingStockHeadlightLevel.OFF;
            }
            else if (front == RollingStockHeadlightLevel.OFF && rear == RollingStockHeadlightLevel.OFF)
            {
                front = RollingStockHeadlightLevel.BRIGHT;
            }
        }
        else if (enabled)
        {
            manualChannels |= channel.mask();
        }
        else
        {
            manualChannels &= ~channel.mask();
        }
        synchronize();
    }

    /**
     * Adds/removes one trusted server reason without changing the operator switch. Returns false
     * for client calls, invalid identifiers, and unchanged membership. No packet exposes this API.
     */
    public boolean setEmergencyForced(String sourceId, boolean active)
    {
        if (host.isServer() == false || sourceId == null
            || SOURCE_ID.matcher(sourceId).matches() == false)
        {
            return false;
        }
        boolean changed;
        if (active)
        {
            if (emergencyReasons == null)
            {
                emergencyReasons = new HashSet<String>();
            }
            changed = emergencyReasons.add(sourceId);
        }
        else
        {
            changed = emergencyReasons != null && emergencyReasons.remove(sourceId);
            if (emergencyReasons != null && emergencyReasons.isEmpty())
            {
                emergencyReasons = null;
            }
        }
        if (changed)
        {
            synchronize();
        }
        return changed;
    }

    /** Saves manual intent only; forced reasons and transient horn state never enter NBT. */
    public void write(NBTTagCompound tag)
    {
        int packed = packedState();
        tag.setInteger("tcFrontHeadlightLevel", RollingStockLightStateCodec.front(packed).ordinal());
        tag.setInteger("tcRearHeadlightLevel", RollingStockLightStateCodec.rear(packed).ordinal());
        tag.setInteger("tcLightChannels", RollingStockLightStateCodec.persistentChannels(packed));
    }

    /** Restores modern fields before legacy JSON fallbacks, clearing all transient forcing. */
    public void read(NBTTagCompound tag)
    {
        JsonObject previous = new JsonObject();
        if (tag.hasKey("lightingDetailsJSON"))
        {
            try
            {
                JsonElement parsed = SharedJsonParser.INSTANCE.parse(tag.getString("lightingDetailsJSON"));
                if (parsed != null && parsed.isJsonObject())
                {
                    previous = parsed.getAsJsonObject();
                }
            }
            catch (JsonParseException invalid)
            {
                // Old malformed lighting data must not prevent the entity/inventory from loading.
            }
        }
        front = readLevel(tag, previous, "tcFrontHeadlightLevel", "frontHeadlightLevel", RollingStockHeadlightLevel.OFF);
        rear = readLevel(tag, previous, "tcRearHeadlightLevel", "rearHeadlightLevel", RollingStockHeadlightLevel.OFF);
        manualChannels = 0;
        if (tag.hasKey("tcLightChannels"))
        {
            manualChannels = tag.getInteger("tcLightChannels");
        }
        else
        {
            if (oldInt(previous, "ditchLightMode", 0) > 0)
            {
                manualChannels |= RollingStockLightChannel.DITCH.mask();
            }
            if (oldBoolean(previous, "auxLightsEnabled"))
            {
                manualChannels |= RollingStockLightChannel.AUX.mask();
            }
            if (oldBoolean(previous, "gyraLightsEnabled"))
            {
                manualChannels |= RollingStockLightChannel.GYRA.mask();
            }
        }
        emergencyReasons = null;
        synchronize();
    }

    /** Modern NBT wins over the historical JSON payload when both are present. */
    private static RollingStockHeadlightLevel readLevel(NBTTagCompound tag, JsonObject previous,
        String key, String oldKey, RollingStockHeadlightLevel fallback)
    {
        if (tag.hasKey(key))
        {
            return RollingStockHeadlightLevel.fromOrdinal(tag.getInteger(key));
        }
        return RollingStockHeadlightLevel.fromOrdinal(oldInt(previous, oldKey, fallback.ordinal()));
    }

    /** Treats absent or malformed historical switches as off. */
    private static boolean oldBoolean(JsonObject object, String key)
    {
        JsonElement value = object.get(key);
        return value != null && value.isJsonPrimitive()
            && value.getAsJsonPrimitive().isBoolean() && value.getAsBoolean();
    }

    /** Rejects fractional and overflowing old values without preventing stock restoration. */
    private static int oldInt(JsonObject object, String key, int fallback)
    {
        JsonElement value = object.get(key);
        if (value == null || value.isJsonPrimitive() == false || value.getAsJsonPrimitive().isNumber() == false)
        {
            return fallback;
        }
        try
        {
            return value.getAsBigDecimal().intValueExact();
        }
        catch (ArithmeticException | NumberFormatException invalid)
        {
            return fallback;
        }
    }
}
