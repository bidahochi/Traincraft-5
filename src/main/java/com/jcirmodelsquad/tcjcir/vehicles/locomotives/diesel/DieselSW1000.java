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


public class DieselSW1000 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1000;
    }
    public DieselSW1000(World world) {
        super(world, EnumTrains.SW1000.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Burlington Northern");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(3, "Rio Grande");
        InsertTexture(4, "Nomansi and Eastern Pacific");
        InsertTexture(5, "Southern Peenor Belt");
        InsertTexture(6, "Southern Port Belt (BN Patch)");
        InsertTexture(7, "Thunder Valley Transportation District (Falcon Area Rapid Transit)");
        InsertTexture(8, "ANW");
        InsertTexture(9, "ANW (Chevrons)");
    }
    public DieselSW1000(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.1, 0.3, -0.35); }








    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.175F;
    }



    @Override
    public String getInventoryName() {
        return "EMD SW1000";
    }






}
