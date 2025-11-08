package fexcraft.fvtm;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.FVTMFormatBase;
import tmt.Tessellator;
import tmt.Vec3f;

import java.util.LinkedList;

public class BOBRollingStockModel extends FVTMFormatBase {

    private FVTMFormatBase model;
    private LinkedList<FVTMFormatBase> details;
    private LinkedList<Vec3f> detailPositions;
    private LinkedList<Vec3f> detailRotations;
    private LinkedList<Vec3f> detailScales;
    private LinkedList<ResourceLocation> detailTextures;

    public BOBRollingStockModel(String modID, String modelLocation, boolean[] rotationFixes) throws Exception {
        model = BEOModelLoader.loadModel(modID + ":" + modelLocation);
        for (FVTMFormatBase.TurboList l : model.groups) {
            tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
            l.toArray(arr);
            model.fixRotation(arr, rotationFixes);
        }
        details = new LinkedList<>();
        detailPositions = new LinkedList<>();
        detailRotations = new LinkedList<>();
        detailTextures = new LinkedList<>();
        detailScales = new LinkedList<>();
    }

    public BOBRollingStockModel(FVTMFormatBase model, boolean[] rotationFixes) {
        this.model = model;
        for (FVTMFormatBase.TurboList l : this.model.groups) {
            tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
            l.toArray(arr);
            this.model.fixRotation(arr, rotationFixes);
        }
        details = new LinkedList<>();
        detailPositions = new LinkedList<>();
        detailRotations = new LinkedList<>();
        detailTextures = new LinkedList<>();
    }

    public BOBRollingStockModel addDetail(String modID, String path, String texture, Vec3f position, Vec3f rotation, Vec3f scale) throws Exception {
        details.add(BEOModelLoader.loadModel(modID + ":" + path));
        detailPositions.add(position);
        detailRotations.add(rotation);
        if (texture != null) {
            detailTextures.add(new ResourceLocation(modID, texture));
        } else {
            detailTextures.add(null);
        }
        return this;
    }

    public BOBRollingStockModel addDetail(String modID, FVTMFormatBase bogie, String texture, Vec3f position, Vec3f rotation, Vec3f scale) throws Exception {
        details.add(bogie);
        detailPositions.add(position);
        detailRotations.add(rotation);
        detailScales.add(scale);
        if (texture != null) {
            detailTextures.add(new ResourceLocation(modID, texture));
        } else {
            detailTextures.add(null);
        }
        return this;
    }

    public BOBRollingStockModel addDetail(String modID, String path, ResourceLocation texture, Vec3f position, Vec3f rotation, Vec3f scale) throws Exception {
        details.add(BEOModelLoader.loadModel(modID + ":" + path));
        detailPositions.add(position);
        detailRotations.add(rotation);
        detailTextures.add(texture);
        return this;
    }

    public BOBRollingStockModel addDetail(FVTMFormatBase bogie, ResourceLocation texture, Vec3f position, Vec3f rotation, Vec3f scale) throws Exception {
        details.add(bogie);
        detailPositions.add(position);
        detailRotations.add(rotation);
        detailScales.add(scale);
        detailTextures.add(texture);
        return this;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        model.render(entity, f, f1, f2, f3, f4, f5);
        for (int i = 0; i < details.size(); i++) {
            GL11.glPushMatrix();
            if (detailTextures.size() > i && detailTextures.get(i) != null) {
                Tessellator.bindTexture(detailTextures.get(i));
            }
            if (detailScales.size() > i && detailScales.get(i) != null) {
                GL11.glScalef(detailScales.get(i).xCoord, detailScales.get(i).yCoord, detailScales.get(i).zCoord);
            }
            if (detailPositions.size() > i && detailPositions.get(i) != null) {
                GL11.glTranslatef(detailPositions.get(i).xCoord, detailPositions.get(i).yCoord, detailPositions.get(i).zCoord);
            }
            if (detailRotations.size() > i && detailRotations.get(i) != null) {
                GL11.glRotatef(detailRotations.get(i).xCoord, 1, 0 ,0);
                GL11.glRotatef(detailRotations.get(i).yCoord, 0, 1 ,0);
                GL11.glRotatef(detailRotations.get(i).zCoord, 0, 0 ,1);
            }
            details.get(i).render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        }

    }
}
