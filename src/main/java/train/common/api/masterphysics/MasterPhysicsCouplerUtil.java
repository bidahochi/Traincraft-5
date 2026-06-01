package train.common.api.masterphysics;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.Vec3;
import train.common.api.EntityRollingStock;

public final class MasterPhysicsCouplerUtil {

    private MasterPhysicsCouplerUtil() {}

    public static boolean hasMasterAnchors(EntityRollingStock stock) {
        return stock instanceof ITwoBogieMasterPhysicsStock
                && ((ITwoBogieMasterPhysicsStock) stock).isTwoBogieReady();
    }

    /**
     * Used by LinkHandler before a new link is written.
     *
     * This excludes anchors already occupied by existing links. That is the key
     * fix for adding a third car to a consist: a middle car cannot reuse the same
     * front/rear anchor for both links.
     */
    public static AnchorPair findBestAvailableAnchorPair(EntityRollingStock cart1, EntityRollingStock cart2) {
        if (cart1 == null || cart2 == null) {
            return null;
        }

        int[] anchors1 = getAvailableAnchorsForNewLink(cart1);
        int[] anchors2 = getAvailableAnchorsForNewLink(cart2);

        return findBestAnchorPairFromSets(cart1, cart2, anchors1, anchors2);
    }

    /**
     * Used by TrainPhysicsController after a link already exists.
     *
     * Prefer the anchor pair saved into Link1Anchor/Link2Anchor at coupling time.
     * This prevents a 3-car consist from resolving both couplers on the middle car
     * to the same nearest bogie every tick.
     */
    public static AnchorPair findStoredOrBestAnchorPair(EntityRollingStock cart1, EntityRollingStock cart2) {
        if (cart1 == null || cart2 == null) {
            return null;
        }

        int anchor1 = getStoredAnchorForLinkedTarget(cart1, cart2);
        int anchor2 = getStoredAnchorForLinkedTarget(cart2, cart1);

        if (isAnchorUsableForStock(cart1, anchor1) && isAnchorUsableForStock(cart2, anchor2)) {
            return buildPair(cart1, cart2, anchor1, anchor2);
        }

        /*
         * Fallback for old saves or links created before anchor slots existed.
         */
        return findBestAnchorPair(cart1, cart2);
    }

    /**
     * Unfiltered best pair. Useful as a fallback only.
     */
    public static AnchorPair findBestAnchorPair(EntityRollingStock cart1, EntityRollingStock cart2) {
        if (cart1 == null || cart2 == null) {
            return null;
        }

        return findBestAnchorPairFromSets(cart1, cart2, getAnchors(cart1), getAnchors(cart2));
    }

    private static AnchorPair findBestAnchorPairFromSets(EntityRollingStock cart1,
                                                         EntityRollingStock cart2,
                                                         int[] anchors1,
                                                         int[] anchors2) {
        if (anchors1 == null || anchors2 == null || anchors1.length == 0 || anchors2.length == 0) {
            return null;
        }

        AnchorPair best = null;
        double bestDistSq = Double.MAX_VALUE;

        for (int i = 0; i < anchors1.length; i++) {
            for (int j = 0; j < anchors2.length; j++) {
                AnchorPair pair = buildPair(cart1, cart2, anchors1[i], anchors2[j]);

                if (pair == null) {
                    continue;
                }

                double distSq = pair.vectorX * pair.vectorX + pair.vectorZ * pair.vectorZ;

                if (distSq < bestDistSq) {
                    bestDistSq = distSq;
                    best = pair;
                }
            }
        }

        return best;
    }

    public static AnchorPair buildPair(EntityRollingStock cart1, EntityRollingStock cart2, int anchor1, int anchor2) {
        if (!isAnchorUsableForStock(cart1, anchor1) || !isAnchorUsableForStock(cart2, anchor2)) {
            return null;
        }

        Vec3 pos1 = getAnchorPosition(cart1, anchor1);
        Vec3 pos2 = getAnchorPosition(cart2, anchor2);

        double dx = pos1.xCoord - pos2.xCoord;
        double dz = pos1.zCoord - pos2.zCoord;
        double distance = Math.sqrt(dx * dx + dz * dz);

        return new AnchorPair(
                anchor1,
                anchor2,
                pos1,
                pos2,
                dx,
                dz,
                distance,
                getAllowedLinkDistance(cart1, anchor1, cart2, anchor2)
        );
    }

    public static double[] getStoredOrBestAnchorVector(EntityRollingStock cart1, EntityRollingStock cart2) {
        AnchorPair pair = findStoredOrBestAnchorPair(cart1, cart2);

        if (pair == null) {
            return new double[] {
                    cart1.posX - cart2.posX,
                    cart1.posZ - cart2.posZ
            };
        }

        return new double[] {
                pair.vectorX,
                pair.vectorZ
        };
    }

