package train.common.core.network;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightControls;

/** Shared server-side validation for all rolling-stock lighting packets. */
final class RollingStockLightPacketAccess
{
    private static final double MAX_DISTANCE_SQUARED = 12.0D * 12.0D;

    private RollingStockLightPacketAccess() {}

    /**
     * Resolves a nearby target in the player's world and enforces stock lock ownership/trust.
     * Returns null for stale, cross-world, distant, incompatible, or unauthorized targets.
     */
    static IRollingStockLightControls resolve(EntityPlayerMP player, int entityId)
    {
        if (player == null || player.worldObj == null)
        {
            return null;
        }
        Entity entity = player.worldObj.getEntityByID(entityId);
        if ((entity instanceof EntityRollingStock) == false
                || (entity instanceof IRollingStockLightControls) == false
                || player.getDistanceSqToEntity(entity) > MAX_DISTANCE_SQUARED)
        {
            return null;
        }
        if (entity instanceof AbstractTrains)
        {
            AbstractTrains train = (AbstractTrains) entity;
            if (train.getTrainLockedFromPacket())
            {
                String name = player.getGameProfile().getName();
                String owner = train.getTransportOwner();
                boolean allowed =
                    owner == null
                    || owner.isEmpty()
                    || owner.equalsIgnoreCase(name)
                    || train.isPlayerTrusted(name)
                    || player.canCommandSenderUseCommand(2, "");
                if (allowed == false)
                {
                    return null;
                }
            }
        }
        return (IRollingStockLightControls) entity;
    }
}
