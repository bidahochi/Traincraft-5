package fexcraft.fvtm;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.FVTMFormatBase;
import tmt.Tessellator;
import tmt.Vec3f;
import train.common.api.AbstractTrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
 * BOB rolling stock is a base FVTM/BOB model plus optional detail models selected
 * by paint/color, view mode, and CargoManager state. The base model is the main
 * shell; the detail list can contain repeated local submodels such as bogies,
 * pantographs, or skin-specific kits that are placed with their own translate,
 * scale, and rotate values.
 */
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
        /*
         * Render order matters here. The base FVTM model renders first, then
         * CargoManager-owned pieces, then the active paint/color detail set. We
         * remember the texture that is bound at the start of detail rendering so
         * a detail without its own texture can restore the caller-visible texture
         * state.
         */
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
        boolean[] handledDetails = renderRepeatedDetails(entity, info, baseTexture, f, f1, f2, f3, f4, f5);

        for (int i = 0; i < info.models.size(); i++) {
            if (handledDetails[i] || shouldSkipRender(entity, info, i)) {
                continue;
            }
            renderDetail(entity, info, i, baseTexture, f, f1, f2, f3, f4, f5, false, 0);
        }
    }

    private boolean[] renderRepeatedDetails(Entity entity, ModelDetailInformation info, int baseTexture, float f, float f1, float f2, float f3, float f4, float f5) {
        /*
         * Details often reuse the same FVTM model more than once, for example a
         * front and rear bogie. If the repeated details share the same model,
         * texture, and scale value, the batcher can cache that local model shape
         * once and replay it for each placement. Translation and rotation stay in
         * the placement list; scale is also applied there, although this grouping
         * currently requires matching scale values before details share one layout
         * batch.
         */
        boolean[] handled = new boolean[info.models.size()];
        for (int i = 0; i < info.models.size(); i++) {
            if (handled[i] || shouldSkipRender(entity, info, i)) {
                continue;
            }
            FVTMFormatBase model = info.models.get(i);
            int placements = countCompatibleDetailPlacements(entity, info, i);
            if (placements < 2) {
                continue;
            }
            bindDetailTexture(info, i, baseTexture);
            List<Integer> layoutIndexes = new ArrayList<Integer>();
            List<tmt.ModelRendererTurboBatch.DetailPlacement> layoutPlacements = new ArrayList<tmt.ModelRendererTurboBatch.DetailPlacement>();
            for (int j = i; j < info.models.size(); j++) {
                if (!handled[j] && isCompatibleDetailPlacement(entity, info, i, j)) {
                    layoutIndexes.add(j);
                    layoutPlacements.add(createDetailPlacement(info, j));
                }
            }
            if (tmt.ModelRendererTurboBatch.renderFVTMDetailLayout(model, model.groups, f5, false, layoutPlacements)) {
                for (Integer index : layoutIndexes) {
                    handled[index] = true;
                }
            }
            else {
                boolean recordLayout = true;
                for (Integer index : layoutIndexes) {
                    renderDetail(entity, info, index, baseTexture, f, f1, f2, f3, f4, f5, true, placements, recordLayout);
                    recordLayout = false;
                    handled[index] = true;
                }
            }
        }
        return handled;
    }

    private tmt.ModelRendererTurboBatch.DetailPlacement createDetailPlacement(ModelDetailInformation info, int index) {
        Vec3f position = info.positions.size() > index ? info.positions.get(index) : null;
        Vec3f scale = info.scales.size() > index ? info.scales.get(index) : null;
        Vec3f rotation = info.rotations.size() > index ? info.rotations.get(index) : null;
        return new tmt.ModelRendererTurboBatch.DetailPlacement(position, scale, rotation);
    }

    private int countCompatibleDetailPlacements(Entity entity, ModelDetailInformation info, int sourceIndex) {
        int count = 0;
        for (int i = sourceIndex; i < info.models.size(); i++) {
            if (isCompatibleDetailPlacement(entity, info, sourceIndex, i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isCompatibleDetailPlacement(Entity entity, ModelDetailInformation info, int sourceIndex, int candidateIndex) {
        /*
         * Only details with the same batch inputs can share one layout batch.
         * Different positions and rotations are safe because each placement keeps
         * its own transform, but different models, textures, scales, or
         * view filters must render through their own path.
         */
        if (shouldSkipRender(entity, info, candidateIndex)) {
            return false;
        }
        return info.models.get(sourceIndex) == info.models.get(candidateIndex)
                && sameTexture(info, sourceIndex, candidateIndex)
                && sameScale(info, sourceIndex, candidateIndex);
    }

    private boolean sameTexture(ModelDetailInformation info, int first, int second) {
        ResourceLocation firstTexture = info.textures.size() > first ? info.textures.get(first) : null;
        ResourceLocation secondTexture = info.textures.size() > second ? info.textures.get(second) : null;
        return firstTexture == null ? secondTexture == null : firstTexture.equals(secondTexture);
    }

    private boolean sameScale(ModelDetailInformation info, int first, int second) {
        Vec3f firstScale = info.scales.size() > first ? info.scales.get(first) : null;
        Vec3f secondScale = info.scales.size() > second ? info.scales.get(second) : null;
        if (firstScale == null || secondScale == null) {
            return firstScale == secondScale;
        }
        return firstScale.xCoord == secondScale.xCoord && firstScale.yCoord == secondScale.yCoord && firstScale.zCoord == secondScale.zCoord;
    }

    private void renderDetail(Entity entity, ModelDetailInformation info, int index, int baseTexture, float f, float f1, float f2, float f3, float f4, float f5, boolean useLayoutBatch, int layoutPlacements) {
        renderDetail(entity, info, index, baseTexture, f, f1, f2, f3, f4, f5, useLayoutBatch, layoutPlacements, true);
    }

    private void renderDetail(Entity entity, ModelDetailInformation info, int index, int baseTexture, float f, float f1, float f2, float f3, float f4, float f5, boolean useLayoutBatch, int layoutPlacements, boolean recordLayout) {
        /*
         * This is the single-detail fallback and also the per-placement path used
         * when a layout batch is being built. The push/pop pair keeps the detail's
         * placement transform local so the next detail, bogie, or body section
         * starts from the same GL matrix state as the per-part renderer.
         */
        GL11.glPushMatrix();
        if (!useLayoutBatch) {
            bindDetailTexture(info, index, baseTexture);
        }

        if (info.positions.size() > index && info.positions.get(index) != null) {
            GL11.glTranslatef(info.positions.get(index).xCoord, info.positions.get(index).yCoord, info.positions.get(index).zCoord);
        }

        if (info.scales.size() > index && info.scales.get(index) != null) {
            GL11.glScalef(info.scales.get(index).xCoord, info.scales.get(index).yCoord, info.scales.get(index).zCoord);
        }

        if (info.rotations.size() > index && info.rotations.get(index) != null) {
            GL11.glRotatef(info.rotations.get(index).xCoord, 1, 0, 0);
            GL11.glRotatef(info.rotations.get(index).yCoord, 0, 1 ,0);
            GL11.glRotatef(info.rotations.get(index).zCoord, 0, 0 ,1);
        }
        if (useLayoutBatch && tmt.ModelRendererTurboBatch.renderFVTMDetailLayout(info.models.get(index), info.models.get(index).groups, f5, false, layoutPlacements, recordLayout)) {
            GL11.glPopMatrix();
            return;
        }
        info.models.get(index).render(entity, f, f1, f2, f3, f4, f5);
        GL11.glPopMatrix();
    }

    private void bindDetailTexture(ModelDetailInformation info, int index, int baseTexture) {
        if (info.textures.size() > index && info.textures.get(index) != null) {
            Tessellator.bindTexture(info.textures.get(index));
        } else {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, baseTexture);
        }
    }

    public static boolean shouldSkipRender(Entity entity, ModelDetailInformation info, int index) {
        /*
         * These render-method values are visibility filters for details
         * that should appear only in first person, third person, while riding, or
         * while not riding. The batching code must respect the same result before
         * grouping repeated details, or hidden detail models would be drawn.
         */
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
