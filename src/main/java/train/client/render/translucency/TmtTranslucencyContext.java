package train.client.render.translucency;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.util.ResourceLocation;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import tmt.TexturedPolygon;
import train.client.render.lighting.TextureAlphaMaskCache;

/**
 * Render-thread context for opt-in partial-alpha rendering of TMT models.
 *
 * <p>This class deliberately owns no entity, transform, lightmap, or render-event policy. A
 * renderer first inspects the textures encountered by its opaque draw and may later replay the
 * same model inside a translucent pass scheduled by that renderer.</p>
 *
 * <p>All lifecycle calls must occur on the render thread. Inspection and replay are explicit and
 * opt-in, so unrelated TMT renderers pay only the inactive context check performed by each part.
 * Pending or unsafe alpha analysis always fails open and preserves geometry.</p>
 */
public final class TmtTranslucencyContext
{
    /** Mutually exclusive lifecycle phase stored for one render thread. */
    private enum Mode
    {
        INACTIVE,
        INSPECTING,
        REPLAYING
    }

    /** Lazily allocated context state; ordinary non-TMT threads never receive an instance. */
    private static final ThreadLocal<State> STATE = new ThreadLocal<State>();

    /** Static utility class. */
    private TmtTranslucencyContext() {}

    /**
     * Starts texture inspection for one opaque TMT model render.
     *
     * <p>The supplied texture is observed before model code runs because models which never bind a
     * replacement texture still use it. A new inspection resets all observations from the previous
     * draw on the current render thread. Callers must pair this method with
     * {@link #endTextureInspection()} in a {@code finally} block.</p>
     *
     * @param baseTexture texture bound for the model before its render method executes; may be
     *                    {@code null}, which conservatively contributes no classification
     */
    public static void beginTextureInspection(ResourceLocation baseTexture)
    {
        State state = state();
        state.beginInspection();
        state.observe(baseTexture);
    }

    /**
     * Ends the current opaque inspection and returns the scheduling decision for a translucent
     * replay.
     *
     * <p>The context becomes inactive before this method returns. A missing or mismatched
     * inspection fails open by requesting replay, preventing a lifecycle mistake from silently
     * removing translucent geometry.</p>
     *
     * @return {@code true} when at least one observed texture contains, may contain, or could not
     *         be proven free of alpha {@code 1-254}; also returns {@code true} when no inspection
     *         was active so callers fail open
     */
    public static boolean endTextureInspection()
    {
        State state = STATE.get();
        if (state == null || state.mode != Mode.INSPECTING)
        {
            return true;
        }
        state.mode = Mode.INACTIVE;
        return state.mayContainTranslucency;
    }

    /**
     * Entry point used by each TMT part. It observes the bound texture while inspecting and
     * selects the part's behavior during translucent replay.
     *
     * <p>A safe single-texture leaf whose cached translucent subset is empty may be skipped before
     * applying its transforms. Child-bearing, multi-texture, pending, unreadable, and otherwise
     * unsafe parts always remain in replay. This combines inspection, replay detection, and the
     * conservative leaf fast path into one context lookup on the normal per-part hot path.</p>
     *
     * @param part part entering the renderer
     * @param texture texture bound when the part begins rendering; {@code null} prevents the leaf
     *                optimization and therefore preserves geometry
     * @return {@link TmtPartRenderMode#NORMAL} outside replay,
     *         {@link TmtPartRenderMode#REPLAY} when the part must retain its normal transform/draw
     *         path, or {@link TmtPartRenderMode#SKIP_REPLAY_LEAF} when the complete leaf is proven
     *         empty
     */
    public static TmtPartRenderMode enterPart(ModelRendererTurbo part, ResourceLocation texture)
    {
        State state = STATE.get();
        if (state == null)
        {
            return TmtPartRenderMode.NORMAL;
        }
        if (state.mode == Mode.INSPECTING)
        {
            state.observe(texture);
            return TmtPartRenderMode.NORMAL;
        }
        if (state.mode != Mode.REPLAYING)
        {
            return TmtPartRenderMode.NORMAL;
        }
        if (part != null
                && part.useSingleDisplayListCompiler
                && (part.childModels == null || part.childModels.isEmpty()))
        {
            List<TexturedPolygon> faces = state.filteredFaces(part, texture);
            if (faces != null && faces.isEmpty())
            {
                return TmtPartRenderMode.SKIP_REPLAY_LEAF;
            }
        }
        return TmtPartRenderMode.REPLAY;
    }

