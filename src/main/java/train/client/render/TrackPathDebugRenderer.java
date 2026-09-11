package train.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import train.common.items.TCRailTypes;
import train.common.library.track.path.TrackPathGeometry;
import train.common.library.track.path.TrackPathSample;
import train.common.tile.TileTCRail;
import train.common.track.attachment.TrackAttachmentOperations;

/** Draws the sampled attachment path only while the hidden Track Debugger item is held. */
public final class TrackPathDebugRenderer
{
	private static final int MINIMUM_CURVE_SEGMENTS = 64;
	private static final int MAXIMUM_CURVE_SEGMENTS = 512;
	private static final double CURVE_SEGMENTS_PER_BLOCK = 4.0D;
	private static final double PATH_HALF_LENGTH = 2.0D;
	private static final double PATH_LIFT = 0.16D;

	private TrackPathDebugRenderer()
	{
	}

	/**
	 * Renders the local attachment path through the currently targeted track cell.
	 *
	 * @param player client player holding the Track Debugger
	 */
	public static void render(EntityClientPlayerMP player)
	{
		Minecraft minecraft = Minecraft.getMinecraft();
		MovingObjectPosition target = minecraft.objectMouseOver;
		if (player == null || minecraft.theWorld == null || target == null
				|| target.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK)
		{
			return;
		}
		TileTCRail owner = TrackAttachmentOperations.resolveRenderOwner(minecraft.theWorld,
				target.blockX, target.blockY, target.blockZ);
		TrackPathSample pathSample = TrackPathGeometry.sampleAttachmentPath(
				owner, target.blockX, target.blockZ);
		if (owner == null || pathSample == null)
		{
			return;
		}
		double pathY = getPathY(owner, target.blockX, target.blockY, target.blockZ);
		prepareRenderState();
		GL11.glPushMatrix();
		GL11.glTranslated(-TileEntityRendererDispatcher.staticPlayerX,
				-TileEntityRendererDispatcher.staticPlayerY,
				-TileEntityRendererDispatcher.staticPlayerZ);
		if (TCRailTypes.isTurnTrack(owner))
		{
			drawTurnPath(minecraft.theWorld, owner, pathY);
		}
		else
		{
			drawLinearPath(owner, pathSample, pathY);
		}
		GL11.glPopMatrix();
		GL11.glPopAttrib();
	}

	private static double getPathY(TileTCRail owner, int cellX, int cellY, int cellZ)
	{
		double pathY = owner.yCoord + (cellY - owner.yCoord) + owner.getTrackRenderYOffset();
		if (owner.slopeHeight <= 0.0D || owner.slopeLength <= 0.0D)
		{
			return pathY + PATH_LIFT;
		}
		double progress = TrackPathGeometry.getLinearProgress(owner,
				cellX - owner.xCoord, cellZ - owner.zCoord);
		progress = Math.max(0.0D, Math.min(owner.slopeLength, progress));
		return pathY + owner.slopeHeight * progress / owner.slopeLength + PATH_LIFT;
	}

	private static void prepareRenderState()
	{
		GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glLineWidth(3.0F);
	}

	private static void drawLinearPath(TileTCRail owner, TrackPathSample sample, double pathY)
	{
		double gradientX = TrackPathGeometry.getSlopeGradientX(owner);
		double gradientZ = TrackPathGeometry.getSlopeGradientZ(owner);
		GL11.glColor4f(0.0F, 0.9F, 1.0F, 0.9F);
		GL11.glBegin(GL11.GL_LINES);
		addLinearVertex(sample, pathY, gradientX, gradientZ, -PATH_HALF_LENGTH);
		addLinearVertex(sample, pathY, gradientX, gradientZ, PATH_HALF_LENGTH);
		GL11.glEnd();
	}

	private static void addLinearVertex(TrackPathSample sample, double pathY,
			double gradientX, double gradientZ, double distance)
	{
		double offsetX = sample.getTangentX() * distance;
		double offsetZ = sample.getTangentZ() * distance;
		GL11.glVertex3d(sample.getWorldX() + offsetX,
				pathY + offsetX * gradientX + offsetZ * gradientZ,
				sample.getWorldZ() + offsetZ);
	}

	private static void drawTurnPath(World world, TileTCRail owner, double pathY)
	{
		double radius = Math.abs(owner.r);
		int segmentCount = Math.max(MINIMUM_CURVE_SEGMENTS, Math.min(MAXIMUM_CURVE_SEGMENTS,
				(int)Math.ceil(Math.PI * 2.0D * radius * CURVE_SEGMENTS_PER_BLOCK)));
		GL11.glColor4f(0.0F, 0.9F, 1.0F, 0.9F);
		GL11.glBegin(GL11.GL_LINES);
		for (int segment = 0; segment < segmentCount; segment++)
		{
			double firstAngle = Math.PI * 2.0D * segment / segmentCount;
			double secondAngle = Math.PI * 2.0D * (segment + 1) / segmentCount;
			double middleAngle = (firstAngle + secondAngle) * 0.5D;
			double middleX = owner.cx + Math.cos(middleAngle) * radius;
			double middleZ = owner.cz + Math.sin(middleAngle) * radius;
			if (belongsToOwner(world, owner, middleX, middleZ))
			{
				GL11.glVertex3d(owner.cx + Math.cos(firstAngle) * radius, pathY,
						owner.cz + Math.sin(firstAngle) * radius);
				GL11.glVertex3d(owner.cx + Math.cos(secondAngle) * radius, pathY,
						owner.cz + Math.sin(secondAngle) * radius);
			}
		}
		GL11.glEnd();
	}

	private static boolean belongsToOwner(World world, TileTCRail owner, double worldX, double worldZ)
	{
		TileTCRail candidate = TrackAttachmentOperations.resolveRenderOwner(world,
				(int)Math.floor(worldX), owner.yCoord, (int)Math.floor(worldZ));
		return candidate != null && candidate.xCoord == owner.xCoord
				&& candidate.yCoord == owner.yCoord && candidate.zCoord == owner.zCoord;
	}

}
