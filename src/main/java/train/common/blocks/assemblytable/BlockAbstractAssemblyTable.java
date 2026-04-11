package train.common.blocks.assemblytable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.tile.TileCrafterTierAbstract;
import train.common.tile.TileHelper;

import java.util.Random;

public abstract class BlockAbstractAssemblyTable extends BlockContainer
{
    protected IIcon textureTop;
    protected IIcon textureBottom;
    protected IIcon textureFront;
    protected IIcon textureSide;

    protected BlockAbstractAssemblyTable(Material material)
    {
        super(material);
    }

    @Override
    public final int damageDropped(int i) {
        return i;
    }

    @Override
    public final int quantityDropped(int meta, int fortune, Random random) {
        return 1;
    }

    @Override
    public final void onBlockAdded(World world, int i, int j, int k) {
        super.onBlockAdded(world, i, j, k);
        world.markBlockForUpdate(i, j, k);
    }

    @Override
    public final IIcon getIcon(IBlockAccess worldAccess, int i, int j, int k, int side) {
        if (((TileCrafterTierAbstract) worldAccess.getTileEntity(i, j, k)).getFacing() != null) {
            side = TileHelper.getOrientationFromSide(((TileCrafterTierAbstract) worldAccess.getTileEntity(i, j, k)).getFacing(), ForgeDirection.getOrientation(side)).ordinal();
        }
        return side == 1 ? textureTop : side == 0 ? textureBottom : side == 3 ? textureFront : textureSide;
    }

    @Override
    public final void breakBlock(World world, int i, int j, int k, Block par5, int par6) {
        Random distilRand = new Random();
        TileCrafterTierAbstract tileentitytierI = (TileCrafterTierAbstract) world.getTileEntity(i, j, k);
        if (tileentitytierI != null) {
            label0: for (int l = 0; l < tileentitytierI.getSizeInventory(); l++) {
                if (l < 10 || l > 17) { // Don't drop the items in the output slots! (They haven't been crafted yet!)
                    ItemStack itemstack = tileentitytierI.getStackInSlot(l);
                    if (itemstack == null) {
                        continue;
                    }
                    float f = distilRand.nextFloat() * 0.8F + 0.1F;
                    float f1 = distilRand.nextFloat() * 0.8F + 0.1F;
                    float f2 = distilRand.nextFloat() * 0.8F + 0.1F;
                    do {
                        if (itemstack.stackSize <= 0) {
                            continue label0;
                        }
                        int i1 = distilRand.nextInt(21) + 10;
                        if (i1 > itemstack.stackSize) {
                            i1 = itemstack.stackSize;
                        }
                        EntityItem entityitem = new EntityItem(world, (float) i + f, (float) j + f1, (float) k + f2, itemstack.splitStack(i1));
                        float f3 = 0.05F;
                        entityitem.motionX = (float) distilRand.nextGaussian() * f3;
                        entityitem.motionY = (float) distilRand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float) distilRand.nextGaussian() * f3;
                        world.spawnEntityInWorld(entityitem);
                    } while (true);
                }
            }
        }
        super.breakBlock(world, i, j, k, par5, par6);
    }

    @Override
    public final void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
        super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
        TileCrafterTierAbstract te = (TileCrafterTierAbstract) world.getTileEntity(i, j, k);
        if (te != null) {
            int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
            world.markBlockForUpdate(i, j, k);
        }
    }

    @Override
    public final IIcon getIcon(int i, int j) {
        if (i == 1) {
            return textureTop;
        }
        if (i == 0) {
            return textureBottom;
        }
        if (i == 3) {
            return textureFront;
        }
        else {
            return textureSide;
        }
    }
}
