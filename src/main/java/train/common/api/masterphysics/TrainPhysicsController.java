package train.common.api.masterphysics;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.Vec3;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.api.experimental.EntityMasterPhysicsTwoBogieFreight;
import train.common.core.handlers.TrainHandler;

import java.util.ArrayList;
import java.util.HashSet;

public class TrainPhysicsController {

    private final TrainHandler handler;

    private final ArrayList<TrainCouplerConstraint> couplers = new ArrayList<TrainCouplerConstraint>();
    private final HashSet<Long> couplerKeys = new HashSet<Long>();

    public TrainPhysicsController(TrainHandler handler) {
        this.handler = handler;
    }

    public void tick(EntityRollingStock master) {
        if (handler == null || handler.getTrains() == null || handler.getTrains().isEmpty()) {
            return;
        }

        preTickStocks();

        if (handler.isIncompleteDueToUnloadedLinks()) {
            hardStopAllStocks();
            postTickStocks();
            return;
        }

        if (handler.hasParkingBrakeApplied()) {
            hardStopAllStocks();
            postTickStocks();
            return;
        }

        applyExternalPushes();

        if (!handler.isTractionBlocked()) {
            applyPoweredMovement(handler.getTractionMaster());
        }
        else {
            handler.warnTractionBlocked(master);
        }

        masterTickRailNodes();
        solveInternalStockConstraints();

        buildCouplerConstraints();

        for (int i = 0; i < couplers.size(); i++) {
            couplers.get(i).solve();
        }

        postTickStocks();
    }

    private void preTickStocks() {
        for (int i = 0; i < handler.getTrains().size(); i++) {
            EntityRollingStock stock = handler.getTrains().get(i);

            if (stock instanceof IMasterPhysicsStock) {
                ((IMasterPhysicsStock) stock).masterPhysicsPreTick();
            }
        }
    }

    private void postTickStocks() {
        for (int i = 0; i < handler.getTrains().size(); i++) {
            EntityRollingStock stock = handler.getTrains().get(i);

            if (stock instanceof IMasterPhysicsStock) {
                ((IMasterPhysicsStock) stock).masterPhysicsPostTick();
            }
        }
    }

    private void hardStopAllStocks() {
        for (int i = 0; i < handler.getTrains().size(); i++) {
            EntityRollingStock stock = handler.getTrains().get(i);

            if (stock instanceof IMasterPhysicsStock) {
                ((IMasterPhysicsStock) stock).masterPhysicsHardStop();
            }
            else if (stock != null) {
                stock.motionX = 0.0D;
                stock.motionY = 0.0D;
                stock.motionZ = 0.0D;
            }
        }
    }

    private void applyExternalPushes() {
        ArrayList<TrainExternalPush> pushes = handler.consumeExternalPushes();

        for (int i = 0; i < pushes.size(); i++) {
            TrainExternalPush push = pushes.get(i);

            if (push == null || push.target == null || push.target.isDead) {
                continue;
            }

            if (push.target instanceof IMasterPhysicsStock) {
                IMasterPhysicsStock stock = (IMasterPhysicsStock) push.target;

                if (stock.canAcceptMasterPhysicsPush()) {
                    stock.applyMasterPhysicsPush(push.source, push.pushX, push.pushZ);
                }
            }
        }
    }

    private void masterTickRailNodes() {
        for (int i = 0; i < handler.getTrains().size(); i++) {
            EntityRollingStock stock = handler.getTrains().get(i);

            if (stock instanceof EntityMasterPhysicsTwoBogieFreight) {
                ((EntityMasterPhysicsTwoBogieFreight) stock).masterRailTickBogies();
            }
        }
    }

    private void solveInternalStockConstraints() {
        for (int i = 0; i < handler.getTrains().size(); i++) {
            EntityRollingStock stock = handler.getTrains().get(i);

            if (stock instanceof EntityMasterPhysicsTwoBogieFreight) {
                ((EntityMasterPhysicsTwoBogieFreight) stock).solveInternalBogieConstraints();
            }
        }
    }

    private void applyPoweredMovement(Locomotive masterLoco) {
        if (masterLoco == null) {
            return;
        }

        if (masterLoco.canBePulled) {
            return;
        }

        if (!masterLoco.isLocoTurnedOn()) {
            return;
        }

        double accel = masterLoco.getAccel();

        if (accel <= 0.0D) {
            return;
        }

        double yawRad = Math.toRadians(masterLoco.serverRealRotation + 90.0F);

        double addX = Math.cos(yawRad) * accel;
        double addZ = Math.sin(yawRad) * accel;

        applyTractionToStock(masterLoco, addX, addZ);
    }

