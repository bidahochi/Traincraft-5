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

public class DieselGP7u extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7u;
    }
    public DieselGP7u(World world) {
        super(world, EnumTrains.GP7u.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF (Kodachrome)");
        InsertTexture(1, "ATSF (Freightbonnet)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Avanste Northeastern (Radio Equipped)");
        InsertTexture(4, "Avanste Northeastern (Yard)");
        InsertTexture(5, "Fox Union Rail Resources (FURRX)");
        InsertTexture(6, "OC&G 15");
        InsertTexture(7, "FNCC 210-213", LockoutGroup.FNCC);

    }
    public DieselGP7u(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.1, -0.35); }


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "EMD GP7u";
    }

    


    

}