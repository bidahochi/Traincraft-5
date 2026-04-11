package train.client.render.register;

import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.common.api.AbstractTrains;

public interface ITrainRenderRecord
{
    String GetModID();

    Class<? extends AbstractTrains> getEntityClass();

    ModelBase getModel();

    String getTexturePrefix();

    float[] getTrans();

    float[] getRotate();

    float[] getScale();

    /**
     * Get Resource Location
     * @param colorString color as string
     * @return the resource location
     */
    ResourceLocation getTextureFile(String colorString);


    SubTrainRenderRecord getSubTrainRenderRecord(short recordID);
}