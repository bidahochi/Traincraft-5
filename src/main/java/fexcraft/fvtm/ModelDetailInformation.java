package fexcraft.fvtm;

import net.minecraft.util.ResourceLocation;
import tmt.FVTMFormatBase;
import tmt.Vec3f;

import java.util.LinkedList;

public class ModelDetailInformation {
    public LinkedList<FVTMFormatBase> models = new LinkedList<>();
    public LinkedList<Vec3f> positions = new LinkedList<>();
    public LinkedList<Vec3f> rotations = new LinkedList<>();
    public LinkedList<Vec3f> scales = new LinkedList<>();
    public LinkedList<ResourceLocation> textures = new LinkedList<>();

    public ModelDetailInformation addModel(FVTMFormatBase model, Vec3f position, Vec3f rotation, Vec3f scale, ResourceLocation texture) {
        models.add(model);
        positions.add(position);
        rotations.add(rotation);
        scales.add(scale);
        textures.add(texture);
        return this;
    }

    public ModelDetailInformation addModel(FVTMFormatBase model, Vec3f position, Vec3f rotation, Vec3f scale, String texture) {
        models.add(model);
        positions.add(position);
        rotations.add(rotation);
        scales.add(scale);
        textures.add(new ResourceLocation(texture));
        return this;
    }
}
