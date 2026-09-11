package train.client.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;
import train.client.render.RenderTCRail;
import train.client.render.TrackAttachmentRenderer;
import train.client.render.TrackPathDebugRenderer;
import train.client.render.embedded.EmbeddedTrackHostSurfaceRenderer;
import train.client.render.lighting.LightEffectRenderBatch;
import train.client.render.TrackRenderRouteCache;
import train.client.render.models.blocks.track.ModelSlopeTCTrack;
import train.common.enums.TCTrackDirection;
import train.common.items.BallastTypes;
import train.common.items.ItemTCRail;
import train.common.items.ItemTrackDebugger;
import train.common.library.BlockIDs;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackPlacementType;
import train.common.tile.TileTCRail;
import train.common.track.attachment.ITrackAttachmentItem;
import train.common.track.attachment.TrackAttachment;
import train.common.track.attachment.TrackAttachmentOperations;

import static train.common.library.track.EnumCoreTrack.*;


public class CustomRenderHandler
{
    private String previewBallastTexture;
    private int previewBallastColor;
    private Block previewBallastBlock;
    private int previewBallastMetadata;

    /**
     * Finishes Traincraft's world rendering, then spends the bounded end-of-frame budget compiling queued embedded
     * track display lists.
     *
     * @param event completed world-render event supplying the current partial tick
     */
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onRenderWorldLast(RenderWorldLastEvent event )
    {
        EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
        if ( player != null && player.getHeldItem() != null && ( player.getHeldItem().getItem() instanceof ItemTCRail) )
        {
            renderTCRailPreview(player);
        }
		else if (player != null && player.getHeldItem() != null
				&& player.getHeldItem().getItem() instanceof ITrackAttachmentItem)
		{
			renderTrackAttachmentPreview(player);
		}
		else if (player != null && player.getHeldItem() != null
				&& player.getHeldItem().getItem() instanceof ItemTrackDebugger)
		{
			TrackPathDebugRenderer.render(player);
		}
        // Lighting effects consume the completed opaque/world depth. Flush only
        // after Traincraft's own world-last track work has finished.
        LightEffectRenderBatch.flush();
        EmbeddedTrackHostSurfaceRenderer.compileQueuedDisplayLists();
    }

	/**
	 * Renders the attachment candidate produced by the held item for the current track-cell interaction.
	 *
	 * @param player client player selecting the attachment location
	 */
	private void renderTrackAttachmentPreview(EntityClientPlayerMP player)
	{
		Minecraft minecraft = Minecraft.getMinecraft();
		MovingObjectPosition target = minecraft.objectMouseOver;
		if (minecraft.theWorld == null || target == null
				|| target.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK || target.hitVec == null)
		{
			return;
		}
		ITrackAttachmentItem attachmentItem = (ITrackAttachmentItem)player.getHeldItem().getItem();
		float hitX = (float)(target.hitVec.xCoord - target.blockX);
		float hitZ = (float)(target.hitVec.zCoord - target.blockZ);
		TrackAttachment attachment = attachmentItem.resolveTrackAttachment(player.getHeldItem(), minecraft.theWorld,
				target.blockX, target.blockY, target.blockZ, target.sideHit, hitX, hitZ);
		TileTCRail owner = TrackAttachmentOperations.resolveRenderOwner(minecraft.theWorld,
				target.blockX, target.blockY, target.blockZ);
		if (owner == null)
		{
			owner = TrackAttachmentOperations.resolveRenderOwner(minecraft.theWorld,
					target.blockX, target.blockY + 1, target.blockZ);
		}
		if (attachment == null || owner == null)
		{
			return;
		}
		boolean validPlacement = owner.canAddAttachment(attachment);
		TrackAttachmentRenderer.renderPreview(owner, attachment,
				owner.xCoord - TileEntityRendererDispatcher.staticPlayerX,
				owner.yCoord - TileEntityRendererDispatcher.staticPlayerY,
				owner.zCoord - TileEntityRendererDispatcher.staticPlayerZ,
				validPlacement);
	}

