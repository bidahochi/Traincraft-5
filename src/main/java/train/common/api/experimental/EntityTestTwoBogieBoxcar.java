package  train.common.api.experimental;

import net.minecraft.world.World;

public class EntityTestTwoBogieBoxcar extends EntityMasterPhysicsTwoBogieFreight {

    public EntityTestTwoBogieBoxcar(World world) {
        super(world);
    }

    @Override
    public int getSizeInventory()
    {
        return 0;
    }

    @Override
    protected double getRearBogieOffset() {
        return -2.75D;
    }

    @Override
    protected double getFrontBogieOffset() {
        return 2.75D;
    }
}
