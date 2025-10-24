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

public class DieselRS2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRS2;
    }
    public DieselRS2(World world) {
        super(world, EnumTrains.RS2.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Deleware & Hudson");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "sans fey undertail rayroad");
        InsertTexture(3, "Lehigh & New England");
        InsertTexture(4, "Lehigh & New England (late)");
        InsertTexture(5, "Nautilus");
        InsertTexture(6, "AGW");
        InsertTexture(7, "WM (Fireball)");
        InsertTexture(8, "WM (Speed Lettering)");

    }
    public DieselRS2(World world, double d, double d1, double d2){
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
        return "ALCo RS-2";
    }



    


}
