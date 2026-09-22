package train.client.render.translucency;

import java.util.List;
import tmt.TexturedPolygon;

/**
 * Read-only classification contract for selecting partially transparent TMT polygons.
 *
 * <p>Implementations are expected to cache results for stable face-list identities. A returned
 * empty list proves that the supplied geometry contains no source texel with alpha {@code 1-254};
 * callers use a missing filter, rather than an empty result, to represent unsafe or unavailable
 * analysis.</p>
 */
public interface ITranslucentFaceFilter
{
    /**
     * Returns the cached subset of polygons covering at least one partial-alpha source texel.
     *
     * @param polygons stable TMT face list to classify
     * @return immutable translucent subset, possibly empty
     */
    List<TexturedPolygon> filter(List<TexturedPolygon> polygons);
}
