package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileUSSM22;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockUSSM22 extends BlockSwitchStand {
    public BlockUSSM22() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileUSSM22();
    }
}