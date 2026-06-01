package train.common.api.masterphysics;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import train.common.api.EntityRollingStock;

public class TrainConsistWorldEvents {
    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (event.world == null || event.world.isRemote) {
            return;
        }

        if (event.entity instanceof EntityRollingStock) {
            EntityRollingStock stock = (EntityRollingStock) event.entity;
            TrainConsistResolver.forDimension(event.world.provider.dimensionId).onStockLoaded(stock);
        }
    }
}
