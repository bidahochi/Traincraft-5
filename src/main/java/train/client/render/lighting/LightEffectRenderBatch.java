package train.client.render.lighting;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.RollingStockLightDefinition;
import train.common.core.handlers.ConfigHandler;

/**
 * Frame-scoped collector for rolling-stock and placed-model beams, glows, and emissive geometry.
 * Fixture renderers submit camera-relative values; the world-last callback captures the world
 * view, drains and de-duplicates queues by owner/fixture, then selects the best supported
 * compositor. All entry points run on the client render thread. {@link #flush()} restores the
 * fixed-function state it changes and always releases frame-owned references.
 * Three-element geometry arrays use {@code [0] = x}, {@code [1] = y}, and {@code [2] = z}.
 * Nine-element bases use {@code [0..2] = direction}, {@code [3..5] = right}, and
 * {@code [6..8] = up}, with x/y/z within each range. Sixteen-element matrices use OpenGL
 * column-major order: {@code [0..3]}, {@code [4..7]}, {@code [8..11]}, and {@code [12..15]}
 * are columns 0 through 3 respectively.
 */
public final class LightEffectRenderBatch
{
    private static final int RADIAL_SEGMENTS = 12;
    private static final float HOTSPOT_SURFACE_NUDGE = 0.012F;
    private static final float HOTSPOT_SELF_HIT_NUDGE = 0.01F;
    private static final float MINIMUM_VISIBLE_BEAM_OPACITY = 1.0E-3F;
    private static final float MINIMUM_BEAM_LENGTH = 1.0E-5F;
    private static final float MINIMUM_DIRECTION_LENGTH = 1.0E-6F;
    private static final float RAY_AXIS_EPSILON = 1.0E-8F;
    private static final float MATRIX_DETERMINANT_EPSILON = 1.0E-8F;
    private static final float MINIMUM_VIEWER_FACING_DOT = 1.0E-4F;
    private static final float HOTSPOT_SOURCE_RADIUS_SCALE = 1.2F;
    private static final float HOTSPOT_BASE_ALPHA = 210.0F / 255.0F;
    private static final int MAXIMUM_EXCLUDED_BLOCK_HITS = 8;
    private static final float BEAM_VERTICAL_HALF_WIDTH_SCALE = 0.6F;
    private static final float COPLANAR_POLYGON_OFFSET_FACTOR = -0.25F;
    private static final float COPLANAR_POLYGON_OFFSET_UNITS = -1.0F;
    private static final float REFERENCE_AXIS_PARALLEL_THRESHOLD = 0.95F;
    private static final FrameFixtureQueue<LightEffectSubmission> QUEUE =
        new FrameFixtureQueue<LightEffectSubmission>();
    private static final FrameFixtureQueue<LightGlowSubmission> GLOWS =
        new FrameFixtureQueue<LightGlowSubmission>();
    private static final FrameFixtureQueue<LightEmissiveSubmission> EMISSIVE =
        new FrameFixtureQueue<LightEmissiveSubmission>();
    private static final FloatBuffer POSE_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer VIEW_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final IntBuffer VIEWPORT_BUFFER = BufferUtils.createIntBuffer(16);
    /** OpenGL viewport: {@code [0] = x}, {@code [1] = y}, {@code [2] = width}, {@code [3] = height}. */
    private static final int[] FRAME_VIEWPORT = new int[4];
    /**
     * Reusable beam cross-sections. Outer positions are corners in winding order:
     * {@code [0] = -right/-up}, {@code [1] = -right/+up}, {@code [2] = +right/+up}, and
     * {@code [3] = +right/-up}; every inner array is {@code [x, y, z]}.
     */
    private static final float[][] BEAM_NEAR = new float[4][3];
    private static final float[][] BEAM_FAR = new float[4][3];
    private static final List<LightEffectSubmission> FRAME_SUBMISSIONS =
        new ArrayList<LightEffectSubmission>();
    private static final List<LightGlowSubmission> FRAME_GLOWS =
        new ArrayList<LightGlowSubmission>();
    private static final List<LightEmissiveSubmission> FRAME_EMISSIVE =
        new ArrayList<LightEmissiveSubmission>();
    private static final ViewTransform VIEW_TRANSFORM = new ViewTransform();
    private static final BeamOcclusionDemand OCCLUSION_DEMAND = new BeamOcclusionDemand();
    private static boolean loggedDirectFlush;
    private static boolean frameOcclusionDemandKnown;
    private static boolean frameOcclusionRequired;
    private static boolean frameViewportValid;

    private LightEffectRenderBatch() {}

    /** Queues or merges one fixture effect for the current frame. */
    public static synchronized void submit(LightEffectSubmission value)
    {
        if (enhancedLightingEnabled() == false)
        {
            return;
        }
        LightEffectSubmission existing = QUEUE.get(value.ownerId, value.fixtureId);
        if (existing == null)
        {
            QUEUE.put(value.ownerId, value.fixtureId, value);
        }
        else
        {
            existing.merge(value);
        }
    }

