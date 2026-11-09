package train.client.gui;

import java.awt.Rectangle;
import java.nio.ByteBuffer;

/**
 * Immutable scale and centering for one livery, derived from its visible pixels.
 * Horizontal centers use model X/Z units; the vertical center uses projected,
 * downward-positive GUI units before the final scale is applied.
 */
public final class RollingStockPreviewFit
{
    private final float scale;
    private final double centerModelX;
    private final double centerModelZ;
    private final double centerProjectedY;
    private final double maximumLoweringPixels;

    private RollingStockPreviewFit(float scale, double centerModelX, double centerModelZ,
            double centerProjectedY, double maximumLoweringPixels)
    {
        this.scale = scale;
        this.centerModelX = centerModelX;
        this.centerModelZ = centerModelZ;
        this.centerProjectedY = centerProjectedY;
        this.maximumLoweringPixels = maximumLoweringPixels;
    }

    /**
     * Returns the supplied scale without automatic centering or a measured limit on downward placement.
     *
     * @param scale GUI pixels per model unit
     * @throws IllegalArgumentException if a programmer supplies a non-positive or non-finite scale
     */
    public static RollingStockPreviewFit fallback(float scale)
    {
        if ((Float.isFinite(scale) == false) || scale <= 0)
        {
            throw new IllegalArgumentException("Fallback preview scale must be positive and finite");
        }
        return new RollingStockPreviewFit(scale, 0, 0, 0, Double.POSITIVE_INFINITY);
    }

