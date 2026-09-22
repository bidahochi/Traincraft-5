package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractTankSlug;
import train.common.enums.LockoutGroup;


public class SBMS extends AbstractTankSlug
{

    public SBMS(World world)
    {
        super(world);
        InsertTexture(0, "FNCC", LockoutGroup.FNCC);
        InsertTexture(1, "WP");
        InsertTexture(2, "Blandsville & Blasic i mean Blankerston");
        InsertTexture(3, "TTLC (Burnt Forest Black)");
        InsertTexture(4, "TTLC (Cedar Blue)");
        InsertTexture(5, "TTLC (Cedar Green)");
        InsertTexture(6, "TTLC (Evergreen)");
        InsertTexture(7, "TTLC (Fern)");
        InsertTexture(8, "TTLC (Fern Green)");
        InsertTexture(9, "TTLC (Fir Green)");
        InsertTexture(10, "TTLC (Jungle Green)");
        InsertTexture(11, "TTLC (Pine Green)");
        InsertTexture(12, "TTLC (Red Forest Brown)");
        InsertTexture(13, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(14, "UPNS haha lol just kidding its just regular NS");
    }

    @Override
    public String getInventoryName() {
        return "CEE SB Motor System";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.9F;
    }

    @Override
    public boolean isFictional(){
        return true;
    }


}