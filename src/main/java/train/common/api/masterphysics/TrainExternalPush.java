package train.common.api.masterphysics;

import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;

public class TrainExternalPush {

    public final EntityRollingStock target;
    public final Entity source;
    public final double pushX;
    public final double pushZ;

    public TrainExternalPush(EntityRollingStock target, Entity source, double pushX, double pushZ) {
        this.target = target;
        this.source = source;
        this.pushX = pushX;
        this.pushZ = pushZ;
    }
}
