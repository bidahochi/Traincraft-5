package train.common.core.network.lockout;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.Traincraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PacketLockoutBookData implements IMessage
{
    public ArrayList<String> groups = new ArrayList<>();
    public ArrayList<String> ownedGroups = new ArrayList<>();
    public ArrayList<UserRecord> knownUsers = new ArrayList<>();
    public HashMap<String, ArrayList<UserRecord>> membersByGroup = new HashMap<>();
    public String status = "";

    public PacketLockoutBookData()
    {
    }

    public PacketLockoutBookData(List<String> groups, List<String> ownedGroups, List<UserRecord> knownUsers, HashMap<String, ArrayList<UserRecord>> membersByGroup, String status)
    {
        this.groups.addAll(groups);
        this.ownedGroups.addAll(ownedGroups);
        this.knownUsers.addAll(knownUsers);
        this.membersByGroup.putAll(membersByGroup);
        this.status = status == null ? "" : status;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        status = ByteBufUtils.readUTF8String(buf);
        int groupCount = buf.readInt();
        for (int i = 0; i < groupCount; i++)
        {
            groups.add(ByteBufUtils.readUTF8String(buf));
        }

        int ownedGroupCount = buf.readInt();
        for (int i = 0; i < ownedGroupCount; i++)
        {
            ownedGroups.add(ByteBufUtils.readUTF8String(buf));
        }

        int userCount = buf.readInt();
        for (int i = 0; i < userCount; i++)
        {
            knownUsers.add(UserRecord.read(buf));
        }

        int memberGroupCount = buf.readInt();
        for (int i = 0; i < memberGroupCount; i++)
        {
            String group = ByteBufUtils.readUTF8String(buf);
            int memberCount = buf.readInt();
            ArrayList<UserRecord> members = new ArrayList<>();
            for (int j = 0; j < memberCount; j++)
            {
                members.add(UserRecord.read(buf));
            }
            membersByGroup.put(group, members);
        }
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        ByteBufUtils.writeUTF8String(buf, status);
        buf.writeInt(groups.size());
        for (String group : groups)
        {
            ByteBufUtils.writeUTF8String(buf, group);
        }

        buf.writeInt(ownedGroups.size());
        for (String group : ownedGroups)
        {
            ByteBufUtils.writeUTF8String(buf, group);
        }

        buf.writeInt(knownUsers.size());
        for (UserRecord user : knownUsers)
        {
            user.write(buf);
        }

        buf.writeInt(membersByGroup.size());
        for (String group : membersByGroup.keySet())
        {
            ByteBufUtils.writeUTF8String(buf, group);
            ArrayList<UserRecord> members = membersByGroup.get(group);
            buf.writeInt(members.size());
            for (UserRecord member : members)
            {
                member.write(buf);
            }
        }
    }

    public static class UserRecord
    {
        public String uuid;
        public String username;

        public UserRecord()
        {
        }

        public UserRecord(String uuid, String username)
        {
            this.uuid = uuid == null ? "" : uuid;
            this.username = username == null ? "" : username;
        }

        public String getDisplayName()
        {
            return username.trim().length() == 0 ? uuid : username;
        }

        public String getListName()
        {
            return username.trim().length() == 0 ? "(Unknown user)" : username;
        }

        public void write(ByteBuf buf)
        {
            ByteBufUtils.writeUTF8String(buf, uuid);
            ByteBufUtils.writeUTF8String(buf, username);
        }

        public static UserRecord read(ByteBuf buf)
        {
            return new UserRecord(ByteBufUtils.readUTF8String(buf), ByteBufUtils.readUTF8String(buf));
        }
    }

    public static class Handler implements IMessageHandler<PacketLockoutBookData, IMessage>
    {
        @Override
        public IMessage onMessage(PacketLockoutBookData message, MessageContext context)
        {
            Traincraft.proxy.updateLockoutBook(message);
            return null;
        }
    }
}
