package train.common.api.masterphysics;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.library.BlockIDs;

public class EntityMasterGuideBogie extends EntityBogie {

    private boolean allowMasterRailTick = false;

    private boolean blockedThisTick = false;

    private double preTickX;
    private double preTickY;
    private double preTickZ;

    private double preTickMotionX;
    private double preTickMotionY;
    private double preTickMotionZ;

    private double lastSafeRailX;
    private double lastSafeRailY;
    private double lastSafeRailZ;
    private boolean hasSafeRailPosition = false;

    public EntityMasterGuideBogie(World world) {
        super(world);
        configureAsGuidePoint();
    }

    public EntityRollingStock getParentRollingStock() {
        return entityMainTrain instanceof EntityRollingStock
                ? (EntityRollingStock) entityMainTrain
                : null;
    }

    public EntityMasterGuideBogie(World world,
                                  double x,
                                  double y,
                                  double z,
                                  EntityRollingStock mainTrain,
                                  int id,
                                  int index,
                                  double bogieShift) {
        super(world, x, y, z, mainTrain, id, index, bogieShift);
        configureAsGuidePoint();
        this.setPosition(x, y, z);

        if (isRailNearCurrentPosition()) {
            rememberSafeRailPosition();
        }
    }

    private void configureAsGuidePoint() {
        this.noClip = false;
        this.setSize(0.20F, 0.20F);
        this.yOffset = 0.0F;
        this.preventEntitySpawning = false;
        this.entityCollisionReduction = 1.0F;
    }

    @Override
    public boolean canBePushed() {
        return false;
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Override
    public AxisAlignedBB getCollisionBox(Entity entity) {
        return null;
    }

    @Override
    public void applyEntityCollision(Entity entity) {
    }

    @Override
    public void onUpdate() {
        if (entityMainTrain instanceof IMasterPhysicsStock
                && ((IMasterPhysicsStock) entityMainTrain).usesMasterPhysics()
                && !allowMasterRailTick) {
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            return;
        }

        guardedRailTick();
    }

    public boolean masterRailTick() {
        blockedThisTick = false;

        preTickX = this.posX;
        preTickY = this.posY;
        preTickZ = this.posZ;

        preTickMotionX = this.motionX;
        preTickMotionY = this.motionY;
        preTickMotionZ = this.motionZ;

        allowMasterRailTick = true;
        guardedRailTick();
        allowMasterRailTick = false;

        detectBlockedMovement();

        return blockedThisTick;
    }

    private void guardedRailTick() {
        if (isRailNearCurrentPosition()) {
            rememberSafeRailPosition();

            super.onUpdate();

            if (isRailNearCurrentPosition()) {
                rememberSafeRailPosition();
            }
            else {
                stopAndSnapToSafeRail();
            }

            return;
        }

        stopAndSnapToSafeRail();
    }

    private void detectBlockedMovement() {
        double attempted = Math.sqrt(preTickMotionX * preTickMotionX + preTickMotionZ * preTickMotionZ);

        if (attempted < 0.003D) {
            return;
        }

        double movedX = this.posX - preTickX;
        double movedZ = this.posZ - preTickZ;
        double moved = Math.sqrt(movedX * movedX + movedZ * movedZ);

        if (moved < attempted * 0.20D) {
            markBlocked();
        }
    }

    private boolean isRailNearCurrentPosition() {
        int x = MathHelper.floor_double(this.posX);
        int y = MathHelper.floor_double(this.posY);
        int z = MathHelper.floor_double(this.posZ);

        return isRailAt(x, y, z)
                || isRailAt(x, y - 1, z)
                || isRailAt(x, y + 1, z);
    }

    private boolean isRailAt(int x, int y, int z) {
        if (worldObj == null) {
            return false;
        }

        Block block = worldObj.getBlock(x, y, z);

        return BlockRailBase.func_150051_a(block)
                || block == BlockIDs.tcRail.block
                || block == BlockIDs.tcRailGag.block
                || block instanceof BlockTCRail
                || block instanceof BlockTCRailGag;
    }

    private void rememberSafeRailPosition() {
        int x = MathHelper.floor_double(this.posX);
        int y = MathHelper.floor_double(this.posY);
        int z = MathHelper.floor_double(this.posZ);

        if (isRailAt(x, y, z)) {
            rememberRailBlock(x, y, z);
            return;
        }

        if (isRailAt(x, y - 1, z)) {
            rememberRailBlock(x, y - 1, z);
            return;
        }

        if (isRailAt(x, y + 1, z)) {
            rememberRailBlock(x, y + 1, z);
        }
    }

    private void rememberRailBlock(int x, int y, int z) {
        lastSafeRailX = x + 0.5D;
        lastSafeRailY = y + 0.2D;
        lastSafeRailZ = z + 0.5D;
        hasSafeRailPosition = true;
    }

    private void stopAndSnapToSafeRail() {
        markBlocked();

        if (hasSafeRailPosition) {
            this.setPosition(lastSafeRailX, lastSafeRailY, lastSafeRailZ);
        }
        else if (entityMainTrain != null) {
            this.setPosition(entityMainTrain.posX, entityMainTrain.posY, entityMainTrain.posZ);
        }

        this.velocityChanged = true;
    }

    private void markBlocked() {
        blockedThisTick = true;
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
    }

    public boolean wasBlockedThisTick() {
        return blockedThisTick;
    }

    @Override
    public void updateDistance() {
    }
}
