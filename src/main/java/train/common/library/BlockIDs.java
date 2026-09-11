/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import train.common.items.*;

public enum BlockIDs implements IBlockIDs {

	assemblyTableI(false, null),
	assemblyTableII(false, null),
	assemblyTableIII(false, null),

	distilIdle(false, null),
	distilActive(false, null),
	signal(false, null),

	//book(true, ItemBlockBook.class),

	trainWorkbench(false, null),
	trainDetector(ItemBlockTrainDetector.class),

	stopper(ItemBlockTrackBuffer.class),
	embeddedStopper(false, null),

	americanstopper(ItemBlockTrackBuffer.class),
	embeddedamericanstopper(false, null),

	concrete_type1_stopper(false, null),
	concrete_type1_americanstopper(false, null),

	concrete_type2_stopper(false, null),
	concrete_type2_americanstopper(false, null),
	wood_type1_stopper(false, null),
	wood_type1_americanstopper(false, null),

	wood_type2_stopper(false, null),
	wood_type2_americanstopper(false, null),

	openFurnaceIdle(false, null),
	openFurnaceActive(false, null),
	oreTC(true, ItemBlockOreTC.class, 4),
	lantern(false, null),
	switchStand(ItemBlockSwitchStand.class),
	waterWheel(true, ItemBlockGeneratorWaterWheel.class),
	windMill(true, ItemBlockGeneratorWindMill.class),
	generatorDiesel(true, ItemBlockGeneratorDiesel.class),
	mtcTransmitterSpeed(false, null),
	mtcTransmitterMTC(false, null),
	mtcATOStopTransmitter(false, null),
	mtcReceiverMTC(false, null),
	mtcReceiverDestination(false, null),
	pdmInstructionBlock(false, null),
	//actualSignalBlock(false, null),
	//betterDetector(false, null),
	//mtcMultiTransmitter(false, null),
	//mtcMultiReceiver(false, null),
	//trainMonitor(false, null),
	mtcMarker(false, null),
    //FortyFootContainer(true, ItemFortyFootContainer.class),
	//Liquids
	diesel(false, ItemBlockFluid.class),
	refinedFuel(false, ItemBlockFluid.class),

	tcRailGag(false,null),
	tcRail(false,null),
	tcRailGagEmbedded(false,null),
	tcRailEmbedded(false,null),
	tcRailGagSlabMounted(false,null),
	tcRailSlabMounted(false,null),
	tcRailGagStairMounted(false,null),
	tcRailStairMounted(false,null),
	bridgePillar(false,null),

	MILWSwitchStand(ItemBlockSwitchStand.class),
	autoSwtichStand(ItemBlockSwitchStand.class),
	owoSwitchStand(ItemBlockSwitchStand.class),
	circleSwitchStand(ItemBlockSwitchStand.class),
	owoYardSwitchStand(ItemBlockSwitchStand.class),
	Racor36D_1(ItemBlockSwitchStand.class),
	Racor36D_2(ItemBlockSwitchStand.class),
	Racor36H(ItemBlockSwitchStand.class),
	Racor36H_2(ItemBlockSwitchStand.class),

	poweredGravel(false,null),

	snowGravel(false,null),
	dirtyBallast(false,null),
	dirtierBallast(false,null),
	asphalt(false, null),
	asphaltSlab(true, ItemAsphaltSlab.class),
	asphaltDoubleSlab(true, ItemAsphaltSlab.class),

	//Stairs
	asphaltStairs(false, null),

    mtcVBCController(false,null ),

	//crossing stuff
	MFPBWigWag(false, null),
	WigWag(false, null),
	CrossingTest(false, null),
	CrossingBase(false, null),
	Flashers(false, null),
	StandardCantilever1(false, null),
	StandardCantilever2(false, null),
	StandardCantilever3(false, null),
	MediumCantileverRight(false, null),
	MediumCantileverLeft(false, null),
	LargeCantilever(false, null),
	PedestrianCrossing(false, null),
	StandardCrossingArm(false, null),
	StandardCrossingArm2(false, null),
	WoodenCrossingBuck(false, null),
	SmallBungalo(false, null),
	MediumBungalo(false, null),
	LargeBungalo(false, null),
	;

	public Block block;
	public boolean hasItemBlock;
	public Class itemBlockClass;

	private final int MaxMetaData;

	private BlockIDs(Class<? extends ItemBlock> itemBlockClass) {
		this.hasItemBlock = true;
		this.itemBlockClass = itemBlockClass;
		MaxMetaData = -1;
	}

	private BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
		MaxMetaData = -1;
	}

	private BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, int maxMetaData) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
		MaxMetaData = maxMetaData;
	}

	@Override
	public Block getBlock()
	{
		return block;
	}

	@Override
	public boolean hasItemBlock()
	{
		return hasItemBlock;
	}

	@Override
	public Class getItemBlockClass()
	{
		return itemBlockClass;
	}

	@Override
	public int getMaxMetaData()
	{
		return MaxMetaData;
	}
}
