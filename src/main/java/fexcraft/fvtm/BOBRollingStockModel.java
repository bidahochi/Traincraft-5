package fexcraft.fvtm;

import net.minecraft.client.Minecraft;
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

    public FVTMFormatBase getBaseModel() {
        return model;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        model.render(entity, f, f1, f2, f3, f4, f5);
        AbstractTrains train = (AbstractTrains) entity;
        if (((AbstractTrains) entity).getCargoManager() != null) {
            ((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
        }
        ModelDetailInformation info = details.get(train.getColor());
        if (info == null) {
            info = details.get(0);
        }
        if (info == null) {
            return;
        }
        int baseTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);

        for (int i = 0; i < info.models.size(); i++) {
            if (shouldSkipRender(entity, info, i)) {
                continue;
            }
            GL11.glPushMatrix();
            if (info.textures.size() > i && info.textures.get(i) != null) {
                Tessellator.bindTexture(info.textures.get(i));
            } else {
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, baseTexture);
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

    public static boolean shouldSkipRender(Entity entity, ModelDetailInformation info, int index) {
        switch (info.modelRenderMethod.get(info.models.get(index))) {
            case 1: {
                //if not the riding entity, or not in first person skip the model.
                return Minecraft.getMinecraft().thePlayer != entity.riddenByEntity || Minecraft.getMinecraft().gameSettings.thirdPersonView != 0;
            }
            case 2: {
                //if not in first person skip the model.
                return Minecraft.getMinecraft().gameSettings.thirdPersonView != 0;
            }
            case 3: {
                //if not the riding entity, or not in third person skip the model.
                return Minecraft.getMinecraft().thePlayer != entity.riddenByEntity || Minecraft.getMinecraft().gameSettings.thirdPersonView == 0;
            }
            case 4: {
                //if not in third person skip the model.
                return Minecraft.getMinecraft().gameSettings.thirdPersonView == 0;
            }
            case 5: {
                //if not in the car
                return Minecraft.getMinecraft().thePlayer == entity.riddenByEntity;
            }
            case 6: {
                //in the car
                return Minecraft.getMinecraft().thePlayer != entity.riddenByEntity;
            }
            case 7: {
                if (Minecraft.getMinecraft().thePlayer != entity.riddenByEntity) {
                    return false;
                }
                else return Minecraft.getMinecraft().gameSettings.thirdPersonView == 0;
            }
        }
        return false;
    }
}
