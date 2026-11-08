package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.enums.LockoutGroup;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class EntityFreightLongCoveredHopper extends AbstractStandardFixedFreightCar {
	public EntityFreightLongCoveredHopper(World world) {
		super(world);
		initOverlayTextures();
		getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
				"Road Name",
				40, 6, null, EnumOverlayFonts.BapSansMid, 7f,  OTSpecificationDynamic.AlignmentMode.ALIGN_LEFT_AND_CLIP,
				new Point[]{ new Point(102, 31), new Point(201, 31) }
		));
		getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
				"Car Number",
				38, 6, null, EnumOverlayFonts.BapSansMid, 7f,  OTSpecificationDynamic.AlignmentMode.ALIGN_RIGHT_AND_CLIP,
				new Point[]{ new Point(142, 31), new Point(239, 31) }
		));
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(4, "Clearwater Lakes", LockoutGroup.CWL);
		InsertTexture(6, "Honex Lines");
		InsertTexture(7, "ANE");
		InsertTexture(8, "Siny Rails", LockoutGroup.SHINY);
	}

	@Override
	public String getInventoryName() {
		return "Long Covered Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.05F;
	}


	@Override
	public void onRenderInsertRecord()
	{
		train.common.Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new train.client.render.register.TrainRenderRecord(
						train.common.library.Info.modID,
						EntityFreightLongCoveredHopper.class,
						new train.client.render.models.ModelLongCoveredHopper(),
						"LongCoveredHopper_",
						new float[] { -1F, -0.25F, 0.65F },
						new float[] { 0F, 180F, 180F },
						null
				)
		);
	}
}