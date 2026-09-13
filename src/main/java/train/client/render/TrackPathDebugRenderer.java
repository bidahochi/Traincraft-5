package train.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import train.common.items.TCRailTypes;
import train.common.library.track.path.TrackPathGeometry;
import train.common.library.track.path.TrackPathSample;
import train.common.tile.TileTCRail;
import train.common.track.attachment.TrackAttachmentOperations;

import java.util.HashSet;
import java.util.Set;

/** Draws the sampled attachment path only while the hidden Track Debugger item is held. */
public final class TrackPathDebugRenderer
{
	private static final int MINIMUM_CURVE_SEGMENTS = 64;
	private static final int MAXIMUM_CURVE_SEGMENTS = 512;
	private static final double CURVE_SEGMENTS_PER_BLOCK = 4.0D;
	private static final double PATH_HALF_LENGTH = 2.0D;
	private static final double PATH_LIFT = 0.16D;
	private static final double CELL_CENTER = 0.5D;
	private static final int SWITCH_CONTROLLER_SEARCH_RADIUS = 4;
	private static final int MAXIMUM_LINKED_SWITCH_SECTIONS = 16;
	private static final double[] SWITCH_FORWARD_X = {0.0D, -1.0D, 0.0D, 1.0D,
			-0.5D, -0.5D, 0.5D, 0.5D};
	private static final double[] SWITCH_FORWARD_Z = {1.0D, 0.0D, -1.0D, 0.0D,
			0.5D, -0.5D, -0.5D, 0.5D};

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
		TileTCRail owner = TrackAttachmentOperations.resolvePathOwner(minecraft.theWorld,
				target.blockX, target.blockY, target.blockZ);
		TileTCRail switchController = findSwitchController(minecraft.theWorld, owner);
		boolean curvedSwitchRoute = switchController != null && TCRailTypes.isTurnTrack(owner);
		TrackPathSample pathSample;
		if (TCRailTypes.isSwitchTrack(owner))
		{
			curvedSwitchRoute = owner.getSwitchState();
			pathSample = curvedSwitchRoute
					? TrackPathGeometry.sampleTurnPath(owner, getTargetX(target), getTargetZ(target))
					: sampleSwitchStraightPath(owner, target);
		}
		else
		{
			pathSample = TrackPathGeometry.sampleAttachmentPath(
					owner, target.blockX, target.blockZ);
		}
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
		if (switchController != null)
		{
			boolean activeRoute = switchController.getSwitchState() == curvedSwitchRoute;
			float red = activeRoute ? 1.0F : 0.1F;
			float green = activeRoute ? 0.1F : 0.35F;
			float blue = activeRoute ? 0.1F : 1.0F;
			float alpha = activeRoute ? 0.95F : 0.85F;
			if (curvedSwitchRoute)
			{
				drawLocalTurnPath(owner, pathSample, pathY, red, green, blue, alpha);
			}
			else
			{
				drawLinearPath(owner, pathSample, pathY, red, green, blue, alpha);
			}
		}
		else if (TCRailTypes.isTurnTrack(owner))
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

	/** Draws a short arc centered on the selected cell's projected turn-path sample. */
	private static void drawLocalTurnPath(TileTCRail owner, TrackPathSample sample, double pathY,
			float red, float green, float blue, float alpha)
	{
		double radius = Math.abs(owner.r);
		if (radius < 0.0001D)
		{
			return;
		}
		double centerAngle = Math.atan2(sample.getWorldZ() - owner.cz,
				sample.getWorldX() - owner.cx);
		double halfAngle = PATH_HALF_LENGTH / radius;
		int segmentCount = Math.max(8, (int)Math.ceil(PATH_HALF_LENGTH * 2.0D
				* CURVE_SEGMENTS_PER_BLOCK));
		GL11.glColor4f(red, green, blue, alpha);
		GL11.glBegin(GL11.GL_LINES);
		for (int segment = 0; segment < segmentCount; segment++)
		{
			double firstAngle = centerAngle - halfAngle
					+ halfAngle * 2.0D * segment / segmentCount;
			double secondAngle = centerAngle - halfAngle
					+ halfAngle * 2.0D * (segment + 1) / segmentCount;
			GL11.glVertex3d(owner.cx + Math.cos(firstAngle) * radius, pathY,
					owner.cz + Math.sin(firstAngle) * radius);
			GL11.glVertex3d(owner.cx + Math.cos(secondAngle) * radius, pathY,
					owner.cz + Math.sin(secondAngle) * radius);
		}
		GL11.glEnd();
	}

