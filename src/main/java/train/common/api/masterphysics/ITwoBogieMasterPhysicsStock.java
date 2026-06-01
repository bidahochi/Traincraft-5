package train.common.api.masterphysics;

import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;

public interface ITwoBogieMasterPhysicsStock extends IMasterPhysicsStock {

    int LINK_ANCHOR_LEGACY = -1;
    int LINK_ANCHOR_REAR = 0;
    int LINK_ANCHOR_FRONT = 1;

    EntityBogie getRearBogie();

    EntityBogie getFrontBogie();

    Entity getLinkForceEntity(int anchor);

    Vec3 getLinkAnchorPosition(int anchor);

    boolean isTwoBogieReady();

    /**
     * Coupling detection range for this exact anchor.
     *
     * This is NOT the same as optimal coupled distance.
     * This answers: "how close must another selected anchor be before we allow linking?"
     */
    float getAnchorLinkageDistance(int anchor, EntityRollingStock other);
}
