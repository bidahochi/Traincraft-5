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
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class DieselSB36X extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSB36X;
    }
    public DieselSB36X(World world) {
        super(world, EnumTrains.SB36X.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "TTLC (Black Forest Blue)");
        InsertTexture(1, "TTLC (Forest Blue)");
        InsertTexture(2, "TTLC (Forest Blue 2)");
        InsertTexture(3, "TTLC (Forest Blue 3)");
        InsertTexture(4, "TTLC (Forest Green)");
        InsertTexture(5, "TTLC (Forest Orange)");
        InsertTexture(6, "TTLC (Forest Pink)");
        InsertTexture(7, "TTLC (Forest Red)");
        InsertTexture(8, "TTLC (Forest Violet)");
        InsertTexture(9, "TTLC (Forest Yellow)");
        InsertTexture(10, "CEEX 360");

    }
    public DieselSB36X(World world, double d, double d1, double d2){
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
        return "CEE SB36X Prototype";
    }

    


    

}
