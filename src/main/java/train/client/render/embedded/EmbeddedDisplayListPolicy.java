package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import train.common.items.TCRailTypes;
import train.common.tile.TileTCRail;

/**
 * Defines which embedded meshes qualify for display lists and how much compilation one completed frame may begin.
 *
 * <p>Eligibility limits persistent graphics memory; the estimates and time budgets limit frame spikes. Tune those
 * concerns independently, because increasing eligibility does not make compilation itself cheaper.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedDisplayListPolicy
{
	private static final int MINIMUM_DISPLAY_LIST_QUADS = 128;
	private static final int MAXIMUM_COMPILES_PER_FRAME = 2;
	private static final long COMPILE_BUDGET_NANOSECONDS = 1_500_000L;

	/** Creates no instances; display-list policy is stateless. */
	private EmbeddedDisplayListPolicy()
	{
	}

	/**
	 * Selects display-list rendering for medium and larger prepared meshes.
	 *
	 * @param quadCount number of prepared four-vertex faces
	 * @return whether the mesh should be compiled into a display list
	 */
	public static boolean shouldUseDisplayList(int quadCount)
	{
		return quadCount >= MINIMUM_DISPLAY_LIST_QUADS;
	}

	/**
	 * Selects display-list rendering while always compiling stable slope geometry regardless of face count.
	 *
	 * @param quadCount number of prepared four-vertex faces
	 * @param slopeMesh whether the prepared mesh belongs to a slope track
	 * @return whether the mesh should be compiled into a display list
	 */
	public static boolean shouldUseDisplayList(int quadCount, boolean slopeMesh)
	{
		return slopeMesh || shouldUseDisplayList(quadCount);
	}

	/**
	 * Returns whether a visible rail contributes stable slope geometry that should always use a display list.
	 *
	 * @param railTile visible rail tile supplying its effective rail type
	 * @return whether the tile is a slope
	 */
	public static boolean usesAlwaysCachedSlopeMesh(TileTCRail railTile)
	{
		return railTile != null && TCRailTypes.RailTypes.SLOPE.equals(railTile.getRailType());
	}

	/**
	 * Returns whether another display list may begin compiling in the current completed frame.
	 *
	 * @param compiledCount number of compilation attempts already made during the frame
	 * @param elapsedNanoseconds nanoseconds spent processing the frame's compilation queue
	 * @return whether both compilation budgets remain
	 */
	public static boolean hasCompilationBudget(int compiledCount, long elapsedNanoseconds)
	{
		return compiledCount < MAXIMUM_COMPILES_PER_FRAME
				&& elapsedNanoseconds < COMPILE_BUDGET_NANOSECONDS;
	}
}