    private void applyTractionToStock(EntityRollingStock stock, double addX, double addZ) {
        if (stock instanceof ITwoBogieMasterPhysicsStock
                && ((ITwoBogieMasterPhysicsStock) stock).isTwoBogieReady()) {
            ITwoBogieMasterPhysicsStock two = (ITwoBogieMasterPhysicsStock) stock;

            Entity rear = two.getLinkForceEntity(ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR);
            Entity front = two.getLinkForceEntity(ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT);

            if (rear != null) {
                rear.motionX += addX;
                rear.motionZ += addZ;
            }

            if (front != null) {
                front.motionX += addX;
                front.motionZ += addZ;
            }

            return;
        }

        stock.motionX += addX;
        stock.motionZ += addZ;
    }

    private void buildCouplerConstraints() {
        couplers.clear();
        couplerKeys.clear();

        for (int i = 0; i < handler.getTrains().size(); i++) {
            EntityRollingStock stock = handler.getTrains().get(i);

            if (stock == null || stock.isDead) {
                continue;
            }

            addCouplerOnce(stock, stock.cartLinked1);
            addCouplerOnce(stock, stock.cartLinked2);
        }
    }

    private void addCouplerOnce(EntityRollingStock a, EntityRollingStock b) {
        if (a == null || b == null || a == b || a.isDead || b.isDead) {
            return;
        }

        long key = makePairKey(a.getUniqueTrainID(), b.getUniqueTrainID());

        if (couplerKeys.contains(key)) {
            return;
        }

        couplerKeys.add(key);

        AnchorPair pair = findBestAnchorPair(a, b);

        if (pair == null) {
            return;
        }

        float target = getMasterPhysicsOptimalDistance(a, b);

        couplers.add(new TrainCouplerConstraint(a, b, pair.anchorA, pair.anchorB, target));
    }

    private long makePairKey(int id1, int id2) {
        int low = Math.min(id1, id2);
        int high = Math.max(id1, id2);

        return (((long) low) << 32) | (high & 0xffffffffL);
    }

    private float getMasterPhysicsOptimalDistance(EntityRollingStock a, EntityRollingStock b) {
        return a.getOptimalDistance((EntityMinecart) b) + b.getOptimalDistance((EntityMinecart) a);
    }

    private AnchorPair findBestAnchorPair(EntityRollingStock a, EntityRollingStock b) {
        int[] anchorsA = getAnchors(a);
        int[] anchorsB = getAnchors(b);

        AnchorPair best = null;
        double bestDistSq = Double.MAX_VALUE;

        for (int i = 0; i < anchorsA.length; i++) {
            for (int j = 0; j < anchorsB.length; j++) {
                Vec3 posA = getAnchorPosition(a, anchorsA[i]);
                Vec3 posB = getAnchorPosition(b, anchorsB[j]);

                double dx = posA.xCoord - posB.xCoord;
                double dz = posA.zCoord - posB.zCoord;
                double distSq = dx * dx + dz * dz;

                if (distSq < bestDistSq) {
                    bestDistSq = distSq;
                    best = new AnchorPair(anchorsA[i], anchorsB[j]);
                }
            }
        }

        return best;
    }

    private int[] getAnchors(EntityRollingStock stock) {
        if (stock instanceof ITwoBogieMasterPhysicsStock
                && ((ITwoBogieMasterPhysicsStock) stock).isTwoBogieReady()) {
            return new int[] {
                    ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR,
                    ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT
            };
        }

        return new int[] { ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY };
    }

    private Vec3 getAnchorPosition(EntityRollingStock stock, int anchor) {
        if (stock instanceof ITwoBogieMasterPhysicsStock
                && ((ITwoBogieMasterPhysicsStock) stock).isTwoBogieReady()) {
            return ((ITwoBogieMasterPhysicsStock) stock).getLinkAnchorPosition(anchor);
        }

        return Vec3.createVectorHelper(stock.posX, stock.posY, stock.posZ);
    }

    private static class AnchorPair {
        public final int anchorA;
        public final int anchorB;

        public AnchorPair(int anchorA, int anchorB) {
            this.anchorA = anchorA;
            this.anchorB = anchorB;
        }
    }
}
