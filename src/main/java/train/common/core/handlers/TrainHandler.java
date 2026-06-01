package train.common.core.handlers;

import mods.railcraft.api.tracks.RailTools;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.api.masterphysics.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class TrainHandler {
	private EntityRollingStock rolling;
	private ArrayList<EntityRollingStock> train = new ArrayList<EntityRollingStock>();
	private ArrayList<TrainExternalPush> pendingExternalPushes = new ArrayList<TrainExternalPush>();
	private int trainPower;

	public void queueExternalPush(TrainExternalPush push) {
		if (push == null || push.target == null) {
			return;
		}

		if (hasParkingBrakeApplied()) {
			return;
		}

		if (isIncompleteDueToUnloadedLinks()) {
			return;
		}

		pendingExternalPushes.add(push);
	}

	public ArrayList<TrainExternalPush> consumeExternalPushes() {
		ArrayList<TrainExternalPush> copy = new ArrayList<TrainExternalPush>(pendingExternalPushes);
		pendingExternalPushes.clear();
		return copy;
	}

	private TrainPhysicsController physicsController;
	private TrainConsistChunkLoader chunkLoader;

	private long lastPhysicsTick = -1L;
	private long lastTractionWarningTick = -200L;

	private EntityRollingStock cachedPhysicsMaster;
	private EntityRollingStock tractionMaster;
	private EntityRollingStock parkingBrakeSource;

	private boolean tractionBlocked;
	private String tractionBlockReason = "";

	private boolean masterSelectionDirty = true;
	private String masterSelectionDirtyReason = "";

	private boolean incompleteDueToUnloadedLinks = false;
	private boolean chunkLoadingEnabled = true;

	public TrainHandler() {}

	public TrainHandler(EntityRollingStock rolling) {
		this.rolling = rolling;
		addRollingStock(rolling);
		EntityRollingStock.allTrains.add(this);
	}

	public void addRollingStock(EntityRollingStock rolling) {
		if (rolling == null || rolling.isDead) {
			return;
		}

		for (int i = 0; i < train.size(); i++) {
			if (train.get(i).equals(rolling)) {
				return;
			}
		}

		if (rolling instanceof Locomotive) {
			trainPower += ((Locomotive) rolling).transportMetricHorsePower();
		}

		train.add(rolling);
		rolling.trainHandler = this;

		if (rolling.cartLinked1 != null) {
			addRollingStock(rolling.cartLinked1);
		}

		if (rolling.cartLinked2 != null) {
			addRollingStock(rolling.cartLinked2);
		}

		markMasterSelectionDirty("Train membership changed.");
	}

	public void resetTrain() {
		resetTrainNoRemove();
		EntityRollingStock.allTrains.remove(this);
	}

	public void resetTrainNoRemove() {
		releaseChunkLoading();

		for (int i = 0; i < train.size(); i++) {
			EntityRollingStock stock = train.get(i);
			if (stock != null) {
				stock.trainHandler = null;
			}
		}

		train.clear();
		pendingExternalPushes.clear();
		trainPower = 0;
		parkingBrakeSource = null;
		cachedPhysicsMaster = null;
		tractionMaster = null;
		tractionBlocked = false;
		tractionBlockReason = "";
		masterSelectionDirty = true;
		masterSelectionDirtyReason = "";
		incompleteDueToUnloadedLinks = false;
		lastPhysicsTick = -1L;
	}

	public ArrayList<EntityRollingStock> getTrains() {
		return train;
	}

	public int getTrainPower() {
		return trainPower;
	}

	public boolean hasLocomotive() {
		return this.getTrainPower() != 0;
	}

	/**
	 * Branch-safe rule:
	 * Master physics only runs when every loaded car in this handler opted in.
	 * This prevents an experimental car from disabling legacy physics on old stock.
	 */
	public boolean usesMasterPhysics() {
		if (train == null || train.size() <= 1) {
			return false;
		}

		for (int i = 0; i < train.size(); i++) {
			EntityRollingStock stock = train.get(i);

			if (!(stock instanceof IMasterPhysicsStock)) {
				return false;
			}

			if (!((IMasterPhysicsStock) stock).usesMasterPhysics()) {
				return false;
			}
		}

		return true;
	}

	public boolean canRunMasterPhysics() {
		return usesMasterPhysics() && !incompleteDueToUnloadedLinks;
	}

	public void updateMasterPhysics(EntityRollingStock caller) {
		if (caller == null || caller.worldObj == null || caller.worldObj.isRemote) {
			return;
		}

		if (!usesMasterPhysics()) {
			return;
		}

		long tick = caller.worldObj.getTotalWorldTime();

		if (lastPhysicsTick == tick) {
			return;
		}

		EntityRollingStock master = getPhysicsMaster();

		if (master == null || caller != master) {
			return;
		}

		lastPhysicsTick = tick;

		updateChunkLoading(master);

		if (physicsController == null) {
			physicsController = new TrainPhysicsController(this);
		}

		physicsController.tick(master);
	}

	public EntityRollingStock getPhysicsMaster() {
		if (masterSelectionDirty) {
			rebuildMasterSelection();
			return cachedPhysicsMaster;
		}

		if (cachedPhysicsMaster != null && !cachedPhysicsMaster.isDead && train.contains(cachedPhysicsMaster)) {
			return cachedPhysicsMaster;
		}

		rebuildMasterSelection();
		return cachedPhysicsMaster;
	}

	public Locomotive getTractionMaster() {
		if (masterSelectionDirty) {
			rebuildMasterSelection();
		}

		if (tractionMaster instanceof Locomotive && !tractionMaster.isDead && train.contains(tractionMaster)) {
			return (Locomotive) tractionMaster;
		}

		rebuildMasterSelection();
		return tractionMaster instanceof Locomotive ? (Locomotive) tractionMaster : null;
	}

	public boolean isPhysicsMaster(EntityRollingStock stock) {
		return stock != null && stock == getPhysicsMaster();
	}

	public boolean isTractionBlocked() {
		if (masterSelectionDirty) {
			rebuildMasterSelection();
		}

		return tractionBlocked;
	}

	public String getTractionBlockReason() {
		if (masterSelectionDirty) {
			rebuildMasterSelection();
		}

		return tractionBlockReason;
	}

	public boolean canApplyPoweredMovement() {
		return !isTractionBlocked() && getTractionMaster() != null;
	}

	public void markMasterSelectionDirty(String reason) {
		masterSelectionDirty = true;
		masterSelectionDirtyReason = reason == null ? "" : reason;
		cachedPhysicsMaster = null;
		tractionMaster = null;
		lastPhysicsTick = -1L;
	}

	public void resetPhysicsMaster() {
		cachedPhysicsMaster = null;
		tractionMaster = null;
		tractionBlocked = false;
		tractionBlockReason = "";
		masterSelectionDirty = true;
		masterSelectionDirtyReason = "Physics master reset.";
		lastPhysicsTick = -1L;
	}

	private void rebuildMasterSelection() {
		masterSelectionDirty = false;

		cachedPhysicsMaster = null;
		tractionMaster = null;
		tractionBlocked = false;
		tractionBlockReason = "";

		ArrayList<Locomotive> locomotives = new ArrayList<Locomotive>();
		ArrayList<Locomotive> pullModeLocomotives = new ArrayList<Locomotive>();

		for (int i = 0; i < train.size(); i++) {
			EntityRollingStock stock = train.get(i);

			if (stock == null || stock.isDead) {
				continue;
			}

			if (stock instanceof Locomotive) {
				Locomotive loco = (Locomotive) stock;
				locomotives.add(loco);

				/*
				 * Pull/master-capable mode is represented by canBePulled == false.
				 */
				if (!loco.canBePulled) {
					pullModeLocomotives.add(loco);
				}
			}
		}

		if (locomotives.size() == 0) {
			cachedPhysicsMaster = chooseFallbackRollingstockParent();
			tractionMaster = null;
			tractionBlocked = true;
			tractionBlockReason = "No locomotive in consist.";
			return;
		}

		if (pullModeLocomotives.size() == 1) {
			tractionMaster = pullModeLocomotives.get(0);
			cachedPhysicsMaster = tractionMaster;
			tractionBlocked = false;
			tractionBlockReason = "";
			return;
		}

		if (pullModeLocomotives.size() == 0) {
			cachedPhysicsMaster = chooseSafeRandomLocomotive(locomotives);
			tractionMaster = null;
			tractionBlocked = true;
			tractionBlockReason = "No locomotive is in pull mode. Exactly one locomotive must have canBePulled=false.";
			return;
		}

		cachedPhysicsMaster = chooseSafeRandomLocomotive(pullModeLocomotives);
		tractionMaster = null;
		tractionBlocked = true;
		tractionBlockReason = "Multiple locomotives are in pull mode. Exactly one locomotive must have canBePulled=false.";
	}

	private EntityRollingStock chooseFallbackRollingstockParent() {
		EntityRollingStock best = null;

		for (int i = 0; i < train.size(); i++) {
			EntityRollingStock stock = train.get(i);

			if (stock == null || stock.isDead) {
				continue;
			}

			if (best == null || stock.getUniqueTrainID() < best.getUniqueTrainID()) {
				best = stock;
			}
		}

		return best;
	}

	private Locomotive chooseSafeRandomLocomotive(ArrayList<Locomotive> locomotives) {
		if (locomotives == null || locomotives.isEmpty()) {
			return null;
		}

		if (locomotives.size() == 1) {
			return locomotives.get(0);
		}

		/*
		 * Stable pseudo-random choice. Do not use world.rand each tick.
		 */
		int seed = 17;

		for (int i = 0; i < train.size(); i++) {
			EntityRollingStock stock = train.get(i);

			if (stock != null) {
				seed = 31 * seed + stock.getUniqueTrainID();
			}
		}

		if (seed < 0) {
			seed = -seed;
		}

		return locomotives.get(seed % locomotives.size());
	}

	public void onLocomotiveModeChanged(Locomotive locomotive, boolean oldCanBePulled, boolean newCanBePulled) {
		if (locomotive == null || oldCanBePulled == newCanBePulled) {
			return;
		}

		markMasterSelectionDirty("Locomotive pull mode changed.");
		rebuildMasterSelection();

		if (tractionBlocked) {
			zeroConsistMotion();
		}
	}

	private void zeroConsistMotion() {
		for (int i = 0; i < train.size(); i++) {
			EntityRollingStock stock = train.get(i);

			if (stock == null) {
				continue;
			}

			stock.motionX = 0.0D;
			stock.motionY = 0.0D;
			stock.motionZ = 0.0D;

			if (stock.bogieLoco != null) {
				stock.bogieLoco.motionX = 0.0D;
				stock.bogieLoco.motionY = 0.0D;
				stock.bogieLoco.motionZ = 0.0D;
			}

			if (stock instanceof ITwoBogieMasterPhysicsStock) {
				ITwoBogieMasterPhysicsStock two = (ITwoBogieMasterPhysicsStock) stock;

				if (two.getRearBogie() != null) {
					two.getRearBogie().motionX = 0.0D;
					two.getRearBogie().motionY = 0.0D;
					two.getRearBogie().motionZ = 0.0D;
				}

				if (two.getFrontBogie() != null) {
					two.getFrontBogie().motionX = 0.0D;
					two.getFrontBogie().motionY = 0.0D;
					two.getFrontBogie().motionZ = 0.0D;
				}
			}
		}
	}

	public boolean hasParkingBrakeApplied() {
		parkingBrakeSource = null;

		if (train == null || train.isEmpty()) {
			return false;
		}

		for (int i = 0; i < train.size(); i++) {
			EntityRollingStock stock = train.get(i);

			if (stock == null || stock.isDead) {
				continue;
			}

			if (stock.getParkingBrakeDW() || RailTools.isCartLockedDown(stock)) {
				parkingBrakeSource = stock;
				return true;
			}
		}

		return false;
	}

	public EntityRollingStock getParkingBrakeSource() {
		return parkingBrakeSource;
	}

	public void setIncomplete(boolean incomplete) {
		incompleteDueToUnloadedLinks = incomplete;

		if (incomplete) {
			markMasterSelectionDirty("Consist has unloaded linked stock.");
		}
	}

	public void markIncompleteDueToUnload() {
		setIncomplete(true);
	}

	public boolean isIncompleteDueToUnloadedLinks() {
		return incompleteDueToUnloadedLinks;
	}

	public boolean isChunkLoadingEnabled() {
		return chunkLoadingEnabled;
	}

	public void setChunkLoadingEnabled(boolean enabled) {
		chunkLoadingEnabled = enabled;

		if (!enabled) {
			releaseChunkLoading();
		}
	}

	public boolean shouldChunkloadConsist() {
		if (!chunkLoadingEnabled) {
			return false;
		}

		if (!usesMasterPhysics()) {
			return false;
		}

		if (hasParkingBrakeApplied()) {
			return false;
		}

		if (isTractionBlocked()) {
			return false;
		}

		return true;
	}

	public void updateChunkLoading(EntityRollingStock master) {
		if (!shouldChunkloadConsist()) {
			releaseChunkLoading();
			return;
		}

		if (master == null || master.worldObj == null || master.worldObj.isRemote) {
			return;
		}

		if (chunkLoader == null) {
			chunkLoader = new TrainConsistChunkLoader(this);
		}

		chunkLoader.update(master);

		if (chunkLoader.isChunkLimitExceeded()) {
			setIncomplete(true);
			markMasterSelectionDirty("Consist exceeds chunk loading limit.");
		}
	}

	public void releaseChunkLoading() {
		if (chunkLoader != null) {
			chunkLoader.release();
			chunkLoader = null;
		}
	}

	public void warnTractionBlocked(EntityRollingStock requester) {
		if (requester == null || requester.worldObj == null || requester.worldObj.isRemote) {
			return;
		}

		if (!isTractionBlocked()) {
			return;
		}

		long now = requester.worldObj.getTotalWorldTime();

		if (now - lastTractionWarningTick < 100L) {
			return;
		}

		lastTractionWarningTick = now;

		EntityPlayer player = requester.worldObj.getClosestPlayer(requester.posX, requester.posY, requester.posZ, 8.0D);

		if (player != null) {
			player.addChatMessage(new ChatComponentText("[Traincraft] " + getTractionBlockReason()));
		}
	}

	public static TrainHandler rebuildAfterCoupling(EntityRollingStock cartA, EntityRollingStock cartB) {
		if (cartA == null && cartB == null) {
			return null;
		}

		EntityRollingStock root = chooseRebuildRoot(cartA, cartB);

		if (root == null) {
			return null;
		}

		TrainHandler handler = chooseExistingHandler(cartA, cartB);

		if (handler == null) {
			handler = new TrainHandler();
			EntityRollingStock.allTrains.add(handler);
		}

		handler.resetTrainNoRemove();
		handler.addRollingStock(root);
		handler.resetPhysicsMaster();

		return handler;
	}

	public static void rebuildAfterUncoupling(EntityRollingStock sideA, EntityRollingStock sideB) {
		TrainHandler oldA = sideA == null ? null : sideA.trainHandler;
		TrainHandler oldB = sideB == null ? null : sideB.trainHandler;

		if (oldA != null) {
			oldA.resetTrainNoRemove();
			EntityRollingStock.allTrains.remove(oldA);
		}

		if (oldB != null && oldB != oldA) {
			oldB.resetTrainNoRemove();
			EntityRollingStock.allTrains.remove(oldB);
		}

		assignComponentFrom(sideA);
		assignComponentFrom(sideB);
	}

	public static void rebuildAfterStockDestroyed(EntityRollingStock destroyed,
												  EntityRollingStock oldLink1,
												  EntityRollingStock oldLink2,
												  TrainHandler oldHandler) {
		if (destroyed == null) {
			return;
		}

		clearNeighborLinkToDestroyed(oldLink1, destroyed);
		clearNeighborLinkToDestroyed(oldLink2, destroyed);

		if (oldHandler != null) {
			oldHandler.resetTrainNoRemove();
			EntityRollingStock.allTrains.remove(oldHandler);
		}

		destroyed.trainHandler = null;
		destroyed.cartLinked1 = null;
		destroyed.cartLinked2 = null;
		destroyed.Link1 = 0;
		destroyed.Link2 = 0;
		destroyed.isAttached = false;

		if (destroyed.RollingStock != null) {
			destroyed.RollingStock.clear();
		}

		assignComponentFrom(oldLink1);
		assignComponentFrom(oldLink2);
	}

	private static void clearNeighborLinkToDestroyed(EntityRollingStock neighbor, EntityRollingStock destroyed) {
		if (neighbor == null || destroyed == null) {
			return;
		}

		if (neighbor.cartLinked1 == destroyed || neighbor.Link1 == destroyed.getUniqueTrainID()) {
			neighbor.cartLinked1 = null;
			neighbor.Link1 = 0;
		}

		if (neighbor.cartLinked2 == destroyed || neighbor.Link2 == destroyed.getUniqueTrainID()) {
			neighbor.cartLinked2 = null;
			neighbor.Link2 = 0;
		}

		neighbor.recalculateAttachedState();

		if (neighbor.RollingStock != null) {
			neighbor.RollingStock.remove(destroyed);
		}
	}

	private static EntityRollingStock chooseRebuildRoot(EntityRollingStock cartA, EntityRollingStock cartB) {
		EntityRollingStock masterA = getExistingMaster(cartA);
		EntityRollingStock masterB = getExistingMaster(cartB);

		if (masterA != null && masterB == null) {
			return masterA;
		}

		if (masterB != null && masterA == null) {
			return masterB;
		}

		if (masterA != null && masterB != null) {
			return chooseBetterMaster(masterA, masterB);
		}

		if (cartA instanceof Locomotive && !((Locomotive) cartA).canBePulled) {
			return cartA;
		}

		if (cartB instanceof Locomotive && !((Locomotive) cartB).canBePulled) {
			return cartB;
		}

		if (cartA instanceof Locomotive) {
			return cartA;
		}

		if (cartB instanceof Locomotive) {
			return cartB;
		}

		if (cartA == null) {
			return cartB;
		}

		if (cartB == null) {
			return cartA;
		}

		return cartA.getUniqueTrainID() <= cartB.getUniqueTrainID() ? cartA : cartB;
	}

	private static EntityRollingStock getExistingMaster(EntityRollingStock stock) {
		if (stock == null || stock.trainHandler == null) {
			return null;
		}

		return stock.trainHandler.getPhysicsMaster();
	}

	private static EntityRollingStock chooseBetterMaster(EntityRollingStock a, EntityRollingStock b) {
		if (a == null) {
			return b;
		}

		if (b == null) {
			return a;
		}

		if (a instanceof Locomotive && !((Locomotive) a).canBePulled
				&& !(b instanceof Locomotive && !((Locomotive) b).canBePulled)) {
			return a;
		}

		if (b instanceof Locomotive && !((Locomotive) b).canBePulled
				&& !(a instanceof Locomotive && !((Locomotive) a).canBePulled)) {
			return b;
		}

		if (a instanceof Locomotive && !(b instanceof Locomotive)) {
			return a;
		}

		if (b instanceof Locomotive && !(a instanceof Locomotive)) {
			return b;
		}

		return a.getUniqueTrainID() <= b.getUniqueTrainID() ? a : b;
	}

	private static TrainHandler chooseExistingHandler(EntityRollingStock cartA, EntityRollingStock cartB) {
		TrainHandler handlerA = cartA == null ? null : cartA.trainHandler;
		TrainHandler handlerB = cartB == null ? null : cartB.trainHandler;

		if (handlerA != null && handlerB == null) {
			return handlerA;
		}

		if (handlerB != null && handlerA == null) {
			return handlerB;
		}

		if (handlerA != null && handlerB != null) {
			EntityRollingStock masterA = handlerA.getPhysicsMaster();
			EntityRollingStock masterB = handlerB.getPhysicsMaster();

			EntityRollingStock chosenMaster = chooseBetterMaster(masterA, masterB);

			if (chosenMaster != null && chosenMaster.trainHandler != null) {
				TrainHandler chosen = chosenMaster.trainHandler;
				TrainHandler other = chosen == handlerA ? handlerB : handlerA;

				if (other != null && other != chosen) {
					EntityRollingStock.allTrains.remove(other);
					other.resetTrainNoRemove();
				}

				return chosen;
			}

			return handlerA;
		}

		return null;
	}

	private static void assignComponentFrom(EntityRollingStock root) {
		if (root == null || root.isDead) {
			return;
		}

		ArrayList<EntityRollingStock> component = collectConnectedComponent(root);

		if (component.size() <= 0) {
			return;
		}

		if (component.size() == 1) {
			EntityRollingStock only = component.get(0);
			only.trainHandler = null;
			only.isAttached = false;

			if (only.RollingStock != null) {
				only.RollingStock.clear();
			}

			return;
		}

		EntityRollingStock bestRoot = chooseBestRootFromComponent(component);

		TrainHandler newHandler = new TrainHandler();
		EntityRollingStock.allTrains.add(newHandler);

		newHandler.resetTrainNoRemove();
		newHandler.addRollingStock(bestRoot);
		newHandler.resetPhysicsMaster();
	}

	private static ArrayList<EntityRollingStock> collectConnectedComponent(EntityRollingStock root) {
		ArrayList<EntityRollingStock> result = new ArrayList<EntityRollingStock>();
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<EntityRollingStock> queue = new LinkedList<EntityRollingStock>();

		queue.add(root);

		while (!queue.isEmpty()) {
			EntityRollingStock stock = queue.removeFirst();

			if (stock == null || stock.isDead) {
				continue;
			}

			int id = stock.getUniqueTrainID();

			if (visited.contains(id)) {
				continue;
			}

			visited.add(id);
			result.add(stock);

			if (stock.cartLinked1 != null) {
				queue.add(stock.cartLinked1);
			}

			if (stock.cartLinked2 != null) {
				queue.add(stock.cartLinked2);
			}
		}

		return result;
	}

	private static EntityRollingStock chooseBestRootFromComponent(ArrayList<EntityRollingStock> component) {
		EntityRollingStock fallback = null;

		for (int i = 0; i < component.size(); i++) {
			EntityRollingStock stock = component.get(i);

			if (stock == null || stock.isDead) {
				continue;
			}

			if (fallback == null || stock.getUniqueTrainID() < fallback.getUniqueTrainID()) {
				fallback = stock;
			}

			if (stock instanceof Locomotive) {
				Locomotive loco = (Locomotive) stock;

				if (!loco.canBePulled) {
					return loco;
				}
			}
		}

		for (int i = 0; i < component.size(); i++) {
			EntityRollingStock stock = component.get(i);

			if (stock instanceof Locomotive && !stock.isDead) {
				return stock;
			}
		}

		return fallback;
	}
}
