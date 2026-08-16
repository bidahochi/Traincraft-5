package tmt;

import fexcraft.fvtm.BOBRollingStockModel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import train.common.api.AbstractRotarySnowPlow;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightControls;
import train.common.api.RollingStockHeadlightLevel;
import train.common.api.RollingStockLightChannel;
import train.common.core.handlers.ConfigHandler;

import train.client.render.lighting.BoundedIdentityCache;
import train.client.render.lighting.RollingStockLightOcclusion;

/**
 * Makes large rolling-stock bodies cheaper to render.
 *
 * <p>The old generated models render every little {@link ModelRendererTurbo} box one at a
 * time. Some passenger cars have hundreds of body boxes, so a long consist can make thousands
 * of tiny OpenGL calls every frame. This class reduces that cost by drawing the large static
 * body first as a few merged display lists.</p>
 *
 * <p>It is deliberately not a full replacement for the generated model renderer. The generated
 * render method still runs afterward. We only skip the exact body parts already drawn here.
 * Trucks, bogies, texture swaps, cargo, rotary pieces, overlays, and other custom sections
 * continue to render the old way. This boundary is what keeps bogies from moving to the wrong
 * place and keeps custom model code from losing its original texture/light/matrix state.</p>
 */
public final class ModelRendererTurboBatch {

	private static final int MIN_BATCH_SIZE = 64;
	private static final int FVTM_RUNTIME_MIN_BATCH_SIZE = 8;
	private static final int FVTM_RUNTIME_BATCH_INDEX = -1;
	private static final int NESTED_RUNTIME_MIN_BATCH_SIZE = 8;
	private static final int NESTED_RUNTIME_BATCH_INDEX = -2;
	private static final int MAXIMUM_COMPILED_BATCHES = 2048;
    private static final int MAXIMUM_DETAIL_LAYOUTS = 512;
    private static final int MAXIMUM_MODEL_GROUPS = 256;
    private static final int MAXIMUM_STATIC_LAYOUTS = 512;
    private static final int MAXIMUM_PART_GROUPS = 32768;
	private static final ThreadLocal<Context> ACTIVE = new ThreadLocal<Context>();
	private static final ThreadLocal<Context> REUSABLE_CONTEXT = new ThreadLocal<Context>();
    private static final Map<BatchKey, CompiledBatch> CACHE = new LinkedHashMap<BatchKey, CompiledBatch>(256, 0.75F, true);
	private static final Map<DetailLayoutKey, CompiledBatch> DETAIL_LAYOUT_CACHE = new
        LinkedHashMap<DetailLayoutKey, CompiledBatch>(128, 0.75F, true);
	private static final BoundedIdentityCache<ModelRendererTurbo, RenderGroup> GROUP_CACHE = new
        BoundedIdentityCache<ModelRendererTurbo, RenderGroup>(MAXIMUM_PART_GROUPS);
	private static final Map<Class<?>, List<StaticBodyField>> STATIC_BODY_FIELDS = new HashMap<Class<?>, List<StaticBodyField>>();
	private static final Map<Class<?>, List<StaticBodyField>> NESTED_MODEL_FIELDS = new HashMap<Class<?>, List<StaticBodyField>>();
	private static final BoundedIdentityCache<Object, DynamicPartGroups> DYNAMIC_GROUPS = new
        BoundedIdentityCache<Object, DynamicPartGroups>(MAXIMUM_MODEL_GROUPS);
    private static final BoundedIdentityCache<ModelRendererTurbo[], StaticBatchLayout> STATIC_ARRAY_LAYOUTS = new
        BoundedIdentityCache<ModelRendererTurbo[], StaticBatchLayout>(MAXIMUM_STATIC_LAYOUTS);
    private static final BoundedIdentityCache<FVTMFormatBase, StaticBatchLayout> STATIC_FVTM_LAYOUTS = new
        BoundedIdentityCache<FVTMFormatBase, StaticBatchLayout>(MAXIMUM_STATIC_LAYOUTS);
    private static final BoundedIdentityCache<List<Entry>, EntryGroups> STATIC_ENTRY_GROUPS = new
        BoundedIdentityCache<List<Entry>, EntryGroups>(MAXIMUM_STATIC_LAYOUTS);
    private static final BoundedIdentityCache<List<Entry>, Long> STATIC_SIGNATURES = new
        BoundedIdentityCache<List<Entry>, Long>(MAXIMUM_STATIC_LAYOUTS * RenderGroup.values().length);

	private ModelRendererTurboBatch() {
	}

	/**
     * Deletes render-thread-owned display lists and clears all model/layout reflection caches.
     * Called on resource reload; invoking it without a current OpenGL context is invalid.
     */
	public static void clearLightingCaches()
    {
        for (CompiledBatch batch : CACHE.values())
        {
            GL11.glDeleteLists(batch.displayList, 1);
        }
        for (CompiledBatch batch : DETAIL_LAYOUT_CACHE.values())
        {
            GL11.glDeleteLists(batch.displayList, 1);
        }
        CACHE.clear();
        DETAIL_LAYOUT_CACHE.clear();
        GROUP_CACHE.clear();
        STATIC_BODY_FIELDS.clear();
        NESTED_MODEL_FIELDS.clear();
        DYNAMIC_GROUPS.clear();
        STATIC_ARRAY_LAYOUTS.clear();
        STATIC_FVTM_LAYOUTS.clear();
        STATIC_ENTRY_GROUPS.clear();
        STATIC_SIGNATURES.clear();
    }

    /** Evicts least-recently-used compiled batches and deletes their OpenGL display lists. */
    private static <K> void trimCompiledCache(Map<K, CompiledBatch> cache, int maximumSize)
    {
        while (cache.size() > maximumSize)
        {
            Iterator<Map.Entry<K, CompiledBatch>> iterator = cache.entrySet().iterator();
            if (iterator.hasNext() == false)
            {
                return;
            }
            CompiledBatch batch = iterator.next().getValue();
            iterator.remove();
            GL11.glDeleteLists(batch.displayList, 1);
        }
    }

	public static void begin(Object owner) {
		begin(owner, null);
	}

	public static void begin(Object owner, Entity entity) {
		if (!ConfigHandler.ENABLE_TMT_MODEL_BATCHING || owner == null) {
			return;
		}
        Context context = REUSABLE_CONTEXT.get();
        if (context == null)
        {
            context = new Context();
            REUSABLE_CONTEXT.set(context);
        }
        context.reset(owner, entity);
        ACTIVE.set(context);
	}

	public static void end() {
		Context context = ACTIVE.get();
		if (context == null) {
			return;
		}
		try {
			flushActive();
		}
		finally {
			ACTIVE.remove();
		}
	}

	/**
	 * Called by every {@link ModelRendererTurbo#render(float, boolean)} while a batch is active.
	 *
	 * <p>Think of this as the gatekeeper for each model part:</p>
	 *
	 * <ul>
	 *   <li>If this part was already drawn by the body prebatch, return true so the normal
	 *   render call is skipped. That prevents drawing the same body box twice.</li>
	 *   <li>If {@code suppressOnly} is true, the body prebatch is finished. From that point on,
	 *   we do not collect new parts, because later parts may be bogies or custom sections that
	 *   need their exact original transform and render state.</li>
	 *   <li>Collection is disabled by default. It is only allowed while an explicit body-source
	 *   helper owns the render boundary. That prevents a random truck or cargo render call from
	 *   being delayed until after its GL matrix has changed.</li>
	 * </ul>
	 */
	public static boolean capture(ModelRendererTurbo turbo, float scale, boolean rotorder) {
		Context context = ACTIVE.get();
		if (context != null && context.scopedSuppressed.remove(turbo)) {
			if (context.scopedSuppressed.isEmpty()) {
				context.scopedSuppressionOwner = null;
			}
			return true;
		}
		if (context != null && isSuppressed(context, turbo)) {
			return true;
		}
		if (context != null && context.suppressOnly && tryRenderNestedStaticModel(context, turbo, scale, rotorder)) {
			return true;
		}
		if (context == null || context.suppressOnly || !context.captureEnabled || context.flushing || !ConfigHandler.ENABLE_TMT_MODEL_BATCHING) {
			return false;
		}
		if (!isBatchCompatible(turbo)) {
			return false;
		}
		context.entries.add(new Entry(turbo, scale, rotorder, classify(turbo)));
		return true;
	}

