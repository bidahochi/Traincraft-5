package train.common.core.handlers;

import mods.railcraft.api.tracks.RailTools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.masterphysics.ITwoBogieMasterPhysicsStock;
import train.common.api.masterphysics.MasterPhysicsCouplerUtil;

import java.util.List;

public class LinkHandler {

    private World worldObj;
    private float distanceBehindCart;

    public LinkHandler(World world) {
        worldObj = world;
    }

    public void handleStake(EntityRollingStock entityOne, AxisAlignedBB customBoundingBox) {
        if (entityOne.isAttaching) {
            List lis = worldObj.getEntitiesWithinAABBExcludingEntity(entityOne, customBoundingBox.expand(15, 5, 15));

            if (entityOne.bogieLoco != null && entityOne.bogieLoco.boundingBox != null) {
                lis.addAll(worldObj.getEntitiesWithinAABBExcludingEntity(entityOne, entityOne.bogieLoco.boundingBox.expand(7, 5, 7)));
            }

            if (lis != null && lis.size() > 0) {
                for (Object ent : lis) {
                    if (ent instanceof EntityRollingStock && ((EntityRollingStock) ent).isAttaching) {
                        addStake((EntityRollingStock) ent, entityOne, true);
                    }
                }
            }
        }

        if (entityOne.cartLinked1 != null) {
            StakePhysic(entityOne.cartLinked1, entityOne, 1);
        }

        if (entityOne.cartLinked2 != null) {
            StakePhysic(entityOne.cartLinked2, entityOne, 2);
        }
    }

    private void doesLink1StillExist(Entity entityOne, List lis) {
        boolean link1Missing = false;
        boolean link2Missing = false;

        for (int j1 = 0; j1 < lis.size(); j1++) {
            Entity entity = (Entity) lis.get(j1);

            if (entity instanceof AbstractTrains && (((AbstractTrains) entity).getUniqueTrainID() == ((AbstractTrains) entityOne).Link1)) {
                link1Missing = false;
            }
            else {
                link1Missing = true;
            }

            if (entity instanceof AbstractTrains && (((AbstractTrains) entity).getUniqueTrainID() == ((AbstractTrains) entityOne).Link2)) {
                link2Missing = false;
            }
            else {
                link2Missing = true;
            }
        }

        ((AbstractTrains) entityOne).clearLinkTimer++;

        if (((AbstractTrains) entityOne).clearLinkTimer < 20) {
            return;
        }

        ((AbstractTrains) entityOne).clearLinkTimer = 0;

        if (link1Missing && ((AbstractTrains) entityOne).Link1 != 0 && ((AbstractTrains) entityOne).Link1 != -1) {
            System.out.println("clear 1   " + ((AbstractTrains) entityOne).Link1 + "  " + entityOne);
            freeLink1(entityOne);
        }

        if (link2Missing && ((AbstractTrains) entityOne).Link2 != 0 && ((AbstractTrains) entityOne).Link2 != -1) {
            System.out.println("clear 2   " + ((AbstractTrains) entityOne).Link2 + "  " + entityOne);
            freeLink2(entityOne);
        }
    }

    private void doesLink2StillExist(Entity entityOne, List lis) {
        for (int j1 = 0; j1 < lis.size(); j1++) {
            Entity entity = (Entity) lis.get(j1);

            if (entity instanceof AbstractTrains && (((AbstractTrains) entity).getUniqueTrainID() == ((AbstractTrains) entityOne).Link2)) {
                return;
            }
        }

        ((AbstractTrains) entityOne).clearLinkTimer++;

        if (((AbstractTrains) entityOne).clearLinkTimer < 60) {
            return;
        }

        ((AbstractTrains) entityOne).clearLinkTimer = 0;
        System.out.println("clear 1   " + ((AbstractTrains) entityOne).Link1 + "  " + entityOne);

        if (((AbstractTrains) entityOne).Link2 != 0) {
            freeLink2(entityOne);
        }

        if (((AbstractTrains) entityOne).Link2 == -1) {
            freeLink2(entityOne);
        }
    }

