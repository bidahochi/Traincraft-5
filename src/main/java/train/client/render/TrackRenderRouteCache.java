package train.client.render;

import train.client.render.embedded.EmbeddedSlopeRenderPolicy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import train.client.render.models.blocks.track.ModelEmbeddedTransitionSlopeTCTrack;
import train.client.render.models.blocks.track.ModelSlopeTCTrack;
import train.common.items.BallastTypes;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.ITrackDefinition;

import java.util.HashMap;
import java.util.Map;

@SideOnly(Side.CLIENT)
public final class TrackRenderRouteCache
{
    private static final Map<String, TrackRenderRoute> ROUTES = new HashMap<>();
    private static final TrackRenderRoute NO_RENDER_ROUTE = context -> { };

    private TrackRenderRouteCache()
    {
    }

    public static TrackRenderRoute get(ITrackDefinition track)
    {
        return get(track, track.getCoreTrack());
    }

    public static TrackRenderRoute getPreview(ITrackDefinition track, EnumCoreTrack effectiveCore)
    {
        return get(track, effectiveCore);
    }

    public static void renderPreview(ITrackDefinition track, EnumCoreTrack effectiveCore, int facing, double x, double y, double z, float r, float g, float b, float a)
    {
        getPreview(track, effectiveCore).render(new TrackRenderContext(null, track, effectiveCore, facing, x, y, z, r, g, b, a));
    }

    public static void clear()
    {
        ROUTES.clear();
    }

    private static TrackRenderRoute get(ITrackDefinition track, EnumCoreTrack effectiveCore)
    {
        String key = track.getLabel() + ":" + effectiveCore.name();
        TrackRenderRoute route = ROUTES.get(key);
        if (route != null)
        {
            return route;
        }

        route = buildRoute(track, effectiveCore);
        ROUTES.put(key, route);
        return route;
    }