    /**
     * Fits a complete turn inside a GUI rectangle with equal padding on every side.
     * The four non-null bounds must be ordered by yaw: 0, 90, 180, and 270 degrees.
     * They use top-left pixel coordinates from a square capture at a positive scale.
     * Opposite views are reflected into the same coordinate space, then combined.
     * The diagonal of the horizontal bounds contains every intermediate yaw, so
     * animation can retain one scale. Tilting around the GUI X axis can bring the
     * horizontal extent into the screen height, so the fit reserves its largest
     * projection up to the supplied tilt limit. Inputs are never retained.
     *
     * @param captureSizePixels width and height of the square capture
     * @param captureScale pixels per model unit used by the capture
     * @param previewWidthPixels selection box width in scaled GUI pixels
     * @param previewHeightPixels selection box height in scaled GUI pixels
     * @param paddingPixels empty space reserved inside each selection box edge
     * @param maximumTiltDegrees largest absolute animated X-axis tilt, from 0 through 90 degrees
     * @throws IllegalArgumentException for malformed capture bounds, invalid panel dimensions,
     *         or a capture scale that cannot produce a positive finite fit; callers must validate
     *         optional or empty captures before invoking this calculation
     */
    public static RollingStockPreviewFit fromViews(Rectangle[] views, int captureSizePixels, float captureScale,
            int previewWidthPixels, int previewHeightPixels, int paddingPixels, float maximumTiltDegrees)
    {
        if (views == null || views.length != 4 || captureSizePixels <= 0
                || (Float.isFinite(captureScale) == false) || captureScale <= 0
                || (Float.isFinite(maximumTiltDegrees) == false)
                || maximumTiltDegrees < 0 || maximumTiltDegrees > 90)
        {
            throw new IllegalArgumentException("Preview fitting requires four views and valid capture parameters");
        }
        double availableWidthPixels = previewWidthPixels - paddingPixels * 2.0;
        double availableHeightPixels = previewHeightPixels - paddingPixels * 2.0;
        if (paddingPixels < 0 || availableWidthPixels <= 0 || availableHeightPixels <= 0)
        {
            throw new IllegalArgumentException("Preview padding must leave a positive drawing area");
        }
        for (Rectangle view : views)
        {
            if (view == null || view.width <= 0 || view.height <= 0 || view.x < 0 || view.y < 0
                    || (long) view.x + view.width > captureSizePixels
                    || (long) view.y + view.height > captureSizePixels)
            {
                throw new IllegalArgumentException(
                        "Each preview view must have visible bounds inside its capture");
            }
        }
        Rectangle oppositeLengthBounds = mirrorX(views[2], captureSizePixels);
        Rectangle oppositeDepthBounds = mirrorX(views[3], captureSizePixels);
        Rectangle lengthBounds = views[0].union(oppositeLengthBounds);
        Rectangle depthBounds = views[1].union(oppositeDepthBounds);
        Rectangle verticalBounds = lengthBounds.union(depthBounds);

        // Allow for capture rasterization error when small models are enlarged.
        final int rasterAllowancePixels = 2;
        double turnDiameterPixels = Math.hypot(lengthBounds.width + (double) rasterAllowancePixels,
                depthBounds.width + (double) rasterAllowancePixels);
        double horizontalFitRatio = availableWidthPixels / turnDiameterPixels;
        double measuredHeightPixels = verticalBounds.height + (double) rasterAllowancePixels;
        double maximumTiltRadians = Math.toRadians(maximumTiltDegrees);
        double peakHeightTiltRadians = Math.min(maximumTiltRadians,
                Math.atan2(turnDiameterPixels, measuredHeightPixels));
        double heightEnvelopePixels = measuredHeightPixels * Math.cos(peakHeightTiltRadians)
                + turnDiameterPixels * Math.sin(peakHeightTiltRadians);
        double verticalFitRatio = availableHeightPixels / heightEnvelopePixels;
        double fitRatio = Math.min(horizontalFitRatio, verticalFitRatio);
        float fittedScale = (float) (captureScale * fitRatio);
        if ((Float.isFinite(fittedScale) == false) || fittedScale <= 0)
        {
            throw new IllegalArgumentException("Capture scale cannot produce a positive finite preview fit");
        }
        double captureCenterPixels = captureSizePixels * 0.5;
        double centerModelX = (lengthBounds.getCenterX() - captureCenterPixels) / captureScale;
        double centerModelZ = (depthBounds.getCenterX() - captureCenterPixels) / captureScale;
        double centerProjectedY = (verticalBounds.getCenterY() - captureCenterPixels) / captureScale;
        double occupiedDiameterPixels = Math.hypot(lengthBounds.width, depthBounds.width);
        double peakOccupiedTiltRadians = Math.min(maximumTiltRadians,
                Math.atan2(occupiedDiameterPixels, verticalBounds.height));
        double occupiedHeightEnvelopePixels = verticalBounds.height * Math.cos(peakOccupiedTiltRadians)
                + occupiedDiameterPixels * Math.sin(peakOccupiedTiltRadians);
        double fittedHeightPixels = occupiedHeightEnvelopePixels * fittedScale / captureScale;
        double maximumLoweringPixels = Math.max(0, (availableHeightPixels - fittedHeightPixels) * 0.5);
        return new RollingStockPreviewFit(fittedScale, centerModelX, centerModelZ,
                centerProjectedY, maximumLoweringPixels);
    }

    /** Returns the GUI pixels drawn per model unit. */
    public float getScale()
    {
        return scale;
    }

    /** Returns the GUI X translation that keeps the measured model center fixed as yaw rotates in degrees. */
    public float getHorizontalOffsetPixels(float yawDegrees)
    {
        double angleRadians = Math.toRadians(yawDegrees);
        double projectedCenterX = centerModelX * Math.cos(angleRadians) + centerModelZ * Math.sin(angleRadians);
        return (float) (-scale * projectedCenterX);
    }

