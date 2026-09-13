package train.client.render.lighting;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.FloatBuffer;
import java.util.*;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import tmt.ModelPartLightTable;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightState;
import train.common.api.LightBeamRotation;
import train.common.api.RollingStockLightChannel;
import train.common.api.RollingStockLightColors;
import train.common.api.RollingStockLightDefinition;
import train.common.api.RollingStockLightFunction;
import train.common.api.RollingStockLightOverride;
import train.common.api.RollingStockLightOutput;
import train.common.api.RollingStockLightState;
import train.common.api.RollingStockHeadlightLevel;
import train.common.api.RollingStockSkinLighting;
import train.common.core.handlers.ConfigHandler;

/**
 * Connects TMT model-part rendering to Traincraft's rolling-stock lighting system.
 *
 * <p>A rendering caller opens one draw scope with {@link #begin(EntityRollingStock, float,
 * ResourceLocation)}, wraps each rendered model part with {@link #beginPart(ModelRendererTurbo,
 * float)} and {@link #endPart(PartLight)}, and finally releases the scope with {@link #end()}.
 */
public final class ClientRollingStockLighting
{
    /*
     * Positional float-array layouts used by the allocation-sensitive render path:
     * - vector: [0] = x, [1] = y, [2] = z;
     * - optical basis: [0..2] = direction x/y/z, [3..5] = right x/y/z,
     *   [6..8] = up x/y/z;
     * - OpenGL matrix: [0..3], [4..7], [8..11], and [12..15] are column-major columns 0..3;
     * - vertexOffsets[i]: [0] = vertex x, [1] = vertex y, [2] = vertex z.
     */
    private static final FloatBuffer MODEL_VIEW_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final ThreadLocal<Context> ACTIVE = new ThreadLocal<Context>();
    private static final int MAXIMUM_MODEL_CACHE_ENTRIES = 128;
    private static final float MINIMUM_LONGITUDINAL_DIRECTION = 0.05F;
    private static final float MINIMUM_GENERATED_GLOW_RADIUS = 0.04F;
    private static final float MAXIMUM_GENERATED_GLOW_RADIUS = 0.18F;
    private static final float GENERATED_GLOW_RADIUS_SCALE = 1.35F;
    private static final float COPLANAR_NORMAL_DOT_THRESHOLD = 0.999F;
    private static final float COPLANAR_DISTANCE_EPSILON = 1.0E-4F;
    private static final float GEOMETRY_EPSILON = 1.0E-5F;
    private static final float MINIMUM_INVERTIBLE_MATRIX_VALUE = 1.0E-8F;
    private static final float MINIMUM_DIRECTIONAL_NORMAL_COMPONENT = 0.5F;
    private static final float FACE_SCORE_EPSILON = 1.0E-5F;
    private static final float PRIME_TOP_GLOW_SCALE = 0.35F;
    private static final int FIRST_PRIME_PHASE = 1;
    private static final int LAST_PRIME_PHASE = 4;
    private static final BoundedIdentityCache<Object, Map<ModelRendererTurbo, String>>
    MODEL_LOCATORS =
        new BoundedIdentityCache<Object, Map<ModelRendererTurbo, String>>(
        MAXIMUM_MODEL_CACHE_ENTRIES);
    private static final BoundedIdentityCache<Object, Map<ModelRendererTurbo, FixtureMetadata>>
    MODEL_METADATA =
        new BoundedIdentityCache<Object, Map<ModelRendererTurbo, FixtureMetadata>>(
        MAXIMUM_MODEL_CACHE_ENTRIES);
    private static final BoundedSet<String> LOGGED_SUBMISSIONS = new BoundedSet<String>(2048);
    private static final Map<EntityRollingStock, RollingStockRuntimeState> RUNTIME_STATES =
        Collections.synchronizedMap(
            new WeakHashMap<EntityRollingStock, RollingStockRuntimeState>());
    private static final BoundedIdentityCache<Object, Integer> SEMANTIC_COUNTS =
        new BoundedIdentityCache<Object, Integer>(MAXIMUM_MODEL_CACHE_ENTRIES);
    private static final BoundedIdentityCache<Object, String> MODEL_SCOPES =
        new BoundedIdentityCache<Object, String>(MAXIMUM_MODEL_CACHE_ENTRIES);
    private static final BoundedIdentityCache<Object, PrimeTopMetadata> PRIME_TOP_METADATA =
        new BoundedIdentityCache<Object, PrimeTopMetadata>(MAXIMUM_MODEL_CACHE_ENTRIES);

    private ClientRollingStockLighting()
    {
    }

    /**
     * Opens the lighting scope for one rolling-stock render pass.
     *
     * <p>The scope is stored for the current render thread. Callers must pair this method with
     * {@link #end()}, including when model rendering exits early.
     *
     * @param stock rolling stock whose model is about to be rendered
     * @param partialTicks fraction of the current game tick used for animation sampling
     * @param texture active base or skin texture for the rendered model
     */
    public static void begin(
        EntityRollingStock stock, float partialTicks, ResourceLocation texture)
    {
        if (ConfigHandler.enhancedLightingEnabled() == false)
        {
            ACTIVE.remove();
            return;
        }
        ACTIVE.set(
            new Context(
                stock,
                stock.worldObj.getTotalWorldTime() + partialTicks,
                partialTicks,
                texture));
    }

    /** Clears the lighting scope associated with the current render thread. */
    public static void end()
    {
        ACTIVE.remove();
    }

    /**
     * Reports whether the current render thread has an open rolling-stock lighting scope.
     *
     * @return {@code true} while a scope opened by {@link #begin} remains active
     */
    public static boolean isActive()
    {
        return ACTIVE.get() != null;
    }

    /**
     * Reports whether a model part declares a light fixture.
     *
     * @param modelPart model geometry to inspect
     * @return {@code true} when the part has a stable fixture id or recognized light-part name
     */
    public static boolean isSemantic(ModelRendererTurbo modelPart)
    {
        return modelPart != null
               && (modelPart.lightFixtureId != null
                   || RollingStockLightChannel.fromTaggedPartName(modelPart.boxName) != null);
    }

    /**
     * Prepares lightmap and effect state before rendering one model part.
     *
     * <p>Parts without a fixture id or recognized light-part name, inactive fixtures, and calls outside
     * an active scope return a no-op token. Every returned token must be passed to
     * {@link #endPart(PartLight)} so any changed OpenGL lightmap state is restored.
     *
     * @param modelPart model part about to be rendered
     * @param modelScale scale used to convert model coordinates into render coordinates
     * @return state token that owns any temporary lightmap changes
     */
    public static PartLight beginPart(ModelRendererTurbo modelPart, float modelScale)
    {
        Context context = ACTIVE.get();
        if (context == null
                || isSemantic(modelPart) == false)
        {
            return PartLight.NONE;
        }
        FixtureMetadata fixtureMetadata = fixtureMetadata(context, modelPart, modelScale);
        DetectedLightSurface surface = fixtureMetadata.surface;
        ResolvedFixture resolvedFixture = context.resolveFixture(fixtureMetadata);
        RollingStockLightDefinition definition = resolvedFixture.definition;
        int primePhase = primePhase(modelPart.boxName);
        DetectedLightFace selectedPrime =
            primePhase > 0 ? selectPrimePhaseFace(surface, primePhase, context) : null;
        if (selectedPrime != null)
        {
            surface = surface.select(selectedPrime);
        }
        List<DetectedLightSurface> sourceSurfaces =
            selectSourceSurfaces(modelPart, surface, selectedPrime);
        RollingStockLightOutput output = context.sampleOutput(definition);
        float intensity = output.sourceIntensity();
        // An inactive fixture is ordinary ambient display-list geometry. Avoid
        // lightmap state traffic, matrix readbacks and Prime immediate drawing
        // when there is no visual lighting work for this part.
        if (intensity <= 0)
        {
            return PartLight.NONE;
        }
        float oldX = OpenGlHelper.lastBrightnessX, oldY = OpenGlHelper.lastBrightnessY;
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        boolean oldLightmapEnabled = GL11.glIsEnabled(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        RollingStockLightOverride availabilityOverride = resolvedFixture.override;
        boolean explicitlyAvailable =
            availabilityOverride != null && availabilityOverride.availabilityOverridden();
        ResourceLocation lightTexture =
                resolveEffectiveTexture(
                context.stock.modelInstance,
                modelPart,
                context.modelTexture,
                Tessellator.getLastTextureUri());
        boolean available =
            explicitlyAvailable
            ? availabilityOverride.enabled()
            : RollingStockLightChannel.taggedPartIsInterior(modelPart.boxName)
            || (fixtureMetadata.definition.taggedUvRegions().isEmpty() == false
                && resolvedFixture.sourceVisible(lightTexture, sourceSurfaces));
        float effectX = oldX, effectY = oldY;
        float[] pose = null;
        if (available)
        {
            ModelPartLightTable.Mode lightmapMode = context.partLights.mode(definition.id());
            if (lightmapMode == ModelPartLightTable.Mode.LIGHT_FLOOR)
            {
                effectX = Math.max(oldX, definition.lightmapFloor());
            }
            else
            {
                if (lightmapMode == ModelPartLightTable.Mode.EMISSION_INTENSITY)
                {
                    effectX = Math.max(
                        oldX, RollingStockLightDefinition.MAXIMUM_LIGHTMAP_FLOOR * intensity);
                }
                else
                {
                    if (lightmapMode == ModelPartLightTable.Mode.FULL_BRIGHT)
                    {
                        effectX = Math.max(
                            oldX, RollingStockLightDefinition.MAXIMUM_LIGHTMAP_FLOOR);
                        effectY = Math.max(
                            oldY, RollingStockLightDefinition.MAXIMUM_LIGHTMAP_FLOOR);
                    }
                }
            }
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, effectX, effectY);
            if (definition.effect() != RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE)
            {
                pose = captureModelViewMatrix();
                boolean multipleSources = sourceSurfaces.size() > 1;
                for (DetectedLightSurface sourceSurface : sourceSurfaces)
                {
                    String submissionKey =
                        multipleSources && sourceSurface.sourceFace != null
                        ? definition.id() + ":face" + sourceSurface.sourceFace.faceIndex
                        : definition.id();
                    submitFixtureEffects(
                        context,
                        definition,
                        submissionKey,
                        sourceSurface,
                        modelScale,
                        intensity,
                        output.projectedIntensity(),
                        pose);
                }
                submitCommanderSurfaceGlows(
                    context,
                    fixtureMetadata,
                    definition,
                    modelScale,
                    intensity,
                    pose);
            }
        }
        DetectedLightFace primeTop = context.primeTopFace(modelPart);
        if (intensity > 0
                && primeTop != null
                && (explicitlyAvailable
                    ? availabilityOverride.enabled()
                    : hasUsableUv(primeTop)
                    && resolvedFixture.primeVisible(lightTexture, primeTop)))
        {
            if (pose == null)
            {
                pose = captureModelViewMatrix();
            }
            submitPrimeTop(context, definition, primeTop, modelScale, intensity, pose);
        }
        return new PartLight(
                   true,
                   oldX,
                   oldY,
                   oldLightmapEnabled,
                   effectX,
                   effectY,
                   selectedPrime == null ? -1 : selectedPrime.faceIndex);
    }

