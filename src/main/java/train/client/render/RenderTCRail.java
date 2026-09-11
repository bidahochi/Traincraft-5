package train.client.render;

import train.client.render.embedded.EmbeddedTrackHostSurfaceRenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import train.client.render.models.blocks.track.ModelEmbeddedTransitionSlopeTCTrack;
import train.client.render.models.blocks.track.ModelSlopeTCTrack;
import train.client.render.models.blocks.track.crossing.ModelLeftDiamondCrossing;
import train.client.render.models.blocks.track.crossing.ModelRightDiamondCrossing;
import train.client.render.models.blocks.track.crossing.ModelTwoWaysCrossingTCTrack;
import train.client.render.models.blocks.track.s_curve.ModelLeftParallelCurveTCTrack;
import train.client.render.models.blocks.track.s_curve.ModelRightParallelCurveTCTrack;
import train.client.render.models.blocks.track.straight.ModelMediumDiagonalStraightTCTrack;
import train.client.render.models.blocks.track.straight.ModelMediumStraightTCTrack;
import train.client.render.models.blocks.track.straight.ModelSmallDiagonalStraightTCTrack;
import train.client.render.models.blocks.track.straight.ModelSmallStraightTCTrack;
import train.client.render.models.blocks.track.switchs.ModelLeftSwitchTCTrack;
import train.client.render.models.blocks.track.switchs.ModelRightSwitchTCTrack;
import train.client.render.models.blocks.track.turn.degree45.ModelLeft45DegreeTurnTCTrack;
import train.client.render.models.blocks.track.turn.degree45.ModelRight45DegreeTurnTCTrack;
import train.client.render.models.blocks.track.turn.degree90.ModelLeftTurnTCTrack;
import train.client.render.models.blocks.track.turn.degree90.ModelRightTurnTCTrack;
import train.common.library.track.ITrackDefinition;
import train.common.tile.TileTCRail;
import train.common.tile.TileTrainDetector;

public class RenderTCRail extends TileEntitySpecialRenderer
{
    public static final ModelSmallStraightTCTrack modelSmallStraight = new ModelSmallStraightTCTrack();
    public static final ModelSmallStraightTCTrack modelRoadCrossing = new ModelSmallStraightTCTrack();
    public static final ModelMediumStraightTCTrack modelMediumStraight = new ModelMediumStraightTCTrack();

    public static final ModelSmallDiagonalStraightTCTrack modelSmallDiagonalStraight = new ModelSmallDiagonalStraightTCTrack();
    public static final ModelMediumDiagonalStraightTCTrack modelMediumDiagonalStraight = new ModelMediumDiagonalStraightTCTrack();

    public static final ModelRightTurnTCTrack modelRightTurn = new ModelRightTurnTCTrack();
    public static final ModelLeftTurnTCTrack modelLeftTurn = new ModelLeftTurnTCTrack();

    public static final ModelRight45DegreeTurnTCTrack model45DegreeRightTurn = new ModelRight45DegreeTurnTCTrack();
    public static final ModelLeft45DegreeTurnTCTrack model45DegreeLeftTurn = new ModelLeft45DegreeTurnTCTrack();

    public static final ModelRightSwitchTCTrack modelRightSwitchTurn = new ModelRightSwitchTCTrack();
    public static final ModelLeftSwitchTCTrack modelLeftSwitchTurn = new ModelLeftSwitchTCTrack();
    public static final ModelTwoWaysCrossingTCTrack modelTwoWaysCrossing = new ModelTwoWaysCrossingTCTrack();

    public static final ModelSlopeTCTrack model1X3Slope = new ModelSlopeTCTrack("track/slope/straight/1x3_rails.obj", "track/slope/straight/1x3_ballast.obj");
    public static final ModelSlopeTCTrack model1x6Slope = new ModelSlopeTCTrack("track/slope/straight/1x6_rails.obj", "track/slope/straight/1x6_supports.obj", "track/slope/straight/1x6_ballast.obj");
    public static final ModelSlopeTCTrack model1x12Slope = new ModelSlopeTCTrack("track/slope/straight/1x12_rails.obj", "track/slope/straight/1x12_supports.obj", "track/slope/straight/1x12_ballast.obj");
    public static final ModelSlopeTCTrack model1x18Slope = new ModelSlopeTCTrack("track/slope/straight/1x18_rails.obj", "track/slope/straight/1x18_supports.obj", "track/slope/straight/1x18_ballast.obj");
    public static final ModelSlopeTCTrack model1x3HalfHeightSlope = new ModelSlopeTCTrack("track/slope/half-height/1x3_rails.obj", "track/slope/half-height/1x3_supports.obj", null);
    public static final ModelSlopeTCTrack model1x6HalfHeightSlope = new ModelSlopeTCTrack("track/slope/half-height/1x6_rails.obj", "track/slope/half-height/1x6_supports.obj", null);
    public static final ModelSlopeTCTrack model1x9HalfHeightSlope = new ModelSlopeTCTrack("track/slope/half-height/1x9_rails.obj", "track/slope/half-height/1x9_supports.obj", null);
    public static final ModelSlopeTCTrack model1x3DiagonalHalfHeightSlope = new ModelSlopeTCTrack("track/slope/half-height/45-deg/1x3_rails.obj", null, null);
    public static final ModelSlopeTCTrack model1x6DiagonalHalfHeightSlope = new ModelSlopeTCTrack("track/slope/half-height/45-deg/1x6_rails.obj", null, null);
    public static final ModelSlopeTCTrack model1x9DiagonalHalfHeightSlope = new ModelSlopeTCTrack("track/slope/half-height/45-deg/1x9_rails.obj", null, null);
    public static final ModelSlopeTCTrack model1x3DiagonalSlope = new ModelSlopeTCTrack("track/slope/45-deg/1x3_rails.obj", "track/slope/45-deg/1x3_ballast.obj");
    public static final ModelSlopeTCTrack model1x6DiagonalSlope = new ModelSlopeTCTrack("track/slope/45-deg/1x6_rails.obj", "track/slope/45-deg/1x6_ballast.obj");
    public static final ModelSlopeTCTrack model1x12DiagonalSlope = new ModelSlopeTCTrack("track/slope/45-deg/1x12_rails.obj", "track/slope/45-deg/1x12_ballast.obj");
    public static final ModelSlopeTCTrack model1x18DiagonalSlope = new ModelSlopeTCTrack("track/slope/45-deg/1x18_rails.obj", "track/slope/45-deg/1x18_ballast.obj");
    public static final ModelEmbeddedTransitionSlopeTCTrack model1x3EmbeddedTransitionSlope = new ModelEmbeddedTransitionSlopeTCTrack("track/slope/embedded-transition/1x3_rails.obj");
    public static final ModelEmbeddedTransitionSlopeTCTrack model1x3DiagonalEmbeddedTransitionSlope = new ModelEmbeddedTransitionSlopeTCTrack("track/slope/embedded-transition/1x3_diagonal_rails.obj");

