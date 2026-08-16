package train.client.render;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.FloatBuffer;
import java.util.*;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import tmt.ModelPartLightTable;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightControls;
import train.common.api.RollingStockLightChannel;
import train.common.api.RollingStockLightDefinition;
import train.common.api.RollingStockLightOverride;
import train.common.api.RollingStockLightState;
import train.common.api.RollingStockSkinLighting;
import train.common.core.handlers.ConfigHandler;

/** Draw-scoped adapter between legacy TMT parts and the shared lighting model. */
public final class ClientRollingStockLighting {
    private static final FloatBuffer MODEL_VIEW_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final ThreadLocal<Context> ACTIVE = new ThreadLocal<Context>();
    private static final int MAXIMUM_MODEL_CACHE_ENTRIES = 128;
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

    private ClientRollingStockLighting() {}

    public static void begin(
            EntityRollingStock stock, float partialTicks, ResourceLocation texture) {
        if (ConfigHandler.ENABLE_ADVANCED_LIGHTING == false) {
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

    public static void end() {
        ACTIVE.remove();
    }

    public static boolean isActive() {
        return ACTIVE.get() != null;
    }

    public static boolean isSemantic(ModelRendererTurbo part) {
        return part != null && RollingStockLightChannel.fromTaggedPartName(part.boxName) != null;
    }

    public static PartLight beginPart(ModelRendererTurbo part, float scale) {
        Context context = ACTIVE.get();
        if (context == null
                || isSemantic(part) == false
                || (context.stock instanceof IRollingStockLightControls) == false) return PartLight.NONE;
        FixtureMetadata metadata = metadata(context, part, scale);
        DetectedLightSurface surface = metadata.surface;
        ResolvedFixture resolved = context.resolve(metadata);
        RollingStockLightDefinition definition = resolved.definition;
        int primePhase = primePhase(part.boxName);
        DetectedLightFace selectedPrime =
                primePhase > 0 ? primeFace(surface, primePhase, context) : null;
        if (selectedPrime != null) surface = surface.select(selectedPrime);
        float intensity = context.sample(definition);
        // An inactive fixture is ordinary ambient display-list geometry. Avoid
        // lightmap state traffic, matrix readbacks and Prime immediate drawing
        // when there is no visual lighting work for this part.
        if (intensity <= 0) return PartLight.NONE;
        float oldX = OpenGlHelper.lastBrightnessX, oldY = OpenGlHelper.lastBrightnessY;
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        boolean oldLightmapEnabled = GL11.glIsEnabled(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        RollingStockLightOverride availabilityOverride = resolved.override;
        boolean explicitlyAvailable =
                availabilityOverride != null && availabilityOverride.availabilityOverridden();
        ResourceLocation effectiveTexture =
                effectiveTexture(
                        context.stock.modelInstance,
                        part,
                        context.texture,
                        Tessellator.getLastTextureUri());
        boolean available =
                explicitlyAvailable
                        ? availabilityOverride.enabled()
                        : metadata.definition.taggedUvRegions().isEmpty() == false
                                && resolved.sourceVisible(
                                        effectiveTexture, surface, selectedPrime);
        float effectX = oldX, effectY = oldY;
        float[] pose = null;
        if (available) {
            ModelPartLightTable.Mode mode = context.partLights.mode(definition.id());
            if (mode == ModelPartLightTable.Mode.LIGHT_FLOOR) effectX = Math.max(oldX, 160);
            else if (mode == ModelPartLightTable.Mode.EMISSION_INTENSITY)
                effectX = Math.max(oldX, 240 * intensity);
            else if (mode == ModelPartLightTable.Mode.FULL_BRIGHT) {
                effectX = Math.max(oldX, 240);
                effectY = Math.max(oldY, 240);
            }
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, effectX, effectY);
            if (definition.effect() != RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE) {
                pose = captureModelView();
                submit(context, metadata, definition, surface, scale, intensity, pose);
            }
        }
        DetectedLightFace primeTop = context.primeTopFaces.get(part);
        if (intensity > 0
                && primeTop != null
                && (explicitlyAvailable
                        ? availabilityOverride.enabled()
                        : hasUsableUv(primeTop)
                                && resolved.primeVisible(effectiveTexture, primeTop))) {
            if (pose == null) pose = captureModelView();
            submitPrimeTop(context, definition, primeTop, scale, intensity, pose);
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

    public static void endPart(PartLight token) {
        if (token.changed) {
            OpenGlHelper.setLightmapTextureCoords(
                    OpenGlHelper.lightmapTexUnit, token.oldX, token.oldY);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            if (token.oldLightmapEnabled) GL11.glEnable(GL11.GL_TEXTURE_2D);
            else GL11.glDisable(GL11.GL_TEXTURE_2D);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        }
    }

    private static String fallbackId(
            Context context,
            ModelRendererTurbo part,
            DetectedLightSurface s,
            RollingStockLightChannel channel) {
        String locator = context.locators.get(part);
        if (locator != null)
            return "auto:"
                    + context.modelScope
                    + ":"
                    + channel.name().toLowerCase(Locale.ROOT)
                    + ":model0:"
                    + locator
                    + ":"
                    + normalize(part.boxName);
        int hash = 17;
        hash = 31 * hash + (part.boxName == null ? 0 : part.boxName.hashCode());
        hash = 31 * hash + Float.floatToIntBits(part.rotationPointX);
        hash = 31 * hash + Float.floatToIntBits(part.rotationPointY);
        hash = 31 * hash + Float.floatToIntBits(part.rotationPointZ);
        return "auto:" + context.modelScope + ":" + Integer.toHexString(hash);
    }

    private static String normalize(String value) {
        return value == null
                ? "unnamed"
                : value.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_.-]", "_");
    }

    static Map<ModelRendererTurbo, String> locators(Object model) {
        if (model == null) return Collections.emptyMap();
        Map<ModelRendererTurbo, String> cached = MODEL_LOCATORS.get(model);
        if (cached != null) return cached;
        IdentityHashMap<ModelRendererTurbo, String> result =
                new IdentityHashMap<ModelRendererTurbo, String>();
        List<Field> fields = new ArrayList<Field>();
        for (Field field : model.getClass().getFields())
            if (Modifier.isStatic(field.getModifiers()) == false
                    && field.getType() == ModelRendererTurbo[].class) fields.add(field);
        Collections.sort(
                fields,
                new Comparator<Field>() {
                    public int compare(Field a, Field b) {
                        return a.getName().compareTo(b.getName());
                    }
                });
        for (Field field : fields)
            try {
                ModelRendererTurbo[] parts = (ModelRendererTurbo[]) field.get(model);
                if (parts != null)
                    for (int i = 0; i < parts.length; i++)
                        if (parts[i] != null && result.containsKey(parts[i]) == false)
                            result.put(parts[i], field.getName() + i);
            } catch (IllegalAccessException ignored) {
            }
        MODEL_LOCATORS.put(model, result);
        return result;
    }

    public static void clearCaches() {
        clearWorldState();
        MODEL_LOCATORS.clear();
        MODEL_METADATA.clear();
        LOGGED_SUBMISSIONS.clear();
        SEMANTIC_COUNTS.clear();
        MODEL_SCOPES.clear();
        PRIME_TOP_METADATA.clear();
        SpecialBeaconSurfaceExtraction.clear();
    }

    static void clearWorldState() {
        ACTIVE.remove();
        RUNTIME_STATES.clear();
    }

    public static boolean hasProjectorFacing(EntityRollingStock stock, int direction) {
        Object model = stock.modelInstance;
        if (model == null) return false;
        Map<ModelRendererTurbo, FixtureMetadata> metadata = MODEL_METADATA.get(model);
        if (metadata == null) return false;
        for (FixtureMetadata fixture : metadata.values()) {
            RollingStockLightDefinition definition =
                    SkinLightingResolver.resolveDefinition(
                            stock.getSkinLighting().lightOverrides(), fixture.definition);
            if (definition.clientProjectorEligible()
                    && definition.channel() == RollingStockLightChannel.HEADLIGHT
                    && definition.controlCircuit() == RollingStockLightChannel.HEADLIGHT
                    && definition.effect() == RollingStockLightDefinition.Effect.BEAM
                    && definition.function().pattern()
                            == train.common.api.RollingStockLightFunction.Pattern.STEADY
                    && ((direction < 0 && definition.directionX() < -0.05F)
                            || (direction >= 0 && definition.directionX() > 0.05F))) return true;
        }
        return false;
    }

    private static FixtureMetadata metadata(Context context, ModelRendererTurbo part, float scale) {
        Object owner = context.stock.modelInstance;
        Map<ModelRendererTurbo, FixtureMetadata> values = MODEL_METADATA.get(owner);
        if (values == null) {
            values = new IdentityHashMap<ModelRendererTurbo, FixtureMetadata>();
            MODEL_METADATA.put(owner, values);
        }
        FixtureMetadata cached = values.get(part);
        if (cached != null) return cached;
        DetectedLightSurface surface =
                AutomaticLightSurfaceDetection.detect(
                        part,
                        context.stock.modelOffsets(),
                        context.stock.modelRotations(),
                        context.stock.getRenderScale());
        RollingStockLightChannel channel =
                RollingStockLightChannel.fromTaggedPartName(part.boxName);
        String fixtureId =
                part.lightFixtureId != null
                        ? part.lightFixtureId
                        : part.lightFixtureGroup != null
                                ? "auto:"
                                        + context.modelScope
                                        + ":"
                                        + channel.name().toLowerCase(Locale.ROOT)
                                        + ":group:"
                                        + normalize(part.lightFixtureGroup)
                                : fallbackId(context, part, surface, channel);
        boolean illuminated = RollingStockLightChannel.taggedPartIsIlluminatedSurface(part.boxName),
                beamChannel =
                        channel == RollingStockLightChannel.HEADLIGHT
                                || channel == RollingStockLightChannel.DITCH,
                producesBeam = beamChannel && surface.beamInferred && illuminated == false;
        RollingStockLightDefinition.Effect effect =
                illuminated
                        ? RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE
                        : producesBeam
                                ? RollingStockLightDefinition.Effect.BEAM
                                : RollingStockLightDefinition.Effect.EMISSIVE_ONLY;
        String lower = part.boxName.toLowerCase(Locale.ROOT);
        List<CommanderSurface> commanderSurfaces =
                lower.contains("commander")
                        ? commanderSurfaces(context, surface.faces)
                        : Collections.<CommanderSurface>emptyList();
        boolean orange = lower.contains("commander") || lower.contains("prime");
        int color = orange ? 0xFF8A24 : beamChannel ? 0xFFF4B4 : 0xFFFFFF;
        ModelRendererTurbo.LightSourceGlowShape shape = part.lightSourceGlowShape;
        float[] definitionDirection = context.definitionDirection(surface);
        float glowRadius =
                illuminated || lower.contains("commander")
                        ? 0
                        : Math.max(0.04F, Math.min(0.18F, surface.radius * scale * 1.35F));
        float beamLength =
                producesBeam ? (channel == RollingStockLightChannel.DITCH ? 2.5F : 5.0F) : 0;
        List<RollingStockLightDefinition.UvRegion> uvRegions = texturedUvRegions(surface);
        RollingStockLightDefinition definition =
                RollingStockLightDefinition.builder(fixtureId, channel)
                        .position(surface.x * scale, surface.y * scale, surface.z * scale)
                        .direction(
                                definitionDirection[0],
                                definitionDirection[1],
                                definitionDirection[2])
                        .color(color)
                        .effect(effect)
                        .beamDimensions(beamLength, producesBeam ? 0.45F : 0)
                        .sourceGlow(glowRadius, illuminated ? 0 : 0.85F)
                        .sourceGlowShape(
                                shape == null ? 1 : shape.widthScale(),
                                shape == null ? 1 : shape.heightScale(),
                                shape == null ? 0 : shape.rightOffset(),
                                shape == null ? 0 : shape.upOffset())
                        .function(RollingStockLightChannel.defaultFunction(part.boxName))
                        .hotspotEnabled(producesBeam)
                        .clientProjectorEligible(beamChannel && producesBeam)
                        .taggedPart(fixtureId, uvRegions)
                        .build();
        part.lightDefinitionId = fixtureId;
        if (primePhase(part.boxName) > 0) {
            part.lightExteriorFaceOnly = true;
            DetectedLightFace selected = primeFace(surface, primePhase(part.boxName), context);
            part.lightExteriorFaceIndex = selected == null ? -1 : selected.faceIndex;
        }
        if (uvRegions.isEmpty()
                && LOGGED_SUBMISSIONS.add("untextured\n" + context.modelScope + "\n" + fixtureId))
            Traincraft.tcLog.warn(
                    "Tagged light fixture {} in model {} has no usable texture coordinates; its automatic effects are disabled.",
                    fixtureId,
                    context.modelScope);
        FixtureMetadata created =
                new FixtureMetadata(
                        surface,
                        definition,
                        part.lightFixtureGroup == null ? null : normalize(part.lightFixtureGroup),
                        commanderSurfaces);
        values.put(part, created);
        return created;
    }

    /**
     * Records every polygon UV belonging to an automatically tagged fixture. Degenerate/default
     * coordinates do not describe texture area and must not turn the texture's (0,0) pixel into a
     * false light source.
     */
    static List<RollingStockLightDefinition.UvRegion> texturedUvRegions(
            DetectedLightSurface surface) {
        List<RollingStockLightDefinition.UvRegion> regions =
                new ArrayList<RollingStockLightDefinition.UvRegion>();
        for (DetectedLightFace face : surface.faces)
            if (hasUsableUv(face))
                regions.add(
                        new RollingStockLightDefinition.UvRegion(
                                face.minU, face.minV, face.maxU, face.maxV));
        return Collections.unmodifiableList(regions);
    }

    static boolean hasUsableUv(DetectedLightFace face) {
        return face != null
                && finite(face.minU)
                && finite(face.minV)
                && finite(face.maxU)
                && finite(face.maxV)
                && face.maxU - face.minU > 1.0E-7F
                && face.maxV - face.minV > 1.0E-7F;
    }

    private static boolean finite(float value) {
        return Float.isNaN(value) == false && Float.isInfinite(value) == false;
    }

    private static boolean visibleSource(
            ResourceLocation texture,
            DetectedLightSurface surface,
            DetectedLightFace selectedFace) {
        DetectedLightFace source = selectedFace == null ? surface.sourceFace : selectedFace;
        return source == null
                ? TextureAlphaMaskCache.visible(texture, surface)
                : TextureAlphaMaskCache.visible(texture, source);
    }

    static ResourceLocation effectiveTexture(
            Object rootModel,
            ModelRendererTurbo part,
            ResourceLocation rootTexture,
            ResourceLocation currentlyBoundTexture) {
        if (part != null
                && part.getModelOwner() != null
                && part.getModelOwner() != rootModel
                && currentlyBoundTexture != null) {
            return currentlyBoundTexture;
        }
        return rootTexture == null ? currentlyBoundTexture : rootTexture;
    }

    private static ModelPartLightTable.Mode mode(
            RollingStockLightDefinition definition, float intensity) {
        if (intensity <= 0) return ModelPartLightTable.Mode.AMBIENT;
        if (definition.effect() == RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE)
            return ModelPartLightTable.Mode.LIGHT_FLOOR;
        train.common.api.RollingStockLightFunction.Pattern pattern =
                definition.function().pattern();
        if (pattern == train.common.api.RollingStockLightFunction.Pattern.PHASED
                || pattern == train.common.api.RollingStockLightFunction.Pattern.ALTERNATING)
            return ModelPartLightTable.Mode.EMISSION_INTENSITY;
        return intensity < 1
                ? ModelPartLightTable.Mode.LIGHT_FLOOR
                : ModelPartLightTable.Mode.FULL_BRIGHT;
    }

    static float[] definitionDirection(
            DetectedLightSurface surface, float[] scale, float[] rotations) {
        float[] value =
                new float[] {surface.modelNormalX, surface.modelNormalY, surface.modelNormalZ};
        if (scale != null && scale.length >= 3) {
            value[0] *= scale[0];
            value[1] *= scale[1];
            value[2] *= scale[2];
        }
        if (rotations != null && rotations.length >= 3) {
            rotateZ(value, (float) Math.toRadians(rotations[2]));
            rotateY(value, (float) Math.toRadians(rotations[1]));
            rotateX(value, (float) Math.toRadians(rotations[0]));
        }
        value[0] = -value[0];
        value[2] = -value[2];
        float length =
                (float) Math.sqrt(value[0] * value[0] + value[1] * value[1] + value[2] * value[2]);
        if (length > 1.0E-5F) {
            value[0] /= length;
            value[1] /= length;
            value[2] /= length;
        }
        return value;
    }

    private static void rotateX(float[] v, float a) {
        if (a == 0) return;
        float c = (float) Math.cos(a),
                s = (float) Math.sin(a),
                y = v[1] * c - v[2] * s,
                z = v[1] * s + v[2] * c;
        v[1] = y;
        v[2] = z;
    }

    private static void rotateY(float[] v, float a) {
        if (a == 0) return;
        float c = (float) Math.cos(a),
                s = (float) Math.sin(a),
                x = v[0] * c + v[2] * s,
                z = -v[0] * s + v[2] * c;
        v[0] = x;
        v[2] = z;
    }

    private static void rotateZ(float[] v, float a) {
        if (a == 0) return;
        float c = (float) Math.cos(a),
                s = (float) Math.sin(a),
                x = v[0] * c - v[1] * s,
                y = v[0] * s + v[1] * c;
        v[0] = x;
        v[1] = y;
    }

    private static void submit(
            Context c,
            FixtureMetadata metadata,
            RollingStockLightDefinition d,
            DetectedLightSurface s,
            float scale,
            float intensity,
            float[] m) {
        float lx = s.x * scale, ly = s.y * scale, lz = s.z * scale;
        float x = m[0] * lx + m[4] * ly + m[8] * lz + m[12],
                y = m[1] * lx + m[5] * ly + m[9] * lz + m[13],
                z = m[2] * lx + m[6] * ly + m[10] * lz + m[14];
        // Build both optical bases in fixture-local space. The complete
        // bases are then transformed by the submission-time pose; no camera
        // axis from the later world-last pass participates in their roll.
        float[] sourceLocal = normalize(s.normalX, s.normalY, s.normalZ);
        float[] beamLocal =
                AnimatedLightDirection.sample(
                        sourceLocal[0], sourceLocal[1], sourceLocal[2], d.function(), c.time);
        float[] sourceBasis =
                AnimatedLightDirection.basis(sourceLocal[0], sourceLocal[1], sourceLocal[2]);
        float[] beamBasis = AnimatedLightDirection.basis(beamLocal[0], beamLocal[1], beamLocal[2]);
        float[] sourceEye = basis(sourceLocal[0], sourceLocal[1], sourceLocal[2], m);
        float[] beamEye = basis(beamLocal[0], beamLocal[1], beamLocal[2], m);
        float sourceDx = sourceEye[0], sourceDy = sourceEye[1], sourceDz = sourceEye[2];
        float dx = beamEye[0], dy = beamEye[1], dz = beamEye[2], sourceIntensity = intensity;
        if (d.function().pattern() == train.common.api.RollingStockLightFunction.Pattern.GYRALITE
                || d.function().pattern()
                        == train.common.api.RollingStockLightFunction.Pattern.MARS)
            sourceIntensity *= AnimatedLightDirection.viewerGlowScale(x, y, z, dx, dy, dz);
        else if (d.function().pattern()
                == train.common.api.RollingStockLightFunction.Pattern.PHASED)
            sourceIntensity *=
                    AnimatedLightDirection.viewerSurfaceGlowScale(
                            x, y, z, sourceDx, sourceDy, sourceDz);
        float fixtureReach =
                BeamVisibilityScaling.fixtureReach(intensity, d.function().lampResponse());
        LightEffectRenderBatch.submit(
                LightEffectSubmission.fixtureLocal(
                        m,
                        c.stock.getEntityId(),
                        d.id(),
                        d,
                        lx,
                        ly,
                        lz,
                        sourceLocal[0],
                        sourceLocal[1],
                        sourceLocal[2],
                        beamLocal[0],
                        beamLocal[1],
                        beamLocal[2],
                        sourceBasis,
                        beamBasis,
                        intensity,
                        sourceIntensity,
                        c.visibility.beamScale,
                        c.visibility.beamAlpha,
                        c.visibility.hotspotAlpha,
                        fixtureReach));
        submitSpecialSurfaces(c, metadata, d, scale, intensity, m);
        String diagnostic = c.modelScope + ":" + d.id();
        if (LOGGED_SUBMISSIONS.add(diagnostic))
            Traincraft.tcLog.info(
                    "Submitted semantic light fixture {} from model {} (tag {}, effect {}) at eye [{}, {}, {}], direction [{}, {}, {}].",
                    d.id(),
                    c.modelScope,
                    d.taggedPartName(),
                    d.effect(),
                    x,
                    y,
                    z,
                    dx,
                    dy,
                    dz);
    }

    private static void submitSpecialSurfaces(
            Context c,
            FixtureMetadata metadata,
            RollingStockLightDefinition d,
            float scale,
            float intensity,
            float[] m) {
        if (metadata.commanderSurfaces.isEmpty() == false) {
            int index = 0;
            for (CommanderSurface face : metadata.commanderSurfaces) {
                float[] center = point(m, face.x * scale, face.y * scale, face.z * scale);
                float[] glowBasis = basis(face.normalX, face.normalY, face.normalZ, m);
                float radius =
                        LightGeometryMetrics.expandedSurfaceGlowRadius(face.area * scale * scale);
                LightEffectRenderBatch.submitGlow(
                        new LightGlowSubmission(
                                c.stock.getEntityId(),
                                d.id() + ":face" + (index++),
                                center[0],
                                center[1],
                                center[2],
                                glowBasis[0],
                                glowBasis[1],
                                glowBasis[2],
                                glowBasis,
                                radius,
                                d.sourceGlowIntensity() * intensity,
                                d.sourceGlowWidthScale(),
                                d.sourceGlowHeightScale(),
                                d.sourceGlowRightOffset(),
                                d.sourceGlowUpOffset(),
                                d.color()));
            }
        }
    }
    /**
     * Commander rule: discard downward faces and merge coplanar fragments before measuring the
     * 20%-margin source glow.
     */
    private static List<CommanderSurface> commanderSurfaces(
            Context context, List<DetectedLightFace> faces) {
        List<CommanderSurface> merged = new ArrayList<CommanderSurface>();
        for (DetectedLightFace face : faces) {
            float[] assembled =
                    context.assembledDirection(
                            face.modelNormalX, face.modelNormalY, face.modelNormalZ);
            if (assembled[1] < -0.5F) continue;
            CommanderSurface match = null;
            for (CommanderSurface candidate : merged) {
                if (candidate.isCoplanar(face)) {
                    match = candidate;
                    break;
                }
            }
            if (match == null) merged.add(new CommanderSurface(face));
            else match.add(face);
        }
        return Collections.unmodifiableList(merged);
    }

    private static final class CommanderSurface {
        float weightedX,
                weightedY,
                weightedZ,
                weightedNormalX,
                weightedNormalY,
                weightedNormalZ,
                area;
        float x, y, z, normalX, normalY, normalZ;

        CommanderSurface(DetectedLightFace face) {
            add(face);
        }

        void add(DetectedLightFace face) {
            weightedX += face.x * face.area;
            weightedY += face.y * face.area;
            weightedZ += face.z * face.area;
            weightedNormalX += face.normalX * face.area;
            weightedNormalY += face.normalY * face.area;
            weightedNormalZ += face.normalZ * face.area;
            area += face.area;
            finish();
        }

        void finish() {
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

        boolean isCoplanar(DetectedLightFace face) {
            float length =
                    (float)
                            Math.sqrt(
                                    face.normalX * face.normalX
                                            + face.normalY * face.normalY
                                            + face.normalZ * face.normalZ);
            float nx = face.normalX / length,
                    ny = face.normalY / length,
                    nz = face.normalZ / length;
            if (normalX * nx + normalY * ny + normalZ * nz < 0.999F) return false;
            return Math.abs(nx * (face.x - x) + ny * (face.y - y) + nz * (face.z - z)) <= 1.0E-4F;
        }
    }

    private static void submitPrimeTop(
            Context c,
            RollingStockLightDefinition d,
            DetectedLightFace top,
            float scale,
            float intensity,
            float[] m) {
        float[] center = point(m, top.x * scale, top.y * scale, top.z * scale),
                normal = normal(m, top.normalX, top.normalY, top.normalZ);
        float topIntensity =
                primeTopGlowIntensity(
                        intensity, center[0], center[1], center[2], normal[0], normal[1],
                        normal[2]);
        if (topIntensity <= 0) return;
        float originX = top.x * scale;
        float originY = top.y * scale;
        float originZ = top.z * scale;
        float[][] vertexOffsets = new float[top.vertices.length][3];
        for (int index = 0; index < vertexOffsets.length; index++) {
            vertexOffsets[index][0] = top.vertices[index][0] * scale - originX;
            vertexOffsets[index][1] = top.vertices[index][1] * scale - originY;
            vertexOffsets[index][2] = top.vertices[index][2] * scale - originZ;
        }
        LightEffectRenderBatch.submitEmissive(
                LightEmissiveSubmission.fixtureLocal(
                        c.stock.getEntityId(),
                        d.id() + ":prime-top",
                        m,
                        originX,
                        originY,
                        originZ,
                        vertexOffsets,
                        d.color(),
                        topIntensity));
    }

    private static float[] captureModelView() {
        MODEL_VIEW_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MODEL_VIEW_BUFFER);
        float[] result = new float[16];
        MODEL_VIEW_BUFFER.get(result);
        return result;
    }

    private static float[] point(float[] m, float x, float y, float z) {
        return new float[] {
            m[0] * x + m[4] * y + m[8] * z + m[12],
            m[1] * x + m[5] * y + m[9] * z + m[13],
            m[2] * x + m[6] * y + m[10] * z + m[14]
        };
    }

    private static float[] direction(float[] m, float x, float y, float z) {
        float dx = m[0] * x + m[4] * y + m[8] * z,
                dy = m[1] * x + m[5] * y + m[9] * z,
                dz = m[2] * x + m[6] * y + m[10] * z,
                len = (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
        return len < 1.0E-5F ? new float[] {0, 1, 0} : new float[] {dx / len, dy / len, dz / len};
    }
    /**
     * Transform surface normals by the inverse transpose of the final model pose, which is required
     * for negative and nonuniform model scales.
     */
    static float[] normal(float[] m, float x, float y, float z) {
        float a = m[0],
                b = m[4],
                c = m[8],
                d = m[1],
                e = m[5],
                f = m[9],
                g = m[2],
                h = m[6],
                i = m[10];
        float c00 = e * i - f * h, c01 = f * g - d * i, c02 = d * h - e * g;
        float c10 = c * h - b * i, c11 = a * i - c * g, c12 = b * g - a * h;
        float c20 = b * f - c * e, c21 = c * d - a * f, c22 = a * e - b * d;
        float determinant = a * c00 + b * c01 + c * c02;
        if (Math.abs(determinant) <= 1.0E-8F) return new float[] {0, 0, 0};
        float nx = (c00 * x + c01 * y + c02 * z) / determinant;
        float ny = (c10 * x + c11 * y + c12 * z) / determinant;
        float nz = (c20 * x + c21 * y + c22 * z) / determinant;
        float length = (float) Math.sqrt(nx * nx + ny * ny + nz * nz);
        return length <= 1.0E-8F
                ? new float[] {0, 0, 0}
                : new float[] {nx / length, ny / length, nz / length};
    }

    private static int primePhase(String tag) {
        if (tag == null) return 0;
        String lower = tag.toLowerCase(Locale.ROOT);
        for (int i = 1; i <= 4; i++) if (lower.contains("prime" + i)) return i;
        return 0;
    }

    private static DetectedLightFace primeFace(
            DetectedLightSurface surface, int phase, Context context) {
        float tx = phase == 1 ? -1 : phase == 3 ? 1 : 0,
                tz = phase == 2 ? -1 : phase == 4 ? 1 : 0,
                best = 0.5F;
        DetectedLightFace result = null;
        for (DetectedLightFace face : surface.faces) {
            float[] normal =
                    context.assembledDirection(
                            face.modelNormalX, face.modelNormalY, face.modelNormalZ);
            float horizontal = (float) Math.sqrt(normal[0] * normal[0] + normal[2] * normal[2]);
            if (horizontal < 0.5F) continue;
            float score = (normal[0] * tx + normal[2] * tz) / horizontal;
            if (score > best + 1.0E-5F
                    || (Math.abs(score - best) <= 1.0E-5F
                            && result != null
                            && face.area > result.area)) {
                best = score;
                result = face;
            }
        }
        return result;
    }

    private static DetectedLightFace primeTopFace(DetectedLightSurface surface, Context context) {
        return primeTopFace(
                surface, context.stock.getRenderScale(), context.stock.modelRotations());
    }

    static DetectedLightFace primeTopFace(
            DetectedLightSurface surface, float[] scale, float[] rotations) {
        DetectedLightFace result = null;
        float best = 0.5F;
        for (DetectedLightFace face : surface.faces) {
            float y =
                    assembledDirection(
                            face.modelNormalX,
                            face.modelNormalY,
                            face.modelNormalZ,
                            scale,
                            rotations)[1];
            if (y > best + 1.0E-5F
                    || (Math.abs(y - best) <= 1.0E-5F
                            && result != null
                            && face.area > result.area)) {
                best = y;
                result = face;
            }
        }
        return result;
    }

    static float[] basis(float dx, float dy, float dz, float[] modelView) {
        float[] local = AnimatedLightDirection.basis(dx, dy, dz);
        float[] transformedDirection = direction(modelView, local[0], local[1], local[2]);
        float[] transformedRight = direction(modelView, local[3], local[4], local[5]);
        float[] transformedUp = direction(modelView, local[6], local[7], local[8]);
        float projection =
                transformedRight[0] * transformedDirection[0]
                        + transformedRight[1] * transformedDirection[1]
                        + transformedRight[2] * transformedDirection[2];
        float rx = transformedRight[0] - transformedDirection[0] * projection,
                ry = transformedRight[1] - transformedDirection[1] * projection,
                rz = transformedRight[2] - transformedDirection[2] * projection;
        float[] right = normalize(rx, ry, rz);
        float ux = right[1] * transformedDirection[2] - right[2] * transformedDirection[1],
                uy = right[2] * transformedDirection[0] - right[0] * transformedDirection[2],
                uz = right[0] * transformedDirection[1] - right[1] * transformedDirection[0];
        if (ux * transformedUp[0] + uy * transformedUp[1] + uz * transformedUp[2] < 0) {
            right[0] = -right[0];
            right[1] = -right[1];
            right[2] = -right[2];
            ux = -ux;
            uy = -uy;
            uz = -uz;
        }
        return new float[] {
            transformedDirection[0],
            transformedDirection[1],
            transformedDirection[2],
            right[0],
            right[1],
            right[2],
            ux,
            uy,
            uz
        };
    }

    private static float[] normalize(float x, float y, float z) {
        float len = (float) Math.sqrt(x * x + y * y + z * z);
        return len <= 1.0E-5F ? new float[] {0, 0, 1} : new float[] {x / len, y / len, z / len};
    }

    static float primeTopGlowIntensity(
            float fixtureIntensity, float x, float y, float z, float nx, float ny, float nz) {
        return 0.85F
                * 0.35F
                * fixtureIntensity
                * AnimatedLightDirection.viewerSurfaceGlowScale(x, y, z, nx, ny, nz);
    }

    public static final class PartLight {
        static final PartLight NONE = new PartLight(false, 0, 0, false, 0, 0, -1);
        final boolean changed;
        final float oldX, oldY, effectX, effectY;
        final boolean oldLightmapEnabled;
        final int exteriorFaceIndex;

        PartLight(
                boolean c,
                float x,
                float y,
                boolean enabled,
                float effectX,
                float effectY,
                int exteriorFaceIndex) {
            changed = c;
            oldX = x;
            oldY = y;
            oldLightmapEnabled = enabled;
            this.effectX = effectX;
            this.effectY = effectY;
            this.exteriorFaceIndex = exteriorFaceIndex;
        }

        public int exteriorFaceIndex() {
            return exteriorFaceIndex;
        }

        public void useAmbient() {
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, oldX, oldY);
        }

        public void useEffect() {
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, effectX, effectY);
        }
    }

    private static final class Context {
        final EntityRollingStock stock;
        final double time;
        final ResourceLocation texture;
        final String modelScope;
        final Map<ModelRendererTurbo, String> locators;
        final Map<ModelRendererTurbo, DetectedLightFace> primeTopFaces;
        final AdaptiveLightVisibility visibility;
        final ModelPartLightTable partLights;
        final RollingStockRuntimeState runtimeState;

        Context(EntityRollingStock s, double t, float partialTicks, ResourceLocation texture) {
            stock = s;
            time = t;
            this.texture = texture;
            modelScope = modelScope(s);
            locators = locators(s.modelInstance);
            primeTopFaces = resolvedPrimeTopFaces(s.modelInstance, this);
            RollingStockRuntimeState state = RUNTIME_STATES.get(s);
            if (state == null) {
                state = new RollingStockRuntimeState();
                RUNTIME_STATES.put(s, state);
            }
            runtimeState = state;
            runtimeState.prepare(s.modelInstance, s.getSkinLighting());
            partLights = runtimeState.partLights;
            partLights.reset(semanticCount(s.modelInstance, locators));
            int sky =
                    s.worldObj.getSavedLightValue(
                            EnumSkyBlock.Sky,
                            MathHelper.floor_double(s.posX),
                            MathHelper.floor_double(s.posY),
                            MathHelper.floor_double(s.posZ));
            visibility =
                    runtimeState.visibilityTracker.sample(
                            sky, s.worldObj.getSunBrightness(partialTicks), System.nanoTime());
        }

        ResolvedFixture resolve(FixtureMetadata metadata) {
            return runtimeState.resolve(metadata);
        }

        float sample(RollingStockLightDefinition definition) {
            ModelPartLightTable.Entry cached = partLights.entry(definition.id());
            if (cached != null) return cached.intensity();
            float intensity =
                    RollingStockLightState.intensity(
                            (IRollingStockLightControls) stock, definition, time);
            partLights.put(definition.id(), intensity, mode(definition, intensity));
            return intensity;
        }

        float[] definitionDirection(DetectedLightSurface surface) {
            return ClientRollingStockLighting.definitionDirection(
                    surface, stock.getRenderScale(), stock.modelRotations());
        }

        float[] assembledDirection(float x, float y, float z) {
            return ClientRollingStockLighting.assembledDirection(
                    x, y, z, stock.getRenderScale(), stock.modelRotations());
        }
    }

    private static String modelScope(EntityRollingStock stock) {
        Object model = stock.modelInstance;
        Object key = model == null ? stock.getClass() : model;
        String cached = MODEL_SCOPES.get(key);
        if (cached != null) {
            return cached;
        }
        String value =
                normalize(
                        model == null
                                ? stock.getClass().getSimpleName()
                                : model.getClass().getSimpleName());
        MODEL_SCOPES.put(key, value);
        return value;
    }

    private static final class RollingStockRuntimeState {
        final AdaptiveLightTracker visibilityTracker = new AdaptiveLightTracker();
        final ModelPartLightTable partLights = new ModelPartLightTable();
        final IdentityHashMap<FixtureMetadata, ResolvedFixture> resolvedFixtures =
                new IdentityHashMap<FixtureMetadata, ResolvedFixture>();
        Object model;
        RollingStockSkinLighting skin;
        int skinRevision = Integer.MIN_VALUE;

        void prepare(Object currentModel, RollingStockSkinLighting currentSkin) {
            int currentRevision = currentSkin.lightingRevision();
            if (model == currentModel
                    && skin == currentSkin
                    && skinRevision == currentRevision) {
                return;
            }
            model = currentModel;
            skin = currentSkin;
            skinRevision = currentRevision;
            resolvedFixtures.clear();
        }

        ResolvedFixture resolve(FixtureMetadata metadata) {
            ResolvedFixture resolved = resolvedFixtures.get(metadata);
            if (resolved != null) {
                return resolved;
            }
            Map<String, RollingStockLightOverride> overrides = skin.lightOverrides();
            RollingStockLightOverride override = overrides.get(metadata.definition.id());
            resolved =
                    new ResolvedFixture(
                            SkinLightingResolver.resolveDefinition(overrides, metadata.definition),
                            override);
            resolvedFixtures.put(metadata, resolved);
            return resolved;
        }
    }

    private static final class ResolvedFixture {
        final RollingStockLightDefinition definition;
        final RollingStockLightOverride override;
        ResourceLocation sourceTexture;
        ResourceLocation primeTexture;
        int sourceGeneration = Integer.MIN_VALUE;
        int primeGeneration = Integer.MIN_VALUE;
        int sourceFaceIndex = Integer.MIN_VALUE;
        boolean sourceAvailable;
        boolean sourceAvailableCached;
        boolean primeAvailable;
        boolean primeAvailableCached;

        ResolvedFixture(
                RollingStockLightDefinition definition, RollingStockLightOverride override) {
            this.definition = definition;
            this.override = override;
        }

        boolean sourceVisible(
                ResourceLocation texture,
                DetectedLightSurface surface,
                DetectedLightFace selectedFace) {
            int generation = TextureAlphaMaskCache.resourceGeneration();
            int faceIndex = selectedFace == null ? -1 : selectedFace.faceIndex;
            if (sourceAvailableCached
                    && sourceGeneration == generation
                    && sourceFaceIndex == faceIndex
                    && sameResource(sourceTexture, texture)) {
                return sourceAvailable;
            }
            boolean visible = visibleSource(texture, surface, selectedFace);
            if (TextureAlphaMaskCache.ready(texture)) {
                sourceTexture = texture;
                sourceGeneration = generation;
                sourceFaceIndex = faceIndex;
                sourceAvailable = visible;
                sourceAvailableCached = true;
            }
            return visible;
        }

        boolean primeVisible(ResourceLocation texture, DetectedLightFace face) {
            int generation = TextureAlphaMaskCache.resourceGeneration();
            if (primeAvailableCached
                    && primeGeneration == generation
                    && sameResource(primeTexture, texture)) {
                return primeAvailable;
            }
            boolean visible = TextureAlphaMaskCache.visible(texture, face);
            if (TextureAlphaMaskCache.ready(texture)) {
                primeTexture = texture;
                primeGeneration = generation;
                primeAvailable = visible;
                primeAvailableCached = true;
            }
            return visible;
        }

        private static boolean sameResource(ResourceLocation first, ResourceLocation second) {
            return first == second || (first != null && first.equals(second));
        }
    }

    private static float[] assembledDirection(
            float x, float y, float z, float[] scale, float[] rotations) {
        float[] value = new float[] {x, y, z};
        if (scale != null && scale.length >= 3) {
            value[0] *= scale[0];
            value[1] *= scale[1];
            value[2] *= scale[2];
        }
        if (rotations != null && rotations.length >= 3) {
            rotateZ(value, (float) Math.toRadians(rotations[2]));
            rotateY(value, (float) Math.toRadians(rotations[1]));
            rotateX(value, (float) Math.toRadians(rotations[0]));
        }
        float len =
                (float) Math.sqrt(value[0] * value[0] + value[1] * value[1] + value[2] * value[2]);
        if (len > 1.0E-5F) {
            value[0] /= len;
            value[1] /= len;
            value[2] /= len;
        }
        return value;
    }

    private static int semanticCount(Object model, Map<ModelRendererTurbo, String> locators) {
        Integer cached = SEMANTIC_COUNTS.get(model);
        if (cached != null) return cached;
        int count = 0;
        for (ModelRendererTurbo part : locators.keySet()) if (isSemantic(part)) count++;
        count = Math.max(4, count);
        if (model != null) SEMANTIC_COUNTS.put(model, count);
        return count;
    }

    private static Map<ModelRendererTurbo, DetectedLightFace> resolvedPrimeTopFaces(
            Object model, Context context) {
        int transformSignature =
                31 * Arrays.hashCode(context.stock.getRenderScale())
                        + Arrays.hashCode(context.stock.modelRotations());
        PrimeTopMetadata cached = PRIME_TOP_METADATA.get(model);
        if (cached != null && cached.transformSignature == transformSignature) {
            return cached.faces;
        }
        Map<ModelRendererTurbo, DetectedLightFace> members =
                SpecialBeaconSurfaceExtraction.completePrimeTopFaces(model);
        if (members.isEmpty()) return members;
        IdentityHashMap<ModelRendererTurbo, DetectedLightFace> resolved =
                new IdentityHashMap<ModelRendererTurbo, DetectedLightFace>();
        for (ModelRendererTurbo part : members.keySet()) {
            DetectedLightFace face =
                    primeTopFace(AutomaticLightSurfaceDetection.detect(part), context);
            if (face != null) resolved.put(part, face);
        }
        Map<ModelRendererTurbo, DetectedLightFace> result = Collections.unmodifiableMap(resolved);
        if (model != null) {
            PRIME_TOP_METADATA.put(model, new PrimeTopMetadata(transformSignature, result));
        }
        return result;
    }

    private static final class PrimeTopMetadata {
        final int transformSignature;
        final Map<ModelRendererTurbo, DetectedLightFace> faces;

        PrimeTopMetadata(
                int transformSignature, Map<ModelRendererTurbo, DetectedLightFace> faces) {
            this.transformSignature = transformSignature;
            this.faces = faces;
        }
    }

    private static final class FixtureMetadata {
        final DetectedLightSurface surface;
        final RollingStockLightDefinition definition;
        final String groupKey;
        final List<CommanderSurface> commanderSurfaces;

        FixtureMetadata(
                DetectedLightSurface surface,
                RollingStockLightDefinition definition,
                String groupKey,
                List<CommanderSurface> commanderSurfaces) {
            this.surface = surface;
            this.definition = definition;
            this.groupKey = groupKey;
            this.commanderSurfaces = commanderSurfaces;
        }
    }
}
