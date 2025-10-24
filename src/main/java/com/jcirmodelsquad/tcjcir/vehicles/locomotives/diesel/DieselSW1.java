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

//haha sw1 go brrrr
public class DieselSW1 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1;
    }
    public DieselSW1(World world) {
        super(world, EnumTrains.SW1.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "MILW");
        InsertTexture(1, "Seattle & North Coast 52");
        InsertTexture(2, "Burlington Northern 91");
        InsertTexture(3, "ARR (Early)");
        InsertTexture(4, "ARR (Later)");
        InsertTexture(5, "WP");
        InsertTexture(6, "WP");
        InsertTexture(7, "Magnolia");
        InsertTexture(8, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(9, "DLMR");
        InsertTexture(10, "DLMR");
        InsertTexture(11, "POOP TRAIN RAILROAD");
        InsertTexture(12, "NEP");
        InsertTexture(13, "NEP MOW");
        InsertTexture(14, "NYC");
        InsertTexture(15, "NYC");
        InsertTexture(16, "ur mom");
        InsertTexture(17, "Deadwood & Northern (Ex FMSR)");
        InsertTexture(18, "FMSR", LockoutGroup.FMSR);
        InsertTexture(19, "Pacific Electric / SP");
        InsertTexture(20, "Sacramento Northern / WP");
        InsertTexture(21, "FRLC");
    }
    public DieselSW1(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.15, 0.2, -0.35); }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "EMD SW1";
    }

    


    

}
