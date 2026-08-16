package train.client.render.lighting;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.TexturedPolygon;
import tmt.TexturedVertex;
import train.api.client.model.animation.PlacedModelLightProfile;
import train.common.api.RollingStockLightChannel;
import train.common.api.RollingStockLightColors;
import train.common.api.RollingStockLightDefinition;

/**
 * Java 8/fixed-function adapter for placed-model light extraction. A {@code begin/end}
 * scope associates one tile render with an immutable profile; {@code beginPart/endPart}
 * scopes temporarily force detected emissive faces to full-bright while capturing each
 * animated part pose. Texture alpha classification and reflected model inventories are
 * bounded caches, while tile visibility state is weakly owned. Calls must occur on the
 * client render thread and every successful begin/part token must be closed in {@code finally}.
 */
public final class PlacedModelLighting
{
    static final float MODEL_SCALE = 0.0625F;
    private static final float CLUSTER_DISTANCE = 0.30F;
    private static final float MINIMUM_REAR_OPPOSITION = 0.85F;
    private static final ThreadLocal<Context> ACTIVE = new ThreadLocal<Context>();
    private static final FloatBuffer MODEL_VIEW_BUFFER = BufferUtils.createFloatBuffer(16);
    private static float[][] capturedPoses = new float[32][];
    private static int capturedPoseCount;
    private static final Map<TileEntity, AdaptiveLightTracker> VISIBILITY =
        Collections.synchronizedMap(
            new WeakHashMap<TileEntity, AdaptiveLightTracker>());
    private static final Cache<TextureKey, TextureEntry> TEXTURES =
        CacheBuilder.newBuilder()
        .maximumSize(256)
        .expireAfterAccess(10, TimeUnit.MINUTES)
        .build();
    private static final Cache<MetadataKey, StaticMetadata> METADATA =
        CacheBuilder.newBuilder().maximumSize(128).build();
    private static final BoundedIdentityCache<Object, ModelPartInventory> MODEL_PARTS =
        new BoundedIdentityCache<Object, ModelPartInventory>(128);
    private static final Cache<Class<?>, List<Field >> MODEL_PART_FIELDS =
        CacheBuilder.newBuilder().maximumSize(256).build();
    private static final BoundedSet<String> EXTRACTION_DIAGNOSTICS =
        new BoundedSet<String>(1024);

    private PlacedModelLighting() {}

    /** Begins a legacy two-phase warning-light scope using model-unit beam defaults. */
    public static void begin(
        TileEntity owner,
        ResourceLocation off,
        ResourceLocation phase0,
        ResourceLocation phase1,
        boolean active,
        int phase)
    {
        List<ResourceLocation> phases = new ArrayList<ResourceLocation>();
        phases.add(phase0);
        if (phase1 != null)
        {
            phases.add(phase1);
        }
        PlacedModelLightProfile profile =
            new PlacedModelLightProfile(
            "warning",
            off,
            phases,
            1,
            RollingStockLightColors.RED,
            0.75F,
            0.35F,
            0.85F,
            true);
        begin(owner, profile, active, phase);
    }

    /** Begins a placed-light scope without a model inventory or partial-tick interpolation. */
    public static void begin(
        TileEntity owner, PlacedModelLightProfile profile, boolean active, int phase)
    {
        begin(owner, null, profile, active, phase);
    }

    /** Begins a placed-light scope with a model inventory and no partial-tick interpolation. */
    public static void begin(
        TileEntity owner,
        Object model,
        PlacedModelLightProfile profile,
        boolean active,
        int phase)
    {
        begin(owner, model, profile, active, phase, 0.0F);
    }

    /**
     * Begins the canonical tile render scope. A later {@link #end()} clusters captured
     * model-local candidates and submits world-last effects for {@code owner}.
     */
    public static void begin(
        TileEntity owner,
        Object model,
        PlacedModelLightProfile profile,
        boolean active,
        int phase,
        float partialTicks)
    {
        if (train.common.core.handlers.ConfigHandler.ENABLE_ADVANCED_LIGHTING == false)
        {
            ACTIVE.remove();
            capturedPoseCount = 0;
            return;
        }
        capturedPoseCount = 0;
        ACTIVE.set(new Context(owner, model, profile, active, phase, partialTicks));
    }

    /** Submits captured candidates and clears the current thread's placed-light scope. */
    public static void end()
    {
        Context context = ACTIVE.get();
        try
        {
            if (context != null)
            {
                submitClusters(context);
            }
        }
        finally
        {
            ACTIVE.remove();
        }
    }

    /** Returns whether the current render thread is inside a placed-light scope. */
    public static boolean isActive()
    {
        return ACTIVE.get() != null;
    }

    /** Returns whether a part must bypass display-list batching so its active faces can change. */
    public static boolean requiresImmediateRendering(ModelRendererTurbo part)
    {
        Context context = ACTIVE.get();
        if (context == null || part == null)
        {
            return false;
        }
        TextureSet textures = requestTextures(context);
        if (textures == null)
        {
            return true;
        }
        if (textures.failed)
        {
            logExtractionFailure(context, "texture-analysis", 0, 0, 0);
            return false;
        }
        return staticMetadata(context, textures).parts.containsKey(part);
    }

    /**
     * Captures a part pose and applies full-bright state when its active texture phase matches.
     * The returned token owns the prior lightmap state and must be passed to {@link #endPart}.
     */
    public static PartLight beginPart(final ModelRendererTurbo part, float scale)
    {
        final Context context = ACTIVE.get();
        if (context == null || context.active == false || part == null || part.showModel == false)
        {
            return PartLight.NONE;
        }
        TextureSet textures = requestTextures(context);
        if (textures == null)
        {
            return PartLight.NONE;
        }
        if (textures.failed)
        {
            logExtractionFailure(context, "texture-analysis", 0, 0, 0);
            return PartLight.NONE;
        }
        StaticPartMetadata staticPart = staticMetadata(context, textures).parts.get(part);
        if (staticPart == null)
        {
            return PartLight.NONE;
        }
        int authoredPhase = staticPart.phase;
        if (authoredPhase == PlacedLightTexturePhases.NONE
                || authoredPhase != PlacedLightTexturePhases.STEADY
                && authoredPhase != context.phase)
        {
            return PartLight.NONE;
        }
        boolean[] faceMask = staticPart.faceMask;
        int faceIndex = staticPart.faceIndex;
        if (faceIndex < 0)
        {
            return PartLight.NONE;
        }

        DetectedLightFace selected = staticPart.face;
        if (selected == null)
        {
            return PartLight.NONE;
        }
        MODEL_VIEW_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MODEL_VIEW_BUFFER);
        float[] matrix = nextCapturedPose();
        MODEL_VIEW_BUFFER.get(matrix);
        String group = staticPart.group;
        boolean[] illuminatedMask = staticPart.illuminatedMask;
        Candidate candidate =
            new Candidate(
            part,
            authoredPhase,
            group,
            faceMask,
            illuminatedMask,
            faceIndex,
            selected,
            scale,
            matrix);
        context.candidates.add(candidate);

