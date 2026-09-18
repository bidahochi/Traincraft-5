package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricW_A11 extends ElectricTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricW_A11;
    }
    public ElectricW_A11(World world) {
        super(world);
        InsertTexture(0, "Generic");
        InsertTexture(1, "Cornwall City Railway");
        InsertTexture(2, "Temporarily Named Spawn Railroad");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, -0.3, 0.4); }

    

    





    @Override
    public String getInventoryName() {
        return "SEC W-A11";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.1F;
    }

    
    


}
