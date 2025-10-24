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


public class DieselCF7round3 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7round3;
    }
    public DieselCF7round3(World world) {
        super(world, EnumTrains.CF7round3.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(1, "FNCC (KIT-L, Ex ATSF, Dual Canon)", LockoutGroup.FNCC);
        InsertTexture(2, "FNCC (KIT-L, Ex ATSF, Dual Canon)", LockoutGroup.FNCC);
        InsertTexture(3, "Avanste Northeastern");
        InsertTexture(4, "Paradox Rail 69");
        InsertTexture(5, "Drexel Co");
        InsertTexture(6, "FURRX (EX CSWR)");
        InsertTexture(7, "West Creek Pacific");
        InsertTexture(8, "Marshwood Terminal");
        InsertTexture(9, "Lisha & Watson", LockoutGroup.LW);
        InsertTexture(10, "");
        InsertTexture(11, "");
        InsertTexture(12, "");
        InsertTexture(13, "");
    }
    public DieselCF7round3(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.2, -0.35); }




    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }



    @Override
    public String getInventoryName() {
        return "EMD CF7 Roundcab";
    }



    



}
