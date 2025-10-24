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

public class DieselSW10 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW10;
    }
    public DieselSW10(World world) {
        super(world, EnumTrains.SW10.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "UP");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "North Fox (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(3, "North Fox (DAR80)", LockoutGroup.FNCC);
        InsertTexture(4, "TIR 1248 & 1253");
        InsertTexture(5, "TIR 1269");
        InsertTexture(6, "Glonch Rayroa");
        InsertTexture(7, "Anning my Arbor so good rn");

    }
    public DieselSW10(World world, double d, double d1, double d2){
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
        return "EMD/UP SW10";
    }

    




}
