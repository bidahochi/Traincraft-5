package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import com.jcirmodelsquad.tcjcir.features.TiltingHandler;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class AipkitExplorer extends AbstractPassengerCar
{
    public TiltingHandler tiltingHandler = new TiltingHandler(7);

    public AipkitExplorer(World world) {
        super(world);
    }

    @Override
    protected double getAdditionalYOffset()
    {
        return 0.2D;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer)
    {
        playerEntity = entityplayer;
        if (worldObj.isRemote) {
            ItemStack itemstack = entityplayer.inventory.getCurrentItem();
            if (itemstack != null) {
                if (itemstack.getItem() == Items.stick) {
                    //Toggle tilting.
                    if (tiltingHandler.tiltingDisabled) {
                        //Enable tilting.
                        tiltingHandler.tiltingDisabled = false;
                        playerEntity.addChatComponentMessage(new ChatComponentText("Tilting is enabled."));
                    } else {
                        tiltingHandler.tiltingDisabled = true;
                        playerEntity.addChatComponentMessage(new ChatComponentText("Tilting is disabled."));
                    }
                    return true;
                } else if (itemstack.getItem() == Items.blaze_rod) {
                    //Test tilting.
                    if (tiltingHandler.testTilting) {
                        //Enable tilting.
                        tiltingHandler.testTilting = false;
                        playerEntity.addChatComponentMessage(new ChatComponentText("Stationary Tilt Mode activated."));
                    } else {
                        tiltingHandler.testTilting = true;
                        playerEntity.addChatComponentMessage(new ChatComponentText("Stationary Tilt Mode deactivated."));
                    }

                    return true;
                }
            }
        }

        return super.interactFirst(entityplayer);
    }
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (worldObj.isRemote) {
            tiltingHandler.handleTilting(this);
        }
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.5F;
    }
}