    /**
     * Restores lightmap state changed for a rendered model part.
     *
     * @param partLight state token returned by {@link #beginPart(ModelRendererTurbo, float)}
     */
    public static void endPart(PartLight partLight)
    {
        if (partLight.lightmapChanged)
        {
            OpenGlHelper.setLightmapTextureCoords(
                OpenGlHelper.lightmapTexUnit,
                partLight.ambientLightmapX,
                partLight.ambientLightmapY);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            if (partLight.ambientLightmapEnabled)
            {
                GL11.glEnable(GL11.GL_TEXTURE_2D);
            }
            else
            {
                GL11.glDisable(GL11.GL_TEXTURE_2D);
            }
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        }
    }

    /** Creates a stable fixture identifier when model metadata does not provide one explicitly. */
    private static String createFallbackFixtureId(
        Context context,
        ModelRendererTurbo modelPart,
        RollingStockLightChannel channel)
    {
        String locator = context.partLocators.get(modelPart);
        if (locator != null)
        {
            return "auto:"
                   + context.modelScope
                   + ":"
                   + channel.name().toLowerCase(Locale.ROOT)
                   + ":model0:"
                   + locator
                   + ":"
                   + normalizeIdentifier(modelPart.boxName);
        }
        int hash = 17;
        hash = 31 * hash + (modelPart.boxName == null ? 0 : modelPart.boxName.hashCode());
        hash = 31 * hash + Float.floatToIntBits(modelPart.rotationPointX);
        hash = 31 * hash + Float.floatToIntBits(modelPart.rotationPointY);
        hash = 31 * hash + Float.floatToIntBits(modelPart.rotationPointZ);
        return "auto:" + context.modelScope + ":" + Integer.toHexString(hash);
    }

