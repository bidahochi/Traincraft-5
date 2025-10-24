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

public class DieselGP39Dash2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP39Dash2;
    }
    public DieselGP39Dash2(World world) {
        super(world, EnumTrains.GP39Dash2.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "MKT");
        InsertTexture(1, "FURRX (Ex CSWR)");
        InsertTexture(2, "Nomansi & Eastern Pacific");
        InsertTexture(3, "NEP (Late)");
        InsertTexture(4, "CSXT (YN3)");

    }
    public DieselGP39Dash2(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.15, -0.325); }


    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.25F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD GP39-2";
    }



    


}
