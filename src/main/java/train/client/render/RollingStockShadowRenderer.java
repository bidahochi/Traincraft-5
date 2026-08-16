package train.client.render;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Matrix4f;
import train.common.Traincraft;

/** Reusable exact-model light-space depth shadow for one active fixture. */
final class RollingStockShadowRenderer {
    private static final int SHADOW_SIZE = 256;
    private static final float NEAR_DISTANCE = 0.03F;
    private static final FloatBuffer MATRIX_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer POSE_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final Matrix4f PROJECTION = new Matrix4f();
    private static final Matrix4f LIGHT_VIEW = new Matrix4f();
    private static final Matrix4f EYE_TO_SHADOW = new Matrix4f();
    private static final float[] ORIGIN = new float[3];
    private static final float[] DIRECTION = new float[3];
    private static final float[] UP = new float[3];

    private static int framebuffer;
    private static int depthTexture;
    private static boolean availableForCurrentLight;
    private static boolean failed;
    private static boolean loggedFailure;
    private static ContextCapabilities allocatedContext;

    private RollingStockShadowRenderer() {}

    static boolean prepare(LightEffectSubmission submission) {
        availableForCurrentLight = false;
        if (OpenGlHelper.shadersSupported == false || failed) {
            return false;
        }
        List<RollingStockLightOcclusion.Entry> entries = RollingStockLightOcclusion.entries();
        if (entries.isEmpty()) {
            return false;
        }
        float length = FixedFunctionBeamGeometry.effectiveLength(
                submission.definition.beamLength(),
                submission.beamScale,
                submission.fixtureReach);
        float width = FixedFunctionBeamGeometry.effectiveWidth(
                submission.definition.beamWidth(),
                submission.beamScale,
                submission.fixtureReach);
        if (length <= NEAR_DISTANCE || width <= 0.0F) {
            return false;
        }
        submission.eyePoint(submission.x, submission.y, submission.z, ORIGIN);
        submission.eyeDirection(submission.dx, submission.dy, submission.dz, DIRECTION);
        submission.eyeDirection(submission.upX, submission.upY, submission.upZ, UP);
        makeOrthogonalUp(DIRECTION, UP);
        float[] origin = ORIGIN;
        float[] direction = DIRECTION;
        if (hasCandidate(
                        entries,
                        submission.ownerId,
                        origin,
                        direction,
                        length,
                        width)
                == false) {
            return false;
        }
        try {
            ensure();
            render(
                    entries,
                    submission.ownerId,
                    origin,
                    direction,
                    UP,
                    length,
                    width);
            availableForCurrentLight = true;
            return true;
        } catch (Throwable failure) {
            failed = true;
            availableForCurrentLight = false;
            if (loggedFailure == false) {
                loggedFailure = true;
                Traincraft.tcLog.warn(
                        "Rolling-stock light-space shadows are unavailable; cone geometry remains unchanged.",
                        failure);
            }
            releaseTarget();
            return false;
        }
    }

    static boolean available() {
        return availableForCurrentLight && depthTexture != 0;
    }

    static int texture() {
        return depthTexture;
    }

    static FloatBuffer matrixBuffer() {
        MATRIX_BUFFER.clear();
        EYE_TO_SHADOW.store(MATRIX_BUFFER);
        MATRIX_BUFFER.flip();
        return MATRIX_BUFFER;
    }

    static void clearCurrent() {
        availableForCurrentLight = false;
    }

    static boolean isShadowed(float fragmentDepth, float storedDepth) {
        return fragmentDepth > storedDepth + 0.0015F;
    }

    static void clear() {
        ContextCapabilities current = currentContext();
        if (allocatedContext == null || allocatedContext == current) {
            releaseTarget();
        } else {
            framebuffer = 0;
            depthTexture = 0;
        }
        allocatedContext = null;
        failed = false;
        loggedFailure = false;
        availableForCurrentLight = false;
    }

