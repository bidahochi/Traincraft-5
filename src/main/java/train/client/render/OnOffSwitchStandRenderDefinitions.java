package train.client.render;

import com.jcirmodelsquad.tcjcir.render.models.*;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import train.client.render.models.ModelSwitchStandOff;
import train.client.render.models.ModelSwitchStandOn;
import train.common.library.Info;

/** Creates render definitions for the existing switch-stand skins. */
public final class OnOffSwitchStandRenderDefinitions
{
	private OnOffSwitchStandRenderDefinitions()
	{
	}

	/** Returns the original High Star switch-stand definition. */
	public static OnOffSwitchStandRenderDefinition highStar()
	{
		return new OnOffSwitchStandRenderDefinition(
				new ModelSwitchStandOff(), texture("switchStand_uv_draw_2.png"),
				new ModelSwitchStandOn(), texture("switchStand_uv_draw_1.png"),
				0.5D, 0.6D, 0.5D, 0.0D, 180.0D, 0.0D,
				transform(0.0D, 90.0D, 180.0D, 0.0D, 0.0D, 0.125D),
				transform(0.0D, 270.0D, 180.0D, 0.0D, 0.0D, -0.125D),
				transform(0.0D, 180.0D, 180.0D, 0.125D, 0.0D, 0.0D),
				transform(0.0D, 0.0D, 180.0D, -0.125D, 0.0D, 0.0D));
	}

	/** Returns the Racor 36D type-one definition. */
	public static OnOffSwitchStandRenderDefinition racor36DOne()
	{
		return createConvertedModelDefinition(new ModelRacor36D_On(), "Racor36D_1.png",
				new ModelRacor36D_Off(), "Racor36D_1.png", 0.1875D, 0.0D);
	}

	/** Returns the Racor 36D type-two definition. */
	public static OnOffSwitchStandRenderDefinition racor36DTwo()
	{
		return createConvertedModelDefinition(new ModelRacor36D_On(), "Racor36D_2.png",
				new ModelRacor36D_Off(), "Racor36D_2.png", 0.1875D, 0.0D);
	}

	/** Returns the Racor 36H definition. */
	public static OnOffSwitchStandRenderDefinition racor36H()
	{
		return createConvertedModelDefinition(new ModelRacor36H_On(), "Racor36H.png",
				new ModelRacor36H_Off(), "Racor36H.png", 0.1875D, 0.0D);
	}

	/** Returns the second Racor 36H definition. */
	public static OnOffSwitchStandRenderDefinition racor36HTwo()
	{
		return createConvertedModelDefinition(new ModelRacor36H_on2(), "Racor36H_2.png",
				new ModelRacor36H_off2(), "Racor36H_2.png", 0.1875D, 0.0D);
	}

	/** Returns the Owo yard switch-stand definition. */
	public static OnOffSwitchStandRenderDefinition owoYard()
	{
		return createConvertedModelDefinition(new ModelowoYardSwitchStandOn(), "owoyardswitchoff.png",
				new ModelowoYardSwitchStandOff(), "owoyardswitchoff.png", 0.1875D, 0.125D);
	}

	/** Returns the Milwaukee switch-stand definition. */
	public static OnOffSwitchStandRenderDefinition milwaukee()
	{
		return createConvertedModelDefinition(new ModelMILWSwitchStandOn(), "milwswitchon.png",
				new ModelMILWSwitchStandOff(), "milwswitchoff.png", 0.1875D, 0.125D);
	}

	/** Returns the circular-target switch-stand definition. */
	public static OnOffSwitchStandRenderDefinition circle()
	{
		return createConvertedModelDefinition(new ModelcircleSwitchStandOn(), "circleswitchon.png",
				new ModelcircleSwitchStandOff(), "circleswitchoff.png", 0.1875D, 0.125D);
	}

	/** Returns the Owo switch-stand definition. */
	public static OnOffSwitchStandRenderDefinition owo()
	{
		return createConvertedModelDefinition(new ModelowoSwitchStandOn(), "owoswitchon.png",
				new ModelowoSwitchStandOff(), "owoswitchoff.png", 0.1875D, 0.125D);
	}

