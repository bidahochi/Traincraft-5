package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;


import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2;
import com.jcirmodelsquad.tcjcir.features.autotrain.IAT2Compatible;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class PCH130Commute2 extends ElectricTrain implements IAT2Compatible {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.PCH130Commute2;
    }

    AutoTrain2 script2;


    public PCH130Commute2(World world) {
        super(world);
        dataWatcher.addObject(29, "");
        renderRefs.addProperty("doors", true);
        script2 = new AutoTrain2(this);
    }

    

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 2.0375F, -0.2F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public String getInventoryName() {
        return "PCH-130 Commute 2";
    }


    


    @Override
    public void onUpdate() {
        super.onUpdate();

        //Drive with AutoTrain2.

        if (!worldObj.isRemote) {
            if (script2.active) script2.drive();
        }
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1F;
    }

    

    

    @Override
    public void setLocoTurnedOnFromPacket(boolean set) {
        super.setLocoTurnedOnFromPacket(set);
       script2.init();
    }

    @Override
    public void stationStopComplete() {
        super.stationStopComplete();
        script2.stationStop();
    }


    @Override
    public AutoTrain2 getDriver() {
        return script2;
    }
}