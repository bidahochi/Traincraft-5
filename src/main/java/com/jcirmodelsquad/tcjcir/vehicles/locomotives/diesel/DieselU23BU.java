package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class DieselU23BU extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23BU;
    }
    public DieselU23BU(World world) {
        super(world, EnumTrains.U23BU.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "FNCC (1st Order)", LockoutGroup.FNCC);//type b
        InsertTexture(1, "FNCC (2nd Order)", LockoutGroup.FNCC);//fb2
        InsertTexture(2, "FNCC (3rd Order)", LockoutGroup.FNCC);//type b
        InsertTexture(3, "FNCC 100 (American Bicentennial Commemorative Unit)", LockoutGroup.FNCC);//type b
        InsertTexture(4, "FNCC (Ex ATSF, Upgraded)", LockoutGroup.FNCC);// type b
        InsertTexture(5, "FNCC (Ex ATSF Patch)", LockoutGroup.FNCC);// type  b
        InsertTexture(6, "FNCC (Ex UP, Upgraded)", LockoutGroup.FNCC);//fb2
        InsertTexture(7, "FNCC (Ex UP Patch)", LockoutGroup.FNCC);//fb2
        InsertTexture(8, "FNCC (Ex CSX (C&O), Upgraded)", LockoutGroup.FNCC);//blomb
        InsertTexture(9, "FNCC (Ex CSX Patch (3275))", LockoutGroup.FNCC);//fb2
        InsertTexture(10, "FNCC (Ex CSX Patch (3317))", LockoutGroup.FNCC);//fb2
        InsertTexture(11, "FMSR 101-104 (First Batch)", LockoutGroup.FMSR);//type b

    }
    public DieselU23BU(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }



    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }
    

    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }



    @Override
    public String getInventoryName() {
        return "CEE U23B(U)";
    }

    

    


}
