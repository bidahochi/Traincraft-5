package train.common.utils.devutils;

import train.common.Traincraft;

import java.lang.reflect.Method;

/**
 * Main-code hook for tools that only exist on the dev source set classpath.
 * Keep bootstrap names as strings so production jars can omit those classes without linkage errors.
 */
public class OptionalDevBootstrap {
	private static final String[] BOOTSTRAPS = {
			"tb.dev.rollingstockicon.RollingStockIconGeneratorDevBootstrap",
			"tb.dev.lightingreload.LightingReloadCommand",
			"tb.dev.stockresources.StockResourceDevBootstrap"
	};

	private OptionalDevBootstrap() {
	}

	public static void init() {
		if (!Boolean.TRUE.equals(DebugUtil.dev)) {
			return;
		}

		for (String bootstrap : BOOTSTRAPS) {
			try {
				Class<?> bootstrapClass = Class.forName(bootstrap);
				Method init = bootstrapClass.getMethod("init");
				init.invoke(null);
			} catch (ClassNotFoundException ignored) {
				// Expected in production jars, where src/dev output is not packaged.
			} catch (Throwable throwable) {
				Traincraft.tcLog.warn("Failed to initialize optional dev bootstrap: " + bootstrap, throwable);
			}
		}
	}
}
