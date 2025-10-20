package train.common.items;

import train.common.Traincraft;
import train.common.core.handlers.ConfigHandler;
import train.common.library.Info;
import train.common.library.TypeOfRollingStock;

import static train.common.library.TypeOfRollingStock.HERITAGE;

public class ItemTCRollingStock extends ItemAbstractRollingStock
{
    public ItemTCRollingStock(String iconName, TypeOfRollingStock typeOfRollingStock)
    {
        super(iconName);
        if (!this.iconName.equals("asteri"))
        {
            if (typeOfRollingStock == null)
            {
                typeOfRollingStock = TypeOfRollingStock.EMPTY;
            }

            if (typeOfRollingStock == HERITAGE)
            {
                setCreativeTab(Traincraft.tcHeritageTab);
                return;
            }

            if (ConfigHandler.ENABLE_BAP_SPLIT_TABS)
            {
                switch(typeOfRollingStock)
                {
                    case STEAM:
                        setCreativeTab(Traincraft.tcSteamTab);
                        break;
                    case DIESEL:
                        setCreativeTab(Traincraft.tcDieselTab);
                        break;
                    case ELECTRIC:
                        setCreativeTab(Traincraft.tcElectricTab);
                        break;
                    case PASSENGER:
                        setCreativeTab(Traincraft.tcPassengerTab);
                        break;
                    case FREIGHT:
                        setCreativeTab(Traincraft.tcFreightTab);
                        break;
                    case BOOSE:
                        setCreativeTab(Traincraft.tcBooseTab);
                        break;
                    default:
                        setCreativeTab(Traincraft.tcTab);
                        break;
                }
            }
            else
            {
                setCreativeTab(Traincraft.tcDieselTab);
            }
        }
    }

    public ItemTCRollingStock(String iconName)
    {
        super(iconName);
        setCreativeTab(Traincraft.tcTab);
    }

    @Override
    public String GetTexturePath()
    {
        return Info.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
