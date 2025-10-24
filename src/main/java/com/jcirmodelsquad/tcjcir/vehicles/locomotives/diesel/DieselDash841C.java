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


public class DieselDash841C extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash841C;
    }
    public DieselDash841C(World world) {
        super(world, EnumTrains.Dash841C.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Canadian National");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "CSLX");
        InsertTexture(3, "WP (Early)");
        InsertTexture(4, "WP (Late)");
        InsertTexture(5, "WP (Rebuilt)");
        InsertTexture(6, "uhhhhhhhhhh peenor lol");
        InsertTexture(7, "Chicago and North Western");
    }
    public DieselDash841C(World world, double d, double d1, double d2){
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.34F;
    }
    
    @Override
    public String getInventoryName() {
        return "GE C41-8";
    }



}