    private void freeLink1(Entity entity) {
        if (entity instanceof EntityRollingStock) {
            ((AbstractTrains) entity).Link1 = 0;
            ((AbstractTrains) entity).cartLinked1 = null;
            ((EntityRollingStock) entity).Link1Anchor = ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;
            ((EntityRollingStock) entity).RollingStock.clear();
        }
    }

    private void freeLink2(Entity entity) {
        if (entity instanceof EntityRollingStock) {
            ((AbstractTrains) entity).Link2 = 0;
            ((AbstractTrains) entity).cartLinked2 = null;
            ((EntityRollingStock) entity).Link2Anchor = ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;
            ((EntityRollingStock) entity).RollingStock.clear();
        }
    }

    private void addLinkNumber(Entity entity) {
        ((EntityRollingStock) entity).linkageNumber = 0;

        if (((AbstractTrains) entity).Link1 != 0) {
            ((EntityRollingStock) entity).linkageNumber++;
        }
        else if (((EntityRollingStock) entity).linkageNumber > 0) {
            ((EntityRollingStock) entity).linkageNumber--;
        }

        if (((AbstractTrains) entity).Link2 != 0) {
            ((EntityRollingStock) entity).linkageNumber++;
        }
        else if (((EntityRollingStock) entity).linkageNumber > 0) {
            ((EntityRollingStock) entity).linkageNumber--;
        }
    }

