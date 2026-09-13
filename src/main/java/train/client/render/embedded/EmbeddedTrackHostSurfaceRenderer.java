package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.ITrackDefinition;
import train.common.tile.TileTCRail;

/**
 * Public entry points for reconstructed track-host surfaces and placement previews.
 *
	 * <p>This facade contains no cache or geometry decisions and is the primary entry point for rail-host surfaces and
	 * previews. The switch-stand renderer deliberately shares captured-block and render-state adapters, while route
	 * caching consults the embedded slope policy directly. Call all methods on the client render thread.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedTrackHostSurfaceRenderer
{
	private EmbeddedTrackHostSurfaceRenderer()
	{
	}

	/**
	 * Draws the reconstructed host surface associated with one visible rail tile.
	 *
	 * @param railTile visible parent or gag-resolved rail supplying captured host state
	 * @param renderX camera-relative owner X coordinate
	 * @param renderY camera-relative owner Y coordinate
	 * @param renderZ camera-relative owner Z coordinate
	 */
	public static void render(TileTCRail railTile, double renderX, double renderY, double renderZ)
	{
		EmbeddedHostRenderController.render(railTile, renderX, renderY, renderZ);
	}

	/**
	 * Draws generated half-height ballast through the same mesh path used by a placed slope.
	 *
	 * @param track selected material definition
	 * @param core effective cardinal or diagonal half-height core
	 * @param facing prospective track facing
	 * @param ballastBlock block supplying preview textures
	 * @param ballastMetadata metadata selecting the texture variant
	 * @param ballastTint packed RGB material tint
	 * @param renderX additional X translation in the caller-established preview coordinate frame
	 * @param renderY additional Y translation in the caller-established preview coordinate frame
	 * @param renderZ additional Z translation in the caller-established preview coordinate frame
	 * @param red placement-state red multiplier
	 * @param green placement-state green multiplier
	 * @param blue placement-state blue multiplier
	 * @param alpha preview opacity
	 */
	public static void renderHalfHeightBallastPreview(ITrackDefinition track, EnumCoreTrack core, int facing,
			Block ballastBlock, int ballastMetadata, int ballastTint,
			double renderX, double renderY, double renderZ,
			float red, float green, float blue, float alpha)
	{
		EmbeddedHostPreviewRenderer.renderHalfHeightBallastPreview(track, core, facing,
				ballastBlock, ballastMetadata, ballastTint,
				renderX, renderY, renderZ, red, green, blue, alpha);
	}

	/**
	 * Draws a prospective true-embedded half-height surface from the blocks beneath its footprint.
	 * Host capture is read-only and does not create a placement transaction.
	 *
	 * @param track selected material definition
	 * @param core effective cardinal or diagonal half-height core
	 * @param facing prospective track facing
	 * @param world client world containing prospective host blocks
	 * @param originX prospective owner X coordinate
	 * @param originY prospective owner Y coordinate
	 * @param originZ prospective owner Z coordinate
	 * @param renderX additional X translation relative to the already-translated preview origin
	 * @param renderY additional Y translation relative to the already-translated preview origin
	 * @param renderZ additional Z translation relative to the already-translated preview origin
	 * @param red placement-state red multiplier
	 * @param green placement-state green multiplier
	 * @param blue placement-state blue multiplier
	 * @param alpha preview opacity
	 */
	public static void renderTrueEmbeddedHalfHeightPreview(ITrackDefinition track, EnumCoreTrack core, int facing,
			World world, int originX, int originY, int originZ,
			double renderX, double renderY, double renderZ,
			float red, float green, float blue, float alpha)
	{
		EmbeddedHostPreviewRenderer.renderTrueEmbeddedHalfHeightPreview(track, core, facing,
				world, originX, originY, originZ,
				renderX, renderY, renderZ, red, green, blue, alpha);
	}

	/**
	 * Compiles deferred host-surface display lists within the current frame budget.
	 * Call once after world rendering so visible, nearby requests receive priority.
	 */
	public static void compileQueuedDisplayLists()
	{
		EmbeddedHostRenderController.compileQueuedDisplayLists();
	}

	/**
	 * Clears world-owned host meshes, previews, prepared-lighting state, reusable slope/model-top topology, and graphics
	 * resources. Parsed switch terrain profiles remain process-lifetime caches.
	 *
	 * <p>Call on resource reload to discard cached material/icon state and atlas-dependent display lists, and on
	 * client-world replacement to release world-specific state. Display lists must be deleted while the OpenGL context
	 * that owns them is active.</p>
	 */
	public static void clear()
	{
		EmbeddedHostRenderController.clear();
	}
}
