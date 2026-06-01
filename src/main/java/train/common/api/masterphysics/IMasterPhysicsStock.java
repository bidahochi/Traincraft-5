package train.common.api.masterphysics;

import net.minecraft.entity.Entity;

public interface IMasterPhysicsStock {

    boolean usesMasterPhysics();

    void masterPhysicsPreTick();

    void masterPhysicsPostTick();

    void masterPhysicsHardStop();

    void applyMasterPhysicsPush(Entity source, double pushX, double pushZ);

    boolean canAcceptMasterPhysicsPush();
}