    /**
     * Records a texture selected after a part has entered its internal multi-texture handling.
     * Calls outside texture inspection are ignored, as are duplicate and {@code null} textures.
     * Once any texture requires replay, further observations are unnecessary and are skipped.
     *
     * @param texture newly bound texture; {@code null} is ignored
     */
    public static void observeTexture(ResourceLocation texture)
    {
        State state = STATE.get();
        if (state != null && state.mode == Mode.INSPECTING)
        {
            state.observe(texture);
        }
    }

    /**
     * Opens translucent-only replay on the current render thread.
     *
     * <p>This resets the last-texture and last-part accelerators but retains no state from the
     * preceding inspection. The owning renderer remains responsible for blend, depth, transform,
     * lightmap, texture binding, and ordering state. Callers must pair this method with
     * {@link #endReplay()} in a {@code finally} block.</p>
     */
    public static void beginReplay()
    {
        state().beginReplay();
    }

    /**
     * Closes translucent replay and releases the last resolved texture, part, face-list, and filter
     * references.
     *
     * <p>The operation is idempotent and safe from a {@code finally} block even when replay setup
     * or model drawing failed. The reusable state object remains attached to the render thread for
     * the next inspection or replay.</p>
     */
    public static void endReplay()
    {
        State state = STATE.get();
        if (state != null)
        {
            state.mode = Mode.INACTIVE;
            state.lastReplayTexture = null;
            state.filter = null;
            state.lastReplayPart = null;
            state.lastReplayFaces = null;
        }
    }

    /**
     * Reports the replay mode used by model-level systems such as static TMT batching.
     * This query does not allocate state for a thread which has never opted into translucency.
     *
     * @return {@code true} while translucent replay is active on the current render thread
     */
    public static boolean isReplaying()
    {
        State state = STATE.get();
        return state != null && state.mode == Mode.REPLAYING;
    }

    /**
     * Removes all context state associated with the current render thread.
     *
     * <p>This is stronger than {@link #endReplay()}: it removes the thread-local object, including
     * inspection observations. It is called during resource reload together with alpha-cache and
     * render-queue invalidation so no derived references survive a resource generation.</p>
     */
    public static void clear()
    {
        STATE.remove();
    }

    /**
     * Draws the translucent geometry for one TMT part using the currently bound texture.
     *
     * <p>Safe single-texture parts use the cached UV-polygon filter. Multi-texture parts and
     * pending, unreadable, or permissive texture masks use the compiled display list so unsupported
     * geometry remains visible. A face list resolved by {@link #enterPart(ModelRendererTurbo,
     * ResourceLocation)} is reused here, avoiding a second polygon-cache lookup for retained leaf
     * parts.</p>
     *
     * @param part non-null part whose own geometry is being replayed
     * @param scale model scale used when submitting its polygons
     */
    public static void drawTranslucentFaces(ModelRendererTurbo part, float scale)
    {
        if (part.useSingleDisplayListCompiler == false)
        {
            // Multi-texture parts select textures inside callDisplayList; preserve that behavior.
            part.callDisplayList();
            return;
        }
        ResourceLocation texture = Tessellator.getLastTextureUri();
        State state = STATE.get();
        List<TexturedPolygon> filtered = state == null ? null : state.filteredFaces(part, texture);
        if (filtered == null)
        {
            // Pending/unreadable textures retain the compiled fail-open path instead of issuing
            // one immediate draw call per face while asynchronous analysis is unavailable.
            part.callDisplayList();
            return;
        }
        Tessellator tessellator = Tessellator.getInstance();
        for (int index = 0; index < filtered.size(); index++)
        {
            filtered.get(index).draw(tessellator, scale);
        }
    }