    public static final ModelRightParallelCurveTCTrack modelRightParallelCurve = new ModelRightParallelCurveTCTrack();
    public static final ModelLeftParallelCurveTCTrack modelLeftParallelCurve = new ModelLeftParallelCurveTCTrack();

    public static final ModelRightDiamondCrossing modelRightDiamondCrossing = new ModelRightDiamondCrossing();
    public static final ModelLeftDiamondCrossing modelLeftDiamondCrossing = new ModelLeftDiamondCrossing();

    /**
     * Renders one rail tile, including its captured host surface and height-adjusted track model.
     *
     * @param tileEntity rail tile to render
     * @param x camera-relative render X
     * @param y camera-relative render Y
     * @param z camera-relative render Z
     * @param partialTicks partial tick interpolation value
     */
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float partialTicks)
    {
        if ((tileEntity instanceof TileTCRail) == false)
        {
            return;
        }

        TileTCRail railTile = (TileTCRail) tileEntity;
        ITrackDefinition track = railTile.getTrackType();
        if ((railTile.hasModel == false && railTile.getTrackAttachments().isEmpty()) || track == null)
        {
            return;
        }

        NBTTagCompound entityData = Minecraft.getMinecraft().thePlayer.getEntityData();
        if (handleTileBlinking(entityData, railTile))
        {
            return;
        }

        EmbeddedTrackHostSurfaceRenderer.render(railTile, x, y, z);
        int facing = railTile.getBlockMetadata();
        float previousLightmapX = OpenGlHelper.lastBrightnessX;
        float previousLightmapY = OpenGlHelper.lastBrightnessY;
        applyEmbeddedTrackModelLighting(railTile);
        try
        {
            if (railTile.hasModel)
            {
				TrackRenderRouteCache.get(track).render(new TrackRenderContext(railTile, track, facing, x, y + railTile.getTrackRenderYOffset(), z, 1, 1, 1, 1));
			}
			TrackAttachmentRenderer.render(railTile, x, y, z);
        }
        finally
        {
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, previousLightmapX, previousLightmapY);
        }
    }

	/**
	 * Samples model lighting immediately above the resolved embedded surface for every model-bearing replacement piece.
	 * Long straight tracks may store captured hosts on only one owner tile, so placement identity—not local host-map
	 * visibility—determines whether an auxiliary model section needs the corrected surface sample.
	 *
	 * @param railTile rendered rail tile supplying the captured host and world position
	 */
	private static void applyEmbeddedTrackModelLighting(TileTCRail railTile)
    {
        /*
         * Long tracks can have auxiliary model-bearing TileTCRail pieces. Only
         * the owning tile stores captured hosts, but every piece shares the
         * raised embedded surface and needs to sample light above its block.
         */
		if (railTile.isReplaceTargetTrack() == false || railTile.getWorldObj() == null)
		{
			return;
		}

		int surfaceY = (int)Math.ceil(railTile.getTrackSurfaceY());
        int brightness = railTile.getWorldObj().getLightBrightnessForSkyBlocks(
                railTile.xCoord, surfaceY, railTile.zCoord, 0);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,
                brightness & 0xFFFF, brightness >>> 16 & 0xFFFF);
    }

    private boolean handleTileBlinking(NBTTagCompound entityData, TileTCRail railTile)
    {
        if (entityData.hasKey("TC_Train_Detector_Pairing") == false)
        {
            return false;
        }

        int detectorX = entityData.getInteger("TC_Train_Detector_BlockX");
        int detectorY = entityData.getInteger("TC_Train_Detector_BlockY");
        int detectorZ = entityData.getInteger("TC_Train_Detector_BlockZ");
        TileEntity possibleTrainDetector = Minecraft.getMinecraft().thePlayer.worldObj.getTileEntity(detectorX, detectorY, detectorZ);
        if (possibleTrainDetector instanceof TileTrainDetector)
        {
            TileTrainDetector detector = ((TileTrainDetector) possibleTrainDetector);
            TileTCRail parent = railTile.getGreatestParent(Minecraft.getMinecraft().theWorld);
            if (detector.getPairedTrack().contains(parent))
            {
                return Minecraft.getMinecraft().thePlayer.ticksExisted % 20 < 10;
            }
        }
        return false;
    }
}
