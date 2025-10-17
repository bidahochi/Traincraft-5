package train.client.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;
import train.client.render.RenderTCRail;
import train.common.enums.TCTrackDirection;
import train.common.items.ItemTCRail;
import train.common.items.RailVariants;
import train.common.items.TCRailTypes;
import train.common.library.EnumTracks;


public class CustomRenderHandler
{
    String ballastMaterial;
    int blockColour;

    @SubscribeEvent
    public void onRenderWorldLast(RenderWorldLastEvent event )
    {
        EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
        if ( player != null && player.getHeldItem() != null && ( player.getHeldItem().getItem() instanceof ItemTCRail) )
        {
            renderTCRailPreview(player, player.getHeldItem() );
        }
    }

    private void renderTCRailPreview(EntityClientPlayerMP player, ItemStack stack)
    {
        World world = Minecraft.getMinecraft().theWorld;
        if (world == null || Minecraft.getMinecraft().objectMouseOver == null)
        {
            return;
        }
        int x = Minecraft.getMinecraft().objectMouseOver.blockX;
        int y = Minecraft.getMinecraft().objectMouseOver.blockY;
        int z = Minecraft.getMinecraft().objectMouseOver.blockZ;

        if (world.getBlock(x, y, z) == Blocks.air)
        {
            return;
        }

        ItemTCRail item = (ItemTCRail) player.getHeldItem().getItem();

        // Check if item can be placed and select color
        boolean validPlacement = item.tryToPlaceTrack(player.getHeldItem(), player, world, x, y, z, false);
        float r = 1;
        float g = 0;
        float b = 0;
        float a = 0.5f;
        if (validPlacement)
        {
            r = 0;
            g = 1;
        }

        y = item.getPlacementHeight(world, x, y, z);
        double px = TileEntityRendererDispatcher.staticPlayerX;
        double py = TileEntityRendererDispatcher.staticPlayerY;
        double pz = TileEntityRendererDispatcher.staticPlayerZ;
        int facing = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        Vector2f dir = ItemTCRail.getDirectionVector(facing);

        // Render
        GL11.glPushMatrix();
        GL11.glTranslated(x - px, y + 1 - py, z - pz);
        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glEnable(GL11.GL_BLEND);

        // Crossing
        if (item.getTrackType() == EnumTracks.SMALL_ROAD_CROSSING)
        {
            RenderTCRail.modelSmallStraight.render("crossing", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == EnumTracks.SMALL_ROAD_CROSSING_1)
        {
            RenderTCRail.modelSmallStraight.render("crossing1", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == EnumTracks.SMALL_ROAD_CROSSING_2)
        {
            RenderTCRail.modelSmallStraight.render("crossing2", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        // Straights
        else if (TCRailTypes.RailTypes.STRAIGHT.equals(item.getTrackType().getRailType()))
        {
            facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
            dir = ItemTCRail.getDirectionVector(facing);

            int length = 1;
            if (item.getTrackType() == EnumTracks.MEDIUM_STRAIGHT || item.getTrackType() == EnumTracks.EMBEDDED_MEDIUM_STRAIGHT)
                length = 3;
            if (item.getTrackType() == EnumTracks.LONG_STRAIGHT || item.getTrackType() == EnumTracks.EMBEDDED_LONG_STRAIGHT)
                length = 6;
            else if (item.getTrackType() == EnumTracks.VERY_LONG_STRAIGHT || item.getTrackType() == EnumTracks.EMBEDDED_VERY_LONG_STRAIGHT)
                length = 12;

            if (facing == 6 || facing == 4 || facing == 7 || facing == 5)
            {
                float dx = 0;
                float dz = 0;
                for (int i = 0; i < length; i++) {
                    if (facing == 6) {
                        dx = i;
                        dz = -1 * i;
                    }

                    if (facing == 4) {
                        dx = -1 * i;
                        dz = i;
                    }

                    if (facing == 7) {
                        dx = i;
                        dz = i;
                    }

                    if (facing == 5) {
                        dx = -1 * i;
                        dz = -1 * i;
                    }

                    RenderTCRail.modelSmallDiagonalStraight.render("", item.getTrackType().getVariant(), facing, dx, 0, dz, r, g, b, a);
                }
            }
            else
            {
                for (int i = 0; i < length; i++)
                {
                    float dx = dir.getX() * i;
                    float dz = dir.getY() * i;
                    if (item.getTrackType().getLabel().contains("EMBEDDED"))
                    {
                        RenderTCRail.modelSmallStraight.render("embedded", facing, dx, 0, dz, r, g, b, a);
                    }
                    else
                    {
                        RenderTCRail.modelSmallStraight.render("straight", facing, dx, 0, dz, r, g, b, a);
                    }
                }
            }
        }
        else if (item.getTrackType() == EnumTracks.DOUBLE_DIAMOND_CROSSING || item.getTrackType() == EnumTracks.EMBEDDED_DOUBLE_DIAMOND_CROSSING) {
            float dx = dir.getX();
            float dz = dir.getY();

            RenderTCRail.modelTwoWaysCrossing.render("diamond", facing, item.getTrackType().getVariant(), dx, 0, dz,  r, g, b, a);
        }
        else if (item.getTrackType() == EnumTracks.FOUR_WAYS_CROSSING || item.getTrackType() == EnumTracks.EMBEDDED_FOUR_WAYS_CROSSING) {
            RenderTCRail.modelTwoWaysCrossing.render("universal_crossing", facing, item.getTrackType().getVariant(), 0, 0, 0,  r, g, b, a);
        }
        else if (item.getTrackType() == EnumTracks.DIAMOND_CROSSING || item.getTrackType() == EnumTracks.EMBEDDED_DIAMOND_CROSSING)
        {
            float dx = dir.getX();
            float dz = dir.getY();

            if (item.getTrackOrientation(facing, MathHelper.wrapAngleTo180_float(player.rotationYaw)).equals("left")) {
                RenderTCRail.modelLeftDiamondCrossing.render(item.getTrackType().getVariant(), dx, 0, dz, facing, r, g, b, a);
            } else {
                RenderTCRail.modelRightDiamondCrossing.render(item.getTrackType().getVariant(), dx, 0, dz, facing, r, g, b, a);
            }
        }
        else if (item.getTrackType() == EnumTracks.TWO_WAYS_CROSSING || item.getTrackType() == EnumTracks.EMBEDDED_TWO_WAYS_CROSSING)
        {
            facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
            if (facing == 6 || facing == 4 || facing == 7 || facing == 5)
            {
                RenderTCRail.modelTwoWaysCrossing.render( "diagonal_crossing", facing,item.getTrackType().getVariant(), 0, 0, 0,  r, g, b, a);
            }
            else
            {
                float dx = dir.getX();
                float dz = dir.getY();


                RenderTCRail.modelTwoWaysCrossing.render("twoways_crossing", 0, item.getTrackType().getVariant(), dx, 0, dz, r, g, b, 0.5f);

                if (item.getTrackType().getVariant().equals(RailVariants.EMBEDDED))
                {
                    RenderTCRail.modelSmallStraight.render("embedded", 0, dx, 0, dz + 1, r, g, b, a);
                    RenderTCRail.modelSmallStraight.render("embedded", 1, dx + 1, 0, dz, r, g, b, a);
                    RenderTCRail.modelSmallStraight.render("embedded", 2, dx, 0, dz - 1, r, g, b, a);
                    RenderTCRail.modelSmallStraight.render("embedded", 3, dx - 1, 0, dz, r, g, b, a);
                }
                else
                {
                    RenderTCRail.modelSmallStraight.render("straight", 0, dx, 0, dz + 1, r, g, b, a);
                    RenderTCRail.modelSmallStraight.render("straight", 1, dx + 1, 0, dz, r, g, b, a);
                    RenderTCRail.modelSmallStraight.render("straight", 2, dx, 0, dz - 1, r, g, b, a);
                    RenderTCRail.modelSmallStraight.render("straight", 3, dx - 1, 0, dz, r, g, b, a);
                }
            }
        }
        // Slopes
        else if (item.getTrackType().getLabel().contains("VERY_LARGE_SLOPE_DYNAMIC"))
        {
            blockInfo();
            RenderTCRail.modelVeryLargeSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType().getLabel().contains("VERY_LARGE_SLOPE"))
        {
            RenderTCRail.modelVeryLargeSlope.render(item.getTrackType().getVariant(), item.getTrackType().getBallastType(), facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType().getLabel().contains("LARGE_SLOPE_DYNAMIC"))
        {
            blockInfo();
            RenderTCRail.modelLargeSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType().getLabel().contains("LARGE_SLOPE"))
        {
            RenderTCRail.modelLargeSlope.render(item.getTrackType().getVariant(), item.getTrackType().getBallastType(), facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if  (item.getTrackType().getLabel().contains("SLOPE_1X3_DYNAMIC")) {

            facing = TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double((player.rotationYaw * 8.0F / 360.0F + 0.5D)) & 7);
            blockInfo();
            if (facing == 4 || facing == 5 || facing == 6 || facing == 7) {
                RenderTCRail.model1x3DiagonalSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, 0.5f, ballastMaterial, blockColour);
            }
            else {
                RenderTCRail.model1X3Slope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, 0.5f, ballastMaterial, blockColour);
            }
        }
        else if (item.getTrackType().getLabel().contains("SLOPE_1X6_DIAG")) {
            blockInfo();
            RenderTCRail.model1x6DiagonalSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, 0.5f, ballastMaterial, blockColour);
        }
        else if (item.getTrackType().getLabel().contains("SLOPE_1X12_DIAG")) {
            blockInfo();
            RenderTCRail.model1x12DiagonalSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, 0.5f, ballastMaterial, blockColour);
        }
        else if (item.getTrackType().getLabel().contains("SLOPE_1X18_DIAG")) {
            blockInfo();
            RenderTCRail.model1x18DiagonalSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, 0.5f, ballastMaterial, blockColour);
        }
        else if (item.getTrackType().getLabel().contains("SLOPE_DYNAMIC"))
        {
            blockInfo();
            RenderTCRail.modelSlope.renderDynamic(item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType().getLabel().contains("SLOPE"))
        {
            RenderTCRail.modelSlope.render(item.getTrackType().getVariant(), item.getTrackType().getBallastType(), facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType().getRailType() == TCRailTypes.RailTypes.PARALLEL)
        {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation(facing, yaw).equals("left");

            String parallelCurve = "small";

            switch (item.getTrackType())
            {
                case MEDIUM_PARALLEL_CURVE:
                case EMBEDDED_MEDIUM_PARALLEL_CURVE:
                    parallelCurve = "medium";
                    break;
                case LARGE_PARALLEL_CURVE:
                case EMBEDDED_LARGE_PARALLEL_CURVE:
                    parallelCurve = "large";
                    break;
                case S_CURVE_20x2:
                case EMBEDDED_S_CURVE_20x2:
                    parallelCurve = "20x2";
                    break;
            }

            if (isLeftTurn)
            {
                RenderTCRail.modelLeftParallelCurve.render(parallelCurve, item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a);
            }
            else
            {
                RenderTCRail.modelRightParallelCurve.render(parallelCurve, item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a);
            }
        }
        else if (item.getTrackType().getRailType() == TCRailTypes.RailTypes.DIAGONALTURN) // 45 Degree Turns
        {
            String turnSize = "medium";
            if (item.getTrackType() == EnumTracks.LARGE_45DEGREE_TURN || item.getTrackType() == EnumTracks.EMBEDDED_LARGE_45DEGREE_TURN) {
                turnSize = "large";
            }

            if (item.getTrackType() == EnumTracks.VERY_LARGE_45DEGREE_TURN || item.getTrackType() == EnumTracks.EMBEDDED_VERY_LARGE_45DEGREE_TURN) {
                turnSize = "verylarge";
            }

            if (item.getTrackType() == EnumTracks.SUPER_LARGE_45DEGREE_TURN || item.getTrackType() == EnumTracks.EMBEDDED_SUPER_LARGE_45DEGREE_TURN) {
                turnSize = "superlarge";
            }

            if (item.getTrackType() == EnumTracks.DIAGONAL_TURN_9X20 || item.getTrackType() == EnumTracks.EMBEDDED_DIAGONAL_TURN_9X20) {
                turnSize = "9x20";
            }

            if (item.getTrackType() == EnumTracks.DIAGONAL_TURN_10X22 || item.getTrackType() == EnumTracks.EMBEDDED_DIAGONAL_TURN_10X22) {
                turnSize = "10x22";
            }

            if (item.getTrackOrientation(facing, MathHelper.wrapAngleTo180_float(player.rotationYaw)).equals("left")) {
                RenderTCRail.model45DegreeLeftTurn.render(turnSize, item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a);
            } else {
                RenderTCRail.model45DegreeRightTurn.render(turnSize, item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a);
            }
        }

        // Turns
        else if (item.getTrackType() == EnumTracks.MEDIUM_TURN || item.getTrackType() == EnumTracks.LARGE_TURN
                || item.getTrackType() == EnumTracks.VERY_LARGE_TURN || item.getTrackType() == EnumTracks.SUPER_LARGE_TURN
                || item.getTrackType() == EnumTracks.TURN_1X1 || item.getTrackType() == EnumTracks.EMBEDDED_TURN_1X1
                || item.getTrackType() == EnumTracks.TURN_29X29 || item.getTrackType() == EnumTracks.TURN_32X32
                || item.getTrackType() == EnumTracks.EMBEDDED_MEDIUM_TURN || item.getTrackType() == EnumTracks.EMBEDDED_LARGE_TURN
                || item.getTrackType() == EnumTracks.EMBEDDED_VERY_LARGE_TURN || item.getTrackType() == EnumTracks.EMBEDDED_SUPER_LARGE_TURN
                || item.getTrackType() == EnumTracks.EMBEDDED_TURN_29X29 || item.getTrackType() == EnumTracks.EMBEDDED_TURN_32X32)
        {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation(facing, yaw).equals("left");

            String turnSize = "medium";
            switch (item.getTrackType())
            {
                case TURN_1X1:
                case EMBEDDED_TURN_1X1:
                    turnSize = "1x";
                    break;
                case LARGE_TURN:
                case EMBEDDED_LARGE_TURN:
                    turnSize = "large";
                    break;
                case VERY_LARGE_TURN:
                case EMBEDDED_VERY_LARGE_TURN:
                    turnSize = "very_large";
                    break;
                case SUPER_LARGE_TURN:
                case EMBEDDED_SUPER_LARGE_TURN:
                    turnSize = "super_large";
                    break;
                case TURN_29X29:
                case EMBEDDED_TURN_29X29:
                    turnSize = "29x";
                    break;
                case TURN_32X32:
                case EMBEDDED_TURN_32X32:
                    turnSize = "32x";
                    break;
            }

            if (isLeftTurn)
            {
                RenderTCRail.modelLeftTurn.render(turnSize, item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a);
            }
            else
            {
                RenderTCRail.modelRightTurn.render(turnSize, item.getTrackType().getVariant(), facing, 0, 0, 0, r, g, b, a);
            }
        }

        // switchs
        else if (TCRailTypes.RailTypes.SWITCH.equals(item.getTrackType().getRailType()))
        {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation(facing, yaw).equals("left");

            float dx = dir.getX();
            float dz = dir.getY();
            int out_0_start = 3;
            int out_0_end = 3;
            int facing_1 = isLeftTurn ? (facing + 4 - 1) % 4 : (facing + 1) % 4;
            int out_1_0 = 3;
            int out_1_1 = 3;

            String switchType = "medium";
            if (item.getTrackType() == EnumTracks.MEDIUM_PARALLEL_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_MEDIUM_PARALLEL_SWITCH) {
                switchType = "medium_parallel";
                out_0_start = 5;
                out_0_end = 10;
                out_1_0 = 10;
                out_1_1 = 3;
            }
            else if (item.getTrackType() == EnumTracks.LARGE_PARALLEL_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_LARGE_PARALLEL_SWITCH)
            {
                switchType = "large_parallel";
                out_0_start = 0;
                out_0_end = 0;
                out_1_0 = 0;
            }
            else if (item.getTrackType() == EnumTracks.LARGE_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_LARGE_SWITCH)
            {
                switchType = "large_90";
                out_0_start = 5;
                out_0_end = 5;
                out_1_0 = 5;
                out_1_1 = 5;
            }
            else if (item.getTrackType() == EnumTracks.VERY_LARGE_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_VERY_LARGE_SWITCH)
            {
                switchType = "very_large_90";
                out_0_start = 0;
                out_0_end = 0;
                out_1_0 = 10;
                out_1_1 = 10;
            }
            else if (item.getTrackType() == EnumTracks.MEDIUM_45DEGREE_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_MEDIUM_45DEGREE_SWITCH) {
                switchType = "medium_45degree";
                out_0_start = 0;
                out_0_end = 0;
                out_1_0 = 0;
                out_1_1 = 0;
            }
            else if (item.getTrackType() == EnumTracks.LARGE_45DEGREE_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_LARGE_45DEGREE_SWITCH) {
                switchType = "large_45degree";
                out_0_start = 0;
                out_0_end = 0;
                out_1_0 = 0;
                out_1_1 = 0;
            }

            Vector2f dir_1 = ItemTCRail.getDirectionVector(facing_1);
            String variant = item.getTrackType().getVariant().equals(RailVariants.EMBEDDED) ? "embedded" : "straight";

            float dx_1 = dir_1.getX();
            float dz_1 = dir_1.getY();

            // Render straight tracks
            for (int out_0 = out_0_start; out_0 < out_0_end + 1; out_0++) {
                RenderTCRail.modelSmallStraight.render(variant, facing, dx * out_0, 0, dz * out_0, r, g, b, a);
            }

            if (item.getTrackType() == EnumTracks.MEDIUM_PARALLEL_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_MEDIUM_PARALLEL_SWITCH)
            {
                RenderTCRail.modelSmallStraight.render(variant, facing, 0, 0, 0, r, g, b, a);
                RenderTCRail.modelSmallStraight.render(variant, facing, dx * out_1_0 + dx_1 * out_1_1, 0, dz * out_1_0 + dz_1 * out_1_1, r, g, b, a);
            }
            else if (!(item.getTrackType() == EnumTracks.MEDIUM_45DEGREE_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_MEDIUM_45DEGREE_SWITCH || item.getTrackType() == EnumTracks.LARGE_45DEGREE_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_LARGE_45DEGREE_SWITCH || item.getTrackType() == EnumTracks.LARGE_PARALLEL_SWITCH || item.getTrackType() == EnumTracks.EMBEDDED_LARGE_PARALLEL_SWITCH))
            {
                RenderTCRail.modelSmallStraight.render(variant, facing, 0, 0, 0, r, g, b, a);
                RenderTCRail.modelSmallStraight.render(variant, facing_1, dx * out_1_0 + dx_1 * out_1_1, 0, dz * out_1_0 + dz_1 * out_1_1, r, g, b, a);
            }

            else{

            }
            // Render switch
            if (isLeftTurn) {
                RenderTCRail.modelLeftSwitchTurn.render(switchType, item.getTrackType().getVariant(), facing, false, dx, 0, dz, r, g, b, a);
            } else {
                RenderTCRail.modelRightSwitchTurn.render(switchType, item.getTrackType().getVariant(), facing, false, dx, 0, dz, r, g, b, a);
            }
        }


            GL11.glPopMatrix();
    }

    private void blockInfo()
    {
        World world = Minecraft.getMinecraft().theWorld;
        int x = Minecraft.getMinecraft().objectMouseOver.blockX;
        int y = Minecraft.getMinecraft().objectMouseOver.blockY;
        int z = Minecraft.getMinecraft().objectMouseOver.blockZ;
        Block block = world.getBlock(x, y, z);
        int metadata = world.getBlockMetadata(x, y, z);

        blockColour = block.colorMultiplier(world, x, y, z);
        IIcon icon = block.getIcon(1, metadata);
        if (icon != null && icon.getIconName() != null) {
            ballastMaterial = icon.getIconName();
        }
    }
}
