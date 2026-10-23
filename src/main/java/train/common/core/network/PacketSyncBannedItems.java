package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.Item;

import train.common.Traincraft;
import train.common.slots.util.ItemKey;
import train.common.slots.util.NbtContentsRule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sends authoritative inventory bans and NBT readers so client slot checks match
 * the server. The wire format contains two counted item/metadata sets, followed
 * by counted readers with an item ID, metadata, and UTF-8 path. Both sides must
 * use this layout; reader-free policies still encode an explicit zero count.
 */
public class PacketSyncBannedItems implements IMessage
{
    private static final int BYTES_PER_ENTRY = Integer.BYTES * 2;
    private static final int MIN_BYTES_PER_RULE = BYTES_PER_ENTRY + 1;
    private static final int MAX_PACKET_ENTRIES = 65536;

    private Set<ItemKey> banned = Collections.emptySet();
    private Set<ItemKey> nonemptyBanned = Collections.emptySet();
    private List<NbtContentsRule> rules = Collections.emptyList();

    /** Creates an empty message for Forge decoding. */
    public PacketSyncBannedItems()
    {
    }

    /** Creates a snapshot containing unconditional bans only. */
    public PacketSyncBannedItems(Set<ItemKey> banned)
    {
        this(banned, Collections.<ItemKey>emptySet(), Collections.<NbtContentsRule>emptyList());
    }

    /** Copies server-selected rules along with membership so clients never supply their own readers. */
    public PacketSyncBannedItems(Set<ItemKey> banned, Set<ItemKey> nonemptyBanned, List<NbtContentsRule> rules)
    {
        this.banned = new HashSet<ItemKey>(banned);
        this.nonemptyBanned = new HashSet<ItemKey>(nonemptyBanned);
        this.rules = new ArrayList<NbtContentsRule>(rules);
    }

    /** Writes the captured memberships and readers without consuming their collections. */
    @Override
    public void toBytes(ByteBuf buffer)
    {
        writeEntries(buffer, banned);
        writeEntries(buffer, nonemptyBanned);
        buffer.writeInt(rules.size());
        for (NbtContentsRule rule : rules)
        {
            ItemKey selector = rule.getSelector();
            buffer.writeInt(Item.getIdFromItem(selector.item));
            buffer.writeInt(selector.meta);
            ByteBufUtils.writeUTF8String(buffer, rule.getPath());
        }
    }

    /**
     * Decodes bounded collection counts and skips items unavailable in the local
     * registry. Invalid paths remain in the policy to preserve their full bans.
     * Malformed counts abort decoding; a failed message is never dispatched.
     */
    @Override
    public void fromBytes(ByteBuf buffer)
    {
        banned = readEntries(buffer);
        nonemptyBanned = readEntries(buffer);
        int size = buffer.readInt();
        if (size < 0 || size > MAX_PACKET_ENTRIES || size > buffer.readableBytes() / MIN_BYTES_PER_RULE)
        {
            throw new IllegalArgumentException("Invalid container reader count: " + size);
        }
        List<NbtContentsRule> decoded = new ArrayList<NbtContentsRule>();
        for (int index = 0; index < size; index++)
        {
            Item item = Item.getItemById(buffer.readInt());
            int metadata = buffer.readInt();
            String path = ByteBufUtils.readUTF8String(buffer);
            if (item != null)
            {
                decoded.add(new NbtContentsRule(new ItemKey(item, metadata), path));
            }
        }
        rules = decoded;
    }

    /** Encodes registry IDs and metadata using the same layout for both policies. */
    private static void writeEntries(ByteBuf buffer, Set<ItemKey> entries)
    {
        buffer.writeInt(entries.size());
        for (ItemKey entry : entries)
        {
            buffer.writeInt(Item.getIdFromItem(entry.item));
            buffer.writeInt(entry.meta);
        }
    }

    /** Skips unavailable registry items instead of producing keys with null identities. */
    private static Set<ItemKey> readEntries(ByteBuf buffer)
    {
        int size = buffer.readInt();
        if (size < 0 || size > MAX_PACKET_ENTRIES || size > buffer.readableBytes() / BYTES_PER_ENTRY)
        {
            throw new IllegalArgumentException("Invalid inventory blacklist entry count: " + size);
        }
        Set<ItemKey> entries = new HashSet<ItemKey>();
        for (int index = 0; index < size; index++)
        {
            Item item = Item.getItemById(buffer.readInt());
            int metadata = buffer.readInt();
            if (item != null)
            {
                entries.add(new ItemKey(item, metadata));
            }
        }
        return entries;
    }

    /** Dispatches the decoded common data through the sided proxy. */
    public static class Handler implements IMessageHandler<PacketSyncBannedItems, IMessage>
    {

        /** Schedules client policy replacement through the sided proxy; no reply is needed. */
        @Override
        public IMessage onMessage(PacketSyncBannedItems message, MessageContext context)
        {
            Traincraft.proxy.applyInventoryBlacklists(message.banned, message.nonemptyBanned, message.rules);
            return null;
        }
    }
}
