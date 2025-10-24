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

public class DieselU30C extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU30C;
    }
    public DieselU30C(World world) {
        super(world, EnumTrains.U30C.getTankCapacity(), LiquidManager.dieselFilter());//its like magic guys trust me

        InsertTexture(0, "Burlington Northern 5344");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(3, "Southern Pacific");
        InsertTexture(4, "Rock Island");
        InsertTexture(5, "Deadwood & La Mesa");
        InsertTexture(6, "West Creek Pacific");
        InsertTexture(7, "Boston & Maine 663 (Guilford)");
        InsertTexture(8, "AGW");
        InsertTexture(9, "GCM");
        InsertTexture(10, "Chicago and North Western");
        InsertTexture(11, "CSXT (Stealth)");
        InsertTexture(12, "CSXT (Bluedown)");
        InsertTexture(13, "Seaboard System");
        InsertTexture(14, "Chessie System");
    }
    public DieselU30C(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.6, 0.3, -0.35); }


    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.65F;
    }



    @Override
    public String getInventoryName() {
        return "GE U30C";
    }

    

    
    

}
