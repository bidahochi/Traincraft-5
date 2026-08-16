package train.client.render;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tmt.ModelRendererTurbo;

/** Selection of complete four-part Prime top assemblies. */
final class SpecialBeaconSurfaceExtraction {
    private static final BoundedIdentityCache<Object, Map<ModelRendererTurbo, DetectedLightFace>>
            CACHE =
                    new BoundedIdentityCache<Object, Map<ModelRendererTurbo, DetectedLightFace>>(128);

    private SpecialBeaconSurfaceExtraction() {
    }

    static Map<ModelRendererTurbo, DetectedLightFace> completePrimeTopFaces(Object model) {
        if (model == null) {
            return Collections.emptyMap();
        }
        Map<ModelRendererTurbo, DetectedLightFace> cached = CACHE.get(model);
        if (cached != null) {
            return cached;
        }

        IdentityHashMap<ModelRendererTurbo, DetectedLightFace> result =
                new IdentityHashMap<ModelRendererTurbo, DetectedLightFace>();
        List<Field> fields = new ArrayList<Field>();
        for (Field field : model.getClass().getFields()) {
            if (Modifier.isStatic(field.getModifiers()) == false
                    && field.getType() == ModelRendererTurbo[].class) {
                fields.add(field);
            }
        }
        Collections.sort(fields, new Comparator<Field>() {
            @Override
            public int compare(Field first, Field second) {
                return first.getName().compareTo(second.getName());
            }
        });
        for (Field field : fields) {
            try {
                collectCompleteAssemblies(
                        field.getName(), (ModelRendererTurbo[]) field.get(model), result);
            } catch (IllegalAccessException ignored) {
            }
        }
        Map<ModelRendererTurbo, DetectedLightFace> immutable =
                Collections.unmodifiableMap(result);
        CACHE.put(model, immutable);
        return immutable;
    }

    private static void collectCompleteAssemblies(
            String collection,
            ModelRendererTurbo[] parts,
            IdentityHashMap<ModelRendererTurbo, DetectedLightFace> result) {
        if (parts == null) {
            return;
        }
        List<PrimeCandidate> candidates = new ArrayList<PrimeCandidate>();
        for (int index = 0; index < parts.length; index++) {
            ModelRendererTurbo part = parts[index];
            int phase = primePhase(part == null ? null : part.boxName);
            if (phase == 0) {
                continue;
            }
            DetectedLightFace top = AutomaticLightSurfaceDetection.detect(part).upwardFace();
            if (top != null) {
                candidates.add(new PrimeCandidate(
                        part, collection + index, phase, top));
            }
        }
        Collections.sort(candidates, new Comparator<PrimeCandidate>() {
            @Override
            public int compare(PrimeCandidate first, PrimeCandidate second) {
                return first.stableId.compareTo(second.stableId);
            }
        });

        boolean[] visited = new boolean[candidates.size()];
        for (int start = 0; start < candidates.size(); start++) {
            if (visited[start]) {
                continue;
            }
            List<Integer> pending = new ArrayList<Integer>();
            List<PrimeCandidate> component = new ArrayList<PrimeCandidate>();
            pending.add(start);
            visited[start] = true;
            for (int cursor = 0; cursor < pending.size(); cursor++) {
                PrimeCandidate candidate = candidates.get(pending.get(cursor));
                component.add(candidate);
                for (int other = 0; other < candidates.size(); other++) {
                    if (visited[other] == false && adjoin(candidate, candidates.get(other))) {
                        visited[other] = true;
                        pending.add(other);
                    }
                }
            }
            int phases = 0;
            for (PrimeCandidate candidate : component) {
                phases |= 1 << (candidate.phase - 1);
            }
            if (component.size() == 4 && phases == 15) {
                for (PrimeCandidate candidate : component) {
                    result.put(candidate.part, candidate.top);
                }
            }
        }
    }

    private static boolean adjoin(PrimeCandidate first, PrimeCandidate second) {
        DetectedLightFace a = first.top;
        DetectedLightFace b = second.top;
        float normalDot = a.modelNormalX * b.modelNormalX
                + a.modelNormalY * b.modelNormalY
                + a.modelNormalZ * b.modelNormalZ;
        if (normalDot < 0.98F) {
            return false;
        }
        float deltaX = b.modelX - a.modelX;
        float deltaY = b.modelY - a.modelY;
        float deltaZ = b.modelZ - a.modelZ;
        float planeDistance = deltaX * a.modelNormalX
                + deltaY * a.modelNormalY
                + deltaZ * a.modelNormalZ;
        if (Math.abs(planeDistance) > 0.005F) {
            return false;
        }
        // First-choice assembly test: authored Prime wedges
        // belong together when their top polygons share a vertex (within the
        // same 0.0025 model-unit tolerance).  The radius test below remains
        // the fallback for exporters which duplicate adjoining vertices.
        for (float[] firstVertex : a.vertices) {
            for (float[] secondVertex : b.vertices) {
                float vx = firstVertex[0] - secondVertex[0];
                float vy = firstVertex[1] - secondVertex[1];
                float vz = firstVertex[2] - secondVertex[2];
                if (vx * vx + vy * vy + vz * vz <= 6.25E-6F) {
                    return true;
                }
            }
        }
        deltaX -= planeDistance * a.modelNormalX;
        deltaY -= planeDistance * a.modelNormalY;
        deltaZ -= planeDistance * a.modelNormalZ;
        float firstRadius = (float) Math.sqrt(a.area / Math.PI);
        float secondRadius = (float) Math.sqrt(b.area / Math.PI);
        float reach = (firstRadius + secondRadius) * 1.25F;
        return deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ <= reach * reach;
    }

    static int primePhase(String partName) {
        String lower = partName == null ? "" : partName.toLowerCase(Locale.ROOT);
        for (int phase = 1; phase <= 4; phase++) {
            if (lower.contains("prime" + phase)) {
                return phase;
            }
        }
        return 0;
    }

    static void clear() {
        CACHE.clear();
    }

    private static final class PrimeCandidate {
        final ModelRendererTurbo part;
        final String stableId;
        final int phase;
        final DetectedLightFace top;

        PrimeCandidate(
                ModelRendererTurbo part, String stableId,
                int phase, DetectedLightFace top) {
            this.part = part;
            this.stableId = stableId;
            this.phase = phase;
            this.top = top;
        }
    }
}
