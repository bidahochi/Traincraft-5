package train.common.api.masterphysics;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import train.common.api.EntityRollingStock;

public class TrainCouplerConstraint {

    private final EntityRollingStock cartA;
    private final EntityRollingStock cartB;

    private final int anchorA;
    private final int anchorB;

    private final float targetDistance;

    private final double springStrength;
    private final double dampingStrength;
    private final double maxForce;

    public TrainCouplerConstraint(EntityRollingStock cartA,
                                  EntityRollingStock cartB,
                                  int anchorA,
                                  int anchorB,
                                  float targetDistance) {
        this.cartA = cartA;
        this.cartB = cartB;
        this.anchorA = anchorA;
        this.anchorB = anchorB;
        this.targetDistance = targetDistance;

        this.springStrength = 0.08D;
        this.dampingStrength = 0.25D;
        this.maxForce = 0.08D;
    }

    public void solve() {
        Vec3 posA = MasterPhysicsCouplerUtil.getAnchorPosition(cartA, anchorA);
        Vec3 posB = MasterPhysicsCouplerUtil.getAnchorPosition(cartB, anchorB);

        Entity forceA = MasterPhysicsCouplerUtil.getForceEntity(cartA, anchorA);
        Entity forceB = MasterPhysicsCouplerUtil.getForceEntity(cartB, anchorB);

        if (forceA == null || forceB == null) {
            return;
        }

        double dx = posA.xCoord - posB.xCoord;
        double dz = posA.zCoord - posB.zCoord;

        double distance = MathHelper.sqrt_double(dx * dx + dz * dz);

        if (distance < 0.00001D) {
            return;
        }

        double nx = dx / distance;
        double nz = dz / distance;

        double error = distance - targetDistance;
        double spring = limit(error * springStrength);

        double relativeSpeed =
                (forceA.motionX - forceB.motionX) * nx +
                (forceA.motionZ - forceB.motionZ) * nz;

        double damp = limit(relativeSpeed * dampingStrength);
        double impulse = spring + damp;

        forceA.motionX -= nx * impulse;
        forceA.motionZ -= nz * impulse;

        forceB.motionX += nx * impulse;
        forceB.motionZ += nz * impulse;
    }

    private double limit(double value) {
        if (value > maxForce) {
            return maxForce;
        }

        if (value < -maxForce) {
            return -maxForce;
        }

        return value;
    }
}