    public void addStake(EntityRollingStock cart1, EntityRollingStock cart2, boolean byPlayer) {
        if (worldObj.isRemote) {
            return;
        }

        distanceBehindCart = cart1.getLinkageDistance((EntityMinecart) cart1);
        float allowedLinkDistance = distanceBehindCart;

        if (cart2.isAttaching && cart1.isAttaching) {
            if (areLinked(cart1, cart2)) {
                return;
            }

            if (!hasFreeLogicalLink(cart1) || !hasFreeLogicalLink(cart2)) {
                return;
            }

            double distancesX[] = new double[4];
            double distancesZ[] = new double[4];
            double euclidian[] = new double[4];

            double d = 0;
            double d1 = 0;

            int cart1Anchor = ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;
            int cart2Anchor = ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;

            if (MasterPhysicsCouplerUtil.hasMasterAnchors(cart1) || MasterPhysicsCouplerUtil.hasMasterAnchors(cart2)) {
                MasterPhysicsCouplerUtil.AnchorPair pair =
                        MasterPhysicsCouplerUtil.findBestAvailableAnchorPair(cart1, cart2);

                if (pair == null) {
                    return;
                }

                d = pair.vectorX;
                d1 = pair.vectorZ;

                cart1Anchor = pair.anchorA;
                cart2Anchor = pair.anchorB;
                allowedLinkDistance = pair.allowedLinkDistance;
            }
            else if (cart1.bogieLoco != null || cart2.bogieLoco != null) {
                if (cart1.bogieLoco != null && cart2.bogieLoco == null) {
                    distancesX[0] = cart1.posX - cart2.posX;
                    distancesZ[0] = cart1.posZ - cart2.posZ;

                    distancesX[1] = cart1.bogieLoco.posX - cart2.posX;
                    distancesZ[1] = cart1.bogieLoco.posZ - cart2.posZ;

                    distancesX[2] = 100;
                    distancesZ[2] = 100;
                    distancesX[3] = 100;
                    distancesZ[3] = 100;

                    for (int i = 0; i < distancesX.length; i++) {
                        euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
                    }
                }
                else if (cart1.bogieLoco == null) {
                    distancesX[0] = cart1.posX - cart2.posX;
                    distancesZ[0] = cart1.posZ - cart2.posZ;

                    distancesX[1] = cart1.posX - cart2.bogieLoco.posX;
                    distancesZ[1] = cart1.posZ - cart2.bogieLoco.posZ;

                    distancesX[2] = 100;
                    distancesZ[2] = 100;
                    distancesX[3] = 100;
                    distancesZ[3] = 100;

                    for (int i = 0; i < distancesX.length; i++) {
                        euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
                    }
                }
                else {
                    distancesX[0] = cart1.posX - cart2.posX;
                    distancesZ[0] = cart1.posZ - cart2.posZ;

                    distancesX[1] = cart1.bogieLoco.posX - cart2.posX;
                    distancesZ[1] = cart1.bogieLoco.posZ - cart2.posZ;

                    distancesX[2] = cart1.posX - cart2.bogieLoco.posX;
                    distancesZ[2] = cart1.posZ - cart2.bogieLoco.posZ;

                    distancesX[3] = cart1.bogieLoco.posX - cart2.bogieLoco.posX;
                    distancesZ[3] = cart1.bogieLoco.posZ - cart2.bogieLoco.posZ;

                    for (int i = 0; i < distancesX.length; i++) {
                        euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
                    }
                }

                double minX = euclidian[0];
                int minIndex = 0;

                for (int k = 0; k < euclidian.length; k++) {
                    if (Math.abs(euclidian[k]) < Math.abs(minX)) {
                        minX = euclidian[k];
                        minIndex = k;
                    }
                }

                d = distancesX[minIndex];
                d1 = distancesZ[minIndex];
            }
            else {
                d = cart1.posX - cart2.posX;
                d1 = cart1.posZ - cart2.posZ;
            }

            if (MathHelper.sqrt_double((d * d) + (d1 * d1)) <= allowedLinkDistance) {
                if (!assignLink(cart1, cart2, cart1Anchor)) {
                    return;
                }

                if (!assignLink(cart2, cart1, cart2Anchor)) {
                    clearLinkTo(cart1, cart2);
                    return;
                }

                if (!cart1.RollingStock.contains(cart2)) {
                    cart1.RollingStock.add(cart2);
                }

                if (!cart2.RollingStock.contains(cart1)) {
                    cart2.RollingStock.add(cart1);
                }

                cart2.isAttached = true;
                cart2.isAttaching = false;

                cart1.isAttaching = false;
                cart1.isAttached = true;

                if (cart2.cartLinked1 != null && cart2.cartLinked1.trainHandler != null) {
                    EntityRollingStock.allTrains.remove(cart2.cartLinked1.trainHandler);
                    cart2.cartLinked1.trainHandler.getTrains().clear();
                }

                if (cart2.cartLinked2 != null && cart2.cartLinked2.trainHandler != null) {
                    EntityRollingStock.allTrains.remove(cart2.cartLinked2.trainHandler);
                    cart2.cartLinked2.trainHandler.getTrains().clear();
                }

                List entityList = cart1.worldObj.getEntitiesWithinAABBExcludingEntity(cart1, cart1.boundingBox.expand(10, 10, 10));

                for (Object entity : entityList) {
                    if (entity instanceof EntityPlayer) {
                        ((EntityPlayer) entity).addChatMessage(new ChatComponentText("Attached " + StatCollector.translateToLocal(cart1.getTrainName()) + " to " + StatCollector.translateToLocal(cart2.getTrainName()) + "!"));
                    }
                }
            }
        }
    }

    private boolean hasFreeLogicalLink(EntityRollingStock cart) {
        return cart != null
                && ((cart.Link1 == 0 || cart.Link1 == -1 || cart.cartLinked1 == null)
                || (cart.Link2 == 0 || cart.Link2 == -1 || cart.cartLinked2 == null));
    }

    private boolean assignLink(EntityRollingStock source, EntityRollingStock target, int sourceAnchor) {
        if (source.Link1 == 0 || source.Link1 == -1 || source.cartLinked1 == null) {
            source.Link1 = target.getUniqueTrainID();
            source.cartLinked1 = target;
            source.Link1Anchor = sourceAnchor;
            return true;
        }

        if (source.Link2 == 0 || source.Link2 == -1 || source.cartLinked2 == null) {
            source.Link2 = target.getUniqueTrainID();
            source.cartLinked2 = target;
            source.Link2Anchor = sourceAnchor;
            return true;
        }

        return false;
    }

