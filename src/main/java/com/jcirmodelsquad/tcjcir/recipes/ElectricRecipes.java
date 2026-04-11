package com.jcirmodelsquad.tcjcir.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.library.ItemIDs;

public class ElectricRecipes extends AbstractRecipeHandler {
    public ElectricRecipes(ITierCraftingManager cm)
    {

        //doing bap recipes first
        //example of item order
        //cm.addRecipe(3, null, null, null, null, null, null, null, null, null, null, new ItemStack(ItemIDs.pennCentral.item, 1), 1);


        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.controls.item, 1), WHITE_DYE, new ItemStack(ItemIDs.minecartGM6C.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(Items.redstone, 12), new ItemStack(ItemIDs.partComponentCEE.item, 5), new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.controls.item, 1), WHITE_DYE, new ItemStack(ItemIDs.minecartB_BEL.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 6), SteelIngot(3), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.transformer.item, 8), new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.controls.item, 1), LIME_DYE, new ItemStack(ItemIDs.minecartJT7.item, 1), 1);

    }
}
