package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileUSSTL21NL;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockUSST21NL extends BlockSwitchStand {
    public BlockUSST21NL() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileUSSTL21NL();
    }
}