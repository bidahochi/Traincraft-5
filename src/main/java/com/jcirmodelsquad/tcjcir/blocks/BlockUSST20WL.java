package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileUSST20WL;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockUSST20WL extends BlockSwitchStand {
    public BlockUSST20WL() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileUSST20WL();
    }
}