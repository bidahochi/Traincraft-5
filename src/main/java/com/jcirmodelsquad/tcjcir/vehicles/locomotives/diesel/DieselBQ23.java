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

public class DieselBQ23 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselBQ23;
    }
    public DieselBQ23(World world) {
        super(world, EnumTrains.BQ23.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Family Lines (As Delivered)");
        InsertTexture(1, "Providence & Worcester");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "CSXT YN2 3003");
        InsertTexture(4, "CSXT YN2 (Post 90s)");
        InsertTexture(5, "CSXT Ghrey Ghonst");
        InsertTexture(6, "breaking bad if it was good");
        InsertTexture(7, "Nautilussy so sussy");
    }
    public DieselBQ23(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.4, 0.35, -0.4); }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }



    @Override
    public String getInventoryName() {
        return "GE BQ23-7";
    }

    

    
    

}
