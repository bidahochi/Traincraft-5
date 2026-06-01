package train.common.api.masterphysics;

import train.common.api.EntityRollingStock;
import train.common.core.handlers.TrainHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class TrainConsistResolver {
    private static final HashMap<Integer, TrainConsistResolver> BY_DIMENSION = new HashMap<Integer, TrainConsistResolver>();

    public static TrainConsistResolver forDimension(int dimensionId) {
        TrainConsistResolver resolver = BY_DIMENSION.get(dimensionId);

        if (resolver == null) {
            resolver = new TrainConsistResolver();
            BY_DIMENSION.put(dimensionId, resolver);
        }

        return resolver;
    }

    private final HashMap<Integer, EntityRollingStock> loadedByUniqueId = new HashMap<Integer, EntityRollingStock>();
    private final HashSet<Integer> dirtyRoots = new HashSet<Integer>();

    public void onStockLoaded(EntityRollingStock stock) {
        if (stock == null || stock.worldObj == null || stock.worldObj.isRemote) {
            return;
        }

        loadedByUniqueId.put(stock.getUniqueTrainID(), stock);
        dirtyRoots.add(stock.getUniqueTrainID());

        if (stock.Link1 > 0) {
            dirtyRoots.add(stock.Link1);
        }

        if (stock.Link2 > 0) {
            dirtyRoots.add(stock.Link2);
        }
    }

    public void onStockUnloaded(EntityRollingStock stock) {
        if (stock == null || stock.worldObj == null || stock.worldObj.isRemote) {
            return;
        }

        loadedByUniqueId.remove(stock.getUniqueTrainID());

        if (stock.Link1 > 0) {
            dirtyRoots.add(stock.Link1);
        }

        if (stock.Link2 > 0) {
            dirtyRoots.add(stock.Link2);
        }

        if (stock.trainHandler != null) {
            stock.trainHandler.markIncompleteDueToUnload();
        }

        stock.cartLinked1 = null;
        stock.cartLinked2 = null;
        stock.trainHandler = null;
    }

    public void tickResolve() {
        if (dirtyRoots.isEmpty()) {
            return;
        }

        HashSet<Integer> roots = new HashSet<Integer>(dirtyRoots);
        dirtyRoots.clear();

        HashSet<Integer> rebuilt = new HashSet<Integer>();

        for (Integer id : roots) {
            EntityRollingStock stock = loadedByUniqueId.get(id);

            if (stock == null || stock.isDead || rebuilt.contains(id)) {
                continue;
            }

            RebuildResult result = collectLoadedComponent(stock);

            for (int i = 0; i < result.loadedStocks.size(); i++) {
                rebuilt.add(result.loadedStocks.get(i).getUniqueTrainID());
            }

            assignHandler(result);
        }
    }

    private RebuildResult collectLoadedComponent(EntityRollingStock root) {
        RebuildResult result = new RebuildResult();

        LinkedList<EntityRollingStock> queue = new LinkedList<EntityRollingStock>();
        HashSet<Integer> visited = new HashSet<Integer>();

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
            result.loadedStocks.add(stock);

            resolveOneLink(stock, stock.Link1, true, queue, result);
            resolveOneLink(stock, stock.Link2, false, queue, result);
        }

        return result;
    }

    private void resolveOneLink(EntityRollingStock stock,
                                int linkedId,
                                boolean linkOne,
                                LinkedList<EntityRollingStock> queue,
                                RebuildResult result) {
        if (linkedId <= 0) {
            if (linkOne) {
                stock.cartLinked1 = null;
            }
            else {
                stock.cartLinked2 = null;
            }
            return;
        }

        EntityRollingStock linked = loadedByUniqueId.get(linkedId);

        if (linked == null || linked.isDead) {
            result.incomplete = true;

            if (linkOne) {
                stock.cartLinked1 = null;
            }
            else {
                stock.cartLinked2 = null;
            }

            return;
        }

        if (linkOne) {
            stock.cartLinked1 = linked;
        }
        else {
            stock.cartLinked2 = linked;
        }

        queue.add(linked);
    }

    private void assignHandler(RebuildResult result) {
        if (result.loadedStocks.isEmpty()) {
            return;
        }

        clearOldHandlers(result.loadedStocks);

        if (result.loadedStocks.size() == 1 && !result.incomplete) {
            EntityRollingStock only = result.loadedStocks.get(0);
            only.trainHandler = null;
            only.recalculateAttachedState();
            return;
        }

        EntityRollingStock root = chooseRoot(result.loadedStocks);

        TrainHandler handler = new TrainHandler();
        EntityRollingStock.allTrains.add(handler);

        handler.resetTrainNoRemove();
        handler.addRollingStock(root);
        handler.setIncomplete(result.incomplete);
        handler.resetPhysicsMaster();

        for (int i = 0; i < result.loadedStocks.size(); i++) {
            result.loadedStocks.get(i).recalculateAttachedState();
        }
    }

    private void clearOldHandlers(ArrayList<EntityRollingStock> stocks) {
        HashSet<TrainHandler> handlers = new HashSet<TrainHandler>();

        for (int i = 0; i < stocks.size(); i++) {
            EntityRollingStock stock = stocks.get(i);

            if (stock.trainHandler != null) {
                handlers.add(stock.trainHandler);
            }
        }

        for (TrainHandler handler : handlers) {
            handler.resetTrainNoRemove();
            EntityRollingStock.allTrains.remove(handler);
        }
    }

    private EntityRollingStock chooseRoot(ArrayList<EntityRollingStock> stocks) {
        EntityRollingStock best = null;

        for (int i = 0; i < stocks.size(); i++) {
            EntityRollingStock stock = stocks.get(i);

            if (stock == null || stock.isDead) {
                continue;
            }

            if (best == null || stock.getUniqueTrainID() < best.getUniqueTrainID()) {
                best = stock;
            }
        }

        return best;
    }

    private static class RebuildResult {
        public final ArrayList<EntityRollingStock> loadedStocks = new ArrayList<EntityRollingStock>();
        public boolean incomplete = false;
    }
}
