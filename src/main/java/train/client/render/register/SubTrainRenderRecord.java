package train.client.render.register;

import java.util.ArrayList;

public class SubTrainRenderRecord implements ISubTrainRenderRecord
{
    private String SmokeType;
    private ArrayList<double[]> SmokeFX;
    private short ExplosionFXIterations;


    private String ExplosionType;
    private ArrayList<double[]> ExplosionFX;

    private short SmokeIterations;
    public String getSmokeType()
    {
        return SmokeType;
    }
    public ArrayList<double[]> getSmokeFX()
    {
        return SmokeFX;
    }
    public String getExplosionType()
    {
        return ExplosionType;
    }
    public ArrayList<double[]> getExplosionFX()
    {
        return ExplosionFX;
    }

    private boolean hasSmoke;
    private boolean hasExplosions;

    public boolean hasSmoke() { return hasSmoke; }
    public boolean hasExplosions() { return hasExplosions; }

    public int getExplosionFXIterations()
    {
        return ExplosionFXIterations;
    }

    public int getSmokeIterations() { return SmokeIterations; }

    public SubTrainRenderRecord(String smokeType, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, short smokeIterations, short explosionFXIterations)
    {
        SmokeType = smokeType;
        SmokeFX = smokeFX;
        ExplosionType = explosionType;
        ExplosionFX = explosionFX;
        SmokeIterations = smokeIterations;
        ExplosionFXIterations = explosionFXIterations;
        hasSmoke = smokeFX != null && smokeFX.size() > 0;
        hasExplosions = explosionFX != null && explosionFX.size() > 0;
    }

    public SubTrainRenderRecord()
    {
        hasSmoke = false;
        hasExplosions = false;
        SmokeFX = null;
        ExplosionFX = null;
    }

    public SubTrainRenderRecord setSmokeType(String smokeType)
    {
        SmokeType = smokeType;
        return this;
    }

    public SubTrainRenderRecord setExplosionType(String explosionType)
    {
        ExplosionType = explosionType;
        return this;
    }

    public SubTrainRenderRecord setSmokeIterations(int smokeIterations)
    {
        SmokeIterations = (short)smokeIterations;
        return this;
    }

    public SubTrainRenderRecord setExplosionFXIterations(int explosionFXIterations)
    {
        ExplosionFXIterations = (short)explosionFXIterations;
        return this;
    }

    public SubTrainRenderRecord addSmokePos(double x, double y, double z)
    {
        hasSmoke = true;
        if (getSmokeFX() == null)
        {
            SmokeFX = new ArrayList<double[]>();
        }
        getSmokeFX().add(new double[] { x, y, z});
        return this;
    }

    public SubTrainRenderRecord addExplosionFX(double x, double y, double z)
    {
        hasExplosions = true;
        if (getExplosionFX() == null)
        {
            ExplosionFX = new ArrayList<double[]>();
        }
        getExplosionFX().add(new double[] { x, y, z});
        return this;
    }
}
