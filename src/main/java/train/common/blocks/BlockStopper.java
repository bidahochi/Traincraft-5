/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.tile.tileStopper.TileGenericStopper;
import train.common.track.attachment.ITrackAttachmentSource;
import train.common.track.attachment.TrackAttachmentBounds;
import train.common.track.attachment.legacy.TrackBufferOrientation;

import java.util.ArrayList;

import static net.minecraftforge.common.util.ForgeDirection.UP;

/** Wooden buffer stop that can exist as a standalone block or as hardware attached to a track cell. */
public class BlockStopper extends BlockContainer implements ITrackAttachmentSource
{
	private static final int CUSTOM_RENDER_TYPE = -1;

	/** Stable attachment design inherited by every generic buffer block. */
	public static final String ATTACHMENT_DESIGN_ID = "tc:generic_buffer";
	/** Stable attachment identity used by the original wooden buffer item. */
	public static final String ATTACHMENT_TYPE_ID = "tc:wooden_buffer";
	private static final TrackAttachmentBounds ATTACHMENT_BOUNDS =
			new TrackAttachmentBounds(-0.5D, 0.0D, -0.5D, 0.5D, 0.9375D, 0.5D);

	private IIcon texture;

	/** Creates the standalone wooden buffer block and exposes it in Traincraft's creative tab. */
	public BlockStopper()
	{
		super(Material.iron);
		setCreativeTab(Traincraft.tcTab);
	}

	/** {@inheritDoc} */
	@Override
	public String getTrackAttachmentTypeId()
	{
		return ATTACHMENT_TYPE_ID;
	}

	/** {@inheritDoc} */
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	/** {@inheritDoc} */
	@Override
	public int getRenderType()
	{
		return CUSTOM_RENDER_TYPE;
	}

	/** {@inheritDoc} */
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		return texture;
	}

	/** {@inheritDoc} */
	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
	{
		return world.isSideSolid(x, y - 1, z, UP);
	}

	/** {@inheritDoc} */
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase placer, ItemStack stack)
	{
		TileGenericStopper tile = (TileGenericStopper)world.getTileEntity(x, y, z);
		if (tile != null)
		{
			tile.setFacing(TrackBufferOrientation.fromPlayerYaw(placer.rotationYaw));
		}
	}

	/** {@inheritDoc} */
	@Override
	public TileEntity createNewTileEntity(World world, int metadata)
	{
		return new TileGenericStopper(metadata);
	}

	/** {@inheritDoc} */
	@Override
	public String getTrackAttachmentDesignId()
	{
		return ATTACHMENT_DESIGN_ID;
	}

	/** {@inheritDoc} */
	@Override
	public TrackAttachmentBounds getTrackAttachmentBounds()
	{
		return ATTACHMENT_BOUNDS;
	}

	/** Returns the fixed components represented by a deprecated generic combined-buffer block. */
	protected ArrayList<ItemStack> getDeprecatedDrops(Item originalTrack)
	{
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(originalTrack));
		drops.add(new ItemStack(BlockIDs.stopper.block));
		return drops;
	}

	/** {@inheritDoc} */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":stopper");
	}
}
