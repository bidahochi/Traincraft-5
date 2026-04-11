/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import train.common.Traincraft;
import train.common.inventory.TrainCraftingManager;
import train.common.items.BallastTypes;
import train.common.items.RailVariants;
import train.common.library.*;
import train.common.recipes.ITCRecipe.RecipesArmorDyes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static train.common.library.EnumCoreTrack.*;

public class RecipeHandler extends AbstractRecipeHandler
{
	@GameRegistry.ObjectHolder("foxblocks:bolsterChisel")
	public static final Item FOXBLOCKS_BolsterChisel = null;

	public RecipeHandler()
	{
		initBlockRecipes();
		initItemRecipes();
		initSmeltingRecipes();
	}

	private ArrayList<ItemStack> multiNameOreDict(String ... names){
		ArrayList<ItemStack> entries = new ArrayList<ItemStack>();
		for (String name : names){
			entries.addAll(OreDictionary.getOres(name));
		}
		return entries;
	}

	public void initBlockRecipes()
	{
		//crafting table recipes
		TrainCraftingManager.instance.getRecipeList().add(new RecipesArmorDyes());
		/* Assembly tables */

		addDictRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), "IPI", "S S", "SPS", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('S'), Blocks.stone);

		addDictRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1), "GPG", "O O", "OPO", 'G', ingotGold, 'P', Blocks.piston, 'O', Blocks.obsidian);
		addDictRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1), "GPG", "DLD", "OPO", 'G', ingotGold, 'P', Blocks.piston, 'D', Items.diamond, 'L', Blocks.glowstone, 'O', Blocks.obsidian);

		if (!ConfigHandler.DISABLE_TRAIN_WORKBENCH) {
			addDictRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), "###", "IFI", "###", Character.valueOf('#'), "plankWood", Character.valueOf('F'), Blocks.furnace, Character.valueOf('I'), ironingot);
		}
		addDictRecipe(new ItemStack(BlockIDs.distilIdle.block, 1),  "###", "#F#", "###", Character.valueOf('#'), "ingotSteel", Character.valueOf('F'), ItemIDs.firebox.item );
		addDictRecipe(new ItemStack(ItemIDs.padlock.item, 1), "L#L", "#L#", "#G#", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('G'), Items.gold_nugget);
		/* Open Hearth Furnace */
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			GameRegistry.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), "#L#", "#B#", "#I#",
					Character.valueOf('#'), Blocks.nether_brick, Character.valueOf('L'), Items.lava_bucket,
					Character.valueOf('B'), Items.bucket, Character.valueOf('I'), Blocks.iron_block);
		}


		/* Lantern */
		addDictRecipe(new ItemStack(BlockIDs.lantern.block, 4), "III", "PTP", "III", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.glass_pane, Character.valueOf('T'), Blocks.torch);

		
		/* Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.overalls.item, 1),  " # ", "X$X", "X$X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_leggings, Character.valueOf('#'), new ItemStack(Items.dye, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket.item, 1),  "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 14), Character.valueOf('$'), Items.leather_chestplate, Character.valueOf('#'), Items.string );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat.item, 1),  " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_helmet, Character.valueOf('#'), Items.string );

		/* Driver Clothes*/
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1),  "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('P'), Items.leather_chestplate,Character.valueOf('R'),  new ItemStack(Items.dye, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('#'), Items.string );
		
		/* Ticket Man Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 8), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1),  "X X", "XPX", "X#X", Character.valueOf('P'), Items.leather_chestplate, Character.valueOf('#'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 0), Character.valueOf('#'), Items.string );

		//vanilla track to tc track Recipe but not train workbench
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 1), new ItemStack (Blocks.rail, 1));

		/* New Track Recipes */
		//trying to make recipes space economic
		//(it costs how many tiles of track it is, eg a 10x10 turn costs 10 rails because it takes up ~10 blocks of space if you think about it)


		Item railResource = ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN ? ItemIDs.steel.item : Items.iron_ingot;

		if (ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN == false)
		{
			GameRegistry.addRecipe(new ItemStack(ItemIDs.partSpike.item, 16), " II", " I ", " I ", 'I', Items.iron_ingot);
			GameRegistry.addRecipe(new ItemStack(ItemIDs.partSpike.item, 16), "II ", " I ", " I ", 'I', Items.iron_ingot);
		}

		addDictRecipe(new ItemStack(ItemIDs.partSpike.item, 24), "II ", " I ", " I ", 'I', itemSteel);
		addDictRecipe(new ItemStack(ItemIDs.partSpike.item, 24), " II", " I ", " I ", 'I', itemSteel);

		//straights regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 16),  "G G", "GPG", "G G", 'G', railResource, 'P', new ItemStack(Blocks.planks, 1, 0)); // oak
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail_WOOD_TYPE2_SmallStraight.item, 16),  "G G", "GPG", "G G", 'G', railResource, 'P', new ItemStack(Blocks.planks, 1, 1)); // Spuce
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 16),  "G G", "GPG", "G G", 'G', railResource, 'P', new ItemStack(Blocks.planks, 1, 2)); // birch
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 16),  "G G", "GPG", "G G", 'G', railResource, 'P', new ItemStack(Blocks.planks, 1, 3)); // jungle
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 16),  "G G", "GPG", "G G", 'G', railResource, 'P', new ItemStack(Blocks.planks, 1, 4)); // acacia
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 16),  "G G", "GPG", "G G", 'G', railResource, 'P', new ItemStack(Blocks.planks, 1, 5)); // dark oak

		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedSmallStraight.item, 16), "I I", "IBI", "I I", 'I', railResource, 'B', ItemIDs.partSpike.item);

		for (ItemStack itemStack : concretes)
		{
			GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail_CONCRETE_TYPE1_SmallStraight.item, 16),  "IBI", "IPI", "I I", 'I', railResource, 'B', ItemIDs.partSpike.item, 'P', itemStack);
			GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail_CONCRETE_TYPE2_SmallStraight.item, 16),  "IBI", "IPI", "IWI", 'I', railResource, 'B', ItemIDs.partSpike.item, 'P', itemStack, 'W', Items.water_bucket);
		}

		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail_CONCRETE_TYPE2_SmallStraight.item, 1), "   ", " B ", " I ", 'I', Items.water_bucket, 'B', TrackItemIDs.tcRail_CONCRETE_TYPE1_SmallStraight.item);

		if (CREOSOTE_CONTAINERS.isEmpty())
		{
			GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail_WOOD_TYPE1_SmallStraight.item, 16),  "GCG", "GPG", "G G", 'G', railResource, 'P', Blocks.planks, 'C', ItemIDs.diesel.item);
			GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail_WOOD_TYPE1_SmallStraight.item, 1),  " G ", " P ", "   ", 'G', ItemIDs.diesel.item, 'P', TrackItemIDs.tcRailSmallStraight.item);
		}
		else
		{
			for (ItemStack creoStack : CREOSOTE_CONTAINERS)
			{
				GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail_WOOD_TYPE1_SmallStraight.item, 16),  "GCG", "GPG", "G G", 'G', railResource, 'P', Blocks.planks, 'C', creoStack);
				GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail_WOOD_TYPE1_SmallStraight.item, 1),  " G ", " P ", "   ", 'G', creoStack, 'P', TrackItemIDs.tcRailSmallStraight.item);
			}
		}

		registerStandardTrackRecipes();

		//gravel slopes regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeGravel.item, 1), " TG","TGG","GGG", 'T', TrackItemIDs.tcRailMediumStraight.item, 'G', Blocks.gravel);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeGravel.item,1), "   ","  S"," S ", 'S', TrackItemIDs.tcRailSlopeGravel.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeGravel.item,1), "   ","  M"," S ", 'S', TrackItemIDs.tcRailLargeSlopeGravel.item, 'M', TrackItemIDs.tcRailSlopeGravel.item);

		//peagravel slopes regular
		//todo can we get foxblocks peagravel "traditional" recipes for these as well? if foxblocks mounted use fb peagravel else use these
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailSlopePeaGravel.item, 2), TrackItemIDs.tcRailSlopeGravel.item, TrackItemIDs.tcRailSlopeGravel.item);
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopePeaGravel.item, 2), TrackItemIDs.tcRailLargeSlopeGravel.item, TrackItemIDs.tcRailLargeSlopeGravel.item);
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopePeaGravel.item, 2), TrackItemIDs.tcRailVeryLargeSlopeGravel.item, TrackItemIDs.tcRailVeryLargeSlopeGravel.item);

		//snow gravel slopes regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeSnowGravel.item, 1), " TS","TSS","SSS", 'T', TrackItemIDs.tcRailMediumStraight.item, 'S', new ItemStack(BlockIDs.oreTC.block, 1,4));
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeSnowGravel.item, 1), "   ","  T"," T ", 'T', TrackItemIDs.tcRailSlopeSnowGravel.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeSnowGravel.item, 1), "   ","  M"," T ", 'T', TrackItemIDs.tcRailLargeSlopeSnowGravel.item, 'M', TrackItemIDs.tcRailSlopeSnowGravel.item);

		//ballast slopes regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeBallast.item, 1), " TS","TSS","SSS", 'T', TrackItemIDs.tcRailMediumStraight.item, 'S', new ItemStack(BlockIDs.oreTC.block, 1,3));
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeBallast.item, 1), "   ","  T"," T ", 'T', TrackItemIDs.tcRailSlopeBallast.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeBallast.item, 1), "   ","  M"," T ", 'T', TrackItemIDs.tcRailLargeSlopeBallast.item, 'M', TrackItemIDs.tcRailSlopeBallast.item);

		//wood slopes regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeWood.item, 1), " TG","TGG","GGG", 'T', TrackItemIDs.tcRailMediumStraight.item, 'G', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeWood.item,1), "   ","  S"," S ", 'S', TrackItemIDs.tcRailSlopeWood.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeWood.item,1), "   ","  M"," S ", 'S', TrackItemIDs.tcRailLargeSlopeWood.item, 'M', TrackItemIDs.tcRailSlopeWood.item);

		//dynamic slopes regulah
		//todo have clay be the fallback recipe if foxblocks isnt present, switch to rainbonite in foxblocks if present

		//railroad crossings
		if (ingotRainbontrium.isEmpty())
		{
			GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossingDynamic.item, 8), "TTT", "TBT", "TTT", 'T', TrackItemIDs.tcRailSmallStraight.item, 'B', Items.clay_ball);
		}
		else
		{
			for (ItemStack rainbowItem : ingotRainbontrium)
			{
				Traincraft.tcLog.info("MMMMM T A S T E THE RAINBOW!");
				GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossingDynamic.item, 8), "TTT", "TBT", "TTT", 'T', TrackItemIDs.tcRailSmallStraight.item, 'B', rainbowItem.getItem());
			}
		}


		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing.item, 8), "TTT", "TBT", "TTT", 'T', TrackItemIDs.tcRailSmallStraight.item, 'B', new ItemStack(Blocks.stained_hardened_clay, 1, 15));
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing1.item, 8), "TTT", "TBT", "TTT", 'T', TrackItemIDs.tcRailSmallStraight.item, 'B', new ItemStack(Blocks.stained_hardened_clay, 1, 7));
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing2.item, 8), "TTT", "TBT", "TTT", 'T', TrackItemIDs.tcRailSmallStraight.item, 'B', new ItemStack(Blocks.stained_hardened_clay, 1, 8));

		//buffers
		GameRegistry.addRecipe(new ItemStack(BlockIDs.stopper.block, 1), "PPP", "I I", " T ", 'P', Blocks.planks, 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.americanstopper.block, 1), "III", "I I", " T ", 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRailSmallStraight.item);

		GameRegistry.addRecipe(new ItemStack(BlockIDs.embeddedStopper.block, 1), "PPP", "I I", " T ", 'P', Blocks.planks, 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.embeddedamericanstopper.block, 1), "III", "I I", " T ", 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRailEmbeddedSmallStraight.item);

		GameRegistry.addRecipe(new ItemStack(BlockIDs.concrete_type1_stopper.block, 1), "PPP", "I I", " T ", 'P', Blocks.planks, 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRail_CONCRETE_TYPE1_SmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.concrete_type1_americanstopper.block, 1), "III", "I I", " T ", 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRail_CONCRETE_TYPE1_SmallStraight.item);

		GameRegistry.addRecipe(new ItemStack(BlockIDs.concrete_type2_stopper.block, 1), "PPP", "I I", " T ", 'P', Blocks.planks, 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRail_CONCRETE_TYPE2_SmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.concrete_type2_americanstopper.block, 1), "III", "I I", " T ", 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRail_CONCRETE_TYPE2_SmallStraight.item);

		GameRegistry.addRecipe(new ItemStack(BlockIDs.wood_type1_stopper.block, 1), "PPP", "I I", " T ", 'P', Blocks.planks, 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRail_WOOD_TYPE1_SmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.wood_type1_americanstopper.block, 1), "III", "I I", " T ", 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRail_WOOD_TYPE1_SmallStraight.item);


		//paintbrush
		GameRegistry.addRecipe(new ItemStack(ItemIDs.paintbrushThing.item,1),"GB ","RIS"," ST", Character.valueOf('G'), new ItemStack(Items.dye,1,2), Character.valueOf('B'), new ItemStack(Items.dye,1,4), Character.valueOf('R'), new ItemStack(Items.dye,1,1), Character.valueOf('I'), new ItemStack(Items.iron_ingot), Character.valueOf('S'), new ItemStack(Items.string), Character.valueOf('T'), new ItemStack(Items.stick));

		//GameRegistry.addRecipe(new ItemStack(ItemIDs.creditsBook.item,1),"   "," B ","   ", Character.valueOf('B'), ItemIDs.recipeBook.item );

		//switch stands
		GameRegistry.addRecipe(new ItemStack(BlockIDs.owoYardSwitchStand.block,1), "   ","OS ","IW ", Character.valueOf('O'), new ItemStack(Items.dye, 1, 14), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.owoSwitchStand.block, 1), " O "," S ", " IW", Character.valueOf('O'), new ItemStack(Items.dye, 1, 14), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.circleSwitchStand.block, 1), " R ", " S ", " IW", Character.valueOf('R'), new ItemStack(Items.dye, 1, 1), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.autoSwtichStand.block, 1), "   ","C  ","IIW", Character.valueOf('C'), new ItemStack(ItemIDs.electronicCircuit.item,1), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.Racor36D_1.block,1), "   ","OS ","IW ", 'O', new ItemStack(Items.dye, 1, 2), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.Racor36D_2.block,1), "   ","OS ","IW ", 'O', new ItemStack(Items.dye, 1, 15), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.Racor36H.block,1), " O "," S ","IW ", 'O', new ItemStack(Items.dye, 1, 1), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.Racor36H_2.block,1), " O "," S ","IW ", 'O', new ItemStack(Items.dye, 1, 2), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);

		/* Recipe book */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );

		addDictRecipe(new ItemStack(BlockIDs.switchStand.block, 1), " W ", " I ", " R ", Character.valueOf('W'), Blocks.lever, Character.valueOf('R'), Items.stick, Character.valueOf('I'), ironingot);
		addDictRecipe(new ItemStack(BlockIDs.MILWSwitchStand.block, 1)," RW","BWR","AAA", Character.valueOf('A'), new ItemStack(Items.stick), Character.valueOf('B'), Blocks.iron_bars, Character.valueOf('R'), new ItemStack(Items.dye, 1, 1), Character.valueOf('W'), new ItemStack(Items.dye, 1, 15));
		/*Buffer*/
		//addDictRecipe(new ItemStack(BlockIDs.stopper.block, 1), "WWW", "I I", "RRR", Character.valueOf('W'), "plankWood", Character.valueOf('R'), Blocks.rail, Character.valueOf('I'), ironingot);

		
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 2,3),  "GXG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Items.clay_ball);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 2, 4), "GXG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Items.snowball);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 8, 4), "XGG","GGG","GGG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Blocks.snow);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 8, 3), "XGG","GGG","GGG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Blocks.clay);

		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.dirtyBallast.block, 16),Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel, Blocks.dirt);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.dirtierBallast.block, 16), new ItemStack(BlockIDs.dirtyBallast.block,1 ), new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ), Blocks.dirt);


		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.snowGravel.block,1 ), new ItemStack(Items.snowball), new ItemStack(Blocks.gravel));
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.snowGravel.block,4 ), new ItemStack(Blocks.snow), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel));
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.asphalt.block,  8), new ItemStack(ItemIDs.coaldust.item),new ItemStack(ItemIDs.coaldust.item),new ItemStack(ItemIDs.coaldust.item),new ItemStack(ItemIDs.coaldust.item), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltSlab.block, 6), "BBB", "   ", "   ", Character.valueOf('B'), new ItemStack(BlockIDs.asphalt.block));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltSlab.block, 6), "   ", "BBB", "   ", Character.valueOf('B'), new ItemStack(BlockIDs.asphalt.block));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltSlab.block, 6), "   ", "   ", "BBB", Character.valueOf('B'), new ItemStack(BlockIDs.asphalt.block));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltStairs.block, 4), "B  ", "BB ", "BBB", Character.valueOf('B'), new ItemStack(BlockIDs.asphalt.block));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltStairs.block, 4), "  B", " BB", "BBB", Character.valueOf('B'), new ItemStack(BlockIDs.asphalt.block));

	}

	private void registerStandardTrackRecipes()
	{
		for (RailVariants railVariant : RailVariants.values())
		{
			HashMap<EnumCoreTrack, HashMap<String, EnumTracks>> tracks = EnumTracks.GetTracksByGroup(railVariant);
			TrackItemIDs straight1X = tracks.get(EnumCoreTrack.CORE_SMALL_STRAIGHT).get("").getItem();
			TrackItemIDs straight3X = tracks.get(EnumCoreTrack.CORE_MEDIUM_STRAIGHT).get("").getItem();
			TrackItemIDs straight6X = tracks.get(EnumCoreTrack.CORE_LONG_STRAIGHT).get("").getItem();
			TrackItemIDs straight12X = tracks.get(EnumCoreTrack.CORE_VERY_LONG_STRAIGHT).get("").getItem();
			GameRegistry.addRecipe(new ItemStack(straight3X.item, 1),  "G  ", "G  ", "G  ", 'G', straight1X.item);
			GameRegistry.addRecipe(new ItemStack(straight6X.item, 1),  "G  ", "G  ", "   ", 'G', straight3X.item);
			GameRegistry.addRecipe(new ItemStack(straight12X.item, 1),  "G  ", "G  ", "   ", 'G', straight6X.item);

			if (FOXBLOCKS_BolsterChisel != null)
			{
				GameRegistry.addRecipe(new ItemStack(straight1X.item, 3),  " X ", " G ", "   ", 'G', straight3X.item, 'X', FOXBLOCKS_BolsterChisel);
				GameRegistry.addRecipe(new ItemStack(straight3X.item, 2),  " X ", " G ", "   ", 'G', straight6X.item, 'X', FOXBLOCKS_BolsterChisel);
				GameRegistry.addRecipe(new ItemStack(straight6X.item, 2),  " X ", " G ", "   ", 'G', straight12X.item, 'X', FOXBLOCKS_BolsterChisel);
			}

			//90 turns regular
			TrackItemIDs turn1X = tracks.get(EnumCoreTrack.CORE_1X_TURN).get("").getItem();
			TrackItemIDs turn3X = tracks.get(EnumCoreTrack.CORE_3X_TURN).get("").getItem();
			TrackItemIDs turn5X = tracks.get(EnumCoreTrack.CORE_5X_TURN).get("").getItem();
			TrackItemIDs turn10X = tracks.get(EnumCoreTrack.CORE_10X_TURN).get("").getItem();
			TrackItemIDs turn16X = tracks.get(EnumCoreTrack.CORE_16X_TURN).get("").getItem();
			TrackItemIDs turn29x = tracks.get(EnumCoreTrack.CORE_29X_TURN).get("").getItem();
			TrackItemIDs turn32x = tracks.get(EnumCoreTrack.CORE_32X_TURN).get("").getItem();
			
			GameRegistry.addShapelessRecipe(new ItemStack(turn1X.item, 1), straight1X.item);
			GameRegistry.addShapelessRecipe(new ItemStack(straight1X.item, 1), turn1X.item);//convert 1x1 turn back to straight

			GameRegistry.addRecipe(new ItemStack(turn3X.item, 1),  "GG ", "G  ", "   ", 'G', straight1X.item);
			GameRegistry.addRecipe(new ItemStack(turn5X.item, 1),  " GG", "GG ", "G  ", 'G', straight1X.item);
			GameRegistry.addRecipe(new ItemStack(turn10X.item, 1), " S ","S  ","   ", 'S', turn5X.item);
			GameRegistry.addRecipe(new ItemStack(turn16X.item, 1), " TS","T  ","S  ",'T', turn5X.item, 'S', turn3X.item);
			GameRegistry.addRecipe(new ItemStack(turn29x.item,1 ), "AT ","TB ","   ",'T', turn10X.item, 'A', turn5X.item, 'B', straight1X.item);
			GameRegistry.addRecipe(new ItemStack(turn32x.item,1), " S ","S  ","   ", 'S', turn16X.item);

			if (FOXBLOCKS_BolsterChisel != null)
			{
				GameRegistry.addRecipe(new ItemStack(straight1X.item, 3),  " X ", " G ", "   ", 'G', turn3X.item, 'X', FOXBLOCKS_BolsterChisel);
				GameRegistry.addRecipe(new ItemStack(straight1X.item, 5),  " X ", " G ", "   ", 'G', turn5X.item, 'X', FOXBLOCKS_BolsterChisel);
				GameRegistry.addRecipe(new ItemStack(turn5X.item, 2),  " X ", " G ", "   ", 'G', turn10X.item, 'X', FOXBLOCKS_BolsterChisel);
				GameRegistry.addRecipe(new ItemStack(turn16X.item, 2),  " X ", " G ", "   ", 'G', turn32x.item, 'X', FOXBLOCKS_BolsterChisel);
			}

			//45 turns regular
			TrackItemIDs CORE_3X4_45DEGREE_TURN = tracks.get(EnumCoreTrack.CORE_3X4_45DEGREE_TURN).get("").getItem();
			TrackItemIDs CORE_3X6_45DEGREE_TURN = tracks.get(EnumCoreTrack.CORE_3X6_45DEGREE_TURN).get("").getItem();
			TrackItemIDs CORE_4X8_45DEGREE_TURN = tracks.get(EnumCoreTrack.CORE_4X8_45DEGREE_TURN).get("").getItem();
			TrackItemIDs CORE_5X11_45DEGREE_TURN = tracks.get(EnumCoreTrack.CORE_5X11_45DEGREE_TURN).get("").getItem();
			TrackItemIDs CORE_9X20_45DEGREE_TURN = tracks.get(EnumCoreTrack.CORE_9X20_45DEGREE_TURN).get("").getItem();
			TrackItemIDs CORE_10x22_45DEGREE_TURN = tracks.get(EnumCoreTrack.CORE_10x22_45DEGREE_TURN).get("").getItem();
			//TrackItemIDs turn32x = tracks.get(EnumCoreTrack.CORE_32X_TURN).getItem();
			
			GameRegistry.addRecipe(new ItemStack(CORE_3X4_45DEGREE_TURN.item,1), "S  "," S "," S ", 'S', straight1X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_3X6_45DEGREE_TURN.item,1), "SS "," S "," M ", 'S', straight1X.item, 'M', straight3X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_4X8_45DEGREE_TURN.item,1), "MS "," S "," M ", 'S', straight1X.item, 'M', straight3X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_5X11_45DEGREE_TURN.item,1), "SS "," M ","  L", 'S', straight1X.item, 'M', straight3X.item, 'L', straight6X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_9X20_45DEGREE_TURN.item,1), "SS "," L ","  V", 'S', straight1X.item, 'V', straight12X.item, 'L', straight6X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_10x22_45DEGREE_TURN.item,1), "SM "," L ","  V", 'S', straight1X.item, 'V', straight12X.item, 'L', straight6X.item, 'M', straight3X.item);

			//s curves (parallel curves) regular
			TrackItemIDs CORE_S_CURVE_2x8 = tracks.get(EnumCoreTrack.CORE_S_CURVE_2x8).get("").getItem();
			TrackItemIDs CORE_S_CURVE_3x12 = tracks.get(EnumCoreTrack.CORE_S_CURVE_3x12).get("").getItem();
			TrackItemIDs CORE_S_CURVE_4x16 = tracks.get(EnumCoreTrack.CORE_S_CURVE_4x16).get("").getItem();
			TrackItemIDs CORE_S_CURVE_20x2 = tracks.get(EnumCoreTrack.CORE_S_CURVE_20x2).get("").getItem();

			GameRegistry.addRecipe(new ItemStack(CORE_S_CURVE_2x8.item,1), "MS ", " SM", "   ", 'S', straight1X.item, 'M', straight3X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_S_CURVE_3x12.item,1), "MM ", " MM", "   ", 'M', straight3X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_S_CURVE_4x16.item,1), "LM ", " SL", "   ", 'S', straight1X.item, 'M', straight3X.item, 'L', straight6X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_S_CURVE_20x2.item,1), "LS ", " L ", " SL", 'S', straight1X.item, 'L', straight6X.item);


			TrackItemIDs CORE_4x4_SWITCH = tracks.get(EnumCoreTrack.CORE_4x4_SWITCH).get("").getItem();
			TrackItemIDs CORE_6x6_SWITCH = tracks.get(EnumCoreTrack.CORE_6x6_SWITCH).get("").getItem();
			TrackItemIDs CORE_11x11_SWITCH = tracks.get(EnumCoreTrack.CORE_11x11_SWITCH).get("").getItem();

			//90 switches regular
			GameRegistry.addRecipe(new ItemStack(CORE_4x4_SWITCH.item, 1),  "G  ", "GHG", "G  ", 'G', straight1X.item, 'H', turn3X.item );
			GameRegistry.addRecipe(new ItemStack(CORE_6x6_SWITCH.item, 1),  "G  ", "HIG", "G  ", 'G', straight1X.item, 'H', straight3X.item, 'I', turn5X.item );
			GameRegistry.addRecipe(new ItemStack(CORE_11x11_SWITCH.item, 1),  "G  ", "HI ", "G  ", 'G', straight1X.item, 'H', straight6X.item, 'I', turn10X.item );

			TrackItemIDs CORE_4x11_PARALLEL_SWITCH = tracks.get(EnumCoreTrack.CORE_4x11_PARALLEL_SWITCH).get("").getItem();
			TrackItemIDs CORE_4x17_PARALLEL_SWITCH = tracks.get(EnumCoreTrack.CORE_4x17_PARALLEL_SWITCH).get("").getItem();
			//parallel switches regulah
			GameRegistry.addRecipe(new ItemStack(CORE_4x11_PARALLEL_SWITCH.item, 1),  "I G", "IHH", "IH ", 'G', straight1X.item, 'H', turn3X.item, 'I', straight3X.item );
			GameRegistry.addRecipe(new ItemStack(CORE_4x17_PARALLEL_SWITCH.item, 1),  "L M", "MSC", "LC ", 'L', straight6X.item, 'C', turn3X.item, 'M', straight3X.item, 'S', turn5X.item);

			//45 switches regular
			TrackItemIDs CORE_3x5_45DEGREE_SWITCH = tracks.get(EnumCoreTrack.CORE_3x5_45DEGREE_SWITCH).get("").getItem();
			TrackItemIDs CORE_4x8_45DEGREE_SWITCH = tracks.get(EnumCoreTrack.CORE_4x8_45DEGREE_SWITCH).get("").getItem();
			GameRegistry.addRecipe(new ItemStack(CORE_3x5_45DEGREE_SWITCH.item,1), "SS ","SS ","S  ", 'S', straight1X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_4x8_45DEGREE_SWITCH.item,1), "MM ","SS ","M  ", 'S', straight1X.item, 'M', straight3X.item);

			//crossover switch regular
			TrackItemIDs CORE_10x2_CROSSOVER_SWITCH = tracks.get(EnumCoreTrack.CORE_10x2_CROSSOVER_SWITCH).get("").getItem();
			GameRegistry.addRecipe(new ItemStack(CORE_10x2_CROSSOVER_SWITCH.item,1), "MM ","MM ","M  ",'M', straight3X.item);

			//diamond crossings
			TrackItemIDs CORE_TWO_WAYS_CROSSING = tracks.get(EnumCoreTrack.CORE_TWO_WAYS_CROSSING).get("").getItem();
			TrackItemIDs CORE_DIAMOND_CROSSING = tracks.get(EnumCoreTrack.CORE_DIAMOND_CROSSING).get("").getItem();
			TrackItemIDs CORE_DOUBLE_DIAMOND_CROSSING = tracks.get(EnumCoreTrack.CORE_DOUBLE_DIAMOND_CROSSING).get("").getItem();
			TrackItemIDs CORE_FOUR_WAYS_CROSSING = tracks.get(EnumCoreTrack.CORE_FOUR_WAYS_CROSSING).get("").getItem();

			GameRegistry.addRecipe(new ItemStack(CORE_TWO_WAYS_CROSSING.item,1), " S ","SSS"," S ",'S',  straight1X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_DIAMOND_CROSSING.item,1), "SS "," S "," SS",'S',  straight1X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_DOUBLE_DIAMOND_CROSSING.item,1), "S S"," M ","S S",'S',  straight1X.item, 'M', straight3X.item);
			GameRegistry.addRecipe(new ItemStack(CORE_FOUR_WAYS_CROSSING.item,1), "   ","SDS","   ",'S',  straight1X.item, 'D', CORE_DOUBLE_DIAMOND_CROSSING.item);

			//Dynamic Slopes
			TrackItemIDs dynamicSlopes3 = tracks.get(CORE_3_SLOPE).get(BallastTypes.DYNAMIC.name()).getItem();
			TrackItemIDs dynamicSlopes6 = tracks.get(CORE_6_SLOPE).get(BallastTypes.DYNAMIC.name()).getItem();
			TrackItemIDs dynamicSlopes12 = tracks.get(CORE_12_SLOPE).get(BallastTypes.DYNAMIC.name()).getItem();
			TrackItemIDs dynamicSlopes18 = tracks.get(CORE_18_SLOPE).get(BallastTypes.DYNAMIC.name()).getItem();

			GameRegistry.addRecipe(new ItemStack(dynamicSlopes18.item, 1), "   ", "  S", " T ", 'T', dynamicSlopes12.item, 'S', dynamicSlopes6.item);
			GameRegistry.addRecipe(new ItemStack(dynamicSlopes18.item, 1), "  S", " S ", "S  ", 'S', dynamicSlopes6.item);

			if (FOXBLOCKS_BolsterChisel != null)
			{
				GameRegistry.addRecipe(new ItemStack(dynamicSlopes6.item, 3),  " X ", " G ", "   ", 'G', dynamicSlopes18.item, 'X', FOXBLOCKS_BolsterChisel);
				GameRegistry.addRecipe(new ItemStack(dynamicSlopes6.item, 2),  " X ", " G ", "   ", 'G', dynamicSlopes12.item, 'X', FOXBLOCKS_BolsterChisel);
				GameRegistry.addRecipe(new ItemStack(dynamicSlopes3.item, 2),  " X ", " G ", "   ", 'G', dynamicSlopes6.item, 'X', FOXBLOCKS_BolsterChisel);
			}
		}
	}

	public void initFoxDrivesRecipe()
	{
		Item FOXDRIVES_workday_1980_utility_hirail = GameRegistry.findItem("foxdrives", "workday_1980_utility_hirail");
		if (FOXDRIVES_workday_1980_utility_hirail != null)
		{
			GameRegistry.addRecipe(new ItemStack(ItemIDs.minecartWorkdayHyrail.item, 1),  "   ", " G ", "   ", 'G', FOXDRIVES_workday_1980_utility_hirail);
			GameRegistry.addRecipe(new ItemStack(FOXDRIVES_workday_1980_utility_hirail, 1),  "   ", " G ", "   ", 'G', ItemIDs.minecartWorkdayHyrail.item);
		}
	}

	public void initItemRecipes() {//train wb recipes

		initFoxDrivesRecipe();

		ArrayList<ItemStack> plastics	= multiNameOreDict("itemPlastic", "dustPlastic");//dustPlastic for MFR support
		ArrayList<ItemStack> waterbucket = waterContainers();

		// Always do this " X " instead of this "X", and do not put "" empty brackets

		/* I placed it here because workbench should be one of the first recipe shown in the recipe book */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), "###", "IFI", "###", Character.valueOf('#'), anyPlankType, Character.valueOf('F'), Blocks.furnace, Character.valueOf('I'), ironingot);
		
		/* Recipe book */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );

		/* Chunk Loader Activator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.chunkLoaderActivator.item, 1),  "  P", " S ", "S  ", Character.valueOf('S'), Items.blaze_rod, Character.valueOf('P'), Items.ender_pearl );

		/* Assembly tables */

		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), "IPI", "S S", "SPS", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('S'), Blocks.stone);
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1),  "GPG", "O O", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('O'), Blocks.obsidian );
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1),  "GPG", "DLD", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('D'), Items.diamond, Character.valueOf('L'), Blocks.glowstone, Character.valueOf('O'), Blocks.obsidian );

		/* Open Hearth Furnace */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1),  "#L#", "#B#", "#I#", Character.valueOf('#'), Blocks.nether_brick, Character.valueOf('L'), Items.lava_bucket, Character.valueOf('B'), Items.bucket, Character.valueOf('I'), Blocks.iron_block );

		/* Lantern */

		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), "III", "PTP", "III", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.glass_pane, Character.valueOf('T'), Blocks.torch);

		/* Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.overalls.item, 1),  " # ", "X$X", "X X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_leggings, Character.valueOf('#'), new ItemStack(Items.dye, 1, 1) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket.item, 1),  "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 14), Character.valueOf('$'), Items.leather_chestplate, Character.valueOf('#'), Items.string );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat.item, 1),  " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_helmet, Character.valueOf('#'), Items.string );
		
		/* Driver Clothes*/
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1),  "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('P'), Items.leather_chestplate,Character.valueOf('R'),  new ItemStack(Items.dye, 1, 1) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('#'), Items.string );
		
		/* Ticket Man Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 8), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1),  "X X", "XPX", "X#X", Character.valueOf('P'), Items.leather_chestplate, Character.valueOf('#'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 0), Character.valueOf('#'), Items.string );
		
		

		if (plastics != null && plastics.size() >= 0) {
			for (ItemStack plastic : plastics) {
				/* Empty canister */
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.emptyCanister.item, 8),  "PPP", "P P", "PPP", Character.valueOf('P'), plastic);
				for (ItemStack rs :redstone)
				{
					/* Electronic circuit */
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electronicCircuit.item, 1), "XXX", "RPR", "XXX", Character.valueOf('X'), wireCopper, Character.valueOf('P'), plastic, Character.valueOf('R'), rs.getItem());
				}
				/* Composite Material*/
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlastic.item, 16),  "LPL", "PLP", "GPG", Character.valueOf('G'), Blocks.glass_pane, Character.valueOf('P'), ItemIDs.graphite.item, Character.valueOf('L'), plastic);

				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.copperWireFine.item, 6),  "XXX", "XPX", "XXX", Character.valueOf('X'), ironCopper , Character.valueOf('P'), plastic );
			}
		}
		
		/* Composite Suit */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boots_suit_paintable.item, 1), " D ","X X", "XFX", Character.valueOf('F'), Items.feather, Character.valueOf('D'), Items.diamond, Character.valueOf('X'), ItemIDs.reinforcedPlates.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_suit_paintable.item, 1),  "XDX", "X$X", "X X", Character.valueOf('$'), Items.fire_charge, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Items.diamond);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_suit_paintable.item, 1),  "X X", "XDX", "XAX", Character.valueOf('A'), Items.golden_apple, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Blocks.diamond_block);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.helmet_suit_paintable.item, 1), "#D#", "# #", Character.valueOf('D'), Blocks.diamond_block, Character.valueOf('#'), ItemIDs.reinforcedPlates.item );

		/* Trains parts */

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.generator.item, 2), " ##", "E$$", " ##", Character.valueOf('#'), wireCopper, Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('$'), ironingot);// generator
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.controls.item, 1), "#X#", "#E#", "$$$", Character.valueOf('#'), Blocks.lever, Character.valueOf('X'), Blocks.stone_button, Character.valueOf('$'), Items.iron_ingot, Character.valueOf('E'), ItemIDs.electronicCircuit.item);// train controls
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electmotor.item, 2), "I#I", "#E#", "I#I", Character.valueOf('#'), wireCopper, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('E'), ItemIDs.electronicCircuit.item);// Electric motor

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFirebox.item, 2),  "###", "#X#", "###", Character.valueOf('#'), ironingot, Character.valueOf('X'), Items.flint_and_steel );// iron Firebox
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironChimney.item, 2),  "# #", "# #", "# #", Character.valueOf('#'), ironingot);


		for (ItemStack bucketWater : waterbucket) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBoiler.item, 2), "###", "XXX", "###", Character.valueOf('#'), ironingot, Character.valueOf('X'), bucketWater.getItem());// iron Boiler
		}

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.dieselengine.item, 2), "###", "XXX", "CCC", Character.valueOf('#'), ItemIDs.piston.item, Character.valueOf('X'), ItemIDs.cylinder.item, Character.valueOf('C'), ItemIDs.camshaft.item);// diesel engine

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.graphite.item, 2),  "###", "#X#", "###", Character.valueOf('#'), DustCoal, Character.valueOf('X'), Items.clay_ball );// Graphite

		
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			for (ItemStack c : coal) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 3),
						"###", "   ", "   ", Character.valueOf('#'), c.getItem());
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 3),
						"   ", "###", "   ", Character.valueOf('#'), c.getItem());
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 3),
						"   ", "   ", "###", Character.valueOf('#'), c.getItem());
			}
		}
		
		//TrainCraftingManager.instance.addShapelessRecipe(new ItemStack(ItemIDs.coaldust.item, 4),  c.getItem(), c.getItem(), c.getItem(), c.getItem() );// coal dust
		
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.signal.item, 2),  "#", "X", "X", Character.valueOf('X'), ItemIDs.steel.item, Character.valueOf('#'), rs );
		/* diesel generator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.generatorDiesel.block, 1),  "C  ", "DE ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('D'), ItemIDs.dieselengine.item, Character.valueOf('E'), circuitBasic);

		/* Zepplin parts and zeppelin item */
		if (ConfigHandler.ENABLE_ZEPPELIN) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.balloon.item, 1),  "###", "# #", "###", Character.valueOf('#'), Blocks.wool );// Balloon
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steamengine.item, 1),  "C  ", "BF ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('B'), ItemIDs.boiler.item, Character.valueOf('F'), ItemIDs.firebox.item );// Small steam engine
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.airship.item, 1),  "B B", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), Items.stick, Character.valueOf('E'), ItemIDs.steamengine.item, Character.valueOf('P'), ItemIDs.propeller.item, Character.valueOf('O'), Items.boat );
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.zeppelin.item, 1),  "BBB", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), ItemIDs.propeller.item, Character.valueOf('E'), ItemIDs.controls.item, Character.valueOf('P'), ItemIDs.electmotor.item, Character.valueOf('O'), ItemIDs.seats.item );
		}

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transformer.item, 1), "# #", "XEX", "###", Character.valueOf('#'), itemSteel, Character.valueOf('E'), circuitBasic, Character.valueOf('X'), Items.redstone);// transformer

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlates.item, 1),  "RRR", "SSS", "CCC", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'), itemSteel, Character.valueOf('C'), Items.clay_ball);

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.composite_wrench.item, 1), "S S", " R "," R ", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'),itemSteel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelcab.item, 2),  "###", "X X", "XXX", Character.valueOf('X'), itemSteel, Character.valueOf('#'), anyPlanks);// Steel cab
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.distilIdle.block, 1),  "###", "#F#", "###", Character.valueOf('#'), itemSteel, Character.valueOf('F'), ItemIDs.firebox.item );


		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.firebox.item, 2),  "###", "#X#", "###", Character.valueOf('#'), itemSteel, Character.valueOf('X'), Items.flint_and_steel );// Firebox
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.bogie.item, 4), " # ", "#X#", " # ", Character.valueOf('#'), itemSteel, Character.valueOf('X'), ironingot);// Bogie
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), "# #", "AAA", Character.valueOf('A'), itemSteel, Character.valueOf('#'), ironingot);// Steel Frame
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), "   ", "# #", "AAA", Character.valueOf('A'), itemSteel, Character.valueOf('#'), ironingot);// Steel Frame

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "   ", "IFI", "   ", Character.valueOf('I'), itemSteel, Character.valueOf('F'), ironingot);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "IFI", "   ", "   ", Character.valueOf('I'), itemSteel, Character.valueOf('F'), ironingot);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "   ", "   ", "IFI", Character.valueOf('I'), itemSteel, Character.valueOf('F'), ironingot);

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelchimney.item, 2),  "# #", "# #", "# #", Character.valueOf('#'), itemSteel );// Bogie
		TrainCraftingManager.instance.addRecipe(new ItemStack(Items.flint_and_steel, 2),  "* ", " #", Character.valueOf('*'), itemSteel, Character.valueOf('#'), Items.flint );


		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transmition.item, 1),  " # ", "#X#", " # ", Character.valueOf('#'), itemSteel, Character.valueOf('X'), ItemIDs.diesel.item );// transmition
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.piston.item, 3),  " # ", " X ", Character.valueOf('#'), itemSteel, Character.valueOf('X'), Items.stick );// piston
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "###", "   ", "   ", Character.valueOf('#'), itemSteel );// camshaft
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "   ", "###", "   ", Character.valueOf('#'), itemSteel );// camshaft
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "   ", "   ", "###", Character.valueOf('#'), itemSteel );// camshaft
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.cylinder.item, 3),  "# #", "# #", "###", Character.valueOf('#'), itemSteel );// cylinder




		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boiler.item, 2), "###", "XXX", "###", Character.valueOf('#'), itemSteel, Character.valueOf('X'), WaterBucketItem);// Boiler


		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.firebox.item, 2),  "###", "#X#", "###", '#', new ItemStack(steelItem.getItem(), 1, OreDictionary.WILDCARD_VALUE), 'X', Items.flint_and_steel );// Firebox
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.propeller.item, 2),  " # ", "#X#", " # ", Character.valueOf('#'), anyPlanks, Character.valueOf('X'), ironingot );// Propeller


		//TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), plankItem, Character.valueOf('I'), ironItem);// small straight track

		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 15), Character.valueOf('I'), ironingot);
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing1.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 7), Character.valueOf('I'), ironingot);
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing2.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 8), Character.valueOf('I'), ironingot);


		/* Water Wheel */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.waterWheel.block, 1),  " P ", "PGP", " P ", Character.valueOf('P'), anyLogs,Character.valueOf('G'), ItemIDs.generator.item);

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenBogie.item, 4),  " # ", "#X#", " # ", Character.valueOf('#'), anyPlanks, Character.valueOf('X'), anyLogs );// wooden Bogie

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2),  "# #", "AAA", Character.valueOf('A'), anyPlanks, Character.valueOf('#'), anyPlanks );// wooden Frame
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2),  "   ", "# #", "AAA", Character.valueOf('A'), anyPlanks, Character.valueOf('#'), anyPlanks );// wooden Frame
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenCab.item, 2),  "###", "X X", "XXX", Character.valueOf('X'), anyPlanks, Character.valueOf('#'), anyPlanks );// wooden cab

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.seats.item, 1), "#  ", "## ", "XXX", Character.valueOf('#'), anyPlanks, Character.valueOf('X'), ironingot);// transformer
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBogie.item, 4), " # ", "#X#", " # ", Character.valueOf('#'), ironingot, Character.valueOf('X'), anyPlanks);// iron Bogie
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), "# #", "AAA", Character.valueOf('A'), ironingot, Character.valueOf('#'), anyPlanks);// iron Frame
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), "   ", "# #", "AAA", Character.valueOf('A'), ironingot, Character.valueOf('#'), anyPlanks);// iron Frame
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironCab.item, 2), "###", "X X", "XXX", Character.valueOf('X'), ironingot, Character.valueOf('#'), anyPlanks);// iron cab
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.stopper.block, 1), "WWW", "I I", "RRR", Character.valueOf('W'), anyPlanks, Character.valueOf('R'), Blocks.rail, Character.valueOf('I'), ironingot);// stopper
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.switchStand.block, 1), " W ", " I ", " R ", Character.valueOf('W'), Blocks.lever, Character.valueOf('R'), Items.stick, Character.valueOf('I'), ironingot);//switchstand
		// Short Wood Slope
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeWood.item, 1),
				 " MW", "MWW", "WWW", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item,
						Character.valueOf('W'), anyPlanks );

			/* Wind mill */

		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.windMill.block, 1), " R ", " G ", "B B", Character.valueOf('G'), ItemIDs.generator.item, Character.valueOf('B'), ironingot, Character.valueOf('R'), ItemIDs.propeller.item);

		if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcTransmitterSpeed.block, 1), "SRS", "RTR", "SRS", 'S', ironingot, 'R', Items.redstone, 'T', Blocks.stone_pressure_plate);
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcReceiverMTC.block, 1), "STS", " R ", "SPS", 'S', ironingot, 'R', Items.redstone, 'P', Items.repeater, 'T', new ItemStack(Blocks.torch, 1));
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcTransmitterMTC.block, 1), "SPS", " R ", "STS", 'S', ironingot, 'R', Items.redstone, 'P', Items.repeater, 'T', new ItemStack(Blocks.torch, 1));
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcReceiverDestination.block, 1), "SRS", "RTR", "SRS", 'S', ironingot, 'R', Items.redstone, 'T', Items.sign);
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcATOStopTransmitter.block, 1), " S ", "RTS", " R ", 'S', ironingot, 'R', Items.redstone, 'T', circuitBasic);
		}

		/* passenger car parts */

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.fourWheelLightweightTruck.item, 2), "   ", "SFS", "W W", 'S', itemSteel, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel lightweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.fourWheelLightweightTruck.item, 2), "SFS", "W W", "   ", 'S', itemSteel, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel lightweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.fourWheelHeavyweightTruck.item, 2), "   ", "SSS", "W W", 'S', itemSteel, 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel heavyweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.fourWheelHeavyweightTruck.item, 2), "SSS", "W W", "   ", 'S', itemSteel, 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel heavyweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.sixWheelLightweightTruck.item, 2), "   ", "FSF", "WWW", 'S', itemSteel, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 6 wheel lightweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.sixWheelLightweightTruck.item, 2), "FSF", "WWW", "   ", 'S', itemSteel, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 6 wheel lightweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.sixWheelHeavyweightTruck.item, 2), "   ", "SSS", "WWW", 'S', itemSteel, 'W', new ItemStack(ItemIDs.bogie.item)); // 6 wheel heavyweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.sixWheelHeavyweightTruck.item, 2), "SSS", "WWW", "   ", 'S', itemSteel, 'W', new ItemStack(ItemIDs.bogie.item)); // 6 wheel heavyweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.passengerFluting.item, 4), "   ", " S ", "   ", 'S', itemSteel); // passenger car fluting

		/* interurban/streetcar parts */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.trolleyPole.item, 2), "S  ", " SS", "   ", 'S', itemSteel); //trolley pole
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.trolleyPole.item, 2), "   ", "S  ", " SS", 'S', itemSteel); //trolley pole

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.thirdRailShoe.item, 4), "   ", "WWW", " S ", 'S', itemSteel, 'W', Blocks.planks); //third rail shoe
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.thirdRailShoe.item, 4), "WWW", " S ", "   ", 'S', itemSteel, 'W', Blocks.planks); //third rail shoe


		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.interurbanTruck.item,1), "MCM", "SSS", "W W", 'W', new ItemStack(ItemIDs.bogie.item), 'S', itemSteel, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', ItemIDs.ingotCopper.item); //interurban truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pantograph.item,2), " C ", "S S", " S ", 'S', itemSteel, 'C', ItemIDs.ingotCopper.item); //pantograph

		/* freight car and caboose parts */

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.freightCarTruck.item, 2), "   ", "FSF", "W W", 'S', itemSteel, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel lightweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.freightCarTruck.item, 2), "FSF", "W W", "   ", 'S', itemSteel, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel lightweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.cabooseTruck.item, 2), "   ", "FSF", "WSW", 'S', itemSteel, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel lightweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.cabooseTruck.item, 2), "FSF", "WSW", "   ", 'S', itemSteel, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel lightweight truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.archbarTruck.item, 2), "   ", " S ", "WSW", 'S', itemSteel, 'W', new ItemStack(ItemIDs.bogie.item)); // archbar truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.archbarTruck.item, 2), " S ", "WSW", "   ", 'S', itemSteel, 'W', new ItemStack(ItemIDs.bogie.item)); // archbar truck
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boxcarDoor.item, 2), " SS", " SS", " SS", 'S', itemSteel); // boxcar door
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boxcarDoor.item, 2), "SS ", "SS ", "SS ", 'S', itemSteel); // boxcar door
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hopperBay.item, 2), "   ", "SSS", " S ", 'S', itemSteel); // hopper bay
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hopperBay.item, 2), "SSS", " S ", "   ", 'S', itemSteel); // hopper bay
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tankcarDome.item, 2), " S ", "S S", "   ", 'S', itemSteel); // tankcar dome
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tankcarDome.item, 2), "   ", " S ", "S S", 'S', itemSteel); // tankcar dome
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.freightCarRibbing.item, 2), "   ", "S S", "S S", 'S', itemSteel); // freight car ribbing
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.freightCarRibbing.item, 2), "S S", "S S", "   ", 'S', itemSteel); // freight car ribbing

		/* locomotive crafting parts NEW */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partBlombergB.item,1), "MCM", "SSS", "W W", 'W', new ItemStack(ItemIDs.bogie.item), 'S', itemSteel, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "M M", "S S", "WFW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', itemSteel, 'M', new ItemStack(ItemIDs.electmotor.item), 'F', new ItemStack(ItemIDs.steelframe.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeA.item,1), "M M", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', itemSteel, 'M', new ItemStack(ItemIDs.electmotor.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partFB2.item,1), "M M", "SCS", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', itemSteel, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentGE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partFB3.item,1), "MMM", "SCS", "WWW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', itemSteel, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentGE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partFlexicoil.item,1), "MMM", "SCS", "WWW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', itemSteel, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));



		//commented out till someone fixes not being able to use more than one recipe for an item
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentGE.item));
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentALCO.item));
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentBLW.item));
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentFM.item));


		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentEMD.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', "ingotCopper", 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', BLUE_DYE);

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentGE.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', "ingotCopper", 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', LIGHT_BLUE_DYE);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentALCO.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', "ingotCopper", 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', YELLOW_DYE);


		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentBLW.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', "ingotCopper", 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', GRAY_DYE);

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentFM.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', "ingotCopper", 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', BLACK_DYE);

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentCEE.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', "ingotCopper", 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', BROWN_DYE);


		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partAlternator.item, 2), "## ", "$$E", "## ", '$', wireCopper, 'E', circuitBasic, '#', ironingot);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTurboExhaust.item, 2), "S S", "S S", "SPS", 'S', ItemIDs.steel.item, 'P', ItemIDs.piston.item);


		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 1),  "   ", " R ", "   ", Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail));// small straight track
		/*TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 15), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing1.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 7), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing2.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 3), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );*/
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), TrackItemIDs.tcRailSmallStraight.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), TrackItemIDs.tcRailSmallRoadCrossing.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), TrackItemIDs.tcRailSmallRoadCrossing1.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), TrackItemIDs.tcRailSmallRoadCrossing2.item);
		// Short Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeGravel.item, 1),
				 " MG", "MGG", "GGG", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item,
						Character.valueOf('G'), Blocks.gravel );
		// Short Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeBallast.item, 1),
				 " MB", "MBB", "BBB", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item,
						Character.valueOf('B'), new ItemStack(BlockIDs.oreTC.block, 1, 3) );

		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailLargeSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailVeryLargeSlopeWood.item, 'B', Blocks.gravel );

		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailLargeSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailVeryLargeSlopeWood.item, 'B', Blocks.gravel );


		// Large Slope Wood
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeWood.item, 1),
				 "   ", "  S", " S ", 'S', TrackItemIDs.tcRailSlopeWood.item );
		// Large Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeGravel.item, 1),
				 "   ", "  S", " S ", 'S', TrackItemIDs.tcRailSlopeGravel.item );
		// Large Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeBallast.item, 1),
				 "   ", "  S", " S ", 'S', TrackItemIDs.tcRailSlopeBallast.item );
		// VeryLarge Slope Wood
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeWood.item, 1),
				 "  S", " S ", "S  ", 'S', TrackItemIDs.tcRailSlopeWood.item );
		// VeryLarge Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeGravel.item, 1),
				 "  S", " S ", "S  ", 'S', TrackItemIDs.tcRailSlopeGravel.item );
		// VeryLarge Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeBallast.item, 1),
				 "  S", " S ", "S  ", 'S', TrackItemIDs.tcRailSlopeBallast.item );
		
		// Medium Straight (3 Recipes? Really?)
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumStraight.item, 1),
				 "S  ", "S  ", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumStraight.item, 1),
				 " S ", " S ", " S ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumStraight.item, 1),
				 "  S", "  S", "  S", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		// Long Straight (3 Recipes? Really?)
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLongStraight.item, 1),
				 "   ", " M ", " M ", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLongStraight.item, 1),
				 "   ", "M  ", "M  ", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLongStraight.item, 1),
				 "   ", "  M", "  M", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item );
		
		// Medium Turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumTurn.item, 1),
				 "SS ", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		// Large turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeTurn.item, 1),
				 " SS", "SS ", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		// Very Large Turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeTurn.item, 1),
				 "MM ", "M  ", "   ", Character.valueOf('M'), TrackItemIDs.tcRailMediumTurn.item );
		
		// Medium Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumSwitch.item, 1),
				 "S  ", "SRS", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item,
						Character.valueOf('R'), TrackItemIDs.tcRailMediumTurn.item );
		// Large Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSwitch.item, 1),
				 "S  ", "MRS", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item,
						Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item, Character.valueOf('R'),
						TrackItemIDs.tcRailLargeTurn.item );
		// Parallel Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumParallelSwitch.item, 1),
				 "M S", "MRR", "MR ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item,
						Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item, Character.valueOf('R'),
						TrackItemIDs.tcRailMediumTurn.item );
		// Two Way Crossing
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailTwoWaysCrossing.item, 1),
				 " S ", "SSS", " S ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		// Bridge Pillar
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.bridgePillar.block, 2),
				 "SSS", "S S", "SSS", Character.valueOf('S'), Items.stick );
		//Remote Control
		for (ItemStack plastic : plastics)
		{
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.remoteController.item, 1),
					 " L ", "PBP", "   ", 'B', circuitBasic, 'L', Blocks.lever, 'P', plastic);
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.remoteController.item, 1),
					 "   ", " L ", "PBP", 'B', circuitBasic, 'L', Blocks.lever, 'P', plastic);
		}
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.remoteControllerModule.item, 1),
				 "   ", " B ", "   ", 'B', circuitBasic);
		//Brake Stick
		for (ItemStack plastic : plastics) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.brakeStick.item, 1),
					"IS ", " P ", " S ", 'I', ironingot, 'S', itemSteel, 'P', plastic);
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.brakeStick.item, 1),
					" SI", " P ", " S ", 'I', ironingot, 'S', itemSteel, 'P', plastic);
		}

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartFRED.item, 1), " T ", " D ", " S ", 'D', YELLOW_DYE, 'T', Blocks.redstone_torch, 'S', itemSteel);

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7angle3.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartCF7angle.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7angle.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartCF7angle3.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7round3.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartCF7round.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7round.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartCF7round3.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7hh.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecartCF7angle.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartU23BU.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecartU23B.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartES44h.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartES44.item));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartES44.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartES44h.item));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSD70ACe.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartSD70ACe_H.item));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSD70ACe_H.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartSD70ACe.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSD40R.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecartSD40.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSD40dash3.item, 1),  "   ", "ARC", "   ", 'R', new ItemStack(ItemIDs.minecartSD40dash2.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item), 'A', ItemIDs.steelcab.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSW10.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecartSW9.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSW1600.item, 1),  "   ", "ARC", "   ", 'R', new ItemStack(ItemIDs.minecartSW1500.item), 'A', new ItemStack(ItemIDs.partComponentEMD.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecart4ED172T_E.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecart4ED172T.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecart4ED172T_G.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecart4ED172T.item), 'C', new ItemStack(ItemIDs.partComponentGE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecart4ED172T_C.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecart4ED172T.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartH24_66L.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartH24_66.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartH24_66C.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartH24_66L.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartH24_66.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartH24_66C.item));
	}
	
	public void initSmeltingRecipes(){

		/* OpenHearthFurnace recipes */
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
			ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
			for (ItemStack s : steel) {
				for (ItemStack ironitm : iron){
				TrainCraftingManager.instance.addHearthFurnaceRecipe(ironitm,
						new ItemStack(ItemIDs.graphite.item), s, 2F, 1000);

				TrainCraftingManager.instance.addHearthFurnaceRecipe(new ItemStack(ItemIDs.graphite.item),
						ironitm, s, 2F, 1000);//reversed input recipe
				}
			}
		}
		
		/* Vanilla Furnace recipes */
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockIDs.oreTC.block), 0), OreDictionary.getOres("ingotCopper").get(0), 0.7f);
	}

	public static void addDictRecipe(ItemStack stack, Object... obj) {
		ShapedOreRecipe recipe = new ShapedOreRecipe(stack, obj);
		GameRegistry.addRecipe(recipe);
	}
}
