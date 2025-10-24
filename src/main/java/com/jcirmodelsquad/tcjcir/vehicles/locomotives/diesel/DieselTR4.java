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

//haha sw1 go brrrr
public class DieselTR4 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselTR4;
    }
    public DieselTR4(World world) {
        super(world, EnumTrains.TR4.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Belt Railroad of Chicago");
        InsertTexture(1, "Milwaukee Road");
        InsertTexture(2, "Chesapeake & Ohio");
        InsertTexture(3, "Baltimore & Ohio");
        InsertTexture(4, "Great Lakes & Northern Territories");
        InsertTexture(5, "Blandsville & Blankerston");
    }
    public DieselTR4(World world, double d, double d1, double d2){
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

    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35); }






    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "EMD TR4 Cow";
    }






}
