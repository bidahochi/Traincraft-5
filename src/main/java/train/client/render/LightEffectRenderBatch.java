package train.client.render;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import train.common.api.RollingStockLightDefinition;
import train.common.core.handlers.ConfigHandler;

/** Collects client lighting effects and renders them during the world-last pass. */
public final class LightEffectRenderBatch {
    private static final int RADIAL_SEGMENTS = 12;
    private static final float HOTSPOT_SURFACE_NUDGE = 0.012F;
    private static final float HOTSPOT_SELF_HIT_NUDGE = 0.01F;
    private static final FrameFixtureQueue<LightEffectSubmission> QUEUE =
            new FrameFixtureQueue<LightEffectSubmission>();
    private static final FrameFixtureQueue<LightGlowSubmission> GLOWS =
            new FrameFixtureQueue<LightGlowSubmission>();
    private static final FrameFixtureQueue<LightEmissiveSubmission> EMISSIVE =
            new FrameFixtureQueue<LightEmissiveSubmission>();
    private static final Map<String, CachedHotspot> HOTSPOT_CACHE =
            new HashMap<String, CachedHotspot>();
    private static final FloatBuffer POSE_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer VIEW_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final float[][] BEAM_NEAR = new float[4][3];
    private static final float[][] BEAM_FAR = new float[4][3];
    private static final List<LightEffectSubmission> FRAME_SUBMISSIONS =
            new ArrayList<LightEffectSubmission>();
    private static final List<LightGlowSubmission> FRAME_GLOWS =
            new ArrayList<LightGlowSubmission>();
    private static final List<LightEmissiveSubmission> FRAME_EMISSIVE =
            new ArrayList<LightEmissiveSubmission>();
    private static final ViewTransform VIEW_TRANSFORM = new ViewTransform();
    private static boolean loggedDirectFlush;
    private static World hotspotWorld;
    private static long hotspotTick = Long.MIN_VALUE;

    private LightEffectRenderBatch() {}

    public static synchronized void submit(LightEffectSubmission value) {
        if (enhancedLightingEnabled() == false) {
            return;
        }
        LightEffectSubmission existing = QUEUE.get(value.ownerId, value.fixtureId);
        if (existing == null) {
            QUEUE.put(value.ownerId, value.fixtureId, value);
        } else {
            existing.merge(value);
        }
    }

    public static synchronized void captureWorldView() {
        if (enhancedLightingEnabled() == false) {
            return;
        }
        if (VIEW_TRANSFORM.captured() == false) {
            VIEW_TRANSFORM.captureCurrent();
        }
    }

    static synchronized boolean copyCapturedWorldView(float[] destination) {
        return VIEW_TRANSFORM.copyMatrix(destination);
    }

    static synchronized boolean copyCapturedProjection(float[] destination) {
        return VIEW_TRANSFORM.copyProjection(destination);
    }

    static synchronized LightEffectSubmission queuedFixtureForTest(int ownerId, String fixtureId) {
        return QUEUE.get(ownerId, fixtureId);
    }

    static synchronized LightEmissiveSubmission queuedEmissiveForTest(
            int ownerId, String key) {
        return EMISSIVE.get(ownerId, key);
    }

    static synchronized int queuedEmissiveCountForTest() {
        return EMISSIVE.size();
    }

    static synchronized void clearFixturesForTest() {
        QUEUE.clear();
        EMISSIVE.clear();
    }

    static synchronized void submitGlow(LightGlowSubmission value) {
        if (enhancedLightingEnabled() == false) {
            return;
        }
        GLOWS.put(value.ownerId, value.key, value);
    }

    static synchronized void submitEmissive(LightEmissiveSubmission value) {
        if (enhancedLightingEnabled() == false) {
            return;
        }
        EMISSIVE.put(value.ownerId, value.key, value);
    }

    public static synchronized void clear() {
        clearWorldState();
        LegacyBeamShader.clear();
        MaxOpacityLightCompositor.clear();
        ClientDynamicHeadlightRenderer.clear();
        RollingStockDepthMask.clear();
        RollingStockShadowRenderer.clear();
    }