    /**
     * Renders the placement preview for the rail item currently held by the player.
     *
     * @param player client player whose target and selected rail define the preview
     */
    private void renderTCRailPreview(EntityClientPlayerMP player)
    {
        World world = Minecraft.getMinecraft().theWorld;
        if (world == null || Minecraft.getMinecraft().objectMouseOver == null)
        {
            return;
        }
        int targetX = Minecraft.getMinecraft().objectMouseOver.blockX;
        int targetY = Minecraft.getMinecraft().objectMouseOver.blockY;
        int targetZ = Minecraft.getMinecraft().objectMouseOver.blockZ;

        if (world.getBlock(targetX, targetY, targetZ) == Blocks.air)
        {
            return;
        }

        ItemTCRail item = (ItemTCRail) player.getHeldItem().getItem();

        // Check if item can be placed and select color
        boolean validPlacement = item.tryToPlaceTrack(player.getHeldItem(), player, world, targetX, targetY, targetZ, false);
        float previewRed = 1;
        float previewGreen = 0;
        float previewBlue = 0;
        float previewAlpha = 0.5f;
        if (validPlacement)
        {
            previewRed = 0;
            previewGreen = 1;
        }

        int placementY = item.getPlacementHeight(world, targetX, targetY, targetZ);
        ITrackDefinition track = item.getTrackType(player.getHeldItem());
		double previewY = getPreviewRenderY(track, targetY, placementY,
				getReplacementSurfaceHeight(world, targetX, targetY, targetZ),
				ItemTCRail.getAutomaticPlacementType(track, world, targetX, targetY, targetZ));
        double cameraX = TileEntityRendererDispatcher.staticPlayerX;
        double cameraY = TileEntityRendererDispatcher.staticPlayerY;
        double cameraZ = TileEntityRendererDispatcher.staticPlayerZ;
        int facing = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        Vector2f placementDirection = ItemTCRail.getDirectionVector(facing);

        // Render
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushMatrix();
        GL11.glTranslated(targetX - cameraX, previewY - cameraY, targetZ - cameraZ);
        GL11.glEnable(GL11.GL_BLEND);

        EnumCoreTrack core = track.getCoreTrack();
        switch (core)
        {
            case CORE_SMALL_STRAIGHT:
				renderStraightPreview(item, player, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_MEDIUM_STRAIGHT:
            case CORE_LONG_STRAIGHT:
            case CORE_VERY_LONG_STRAIGHT:
                renderStraightPreview(item, player, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_DOUBLE_DIAMOND_CROSSING:
                TrackRenderRouteCache.renderPreview(track, core, facing, placementDirection.getX(), 0, placementDirection.getY(), previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_FOUR_WAYS_CROSSING:
                TrackRenderRouteCache.renderPreview(track, core, facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_DIAMOND_CROSSING:
                renderDiamondCrossingPreview(item, player, facing, placementDirection, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_TWO_WAYS_CROSSING:
                renderTwoWaysCrossingPreview(item, player, placementDirection, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_18_SLOPE:
            case CORE_12_SLOPE:
            case CORE_6_SLOPE:
            case CORE_3_SLOPE:
            case CORE_3_HALF_HEIGHT_SLOPE:
            case CORE_6_HALF_HEIGHT_SLOPE:
            case CORE_9_HALF_HEIGHT_SLOPE:
            case CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE:
            case CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE:
            case CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE:
            case CORE_EMBEDDED_TRANSITION_SLOPE:
            case CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE:
                renderSlopePreview(item, player, world, targetX, targetY, placementY, targetZ, core, facing,
                        previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            default:
                switch (track.getRailType())
                {
                    case PARALLEL:
                    case DIAGONALTURN:
                    case TURN:
                        renderDirectionalPreview(item, player, facing, previewRed, previewGreen, previewBlue, previewAlpha);
                        break;
                    case SWITCH:
                        renderSwitchPreview(item, player, facing, placementDirection, previewRed, previewGreen, previewBlue, previewAlpha);
                        break;
                    default:
                        break;
                }
                break;
        }


            GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    /**
     * Returns the same model base height used after placement. Surface rails are
     * drawn above the supporting block. True-embedded rails replace the selected
	 * block and sit slightly below its top face.
	 *
	 * @param track selected track definition
	 * @param targetY selected block Y coordinate
	 * @param surfacePlacementY ordinary surface-placement Y coordinate
	 * @return preview model Y coordinate
	 */
	public static double getPreviewRenderY(ITrackDefinition track, int targetY, int surfacePlacementY)
	{
		return getPreviewRenderY(track, targetY, surfacePlacementY,
				TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT);
	}

	/**
	 * Returns the preview model height for a replacement host with a known top surface. Embedded rails receive their
	 * trench inset, while host-mounted rails remain exactly on the intact captured surface.
	 *
	 * @param track selected track definition
	 * @param targetY selected block Y coordinate
	 * @param surfacePlacementY ordinary surface-placement Y coordinate
	 * @param replacementSurfaceHeight replacement host top height within its block
	 * @return preview model Y coordinate
	 */
	public static double getPreviewRenderY(ITrackDefinition track, int targetY, int surfacePlacementY,
			double replacementSurfaceHeight)
	{
		return getPreviewRenderY(track, targetY, surfacePlacementY, replacementSurfaceHeight,
				track != null ? track.getPlacementType() : TrackPlacementType.SURFACE);
	}

	/**
	 * Returns the preview model height using the supplied effective placement variant.
	 *
	 * @param track selected resource and shape definition
	 * @param targetY selected block Y coordinate
	 * @param surfacePlacementY ordinary surface-placement Y coordinate
	 * @param replacementSurfaceHeight replacement host top height within its block
	 * @param placementType effective stack placement variant
	 * @return preview model Y coordinate
	 */
	public static double getPreviewRenderY(ITrackDefinition track, int targetY, int surfacePlacementY,
			double replacementSurfaceHeight, TrackPlacementType placementType)
	{
		if (track != null && (placementType == TrackPlacementType.SLAB_MOUNTED
				|| placementType == TrackPlacementType.STAIR_MOUNTED))
		{
			return targetY + replacementSurfaceHeight;
		}
		if (track != null && placementType.replacesTarget())
		{
			return targetY + replacementSurfaceHeight - TrackHostConstants.EMBEDDED_TRACK_MODEL_INSET;
		}
		return surfacePlacementY + 1.0D;
	}

	/**
	 * Resolves the top surface of the block selected for replacement.
	 *
	 * @param world preview world
	 * @param x selected block X coordinate
	 * @param y selected block Y coordinate
	 * @param z selected block Z coordinate
	 * @return {@code 0.5} for a bottom slab, otherwise {@code 1.0}
	 */
	private static double getReplacementSurfaceHeight(World world, int x, int y, int z)
	{
		Block block = world.getBlock(x, y, z);
		return block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (world.getBlockMetadata(x, y, z) & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0
				? TrackHostConstants.HALF_BLOCK_HEIGHT
				: TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT;
	}

    private void renderStraightPreview(ItemTCRail item, EntityClientPlayerMP player, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        ITrackDefinition track = item.getTrackType(player.getHeldItem());
        int facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
        Vector2f trackDirection = ItemTCRail.getDirectionVector(facing);

        int trackLength = 1;
        switch (track.getCoreTrack())
        {
            case CORE_MEDIUM_STRAIGHT:
                trackLength = 3;
                break;
            case CORE_LONG_STRAIGHT:
                trackLength = 6;
                break;
            case CORE_VERY_LONG_STRAIGHT:
                trackLength = 12;
                break;
            default:
                break;
        }

        if (isDiagonalFacing(facing))
        {
            for (int segmentIndex = 0; segmentIndex < trackLength; segmentIndex++)
            {
                float segmentXOffset = 0;
                float segmentZOffset = 0;
                switch (facing)
                {
                    case 6:
                        segmentXOffset = segmentIndex;
                        segmentZOffset = -1 * segmentIndex;
                        break;
                    case 4:
                        segmentXOffset = -1 * segmentIndex;
                        segmentZOffset = segmentIndex;
                        break;
                    case 7:
                        segmentXOffset = segmentIndex;
                        segmentZOffset = segmentIndex;
                        break;
                    case 5:
                        segmentXOffset = -1 * segmentIndex;
                        segmentZOffset = -1 * segmentIndex;
                        break;
                    default:
                        break;
                }

                RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(track.getVariant(), facing, segmentXOffset, 0, segmentZOffset, previewRed, previewGreen, previewBlue, previewAlpha);
            }
        }
        else
        {
            for (int segmentIndex = 0; segmentIndex < trackLength; segmentIndex++)
            {
                float segmentXOffset = trackDirection.getX() * segmentIndex;
                float segmentZOffset = trackDirection.getY() * segmentIndex;
                RenderTCRail.modelSmallStraight.renderStraight(track, facing, segmentXOffset, 0, segmentZOffset, previewRed, previewGreen, previewBlue, previewAlpha);
            }
        }
    }

    private void renderDiamondCrossingPreview(ItemTCRail item, EntityClientPlayerMP player, int facing, Vector2f placementDirection, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        ITrackDefinition track = item.getTrackType(player.getHeldItem());
        boolean isLeftCrossing = item.getTrackOrientation(facing, MathHelper.wrapAngleTo180_float(player.rotationYaw)).equals("left");
        TrackRenderRouteCache.renderPreview(track, track.getCoreTrack().getLeftRightVariant(isLeftCrossing), facing, placementDirection.getX(), 0, placementDirection.getY(), previewRed, previewGreen, previewBlue, previewAlpha);
    }

    private void renderTwoWaysCrossingPreview(ItemTCRail item, EntityClientPlayerMP player, Vector2f placementDirection, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        ITrackDefinition track = item.getTrackType(player.getHeldItem());
        int facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
        if (isDiagonalFacing(facing))
        {
            TrackRenderRouteCache.renderPreview(track, track.getCoreTrack(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
            return;
        }

        float crossingXOffset = placementDirection.getX();
        float crossingZOffset = placementDirection.getY();

        TrackRenderRouteCache.renderPreview(track, track.getCoreTrack(), 0, crossingXOffset, 0, crossingZOffset, previewRed, previewGreen, previewBlue, 0.5f);

        RenderTCRail.modelSmallStraight.renderStraight(track, 0, crossingXOffset, 0, crossingZOffset + 1, previewRed, previewGreen, previewBlue, previewAlpha);
        RenderTCRail.modelSmallStraight.renderStraight(track, 1, crossingXOffset + 1, 0, crossingZOffset, previewRed, previewGreen, previewBlue, previewAlpha);
        RenderTCRail.modelSmallStraight.renderStraight(track, 2, crossingXOffset, 0, crossingZOffset - 1, previewRed, previewGreen, previewBlue, previewAlpha);
        RenderTCRail.modelSmallStraight.renderStraight(track, 3, crossingXOffset - 1, 0, crossingZOffset, previewRed, previewGreen, previewBlue, previewAlpha);
    }

    /**
     * Renders the placement preview for a full-height, transition, or half-height slope.
     *
     * @param item selected rail item
     * @param player player controlling preview orientation
     * @param world world supplying dynamic ballast material
     * @param targetX selected block X coordinate
     * @param targetY selected block Y coordinate
     * @param placementY resolved placement Y coordinate
     * @param targetZ selected block Z coordinate
     * @param core selected slope core
     * @param facing initial cardinal facing
     * @param previewRed red preview tint
     * @param previewGreen green preview tint
     * @param previewBlue blue preview tint
     * @param previewAlpha preview opacity
     */
    private void renderSlopePreview(ItemTCRail item, EntityClientPlayerMP player, World world,
            int targetX, int targetY, int placementY, int targetZ, EnumCoreTrack core, int facing,
            float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        ITrackDefinition track = item.getTrackType(player.getHeldItem());
        if (core.isHalfHeightSlope() == false && core != CORE_3_SLOPE
                && (BallastTypes.WOODSUPPORT.equals(track.getBallastType())
                || BallastTypes.PEAGRAVEL.equals(track.getBallastType())))
        {
            switch (core)
            {
                case CORE_18_SLOPE:
                    RenderTCRail.model1x18Slope.render(track.getVariant(), track.getBallastType(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f);
                    break;
                case CORE_12_SLOPE:
                    RenderTCRail.model1x12Slope.render(track.getVariant(), track.getBallastType(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f);
                    break;
                case CORE_6_SLOPE:
                    RenderTCRail.model1x6Slope.render(track.getVariant(), track.getBallastType(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f);
                    break;
                default:
                    break;
            }
            return;
        }

        facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
        int cardinalFacing = MathHelper.floor_double((player.rotationYaw * 4.0F / 360.0F + 0.5D)) & 3;
        updatePreviewBallastInfo(world, targetX, placementY, targetZ, track.getBallastType());

        boolean diagonalFacing = isDiagonalFacing(facing);
        TrackPlacementType placementType = ItemTCRail.getAutomaticPlacementType(
                track, world, targetX, targetY, targetZ);
        if (core.isHalfHeightSlope() && placementType == TrackPlacementType.REPLACE_TARGET)
        {
            EnumCoreTrack previewCore = getHalfHeightPreviewCore(core, diagonalFacing);
            double surfaceHeight = getReplacementSurfaceHeight(world, targetX, targetY, targetZ);
            EmbeddedTrackHostSurfaceRenderer.renderTrueEmbeddedHalfHeightPreview(track, previewCore,
                    facing, world, targetX, targetY, targetZ, 0,
					TrackHostConstants.EMBEDDED_TRACK_MODEL_INSET - surfaceHeight, 0,
                    previewRed, previewGreen, previewBlue, previewAlpha);
            renderTrueEmbeddedHalfHeightModelPreview(track, previewCore, facing,
                    previewRed, previewGreen, previewBlue, previewAlpha);
            return;
        }
        switch (core)
        {
            case CORE_EMBEDDED_TRANSITION_SLOPE:
            case CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE:
                EnumCoreTrack previewCore = getEmbeddedTransitionPreviewCore(diagonalFacing);
                TrackRenderRouteCache.renderPreview(track, previewCore, facing, 0, 0, 0,
                        previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_18_SLOPE:
                if (diagonalFacing)
                {
                    RenderTCRail.model1x18DiagonalSlope.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                else
                {
                    RenderTCRail.model1x18Slope.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha, previewBallastTexture, previewBallastColor);
                }
                break;
            case CORE_12_SLOPE:
                if (diagonalFacing)
                {
                    RenderTCRail.model1x12DiagonalSlope.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                else
                {
                    RenderTCRail.model1x12Slope.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha, previewBallastTexture, previewBallastColor);
                }
                break;
            case CORE_6_SLOPE:
                if (diagonalFacing)
                {
                    RenderTCRail.model1x6DiagonalSlope.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                else
                {
                    RenderTCRail.model1x6Slope.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha, previewBallastTexture, previewBallastColor);
                }
                break;
            case CORE_3_SLOPE:
                if (diagonalFacing)
                {
                    RenderTCRail.model1x3DiagonalSlope.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                else
                {
                    RenderTCRail.model1X3Slope.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                break;
            case CORE_3_HALF_HEIGHT_SLOPE:
                if (diagonalFacing)
                {
                    renderHalfHeightSlopePreview(RenderTCRail.model1x3DiagonalHalfHeightSlope, track,
                            CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE, facing,
                            previewRed, previewGreen, previewBlue, previewAlpha);
                }
                else
                {
                    renderHalfHeightSlopePreview(RenderTCRail.model1x3HalfHeightSlope, track,
                            CORE_3_HALF_HEIGHT_SLOPE, cardinalFacing,
                            previewRed, previewGreen, previewBlue, previewAlpha);
                }
                break;
            case CORE_6_HALF_HEIGHT_SLOPE:
                if (diagonalFacing)
                {
                    renderHalfHeightSlopePreview(RenderTCRail.model1x6DiagonalHalfHeightSlope, track,
                            CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE, facing,
                            previewRed, previewGreen, previewBlue, previewAlpha);
                }
                else
                {
                    renderHalfHeightSlopePreview(RenderTCRail.model1x6HalfHeightSlope, track,
                            CORE_6_HALF_HEIGHT_SLOPE, cardinalFacing,
                            previewRed, previewGreen, previewBlue, previewAlpha);
                }
                break;
            case CORE_9_HALF_HEIGHT_SLOPE:
                if (diagonalFacing)
                {
                    renderHalfHeightSlopePreview(RenderTCRail.model1x9DiagonalHalfHeightSlope, track,
                            CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE, facing,
                            previewRed, previewGreen, previewBlue, previewAlpha);
                }
                else
                {
                    renderHalfHeightSlopePreview(RenderTCRail.model1x9HalfHeightSlope, track,
                            CORE_9_HALF_HEIGHT_SLOPE, cardinalFacing,
                            previewRed, previewGreen, previewBlue, previewAlpha);
                }
                break;
            case CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE:
                renderHalfHeightSlopePreview(RenderTCRail.model1x3DiagonalHalfHeightSlope, track,
                        core, facing, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE:
                renderHalfHeightSlopePreview(RenderTCRail.model1x6DiagonalHalfHeightSlope, track,
                        core, facing, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE:
                renderHalfHeightSlopePreview(RenderTCRail.model1x9DiagonalHalfHeightSlope, track,
                        core, facing, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            default:
                break;
        }
    }

    /**
     * Resolves a half-height preview's direction-specific core without changing the selected item definition.
     *
     * @param selectedCore half-height core stored by the selected item
     * @param diagonalFacing whether the player's current direction lies on a diagonal axis
     * @return matching cardinal or diagonal half-height core
     */
    private static EnumCoreTrack getHalfHeightPreviewCore(EnumCoreTrack selectedCore, boolean diagonalFacing)
    {
        if (diagonalFacing == false || selectedCore == CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE
                || selectedCore == CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE
                || selectedCore == CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE)
        {
            return selectedCore;
        }
        switch (selectedCore)
        {
            case CORE_3_HALF_HEIGHT_SLOPE:
                return CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE;
            case CORE_6_HALF_HEIGHT_SLOPE:
                return CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE;
            case CORE_9_HALF_HEIGHT_SLOPE:
                return CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE;
            default:
                return selectedCore;
        }
    }

    /**
     * Draws the same authored rail-and-ballast model used by a placed true-embedded half-height slope after its prospective
     * trench layer has been rendered. This preserves the continuous slope body while the captured-host renderer supplies
     * the embedded cutout and its world-aware appearance.
     *
     * @param track selected track definition supplying the rail variant
     * @param core effective cardinal or diagonal half-height core
     * @param facing preview direction
     * @param red red placement-validity multiplier
     * @param green green placement-validity multiplier
     * @param blue blue placement-validity multiplier
     * @param alpha preview opacity
     */
    private void renderTrueEmbeddedHalfHeightModelPreview(ITrackDefinition track, EnumCoreTrack core, int facing,
            float red, float green, float blue, float alpha)
    {
        ModelSlopeTCTrack model;
        switch (core)
        {
            case CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE:
                model = RenderTCRail.model1x3DiagonalHalfHeightSlope;
                break;
            case CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE:
                model = RenderTCRail.model1x6DiagonalHalfHeightSlope;
                break;
            case CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE:
                model = RenderTCRail.model1x9DiagonalHalfHeightSlope;
                break;
            case CORE_6_HALF_HEIGHT_SLOPE:
                model = RenderTCRail.model1x6HalfHeightSlope;
                break;
            case CORE_9_HALF_HEIGHT_SLOPE:
                model = RenderTCRail.model1x9HalfHeightSlope;
                break;
            default:
                model = RenderTCRail.model1x3HalfHeightSlope;
                break;
        }
        model.renderDynamic(track.getVariant(), facing, 0, 0, 0, red, green, blue, alpha,
                previewBallastTexture, previewBallastColor);
    }

	/**
	 * Renders one half-height placement preview with generated ballast, or the authored wood-support mesh when selected.
	 *
	 * @param model authored rail model and optional cardinal wood-support mesh
	 * @param track selected track definition supplying rail and ballast families
	 * @param core effective cardinal or diagonal half-height core
	 * @param facing preview direction
	 * @param red red placement-validity multiplier
	 * @param green green placement-validity multiplier
	 * @param blue blue placement-validity multiplier
	 * @param alpha preview opacity
	 */
	private void renderHalfHeightSlopePreview(ModelSlopeTCTrack model, ITrackDefinition track,
			EnumCoreTrack core, int facing, float red, float green, float blue, float alpha)
	{
		if (BallastTypes.WOODSUPPORT.equals(track.getBallastType()))
		{
			model.render(track.getVariant(), track.getBallastType(), facing, 0, 0, 0, red, green, blue, alpha);
			return;
		}
		EmbeddedTrackHostSurfaceRenderer.renderHalfHeightBallastPreview(track, core, facing,
				previewBallastBlock, previewBallastMetadata, previewBallastColor,
				0, 0, 0, red, green, blue, alpha);
		model.renderRailOnly(track.getVariant(), facing, 0, 0, 0, red, green, blue, alpha);
	}

    /**
     * The transition has one inventory item, but the preview must select the same
     * internal straight or diagonal shape that placement will create.
	 *
	 * @param diagonalFacing whether the player is placing along a diagonal axis
	 * @return the transition core matching the placement direction
     */
    public static EnumCoreTrack getEmbeddedTransitionPreviewCore(boolean diagonalFacing)
    {
        return diagonalFacing
                ? CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE
                : CORE_EMBEDDED_TRANSITION_SLOPE;
    }

    /**
     * Renders the handed preview for a directional turn or crossing.
     *
     * @param item selected rail item
     * @param player player controlling the preview orientation
     * @param facing cardinal placement facing
     * @param previewRed red preview tint
     * @param previewGreen green preview tint
     * @param previewBlue blue preview tint
     * @param previewAlpha preview opacity
     */
    private void renderDirectionalPreview(ItemTCRail item, EntityClientPlayerMP player, int facing, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        ITrackDefinition track = item.getTrackType(player.getHeldItem());
        float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
        boolean isLeftTurn = item.getTrackOrientation(facing, yaw).equals("left");
        TrackRenderRouteCache.renderPreview(track, track.getCoreTrack().getLeftRightVariant(isLeftTurn), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
    }

    private void renderSwitchPreview(ItemTCRail item, EntityClientPlayerMP player, int facing, Vector2f placementDirection, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        ITrackDefinition track = item.getTrackType(player.getHeldItem());
        float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
        boolean isLeftTurn = item.getTrackOrientation(facing, yaw).equals("left");

        float mainDirectionX = placementDirection.getX();
        float mainDirectionZ = placementDirection.getY();
        int mainExitStart = 3;
        int mainExitEnd = 3;
        int divergingFacing = isLeftTurn ? (facing + 4 - 1) % 4 : (facing + 1) % 4;
        int divergingMainOffset = 3;
        int divergingSideOffset = 3;
        EnumCoreTrack enumCoreTrack = track.getCoreTrack();

        switch (enumCoreTrack)
        {
            case CORE_4x11_PARALLEL_SWITCH:
                mainExitStart = 5;
                mainExitEnd = 10;
                divergingMainOffset = 10;
                divergingSideOffset = 3;
                break;
            case CORE_4x17_PARALLEL_SWITCH:
            case CORE_3x5_45DEGREE_SWITCH:
            case CORE_4x8_45DEGREE_SWITCH:
                mainExitStart = 0;
                mainExitEnd = 0;
                divergingMainOffset = 0;
                divergingSideOffset = 0;
                break;
            case CORE_6x6_SWITCH:
                mainExitStart = 5;
                mainExitEnd = 5;
                divergingMainOffset = 5;
                divergingSideOffset = 5;
                break;
            case CORE_11x11_SWITCH:
                mainExitStart = 0;
                mainExitEnd = 0;
                divergingMainOffset = 10;
                divergingSideOffset = 10;
                break;
            case CORE_10x2_CROSSOVER_SWITCH:
                TrackRenderRouteCache.renderPreview(track, enumCoreTrack.getLeftRightVariant(isLeftTurn), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
                return;
            default:
                break;
        }

        Vector2f divergingDirection = ItemTCRail.getDirectionVector(divergingFacing);

        float divergingDirectionX = divergingDirection.getX();
        float divergingDirectionZ = divergingDirection.getY();

        for (int mainExitOffset = mainExitStart; mainExitOffset < mainExitEnd + 1; mainExitOffset++)
        {
            RenderTCRail.modelSmallStraight.renderStraight(track, facing, mainDirectionX * mainExitOffset, 0, mainDirectionZ * mainExitOffset, previewRed, previewGreen, previewBlue, previewAlpha);
        }

        switch (enumCoreTrack)
        {
            case CORE_4x11_PARALLEL_SWITCH:
                RenderTCRail.modelSmallStraight.renderStraight(track, facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
                RenderTCRail.modelSmallStraight.renderStraight(track, facing, mainDirectionX * divergingMainOffset + divergingDirectionX * divergingSideOffset, 0, mainDirectionZ * divergingMainOffset + divergingDirectionZ * divergingSideOffset, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_3x5_45DEGREE_SWITCH:
            case CORE_4x8_45DEGREE_SWITCH:
            case CORE_4x17_PARALLEL_SWITCH:
                break;
            default:
                RenderTCRail.modelSmallStraight.renderStraight(track, facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
                RenderTCRail.modelSmallStraight.renderStraight(track, divergingFacing, mainDirectionX * divergingMainOffset + divergingDirectionX * divergingSideOffset, 0, mainDirectionZ * divergingMainOffset + divergingDirectionZ * divergingSideOffset, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
        }

        TrackRenderRouteCache.renderPreview(track, enumCoreTrack.getLeftRightVariant(isLeftTurn), facing, mainDirectionX, 0, mainDirectionZ, previewRed, previewGreen, previewBlue, previewAlpha);
    }

    /**
     * Resolves the block, metadata, icon, and tint used by the current slope preview. Fixed ballast families override
     * the targeted support block; dynamic ballast keeps the targeted block material selected by {@link #blockInfo()}.
     *
     * @param world client world supplying the placement target and material tint
     * @param x placement target X coordinate
     * @param y placement target Y coordinate
     * @param z placement target Z coordinate
     * @param ballastType selected fixed or dynamic ballast family
     */
    private void updatePreviewBallastInfo(World world, int x, int y, int z, BallastTypes ballastType)
    {
        blockInfo();
        if (ballastType == null)
        {
            return;
        }

        switch (ballastType)
        {
            case GRAVEL:
                previewBallastColor = Blocks.gravel.colorMultiplier(world, x, y, z);
                setBallastMaterial(Blocks.gravel, 0, Blocks.gravel.getIcon(1, 0));
                break;
            case BALLAST:
                previewBallastColor = BlockIDs.oreTC.getBlock().colorMultiplier(world, x, y, z);
                setBallastMaterial(BlockIDs.oreTC.getBlock(), 3, BlockIDs.oreTC.getBlock().getIcon(1, 3));
                break;
            case SNOWGRAVEL:
                previewBallastColor = BlockIDs.oreTC.getBlock().colorMultiplier(world, x, y, z);
                setBallastMaterial(BlockIDs.oreTC.getBlock(), 4, BlockIDs.oreTC.getBlock().getIcon(1, 4));
                break;
            case DYNAMIC:
            default:
                break;
        }
    }

    /**
     * Stores the block identity and icon used by both OBJ-backed legacy previews and generated half-height previews.
     *
     * @param block ballast block shown by the preview
     * @param metadata metadata selecting the ballast block texture
     * @param icon resolved ballast icon
     */
    private void setBallastMaterial(Block block, int metadata, IIcon icon)
    {
        previewBallastBlock = block;
        previewBallastMetadata = metadata;
        if (icon != null && icon.getIconName() != null)
        {
            previewBallastTexture = icon.getIconName();
        }
    }

    private static boolean isDiagonalFacing(int facing)
    {
        switch (facing)
        {
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /**
     * Captures the currently targeted world block as the default dynamic ballast material for placement previews.
     */
    private void blockInfo()
    {
        World world = Minecraft.getMinecraft().theWorld;
        int targetX = Minecraft.getMinecraft().objectMouseOver.blockX;
        int targetY = Minecraft.getMinecraft().objectMouseOver.blockY;
        int targetZ = Minecraft.getMinecraft().objectMouseOver.blockZ;
        Block block = world.getBlock(targetX, targetY, targetZ);
        int metadata = world.getBlockMetadata(targetX, targetY, targetZ);

        previewBallastColor = block.colorMultiplier(world, targetX, targetY, targetZ);
        IIcon icon = block.getIcon(1, metadata);
        setBallastMaterial(block, metadata, icon);
    }
}
