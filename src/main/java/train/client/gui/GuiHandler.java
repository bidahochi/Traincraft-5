package train.client.gui;


import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.seats.RollingStockSeatManager;

public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity te = world.getTileEntity(x, y, z);
        EntityRollingStock stock = RollingStockSeatManager.getRidingStock(player);
        if (ID == 1)
        {
            if (stock instanceof Locomotive && stock.isActiveDriver(player) && stock.isProtectedControlAuthorized(player))
            {
                return new GuiMTCInfo(stock);

            }
            else
            {
                return null;
            }

        }
        else if (ID == 2) {

            if (player.ridingEntity != null) {

                //return new GuiSpeedTransmitter(te);

            } else {
                return null;
            }

        }


        return null;
    }
}
