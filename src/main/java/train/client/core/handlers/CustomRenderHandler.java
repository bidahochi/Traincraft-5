package train.client.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;
import train.client.render.RenderTCRail;
import train.client.render.lighting.LightEffectRenderBatch;
import train.client.render.TrackRenderRouteCache;
import train.common.enums.TCTrackDirection;
import train.common.items.BallastTypes;
import train.common.items.ItemTCRail;
import train.common.library.BlockIDs;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.ITrackDefinition;

import static train.common.library.track.EnumCoreTrack.*;


public class CustomRenderHandler
{
    private String previewBallastTexture;
    private int previewBallastColor;

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onRenderWorldLast(RenderWorldLastEvent event )
    {
        EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
        if ( player != null && player.getHeldItem() != null && ( player.getHeldItem().getItem() instanceof ItemTCRail) )
        {
            renderTCRailPreview(player);
        }
        // Lighting effects consume the completed opaque/world depth. Flush only
        // after Traincraft's own world-last track work has finished.
        LightEffectRenderBatch.flush();
    }

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
        double cameraX = TileEntityRendererDispatcher.staticPlayerX;
        double cameraY = TileEntityRendererDispatcher.staticPlayerY;
        double cameraZ = TileEntityRendererDispatcher.staticPlayerZ;
        int facing = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        Vector2f placementDirection = ItemTCRail.getDirectionVector(facing);

        // Render
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushMatrix();
        GL11.glTranslated(targetX - cameraX, placementY + 1 - cameraY, targetZ - cameraZ);
        GL11.glEnable(GL11.GL_BLEND);