    private static boolean hasCandidate(
            List<RollingStockLightOcclusion.Entry> entries,
            int ownerId,
            float[] origin,
            float[] direction,
            float length,
            float beamWidth) {
        for (RollingStockLightOcclusion.Entry entry : entries) {
            if (entry.ownerId == ownerId) {
                continue;
            }
            float centerX = (entry.bounds.minimumX + entry.bounds.maximumX) * 0.5F;
            float centerY = (entry.bounds.minimumY + entry.bounds.maximumY) * 0.5F;
            float centerZ = (entry.bounds.minimumZ + entry.bounds.maximumZ) * 0.5F;
            float eyeX = transformX(entry.pose, centerX, centerY, centerZ);
            float eyeY = transformY(entry.pose, centerX, centerY, centerZ);
            float eyeZ = transformZ(entry.pose, centerX, centerY, centerZ);
            float offsetX = eyeX - origin[0];
            float offsetY = eyeY - origin[1];
            float offsetZ = eyeZ - origin[2];
            float along = offsetX * direction[0]
                    + offsetY * direction[1]
                    + offsetZ * direction[2];
            float radius = transformedRadius(entry);
            if (along + radius < 0.0F || along - radius > length) {
                continue;
            }
            float distanceSquared = offsetX * offsetX + offsetY * offsetY + offsetZ * offsetZ;
            float perpendicularSquared = Math.max(0.0F, distanceSquared - along * along);
            float coneRadius = beamWidth * Math.max(0.0F, Math.min(1.0F, along / length));
            float allowed = radius + coneRadius;
            if (perpendicularSquared <= allowed * allowed) {
                return true;
            }
        }
        return false;
    }

    private static float transformedRadius(RollingStockLightOcclusion.Entry entry) {
        float halfX = (entry.bounds.maximumX - entry.bounds.minimumX) * 0.5F;
        float halfY = (entry.bounds.maximumY - entry.bounds.minimumY) * 0.5F;
        float halfZ = (entry.bounds.maximumZ - entry.bounds.minimumZ) * 0.5F;
        float localRadius = (float) Math.sqrt(halfX * halfX + halfY * halfY + halfZ * halfZ);
        float scaleX = length(entry.pose[0], entry.pose[1], entry.pose[2]);
        float scaleY = length(entry.pose[4], entry.pose[5], entry.pose[6]);
        float scaleZ = length(entry.pose[8], entry.pose[9], entry.pose[10]);
        return localRadius * Math.max(scaleX, Math.max(scaleY, scaleZ));
    }