    /**
     * Builds the immutable renderer route for one definition and effective core.
     *
     * @param track material and resource definition being rendered
     * @param effectiveCore geometry core selected for this render
     * @return renderer route for the requested combination
     */
    private static TrackRenderRoute buildRoute(ITrackDefinition track, EnumCoreTrack effectiveCore)
    {
        switch (effectiveCore)
        {
            // Straights and road crossings
            case CORE_SMALL_STRAIGHT:
                switch (track.getItem())
                {
                    case tcRailSmallRoadCrossingDynamic:
                        return dynamicRoadCrossingRoute();
                    case tcRailSmallRoadCrossing2:
                        return roadCrossing2Route();
                    case tcRailSmallRoadCrossing1:
                        return roadCrossing1Route();
                    case tcRailSmallRoadCrossing:
                        return roadCrossingRoute();
                    default:
                        return smallStraightRoute();
                }

            case CORE_MEDIUM_STRAIGHT:
            case CORE_LONG_STRAIGHT:
            case CORE_VERY_LONG_STRAIGHT:
                return mediumStraightRoute();

            // Diagonal straights
            case CORE_SMALL_DIAGONAL_STRAIGHT:
                return smallDiagonalStraightRoute();

            case CORE_MEDIUM_DIAGONAL_STRAIGHT:
            case CORE_LONG_DIAGONAL_STRAIGHT:
            case CORE_VERY_LONG_DIAGONAL_STRAIGHT:
                return mediumDiagonalStraightRoute();

            // 90-degree turns
            case CORE_1X_TURN:
            case CORE_1X_TURN_R:
                return right1xTurnRoute();
            case CORE_1X_TURN_L:
                return left1xTurnRoute();
            case CORE_3X_TURN:
            case CORE_3X_TURN_R:
                return right3xTurnRoute();
            case CORE_3X_TURN_L:
                return left3xTurnRoute();
            case CORE_5X_TURN:
            case CORE_5X_TURN_R:
                return right5xTurnRoute();
            case CORE_5X_TURN_L:
                return left5xTurnRoute();
            case CORE_10X_TURN:
            case CORE_10X_TURN_R:
                return right10xTurnRoute();
            case CORE_10X_TURN_L:
                return left10xTurnRoute();
            case CORE_16X_TURN:
            case CORE_16X_TURN_R:
                return right16xTurnRoute();
            case CORE_16X_TURN_L:
                return left16xTurnRoute();
            case CORE_29X_TURN:
            case CORE_29X_TURN_R:
                return right29xTurnRoute();
            case CORE_29X_TURN_L:
                return left29xTurnRoute();
            case CORE_32X_TURN:
            case CORE_32X_TURN_R:
                return right32xTurnRoute();
            case CORE_32X_TURN_L:
                return left32xTurnRoute();

            // Slopes
            case CORE_EMBEDDED_TRANSITION_SLOPE:
                return embeddedTransitionSlopeRoute(RenderTCRail.model1x3EmbeddedTransitionSlope);
            case CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE:
                return embeddedDiagonalTransitionSlopeRoute(RenderTCRail.model1x3DiagonalEmbeddedTransitionSlope);
            case CORE_3_SLOPE:
                return slopeRoute(RenderTCRail.model1X3Slope);
            case CORE_3_DIAGONAL_SLOPE:
                return slopeRoute(RenderTCRail.model1x3DiagonalSlope);
            case CORE_6_SLOPE:
                return slopeRoute(RenderTCRail.model1x6Slope);
            case CORE_6_DIAGONAL_SLOPE:
                return slopeRoute(RenderTCRail.model1x6DiagonalSlope);
            case CORE_12_SLOPE:
                return slopeRoute(RenderTCRail.model1x12Slope);
            case CORE_12_DIAGONAL_SLOPE:
                return slopeRoute(RenderTCRail.model1x12DiagonalSlope);
            case CORE_18_SLOPE:
                return slopeRoute(RenderTCRail.model1x18Slope);
            case CORE_18_DIAGONAL_SLOPE:
                return slopeRoute(RenderTCRail.model1x18DiagonalSlope);
            case CORE_3_HALF_HEIGHT_SLOPE:
                return regularHalfHeightSlopeRoute(RenderTCRail.model1x3HalfHeightSlope);
            case CORE_6_HALF_HEIGHT_SLOPE:
                return regularHalfHeightSlopeRoute(RenderTCRail.model1x6HalfHeightSlope);
            case CORE_9_HALF_HEIGHT_SLOPE:
                return regularHalfHeightSlopeRoute(RenderTCRail.model1x9HalfHeightSlope);
            case CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE:
                return regularHalfHeightSlopeRoute(RenderTCRail.model1x3DiagonalHalfHeightSlope);
            case CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE:
                return regularHalfHeightSlopeRoute(RenderTCRail.model1x6DiagonalHalfHeightSlope);
            case CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE:
                return regularHalfHeightSlopeRoute(RenderTCRail.model1x9DiagonalHalfHeightSlope);

            // Switches
            case CORE_4x11_PARALLEL_SWITCH:
            case CORE_4x11_PARALLEL_SWITCH_R:
                return rightMediumParallelSwitchRoute();
            case CORE_4x11_PARALLEL_SWITCH_L:
                return leftMediumParallelSwitchRoute();
            case CORE_4x17_PARALLEL_SWITCH:
            case CORE_4x17_PARALLEL_SWITCH_R:
                return rightLargeParallelSwitchRoute();
            case CORE_4x17_PARALLEL_SWITCH_L:
                return leftLargeParallelSwitchRoute();
            case CORE_4x4_SWITCH:
            case CORE_4x4_SWITCH_R:
                return rightMediumSwitchRoute();
            case CORE_4x4_SWITCH_L:
                return leftMediumSwitchRoute();
            case CORE_6x6_SWITCH:
            case CORE_6x6_SWITCH_R:
                return rightLarge90SwitchRoute();
            case CORE_6x6_SWITCH_L:
                return leftLarge90SwitchRoute();
            case CORE_11x11_SWITCH:
            case CORE_11x11_SWITCH_R:
                return rightVeryLarge90SwitchRoute();
            case CORE_11x11_SWITCH_L:
                return leftVeryLarge90SwitchRoute();
            case CORE_10x2_CROSSOVER_SWITCH:
            case CORE_10x2_CROSSOVER_SWITCH_R:
                return rightCrossover10x2SwitchRoute();
            case CORE_10x2_CROSSOVER_SWITCH_L:
                return leftCrossover10x2SwitchRoute();
            case CORE_DIAGONAL_45DEGREE_4X3_SWITCH:
            case CORE_DIAGONAL_45DEGREE_4X3_SWITCH_L:
                return rightDiagonal4x3SwitchRoute();
            case CORE_DIAGONAL_45DEGREE_4X3_SWITCH_R:
                return leftDiagonal4x3SwitchRoute();
            case CORE_3x5_45DEGREE_SWITCH:
            case CORE_3x5_45DEGREE_SWITCH_R:
                return rightMedium45SwitchRoute();
            case CORE_3x5_45DEGREE_SWITCH_L:
                return leftMedium45SwitchRoute();
            case CORE_4x8_45DEGREE_SWITCH:
            case CORE_4x8_45DEGREE_SWITCH_R:
                return rightLarge45SwitchRoute();
            case CORE_4x8_45DEGREE_SWITCH_L:
                return leftLarge45SwitchRoute();

            // S-curves
            case CORE_S_CURVE_2x8:
            case CORE_S_CURVE_2x8_R:
                return right2x8SCurveRoute();
            case CORE_S_CURVE_2x8_L:
                return left2x8SCurveRoute();
            case CORE_S_CURVE_3x12:
            case CORE_S_CURVE_3x12_R:
                return right3x12SCurveRoute();
            case CORE_S_CURVE_3x12_L:
                return left3x12SCurveRoute();
            case CORE_S_CURVE_4x16:
            case CORE_S_CURVE_4x16_R:
                return right4x16SCurveRoute();
            case CORE_S_CURVE_4x16_L:
                return left4x16SCurveRoute();
            case CORE_S_CURVE_20x2:
            case CORE_S_CURVE_20x2_R:
                return right20x2SCurveRoute();
            case CORE_S_CURVE_20x2_L:
                return left20x2SCurveRoute();

            // 45-degree turns
            case CORE_3X4_45DEGREE_TURN:
            case CORE_3X4_45DEGREE_TURN_R:
                return right3x4TurnRoute();
            case CORE_3X4_45DEGREE_TURN_L:
                return left3x4TurnRoute();
            case CORE_3X6_45DEGREE_TURN:
            case CORE_3X6_45DEGREE_TURN_R:
                return right3x6TurnRoute();
            case CORE_3X6_45DEGREE_TURN_L:
                return left3x6TurnRoute();
            case CORE_4X8_45DEGREE_TURN:
            case CORE_4X8_45DEGREE_TURN_R:
                return right4x8TurnRoute();
            case CORE_4X8_45DEGREE_TURN_L:
                return left4x8TurnRoute();
            case CORE_5X11_45DEGREE_TURN:
            case CORE_5X11_45DEGREE_TURN_R:
                return right5x11TurnRoute();
            case CORE_5X11_45DEGREE_TURN_L:
                return left5x11TurnRoute();
            case CORE_9X20_45DEGREE_TURN:
            case CORE_9X20_45DEGREE_TURN_R:
                return right9x20TurnRoute();
            case CORE_9X20_45DEGREE_TURN_L:
                return left9x20TurnRoute();
            case CORE_10x22_45DEGREE_TURN:
            case CORE_10x22_45DEGREE_TURN_R:
                return right10x22TurnRoute();
            case CORE_10x22_45DEGREE_TURN_L:
                return left10x22TurnRoute();

            // Crossings and diamonds
            case CORE_TWO_WAYS_CROSSING:
                return twoWaysCrossingRoute();
            case CORE_FOUR_WAYS_CROSSING:
                return fourWaysCrossingRoute();
            case CORE_DOUBLE_DIAMOND_CROSSING:
                return doubleDiamondCrossingRoute();
            case CORE_DIAGONAL_TWO_WAYS_CROSSING:
                return diagonalTwoWaysCrossingRoute();
            case CORE_DIAMOND_CROSSING:
            case CORE_DIAMOND_CROSSING_R:
                return rightDiamondCrossingRoute();
            case CORE_DIAMOND_CROSSING_L:
                return leftDiamondCrossingRoute();
            default:
                return NO_RENDER_ROUTE;
        }
    }