    public static float getAllowedLinkDistance(EntityRollingStock cart1,
                                               int anchor1,
                                               EntityRollingStock cart2,
                                               int anchor2) {
        return getAnchorLinkDistance(cart1, anchor1, cart2)
                + getAnchorLinkDistance(cart2, anchor2, cart1);
    }

    public static float getAnchorLinkDistance(EntityRollingStock stock, int anchor, EntityRollingStock other) {
        if (stock instanceof ITwoBogieMasterPhysicsStock
                && ((ITwoBogieMasterPhysicsStock) stock).isTwoBogieReady()) {
            return ((ITwoBogieMasterPhysicsStock) stock).getAnchorLinkageDistance(anchor, other);
        }

        if (other instanceof EntityMinecart) {
            return stock.getLinkageDistance((EntityMinecart) other);
        }

        return stock.getLinkageDistance(stock);
    }

    public static int[] getAnchors(EntityRollingStock stock) {
        if (stock instanceof ITwoBogieMasterPhysicsStock
                && ((ITwoBogieMasterPhysicsStock) stock).isTwoBogieReady()) {
            return new int[] {
                    ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR,
                    ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT
            };
        }

        return new int[] {
                ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY
        };
    }

    public static int[] getAvailableAnchorsForNewLink(EntityRollingStock stock) {
        if (!hasMasterAnchors(stock)) {
            return getAnchors(stock);
        }

        boolean rearUsed = isAnchorOccupied(stock, ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR);
        boolean frontUsed = isAnchorOccupied(stock, ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT);

        if (!rearUsed && !frontUsed) {
            return new int[] {
                    ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR,
                    ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT
            };
        }

        if (!rearUsed) {
            return new int[] { ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR };
        }

        if (!frontUsed) {
            return new int[] { ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT };
        }

        return new int[0];
    }

    public static boolean isAnchorOccupied(EntityRollingStock stock, int anchor) {
        if (!hasMasterAnchors(stock)) {
            return false;
        }

        if (stock.cartLinked1 != null && stock.Link1Anchor == anchor) {
            return true;
        }

        if (stock.cartLinked2 != null && stock.Link2Anchor == anchor) {
            return true;
        }

        return false;
    }

    public static int getStoredAnchorForLinkedTarget(EntityRollingStock source, EntityRollingStock target) {
        if (source == null || target == null) {
            return ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;
        }

        if (source.cartLinked1 == target) {
            return source.Link1Anchor;
        }

        if (source.cartLinked2 == target) {
            return source.Link2Anchor;
        }

        return ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;
    }

    public static boolean isAnchorUsableForStock(EntityRollingStock stock, int anchor) {
        if (stock == null) {
            return false;
        }

        if (hasMasterAnchors(stock)) {
            return anchor == ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR
                    || anchor == ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT;
        }

        return anchor == ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;
    }

    public static Vec3 getAnchorPosition(EntityRollingStock stock, int anchor) {
        if (stock instanceof ITwoBogieMasterPhysicsStock
                && ((ITwoBogieMasterPhysicsStock) stock).isTwoBogieReady()) {
            return ((ITwoBogieMasterPhysicsStock) stock).getLinkAnchorPosition(anchor);
        }

        return Vec3.createVectorHelper(stock.posX, stock.posY, stock.posZ);
    }

    public static Entity getForceEntity(EntityRollingStock stock, int anchor) {
        if (stock instanceof ITwoBogieMasterPhysicsStock
                && ((ITwoBogieMasterPhysicsStock) stock).isTwoBogieReady()) {
            return ((ITwoBogieMasterPhysicsStock) stock).getLinkForceEntity(anchor);
        }

        return stock;
    }

    public static class AnchorPair {
        public final int anchorA;
        public final int anchorB;

        public final Vec3 posA;
        public final Vec3 posB;

        public final double vectorX;
        public final double vectorZ;

        public final double distance;

        /**
         * Coupling detection distance for this selected anchor pair.
         */
        public final float allowedLinkDistance;

        public AnchorPair(int anchorA,
                          int anchorB,
                          Vec3 posA,
                          Vec3 posB,
                          double vectorX,
                          double vectorZ,
                          double distance,
                          float allowedLinkDistance) {
            this.anchorA = anchorA;
            this.anchorB = anchorB;
            this.posA = posA;
            this.posB = posB;
            this.vectorX = vectorX;
            this.vectorZ = vectorZ;
            this.distance = distance;
            this.allowedLinkDistance = allowedLinkDistance;
        }
    }
}
