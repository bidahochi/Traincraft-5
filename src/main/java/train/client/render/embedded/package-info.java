/**
 * Reconstructs terrain surfaces hidden by true-embedded and host-mounted track blocks.
 *
 * <h2>Render pipeline</h2>
 * <ol>
 *     <li>{@link train.client.render.embedded.EmbeddedTrackHostSurfaceRenderer} is the primary external entry point for
 *     rail-host surfaces and previews. The switch-stand renderer shares captured-block/render-state adapters, and route
 *     caching consults the embedded slope policy directly.</li>
 *     <li>{@code EmbeddedHostRenderController} resolves the visible owner, validates its cache, and chooses direct or
 *     display-list rendering.</li>
 *     <li>The captured-host, slope, and switch builders append faces to one {@code EmbeddedHostMesh}. Builders must not
 *     issue OpenGL calls or retain world-owned tile entities.</li>
 *     <li>{@code EmbeddedHostLightingPreparer} attaches refreshable tint, light, and ambient-occlusion values without
 *     changing geometry or face order.</li>
 *     <li>{@code EmbeddedHostFaceEmitter} emits prepared faces through {@code EmbeddedHostRenderState}, which restores
 *     every OpenGL state value it changes.</li>
 * </ol>
 *
 * <h2>Coordinate and cache contracts</h2>
 * <p>Captured-host offsets are relative to the visible render owner. Face vertices remain local to their captured host
 * cell and are translated by that offset during emission. Geometry builders must preserve outward face winding,
 * texture-side selection, and insertion order because all three affect culling, UV projection, and visual seams.</p>
 *
 * <p>Cached mesh geometry is immutable after construction. Only prepared appearance fields on
 * {@code EmbeddedHostFace} may be refreshed in place. A geometry change requires a new mesh and display list; a light,
 * tint, or ambient-occlusion change reuses the mesh and replaces only its prepared appearance and display list.</p>
 *
 * <h2>Debugging guide</h2>
 * <ul>
 *     <li>Incorrect ordinary host faces: inspect {@code EmbeddedCapturedHostMeshBuilder}.</li>
 *     <li>Incorrect slope height, landing, or warp: inspect {@code EmbeddedSlopeHostMeshBuilder}.</li>
 *     <li>Incorrect switch trenches: inspect {@code EmbeddedSwitchHostMeshBuilder} and
 *     {@code EmbeddedSwitchTerrainProfiles}.</li>
 *     <li>Angle-dependent darkness or stale light: inspect {@code EmbeddedHostLightingPreparer} and
 *     {@code EmbeddedHostLighting}.</li>
 *     <li>Stale geometry or display lists: inspect {@code EmbeddedHostRenderController}.</li>
 *     <li>Placement-only differences: inspect {@code EmbeddedHostPreviewRenderer}.</li>
 * </ul>
 */
package train.client.render.embedded;