	/** Returns the automatic switch-stand definition. */
	public static OnOffSwitchStandRenderDefinition automatic()
	{
		return createConvertedModelDefinition(new ModelautoSwitchOn(), "autoswitchon.png",
				new ModelautoSwitchOff(), "autoswitchoff.png", 0.1875D, 0.125D);
	}

	/** Returns the US&S M-22 switch stand definition. */
	public static OnOffSwitchStandRenderDefinition ussm22()
	{
		return createConvertedModelDefinition(new ModelUSSM22_On(), "USSM22.png",
				new ModelUSSM22_Off(), "USSM22.png", 0.1875D, 0.0D);
	}

	/** Returns the Racor 36D with US&S SL-21 lock switch stand definition. */
	public static OnOffSwitchStandRenderDefinition racor36D_sl21lock()
	{
		return createConvertedModelDefinition(new ModelRacor36D_3_On(), "Racor36D_SL21Lock.png",
				new ModelRacor36D_3_Off(), "Racor36D_SL21Lock.png", 0.1875D, 0.0D);
	}

	/** Returns the US&S TL-20 switch stand definition. */
	public static OnOffSwitchStandRenderDefinition usstl21nl()
	{
		return createConvertedModelDefinition(new ModelUSSTL21NL_On(), "USSTL21NL.png",
				new ModelUSSTL21NL_Off(), "USSTL21NL.png", 0.1875D, 0.0D);
	}

	/** Returns the US&S T-20 with SL-25 Lock switch stand definition. */
	public static OnOffSwitchStandRenderDefinition usst20wl()
	{
		return createConvertedModelDefinition(new ModelUSST20WL_On(), "USST20WL.png",
				new ModelUSST20WL_Off(), "USST20WL.png", 0.1875D, 0.0D);
	}

	/** Returns the US&S T-20 with SL-25 Lock switch stand definition. */
	public static OnOffSwitchStandRenderDefinition racor36d_b()
	{
		return createConvertedModelDefinition(new ModelRacor36D_B_On(), "Racor36D_B.png",
				new ModelRacor36D_B_Off(), "Racor36D_B.png", 0.1875D, 0.0D);
	}

	/** Returns the US&S T-20 with SL-25 Lock switch stand definition. */
	public static OnOffSwitchStandRenderDefinition racor36h_b()
	{
		return createConvertedModelDefinition(new ModelRacor36H_B_On(), "Racor36H_B.png",
				new ModelRacor36H_B_Off(), "Racor36H_B.png", 0.1875D, 0.0D);
	}
	/**
	 * Creates the shared cardinal transform used by the converted switch-stand models.
	 * Each caller still supplies its model-local correction because exported origins differ between skins.
	 *
	 * @param poweredModel model rendered while the stand provides power
	 * @param poweredTexture powered-state texture file name
	 * @param unpoweredModel model rendered while the stand does not provide power
	 * @param unpoweredTexture unpowered-state texture file name
	 * @param offsetX model-local X correction in blocks
	 * @param offsetZ model-local Z correction in blocks
	 * @return definition preserving the converted models' common authored axes
	 */
	private static OnOffSwitchStandRenderDefinition createConvertedModelDefinition(
			ModelBase poweredModel, String poweredTexture,
			ModelBase unpoweredModel, String unpoweredTexture, double offsetX, double offsetZ)
	{
		return new OnOffSwitchStandRenderDefinition(
				poweredModel, texture(poweredTexture), unpoweredModel, texture(unpoweredTexture),
				0.5D, 0.6D, 0.5D, 0.0D, 180.0D, 0.0D,
				transform(0.0D, 270.0D, 180.0D, offsetX, 0.0D, offsetZ),
				transform(0.0D, 90.0D, 180.0D, offsetX, 0.0D, offsetZ),
				transform(0.0D, 0.0D, 180.0D, offsetX, 0.0D, offsetZ),
				transform(0.0D, 180.0D, 180.0D, offsetX, 0.0D, offsetZ));
	}

	private static OnOffSwitchStandRenderDefinition.Transform transform(
			double rotationX, double rotationY, double rotationZ,
			double offsetX, double offsetY, double offsetZ)
	{
		return new OnOffSwitchStandRenderDefinition.Transform(
				rotationX, rotationY, rotationZ, offsetX, offsetY, offsetZ);
	}

	private static ResourceLocation texture(String fileName)
	{
		return new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + fileName);
	}
}
