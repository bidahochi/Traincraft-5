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


public class DieselES44 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselES44;
    }
    public DieselES44(World world) {
        super(world, EnumTrains.ES44.getTankCapacity(), LiquidManager.dieselFilter());
        
        //i think i need a scooby doo tie-fighter now
        InsertTexture(0, "Evolution Series Demonstrator");
        InsertTexture(1, "BNSF (H2)");
        InsertTexture(2, "BNSF (H3)");
        InsertTexture(3, "Canadian Pacific");
        InsertTexture(4, "Union Pacific");
        InsertTexture(5, "Savatrans");
        InsertTexture(6, "CitiRail");
        InsertTexture(7, "Canadian National (CN)");
        InsertTexture(8, "Norfolk Southern (NS)");
        InsertTexture(9, "Blandsville & Blankerston");
        InsertTexture(10, "CSXT");
        InsertTexture(11, "Kansas City Southern");
        InsertTexture(12, "Cemex");
        InsertTexture(13, "Ferromex");
        InsertTexture(14, "LMX");
        InsertTexture(15, "LMX");
        InsertTexture(16, "IAIS");
        InsertTexture(17, "GLNT");
        InsertTexture(18, "Ann Arbor");
    }
    public DieselES44(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.9, 0.4, -0.35); }
    



    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "GE ES44";
    }






}
