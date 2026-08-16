package tmt;

/** Standard six-face TMT polygon directions in part-local coordinates. */
public enum LightSourceFaceDirection
{
    POSITIVE_X(0),
    NEGATIVE_X(1),
    NEGATIVE_Y(2),
    POSITIVE_Y(3),
    NEGATIVE_Z(4),
    POSITIVE_Z(5);

    private final int faceIndex;

    LightSourceFaceDirection(int faceIndex)
    {
        this.faceIndex = faceIndex;
    }

    public int faceIndex()
    {
        return faceIndex;
    }
}
