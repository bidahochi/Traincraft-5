package train.common.api.masterphysics;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.library.BlockIDs;

public class TwoBogieMasterController {

    private final EntityRollingStock owner;

    private final double rearOffset;
    private final double frontOffset;

    private EntityMasterGuideBogie rearBogie;
    private EntityMasterGuideBogie frontBogie;

    private double lastGoodRearX;
    private double lastGoodRearY;
    private double lastGoodRearZ;

    private double lastGoodFrontX;
    private double lastGoodFrontY;
    private double lastGoodFrontZ;

    private boolean hasLastGoodPair = false;

    public TwoBogieMasterController(EntityRollingStock owner, double rearOffset, double frontOffset) {
        this.owner = owner;
        this.rearOffset = rearOffset;
        this.frontOffset = frontOffset;
    }

    public EntityBogie getRearBogie() {
        return rearBogie;
    }

    public EntityBogie getFrontBogie() {
        return frontBogie;
    }

    public boolean isReady() {
        return rearBogie != null && frontBogie != null && !rearBogie.isDead && !frontBogie.isDead;
    }

    public double getTargetBogieSpacing() {
        return Math.abs(frontOffset - rearOffset);
    }

    public void ensureBogies() {
        if (owner.worldObj == null || owner.worldObj.isRemote || !owner.addedToChunk) {
            return;
        }

        if (rearBogie == null || rearBogie.isDead) {
            rearBogie = createBogie(ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR, rearOffset);
            owner.worldObj.spawnEntityInWorld(rearBogie);
        }

        if (frontBogie == null || frontBogie.isDead) {
            frontBogie = createBogie(ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT, frontOffset);
            owner.worldObj.spawnEntityInWorld(frontBogie);
        }

        owner.bogieLoco = rearBogie;

        if (isReady() && !hasLastGoodPair && !isBogiePairInvalid()) {
            rememberGoodPairPosition();
        }
    }

    private EntityMasterGuideBogie createBogie(int index, double offset) {
        double[] xz = getTrackBasedOffsetPosition(offset);

        EntityMasterGuideBogie bogie = new EntityMasterGuideBogie(
                owner.worldObj,
                xz[0],
                owner.posY,
                xz[1],
                owner,
                owner.getUniqueTrainID(),
                index,
                offset
        );

        bogie.setPosition(xz[0], owner.posY, xz[1]);

        return bogie;
    }

    private double[] getTrackBasedOffsetPosition(double offset) {
        int x = MathHelper.floor_double(owner.posX);
        int y = MathHelper.floor_double(owner.posY);
        int z = MathHelper.floor_double(owner.posZ);

        RailSample rail = findRail(owner.worldObj, x, y, z);

        if (rail == null) {
            rail = findRail(owner.worldObj, x, y - 1, z);
        }

        if (rail != null) {
            return getOffsetFromRailMeta(rail.x, rail.z, rail.meta, offset);
        }

        return getOffsetFromYaw(owner.rotationYaw, offset);
    }

    private RailSample findRail(World world, int x, int y, int z) {
        if (world == null) {
            return null;
        }

        Block block = world.getBlock(x, y, z);

        if (block == null) {
            return null;
        }

        if (BlockRailBase.func_150051_a(block)
                || block == BlockIDs.tcRail.block
                || block == BlockIDs.tcRailGag.block
                || block instanceof BlockTCRail
                || block instanceof BlockTCRailGag) {
            return new RailSample(x, y, z, world.getBlockMetadata(x, y, z));
        }

        return null;
    }

    private double[] getOffsetFromRailMeta(int railX, int railZ, int meta, double offset) {
        double baseX = railX + 0.5D;
        double baseZ = railZ + 0.5D;

        double dirX = 0.0D;
        double dirZ = 0.0D;

        switch (meta) {
            case 0:
            case 2:
                dirX = 0.0D;
                dirZ = 1.0D;
                break;

            case 1:
            case 3:
                dirX = 1.0D;
                dirZ = 0.0D;
                break;

            case 4:
            case 6:
                dirX = 1.0D;
                dirZ = -1.0D;
                break;

            case 5:
            case 7:
                dirX = 1.0D;
                dirZ = 1.0D;
                break;

            default:
                return getOffsetFromYaw(owner.rotationYaw, offset);
        }

        double len = Math.sqrt(dirX * dirX + dirZ * dirZ);

        if (len < 0.0001D) {
            return new double[] { baseX, baseZ };
        }

        dirX /= len;
        dirZ /= len;

        return new double[] {
                baseX + dirX * offset,
                baseZ + dirZ * offset
        };
    }

