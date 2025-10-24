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

public class DieselU18Balt extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU18Balt;
    }
    public DieselU18Balt(World world) {
        super(world, EnumTrains.U18Balt.getTankCapacity(), LiquidManager.dieselFilter());
        

        InsertTexture(0, "PW (Late Orange & Brown)");
        InsertTexture(1, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(2, "FCOM (Ex FNCC)");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "SV 402", LockoutGroup.BIDA);
        InsertTexture(5, "SV 406", LockoutGroup.BIDA);
        InsertTexture(6, "SV 1801", LockoutGroup.BIDA);
        InsertTexture(7, "Grassland Laboratories");
        InsertTexture(8, "GCM");
        InsertTexture(9, "CSXT (Stealth)");
        InsertTexture(10, "CSXT (Blue Stripe)");
        InsertTexture(11, "CSXT (Blue Down)");
        InsertTexture(12, "CSXT (Yn1)");
        InsertTexture(13, "CSXT (Yn2)");
        InsertTexture(14, "CSXT (MoW)");
        InsertTexture(15, "Pickens Railway");
        InsertTexture(16, "Seaboard Coast Line");
        InsertTexture(17, "Family Lines (SCL)");
        InsertTexture(18, "Seaboard System");
    }
    public DieselU18Balt(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.6, 0.25, -0.35); }




    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }



    @Override
    public String getInventoryName() {
        return "GE U18B (New Model)";
    }






}
