package train.common.tile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.blocks.BlockSwitchStand;
import train.common.library.track.TrackHostConstants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Stores the shared orientation and optional captured-host state for switch stands. */
public abstract class TileSwitchStand extends TileLockable
{
    private static final double LOWERED_MOUNT_RENDER_OFFSET = -0.5D;
    private static final String EMBEDDED_HOST_TYPE_TAG = "EmbeddedHostType";
    private static final String EMBEDDED_HOST_BLOCK_TAG = "EmbeddedHostBlock";
    private static final String EMBEDDED_HOST_METADATA_TAG = "EmbeddedHostMetadata";
    private static final String EMBEDDED_HOST_SHAPES_TAG = "EmbeddedHostShapes";
    private static final String MIN_X_TAG = "MinX";
    private static final String MIN_Y_TAG = "MinY";
    private static final String MIN_Z_TAG = "MinZ";
    private static final String MAX_X_TAG = "MaxX";
    private static final String MAX_Y_TAG = "MaxY";
    private static final String MAX_Z_TAG = "MaxZ";
    private static boolean restoringEmbeddedHost;
    private ForgeDirection facing;
    private EmbeddedHostType embeddedHostType;
    private Block embeddedHostBlock;
    private int embeddedHostMetadata;
    private final List<AxisAlignedBB> embeddedHostShapes = new ArrayList<AxisAlignedBB>();
    private final List<AxisAlignedBB> readOnlyEmbeddedHostShapes =
            Collections.unmodifiableList(embeddedHostShapes);

    /** Supported host shapes that an embedded switch stand may replace. */
    public enum EmbeddedHostType
    {
        SLAB(TrackHostConstants.HALF_BLOCK_HEIGHT),
        STAIR(TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT);

        private final double surfaceHeight;

        private EmbeddedHostType(double surfaceHeight)
        {
            this.surfaceHeight = surfaceHeight;
        }

        /** Returns the stand base height above the replaced host cell. */
        public double getSurfaceHeight()
        {
            return surfaceHeight;
        }
    }

    /**
     * Returns the vertical model offset derived from the stand's current support surface.
     *
     * @return the true-embedded track height above the captured host cell, negative one-half block over lowered
     *         support, or zero over an ordinary full-height support
     */
    public double getMountRenderOffset()
    {
        if (embeddedHostType != null)
        {
			return embeddedHostType.getSurfaceHeight() - TrackHostConstants.EMBEDDED_TRACK_MODEL_INSET;
        }
        return worldObj != null && BlockSwitchStand.isLoweredMountSupport(
                worldObj, xCoord, yCoord - 1, zCoord) ? LOWERED_MOUNT_RENDER_OFFSET : 0.0D;
    }

    /**
     * Records the block replaced by an embedded switch-stand placement.
     *
     * @param hostType captured slab or stair classification
     * @param hostBlock captured Minecraft block
     * @param hostMetadata captured block metadata
     * @param collisionShapes captured local collision components
     */
    public void setEmbeddedHost(EmbeddedHostType hostType, Block hostBlock,
            int hostMetadata, List<AxisAlignedBB> collisionShapes)
    {
        embeddedHostType = hostType;
        embeddedHostBlock = hostBlock;
        embeddedHostMetadata = hostMetadata;
        embeddedHostShapes.clear();
        if (collisionShapes != null)
        {
            for (AxisAlignedBB shape : collisionShapes)
            {
                embeddedHostShapes.add(AxisAlignedBB.getBoundingBox(
                        shape.minX, shape.minY, shape.minZ,
                        shape.maxX, shape.maxY, shape.maxZ));
            }
        }
        markDirty();
    }

    /**
     * Returns whether this stand replaced and owns a captured host block.
     *
     * @return whether captured embedded-host state is present
     */
    public boolean isEmbedded()
    {
        return embeddedHostType != null && embeddedHostBlock != null;
    }

    /**
     * Returns the captured block reproduced beneath the stand.
     *
     * @return captured host block, or {@code null} for an ordinary stand
     */
    public Block getEmbeddedHostBlock()
    {
        return embeddedHostBlock;
    }

    /**
     * Returns the captured block metadata reproduced beneath the stand.
     *
     * @return captured block metadata
     */
    public int getEmbeddedHostMetadata()
    {
        return embeddedHostMetadata;
    }

    /**
     * Returns a read-only view of the captured host's local collision components.
     *
     * @return immutable collision-shape view
     */
    public List<AxisAlignedBB> getEmbeddedHostShapes()
    {
        return readOnlyEmbeddedHostShapes;
    }

