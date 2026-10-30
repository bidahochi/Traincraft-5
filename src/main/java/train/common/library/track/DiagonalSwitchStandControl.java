package train.common.library.track;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;
import train.common.tile.TileTCRail;

import java.util.HashSet;
import java.util.Set;

/** Same-height corner connections between switch stands and the compact 4x3 diagonal switch. */
public final class DiagonalSwitchStandControl
{
    // Track orientation codes 4-7, distinct from the stand's saved orientation numbers.
    private static final int[] STEP_X = {-1, -1, 1, 1};
    private static final int[] STEP_Z = {1, -1, -1, 1};
    private static final int POWERED_METADATA_BIT = 8;

    private DiagonalSwitchStandControl() { }

    /** Only the visible 4x3 switch tile owns this extra connection. */
    private static boolean isSwitchControl(TileTCRail rail)
    {
        if (rail == null || rail.hasModel == false || rail.getFacing() < 4 || rail.getFacing() > 7)
        {
            return false;
        }
        switch (rail.getCoreType())
        {
            case CORE_DIAGONAL_45DEGREE_4X3_SWITCH:
            case CORE_DIAGONAL_45DEGREE_4X3_SWITCH_L:
            case CORE_DIAGONAL_45DEGREE_4X3_SWITCH_R:
                return true;
            default:
                return false;
        }
    }

    /** Checks only the four corners of each of this switch's two control cells. */
    public static boolean hasCornerStandPower(IBlockAccess world, TileTCRail control)
    {
        if (world == null || isSwitchControl(control) == false)
        {
            return false;
        }
        return hasPoweredCorner(world, control) || hasPoweredCorner(world, getRouteCell(world, control));
    }

    private static boolean hasPoweredCorner(IBlockAccess world, TileTCRail rail)
    {
        if (rail == null) return false;
        for (int offsetX = -1; offsetX <= 1; offsetX += 2)
        {
            for (int offsetZ = -1; offsetZ <= 1; offsetZ += 2)
            {
                int x = rail.xCoord + offsetX;
                int z = rail.zCoord + offsetZ;
                if (world.getBlock(x, rail.yCoord, z) instanceof BlockSwitchStand
                        && (world.getBlockMetadata(x, rail.yCoord, z) & POWERED_METADATA_BIT) != 0)
                {
                    return true;
                }
            }
        }
        return false;
    }

    /** Refreshes corner-connected switches after a stand changes power, is placed, or is removed. */
    public static void updateNearbySwitches(World world, int standX, int standY, int standZ)
    {
        if (world == null || world.isRemote) return;
        Set<TileTCRail> updated = new HashSet<TileTCRail>();
        for (int offsetX = -1; offsetX <= 1; offsetX += 2)
        {
            for (int offsetZ = -1; offsetZ <= 1; offsetZ += 2)
            {
                TileEntity tile = world.getTileEntity(standX + offsetX, standY, standZ + offsetZ);
                TileTCRail control = tile instanceof TileTCRail ? findControl(world, (TileTCRail)tile) : null;
                if (control != null && updated.add(control))
                {
                    control.changeSwitchState(world, control, control.xCoord, control.yCoord, control.zCoord);
                }
            }
        }
    }

    private static TileTCRail findControl(IBlockAccess world, TileTCRail rail)
    {
        if (isSwitchControl(rail)) return rail;
        if (rail.hasModel || rail.canTypeBeModifiedBySwitch == false
                || rail.getFacing() < 4 || rail.getFacing() > 7)
        {
            return null;
        }
        int direction = rail.getFacing() - 4;
        TileEntity tile = world.getTileEntity(rail.xCoord - STEP_X[direction], rail.yCoord,
                rail.zCoord - STEP_Z[direction]);
        TileTCRail control = tile instanceof TileTCRail ? (TileTCRail)tile : null;
        return isSwitchControl(control) && sharesSwitch(control, rail) ? control : null;
    }

    private static TileTCRail getRouteCell(IBlockAccess world, TileTCRail control)
    {
        int direction = control.getFacing() - 4;
        TileEntity tile = world.getTileEntity(control.xCoord + STEP_X[direction], control.yCoord,
                control.zCoord + STEP_Z[direction]);
        TileTCRail route = tile instanceof TileTCRail ? (TileTCRail)tile : null;
        return route != null && sharesSwitch(control, route) ? route : null;
    }

    /** The route cell changes its track type when thrown, so identify it by its saved cluster link. */
    private static boolean sharesSwitch(TileTCRail control, TileTCRail route)
    {
        return route.hasModel == false && route.canTypeBeModifiedBySwitch
                && route.getFacing() == control.getFacing()
                && control.isLinkedToRail && route.isLinkedToRail
                && control.linkedX == route.linkedX && control.linkedY == route.linkedY
                && control.linkedZ == route.linkedZ;
    }
}