	/** Finds the switch tile that points into the selected local or linked turn section. */
	private static TileTCRail findSwitchController(World world, TileTCRail localPathOwner)
	{
		if (world == null || localPathOwner == null)
		{
			return null;
		}
		TileTCRail section = localPathOwner;
		Set<String> visited = new HashSet<String>();
		for (int link = 0; link < MAXIMUM_LINKED_SWITCH_SECTIONS && section != null; link++)
		{
			if (TCRailTypes.isSwitchTrack(section))
			{
				return section;
			}
			String coordinate = section.xCoord + "," + section.yCoord + "," + section.zCoord;
			if (visited.add(coordinate) == false)
			{
				break;
			}
			TileTCRail controller = findSwitchLinkedTo(world, section);
			if (controller != null)
			{
				return controller;
			}
			if (section.isLinkedToRail == false)
			{
				break;
			}
			section = TrackAttachmentOperations.resolvePathOwner(world,
					section.linkedX, section.linkedY, section.linkedZ);
		}
		return null;
	}

	private static TileTCRail findSwitchLinkedTo(World world, TileTCRail section)
	{
		for (int x = section.xCoord - SWITCH_CONTROLLER_SEARCH_RADIUS;
				x <= section.xCoord + SWITCH_CONTROLLER_SEARCH_RADIUS; x++)
		{
			for (int z = section.zCoord - SWITCH_CONTROLLER_SEARCH_RADIUS;
					z <= section.zCoord + SWITCH_CONTROLLER_SEARCH_RADIUS; z++)
			{
				TileEntity tile = world.getTileEntity(x, section.yCoord, z);
				if (tile instanceof TileTCRail)
				{
					TileTCRail candidate = (TileTCRail)tile;
					if (TCRailTypes.isSwitchTrack(candidate) && candidate.isLinkedToRail
							&& candidate.linkedX == section.xCoord
							&& candidate.linkedY == section.yCoord
							&& candidate.linkedZ == section.zCoord)
					{
						return candidate;
					}
				}
			}
		}
		return null;
	}

	private static TrackPathSample sampleSwitchStraightPath(TileTCRail owner, MovingObjectPosition target)
	{
		int facing = owner.getFacing() % SWITCH_FORWARD_X.length;
		if (facing < 0)
		{
			facing += SWITCH_FORWARD_X.length;
		}
		double tangentX = SWITCH_FORWARD_X[facing];
		double tangentZ = SWITCH_FORWARD_Z[facing];
		double centerX = target.blockX + CELL_CENTER;
		double centerZ = target.blockZ + CELL_CENTER;
		double hitX = getTargetX(target);
		double hitZ = getTargetZ(target);
		double tangentLengthSquared = tangentX * tangentX + tangentZ * tangentZ;
		double along = ((hitX - centerX) * tangentX + (hitZ - centerZ) * tangentZ)
				/ tangentLengthSquared;
		return new TrackPathSample(centerX + tangentX * along, centerZ + tangentZ * along,
				tangentX, tangentZ);
	}

	private static double getTargetX(MovingObjectPosition target)
	{
		return target.hitVec != null ? target.hitVec.xCoord : target.blockX + CELL_CENTER;
	}

	private static double getTargetZ(MovingObjectPosition target)
	{
		return target.hitVec != null ? target.hitVec.zCoord : target.blockZ + CELL_CENTER;
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
		drawLinearPath(owner, sample, pathY, 0.0F, 0.9F, 1.0F, 0.9F);
	}

	private static void drawLinearPath(TileTCRail owner, TrackPathSample sample, double pathY,
			float red, float green, float blue, float alpha)
	{
		double gradientX = TrackPathGeometry.getSlopeGradientX(owner);
		double gradientZ = TrackPathGeometry.getSlopeGradientZ(owner);
		GL11.glColor4f(red, green, blue, alpha);
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
		drawTurnPath(world, owner, pathY, 0.0F, 0.9F, 1.0F, 0.9F);
	}

	private static void drawTurnPath(World world, TileTCRail owner, double pathY,
			float red, float green, float blue, float alpha)
	{
		double radius = Math.abs(owner.r);
		int segmentCount = Math.max(MINIMUM_CURVE_SEGMENTS, Math.min(MAXIMUM_CURVE_SEGMENTS,
				(int)Math.ceil(Math.PI * 2.0D * radius * CURVE_SEGMENTS_PER_BLOCK)));
		GL11.glColor4f(red, green, blue, alpha);
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
		TileTCRail candidate = TrackAttachmentOperations.resolvePathOwner(world,
				(int)Math.floor(worldX), owner.yCoord, (int)Math.floor(worldZ));
		return candidate != null && candidate.xCoord == owner.xCoord
				&& candidate.yCoord == owner.yCoord && candidate.zCoord == owner.zCoord;
	}

}
