package fexcraft.fvtm;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.FVTMFormatBase;
import tmt.Tessellator;
import tmt.Vec3f;
import train.common.api.AbstractTrains;

import java.util.HashMap;
import java.util.LinkedList;

public class BOBRollingStockModel extends FVTMFormatBase {

    private final FVTMFormatBase model;
    private final HashMap<Integer, ModelDetailInformation> details = new HashMap<>();

    public BOBRollingStockModel(String modID, String modelLocation, boolean[] rotationFixes) {
        try {
            model = BEOModelLoader.loadModel(modID + ":" + modelLocation);
        for (FVTMFormatBase.TurboList l : model.groups) {
            tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
            l.toArray(arr);
            model.fixRotation(arr, rotationFixes);
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public BOBRollingStockModel(FVTMFormatBase model, boolean[] rotationFixes) {
        this.model = model;
        for (FVTMFormatBase.TurboList l : this.model.groups) {
            tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
            l.toArray(arr);
            this.model.fixRotation(arr, rotationFixes);
        }
    }


    public ModelDetailInformation getDetailInformation(int index) {
        if (details.get(index) != null) {
            return details.get(index);
        }
        else {
            ModelDetailInformation info = new ModelDetailInformation();
            details.put(index, info);
            return details.get(index);
        }
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        model.render(entity, f, f1, f2, f3, f4, f5);
        AbstractTrains train = (AbstractTrains) entity;
        ModelDetailInformation info = details.get(train.getColor() < details.size() ? train.getColor() : null);
        if (info == null) {
            info = details.get(0);
        }
        if (info == null) { return; }
        for (int i = 0; i < info.models.size(); i++) {
            GL11.glPushMatrix();
            if (info.textures.size() > i && info.textures.get(i) != null) {
                Tessellator.bindTexture(info.textures.get(i));
            }

            if (info.positions.size() > i && info.positions.get(i) != null) {
                GL11.glTranslatef(info.positions.get(i).xCoord, info.positions.get(i).yCoord, info.positions.get(i).zCoord);
            }

            if (info.scales.size() > i && info.scales.get(i) != null) {
                GL11.glScalef(info.scales.get(i).xCoord, info.scales.get(i).yCoord, info.scales.get(i).zCoord);
            }
            
            if (info.rotations.size() > i && info.rotations.get(i) != null) {
                GL11.glRotatef(info.rotations.get(i).xCoord, 1, 0, 0);
                GL11.glRotatef(info.rotations.get(i).yCoord, 0, 1 ,0);
                GL11.glRotatef(info.rotations.get(i).zCoord, 0, 0 ,1);
            }
            info.models.get(i).render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        }
    }
}
