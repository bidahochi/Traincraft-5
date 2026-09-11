package train.client.render;

import com.jcirmodelsquad.tcjcir.render.models.ModelMILWSwitchStandOff;
import com.jcirmodelsquad.tcjcir.render.models.ModelMILWSwitchStandOn;
import com.jcirmodelsquad.tcjcir.render.models.ModelRacor36D_Off;
import com.jcirmodelsquad.tcjcir.render.models.ModelRacor36D_On;
import com.jcirmodelsquad.tcjcir.render.models.ModelRacor36H_Off;
import com.jcirmodelsquad.tcjcir.render.models.ModelRacor36H_On;
import com.jcirmodelsquad.tcjcir.render.models.ModelRacor36H_off2;
import com.jcirmodelsquad.tcjcir.render.models.ModelRacor36H_on2;
import com.jcirmodelsquad.tcjcir.render.models.ModelautoSwitchOff;
import com.jcirmodelsquad.tcjcir.render.models.ModelautoSwitchOn;
import com.jcirmodelsquad.tcjcir.render.models.ModelcircleSwitchStandOff;
import com.jcirmodelsquad.tcjcir.render.models.ModelcircleSwitchStandOn;
import com.jcirmodelsquad.tcjcir.render.models.ModelowoSwitchStandOff;
import com.jcirmodelsquad.tcjcir.render.models.ModelowoSwitchStandOn;
import com.jcirmodelsquad.tcjcir.render.models.ModelowoYardSwitchStandOff;
import com.jcirmodelsquad.tcjcir.render.models.ModelowoYardSwitchStandOn;
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
