package train.client.render.embedded;

/**
 * Mutable tile-local state retained between embedded-host render frames.
 *
 * <p>The mesh and geometry signature describe geometry. Lighting and display-list fields describe the currently
 * prepared representation and may be replaced without rebuilding that geometry.</p>
 */
final class EmbeddedHostRenderCache
{
	/** Tile host-render version used when this cache was last validated. */
	int version;
	/** Switch state baked into model-derived host geometry. */
	final boolean switchState;
	/** Captured-host and neighboring-coverage signature used to distinguish geometry changes. */
	final long geometrySignature;
	/** Ordered face mesh, immutable after construction completes. */
	final EmbeddedHostMesh mesh = new EmbeddedHostMesh();
	/** Active OpenGL display list, or zero while faces render directly. */
	int displayList;
	/** Replaced display list awaiting safe deletion after its successor is ready. */
	int retiredDisplayList;
	/** Prevents duplicate end-of-frame compilation requests for this cache. */
	boolean displayListCompilationQueued;
	/** World samples used to detect geometry-neutral appearance changes. */
	EmbeddedHostLighting.Snapshot lightingSnapshot = EmbeddedHostLighting.emptySnapshot();
	/** Latest client light-update tracker version incorporated into this cache. */
	long clientLightUpdateVersion;

	EmbeddedHostRenderCache(int version, boolean switchState, long geometrySignature)
	{
		this.version = version;
		this.switchState = switchState;
		this.geometrySignature = geometrySignature;
	}
}
