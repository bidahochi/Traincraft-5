package train.common.library;

import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.common.api.AbstractTrains;

import java.util.ArrayList;

public interface ITrainRenderRecord
{

    Class<? extends AbstractTrains> getEntityClass();

    ModelBase getModel();

    boolean hasSmoke();

    String getSmokeType();

    ArrayList<double[]> getSmokeFX();

    String getExplosionType();

    boolean hasExplosion();

    ArrayList<double[]> getExplosionFX();

    float[] getTrans();

    float[] getRotate();

    float[] getScale();

    /**
     * Get Resource Location
     * @param colorString color as string
     * @return the resource location
     */
    ResourceLocation getTextureFile(String colorString);

    int getSmokeIterations();

    int getExplosionFXIterations();
}