        ITrackDefinition track = item.getTrackType();
        EnumCoreTrack core = track.getCoreTrack();
        switch (core)
        {
            case CORE_SMALL_STRAIGHT:
                switch (track.getItem())
                {
                    case tcRailSmallRoadCrossing:
                    case tcRailSmallRoadCrossing1:
                    case tcRailSmallRoadCrossing2:
                        TrackRenderRouteCache.renderPreview(track, core, facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f);
                        break;
                    case tcRailSmallRoadCrossingDynamic:
                        blockInfo();
                        RenderTCRail.modelRoadCrossing.renderDynamic(track.getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                        break;
                    default:
                        renderStraightPreview(item, player, previewRed, previewGreen, previewBlue, previewAlpha);
                        break;
                }
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
                renderSlopePreview(item, player, world, targetX, placementY, targetZ, core, facing, previewRed, previewGreen, previewBlue, previewAlpha);
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

    private void renderStraightPreview(ItemTCRail item, EntityClientPlayerMP player, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        int facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
        Vector2f trackDirection = ItemTCRail.getDirectionVector(facing);

        int trackLength = 1;
        switch (item.getTrackType().getCoreTrack())
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

                RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(item.getTrackType().getVariant(), facing, segmentXOffset, 0, segmentZOffset, previewRed, previewGreen, previewBlue, previewAlpha);
            }
        }
        else
        {
            for (int segmentIndex = 0; segmentIndex < trackLength; segmentIndex++)
            {
                float segmentXOffset = trackDirection.getX() * segmentIndex;
                float segmentZOffset = trackDirection.getY() * segmentIndex;
                RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), facing, segmentXOffset, 0, segmentZOffset, previewRed, previewGreen, previewBlue, previewAlpha);
            }
        }
    }

    private void renderDiamondCrossingPreview(ItemTCRail item, EntityClientPlayerMP player, int facing, Vector2f placementDirection, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        boolean isLeftCrossing = item.getTrackOrientation(facing, MathHelper.wrapAngleTo180_float(player.rotationYaw)).equals("left");
        TrackRenderRouteCache.renderPreview(item.getTrackType(), item.getTrackType().getCoreTrack().getLeftRightVariant(isLeftCrossing), facing, placementDirection.getX(), 0, placementDirection.getY(), previewRed, previewGreen, previewBlue, previewAlpha);
    }

    private void renderTwoWaysCrossingPreview(ItemTCRail item, EntityClientPlayerMP player, Vector2f placementDirection, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        int facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
        if (isDiagonalFacing(facing))
        {
            TrackRenderRouteCache.renderPreview(item.getTrackType(), item.getTrackType().getCoreTrack(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
            return;
        }

        float crossingXOffset = placementDirection.getX();
        float crossingZOffset = placementDirection.getY();

        TrackRenderRouteCache.renderPreview(item.getTrackType(), item.getTrackType().getCoreTrack(), 0, crossingXOffset, 0, crossingZOffset, previewRed, previewGreen, previewBlue, 0.5f);

        RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), 0, crossingXOffset, 0, crossingZOffset + 1, previewRed, previewGreen, previewBlue, previewAlpha);
        RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), 1, crossingXOffset + 1, 0, crossingZOffset, previewRed, previewGreen, previewBlue, previewAlpha);
        RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), 2, crossingXOffset, 0, crossingZOffset - 1, previewRed, previewGreen, previewBlue, previewAlpha);
        RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), 3, crossingXOffset - 1, 0, crossingZOffset, previewRed, previewGreen, previewBlue, previewAlpha);
    }

    private void renderSlopePreview(ItemTCRail item, EntityClientPlayerMP player, World world, int targetX, int placementY, int targetZ, EnumCoreTrack core, int facing, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        if (core != CORE_3_SLOPE && (BallastTypes.WOODSUPPORT.equals(item.getTrackType().getBallastType()) || BallastTypes.PEAGRAVEL.equals(item.getTrackType().getBallastType())))
        {
            switch (core)
            {
                case CORE_18_SLOPE:
                    RenderTCRail.model1x18Slope.render(item.getTrackType().getVariant(), item.getTrackType().getBallastType(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f);
                    break;
                case CORE_12_SLOPE:
                    RenderTCRail.model1x12Slope.render(item.getTrackType().getVariant(), item.getTrackType().getBallastType(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f);
                    break;
                case CORE_6_SLOPE:
                    RenderTCRail.model1x6Slope.render(item.getTrackType().getVariant(), item.getTrackType().getBallastType(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f);
                    break;
                default:
                    break;
            }
            return;
        }

        facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
        updatePreviewBallastInfo(world, targetX, placementY, targetZ, item.getTrackType().getBallastType());

        boolean diagonalFacing = isDiagonalFacing(facing);
        switch (core)
        {
            case CORE_18_SLOPE:
                if (diagonalFacing)
                {
                    RenderTCRail.model1x18DiagonalSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                else
                {
                    RenderTCRail.model1x18Slope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha, previewBallastTexture, previewBallastColor);
                }
                break;
            case CORE_12_SLOPE:
                if (diagonalFacing)
                {
                    RenderTCRail.model1x12DiagonalSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                else
                {
                    RenderTCRail.model1x12Slope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha, previewBallastTexture, previewBallastColor);
                }
                break;
            case CORE_6_SLOPE:
                if (diagonalFacing)
                {
                    RenderTCRail.model1x6DiagonalSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                else
                {
                    RenderTCRail.model1x6Slope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha, previewBallastTexture, previewBallastColor);
                }
                break;
            case CORE_3_SLOPE:
                if (diagonalFacing)
                {
                    RenderTCRail.model1x3DiagonalSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                else
                {
                    RenderTCRail.model1X3Slope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, 0.5f, previewBallastTexture, previewBallastColor);
                }
                break;
            default:
                break;
        }
    }

    private void renderDirectionalPreview(ItemTCRail item, EntityClientPlayerMP player, int facing, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
        boolean isLeftTurn = item.getTrackOrientation(facing, yaw).equals("left");
        TrackRenderRouteCache.renderPreview(item.getTrackType(), item.getTrackType().getCoreTrack().getLeftRightVariant(isLeftTurn), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
    }

    private void renderSwitchPreview(ItemTCRail item, EntityClientPlayerMP player, int facing, Vector2f placementDirection, float previewRed, float previewGreen, float previewBlue, float previewAlpha)
    {
        float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
        boolean isLeftTurn = item.getTrackOrientation(facing, yaw).equals("left");

        float mainDirectionX = placementDirection.getX();
        float mainDirectionZ = placementDirection.getY();
        int mainExitStart = 3;
        int mainExitEnd = 3;
        int divergingFacing = isLeftTurn ? (facing + 4 - 1) % 4 : (facing + 1) % 4;
        int divergingMainOffset = 3;
        int divergingSideOffset = 3;
        EnumCoreTrack enumCoreTrack = item.getTrackType().getCoreTrack();

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
                TrackRenderRouteCache.renderPreview(item.getTrackType(), enumCoreTrack.getLeftRightVariant(isLeftTurn), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
                return;
            default:
                break;
        }

        Vector2f divergingDirection = ItemTCRail.getDirectionVector(divergingFacing);

        float divergingDirectionX = divergingDirection.getX();
        float divergingDirectionZ = divergingDirection.getY();

        for (int mainExitOffset = mainExitStart; mainExitOffset < mainExitEnd + 1; mainExitOffset++)
        {
            RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), facing, mainDirectionX * mainExitOffset, 0, mainDirectionZ * mainExitOffset, previewRed, previewGreen, previewBlue, previewAlpha);
        }

        switch (enumCoreTrack)
        {
            case CORE_4x11_PARALLEL_SWITCH:
                RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
                RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), facing, mainDirectionX * divergingMainOffset + divergingDirectionX * divergingSideOffset, 0, mainDirectionZ * divergingMainOffset + divergingDirectionZ * divergingSideOffset, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
            case CORE_3x5_45DEGREE_SWITCH:
            case CORE_4x8_45DEGREE_SWITCH:
            case CORE_4x17_PARALLEL_SWITCH:
                break;
            default:
                RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), facing, 0, 0, 0, previewRed, previewGreen, previewBlue, previewAlpha);
                RenderTCRail.modelSmallStraight.renderStraight(item.getTrackType(), divergingFacing, mainDirectionX * divergingMainOffset + divergingDirectionX * divergingSideOffset, 0, mainDirectionZ * divergingMainOffset + divergingDirectionZ * divergingSideOffset, previewRed, previewGreen, previewBlue, previewAlpha);
                break;
        }

        TrackRenderRouteCache.renderPreview(item.getTrackType(), enumCoreTrack.getLeftRightVariant(isLeftTurn), facing, mainDirectionX, 0, mainDirectionZ, previewRed, previewGreen, previewBlue, previewAlpha);
    }

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
                setBallastMaterial(Blocks.gravel.getIcon(1, 0));
                break;
            case BALLAST:
                previewBallastColor = BlockIDs.oreTC.getBlock().colorMultiplier(world, x, y, z);
                setBallastMaterial(BlockIDs.oreTC.getBlock().getIcon(1, 3));
                break;
            case SNOWGRAVEL:
                previewBallastColor = BlockIDs.oreTC.getBlock().colorMultiplier(world, x, y, z);
                setBallastMaterial(BlockIDs.oreTC.getBlock().getIcon(1, 4));
                break;
            case DYNAMIC:
            default:
                break;
        }
    }

    private void setBallastMaterial(IIcon icon)
    {
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
        if (icon != null && icon.getIconName() != null)
        {
            previewBallastTexture = icon.getIconName();
        }
    }
}