    private void clearLinkTo(EntityRollingStock source, EntityRollingStock target) {
        if (source == null || target == null) {
            return;
        }

        if (source.cartLinked1 == target || source.Link1 == target.getUniqueTrainID()) {
            source.Link1 = 0;
            source.cartLinked1 = null;
            source.Link1Anchor = ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;
        }

        if (source.cartLinked2 == target || source.Link2 == target.getUniqueTrainID()) {
            source.Link2 = 0;
            source.cartLinked2 = null;
            source.Link2Anchor = ITwoBogieMasterPhysicsStock.LINK_ANCHOR_LEGACY;
        }
    }

    public boolean areLinked(Entity cart1, Entity cart2) {
        if (!(cart1 instanceof AbstractTrains) || !(cart2 instanceof AbstractTrains)) {
            return false;
        }

        return ((((AbstractTrains) cart2).getUniqueTrainID() == ((AbstractTrains) cart1).Link1) || (((AbstractTrains) cart2).getUniqueTrainID() == ((AbstractTrains) cart1).Link2)) ||
                ((((AbstractTrains) cart1).getUniqueTrainID() == ((AbstractTrains) cart2).Link1) || (((AbstractTrains) cart1).getUniqueTrainID() == ((AbstractTrains) cart2).Link2));
    }

    public float getOptimalDistance(AbstractTrains cart1, AbstractTrains cart2) {
        return cart1.getOptimalDistance(cart2) + cart2.getOptimalDistance(cart1);
    }

    private boolean canCartBeAdjustedBy(Entity cart1, Entity cart2) {
        if (cart1 == cart2) {
            return false;
        }

        if (((cart1 instanceof EntityRollingStock)) && (!((EntityRollingStock) cart1).canBeAdjusted((EntityMinecart) cart2))) {
            return false;
        }

        return !RailTools.isCartLockedDown((EntityMinecart) cart1);
    }

