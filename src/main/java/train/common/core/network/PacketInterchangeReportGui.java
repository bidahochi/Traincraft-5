package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.Traincraft;
import train.common.utils.interchangetransferreport.InterchangeTransferReportGenerator.InterchangeReportDraft;
import train.common.utils.interchangetransferreport.InterchangeTransferReportGenerator.InterchangeReportRow;

public class PacketInterchangeReportGui implements IMessage
{
    /*
     * Server-to-client packet for the editable report draft.
     *
     * The server has already inspected the train and produced a plain data snapshot. The client only
     * receives fields it can display/edit/export; it does not need live EntityRollingStock references.
     */
    private InterchangeReportDraft draft;

    public PacketInterchangeReportGui()
    {

    }

    public PacketInterchangeReportGui(InterchangeReportDraft draft)
    {
        this.draft = draft;
    }

    @Override
    public void fromBytes(ByteBuf bbuf)
    {
        // Keep this read order exactly paired with toBytes; old saves are not involved, but packets are.
        draft = new InterchangeReportDraft();
        draft.railroad = ByteBufUtils.readUTF8String(bbuf);
        draft.date = ByteBufUtils.readUTF8String(bbuf);
        draft.timezoneCode = ByteBufUtils.readUTF8String(bbuf);
        draft.location = ByteBufUtils.readUTF8String(bbuf);
        draft.boardSlot = bbuf.readInt();

        int rowCount = bbuf.readInt();
        for (int i = 0; i < rowCount; i++)
        {
            InterchangeReportRow row = new InterchangeReportRow();
            row.car = ByteBufUtils.readUTF8String(bbuf);
            row.carItemName = ByteBufUtils.readUTF8String(bbuf);
            row.loaded = bbuf.readBoolean();
            row.typeCode = ByteBufUtils.readUTF8String(bbuf);
            row.typeName = ByteBufUtils.readUTF8String(bbuf);
            row.destination = ByteBufUtils.readUTF8String(bbuf);
            row.customer = ByteBufUtils.readUTF8String(bbuf);
            row.cargo = ByteBufUtils.readUTF8String(bbuf);
            row.hazmat = bbuf.readBoolean();
            row.hazmatCode = ByteBufUtils.readUTF8String(bbuf);
            row.handbrake = bbuf.readBoolean();
            row.locomotive = bbuf.readBoolean();
            draft.rows.add(row);
        }
    }

    @Override
    public void toBytes(ByteBuf bbuf)
    {
        // Send the whole draft so scrolling/reordering in the GUI is purely client-side editing.
        ByteBufUtils.writeUTF8String(bbuf, draft.railroad);
        ByteBufUtils.writeUTF8String(bbuf, draft.date);
        ByteBufUtils.writeUTF8String(bbuf, draft.timezoneCode);
        ByteBufUtils.writeUTF8String(bbuf, draft.location);
        bbuf.writeInt(draft.boardSlot);
        bbuf.writeInt(draft.rows.size());

        for (InterchangeReportRow row : draft.rows)
        {
            ByteBufUtils.writeUTF8String(bbuf, row.car);
            ByteBufUtils.writeUTF8String(bbuf, row.carItemName);
            bbuf.writeBoolean(row.loaded);
            ByteBufUtils.writeUTF8String(bbuf, row.typeCode);
            ByteBufUtils.writeUTF8String(bbuf, row.typeName);
            ByteBufUtils.writeUTF8String(bbuf, row.destination);
            ByteBufUtils.writeUTF8String(bbuf, row.customer);
            ByteBufUtils.writeUTF8String(bbuf, row.cargo);
            bbuf.writeBoolean(row.hazmat);
            ByteBufUtils.writeUTF8String(bbuf, row.hazmatCode);
            bbuf.writeBoolean(row.handbrake);
            bbuf.writeBoolean(row.locomotive);
        }
    }

    public static class Handler implements IMessageHandler<PacketInterchangeReportGui, IMessage>
    {
        @Override
        public IMessage onMessage(PacketInterchangeReportGui message, MessageContext context)
        {
            Traincraft.proxy.openInterchangeReport(message.draft);
            return null;
        }
    }
}
