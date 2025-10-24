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


public class DieselDash839C extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash839C;
    }
    public DieselDash839C(World world) {
        super(world, EnumTrains.Dash839C.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Conrail");
        InsertTexture(1, "CSXT (YN2)");
        InsertTexture(2, "CSXT (YN3)");
        InsertTexture(3, "Norfolk Southern");
        InsertTexture(4, "Nomansi and Eastern Pacific");
        InsertTexture(5, "Nomansi and Eastern Pacific (Late)");
        InsertTexture(6, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(7, "Blandsville & Blankerston");
        InsertTexture(8, "Magnolia Acres");
        InsertTexture(9, "Nautilus");
        InsertTexture(10, "Ann Arbor (but awesomer)");
        InsertTexture(11, "CEEX 101");
        InsertTexture(12, "CNRC (Ex EARR)", LockoutGroup.CNRC);
    }
    public DieselDash839C(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.05, 0.3, -0.35); }
    


    
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }

    @Override
    public String getInventoryName() {
        return "GE C39-8";
    }



}