	/**
	 * Finds and pre-renders the static body parts for model types that are not necessarily
	 * {@link ModelConverter}.
	 *
	 * <p>This method is intentionally conservative. It only batches arrays or groups we can
	 * identify before the generated model render method starts. That is the safety boundary
	 * that keeps trucks and bogies from being captured inside a temporary GL transform and
	 * replayed later after the transform has been popped.</p>
	 */
	public static boolean renderStaticBodySources(Object owner, Entity entity, float scale, boolean rotorder) {
		Context context = ACTIVE.get();
		if (context == null || context.flushing || owner == null || !ConfigHandler.ENABLE_TMT_MODEL_BATCHING) {
			if (context != null) {
				context.suppressOnly = true;
			}
			return false;
		}
		boolean rendered = false;
		if (owner instanceof BOBRollingStockModel) {
			rendered |= renderFVTMGroups(owner, ((BOBRollingStockModel)owner).getBaseModel(), scale, rotorder);
		}
		else
        { if (owner instanceof ModelConverter) {
			rendered |= renderArray(owner, ((ModelConverter)owner).bodyModel, scale, rotorder);
		}
		else { if (owner instanceof FVTMFormatBase) {
			rendered |= renderFVTMGroups(owner, (FVTMFormatBase)owner, scale, rotorder);
		}
		else {
			for (StaticBodyField source : getStaticBodyFields(owner.getClass())) {
				ModelRendererTurbo[] model = source.get(owner);
				if (model != null && model.length >= MIN_BATCH_SIZE) {
					rendered |= renderArray(owner, model, scale, rotorder);
				}
			}
		}
            }
		}
		context.suppressOnly = true;
		return rendered;
	}

	/**
	 * Explicit FVTM group prebatching for callers that have already decided the groups are
	 * static body geometry. This is used for the base model inside {@link BOBRollingStockModel}
	 * and for rolling-stock models that directly extend {@link FVTMFormatBase}.
	 *
	 * <p>FVTM models tend to be organized as many named {@code TurboList} groups. Batching each
	 * group by itself is safe, but it gives away much of the FPS win because many groups are too
	 * small to cross the batch threshold. Instead, this method flattens safe-looking static body
	 * groups into one large explicit body source. The later generated/FVTM render call will skip
	 * only the exact parts drawn here, so bogies and custom detail groups still render normally.</p>
	 *
	 * <p>This is not called from {@link FVTMFormatBase#render(Entity, float, float, float, float, float, float)}
	 * because FVTM subclasses can animate groups during render. The safe boundary is the explicit
	 * rolling-stock prebatch helper, before model render code starts changing matrices or textures.</p>
	 */
	public static boolean renderFVTMGroups(Object owner, FVTMFormatBase model, float scale, boolean rotorder) {
		Context context = ACTIVE.get();
		if (context == null || context.flushing || model == null || model.groups == null) {
			return false;
		}
		List<Entry> entries = staticFVTMEntries( model, scale, rotorder);
		if (entries.size() < MIN_BATCH_SIZE) {
			return false;
		}
		suppressStaticEntries(context, entries);
		captureStaticOcclusion(entries);
		renderEntries(context, entries);
		return true;
	}

	/**
	 * Batches FVTM models that are rendered from inside another model's custom render code.
	 *
	 * <p>This recovers the fast pre-bogie-fix behavior for BOB details and other nested FVTM
	 * models, but without the old transform bug. The batch is emitted immediately while the
	 * caller's current model-view matrix, currently bound texture, and light state are still
	 * active. Then the normal FVTM loop runs and skips only the parts drawn by this local
	 * batch.</p>
	 *
	 * <p>The suppressions returned from this method are temporary. They must be released when
	 * that specific FVTM render call ends, otherwise the same detail model reused elsewhere in
	 * the same rolling-stock render could disappear.</p>
	 */
	public static ArrayList<ModelRendererTurbo> renderFVTMRuntimeGroups(Object owner, List<FVTMFormatBase.TurboList> groups, float scale, boolean rotorder) {
		Context context = ACTIVE.get();
		ArrayList<ModelRendererTurbo> runtimeSuppressed = new ArrayList<ModelRendererTurbo>();
		if (context == null || context.flushing || groups == null || !ConfigHandler.ENABLE_TMT_MODEL_BATCHING) {
			return runtimeSuppressed;
		}
		List<Entry> entries = collectFVTMRuntimeEntries(context, groups, scale, rotorder, false);
		if (entries.size() < FVTM_RUNTIME_MIN_BATCH_SIZE) {
			return runtimeSuppressed;
		}
		for (Entry entry : entries) {
			context.suppressed.add(entry.turbo);
			runtimeSuppressed.add(entry.turbo);
		}
		captureStaticOcclusion(entries);
		renderEntries(context, entries, FVTM_RUNTIME_MIN_BATCH_SIZE, sharedSubmodelOwnerId(owner), FVTM_RUNTIME_BATCH_INDEX, true);
		return runtimeSuppressed;
	}

	public static boolean renderFVTMDetailLayout(Object owner, List<FVTMFormatBase.TurboList> groups, float scale, boolean rotorder, int placements) {
		return renderFVTMDetailLayout(owner, groups, scale, rotorder, placements, true);
	}

	/*
	 * Older BOB detail code can call this after it has already applied one
	 * detail placement to the model-view matrix. In that case the geometry batch
	 * is called immediately, using the caller's current transform and currently
	 * bound texture. The placement count is only for profiling; this overload
	 * does not replay the geometry at multiple placements.
	 */
	public static boolean renderFVTMDetailLayout(Object owner, List<FVTMFormatBase.TurboList> groups, float scale, boolean rotorder, int placements, boolean recordProfilerSource) {
		Context context = ACTIVE.get();
		if (context == null || context.flushing || owner == null || groups == null || placements < 2 || !ConfigHandler.ENABLE_TMT_MODEL_BATCHING) {
			return false;
		}
		List<Entry> entries = collectFVTMRuntimeEntries(context, groups, scale, rotorder, false);
		if (entries.size() < FVTM_RUNTIME_MIN_BATCH_SIZE) {
			return false;
		}
		renderEntries(context, entries, FVTM_RUNTIME_MIN_BATCH_SIZE, sharedSubmodelOwnerId(owner), FVTM_RUNTIME_BATCH_INDEX, true);
		return true;
	}

	/*
	 * Newer BOB detail batching uses this overload when it already knows every
	 * repeated placement. The reusable local FVTM geometry is compiled once, then
	 * a tiny layout display list replays that geometry under each placement
	 * transform. This still draws every physical bogie/detail, but removes a lot
	 * of repeated Java looping and per-part display-list calls.
	 */
	public static boolean renderFVTMDetailLayout(Object owner, List<FVTMFormatBase.TurboList> groups, float scale, boolean rotorder, List<DetailPlacement> placements) {
		Context context = ACTIVE.get();
		if (context == null || context.flushing || owner == null || groups == null || placements == null || placements.size() < 2 || !ConfigHandler.ENABLE_TMT_MODEL_BATCHING) {
			return false;
		}
		List<Entry> entries = collectFVTMRuntimeEntries(context, groups, scale, rotorder, false);
		if (entries.size() < FVTM_RUNTIME_MIN_BATCH_SIZE) {
			return false;
		}
		context.flushing = true;
		try {
			int cacheOwnerId = sharedSubmodelOwnerId(owner);
			renderDetailLayoutGroup(context, entries, RenderGroup.NORMAL, cacheOwnerId, placements);
			renderDetailLayoutGroup(context, entries, RenderGroup.CULL, cacheOwnerId, placements);
			renderDetailLayoutGroup(context, entries, RenderGroup.LAMP, cacheOwnerId, placements);
			renderDetailLayoutGroup(context, entries, RenderGroup.DITCH, cacheOwnerId, placements);
			renderDetailLayoutGroup(context, entries, RenderGroup.COMMANDER, cacheOwnerId, placements);
			renderDetailLayoutGroup(context, entries, RenderGroup.PRIME1, cacheOwnerId, placements);
			renderDetailLayoutGroup(context, entries, RenderGroup.PRIME2, cacheOwnerId, placements);
			renderDetailLayoutGroup(context, entries, RenderGroup.PRIME3, cacheOwnerId, placements);
			renderDetailLayoutGroup(context, entries, RenderGroup.PRIME4, cacheOwnerId, placements);
		}
		finally {
			context.flushing = false;
		}
		return true;
	}

