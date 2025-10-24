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


public class DieselM640W extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM640W;
    }
    public DieselM640W(World world) {
        super(world, EnumTrains.M640W.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "COW");
        InsertTexture(1, "COW (Special)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Kingsland Rail");

    }
    public DieselM640W(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.75, 0.35, -0.4); }
    

    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }

    

    @Override
    public String getInventoryName() {
        return "MLW M640W";
    }



    


}
