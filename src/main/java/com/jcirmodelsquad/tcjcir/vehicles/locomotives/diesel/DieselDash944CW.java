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


public class DieselDash944CW extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash9C44W;
    }
    public DieselDash944CW(World world) {
        super(world, EnumTrains.Dash944CW.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Norfolk Southern");
        InsertTexture(1, "Norfolk Southern (9634)");
        InsertTexture(2, "Blandsvill & Blankerston");
        InsertTexture(3, "Fox Union Rail Resources (FURRX)");
        InsertTexture(4, "BNSF (H1)");
        InsertTexture(5, "Southern Pacific");
        InsertTexture(6, "Southern Pacific (UP Patch)");
        InsertTexture(7, "Chicago Northwestern");
        InsertTexture(8, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(9, "Avanste Northeastern");
        InsertTexture(10, "Galesburg Clinton & Midland");
        InsertTexture(11, "CSLX (EX CSWR)");
        InsertTexture(12, "ATSF");
        InsertTexture(13, "ATSF (BNSF Patch)");
        InsertTexture(14, "Plainsview");
        InsertTexture(15, "Galesburg Clinton & Midland");
    }
    public DieselDash944CW(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.9, 0.4, -0.35); }



    
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }
    
    @Override
    public String getInventoryName() {
        return "GE Dash 9-44CW";
    }

    

}
