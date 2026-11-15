package train.common.api.locomotive;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.SteamTrain;
import train.common.library.GuiIDs;

public abstract class AbstractSteamTankEngine extends SteamTrain
{
    public AbstractSteamTankEngine(World world)
    {
        super(world);
        this.inventorySize = 17;
        locoInvent = new ItemStack[inventorySize];
    }

    @Override
    public void pressKey(int i)
    {
        if (i == 7 && getActiveDriver() instanceof EntityPlayer)
        {
            ((EntityPlayer) getActiveDriver()).openGui(Traincraft.instance, GuiIDs.LOCO_TANKENGINE, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }
}
