package train.client.render.register;

import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        subTrainRenderRecords = null;
    }

    /**
     * Uses for Diseal or steam locomotives.
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
        this.hasSmoke = smokeType != null && smokeType.length() > 0;
        this.hasExplosion = explosionType != null && explosionType.length() > 0;
        subTrainRenderRecords = new HashMap<>();
        subTrainRenderRecords.put((short) 0, new SubTrainRenderRecord(smokeType, smokeFX, explosionType, explosionFX, (short)smokeIterations, (short)explosionFXIterations));
    }

    /**
     * Used to add alternative smoke and explosion positions for specific locomotives.
     * Only insert a record if your trying to override a locomotive from the default record.
     * ONLY USED FOR LOCOMOTIVES
     */
    public TrainRenderRecord AddSubTrainRenderRecord(HashMap<Short, SubTrainRenderRecord> recordsToInsert)
    {
        if (subTrainRenderRecords == null)
        {
            Traincraft.tcLog.fatal("ERROR: ATTEMPTED TO INSERT RENDER RECORD INTO NON LOCOMOTIVE RENDER RECORD");
        }

        for (Map.Entry<Short, SubTrainRenderRecord> entry : recordsToInsert.entrySet())
        {
            if (entry.getKey() == 0 || subTrainRenderRecords.containsKey(entry.getKey()))
            {
                Traincraft.tcLog.fatal("ERROR: ATTEMPTED TO OVERRIDE RENDER RECORD MUST MODIFY ITS ORIGINAL ID:" + entry.getKey());
            }

            subTrainRenderRecords.put(entry.getKey(), entry.getValue());
        }

        return this;
    }

    public TrainRenderRecord AddSubTrainRenderRecord(int skinNumber, SubTrainRenderRecord recordsToInsert)
    {
        if (subTrainRenderRecords == null)
        {
            Traincraft.tcLog.fatal("ERROR: ATTEMPTED TO INSERT RENDER RECORD INTO NON LOCOMOTIVE RENDER RECORD");
        }

        if (skinNumber == 0 || subTrainRenderRecords.containsKey(skinNumber))
        {
            Traincraft.tcLog.fatal("ERROR: ATTEMPTED TO OVERRIDE RENDER RECORD MUST MODIFY ITS ORIGINAL ID:" + skinNumber);
        }

        subTrainRenderRecords.put((short)skinNumber, recordsToInsert);

        return this;
    }

    private final Class<? extends AbstractTrains> entityClass;
    private ModelBase model;
    /**
     * Must name your folder this and your texture must start with this.
     */
    private final String texturePrefix;

    private final HashMap<Short, SubTrainRenderRecord> subTrainRenderRecords;

    private float[] trans;
    private float[] rotate;
    private float[] scale;
    private boolean hasSmoke;
    private boolean hasExplosion;

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
    public SubTrainRenderRecord getSubTrainRenderRecord(short record)
    {
        if (subTrainRenderRecords == null)
        {
            return new SubTrainRenderRecord();
        }

        if (record > 0
                && subTrainRenderRecords.size() > 1
                && subTrainRenderRecords.containsKey(record))
        {
            return subTrainRenderRecords.get(record);
        }

        return subTrainRenderRecords.get((short) 0);
    }
}
