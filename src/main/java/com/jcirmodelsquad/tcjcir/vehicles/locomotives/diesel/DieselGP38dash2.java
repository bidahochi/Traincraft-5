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

public class DieselGP38dash2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP38dash2;
    }
    public DieselGP38dash2(World world) {
        super(world, EnumTrains.GP38Dash2.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Butte, Anaconda & Pacific");
        InsertTexture(1, "MKT (Stripes)");
        InsertTexture(2, "MKT (Solids)");
        InsertTexture(3, "Norfolk Southern (Ex-Sou)");
        InsertTexture(4, "Norfolk Southern");
        InsertTexture(5, "Southern Port Belt");
        InsertTexture(6, "Southern Port Belt (NS Patch)");
        InsertTexture(7, "Milwaukee Road");
        InsertTexture(8, "Milwaukee Road (Billboard)");
        InsertTexture(9, "GLC (Cigar Band)");
        InsertTexture(10, "GLC (Ex SPB)");
        InsertTexture(11, "GLC (Ex NS)");
        InsertTexture(12, "CSXT (Yn3)");
        InsertTexture(13, "CSXT (Yn2)");
        InsertTexture(14, "Seaboard System");
        InsertTexture(15, "");
        InsertTexture(16, "");
        InsertTexture(17, "");
        InsertTexture(18, "");
        InsertTexture(19, "");
        InsertTexture(20, "");
    }
    public DieselGP38dash2(World world, double d, double d1, double d2){
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
        return "EMD GP38-2";
    }



    


}
