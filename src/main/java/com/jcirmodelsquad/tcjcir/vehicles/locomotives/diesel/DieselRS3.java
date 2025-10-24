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

public class DieselRS3 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRS3;
    }
    public DieselRS3(World world) {
        super(world, EnumTrains.RS3.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Boston & Maine (Simp)");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Denver & Rio Grande Western (Early)");
        InsertTexture(3, "Denver & Rio Grande Western");
        InsertTexture(4, "AGW");
        InsertTexture(5, "CCRL");
        InsertTexture(6, "SER");
        InsertTexture(7, "NSE");
        InsertTexture(8, "WM (Fireball)");
        InsertTexture(9, "WM (Fireball Hammerhead)");
        InsertTexture(10, "WM (Speed Lettering)");
        InsertTexture(11, "WM (Speed Lettering Hammerhead)");
    }
    public DieselRS3(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.4, 0.35, -0.35); }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }



    @Override
    public String getInventoryName() {
        return "ALCo RS-3";
    }

    


    

}
