package train.common.api;

import com.mojang.authlib.GameProfile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.carts.IRoutableCart;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.api.pathfinding.PathFindingHelper;
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.library.track.TrackCellResolver;
import train.common.items.ItemTCRail;
import train.common.items.TCRailTypes;
import train.common.library.BlockIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;
import train.common.tile.TileTrainDetector;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EntityBogie extends EntityMinecart implements IMinecart, IRoutableCart {

	public boolean isOnRail;
	public float prevDpdx;
	public float prevDpdz;
	public World worldObj;
	public int meta;
	public EntityRollingStock entityMainTrain;
	private PathFindingHelper pathFindingHelper;
	public int entityMainTrainID;
	protected int bogieIndex;
	public double bogieShift;
	protected Side side;

	public TileTCRail currentParentRail = null;
	private final LinkedList<TileTrainDetector> activeDetectors = new LinkedList<>();


	private int turnProgress;
    private double minecartX;
    private double minecartY;
    private double minecartZ;
    private double minecartYaw;
    private double minecartPitch;
    @SideOnly(Side.CLIENT)
    private double velocityX;
    @SideOnly(Side.CLIENT)
    private double velocityY;
    @SideOnly(Side.CLIENT)
    private double velocityZ;



	public EntityBogie(World world) {

		super(world);

		this.isOnRail = false;
		this.prevDpdx = 0F;
		this.prevDpdz = 0F;
		this.worldObj = world;
		pathFindingHelper = new PathFindingHelper();
		if (entityMainTrain != null) {

			setSize(entityMainTrain.width, entityMainTrain.height);
		}
		else {

			setSize(0.98F, 1.98F);
		}

		//this.boundingBox.offset(0, 0.5, 0);
		setCollisionHandler(null);
		this.yOffset = 0.65f;
		//this.setSize(0.1F, 1.98F);
		this.side = FMLCommonHandler.instance().getEffectiveSide();
		isImmuneToFire = true;
	}

	public EntityBogie(World world, double d, double d1, double d2, EntityRollingStock mainTrain, int id, int index, double bogieShift) {

		this(world);

		this.entityMainTrain = mainTrain;
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevPosX = d;
		this.prevPosY = d1;
		this.prevPosZ = d2;
		this.entityMainTrainID = id;
		this.bogieIndex = index;
		this.bogieShift = bogieShift;
		this.setPosition(d, d1 + this.yOffset, d2);
		isImmuneToFire = true;
	}

	@Override
	public boolean canBePushed() {

		return false;
	}

	/**
	 * Returns a boundingBox used to collide the entity with other entities and blocks. This enables the entity to be pushable on contact, like boats or minecarts.
	 */
	@Override
	public AxisAlignedBB getCollisionBox(Entity par1Entity) {

		return null;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damageSource, float f) {
		return (this.entityMainTrain != null && entityMainTrain.attackEntityFrom(damageSource, f));
	}

	@Override
	public void applyEntityCollision(Entity entity) {

		if (this.entityMainTrain != null && entity != this.entityMainTrain) {

			this.entityMainTrain.applyEntityCollision(entity);
		}
	}

	/** Updates the bogie's target motion and derail state relative to its owning rolling stock. */
	public void updateDistance() {
		float dx = (float) (this.posX - entityMainTrain.posX);
		float dz = (float) (this.posZ - entityMainTrain.posZ);
		float angle = (float) Math.toDegrees(Math.atan2(dz, dx)) - 90F;
		angle = MathHelper.wrapAngleTo180_float(angle);
		float serverRealRotation = angle;

		float rotationCos1 = (float) Math.cos(Math.toRadians(serverRealRotation + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((serverRealRotation + 90)));

		double bogieX1 = (entityMainTrain.posX + (rotationCos1 * Math.abs(this.bogieShift)));
		double bogieZ1 = (entityMainTrain.posZ + (rotationSin1 * Math.abs(this.bogieShift)));

		this.motionX = (bogieX1 - this.posX);
		this.motionZ = (bogieZ1 - this.posZ);
		//this.setPosition(bogieX1, this.posY, bogieZ1);
		//pathFindingHelper.checkIfPathIsCorrect(this);

		if (isOnRail() == false) {
			this.isDerail = true;
		} else if (isDerail) {
			this.isDerail = false;
		}
	}

	private boolean isDerail = false;

	/**
	 * Returns whether the bogie resolves an ordinary rail or the raised end of a slab-mounted slope.
	 *
	 * @return whether a supporting rail cell exists beneath the bogie
	 */
	public boolean isOnRail()
	{
		return pathFindingHelper.isOnRail(this, worldObj)
				|| SlabMountedSlopeRailLookup.isSlabMountedSlopeCell(worldObj,
						MathHelper.floor_double(posX), MathHelper.floor_double(posY) - 2,
						MathHelper.floor_double(posZ));
		//if(isDerail) {
		//	return false;
		//}
		//
		//int i = MathHelper.floor_double(this.posX);
		//int j = MathHelper.floor_double(this.posY);
		//int k = MathHelper.floor_double(this.posZ);
		//
		//if(this.worldObj.isAirBlock(i, j, k)) {
		//	j--;
		//}
		//Block block = this.worldObj.getBlock(i, j, k);
		//return (BlockRailBase.func_150051_a(block) || block == BlockIDs.tcRail.block || block == BlockIDs.tcRailGag.block);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getShadowSize() {

		return this.height / 2.0F;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {

		if (this.entityMainTrain != null) {

			this.entityMainTrain.interactFirst(entityplayer);
		}

		return true;
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {

		this.entityMainTrainID = nbttagcompound.getInteger("trainID");
		this.bogieIndex = nbttagcompound.getInteger("bogieIndex");
		this.bogieShift = nbttagcompound.getDouble("bogieShift");

		super.readEntityFromNBT(nbttagcompound);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {

		nbttagcompound.setInteger("trainID", entityMainTrainID);
		nbttagcompound.setInteger("bogieIndex", bogieIndex);
		nbttagcompound.setDouble("bogieShift", bogieShift);

		super.writeEntityToNBT(nbttagcompound);
	}

	@Override
	public int getMinecartType() {

		return -1;
	}

	@Override
	public String getDestination() {

		if (this.entityMainTrain != null) {

			return this.entityMainTrain.getDestination();
		}

		return null;
	}

	@Override
	public boolean setDestination(ItemStack ticket) {

		return (this.entityMainTrain != null && this.entityMainTrain.setDestination(ticket));
	}

	@Override
	public boolean doesCartMatchFilter(ItemStack stack, EntityMinecart cart) {

		return false;
	}

	/**
	 * Return false if this cart should not call onMinecartPass() and should ignore Powered Rails.
	 *
	 * @return True if this cart should call onMinecartPass().
	 */
	@Override
	public boolean shouldDoRailFunctions() {

		return false;
	}

	@Override
	public double getSlopeAdjustment() {

		return 0;
	}

	/**
	 * Returns the carts max speed when traveling on rails. Carts going faster than 1.1 cause issues
	 * with chunk loading. This value is compared with the rails max speed and the carts current
	 * speed cap to determine the carts current max speed. A normal rail's max speed is 0.4.
	 *
	 * @return Carts max speed.
	 */
	@Override
	public float getMaxCartSpeedOnRail() {

		return 1.8f;
	}

	@Override
	protected void func_145821_a(int x, int y, int z, double maxSpeed, double slopeAdjustment, Block block, int railMeta) {
		//super.func_145821_a(x, y, z, maxSpeed, slopeAdjustment, block, railMeta);
		super.func_145821_a(x, y, z, this.getMaxCartSpeedOnRail(), slopeAdjustment, block, railMeta);
	}
	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate(){
		//super.onUpdate(); // XXX I'll just assume that this is not supposed to be there. Why would you run Vanilla update code, only to run your own code afterwards to do basically the same..?

		this.setCurrentCartSpeedCapOnRail(1.8F);
		this.setMaxSpeedAirLateral(1.8F);

		//if (!this.worldObj.isRemote || true) {

		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;

		int i = MathHelper.floor_double(this.posX);
		int j = MathHelper.floor_double(this.posY);
		int k = MathHelper.floor_double(this.posZ);
		Block block = this.worldObj.getBlock(i, j - 1, k);

		if (BlockRailBase.func_150051_a(block) || TrackCellResolver.isTraincraftRailBlock(block)) {
			j--;
		} else if (SlabMountedSlopeRailLookup.isSlabMountedSlopeCell(this.worldObj, i, j - 2, k)) {
			j -= 2;
			block = this.worldObj.getBlock(i, j, k);
		} else {
			Block block2 = this.worldObj.getBlock(i, j + 1, k);
			if(BlockRailBase.func_150051_a(block2) || TrackCellResolver.isTraincraftRailBlock(block2)){
				j++;
			}
			block = this.worldObj.getBlock(i, j, k);
		}

		if (BlockRailBase.func_150051_a(block)) {
			super.onUpdate();
			if (!worldObj.isRemote) {
				this.setPosition(this.posX, this.posY + yOffset - 0.3d, this.posZ);
				// System.out.println("Server Y: " + this.posY);
			}
		} else {
			if (this.worldObj.isRemote)
			{
				if (this.turnProgress > 0)
				{
					double d6 = this.posX + (this.minecartX - this.posX) / this.turnProgress;
					double d7 = this.posY + (this.minecartY - this.posY) / this.turnProgress;
					double d1 = this.posZ + (this.minecartZ - this.posZ) / this.turnProgress;
					double d3 = MathHelper.wrapAngleTo180_double(this.minecartYaw - this.rotationYaw);
					this.rotationYaw = (float)(this.rotationYaw + d3 / this.turnProgress);
					this.rotationPitch = (float)(this.rotationPitch + (this.minecartPitch - this.rotationPitch) / this.turnProgress);
					--this.turnProgress;
					this.setPosition(d6, d7, d1);
					this.setRotation(this.rotationYaw, this.rotationPitch);
				}
				else
				{
					this.setPosition(this.posX, this.posY, this.posZ);
					this.setRotation(this.rotationYaw, this.rotationPitch);
				}
			}
			else
			{
				TileEntity tileEntity = this.worldObj.getTileEntity(i, j, k);
				TileTCRail tileRail;

				if (TrackCellResolver.isTraincraftGagBlock(block)) {

					if (tileEntity instanceof TileTCRailGag) {

						TileTCRailGag tileGag = (TileTCRailGag) tileEntity;
						tileEntity = this.worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);
					}
					else {

						return;
					}
				}

				if (tileEntity instanceof TileTCRail) {

					tileRail = (TileTCRail) tileEntity;
				}
				else { // If we are not on a rail…
					// Remove any active detectors if derailed.
					if (activeDetectors.isEmpty() == false) {
						removeObsoleteDetectors(new LinkedList<>());
					}
					super.onUpdate();
					return;
				}

				handleTrainDetector(tileRail);

				//applyDragAndPushForces();
				limitSpeedOnTCRail();

				if (ItemTCRail.isTCTurnTrack(tileRail))
				{
					int meta = tileRail.getBlockMetadata();
					if (pathFindingHelper.shouldIgnoreSwitch(this,tileRail, i, j, k, meta)) {
						pathFindingHelper.moveOnTCStraight(this, tileRail, i, j, k, tileRail.xCoord, tileRail.zCoord, tileRail.getBlockMetadata());
					} else {
						moveOnTC90TurnRail(tileRail, j, tileRail.r, tileRail.cx, tileRail.cz);
					}

				}
				else if (ItemTCRail.isTCStraightTrack(tileRail) || (TCRailTypes.isSwitchTrack(tileRail) && tileRail.getSwitchState() == false))
				{
					pathFindingHelper.moveOnTCStraight(this, tileRail, i, j, k, tileRail.xCoord, tileRail.zCoord, tileRail.getBlockMetadata());
					//moveOnTCStraight(j, tileRail.xCoord, tileRail.zCoord, tileRail.getBlockMetadata());
				}
				else if (TCRailTypes.isTurnTrack(tileRail) || (TCRailTypes.isSwitchTrack(tileRail) && tileRail.getSwitchState()))
				{
					if (shouldIgnoreSwitch(tileRail, i, j, k, meta)) {
						pathFindingHelper.moveOnTCStraight(this, tileRail, i, j, k, tileRail.xCoord, tileRail.zCoord, tileRail.getBlockMetadata());
					}
					else {
						moveOnNewTC90TurnRail(tileRail, j, tileRail.r, tileRail.cx, tileRail.cz);
					}
				}
				else if (TCRailTypes.isCrossingTrack(tileRail))
				{
					moveOnTCTwoWaysCrossing(tileRail, j);
				}
				else if (TCRailTypes.isDiagonalCrossingTrack(tileRail))
				{
					moveOnTCDiamondCrossing(tileRail, i, j, k, tileRail.xCoord,  tileRail.zCoord);
				}
				else if (TCRailTypes.isDiagonalTrack(tileRail))
				{
					pathFindingHelper.moveOnTCDiagonal(this, tileRail, i, j, k, tileRail.xCoord, tileRail.zCoord, tileRail.getBlockMetadata(), tileRail.getRailLength());
				}
				else if (TCRailTypes.isSlopeTrack(tileRail)) {

					moveOnTCSlope(tileRail, j, tileRail.xCoord, tileRail.zCoord, tileRail.slopeAngle, tileRail.slopeHeight, tileRail.slopeLength, tileRail.getBlockMetadata());
				}
			}
		}

		this.func_145775_I();
		this.rotationPitch = 0.0F;
		//}

		if (!this.worldObj.isRemote) {

			if(this.entityMainTrain == null || this.entityMainTrain.isDead) {

				this.setDead();
				worldObj.removeEntity(this);
			}

			AxisAlignedBB axisAlignedBB;

			if (getCollisionHandler() != null) {

				axisAlignedBB = getCollisionHandler().getMinecartCollisionBox(this);
			}
			else {

				axisAlignedBB = this.boundingBox.expand(0.2D, 0.0D, 0.2D);
			}

			@SuppressWarnings("rawtypes")
			List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, axisAlignedBB);

			if (list != null && !list.isEmpty()) {

				Entity entity;

				for(i = 0; i < list.size(); ++i) {

					entity = (Entity) list.get(i);

					if (entity != this.riddenByEntity) {

						this.applyEntityCollision(entity);
					}
				}
			}
		}
		if (posX == 0 && posZ == 0) {
			worldObj.removeEntity(this);
		}
	}

	@Override
	public void setDead() {
		super.setDead();
		for (TileTrainDetector detector : activeDetectors) {
			detector.removeEntity(this);
		}
		activeDetectors.clear();
	}

	/**
	 * @author 02skaplan
	 * @author broscolotos
	 * @param tileRail Rail tile currently being traversed.
	 */
	private void handleTrainDetector(TileTCRail tileRail) {
		// Straights longer than 1x3 are essentially just stacked 1x3 rails, with the "true parent" being referenced in isLinkedToRail.
		if (tileRail.isLinkedToRail) {
			TileEntity parentOfAParent = worldObj.getTileEntity(tileRail.linkedX, tileRail.linkedY, tileRail.linkedZ);
			if (parentOfAParent instanceof TileTCRail) {
				tileRail = ((TileTCRail) parentOfAParent);
			}
		}
		// Check if the track has any linked Train Detectors.
		LinkedList<TileTrainDetector> trackPairedDetectors = tileRail.getPairedDetectors();
		if (!trackPairedDetectors.isEmpty()) {
			for (TileTrainDetector detector : trackPairedDetectors) {
				// Check for new detectors.
				if (!activeDetectors.contains(detector)) {
					// Add entity to the new detector.
					detector.addEntity(this);
					activeDetectors.add(detector);
				}
			}
			// Remove and mark as obsolete any old detectors.
			removeObsoleteDetectors(trackPairedDetectors);
		}
		// Remove all active detectors when we move to a track that does not have any detectors.
		else if (activeDetectors.isEmpty() == false) {
			removeObsoleteDetectors(trackPairedDetectors);
        }
	}

	private void removeObsoleteDetectors(LinkedList<TileTrainDetector> trackPairedDetectors) {
		Iterator<TileTrainDetector> detectorIterator = activeDetectors.iterator();
		TileTrainDetector detector;
		while (detectorIterator.hasNext()) {
			detector = detectorIterator.next();
			if (!trackPairedDetectors.contains(detector)) {
				detector.removeEntity(this);
				detectorIterator.remove();
			}
		}
	}

	private boolean shouldIgnoreSwitch(TileTCRail tile, int railX, int railY, int railZ, int meta) {
		if (tile != null && TCRailTypes.isTurnTrack(tile) && tile.canTypeBeModifiedBySwitch) {
			if (meta == 2) {
				if (motionZ > 0 && Math.abs(motionX) < 0.01) {
					TileEntity tile2 = worldObj.getTileEntity(railX, railY, railZ + 1);
					if (tile2 != null && tile2 instanceof TileTCRail) {
					//	((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 0) {
				if (motionZ < 0 && Math.abs(motionX) < 0.01) {
					TileEntity tile2 = worldObj.getTileEntity(railX, railY, railZ - 1);
					if (tile2 != null && tile2 instanceof TileTCRail) {
					//	((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 1) {
				if (Math.abs(motionZ) < 0.002 && motionX > 0) { //allow a little more off-axis motion
					TileEntity tile2 = worldObj.getTileEntity(railX + 1, railY, railZ);
					if (tile2 != null && tile2 instanceof TileTCRail) {
					//	((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 3) {
				if (Math.abs(motionZ) < 0.01 && motionX < 0) {
					TileEntity tile2 = worldObj.getTileEntity(railX - 1, railY, railZ);
					if (tile2 != null && tile2 instanceof TileTCRail) {
					//	((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Moves this bogie straight across a two-way crossing at the rail's ride height.
	 *
	 * @param rail resolved crossing parent rail
	 * @param j crossing block Y coordinate
	 */
	private void moveOnTCTwoWaysCrossing(TileTCRail rail, int j) {
		this.posY = j + rail.getTrackRideYOffset() + 0.2;
		/*
		 * Nitro-Note: Do we need all those shitty motionX and Z? We don't even
		 * need something to parse to this function. setPosition is superflous since you can't place
		 * trains down on 2 way crossings.
		 */
		// this.posY = j + 0.2D;
		//System.out.println(l);
		//if(l==2||l==0)moveEntity(motionX, 0.0D, 0.0D);
		//if(l==1||l==3)moveEntity(0.0D, 0.0D, motionZ);
		//if(Math.abs(motionX)>Math.abs(motionZ))System.out.println("X");
		//if(Math.abs(motionZ)>Math.abs(motionX))System.out.println("Z");

		double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

		if (Math.abs(motionZ) > Math.abs(motionX)) {

			// this.setPosition(this.posX, this.posY + this.yOffset, cz + 0.5D);
			this.moveEntity(0.0D, 0.0D, Math.copySign(norm, this.motionZ));

			// this.motionX = 0.0D;
			// this.motionZ = Math.copySign(norm, this.motionZ);
		}
		else {

			// double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

			// this.setPosition(cx + 0.5D, this.posY + this.yOffset, this.posZ);
			this.moveEntity(Math.copySign(norm, this.motionX), 0.0D, 0.0D);

			// this.motionX = Math.copySign(norm, this.motionX);
			// this.motionZ = 0.0D;
		}

	}

	/**
	 * Moves this bogie through a diamond crossing along its dominant approach direction.
	 *
	 * @param rail resolved crossing parent rail
	 * @param railX crossing block X coordinate
	 * @param railY crossing block Y coordinate
	 * @param railZ crossing block Z coordinate
	 * @param centerX crossing center X coordinate
	 * @param centerZ crossing center Z coordinate
	 */
	protected void moveOnTCDiamondCrossing(TileTCRail rail, int railX, int railY, int railZ,
			double centerX, double centerZ) {

		this.posY = railY + rail.getTrackRideYOffset() + 0.2;


		double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

		if (Math.abs(motionZ) > Math.abs(motionX * 2)) {
			this.moveEntity(0.0D, 0.0D, Math.copySign(norm, this.motionZ));
		}
		else if (Math.abs(motionZ * 2) < Math.abs(motionX)) {
			this.moveEntity(Math.copySign(norm, this.motionX), 0.0D, 0.0D);
		}
		else {
			this.moveEntity(Math.copySign(norm, this.motionX), 0.0D, Math.copySign(norm, this.motionZ));
		}
/*

		int l = MathHelper.floor_double(rotationYaw * 8.0F / 360.0F + 0.5) & 7;


		if (l == 0 || l == 4) {
			moveEntity(motionX, 0.0D, 0.0D);
		}
		else if (l == 2 || l == 6) {
			moveEntity(0.0D, 0.0D, motionZ);
		}
		else if (l == 1) {
			moveOnTCDiagonal(railX, railY, railZ, centerX, centerZ, 5, 1);
		}
		else if (l == 3){
			moveOnTCDiagonal(railX, railY, railZ, centerX, centerZ, 6, 1);
		}
		else if (l == 5) {
			moveOnTCDiagonal(railX, railY, railZ, centerX, centerZ, 7, 1);
		}
		else if (l == 7) {
			moveOnTCDiagonal(railX, railY, railZ, centerX, centerZ, 4, 1);
		}*/
	}

	/**
	 * Moves this bogie along one cardinal Traincraft slope.
	 *
	 * @param rail authoritative parent rail
	 * @param j parent rail block Y coordinate
	 * @param cx parent rail block X coordinate
	 * @param cz parent rail block Z coordinate
	 * @param slopeAngle stored slope angle in radians
	 * @param slopeHeight total vertical rise of the slope
	 * @param slopeLength horizontal slope length in blocks
	 * @param meta cardinal rail direction metadata
	 */
	private void moveOnTCSlope(TileTCRail rail, int j, double cx, double cz, double slopeAngle, double slopeHeight, double slopeLength, int meta) {
		if (PathFindingHelper.isEmbeddedTransitionSlope(rail)) {
			pathFindingHelper.moveOnTCEmbeddedTransitionSlope(this, rail, j, cx, cz, meta, slopeLength);
			return;
		}
		if (meta > 3) {
			pathFindingHelper.moveOnTCDiagonalSlope(this, rail, j, cx, cz, slopeAngle, slopeHeight, meta, slopeLength);
			return;
		}
		boolean alongZ = meta == 0 || meta == 2;
		double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

		if (meta == 2) cz += 1;
		else if (meta == 1) cx += 1;

		double delta = alongZ ? Math.abs(cz - this.posZ) : Math.abs(cx - this.posX);
		boolean halfHeightSlope = rail.getTrackType() != null
				&& rail.getTrackType().getCoreTrack().isHalfHeightSlope();
		double rise = halfHeightSlope ? Math.tan(slopeAngle) * delta : Math.tan(slopeAngle * delta);
		double newPosY = Math.abs(j + rail.getTrackRideYOffset()
				+ rise + this.yOffset + 0.3);

		newPosY = derailCheck(cx, newPosY, cz, alongZ);

		if (alongZ) {
			this.setPosition(cx + 0.5D, newPosY, this.posZ);
			this.boundingBox.offset(0, 0 , Math.copySign(norm, this.motionZ));
		} else {
			this.setPosition(this.posX, newPosY, cz + 0.5D);
			this.boundingBox.offset(Math.copySign(norm, this.motionX), 0 ,0);
		}

		this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
		this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
		this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;

		this.motionX = alongZ ? 0.0D : Math.copySign(norm, this.motionX);
		this.motionY = 0;
		this.motionZ = alongZ ? Math.copySign(norm, this.motionZ) : 0.0D;
	}

	/**
	 * Moves this bogie around a newer radial 90-degree turn at the rail's ride height.
	 *
	 * @param rail resolved turn parent rail
	 * @param j turn block Y coordinate
	 * @param r authored turn radius
	 * @param cx turn center X coordinate
	 * @param cz turn center Z coordinate
	 */
	private void moveOnNewTC90TurnRail(TileTCRail rail, int j,double r, double cx, double cz){

		posY = j + rail.getTrackRideYOffset() + 0.2;
		double cpx = posX - cx;
		double cpz = posZ - cz;
		double cp_norm = Math.sqrt(cpx * cpx + cpz * cpz);

		double vnorm = Math.sqrt(motionX * motionX + motionZ * motionZ);

		double norm_cpx = cpx / cp_norm; //u
		double norm_cpz = cpz / cp_norm; //v

		double vx2 = -norm_cpz * vnorm;//-v
		double vz2 = norm_cpx * vnorm;//u

		double px2 = posX + motionX;
		double pz2 = posZ + motionZ;

		double px2_cx = px2 - cx;
		double pz2_cz = pz2 - cz;

		double p2_c_norm = Math.sqrt((px2_cx * px2_cx) + (pz2_cz * pz2_cz));

		double px2_cx_norm = px2_cx / p2_c_norm;
		double pz2_cz_norm = pz2_cz / p2_c_norm;

		double px3 = cx + (px2_cx_norm * r);
		double pz3 = cz + (pz2_cz_norm * r);

		double signX = px3 - posX;
		double signZ = pz3 - posZ;

		vx2 = Math.copySign(vx2, signX);
		vz2 = Math.copySign(vz2, signZ);

		double p_corr_x = cx + ((cpx / cp_norm) * r);
		double p_corr_z = cz + ((cpz / cp_norm) * r);


		setPosition(p_corr_x, posY + yOffset, p_corr_z);
		moveEntity(vx2, 0.0D, vz2);
		motionX = vx2;
		motionZ = vz2;

	}

	/**
	 * Moves this bogie around a legacy radial 90-degree turn at the rail's ride height.
	 *
	 * @param rail resolved turn parent rail
	 * @param j turn block Y coordinate
	 * @param r authored turn radius
	 * @param cx turn center X coordinate
	 * @param cz turn center Z coordinate
	 */
	private void moveOnTC90TurnRail(TileTCRail rail, int j,double r, double cx, double cz){
		posY = j + rail.getTrackRideYOffset() + 0.2;
		double cpx = posX - cx;
		double cpz = posZ - cz;
		double cp_norm = Math.sqrt(cpx * cpx + cpz * cpz);

		double vnorm = Math.sqrt(motionX * motionX + motionZ * motionZ);

		double norm_cpx = cpx / cp_norm;//u
		double norm_cpz = cpz / cp_norm;//v

		double vx2 = -norm_cpz * vnorm;//-v
		double vz2 = norm_cpx * vnorm;//u

		double px2 = posX + motionX;
		double pz2 = posZ + motionZ;

		double px2_cx = px2 - cx;
		double pz2_cz = pz2 - cz;

		double p2_c_norm = Math.sqrt((px2_cx * px2_cx) + (pz2_cz * pz2_cz));

		double px2_cx_norm = px2_cx / p2_c_norm;
		double pz2_cz_norm = pz2_cz / p2_c_norm;

		double px3 = cx + (px2_cx_norm * r);
		double pz3 = cz + (pz2_cz_norm * r);

		double signX = px3 - posX;
		double signZ = pz3 - posZ;

		vx2 = Math.copySign(vx2, signX);
		vz2 = Math.copySign(vz2, signZ);

		double p_corr_x = cx + ((cpx / cp_norm) * r);
		double p_corr_z = cz + ((cpz / cp_norm) * r);

		setPosition(p_corr_x, posY + yOffset, p_corr_z);

		moveEntity(vx2, 0.0D, vz2);
		motionX = vx2;
		motionZ = vz2;
	}

	private void limitSpeedOnTCRail() {

		/*
		Block id = worldObj.getBlock(x, y, z);

		if (!BlockRailBase.isRailBlock(id)) {

			return;
		}

		railMaxSpeed = ((BlockRailBase) Block.blocksList[id]).getRailMaxSpeed(worldObj, this, x, y, z);
		 */

		//double railMaxSpeed = 3; // XXX Really? Define a field for THAT? Come on..
		double maxSpeed = Math.min(3.0D, getMaxCartSpeedOnRail());

		if (this.motionX < -maxSpeed) {

			this.motionX = -maxSpeed;
		}
		else if (this.motionX > maxSpeed) {

			this.motionX = maxSpeed;
		}

		if (this.motionZ < -maxSpeed) {

			this.motionZ = -maxSpeed;
		}
		else if (this.motionZ > maxSpeed) {

			this.motionZ = maxSpeed;
		}
	}

	private double derailCheck(double posX, double posY, double posZ, boolean alongZ) {
		if (this.isDerail) {
			int blockX = alongZ ? (int) posX : (int) this.posX;
			int blockZ = alongZ ? (int) this.posZ : (int) posZ;

			for (int i = -2; i< 3;i++) {
				if (worldObj.getBlock(blockX, (int) posY + i, blockZ) instanceof BlockTCRail ||
						worldObj.getBlock(blockX, (int) posY + i, blockZ) instanceof BlockTCRailGag) {
					if (Math.round(this.entityMainTrain.posY) == Math.round(this.posY)) {
						posY += i + 1;
						break;
					}
				}
			}
		}
		return posY;
	}

	private double derailCheck(double posX, double posY, double posZ) {
		if (this.isDerail) {
			for (int i = -2; i< 3;i++) {
				int blockX = (int) posX;
				int blockZ = (int) posZ;

				if (worldObj.getBlock(blockX, (int) posY + i, blockZ) instanceof BlockTCRail ||
						worldObj.getBlock(blockX, (int) posY + i, blockZ) instanceof BlockTCRailGag) {
					if (Math.round(this.entityMainTrain.posY) == Math.round(this.posY)) {
						posY += i + 1;
						break;
					}
				}
			}
		}
		return posY;
	}

	@Override
	public GameProfile getOwner() {

		return  this.entityMainTrain.getOwner();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void setPositionAndRotation2(double p_70056_1_, double p_70056_3_, double p_70056_5_, float p_70056_7_,
			float p_70056_8_, int p_70056_9_) {
		super.setPositionAndRotation2(p_70056_1_, p_70056_3_, p_70056_5_, p_70056_7_, p_70056_8_, p_70056_9_);
		this.minecartX = p_70056_1_;
		this.minecartY = p_70056_3_;
		this.minecartZ = p_70056_5_;
		this.minecartYaw = p_70056_7_;
		this.minecartPitch = p_70056_8_;
		this.turnProgress = p_70056_9_ + 2;
		this.motionX = this.velocityX;
		this.motionY = this.velocityY;
		this.motionZ = this.velocityZ;
	}
	/*@SideOnly(Side.CLIENT)
	public boolean isInRangeToRenderDist(double p_70112_1_)
	{
		return p_70112_1_ > 1D;
	}*/
}
