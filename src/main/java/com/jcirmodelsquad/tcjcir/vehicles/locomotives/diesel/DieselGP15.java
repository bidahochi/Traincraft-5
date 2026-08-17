package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP15 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp15")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "rear_marker_body_391", "rear_marker_body_392")
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_178", "marker_body_179", "marker_body_189",
            "marker_body_190", "marker_nose")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_24", "numberboard_body_25", "numberboard_body_91",
            "numberboard_body_92")
        .build();

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.DieselGP15;
	}
	public DieselGP15(World world) {
		super(world, LiquidManager.dieselFilter());
		
		InsertTexture(0, "UPY");
		InsertTexture(1, "FURRX"); // (old nasty ass texture if i see this in game somewhjer i will kill you)
		InsertTexture(2, "Lisha & Watson", LockoutGroup.LW);
		InsertTexture(3, "Atlas & Red Sands Railroad", LockoutGroup.BIDA);
		InsertTexture(4, "Southern Port Belt");
		InsertTexture(5, "GLC (Ex SPB)");
		InsertTexture(6, "CSXT (Yn3)");
		InsertTexture(7, "CSXT (Ex-Conrail)");
		InsertTexture(8, "Conrail (As Delivered)");
		InsertTexture(9, "Conrail (Post-93)");
		InsertTexture(10, "Conrail (OLS)");
		InsertTexture(11, "Conrail (Just Do It Boston Marathon Unit");
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = 2.5;
		double yOffset = 0.2;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
		if(side.isServer()){
			rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
			rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
			anglePitchClient = serverRealPitch*60;
		}
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + yOffset);
		float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1* distance));
		if(anglePitchClient>20 && rotationCos1 == 1){
			bogieX1 -= pitchRads * 2;
			pitch-=pitchRads*1.2;
		}
		if(anglePitchClient>20 && rotationSin1 == 1){
			bogieZ1 -= pitchRads * 2;
			pitch-=pitchRads*1.2;
		}
		if (pitchRads == 0.0) {
			riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
		}
		if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
		}
	}

	@Override
	public String getInventoryName() {
		return "EMD GP15-1";
	}

	@Override
	public String transportYear() {
		return "1976-1982";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.0F);
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}