    /** Captures the first world-view/projection pair needed to replay fixture-local poses. */
    public static synchronized void captureWorldView()
    {
        if (enhancedLightingEnabled() == false)
        {
            return;
        }
        if (VIEW_TRANSFORM.captured() == false)
        {
            VIEW_TRANSFORM.captureCurrent();
        }
        if (frameViewportValid == false)
        {
            VIEWPORT_BUFFER.clear();
            GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT_BUFFER);
            for (int index = 0; index < FRAME_VIEWPORT.length; index++)
            {
                FRAME_VIEWPORT[index] = VIEWPORT_BUFFER.get(index);
            }
            frameViewportValid = true;
        }
    }

    static synchronized boolean copyCapturedWorldView(float[] destination)
    {
        return VIEW_TRANSFORM.copyMatrix(destination);
    }

    static synchronized boolean copyCapturedProjection(float[] destination)
    {
        return VIEW_TRANSFORM.copyProjection(destination);
    }

    /**
     * Copies the viewport captured with the frame's world-view transform.
     *
     * <p>Mask and shader backends reuse this value to avoid repeated synchronous OpenGL reads.
     *
     * @param destination array receiving x, y, width, and height
     * @return whether a frame viewport was available and copied
     */
    static synchronized boolean copyCapturedViewport(int[] destination)
    {
        if (frameViewportValid == false
                || destination == null
                || destination.length < FRAME_VIEWPORT.length)
        {
            return false;
        }
        System.arraycopy(FRAME_VIEWPORT, 0, destination, 0, FRAME_VIEWPORT.length);
        return true;
    }

    static synchronized LightEffectSubmission queuedFixtureForTest(int ownerId, String fixtureId)
    {
        return QUEUE.get(ownerId, fixtureId);
    }

    static synchronized LightEmissiveSubmission queuedEmissiveForTest(
        int ownerId, String key)
    {
        return EMISSIVE.get(ownerId, key);
    }

    static synchronized int queuedEmissiveCountForTest()
    {
        return EMISSIVE.size();
    }

    static synchronized void clearFixturesForTest()
    {
        QUEUE.clear();
        EMISSIVE.clear();
    }

    static synchronized void submitGlow(LightGlowSubmission value)
    {
        if (enhancedLightingEnabled() == false)
        {
            return;
        }
        GLOWS.put(value.ownerId, value.key, value);
    }

    static synchronized void submitEmissive(LightEmissiveSubmission value)
    {
        if (enhancedLightingEnabled() == false)
        {
            return;
        }
        EMISSIVE.put(value.ownerId, value.key, value);
    }

    /** Releases frame state and all context-bound shader/framebuffer caches. */
    public static synchronized void clear()
    {
        clearWorldState();
        BeamProjectionShader.clear();
        MaxOpacityLightCompositor.clear();
        RollingStockDepthMask.clear();
        RollingStockShadowRenderer.clear();
    }

    static synchronized void clearWorldState()
    {
        QUEUE.clear();
        GLOWS.clear();
        EMISSIVE.clear();
        VIEW_TRANSFORM.clear();
        BeamImpactResolver.clearAll();
        RollingStockLightOcclusion.clearFrame();
        RollingStockDepthMask.finishFrame();
        resetOcclusionDemand();
    }

    /**
     * Drains and renders the current frame, falling back to direct fixed-function effects
     * when optional framebuffer or shader backends are unavailable.
     */
    public static synchronized void flush()
    {
        if (enhancedLightingEnabled() == false)
        {
            clearWorldState();
            return;
        }
        if (QUEUE.isEmpty()
                && GLOWS.isEmpty()
                && EMISSIVE.isEmpty())
        {
            BeamImpactResolver.clearFrame();
            RollingStockLightOcclusion.clearFrame();
            RollingStockDepthMask.finishFrame();
            resetOcclusionDemand();
            return;
        }
        QUEUE.addValuesTo(FRAME_SUBMISSIONS);
        GLOWS.addValuesTo(FRAME_GLOWS);
        EMISSIVE.addValuesTo(FRAME_EMISSIVE);
        QUEUE.clear();
        GLOWS.clear();
        EMISSIVE.clear();
        try
        {
            if (FRAME_SUBMISSIONS.isEmpty()
                    && FRAME_GLOWS.isEmpty()
                    && FRAME_EMISSIVE.isEmpty())
            {
                return;
            }
            boolean visibleBeam = containsVisibleBeam(FRAME_SUBMISSIONS);
            boolean composited = false;
            if (visibleBeam)
            {
                ViewTransform viewTransform = VIEW_TRANSFORM.captured()
                                              ? VIEW_TRANSFORM
                                              : ViewTransform.capture();
                BeamImpactResolver.beginFrame();
                resolveFrameImpacts(viewTransform);
                RollingStockShadowRenderer.beginFrame();
                composited = MaxOpacityLightCompositor.render(FRAME_SUBMISSIONS);
            }
            if (composited == false
                    && visibleBeam
                    && loggedDirectFlush == false)
            {
                loggedDirectFlush = true;
                Traincraft.tcLog.info(
                    "Rendering Traincraft semantic light beams through the direct backend ({} fixtures).",
                    FRAME_SUBMISSIONS.size());
            }

            int activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
            OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE2);
            int shadowTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
            OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE3);
            int stockDepthTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
            OpenGlHelper.setActiveTexture(activeTexture);
            int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
            int previousProgram = GL11.glGetInteger(org.lwjgl.opengl.GL20.GL_CURRENT_PROGRAM);
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            try
            {
                OpenGlHelper.func_153161_d(0);
                setupEffectState();
                if (composited == false)
                {
                    for (LightEffectSubmission submission : FRAME_SUBMISSIONS)
                    {
                        drawBeamSubmission(submission, false);
                    }
                    OpenGlHelper.func_153161_d(0);
                }

                // Only cone geometry is composited. Additive effects are rendered once afterward.
                MaxOpacityLightCompositor.restoreDefaultBlendEquation();
                GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
                for (LightEffectSubmission submission : FRAME_SUBMISSIONS)
                {
                    drawFixtureDecorations(submission);
                }
                for (LightGlowSubmission glow : FRAME_GLOWS)
                {
                    drawGlowSubmission(glow);
                }
                for (LightEmissiveSubmission surface : FRAME_EMISSIVE)
                {
                    drawEmissive(surface);
                }
            }
            finally
            {
                OpenGlHelper.func_153161_d(previousProgram);
                GL11.glPopMatrix();
                GL11.glMatrixMode(matrixMode);
                GL11.glPopAttrib();
                OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE2);
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, shadowTexture);
                OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE3);
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, stockDepthTexture);
                OpenGlHelper.setActiveTexture(activeTexture);
            }
        }
        finally
        {
            FRAME_SUBMISSIONS.clear();
            FRAME_GLOWS.clear();
            FRAME_EMISSIVE.clear();
            VIEW_TRANSFORM.clear();
            BeamImpactResolver.clearFrame();
            RollingStockLightOcclusion.clearFrame();
            RollingStockDepthMask.finishFrame();
            resetOcclusionDemand();
        }
    }

    /** Clears frame-local beam demand and ends optional shader state retained from the prior frame. */
    private static void resetOcclusionDemand()
    {
        BeamProjectionShader.finishFrame();
        frameOcclusionDemandKnown = false;
        frameOcclusionRequired = false;
        frameViewportValid = false;
        OCCLUSION_DEMAND.reset();
    }

    /** Reports whether the current quality mode permits enhanced fixture rendering. */
    private static boolean enhancedLightingEnabled()
    {
        return ConfigHandler.enhancedLightingEnabled();
    }

    static boolean hasVisibleBeam(LightEffectSubmission submission)
    {
        RollingStockLightDefinition definition = submission.definition;
        return ConfigHandler.projectedLightingEnabled()
               && submission.intensity > 0.0F
               && definition.effect() == RollingStockLightDefinition.Effect.BEAM
               && definition.beamLength() > 0.0F
               && definition.beamWidth() > 0.0F
               && BeamColorCompositing.opacity(submission.beamAlpha, submission.intensity)
               > MINIMUM_VISIBLE_BEAM_OPACITY;
    }

    private static boolean containsVisibleBeam(List<LightEffectSubmission> submissions)
    {
        for (LightEffectSubmission submission : submissions)
        {
            if (hasVisibleBeam(submission))
            {
                return true;
            }
        }
        return false;
    }

    static void setupEffectState()
    {
        GL11.glDisable(GL11.GL_LIGHTING);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_FOG);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        GL11.glColorMask(true, true, true, true);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glDepthFunc(GL11.GL_LEQUAL);
        GL11.glDepthMask(false);
        GL11.glDisable(GL11.GL_CULL_FACE);
    }

    static void drawBeamSubmission(LightEffectSubmission submission, boolean premultiplyColor)
    {
        if (hasVisibleBeam(submission) == false)
        {
            return;
        }
        RollingStockLightDefinition definition = submission.definition;
        if (premultiplyColor == false)
        {
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        }
        drawBeam(submission, definition, premultiplyColor);
    }

    /** Draws source glows and impact hotspots independently from projected cone geometry. */
    private static void drawFixtureDecorations(LightEffectSubmission submission)
    {
        RollingStockLightDefinition definition = submission.definition;
        boolean sourceGlowVisible = hasVisibleSourceGlow(submission);
        boolean hotspotEligible =
            submission.intensity > 0.0F
            && definition.effect() == RollingStockLightDefinition.Effect.BEAM
            && definition.beamLength() > 0.0F
            && definition.hotspotEnabled()
            && submission.hotspotAlpha > 0.0F;
        if (sourceGlowVisible == false && hotspotEligible == false)
        {
            return;
        }
        float red = ((definition.color() >> 16) & 255) / 255.0F;
        float green = ((definition.color() >> 8) & 255) / 255.0F;
        float blue = (definition.color() & 255) / 255.0F;
        if (sourceGlowVisible)
        {
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            GL11.glPushMatrix();
            try
            {
                applyPose(submission);
                drawGlowOriented(
                    submission.x,
                    submission.y,
                    submission.z,
                    submission.sourceDx,
                    submission.sourceDy,
                    submission.sourceDz,
                    submission.sourceRightX,
                    submission.sourceRightY,
                    submission.sourceRightZ,
                    submission.sourceUpX,
                    submission.sourceUpY,
                    submission.sourceUpZ,
                    definition.sourceGlowRadius(),
                    definition.sourceGlowWidthScale(),
                    definition.sourceGlowHeightScale(),
                    definition.sourceGlowRightOffset(),
                    definition.sourceGlowUpOffset(),
                    red,
                    green,
                    blue,
                    definition.sourceGlowIntensity() * submission.sourceIntensity);
            }
            finally
            {
                GL11.glPopMatrix();
            }
        }

        if (hotspotEligible == false)
        {
            return;
        }
        drawHotspot(submission, definition, red, green, blue);
    }

    /**
     * Reports whether the fixture has a drawable local source glow.
     *
     * <p>Source emission is intentionally independent from projected intensity. In particular, a
     * DIM headlight has a full-bright lens and source glow while its cone and impact hotspot remain
     * disabled.
     */
    static boolean hasVisibleSourceGlow(LightEffectSubmission submission)
    {
        RollingStockLightDefinition definition = submission.definition;
        return submission.sourceIntensity > 0.0F
               && definition.effect()
                  != RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE
               && definition.sourceGlowRadius() > 0.0F
               && definition.sourceGlowIntensity() > 0.0F;
    }

    /** Draws one impact hotspot using its resolved point, normal, falloff, and viewer rejection. */
    private static void drawHotspot(
        LightEffectSubmission submission,
        RollingStockLightDefinition definition,
        float red,
        float green,
        float blue)
    {
        BeamImpact impact = submission.impactResolution.impact;
        if (impact == null)
        {
            return;
        }
        float visibleLength =
            FixedFunctionBeamGeometry.effectiveLength(
                definition.beamLength(), submission.beamScale, submission.fixtureReach);
        if (visibleLength <= MINIMUM_BEAM_LENGTH)
        {
            return;
        }
        float distanceFraction =
            visibleLength <= MINIMUM_BEAM_LENGTH
            ? 0.0F
            : Math.max(0.0F, Math.min(1.0F, impact.distance / visibleLength));
        float viewerDot = impact.normalX * -impact.pointX
                          + impact.normalY * -impact.pointY
                          + impact.normalZ * -impact.pointZ;
        if (viewerDot <= MINIMUM_VIEWER_FACING_DOT)
        {
            return;
        }
        float radius =
            Math.max(
                definition.sourceGlowRadius() * HOTSPOT_SOURCE_RADIUS_SCALE,
                FixedFunctionBeamGeometry.effectiveWidth(
                    definition.beamWidth(), submission.beamScale, submission.fixtureReach)
                * distanceFraction);
        drawGlow(
            impact.pointX + impact.normalX * HOTSPOT_SURFACE_NUDGE,
            impact.pointY + impact.normalY * HOTSPOT_SURFACE_NUDGE,
            impact.pointZ + impact.normalZ * HOTSPOT_SURFACE_NUDGE,
            impact.normalX,
            impact.normalY,
            impact.normalZ,
            radius,
            1.0F,
            1.0F,
            0.0F,
            0.0F,
            red,
            green,
            blue,
            HOTSPOT_BASE_ALPHA * submission.hotspotAlpha * submission.intensity);
    }

    /** Resolves block and captured rolling-stock endpoints once before either beam backend draws. */
    private static void resolveFrameImpacts(ViewTransform viewTransform)
    {
        World world = Minecraft.getMinecraft().theWorld;
        for (LightEffectSubmission submission : FRAME_SUBMISSIONS)
        {
            submission.impactResolution = BeamImpactResolution.NONE;
            if (world == null || hasVisibleBeam(submission) == false)
            {
                continue;
            }
            RollingStockLightDefinition definition = submission.definition;
            float visibleLength = FixedFunctionBeamGeometry.effectiveLength(
                                      definition.beamLength(),
                                      submission.beamScale,
                                      submission.fixtureReach);
            float visibleWidth = FixedFunctionBeamGeometry.effectiveWidth(
                                     definition.beamWidth(),
                                     submission.beamScale,
                                     submission.fixtureReach);
            BeamImpactResolution stockResolution =
                BeamImpactResolver.resolveStock(submission, visibleLength, visibleWidth);
            BeamImpact blockImpact = resolveBlockImpact(
                                   world, submission, viewTransform, visibleLength);
            BeamImpact nearestImpact = BeamImpact.nearest(stockResolution.impact, blockImpact);
            submission.impactResolution =
                new BeamImpactResolution(
                    nearestImpact, stockResolution.conservativeStockDistance);
        }
    }

    /**
     * Resolves scene-wide cone demand once; every rolling-stock render reuses this result.
     *
     * @param world current client world
     * @param animationTime world time including the current partial tick
     */
    public static synchronized void prepareRollingStockOcclusion(
        World world, double animationTime)
    {
        if (frameOcclusionDemandKnown)
        {
            return;
        }
        ClientRollingStockLighting.populateBeamOcclusionDemand(
            world, animationTime, OCCLUSION_DEMAND);
        frameOcclusionRequired = OCCLUSION_DEMAND.any();
        frameOcclusionDemandKnown = true;
    }

    /**
     * Reports whether any stock geometry may be needed by projected lights this frame.
     *
     * <p>Before demand is prepared the conservative {@code true} result prevents an ordering-dependent
     * first-frame leak. Callers should prefer the stock-specific overload once an entity is known.
     *
     * @return whether rolling-stock occlusion capture should remain enabled
     */
    public static synchronized boolean rollingStockOcclusionRequired()
    {
        return ConfigHandler.projectedLightingEnabled()
               && (frameOcclusionDemandKnown == false || frameOcclusionRequired);
    }

    /**
     * Reports whether one vehicle lies within the broad-phase reach of any projected beam.
     *
     * @param stock vehicle about to render
     * @return whether its geometry should be captured for beam impact and shadow work
     */
    public static synchronized boolean rollingStockOcclusionRequired(
        EntityRollingStock stock)
    {
        if (ConfigHandler.projectedLightingEnabled() == false)
        {
            return false;
        }
        if (frameOcclusionDemandKnown == false)
        {
            return true;
        }
        return stock != null
               && OCCLUSION_DEMAND.reaches(
                      stock.getEntityId(), stock.posX, stock.posY, stock.posZ,
                      RollingStockLightOcclusion.stockBoundingRadius(stock));
    }

    /** Raycasts blocks with owner-exclusion retries and returns the nearest valid block impact. */
    private static BeamImpact resolveBlockImpact(
        World world,
        LightEffectSubmission submission,
        ViewTransform viewTransform,
        float visibleLength)
    {
        BeamSurfacePlacement.Point rayOrigin = BeamSurfacePlacement.rayOrigin(
            submission.x, submission.y, submission.z,
            submission.dx, submission.dy, submission.dz);
        float[] eyeOrigin = submission.eyePoint(rayOrigin.x(), rayOrigin.y(), rayOrigin.z());
        float[] eyeDirection = submission.eyeDirection(
                                   submission.dx, submission.dy, submission.dz);
        Vec3 worldOrigin = viewTransform.eyePointToWorld(
                               eyeOrigin[0], eyeOrigin[1], eyeOrigin[2]);
        float[] worldDirection = viewTransform.eyeDirectionToWorld(
                                     eyeDirection[0], eyeDirection[1], eyeDirection[2]);
        normalizeDirection(worldDirection);
        Vec3 worldEnd = Vec3.createVectorHelper(
            worldOrigin.xCoord + worldDirection[0] * visibleLength,
            worldOrigin.yCoord + worldDirection[1] * visibleLength,
            worldOrigin.zCoord + worldDirection[2] * visibleLength);
        double maximumDistanceSquared = worldEnd.squareDistanceTo(worldOrigin);
        /*
         * World.rayTraceBlocks advances the start Vec3 in place while traversing blocks. Keep the
         * authoritative source and endpoint immutable: impact length, exclusion resumption, and
         * cone truncation all depend on the original fixture-to-hit distance rather than the
         * raycaster's final cursor position.
         */
        MovingObjectPosition hit = world.rayTraceBlocks(
                                       copyVector(worldOrigin), copyVector(worldEnd), false);
        for (int skipped = 0;
                skipped < MAXIMUM_EXCLUDED_BLOCK_HITS
                && hit != null
                && (isExcludedOwnerHit(submission, hit)
                    || isRenderedHotspotTarget(world, hit) == false);
                skipped++)
        {
            Vec3 resumed = advancePastBlock(
                               hit.hitVec, worldDirection,
                               hit.blockX, hit.blockY, hit.blockZ);
            hit = resumed != null
                  && resumed.squareDistanceTo(worldOrigin)
                     < maximumDistanceSquared
                  ? world.rayTraceBlocks(resumed, copyVector(worldEnd), false)
                  : null;
        }
        if (hit == null || hit.hitVec == null || isRenderedHotspotTarget(world, hit) == false)
        {
            return null;
        }
        ForgeDirection face = ForgeDirection.getOrientation(hit.sideHit);
        float[] eyeNormal = viewTransform.worldDirectionToEye(
                                face.offsetX, face.offsetY, face.offsetZ);
        normalizeDirection(eyeNormal);
        float[] eyeHit = viewTransform.worldPointToEye(hit.hitVec);
        return new BeamImpact(
            BeamImpact.Target.BLOCK,
            (float) worldOrigin.distanceTo(hit.hitVec),
            eyeHit[0], eyeHit[1], eyeHit[2],
            eyeNormal[0], eyeNormal[1], eyeNormal[2]);
    }

    /** Copies a mutable Minecraft vector before passing it to a block raycast. */
    private static Vec3 copyVector(Vec3 source)
    {
        return Vec3.createVectorHelper(source.xCoord, source.yCoord, source.zCoord);
    }

    /** Normalizes a three-component direction in place, using forward when it is degenerate. */
    private static void normalizeDirection(float[] direction)
    {
        float length = (float)Math.sqrt(
                           direction[0] * direction[0]
                           + direction[1] * direction[1]
                           + direction[2] * direction[2]);
        if (length <= MINIMUM_DIRECTION_LENGTH)
        {
            return;
        }
        direction[0] /= length;
        direction[1] /= length;
        direction[2] /= length;
    }

    private static boolean isExcludedOwnerHit(
        LightEffectSubmission submission, MovingObjectPosition hit)
    {
        return submission.hasExcludedBlock
               && hit != null
               && hit.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK
               && hit.blockX == submission.excludedBlockX
               && hit.blockY == submission.excludedBlockY
               && hit.blockZ == submission.excludedBlockZ;
    }

    private static boolean isRenderedHotspotTarget(World world, MovingObjectPosition hit)
    {
        return hit != null
               && hit.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK
               && hit.hitVec != null
               && world.getBlock(hit.blockX, hit.blockY, hit.blockZ).getMaterial().isSolid()
               && world.getBlock(hit.blockX, hit.blockY, hit.blockZ).isOpaqueCube();
    }

    /** Advances a retry ray beyond an excluded block while preserving the original direction. */
    private static Vec3 advancePastBlock(
        Vec3 hit, float[] direction, int blockX, int blockY, int blockZ)
    {
        if (hit == null)
        {
            return null;
        }
        double distance = Double.POSITIVE_INFINITY;
        if (direction[0] > RAY_AXIS_EPSILON)
        {
            distance = Math.min(distance, (blockX + 1.0D - hit.xCoord) / direction[0]);
        }
        else
        {
            if (direction[0] < -RAY_AXIS_EPSILON)
            {
                distance = Math.min(distance, (blockX - hit.xCoord) / direction[0]);
            }
        }
        if (direction[1] > RAY_AXIS_EPSILON)
        {
            distance = Math.min(distance, (blockY + 1.0D - hit.yCoord) / direction[1]);
        }
        else
        {
            if (direction[1] < -RAY_AXIS_EPSILON)
            {
                distance = Math.min(distance, (blockY - hit.yCoord) / direction[1]);
            }
        }
        if (direction[2] > RAY_AXIS_EPSILON)
        {
            distance = Math.min(distance, (blockZ + 1.0D - hit.zCoord) / direction[2]);
        }
        else
        {
            if (direction[2] < -RAY_AXIS_EPSILON)
            {
                distance = Math.min(distance, (blockZ - hit.zCoord) / direction[2]);
            }
        }
        if (Double.isInfinite(distance) || Double.isNaN(distance) || distance < 0.0D)
        {
            return hit;
        }
        return Vec3.createVectorHelper(
                   hit.xCoord + direction[0] * (distance + HOTSPOT_SELF_HIT_NUDGE),
                   hit.yCoord + direction[1] * (distance + HOTSPOT_SELF_HIT_NUDGE),
                   hit.zCoord + direction[2] * (distance + HOTSPOT_SELF_HIT_NUDGE));
    }

    private static void drawGlowSubmission(LightGlowSubmission submission)
    {
        float red = ((submission.color >> 16) & 255) / 255.0F;
        float green = ((submission.color >> 8) & 255) / 255.0F;
        float blue = (submission.color & 255) / 255.0F;
        drawGlowOriented(
            submission.x,
            submission.y,
            submission.z,
            submission.dx,
            submission.dy,
            submission.dz,
            submission.rightX,
            submission.rightY,
            submission.rightZ,
            submission.upX,
            submission.upY,
            submission.upZ,
            submission.radius,
            submission.widthScale,
            submission.heightScale,
            submission.rightOffset,
            submission.upOffset,
            red,
            green,
            blue,
            submission.intensity);
    }

    /** Draws one queued emissive polygon submission with its authored color and opacity. */
    private static void drawEmissive(LightEmissiveSubmission submission)
    {
        if (submission.vertexOffsets.length < 3 || submission.intensity <= 0.0F)
        {
            return;
        }
        float red = ((submission.color >> 16) & 255) / 255.0F;
        float green = ((submission.color >> 8) & 255) / 255.0F;
        float blue = (submission.color & 255) / 255.0F;
        // Prime top overlays are coplanar with the beacon geometry and share the light-lens glow
        // layer. Apply the same polygon offset used by source glows; otherwise, existing depth
        // values can hide one overlay triangle and make that section of the rotating top appear
        // stationary.
        GL11.glPushMatrix();
        try
        {
            if (submission.fixtureLocal)
            {
                applyPose(submission.cameraRelativePose);
            }
            GL11.glTranslatef(submission.originX, submission.originY, submission.originZ);
            GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glPolygonOffset(
                COPLANAR_POLYGON_OFFSET_FACTOR, COPLANAR_POLYGON_OFFSET_UNITS);
            try
            {
                GL11.glColor4f(red, green, blue, submission.intensity);
                GL11.glBegin(GL11.GL_TRIANGLES);
                for (int index = 1;
                        index + 1 < submission.vertexOffsets.length;
                        index++)
                {
                    vertex(submission.vertexOffsets[0]);
                    vertex(submission.vertexOffsets[index]);
                    vertex(submission.vertexOffsets[index + 1]);
                }
                GL11.glEnd();
            }
            finally
            {
                GL11.glPolygonOffset(0.0F, 0.0F);
                GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
            }
        }
        finally
        {
            GL11.glPopMatrix();
        }
    }

    private static void vertex(float[] value)
    {
        GL11.glVertex3f(value[0], value[1], value[2]);
    }

    private static void drawGlow(
        float x,
        float y,
        float z,
        float directionX,
        float directionY,
        float directionZ,
        float radius,
        float widthScale,
        float heightScale,
        float rightOffset,
        float upOffset,
        float red,
        float green,
        float blue,
        float alpha)
    {
        if (radius <= 0.0F || alpha <= 0.0F)
        {
            return;
        }
        float[] basis = createBasis(directionX, directionY, directionZ);
        drawGlowOriented(
            x,
            y,
            z,
            directionX,
            directionY,
            directionZ,
            basis[3],
            basis[4],
            basis[5],
            basis[6],
            basis[7],
            basis[8],
            radius,
            widthScale,
            heightScale,
            rightOffset,
            upOffset,
            red,
            green,
            blue,
            alpha);
    }

    /** Draws a source glow quad in an explicit right/up plane. */
    private static void drawGlowOriented(
        float x,
        float y,
        float z,
        float directionX,
        float directionY,
        float directionZ,
        float rightX,
        float rightY,
        float rightZ,
        float upX,
        float upY,
        float upZ,
        float radius,
        float widthScale,
        float heightScale,
        float rightOffset,
        float upOffset,
        float red,
        float green,
        float blue,
        float alpha)
    {
        if (radius <= 0.0F || alpha <= 0.0F)
        {
            return;
        }
        x += rightX * radius * rightOffset + upX * radius * upOffset;
        y += rightY * radius * rightOffset + upY * radius * upOffset;
        z += rightZ * radius * rightOffset + upZ * radius * upOffset;
        float rightRadius = radius * widthScale;
        float upRadius = radius * heightScale;
        GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
        GL11.glPolygonOffset(COPLANAR_POLYGON_OFFSET_FACTOR, COPLANAR_POLYGON_OFFSET_UNITS);
        GL11.glBegin(GL11.GL_TRIANGLES);
        for (int index = 0; index < RADIAL_SEGMENTS; index++)
        {
            double firstAngle = index * Math.PI * 2.0D / RADIAL_SEGMENTS;
            double secondAngle = (index + 1) * Math.PI * 2.0D / RADIAL_SEGMENTS;
            float firstRight = (float) Math.cos(firstAngle) * rightRadius;
            float firstUp = (float) Math.sin(firstAngle) * upRadius;
            float secondRight = (float) Math.cos(secondAngle) * rightRadius;
            float secondUp = (float) Math.sin(secondAngle) * upRadius;
            GL11.glColor4f(red, green, blue, alpha);
            GL11.glVertex3f(x, y, z);
            GL11.glColor4f(red, green, blue, 0.0F);
            GL11.glVertex3f(
                x + rightX * firstRight + upX * firstUp,
                y + rightY * firstRight + upY * firstUp,
                z + rightZ * firstRight + upZ * firstUp);
            GL11.glVertex3f(
                x + rightX * secondRight + upX * secondUp,
                y + rightY * secondRight + upY * secondUp,
                z + rightZ * secondRight + upZ * secondUp);
        }
        GL11.glEnd();
        GL11.glPolygonOffset(0.0F, 0.0F);
        GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
    }

    private static void drawBeam(
        LightEffectSubmission submission,
        RollingStockLightDefinition definition,
        boolean premultiplyColor)
    {
        GL11.glPushMatrix();
        boolean shader = BeamProjectionShader.available();
        try
        {
            if (shader)
            {
                RollingStockShadowRenderer.prepare(submission);
            }
            else
            {
                RollingStockShadowRenderer.clearCurrent();
            }
            applyPose(submission);
            if (shader)
            {
                float opacity =
                    BeamColorCompositing.opacity(submission.beamAlpha, submission.intensity);
                BeamProjectionShader.bind(
                    definition.color(), opacity, premultiplyColor, submission.ownerId);
                drawShaderBeamLocal(submission, definition);
            }
            else
            {
                drawBeamLocal(submission, definition, premultiplyColor);
            }
        }
        finally
        {
            GL11.glPopMatrix();
        }
    }

    /** Four cone sides; fade is evaluated per fragment. */
    private static void drawShaderBeamLocal(
        LightEffectSubmission submission, RollingStockLightDefinition definition)
    {
        float[] basis = resolvedBeamBasis(submission);
        float nominalLength =
            FixedFunctionBeamGeometry.effectiveLength(
                definition.beamLength(), submission.beamScale, submission.fixtureReach);
        float visibleLength =
            submission.impactResolution.visibleLength(nominalLength, true);
        float nominalHorizontalHalfWidth =
            FixedFunctionBeamGeometry.effectiveWidth(
                definition.beamWidth(), submission.beamScale, submission.fixtureReach);
        float lengthRatio = nominalLength <= MINIMUM_BEAM_LENGTH
                            ? 0.0F
                            : visibleLength / nominalLength;
        float horizontalHalfWidth = nominalHorizontalHalfWidth * lengthRatio;
        float verticalHalfWidth = horizontalHalfWidth * BEAM_VERTICAL_HALF_WIDTH_SCALE;
        BeamSurfacePlacement.Placement placement =
            BeamSurfacePlacement.place(
                submission.x,
                submission.y,
                submission.z,
                basis[0],
                basis[1],
                basis[2],
                visibleLength);
        fillBeamCorners(
            BEAM_FAR,
            placement.startX(),
            placement.startY(),
            placement.startZ(),
            basis[0],
            basis[1],
            basis[2],
            basis[3],
            basis[4],
            basis[5],
            basis[6],
            basis[7],
            basis[8],
            placement.length(),
            horizontalHalfWidth,
            verticalHalfWidth,
            1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float farFadeFraction = BeamImpactResolution.originalDistanceFraction(
                                    nominalLength, visibleLength, 1.0F);
        GL11.glBegin(GL11.GL_TRIANGLES);
        for (int side = 0; side < 4; side++)
        {
            int next = (side + 1) & 3;
            GL11.glTexCoord1f(0.0F);
            GL11.glVertex3f(placement.startX(), placement.startY(), placement.startZ());
            GL11.glTexCoord1f(farFadeFraction);
            GL11.glVertex3f(BEAM_FAR[side][0], BEAM_FAR[side][1], BEAM_FAR[side][2]);
            GL11.glTexCoord1f(farFadeFraction);
            GL11.glVertex3f(BEAM_FAR[next][0], BEAM_FAR[next][1], BEAM_FAR[next][2]);
        }
        GL11.glEnd();
    }

    /** Tessellates the fixed-function beam cone in fixture-local coordinates. */
    private static void drawBeamLocal(
        LightEffectSubmission submission,
        RollingStockLightDefinition definition,
        boolean premultiplyColor)
    {
        float[] basis = resolvedBeamBasis(submission);
        float directionX = basis[0];
        float directionY = basis[1];
        float directionZ = basis[2];
        float rightX = basis[3];
        float rightY = basis[4];
        float rightZ = basis[5];
        float upX = basis[6];
        float upY = basis[7];
        float upZ = basis[8];
        float nominalLength =
            FixedFunctionBeamGeometry.effectiveLength(
                definition.beamLength(), submission.beamScale, submission.fixtureReach);
        float visibleLength =
            submission.impactResolution.visibleLength(nominalLength, false);
        float nominalHorizontalHalfWidth =
            FixedFunctionBeamGeometry.effectiveWidth(
                definition.beamWidth(), submission.beamScale, submission.fixtureReach);
        float lengthRatio = nominalLength <= MINIMUM_BEAM_LENGTH
                            ? 0.0F
                            : visibleLength / nominalLength;
        float horizontalHalfWidth = nominalHorizontalHalfWidth * lengthRatio;
        float verticalHalfWidth = horizontalHalfWidth * BEAM_VERTICAL_HALF_WIDTH_SCALE;
        BeamSurfacePlacement.Placement placement =
            BeamSurfacePlacement.place(
                submission.x,
                submission.y,
                submission.z,
                directionX,
                directionY,
                directionZ,
                visibleLength);
        float originX = placement.startX(),
              originY = placement.startY(),
              originZ = placement.startZ();
        int color = definition.color();
        int red = (color >> 16) & 255;
        int green = (color >> 8) & 255;
        int blue = color & 255;
        float opacity =
            FixedFunctionBeamGeometry.visualOpacity(
                BeamColorCompositing.opacity(submission.beamAlpha, submission.intensity));
        int segments = FixedFunctionBeamGeometry.fadeSegments(placement.length());
        GL11.glBegin(GL11.GL_TRIANGLES);
        for (int segment = 0; segment < segments; segment++)
        {
            float nearFraction = segment / (float) segments;
            float farFraction = (segment + 1) / (float) segments;
            fillBeamCorners(
                BEAM_NEAR,
                originX,
                originY,
                originZ,
                directionX,
                directionY,
                directionZ,
                rightX,
                rightY,
                rightZ,
                upX,
                upY,
                upZ,
                placement.length(),
                horizontalHalfWidth,
                verticalHalfWidth,
                nearFraction);
            fillBeamCorners(
                BEAM_FAR,
                originX,
                originY,
                originZ,
                directionX,
                directionY,
                directionZ,
                rightX,
                rightY,
                rightZ,
                upX,
                upY,
                upZ,
                placement.length(),
                horizontalHalfWidth,
                verticalHalfWidth,
                farFraction);
            float nearOpacity =
                opacity * FixedFunctionBeamGeometry.fadeAt(
                    BeamImpactResolution.originalDistanceFraction(
                        nominalLength, visibleLength, nearFraction));
            float farOpacity =
                opacity * FixedFunctionBeamGeometry.fadeAt(
                    BeamImpactResolution.originalDistanceFraction(
                        nominalLength, visibleLength, farFraction));
            for (int side = 0; side < 4; side++)
            {
                int next = (side + 1) & 3;
                beamVertex(BEAM_NEAR[side], red, green, blue, nearOpacity, premultiplyColor);
                beamVertex(BEAM_FAR[side], red, green, blue, farOpacity, premultiplyColor);
                beamVertex(BEAM_FAR[next], red, green, blue, farOpacity, premultiplyColor);
                beamVertex(BEAM_NEAR[side], red, green, blue, nearOpacity, premultiplyColor);
                beamVertex(BEAM_FAR[next], red, green, blue, farOpacity, premultiplyColor);
                beamVertex(BEAM_NEAR[next], red, green, blue, nearOpacity, premultiplyColor);
            }
        }
        GL11.glEnd();
    }

    private static void fillBeamCorners(
        float[][] result,
        float originX,
        float originY,
        float originZ,
        float directionX,
        float directionY,
        float directionZ,
        float rightX,
        float rightY,
        float rightZ,
        float upX,
        float upY,
        float upZ,
        float length,
        float rightRadius,
        float upRadius,
        float fraction)
    {
        float centerX = originX + directionX * length * fraction;
        float centerY = originY + directionY * length * fraction;
        float centerZ = originZ + directionZ * length * fraction;
        float right = rightRadius * fraction;
        float up = upRadius * fraction;
        result[0][0] = centerX - rightX * right - upX * up;
        result[0][1] = centerY - rightY * right - upY * up;
        result[0][2] = centerZ - rightZ * right - upZ * up;
        result[1][0] = centerX - rightX * right + upX * up;
        result[1][1] = centerY - rightY * right + upY * up;
        result[1][2] = centerZ - rightZ * right + upZ * up;
        result[2][0] = centerX + rightX * right + upX * up;
        result[2][1] = centerY + rightY * right + upY * up;
        result[2][2] = centerZ + rightZ * right + upZ * up;
        result[3][0] = centerX + rightX * right - upX * up;
        result[3][1] = centerY + rightY * right - upY * up;
        result[3][2] = centerZ + rightZ * right - upZ * up;
    }

    private static void beamVertex(
        float[] vertex, int red, int green, int blue, float opacity, boolean premultiplyColor)
    {
        float alpha = BeamColorCompositing.SOURCE_ALPHA / 255.0F * opacity;
        if (premultiplyColor)
        {
            GL11.glColor4f(
                red / 255.0F * alpha, green / 255.0F * alpha, blue / 255.0F * alpha, alpha);
        }
        else
        {
            GL11.glColor4f(red / 255.0F, green / 255.0F, blue / 255.0F, alpha);
        }
        GL11.glVertex3f(vertex[0], vertex[1], vertex[2]);
    }

    private static void applyPose(LightEffectSubmission submission)
    {
        if (submission.fixtureLocal == false)
        {
            return;
        }
        applyPose(submission.cameraRelativePose);
    }

    private static void applyPose(float[] cameraRelativePose)
    {
        POSE_BUFFER.clear();
        POSE_BUFFER.put(cameraRelativePose);
        POSE_BUFFER.flip();
        GL11.glMultMatrix(POSE_BUFFER);
    }

    static float[] resolvedBeamBasis(LightEffectSubmission submission)
    {
        float[] fallback = createBasis(submission.dx, submission.dy, submission.dz);
        float directionX = fallback[0];
        float directionY = fallback[1];
        float directionZ = fallback[2];
        float rightX = submission.rightX;
        float rightY = submission.rightY;
        float rightZ = submission.rightZ;
        float projection = rightX * directionX + rightY * directionY + rightZ * directionZ;
        rightX -= directionX * projection;
        rightY -= directionY * projection;
        rightZ -= directionZ * projection;
        float length = (float) Math.sqrt(rightX * rightX + rightY * rightY + rightZ * rightZ);
        if (length <= MINIMUM_BEAM_LENGTH)
        {
            rightX = fallback[3];
            rightY = fallback[4];
            rightZ = fallback[5];
        }
        else
        {
            rightX /= length;
            rightY /= length;
            rightZ /= length;
        }
        float upX = rightY * directionZ - rightZ * directionY;
        float upY = rightZ * directionX - rightX * directionZ;
        float upZ = rightX * directionY - rightY * directionX;
        if (upX * submission.upX + upY * submission.upY + upZ * submission.upZ < 0.0F)
        {
            rightX = -rightX;
            rightY = -rightY;
            rightZ = -rightZ;
            upX = -upX;
            upY = -upY;
            upZ = -upZ;
        }
        return new float[]
               {
                   directionX, directionY, directionZ,
                   rightX, rightY, rightZ,
                   upX, upY, upZ
               };
    }

    static boolean invertAffineForTest(float[] source, float[] destination)
    {
        return invertAffine(source, destination);
    }

    /** Inverts one column-major affine model-view matrix without allocating temporary objects. */
    private static boolean invertAffine(float[] source, float[] destination)
    {
        if (source == null
                || destination == null
                || source.length < 16
                || destination.length < 16)
        {
            return false;
        }
        float a = source[0];
        float b = source[4];
        float c = source[8];
        float d = source[1];
        float e = source[5];
        float f = source[9];
        float g = source[2];
        float h = source[6];
        float i = source[10];
        float c00 = e * i - f * h;
        float c01 = f * g - d * i;
        float c02 = d * h - e * g;
        float c10 = c * h - b * i;
        float c11 = a * i - c * g;
        float c12 = b * g - a * h;
        float c20 = b * f - c * e;
        float c21 = c * d - a * f;
        float c22 = a * e - b * d;
        float determinant = a * c00 + b * c01 + c * c02;
        if (Math.abs(determinant) <= MATRIX_DETERMINANT_EPSILON)
        {
            return false;
        }
        float inverseDeterminant = 1.0F / determinant;
        destination[0] = c00 * inverseDeterminant;
        destination[1] = c01 * inverseDeterminant;
        destination[2] = c02 * inverseDeterminant;
        destination[3] = 0.0F;
        destination[4] = c10 * inverseDeterminant;
        destination[5] = c11 * inverseDeterminant;
        destination[6] = c12 * inverseDeterminant;
        destination[7] = 0.0F;
        destination[8] = c20 * inverseDeterminant;
        destination[9] = c21 * inverseDeterminant;
        destination[10] = c22 * inverseDeterminant;
        destination[11] = 0.0F;
        destination[12] =
            -(destination[0] * source[12]
              + destination[4] * source[13]
              + destination[8] * source[14]);
        destination[13] =
            -(destination[1] * source[12]
              + destination[5] * source[13]
              + destination[9] * source[14]);
        destination[14] =
            -(destination[2] * source[12]
              + destination[6] * source[13]
              + destination[10] * source[14]);
        destination[15] = 1.0F;
        return true;

    }

    /** Creates a stable orthonormal direction/right/up basis for one beam direction. */
    private static float[] createBasis(float directionX, float directionY, float directionZ)
    {
        float length =
            (float)
            Math.sqrt(
                directionX * directionX
                + directionY * directionY
                + directionZ * directionZ);
        if (length < MINIMUM_BEAM_LENGTH)
        {
            return new float[] {0, 0, 1, 1, 0, 0, 0, 1, 0};
        }
        directionX /= length;
        directionY /= length;
        directionZ /= length;
        float referenceY =
            Math.abs(directionY) < REFERENCE_AXIS_PARALLEL_THRESHOLD ? 1.0F : 0.0F;
        float referenceZ = referenceY == 0.0F ? 1.0F : 0.0F;
        float rightX = directionY * referenceZ - directionZ * referenceY;
        float rightY = -directionX * referenceZ;
        float rightZ = directionX * referenceY;
        float scale =
            (float)(1.0D / Math.sqrt(rightX * rightX + rightY * rightY + rightZ * rightZ));
        rightX *= scale;
        rightY *= scale;
        rightZ *= scale;
        float upX = rightY * directionZ - rightZ * directionY;
        float upY = rightZ * directionX - rightX * directionZ;
        float upZ = rightX * directionY - rightY * directionX;
        return new float[]
               {
                   directionX, directionY, directionZ,
                   rightX, rightY, rightZ,
                   upX, upY, upZ
               };
    }

    /** Converts the eye-space submissions back to world space for block raycasts. */
    private static final class ViewTransform
    {
        /**
         * OpenGL column-major transforms: {@code [0..3]} column 0, {@code [4..7]} column 1,
         * {@code [8..11]} column 2, and {@code [12..15]} the translation/homogeneous column.
         */
        private final float[] matrix = new float[16];
        private final float[] inverse = new float[16];
        private final float[] projection = new float[16];
        private double cameraX;
        private double cameraY;
        private double cameraZ;
        private boolean captured;

        private ViewTransform() {}

        static ViewTransform capture()
        {
            VIEW_TRANSFORM.captureCurrent();
            return VIEW_TRANSFORM;
        }

        void captureCurrent()
        {
            VIEW_BUFFER.clear();
            GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, VIEW_BUFFER);
            VIEW_BUFFER.get(VIEW_TRANSFORM.matrix);
            VIEW_BUFFER.clear();
            GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, VIEW_BUFFER);
            VIEW_BUFFER.get(VIEW_TRANSFORM.projection);
            VIEW_TRANSFORM.cameraX = TileEntityRendererDispatcher.staticPlayerX;
            VIEW_TRANSFORM.cameraY = TileEntityRendererDispatcher.staticPlayerY;
            VIEW_TRANSFORM.cameraZ = TileEntityRendererDispatcher.staticPlayerZ;
            VIEW_TRANSFORM.captured = invertAffine(VIEW_TRANSFORM.matrix, VIEW_TRANSFORM.inverse);
        }

        boolean captured()
        {
            return captured;
        }

        boolean copyMatrix(float[] destination)
        {
            if (captured == false || destination == null || destination.length < 16)
            {
                return false;
            }
            System.arraycopy(matrix, 0, destination, 0, 16);
            return true;
        }

        boolean copyProjection(float[] destination)
        {
            if (captured == false || destination == null || destination.length < 16)
            {
                return false;
            }
            System.arraycopy(projection, 0, destination, 0, 16);
            return true;
        }

        void clear()
        {
            captured = false;
        }

        Vec3 eyePointToWorld(float x, float y, float z)
        {
            return Vec3.createVectorHelper(
                       cameraX
                       + inverse[0] * x
                       + inverse[4] * y
                       + inverse[8] * z
                       + inverse[12],
                       cameraY
                       + inverse[1] * x
                       + inverse[5] * y
                       + inverse[9] * z
                       + inverse[13],
                       cameraZ
                       + inverse[2] * x
                       + inverse[6] * y
                       + inverse[10] * z
                       + inverse[14]);
        }

        float[] eyeDirectionToWorld(float x, float y, float z)
        {
            return normalize(
                       inverse[0] * x + inverse[4] * y + inverse[8] * z,
                       inverse[1] * x + inverse[5] * y + inverse[9] * z,
                       inverse[2] * x + inverse[6] * y + inverse[10] * z);

        }

        float[] worldPointToEye(Vec3 point)
        {
            float x = (float)(point.xCoord - cameraX);
            float y = (float)(point.yCoord - cameraY);
            float z = (float)(point.zCoord - cameraZ);
            return new float[]
                   {
                       matrix[0] * x + matrix[4] * y + matrix[8] * z + matrix[12],
                       matrix[1] * x + matrix[5] * y + matrix[9] * z + matrix[13],
                       matrix[2] * x + matrix[6] * y + matrix[10] * z + matrix[14]
                   };
        }

        float[] worldDirectionToEye(float x, float y, float z)
        {
            return normalize(
                       matrix[0] * x + matrix[4] * y + matrix[8] * z,
                       matrix[1] * x + matrix[5] * y + matrix[9] * z,
                       matrix[2] * x + matrix[6] * y + matrix[10] * z);
        }

        /** Returns a normalized three-component vector for view-transform hotspot calculations. */
        private static float[] normalize(float x, float y, float z)
        {
            float length = (float) Math.sqrt(x * x + y * y + z * z);
            if (length <= MINIMUM_BEAM_LENGTH)
            {
                return new float[] {0.0F, 0.0F, 1.0F};
            }
            return new float[] {x / length, y / length, z / length};
        }
    }

}
