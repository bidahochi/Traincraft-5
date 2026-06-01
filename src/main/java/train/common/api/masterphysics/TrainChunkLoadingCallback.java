package train.common.api.masterphysics;

import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import train.common.Traincraft;

import java.util.List;

public class TrainChunkLoadingCallback implements ForgeChunkManager.LoadingCallback {
    public static final TrainChunkLoadingCallback INSTANCE = new TrainChunkLoadingCallback();

    private TrainChunkLoadingCallback() {}

    public static void register() {
        /*
         * Replace Traincraft.instance if your mod singleton has a different name.
         */
        ForgeChunkManager.setForcedChunkLoadingCallback(Traincraft.instance, INSTANCE);
    }

    @Override
    public void ticketsLoaded(List<ForgeChunkManager.Ticket> tickets, World world) {
        /*
         * Branch-safe behavior: release old saved tickets.
         * TrainHandler/Resolver will rebuild runtime tickets from loaded stock.
         */
        for (ForgeChunkManager.Ticket ticket : tickets) {
            ForgeChunkManager.releaseTicket(ticket);
        }
    }
}