    /** Converts model-provided text into the restricted form used by fixture identifiers. */
    private static String normalizeIdentifier(String value)
    {
        return value == null
               ? "unnamed"
               : value.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_.-]", "_");
    }

    /**
     * Locates each TMT part within a model's public part arrays.
     *
     * <p>Rolling-stock model classes do not expose a common part-enumeration contract, so this cold path
     * reflects over their public {@code ModelRendererTurbo[]} fields once and caches the result.
     * Inaccessible optional arrays are omitted; their parts fall back to geometry-derived fixture
     * identifiers.
     *
     * @param model rolling-stock model instance to inspect
     * @return cached mapping from model-part identity to stable array location
     */
    static Map<ModelRendererTurbo, String> modelPartLocators(Object model)
    {
        if (model == null)
        {
            return Collections.emptyMap();
        }
        Map<ModelRendererTurbo, String> cached = MODEL_LOCATORS.get(model);
        if (cached != null)
        {
            return cached;
        }
        IdentityHashMap<ModelRendererTurbo, String> result =
            new IdentityHashMap<ModelRendererTurbo, String>();
        List<Field> fields = new ArrayList<Field>();
        for (Field field : model.getClass().getFields())
        {
            if (Modifier.isStatic(field.getModifiers()) == false
                    && field.getType() == ModelRendererTurbo[].class)
            {
                fields.add(field);
            }
        }
        Collections.sort(
            fields,
            new Comparator<Field>()
        {
            @Override
            public int compare(Field firstField, Field secondField)
            {
                return firstField.getName().compareTo(secondField.getName());
            }
        });
        for (Field field : fields)
        {
            try
            {
                ModelRendererTurbo[] parts = (ModelRendererTurbo[]) field.get(model);
                if (parts != null)
                {
                    for (int i = 0; i < parts.length; i++)
                    {
                        if (parts[i] != null && result.containsKey(parts[i]) == false)
                        {
                            result.put(parts[i], field.getName() + i);
                        }
                    }
                }
            }
            catch (IllegalAccessException ignored)
            {
            }
        }
        MODEL_LOCATORS.put(model, result);
        return result;
    }

    /**
     * Clears model-derived lighting metadata after resources or models are reloaded.
     *
     * <p>This also releases draw-scoped and per-entity runtime state so stale definitions cannot
     * survive a resource generation change.
     */
    public static void clearCaches()
    {
        clearWorldState();
        MODEL_LOCATORS.clear();
        MODEL_METADATA.clear();
        LOGGED_SUBMISSIONS.clear();
        SEMANTIC_COUNTS.clear();
        MODEL_SCOPES.clear();
        PRIME_TOP_METADATA.clear();
        SpecialBeaconSurfaceExtraction.clear();
    }

    /** Clears render-thread and per-entity state when leaving or replacing a world. */
    static void clearWorldState()
    {
        ACTIVE.remove();
        RUNTIME_STATES.clear();
    }

    /**
     * Reports whether cached model metadata contains a steady headlight projector in one direction.
     *
     * <p>Metadata is populated during model rendering. Before the model has been inspected, this
     * method safely reports that no matching projector is known.
     *
     * @param stock rolling stock whose resolved skin profile should be inspected
     * @param longitudinalDirection negative for the rear and zero or positive for the front
     * @return {@code true} when a compatible projector faces the requested direction
     */
    public static boolean hasProjectorFacing(
        EntityRollingStock stock, int longitudinalDirection)
    {
        Object model = stock.modelInstance;
        if (model == null)
        {
            return false;
        }
        Map<ModelRendererTurbo, FixtureMetadata> metadata = MODEL_METADATA.get(model);
        if (metadata == null)
        {
            return false;
        }
        for (FixtureMetadata fixture : metadata.values())
        {
            RollingStockLightDefinition definition =
                SkinLightingResolver.resolveDefinition(
                    stock.getSkinLighting().lightOverrides(), fixture.definition);
            if (definition.clientProjectorEligible()
                    && definition.channel() == RollingStockLightChannel.HEADLIGHT
                    && definition.controlCircuit() == RollingStockLightChannel.HEADLIGHT
                    && definition.effect() == RollingStockLightDefinition.Effect.BEAM
                    && definition.function().pattern()
                    == RollingStockLightFunction.Pattern.STEADY
                && ((longitudinalDirection < 0
                     && definition.directionX() < -MINIMUM_LONGITUDINAL_DIRECTION)
                    || (longitudinalDirection >= 0
                        && definition.directionX() > MINIMUM_LONGITUDINAL_DIRECTION)))
            {
                return true;
            }
        }
        return false;
    }

    /** Resolves authored multi-sided source faces while retaining the normal single-face path. */
    private static List<DetectedLightSurface> selectSourceSurfaces(
        ModelRendererTurbo modelPart,
        DetectedLightSurface surface,
        DetectedLightFace selectedPrime)
    {
        if (selectedPrime != null
                || modelPart.lightSourceFaceIndices == null
                || modelPart.lightSourceFaceIndices.length < 2)
        {
            return Collections.singletonList(surface);
        }
        List<DetectedLightSurface> selected = new ArrayList<DetectedLightSurface>();
        for (int faceIndex : modelPart.lightSourceFaceIndices)
        {
            for (DetectedLightFace face : surface.faces)
            {
                if (face.faceIndex == faceIndex)
                {
                    selected.add(surface.select(face));
                    break;
                }
            }
        }
        return selected.isEmpty() ? Collections.singletonList(surface) : selected;
    }

    /**
     * Reports whether this stock currently has a fixture that can require beam occlusion data.
     *
     * <p>A stock's own emission-only fixtures do not, by themselves, trigger per-part pose
     * readbacks or framebuffer depth copies. Separate scene demand may still capture that stock as
     * a candidate occluder for another vehicle's projected beam. Unknown model metadata is handled
     * conservatively until the first successful model render resolves shared fixture metadata.
     * Subsequent entities using that model immediately use the resolved result in every render
     * context.
     *
     * @param stock rolling stock whose resolved fixtures should be sampled
     * @param animationTime shared world time including the current partial tick
     * @return whether at least one fixture currently emits a projected beam
     */
    public static boolean requiresBeamOcclusion(EntityRollingStock stock, double animationTime)
    {
        if (stock == null || stock.modelInstance == null)
        {
            return false;
        }
        Map<ModelRendererTurbo, FixtureMetadata> metadata =
            MODEL_METADATA.get(stock.modelInstance);
        if (metadata == null)
        {
            return true;
        }
        RollingStockSkinLighting skin = stock.getSkinLighting();
        Map<String, RollingStockLightOverride> overrides = skin.lightOverrides();
        IRollingStockLightState lightState =
            stock instanceof IRollingStockLightState
            ? (IRollingStockLightState) stock
            : null;
        for (FixtureMetadata fixture : metadata.values())
        {
            RollingStockLightOverride override = overrides.get(fixture.definition.id());
            if (override != null
                    && override.availabilityOverridden()
                    && override.enabled() == false)
            {
                continue;
            }
            RollingStockLightDefinition definition =
                SkinLightingResolver.resolveDefinition(overrides, fixture.definition);
            float projectedIntensity =
                RollingStockLightState.outputForState(lightState, definition, animationTime)
                .projectedIntensity();
            if (requiresBeamOcclusion(definition, projectedIntensity))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks once per rendered frame whether any loaded rolling stock can submit a projected beam.
     * Unknown light-bearing models are conservative until their shared fixture metadata resolves.
     *
     * @param world client world whose loaded rolling stock should be inspected
     * @param animationTime shared world time, including the current partial tick
     * @return {@code true} when exact rolling-stock occlusion capture may be needed
     */
    public static boolean worldRequiresBeamOcclusion(World world, double animationTime)
    {
        BeamOcclusionDemand demand = new BeamOcclusionDemand();
        populateBeamOcclusionDemand(world, animationTime, demand);
        return demand.any();
    }

    /**
     * Populates the frame-local spatial demand used to gate rolling-stock geometry capture.
     *
     * <p>This is intentionally a single world scan. Known fixtures contribute only their longest
     * currently projected beam; unresolved semantic models request conservative global capture so
     * their first rendered frame cannot leak through nearby stock.
     */
    static void populateBeamOcclusionDemand(
        World world, double animationTime, BeamOcclusionDemand demand)
    {
        demand.reset();
        if (ConfigHandler.projectedLightingEnabled() == false || world == null)
        {
            return;
        }
        List entities = world.loadedEntityList;
        for (int index = 0; index < entities.size(); index++)
        {
            Object entityCandidate = entities.get(index);
            if (entityCandidate instanceof EntityRollingStock == false)
            {
                continue;
            }
            EntityRollingStock stock = (EntityRollingStock) entityCandidate;
            if (lightStateMayProject(stock) == false)
            {
                continue;
            }
            if (stock.modelInstance == null)
            {
                // Its fixture capabilities are unknown until the first model render.
                demand.includeUnknownReach();
                continue;
            }
            Map<ModelRendererTurbo, FixtureMetadata> metadata = MODEL_METADATA.get(stock.modelInstance);
            if (metadata == null)
            {
                boolean hasSemanticPart = false;
                for (ModelRendererTurbo part : modelPartLocators(stock.modelInstance).keySet())
                {
                    if (isSemantic(part))
                    {
                        hasSemanticPart = true;
                        break;
                    }
                }
                if (hasSemanticPart)
                {
                    demand.includeUnknownReach();
                }
                continue;
            }
            int declaredSemanticParts =
                countSemanticParts(stock.modelInstance, modelPartLocators(stock.modelInstance));
            if (metadata.size() < declaredSemanticParts)
            {
                demand.includeUnknownReach();
                continue;
            }
            float reach = activeBeamReach(stock, metadata, animationTime);
            if (reach > 0.0F)
            {
                demand.add(
                    stock.getEntityId(), stock.posX, stock.posY, stock.posZ,
                    reach + RollingStockLightOcclusion.stockBoundingRadius(stock));
            }
        }
    }

    /** Returns the longest currently projected beam reach resolved for one stock model. */
    private static float activeBeamReach(
        EntityRollingStock stock,
        Map<ModelRendererTurbo, FixtureMetadata> metadata,
        double animationTime)
    {
        RollingStockSkinLighting skin = stock.getSkinLighting();
        Map<String, RollingStockLightOverride> overrides = skin.lightOverrides();
        IRollingStockLightState lightState =
            stock instanceof IRollingStockLightState
            ? (IRollingStockLightState) stock
            : null;
        float maximumReach = 0.0F;
        for (FixtureMetadata fixture : metadata.values())
        {
            RollingStockLightOverride override = overrides.get(fixture.definition.id());
            if (override != null
                    && override.availabilityOverridden()
                    && override.enabled() == false)
            {
                continue;
            }
            RollingStockLightDefinition definition =
                SkinLightingResolver.resolveDefinition(overrides, fixture.definition);
            float projectedIntensity =
                RollingStockLightState.outputForState(lightState, definition, animationTime)
                .projectedIntensity();
            if (requiresBeamOcclusion(definition, projectedIntensity))
            {
                maximumReach = Math.max(maximumReach, definition.beamLength());
            }
        }
        return maximumReach;
    }

    /**
     * A state without a BRIGHT headlight or enabled non-headlight circuit can skip cold discovery.
     */
    private static boolean lightStateMayProject(EntityRollingStock stock)
    {
        if (stock instanceof IRollingStockLightState == false)
        {
            return true;
        }
        IRollingStockLightState lightState = (IRollingStockLightState) stock;
        if (lightState.getFrontHeadlightLevel() == RollingStockHeadlightLevel.BRIGHT
                || lightState.getRearHeadlightLevel() == RollingStockHeadlightLevel.BRIGHT)
        {
            return true;
        }
        for (RollingStockLightChannel channel : RollingStockLightChannel.values())
        {
            if (channel != RollingStockLightChannel.HEADLIGHT
                    && lightState.isLightChannelEnabled(channel))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the control circuits exposed by currently resolved fixture metadata.
     *
     * <p>The headlight circuit is always returned because front and rear headlight state is part of
     * the base light-state contract. Optional circuits appear only after model metadata and active
     * skin overrides resolve; open GUIs periodically query this method so they can add those
     * controls in place.
     *
     * @param stock rolling stock whose resolved fixtures should be inspected
     * @return a new mutable set containing the available circuits
     */
    public static EnumSet<RollingStockLightChannel> availableControlCircuits(
        EntityRollingStock stock)
    {
        EnumSet<RollingStockLightChannel> result =
            EnumSet.of(RollingStockLightChannel.HEADLIGHT);
        if (stock == null || stock.modelInstance == null)
        {
            return result;
        }
        Map<ModelRendererTurbo, FixtureMetadata> metadata = MODEL_METADATA.get(stock.modelInstance);
        if (metadata == null)
        {
            return result;
        }
        Map<String, RollingStockLightOverride> overrides =
            stock.getSkinLighting().lightOverrides();
        for (FixtureMetadata fixture : metadata.values())
        {
            RollingStockLightOverride override = overrides.get(fixture.definition.id());
            if (override != null && override.availabilityOverridden() && override.enabled() == false)
            {
                continue;
            }
            RollingStockLightDefinition definition =
                SkinLightingResolver.resolveDefinition(overrides, fixture.definition);
            result.add(definition.controlCircuit());
        }
        return result;
    }

    static boolean requiresBeamOcclusion(
        RollingStockLightDefinition definition, float intensity)
    {
        return definition != null
               && intensity > 0.0F
               && definition.effect() == RollingStockLightDefinition.Effect.BEAM
               && definition.beamLength() > 0.0F
               && definition.beamWidth() > 0.0F;
    }

    /** Builds and caches the detected surface and default definition for one semantic model part. */
    private static FixtureMetadata fixtureMetadata(
        Context context, ModelRendererTurbo modelPart, float modelScale)
    {
        Object owner = context.stock.modelInstance;
        Map<ModelRendererTurbo, FixtureMetadata> values = MODEL_METADATA.get(owner);
        if (values == null)
        {
            values = new IdentityHashMap<ModelRendererTurbo, FixtureMetadata>();
            MODEL_METADATA.put(owner, values);
        }
        FixtureMetadata cached = values.get(modelPart);
        if (cached != null)
        {
            return cached;
        }
        DetectedLightSurface surface =
            AutomaticLightSurfaceDetection.detect(
                modelPart,
                context.stock.modelOffsets(),
                context.stock.modelRotations(),
                context.stock.getRenderScale());
        RollingStockLightChannel channel =
            RollingStockLightChannel.fromTaggedPartName(modelPart.boxName);
        // ID-only fixtures are configured by their entity profile. HEADLIGHT supplies a safe,
        // steady compatibility baseline until that profile replaces the inferred behavior.
        if (channel == null)
        {
            channel = RollingStockLightChannel.HEADLIGHT;
        }
        String fixtureId =
            modelPart.lightFixtureId != null
            ? modelPart.lightFixtureId
            : modelPart.lightFixtureGroup != null
            ? "auto:"
            + context.modelScope
            + ":"
            + channel.name().toLowerCase(Locale.ROOT)
            + ":group:"
            + normalizeIdentifier(modelPart.lightFixtureGroup)
            : createFallbackFixtureId(context, modelPart, channel);
        boolean instrument =
                    RollingStockLightChannel.taggedPartIsInstrument(modelPart.boxName),
                interior =
                    RollingStockLightChannel.taggedPartIsInterior(modelPart.boxName),
                illuminated =
                    RollingStockLightChannel.taggedPartIsIlluminatedSurface(modelPart.boxName),
                beamChannel =
                    instrument == false
                    && interior == false
                    && (channel == RollingStockLightChannel.HEADLIGHT
                        || channel == RollingStockLightChannel.DITCH),
                    producesBeam = beamChannel && surface.beamInferred && illuminated == false;
        RollingStockLightDefinition.Effect effect =
            instrument || interior
            ? RollingStockLightDefinition.Effect.EMISSIVE_ONLY
            : illuminated
            ? RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE
            : producesBeam
            ? RollingStockLightDefinition.Effect.BEAM
            : RollingStockLightDefinition.Effect.EMISSIVE_ONLY;
        String lower = modelPart.boxName == null
                       ? ""
                       : modelPart.boxName.toLowerCase(Locale.ROOT);
        List<CommanderSurface> commanderSurfaces =
            lower.contains("commander")
            ? mergeCommanderSurfaces(context, surface.faces)
            : Collections.<CommanderSurface>emptyList();
        boolean orange = lower.contains("commander") || lower.contains("prime");
        int color = orange
                    ? RollingStockLightColors.AMBER
                    : beamChannel
                      ? RollingStockLightColors.WARM_WHITE
                      : RollingStockLightColors.WHITE;
        ModelRendererTurbo.LightSourceGlowShape shape = modelPart.lightSourceGlowShape;
        float[] definitionDirection = context.calculateDefinitionDirection(surface);
        float glowRadius =
            instrument || interior || illuminated || lower.contains("commander")
            ? 0
            : Math.max(
                MINIMUM_GENERATED_GLOW_RADIUS,
                Math.min(
                    MAXIMUM_GENERATED_GLOW_RADIUS,
                    surface.radius * modelScale * GENERATED_GLOW_RADIUS_SCALE));
        float beamLength =
            producesBeam
            ? (channel == RollingStockLightChannel.DITCH
               ? RollingStockLightDefinition.DEFAULT_DITCH_LIGHT_BEAM_LENGTH
               : RollingStockLightDefinition.DEFAULT_HEADLIGHT_BEAM_LENGTH)
            : 0;
        List<RollingStockLightDefinition.UvRegion> uvRegions =
            collectTexturedUvRegions(surface);
        RollingStockLightDefinition definition =
            RollingStockLightDefinition.builder(fixtureId, channel)
            .position(
                surface.x * modelScale, surface.y * modelScale, surface.z * modelScale)
            .direction(
                definitionDirection[0],
                definitionDirection[1],
                definitionDirection[2])
            .beamRotation(
                modelPart.lightBeamRotation == null
                ? LightBeamRotation.NONE
                : modelPart.lightBeamRotation)
            .color(color)
            .effect(effect)
            .beamDimensions(
                beamLength,
                producesBeam ? RollingStockLightDefinition.DEFAULT_HEADLIGHT_BEAM_WIDTH : 0)
            .sourceGlow(
                glowRadius,
                instrument || interior || illuminated
                ? 0
                : RollingStockLightDefinition.DEFAULT_SOURCE_GLOW_INTENSITY)
            .sourceGlowShape(
                shape == null ? 1 : shape.widthScale(),
                shape == null ? 1 : shape.heightScale(),
                shape == null ? 0 : shape.rightOffset(),
                shape == null ? 0 : shape.upOffset())
            .function(RollingStockLightChannel.defaultFunction(modelPart.boxName))
            .lightmapFloor(
                illuminated && lower.contains("numberboard")
                ? RollingStockLightDefinition.DEFAULT_NUMBERBOARD_LIGHTMAP_FLOOR
                : RollingStockLightDefinition.DEFAULT_LIGHTMAP_FLOOR)
            .hotspotEnabled(producesBeam)
            .clientProjectorEligible(beamChannel && producesBeam)
            .instrument(instrument)
            .taggedPart(fixtureId, uvRegions)
            .build();
        modelPart.lightDefinitionId = fixtureId;
        if (primePhase(modelPart.boxName) > 0)
        {
            modelPart.lightExteriorFaceOnly = true;
            DetectedLightFace selected =
                selectPrimePhaseFace(surface, primePhase(modelPart.boxName), context);
            modelPart.lightExteriorFaceIndex = selected == null ? -1 : selected.faceIndex;
        }
        if (uvRegions.isEmpty()
                && LOGGED_SUBMISSIONS.add("untextured\n" + context.modelScope + "\n" + fixtureId))
        {
            Traincraft.tcLog.warn(
                "Tagged light fixture {} in model {} has no usable texture coordinates; its automatic effects are disabled.",
                fixtureId,
                context.modelScope);
        }
        FixtureMetadata created =
            new FixtureMetadata(
            surface,
            definition,
            modelPart.lightFixtureGroup == null
            ? null
            : normalizeIdentifier(modelPart.lightFixtureGroup),
            commanderSurfaces);
        values.put(modelPart, created);
        return created;
    }

    /**
     * Records every polygon UV belonging to an automatically tagged fixture. Degenerate/default
     * coordinates do not describe texture area and must not turn the texture's (0,0) pixel into a
     * false light source.
     */
    static List<RollingStockLightDefinition.UvRegion> collectTexturedUvRegions(
        DetectedLightSurface surface)
    {
        List<RollingStockLightDefinition.UvRegion> regions =
            new ArrayList<RollingStockLightDefinition.UvRegion>();
        for (DetectedLightFace face : surface.faces)
        {
            if (hasUsableUv(face))
            {
                regions.add(
                    new RollingStockLightDefinition.UvRegion(
                        face.minU, face.minV, face.maxU, face.maxV));
            }
        }
        return Collections.unmodifiableList(regions);
    }

    /** Reports whether a detected face covers a finite, nonzero texture region. */
    static boolean hasUsableUv(DetectedLightFace face)
    {
        return face != null
               && isFinite(face.minU)
               && isFinite(face.minV)
               && isFinite(face.maxU)
               && isFinite(face.maxV)
               && face.maxU - face.minU > 1.0E-7F
               && face.maxV - face.minV > 1.0E-7F;
    }

    private static boolean isFinite(float value)
    {
        return Float.isNaN(value) == false && Float.isInfinite(value) == false;
    }

    /** Uses the selected face when present and otherwise checks the detected source surface. */
    private static boolean isSourceVisible(
        ResourceLocation texture,
        DetectedLightSurface surface,
        DetectedLightFace selectedFace)
    {
        DetectedLightFace source = selectedFace == null ? surface.sourceFace : selectedFace;
        return source == null
               ? TextureAlphaMaskCache.visible(texture, surface)
               : TextureAlphaMaskCache.visible(texture, source);
    }

    /**
     * Resolves the texture whose alpha controls whether a model part supplies visible light.
     *
     * <p>Nested submodels may bind their own texture while rendering, so their active binding takes
     * precedence over the root rolling-stock texture.
     */
    static ResourceLocation resolveEffectiveTexture(
        Object rootModel,
        ModelRendererTurbo modelPart,
        ResourceLocation rootTexture,
        ResourceLocation currentlyBoundTexture)
    {
        if (modelPart != null
                && modelPart.getModelOwner() != null
                && modelPart.getModelOwner() != rootModel
                && currentlyBoundTexture != null)
        {
            return currentlyBoundTexture;
        }
        return rootTexture == null ? currentlyBoundTexture : rootTexture;
    }

    /** Selects how fixture intensity modifies the model-part lightmap for the current part. */
    private static ModelPartLightTable.Mode selectLightmapMode(
        RollingStockLightDefinition definition, float intensity)
    {
        if (intensity <= 0)
        {
            return ModelPartLightTable.Mode.AMBIENT;
        }
        if (definition.effect() == RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE)
        {
            return ModelPartLightTable.Mode.LIGHT_FLOOR;
        }
        RollingStockLightFunction.Pattern pattern = definition.function().pattern();
        if (pattern == RollingStockLightFunction.Pattern.PHASED
                || pattern == RollingStockLightFunction.Pattern.ALTERNATING)
        {
            return ModelPartLightTable.Mode.EMISSION_INTENSITY;
        }
        return intensity < 1
               ? ModelPartLightTable.Mode.LIGHT_FLOOR
               : ModelPartLightTable.Mode.FULL_BRIGHT;
    }

    /**
     * Converts a detected model-space face direction into the fixture direction convention.
     *
     * @param surface detected light surface providing the model-space normal
     * @param modelScale optional three-component model scale, including mirrored axes
     * @param modelRotations optional X/Y/Z model rotations in degrees
     * @return normalized fixture direction in assembled rolling-stock coordinates
     */
    static float[] calculateDefinitionDirection(
        DetectedLightSurface surface, float[] modelScale, float[] modelRotations)
    {
        float[] value =
            new float[] {surface.modelNormalX, surface.modelNormalY, surface.modelNormalZ};
        if (modelScale != null && modelScale.length >= 3)
        {
            value[0] *= modelScale[0];
            value[1] *= modelScale[1];
            value[2] *= modelScale[2];
        }
        if (modelRotations != null && modelRotations.length >= 3)
        {
            rotateZ(value, (float) Math.toRadians(modelRotations[2]));
            rotateY(value, (float) Math.toRadians(modelRotations[1]));
            rotateX(value, (float) Math.toRadians(modelRotations[0]));
        }
        value[0] = -value[0];
        value[2] = -value[2];
        float length =
            (float) Math.sqrt(value[0] * value[0] + value[1] * value[1] + value[2] * value[2]);
        if (length > GEOMETRY_EPSILON)
        {
            value[0] /= length;
            value[1] /= length;
            value[2] /= length;
        }
        return value;
    }

    private static void rotateX(float[] direction, float angleRadians)
    {
        if (angleRadians == 0)
        {
            return;
        }
        float cosine = (float) Math.cos(angleRadians),
              sine = (float) Math.sin(angleRadians),
              y = direction[1] * cosine - direction[2] * sine,
              z = direction[1] * sine + direction[2] * cosine;
        direction[1] = y;
        direction[2] = z;
    }

    private static void rotateY(float[] direction, float angleRadians)
    {
        if (angleRadians == 0)
        {
            return;
        }
        float cosine = (float) Math.cos(angleRadians),
              sine = (float) Math.sin(angleRadians),
              x = direction[0] * cosine + direction[2] * sine,
              z = -direction[0] * sine + direction[2] * cosine;
        direction[0] = x;
        direction[2] = z;
    }

    private static void rotateZ(float[] direction, float angleRadians)
    {
        if (angleRadians == 0)
        {
            return;
        }
        float cosine = (float) Math.cos(angleRadians),
              sine = (float) Math.sin(angleRadians),
              x = direction[0] * cosine - direction[1] * sine,
              y = direction[0] * sine + direction[1] * cosine;
        direction[0] = x;
        direction[1] = y;
    }

    /** Submits the glow, beam, and special surfaces produced by one active fixture. */
    private static void submitFixtureEffects(
        Context context,
        RollingStockLightDefinition definition,
        String submissionKey,
        DetectedLightSurface surface,
        float modelScale,
        float sourceOutput,
        float projectedOutput,
        float[] modelViewMatrix)
    {
        float localX = surface.x * modelScale,
              localY = surface.y * modelScale,
              localZ = surface.z * modelScale;
        float eyeX = modelViewMatrix[0] * localX
                     + modelViewMatrix[4] * localY
                     + modelViewMatrix[8] * localZ
                     + modelViewMatrix[12],
              eyeY = modelViewMatrix[1] * localX
                     + modelViewMatrix[5] * localY
                     + modelViewMatrix[9] * localZ
                     + modelViewMatrix[13],
              eyeZ = modelViewMatrix[2] * localX
                     + modelViewMatrix[6] * localY
                     + modelViewMatrix[10] * localZ
                     + modelViewMatrix[14];
        // Build both optical bases in fixture-local space. The complete
        // bases are then transformed by the submission-time pose; no camera
        // axis from the later world-last pass participates in their roll.
        float[] sourceLocal =
            normalizeDirection(surface.normalX, surface.normalY, surface.normalZ);
        float[] aimedBeamLocal =
            definition.beamRotation().apply(
                sourceLocal[0], sourceLocal[1], sourceLocal[2]);
        float[] beamLocal =
            AnimatedLightDirection.sample(
                aimedBeamLocal[0],
                aimedBeamLocal[1],
                aimedBeamLocal[2],
                definition.function(),
                context.animationTime);
        float[] sourceBasis =
            AnimatedLightDirection.basis(sourceLocal[0], sourceLocal[1], sourceLocal[2]);
        float[] beamBasis = AnimatedLightDirection.basis(beamLocal[0], beamLocal[1], beamLocal[2]);
        float[] sourceEye =
            transformOpticalBasis(
                sourceLocal[0], sourceLocal[1], sourceLocal[2], modelViewMatrix);
        float[] beamEye =
            transformOpticalBasis(beamLocal[0], beamLocal[1], beamLocal[2], modelViewMatrix);
        float sourceDirectionX = sourceEye[0],
              sourceDirectionY = sourceEye[1],
              sourceDirectionZ = sourceEye[2];
        float beamDirectionX = beamEye[0],
              beamDirectionY = beamEye[1],
              beamDirectionZ = beamEye[2],
              sourceIntensity = sourceOutput;
        if (definition.function().pattern()
                    == RollingStockLightFunction.Pattern.GYRALITE
                || definition.function().pattern()
                 == RollingStockLightFunction.Pattern.MARS)
        {
            sourceIntensity *=
                AnimatedLightDirection.viewerGlowScale(
                    eyeX, eyeY, eyeZ, beamDirectionX, beamDirectionY, beamDirectionZ);
        }
        else
        {
            if (definition.function().pattern()
                    == RollingStockLightFunction.Pattern.PHASED)
            {
                sourceIntensity *=
                    AnimatedLightDirection.viewerSurfaceGlowScale(
                        eyeX,
                        eyeY,
                        eyeZ,
                        sourceDirectionX,
                        sourceDirectionY,
                        sourceDirectionZ);
            }
        }
        float fixtureReach =
            BeamVisibilityScaling.fixtureReach(
                projectedOutput, definition.function().lampResponse());
        LightEffectRenderBatch.submit(
            LightEffectSubmission.fixtureLocal(
                modelViewMatrix,
                context.stock.getEntityId(),
                submissionKey,
                definition,
                localX,
                localY,
                localZ,
                sourceLocal[0],
                sourceLocal[1],
                sourceLocal[2],
                beamLocal[0],
                beamLocal[1],
                beamLocal[2],
                sourceBasis,
                beamBasis,
                projectedOutput,
                sourceIntensity,
                context.visibility.beamScale,
                context.visibility.beamAlpha,
                context.visibility.hotspotAlpha,
                fixtureReach));
        String diagnostic = context.modelScope + ":" + definition.id();
        if (LOGGED_SUBMISSIONS.add(diagnostic))
        {
            Traincraft.tcLog.info(
                "Submitted semantic light fixture {} from model {} (tag {}, effect {}) at eye [{}, {}, {}], direction [{}, {}, {}].",
                definition.id(),
                context.modelScope,
                definition.taggedPartName(),
                definition.effect(),
                eyeX,
                eyeY,
                eyeZ,
                beamDirectionX,
                beamDirectionY,
                beamDirectionZ);
        }
    }

    /** Submits the merged face glows used by Commander-style beacon fixtures. */
    private static void submitCommanderSurfaceGlows(
        Context context,
        FixtureMetadata metadata,
        RollingStockLightDefinition definition,
        float modelScale,
        float intensity,
        float[] modelViewMatrix)
    {
        if (metadata.commanderSurfaces.isEmpty() == false)
        {
            int index = 0;
            for (CommanderSurface face : metadata.commanderSurfaces)
            {
                float[] center =
                    transformPoint(
                        modelViewMatrix,
                        face.x * modelScale,
                        face.y * modelScale,
                        face.z * modelScale);
                float[] glowBasis =
                    transformOpticalBasis(
                        face.normalX, face.normalY, face.normalZ, modelViewMatrix);
                float radius =
                    LightGeometryMetrics.expandedSurfaceGlowRadius(
                        face.area * modelScale * modelScale);
                LightEffectRenderBatch.submitGlow(
                    new LightGlowSubmission(
                        context.stock.getEntityId(),
                        definition.id() + ":face" + (index++),
                        center[0],
                        center[1],
                        center[2],
                        glowBasis[0],
                        glowBasis[1],
                        glowBasis[2],
                        glowBasis,
                        radius,
                        definition.sourceGlowIntensity() * intensity,
                        definition.sourceGlowWidthScale(),
                        definition.sourceGlowHeightScale(),
                        definition.sourceGlowRightOffset(),
                        definition.sourceGlowUpOffset(),
                        definition.color()));
            }
        }
    }
    /**
     * Commander rule: discard downward faces and merge coplanar fragments before measuring the
     * 20%-margin source glow.
     */
    private static List<CommanderSurface> mergeCommanderSurfaces(
        Context context, List<DetectedLightFace> faces)
    {
        List<CommanderSurface> merged = new ArrayList<CommanderSurface>();
        for (DetectedLightFace face : faces)
        {
            float[] assembled =
                context.calculateAssembledDirection(
                    face.modelNormalX, face.modelNormalY, face.modelNormalZ);
            if (assembled[1] < -MINIMUM_DIRECTIONAL_NORMAL_COMPONENT)
            {
                continue;
            }
            CommanderSurface match = null;
            for (CommanderSurface candidate : merged)
            {
                if (candidate.isCoplanar(face))
                {
                    match = candidate;
                    break;
                }
            }
            if (match == null)
            {
                merged.add(new CommanderSurface(face));
            }
            else
            {
                match.addFace(face);
            }
        }
        return Collections.unmodifiableList(merged);
    }

    private static final class CommanderSurface
    {
        float weightedX,
        weightedY,
        weightedZ,
        weightedNormalX,
        weightedNormalY,
        weightedNormalZ,
        area;
        float x, y, z, normalX, normalY, normalZ;

        CommanderSurface(DetectedLightFace face)
        {
            addFace(face);
        }

        void addFace(DetectedLightFace face)
        {
            weightedX += face.x * face.area;
            weightedY += face.y * face.area;
            weightedZ += face.z * face.area;
            weightedNormalX += face.normalX * face.area;
            weightedNormalY += face.normalY * face.area;
            weightedNormalZ += face.normalZ * face.area;
            area += face.area;
            updateDerivedValues();
        }

        void updateDerivedValues()
        {
            x = weightedX / area;
            y = weightedY / area;
            z = weightedZ / area;
            float length =
            (float)
            Math.sqrt(
                weightedNormalX * weightedNormalX
                + weightedNormalY * weightedNormalY
                + weightedNormalZ * weightedNormalZ);
            normalX = weightedNormalX / length;
            normalY = weightedNormalY / length;
            normalZ = weightedNormalZ / length;
        }

        boolean isCoplanar(DetectedLightFace face)
        {
            float length =
            (float)
            Math.sqrt(
                face.normalX * face.normalX
                + face.normalY * face.normalY
                + face.normalZ * face.normalZ);
            float faceNormalX = face.normalX / length,
                  faceNormalY = face.normalY / length,
                  faceNormalZ = face.normalZ / length;
            if (normalX * faceNormalX + normalY * faceNormalY + normalZ * faceNormalZ
                    < COPLANAR_NORMAL_DOT_THRESHOLD)
            {
                return false;
            }
            return Math.abs(
                       faceNormalX * (face.x - x)
                       + faceNormalY * (face.y - y)
                       + faceNormalZ * (face.z - z))
                   <= COPLANAR_DISTANCE_EPSILON;
        }
    }

    /** Submits the upward emissive face shared by the four Prime beacon phases. */
    private static void submitPrimeTop(
        Context context,
        RollingStockLightDefinition definition,
        DetectedLightFace topFace,
        float modelScale,
        float intensity,
        float[] modelViewMatrix)
    {
        float[] center =
                    transformPoint(
                        modelViewMatrix,
                        topFace.x * modelScale,
                        topFace.y * modelScale,
                        topFace.z * modelScale),
                transformedNormal =
                    transformNormal(
                        modelViewMatrix,
                        topFace.normalX,
                        topFace.normalY,
                        topFace.normalZ);
        float topIntensity =
            calculatePrimeTopGlowIntensity(
                intensity,
                center[0],
                center[1],
                center[2],
                transformedNormal[0],
                transformedNormal[1],
                transformedNormal[2]);
        if (topIntensity <= 0)
        {
            return;
        }
        float originX = topFace.x * modelScale;
        float originY = topFace.y * modelScale;
        float originZ = topFace.z * modelScale;
        float[][] vertexOffsets = new float[topFace.vertices.length][3];
        for (int index = 0; index < vertexOffsets.length; index++)
        {
            vertexOffsets[index][0] = topFace.vertices[index][0] * modelScale - originX;
            vertexOffsets[index][1] = topFace.vertices[index][1] * modelScale - originY;
            vertexOffsets[index][2] = topFace.vertices[index][2] * modelScale - originZ;
        }
        LightEffectRenderBatch.submitEmissive(
            LightEmissiveSubmission.fixtureLocal(
                context.stock.getEntityId(),
                definition.id() + ":prime-top",
                modelViewMatrix,
                originX,
                originY,
                originZ,
                vertexOffsets,
                definition.color(),
                topIntensity));
    }

    /** Captures the current OpenGL model-view matrix for deferred light-effect submission. */
    private static float[] captureModelViewMatrix()
    {
        MODEL_VIEW_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MODEL_VIEW_BUFFER);
        float[] result = new float[16];
        MODEL_VIEW_BUFFER.get(result);
        return result;
    }

    /** Transforms a fixture-local point into eye space, including translation. */
    private static float[] transformPoint(
        float[] modelViewMatrix, float localX, float localY, float localZ)
    {
        return new float[]
               {
                   modelViewMatrix[0] * localX
                   + modelViewMatrix[4] * localY
                   + modelViewMatrix[8] * localZ
                   + modelViewMatrix[12],
                   modelViewMatrix[1] * localX
                   + modelViewMatrix[5] * localY
                   + modelViewMatrix[9] * localZ
                   + modelViewMatrix[13],
                   modelViewMatrix[2] * localX
                   + modelViewMatrix[6] * localY
                   + modelViewMatrix[10] * localZ
                   + modelViewMatrix[14]
               };
    }

    /** Transforms and normalizes a fixture-local direction without applying translation. */
    private static float[] transformDirection(
        float[] modelViewMatrix, float localX, float localY, float localZ)
    {
        float eyeX = modelViewMatrix[0] * localX
                     + modelViewMatrix[4] * localY
                     + modelViewMatrix[8] * localZ,
              eyeY = modelViewMatrix[1] * localX
                     + modelViewMatrix[5] * localY
                     + modelViewMatrix[9] * localZ,
              eyeZ = modelViewMatrix[2] * localX
                     + modelViewMatrix[6] * localY
                     + modelViewMatrix[10] * localZ,
              length = (float) Math.sqrt(eyeX * eyeX + eyeY * eyeY + eyeZ * eyeZ);
        return length < GEOMETRY_EPSILON
               ? new float[] {0, 1, 0}
               : new float[] {eyeX / length, eyeY / length, eyeZ / length};
    }
    /**
     * Transform surface normals by the inverse transpose of the final model pose, which is required
     * for negative and nonuniform model scales.
     */
    static float[] transformNormal(
        float[] modelViewMatrix, float localX, float localY, float localZ)
    {
        float matrix00 = modelViewMatrix[0],
              matrix01 = modelViewMatrix[4],
              matrix02 = modelViewMatrix[8],
              matrix10 = modelViewMatrix[1],
              matrix11 = modelViewMatrix[5],
              matrix12 = modelViewMatrix[9],
              matrix20 = modelViewMatrix[2],
              matrix21 = modelViewMatrix[6],
              matrix22 = modelViewMatrix[10];
        float cofactor00 = matrix11 * matrix22 - matrix12 * matrix21,
              cofactor01 = matrix12 * matrix20 - matrix10 * matrix22,
              cofactor02 = matrix10 * matrix21 - matrix11 * matrix20;
        float cofactor10 = matrix02 * matrix21 - matrix01 * matrix22,
              cofactor11 = matrix00 * matrix22 - matrix02 * matrix20,
              cofactor12 = matrix01 * matrix20 - matrix00 * matrix21;
        float cofactor20 = matrix01 * matrix12 - matrix02 * matrix11,
              cofactor21 = matrix02 * matrix10 - matrix00 * matrix12,
              cofactor22 = matrix00 * matrix11 - matrix01 * matrix10;
        float determinant =
            matrix00 * cofactor00 + matrix01 * cofactor01 + matrix02 * cofactor02;
        if (Math.abs(determinant) <= MINIMUM_INVERTIBLE_MATRIX_VALUE)
        {
            return new float[] {0, 0, 0};
        }
        float normalX =
            (cofactor00 * localX + cofactor01 * localY + cofactor02 * localZ)
            / determinant;
        float normalY =
            (cofactor10 * localX + cofactor11 * localY + cofactor12 * localZ)
            / determinant;
        float normalZ =
            (cofactor20 * localX + cofactor21 * localY + cofactor22 * localZ)
            / determinant;
        float length =
            (float) Math.sqrt(normalX * normalX + normalY * normalY + normalZ * normalZ);
        return length <= MINIMUM_INVERTIBLE_MATRIX_VALUE
               ? new float[] {0, 0, 0}
               : new float[] {normalX / length, normalY / length, normalZ / length};
    }

    /** Returns the numbered Prime beacon phase encoded in a tagged part name, or zero. */
    private static int primePhase(String taggedPartName)
    {
        if (taggedPartName == null)
        {
            return 0;
        }
        String lower = taggedPartName.toLowerCase(Locale.ROOT);
        for (int phase = FIRST_PRIME_PHASE; phase <= LAST_PRIME_PHASE; phase++)
        {
            if (lower.contains("prime" + phase))
            {
                return phase;
            }
        }
        return 0;
    }

    /** Selects the outward side face associated with one numbered Prime beacon phase. */
    private static DetectedLightFace selectPrimePhaseFace(
        DetectedLightSurface surface, int phase, Context context)
    {
        float targetDirectionX = phase == 1 ? -1 : phase == 3 ? 1 : 0,
              targetDirectionZ = phase == 2 ? -1 : phase == 4 ? 1 : 0,
              bestAlignmentScore = MINIMUM_DIRECTIONAL_NORMAL_COMPONENT;
        DetectedLightFace result = null;
        for (DetectedLightFace face : surface.faces)
        {
            float[] normal =
                context.calculateAssembledDirection(
                    face.modelNormalX, face.modelNormalY, face.modelNormalZ);
            float horizontal = (float) Math.sqrt(normal[0] * normal[0] + normal[2] * normal[2]);
            if (horizontal < MINIMUM_DIRECTIONAL_NORMAL_COMPONENT)
            {
                continue;
            }
            float alignmentScore =
                (normal[0] * targetDirectionX + normal[2] * targetDirectionZ) / horizontal;
            if (alignmentScore > bestAlignmentScore + FACE_SCORE_EPSILON
                    || (Math.abs(alignmentScore - bestAlignmentScore) <= FACE_SCORE_EPSILON
                        && result != null
                        && face.area > result.area))
            {
                bestAlignmentScore = alignmentScore;
                result = face;
            }
        }
        return result;
    }

    private static DetectedLightFace selectPrimeTopFace(
        DetectedLightSurface surface, Context context)
    {
        return selectPrimeTopFace(
                   surface, context.stock.getRenderScale(), context.stock.modelRotations());
    }

    /**
     * Selects the upward-facing surface shared by all Prime beacon phases.
     *
     * @param surface detected faces belonging to the fixture
     * @param modelScale optional three-component model scale
     * @param modelRotations optional X/Y/Z model rotations in degrees
     * @return most upward-facing eligible face, or {@code null} when none qualifies
     */
    static DetectedLightFace selectPrimeTopFace(
        DetectedLightSurface surface, float[] modelScale, float[] modelRotations)
    {
        DetectedLightFace result = null;
        float best = MINIMUM_DIRECTIONAL_NORMAL_COMPONENT;
        for (DetectedLightFace face : surface.faces)
        {
            float y =
                calculateAssembledDirection(
                    face.modelNormalX,
                    face.modelNormalY,
                    face.modelNormalZ,
                    modelScale,
                    modelRotations)[1];
            if (y > best + FACE_SCORE_EPSILON
                    || (Math.abs(y - best) <= FACE_SCORE_EPSILON
                        && result != null
                        && face.area > result.area))
            {
                best = y;
                result = face;
            }
        }
        return result;
    }

    /**
     * Transforms a complete local optical basis into eye space while preserving its roll.
     *
     * @param directionX fixture-local forward direction X component
     * @param directionY fixture-local forward direction Y component
     * @param directionZ fixture-local forward direction Z component
     * @param modelViewMatrix OpenGL model-view matrix active for the fixture
     * @return forward, right, and up vectors packed as three consecutive triples
     */
    static float[] transformOpticalBasis(
        float directionX,
        float directionY,
        float directionZ,
        float[] modelViewMatrix)
    {
        float[] localBasis =
            AnimatedLightDirection.basis(directionX, directionY, directionZ);
        float[] transformedDirection =
            transformDirection(modelViewMatrix, localBasis[0], localBasis[1], localBasis[2]);
        float[] transformedRight =
            transformDirection(modelViewMatrix, localBasis[3], localBasis[4], localBasis[5]);
        float[] transformedUp =
            transformDirection(modelViewMatrix, localBasis[6], localBasis[7], localBasis[8]);
        float projection =
            transformedRight[0] * transformedDirection[0]
            + transformedRight[1] * transformedDirection[1]
            + transformedRight[2] * transformedDirection[2];
        float orthogonalRightX = transformedRight[0] - transformedDirection[0] * projection,
              orthogonalRightY = transformedRight[1] - transformedDirection[1] * projection,
              orthogonalRightZ = transformedRight[2] - transformedDirection[2] * projection;
        float[] right =
            normalizeDirection(orthogonalRightX, orthogonalRightY, orthogonalRightZ);
        float upX = right[1] * transformedDirection[2] - right[2] * transformedDirection[1],
              upY = right[2] * transformedDirection[0] - right[0] * transformedDirection[2],
              upZ = right[0] * transformedDirection[1] - right[1] * transformedDirection[0];
        if (upX * transformedUp[0] + upY * transformedUp[1] + upZ * transformedUp[2] < 0)
        {
            right[0] = -right[0];
            right[1] = -right[1];
            right[2] = -right[2];
            upX = -upX;
            upY = -upY;
            upZ = -upZ;
        }
        return new float[]
               {
                   transformedDirection[0],
                   transformedDirection[1],
                   transformedDirection[2],
                   right[0],
                   right[1],
                   right[2],
                   upX,
                   upY,
                   upZ
               };
    }

    /** Returns a normalized direction array, using model-forward for a degenerate input. */
    private static float[] normalizeDirection(
        float directionX, float directionY, float directionZ)
    {
        float length =
            (float)
            Math.sqrt(
                directionX * directionX
                + directionY * directionY
                + directionZ * directionZ);
        return length <= GEOMETRY_EPSILON
               ? new float[] {0, 0, 1}
               : new float[]
                 {
                     directionX / length,
                     directionY / length,
                     directionZ / length
                 };
    }

    /** Calculates the viewer-dependent glow intensity for the shared Prime top surface. */
    static float calculatePrimeTopGlowIntensity(
        float fixtureIntensity,
        float eyeX,
        float eyeY,
        float eyeZ,
        float normalX,
        float normalY,
        float normalZ)
    {
        return RollingStockLightDefinition.DEFAULT_SOURCE_GLOW_INTENSITY
               * PRIME_TOP_GLOW_SCALE
               * fixtureIntensity
               * AnimatedLightDirection.viewerSurfaceGlowScale(
                   eyeX, eyeY, eyeZ, normalX, normalY, normalZ);
    }

    /**
     * Owns the temporary lightmap state used while one semantic model part is rendered.
     *
     * <p>The token is valid only for the matching {@link #beginPart(ModelRendererTurbo, float)} and
     * {@link #endPart(PartLight)} pair.
     */
    public static final class PartLight
    {
        static final PartLight NONE = new PartLight(false, 0, 0, false, 0, 0, -1);
        final boolean lightmapChanged;
        final float ambientLightmapX,
                    ambientLightmapY,
                    effectLightmapX,
                    effectLightmapY;
        final boolean ambientLightmapEnabled;
        final int exteriorFaceIndex;

        PartLight(
            boolean lightmapChanged,
            float ambientLightmapX,
            float ambientLightmapY,
            boolean ambientLightmapEnabled,
            float effectLightmapX,
            float effectLightmapY,
            int exteriorFaceIndex)
        {
            this.lightmapChanged = lightmapChanged;
            this.ambientLightmapX = ambientLightmapX;
            this.ambientLightmapY = ambientLightmapY;
            this.ambientLightmapEnabled = ambientLightmapEnabled;
            this.effectLightmapX = effectLightmapX;
            this.effectLightmapY = effectLightmapY;
            this.exteriorFaceIndex = exteriorFaceIndex;
        }

        /**
         * Returns the selected outward face for phase-specific rendering.
         *
         * @return detected face index, or {@code -1} when no face restriction applies
         */
        public int exteriorFaceIndex()
        {
            return exteriorFaceIndex;
        }

        /** Restores the ambient lightmap coordinates captured before this part began rendering. */
        public void useAmbient()
        {
            OpenGlHelper.setLightmapTextureCoords(
                OpenGlHelper.lightmapTexUnit, ambientLightmapX, ambientLightmapY);
        }

        /** Applies the resolved illuminated lightmap coordinates for this part. */
        public void useEffect()
        {
            OpenGlHelper.setLightmapTextureCoords(
                OpenGlHelper.lightmapTexUnit, effectLightmapX, effectLightmapY);
        }
    }

    private static final class Context
    {
        final EntityRollingStock stock;
        final IRollingStockLightState lightState;
        final double animationTime;
        final ResourceLocation modelTexture;
        final String modelScope;
        final Map<ModelRendererTurbo, String> partLocators;
        final Map<ModelRendererTurbo, DetectedLightFace> rootPrimeTopFaces;
        final AdaptiveLightVisibility visibility;
        final ModelPartLightTable partLights;
        final RollingStockRuntimeState runtimeState;
        Object lastNestedPrimeOwner;
        Map<ModelRendererTurbo, DetectedLightFace> lastNestedPrimeTopFaces =
            Collections.emptyMap();

        Context(
            EntityRollingStock stock,
            double animationTime,
            float partialTicks,
            ResourceLocation texture)
        {
            this.stock = stock;
            lightState = resolveLightState(stock);
            this.animationTime = animationTime;
            modelTexture = texture;
            modelScope = modelScopeIdentifier(stock);
            partLocators = modelPartLocators(stock.modelInstance);
            rootPrimeTopFaces = resolvePrimeTopFaces(stock.modelInstance, this);
            RollingStockRuntimeState state = RUNTIME_STATES.get(stock);
            if (state == null)
            {
                state = new RollingStockRuntimeState();
                RUNTIME_STATES.put(stock, state);
            }
            runtimeState = state;
            runtimeState.prepareFor(stock.modelInstance, stock.getSkinLighting());
            partLights = runtimeState.partLights;
            partLights.reset(Math.max(4, countSemanticParts(stock.modelInstance, partLocators)));
            int skyLight =
                stock.worldObj.getSavedLightValue(
                    EnumSkyBlock.Sky,
                    MathHelper.floor_double(stock.posX),
                    MathHelper.floor_double(stock.posY),
                    MathHelper.floor_double(stock.posZ));
            visibility =
                runtimeState.visibilityTracker.sample(
                    skyLight,
                    stock.worldObj.getSunBrightness(partialTicks),
                    System.nanoTime());
        }

        ResolvedFixture resolveFixture(FixtureMetadata fixtureMetadata)
        {
            return runtimeState.resolveFixture(fixtureMetadata);
        }

        /**
         * Finds the shared Prime top face in the model object that actually owns this part.
         *
         * <p>Most rolling-stock lights live directly in the root model, so that map remains the
         * allocation-free fast path. Some models render a second model object from their
         * {@code renderAll} method, however, and its parts are absent from the root model's public
         * arrays. In that case {@link ModelRendererTurbo#getModelOwner()} identifies the nested
         * model without recursively inspecting arbitrary model fields. Root and nested Prime
         * assemblies can therefore be active during the same render.
         *
         * <p>Generated model code normally renders one owner's parts contiguously. Retaining the
         * most recently encountered nested owner avoids another per-frame identity map while the
         * bounded global metadata cache still makes owner changes inexpensive and correct.
         */
        DetectedLightFace primeTopFace(ModelRendererTurbo modelPart)
        {
            DetectedLightFace rootFace = rootPrimeTopFaces.get(modelPart);
            if (rootFace != null || modelPart == null)
            {
                return rootFace;
            }
            Object modelOwner = modelPart.getModelOwner();
            if (modelOwner == null || modelOwner == stock.modelInstance)
            {
                return null;
            }
            if (modelOwner != lastNestedPrimeOwner)
            {
                lastNestedPrimeOwner = modelOwner;
                lastNestedPrimeTopFaces = resolvePrimeTopFaces(modelOwner, this);
            }
            return lastNestedPrimeTopFaces.get(modelPart);
        }

        RollingStockLightOutput sampleOutput(RollingStockLightDefinition definition)
        {
            ModelPartLightTable.Entry cached = partLights.entry(definition.id());
            RollingStockLightOutput output =
                RollingStockLightState.outputForState(
                    lightState,
                    definition,
                    animationTime);
            if (cached == null)
            {
                partLights.put(
                    definition.id(), output.sourceIntensity(),
                    selectLightmapMode(definition, output.sourceIntensity()));
            }
            return output;
        }

        float[] calculateDefinitionDirection(DetectedLightSurface surface)
        {
            return ClientRollingStockLighting.calculateDefinitionDirection(
                       surface, stock.getRenderScale(), stock.modelRotations());
        }

        float[] calculateAssembledDirection(float modelX, float modelY, float modelZ)
        {
            return ClientRollingStockLighting.calculateAssembledDirection(
                       modelX,
                       modelY,
                       modelZ,
                       stock.getRenderScale(),
                       stock.modelRotations());
        }
    }

    /** Returns the normalized model-family identifier used to scope automatic fixture IDs. */
    private static String modelScopeIdentifier(EntityRollingStock stock)
    {
        Object model = stock.modelInstance;
        Object key = model == null ? stock.getClass() : model;
        String cached = MODEL_SCOPES.get(key);
        if (cached != null)
        {
            return cached;
        }
        String value =
            normalizeIdentifier(
                model == null
                ? stock.getClass().getSimpleName()
                : model.getClass().getSimpleName());
        MODEL_SCOPES.put(key, value);
        return value;
    }

    private static final class RollingStockRuntimeState
    {
        final AdaptiveLightTracker visibilityTracker = new AdaptiveLightTracker();
        final ModelPartLightTable partLights = new ModelPartLightTable();
        final IdentityHashMap<FixtureMetadata, ResolvedFixture> resolvedFixtures =
        new IdentityHashMap<FixtureMetadata, ResolvedFixture>();
        Object model;
        RollingStockSkinLighting skin;
        int skinRevision = Integer.MIN_VALUE;

        /** Invalidates resolved fixtures when the model, skin, or skin revision changes. */
        void prepareFor(Object currentModel, RollingStockSkinLighting currentSkin)
        {
            int currentRevision = currentSkin.lightingRevision();
            if (model == currentModel
                    && skin == currentSkin
                    && skinRevision == currentRevision)
            {
                return;
            }
            model = currentModel;
            skin = currentSkin;
            skinRevision = currentRevision;
            resolvedFixtures.clear();
        }

        /** Resolves and caches the current skin behavior for one detected fixture. */
        ResolvedFixture resolveFixture(FixtureMetadata fixtureMetadata)
        {
            ResolvedFixture resolvedFixture = resolvedFixtures.get(fixtureMetadata);
            if (resolvedFixture != null)
            {
                return resolvedFixture;
            }
            Map<String, RollingStockLightOverride> overrides = skin.lightOverrides();
            RollingStockLightOverride override =
                overrides.get(fixtureMetadata.definition.id());
            resolvedFixture =
                new ResolvedFixture(
                SkinLightingResolver.resolveDefinition(
                    overrides, fixtureMetadata.definition),
                override);
            resolvedFixtures.put(fixtureMetadata, resolvedFixture);
            return resolvedFixture;
        }
    }

    /**
     * Selects the synchronized light state that drives the stock currently being rendered.
     *
     * <p>Tenders expose a read-only implementation backed by their synchronized mirror watcher.
     * The server populates that watcher from a directly coupled locomotive and publishes an all-off
     * state while unlinked. Fixture direction and activation policies then select the appropriate
     * mirrored front or rear headlight level and named circuit without relying on client-side
     * coupling references.
     */
    private static IRollingStockLightState resolveLightState(EntityRollingStock stock)
    {
        return stock instanceof IRollingStockLightState
            ? (IRollingStockLightState) stock
            : null;
    }

    private static final class ResolvedFixture
    {
        final RollingStockLightDefinition definition;
        final RollingStockLightOverride override;
        ResourceLocation sourceTexture;
        ResourceLocation primeTexture;
        int sourceGeneration = Integer.MIN_VALUE;
        int primeGeneration = Integer.MIN_VALUE;
        int sourceFaceSignature = Integer.MIN_VALUE;
        boolean sourceAvailable;
        boolean sourceAvailableCached;
        boolean primeAvailable;
        boolean primeAvailableCached;

        ResolvedFixture(
            RollingStockLightDefinition definition, RollingStockLightOverride override)
        {
            this.definition = definition;
            this.override = override;
        }

        /** Returns cached texture-alpha availability for the fixture's visible source face. */
        boolean sourceVisible(
            ResourceLocation lightTexture,
            List<DetectedLightSurface> sourceSurfaces)
        {
            int generation = TextureAlphaMaskCache.resourceGeneration();
            int faceSignature = 1;
            for (DetectedLightSurface surface : sourceSurfaces)
            {
                faceSignature =
                    31 * faceSignature
                    + (surface.sourceFace == null ? -1 : surface.sourceFace.faceIndex);
            }
            if (sourceAvailableCached
                    && sourceGeneration == generation
                    && sourceFaceSignature == faceSignature
                    && sameResource(sourceTexture, lightTexture))
            {
                return sourceAvailable;
            }
            boolean visible = false;
            for (DetectedLightSurface surface : sourceSurfaces)
            {
                if (isSourceVisible(lightTexture, surface, surface.sourceFace))
                {
                    visible = true;
                    break;
                }
            }
            if (TextureAlphaMaskCache.ready(lightTexture))
            {
                sourceTexture = lightTexture;
                sourceGeneration = generation;
                sourceFaceSignature = faceSignature;
                sourceAvailable = visible;
                sourceAvailableCached = true;
            }
            return visible;
        }

        /** Returns cached texture-alpha availability for the shared Prime top face. */
        boolean primeVisible(ResourceLocation lightTexture, DetectedLightFace face)
        {
            int generation = TextureAlphaMaskCache.resourceGeneration();
            if (primeAvailableCached
                    && primeGeneration == generation
                    && sameResource(primeTexture, lightTexture))
            {
                return primeAvailable;
            }
            boolean visible = TextureAlphaMaskCache.visible(lightTexture, face);
            if (TextureAlphaMaskCache.ready(lightTexture))
            {
                primeTexture = lightTexture;
                primeGeneration = generation;
                primeAvailable = visible;
                primeAvailableCached = true;
            }
            return visible;
        }

        private static boolean sameResource(ResourceLocation first, ResourceLocation second)
        {
            return first == second || (first != null && first.equals(second));
        }
    }

    /** Applies model scale and rotation to a direction and returns its normalized result. */
    private static float[] calculateAssembledDirection(
        float modelX,
        float modelY,
        float modelZ,
        float[] modelScale,
        float[] modelRotations)
    {
        float[] value = new float[] {modelX, modelY, modelZ};
        if (modelScale != null && modelScale.length >= 3)
        {
            value[0] *= modelScale[0];
            value[1] *= modelScale[1];
            value[2] *= modelScale[2];
        }
        if (modelRotations != null && modelRotations.length >= 3)
        {
            rotateZ(value, (float) Math.toRadians(modelRotations[2]));
            rotateY(value, (float) Math.toRadians(modelRotations[1]));
            rotateX(value, (float) Math.toRadians(modelRotations[0]));
        }
        float len =
            (float) Math.sqrt(value[0] * value[0] + value[1] * value[1] + value[2] * value[2]);
        if (len > GEOMETRY_EPSILON)
        {
            value[0] /= len;
            value[1] /= len;
            value[2] /= len;
        }
        return value;
    }

    /** Counts semantic light parts once so the per-entity intensity table can be sized correctly. */
    private static int countSemanticParts(
        Object model, Map<ModelRendererTurbo, String> partLocators)
    {
        Integer cached = SEMANTIC_COUNTS.get(model);
        if (cached != null)
        {
            return cached;
        }
        int count = 0;
        for (ModelRendererTurbo modelPart : partLocators.keySet())
        {
            if (isSemantic(modelPart))
            {
                count++;
            }
        }
        if (model != null)
        {
            SEMANTIC_COUNTS.put(model, count);
        }
        return count;
    }

    /** Resolves and caches the shared upward Prime face for every participating model part. */
    private static Map<ModelRendererTurbo, DetectedLightFace> resolvePrimeTopFaces(
        Object model, Context context)
    {
        int transformSignature =
            31 * Arrays.hashCode(context.stock.getRenderScale())
            + Arrays.hashCode(context.stock.modelRotations());
        PrimeTopMetadata cached = PRIME_TOP_METADATA.get(model);
        if (cached != null && cached.transformSignature == transformSignature)
        {
            return cached.faces;
        }
        Map<ModelRendererTurbo, DetectedLightFace> members =
            SpecialBeaconSurfaceExtraction.completePrimeTopFaces(model);
        if (members.isEmpty())
        {
            return members;
        }
        IdentityHashMap<ModelRendererTurbo, DetectedLightFace> resolved =
            new IdentityHashMap<ModelRendererTurbo, DetectedLightFace>();
        for (ModelRendererTurbo modelPart : members.keySet())
        {
            DetectedLightFace face =
                selectPrimeTopFace(
                    AutomaticLightSurfaceDetection.detect(modelPart), context);
            if (face != null)
            {
                resolved.put(modelPart, face);
            }
        }
        Map<ModelRendererTurbo, DetectedLightFace> result = Collections.unmodifiableMap(resolved);
        if (model != null)
        {
            PRIME_TOP_METADATA.put(model, new PrimeTopMetadata(transformSignature, result));
        }
        return result;
    }

    private static final class PrimeTopMetadata
    {
        final int transformSignature;
        final Map<ModelRendererTurbo, DetectedLightFace> faces;

        PrimeTopMetadata(
            int transformSignature, Map<ModelRendererTurbo, DetectedLightFace> faces)
        {
            this.transformSignature = transformSignature;
            this.faces = faces;
        }
    }

    private static final class FixtureMetadata
    {
        final DetectedLightSurface surface;
        final RollingStockLightDefinition definition;
        final String groupKey;
        final List<CommanderSurface> commanderSurfaces;

        FixtureMetadata(
            DetectedLightSurface surface,
            RollingStockLightDefinition definition,
            String groupKey,
            List<CommanderSurface> commanderSurfaces)
        {
            this.surface = surface;
            this.definition = definition;
            this.groupKey = groupKey;
            this.commanderSurfaces = commanderSurfaces;
        }
    }
}
