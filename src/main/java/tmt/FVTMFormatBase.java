package tmt;

import net.minecraft.entity.Entity;

import java.util.ArrayList;

/**
 * Basic Compatibility class for FVTM Format Models
 *
 * <p>FVTM models are generic group containers, not just normal rolling-stock bodies.
 * The same class can be used for a full BOB body, a bogie/truck model, a detail kit,
 * a cargo-like add-on, or another nested submodel. That matters for batching: some FVTM
 * geometry is safe to prebatch before the main model renders, while nested FVTM geometry
 * must be batched only while its caller's current GL matrix state and bound texture are active.</p>
 * 
 * @author Ferdinand (FEX___96)
 *
 */
public class FVTMFormatBase extends ModelBase {
	
	public int textureX, textureY;
	public String name;
	public ArrayList<TurboList> groups = new ArrayList<TurboList>();

	public void addToCreators(String author){
		//
	}
	
	@SuppressWarnings("serial")
	public static class TurboList extends ArrayList<ModelRendererTurbo>{
		
		public final String name;
		
		public TurboList(String groupname){
			this.name = groupname;
		}
		
	}
	
	@Override
	public void render(){
		/*
		 * Runtime FVTM batching is intentionally done here, inside the FVTM render call.
		 * An FVTM model may be a bogie or detail model that was already translated/rotated
		 * by its parent before render() was called. Rendering the cached batch immediately
		 * draws it under the current GL matrix state. The cache stores the model's local
		 * shape, not the front/rear bogie position or any world-space placement.
		 *
		 * The returned list contains only the parts emitted by the batch. The normal group
		 * loop still runs afterward so unsupported or unsafe parts can draw through the old
		 * path. Those emitted parts are temporarily suppressed during the loop, then released
		 * in finally so a reused model can render again for a second placement.
		 */
		ArrayList<ModelRendererTurbo> runtimeSuppressed = ModelRendererTurboBatch.renderFVTMRuntimeGroups(this, groups, 0.0625F, false);
		try {
		for(TurboList list : groups){
			for(ModelRendererTurbo turbo : list) turbo.render();
		}
		}
		finally {
			ModelRendererTurboBatch.releaseRuntimeSuppressions(runtimeSuppressed);
		}
	}
	

	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		/*
		 * Entity-aware FVTM rendering follows the same rule as render(): batch only at the
		 * point where the FVTM model is actually being drawn. This is different from static
		 * body prebatching, which runs before generated model code starts applying matrix
		 * transforms. For FVTM bogies, details, and cargo-like submodels, the parent render
		 * code has already placed the model by the time we get here, so the batch must be
		 * called now.
		 *
		 * Suppression is scoped to this one render pass. The batch renderer returns the exact
		 * ModelRendererTurbo parts it drew, the per-part loop skips those parts, and finally
		 * removes the suppression. Without that release, shared models such as front/rear
		 * bogies could disappear on their next render.
		 */
		ArrayList<ModelRendererTurbo> runtimeSuppressed = ModelRendererTurboBatch.renderFVTMRuntimeGroups(this, groups, scale, false);
		try {
		for(TurboList list : groups){
			for(ModelRendererTurbo turbo : list) turbo.render();
		}
		}
		finally {
			ModelRendererTurboBatch.releaseRuntimeSuppressions(runtimeSuppressed);
		}
	}

}
