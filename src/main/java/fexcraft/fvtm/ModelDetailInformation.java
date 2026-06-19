package fexcraft.fvtm;

import net.minecraft.util.ResourceLocation;
import tmt.FVTMFormatBase;
import tmt.Vec3f;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author broscolotos
 */
public class ModelDetailInformation {
    /**
     * the 'modelRenderMethod' HashMap is a map of model -> render filter.
     * The render filter specifies what conditions the detail model will be rendered:
     * 0: all the time
     * 1: first person only, and when in the car
     * 2: first person only
     * 3: third person only, and when in the car
     * 4: third person only
     * 5: not in the car, regardless of viewpoint
     * 6: in the car, regardless of viewpoint
     * 7: third person, or out of car
     */
    public HashMap<FVTMFormatBase, Integer> modelRenderMethod = new HashMap<>();
    public LinkedList<FVTMFormatBase> models = new LinkedList<>();
    public LinkedList<Vec3f> positions = new LinkedList<>();
    public LinkedList<Vec3f> rotations = new LinkedList<>();
    public LinkedList<Vec3f> scales = new LinkedList<>();
    public LinkedList<ResourceLocation> textures = new LinkedList<>();


    public ModelDetailInformation addModel(FVTMFormatBase model, Vec3f position, Vec3f rotation, Vec3f scale, ResourceLocation texture) {
        models.add(model);
        modelRenderMethod.put(model, 0);
        positions.add(position);
        rotations.add(rotation);
        scales.add(scale);
        textures.add(texture);
        return this;
    }

    public ModelDetailInformation addModel(FVTMFormatBase model, Vec3f position, Vec3f rotation, Vec3f scale, String texture) {
        models.add(model);
        modelRenderMethod.put(model, 0);
        positions.add(position);
        rotations.add(rotation);
        scales.add(scale);
        textures.add(new ResourceLocation(texture));
        return this;
    }

    public ModelDetailInformation addModel(FVTMFormatBase model, int renderFilter, Vec3f position, Vec3f rotation, Vec3f scale, ResourceLocation texture) {
        models.add(model);
        modelRenderMethod.put(model, renderFilter);
        positions.add(position);
        rotations.add(rotation);
        scales.add(scale);
        textures.add(texture);
        return this;
    }

    public ModelDetailInformation addModel(FVTMFormatBase model, int renderFilter, Vec3f position, Vec3f rotation, Vec3f scale, String texture) {
        models.add(model);
        modelRenderMethod.put(model, renderFilter);
        positions.add(position);
        rotations.add(rotation);
        scales.add(scale);
        textures.add(new ResourceLocation(texture));
        return this;
    }
}
