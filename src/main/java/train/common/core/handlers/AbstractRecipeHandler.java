package train.common.core.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.managers.TierRecipeManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Used as a base Table Recipe Handler that grabs all the items needed
 */
public abstract class AbstractRecipeHandler
{
    public ArrayList<ItemStack> ingotIron	= OreDictionary.getOres("ingotIron");
    public ArrayList<ItemStack> s1 = OreDictionary.getOres("plankWood");
    public ArrayList<ItemStack> s2 = OreDictionary.getOres("logWood");
    public ArrayList<ItemStack> ingotSteel = OreDictionary.getOres("ingotSteel");
    public ArrayList<ItemStack> dyeRed = OreDictionary.getOres("dyeRed"); //1
    public ArrayList<ItemStack> dyeYellow = OreDictionary.getOres("dyeYellow"); //11
    public ArrayList<ItemStack> dyeOrange = OreDictionary.getOres("dyeOrange");//14
    public ArrayList<ItemStack> dyeGreen = OreDictionary.getOres("dyeGreen"); //2
    public ArrayList<ItemStack> dyeBlue = OreDictionary.getOres("dyeBlue"); //4
    public ArrayList<ItemStack> dyeBrown = OreDictionary.getOres("dyeBrown"); //3
    public ArrayList<ItemStack> dyeGray = OreDictionary.getOres("dyeGray"); //3
    public ArrayList<ItemStack> dyeLightGray = OreDictionary.getOres("dyeLightGray"); //7
    public ArrayList<ItemStack> dyeBlack = OreDictionary.getOres("dyeBlack");
    public ArrayList<ItemStack> dyeWhite = OreDictionary.getOres("dyeWhite");
    public ArrayList<ItemStack> dyeMagenta = OreDictionary.getOres("dyeMagenta");
    public ArrayList<ItemStack> dyeLime = OreDictionary.getOres("dyeLime");
    public ArrayList<ItemStack> dyeLightBlue = OreDictionary.getOres("dyeLightBlue");
    public ArrayList<ItemStack> dyePurple = OreDictionary.getOres("dyePurple");
    public ArrayList<ItemStack> dyePink = OreDictionary.getOres("dyePink");
    public ArrayList<ItemStack> dyeCyan = OreDictionary.getOres("dyeCyan");

    public List<ItemStack> coal = new ArrayList<ItemStack>()
    {
        {
            coal.add(new ItemStack(Items.coal));
            coal.addAll(OreDictionary.getOres("coal"));
        }
    };


    public ArrayList<ItemStack> redstone = OreDictionary.getOres("dustRedstone");
    public ArrayList<ItemStack> waterbucket = waterContainers();

    public static ArrayList<ItemStack> waterContainers(){
        ArrayList<ItemStack> containers = new ArrayList<ItemStack>();
        for (FluidContainerRegistry.FluidContainerData data : FluidContainerRegistry.getRegisteredFluidContainerData()){
            if(data.fluid.fluid == FluidRegistry.WATER){
                containers.add(data.filledContainer);
            }
        }
        return containers;
    }
}