    /**
     * Centers the model's yawed and tilted bounds, then applies a downward bias in scaled GUI pixels.
     * Angles are degrees in the same yaw/tilt order used by the GUI renderer.
     * The bias is limited to the spare space below the fitted model, preserving bottom
     * padding without changing its scale. A zero or negative request keeps centered placement.
     * An unmeasured fallback applies the bias directly because its visible height is unknown.
     */
    public float getVerticalOffsetPixels(float yawDegrees, float tiltDegrees, float requestedLoweringPixels)
    {
        double loweringPixels = Math.max(0, Math.min(requestedLoweringPixels, maximumLoweringPixels));
        double yawRadians = Math.toRadians(yawDegrees);
        double tiltRadians = Math.toRadians(tiltDegrees);
        double rotatedCenterZ = -centerModelX * Math.sin(yawRadians) + centerModelZ * Math.cos(yawRadians);
        double projectedCenterY = centerProjectedY * Math.cos(tiltRadians)
                + rotatedCenterZ * Math.sin(tiltRadians);
        return (float) (-scale * projectedCenterY + loweringPixels);
    }

    /** Reflects an opposite view horizontally around the square capture's center. */
    private static Rectangle mirrorX(Rectangle bounds, int captureSizePixels)
    {
        int mirroredLeftPixels = captureSizePixels - bounds.x - bounds.width;
        return new Rectangle(mirroredLeftPixels, bounds.y, bounds.width, bounds.height);
    }

    /**
     * Finds visible pixels in an RGBA byte readback without changing the buffer position.
     * OpenGL rows start at the bottom; returned bounds use the GUI's top-left origin.
     * Returns null for an absent image, non-positive dimensions, or fully transparent pixels.
     * Reads from buffer index zero without retaining the buffer or changing its position.
     *
     * @throws IllegalArgumentException if the declared image exceeds the buffer's readable bytes
     */
    public static Rectangle visibleBounds(ByteBuffer rgbaPixels, int widthPixels, int heightPixels)
    {
        final int channelsPerPixel = 4;
        final int alphaChannelOffset = 3;
        final int unsignedByteMask = 255;
        final int visibleAlphaThreshold = 8;
        if (rgbaPixels == null || widthPixels <= 0 || heightPixels <= 0)
        {
            return null;
        }
        long requiredPixels = (long) widthPixels * heightPixels;
        int readablePixels = rgbaPixels.limit() / channelsPerPixel;
        if (requiredPixels > readablePixels)
        {
            throw new IllegalArgumentException("RGBA preview buffer is shorter than its declared image");
        }
        int minX = widthPixels;
        int minY = heightPixels;
        int maxX = -1;
        int maxY = -1;
        for (int pixelY = 0; pixelY < heightPixels; pixelY++)
        {
            for (int pixelX = 0; pixelX < widthPixels; pixelX++)
            {
                int alphaOffset = (pixelX + pixelY * widthPixels) * channelsPerPixel + alphaChannelOffset;
                int alpha = rgbaPixels.get(alphaOffset) & unsignedByteMask;
                if (alpha > visibleAlphaThreshold)
                {
                    int guiPixelY = heightPixels - pixelY - 1;
                    minX = Math.min(minX, pixelX);
                    maxX = Math.max(maxX, pixelX);
                    minY = Math.min(minY, guiPixelY);
                    maxY = Math.max(maxY, guiPixelY);
                }
            }
        }
        if (maxX < minX)
        {
            return null;
        }
        return new Rectangle(minX, minY, maxX - minX + 1, maxY - minY + 1);
    }

    /** Returns false for absent or malformed bounds, or bounds close enough to an edge to indicate clipping. */
    public static boolean isComplete(Rectangle bounds, int captureSizePixels)
    {
        final int edgePaddingPixels = 1;
        return captureSizePixels > edgePaddingPixels * 2
                && bounds != null && bounds.width > 0 && bounds.height > 0
                && bounds.x > edgePaddingPixels && bounds.y > edgePaddingPixels
                && (long) bounds.x + bounds.width < captureSizePixels - edgePaddingPixels
                && (long) bounds.y + bounds.height < captureSizePixels - edgePaddingPixels;
    }
}