    /**
     * Restores the captured host after the embedded stand has been removed.
     *
     * @param world server world receiving the captured block
     */
    public void restoreEmbeddedHost(World world)
    {
        if (world == null || world.isRemote || isEmbedded() == false || restoringEmbeddedHost)
        {
            return;
        }
        Block restoredBlock = embeddedHostBlock;
        int restoredMetadata = embeddedHostMetadata;
        restoringEmbeddedHost = true;
        try
        {
            if (world.setBlock(xCoord, yCoord, zCoord, restoredBlock, restoredMetadata,
                    TrackHostConstants.NOTIFY_NEIGHBORS_AND_CLIENTS))
            {
                clearEmbeddedHost();
            }
        }
        finally
        {
            restoringEmbeddedHost = false;
        }
    }

    /**
     * Reports whether an embedded-host restoration callback is currently active.
     *
     * @return whether restoration is replacing a stand block with its captured host
     */
    public static boolean isRestoringEmbeddedHost()
    {
        return restoringEmbeddedHost;
    }

    private void clearEmbeddedHost()
    {
        embeddedHostType = null;
        embeddedHostBlock = null;
        embeddedHostMetadata = 0;
        embeddedHostShapes.clear();
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTag)
    {
        super.readFromNBT(nbtTag);
        facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
        clearEmbeddedHost();
        if (nbtTag.hasKey(EMBEDDED_HOST_TYPE_TAG) && nbtTag.hasKey(EMBEDDED_HOST_BLOCK_TAG))
        {
            try
            {
                embeddedHostType = EmbeddedHostType.valueOf(nbtTag.getString(EMBEDDED_HOST_TYPE_TAG));
            }
            catch (IllegalArgumentException ignored)
            {
                embeddedHostType = null;
            }
            embeddedHostBlock = Block.getBlockById(nbtTag.getInteger(EMBEDDED_HOST_BLOCK_TAG));
            embeddedHostMetadata = nbtTag.getInteger(EMBEDDED_HOST_METADATA_TAG);
            NBTTagList shapeTags = nbtTag.getTagList(EMBEDDED_HOST_SHAPES_TAG, Constants.NBT.TAG_COMPOUND);
            for (int index = 0; index < shapeTags.tagCount(); index++)
            {
                NBTTagCompound shapeTag = shapeTags.getCompoundTagAt(index);
                embeddedHostShapes.add(AxisAlignedBB.getBoundingBox(
                        shapeTag.getDouble(MIN_X_TAG), shapeTag.getDouble(MIN_Y_TAG),
                        shapeTag.getDouble(MIN_Z_TAG), shapeTag.getDouble(MAX_X_TAG),
                        shapeTag.getDouble(MAX_Y_TAG), shapeTag.getDouble(MAX_Z_TAG)));
            }
            if (embeddedHostType == null || embeddedHostBlock == null)
            {
                clearEmbeddedHost();
            }
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTag)
    {
        super.writeToNBT(nbtTag);
        if (facing != null)
        {
            nbtTag.setByte("Orientation", (byte) facing.ordinal());
        }
        else
        {
            nbtTag.setByte("Orientation", (byte) ForgeDirection.NORTH.ordinal());
        }
        if (isEmbedded())
        {
            nbtTag.setString(EMBEDDED_HOST_TYPE_TAG, embeddedHostType.name());
            nbtTag.setInteger(EMBEDDED_HOST_BLOCK_TAG, Block.getIdFromBlock(embeddedHostBlock));
            nbtTag.setInteger(EMBEDDED_HOST_METADATA_TAG, embeddedHostMetadata);
            NBTTagList shapeTags = new NBTTagList();
            for (AxisAlignedBB shape : embeddedHostShapes)
            {
                NBTTagCompound shapeTag = new NBTTagCompound();
                shapeTag.setDouble(MIN_X_TAG, shape.minX);
                shapeTag.setDouble(MIN_Y_TAG, shape.minY);
                shapeTag.setDouble(MIN_Z_TAG, shape.minZ);
                shapeTag.setDouble(MAX_X_TAG, shape.maxX);
                shapeTag.setDouble(MAX_Y_TAG, shape.maxY);
                shapeTag.setDouble(MAX_Z_TAG, shape.maxZ);
                shapeTags.appendTag(shapeTag);
            }
            nbtTag.setTag(EMBEDDED_HOST_SHAPES_TAG, shapeTags);
        }
    }

    /** Returns the stored cardinal facing, or {@link ForgeDirection#UNKNOWN} when none has been assigned. */
    public ForgeDirection getFacing()
    {
        if (facing != null)
        {
            return facing;
        }
        return ForgeDirection.UNKNOWN;
    }

    /** Updates the direction used to orient this stand's rendered model. */
    public void setFacing(ForgeDirection face)
    {
        if (facing != face)
        {
            this.facing = face;
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 2, yCoord + 3, zCoord + 2);
    }

}