    /**
     * Returns the number of distinct textures queried by the current inspection before its replay
     * decision became conclusive.
     *
     * @return observed texture count, or zero when this thread has no context state
     */
    static int observedTextureCount()
    {
        State state = STATE.get();
        return state == null ? 0 : state.observed.size();
    }

    /**
     * Returns the current thread's reusable state, creating it on first opt-in use.
     *
     * @return non-null state owned exclusively by the calling thread
     */
    private static State state()
    {
        State state = STATE.get();
        if (state == null)
        {
            state = new State();
            STATE.set(state);
        }
        return state;
    }

    /** Mutable inspection and replay state confined to one render thread. */
    private static final class State
    {
        private final Set<ResourceLocation> observed = new HashSet<ResourceLocation>();
        private Mode mode = Mode.INACTIVE;
        private ResourceLocation lastObservedTexture;
        private boolean mayContainTranslucency;
        private ResourceLocation lastReplayTexture;
        private ITranslucentFaceFilter filter;
        private ModelRendererTurbo lastReplayPart;
        private List<TexturedPolygon> lastReplayFaces;

        /** Resets all derived references and enters opaque texture-inspection mode. */
        private void beginInspection()
        {
            observed.clear();
            lastObservedTexture = null;
            mayContainTranslucency = false;
            lastReplayTexture = null;
            filter = null;
            lastReplayPart = null;
            lastReplayFaces = null;
            mode = Mode.INSPECTING;
        }

        /** Resets replay accelerators and enters translucent replay mode. */
        private void beginReplay()
        {
            lastReplayTexture = null;
            filter = null;
            lastReplayPart = null;
            lastReplayFaces = null;
            mode = Mode.REPLAYING;
        }

        /**
         * Queries one previously unseen texture until the any-texture replay decision is true.
         *
         * @param texture texture encountered by the opaque model traversal; {@code null} is ignored
         */
        private void observe(ResourceLocation texture)
        {
            if (texture == null || mayContainTranslucency)
            {
                return;
            }
            if (texture.equals(lastObservedTexture))
            {
                return;
            }
            lastObservedTexture = texture;
            if (observed.add(texture) == false)
            {
                return;
            }
            if (TextureAlphaMaskCache.mayContainTranslucentPixels(texture))
            {
                mayContainTranslucency = true;
            }
        }

        /**
         * Resolves and retains the face filter for the most recently bound replay texture.
         *
         * <p>A {@code null} result is intentionally retained for the rest of the current texture run
         * when analysis is pending or permissive. This keeps the whole run conservative and avoids
         * repeated cache requests for every part.</p>
         *
         * @param texture texture currently bound by the replaying model
         * @return safe ready filter, or {@code null} when complete geometry must be preserved
         */
        private ITranslucentFaceFilter filter(ResourceLocation texture)
        {
            if (mode != Mode.REPLAYING || texture == null)
            {
                return null;
            }
            if (texture.equals(lastReplayTexture) == false)
            {
                lastReplayTexture = texture;
                filter = TextureAlphaMaskCache.translucentFaceFilter(texture);
            }
            return filter;
        }

        /**
         * Returns the cached translucent subset for one part and texture pair.
         *
         * <p>The most recent result is retained because {@code enterPart} classifies a safe leaf
         * before its transforms and {@code drawTranslucentFaces} consumes the same result afterward.
         * The texture mask separately caches results by face-list identity across parts and stock
         * instances.</p>
         *
         * @param part part whose stable face list is being classified
         * @param texture texture currently bound for that part
         * @return immutable filtered face list, possibly empty, or {@code null} to fail open
         */
        private List<TexturedPolygon> filteredFaces(
            ModelRendererTurbo part,
            ResourceLocation texture)
        {
            if (part == lastReplayPart && texture != null && texture.equals(lastReplayTexture))
            {
                return lastReplayFaces;
            }
            ITranslucentFaceFilter resolved = filter(texture);
            if (resolved == null || part == null)
            {
                lastReplayPart = null;
                lastReplayFaces = null;
                return null;
            }
            lastReplayPart = part;
            lastReplayFaces = resolved.filter(part.faces);
            return lastReplayFaces;
        }
    }
}
