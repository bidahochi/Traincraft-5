/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import com.jcirmodelsquad.tcjcir.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import train.common.Traincraft;
import train.common.blocks.assemblytable.BlockAssemblyTableI;
import train.common.blocks.assemblytable.BlockAssemblyTableII;
import train.common.blocks.assemblytable.BlockAssemblyTableIII;
import train.common.blocks.crossers.*;
import train.common.blocks.stoppers.*;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.mtc.block.*;

public class TCBlocks {

	public static void init() {
		loadBlocks();
		registerBlocks();
		setHarvestLevels();
	}

	public static void loadBlocks() {
		BlockIDs.distilIdle.block = new BlockDistil(2, false).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.distilActive.block = new BlockDistil(2, true).setHardness(3.5F).setStepSound(Block.soundTypeStone).setLightLevel(0.8F);
		//BlockIDs.signal.block = new BlockSignal(BlockIDs.signal.blockID, 16).setHardness(1.7F).setStepSound(Block.soundTypeMetal);
		BlockIDs.assemblyTableI.block = new BlockAssemblyTableI(Material.wood).setHardness(3.5F).setStepSound(Block.soundTypeWood);
		BlockIDs.assemblyTableII.block = new BlockAssemblyTableII(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeWood);
		BlockIDs.assemblyTableIII.block = new BlockAssemblyTableIII(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeWood);
		//Switches by -hariesh
		BlockIDs.MILWSwitchStand.block = new BlockMILWSwitchStand().setHardness(1F).setStepSound(Block.soundTypeStone);
		BlockIDs.switchStand.block = new BlockHighStarSwitchStand().setHardness(1F).setStepSound(Block.soundTypeStone);
		BlockIDs.autoSwtichStand.block = new BlockAutoSwitchStand().setHardness(1F).setStepSound(Block.soundTypeAnvil);
		BlockIDs.owoSwitchStand.block = new BlockOwoSwitchStand().setHardness(2F).setStepSound(Block.soundTypeMetal);
		BlockIDs.circleSwitchStand.block = new BlockCircleSwitchStand().setHardness(2F).setStepSound(Block.soundTypeAnvil);
		BlockIDs.owoYardSwitchStand.block = new BlockOwoYardSwitchStand().setHardness(4F).setStepSound(Block.soundTypeLadder);
		BlockIDs.Racor36D_1.block = new BlockRacor36D_1().setHardness(4F).setStepSound(Block.soundTypeWood);
		BlockIDs.Racor36D_2.block = new BlockRacor36D_2().setHardness(4F).setStepSound(Block.soundTypeWood);
		BlockIDs.Racor36H.block = new BlockRacor36H().setHardness(4F).setStepSound(Block.soundTypeWood);
		BlockIDs.Racor36H_2.block = new BlockRacor36H_2().setHardness(4F).setStepSound(Block.soundTypeWood);

		BlockIDs.trainWorkbench.block = new BlockTrainWorkbench(16).setHardness(1.7F).setStepSound(Block.soundTypeWood);

		BlockIDs.stopper.block = new BlockStopper().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.americanstopper.block = new BlockAmericanStopper().setHardness(1.7F).setStepSound(Block.soundTypeMetal);

		BlockIDs.embeddedStopper.block = new BlockEmbeddedStopper().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.embeddedamericanstopper.block = new BlockAmericanEmbeddedStopper().setHardness(1.7F).setStepSound(Block.soundTypeMetal);

		BlockIDs.concrete_type1_stopper.block = new concrete_type1_stopper().setHardness(1.7F).setStepSound(Block.soundTypeWood);

		BlockIDs.concrete_type1_americanstopper.block = new concrete_type1_americanstopper().setHardness(1.7F).setStepSound(Block.soundTypeMetal);

		BlockIDs.concrete_type2_stopper.block = new concrete_type2_stopper()
				.setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.concrete_type2_americanstopper.block = new concrete_type2_americanstopper()
				.setHardness(1.7F).setStepSound(Block.soundTypeMetal);

		BlockIDs.wood_type1_stopper.block = new treated_wood_type1_stopper()
				.setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.wood_type1_americanstopper.block = new treated_wood_type1_americanstopper()
				.setHardness(1.7F).setStepSound(Block.soundTypeMetal);



		BlockIDs.openFurnaceIdle.block = new BlockOpenHearthFurnace(false).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.openFurnaceActive.block = new BlockOpenHearthFurnace(true).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.oreTC.block = new BlockOreTC().setHardness(3.0F).setResistance(5F).setStepSound(Block.soundTypeStone);

		//BlockIDs.poweredGravel.block = new BlockpoweredGravel(Material.rock).setHardness(0F).setStepSound(Block.soundTypeGravel).setBlockTextureName("tc:poweredGravel").setBlockName("poweredGravel").setCreativeTab(Traincraft.tcTab);
		//BlockIDs.snowGravel.block = new BlocksnowGravel(Material.ground).setHardness(1F).setStepSound(Block.soundTypeGravel).setBlockTextureName("tc:snowgravel").setBlockName("snowGravel").setCreativeTab(Traincraft.tcTab);
		BlockIDs.asphalt.block = new Blockasphalt(Material.ground).setHardness(2F).setStepSound(Block.soundTypeStone).setBlockTextureName("tc:asphalt").setBlockName("tc.asphalt").setResistance(10F).setCreativeTab(Traincraft.tcTab);
		BlockIDs.asphaltSlab.block = new BlockAsphaltSlab(false).setCreativeTab(Traincraft.tcTab).setBlockTextureName("tc:asphalt");
		BlockIDs.asphaltDoubleSlab.block = new BlockAsphaltSlab(true).setBlockTextureName("tc:asphalt");;
		BlockIDs.asphaltStairs.block = new BlockAsphaltStairs().setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("asphalt stairs").setCreativeTab(Traincraft.tcTab).setLightOpacity(0);;

		BlockIDs.dirtyBallast.block = new BaseBlockFalling("Dirty Gravel", 1f, 1f, "shovel", 1, Material.ground, Block.soundTypeGravel, "dirtygravel");
		BlockIDs.dirtierBallast.block = new BaseBlockFalling("Dirtier Gravel", 1f, 1f, "shovel", 1, Material.ground, Block.soundTypeGravel, "blackgravel");

		BlockIDs.lantern.block = new BlockLantern().setHardness(1.7F).setStepSound(Block.soundTypeMetal).setLightLevel(0.98F);
		BlockIDs.waterWheel.block = new BlockWaterWheel().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.windMill.block = new BlockWindMill().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.generatorDiesel.block = new BlockGeneratorDiesel().setHardness(1.7F).setStepSound(Block.soundTypeMetal);
		
		BlockIDs.tcRail.block = new BlockTCRail().setHardness(1.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(null);
		BlockIDs.tcRailGag.block = new BlockTCRailGag().setHardness(1.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(null);
		
		BlockIDs.bridgePillar.block = new BlockBridgePillar().setHardness(3.5F).setStepSound(Block.soundTypeWood);
		//BlockIDs.mtcVBCController.block = new BlockVBCController(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:vbcController").setBlockName("vbcController").setCreativeTab(Traincraft.tcTab);
		//BlockIDs.FortyFootContainer.block = new BlockFortyFootContainer(Material.iron).setHardness(4.5F).setCreativeTab(Traincraft.tcTab).setStepSound(Block.soundTypeMetal);


			BlockIDs.mtcTransmitterSpeed.block = new BlockTransmitterSpeed(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:speedTransmitter").setBlockName("mtcspeedtransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcTransmitterMTC.block = new BlockTransmitterMTC(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:mtctransmitter").setBlockName("mtcstatustransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcATOStopTransmitter.block = new BlockTransmitterStopPoint(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:atostoptransmitter").setBlockName("mtcatostoppointtransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcReceiverMTC.block = new BlockReceiverMTC(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:mtcreceiver").setBlockName("mtcstatusreceiver").setCreativeTab(Traincraft.tcTab);
			BlockIDs.pdmInstructionBlock.block = new BlockInstructionRadio(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:pdmradio").setBlockName("pdmradio").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcReceiverDestination.block = new BlockReceiverDestination(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:destinationreceiver").setBlockName("mtcdestinationreceiver").setCreativeTab(Traincraft.tcTab);
		//BlockIDs.book.block = new BlockBook(BlockIDs.book.blockID);

		//crossers
		BlockIDs.MFPBWigWag.block = new BlockMFPBWigWag().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.WigWag.block = new BlockWigWag().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.CrossingBase.block = new BlockCrossingBase().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.Flashers.block = new BlockFlashers().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.StandardCantilever1.block = new BlockStandardCantilever1().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.StandardCantilever2.block = new BlockStandardCantilever2().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.StandardCantilever3.block = new BlockStandardCantilever3().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.MediumCantileverRight.block = new BlockMediumCantileverRight().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.MediumCantileverLeft.block = new BlockMediumCantileverLeft().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.LargeCantilever.block = new BlockLargeCantilever().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.PedestrianCrossing.block = new BlockPedestrianCrossing().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.WoodenCrossingBuck.block = new BlockWoodenCrossingBuck().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.SmallBungalo.block = new BlockSmallBungalo().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.MediumBungalo.block = new BlockMediumBungalo().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.LargeBungalo.block = new BlockLargeBungalo().setHardness(2.5F).setStepSound(Block.soundTypeMetal);
		BlockIDs.StandardCrossingArm.block = new BlockFlashersWithGate().setHardness(2.5f).setStepSound(Block.soundTypeMetal);
		BlockIDs.StandardCrossingArm2.block = new BlockFlashersWithGate2().setHardness(2.5f).setStepSound(Block.soundTypeMetal);
	}

	public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				blocks.block.setBlockName(Info.modID + ":" + blocks.name());
				if (blocks.hasItemBlock) {
					GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
				} else {
					GameRegistry.registerBlock(blocks.block, blocks.name());
				}
			}
		}
	}

	public static void setHarvestLevels() {
		BlockIDs.trainWorkbench.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableI.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableII.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableIII.block.setHarvestLevel("axe", 0);
		BlockIDs.waterWheel.block.setHarvestLevel("axe", 0);
		BlockIDs.windMill.block.setHarvestLevel("axe", 0);
		BlockIDs.bridgePillar.block.setHarvestLevel("axe", 0);
		BlockIDs.oreTC.block.setHarvestLevel("pickaxe", 1);
		//BlockIDs.milwSwitchStand.setHarvestLevel("pickaxe",0);

		Blocks.rail.setHarvestLevel("ItemStacked", 0);
		Blocks.detector_rail.setHarvestLevel("ItemStacked", 0);
		Blocks.golden_rail.setHarvestLevel("ItemStacked", 0);
	}
}