	/*
	 * Runtime FVTM collection is intentionally separate from static body
	 * collection. Static body collection uses strict names because it runs before
	 * model code applies custom transforms. Runtime collection is called from
	 * inside FVTMFormatBase.render(), where the current GL matrix and texture are
	 * already correct, so it can accept more groups while still skipping parts
	 * already drawn by an earlier explicit prebatch.
	 */
	private static List<Entry> collectFVTMRuntimeEntries(Context context, List<FVTMFormatBase.TurboList> groups, float scale, boolean rotorder, boolean strictStaticNames) {
		List<Entry> entries = new ArrayList<Entry>();
		for (FVTMFormatBase.TurboList group : groups) {
			if (group == null || strictStaticNames && !isSafeFVTMGroupName(group.name)) {
				continue;
			}
			for (ModelRendererTurbo turbo : group) {
				if (!isSuppressed(context, turbo)
						&& isBatchCompatible(turbo)
						&& (!strictStaticNames || isSafeFVTMPartName(turbo))) {
					entries.add(new Entry(turbo, scale, rotorder, classify(turbo)));
				}
			}
		}
		return entries;
	}

	public static void releaseRuntimeSuppressions(ArrayList<ModelRendererTurbo> runtimeSuppressed) {
		Context context = ACTIVE.get();
		if (context == null || runtimeSuppressed == null || runtimeSuppressed.isEmpty()) {
			return;
		}
		for (ModelRendererTurbo turbo : runtimeSuppressed) {
			context.suppressed.remove(turbo);
		}
	}

	private static boolean tryRenderNestedStaticModel(Context context, ModelRendererTurbo turbo, float scale, boolean rotorder) {
		/*
		 * Generated submodels, such as Java bogie classes, are discovered lazily:
		 * the first part render tells us which owner object is currently being
		 * drawn. We then batch that owner's safe local arrays immediately under
		 * the caller's active GL matrix. The suppression set is scoped to this one
		 * submodel pass, so the same bogie object can render again for the rear
		 * truck without disappearing.
		 */
		if (context.flushing || turbo == null || !ConfigHandler.ENABLE_TMT_MODEL_BATCHING) {
			return false;
		}
		Object nestedOwner = turbo.getModelOwner();
		if (nestedOwner == null
				|| nestedOwner == context.owner
				|| nestedOwner instanceof FVTMFormatBase
				|| nestedOwner instanceof FVTMFormatBase.TurboList) {
			return false;
		}
		if (context.scopedSuppressionOwner != null && context.scopedSuppressionOwner != nestedOwner) {
			context.scopedSuppressed.clear();
			context.scopedSuppressionOwner = null;
		}
		List<Entry> entries = collectNestedStaticEntries(nestedOwner, scale, rotorder);
		if (entries.size() < NESTED_RUNTIME_MIN_BATCH_SIZE || !containsTurbo(entries, turbo)) {
			return false;
		}
		captureStaticOcclusion(entries);
		renderEntries(context, entries, NESTED_RUNTIME_MIN_BATCH_SIZE, sharedSubmodelOwnerId(nestedOwner), NESTED_RUNTIME_BATCH_INDEX, true);
		context.scopedSuppressionOwner = nestedOwner;
		for (Entry entry : entries) {
			context.scopedSuppressed.add(entry.turbo);
		}
		context.scopedSuppressed.remove(turbo);
		if (context.scopedSuppressed.isEmpty()) {
			context.scopedSuppressionOwner = null;
		}
		return true;
	}