    private void StakePhysic(EntityRollingStock cart1, EntityRollingStock cart2, int linkIndex) {
        if (worldObj.isRemote || cart1.updateTicks < 5 || cart2.updateTicks < 5) {
            return;
        }

        if (cart1.trainHandler != null && cart1.trainHandler.usesMasterPhysics()) {
            return;
        }

        if (cart2.trainHandler != null && cart2.trainHandler.usesMasterPhysics()) {
            return;
        }

        if (cart2.isAttached && cart1.isAttached && areLinked(cart2, cart1)) {
            boolean adj1 = canCartBeAdjustedBy(cart1, cart2);
            boolean adj2 = canCartBeAdjustedBy(cart2, cart1);

            double distancesX[] = new double[4];
            double distancesZ[] = new double[4];
            double euclidian[] = new double[4];

            double d = 0;
            double d1 = 0;
            double vecX = 0;
            double vecZ = 0;
            int minIndex = 0;

            if (MasterPhysicsCouplerUtil.hasMasterAnchors(cart1) || MasterPhysicsCouplerUtil.hasMasterAnchors(cart2)) {
                double[] masterVector = MasterPhysicsCouplerUtil.getStoredOrBestAnchorVector(cart1, cart2);
                d = masterVector[0];
                d1 = masterVector[1];
                vecX = d;
                vecZ = d1;
            }
            else if (cart1.bogieLoco != null || cart2.bogieLoco != null) {
                if (cart1.bogieLoco != null && cart2.bogieLoco == null) {
                    distancesX[0] = cart1.posX - cart2.posX;
                    distancesZ[0] = cart1.posZ - cart2.posZ;

                    distancesX[1] = cart1.bogieLoco.posX - cart2.posX;
                    distancesZ[1] = cart1.bogieLoco.posZ - cart2.posZ;

                    distancesX[2] = 100;
                    distancesZ[2] = 100;
                    distancesX[3] = 100;
                    distancesZ[3] = 100;
                }
                else if (cart1.bogieLoco == null) {
                    distancesX[0] = cart1.posX - cart2.posX;
                    distancesZ[0] = cart1.posZ - cart2.posZ;

                    distancesX[1] = cart1.posX - cart2.bogieLoco.posX;
                    distancesZ[1] = cart1.posZ - cart2.bogieLoco.posZ;

                    distancesX[2] = 100;
                    distancesZ[2] = 100;
                    distancesX[3] = 100;
                    distancesZ[3] = 100;
                }
                else {
                    distancesX[0] = cart1.posX - cart2.posX;
                    distancesZ[0] = cart1.posZ - cart2.posZ;

                    distancesX[1] = cart1.bogieLoco.posX - cart2.posX;
                    distancesZ[1] = cart1.bogieLoco.posZ - cart2.posZ;

                    distancesX[2] = cart1.posX - cart2.bogieLoco.posX;
                    distancesZ[2] = cart1.posZ - cart2.bogieLoco.posZ;

                    distancesX[3] = cart1.bogieLoco.posX - cart2.bogieLoco.posX;
                    distancesZ[3] = cart1.bogieLoco.posZ - cart2.bogieLoco.posZ;
                }

                for (int i = 0; i < distancesX.length; i++) {
                    euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
                }

                double minX = euclidian[0];

                for (int k = 0; k < euclidian.length; k++) {
                    if (Math.abs(euclidian[k]) < Math.abs(minX)) {
                        minX = euclidian[k];
                        minIndex = k;
                    }
                }

                d = distancesX[minIndex];
                d1 = distancesZ[minIndex];
                vecX = d;
                vecZ = d1;
            }
            else {
                d = cart1.posX - cart2.posX;
                d1 = cart1.posZ - cart2.posZ;
                vecX = cart1.posX - cart2.posX;
                vecZ = cart1.posZ - cart2.posZ;
            }

            double d2 = MathHelper.sqrt_double((d * d) + (d1 * d1));

            if (d2 > 20) {
                if (cart1.worldObj != null) {
                    EntityPlayer player = cart1.worldObj.getClosestPlayer(cart1.posX, cart1.posY, cart1.posZ, 300);

                    if (player != null) {
                        player.addChatMessage(new ChatComponentText(String.format("[TRAINCRAFT] The rolling stock at %d %d %d had a problem loading and has lost its link. Attached cart was too far away", (int) cart1.posX, (int) cart1.posY, (int) cart1.posZ)));
                    }
                }

                if (linkIndex == 1) {
                    this.freeLink1(cart1);
                    this.freeLink1(cart2);
                }

                if (linkIndex == 2) {
                    this.freeLink2(cart1);
                    this.freeLink2(cart2);
                }

                return;
            }

            double vecNorm = MathHelper.sqrt_double(vecX * vecX + vecZ * vecZ);

            if (vecNorm < 0.00001D) {
                return;
            }

            double unitX = vecX / vecNorm;
            double unitZ = vecZ / vecNorm;

            double stretch = d2 - getOptimalDistance(cart1, cart2);

            double springX = limitForce(0.4D * stretch * vecX * -1);
            double springZ = limitForce(0.4D * stretch * vecZ * -1);

            if (adj1) {
                cart1.motionX += springX;
                cart1.motionZ += springZ;
            }

            if (adj2) {
                cart2.motionX -= springX;
                cart2.motionZ -= springZ;
            }

            double dot = (cart1.motionX - cart2.motionX) * unitX + (cart1.motionZ - cart2.motionZ) * unitZ;

            double dampX = limitForce(0.4D * dot * unitX * -1);
            double dampZ = limitForce(0.4D * dot * unitZ * -1);

            if (adj1) {
                cart1.motionX += dampX;
                cart1.motionZ += dampZ;
            }

            if (adj2) {
                cart2.motionX -= dampX;
                cart2.motionZ -= dampZ;
            }
        }
    }

    private double limitForce(double force) {
        return Math.copySign(Math.abs(Math.min(Math.abs(force), 14.0D)), force);
    }

    private double limitForce(double force, double max) {
        return Math.copySign(Math.abs(Math.min(Math.abs(force), max)), force);
    }
}