    private double[] getOffsetFromYaw(float yaw, double offset) {
        double yawRad = Math.toRadians(yaw);

        double dirX = -Math.sin(yawRad);
        double dirZ = Math.cos(yawRad);

        return new double[] {
                owner.posX + dirX * offset,
                owner.posZ + dirZ * offset
        };
    }

    public boolean masterRailTickBogies() {
        if (!isReady()) {
            return false;
        }

        rememberGoodPairPosition();

        boolean rearBlocked = false;
        boolean frontBlocked = false;

        if (rearBogie != null && !rearBogie.isDead) {
            rearBlocked = rearBogie.masterRailTick();
        }

        if (frontBogie != null && !frontBogie.isDead) {
            frontBlocked = frontBogie.masterRailTick();
        }

        if (rearBlocked || frontBlocked || isBogiePairInvalid()) {
            restoreGoodPairPosition();
            return true;
        }

        solveBogieSpacingConstraint(4);

        if (isBogiePairInvalid()) {
            restoreGoodPairPosition();
            return true;
        }

        rememberGoodPairPosition();
        return false;
    }

    public void solveBogieSpacingConstraint(int iterations) {
        if (!isReady()) {
            return;
        }

        if (iterations < 1) {
            iterations = 1;
        }

        for (int i = 0; i < iterations; i++) {
            solveBogieSpacingOnce();
        }
    }

    private void solveBogieSpacingOnce() {
        double target = getTargetBogieSpacing();

        double dx = frontBogie.posX - rearBogie.posX;
        double dz = frontBogie.posZ - rearBogie.posZ;

        double dist = Math.sqrt(dx * dx + dz * dz);

        if (dist < 0.0001D) {
            return;
        }

        double error = dist - target;

        double nx = dx / dist;
        double nz = dz / dist;

        if (Math.abs(error) < 0.01D) {
            dampRelativeBogieSpeed(nx, nz);
            return;
        }

        double correction = error * 0.5D;

        if (correction > 0.12D) {
            correction = 0.12D;
        }
        else if (correction < -0.12D) {
            correction = -0.12D;
        }

        rearBogie.setPosition(
                rearBogie.posX + nx * correction,
                rearBogie.posY,
                rearBogie.posZ + nz * correction
        );

        frontBogie.setPosition(
                frontBogie.posX - nx * correction,
                frontBogie.posY,
                frontBogie.posZ - nz * correction
        );

        dampRelativeBogieSpeed(nx, nz);
    }

    private void dampRelativeBogieSpeed(double nx, double nz) {
        double relX = frontBogie.motionX - rearBogie.motionX;
        double relZ = frontBogie.motionZ - rearBogie.motionZ;

        double relAlong = relX * nx + relZ * nz;
        double damp = relAlong * 0.5D;

        frontBogie.motionX -= nx * damp;
        frontBogie.motionZ -= nz * damp;

        rearBogie.motionX += nx * damp;
        rearBogie.motionZ += nz * damp;
    }

    public void applyPushToBogies(double pushX, double pushZ) {
        if (!isReady()) {
            return;
        }

        if (isBogiePairInvalid()) {
            restoreGoodPairPosition();
            return;
        }

        rearBogie.motionX += pushX;
        rearBogie.motionZ += pushZ;

        frontBogie.motionX += pushX;
        frontBogie.motionZ += pushZ;

        solveBogieSpacingConstraint(2);
    }

    public void updateBodyFromBogies() {
        if (!isReady()) {
            return;
        }

        solveBogieSpacingConstraint(4);

        if (isBogiePairInvalid()) {
            restoreGoodPairPosition();
            return;
        }

        updateBodyFromBogiesNoConstraint();
    }