    static synchronized void clearWorldState() {
        QUEUE.clear();
        GLOWS.clear();
        EMISSIVE.clear();
        HOTSPOT_CACHE.clear();
        hotspotWorld = null;
        hotspotTick = Long.MIN_VALUE;
        VIEW_TRANSFORM.clear();
        RollingStockLightOcclusion.clearFrame();
        RollingStockDepthMask.finishFrame();
    }

    public static synchronized void flush() {
        if (enhancedLightingEnabled() == false) {
            clearWorldState();
            return;
        }
        if (QUEUE.isEmpty()
                && GLOWS.isEmpty()
                && EMISSIVE.isEmpty()) {
            RollingStockLightOcclusion.clearFrame();
            RollingStockDepthMask.finishFrame();
            return;
        }
        QUEUE.addValuesTo(FRAME_SUBMISSIONS);
        GLOWS.addValuesTo(FRAME_GLOWS);
        EMISSIVE.addValuesTo(FRAME_EMISSIVE);
        QUEUE.clear();
        GLOWS.clear();
        EMISSIVE.clear();
        try {
            ClientDynamicHeadlightRenderer.render(FRAME_SUBMISSIONS);
            if (FRAME_SUBMISSIONS.isEmpty()
                    && FRAME_GLOWS.isEmpty()
                    && FRAME_EMISSIVE.isEmpty()) {
                return;
            }
            ViewTransform viewTransform = VIEW_TRANSFORM.captured()
                    ? VIEW_TRANSFORM
                    : ViewTransform.capture();
            boolean composited = MaxOpacityLightCompositor.render(FRAME_SUBMISSIONS);
            if (composited == false
                    && containsVisibleBeam(FRAME_SUBMISSIONS)
                    && loggedDirectFlush == false) {
                loggedDirectFlush = true;
                Traincraft.tcLog.info(
                        "Rendering Traincraft semantic light beams through the direct backend ({} fixtures).",
                        FRAME_SUBMISSIONS.size());
            }

            int activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
            OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE2);
            int shadowTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
            OpenGlHelper.setActiveTexture(activeTexture);
            int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
            int previousProgram = GL11.glGetInteger(org.lwjgl.opengl.GL20.GL_CURRENT_PROGRAM);
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            try {
                OpenGlHelper.func_153161_d(0);
                setupEffectState();
                if (composited == false) {
                    for (LightEffectSubmission submission : FRAME_SUBMISSIONS) {
                        drawBeamSubmission(submission, false);
                    }
                    OpenGlHelper.func_153161_d(0);
                }

                // Only cone geometry is composited. Additive effects are rendered once afterward.
                MaxOpacityLightCompositor.restoreDefaultBlendEquation();
                GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
                for (LightEffectSubmission submission : FRAME_SUBMISSIONS) {
                    drawFixtureDecorations(submission, viewTransform);
                }
                for (LightGlowSubmission glow : FRAME_GLOWS) {
                    drawGlowSubmission(glow);
                }
                for (LightEmissiveSubmission surface : FRAME_EMISSIVE) {
                    drawEmissive(surface);
                }
            } finally {
                OpenGlHelper.func_153161_d(previousProgram);
                GL11.glPopMatrix();
                GL11.glMatrixMode(matrixMode);
                GL11.glPopAttrib();
                OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE2);
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, shadowTexture);
                OpenGlHelper.setActiveTexture(activeTexture);
            }
        } finally {
            FRAME_SUBMISSIONS.clear();
            FRAME_GLOWS.clear();
            FRAME_EMISSIVE.clear();
            VIEW_TRANSFORM.clear();
            RollingStockLightOcclusion.clearFrame();
            RollingStockDepthMask.finishFrame();
        }
    }

    private static boolean enhancedLightingEnabled() {
        return ConfigHandler.ENABLE_ADVANCED_LIGHTING;
    }

    static boolean hasVisibleBeam(LightEffectSubmission submission) {
        RollingStockLightDefinition definition = submission.definition;
        return submission.intensity > 0.0F
                && definition.effect() == RollingStockLightDefinition.Effect.BEAM
                && definition.beamLength() > 0.0F
                && definition.beamWidth() > 0.0F
                && BeamColorCompositing.opacity(submission.beamAlpha, submission.intensity)
                        > 1.0E-3F;
    }

    private static boolean containsVisibleBeam(List<LightEffectSubmission> submissions) {
        for (LightEffectSubmission submission : submissions) {
            if (hasVisibleBeam(submission)) {
                return true;
            }
        }
        return false;
    }

    static void setupEffectState() {
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

    static void drawBeamSubmission(LightEffectSubmission submission, boolean premultiplyColor) {
        if (hasVisibleBeam(submission) == false) {
            return;
        }
        RollingStockLightDefinition definition = submission.definition;
        if (premultiplyColor == false) {
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        }
        drawBeam(submission, definition, premultiplyColor);
    }

    private static void drawFixtureDecorations(
            LightEffectSubmission submission, ViewTransform viewTransform) {
        RollingStockLightDefinition definition = submission.definition;
        if (submission.intensity <= 0.0F
                || definition.effect() == RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE) {
            return;
        }
        float red = ((definition.color() >> 16) & 255) / 255.0F;
        float green = ((definition.color() >> 8) & 255) / 255.0F;
        float blue = (definition.color() & 255) / 255.0F;
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        GL11.glPushMatrix();
        try {
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
        } finally {
            GL11.glPopMatrix();
        }

        if (definition.effect() != RollingStockLightDefinition.Effect.BEAM
                || definition.beamLength() <= 0.0F
                || definition.hotspotEnabled() == false
                || submission.hotspotAlpha <= 0.0F) {
            return;
        }
        drawHotspot(submission, definition, viewTransform, red, green, blue);
    }

    private static void drawHotspot(
            LightEffectSubmission submission,
            RollingStockLightDefinition definition,
            ViewTransform viewTransform,
            float red,
            float green,
            float blue) {
        Minecraft minecraft = Minecraft.getMinecraft();
        World world = minecraft.theWorld;
        if (world == null) {
            return;
        }
        // Raycast the same reach that is visible this frame. A surface beyond
        // the rendered cone must never receive a detached hotspot.
        float visibleLength =
                FixedFunctionBeamGeometry.effectiveLength(
                        definition.beamLength(), submission.beamScale, submission.fixtureReach);
        if (visibleLength <= 1.0E-5F) {
            return;
        }
        float configuredWidth = definition.beamWidth();
        BeamSurfacePlacement.Point rayOrigin =
                BeamSurfacePlacement.rayOrigin(
                        submission.x,
                        submission.y,
                        submission.z,
                        submission.dx,
                        submission.dy,
                        submission.dz);
        float[] eyeOrigin = submission.eyePoint(rayOrigin.x(), rayOrigin.y(), rayOrigin.z());
        float[] eyeDirection = submission.eyeDirection(submission.dx, submission.dy, submission.dz);
        Vec3 worldOrigin = viewTransform.eyePointToWorld(eyeOrigin[0], eyeOrigin[1], eyeOrigin[2]);
        float[] worldDirection =
                viewTransform.eyeDirectionToWorld(
                        eyeDirection[0], eyeDirection[1], eyeDirection[2]);
        Vec3 worldEnd =
                Vec3.createVectorHelper(
                        worldOrigin.xCoord + worldDirection[0] * visibleLength,
                        worldOrigin.yCoord + worldDirection[1] * visibleLength,
                        worldOrigin.zCoord + worldDirection[2] * visibleLength);
        long gameTime = world.getTotalWorldTime();
        prepareHotspotCache(world, gameTime);
        String cacheKey =
                System.identityHashCode(world)
                        + "\n"
                        + submission.ownerId
                        + "\n"
                        + submission.fixtureId;
        CachedHotspot cached = HOTSPOT_CACHE.get(cacheKey);
        MovingObjectPosition hit;
        if (cached != null && cached.gameTime == gameTime) {
            hit = cached.hit;
        } else {
            hit = world.rayTraceBlocks(worldOrigin, worldEnd, false);
            for (int skipped = 0;
                    skipped < 8
                            && hit != null
                            && (isExcludedOwnerHit(submission, hit)
                                    || isRenderedHotspotTarget(world, hit) == false);
                    skipped++) {
                Vec3 resumed =
                        advancePastBlock(
                                hit.hitVec,
                                worldDirection,
                                hit.blockX,
                                hit.blockY,
                                hit.blockZ);
                if (resumed != null
                        && resumed.squareDistanceTo(worldOrigin)
                                < worldEnd.squareDistanceTo(worldOrigin)) {
                    hit = world.rayTraceBlocks(resumed, worldEnd, false);
                } else {
                    hit = null;
                }
            }
            HOTSPOT_CACHE.put(cacheKey, new CachedHotspot(gameTime, hit));
        }
        if (hit == null
                || hit.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK
                || hit.hitVec == null
                || isRenderedHotspotTarget(world, hit) == false) {
            return;
        }

        double distance = worldOrigin.distanceTo(hit.hitVec);
        float distanceFraction =
                visibleLength <= 1.0E-5F
                        ? 0.0F
                        : (float) Math.max(0.0D, Math.min(1.0D, distance / visibleLength));
        ForgeDirection hitFace = ForgeDirection.getOrientation(hit.sideHit);
        float[] eyeNormal =
                viewTransform.worldDirectionToEye(
                        hitFace.offsetX, hitFace.offsetY, hitFace.offsetZ);
        float[] eyeHit = viewTransform.worldPointToEye(hit.hitVec);
        float viewerDot = eyeNormal[0] * -eyeHit[0]
                + eyeNormal[1] * -eyeHit[1]
                + eyeNormal[2] * -eyeHit[2];
        if (viewerDot <= 1.0E-4F) {
            return;
        }
        float radius =
                Math.max(definition.sourceGlowRadius() * 1.2F, configuredWidth * distanceFraction);
        drawGlow(
                eyeHit[0] + eyeNormal[0] * HOTSPOT_SURFACE_NUDGE,
                eyeHit[1] + eyeNormal[1] * HOTSPOT_SURFACE_NUDGE,
                eyeHit[2] + eyeNormal[2] * HOTSPOT_SURFACE_NUDGE,
                eyeNormal[0],
                eyeNormal[1],
                eyeNormal[2],
                radius,
                1.0F,
                1.0F,
                0.0F,
                0.0F,
                red,
                green,
                blue,
                (210.0F / 255.0F) * submission.hotspotAlpha * submission.intensity);
    }

    static synchronized int hotspotCacheSizeForTest() {
        return HOTSPOT_CACHE.size();
    }

    static synchronized void cacheHotspotForTest(World world, long tick, String key) {
        prepareHotspotCache(world, tick);
        HOTSPOT_CACHE.put(key, new CachedHotspot(tick, null));
    }

    private static void prepareHotspotCache(World world, long tick) {
        if (hotspotWorld == world && hotspotTick == tick) return;
        HOTSPOT_CACHE.clear();
        hotspotWorld = world;
        hotspotTick = tick;
    }

    private static boolean isExcludedOwnerHit(
            LightEffectSubmission submission, MovingObjectPosition hit) {
        return submission.hasExcludedBlock
                && hit != null
                && hit.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK
                && hit.blockX == submission.excludedBlockX
                && hit.blockY == submission.excludedBlockY
                && hit.blockZ == submission.excludedBlockZ;
    }

    private static boolean isRenderedHotspotTarget(World world, MovingObjectPosition hit) {
        return hit != null
                && hit.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK
                && hit.hitVec != null
                && world.getBlock(hit.blockX, hit.blockY, hit.blockZ).getMaterial().isSolid()
                && world.getBlock(hit.blockX, hit.blockY, hit.blockZ).isOpaqueCube();
    }

    private static Vec3 advancePastBlock(
            Vec3 hit, float[] direction, int blockX, int blockY, int blockZ) {
        if (hit == null) return null;
        double distance = Double.POSITIVE_INFINITY;
        if (direction[0] > 1.0E-8F)
            distance = Math.min(distance, (blockX + 1.0D - hit.xCoord) / direction[0]);
        else if (direction[0] < -1.0E-8F)
            distance = Math.min(distance, (blockX - hit.xCoord) / direction[0]);
        if (direction[1] > 1.0E-8F)
            distance = Math.min(distance, (blockY + 1.0D - hit.yCoord) / direction[1]);
        else if (direction[1] < -1.0E-8F)
            distance = Math.min(distance, (blockY - hit.yCoord) / direction[1]);
        if (direction[2] > 1.0E-8F)
            distance = Math.min(distance, (blockZ + 1.0D - hit.zCoord) / direction[2]);
        else if (direction[2] < -1.0E-8F)
            distance = Math.min(distance, (blockZ - hit.zCoord) / direction[2]);
        if (Double.isInfinite(distance) || Double.isNaN(distance) || distance < 0.0D) return hit;
        return Vec3.createVectorHelper(
                hit.xCoord + direction[0] * (distance + HOTSPOT_SELF_HIT_NUDGE),
                hit.yCoord + direction[1] * (distance + HOTSPOT_SELF_HIT_NUDGE),
                hit.zCoord + direction[2] * (distance + HOTSPOT_SELF_HIT_NUDGE));
    }

    private static void drawGlowSubmission(LightGlowSubmission submission) {
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

    private static void drawEmissive(LightEmissiveSubmission submission) {
        if (submission.vertexOffsets.length < 3 || submission.intensity <= 0.0F) {
            return;
        }
        float red = ((submission.color >> 16) & 255) / 255.0F;
        float green = ((submission.color >> 8) & 255) / 255.0F;
        float blue = (submission.color & 255) / 255.0F;
        // Prime tops use the light-lens glow layer, whose layering
        // state biases coplanar surfaces by exactly these values. Without the
        // bias the deferred top overlay loses against the beacon geometry's
        // existing depth, making one underlying triangle appear stationary.
        GL11.glPushMatrix();
        try {
            if (submission.fixtureLocal) {
                applyPose(submission.cameraRelativePose);
            }
            GL11.glTranslatef(submission.originX, submission.originY, submission.originZ);
            GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glPolygonOffset(-0.25F, -1.0F);
            try {
                GL11.glColor4f(red, green, blue, submission.intensity);
                GL11.glBegin(GL11.GL_TRIANGLES);
                for (int index = 1;
                        index + 1 < submission.vertexOffsets.length;
                        index++) {
                    vertex(submission.vertexOffsets[0]);
                    vertex(submission.vertexOffsets[index]);
                    vertex(submission.vertexOffsets[index + 1]);
                }
                GL11.glEnd();
            } finally {
                GL11.glPolygonOffset(0.0F, 0.0F);
                GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
            }
        } finally {
            GL11.glPopMatrix();
        }
    }

    private static void vertex(float[] value) {
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
            float alpha) {
        if (radius <= 0.0F || alpha <= 0.0F) {
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
            float alpha) {
        if (radius <= 0.0F || alpha <= 0.0F) {
            return;
        }
        x += rightX * radius * rightOffset + upX * radius * upOffset;
        y += rightY * radius * rightOffset + upY * radius * upOffset;
        z += rightZ * radius * rightOffset + upZ * radius * upOffset;
        float rightRadius = radius * widthScale;
        float upRadius = radius * heightScale;
        GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
        GL11.glPolygonOffset(-0.25F, -1.0F);
        GL11.glBegin(GL11.GL_TRIANGLES);
        for (int index = 0; index < RADIAL_SEGMENTS; index++) {
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
            boolean premultiplyColor) {
        GL11.glPushMatrix();
        boolean shader = LegacyBeamShader.available();
        try {
            if (shader) {
                RollingStockShadowRenderer.prepare(submission);
            } else {
                RollingStockShadowRenderer.clearCurrent();
            }
            applyPose(submission);
            if (shader) {
                float opacity =
                        BeamColorCompositing.opacity(submission.beamAlpha, submission.intensity);
                LegacyBeamShader.bind(
                        definition.color(), opacity, premultiplyColor, submission.ownerId);
                drawShaderBeamLocal(submission, definition);
            } else {
                drawBeamLocal(submission, definition, premultiplyColor);
            }
        } finally {
            GL11.glPopMatrix();
        }
    }

    /** Four cone sides; fade is evaluated per fragment. */
    private static void drawShaderBeamLocal(
            LightEffectSubmission submission, RollingStockLightDefinition definition) {
        float[] basis = resolvedBeamBasis(submission);
        float visibleLength =
                FixedFunctionBeamGeometry.effectiveLength(
                        definition.beamLength(), submission.beamScale, submission.fixtureReach);
        float right =
                FixedFunctionBeamGeometry.effectiveWidth(
                        definition.beamWidth(), submission.beamScale, submission.fixtureReach);
        float up = right * 0.6F;
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
                right,
                up,
                1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBegin(GL11.GL_TRIANGLES);
        for (int side = 0; side < 4; side++) {
            int next = (side + 1) & 3;
            GL11.glTexCoord1f(0.0F);
            GL11.glVertex3f(placement.startX(), placement.startY(), placement.startZ());
            GL11.glTexCoord1f(1.0F);
            GL11.glVertex3f(BEAM_FAR[side][0], BEAM_FAR[side][1], BEAM_FAR[side][2]);
            GL11.glTexCoord1f(1.0F);
            GL11.glVertex3f(BEAM_FAR[next][0], BEAM_FAR[next][1], BEAM_FAR[next][2]);
        }
        GL11.glEnd();
    }

    private static void drawBeamLocal(
            LightEffectSubmission submission,
            RollingStockLightDefinition definition,
            boolean premultiplyColor) {
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
        float visibleLength =
                FixedFunctionBeamGeometry.effectiveLength(
                        definition.beamLength(), submission.beamScale, submission.fixtureReach);
        float right =
                FixedFunctionBeamGeometry.effectiveWidth(
                        definition.beamWidth(), submission.beamScale, submission.fixtureReach);
        float up = right * 0.6F;
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
        for (int segment = 0; segment < segments; segment++) {
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
                    right,
                    up,
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
                    right,
                    up,
                    farFraction);
            float nearOpacity = opacity * FixedFunctionBeamGeometry.fadeAt(nearFraction);
            float farOpacity = opacity * FixedFunctionBeamGeometry.fadeAt(farFraction);
            for (int side = 0; side < 4; side++) {
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
            float fraction) {
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
            float[] vertex, int red, int green, int blue, float opacity, boolean premultiplyColor) {
        float alpha = BeamColorCompositing.SOURCE_ALPHA / 255.0F * opacity;
        if (premultiplyColor) {
            GL11.glColor4f(
                    red / 255.0F * alpha, green / 255.0F * alpha, blue / 255.0F * alpha, alpha);
        } else {
            GL11.glColor4f(red / 255.0F, green / 255.0F, blue / 255.0F, alpha);
        }
        GL11.glVertex3f(vertex[0], vertex[1], vertex[2]);
    }

    private static void applyPose(LightEffectSubmission submission) {
        if (submission.fixtureLocal == false) return;
        applyPose(submission.cameraRelativePose);
    }

    private static void applyPose(float[] cameraRelativePose) {
        POSE_BUFFER.clear();
        POSE_BUFFER.put(cameraRelativePose);
        POSE_BUFFER.flip();
        GL11.glMultMatrix(POSE_BUFFER);
    }

    static float[] resolvedBeamBasis(LightEffectSubmission submission) {
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
        if (length <= 1.0E-5F) {
            rightX = fallback[3];
            rightY = fallback[4];
            rightZ = fallback[5];
        } else {
            rightX /= length;
            rightY /= length;
            rightZ /= length;
        }
        float upX = rightY * directionZ - rightZ * directionY;
        float upY = rightZ * directionX - rightX * directionZ;
        float upZ = rightX * directionY - rightY * directionX;
        if (upX * submission.upX + upY * submission.upY + upZ * submission.upZ < 0.0F) {
            rightX = -rightX;
            rightY = -rightY;
            rightZ = -rightZ;
            upX = -upX;
            upY = -upY;
            upZ = -upZ;
        }
        return new float[] {
            directionX, directionY, directionZ,
            rightX, rightY, rightZ,
            upX, upY, upZ
        };
    }

    private static float[] createBasis(float directionX, float directionY, float directionZ) {
        float length =
                (float)
                        Math.sqrt(
                                directionX * directionX
                                        + directionY * directionY
                                        + directionZ * directionZ);
        if (length < 1.0E-5F) {
            return new float[] {0, 0, 1, 1, 0, 0, 0, 1, 0};
        }
        directionX /= length;
        directionY /= length;
        directionZ /= length;
        float referenceY = Math.abs(directionY) < 0.95F ? 1.0F : 0.0F;
        float referenceZ = referenceY == 0.0F ? 1.0F : 0.0F;
        float rightX = directionY * referenceZ - directionZ * referenceY;
        float rightY = -directionX * referenceZ;
        float rightZ = directionX * referenceY;
        float scale =
                (float) (1.0D / Math.sqrt(rightX * rightX + rightY * rightY + rightZ * rightZ));
        rightX *= scale;
        rightY *= scale;
        rightZ *= scale;
        float upX = rightY * directionZ - rightZ * directionY;
        float upY = rightZ * directionX - rightX * directionZ;
        float upZ = rightX * directionY - rightY * directionX;
        return new float[] {
            directionX, directionY, directionZ,
            rightX, rightY, rightZ,
            upX, upY, upZ
        };
    }

    /** Converts the eye-space submissions back to world space for block raycasts. */
    private static final class ViewTransform {
        private final float[] matrix = new float[16];
        private final float[] projection = new float[16];
        private double cameraX;
        private double cameraY;
        private double cameraZ;
        private boolean captured;

        private ViewTransform() {}

        static ViewTransform capture() {
            VIEW_TRANSFORM.captureCurrent();
            return VIEW_TRANSFORM;
        }

        void captureCurrent() {
            VIEW_BUFFER.clear();
            GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, VIEW_BUFFER);
            VIEW_BUFFER.get(VIEW_TRANSFORM.matrix);
            VIEW_BUFFER.clear();
            GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, VIEW_BUFFER);
            VIEW_BUFFER.get(VIEW_TRANSFORM.projection);
            VIEW_TRANSFORM.cameraX = TileEntityRendererDispatcher.staticPlayerX;
            VIEW_TRANSFORM.cameraY = TileEntityRendererDispatcher.staticPlayerY;
            VIEW_TRANSFORM.cameraZ = TileEntityRendererDispatcher.staticPlayerZ;
            VIEW_TRANSFORM.captured = true;
        }

        boolean captured() {
            return captured;
        }

        boolean copyMatrix(float[] destination) {
            if (captured == false || destination == null || destination.length < 16) {
                return false;
            }
            System.arraycopy(matrix, 0, destination, 0, 16);
            return true;
        }

        boolean copyProjection(float[] destination) {
            if (captured == false || destination == null || destination.length < 16) {
                return false;
            }
            System.arraycopy(projection, 0, destination, 0, 16);
            return true;
        }

        void clear() {
            captured = false;
        }

        Vec3 eyePointToWorld(float x, float y, float z) {
            float[] relative = eyeVectorToWorld(x, y, z);
            return Vec3.createVectorHelper(
                    cameraX + relative[0], cameraY + relative[1], cameraZ + relative[2]);
        }

        float[] eyeDirectionToWorld(float x, float y, float z) {
            float[] world = eyeVectorToWorld(x, y, z);
            return normalize(world[0], world[1], world[2]);
        }

        private float[] eyeVectorToWorld(float x, float y, float z) {
            return new float[] {
                matrix[0] * x + matrix[1] * y + matrix[2] * z,
                matrix[4] * x + matrix[5] * y + matrix[6] * z,
                matrix[8] * x + matrix[9] * y + matrix[10] * z
            };
        }

        float[] worldPointToEye(Vec3 point) {
            float x = (float) (point.xCoord - cameraX);
            float y = (float) (point.yCoord - cameraY);
            float z = (float) (point.zCoord - cameraZ);
            return new float[] {
                matrix[0] * x + matrix[4] * y + matrix[8] * z,
                matrix[1] * x + matrix[5] * y + matrix[9] * z,
                matrix[2] * x + matrix[6] * y + matrix[10] * z
            };
        }

        float[] worldDirectionToEye(float x, float y, float z) {
            return normalize(
                    matrix[0] * x + matrix[4] * y + matrix[8] * z,
                    matrix[1] * x + matrix[5] * y + matrix[9] * z,
                    matrix[2] * x + matrix[6] * y + matrix[10] * z);
        }

        private static float[] normalize(float x, float y, float z) {
            float length = (float) Math.sqrt(x * x + y * y + z * z);
            if (length <= 1.0E-5F) {
                return new float[] {0.0F, 0.0F, 1.0F};
            }
            return new float[] {x / length, y / length, z / length};
        }
    }

    private static final class CachedHotspot {
        final long gameTime;
        final MovingObjectPosition hit;

        CachedHotspot(long gameTime, MovingObjectPosition hit) {
            this.gameTime = gameTime;
            this.hit = hit;
        }
    }
}
