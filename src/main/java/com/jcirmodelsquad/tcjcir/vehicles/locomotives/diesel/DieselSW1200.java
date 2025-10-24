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
public class DieselSW1200 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1200;
    }
    public DieselSW1200(World world) {
        super(world, EnumTrains.SW1200.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Illinois Terminal");
        InsertTexture(1, "Burlington Northern");
        InsertTexture(2, "Denver & Rio Grande Western");
        InsertTexture(3, "Denver & Rio Grande Western (Late)");
        InsertTexture(4, "Chicago & North Western");
        InsertTexture(5, "Great Northern");
        InsertTexture(6, "Milwaukee Road");
        InsertTexture(7, "Minneapolis, Northfield and Southern");
        InsertTexture(8, "Great Lakes & Northern Territories");
        InsertTexture(9, "Fremont & Elkhorn Valley Railroad");
        InsertTexture(10, "West Creek Pacific");
        InsertTexture(11, "Blandsville & Blankerston");
        InsertTexture(12, "JRN");
        InsertTexture(13, "JRN (Yellow Cab)");
    }
    public DieselSW1200(World world, double d, double d1, double d2){
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
        return "EMD SW1200";
    }



    


}