    private static void ensure() {
        ContextCapabilities current = GLContext.getCapabilities();
        if (allocatedContext != null && allocatedContext != current) {
            framebuffer = 0;
            depthTexture = 0;
        }
        if (framebuffer != 0) {
            return;
        }
        framebuffer = EXTFramebufferObject.glGenFramebuffersEXT();
        depthTexture = GL11.glGenTextures();
        int previousFramebuffer =
                GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        try {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, depthTexture);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexImage2D(
                    GL11.GL_TEXTURE_2D,
                    0,
                    GL11.GL_DEPTH_COMPONENT,
                    SHADOW_SIZE,
                    SHADOW_SIZE,
                    0,
                    GL11.GL_DEPTH_COMPONENT,
                    GL11.GL_FLOAT,
                    (ByteBuffer) null);
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT, framebuffer);
            EXTFramebufferObject.glFramebufferTexture2DEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                    EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT,
                    GL11.GL_TEXTURE_2D,
                    depthTexture,
                    0);
            GL11.glDrawBuffer(GL11.GL_NONE);
            GL11.glReadBuffer(GL11.GL_NONE);
            int status = EXTFramebufferObject.glCheckFramebufferStatusEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT);
            if (status != EXTFramebufferObject.GL_FRAMEBUFFER_COMPLETE_EXT) {
                throw new IllegalStateException(
                        "Incomplete rolling-stock shadow framebuffer: 0x"
                                + Integer.toHexString(status));
            }
        } finally {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
        allocatedContext = current;
    }

    private static void render(
            List<RollingStockLightOcclusion.Entry> entries,
            int ownerId,
            float[] origin,
            float[] direction,
            float[] up,
            float length,
            float width) {
        int previousFramebuffer =
                GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        float nearWidth = Math.max(0.0001F, width * NEAR_DISTANCE / length);
        GL11.glFrustum(
                -nearWidth,
                nearWidth,
                -nearWidth * 0.6F,
                nearWidth * 0.6F,
                NEAR_DISTANCE,
                length);
        captureCurrentMatrix(PROJECTION);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GLU.gluLookAt(
                origin[0], origin[1], origin[2],
                origin[0] + direction[0],
                origin[1] + direction[1],
                origin[2] + direction[2],
                up[0], up[1], up[2]);
        captureCurrentMatrix(LIGHT_VIEW);
        Matrix4f.mul(PROJECTION, LIGHT_VIEW, EYE_TO_SHADOW);
        try {
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT, framebuffer);
            GL11.glViewport(0, 0, SHADOW_SIZE, SHADOW_SIZE);
            GL11.glClearDepth(1.0D);
            GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
            OpenGlHelper.func_153161_d(0);
            GL11.glColorMask(false, false, false, false);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(true);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_LIGHTING);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            for (RollingStockLightOcclusion.Entry entry : entries) {
                if (entry.ownerId == ownerId) {
                    continue;
                }
                for (RollingStockLightOcclusion.PartPose part : entry.parts) {
                    drawPart(part);
                }
            }
        } finally {
            OpenGlHelper.func_153161_d(previousProgram);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(previousMatrixMode);
            GL11.glPopAttrib();
            OpenGlHelper.setActiveTexture(previousActiveTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
    }

    private static void drawPart(RollingStockLightOcclusion.PartPose pose) {
        GL11.glPushMatrix();
        POSE_BUFFER.clear();
        POSE_BUFFER.put(pose.parentPose).flip();
        GL11.glMultMatrix(POSE_BUFFER);
        GL11.glTranslatef(
                pose.rotationPointX * pose.scale,
                pose.rotationPointY * pose.scale,
                pose.rotationPointZ * pose.scale);
        if (pose.rotationOrder) {
            if (pose.rotateAngleZ != 0.0F) {
                GL11.glRotatef(pose.rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
            if (pose.rotateAngleY != 0.0F) {
                GL11.glRotatef(pose.rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
        } else {
            if (pose.rotateAngleY != 0.0F) {
                GL11.glRotatef(pose.rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
            if (pose.rotateAngleZ != 0.0F) {
                GL11.glRotatef(pose.rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
        }
        if (pose.rotateAngleX != 0.0F) {
            GL11.glRotatef(pose.rotateAngleX * 57.29578F, 1.0F, 0.0F, 0.0F);
        }
        pose.part.renderDepthGeometry(pose.scale);
        GL11.glPopMatrix();
    }

    private static void captureCurrentMatrix(Matrix4f destination) {
        MATRIX_BUFFER.clear();
        GL11.glGetFloat(
                GL11.glGetInteger(GL11.GL_MATRIX_MODE) == GL11.GL_PROJECTION
                        ? GL11.GL_PROJECTION_MATRIX
                        : GL11.GL_MODELVIEW_MATRIX,
                MATRIX_BUFFER);
        MATRIX_BUFFER.rewind();
        destination.load(MATRIX_BUFFER);
    }

    private static float transformX(float[] pose, float x, float y, float z) {
        return pose[0] * x + pose[4] * y + pose[8] * z + pose[12];
    }

    private static float transformY(float[] pose, float x, float y, float z) {
        return pose[1] * x + pose[5] * y + pose[9] * z + pose[13];
    }

    private static float transformZ(float[] pose, float x, float y, float z) {
        return pose[2] * x + pose[6] * y + pose[10] * z + pose[14];
    }

    private static float length(float x, float y, float z) {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    private static void makeOrthogonalUp(float[] direction, float[] up) {
        float projection = direction[0] * up[0]
                + direction[1] * up[1]
                + direction[2] * up[2];
        up[0] -= direction[0] * projection;
        up[1] -= direction[1] * projection;
        up[2] -= direction[2] * projection;
        float upLength = length(up[0], up[1], up[2]);
        if (upLength <= 1.0E-5F) {
            if (Math.abs(direction[1]) < 0.95F) {
                up[0] = 0.0F;
                up[1] = 1.0F;
                up[2] = 0.0F;
            } else {
                up[0] = 1.0F;
                up[1] = 0.0F;
                up[2] = 0.0F;
            }
            projection = direction[0] * up[0]
                    + direction[1] * up[1]
                    + direction[2] * up[2];
            up[0] -= direction[0] * projection;
            up[1] -= direction[1] * projection;
            up[2] -= direction[2] * projection;
            upLength = length(up[0], up[1], up[2]);
        }
        up[0] /= upLength;
        up[1] /= upLength;
        up[2] /= upLength;
    }

    private static ContextCapabilities currentContext() {
        try {
            return GLContext.getCapabilities();
        } catch (IllegalStateException noContext) {
            return null;
        }
    }

    private static void releaseTarget() {
        if (depthTexture != 0) GL11.glDeleteTextures(depthTexture);
        if (framebuffer != 0) EXTFramebufferObject.glDeleteFramebuffersEXT(framebuffer);
        depthTexture = 0;
        framebuffer = 0;
    }
}
