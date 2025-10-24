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

public class DieselH1044 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselH1044;
    }
    public DieselH1044(World world) {
        super(world, EnumTrains.H1044.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Hallet Dock Company");
        InsertTexture(1, "Union Pacific");
        InsertTexture(2, "Denver & Rio Grande");
        InsertTexture(3, "Frisco");
        InsertTexture(4, "ATSF (Zebra)");
        InsertTexture(5, "New York Central");
        InsertTexture(6, "Apache Railway");
        InsertTexture(7, "The Milwaukee Road");
        InsertTexture(8, "Garry (The First FURRX Unit)", LockoutGroup.BIDA);
        InsertTexture(9, "Chicago Northwestern");
        InsertTexture(10, "Illinois Harbor Belt");
        InsertTexture(11, "Dee Dee Valley Railroad");

    }
    public DieselH1044(World world, double d, double d1, double d2) {
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.3, 0.1, -0.45); }



    



    @Override
    public String getInventoryName() {
        return "FM H10-44";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1.1F);
    }
    

    


    

}