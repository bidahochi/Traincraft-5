package train.common.api.experimental;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.api.masterphysics.ITwoBogieMasterPhysicsStock;
import train.common.api.masterphysics.IMasterPhysicsRenderOffset;
import train.common.api.masterphysics.TwoBogieMasterController;

public abstract class EntityMasterPhysicsTwoBogieFreight extends Freight
        implements ITwoBogieMasterPhysicsStock, IMasterPhysicsRenderOffset {

    private TwoBogieMasterController twoBogieController;

    public EntityMasterPhysicsTwoBogieFreight(World world) {
        super(world);
        twoBogieController = new TwoBogieMasterController(this, getRearBogieOffset(), getFrontBogieOffset());
    }

    protected double getRearBogieOffset() {
        return -2.75D;
    }

    protected double getFrontBogieOffset() {
        return 2.75D;
    }

    @Override
    public void onUpdate() {
        /*
         * Let parent stock logic run first.
         * EntityRollingStock must have old movement/path/link physics gated by
         * shouldEvaluateOwnPhysics(), otherwise old body physics can fight this.
         */
        super.onUpdate();

        if (worldObj == null || worldObj.isRemote || twoBogieController == null) {
            return;
        }

        twoBogieController.ensureBogies();

        if (!twoBogieController.isReady()) {
            return;
        }

        if (!isMasterPhysicsControlled()) {
            boolean blocked = twoBogieController.masterRailTickBogies();

            if (!blocked) {
                twoBogieController.solveBogieSpacingConstraint(4);
            }
        }

        twoBogieController.updateBodyFromBogies();

        /*
         * The main body is derived from the bogies. Do not allow old body motion
         * to accumulate between ticks.
         */
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
    }

    @Override
    public boolean usesMasterPhysics() {
        return true;
    }

    @Override
    public void masterPhysicsPreTick() {
        if (twoBogieController != null) {
            twoBogieController.ensureBogies();
        }
    }

    @Override
    public void masterPhysicsPostTick() {
        if (twoBogieController != null) {
            twoBogieController.updateBodyFromBogies();
        }
    }

    @Override
    public void masterPhysicsHardStop() {
        if (twoBogieController != null) {
            twoBogieController.hardStop();
        }
        else {
            motionX = 0.0D;
            motionY = 0.0D;
            motionZ = 0.0D;
        }
    }

    @Override
    public boolean canAcceptMasterPhysicsPush() {
        return !isDead && !parkingBrake;
    }

    @Override
    public void applyMasterPhysicsPush(Entity source, double pushX, double pushZ) {
        if (!canAcceptMasterPhysicsPush()) {
            return;
        }

        if (twoBogieController != null && isTwoBogieReady()) {
            twoBogieController.applyPushToBogies(pushX, pushZ);
            return;
        }

        this.motionX += pushX;
        this.motionZ += pushZ;
    }

    public boolean masterRailTickBogies() {
        return twoBogieController != null && twoBogieController.masterRailTickBogies();
    }

    public void solveInternalBogieConstraints() {
        if (twoBogieController != null) {
            twoBogieController.solveBogieSpacingConstraint(4);
        }
    }

    @Override
    public EntityBogie getRearBogie() {
        return twoBogieController == null ? null : twoBogieController.getRearBogie();
    }

    @Override
    public EntityBogie getFrontBogie() {
        return twoBogieController == null ? null : twoBogieController.getFrontBogie();
    }

    @Override
    public Entity getLinkForceEntity(int anchor) {
        if (twoBogieController == null) {
            return this;
        }

        return twoBogieController.getLinkForceEntity(anchor);
    }

    @Override
    public Vec3 getLinkAnchorPosition(int anchor) {
        if (twoBogieController == null) {
            return Vec3.createVectorHelper(posX, posY, posZ);
        }

        return twoBogieController.getLinkAnchorPosition(anchor);
    }

    @Override
    public boolean isTwoBogieReady() {
        return twoBogieController != null && twoBogieController.isReady();
    }

    @Override
    public float getAnchorLinkageDistance(int anchor, EntityRollingStock other) {
        if (anchor == ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR) {
            return getRearBogieLinkageDistance(other);
        }

        if (anchor == ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT) {
            return getFrontBogieLinkageDistance(other);
        }

        return getLinkageDistance(other);
    }

    protected float getRearBogieLinkageDistance(EntityRollingStock other) {
        return 0.75F;
    }

    protected float getFrontBogieLinkageDistance(EntityRollingStock other) {
        return 0.75F;
    }

    @Override
    public double getMasterPhysicsRenderYOffset() {
        return 0.65D;
    }

    @Override
    public float getMasterPhysicsRenderYawOffset() {
        /*
         * Tune this per stock. If the model points sideways, try 90F or -90F.
         */
        return 0.0F;
    }

    @Override
    public boolean useMasterPhysicsRenderRotation() {
        return true;
    }

    @Override
    public void setDead() {
        if (twoBogieController != null) {
            twoBogieController.setDead();
        }

        super.setDead();
    }

    /**
     * Under bogie-coupled master physics this is the desired coupler gap, not
     * the old center-to-center distance.
     */
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.35F;
    }

    @Override
    public float getLinkageDistance(EntityMinecart cart) {
        return 2.0F;
    }
}