    private void updateBodyFromBogiesNoConstraint() {
        if (!isReady()) {
            return;
        }

        double oldX = owner.posX;
        double oldY = owner.posY;
        double oldZ = owner.posZ;

        double centerX = (rearBogie.posX + frontBogie.posX) * 0.5D;
        double centerY = (rearBogie.posY + frontBogie.posY) * 0.5D;
        double centerZ = (rearBogie.posZ + frontBogie.posZ) * 0.5D;

        double dx = frontBogie.posX - rearBogie.posX;
        double dy = frontBogie.posY - rearBogie.posY;
        double dz = frontBogie.posZ - rearBogie.posZ;

        owner.motionX = centerX - oldX;
        owner.motionY = centerY - oldY;
        owner.motionZ = centerZ - oldZ;

        owner.setPosition(centerX, centerY, centerZ);

        owner.serverRealRotation = MathHelper.wrapAngleTo180_float(
                (float) Math.toDegrees(Math.atan2(dz, dx)) - 90.0F
        );

        owner.rotationYaw = owner.serverRealRotation;

        double horizontal = MathHelper.sqrt_double(dx * dx + dz * dz);

        if (horizontal > 0.0001D) {
            owner.serverRealPitch = (float) Math.toDegrees(Math.atan2(dy, horizontal));
            owner.anglePitchClient = owner.serverRealPitch * 60.0D;
        }
    }

    private boolean isBogiePairInvalid() {
        if (!isReady()) {
            return true;
        }

        double target = getTargetBogieSpacing();

        double dx = frontBogie.posX - rearBogie.posX;
        double dz = frontBogie.posZ - rearBogie.posZ;
        double dist = Math.sqrt(dx * dx + dz * dz);

        return dist < target * 0.65D || dist > target * 1.35D;
    }

    private void rememberGoodPairPosition() {
        if (!isReady()) {
            return;
        }

        lastGoodRearX = rearBogie.posX;
        lastGoodRearY = rearBogie.posY;
        lastGoodRearZ = rearBogie.posZ;

        lastGoodFrontX = frontBogie.posX;
        lastGoodFrontY = frontBogie.posY;
        lastGoodFrontZ = frontBogie.posZ;

        hasLastGoodPair = true;
    }

    private void restoreGoodPairPosition() {
        if (!isReady()) {
            return;
        }

        rearBogie.motionX = 0.0D;
        rearBogie.motionY = 0.0D;
        rearBogie.motionZ = 0.0D;

        frontBogie.motionX = 0.0D;
        frontBogie.motionY = 0.0D;
        frontBogie.motionZ = 0.0D;

        if (hasLastGoodPair) {
            rearBogie.setPosition(lastGoodRearX, lastGoodRearY, lastGoodRearZ);
            frontBogie.setPosition(lastGoodFrontX, lastGoodFrontY, lastGoodFrontZ);
        }

        owner.motionX = 0.0D;
        owner.motionY = 0.0D;
        owner.motionZ = 0.0D;

        updateBodyFromBogiesNoConstraint();
    }

    public Vec3 getLinkAnchorPosition(int anchor) {
        Entity entity = getLinkForceEntity(anchor);

        if (entity == null) {
            return Vec3.createVectorHelper(owner.posX, owner.posY, owner.posZ);
        }

        return Vec3.createVectorHelper(entity.posX, entity.posY, entity.posZ);
    }

    public Entity getLinkForceEntity(int anchor) {
        if (anchor == ITwoBogieMasterPhysicsStock.LINK_ANCHOR_REAR) {
            return rearBogie;
        }

        if (anchor == ITwoBogieMasterPhysicsStock.LINK_ANCHOR_FRONT) {
            return frontBogie;
        }

        return owner;
    }

    public void hardStop() {
        owner.motionX = 0.0D;
        owner.motionY = 0.0D;
        owner.motionZ = 0.0D;

        if (rearBogie != null) {
            rearBogie.motionX = 0.0D;
            rearBogie.motionY = 0.0D;
            rearBogie.motionZ = 0.0D;
        }

        if (frontBogie != null) {
            frontBogie.motionX = 0.0D;
            frontBogie.motionY = 0.0D;
            frontBogie.motionZ = 0.0D;
        }
    }

    public void setDead() {
        if (rearBogie != null) {
            rearBogie.setDead();
        }

        if (frontBogie != null) {
            frontBogie.setDead();
        }
    }

    private static class RailSample {
        public final int x;
        public final int y;
        public final int z;
        public final int meta;

        public RailSample(int x, int y, int z, int meta) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.meta = meta;
        }
    }
}
