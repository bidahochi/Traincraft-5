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


public class DieselF7B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF7B;
    }
    public DieselF7B(World world) {
        super(world, EnumTrains.F7B.getTankCapacity(), LiquidManager.dieselFilter());
        
        //when the benis sus
        InsertTexture(0, "PC (Ex NYC)");
        InsertTexture(1, "Mesa Desert");
        InsertTexture(2, "DRGW (Black with yellow stripes)");
        InsertTexture(3, "DRGW (4 stripe)");
        InsertTexture(4, "DRGW (4 stripe, late)");
        InsertTexture(5, "DRGW (1 stripe)");
        InsertTexture(6, "Amtrak (Ex GN)");
        InsertTexture(7, "Amtrak (Ex NP)");
        InsertTexture(8, "Amtrak (Ex SP)");
        InsertTexture(9, "ATSF (Bluebonnet)");
        InsertTexture(10, "ATSF (As Delivered)");
        InsertTexture(11, "ATSF (Early)");
        InsertTexture(12, "ATSF (Rebuilt)");
        InsertTexture(13, "ATSF (Yellowbonnet)");
        InsertTexture(14, "Norfolk Southern");
        InsertTexture(15, "EMD Demonstrator");
        InsertTexture(16, "WM (Speed Lettering)");
        InsertTexture(17, "WM (Circus");
        InsertTexture(18, "CB&Q");
        InsertTexture(19, "CB&Q (Late)");
        InsertTexture(20, "MILW (Grey scheme)");
    }
    public DieselF7B(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.85, 0, 0.35); }

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.87F;
    }

    @Override
    public String getInventoryName() {
        return "EMD F7b";
    }

    

    
    

}
