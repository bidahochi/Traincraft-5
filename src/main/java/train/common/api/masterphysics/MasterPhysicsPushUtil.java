package train.common.api.masterphysics;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import train.common.api.EntityRollingStock;

public final class MasterPhysicsPushUtil {

    private static final String LAST_PUSH_TICK = "FoxTC_LastMasterPhysicsPushTick";
    private static final String LAST_PUSH_PLAYER = "FoxTC_LastMasterPhysicsPushPlayer";

    private static final double PLAYER_PUSH_STRENGTH = 0.015D;
    private static final double MAX_PLAYER_MOTION_INPUT = 0.035D;

    private MasterPhysicsPushUtil() {}

    public static boolean tryHandlePlayerPush(EntityRollingStock target, Entity entity) {
        if (!(entity instanceof EntityPlayer)) {
            return false;
        }

        if (!(target instanceof IMasterPhysicsStock)) {
            return false;
        }

        IMasterPhysicsStock stock = (IMasterPhysicsStock) target;

        if (!stock.usesMasterPhysics()) {
            return false;
        }

        EntityPlayer player = (EntityPlayer) entity;

        if (target.worldObj == null || target.worldObj.isRemote) {
            return true;
        }

        if (wasAlreadyPushedThisTick(target, player)) {
            return true;
        }

        double[] push = calculatePlayerPushVector(target, player);

        if (push == null) {
            return true;
        }

        if (target.trainHandler != null && target.trainHandler.usesMasterPhysics()) {
            target.trainHandler.queueExternalPush(new TrainExternalPush(target, player, push[0], push[1]));
        }
        else if (stock.canAcceptMasterPhysicsPush()) {
            stock.applyMasterPhysicsPush(player, push[0], push[1]);
        }

        return true;
    }

    private static boolean wasAlreadyPushedThisTick(EntityRollingStock target, EntityPlayer player) {
        long tick = target.worldObj.getTotalWorldTime();

        NBTTagCompound data = target.getEntityData();

        if (data.getLong(LAST_PUSH_TICK) == tick
                && data.getInteger(LAST_PUSH_PLAYER) == player.getEntityId()) {
            return true;
        }

        data.setLong(LAST_PUSH_TICK, tick);
        data.setInteger(LAST_PUSH_PLAYER, player.getEntityId());

        return false;
    }

    private static double[] calculatePlayerPushVector(EntityRollingStock target, EntityPlayer player) {
        double pushX = player.motionX;
        double pushZ = player.motionZ;

        double motionNorm = MathHelper.sqrt_double(pushX * pushX + pushZ * pushZ);

        if (motionNorm < 0.005D) {
            pushX = target.posX - player.posX;
            pushZ = target.posZ - player.posZ;
            motionNorm = MathHelper.sqrt_double(pushX * pushX + pushZ * pushZ);
        }

        if (motionNorm < 0.0001D) {
            return null;
        }

        pushX /= motionNorm;
        pushZ /= motionNorm;

        double strength = PLAYER_PUSH_STRENGTH;

        if (motionNorm > 0.005D) {
            strength += Math.min(motionNorm, MAX_PLAYER_MOTION_INPUT) * 0.25D;
        }

        return new double[] {
                pushX * strength,
                pushZ * strength
        };
    }
}
