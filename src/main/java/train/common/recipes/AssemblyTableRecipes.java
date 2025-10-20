package train.common.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;

import java.util.ArrayList;


public class AssemblyTableRecipes extends AbstractRecipeHandler
{
	public void recipes() {
		//initialize these in the function because this only ever gets called on startup, gives a lot of space for GC to do its job.


		ITierCraftingManager cm = TierRecipeManager.getInstance();

		for (ItemStack k :ingotSteel)
		{
			Item itemSteel = k.getItem();
			int itemDamageSteel = k.getItemDamage();

			//doing bap recipes first
			//example of item order
			cm.addRecipe(3, null, null, null, null, null, null, null, null, null, null, new ItemStack(ItemIDs.pennCentral.item, 1), 1);


			//=================== BAP STEAM ===================//
			for (ItemStack iron : ingotIron) {
				for (ItemStack c : coal) {
					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 2), null, new ItemStack(ItemIDs.minecartClimaxNew.item, 1), 1);
					for (ItemStack plank : s1) {
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(plank.getItem(), 3), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(iron.getItem(), 2), null, new ItemStack(ItemIDs.minecartVBShay2.item, 1), 1);
					}
					for (ItemStack dye : dyeGreen) {
						cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 2), new ItemStack(Items.iron_ingot, 4), dye, new ItemStack(ItemIDs.minecartSkook.item, 1), 1);
						cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, null, null, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartSkookTender.item, 1), 1);
					}
					for (ItemStack dye : dyeBlack) {
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartShay3Truck.item, 1), 1);
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 3), null, null, null, new ItemStack(iron.getItem(), 2), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartShay3TruckTender.item, 1), 1);

						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartClimaxB.item, 1), 1);
					}
					for (ItemStack dye : dyeGray) {
						cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 3), dye, new ItemStack(ItemIDs.minecartF01.item, 1), 1);
						cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(c.getItem(), 3), dye, new ItemStack(ItemIDs.minecartP01a.item, 1), 1);
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), null, null, null, new ItemStack(iron.getItem(), 3), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartVanderbackTender.item, 1), 1);
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), null, null, null, new ItemStack(iron.getItem(), 3), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartSquanderbackTender.item, 1), 1);
					}
					for (ItemStack dye : dyeBlack) {
						for (ItemStack plank : s1) {
							cm.addRecipe(2, new ItemStack(plank.getItem(), 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), null, null, null, null, new ItemStack(itemSteel, 4, itemDamageSteel), dye, new ItemStack(ItemIDs.minecartBKno2a.item, 1), 1);
							cm.addRecipe(2, new ItemStack(plank.getItem(), 1), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(itemSteel, 4, itemDamageSteel), dye, new ItemStack(ItemIDs.minecartBKno2b.item, 1), 1);
						}
					}
					for (ItemStack dye : dyeLightGray) {
						cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 6), new ItemStack(ItemIDs.ironFrame.item, 3), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 4), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Items.iron_ingot, 4), dye, new ItemStack(ItemIDs.minecartWCPBuckingBull.item, 1), 1);
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), null, null, null, new ItemStack(iron.getItem(), 4), new ItemStack(c.getItem(), 4), dye, new ItemStack(ItemIDs.minecartWCPBaler.item, 1), 1);
						cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 5), new ItemStack(ItemIDs.ironFrame.item, 4), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 5), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Items.iron_ingot, 4), dye, new ItemStack(ItemIDs.minecartWCPMacky.item, 1), 1);

					}
					for (ItemStack dye : dyeBlack) {
						cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(itemSteel, 6, itemDamageSteel), dye, new ItemStack(ItemIDs.minecartalco2102.item, 1), 1);
						cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 5), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(itemSteel, 4, itemDamageSteel), dye, new ItemStack(ItemIDs.minecartMK60.item, 1), 1);
						for (ItemStack bucketWater : waterbucket) {
							cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, null, new ItemStack(bucketWater.getItem(), 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(c.getItem(), 3), dye, new ItemStack(ItemIDs.minecartTender10k.item, 1), 1);
							cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, null, new ItemStack(bucketWater.getItem(), 1), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(c.getItem(), 4), dye, new ItemStack(ItemIDs.minecartTenderDeseret.item, 1), 1);
						}
					}
					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoC11.item, 1), 1);
					cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 2), null, null, new ItemStack(ItemIDs.minecartOnion.item, 1), 1);
					cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 3), null, new ItemStack(ItemIDs.minecartOnionTender.item, 1), 1);
					for (ItemStack dye : dyeGray) {
						cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 3), dye, new ItemStack(ItemIDs.minecartNP_L9.item, 1), 1);
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), null, null, null, new ItemStack(iron.getItem(), 3), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartNP_11C_tender.item, 1), 1);
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), null, null, null, new ItemStack(iron.getItem(), 3), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartNP_13C_tender.item, 1), 1);
					}
					for (ItemStack dye : dyeGreen) {
						cm.addRecipe(1, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 3), dye, new ItemStack(ItemIDs.minecartAlco460.item, 1), 1);
						for (ItemStack bucketWater : waterbucket) {
							cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), null, null, new ItemStack(bucketWater.getItem(), 1), new ItemStack(iron.getItem(), 3), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartTender460.item, 1), 1);
						}
					}
					cm.addRecipe(2, new ItemStack(Blocks.torch, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 5), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(itemSteel, 4, itemDamageSteel), null, new ItemStack(ItemIDs.minecartPMNandN1.item, 1), 1);
					for (ItemStack bucketWater : waterbucket) {
						cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, null, new ItemStack(bucketWater.getItem(), 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(c.getItem(), 3), null, new ItemStack(ItemIDs.minecartPMNstender.item, 1), 1);
					}

				}
			}








			//=================== TIER I ===================//

			cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(Items.stick, 1), new ItemStack(ItemIDs.ironChimney.item, 1), null, new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoCherepanov.item, 1), 1);
			cm.addRecipe(1, new ItemStack(Blocks.crafting_table, 1), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(Items.stick, 2), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, null, new ItemStack(Blocks.furnace, 1), null, new ItemStack(ItemIDs.minecartWork.item, 1), 1);
			for (ItemStack c : coal) {
				cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(Items.stick, 2), null, null, null, null, new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartTender.item, 1), 1);
			}
			cm.addRecipe(1, new ItemStack(Items.iron_ingot, 6), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), null, null, null, null, new ItemStack(Items.lava_bucket, 1), null, new ItemStack(ItemIDs.minecartWatertransp.item, 1), 1);
			for (ItemStack iron : ingotIron) {
				for (ItemStack dye : dyeGreen) {
					for (ItemStack bucketWater : waterbucket) {
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(bucketWater.getItem(), 1), dye, new ItemStack(ItemIDs.minecartLocoBR80_DB.item, 1), 1);
					}

				}
				/*for (ItemStack dye : dyeBlack){
					for (ItemStack c : coal){
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 4), new ItemStack(iron.getItem(), 4), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 3), new ItemStack(ItemIDs.ironFirebox.item, 2), new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartShay3Truck.item, 1), 1);
						cm.addRecipe(1, new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), null, null, null, null, new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartShay3TruckTender.item, 1), 1);
					}
				}*/
				for (ItemStack c : coal) {
					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoSteamShay.item, 1), 1);
					//cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartVBShay2.item, 1), 1);
					//cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 2), new ItemStack(c.getItem(), 2), null, new ItemStack(ItemIDs.minecartClimaxNew.item, 1), 1);
					cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartSlateWagon.item, 1), 1);

					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoAlcoSC4.item, 1), 1);
					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoC41.item, 1), 1);
					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 6), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoC41_080.item, 1), 1);
					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoC41T.item, 1), 1);
					cm.addRecipe(1, new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(c.getItem(), 2), null, new ItemStack(ItemIDs.minecartTenderC41.item, 1), 1);
					//cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoC11.item, 1), 1);

					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoSouthern1102.item, 1), 1);
					for (ItemStack dye : dyeGray) {
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2),
								new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1),
								new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), dye,
								new ItemStack(ItemIDs.minecartLocoUSATCUS.item, 1), 1);
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2),
								new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1),
								new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), dye,
								new ItemStack(ItemIDs.minecartLocoUSATCUK.item, 1), 1);
					}
					cm.addRecipe(1, new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(c.getItem(), 2), null, new ItemStack(ItemIDs.minecartTenderSouthern1102.item, 1), 1);
				}
				cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(Items.snowball, 9), null, new ItemStack(ItemIDs.minecartIceWagon.item, 1), 1);
			}
			for (ItemStack dye : dyeRed) {
				for (ItemStack c : coal) {
					cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(Items.stick, 2), null, null, null, null, new ItemStack(c.getItem(), 1), dye, new ItemStack(ItemIDs.minecartSteamRedTender.item, 1), 1);
					for (ItemStack iron : ingotIron) {
						cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(c.getItem(), 1), dye, new ItemStack(ItemIDs.minecartLocoForneyRed.item, 1), 1);
					}
				}
				cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), null, dye, new ItemStack(ItemIDs.minecartPower.item, 1), 1);
			}
			cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 4), null, new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoSnowPlow.item, 1), 1);
			for (ItemStack dye : dyeBlue) {
				cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Blocks.torch, 1), dye, new ItemStack(ItemIDs.minecartLoco3.item, 1), 1);
			}
			cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), null, null, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoLSSP7.item, 1), 1);
			//cm.addRecipe(1, new ItemStack(Block.planks, 4), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(ingotIron.getItem(), 1), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(Item.redstone, 4), null, new ItemStack(ItemIDs.minecartTramWood.item, 1), 1);

			for (ItemStack i : s1) {
				for (ItemStack j : s2) {
					cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), null, null, null, null, new ItemStack(j.getItem(), 1, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartWood.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 4, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(Items.stick, 4), null, null, null, null, new ItemStack(j.getItem(), 2, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartSkeletonLogCar.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 4), null, null, null, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(j.getItem(), 2, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartEarlyFlat.item, 1), 1);
				}
				for (ItemStack iron : ingotIron) {
					for (ItemStack dye : dyeGreen) {
						cm.addRecipe(1, new ItemStack(i.getItem(), 8, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 3), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironChimney.item, 1), null, new ItemStack(ItemIDs.ironBoiler.item, 1), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(Items.gold_ingot, 2), dye, new ItemStack(ItemIDs.minecartLocoSteamAdler.item, 1), 1);
						for (ItemStack c : coal) {
							cm.addRecipe(1, new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(iron.getItem(), 1), null, null, null, null, new ItemStack(c.getItem(), 1), dye, new ItemStack(ItemIDs.minecartTenderAdler.item, 1), 1);
						}
					}
					for (ItemStack dye : dyeYellow) {
						cm.addRecipe(1, new ItemStack(iron.getItem(), 1), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(iron.getItem(), 1), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartPassengerAdler.item, 1), 1);
					}
				}

				cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), null, new ItemStack(ItemIDs.minecartPassenger2.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), null, new ItemStack(ItemIDs.minecartCaboose.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), null, null, null, null, new ItemStack(Blocks.chest, 1), null, new ItemStack(ItemIDs.minecartFreightCartSmall.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 3, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), null, null, null, null, null, null, new ItemStack(ItemIDs.minecartFlatCart.item, 1), 1);
				for (ItemStack iron : ingotIron) {
					cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(Blocks.chest, 2), null, new ItemStack(ItemIDs.minecartChest.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(Blocks.chest, 2), null, new ItemStack(ItemIDs.minecartFreightCart2.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(Blocks.hopper, 2), null, new ItemStack(ItemIDs.minecartFreightCartUS.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 3), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(Blocks.hopper, 3), null, new ItemStack(ItemIDs.minecartMillGondola.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 4, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 4), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(Blocks.chest, 1), null, new ItemStack(ItemIDs.minecartFreightClosed.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(Blocks.hopper, 2), null, new ItemStack(ItemIDs.minecartFreightOpen2.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), null, new ItemStack(ItemIDs.minecartCaboose3.item, 1), 1);
					cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(iron.getItem(), 2), null, new ItemStack(ItemIDs.ironCab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), null, new ItemStack(ItemIDs.minecartPassenger7.item, 1), 1);
					for (ItemStack rs : redstone) {
						cm.addRecipe(1, new ItemStack(i.getItem(), 4, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(iron.getItem(), 1), null, new ItemStack(ItemIDs.woodenCab.item, 1), new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 4), null, new ItemStack(ItemIDs.minecartTramWood.item, 1), 1);
					}
					for (ItemStack dye : dyeRed) {
						cm.addRecipe(1, new ItemStack(i.getItem(), 3, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(iron.getItem(), 1), null, null, null, null, new ItemStack(Blocks.crafting_table, 1), dye, new ItemStack(ItemIDs.minecartCabooseLogging.item, 1), 1);
					}
				}
				cm.addRecipe(1, new ItemStack(Blocks.crafting_table, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), new ItemStack(i.getItem(), 8, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, null, new ItemStack(Blocks.furnace, 1), null, new ItemStack(ItemIDs.minecartGWRBrakeVan.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), null, new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null, new ItemStack(i.getItem(), 4, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.minecartLocoSteamVBShay.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), null, new ItemStack(ItemIDs.ironChimney.item, 1), null, new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoSteamAlice.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 4, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), null, new ItemStack(ItemIDs.ironChimney.item, 1), null, new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoSteam040vb.item, 1), 1);

				cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), null, null, null, null, null, new ItemStack(Items.painting, 2), null, new ItemStack(ItemIDs.minecartPropagandaUs.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), null, null, null, null, null, new ItemStack(Items.painting, 2), null, new ItemStack(ItemIDs.minecartPropagandaUSSR.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), null, null, null, null, null, new ItemStack(Items.painting, 2), null, new ItemStack(ItemIDs.minecartPropagandaBritish.item, 1), 1);
				cm.addRecipe(1, new ItemStack(i.getItem(), 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), null, null, null, null, null, new ItemStack(Items.painting, 2), null, new ItemStack(ItemIDs.minecartPropagandaJapan.item, 1), 1);
			}
			cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 1), null, new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoSteamGLYN.item, 1), 1);
			cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.woodenFrame.item, 1), null, new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoSteam262T.item, 1), 1);
			cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 1), null, new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.woodenCab.item, 1), new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoSteamClimax.item, 1), 1);

			cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), null, null, null, null, null, null, null, new ItemStack(ItemIDs.minecartPassengerBamboo.item, 1), 1);
			cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), null, null, null, null, null, new ItemStack(Blocks.chest, 1), null, new ItemStack(ItemIDs.minecartFreightBamboo.item, 1), 1);
			cm.addRecipe(1, null, new ItemStack(ItemIDs.woodenBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 1), null, null, null, null, new ItemStack(ItemIDs.dieselengine.item, 1), null, null, new ItemStack(ItemIDs.minecartTrainBamboo.item, 1), 1);
			cm.addRecipe(1,null, new ItemStack(ItemIDs.woodenBogie.item,2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(Items.iron_ingot, 2), null, null, new ItemStack(Blocks.mossy_cobblestone, 1), null, null, null, new ItemStack(ItemIDs.minecartBoulderWagon.item, 1), 1);

			for (ItemStack dye : dyeYellow) {
				cm.addRecipe(1, new ItemStack(Blocks.chest, 4), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.woodenFrame.item, 3), null, null, new ItemStack(ItemIDs.woodenCab.item, 3), null, null, null, dye, new ItemStack(ItemIDs.minecartDenverRioGrandeBaggage.item, 1), 1);
				cm.addRecipe(1, new ItemStack(Blocks.chest, 4), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.woodenFrame.item, 3), null, null, new ItemStack(ItemIDs.woodenCab.item, 3), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartDenverRioGrandeCombo.item, 1), 1);
				cm.addRecipe(1, null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.woodenFrame.item, 3), null, null, new ItemStack(ItemIDs.woodenCab.item, 3), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartDenverRioGrandePassenger.item, 1), 1);
				}

				for (ItemStack iron : ingotIron) {
					cm.addRecipe(1, new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 2), null, null, null, null, new ItemStack(Blocks.chest, 1), new ItemStack(iron.getItem()), new ItemStack(ItemIDs.minecartMineTrain.item, 1), 1);
					for (ItemStack rs : redstone) {
						cm.addRecipe(1, new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 1), null, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 1), new ItemStack(rs.getItem()), new ItemStack(ItemIDs.minecartLocoMineTrain.item, 1), 1);
					}
				}
			for (ItemStack dye : dyeOrange) {
				cm.addRecipe(1, new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.ironBogie.item, 6), new ItemStack(ItemIDs.ironFrame.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.ironCab.item, 3), new ItemStack(ItemIDs.transformer.item, 3), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartEF1.item, 1), 1);
				cm.addRecipe(1, new ItemStack(ItemIDs.copperWireFine.item, 2), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.ironCab.item, 2), new ItemStack(ItemIDs.transformer.item, 3), new ItemStack(ItemIDs.electmotor.item, 4), null, dye, new ItemStack(ItemIDs.minecartEF1B.item, 1), 1);
				}
			for (ItemStack dye : dyeBrown) {
				cm.addRecipe(1, new ItemStack(Blocks.planks, 4), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2), dye, new ItemStack(ItemIDs.minecartPS140.item, 1), 1);
			}
			for (ItemStack dye : dyeBrown) {
				for (ItemStack rs : redstone) {
					//cm.addRecipe(1, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.woodenCab.item, 2), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 4), dye, new ItemStack(ItemIDs.minecartILMB.item, 1), 1);
				}
			}
			for (ItemStack dye : dyeGreen) {
				for (ItemStack rs : redstone) {
					//cm.addRecipe(1, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.woodenCab.item, 2), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 4), dye, new ItemStack(ItemIDs.minecartILMA.item, 1), 1);
				}
			}

				//=================== TIER II ==================//
				for (ItemStack bucketWater : waterbucket) {
					cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(bucketWater.getItem(), 1), new ItemStack(bucketWater.getItem()), new ItemStack(ItemIDs.minecartTankWagon.item, 1), 1);
				}


			cm.addRecipe(2, new ItemStack(Blocks.torch,1), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 2), new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.iron_ingot,1), new ItemStack(ItemIDs.minecartHeavySteam.item, 1),1);
			//cm.addRecipe(2, new ItemStack(Blocks.torch,1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 2), new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.iron_ingot,1), new ItemStack(ItemIDs.minecartSkook.item, 1),1);

			for (ItemStack dye : dyeCyan) {
				cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 4), dye, new ItemStack(ItemIDs.minecartOWO60Verticube.item, 1), 1);
				}
			for (ItemStack dye : dyeGreen) {
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3),
						new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2),
						new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 2),
						new ItemStack(ItemIDs.firebox.item, 2), null, dye,
						new ItemStack (ItemIDs.minecartLocoHallClass.item, 1), 1);
				cm.addRecipe( 2, null,new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3),
						new ItemStack(itemSteel,2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2),
						new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3),
						new ItemStack(ItemIDs.firebox.item, 2), null,dye,
						new ItemStack(ItemIDs.minecartLocoKingClass.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartChmE3.item, 1), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Items.wheat, 3), dye, new ItemStack(ItemIDs.minecartGrain.item, 1), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartPassenger9_2class_DB.item, 1), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartPassenger5.item, 1), 1);
				for (ItemStack bucketWater : waterbucket) {
					cm.addRecipe(2, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), null, null, null, null, new ItemStack(bucketWater.getItem(), 1), dye, new ItemStack(ItemIDs.minecartTankWagonThreeDome.item, 1), 1);
				}
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 2), new ItemStack(ItemIDs.firebox.item, 1), null, dye, new ItemStack(ItemIDs.minecartLocoSteamPannier.item, 1), 1);
			}
			for (ItemStack iron : ingotIron) {
				for (ItemStack steel : ingotSteel) {
					betterAddRecipe(2, null, null, null, null, new ItemStack(iron.getItem(), 2), new ItemStack(Blocks.hopper, 3), new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item,2),  new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartOreJenny.item), 1);
					betterAddRecipe(2, null, null, null, null, new ItemStack(iron.getItem(), 2), new ItemStack(Blocks.hopper, 3), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item,3),  new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartPRRGLaHopper.item), 1);
					betterAddRecipe(2, null, new ItemStack(Blocks.log, 4), null, null, new ItemStack(Blocks.chest, 4), new ItemStack(iron.getItem(), 3), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4),  new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartWoodchipHopper.item), 1);
					betterAddRecipe(2, new ItemStack(Blocks.planks), new ItemStack(Blocks.planks), new ItemStack(Blocks.planks), null, new ItemStack(iron.getItem(), 3), new ItemStack(Blocks.chest, 2), new ItemStack(iron.getItem(), 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3),  new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecart40highcube.item),1);
				}
			}
			for (ItemStack dye : dyeBrown) {
				cm.addRecipe(2, new ItemStack(Items.iron_ingot, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.ironChimney.item,1), new ItemStack(ItemIDs.ironCab.item, 1), dye , new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), new ItemStack(Items.iron_ingot,2), new ItemStack(ItemIDs.minecart25Ton.item, 1), 1);
			}
			for (ItemStack dye : dyeGreen) {
				//cm.addRecipe(2, new ItemStack(Items.iron_ingot, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.ironChimney.item,1), new ItemStack(ItemIDs.ironCab.item, 1), dye , new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), new ItemStack(Items.iron_ingot,2), new ItemStack(ItemIDs.minecartILMC.item, 1), 1);
			}
			for (ItemStack dye : dyeBlue) {
				cm.addRecipe(2, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), null, null, null, new ItemStack(Blocks.tnt, 32), new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.iron_ingot, 1), dye, new ItemStack(ItemIDs.minecartBombCart.item, 1),1);
				cm.addRecipe(2, new ItemStack(Items.iron_ingot, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.ironChimney.item,1), new ItemStack(ItemIDs.ironCab.item, 5), dye , new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), new ItemStack(Items.iron_ingot,2), new ItemStack(ItemIDs.minecartBoxcab23Ton.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transmition.item, 1), new ItemStack(ItemIDs.dieselengine.item, 3), null, dye, new ItemStack(ItemIDs.minecartShunter.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 2), new ItemStack(ItemIDs.firebox.item, 1), null, dye, new ItemStack(ItemIDs.minecartLocomogulBlue.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3),
						new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel),
						new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1),
						new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4),
						new ItemStack(ItemIDs.generator.item, 2), dye,
						new ItemStack(ItemIDs.minecartLocoEWSClass66.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartLocoCD151.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3),
						new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel),
						new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1),
						new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4),
						new ItemStack(ItemIDs.generator.item, 3), dye,
						new ItemStack(ItemIDs.minecartLocoDeltic.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartGP13.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 0), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartGP7b.item, 1), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 4), dye, new ItemStack(ItemIDs.minecartPS160.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 2), dye, new ItemStack(ItemIDs.minecartBeep.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartH16_66.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartH24_66L.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartH24_66C.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartFPA4.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 0), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartFPB4.item, 1), 1);
			}

			cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), null, null, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.transmition.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), null, null, new ItemStack(ItemIDs.minecartLoco44TonSwitcher.item, 1), 1);
			cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), null, null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transmition.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoWLs40.item, 1), 1);

			for (ItemStack dye : dyeRed) {
				//cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(ItemIDs.seats.item, 2), dye, new ItemStack(ItemIDs.minecartLUengine.item, 1), 1);
				//cm.addRecipe(2,null, new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1),null, null, new ItemStack(ItemIDs.seats.item, 2), dye, new ItemStack(ItemIDs.minecartLUcar.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartCD742.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartGP7Red.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartSW8.item, 1), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(Blocks.furnace, 1), new ItemStack(Blocks.crafting_table, 1), dye, new ItemStack(ItemIDs.minecartWVcaboose.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartAlcoPA1.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 0), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartAlcoPB1.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartFA1.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 0), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartFB1.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartH24_66.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartRF16.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 0), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartRF16B.item, 1), 1);

				for (ItemStack c : coal) {
					cm.addRecipe(2, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 1), dye, new ItemStack(ItemIDs.minecartTenderBR01_DB.item, 1), 1);
				}
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3),
						new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2),
						new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3),
						new ItemStack(ItemIDs.firebox.item, 2), null, dye,
						new ItemStack(ItemIDs.minecartLocoCoranationClass.item, 1), 1);
			}
			for (ItemStack dye : dyeOrange){
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartSW1.item, 1), 1);
			}
			for (ItemStack dye : dyeGray){
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartSW1200.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartFA2.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 0), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartFB2.item, 1), 1);
			}
			for (ItemStack dye : dyeLightBlue){
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartSW1500.item, 1), 1);
			}
			for(ItemStack dye : dyeGreen){
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3),
						new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2),
						new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 2),
						new ItemStack(ItemIDs.firebox.item, 2), null, dye,
						new ItemStack (ItemIDs.minecartLocoHallClass.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 2), dye, new ItemStack(ItemIDs.minecartVO1000.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartRF16.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 0), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartRF16B.item, 1), 1);

			}
			for (ItemStack dye : dyeBlack) {
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartS2.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item,3), dye, new ItemStack(ItemIDs.minecartSD9.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartRSD15.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4),
						new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2),
						new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3),
						new ItemStack(ItemIDs.firebox.item, 3), null, dye,
						new ItemStack(ItemIDs.minecartLocoBerk1225.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4),
						new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2),
						new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3),
						new ItemStack(ItemIDs.firebox.item, 3), null, dye,
						new ItemStack(ItemIDs.minecartLocoBerk765.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4),
						new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2),
						new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3),
						new ItemStack(ItemIDs.firebox.item, 3), null, dye,
						new ItemStack(ItemIDs.minecartLocoFowler.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartHH660.item, 1), 1);
				//cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 2), null, dye, new ItemStack(ItemIDs.minecartOnion.item, 1), 1);
				cm.addRecipe(2, new ItemStack(Blocks.iron_bars, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(Blocks.iron_bars, 2), null, null, new ItemStack(itemSteel, 3, itemDamageSteel), dye, new ItemStack(ItemIDs.minecart60centerbeam.item, 1), 1);
				//cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item, 3), null, dye, new ItemStack(ItemIDs.minecartPELocomotive.item, 1), 1);
				for (ItemStack c : coal) {
					cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4),
							new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null,
							new ItemStack(c.getItem(), 2), dye,
							new ItemStack(ItemIDs.minecarttenderBerk1225.item, 1), 1);
					cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3),
							new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null,
							new ItemStack(c.getItem(), 2), dye,
							new ItemStack(ItemIDs.minecartFowler4FTender.item, 1), 1);
					//cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 1), dye, new ItemStack(ItemIDs.minecartOnionTender.item, 1), 1);
					//cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 2), dye, new ItemStack(ItemIDs.minecartPETender.item, 1), 1);
				}

			}
			for (ItemStack dye : dyeGreen) {
				betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), dye, new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.electmotor.item, 3), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.minecartH1044.item, 1), 1);
			}
			//cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), null, new ItemStack(ItemIDs.minecartMILW_H1044.item, 1), 1);
			cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 2), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoBR01_DB.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoC62Class.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 2), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoD51Short.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 2), new ItemStack(ItemIDs.firebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoD51Long.item, 1), 1);
			for (ItemStack c: coal) {
				cm.addRecipe(2, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartTenderD51.item, 1), 1);
			}
			//cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 4), new ItemStack(ItemIDs.firebox.item, 2), null, null, new ItemStack(ItemIDs.minecartLoco4.item, 1), 1);
			//cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item, 2), null, null, new ItemStack(ItemIDs.minecartHeavySteam.item, 1), 1);//TODO put it back once Heavy Steam is back
			cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), null, new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.firebox.item, 1), new ItemStack(Blocks.rail, 16), null, new ItemStack(ItemIDs.minecartBuilder.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, null, new ItemStack(ItemIDs.minecartFlatCartSU.item, 1), 1);
			for (ItemStack dye : dyeGray) {
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartGP9.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartU23B.item, 1), 1);
				for (ItemStack bucketWater : waterbucket) {
					cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(bucketWater.getItem(), 1), dye, new ItemStack(ItemIDs.minecartTankWagon2.item, 1), 1);
				}
			}
			for (ItemStack dye : dyeOrange) {
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartU18B.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 6), dye, new ItemStack(ItemIDs.minecartE8A.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 6), dye, new ItemStack(ItemIDs.minecartE8B.item, 1), 1);
			}
			for (ItemStack dye : dyeCyan) {
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), null, new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartU18BB.item, 1), 1);
			}
			for (ItemStack dye : dyeWhite) {
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartU18BW.item, 1), 1);
			}
			for (ItemStack dye : dyeGreen) {
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartU30C.item, 1), 1);
			}
			cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2), null, new ItemStack(ItemIDs.minecartBoxCartUS.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2), null, new ItemStack(ItemIDs.minecartBoxCartPRR.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 1), null, new ItemStack(ItemIDs.minecartFreightL.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Items.wheat, 3), null, new ItemStack(ItemIDs.minecartFreightHopperUS.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.hopper, 3), null, new ItemStack(ItemIDs.minecartVersaLongi.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.hopper, 3), null, new ItemStack(ItemIDs.minecartVersaTrans.item, 1), 1);

			for (ItemStack dye : dyeWhite) {
				cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, dye, null, new ItemStack(ItemIDs.minecartShortCoveredHopper.item, 1), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null,dye, null, new ItemStack(ItemIDs.minecartLongCoveredHopper.item, 1), 1);
				cm.addRecipe(2, new ItemStack(Items.iron_ingot, 4), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 3), dye, new ItemStack(ItemIDs.minecartPS150.item, 1), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, new ItemStack(Blocks.chest, 4), new ItemStack(ItemIDs.minecartRibbedHopper.item), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null,dye, new ItemStack(Blocks.chest, 4), new ItemStack(ItemIDs.minecartHopper5201.item, 1), 1);
				cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null,dye, new ItemStack(Blocks.chest, 6), new ItemStack(ItemIDs.minecartHopper6260.item, 1), 1);
			}
			for (ItemStack dye : dyeCyan) {
				cm.addRecipe(2, new ItemStack(Items.iron_ingot, 4), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2), dye, new ItemStack(ItemIDs.minecartFNCC50Foot.item, 1), 1);
			}
			for (ItemStack dye : dyeYellow) {
				cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, dye, null, new ItemStack(ItemIDs.minecartKClassRailBox.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 4), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 4), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartCF7angle.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 4), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 4), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartCF7round.item, 1), 1);
				//cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 4), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 4), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartCF7R.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartGP7u.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartGP7.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartgtavthing.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 6), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartB23.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartGP15.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), null, null, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), null, dye, new ItemStack(ItemIDs.minecart44Ton.item, 1), 1);
			}
			for (ItemStack dye : dyeGreen) {
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 6), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartB30.item, 1), 1);
			}
			cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.minecartB23.item, 1), new ItemStack(itemSteel, 4, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, null, new ItemStack(ItemIDs.minecartSB23R.item, 1), 1);
			cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.minecartB23.item, 1), new ItemStack(itemSteel, 4, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, null, new ItemStack(ItemIDs.minecartSB23E.item, 1), 1);
			cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.hopper, 3), null, new ItemStack(ItemIDs.minecartFreight100TonHopper.item, 1), 1);
			for (ItemStack bucketWater : waterbucket) {
				cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(bucketWater.getItem(), 1), null, new ItemStack(ItemIDs.minecartTankWagonUS.item, 1), 1);
				for (ItemStack dye : dyeBlack) {
					cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(bucketWater.getItem(), 1), dye, new ItemStack(ItemIDs.minecart11000DOT111.item, 1), 1);
				}
				for (ItemStack dye : dyeGray) {
					cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, new ItemStack(bucketWater.getItem(), 1), new ItemStack(bucketWater.getItem(), 1), dye, new ItemStack(ItemIDs.minecart20600DOT111.item, 1), 1);
				}
				for (ItemStack dye : dyeBlack) {
					cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, new ItemStack(bucketWater.getItem(), 1), new ItemStack(bucketWater.getItem(), 1), new ItemStack(bucketWater.getItem(), 1), dye, new ItemStack(ItemIDs.minecart29080DOT111.item, 1), 1);
				}
				for (ItemStack dye : dyeWhite) {
					cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(bucketWater.getItem(), 1), dye, new ItemStack(ItemIDs.minecart17600DOT111.item, 1), 1);
				}
			}
			for (ItemStack c : coal) {
				cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 2), null, new ItemStack(ItemIDs.minecartTenderC62Class.item, 1), 1);
			}
			for (ItemStack dye : dyeBrown) {
				cm.addRecipe(2, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartPassenger8_1class_DB.item, 1), 1);
				cm.addRecipe(2, new ItemStack(Blocks.planks,6), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2),dye, new ItemStack(ItemIDs.minecart40highcube.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), null, null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), null, dye, new ItemStack(ItemIDs.minecart25Ton.item, 1), 1);
			}
			{
				cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2), null, new ItemStack(ItemIDs.minecartFreightWagon_DB.item, 1), 1); }
			{
				cm.addRecipe(2, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.crafting_table, 1), null, new ItemStack(ItemIDs.minecartMailWagon_DB.item, 1), 1); }
			{
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item, 2), null, null, new ItemStack(ItemIDs.minecartLocoEr.item, 1), 1); }
			for (ItemStack c : coal) {
				cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartTenderEr.item, 1), 1); }
			for (ItemStack c : coal) {
				cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2),
						new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null,
						null, null, new ItemStack(c.getItem(), 1), null,
						new ItemStack(ItemIDs.minecartLocoCoranationClassTender.item, 1), 1); }
			for (ItemStack c : coal) {
				cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 3),
						new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null,
						null, null, new ItemStack(c.getItem(), 1), null,
						new ItemStack(ItemIDs.minecart4000GallonTender.item, 1), 1); }
			for (ItemStack c : coal) {
				cm.addRecipe(2, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartTenderHeavy.item, 1), 1);
				//cm.addRecipe(2, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartSkookTender.item, 1), 1);
			}
			for (ItemStack rs : redstone) {
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 1, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 4), null, new ItemStack(ItemIDs.minecartNYTram.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 1, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 4), null, new ItemStack(ItemIDs.minecartPCH120Commute.item, 1), 1);
			}
			cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 1, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, null, null, new ItemStack(ItemIDs.minecartPassengerTramNY.item, 1), 1);
			cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 1, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.seats.item, 4), null, null, null, new ItemStack(ItemIDs.minecartPCH120Car.item, 1), 1);
			for (ItemStack dye : dyeLightGray) {
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 1, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.seats.item, 4), null, null, dye, new ItemStack(ItemIDs.minecartAmfleet.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 1, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.seats.item, 4), null, null, dye, new ItemStack(ItemIDs.minecartAmfleet2.item, 1), 1);
				cm.addRecipe(2,new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item,6),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 4, itemDamageSteel),new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item,2),new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item,4),new ItemStack(ItemIDs.generator.item,4), dye,new ItemStack(ItemIDs.minecartU36C.item,1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 6), dye, new ItemStack(ItemIDs.minecartE9A.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 6), dye, new ItemStack(ItemIDs.minecartE9B.item, 1), 1);
			}
			for (ItemStack dye : dyeLightBlue) {
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.seats.item, 4), null, null, dye, new ItemStack(ItemIDs.minecartPEcooch.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.seats.item, 4), null, null, dye, new ItemStack(ItemIDs.minecartPEobserve.item, 1), 1);
			}
			for(ItemStack iron : ingotIron) {
				cm.addRecipe(2, new ItemStack(iron.getItem(), 2), new ItemStack(ItemIDs.ironBogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), null, new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), null, null, new ItemStack(ItemIDs.minecartLocoA4Mallard.item, 1), 1);
			}
			for (ItemStack c : coal) {
				cm.addRecipe(2, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(Items.iron_ingot, 1), null, null, null, null, new ItemStack(c.getItem(), 1), null, new ItemStack(ItemIDs.minecartLocoA4MallardTender.item, 1), 1);
			}

			for (ItemStack i : s1) {
				for (ItemStack j : s2) {
					for (ItemStack iron : ingotIron) {
						cm.addRecipe(2, new ItemStack(i.getItem(), 3, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(iron.getItem(), 2, iron.getItemDamage()), null, null, null, null, new ItemStack(j.getItem(), 1, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartFreightWood2.item, 1), 1);
					}
				}
				cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(i.getItem(), 1, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartFreightCenterBeam_Wood_1.item, 1), 1);
				cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, null, new ItemStack(ItemIDs.minecartFlatCartWoodUS.item, 1), 1);
				cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(i.getItem(), 1, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartFreightCenterBeam_Wood_2.item, 1), 1);
				cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(i.getItem(), 1, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartFreightCenterBeam_Empty.item, 1), 1);

				for (ItemStack dye : dyeRed) {
					cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.crafting_table, 1), dye, new ItemStack(ItemIDs.minecartCabooseWork.item, 1), 1);
					cm.addRecipe(2, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, new ItemStack(Blocks.chest, 4), new ItemStack(ItemIDs.minecartRoundHopper.item), 1);
				}
				cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.woodenFrame.item, 2), new ItemStack(Items.stick, 2), null, new ItemStack(ItemIDs.woodenCab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), null, new ItemStack(ItemIDs.minecartPassengerDBOriental.item, 1), 1);

				cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Items.leather, 1), null, new ItemStack(ItemIDs.minecartStockCar.item, 1), 1);
				cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Items.leather, 1), null, new ItemStack(ItemIDs.minecartDRWGStockCar.item, 1), 1);
				cm.addRecipe(2, new ItemStack(i.getItem(), 6, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), null, null, null, null, new ItemStack(Items.leather, 2), null, new ItemStack(ItemIDs.minecartStampedeRack.item, 1), 1);
				cm.addRecipe(2, new ItemStack(i.getItem(), 3, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, null, new ItemStack(ItemIDs.minecartFlatCartUS.item, 1), 1);
				for (ItemStack dye : dyeCyan) {
					cm.addRecipe(2, new ItemStack(i.getItem(), 3, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, dye, new ItemStack(ItemIDs.minecartGSC60FootFlatcar.item, 1), 1);
				}
				for (ItemStack dye : dyeBlue) {
					cm.addRecipe(2, new ItemStack(i.getItem(), 3, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(i.getItem(), 3, OreDictionary.WILDCARD_VALUE), null, null, null, new ItemStack(i.getItem(), 3, OreDictionary.WILDCARD_VALUE), dye, new ItemStack(ItemIDs.minecartGSI60FootBulkhead.item, 1), 1);
				}
			}
			for (ItemStack dye : dyeGreen) {
				cm.addRecipe(2, new ItemStack(Blocks.iron_bars, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(Blocks.iron_bars, 2), null, null, new ItemStack(itemSteel, 2, itemDamageSteel), dye, new ItemStack(ItemIDs.minecartthrall63centerbeam.item, 1), 1);
			}
			for (ItemStack dye : dyeOrange) {
				cm.addRecipe(2, new ItemStack(Blocks.planks, 4), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.ironFrame.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(Blocks.iron_bars, 4), null, null, new ItemStack(Blocks.chest, 2), dye, new ItemStack(ItemIDs.minecartMILW40boxcar.item, 1), 1);
				cm.addRecipe(2, new ItemStack(Blocks.iron_bars, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(Blocks.iron_bars, 2), null, null, new ItemStack(itemSteel, 2, itemDamageSteel), dye, new ItemStack(ItemIDs.minecart66centerbeam.item, 1), 1);
				cm.addRecipe(2, new ItemStack(ItemIDs.copperWireFine.item, 6), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 3), new ItemStack(ItemIDs.transformer.item, 3), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.controls.item, 2), dye, new ItemStack(ItemIDs.minecartEP1A.item, 1), 1);
			}
			for (ItemStack dye : dyePink) {
				cm.addRecipe(2, new ItemStack(Blocks.iron_bars, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(Blocks.iron_bars, 3), null, null, new ItemStack(itemSteel, 4, itemDamageSteel), dye, new ItemStack(ItemIDs.minecart73centerbeam.item, 1), 1);
			}
			cm.addRecipe(2, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(Blocks.furnace, 1), new ItemStack(Blocks.crafting_table, 1), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.minecartDRGWCaboose.item, 1), 1);
			for (ItemStack dye : dyeCyan) {
				cm.addRecipe(2, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(Blocks.furnace, 1), new ItemStack(Blocks.crafting_table, 1), dye, new ItemStack(ItemIDs.minecartHBC1Ccaboose.item, 1), 1);
			}
			for(ItemStack dye : dyeMagenta){
				cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 6), dye, new ItemStack(ItemIDs.minecartE7A.item, 1), 1);
				cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 6), dye, new ItemStack(ItemIDs.minecartE7B.item, 1), 1);
			}

			//=================== TIER III =================//
			for (ItemStack dye : dyeWhite){
				for (ItemStack rs : redstone) {
					cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(rs.getItem(), 4), dye, new ItemStack(ItemIDs.minecartGM6C.item, 1), 1);
				}
			}
			for (ItemStack dye : dyeRed) {
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 8), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transmition.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), null, dye, new ItemStack(ItemIDs.minecartKof_DB.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel),null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transmition.item, 1), new ItemStack(ItemIDs.dieselengine.item, 3), null, dye, new ItemStack(ItemIDs.minecartV60_DB.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartLocoSD40.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item,5), dye, new ItemStack(ItemIDs.minecartSD70Mac.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2), dye, new ItemStack(ItemIDs.minecartFreightWellcar.item, 1), 1);
				for (ItemStack rs : redstone) {
					cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2),
							new ItemStack(ItemIDs.steelframe.item, 2), null, null, new ItemStack(ItemIDs.steelcab.item, 1),
							new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2),
							new ItemStack(rs.getItem(), 4), dye, new ItemStack(ItemIDs.minecartLocoBR185.item, 1), 1);
				}
				cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2),
						new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null,
						null, null, null, new ItemStack(Blocks.crafting_table, 1), dye,
						new ItemStack(ItemIDs.minecartCabooseLoggingPRR.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2), dye, new ItemStack(ItemIDs.minecartHeavyweightMailcar.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 2), dye, new ItemStack(ItemIDs.minecartHeavyweightFreight.item, 1), 1);
			}
			for (ItemStack rs : redstone) {
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 1, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 4), null, new ItemStack(ItemIDs.minecartLocoHighSpeedZeroED.item, 1), 1);
			}
			cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, null, new ItemStack(ItemIDs.minecartPassengerHighSpeedCarZeroED.item, 1), 1);

			for (ItemStack dye : dyeOrange){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 6), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartMP15DCW9.item, 1), 1);
				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), null,null, new ItemStack(ItemIDs.steelcab.item,1),null, null,new ItemStack(ItemIDs.seats.item,1), dye,new ItemStack(ItemIDs.minecartGS4_Passenger.item,1), 1);
				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), null,null, new ItemStack(ItemIDs.steelcab.item,1),null, null,new ItemStack(ItemIDs.seats.item,1), dye,new ItemStack(ItemIDs.minecartGS4_Tail.item,1), 1);
				cm.addRecipe(3,new ItemStack(Blocks.glass,1), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), null,null, new ItemStack(ItemIDs.steelcab.item,1),null, null,new ItemStack(ItemIDs.seats.item,1), dye,new ItemStack(ItemIDs.minecartGS4_Observatory.item,1), 1);
				for (ItemStack c : coal) {
					cm.addRecipe(3, new ItemStack(c.getItem(), 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), null, null, null, null, null, null, dye, new ItemStack(ItemIDs.minecartGS4_Tender.item, 1), 1);
				}
				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), null,null, null,null, null,new ItemStack(Blocks.chest,2), dye,new ItemStack(ItemIDs.minecartGS4_Baggage.item,1), 1);
				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,4),new ItemStack(ItemIDs.steelframe.item,1), null,new ItemStack(ItemIDs.steelchimney.item,1), new ItemStack(ItemIDs.steelcab.item,1),new ItemStack(ItemIDs.boiler.item,4), new ItemStack(ItemIDs.firebox.item,1),null, dye,new ItemStack(ItemIDs.minecartGS4_Loco.item,1), 1);

				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), null,null, new ItemStack(ItemIDs.steelcab.item,1),null, null,new ItemStack(ItemIDs.seats.item,1), dye,new ItemStack(ItemIDs.minecartPassengerMILW.item,1), 1);
				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), null,null, new ItemStack(ItemIDs.steelcab.item,1),null, null,new ItemStack(ItemIDs.seats.item,1), dye,new ItemStack(ItemIDs.minecartPassengerMILWTail.item,1), 1);
				for (ItemStack c : coal) {
					cm.addRecipe(3, new ItemStack(c.getItem(), 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), null, null, null, null, null, null, dye, new ItemStack(ItemIDs.minecartMILWTender.item, 1), 1);
				}
				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), null,null, null,null, null,new ItemStack(Blocks.chest,2), dye,new ItemStack(ItemIDs.minecartBaggageMILW.item,1), 1);
				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,4),new ItemStack(ItemIDs.steelframe.item,1), null,new ItemStack(ItemIDs.steelchimney.item,1), new ItemStack(ItemIDs.steelcab.item,1),new ItemStack(ItemIDs.boiler.item,3), new ItemStack(ItemIDs.firebox.item,1),null, dye,new ItemStack(ItemIDs.minecartLocoMILWClassA.item,1), 1);

				cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,8),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 2, itemDamageSteel),new ItemStack(ItemIDs.steelchimney.item,2), new ItemStack(ItemIDs.steelcab.item,1),new ItemStack(ItemIDs.electmotor.item,8), new ItemStack(ItemIDs.dieselengine.item,11),new ItemStack(ItemIDs.generator.item,4), dye,new ItemStack(ItemIDs.minecartLocoDD35B.item,1), 1);
				cm.addRecipe(3,new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item,8),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 2, itemDamageSteel),new ItemStack(ItemIDs.steelchimney.item,2), new ItemStack(ItemIDs.steelcab.item,1),new ItemStack(ItemIDs.electmotor.item,8), new ItemStack(ItemIDs.dieselengine.item,11),new ItemStack(ItemIDs.generator.item,4), dye,new ItemStack(ItemIDs.minecartLocoDD35A.item,1), 1);
			}

			for (ItemStack dye : dyeWhite) {
				for (ItemStack rs : redstone) {
					//cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), null, null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(rs.getItem(), 4), dye, new ItemStack(ItemIDs.minecartICE1_Loco.item, 1), 1);
				}
				//cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), null, null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartICE1_1stClass.item, 1), 1);
				//cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), null, null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartICE1_2ndClass.item, 1), 1);
				//cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), null, null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartICE1_Restaurant.item, 1), 1);
			}

			//cm.addRecipe(3,new ItemStack(ItemIDs.controls.item,2),new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2),null,null,new ItemStack(ItemIDs.steelcab.item, 1),new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 4), null,new ItemStack(ItemIDs.minecartLocoEMDF7.item, 1),1);
			//cm.addRecipe(3,new ItemStack(ItemIDs.controls.item,2),new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2),null,null,new ItemStack(ItemIDs.steelcab.item, 1),new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 4),null,new ItemStack(ItemIDs.minecartLocoEMDF3.item, 1),1);
			//cm.addRecipe(3,null,new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2),null,null,null,new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 4),null,new ItemStack(ItemIDs.minecartLocoEMDF7B.item, 1),1);
			//cm.addRecipe(3,null,new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2),null,null,null,new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 4),null,new ItemStack(ItemIDs.minecartLocoEMDF3B.item, 1),1);
			for (ItemStack dye : dyeYellow) {
				cm.addRecipe(3, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 6, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 4), dye, new ItemStack(ItemIDs.minecarthicube60foot.item, 1), 1);
			}
			cm.addRecipe(3, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 6, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 4), new ItemStack(Blocks.ice, 16), new ItemStack(ItemIDs.minecartReefer64.item, 1), 1);
			cm.addRecipe(3,new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item,8),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 2, itemDamageSteel),null, new ItemStack(ItemIDs.steelcab.item,1),new ItemStack(ItemIDs.electmotor.item,2), new ItemStack(ItemIDs.dieselengine.item,4),new ItemStack(ItemIDs.generator.item,4), null,new ItemStack(ItemIDs.minecartLocoFOLM1.item,1), 1);
			cm.addRecipe(3,null, new ItemStack(ItemIDs.bogie.item,8),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 2, itemDamageSteel),null, new ItemStack(ItemIDs.steelcab.item,1),new ItemStack(ItemIDs.electmotor.item,2), new ItemStack(ItemIDs.dieselengine.item,4),new ItemStack(ItemIDs.generator.item,4), null,new ItemStack(ItemIDs.minecartFOLM1B.item,1), 1);
			//cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,3), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 1), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item,4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(Item.redstone, 4), new ItemStack(Items.dye, 1, 8), new ItemStack(ItemIDs.minecartNewHighSpeedLoco.item, 1), 1);

			/*cm.addRecipe(3, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1),
					new ItemStack(itemSteel, 3), null, null, null, new ItemStack(ItemIDs.seats.item, 8), null, null,
					new ItemStack(ItemIDs.minecartIC4_DSB_FG.item, 1), 1);
			cm.addRecipe(3, null, new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1),
					new ItemStack(itemSteel, 3), null, null, null, new ItemStack(ItemIDs.seats.item, 8), null, null,
					new ItemStack(ItemIDs.minecartIC4_DSB_FH.item, 1), 1);
			cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 4), null, new ItemStack(ItemIDs.minecartIC4_DSB_MG.item, 1), 1);*/

			for (ItemStack dye : dyeGreen) {
				for (ItemStack rs : redstone) {
					cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 2), dye, new ItemStack(ItemIDs.minecartVL10.item, 1), 1);
					cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), new ItemStack(rs.getItem(), 2), dye, new ItemStack(ItemIDs.minecartBR_E69.item, 1), 1);
				}
			}

			for (ItemStack dye : dyeOrange) {
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartLocoSD70.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartSDL39.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 8), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartFP45.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartDash840C.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2), new ItemStack(itemSteel, 2, itemDamageSteel),null, null,null, null,new ItemStack(Blocks.chest,4), dye,new ItemStack(ItemIDs.minecartACFGNRPO_30.item,1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartACFGN60SeatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartACFGNDiner_Observation.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartACFGN28SeatCoach_Dinette.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartBuddNYC52SeatCoach.item, 1), 1);
			}
			for (ItemStack dye : dyeBlue) {
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartDash840B.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.seats.item, 6), null, dye, new ItemStack(ItemIDs.minecartBuddDome54SeatCoach.item, 1), 1);
			}
			for (ItemStack dye : dyeCyan) {
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 4), null, dye, new ItemStack(ItemIDs.minecartBuddATSF48SeatCoach.item, 1), 1);
			}
			for (ItemStack dye : dyeLightGray){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartDash840BW.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), null, new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartDash840BB.item, 1), 1);
			}
			for(ItemStack dye : dyeGreen){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2), null, dye, new ItemStack(ItemIDs.minecartLocoBP4.item, 1), 1);
				cm.addRecipe(3,new ItemStack(ItemIDs.controls.item,2),new ItemStack(ItemIDs.bogie.item,4),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 3, itemDamageSteel),null,new ItemStack(ItemIDs.steelcab.item, 1),new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 4), null,new ItemStack(ItemIDs.minecartF7A.item, 1),1);
				cm.addRecipe(3,null,new ItemStack(ItemIDs.bogie.item,4),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 3, itemDamageSteel),null,new ItemStack(ItemIDs.steelcab.item, 1),new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 4), null,new ItemStack(ItemIDs.minecartF7B.item, 1),1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 8), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartSD45dash2.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 6), null, dye, new ItemStack(ItemIDs.minecartOB84SeatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 7), null, dye, new ItemStack(ItemIDs.minecartOB92SeatCoach.item, 1), 1);
			}
			for(ItemStack dye : dyeYellow) {
				betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 5), new ItemStack(ItemIDs.steelcab.item, 3), dye, new ItemStack(ItemIDs.generator.item, 5), new ItemStack(ItemIDs.electmotor.item, 3), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartSF30C.item), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 8), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartSD45dash2B.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, dye, new ItemStack(ItemIDs.minecartGunderson89ftFlat.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), dye, new ItemStack(ItemIDs.minecartGunderson89ftAutorack.item, 1), 1);
			}
			for (ItemStack dye : dyeLime){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 6), new ItemStack(ItemIDs.bogie.item, 5) ,new ItemStack(ItemIDs.steelframe.item, 5),  new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 3),new ItemStack(ItemIDs.electmotor.item, 4),new ItemStack(ItemIDs.dieselengine.item, 5),new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartES44.item,1), 1);
			}
			for (ItemStack dye : dyeBlack) {
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartC425.item, 1), 1);
				cm.addRecipe(3,new ItemStack(ItemIDs.controls.item,2),new ItemStack(ItemIDs.bogie.item,4),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 3, itemDamageSteel),null,new ItemStack(ItemIDs.steelcab.item, 1),new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 4), null,new ItemStack(ItemIDs.minecartFP7A.item, 1),1);
			}

			cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.hopper, 1), null, new ItemStack(ItemIDs.minecartOpenWagon.item, 1), 1);
			cm.addRecipe(3, new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.hopper, 1), null, new ItemStack(ItemIDs.minecartFreightGTNG.item, 1), 1);
			cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2),new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null,null, null, null, new ItemStack(Blocks.jukebox, 1), null, new ItemStack(ItemIDs.minecartJukeBoxCart.item, 1), 1);

			for (ItemStack dye: dyeYellow){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2), new ItemStack(itemSteel, 2, itemDamageSteel),new ItemStack(ItemIDs.steelchimney.item,2), new ItemStack(ItemIDs.steelcab.item,2),new ItemStack(ItemIDs.electmotor.item,2), new ItemStack(ItemIDs.transformer.item,2),null, dye,new ItemStack(ItemIDs.minecartE103.item,1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartC424.item, 1), 1);
				//  cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, dye, new ItemStack(ItemIDs.minecartHuskyStackWellcar.item, 1),1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 3), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 6), dye, new ItemStack(ItemIDs.minecartNRE3gs21b.item, 1), 1);

			}

			for (ItemStack dye : dyeBlue) {
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2), new ItemStack(itemSteel, 2, itemDamageSteel),new ItemStack(ItemIDs.steelchimney.item,2), new ItemStack(ItemIDs.steelcab.item,1),new ItemStack(ItemIDs.electmotor.item,1), new ItemStack(ItemIDs.transformer.item,2),null, dye,new ItemStack(ItemIDs.minecartE10_DB.item,1), 1);
				cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), null, null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartPassengerRheingold.item, 1), 1);
				cm.addRecipe(3, new ItemStack(Blocks.glass,1), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), null, null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(ItemIDs.seats.item, 1), dye, new ItemStack(ItemIDs.minecartPassengerRheingoldPanorama.item, 1), 1);
				cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), null, null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(Blocks.crafting_table, 1), dye, new ItemStack(ItemIDs.minecartPassengerRheingoldDining1.item, 1), 1);
				cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), null, null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(Blocks.crafting_table, 1), dye, new ItemStack(ItemIDs.minecartPassengerRheingoldDining2.item, 1), 1);
				cm.addRecipe(3,new ItemStack(ItemIDs.controls.item,2),new ItemStack(ItemIDs.bogie.item,4),new ItemStack(ItemIDs.steelframe.item,3), new ItemStack(itemSteel, 3, itemDamageSteel),null,new ItemStack(ItemIDs.steelcab.item, 1),new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.generator.item, 4), null,new ItemStack(ItemIDs.minecartFP9A.item, 1),1);
				cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 1), null, dye, new ItemStack(ItemIDs.minecartPassengerBlue.item, 1), 1);
				for (ItemStack bucketWater : waterbucket) {
					cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(bucketWater.getItem(), 1), dye, new ItemStack(ItemIDs.minecartTankWagon_DB.item, 1), 1);
				}
				for (ItemStack rs : redstone) {
					cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 1, itemDamageSteel),  new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1),  new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.electmotor.item, 2),  new ItemStack(rs.getItem(), 2), dye, new ItemStack(ItemIDs.minecartLocoClass85.item, 1), 1);
				}
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPS52seatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(Blocks.chest, 3), new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartPScombine.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPSCenterDiner.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPSDamnitAnotherDiner.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), null,null, null,null, null,new ItemStack(Blocks.chest,2), dye,new ItemStack(ItemIDs.minecartPS73Baggage.item,1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2), null,null, null,null, null,new ItemStack(Blocks.chest,2), dye,new ItemStack(ItemIDs.minecartPS85Baggage.item,1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), new ItemStack(Items.bed, 1), dye, new ItemStack(ItemIDs.minecartPSSleeper565.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), new ItemStack(itemSteel, 1, itemDamageSteel),null, null,null, null,new ItemStack(Blocks.chest,4), dye,new ItemStack(ItemIDs.minecartPSRPOPM.item,1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,1), new ItemStack(itemSteel, 2, itemDamageSteel),null, null,null, null,new ItemStack(Blocks.chest,4), dye,new ItemStack(ItemIDs.minecartPSRPO.item,1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 4), null, dye, new ItemStack(ItemIDs.minecartPSLunchCounter_Lounge.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartPS30SeatParlor.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPS54SeatCoach_Lounge.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 6), null, dye, new ItemStack(ItemIDs.minecartPS58SeatCoach_Observation.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartBuddRDG56SeatCoachLounge.item, 1), 1);
			}
			for(ItemStack dye: dyeMagenta){
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(Blocks.chest, 3), new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartPSBMCombine.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPSBM56SeatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 4), null, dye, new ItemStack(ItemIDs.minecartPSBMDiner_Lounge.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPSBM56SeatCoach.item, 1), 1);
			}
			for (ItemStack dye : dyeYellow){
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), new ItemStack(Items.bed, 1), dye, new ItemStack(ItemIDs.minecartPSSleeper565DRGW.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPSCNW56SeatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 4), null, dye, new ItemStack(ItemIDs.minecartPSCNW48SeatCoachLounge.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 2), null, dye, new ItemStack(ItemIDs.minecartPSCNW20SeatCoachLounge.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartPSCNW36SeatCoach_Dinette.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 5, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPSCNW56SeatDiner.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 5, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 4), null, dye, new ItemStack(ItemIDs.minecartPSCNW48SeatDiner.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 5, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 2), null, dye, new ItemStack(ItemIDs.minecartPSCNW1DR_22SeatParlor.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 5, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 2), new ItemStack(Items.bed, 1), dye, new ItemStack(ItemIDs.minecartPSCNW16_1_3Sleeper.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 2), null, dye, new ItemStack(ItemIDs.minecartPSCNW12SeatParlor_Observation.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2), new ItemStack(itemSteel, 1, itemDamageSteel),null, null,null, null,new ItemStack(Blocks.chest,4), dye,new ItemStack(ItemIDs.minecartPSCNWRPO15.item,1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2), new ItemStack(itemSteel, 4, itemDamageSteel),null, null,null, null,new ItemStack(Blocks.chest,4), dye,new ItemStack(ItemIDs.minecartPSCNWRPO60.item,1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item,2),new ItemStack(ItemIDs.steelframe.item,2), new ItemStack(itemSteel, 4, itemDamageSteel),null, null,null, null,new ItemStack(Blocks.chest,4), dye,new ItemStack(ItemIDs.minecartACFUPRPO60.item,1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(Blocks.chest, 3), new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartPSCNWBaggage_LC_Lounge.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(Blocks.chest, 3), new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartPSCNWRPO15_Baggage_LC_Lounge.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(Blocks.chest, 3), new ItemStack(ItemIDs.seats.item, 4), null, dye, new ItemStack(ItemIDs.minecartPSCNWBaggage_LC_Diner.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 2), null, dye, new ItemStack(ItemIDs.minecartPSCNW20SeatCoachLounge_1959.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 5, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPSCNWCommuterLounge.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartPSCNW27SeatParlor_Observation.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartBuddCBQ52SeatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartBuddATSF52SeatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartBuddATSF50SeatCoachObservation.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 3), null, dye, new ItemStack(ItemIDs.minecartBuddATSF34SeatParlorObservation.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartBuddATSF58SeatCoachObservation.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPSATSF50SeatCoachObservation.item, 1), 1);
			}

			for (ItemStack dye: dyePurple){
				//cm.addRecipe(3, new ItemStack(itemSteel, 2 ,itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.copperWireFine.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(Items.redstone,5), dye,  new ItemStack(ItemIDs.minecartClass345engine.item, 1),1);
				//cm.addRecipe(3, new ItemStack(itemSteel, 2 ,itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.copperWireFine.item, 4), null, new ItemStack(ItemIDs.electmotor.item, 1), new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(Items.redstone,2), dye,  new ItemStack(ItemIDs.minecartClass345car.item, 1),1);
				//cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 3), dye, new ItemStack(ItemIDs.minecartC415H.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartPS54SeatCoach_Lounge_1950.item, 1), 1);
			}

			for (ItemStack dye: dyeBrown){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartC415H.item, 1), 1);
			}
			for (ItemStack dye: dyeGreen){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartC415S.item, 1), 1);
			}
			for (ItemStack dye: dyeYellow){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.generator.item, 2), dye, new ItemStack(ItemIDs.minecartC415L.item, 1), 1);
			}
			for (ItemStack dye : dyeYellow){
				cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), null, null, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(Blocks.chest, 1), dye, new ItemStack(ItemIDs.minecartFreightGermanPost.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartGP38dash2.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item,5), dye, new ItemStack(ItemIDs.minecartGP49.item, 1), 1);
			}
			for (ItemStack dye : dyeWhite){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 4), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartGP38h3.item, 1), 1);
			}
			for (ItemStack dye : dyeBlack){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,3), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,4), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartGP40tc.item, 1), 1);
			}

			for (ItemStack dye : dyeGray){
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 6),new ItemStack(ItemIDs.bogie.item, 5),new ItemStack(ItemIDs.steelframe.item, 5),new ItemStack(itemSteel, 2, itemDamageSteel),new ItemStack(ItemIDs.seats.item, 2),new ItemStack(ItemIDs.steelcab.item, 2),new ItemStack(BlockIDs.assemblyTableIII.block, 2),new ItemStack(Blocks.daylight_detector, 2),new ItemStack(ItemIDs.electronicCircuit.item, 6),dye,new ItemStack(ItemIDs.minecartGeometryCar.item, 1), 1);
				cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), null, new ItemStack(ItemIDs.steelcab.item, 2), null, null, null, new ItemStack(ItemIDs.seats.item, 2), dye, new ItemStack(ItemIDs.minecartPCH100HCoach.item, 1),1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 4), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartF40PH.item, 1), 1);
				//cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartSD40dash2.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartSD40T2.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartBuddCRIP52SeatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.seats.item, 5), null, dye, new ItemStack(ItemIDs.minecartBuddDome46SeatCoach.item, 1), 1);
				cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.seats.item, 6), null, dye, new ItemStack(ItemIDs.minecartBuddCBQDome50SeatCoach.item, 1), 1);
			}

			for (ItemStack dye : dyeLightBlue) {
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartSDP40F.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 8), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartF45.item, 1), 1);
			}

			cm.addRecipe(3, null,null, new ItemStack(ItemIDs.minecartGP38dash2.item, 1), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 4), null, null, null, null, new ItemStack(ItemIDs.minecartGP38dash9W.item, 1), 1);
			cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.rail, 1), null, new ItemStack(ItemIDs.minecartFlatCartRail_DB.item, 1), 1);
			cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, null, new ItemStack(ItemIDs.minecartFlatCart_DB.item, 1), 1);
			cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), null, null, null, null, null, null, new ItemStack(ItemIDs.minecartBulkheadFlatCart.item, 1), 1);
			cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, null, new ItemStack(ItemIDs.minecartFreightDepressedFlatbed.item, 1), 1);
			cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.hopper, 1), null, new ItemStack(ItemIDs.minecartFreightGondola_DB.item, 1), 1);
			cm.addRecipe(3, new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 4, itemDamageSteel), null, null, null, null, null, null, new ItemStack(ItemIDs.minecartASTFAutorack.item, 1), 1);

			for (ItemStack dye : dyeLightGray) {
				cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Blocks.chest, 1), dye, new ItemStack(ItemIDs.minecartFreightTrailer.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartGP30.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartSD40dash2.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 4), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.generator.item, 4), dye, new ItemStack(ItemIDs.minecartDash944CW.item, 1), 1);
			}
			for (ItemStack j : s2) {
				cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(j.getItem(), 1, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartFlatCartLogs_DB.item, 1), 1);
				//cm.addRecipe(3, new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(j.getItem(), 1, OreDictionary.WILDCARD_VALUE), null, new ItemStack(ItemIDs.minecartLogcarNP.item, 1), 1);
			}
			for (ItemStack dye : dyeGray) {
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.transmition.item,2), dye, new ItemStack(ItemIDs.minecartKrautt.item, 1), 1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.transmition.item,2), dye, new ItemStack(ItemIDs.minecartDH643.item, 1), 1);
			}

			//JCIR-Traincraft Recipies:
			//cm.addRecipe(3, new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.bogie.item, 3),
			// new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1),
			// new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item,6), new ItemStack(ItemIDs.dieselengine.item, 6),
			// new ItemStack(ItemIDs.generator.item,4), dye, new ItemStack(ItemIDs.minecartLocoSD40.item, 1), 1);

			//Tier 1: Iron Age

			//Tier 2: Steel Age
			for (ItemStack steel : ingotSteel) {
				Item theSteel = steel.getItem();
				for (ItemStack grey : dyeGray) {
					//betterAddRecipe(2, new ItemStack(theSteel, 4), null, new ItemStack(ItemIDs.steelcab.item, 2), grey, new ItemStack(ItemIDs.seats.item, 3), null, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item), new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.minecartAmfleet.item), 1);
					//betterAddRecipe(2, new ItemStack(theSteel, 4), null, new ItemStack(ItemIDs.steelcab.item, 2), grey, new ItemStack(ItemIDs.seats.item, 3), null, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item), new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(ItemIDs.minecartAmfleet2.item), 1);
					//cm.addRecipe(2, new ItemStack(theSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(theSteel, 2), null, new ItemStack(ItemIDs.steelcab.item, 2), null, null, new ItemStack(ItemIDs.seats.item, 3), grey, new ItemStack(ItemIDs.minecartAmfleet.item, 1), 1);
					//cm.addRecipe(2, new ItemStack(theSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, null, new ItemStack(Blocks.chest, 4), new ItemStack(ItemIDs.minecartRibbedHopper.item), 1);
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), grey, new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.minecartU23B.item, 1), 1);
					//	betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 5), new ItemStack(theSteel, 2), new ItemStack(ItemIDs.steelcab.item, 2), grey, new ItemStack(ItemIDs.electronicCircuit.item, 8), new ItemStack(ItemIDs.seats.item, 2), new ItemStack(ItemIDs.transformer.item, 1),  new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(theSteel, 2), new ItemStack(ItemIDs.minecartGeometryCar.item, 1), 1);
					//betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), grey, new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.electmotor.item, 4),  new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.minecartMP15DCW9.item, 1), 1);
					//cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), grey, new ItemStack(ItemIDs.minecartGP9.item, 1), 1);
					//cm.addRecipe(2, new ItemStack(itemSteel, 8, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), null, null, null, null, new ItemStack(Items.bucket, 2), grey, new ItemStack(ItemIDs.minecart20600DOT111.item, 1), 1);
				}
				for (ItemStack black : dyeBlack) {
					//betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), black, new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.electmotor.item, 3), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.minecartS2.item, 1), 1);
					//betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 4), new ItemStack(ItemIDs.steelcab.item), black, new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.electmotor.item,4 ), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartSD9.item), 1);
				}
				for (ItemStack lightBlue : OreDictionary.getOres("dyeLightBlue")) {
					//betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), lightBlue, new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.electmotor.item, 4),  new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.minecartSW1500.item, 1), 1);
					betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.steelchimney.item, 3), new ItemStack(ItemIDs.steelcab.item, 4), lightBlue, new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartSDP40F.item), 1);
					betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 4), new ItemStack(ItemIDs.steelcab.item, 3), lightBlue, new ItemStack(ItemIDs.generator.item,  4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item,  4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartF3A.item), 1);
				}

				for (ItemStack green : dyeGreen) {
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.steelchimney.item, 3), new ItemStack(ItemIDs.steelcab.item, 2), green, new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartSD45dash2.item), 1);
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.steelchimney.item, 3), null, green, new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartSD45dash2B.item), 1);
				}

				for (ItemStack yellow: dyeYellow) {
					betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), yellow, new ItemStack(ItemIDs.seats.item, 1), new ItemStack(ItemIDs.transmition.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 2),null, new ItemStack(ItemIDs.minecartHighrailTruck.item, 1), 1);
					betterAddRecipe(2, null, null, new ItemStack(ItemIDs.steelcab.item, 2),null , new ItemStack(ItemIDs.minecartHighrailTruck.item, 1), null, null, null, null,null, new ItemStack(ItemIDs.minecartHighrailVan.item, 1), 1);
					//betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 6), new ItemStack(ItemIDs.steelcab.item), yellow, new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartCF7.item), 1);
					//after this book does not register any recipes and crashes
					//betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), yellow, new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.electmotor.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 2),new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartHustler.item, 1), 1);
				}

				for (ItemStack lightGrey: dyeLightGray) {
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.atoCard.item, 1), new ItemStack(ItemIDs.steelcab.item, 2), lightGrey, new ItemStack(ItemIDs.electronicCircuit.item, 4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4),new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.minecartPCH120Commute.item, 1), 1);
					betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 6), new ItemStack(ItemIDs.steelcab.item, 5), lightGrey, new ItemStack(ItemIDs.generator.item,  6), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.bogie.item,  6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartE9A.item), 1);
					betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.steelchimney.item, 6), new ItemStack(ItemIDs.steelcab.item, 5), lightGrey, new ItemStack(ItemIDs.generator.item,  6), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.bogie.item,  6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartE9B.item), 1);
					betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), lightGrey, new ItemStack(ItemIDs.generator.item, 6), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.minecartU36C.item, 1), 1);
				}

				for (ItemStack white: dyeWhite) {
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 4), null, white, null, new ItemStack(ItemIDs.transmition.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartSF30C.item, 1), 1);
					//betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 6), new ItemStack(ItemIDs.steelcab.item, 3), white, new ItemStack(ItemIDs.generator.item,  4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item,  4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartF7A.item), 1);
					//betterAddRecipe(2, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.steelchimney.item, 6), new ItemStack(ItemIDs.steelcab.item, 3), white, new ItemStack(ItemIDs.generator.item,  4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item,  4), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartF7B.item), 1);
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.steelchimney.item, 3), new ItemStack(ItemIDs.steelcab.item, 3), white, new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 3), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartGeGenesis.item), 1);
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), white, new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.minecartGP30.item, 1), 1);
					//cm.addRecipe(3, new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), null, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.seats.item, 9), null, null, new ItemStack(ItemIDs.minecartAipkitExplorer2.item, 1), 1);
				}

				for (ItemStack orange: dyeOrange) {
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.steelchimney.item, 4), new ItemStack(ItemIDs.steelcab.item, 1), orange, null, new ItemStack(ItemIDs.transmition.item), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), steel,new ItemStack(ItemIDs.minecartSW1.item, 1), 1);
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 2), orange, new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.electmotor.item, 3), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartSDL39.item), 1);
					//	betterAddRecipe(3, new ItemStack(ItemIDs.controls.));
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 3), new ItemStack(ItemIDs.steelchimney.item, 3), new ItemStack(ItemIDs.steelcab.item, 4), orange, new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.minecartFP45.item), 1);
					//betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 4), new ItemStack(ItemIDs.steelchimney.item, 4), new ItemStack(ItemIDs.steelcab.item, 4), orange, new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 4),  new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.bogie.item, 3), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.minecartMP15DCW9.item, 1), 1);
				}


				for (ItemStack red: dyeRed) {
					for (ItemStack orange:dyeOrange) {
						for (ItemStack purple: dyeMagenta) {
							for (ItemStack yellow: dyeYellow) {
								for (ItemStack blue: dyeBlue) {
									for (ItemStack green: dyeGreen) {
										betterAddRecipe(3, red, orange, purple, new ItemStack(Blocks.portal, 32), yellow, new ItemStack(ItemIDs.minecartThanos.item), blue, new ItemStack(Items.golden_horse_armor), green, new ItemStack(ItemIDs.minecartBuilder.item), new ItemStack(ItemIDs.minecartThanos.item), 1);
									}
								}
							}
						}
					}
				}
			}


			//Tier 3: Advanced Age
			for (ItemStack dye : dyeLightBlue){
				cm.addRecipe(3, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), null, new ItemStack(ItemIDs.steelcab.item, 2), null, null, null, new ItemStack(ItemIDs.seats.item, 2), dye, new ItemStack(ItemIDs.minecartPCH100HCoach.item, 1),1);
				cm.addRecipe(3, new ItemStack(ItemIDs.controls.item, 4), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.electronicCircuit.item, 3), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(Items.bucket, 1), new ItemStack(ItemIDs.seats.item, 2),dye, new ItemStack(ItemIDs.minecartExperimentalHydrogenTrain.item, 1),1) ;


			}
		}
	}





	public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
									   ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
									   ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize) {
		ITierCraftingManager cm = TierRecipeManager.getInstance();
		cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
	}
}
