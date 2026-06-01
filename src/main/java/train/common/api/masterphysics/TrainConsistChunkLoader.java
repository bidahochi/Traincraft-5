package train.common.api.masterphysics;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import train.common.Traincraft;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;
import train.common.core.handlers.TrainHandler;

import java.util.HashSet;
import java.util.Set;

public class TrainConsistChunkLoader {
    public static final int MAX_FORCED_CHUNKS_PER_CONSIST = 25;

    private final TrainHandler handler;

    private ForgeChunkManager.Ticket ticket;
    private final HashSet<ChunkCoordIntPair> forcedChunks = new HashSet<ChunkCoordIntPair>();

    private int updateCooldown = 0;
    private boolean chunkLimitExceeded = false;

    public TrainConsistChunkLoader(TrainHandler handler) {
        this.handler = handler;
    }

    public boolean isChunkLimitExceeded() {
        return chunkLimitExceeded;
    }

    public void update(EntityRollingStock master) {
        if (master == null || master.worldObj == null || master.worldObj.isRemote) {
            return;
        }

        if (updateCooldown-- > 0) {
            return;
        }
        updateCooldown = 20;

        HashSet<ChunkCoordIntPair> wanted = collectWantedChunks(master);

        if (wanted.size() > MAX_FORCED_CHUNKS_PER_CONSIST) {
            chunkLimitExceeded = true;
            release();
            return;
        }

        chunkLimitExceeded = false;

        ensureTicket(master.worldObj);

        if (ticket == null) {
            return;
        }

        applyChunkSet(wanted);
    }

    private void ensureTicket(World world) {
        if (ticket != null) {
            return;
        }

        /*
         * Replace Traincraft.instance if your mod singleton has a different name.
         */
        ticket = ForgeChunkManager.requestTicket(Traincraft.instance, world, ForgeChunkManager.Type.NORMAL);

        if (ticket == null) {
            chunkLimitExceeded = true;
        }
    }

    private HashSet<ChunkCoordIntPair> collectWantedChunks(EntityRollingStock master) {
        HashSet<ChunkCoordIntPair> chunks = new HashSet<ChunkCoordIntPair>();

        if (handler == null || handler.getTrains() == null) {
            return chunks;
        }

        for (int i = 0; i < handler.getTrains().size(); i++) {
            EntityRollingStock stock = handler.getTrains().get(i);

            if (stock == null || stock.isDead) {
                continue;
            }

            addEntityChunk(chunks, stock);

            if (stock.bogieLoco != null && !stock.bogieLoco.isDead) {
                addEntityChunk(chunks, stock.bogieLoco);
            }

            if (stock instanceof ITwoBogieMasterPhysicsStock) {
                ITwoBogieMasterPhysicsStock two = (ITwoBogieMasterPhysicsStock) stock;

                EntityBogie rear = two.getRearBogie();
                EntityBogie front = two.getFrontBogie();

                if (rear != null && !rear.isDead) {
                    addEntityChunk(chunks, rear);
                }

                if (front != null && !front.isDead) {
                    addEntityChunk(chunks, front);
                }
            }
        }

        addAheadAndBehindChunks(chunks, master);

        return chunks;
    }

    private void addEntityChunk(HashSet<ChunkCoordIntPair> chunks, Entity entity) {
        int chunkX = MathHelper.floor_double(entity.posX) >> 4;
        int chunkZ = MathHelper.floor_double(entity.posZ) >> 4;

        chunks.add(new ChunkCoordIntPair(chunkX, chunkZ));
    }

    private void addAheadAndBehindChunks(HashSet<ChunkCoordIntPair> chunks, EntityRollingStock master) {
        double yawRad = Math.toRadians(master.serverRealRotation + 90.0F);

        double dirX = Math.cos(yawRad);
        double dirZ = Math.sin(yawRad);

        int baseChunkX = MathHelper.floor_double(master.posX) >> 4;
        int baseChunkZ = MathHelper.floor_double(master.posZ) >> 4;

        int aheadChunkX = MathHelper.floor_double(master.posX + dirX * 24.0D) >> 4;
        int aheadChunkZ = MathHelper.floor_double(master.posZ + dirZ * 24.0D) >> 4;

        int behindChunkX = MathHelper.floor_double(master.posX - dirX * 16.0D) >> 4;
        int behindChunkZ = MathHelper.floor_double(master.posZ - dirZ * 16.0D) >> 4;

        chunks.add(new ChunkCoordIntPair(baseChunkX, baseChunkZ));
        chunks.add(new ChunkCoordIntPair(aheadChunkX, aheadChunkZ));
        chunks.add(new ChunkCoordIntPair(behindChunkX, behindChunkZ));
    }

    private void applyChunkSet(HashSet<ChunkCoordIntPair> wanted) {
        HashSet<ChunkCoordIntPair> toRemove = new HashSet<ChunkCoordIntPair>(forcedChunks);

        for (ChunkCoordIntPair pair : wanted) {
            toRemove.remove(pair);
        }

        for (ChunkCoordIntPair pair : toRemove) {
            ForgeChunkManager.unforceChunk(ticket, pair);
            forcedChunks.remove(pair);
        }

        for (ChunkCoordIntPair pair : wanted) {
            if (!forcedChunks.contains(pair)) {
                ForgeChunkManager.forceChunk(ticket, pair);
                forcedChunks.add(pair);
            }
        }
    }

    public void release() {
        if (ticket != null) {
            for (ChunkCoordIntPair pair : new HashSet<ChunkCoordIntPair>(forcedChunks)) {
                ForgeChunkManager.unforceChunk(ticket, pair);
            }

            forcedChunks.clear();

            ForgeChunkManager.releaseTicket(ticket);
            ticket = null;
        }

        chunkLimitExceeded = false;
    }

    public Set<ChunkCoordIntPair> getForcedChunks() {
        return forcedChunks;
    }
}