	private static boolean containsTurbo(List<Entry> entries, ModelRendererTurbo turbo) {
		for (Entry entry : entries) {
			if (entry.turbo == turbo) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Renders rotary snowplow blade parts as an animated dynamic group.
	 *
	 * <p>These parts are intentionally not part of the static body prebatch. The geometry can be
	 * cached by each {@link ModelRendererTurbo}, but the blade position is an entity/frame state.
	 * In other words: cache the blade shape, not the blade's animated position. This same split is
	 * the pattern future wheel animation should follow.</p>
	 */
	public static boolean renderRotaryGroup(Object owner, AbstractRotarySnowPlow plow, float scale, boolean rotorder) {
		if (owner == null || plow == null) {
			return false;
		}
		List<ModelRendererTurbo> rotary = getDynamicPartGroups(owner).rotary;
		if (rotary.isEmpty()) {
			return false;
		}
		updateRotaryBladeAngle(plow);
		Context context = ACTIVE.get();
		boolean wasFlushing = context != null && context.flushing;
		if (context != null) {
			context.flushing = true;
		}
		try {
			for (ModelRendererTurbo turbo : rotary) {
				GL11.glPushMatrix();
				GL11.glTranslatef(turbo.rotationPointX * scale, turbo.rotationPointY * scale, turbo.rotationPointZ * scale);
				if (plow.isRotaryOn()) {
					GL11.glRotatef(plow.bladeRenderAngle * 57.29578F, 1F, 0F, 0F);
				}
				GL11.glTranslatef(-turbo.rotationPointX * scale, -turbo.rotationPointY * scale, -turbo.rotationPointZ * scale);
				turbo.render(scale, rotorder);
				GL11.glPopMatrix();
			}
		}
		finally {
			if (context != null) {
				context.flushing = wasFlushing;
			}
		}
		return true;
	}

	private static void updateRotaryBladeAngle(AbstractRotarySnowPlow plow) {
		long now = System.nanoTime();
		if (plow.bladeRenderLastTime == 0L) {
			plow.bladeRenderLastTime = now;
		}
		float elapsedMs = (now - plow.bladeRenderLastTime) / 1000000F;
		plow.bladeRenderLastTime = now;
		float idleDivisor = 500.0F;
		float maxDivisor = 150.0F;
		float maxSpeed = 1.0F;
		double trainSpeed = Math.abs(plow.getSpeed());
		double divisor = idleDivisor - (idleDivisor - maxDivisor) * Math.min(trainSpeed / maxSpeed, 1.0F);
		if (plow.isRotaryOn()) {
			plow.bladeRenderAngle -= elapsedMs / divisor;
		}
		if (plow.bladeRenderAngle > Math.PI * 2F) {
			plow.bladeRenderAngle -= Math.PI * 2F;
		}
		if (plow.bladeRenderAngle < -Math.PI * 2F) {
			plow.bladeRenderAngle += Math.PI * 2F;
		}
	}

	/**
	 * Fast path for large generated {@code ModelConverter.bodyModel} arrays.
	 *
	 * <p>This is the main performance win. Instead of rendering hundreds of body boxes one by
	 * one, we collect the compatible body boxes and draw them as a few larger display lists.
	 * The amount of geometry is mostly the same, but the number of Java/OpenGL calls drops
	 * hard.</p>
	 *
	 * <p>After this, the generated model still runs like normal. The trick is that every body
	 * part drawn here is stored in {@code suppressed}, so when the generated loop reaches that
	 * same Java object, it is skipped. Then {@code suppressOnly} is set so later parts are not
	 * collected. That protects parts whose render position or texture depends on custom code
	 * inside the generated model.</p>
	 *
	 * <p>Even in {@code bodyModel}, some generated parts are not really static body shell. The
	 * rotary snowplow keeps its spinning blade parts in {@code bodyModel} with box name
	 * {@code "rotary"}. Those must stay out of this prebatch so the special rotary renderer can
	 * draw exactly one animated blade set instead of one frozen prebatched copy plus one spinning
	 * copy.</p>
	 */
	public static boolean renderArray(Object owner, ModelRendererTurbo[] model, float scale, boolean rotorder) {
		Context context = ACTIVE.get();
		if (context == null || context.flushing || owner == null || model == null || model.length < MIN_BATCH_SIZE) {
			if (context != null) {
				context.suppressOnly = true;
			}
			return false;
		}
		List<Entry> entries = staticArrayEntries(model, scale, rotorder);
		if (entries.size() >= MIN_BATCH_SIZE) {
			suppressStaticEntries(context, entries);
			captureStaticOcclusion(entries);
			renderEntries(context, entries);
			context.suppressOnly = true;
			return true;
		}
		context.suppressOnly = true;
		return false;
	}

	/** Captures a static batch with one shared GPU matrix readback instead of one per model box. */
	private static void captureStaticOcclusion(List<Entry> entries) {
		if (!RollingStockLightOcclusion.beginSharedPartCapture()) {
			return;
		}
		try {
			for (Entry entry : entries) {
				RollingStockLightOcclusion.captureSharedPart(
					entry.turbo, entry.scale, entry.rotorder);
			}
		}
		finally {
			RollingStockLightOcclusion.endSharedPartCapture();
		}
	}

	/** Reuses the immutable static layout's identity index instead of rebuilding a set per stock. */
	private static void suppressStaticEntries(Context context, List<Entry> entries) {
		EntryGroups groups = STATIC_ENTRY_GROUPS.get(entries);
		if (groups != null) {
			context.staticallySuppressed.add(groups);
			return;
		}
		for (Entry entry : entries) {
			context.suppressed.add(entry.turbo);
		}
	}

	private static boolean isSuppressed(Context context, ModelRendererTurbo turbo) {
		if (context.suppressed.contains(turbo)) {
			return true;
		}
		for (EntryGroups groups : context.staticallySuppressed) {
			if (groups.contains(turbo)) {
				return true;
			}
		}
		return false;
	}

	/** Returns an identity-cached immutable layout for batch-safe parts of a generated array. */
	private static List<Entry> staticArrayEntries(ModelRendererTurbo[] model, float scale, boolean rotorder)
    {
        StaticBatchLayout cached = STATIC_ARRAY_LAYOUTS.get(model);
        if (cached != null && cached.matches(scale, rotorder))
        {
            return cached.entries;
        }
        List<Entry> entries = new ArrayList<Entry>(model.length);
        for (ModelRendererTurbo turbo : model)
        {
            if (isBatchCompatible(turbo) && isSafeStaticPartName(turbo))
            {
                entries.add(new Entry(turbo, scale, rotorder, classify(turbo)));
            }
        }
        StaticBatchLayout layout = new StaticBatchLayout(scale, rotorder, entries);
        STATIC_ARRAY_LAYOUTS.put(model, layout);
        STATIC_ENTRY_GROUPS.put(layout.entries, new EntryGroups(layout.entries));
        return layout.entries;
    }

    /** Returns an identity-cached immutable layout for batch-safe FVTM groups and parts. */
    private static List<Entry> staticFVTMEntries(FVTMFormatBase model, float scale, boolean rotorder)
    {
        StaticBatchLayout cached = STATIC_FVTM_LAYOUTS.get(model);
        if (cached != null && cached.matches(scale, rotorder))
        {
            return cached.entries;
        }
        List<Entry> entries = new ArrayList<Entry>();
        for (FVTMFormatBase.TurboList group : model.groups)
        {
            if (group == null || isSafeFVTMGroupName(group.name) == false)
            {
                continue;
            }
            for (ModelRendererTurbo turbo : group)
            {
                if (isBatchCompatible(turbo) && isSafeFVTMPartName(turbo))
                {
                    entries.add(new Entry(turbo, scale, rotorder, classify(turbo)));
                }
            }
        }
        StaticBatchLayout layout = new StaticBatchLayout(scale, rotorder, entries);
        STATIC_FVTM_LAYOUTS.put(model, layout);
        STATIC_ENTRY_GROUPS.put(layout.entries, new EntryGroups(layout.entries));
        return layout.entries;
    }

	private static List<StaticBodyField> getStaticBodyFields(Class<?> type) {
		List<StaticBodyField> cached = STATIC_BODY_FIELDS.get(type);
		if (cached != null) {
			return cached;
		}
		List<StaticBodyField> fields = new ArrayList<StaticBodyField>();
		Field bodyModel = findField(type, "bodyModel");
		if (bodyModel != null && bodyModel.getType().isArray() && bodyModel.getType().getComponentType() == ModelRendererTurbo.class) {
			fields.add(new StaticBodyField(bodyModel));
		}
		else {
			addSafeModelArrays(type, fields);
		}
		STATIC_BODY_FIELDS.put(type, fields);
		return fields;
	}

	private static List<Entry> collectNestedStaticEntries(Object owner, float scale, boolean rotorder) {
		if (owner == null || hasUnsafeNestedArrays(owner)) {
			return Collections.emptyList();
		}
		List<StaticBodyField> fields = getNestedModelFields(owner.getClass());
		if (fields.isEmpty()) {
			return Collections.emptyList();
		}
		List<Entry> entries = new ArrayList<Entry>();
		Set<ModelRendererTurbo> seen = Collections.newSetFromMap(new IdentityHashMap<ModelRendererTurbo, Boolean>());
		for (StaticBodyField source : fields) {
			ModelRendererTurbo[] model = source.get(owner);
			if (model == null || model.length == 0) {
				continue;
			}
			for (ModelRendererTurbo turbo : model) {
				if (turbo == null || seen.contains(turbo)) {
					continue;
				}
				if (!isBatchCompatible(turbo) || !isSafeNestedPartName(turbo)) {
					return Collections.emptyList();
				}
				seen.add(turbo);
				entries.add(new Entry(turbo, scale, rotorder, classify(turbo)));
			}
		}
		return entries;
	}

	private static List<StaticBodyField> getNestedModelFields(Class<?> type) {
		List<StaticBodyField> cached = NESTED_MODEL_FIELDS.get(type);
		if (cached != null) {
			return cached;
		}
		List<StaticBodyField> fields = new ArrayList<StaticBodyField>();
		Class<?> current = type;
		while (current != null) {
			Field[] declared = current.getDeclaredFields();
			for (Field field : declared) {
				if (!field.getType().isArray()
						|| field.getType().getComponentType() != ModelRendererTurbo.class
						|| !isSafeNestedModelFieldName(field.getName())
						|| containsField(fields, field)) {
					continue;
				}
				field.setAccessible(true);
				fields.add(new StaticBodyField(field));
			}
			current = current.getSuperclass();
		}
		NESTED_MODEL_FIELDS.put(type, fields);
		return fields;
	}

	private static boolean hasUnsafeNestedArrays(Object owner) {
		Class<?> current = owner.getClass();
		while (current != null) {
			Field[] declared = current.getDeclaredFields();
			for (Field field : declared) {
				if (!field.getType().isArray() || field.getType().getComponentType() != ModelRendererTurbo.class) {
					continue;
				}
				if (isSafeNestedModelFieldName(field.getName())) {
					continue;
				}
				field.setAccessible(true);
				try {
					ModelRendererTurbo[] model = (ModelRendererTurbo[])field.get(owner);
					if (model != null && model.length > 0) {
						return true;
					}
				}
				catch (IllegalAccessException ignored) {
				}
			}
			current = current.getSuperclass();
		}
		return false;
	}

	private static void addSafeModelArrays(Class<?> type, List<StaticBodyField> fields) {
		Class<?> current = type;
		while (current != null) {
			Field[] declared = current.getDeclaredFields();
			for (Field field : declared) {
				if (!field.getType().isArray()
						|| field.getType().getComponentType() != ModelRendererTurbo.class
						|| !isSafeStaticBodyFieldName(field.getName())
						|| containsField(fields, field)) {
					continue;
				}
				field.setAccessible(true);
				fields.add(new StaticBodyField(field));
			}
			current = current.getSuperclass();
		}
	}

	private static boolean containsField(List<StaticBodyField> fields, Field field) {
		for (StaticBodyField existing : fields) {
			if (existing.field.equals(field)) {
				return true;
			}
		}
		return false;
	}

	private static DynamicPartGroups getDynamicPartGroups(Object owner) {
		/*
		 * Dynamic group lookup is cached by model instance. These parts are not
		 * static body geometry: they need per-entity or per-frame logic such as a
		 * rotary blade angle. We cache only the membership list so the renderer can
		 * find those parts cheaply without baking their animated position.
		 */
		DynamicPartGroups cached = DYNAMIC_GROUPS.get(owner);
		if (cached != null) {
			return cached;
		}
		DynamicPartGroups groups = new DynamicPartGroups();
		Set<ModelRendererTurbo> seen = Collections.newSetFromMap(new IdentityHashMap<ModelRendererTurbo, Boolean>());
		if (owner instanceof BOBRollingStockModel) {
			collectDynamicFVTMGroups(groups, seen, ((BOBRollingStockModel)owner).getBaseModel());
		}
		if (owner instanceof ModelConverter) {
			collectDynamicArray(groups, seen, ((ModelConverter)owner).bodyModel);
		}
		if (owner instanceof FVTMFormatBase) {
			collectDynamicFVTMGroups(groups, seen, (FVTMFormatBase)owner);
		}
		collectDynamicFields(groups, seen, owner);
		DYNAMIC_GROUPS.put(owner, groups);
		return groups;
	}

	private static void collectDynamicFVTMGroups(DynamicPartGroups groups, Set<ModelRendererTurbo> seen, FVTMFormatBase model) {
		if (model == null || model.groups == null) {
			return;
		}
		for (FVTMFormatBase.TurboList group : model.groups) {
			if (group == null) {
				continue;
			}
			for (ModelRendererTurbo turbo : group) {
				collectDynamicPart(groups, seen, turbo);
			}
		}
	}

	private static void collectDynamicFields(DynamicPartGroups groups, Set<ModelRendererTurbo> seen, Object owner) {
		Class<?> current = owner.getClass();
		while (current != null) {
			Field[] declared = current.getDeclaredFields();
			for (Field field : declared) {
				if (!field.getType().isArray() || field.getType().getComponentType() != ModelRendererTurbo.class) {
					continue;
				}
				field.setAccessible(true);
				try {
					collectDynamicArray(groups, seen, (ModelRendererTurbo[])field.get(owner));
				}
				catch (IllegalAccessException ignored) {
				}
			}
			current = current.getSuperclass();
		}
	}

	private static void collectDynamicArray(DynamicPartGroups groups, Set<ModelRendererTurbo> seen, ModelRendererTurbo[] model) {
		if (model == null) {
			return;
		}
		for (ModelRendererTurbo turbo : model) {
			collectDynamicPart(groups, seen, turbo);
		}
	}

	private static void collectDynamicPart(DynamicPartGroups groups, Set<ModelRendererTurbo> seen, ModelRendererTurbo turbo) {
		if (turbo == null || seen.contains(turbo)) {
			return;
		}
		seen.add(turbo);
		if (isRotaryPartName(turbo.boxName)) {
			groups.rotary.add(turbo);
		}
	}

	private static boolean isSafeStaticBodyFieldName(String name) {
		return !containsUnsafeStaticBodyName(name);
	}

	private static boolean isSafeNestedModelFieldName(String name) {
		return !containsUnsafeNestedModelName(name);
	}

	private static boolean isSafeFVTMGroupName(String name) {
		return !containsUnsafeStaticBodyName(name);
	}

	private static boolean isSafeFVTMPartName(ModelRendererTurbo turbo) {
		return isSafeStaticPartName(turbo);
	}

	private static boolean isSafeStaticPartName(ModelRendererTurbo turbo) {
		return turbo == null || !containsUnsafeStaticBodyName(turbo.boxName);
	}

	private static boolean isSafeNestedPartName(ModelRendererTurbo turbo) {
		return turbo == null || !containsUnsafeNestedModelName(turbo.boxName);
	}

	private static boolean isRotaryPartName(String name) {
		String lower = name == null ? "" : name.toLowerCase();
		return lower.contains("rotary");
	}

	private static boolean containsUnsafeStaticBodyName(String name) {
		/*
		 * Static body prebatching is the most aggressive path, so its name filter
		 * is broad. Anything that sounds animated, load-dependent, texture/detail
		 * dependent, or transform-sensitive stays out of the up-front body batch
		 * and renders later through its normal code path.
		 */
		String lower = name == null ? "" : name.toLowerCase();
		if (lower.equals("open")
				|| lower.equals("closed")
				|| lower.equals("rotaryblades")
				|| lower.contains("bogie")
				|| lower.contains("truck")
				|| lower.contains("wheel")
				|| lower.contains("axle")
				|| lower.contains("rod")
				|| lower.contains("door")
				|| lower.contains("blade")
				|| lower.contains("rotary")
				|| lower.contains("arm")
				|| lower.contains("cargo")
				|| lower.contains("load")
				|| lower.contains("coal")
				|| lower.contains("detail")
				|| lower.contains("overlay")
				|| lower.contains("coupler")
				|| lower.contains("turret")
				|| lower.contains("barrel")
				|| lower.contains("track")
				|| lower.contains("trailer")
				|| lower.contains("steering")) {
			return true;
		}
		return false;
	}

	private static boolean containsUnsafeNestedModelName(String name) {
		/*
		 * Nested submodels are rendered under their caller's current matrix, so
		 * names like bogie/truck are allowed here. Actual animated or conditional
		 * pieces, such as wheels, rods, loads, doors, and rotary blades, are still
		 * excluded so future animation or visibility rules are not frozen into a
		 * static nested batch.
		 */
		String lower = name == null ? "" : name.toLowerCase();
		if (lower.equals("open")
				|| lower.equals("closed")
				|| lower.equals("rotaryblades")
				|| lower.contains("wheel")
				|| lower.contains("axle")
				|| lower.contains("rod")
				|| lower.contains("door")
				|| lower.contains("blade")
				|| lower.contains("rotary")
				|| lower.contains("arm")
				|| lower.contains("cargo")
				|| lower.contains("load")
				|| lower.contains("coal")
				|| lower.contains("detail")
				|| lower.contains("overlay")
				|| lower.contains("coupler")
				|| lower.contains("turret")
				|| lower.contains("barrel")
				|| lower.contains("track")
				|| lower.contains("trailer")
				|| lower.contains("steering")) {
			return true;
		}
		return false;
	}

	private static Field findField(Class<?> type, String name) {
		Class<?> current = type;
		while (current != null) {
			try {
				Field field = current.getDeclaredField(name);
				field.setAccessible(true);
				return field;
			}
			catch (NoSuchFieldException ignored) {
				current = current.getSuperclass();
			}
		}
		return null;
	}

	/**
	 * Draws any parts that were collected but not yet emitted.
	 *
	 * <p>This is called before texture changes and at batch end. It is important because a part
	 * collected while texture A is active must not accidentally be drawn after texture B was
	 * bound. Flushing before those boundaries keeps the old visual behavior.</p>
	 */
	public static void flushActive() {
		Context context = ACTIVE.get();
		if (context == null || context.entries.isEmpty()) {
			return;
		}
		List<Entry> entries = context.entries;
		context.entries = context.spareEntries;
        context.entries.clear();
        try
        {
		renderEntries(context, entries);
	}
        finally
        {
            entries.clear();
            context.spareEntries = entries;
        }
    }

	/**
	 * Draws a group of collected parts.
	*
	 * <p>Small groups are drawn the old way because making a new display list for a tiny number
	 * of parts is not worth the overhead. Large groups are split by how they need to be drawn:
	 * normal body parts, parts that need culling disabled, and light parts. The shape-box
	 * triangle shading fix is not handled here; it lives in {@link ModelRendererTurbo}, where
	 * each part builds clean batch faces and robust normals.</p>
	 */
	private static void renderEntries(Context context, List<Entry> entries) {
		renderEntries(context, entries, MIN_BATCH_SIZE);
	}

	private static void renderEntries(Context context, List<Entry> entries, int minBatchSize) {
		renderEntries(context, entries, minBatchSize, System.identityHashCode(context.owner), context.flushIndex, false);
	}

	private static void renderEntries(Context context, List<Entry> entries, int minBatchSize, int cacheOwnerId, int cacheBatchIndex) {
		renderEntries(context, entries, minBatchSize, cacheOwnerId, cacheBatchIndex, false);
	}

	private static void renderEntries(Context context, List<Entry> entries, int minBatchSize, int cacheOwnerId, int cacheBatchIndex, boolean sharedGeometrySignature) {
		context.flushing = true;
		try {
			if (entries.size() < minBatchSize) {
				renderImmediate(entries);
			}
			else {
				renderGroup(context, entries, RenderGroup.NORMAL, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
				renderGroup(context, entries, RenderGroup.CULL, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
				renderGroup(context, entries, RenderGroup.LAMP, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
				renderGroup(context, entries, RenderGroup.DITCH, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
				renderGroup(context, entries, RenderGroup.COMMANDER, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
				renderGroup(context, entries, RenderGroup.PRIME1, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
				renderGroup(context, entries, RenderGroup.PRIME2, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
				renderGroup(context, entries, RenderGroup.PRIME3, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
				renderGroup(context, entries, RenderGroup.PRIME4, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
			}
		}
		finally {
			context.flushing = false;
			context.flushIndex++;
		}
	}

	/**
	 * Checks whether a part is safe enough to put in a batch.
	*
	 * <p>This intentionally allows shape boxes. Many of the expensive rolling-stock models are
	 * made mostly from shape boxes; rejecting them would remove most of the FPS gain. The risky
	 * shape-box edge cases are handled inside {@link ModelRendererTurbo} by skipping only faces
	 * with no real area and by fixing bad normals on collapsed wedge faces.</p>
	 */
	private static boolean isBatchCompatible(ModelRendererTurbo turbo) {
		return turbo != null
				&& train.client.render.lighting.ClientRollingStockLighting.isSemantic(turbo) == false
			   && train.client.render.lighting.PlacedModelLighting.requiresImmediateRendering(turbo) == false
               &&turbo.field_1402_i == false
				&& turbo.showModel
				&& turbo.useLegacyCompiler
				&& !turbo.forcedRecompile
				&& turbo.childModels == null;
	}

	/**
	 * Decides what drawing state a part needs based on its name.
	*
	 * <p>The shape of a lamp can be compiled once, but whether that lamp should glow can change
	 * every frame. That is why light names are split into separate buckets instead of compiling
	 * them all as one generic "lit" group. The geometry is cached; the light state is decided
	 * later when the batch is actually drawn.</p>
	 */
	private static RenderGroup classify(ModelRendererTurbo turbo) {
		RenderGroup cached = GROUP_CACHE.get(turbo);
		if (cached != null) {
			return cached;
		}
		String name = turbo.boxName == null ? "" : turbo.boxName.toLowerCase();
		if (name.contains("cull")) {
			GROUP_CACHE.put(turbo, RenderGroup.CULL);
			return RenderGroup.CULL;
		}
		if (name.contains("lamp")) {
			GROUP_CACHE.put(turbo, RenderGroup.LAMP);
			return RenderGroup.LAMP;
		}
		if (name.contains("ditch")) {
			GROUP_CACHE.put(turbo, RenderGroup.DITCH);
			return RenderGroup.DITCH;
		}
		if (name.contains("commander")) {
			GROUP_CACHE.put(turbo, RenderGroup.COMMANDER);
			return RenderGroup.COMMANDER;
		}
		if (name.contains("prime1")) {
			GROUP_CACHE.put(turbo, RenderGroup.PRIME1);
			return RenderGroup.PRIME1;
		}
		if (name.contains("prime2")) {
			GROUP_CACHE.put(turbo, RenderGroup.PRIME2);
			return RenderGroup.PRIME2;
		}
		if (name.contains("prime3")) {
			GROUP_CACHE.put(turbo, RenderGroup.PRIME3);
			return RenderGroup.PRIME3;
		}
		if (name.contains("prime4")) {
			GROUP_CACHE.put(turbo, RenderGroup.PRIME4);
			return RenderGroup.PRIME4;
		}
		GROUP_CACHE.put(turbo, RenderGroup.NORMAL);
		return RenderGroup.NORMAL;
	}

	/**
	 * Draws one bucket of parts with the temporary GL state it needs.
	*
	 * <p>Some parts need special state. For example, cull parts need backfaces visible, so face
	 * culling is disabled only while that group is drawn. Light parts may need fullbright, so
	 * the Minecraft lightmap is disabled only while those light batches are drawn and only if
	 * the current entity says the light is on. The state is restored afterward so it cannot
	 * leak into trucks, body parts, or the next model.</p>
	 */
	private static void renderGroup(Context context, List<Entry> entries, RenderGroup group, int cacheOwnerId, int cacheBatchIndex) {
		renderGroup(context, entries, group, cacheOwnerId, cacheBatchIndex, false);
	}

	private static void renderGroup(Context context, List<Entry> entries, RenderGroup group, int cacheOwnerId, int cacheBatchIndex, boolean sharedGeometrySignature) {
		List<Entry> groupEntries = entriesForGroup(entries, group);
		if (groupEntries.isEmpty()) {
			return;
		}
		if (group == RenderGroup.CULL) {
			GL11.glDisable(GL11.GL_CULL_FACE);
		}
		else
        { if (isFullbright(context, group)) {
			Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		}
        }
		try {
			callCompiledBatch(context, groupEntries, group, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature);
		}
		finally {
			if (group == RenderGroup.CULL) {
				GL11.glEnable(GL11.GL_CULL_FACE);
			}
			else
            { if (isFullbright(context, group)) {
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}
	}
    }

	private static void renderDetailLayoutGroup(Context context, List<Entry> entries, RenderGroup group, int cacheOwnerId, List<DetailPlacement> placements) {
		List<Entry> groupEntries = entriesForGroup(entries, group);
		if (groupEntries.isEmpty()) {
			return;
		}
		if (group == RenderGroup.CULL) {
			GL11.glDisable(GL11.GL_CULL_FACE);
		}
		else
        { if (isFullbright(context, group)) {
			Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		}
        }
		try {
			callDetailLayout(context, groupEntries, group, cacheOwnerId, placements);
		}
		finally {
			if (group == RenderGroup.CULL) {
				GL11.glEnable(GL11.GL_CULL_FACE);
			}
			else
            { if (isFullbright(context, group)) {
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}
	}
    }

	private static List<Entry> entriesForGroup(List<Entry> entries, RenderGroup group) {
        EntryGroups cached = STATIC_ENTRY_GROUPS.get(entries);
        if (cached != null)
        {
            return cached.entries[group.ordinal()];
        }
		List<Entry> groupEntries = new ArrayList<Entry>();
		for (Entry entry : entries) {
			if (entry.group == group) {
				groupEntries.add(entry);
			}
		}
		return groupEntries;
	}

	/**
	 * Decides whether a light part should glow for this specific entity right now.
	*
     * <p>The display list only stores the lamp's shape. It does not store "on" or "off". Rolling
     * stock that implements {@link IRollingStockLightControls} decides that here every frame.
     * Models without those controls keep the older behavior where lamp-named parts are always
     * fullbright, which is needed for some decorative passenger lights.
	 */
	private static boolean isFullbright(Context context, RenderGroup group) {
		if (!group.isLightGroup()) {
			return false;
		}
		if (!(context.entity instanceof IRollingStockLightControls)) {
			return true;
		}
		IRollingStockLightControls lights = (IRollingStockLightControls)context.entity;
        int phase = beaconPhase(context.entity);
		switch (group) {
			case LAMP:
				return lights.getFrontHeadlightLevel() != RollingStockHeadlightLevel.OFF
                       || lights.getRearHeadlightLevel() != RollingStockHeadlightLevel.OFF;
			case DITCH:
				return lights.isLightChannelEnabled(RollingStockLightChannel.DITCH);
			case COMMANDER:
				return lights.isLightChannelEnabled(RollingStockLightChannel.BEACON)
						&& context.entity instanceof EntityRollingStock
						&& ((EntityRollingStock)context.entity).ticksExisted % 10 < 5;
			case PRIME1:
				return lights.isLightChannelEnabled(RollingStockLightChannel.BEACON) && phase == 0;
			case PRIME2:
				return lights.isLightChannelEnabled(RollingStockLightChannel.BEACON) && phase == 1;
			case PRIME3:
				return lights.isLightChannelEnabled(RollingStockLightChannel.BEACON) && phase == 2;
			case PRIME4:
				return lights.isLightChannelEnabled(RollingStockLightChannel.BEACON) && phase == 3;
			default:
				return false;
		}
	}

    /** Returns the synchronized four-step beacon phase, advancing once every five ticks. */
    private static int beaconPhase(Entity entity)
    {
        if ((entity instanceof EntityRollingStock) == false)
        {
            return 0;
        }
        EntityRollingStock stock = (EntityRollingStock) entity;
        long ticks =
            stock.worldObj == null ? stock.ticksExisted : stock.worldObj.getTotalWorldTime();
        return (int)((ticks / 5L) & 3L);
    }

	/**
	 * Gets the compiled display list for this group, or builds it if it is missing/stale.
	*
	 * <p>The cache key separates model instance, flush number, and render bucket. The signature
     * then checks whether the same parts and transforms are still being used. If the geometry or
     * transform data changes, {@link ModelRendererTurbo#batchTransformHash()} must change too,
     * otherwise an old display list could be reused by mistake.
	 */
	private static void callCompiledBatch(Context context, List<Entry> entries, RenderGroup group) {
		callCompiledBatch(context, entries, group, System.identityHashCode(context.owner), context.flushIndex, false);
	}

	private static void callCompiledBatch(Context context, List<Entry> entries, RenderGroup group, int cacheOwnerId, int cacheBatchIndex) {
		callCompiledBatch(context, entries, group, cacheOwnerId, cacheBatchIndex, false);
	}

	private static void callCompiledBatch(Context context, List<Entry> entries, RenderGroup group, int cacheOwnerId, int cacheBatchIndex, boolean sharedGeometrySignature) {
		GL11.glCallList(getCompiledBatch(context, entries, group, cacheOwnerId, cacheBatchIndex, sharedGeometrySignature).displayList);
	}

	private static CompiledBatch getCompiledBatch(Context context, List<Entry> entries, RenderGroup group, int cacheOwnerId, int cacheBatchIndex, boolean sharedGeometrySignature) {
		BatchKey key = new BatchKey(cacheOwnerId, cacheBatchIndex, group);
		long signature = sharedGeometrySignature ? sharedGeometrySignature(entries) : signature(entries);
		CompiledBatch batch = CACHE.get(key);
		if (batch == null || batch.signature != signature) {
			if (batch != null) {
				GL11.glDeleteLists(batch.displayList, 1);
			}
			batch = compile(entries, signature);
			CACHE.put(key, batch);
            trimCompiledCache(CACHE, MAXIMUM_COMPILED_BATCHES);
		}
		return batch;
	}

	private static void callDetailLayout(Context context, List<Entry> entries, RenderGroup group, int cacheOwnerId, List<DetailPlacement> placements) {
		/*
		 * Detail layout batching uses two levels of display lists. The inner list
		 * stores the reusable local FVTM geometry, including part-local transforms
		 * and texcoords. The outer list stores the repeated detail-placement
		 * transforms and calls the inner list once per placement. That lets
		 * front/rear bogies share geometry without baking either bogie position
		 * into the geometry cache.
		 */
		CompiledBatch geometry = getCompiledBatch(context, entries, group, cacheOwnerId, FVTM_RUNTIME_BATCH_INDEX, true);
		long placementSignature = placementSignature(placements);
		long signature = 31L * sharedGeometrySignature(entries) + placementSignature;
		DetailLayoutKey key = new DetailLayoutKey(cacheOwnerId, group, placementSignature);
		CompiledBatch layout = DETAIL_LAYOUT_CACHE.get(key);
		if (layout == null || layout.signature != signature) {
			if (layout != null) {
				GL11.glDeleteLists(layout.displayList, 1);
			}
			layout = compileDetailLayout(geometry.displayList, placements, signature);
			DETAIL_LAYOUT_CACHE.put(key, layout);
            trimCompiledCache(DETAIL_LAYOUT_CACHE, MAXIMUM_DETAIL_LAYOUTS);
		}
		GL11.glCallList(layout.displayList);
	}

	/**
	 * Builds one merged display list for a bucket of parts.
	*
	 * <p>Normal quads and triangles are emitted through {@link ModelRendererTurbo#appendBatchGeometry}.
	 * That path uses cleaned batch faces, including the fix for collapsed shape boxes whose
	 * old normals caused dark diagonal triangle edges. Odd polygons that are not quads or
	 * triangles still use the legacy path so unusual model details are not lost.</p>
	 */
	private static CompiledBatch compile(List<Entry> entries, long signature) {
		int displayList = GLAllocation.generateDisplayLists(1);
		GL11.glNewList(displayList, GL11.GL_COMPILE);
		compileMode(entries, GL11.GL_QUADS);
		compileMode(entries, GL11.GL_TRIANGLES);
		for (Entry entry : entries) {
			entry.turbo.renderBatchGeometryRemainder(entry.scale, entry.rotorder);
		}
		GL11.glEndList();
		return new CompiledBatch(displayList, signature);
	}

	private static CompiledBatch compileDetailLayout(int geometryDisplayList, List<DetailPlacement> placements, long signature) {
		int displayList = GLAllocation.generateDisplayLists(1);
		GL11.glNewList(displayList, GL11.GL_COMPILE);
		for (DetailPlacement placement : placements) {
			GL11.glPushMatrix();
			placement.apply();
			GL11.glCallList(geometryDisplayList);
			GL11.glPopMatrix();
		}
		GL11.glEndList();
		return new CompiledBatch(displayList, signature);
	}

	/**
	 * Adds either all quad faces or all triangle faces to the display list being built.
	*
	 * <p>This method deliberately asks {@code ModelRendererTurbo} for batch geometry instead
	 * of reading raw polygons here. That keeps the shape-box cleanup and robust normal logic
	 * in one place.</p>
	 */
	private static void compileMode(List<Entry> entries, int mode) {
		Tessellator tessellator = Tessellator.getInstance();
		tessellator.startDrawing(mode);
		for (Entry entry : entries) {
			entry.turbo.appendBatchGeometry(tessellator, entry.scale, entry.rotorder, mode);
		}
		tessellator.draw();
	}

	private static void renderImmediate(List<Entry> entries) {
		for (Entry entry : entries) {
			entry.turbo.render(entry.scale, entry.rotorder);
		}
	}

	/**
	 * Builds a fingerprint for the contents of a batch.
	*
	 * <p>If this fingerprint changes, the cached display list is rebuilt. This prevents stale
	 * geometry when a part's transform, visibility, face count, or cleaned batch-face data is
	 * different from the last compile.</p>
	 */
	static long signature(List<Entry> entries) {
		Long cached = STATIC_SIGNATURES.get(entries);
		if (cached != null) {
			return cached.longValue();
		}
		return calculateSignature(entries);
	}

	private static long calculateSignature(List<Entry> entries) {
		long result = 1125899906842597L;
		for (Entry entry : entries) {
			result = 31L * result + System.identityHashCode(entry.turbo);
			result = 31L * result + Float.floatToIntBits(entry.scale);
			result = 31L * result + (entry.rotorder ? 1 : 0);
			result = 31L * result + entry.turbo.batchTransformHash();
		}
		return result;
	}

	private static long sharedGeometrySignature(List<Entry> entries) {
		/*
		 * Shared submodel caches are keyed by the submodel's shape, not by the
		 * parent rolling stock that happens to be drawing it. Unlike signature(),
		 * this deliberately omits each ModelRendererTurbo object's identity, but
		 * still includes the local geometry/transform hash, scale, render order,
		 * and render group. That lets the same FVTM/BOB or generated bogie
		 * geometry be reused across repeated placements and, when safe, across
		 * stock that share the same submodel.
		 */
		long result = 1469598103934665603L;
		for (Entry entry : entries) {
			result = 31L * result + Float.floatToIntBits(entry.scale);
			result = 31L * result + (entry.rotorder ? 1 : 0);
			result = 31L * result + entry.group.ordinal();
			result = 31L * result + entry.turbo.batchTransformHash();
		}
		return result;
	}

	private static long placementSignature(List<DetailPlacement> placements) {
		long result = 1099511628211L;
		for (DetailPlacement placement : placements) {
			result = 31L * result + placement.signature();
		}
		return result;
	}

	private static int sharedSubmodelOwnerId(Object owner) {
		/*
		 * Runtime/nested caches need stable owner ids that describe the reusable
		 * local model, not the parent train instance. FVTM/BOB models prefer their
		 * resource name when one exists; generated Java submodels fall back to
		 * class name so separate instances of the same bogie class can share the
		 * compiled local geometry.
		 */
		if (owner instanceof FVTMFormatBase) {
			FVTMFormatBase model = (FVTMFormatBase)owner;
			if (model.name != null && !model.name.isEmpty()) {
				return ("fvtm:" + model.name).hashCode();
			}
		}
		return owner == null ? 0 : ("class:" + owner.getClass().getName()).hashCode();
	}

	/**
	 * Buckets for parts that need different temporary draw state.
	*
	 * <p>Do not merge the light buckets back together just because the geometry is static.
	 * The same lamp shape may be drawn fullbright for one entity/frame and normally lit for
	 * another. Keeping these groups separate is what prevents locomotive lights from getting
	 * stuck on.</p>
	 */
	enum RenderGroup {
		NORMAL,
		CULL,
		LAMP,
		DITCH,
		COMMANDER,
		PRIME1,
		PRIME2,
		PRIME3,
		PRIME4;

		boolean isLightGroup() {
			return this != NORMAL && this != CULL;
		}
	}

	/**
	 * Temporary state for one model render.
	*
	 * <p>The most important fields are {@code suppressed} and {@code suppressOnly}. Suppressed
	 * parts were already drawn by the body prebatch and must be skipped when the generated
	 * model reaches them later. Suppress-only mode means "only skip already-drawn body parts;
	 * do not collect anything new." That keeps unknown/custom model sections on the old safe
	 * path. {@code scopedSuppressed} is shorter-lived: it only skips the remaining parts of
	 * one nested submodel pass, then is cleared so the same submodel object can be drawn again
	 * at another placement.</p>
	 */
	private static final class Context {
		private Object owner;
		private Entity entity;
		private int flushIndex;
		private boolean suppressOnly;
		private boolean captureEnabled;
		private boolean flushing;
		private Object scopedSuppressionOwner;
		private List<Entry> entries = new ArrayList<Entry>();
		private List<Entry> spareEntries = new ArrayList<Entry>();
		private final Set<ModelRendererTurbo> suppressed = Collections.newSetFromMap(new IdentityHashMap<ModelRendererTurbo, Boolean>());
		private final Set<ModelRendererTurbo> scopedSuppressed = Collections.newSetFromMap(new IdentityHashMap<ModelRendererTurbo, Boolean>());
		private final List<EntryGroups> staticallySuppressed = new ArrayList<EntryGroups>();

		private void reset(Object owner, Entity entity) {
			this.owner = owner;
			this.entity = entity;
            flushIndex = 0;
            suppressOnly = false;
            captureEnabled = false;
            flushing = false;
            scopedSuppressionOwner = null;
            entries.clear();
            spareEntries.clear();
            suppressed.clear();
            scopedSuppressed.clear();
			staticallySuppressed.clear();
		}
	}

	private static final class StaticBodyField {
		private final Field field;

		private StaticBodyField(Field field) {
			this.field = field;
		}

		private ModelRendererTurbo[] get(Object owner) {
			try {
				return (ModelRendererTurbo[])field.get(owner);
			}
			catch (IllegalAccessException ignored) {
				return null;
			}
		}
	}

	private static final class DynamicPartGroups {
		private final List<ModelRendererTurbo> rotary = new ArrayList<ModelRendererTurbo>();
	}

    private static final class StaticBatchLayout
    {
        private final int scaleBits;
        private final boolean rotorder;
        private final List<Entry> entries;

        private StaticBatchLayout(float scale, boolean rotorder, List<Entry> entries)
        {
            this.scaleBits = Float.floatToIntBits(scale);
            this.rotorder = rotorder;
            this.entries = Collections.unmodifiableList(entries);
        }

        private boolean matches(float scale, boolean currentRotorder)
        {
            return scaleBits == Float.floatToIntBits(scale) && rotorder == currentRotorder;
        }
    }

    private static final class EntryGroups
    {
        private final List<Entry>[] entries;
        private final IdentityHashMap<ModelRendererTurbo, Boolean> parts =
            new IdentityHashMap<ModelRendererTurbo, Boolean>();

        @SuppressWarnings("unchecked")
        private EntryGroups(List<Entry> source)
        {
            entries = (List<Entry>[]) new List<?>[RenderGroup.values().length];
            for (int index = 0; index < entries.length; index++)
            {
                entries[index] = new ArrayList<Entry>();
            }
            for (Entry entry : source)
            {
                entries[entry.group.ordinal()].add(entry);
                parts.put(entry.turbo, Boolean.TRUE);
            }
            for (int index = 0; index < entries.length; index++)
            {
                entries[index] = Collections.unmodifiableList(entries[index]);
                STATIC_SIGNATURES.put(entries[index], calculateSignature(entries[index]));
            }
        }

        private boolean contains(ModelRendererTurbo turbo)
        {
            return parts.containsKey(turbo);
        }
    }

	public static final class DetailPlacement {
		/*
		 * One placement of a repeated BOB/FVTM detail model. These values are kept
		 * outside the geometry display list so the same cached shape can be drawn
		 * multiple times at different positions or rotations. The apply() order
		 * mirrors the old BOB detail renderer: translate, scale, then X/Y/Z rotate.
		 */
		private final float translateX;
		private final float translateY;
		private final float translateZ;
		private final float scaleX;
		private final float scaleY;
		private final float scaleZ;
		private final float rotateX;
		private final float rotateY;
		private final float rotateZ;

		public DetailPlacement(Vec3f position, Vec3f scale, Vec3f rotation) {
			this.translateX = position == null ? 0F : position.xCoord;
			this.translateY = position == null ? 0F : position.yCoord;
			this.translateZ = position == null ? 0F : position.zCoord;
			this.scaleX = scale == null ? 1F : scale.xCoord;
			this.scaleY = scale == null ? 1F : scale.yCoord;
			this.scaleZ = scale == null ? 1F : scale.zCoord;
			this.rotateX = rotation == null ? 0F : rotation.xCoord;
			this.rotateY = rotation == null ? 0F : rotation.yCoord;
			this.rotateZ = rotation == null ? 0F : rotation.zCoord;
		}

		private void apply() {
			if (translateX != 0F || translateY != 0F || translateZ != 0F) {
				GL11.glTranslatef(translateX, translateY, translateZ);
			}
			if (scaleX != 1F || scaleY != 1F || scaleZ != 1F) {
				GL11.glScalef(scaleX, scaleY, scaleZ);
			}
			if (rotateX != 0F) {
				GL11.glRotatef(rotateX, 1F, 0F, 0F);
			}
			if (rotateY != 0F) {
				GL11.glRotatef(rotateY, 0F, 1F, 0F);
			}
			if (rotateZ != 0F) {
				GL11.glRotatef(rotateZ, 0F, 0F, 1F);
			}
		}

		private long signature() {
			long result = Float.floatToIntBits(translateX);
			result = 31L * result + Float.floatToIntBits(translateY);
			result = 31L * result + Float.floatToIntBits(translateZ);
			result = 31L * result + Float.floatToIntBits(scaleX);
			result = 31L * result + Float.floatToIntBits(scaleY);
			result = 31L * result + Float.floatToIntBits(scaleZ);
			result = 31L * result + Float.floatToIntBits(rotateX);
			result = 31L * result + Float.floatToIntBits(rotateY);
			result = 31L * result + Float.floatToIntBits(rotateZ);
			return result;
		}
	}

	static final class Entry {
		final ModelRendererTurbo turbo;
		final float scale;
		final boolean rotorder;
		final RenderGroup group;

		private Entry(ModelRendererTurbo turbo, float scale, boolean rotorder, RenderGroup group) {
			this.turbo = turbo;
			this.scale = scale;
			this.rotorder = rotorder;
			this.group = group;
		}
	}

	private static final class DetailLayoutKey {
		private final int ownerId;
		private final RenderGroup group;
		private final long placementSignature;

		private DetailLayoutKey(int ownerId, RenderGroup group, long placementSignature) {
			this.ownerId = ownerId;
			this.group = group;
			this.placementSignature = placementSignature;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof DetailLayoutKey)) {
				return false;
			}
			DetailLayoutKey other = (DetailLayoutKey)obj;
			return ownerId == other.ownerId && group == other.group && placementSignature == other.placementSignature;
		}

		@Override
		public int hashCode() {
			int result = ownerId;
			result = 31 * result + group.hashCode();
			result = 31 * result + (int)(placementSignature ^ placementSignature >>> 32);
			return result;
		}
	}

	private static final class BatchKey {
		private final int ownerId;
		private final int flushIndex;
		private final RenderGroup group;

		private BatchKey(int ownerId, int flushIndex, RenderGroup group) {
			this.ownerId = ownerId;
			this.flushIndex = flushIndex;
			this.group = group;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof BatchKey)) {
				return false;
			}
			BatchKey other = (BatchKey)obj;
			return ownerId == other.ownerId && flushIndex == other.flushIndex && group == other.group;
		}

		@Override
		public int hashCode() {
			int result = ownerId;
			result = 31 * result + flushIndex;
			result = 31 * result + group.hashCode();
			return result;
		}
	}

	private static final class CompiledBatch {
		private final int displayList;
		private final long signature;

		private CompiledBatch(int displayList, long signature) {
			this.displayList = displayList;
			this.signature = signature;
		}
	}
}
