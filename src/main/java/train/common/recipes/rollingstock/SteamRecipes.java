package train.common.recipes.rollingstock;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.library.ItemIDs;

/**
 * Add Recipes For Steam Locomotives
 */
public class SteamRecipes extends AbstractRecipeHandler
{
    public SteamRecipes(ITierCraftingManager cm)
    {
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(Items.iron_ingot, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Items.coal, 1), null, new ItemStack(ItemIDs.minecartLocoC11.item, 1), 1);

        //doing bap recipes first
        //example of item order
        //cm.addRecipe(3, null, null, null, null, null, null, null, null, null, null, new ItemStack(ItemIDs.pennCentral.item, 1), 1);


        //=================== BAP STEAM ===================//

        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 2), null, new ItemStack(ItemIDs.minecartClimaxNew.item, 1), 1);

        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), getAnyPlankType(3), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(IronIngotItem, 2), null, new ItemStack(ItemIDs.minecartVBShay2.item, 1), 1);

        cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 2), new ItemStack(Items.iron_ingot, 4), DyeGreen, new ItemStack(ItemIDs.minecartSkook.item, 1), 1);
        cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), null, null, null, new ItemStack(SteelIngotItem, 4), new ItemStack(CoalItem, 2), DyeGreen, new ItemStack(ItemIDs.minecartSkookTender.item, 1), 1);


        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 2), DyeBlack, new ItemStack(ItemIDs.minecartShay3Truck.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 3), null, null, null, new ItemStack(IronIngotItem, 2), new ItemStack(CoalItem, 2), DyeBlack, new ItemStack(ItemIDs.minecartShay3TruckTender.item, 1), 1);

        cm.addRecipe(1,
                null,
                new ItemStack(ItemIDs.ironBogie.item, 4),
                new ItemStack(ItemIDs.ironFrame.item, 2),
                new ItemStack(IronIngotItem, 3),
                new ItemStack(ItemIDs.ironChimney.item, 1),
                new ItemStack(ItemIDs.ironCab.item, 1),
                new ItemStack(ItemIDs.ironBoiler.item, 1),
                new ItemStack(ItemIDs.ironFirebox.item, 1),
                new ItemStack(CoalItem, 2),
                DyeBlack,
                new ItemStack(ItemIDs.minecartClimaxB.item, 1),
                1);


        cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 3), DyeGray, new ItemStack(ItemIDs.minecartF01.item, 1), 1);
        cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(CoalItem, 3), DyeGray, new ItemStack(ItemIDs.minecartP01a.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), null, null, null, new ItemStack(IronIngotItem, 3), new ItemStack(CoalItem, 2), DyeGray, new ItemStack(ItemIDs.minecartVanderbackTender.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), null, null, null, new ItemStack(IronIngotItem, 3), new ItemStack(CoalItem, 2), DyeGray, new ItemStack(ItemIDs.minecartSquanderbackTender.item, 1), 1);

        cm.addRecipe(2, getAnyPlankType(2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(SteelIngotItem, 3), null, null, null, null, new ItemStack(SteelIngotItem, 4), DyeBlack, new ItemStack(ItemIDs.minecartBKno2a.item, 1), 1);
        cm.addRecipe(2, getAnyPlankType(1), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(SteelIngotItem, 4), DyeBlack, new ItemStack(ItemIDs.minecartBKno2b.item, 1), 1);



        cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 6), new ItemStack(ItemIDs.ironFrame.item, 3), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 4), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Items.iron_ingot, 4), DyeLightGray, new ItemStack(ItemIDs.minecartWCPBuckingBull.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), null, null, null, new ItemStack(IronIngotItem, 4), new ItemStack(CoalItem, 4), DyeLightGray, new ItemStack(ItemIDs.minecartWCPBaler.item, 1), 1);
        cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 5), new ItemStack(ItemIDs.ironFrame.item, 4), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 5), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Items.iron_ingot, 4), DyeLightGray, new ItemStack(ItemIDs.minecartWCPMacky.item, 1), 1);



        cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(SteelIngotItem, 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(SteelIngotItem, 6), new ItemStack(Items.dye, 1, 0), new ItemStack(ItemIDs.minecartalco2102.item, 1), 1);
        cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(SteelIngotItem, 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 5), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(SteelIngotItem, 4), new ItemStack(Items.dye, 1, 0), new ItemStack(ItemIDs.minecartMK60.item, 1), 1);
        cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(SteelIngotItem, 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(SteelIngotItem, 2), new ItemStack(Items.dye, 1, 0), new ItemStack(ItemIDs.minecartHCS_c57.item, 1), 1);

        cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), null, null, new ItemStack(WaterBucketItem, 1), new ItemStack(SteelIngotItem, 3), new ItemStack(CoalItem, 3), new ItemStack(Items.dye), new ItemStack(ItemIDs.minecartTender10k.item, 1), 1);
        cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), null, null, new ItemStack(WaterBucketItem, 1), new ItemStack(SteelIngotItem, 4), new ItemStack(CoalItem, 4), new ItemStack(Items.dye), new ItemStack(ItemIDs.minecartTenderDeseret.item, 1), 1);
        cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), null, null, new ItemStack(WaterBucketItem, 1), new ItemStack(SteelIngotItem, 5), new ItemStack(CoalItem, 5), new ItemStack(Items.dye), new ItemStack(ItemIDs.minecartHCS_9k_Tender.item, 1), 1);
        cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), null, null, new ItemStack(WaterBucketItem, 1), new ItemStack(SteelIngotItem, 3), new ItemStack(CoalItem, 3), new ItemStack(Items.dye), new ItemStack(ItemIDs.minecartHotTubTender.item, 1), 1);



        cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(SteelIngotItem, 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 2), null, null, new ItemStack(ItemIDs.minecartOnion.item, 1), 1);
        cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), null, null, null, null, new ItemStack(CoalItem, 3), null, new ItemStack(ItemIDs.minecartOnionTender.item, 1), 1);

        cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 3), DyeGray, new ItemStack(ItemIDs.minecartNP_L9.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), null, null, null, new ItemStack(IronIngotItem, 3), new ItemStack(CoalItem, 2), DyeGray, new ItemStack(ItemIDs.minecartNP_11C_tender.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), null, null, null, new ItemStack(IronIngotItem, 3), new ItemStack(CoalItem, 2), DyeGray, new ItemStack(ItemIDs.minecartNP_13C_tender.item, 1), 1);


        cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 3), DyeGreen, new ItemStack(ItemIDs.minecartAlco460.item, 1), 1);
        cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 3), DyeGreen, new ItemStack(ItemIDs.minecartLima2_8_0.item, 1), 1);

        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), null, null, new ItemStack(WaterBucketItem, 1), new ItemStack(IronIngotItem, 3), new ItemStack(CoalItem, 2), DyeGreen, new ItemStack(ItemIDs.minecartTender460.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), null, null, new ItemStack(WaterBucketItem, 1), new ItemStack(IronIngotItem, 2), new ItemStack(CoalItem, 2), DyeGreen, new ItemStack(ItemIDs.minecartTenderLima2_8_0.item, 1), 1);
        cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 4), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 3), DyeGreen, new ItemStack(ItemIDs.minecartBrank.item, 1), 1);



        cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 3), DyeBrown, new ItemStack(ItemIDs.minecartAlco0_6_0T.item, 1), 1);

        cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(SteelIngotItem, 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 5), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(SteelIngotItem, 4), null, new ItemStack(ItemIDs.minecartPMNandN1.item, 1), 1);

        cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(SteelIngotItem, 3), null, null, new ItemStack(WaterBucketItem, 1), new ItemStack(SteelIngotItem, 3), new ItemStack(CoalItem, 3), null, new ItemStack(ItemIDs.minecartPMNstender.item, 1), 1);





        //=================== TIER I ===================//

        cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(Items.stick, 1), new ItemStack(ItemIDs.ironChimney.item, 1), null, new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoCherepanov.item, 1), 1);
        cm.addRecipe(1, new ItemStack(Blocks.crafting_table, 1), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(Items.stick, 2), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, null, new ItemStack(Blocks.furnace, 1), null, new ItemStack(ItemIDs.minecartWork.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(Items.stick, 2), null, null, null, null, new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartTender.item, 1), 1);
        cm.addRecipe(1, new ItemStack(Items.iron_ingot, 6), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), null, null, null, null, new ItemStack(Items.lava_bucket, 1), null, new ItemStack(ItemIDs.minecartWatertransp.item, 1), 1);


        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(WaterBucketItem, 1), DyeGreen, new ItemStack(ItemIDs.minecartLocoBR80_DB.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(WaterBucketItem, 1), DyeGreen, new ItemStack(ItemIDs.minecartLocoNS3700Class.item, 1), 1);


        cm.addRecipe(1, new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), null, null, null, null, new ItemStack(CoalItem, 2), DyeGreen, new ItemStack(ItemIDs.minecartTenderNS3700.item, 1), 1);


        /*for (ItemStack dye : dyeBlack){
            for (ItemStack c : coal){
                cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 4), new ItemStack(IronIngotItem, 4), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 3), new ItemStack(ItemIDs.ironFirebox.item, 2), new ItemStack(CoalItem, 2), dye, new ItemStack(ItemIDs.minecartShay3Truck.item, 1), 1);
                cm.addRecipe(1, new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), null, null, null, null, new ItemStack(CoalItem, 2), dye, new ItemStack(ItemIDs.minecartShay3TruckTender.item, 1), 1);
            }
        }*/

        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartLocoSteamShay.item, 1), 1);
        //cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartVBShay2.item, 1), 1);
        //cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 2), new ItemStack(CoalItem, 2), null, new ItemStack(ItemIDs.minecartClimaxNew.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 2), null, null, null, null, new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartSlateWagon.item, 1), 1);

        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartLocoAlcoSC4.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartLocoC41.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 6), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartLocoC41_080.item, 1), 1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartLocoC41T.item, 1), 1);
        cm.addRecipe(1, new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), null, null, null, null, new ItemStack(CoalItem, 2), null, new ItemStack(ItemIDs.minecartTenderC41.item, 1), 1);
        //cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartLocoC11.item, 1), 1);

        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), null, new ItemStack(ItemIDs.minecartLocoSouthern1102.item, 1), 1);


        cm.addRecipe(1,
                null,
                new ItemStack(ItemIDs.ironBogie.item, 3),
                new ItemStack(ItemIDs.steelframe.item, 2),
                new ItemStack(SteelIngotItem, 2),
                new ItemStack(ItemIDs.steelchimney.item, 1),
                new ItemStack(ItemIDs.steelcab.item, 1),
                new ItemStack(ItemIDs.ironBoiler.item, 1),
                new ItemStack(ItemIDs.ironFirebox.item, 1),
                new ItemStack(CoalItem, 1),
                DyeGray,
                new ItemStack(ItemIDs.minecartLocoUSATCUS.item, 1),
                1);
        cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2),
                new ItemStack(SteelIngotItem, 2), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1),
                new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(CoalItem, 1), DyeGray,
                new ItemStack(ItemIDs.minecartLocoUSATCUK.item, 1), 1);

        cm.addRecipe(1, new ItemStack(IronIngotItem, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(IronIngotItem, 2), null, null, null, null, new ItemStack(CoalItem, 2), null, new ItemStack(ItemIDs.minecartTenderSouthern1102.item, 1), 1);

        cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(IronIngotItem, 2), null, null, null, null, new ItemStack(Items.snowball, 9), null, new ItemStack(ItemIDs.minecartIceWagon.item, 1), 1);
    }
}
