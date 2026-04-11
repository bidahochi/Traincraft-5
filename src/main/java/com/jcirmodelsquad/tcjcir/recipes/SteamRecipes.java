package com.jcirmodelsquad.tcjcir.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.library.ItemIDs;

/**
 * Add Recipes For Steam Locomotives
 */
public class SteamRecipes extends AbstractRecipeHandler {
    public SteamRecipes(ITierCraftingManager cm)
    {
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(Items.iron_ingot, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(Items.coal, 1), null, TCItemStack(ItemIDs.minecartLocoC11, 1), 1);

        //doing bap recipes first
        //example of item order
        //cm.addRecipe(3, null, null, null, null, null, null, null, null, null, null, TCItemStack(ItemIDs.pennCentral, 1), 1);


        //=================== BAP STEAM ===================//

        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 2), null, TCItemStack(ItemIDs.minecartClimaxNew, 1), 1);

        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), getAnyPlankType(3), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(IronIngotItem, 2), null, TCItemStack(ItemIDs.minecartVBShay2, 1), 1);

        cm.addRecipe(2, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1), TCItemStack(ItemIDs.boiler, 4), TCItemStack(ItemIDs.firebox, 2), TCItemStack(Items.iron_ingot, 4), GREEN_DYE, TCItemStack(ItemIDs.minecartSkook, 1), 1);
        cm.addRecipe(2, null, TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), null, null, null, TCItemStack(SteelIngotItem, 4), TCItemStack(CoalItem, 2), GREEN_DYE, TCItemStack(ItemIDs.minecartSkookTender, 1), 1);


        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 2), BLACK_DYE, TCItemStack(ItemIDs.minecartShay3Truck, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 3), null, null, null, TCItemStack(IronIngotItem, 2), TCItemStack(CoalItem, 2), BLACK_DYE, TCItemStack(ItemIDs.minecartShay3TruckTender, 1), 1);

        cm.addRecipe(1,
                null,
                TCItemStack(ItemIDs.ironBogie, 4),
                TCItemStack(ItemIDs.ironFrame, 2),
                TCItemStack(IronIngotItem, 3),
                TCItemStack(ItemIDs.ironChimney, 1),
                TCItemStack(ItemIDs.ironCab, 1),
                TCItemStack(ItemIDs.ironBoiler, 1),
                TCItemStack(ItemIDs.ironFirebox, 1),
                TCItemStack(CoalItem, 2),
                BLACK_DYE,
                TCItemStack(ItemIDs.minecartClimaxB, 1),
                1);


        cm.addRecipe(1, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 3), GRAY_DYE, TCItemStack(ItemIDs.minecartF01, 1), 1);
        cm.addRecipe(2, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.bogie, 3), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1), TCItemStack(ItemIDs.boiler, 3), TCItemStack(ItemIDs.firebox, 1), TCItemStack(CoalItem, 3), GRAY_DYE, TCItemStack(ItemIDs.minecartP01a, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), null, null, null, TCItemStack(IronIngotItem, 3), TCItemStack(CoalItem, 2), GRAY_DYE, TCItemStack(ItemIDs.minecartVanderbackTender, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), null, null, null, TCItemStack(IronIngotItem, 3), TCItemStack(CoalItem, 2), GRAY_DYE, TCItemStack(ItemIDs.minecartSquanderbackTender, 1), 1);

        cm.addRecipe(2, getAnyPlankType(2), TCItemStack(ItemIDs.bogie, 3), TCItemStack(ItemIDs.steelframe, 1), TCItemStack(SteelIngotItem, 3), null, null, null, null, TCItemStack(SteelIngotItem, 4), BLACK_DYE, TCItemStack(ItemIDs.minecartBKno2a, 1), 1);
        cm.addRecipe(2, getAnyPlankType(1), TCItemStack(ItemIDs.bogie, 3), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1), TCItemStack(ItemIDs.boiler, 4), TCItemStack(ItemIDs.firebox, 1), TCItemStack(SteelIngotItem, 4), BLACK_DYE, TCItemStack(ItemIDs.minecartBKno2b, 1), 1);


        cm.addRecipe(1, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.ironBogie, 6), TCItemStack(ItemIDs.ironFrame, 3), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 4), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(Items.iron_ingot, 4), LIGHT_GRAY_DYE, TCItemStack(ItemIDs.minecartWCPBuckingBull, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), null, null, null, TCItemStack(IronIngotItem, 4), TCItemStack(CoalItem, 4), LIGHT_GRAY_DYE, TCItemStack(ItemIDs.minecartWCPBaler, 1), 1);
        cm.addRecipe(1, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.ironBogie, 5), TCItemStack(ItemIDs.ironFrame, 4), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 5), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(Items.iron_ingot, 4), LIGHT_GRAY_DYE, TCItemStack(ItemIDs.minecartWCPMacky, 1), 1);


        cm.addRecipe(2, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.bogie, 5), TCItemStack(ItemIDs.steelframe, 4), TCItemStack(SteelIngotItem, 3), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1), TCItemStack(ItemIDs.boiler, 4), TCItemStack(ItemIDs.firebox, 1), TCItemStack(SteelIngotItem, 6), TCItemStack(Items.dye, 1, 0), TCItemStack(ItemIDs.minecartalco2102, 1), 1);
        cm.addRecipe(2, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 4), TCItemStack(SteelIngotItem, 3), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1), TCItemStack(ItemIDs.boiler, 5), TCItemStack(ItemIDs.firebox, 1), TCItemStack(SteelIngotItem, 4), TCItemStack(Items.dye, 1, 0), TCItemStack(ItemIDs.minecartMK60, 1), 1);
        cm.addRecipe(2, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 3), TCItemStack(SteelIngotItem, 3), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1), TCItemStack(ItemIDs.boiler, 4), TCItemStack(ItemIDs.firebox, 1), TCItemStack(SteelIngotItem, 2), TCItemStack(Items.dye, 1, 0), TCItemStack(ItemIDs.minecartHCS_c57, 1), 1);

        cm.addRecipe(2, null, TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), null, null, TCItemStack(WaterBucketItem, 1), TCItemStack(SteelIngotItem, 3), TCItemStack(CoalItem, 3), TCItemStack(Items.dye), TCItemStack(ItemIDs.minecartTender10k, 1), 1);
        cm.addRecipe(2, null, TCItemStack(ItemIDs.bogie, 6), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), null, null, TCItemStack(WaterBucketItem, 1), TCItemStack(SteelIngotItem, 4), TCItemStack(CoalItem, 4), TCItemStack(Items.dye), TCItemStack(ItemIDs.minecartTenderDeseret, 1), 1);
        cm.addRecipe(2, null, TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), null, null, TCItemStack(WaterBucketItem, 1), TCItemStack(SteelIngotItem, 5), TCItemStack(CoalItem, 5), TCItemStack(Items.dye), TCItemStack(ItemIDs.minecartHCS_9k_Tender, 1), 1);
        cm.addRecipe(2, null, TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), null, null, TCItemStack(WaterBucketItem, 1), TCItemStack(SteelIngotItem, 3), TCItemStack(CoalItem, 3), TCItemStack(Items.dye), TCItemStack(ItemIDs.minecartHotTubTender, 1), 1);


        cm.addRecipe(2, null, TCItemStack(ItemIDs.bogie, 2), TCItemStack(ItemIDs.steelframe, 3), TCItemStack(SteelIngotItem, 3), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1), TCItemStack(ItemIDs.boiler, 1), TCItemStack(ItemIDs.firebox, 2), null, null, TCItemStack(ItemIDs.minecartOnion, 1), 1);
        cm.addRecipe(2, null, TCItemStack(ItemIDs.bogie, 2), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), null, null, null, null, TCItemStack(CoalItem, 3), null, TCItemStack(ItemIDs.minecartOnionTender, 1), 1);

        cm.addRecipe(1, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 3), GRAY_DYE, TCItemStack(ItemIDs.minecartNP_L9, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), null, null, null, TCItemStack(IronIngotItem, 3), TCItemStack(CoalItem, 2), GRAY_DYE, TCItemStack(ItemIDs.minecartNP_11C_tender, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), null, null, null, TCItemStack(IronIngotItem, 3), TCItemStack(CoalItem, 2), GRAY_DYE, TCItemStack(ItemIDs.minecartNP_13C_tender, 1), 1);


        cm.addRecipe(1, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 3), GREEN_DYE, TCItemStack(ItemIDs.minecartAlco460, 1), 1);
        cm.addRecipe(1, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 3), GREEN_DYE, TCItemStack(ItemIDs.minecartLima2_8_0, 1), 1);

        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), null, null, TCItemStack(WaterBucketItem, 1), TCItemStack(IronIngotItem, 3), TCItemStack(CoalItem, 2), GREEN_DYE, TCItemStack(ItemIDs.minecartTender460, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), null, null, TCItemStack(WaterBucketItem, 1), TCItemStack(IronIngotItem, 2), TCItemStack(CoalItem, 2), GREEN_DYE, TCItemStack(ItemIDs.minecartTenderLima2_8_0, 1), 1);
        cm.addRecipe(1, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 4), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 3), GREEN_DYE, TCItemStack(ItemIDs.minecartBrank, 1), 1);


        cm.addRecipe(1, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 3), BROWN_DYE, TCItemStack(ItemIDs.minecartAlco0_6_0T, 1), 1);

        cm.addRecipe(2, TCItemStack(Blocks.torch, 1), TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 4), TCItemStack(SteelIngotItem, 3), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1), TCItemStack(ItemIDs.boiler, 5), TCItemStack(ItemIDs.firebox, 1), TCItemStack(SteelIngotItem, 4), null, TCItemStack(ItemIDs.minecartPMNandN1, 1), 1);

        cm.addRecipe(2, null, TCItemStack(ItemIDs.bogie, 4), TCItemStack(ItemIDs.steelframe, 2), TCItemStack(SteelIngotItem, 3), null, null, TCItemStack(WaterBucketItem, 1), TCItemStack(SteelIngotItem, 3), TCItemStack(CoalItem, 3), null, TCItemStack(ItemIDs.minecartPMNstender, 1), 1);


        //=================== TIER I ===================//

        cm.addRecipe(1, null, TCItemStack(ItemIDs.woodenBogie, 2), TCItemStack(ItemIDs.woodenFrame, 1), TCItemStack(Items.stick, 1), TCItemStack(ItemIDs.ironChimney, 1), null, TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), null, null, TCItemStack(ItemIDs.minecartLocoCherepanov, 1), 1);
        cm.addRecipe(1, TCItemStack(Blocks.crafting_table, 1), TCItemStack(ItemIDs.woodenBogie, 2), TCItemStack(ItemIDs.woodenFrame, 1), TCItemStack(Items.stick, 2), null, TCItemStack(ItemIDs.woodenCab, 1), null, null, TCItemStack(Blocks.furnace, 1), null, TCItemStack(ItemIDs.minecartWork, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.woodenBogie, 2), TCItemStack(ItemIDs.woodenFrame, 1), TCItemStack(Items.stick, 2), null, null, null, null, TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartTender, 1), 1);
        cm.addRecipe(1, TCItemStack(Items.iron_ingot, 6), TCItemStack(ItemIDs.woodenBogie, 2), TCItemStack(ItemIDs.woodenFrame, 2), TCItemStack(Items.stick, 2), null, null, null, null, TCItemStack(Items.lava_bucket, 1), null, TCItemStack(ItemIDs.minecartWatertransp, 1), 1);


        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(WaterBucketItem, 1), GREEN_DYE, TCItemStack(ItemIDs.minecartLocoBR80_DB, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(WaterBucketItem, 1), GREEN_DYE, TCItemStack(ItemIDs.minecartLocoNS3700Class, 1), 1);


        cm.addRecipe(1, TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), null, null, null, null, TCItemStack(CoalItem, 2), GREEN_DYE, TCItemStack(ItemIDs.minecartTenderNS3700, 1), 1);


        /*            for (ItemStack c : coal){
                cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 4), TCItemStack(IronIngotItem, 4), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 3), TCItemStack(ItemIDs.ironFirebox, 2), TCItemStack(CoalItem, 2), BLACK_DYE, TCItemStack(ItemIDs.minecartShay3Truck, 1), 1);
                cm.addRecipe(1, TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), null, null, null, null, TCItemStack(CoalItem, 2), dye, TCItemStack(ItemIDs.minecartShay3TruckTender, 1), 1);

        }*/

        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartLocoSteamShay, 1), 1);
        //cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartVBShay2, 1), 1);
        //cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 4), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 3), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 2), TCItemStack(CoalItem, 2), null, TCItemStack(ItemIDs.minecartClimaxNew, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.woodenBogie, 2), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 2), null, null, null, null, TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartSlateWagon, 1), 1);

        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartLocoAlcoSC4, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartLocoC41, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 6), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartLocoC41_080, 1), 1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartLocoC41T, 1), 1);
        cm.addRecipe(1, TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), null, null, null, null, TCItemStack(CoalItem, 2), null, TCItemStack(ItemIDs.minecartTenderC41, 1), 1);
        //cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartLocoC11, 1), 1);

        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironChimney, 1), TCItemStack(ItemIDs.ironCab, 1), TCItemStack(ItemIDs.ironBoiler, 2), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), null, TCItemStack(ItemIDs.minecartLocoSouthern1102, 1), 1);


        cm.addRecipe(1,
                null,
                TCItemStack(ItemIDs.ironBogie, 3),
                TCItemStack(ItemIDs.steelframe, 2),
                TCItemStack(SteelIngotItem, 2),
                TCItemStack(ItemIDs.steelchimney, 1),
                TCItemStack(ItemIDs.steelcab, 1),
                TCItemStack(ItemIDs.ironBoiler, 1),
                TCItemStack(ItemIDs.ironFirebox, 1),
                TCItemStack(CoalItem, 1),
                GRAY_DYE,
                TCItemStack(ItemIDs.minecartLocoUSATCUS, 1),
                1);
        cm.addRecipe(1, null, TCItemStack(ItemIDs.ironBogie, 3), TCItemStack(ItemIDs.steelframe, 2),
                TCItemStack(SteelIngotItem, 2), TCItemStack(ItemIDs.steelchimney, 1), TCItemStack(ItemIDs.steelcab, 1),
                TCItemStack(ItemIDs.ironBoiler, 1), TCItemStack(ItemIDs.ironFirebox, 1), TCItemStack(CoalItem, 1), GRAY_DYE,
                TCItemStack(ItemIDs.minecartLocoUSATCUK, 1), 1);

        cm.addRecipe(1, TCItemStack(IronIngotItem, 2), TCItemStack(ItemIDs.ironBogie, 2), TCItemStack(ItemIDs.ironFrame, 2), TCItemStack(IronIngotItem, 2), null, null, null, null, TCItemStack(CoalItem, 2), null, TCItemStack(ItemIDs.minecartTenderSouthern1102, 1), 1);

        cm.addRecipe(1, null, TCItemStack(ItemIDs.woodenBogie, 2), TCItemStack(ItemIDs.ironFrame, 1), TCItemStack(IronIngotItem, 2), null, null, null, null, TCItemStack(Items.snowball, 9), null, TCItemStack(ItemIDs.minecartIceWagon, 1), 1);
    }
}
