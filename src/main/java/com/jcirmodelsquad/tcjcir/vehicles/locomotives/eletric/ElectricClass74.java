package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricClass74 extends ElectricTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricClass74;
    }
    public ElectricClass74(World world) {
        super(world);
        InsertTexture(0, "BR");
        InsertTexture(1, "SPR", LockoutGroup.SPR);
        InsertTexture(2, "GCM", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(3, "CRL");
        InsertTexture(4, "CRL (Phase 2)");
    }

    @Override
    public String transportCountry()
    {
        return "UK";
    }


    /**
     * {@inheritDoc}
     */
    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
		return new SeatDefinition[]
		{
			new SeatDefinition("front_driver", 1.65F, 0.08f, -0.25F, SeatRole.DRIVER, "front_cab"),
			new SeatDefinition("rear_driver", -1.65F, 0.08f, 0.25F, SeatRole.DRIVER, "rear_cab")
		};
    }



    

    



    @Override
    public String getInventoryName() {
        return "Class 74";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.2F;
    }


    

}
