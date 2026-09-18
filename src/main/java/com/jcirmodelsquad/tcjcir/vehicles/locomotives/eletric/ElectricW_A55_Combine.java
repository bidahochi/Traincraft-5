package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricW_A55_Combine extends ElectricTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricW_A55_Combine;
    }
    public ElectricW_A55_Combine(World world) {
        super(world);
        InsertTexture(0, "Generic");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.27, -0.3, 0.4); }

    

    





    @Override
    public String getInventoryName() {
        return "SEC W-A55 Combine";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.52F;
    }

    
    


}
