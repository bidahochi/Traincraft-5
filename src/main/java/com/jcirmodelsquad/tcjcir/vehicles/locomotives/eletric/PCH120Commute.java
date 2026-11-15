package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;


import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class PCH120Commute extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.PCH120Commute;
    }

    AutoTrain2 script2;

    public PCH120Commute(World world) {
        super(world);
        script2 = new AutoTrain2(this);
    }


    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.4344F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }








    @Override
    public String getInventoryName() {
        return "PCH-120 Commute";
    }


    

    public AxisAlignedBB getDetectionBoundingBox() {
        if (boundingBox == null) {
            // boundingBox = AxisAlignedBB.getBoundingBox(posX, posY, posZ, );
        }
        return boundingBox;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.8F;
    }



    

    @Override
    public void setLocoTurnedOnFromPacket(boolean set) {
        super.setLocoTurnedOnFromPacket(set);
        //script2.start(this);
    }


    @Override
    public void stationStopComplete() {
        super.stationStopComplete();
        script2.stationStop();
       /* theCurrentStation = nextStation;
        theTimetable.remove(nextStation);
        atoStatus = 0;
        this.stationStop3 = Vec3.createVectorHelper(0,0,0);*/
       // Traincraft.atoSetStopPoint.sendToAllAround(new PacketATOSetStopPoint(this.getEntityId(), xFromStopPoint, yFromStopPoint, zFromStopPoint, xStationStop, yStationStop, zStationStop), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
    }

}
