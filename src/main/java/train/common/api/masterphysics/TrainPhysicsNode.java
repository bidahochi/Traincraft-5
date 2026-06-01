package train.common.api.masterphysics;

import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;

public class TrainPhysicsNode {
    public static final int BODY = 0;
    public static final int REAR_BOGIE = 1;
    public static final int FRONT_BOGIE = 2;

    public final EntityRollingStock owner;
    public final Entity entity;
    public final int type;

    public double posX;
    public double posY;
    public double posZ;

    public double motionX;
    public double motionY;
    public double motionZ;

    public TrainPhysicsNode(EntityRollingStock owner, Entity entity, int type) {
        this.owner = owner;
        this.entity = entity;
        this.type = type;
        readFromEntity();
    }

    public void readFromEntity() {
        if (entity == null) {
            return;
        }

        posX = entity.posX;
        posY = entity.posY;
        posZ = entity.posZ;

        motionX = entity.motionX;
        motionY = entity.motionY;
        motionZ = entity.motionZ;
    }

    public void writeToEntity() {
        if (entity == null) {
            return;
        }

        entity.motionX = motionX;
        entity.motionY = motionY;
        entity.motionZ = motionZ;
        entity.setPosition(posX, posY, posZ);
    }

    public void hardStop() {
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;

        if (entity != null) {
            entity.motionX = 0.0D;
            entity.motionY = 0.0D;
            entity.motionZ = 0.0D;
        }
    }
}
