package train.client.render;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/** Shared bounded worker for immutable lighting texture analysis. */
final class LightingTextureAnalysisService {
    private static final int MAXIMUM_PENDING_JOBS = 256;
    private static final ThreadPoolExecutor WORKER =
            new ThreadPoolExecutor(
                    1,
                    1,
                    0L,
                    TimeUnit.MILLISECONDS,
                    new ArrayBlockingQueue<Runnable>(MAXIMUM_PENDING_JOBS),
                    new ThreadFactory() {
                        @Override
                        public Thread newThread(Runnable runnable) {
                            Thread thread =
                                    new Thread(runnable, "Traincraft lighting texture analysis");
                            thread.setDaemon(true);
                            return thread;
                        }
                    },
                    new ThreadPoolExecutor.AbortPolicy());

    private LightingTextureAnalysisService() {}

    static void execute(Runnable task) {
        WORKER.execute(task);
    }

    static void clearPending() {
        WORKER.getQueue().clear();
    }
}