    private static TrackRenderRoute smallStraightRoute()
    {
        return context -> RenderTCRail.modelSmallStraight.renderStraight(context.track, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    private static TrackRenderRoute dynamicRoadCrossingRoute()
    {
        return context ->
        {
            if (context.railTile != null)
            {
                RenderTCRail.modelRoadCrossing.renderDynamic(context.variant, context.railTile, context.facing, context.x, context.y, context.z);
            }
            else
            {
                RenderTCRail.modelSmallStraight.renderCrossing(context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
            }
        };
    }

    private static TrackRenderRoute roadCrossingRoute()
    {
        return context -> RenderTCRail.modelSmallStraight.renderCrossing(context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    private static TrackRenderRoute roadCrossing1Route()
    {
        return context -> RenderTCRail.modelSmallStraight.renderCrossing1(context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    private static TrackRenderRoute roadCrossing2Route()
    {
        return context -> RenderTCRail.modelSmallStraight.renderCrossing2(context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    private static TrackRenderRoute mediumStraightRoute()
    {
        return context -> RenderTCRail.modelMediumStraight.render(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    private static TrackRenderRoute smallDiagonalStraightRoute()
    {
        return context -> RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    private static TrackRenderRoute mediumDiagonalStraightRoute()
    {
        return context -> RenderTCRail.modelMediumDiagonalStraight.render(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    private static TrackRenderRoute slopeRoute(final ModelSlopeTCTrack model)
    {
        return context ->
        {
			if (context.railTile != null && context.railTile.hasBridgeSupport())
			{
				model.render(context.variant, BallastTypes.WOODSUPPORT, context.facing,
						context.x, context.y, context.z, context.r, context.g, context.b, context.a);
				return;
			}
            if (BallastTypes.DYNAMIC.equals(context.track.getBallastType()) && context.railTile != null)
            {
                model.renderDynamic(context.variant, context.railTile, context.facing, context.x, context.y, context.z);
            }
            else
            {
                model.render(context.variant, context.track.getBallastType(), context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
            }
        };
    }

    /**
     * Creates a half-height slope route that pairs the authored rail mesh with generated cardinal or diagonal ballast.
     * Host-mounted tracks receive their generated wedge from the captured-host renderer, replacement tracks retain
     * their trench renderer, and wood-support tracks retain their authored support mesh.
     *
     * @param model half-height slope model supplying the authored rail and optional wood-support meshes
     * @return route selecting generated ballast, embedded trench rendering, or authored wood supports
     */
    private static TrackRenderRoute regularHalfHeightSlopeRoute(final ModelSlopeTCTrack model)
    {
        return context ->
        {
			if (context.railTile != null && context.railTile.isReplaceTargetTrack()
					&& context.railTile.isIntactHostMountedTrack() == false)
			{
				model.renderRailOnly(context.variant, context.facing, context.x, context.y, context.z);
				return;
			}
            if (context.railTile != null
                    && EmbeddedSlopeRenderPolicy.usesGeneratedHalfHeightBallast(context.railTile))
            {
                model.renderRailOnly(context.variant, context.facing, context.x, context.y, context.z);
                return;
            }
            if (BallastTypes.DYNAMIC.equals(context.track.getBallastType()) && context.railTile != null)
            {
                model.renderDynamic(context.variant, context.railTile, context.facing, context.x, context.y, context.z);
            }
            else
            {
                model.render(context.variant, context.track.getBallastType(), context.facing,
                        context.x, context.y, context.z, context.r, context.g, context.b, context.a);
            }
        };
    }

    /**
     * Creates the cardinal embedded-transition render route.
     *
     * @param model transition model rendered by the route
     * @return route that renders the cardinal transition mesh
     */
    private static TrackRenderRoute embeddedTransitionSlopeRoute(final ModelEmbeddedTransitionSlopeTCTrack model)
    {
        return context -> model.render(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    /**
     * Creates the diagonal embedded-transition render route.
     *
     * @param model transition model rendered by the route
     * @return route that renders the diagonal transition mesh
     */
    private static TrackRenderRoute embeddedDiagonalTransitionSlopeRoute(final ModelEmbeddedTransitionSlopeTCTrack model)
    {
        return context -> model.renderDiagonal(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
    }

    private static boolean active(TrackRenderContext context)
    {
        return context.railTile != null && context.railTile.getSwitchState();
    }

    // Switch routes
    private static TrackRenderRoute rightMediumSwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderMedium(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftMediumSwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderMedium(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightLarge90SwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderLarge90(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftLarge90SwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderLarge90(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightVeryLarge90SwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderVeryLarge90(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftVeryLarge90SwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderVeryLarge90(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightMediumParallelSwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderMediumParallel(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftMediumParallelSwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderMediumParallel(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightLargeParallelSwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderLargeParallel(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftLargeParallelSwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderLargeParallel(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightMedium45SwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderMedium45(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftMedium45SwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderMedium45(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightLarge45SwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderLarge45(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftLarge45SwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderLarge45(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightCrossover10x2SwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderCrossover10x2(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftCrossover10x2SwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderCrossover10x2(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightDiagonal4x3SwitchRoute() { return context -> RenderTCRail.modelRightSwitchTurn.renderDiagonal4x3(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftDiagonal4x3SwitchRoute() { return context -> RenderTCRail.modelLeftSwitchTurn.renderDiagonal4x3(context.variant, context.facing, active(context), context.x, context.y, context.z, context.r, context.g, context.b, context.a); }

    // S-curve routes
    private static TrackRenderRoute right2x8SCurveRoute() { return context -> RenderTCRail.modelRightParallelCurve.render2x8(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left2x8SCurveRoute() { return context -> RenderTCRail.modelLeftParallelCurve.render2x8(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right3x12SCurveRoute() { return context -> RenderTCRail.modelRightParallelCurve.render3x12(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left3x12SCurveRoute() { return context -> RenderTCRail.modelLeftParallelCurve.render3x12(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right4x16SCurveRoute() { return context -> RenderTCRail.modelRightParallelCurve.render4x16(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left4x16SCurveRoute() { return context -> RenderTCRail.modelLeftParallelCurve.render4x16(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right20x2SCurveRoute() { return context -> RenderTCRail.modelRightParallelCurve.render20x2(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left20x2SCurveRoute() { return context -> RenderTCRail.modelLeftParallelCurve.render20x2(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }

    // 90-degree turn routes
    private static TrackRenderRoute right1xTurnRoute() { return context -> RenderTCRail.modelRightTurn.render1x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left1xTurnRoute() { return context -> RenderTCRail.modelLeftTurn.render1x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right3xTurnRoute() { return context -> RenderTCRail.modelRightTurn.render3x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left3xTurnRoute() { return context -> RenderTCRail.modelLeftTurn.render3x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right5xTurnRoute() { return context -> RenderTCRail.modelRightTurn.render5x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left5xTurnRoute() { return context -> RenderTCRail.modelLeftTurn.render5x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right10xTurnRoute() { return context -> RenderTCRail.modelRightTurn.render10x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left10xTurnRoute() { return context -> RenderTCRail.modelLeftTurn.render10x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right16xTurnRoute() { return context -> RenderTCRail.modelRightTurn.render16x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left16xTurnRoute() { return context -> RenderTCRail.modelLeftTurn.render16x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right29xTurnRoute() { return context -> RenderTCRail.modelRightTurn.render29x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left29xTurnRoute() { return context -> RenderTCRail.modelLeftTurn.render29x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right32xTurnRoute() { return context -> RenderTCRail.modelRightTurn.render32x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left32xTurnRoute() { return context -> RenderTCRail.modelLeftTurn.render32x(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }

    // 45-degree turn routes
    private static TrackRenderRoute right3x4TurnRoute() { return context -> RenderTCRail.model45DegreeRightTurn.render3x4(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left3x4TurnRoute() { return context -> RenderTCRail.model45DegreeLeftTurn.render3x4(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right3x6TurnRoute() { return context -> RenderTCRail.model45DegreeRightTurn.render3x6(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left3x6TurnRoute() { return context -> RenderTCRail.model45DegreeLeftTurn.render3x6(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right4x8TurnRoute() { return context -> RenderTCRail.model45DegreeRightTurn.render4x8(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left4x8TurnRoute() { return context -> RenderTCRail.model45DegreeLeftTurn.render4x8(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right5x11TurnRoute() { return context -> RenderTCRail.model45DegreeRightTurn.render5x11(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left5x11TurnRoute() { return context -> RenderTCRail.model45DegreeLeftTurn.render5x11(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right9x20TurnRoute() { return context -> RenderTCRail.model45DegreeRightTurn.render9x20(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left9x20TurnRoute() { return context -> RenderTCRail.model45DegreeLeftTurn.render9x20(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute right10x22TurnRoute() { return context -> RenderTCRail.model45DegreeRightTurn.render10x22(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute left10x22TurnRoute() { return context -> RenderTCRail.model45DegreeLeftTurn.render10x22(context.variant, context.facing, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }

    // Crossing and diamond routes
    private static boolean diagonal(int facing)
    {
        return facing == 4 || facing == 5 || facing == 6 || facing == 7;
    }

    private static TrackRenderRoute twoWaysCrossingRoute()
    {
        return context ->
        {
            if (diagonal(context.facing))
            {
                RenderTCRail.modelTwoWaysCrossing.renderDiagonalTwoWays(context.facing, context.variant, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
            }
            else
            {
                RenderTCRail.modelTwoWaysCrossing.renderTwoWays(context.facing, context.variant, context.x, context.y, context.z, context.r, context.g, context.b, context.a);
            }
        };
    }

    private static TrackRenderRoute fourWaysCrossingRoute() { return context -> RenderTCRail.modelTwoWaysCrossing.renderFourWays(context.facing, context.variant, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute doubleDiamondCrossingRoute() { return context -> RenderTCRail.modelTwoWaysCrossing.renderDoubleDiamond(context.facing, context.variant, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute diagonalTwoWaysCrossingRoute() { return context -> RenderTCRail.modelTwoWaysCrossing.renderDiagonalTwoWays(context.facing, context.variant, context.x, context.y, context.z, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute rightDiamondCrossingRoute() { return context -> RenderTCRail.modelRightDiamondCrossing.render(context.variant, context.x, context.y, context.z, context.facing, context.r, context.g, context.b, context.a); }
    private static TrackRenderRoute leftDiamondCrossingRoute() { return context -> RenderTCRail.modelLeftDiamondCrossing.render(context.variant, context.x, context.y, context.z, context.facing, context.r, context.g, context.b, context.a); }
}
