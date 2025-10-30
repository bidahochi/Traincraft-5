package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class ElectricTwoBil extends ElectricTrain {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricTwoBil;
    }
    public ElectricTwoBil(World world) {
        super(world);
        InsertTexture(0, "SR");
        InsertTexture(1, "BR (Green)");
        InsertTexture(2, "BR (Green, Small Warning Panel)");
        InsertTexture(3, "BR (Green, Full Yellow Front)");
        InsertTexture(4, "BR (Blue, Small Warning Panel)");
        InsertTexture(5, "BR (Blue, Full Yellow Front)");
        InsertTexture(6, "CCRL (South Eastern Green)");
        InsertTexture(7, "CCRL");
    }

    
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.98, 0.0, 0.41); }


    
    @Override
    public String getInventoryName() {
        return "2-Bil Locomotive";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.2F;
    }


    
}