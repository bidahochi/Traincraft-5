package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import com.jcirmodelsquad.tcjcir.models.trains.Model4ED172T;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class Diesel4ED172T extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.Diesel4ED172T; }

    public Diesel4ED172T(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "CEE 1950s Demo units");
        InsertTexture(1, "FMSR Late (FNCC Early)", LockoutGroup.FMSR);
        InsertTexture(2, "DLMR", LockoutGroup.DLMR);
        InsertTexture(3, "PAMC (Early)");
        InsertTexture(4, "Blandsville & Blankerston");
        InsertTexture(5, "Blandsville & Blankerston (Chop)");
        InsertTexture(6, "Southfield");
        InsertTexture(7, "NP (Lowey Green)");
        InsertTexture(8, "UP");
        InsertTexture(9, "CCRL");
        InsertTexture(10, "NSE");
        InsertTexture(11, "SER");
        InsertTexture(12, "");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() { return "CEE 4ED-172T"; }

    @Override
    public String transportYear() {
        return "1950-1953";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
                Diesel4ED172T.class,
                new Model4ED172T(),
                "4ED-172T_",
                new float[]{-1.45F, 0.155F, 0F},
                new float[] { 0F, 180F, 180F },
                null,
                "smoke",
                new ArrayList<double[]>()
                {
                    {
                        add(new double[]{0.45D, 1.32D, 0.0D});
                    }
                },
                "", null, 4, 0)
        );
    }
}
