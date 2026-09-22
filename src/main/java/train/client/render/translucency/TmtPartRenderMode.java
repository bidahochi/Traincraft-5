package train.client.render.translucency;

/**
 * Rendering decision returned for a part entering the common TMT draw path.
 *
 * <p>The enum avoids allocating a per-part result object while carrying both the replay flag and
 * the proven-empty leaf decision through the renderer. Values describe only the current call and
 * must not be retained by a model.</p>
 */
public enum TmtPartRenderMode
{
    /** Render through the ordinary opaque path. */
    NORMAL,
    /** Preserve transforms and draw the part's translucent face subset. */
    REPLAY,
    /** The safe leaf part has no translucent faces and can be skipped before its transforms. */
    SKIP_REPLAY_LEAF
}
