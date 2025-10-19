package train.client.render.register;

import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class TrainRenderRecord implements ITrainRenderRecord
{
    String modID;

    /**
     * Used for regular rollingstock
     * @param entityClass entityclass
     * @param model model
     * @param trans trans
     * @param rotate rotate
     * @param scale scale
     */
    public TrainRenderRecord(String modID,
                             Class<? extends AbstractTrains> entityClass, ModelBase model, String texturePrefix,
                             float[] trans, float[] rotate, float[] scale)
    {
        this.modID = modID;
        this.entityClass = entityClass;
        this.model = model;
        this.texturePrefix = texturePrefix;
        this.trans = trans;
        this.rotate = rotate;
        this.scale = scale;
        hasSmoke = false;
        hasExplosion = false;
    }

    /**
     * Uses for diseal or steam locomotives
     * @param entityClass
     * @param model
     * @param trans
     * @param rotate
     * @param scale
     */
    public TrainRenderRecord(String modID,
                             Class<? extends AbstractTrains> entityClass, ModelBase model, String texturePrefix,
                             float[] trans, float[] rotate, float[] scale,
                             String smokeType,
                             ArrayList<double[]> smokeFX,
                             String explosionType,
                             ArrayList<double[]> explosionFX,
                             int smokeIterations,
                             int explosionFXIterations)
    {
        this.modID = modID;
        this.entityClass = entityClass;
        this.model = model;
        this.texturePrefix = texturePrefix;
        this.trans = trans;
        this.rotate = rotate;
        this.scale = scale;
        this.smokeType = smokeType;
        this.smokeFX = smokeFX;
        this.explosionType = explosionType;
        this.explosionFX = explosionFX;
        this.smokeIterations = smokeIterations;
        this.explosionFXIterations = explosionFXIterations;
        this.hasSmoke = smokeType != null && smokeType.length() > 0;
        this.hasExplosion = explosionType != null && explosionType.length() > 0;

    }

    private final Class<? extends AbstractTrains> entityClass;
    private ModelBase model;
    /**
     * Must name your folder this and your texture must start with this.
     */
    private final String texturePrefix;

    private float[] trans;
    private float[] rotate;
    private float[] scale;
    private boolean hasSmoke;

    private String smokeType;
    private ArrayList<double[]> smokeFX;
    private boolean hasExplosion;
    private String explosionType;
    private ArrayList<double[]> explosionFX;
    private int smokeIterations;
    private int explosionFXIterations;

    public String GetModID()
    {
        return modID;
    }

    @Override
    public Class<? extends AbstractTrains> getEntityClass()
    {
        return entityClass;
    }

    @Override
    public ModelBase getModel()
    {
        return model;
    }

    @Override
    public String getTexturePrefix()
    {
        return texturePrefix;
    }

    @Override
    public boolean hasSmoke()
    {
        return hasSmoke;
    }

    @Override
    public String getSmokeType()
    {
        return smokeType;
    }

    @Override
    public ArrayList<double[]> getSmokeFX()
    {
        return smokeFX;
    }

    @Override
    public String getExplosionType()
    {
        return explosionType;
    }

    @Override
    public boolean hasExplosion()
    {
        return hasExplosion;
    }

    @Override
    public ArrayList<double[]> getExplosionFX()
    {
        return explosionFX;
    }

    @Override
    public float[] getTrans()
    {
        return trans;
    }

    @Override
    public float[] getRotate()
    {
        return rotate;
    }

    @Override
    public float[] getScale()
    {
        return scale;
    }

    @Override
    public ResourceLocation getTextureFile(String colorAsString)
    {
        return new ResourceLocation(GetModID(), Info.trainsPrefix + getTexturePrefix() + "/" + getTexturePrefix() + colorAsString + ".png");
    }

    @Override
    public int getSmokeIterations()
    {
        return smokeIterations;
    }

    @Override
    public int getExplosionFXIterations()
    {
        return explosionFXIterations;
    }
}
