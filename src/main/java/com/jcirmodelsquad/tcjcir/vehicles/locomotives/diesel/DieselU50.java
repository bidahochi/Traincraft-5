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

public class DieselU50 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU50;
    }
    public DieselU50(World world) {
        super(world, EnumTrains.U50.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Union Pacific");
        InsertTexture(1, "Southern Pacific");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Southfield");
        InsertTexture(4, "Southfield De Mexico");
        InsertTexture(5, "Penn Central the objectively best railroad to own the U50 guys i swear PC owned like 30 of them trust me bro my source is that i MADE IT THE FUCK UP");
        InsertTexture(6, "hamburge helper rayroade");
    }
    public DieselU50(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5.3, 0.4, -0.3); }


    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.8F;
    }



    @Override
    public String getInventoryName() {
        return "GE U50";
    }

    


    

}