        float oldX = OpenGlHelper.lastBrightnessX;
        float oldY = OpenGlHelper.lastBrightnessY;
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        boolean enabled = GL11.glIsEnabled(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        OpenGlHelper.setLightmapTextureCoords(
            OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
        return new PartLight(
                   true,
                   oldX,
                   oldY,
                   enabled,
                   illuminatedMask,
                   context.profile.color());
    }

    static float[] nextCapturedPose()
    {
        if (capturedPoseCount == capturedPoses.length)
        {
            float[][] grown = new float[capturedPoses.length * 2][];
            System.arraycopy(capturedPoses, 0, grown, 0, capturedPoses.length);
            capturedPoses = grown;
        }
        float[] pose = capturedPoses[capturedPoseCount];
        if (pose == null)
        {
            pose = new float[16];
            capturedPoses[capturedPoseCount] = pose;
        }
        capturedPoseCount++;
        return pose;
    }

    static void resetCapturedPosesForTest()
    {
        capturedPoseCount = 0;
    }

    /** Restores the lightmap and texture state recorded by {@link #beginPart}. */
    public static void endPart(PartLight token)
    {
        if (token.changed == false)
        {
            return;
        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, token.x, token.y);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        if (token.enabled)
        {
            GL11.glEnable(GL11.GL_TEXTURE_2D);
        }
        else
        {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
        }
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }

    private static TextureSet requestTextures(final Context context)
    {
        final TextureKey key =
            new TextureKey(
            context.off,
            context.phase0,
            context.phase1,
            TextureAlphaMaskCache.resourceGeneration());
        TextureEntry entry = TEXTURES.getIfPresent(key);
        if (entry == null)
        {
            final TextureEntry pending = new TextureEntry();
            TextureEntry raced = TEXTURES.asMap().putIfAbsent(key, pending);
            entry = raced == null ? pending : raced;
            if (raced == null)
            {
                try
                {
                    LightingTextureAnalysisService.execute(
                        new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            pending.ready = loadTextures(key);
                        }
                    });
                }
                catch (RejectedExecutionException ignored)
                {
                    pending.ready = TextureSet.FAILED;
                }
            }
        }
        return entry.ready;
    }

    private static StaticMetadata staticMetadata(Context context, TextureSet textures)
    {
        MetadataKey key =
            new MetadataKey(
            context.model,
            context.profile,
            TextureAlphaMaskCache.resourceGeneration());
        StaticMetadata cached = METADATA.getIfPresent(key);
        if (cached != null)
        {
            return cached;
        }
        ensurePreferredFaces(context, textures);
        IdentityHashMap<ModelRendererTurbo, StaticPartMetadata> parts =
            new IdentityHashMap<ModelRendererTurbo, StaticPartMetadata>();
        ModelPartInventory inventory = modelPartInventory(context.model);
        int phaseZero = 0;
        int phaseOne = 0;
        for (PartReference reference : inventory.parts)
        {
            ModelRendererTurbo part = reference.part;
            if (part.showModel == false)
            {
                continue;
            }
            int phase =
                PlacedLightTexturePhases.phase(
                    part,
                    textures.width,
                    textures.height,
                    textures.off,
                    textures.active);
            if (phase == PlacedLightTexturePhases.NONE)
            {
                continue;
            }
            if (phase == 0)
            {
                phaseZero++;
            }
            if (phase == 1)
            {
                phaseOne++;
            }
            boolean[] mask =
                PlacedLightTexturePhases.faceMask(
                    part,
                    phase,
                    textures.width,
                    textures.height,
                    textures.off,
                    textures.active);
            Integer preferred = context.preferredFaces.get(part);
            int faceIndex =
                preferred == null
                ? PlacedLightTexturePhases.faceIndex(
                    part,
                    phase,
                    textures.width,
                    textures.height,
                    textures.off,
                    textures.active)
                : preferred;
            DetectedLightSurface surface = AutomaticLightSurfaceDetection.detect(part);
            DetectedLightFace selected = face(faceIndex, surface);
            if (selected != null)
            {
                boolean fullSurface =
                    context.profile.fullSurfaceFixtureGroups().contains(reference.groupName);
                boolean bidirectional =
                    context.profile.bidirectionalFixtures()
                    || context.profile
                    .bidirectionalFixtureGroups()
                    .contains(reference.groupName);
                boolean[] illuminatedMask =
                    illuminatedMask(
                        surface, mask, faceIndex, fullSurface, bidirectional);
                parts.put(
                    part,
                    new StaticPartMetadata(
                        phase,
                        reference.groupName,
                        mask,
                        illuminatedMask,
                        faceIndex,
                        selected));
            }
        }
        if (parts.isEmpty())
        {
            logExtractionFailure(
                context,
                "completed-empty",
                inventory.parts.size(),
                phaseZero,
                phaseOne);
        }
        StaticMetadata created = new StaticMetadata(parts);
        METADATA.put(key, created);
        return created;
    }

    static boolean[] illuminatedMask(
        DetectedLightSurface surface,
        boolean[] authoredMask,
        int selectedFace,
        boolean fullSurface,
        boolean bidirectional)
    {
        boolean[] illuminated = new boolean[authoredMask.length];
        if (fullSurface)
        {
            System.arraycopy(authoredMask, 0, illuminated, 0, authoredMask.length);
            return illuminated;
        }
        if (selectedFace >= 0 && selectedFace < illuminated.length)
        {
            illuminated[selectedFace] = true;
        }
        if (bidirectional)
        {
            DetectedLightFace selected = face(selectedFace, surface);
            if (selected != null)
            {
                DetectedLightFace rear = opposed(surface, selected, authoredMask);
                if (rear != null && rear.faceIndex < illuminated.length)
                {
                    illuminated[rear.faceIndex] = true;
                }
            }
        }
        return illuminated;
    }

    private static void logExtractionFailure(
        Context context,
        String stage,
        int inspectedParts,
        int phaseZero,
        int phaseOne)
    {
        String modelName =
            context.model == null ? "null" : context.model.getClass().getName();
        String key =
            modelName
            + '\n'
            + context.profile.control()
            + '\n'
            + context.off
            + '\n'
            + context.phase0
            + '\n'
            + context.phase1
            + '\n'
            + stage;
        if (EXTRACTION_DIAGNOSTICS.add(key) == false)
        {
            return;
        }
        train.common.Traincraft.tcLog.warn(
            "Placed light extraction failed at {} for model {} using textures {}, {}, {} after inspecting {} parts (phase 0: {}, phase 1: {}).",
            stage,
            modelName,
            context.off,
            context.phase0,
            context.phase1,
            inspectedParts,
            phaseZero,
            phaseOne);
    }

    private static ModelPartInventory modelPartInventory(Object model)
    {
        if (model == null)
        {
            return ModelPartInventory.EMPTY;
        }
        ModelPartInventory cached = MODEL_PARTS.get(model);
        if (cached != null)
        {
            return cached;
        }
        List<PartReference> parts = new ArrayList<PartReference>();
        Set<ModelRendererTurbo> seen =
            Collections.newSetFromMap(
                new IdentityHashMap<ModelRendererTurbo, Boolean>());
        Set<Object> visitedContainers =
            Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
        if (model instanceof FVTMFormatBase)
        {
            for (FVTMFormatBase.TurboList group : ((FVTMFormatBase) model).groups)
            {
                if (group == null)
                {
                    continue;
                }
                addParts(parts, seen, visitedContainers, group, group.name);
            }
        }
        for (Field field : modelPartFields(model.getClass()))
        {
            try
            {
                addParts(parts, seen, visitedContainers, field.get(model), "");
            }
            catch (IllegalAccessException ignored)
            {
            }
        }
        ModelPartInventory created =
            new ModelPartInventory(Collections.unmodifiableList(parts));
        MODEL_PARTS.put(model, created);
        return created;
    }

    private static List<Field> modelPartFields(Class<?> modelClass)
    {
        List<Field> cached = MODEL_PART_FIELDS.getIfPresent(modelClass);
        if (cached != null)
        {
            return cached;
        }
        List<Field> fields = new ArrayList<Field>();
        Class<?> type = modelClass;
        while (type != null && type != Object.class)
        {
            for (Field field : type.getDeclaredFields())
            {
                if (Modifier.isStatic(field.getModifiers()))
                {
                    continue;
                }
                Class<?> fieldType = field.getType();
                if (supportsModelParts(fieldType) == false)
                {
                    continue;
                }
                try
                {
                    field.setAccessible(true);
                    fields.add(field);
                }
                catch (SecurityException ignored)
                {
                }
            }
            type = type.getSuperclass();
        }
        List<Field> result = Collections.unmodifiableList(fields);
        MODEL_PART_FIELDS.put(modelClass, result);
        return result;
    }

    private static boolean supportsModelParts(Class<?> type)
    {
        if (Iterable.class.isAssignableFrom(type))
        {
            return true;
        }
        if (type.isArray() == false)
        {
            return false;
        }
        Class<?> component = type.getComponentType();
        return ModelRendererTurbo.class.isAssignableFrom(component)
               || component.isArray() && supportsModelParts(component);
    }

    private static void addParts(
        List<PartReference> target,
        Set<ModelRendererTurbo> seen,
        Set<Object> visitedContainers,
        Object value,
        String defaultGroup)
    {
        if (value == null)
        {
            return;
        }
        if (value instanceof ModelRendererTurbo)
        {
            addPart(target, seen, (ModelRendererTurbo) value, defaultGroup);
            return;
        }
        if (visitedContainers.add(value) == false)
        {
            return;
        }
        String group = defaultGroup;
        if (value instanceof FVTMFormatBase.TurboList)
        {
            group = ((FVTMFormatBase.TurboList) value).name;
        }
        if (value instanceof Iterable<?>)
        {
            for (Object nested : (Iterable<?>) value)
            {
                addParts(target, seen, visitedContainers, nested, group);
            }
            return;
        }
        Class<?> valueType = value.getClass();
        if (valueType.isArray() && valueType.getComponentType().isPrimitive() == false)
        {
            int length = Array.getLength(value);
            for (int index = 0; index < length; index++)
            {
                addParts(target, seen, visitedContainers, Array.get(value, index), group);
            }
        }
    }

    private static void addPart(
        List<PartReference> target,
        Set<ModelRendererTurbo> seen,
        ModelRendererTurbo part,
        String defaultGroup)
    {
        if (part == null || seen.add(part) == false)
        {
            return;
        }
        String authoredGroup = groupName(part);
        target.add(
            new PartReference(
                part,
                authoredGroup.isEmpty() ? defaultGroup : authoredGroup));
    }

    static List<ModelRendererTurbo> modelPartsForTest(Object model)
    {
        List<ModelRendererTurbo> parts = new ArrayList<ModelRendererTurbo>();
        for (PartReference reference : modelPartInventory(model).parts)
        {
            parts.add(reference.part);
        }
        return Collections.unmodifiableList(parts);
    }

    static String modelPartGroupForTest(Object model, ModelRendererTurbo part)
    {
        for (PartReference reference : modelPartInventory(model).parts)
        {
            if (reference.part == part)
            {
                return reference.groupName;
            }
        }
        return null;
    }

    static int modelPartInventoryCacheSizeForTest()
    {
        return MODEL_PARTS.size();
    }

    private static TextureSet loadTextures(TextureKey key)
    {
        try
        {
            BufferedImage off = read(key.off),
                          first = read(key.first),
                          second = key.second == null ? null : read(key.second);
            if (off == null
                    || first == null
                    || second != null
                    && (second.getWidth() != off.getWidth()
                        || second.getHeight() != off.getHeight())
                    || first.getWidth() != off.getWidth()
                    || first.getHeight() != off.getHeight())
            {
                return TextureSet.FAILED;
            }
            List<int[]> active = new ArrayList<int[]>();
            active.add(pixels(first));
            if (second != null)
            {
                active.add(pixels(second));
            }
            return new TextureSet(off.getWidth(), off.getHeight(), pixels(off), active, false);
        }
        catch (IOException ignored)
        {
            return TextureSet.FAILED;
        }
    }

    private static BufferedImage read(ResourceLocation location) throws IOException
    {
        try
            (InputStream stream =
                        Minecraft.getMinecraft()
                        .getResourceManager()
                        .getResource(location)
                        .getInputStream())
        {
            return ImageIO.read(stream);
        }
    }

    private static int[] pixels(BufferedImage image)
    {
        int[] result = new int[image.getWidth() * image.getHeight()];
        image.getRGB(0, 0, image.getWidth(), image.getHeight(), result, 0, image.getWidth());
        return result;
    }

    private static void submitClusters(Context context)
    {
        if (context.candidates.isEmpty())
        {
            return;
        }
        List<List<Candidate>> clusters = cluster(context.candidates);
        Collections.sort(
            clusters,
            new Comparator<List<Candidate>>()
        {
            @Override
            public int compare(List<Candidate> a, List<Candidate> b)
            {
                Candidate x = a.get(0), y = b.get(0);
                int phase = Integer.compare(x.phase, y.phase);
                if (phase != 0)
                {
                    return phase;
                }
                int cx = Float.compare(x.modelX, y.modelX);
                if (cx != 0)
                {
                    return cx;
                }
                int cy = Float.compare(x.modelY, y.modelY);
                return cy != 0 ? cy : Float.compare(x.modelZ, y.modelZ);
            }
        });
        int ownerId =
            (context.owner.xCoord * 73428767)
            ^ (context.owner.yCoord * 912367)
            ^ (context.owner.zCoord * 438289);
        int phase0 = 0, phase1 = 0, steady = 0;
        for (List<Candidate> cluster : clusters)
        {
            int phase = cluster.get(0).phase,
                index = phase == 0 ? phase0++ : phase == 1 ? phase1++ : steady++;
            String phaseName = phase < 0 ? "steady" : "phase" + phase;
            String id =
                "tc:placed/"
                + context.owner
                .getClass()
                .getSimpleName()
                .toLowerCase(java.util.Locale.ROOT)
                + "/warning_"
                + phaseName
                + "_"
                + index;
            submitFixture(context, ownerId, id, cluster);
        }
    }

    private static void submitFixture(
        Context context, int ownerId, String id, List<Candidate> members)
    {
        float total = 0,
              x = 0,
              y = 0,
              z = 0,
              dx = 0,
              dy = 0,
              dz = 0,
              rx = 0,
              ry = 0,
              rz = 0,
              ux = 0,
              uy = 0,
              uz = 0;
        for (Candidate member : members)
        {
            float area = Math.max(1.0E-5F, member.area);
            total += area;
            x += member.x * area;
            y += member.y * area;
            z += member.z * area;
            dx += member.dx * area;
            dy += member.dy * area;
            dz += member.dz * area;
            rx += member.rx * area;
            ry += member.ry * area;
            rz += member.rz * area;
            ux += member.ux * area;
            uy += member.uy * area;
            uz += member.uz * area;
        }
        x /= total;
        y /= total;
        z /= total;
        float[] direction = normalize(dx, dy, dz),
                right = orthogonalize(rx, ry, rz, direction),
                up = cross(right, direction);
        if (up[0] * ux + up[1] * uy + up[2] * uz < 0)
        {
            right[0] = -right[0];
            right[1] = -right[1];
            right[2] = -right[2];
            up = cross(right, direction);
        }
        float radius = Math.max(0.04F, Math.min(0.18F, (float) Math.sqrt(total / Math.PI) * 1.35F));
        RollingStockLightDefinition definition =
            RollingStockLightDefinition.builder(id, RollingStockLightChannel.BEACON)
            .position(0, 0, 0)
            .direction(direction[0], direction[1], direction[2])
            .color(context.profile.color())
            .effect(RollingStockLightDefinition.Effect.BEAM)
            .beamDimensions(context.profile.beamLength(), context.profile.beamWidth())
            .sourceGlow(radius, context.profile.sourceGlowIntensity())
            .hotspotEnabled(context.profile.hotspotEnabled())
            .clientProjectorEligible(false)
            .build();
        submitPlacedEffect(
            context,
            members.get(0),
            ownerId,
            id,
            definition,
            x,
            y,
            z,
            direction,
            right,
            up);
        boolean groupBidirectional = false;
        for (Candidate member : members)
        {
            if (context.profile.bidirectionalFixtureGroups().contains(member.group))
            {
                groupBidirectional = true;
                break;
            }
        }
        if (context.profile.bidirectionalFixtures() || groupBidirectional)
        {
            submitRear(context, ownerId, id, members, total);
        }
    }

    private static void submitRear(
        Context context, int ownerId, String id, List<Candidate> members, float total)
    {
        float x = 0, y = 0, z = 0, dx = 0, dy = 0, dz = 0, area = 0;
        for (Candidate member : members)
        {
            DetectedLightFace rear =
                opposed(
                    AutomaticLightSurfaceDetection.detect(member.part),
                    member.face,
                    member.faceMask);
            if (rear == null)
            {
                continue;
            }
            float[] p =
                point(
                    member.matrix,
                    rear.x * member.scale,
                    rear.y * member.scale,
                    rear.z * member.scale);
            float[] localNormal = outwardNormal(member.part, rear);
            float[] n =
                direction(
                    member.matrix,
                    localNormal[0],
                    localNormal[1],
                    localNormal[2]);
            float a = Math.max(1.0E-5F, rear.area * member.scale * member.scale);
            x += p[0] * a;
            y += p[1] * a;
            z += p[2] * a;
            dx += n[0] * a;
            dy += n[1] * a;
            dz += n[2] * a;
            area += a;
        }
        if (area <= 1.0E-7F)
        {
            return;
        }
        x /= area;
        y /= area;
        z /= area;
        float[] normal = normalize(dx, dy, dz),
                basis = AnimatedLightDirection.basis(normal[0], normal[1], normal[2]);
        float radius = Math.max(0.04F, Math.min(0.18F, (float) Math.sqrt(area / Math.PI) * 1.35F));
        RollingStockLightDefinition definition =
            RollingStockLightDefinition.builder(
                id + "/reverse", RollingStockLightChannel.BEACON)
            .direction(normal[0], normal[1], normal[2])
            .color(context.profile.color())
            .effect(RollingStockLightDefinition.Effect.BEAM)
            .beamDimensions(context.profile.beamLength(), context.profile.beamWidth())
            .sourceGlow(radius, context.profile.sourceGlowIntensity())
            .hotspotEnabled(context.profile.hotspotEnabled())
            .clientProjectorEligible(false)
            .build();
        submitPlacedEffect(
            context,
            members.get(0),
            ownerId,
            id + "/reverse",
            definition,
            x,
            y,
            z,
            normal,
            new float[] {basis[3], basis[4], basis[5]},
            new float[] {basis[6], basis[7], basis[8]});
    }

    private static void submitPlacedEffect(
        Context context,
        Candidate anchor,
        int ownerId,
        String id,
        RollingStockLightDefinition definition,
        float eyeX,
        float eyeY,
        float eyeZ,
        float[] eyeDirection,
        float[] eyeRight,
        float[] eyeUp)
    {
        float[] localPoint = inversePoint(anchor.matrix, eyeX, eyeY, eyeZ);
        float[] localDirection = inverseDirection(anchor.matrix, eyeDirection);
        float[] localRight = inverseDirection(anchor.matrix, eyeRight);
        float[] localUp = inverseDirection(anchor.matrix, eyeUp);
        if (localPoint == null
                || localDirection == null
                || localRight == null
                || localUp == null)
        {
            float[] basis =
                new float[]
            {
                eyeDirection[0],
                eyeDirection[1],
                eyeDirection[2],
                eyeRight[0],
                eyeRight[1],
                eyeRight[2],
                eyeUp[0],
                eyeUp[1],
                eyeUp[2]
            };
            LightEffectRenderBatch.submit(
                new LightEffectSubmission(
                    ownerId,
                    id,
                    definition,
                    eyeX,
                    eyeY,
                    eyeZ,
                    eyeDirection[0],
                    eyeDirection[1],
                    eyeDirection[2],
                    eyeDirection[0],
                    eyeDirection[1],
                    eyeDirection[2],
                    basis,
                    basis,
                    1.0F,
                    1.0F,
                    context.visibility.beamScale,
                    context.visibility.beamAlpha,
                    context.visibility.hotspotAlpha,
                    1.0F,
                    context.owner.xCoord,
                    context.owner.yCoord,
                    context.owner.zCoord));
            return;
        }

        localRight =
            orthogonalize(
                localRight[0], localRight[1], localRight[2], localDirection);
        float[] correctedUp = cross(localRight, localDirection);
        if (correctedUp[0] * localUp[0]
                + correctedUp[1] * localUp[1]
                + correctedUp[2] * localUp[2]
                < 0.0F)
        {
            localRight[0] = -localRight[0];
            localRight[1] = -localRight[1];
            localRight[2] = -localRight[2];
            correctedUp = cross(localRight, localDirection);
        }
        float[] basis =
            new float[]
        {
            localDirection[0],
            localDirection[1],
            localDirection[2],
            localRight[0],
            localRight[1],
            localRight[2],
            correctedUp[0],
            correctedUp[1],
            correctedUp[2]
        };
        LightEffectRenderBatch.submit(
            LightEffectSubmission.fixtureLocal(
                anchor.matrix,
                ownerId,
                id,
                definition,
                localPoint[0],
                localPoint[1],
                localPoint[2],
                localDirection[0],
                localDirection[1],
                localDirection[2],
                localDirection[0],
                localDirection[1],
                localDirection[2],
                basis,
                basis,
                1.0F,
                1.0F,
                context.visibility.beamScale,
                context.visibility.beamAlpha,
                context.visibility.hotspotAlpha,
                1.0F,
                context.owner.xCoord,
                context.owner.yCoord,
                context.owner.zCoord));
    }

    private static void ensurePreferredFaces(Context context, TextureSet textures)
    {
        if (context.preferredReady)
        {
            return;
        }
        context.preferredReady = true;
        List<PreferredCandidate> candidates = new ArrayList<PreferredCandidate>();
        for (PartReference reference : modelPartInventory(context.model).parts)
        {
            ModelRendererTurbo part = reference.part;
            if (part.showModel == false)
            {
                continue;
            }
            int phase =
                PlacedLightTexturePhases.phase(
                    part,
                    textures.width,
                    textures.height,
                    textures.off,
                    textures.active);
            if (phase == PlacedLightTexturePhases.NONE)
            {
                continue;
            }
            boolean[] mask =
                PlacedLightTexturePhases.faceMask(
                    part,
                    phase,
                    textures.width,
                    textures.height,
                    textures.off,
                    textures.active);
            int selected =
                PlacedLightTexturePhases.faceIndex(
                    part,
                    phase,
                    textures.width,
                    textures.height,
                    textures.off,
                    textures.active);
            DetectedLightSurface measured = AutomaticLightSurfaceDetection.detect(part);
            DetectedLightFace face = face(selected, measured);
            if (face == null)
            {
                continue;
            }
            if (context.reverseDirection && Math.abs(face.modelNormalX) >= 0.5F)
            {
                float desired = face.modelNormalX > 0.0F ? -1.0F : 1.0F;
                DetectedLightFace reverse = preferredFace(measured, mask, desired);
                if (reverse != null && reverse.faceIndex != selected)
                {
                    selected = reverse.faceIndex;
                    face = reverse;
                }
            }
            candidates.add(new PreferredCandidate(part, measured, mask, selected, face));
        }
        float minimum = Float.POSITIVE_INFINITY, maximum = Float.NEGATIVE_INFINITY;
        for (PreferredCandidate candidate : candidates)
        {
            minimum = Math.min(minimum, candidate.face.modelX);
            maximum = Math.max(maximum, candidate.face.modelX);
        }
        float span = maximum - minimum, middle = (minimum + maximum) * 0.5F;
        for (PreferredCandidate candidate : candidates)
        {
            int selected = candidate.faceIndex;
            if (Float.isNaN(span) == false
                    && Float.isInfinite(span) == false
                    && span >= 0.25F
                    && Math.abs(candidate.face.modelX - middle) >= span * 0.25F)
            {
                float desired = candidate.face.modelX > middle ? 1.0F : -1.0F;
                DetectedLightFace outward =
                    preferredFace(candidate.surface, candidate.mask, desired);
                if (outward != null)
                {
                    selected = outward.faceIndex;
                }
            }
            context.preferredFaces.put(candidate.part, selected);
        }
    }

    private static DetectedLightFace preferredFace(
        DetectedLightSurface surface, boolean[] mask, float desiredX)
    {
        DetectedLightFace selected = null;
        float score = 0.5F;
        for (DetectedLightFace candidate : surface.faces)
        {
            if (candidate.faceIndex >= mask.length || mask[candidate.faceIndex] == false)
            {
                continue;
            }
            float value = candidate.modelNormalX * desiredX;
            if (value > score + 1.0E-5F
                    || (Math.abs(value - score) <= 1.0E-5F
                        && selected != null
                        && candidate.area > selected.area))
            {
                selected = candidate;
                score = value;
            }
        }
        return selected;
    }

    private static List<List<Candidate>> cluster(List<Candidate> candidates)
    {
        List<List<Candidate>> result = new ArrayList<List<Candidate >> ();
        Set<Candidate> remaining =
            Collections.newSetFromMap(new IdentityHashMap<Candidate, Boolean>());
        remaining.addAll(candidates);
        while (remaining.isEmpty() == false)
        {
            Candidate seed = remaining.iterator().next();
            remaining.remove(seed);
            List<Candidate> group = new ArrayList<Candidate>();
            ArrayDeque<Candidate> queue = new ArrayDeque<Candidate>();
            queue.add(seed);
            while (queue.isEmpty() == false)
            {
                Candidate current = queue.removeFirst();
                group.add(current);
                List<Candidate> joined = new ArrayList<Candidate>();
                for (Candidate other : remaining)
                {
                    if (other.phase != current.phase)
                    {
                        continue;
                    }
                    float dx = current.x - other.x,
                          dy = current.y - other.y,
                          dz = current.z - other.z;
                    if (dx * dx + dy * dy + dz * dz <= CLUSTER_DISTANCE * CLUSTER_DISTANCE)
                    {
                        joined.add(other);
                    }
                }
                remaining.removeAll(joined);
                queue.addAll(joined);
            }
            result.add(group);
        }
        return result;
    }

    private static DetectedLightFace face(int index, DetectedLightSurface surface)
    {
        for (DetectedLightFace face : surface.faces)
        {
            if (face.faceIndex == index)
            {
                return face;
            }
        }
        return null;
    }

    private static DetectedLightFace opposed(
        DetectedLightSurface surface, DetectedLightFace forward, boolean[] mask)
    {
        DetectedLightFace selected = null;
        float opposition = MINIMUM_REAR_OPPOSITION;
        for (DetectedLightFace candidate : surface.faces)
        {
            if (candidate.faceIndex == forward.faceIndex
                    || candidate.faceIndex >= mask.length
                    || mask[candidate.faceIndex] == false)
            {
                continue;
            }
            float score =
                -(candidate.normalX * forward.normalX
                  + candidate.normalY * forward.normalY
                  + candidate.normalZ * forward.normalZ);
            if (score > opposition + 1.0E-5F
                    || (Math.abs(score - opposition) <= 1.0E-5F
                        && selected != null
                        && candidate.area > selected.area))
            {
                selected = candidate;
                opposition = score;
            }
        }
        return selected;
    }

    private static String groupName(ModelRendererTurbo part)
    {
        Object owner = part.getModelOwner();
        return owner instanceof FVTMFormatBase.TurboList
               ? ((FVTMFormatBase.TurboList) owner).name
               : "";
    }

    private static float[] point(float[] m, float x, float y, float z)
    {
        return new float[]
               {
                   m[0] * x + m[4] * y + m[8] * z + m[12],
                   m[1] * x + m[5] * y + m[9] * z + m[13],
                   m[2] * x + m[6] * y + m[10] * z + m[14]
               };
    }

    private static float[] direction(float[] m, float x, float y, float z)
    {
        return normalize(
                   m[0] * x + m[4] * y + m[8] * z,
                   m[1] * x + m[5] * y + m[9] * z,
                   m[2] * x + m[6] * y + m[10] * z);
    }

    static float[] inversePoint(float[] matrix, float x, float y, float z)
    {
        return inverseTransform(
                   matrix,
                   x - matrix[12],
                   y - matrix[13],
                   z - matrix[14],
                   false);
    }

    static float[] inverseDirection(float[] matrix, float[] direction)
    {
        return inverseTransform(
                   matrix, direction[0], direction[1], direction[2], true);
    }

    private static float[] inverseTransform(
        float[] matrix, float x, float y, float z, boolean normalizeResult)
    {
        float a = matrix[0];
        float b = matrix[4];
        float c = matrix[8];
        float d = matrix[1];
        float e = matrix[5];
        float f = matrix[9];
        float g = matrix[2];
        float h = matrix[6];
        float i = matrix[10];
        float determinant =
            a * (e * i - f * h)
            - b * (d * i - f * g)
            + c * (d * h - e * g);
        if (Math.abs(determinant) <= 1.0E-8F)
        {
            return null;
        }
        float inverse = 1.0F / determinant;
        float localX =
            ((e * i - f * h) * x
             + (c * h - b * i) * y
             + (b * f - c * e) * z)
            * inverse;
        float localY =
            ((f * g - d * i) * x
             + (a * i - c * g) * y
             + (c * d - a * f) * z)
            * inverse;
        float localZ =
            ((d * h - e * g) * x
             + (b * g - a * h) * y
             + (a * e - b * d) * z)
            * inverse;
        return normalizeResult
               ? normalize(localX, localY, localZ)
               : new float[] {localX, localY, localZ};
    }

    static float[] outwardNormal(ModelRendererTurbo part, DetectedLightFace face)
    {
        DetectedLightSurface surface = AutomaticLightSurfaceDetection.detect(part);
        float minimumX = Float.POSITIVE_INFINITY;
        float minimumY = Float.POSITIVE_INFINITY;
        float minimumZ = Float.POSITIVE_INFINITY;
        float maximumX = Float.NEGATIVE_INFINITY;
        float maximumY = Float.NEGATIVE_INFINITY;
        float maximumZ = Float.NEGATIVE_INFINITY;
        for (DetectedLightFace candidate : surface.faces)
        {
            for (float[] vertex : candidate.vertices)
            {
                minimumX = Math.min(minimumX, vertex[0]);
                minimumY = Math.min(minimumY, vertex[1]);
                minimumZ = Math.min(minimumZ, vertex[2]);
                maximumX = Math.max(maximumX, vertex[0]);
                maximumY = Math.max(maximumY, vertex[1]);
                maximumZ = Math.max(maximumZ, vertex[2]);
            }
        }
        if (minimumX == Float.POSITIVE_INFINITY)
        {
            return normalize(face.normalX, face.normalY, face.normalZ);
        }
        float centerX = (minimumX + maximumX) * 0.5F;
        float centerY = (minimumY + maximumY) * 0.5F;
        float centerZ = (minimumZ + maximumZ) * 0.5F;
        float normalX = face.normalX;
        float normalY = face.normalY;
        float normalZ = face.normalZ;
        float outwardX = face.x - centerX;
        float outwardY = face.y - centerY;
        float outwardZ = face.z - centerZ;
        if (normalX * outwardX + normalY * outwardY + normalZ * outwardZ < 0.0F)
        {
            normalX = -normalX;
            normalY = -normalY;
            normalZ = -normalZ;
        }
        return normalize(normalX, normalY, normalZ);
    }

    private static float[] normalize(float x, float y, float z)
    {
        float length = (float) Math.sqrt(x * x + y * y + z * z);
        return length <= 1.0E-8F
               ? new float[] {1, 0, 0}
               : new float[] {x / length, y / length, z / length};
    }

    private static float[] orthogonalize(float x, float y, float z, float[] direction)
    {
        float projection = x * direction[0] + y * direction[1] + z * direction[2];
        float[] value =
            normalize(
                x - direction[0] * projection,
                y - direction[1] * projection,
                z - direction[2] * projection);
        if (Math.abs(value[0] * direction[0] + value[1] * direction[1] + value[2] * direction[2])
                > .99F)
        {
            float[] basis = AnimatedLightDirection.basis(direction[0], direction[1], direction[2]);
            return new float[] {basis[3], basis[4], basis[5]};
        }
        return value;
    }

    private static float[] cross(float[] right, float[] direction)
    {
        return normalize(
                   right[1] * direction[2] - right[2] * direction[1],
                   right[2] * direction[0] - right[0] * direction[2],
                   right[0] * direction[1] - right[1] * direction[0]);
    }

    /** Clears world state and all extraction/reflection caches, normally on resource reload. */
    public static void clear()
    {
        clearWorldState();
        TEXTURES.invalidateAll();
        TEXTURES.cleanUp();
        METADATA.invalidateAll();
        METADATA.cleanUp();
        MODEL_PARTS.clear();
        MODEL_PART_FIELDS.invalidateAll();
        MODEL_PART_FIELDS.cleanUp();
        EXTRACTION_DIAGNOSTICS.clear();
        capturedPoses = new float[32][];
        capturedPoseCount = 0;
    }

    static void clearWorldState()
    {
        ACTIVE.remove();
        VISIBILITY.clear();
    }

    /** Render-state token and emissive-face selection for one active TMT part. */
    public static final class PartLight
    {
        static final PartLight NONE =
        new PartLight(
            false, 0.0F, 0.0F, false, null, RollingStockLightColors.WHITE);
        final boolean changed, enabled;
        final float x, y;
        final boolean[] faceMask;
        final float red, green, blue;

        PartLight(
            boolean changed,
            float x,
            float y,
            boolean enabled,
            boolean[] faceMask,
            int color)
        {
            this.changed = changed;
            this.x = x;
            this.y = y;
            this.enabled = enabled;
            this.faceMask = faceMask;
            red = ((color >> 16) & 255) / 255.0F;
            green = ((color >> 8) & 255) / 255.0F;
            blue = (color & 255) / 255.0F;
        }

        /** Returns a defensive copy of the detected emissive polygon mask, or null. */
        public boolean[] faceMask()
        {
            return faceMask == null ? null : faceMask.clone();
        }

        /** Returns whether this token selected explicit emissive polygons. */
        public boolean hasEmissiveFaces()
        {
            return faceMask != null;
        }

        /** Selects the saved ambient lightmap state for ordinary faces. */
        public void useAmbient()
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, x, y);
        }

        /** Selects the profile color and full-bright lightmap state for emissive faces. */
        public void useEffect()
        {
            GL11.glColor4f(red, green, blue, 1.0F);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240, 240);
        }

        /**
         * Replays selected polygons as an additive, depth-tested overlay in part-local space.
         * The method preserves the caller's OpenGL attributes and active texture unit.
         */
        public void drawEmissiveFaces(List<TexturedPolygon> faces, float scale)
        {
            if (faceMask == null)
            {
                return;
            }
            int activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            try
            {
                GL11.glDisable(GL11.GL_LIGHTING);
                OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
                GL11.glDisable(GL11.GL_TEXTURE_2D);
                OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
                GL11.glDisable(GL11.GL_TEXTURE_2D);
                GL11.glDisable(GL11.GL_ALPHA_TEST);
                GL11.glDisable(GL11.GL_FOG);
                GL11.glEnable(GL11.GL_BLEND);
                GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
                GL11.glEnable(GL11.GL_DEPTH_TEST);
                GL11.glDepthFunc(GL11.GL_LEQUAL);
                GL11.glDepthMask(false);
                GL11.glDisable(GL11.GL_CULL_FACE);
                GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
                GL11.glPolygonOffset(-0.25F, -1.0F);
                GL11.glColor4f(red, green, blue, 1.0F);
                int count = Math.min(faceMask.length, faces.size());
                for (int index = 0; index < count; index++)
                {
                    if (faceMask[index] == false)
                    {
                        continue;
                    }
                    TexturedPolygon polygon = faces.get(index);
                    int mode =
                        polygon.vertices.length == 3
                        ? GL11.GL_TRIANGLES
                        : polygon.vertices.length == 4
                        ? GL11.GL_QUADS
                        : GL11.GL_POLYGON;
                    GL11.glBegin(mode);
                    for (TexturedVertex vertex : polygon.vertices)
                    {
                        GL11.glVertex3f(
                            vertex.vector3F.xCoord * scale,
                            vertex.vector3F.yCoord * scale,
                            vertex.vector3F.zCoord * scale);
                    }
                    GL11.glEnd();
                }
            }
            finally
            {
                GL11.glPopAttrib();
                OpenGlHelper.setActiveTexture(activeTexture);
            }
        }
    }

    private static final class Context
    {
        final TileEntity owner;
        final Object model;
        final PlacedModelLightProfile profile;
        final ResourceLocation off, phase0, phase1;
        final boolean active;
        final int phase;
        final boolean reverseDirection;
        final AdaptiveLightVisibility visibility;
        final List<Candidate> candidates = new ArrayList<Candidate>();
        final IdentityHashMap<ModelRendererTurbo, Integer> preferredFaces =
        new IdentityHashMap<ModelRendererTurbo, Integer>();
        boolean preferredReady;

        Context(
            TileEntity owner,
            Object model,
            PlacedModelLightProfile profile,
            boolean active,
            int phase,
            float partialTicks)
        {
            this.owner = owner;
            this.model = model;
            this.profile = profile;
            this.off = profile.offTexture();
            this.phase0 = profile.activeTextures().get(0);
            this.phase1 =
            profile.activeTextures().size() > 1 ? profile.activeTextures().get(1) : null;
            this.active = active;
            this.phase = phase;
            reverseDirection = profile.reverseFixtureDirection();
            AdaptiveLightTracker tracker = VISIBILITY.get(owner);
            if (tracker == null)
            {
                tracker = new AdaptiveLightTracker();
                VISIBILITY.put(owner, tracker);
            }
            int sky =
                owner.getWorldObj() == null
                ? 0
                : owner.getWorldObj()
                .getSavedLightValue(
                    EnumSkyBlock.Sky,
                    owner.xCoord,
                    owner.yCoord,
                    owner.zCoord);
            float temporalSky =
                owner.getWorldObj() == null
                ? 0.0F
                : owner.getWorldObj().getSunBrightness(partialTicks);
            visibility = tracker.sample(sky, temporalSky, System.nanoTime());
        }
    }

    private static final class PreferredCandidate
    {
        final ModelRendererTurbo part;
        final DetectedLightSurface surface;
        final boolean[] mask;
        final int faceIndex;
        final DetectedLightFace face;

        PreferredCandidate(
            ModelRendererTurbo part,
            DetectedLightSurface surface,
            boolean[] mask,
            int faceIndex,
            DetectedLightFace face)
        {
            this.part = part;
            this.surface = surface;
            this.mask = mask;
            this.faceIndex = faceIndex;
            this.face = face;
        }
    }

    private static final class Candidate
    {
        final ModelRendererTurbo part;
        final int phase;
        final String group;
        final boolean[] faceMask, illuminatedMask;
        final int faceIndex;
        final DetectedLightFace face;
        final float scale;
        final float[] matrix;
        final float area, modelX, modelY, modelZ, modelDx, modelDy, modelDz;
        float x, y, z, dx, dy, dz, rx, ry, rz, ux, uy, uz;

        Candidate(
            ModelRendererTurbo part,
            int phase,
            String group,
            boolean[] faceMask,
            boolean[] illuminatedMask,
            int faceIndex,
            DetectedLightFace face,
            float scale,
            float[] matrix)
        {
            this.part = part;
            this.phase = phase;
            this.group = group;
            this.faceMask = faceMask;
            this.illuminatedMask = illuminatedMask;
            this.faceIndex = faceIndex;
            this.face = face;
            this.scale = scale;
            this.matrix = matrix;
            area = face.area * scale * scale;
            modelX = face.modelX * scale;
            modelY = face.modelY * scale;
            modelZ = face.modelZ * scale;
            modelDx = face.modelNormalX;
            modelDy = face.modelNormalY;
            modelDz = face.modelNormalZ;
            float[] localNormal = outwardNormal(part, face);
            float[] p = point(matrix, face.x * scale, face.y * scale, face.z * scale);
            float[] n =
            direction(
                matrix, localNormal[0], localNormal[1], localNormal[2]);
            float[] basis =
            ClientRollingStockLighting.transformOpticalBasis(
                localNormal[0], localNormal[1], localNormal[2], matrix);
            x = p[0];
            y = p[1];
            z = p[2];
            dx = n[0];
            dy = n[1];
            dz = n[2];
            rx = basis[3];
            ry = basis[4];
            rz = basis[5];
            ux = basis[6];
            uy = basis[7];
            uz = basis[8];
        }

        void flip()
        {
            dx = -dx;
            dy = -dy;
            dz = -dz;
            rx = -rx;
            ry = -ry;
            rz = -rz;
        }
    }

    private static final class TextureEntry
    {
        volatile TextureSet ready;
    }

    private static final class ModelPartInventory
    {
        static final ModelPartInventory EMPTY =
        new ModelPartInventory(Collections.<PartReference>emptyList());
        final List<PartReference> parts;

        ModelPartInventory(List<PartReference> parts)
        {
            this.parts = parts;
        }
    }

    private static final class PartReference
    {
        final ModelRendererTurbo part;
        final String groupName;

        PartReference(ModelRendererTurbo part, String groupName)
        {
            this.part = part;
            this.groupName = groupName == null ? "" : groupName;
        }
    }

    private static final class StaticMetadata
    {
        final IdentityHashMap<ModelRendererTurbo, StaticPartMetadata> parts;

        StaticMetadata(IdentityHashMap<ModelRendererTurbo, StaticPartMetadata> parts)
        {
            this.parts = parts;
        }
    }

    private static final class StaticPartMetadata
    {
        final int phase;
        final String group;
        final boolean[] faceMask, illuminatedMask;
        final int faceIndex;
        final DetectedLightFace face;

        StaticPartMetadata(
            int phase,
            String group,
            boolean[] faceMask,
            boolean[] illuminatedMask,
            int faceIndex,
            DetectedLightFace face)
        {
            this.phase = phase;
            this.group = group;
            this.faceMask = faceMask;
            this.illuminatedMask = illuminatedMask;
            this.faceIndex = faceIndex;
            this.face = face;
        }
    }

    private static final class MetadataKey
    {
        final Object model;
        final PlacedModelLightProfile profile;
        final int generation;
        final int hash;

        MetadataKey(Object model, PlacedModelLightProfile profile, int generation)
        {
            this.model = model;
            this.profile = profile;
            this.generation = generation;
            hash =
            31 * (31 * System.identityHashCode(model) + System.identityHashCode(profile))
            + generation;
        }

        @Override
        public boolean equals(Object other)
        {
            if ((other instanceof MetadataKey) == false)
            {
                return false;
            }
            MetadataKey key = (MetadataKey) other;
            return model == key.model && profile == key.profile && generation == key.generation;
        }

        @Override
        public int hashCode()
        {
            return hash;
        }
    }

    private static final class TextureSet
    {
        static final TextureSet FAILED =
        new TextureSet(0, 0, new int[0], Collections.<int[]>emptyList(), true);
        final int width, height;
        final int[] off;
        final List<int[]> active;
        final boolean failed;

        TextureSet(int width, int height, int[] off, List<int[]> active, boolean failed)
        {
            this.width = width;
            this.height = height;
            this.off = off;
            this.active = Collections.unmodifiableList(active);
            this.failed = failed;
        }
    }

    private static final class TextureKey
    {
        final ResourceLocation off, first, second;
        final int generation;

        TextureKey(
            ResourceLocation off,
            ResourceLocation first,
            ResourceLocation second,
            int generation)
        {
            this.off = off;
            this.first = first;
            this.second = second;
            this.generation = generation;
        }

        @Override
        public boolean equals(Object other)
        {
            if (this == other)
            {
                return true;
            }
            if ((other instanceof TextureKey) == false)
            {
                return false;
            }
            TextureKey key = (TextureKey) other;
            return generation == key.generation
                   && off.equals(key.off)
                   && first.equals(key.first)
                   && java.util.Objects.equals(second, key.second);
        }

        @Override
        public int hashCode()
        {
            return java.util.Objects.hash(off, first, second, generation);
        }
    }
}
