package train.common.api.masterphysics;

import train.common.api.EntityRollingStock;

public final class MasterPhysicsHooks {
    private MasterPhysicsHooks() {}

    public static boolean isMasterPhysicsControlled(EntityRollingStock stock) {
        return stock != null
                && stock.trainHandler != null
                && stock.trainHandler.usesMasterPhysics()
                && stock instanceof IMasterPhysicsStock
                && ((IMasterPhysicsStock) stock).usesMasterPhysics();
    }

    public static boolean isPhysicsMaster(EntityRollingStock stock) {
        return stock != null
                && stock.trainHandler != null
                && stock.trainHandler.isPhysicsMaster(stock);
    }

    public static boolean shouldEvaluateOwnPhysics(EntityRollingStock stock) {
        return !isMasterPhysicsControlled(stock);
    }
}
