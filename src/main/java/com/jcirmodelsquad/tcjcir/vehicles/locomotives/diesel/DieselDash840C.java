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

public class DieselDash840C extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash840C;
    }
    public DieselDash840C(World world) {
        super(world, EnumTrains.Dash840C.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Union Pacific (ITS A SPECTRUM ITS OKAY)");
        InsertTexture(1, "CSXT (Grey Ghost)");
        InsertTexture(2, "CSXT (YN2)");
        InsertTexture(3, "CSXT (YN3)");
        InsertTexture(4, "CSXT (JCIR 6th Anniversary)");
        InsertTexture(5, "CSXT (Ex-SPB)");
        InsertTexture(6, "Conrail");
        InsertTexture(7, "Southern Port Belt");
        InsertTexture(8, "Blandsville & Blankerston");
        InsertTexture(9, "Morristown Tenneva & Southern");
        InsertTexture(10, "FURRX");
        InsertTexture(11, "GCM");
    }
    public DieselDash840C(World world, double d, double d1, double d2){
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }



    @Override
    public String getInventoryName() {
        return "GE C40-8";
    }

    


    

}
