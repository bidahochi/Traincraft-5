package tmt;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import java.util.ArrayList;

public class CylinderBuilder implements CustomUVBuilder {

    public static final float PI = 3.14159265358979323846f;

    private final ModelRendererTurbo root;
    private float x, y, z, radius, radius2, radius3, radius4, length;
    private float base_scale = 1, top_scale = 1, segOff;
    private int segments, segLimit, direction;
    private Vec3f topOff = new Vec3f();
    private final boolean[] invisible = new boolean[6];
    private final float[][] uv = new float[6][];
    private final boolean[] detached = new boolean[6];
    private final Axis3DL topRot = new Axis3DL();
    //
    private boolean radialtexture = false;
    private float seg_width, seg_height;


    public CylinderBuilder(ModelRendererTurbo root){
        this.root = root == null ? new ModelRendererTurbo(null) : root;
    }

    public CylinderBuilder setPosition(float x, float y, float z){
        this.x = x; this.y = y; this.z = z; return this;
    }

    public CylinderBuilder setRadius(float first, float second){
        this.radius = first; this.radius2 = second;
        return this;
    }

    public CylinderBuilder setRadius(float first_s, float first_c, float second_s, float second_c){
        this.radius = first_s;
        this.radius2 = second_s;
        this.radius3 = first_c;
        this.radius4 = second_c;
        return this;
    }

    public CylinderBuilder setLength(float length){
        this.length = length;
        return this;
    }

    public CylinderBuilder setTopOffset(float x, float y, float z){
        topOff = new Vec3f(x, y, z); return this;
    }

    public CylinderBuilder setTopOffset(Vec3f vec){
        topOff = vec; return this;
    }

    @Deprecated
    public CylinderBuilder setSidesVisible(boolean[] arr){
        return removePolygons(arr);
    }

    @Deprecated
    public CylinderBuilder setSidesVisible(boolean base, boolean top, boolean outer, boolean inner){
        return removePolygons(base, top, outer, inner);
    }

    public CylinderBuilder removePolygon(int index){
        if(index < 0 || index > 5) return this;
        invisible[index] = true;
        return this;
    }

    public CylinderBuilder removePolygons(int... poly_indices){
        for(int index : poly_indices){
            if(index < 0 || index > 5) continue;
            invisible[index] = true;
        }
        return this;
    }

    public CylinderBuilder removePolygons(boolean... sides){
        for(int index = 0; index < 6; index++){
            if(sides.length >= (index + 1) && sides[index]) invisible[index] = true;
        }
        return this;
    }

    public CylinderBuilder setPolygonUV(int poly_index, float[] uv){
        if(poly_index < 0 || poly_index > 5) return this;
        this.uv[poly_index] = uv;
        return this;
    }

    public CylinderBuilder setPolygonUVs(int[] poly_indices, float[][] uvs){
        for(int i = 0; i < poly_indices.length; i++){
            if(poly_indices[i] < 0 || poly_indices[i] > 5) continue;
            setPolygonUV(poly_indices[i], uvs[i]);
        }
        return this;
    }

    public CylinderBuilder setPolygonUVs(float[][] uvs){
        for(int index = 0; index < 6; index++){
            if(index >= uvs.length) break;
            setPolygonUV(index, uvs[index]);
        }
        return this;
    }

    public CylinderBuilder setDetachedUV(int... indices){
        for(int index : indices){
            if(index < 0 || index > 5) continue;
            detached[index] = true;
        }
        return this;
    }

    public CylinderBuilder setDetachedUV(boolean... bools){
        for(int index = 0; index < 6; index++){
            if(index >= bools.length) break;
            setDetachedUV(index);
        }
        return this;
    }

    private boolean detached(int i){
        return invisible[i] || detached[i];
    }

    /** Currently no support for hollow-less cylinders to be segmented. */
    public CylinderBuilder setSegments(int amount, int limit){
        this.segments = amount;
        this.segLimit = limit;
        return this;
    }

    public CylinderBuilder setSegments(int amount, int limit, float off){
        this.segments = amount;
        this.segLimit = limit;
        this.segOff = off;
        return this;
    }

    public CylinderBuilder setSegmentOffset(float off){
        this.segOff = off;
        return this;
    }

    public CylinderBuilder setScale(float base, float top){
        this.base_scale = base;
        this.top_scale = top;
        return this;
    }

    /** Currently no support for hollow-less cylinders to be radial-textured. */
    public CylinderBuilder setRadialTexture(float seg_width, float seg_height){
        if(seg_width <= 0 || seg_height <= 0) return this;
        radialtexture = true;
        this.seg_width = seg_width;
        this.seg_height = seg_height;
        return this;
    }

    public CylinderBuilder setDirection(int dir){
        this.direction = dir; return this;
    }

    public CylinderBuilder setTopRotation(float x, float y, float z){
        topRot.setAngles(x, y, z); return this;
    }

    public CylinderBuilder setTopRotation(Vec3f vec){
        return setTopRotation(vec.xCoord, vec.yCoord, vec.zCoord);
    }

    public ModelRendererTurbo build(){
        if(radius3 == 0f) radius3 = radius;
        if(radius4 == 0f) radius4 = radius2;
        if(segments < 3) segments = 3;
        if(segLimit <= 0) segLimit = segments;
        boolean segl = segLimit < segments;
        if(radius2 == 0f && topRot == null && !segl && radius3 == radius){
            return root.addCylinder(x, y, z, radius, length, segments, base_scale, top_scale, direction, (int)Math.floor(radius * 2F), (int)Math.floor(radius * 2F), (int)Math.floor(length), topOff);
        }
        float diameter = (int)Math.floor(radius * 2F);
        float texheight = (int)Math.floor(length);
        if(radius < 1){
            int rad = radius < 0.5 ? 1 : 2;
            if(diameter < rad) diameter = rad;
        }
        if(length < 1) texheight = 1;
        else if(length % 1 != 0){
            texheight = (int)length + (length % 1 > 0.5f ? 1 : 0);
        }
        //
        boolean dirTop = (direction == ModelRendererTurbo.MR_TOP || direction == ModelRendererTurbo.MR_BOTTOM);
        boolean dirSide = (direction == ModelRendererTurbo.MR_RIGHT || direction == ModelRendererTurbo.MR_LEFT);
        boolean dirFront = (direction == ModelRendererTurbo.MR_FRONT || direction == ModelRendererTurbo.MR_BACK);
        boolean dirMirror = (direction == ModelRendererTurbo.MR_LEFT || direction == ModelRendererTurbo.MR_BOTTOM || direction == ModelRendererTurbo.MR_BACK);
        if(base_scale == 0) base_scale = 1f;
        if(top_scale == 0){
            //top_scale = 1f;
            invisible[1] = true;
        }
        ArrayList<TexturedPolygon> polis = new ArrayList<>();
        //Vertex
        float xLength = (dirSide ? length : 0), yLength = (dirTop ? length : 0), zLength = (dirFront ? length : 0);
        float xStart = (dirMirror ? x + xLength : x);
        float yStart = (dirMirror ? y + yLength : y);
        float zStart = (dirMirror ? z + zLength : z);
        float xEnd = (!dirMirror ? x + xLength : x) + (topOff == null ? 0 : topOff.xCoord);
        float yEnd = (!dirMirror ? y + yLength : y) + (topOff == null ? 0 : topOff.yCoord);
        float zEnd = (!dirMirror ? z + zLength : z) + (topOff == null ? 0 : topOff.zCoord);
        float xCur = xStart, yCur = yStart, zCur = zStart, sCur = base_scale;
        //Texture
        float[][] uvs = new float[6][];
        float uScale = 1.0F / root.textureWidth, vScale = 1.0F / root.textureHeight;
        float uCircle = diameter * uScale;
        float vCircle = diameter * vScale;
        float uCircle2 = ((int)Math.floor(radius2 * 2F)) * uScale;
        float vCircle2 = ((int)Math.floor(radius2 * 2F)) * vScale;
        float vHeight = texheight * vScale;
        float uSeg = radius - radius2;
        if(uSeg < 1) uSeg = 1;
        else if(uSeg % 1 != 0){
            uSeg = (int)uSeg + (uSeg % 1 > 0.5f ? 1 : 0);
        }
        uSeg *= uScale;
        {
            float x = root.textureOffsetX * uScale, y = root.textureOffsetY * vScale;
            uvs[0] = new float[]{ x, y };
            uvs[1] = new float[]{ x + (detached(0) || radialtexture ? 0 : uCircle), y + (radialtexture && !detached(0) ? seg_height : 0) };
            float cirhi = detached(0) && detached(1) ? 0 : radialtexture ? (seg_height * (detached(0) || detached(1) ? 1 : 2)) * vScale : vCircle;
            float cirwi = detached(2) && detached(3) ? 0 : uCircle + uCircle;
            uvs[2] = new float[]{ x, y + cirhi };
            uvs[3] = new float[]{ x, y + cirhi + (detached(2) ? 0 : vHeight) };
            uvs[4] = new float[]{ x + cirwi, y + cirhi, };
            uvs[5] = new float[]{ x + cirwi + (detached(2) || detached(3) ? uSeg : 0), y + cirhi + (detached(2) || detached(3) ? 0 : vHeight) };
            for(int i = 0; i < uv.length; i++){
                if(invisible[i]) continue;
                if(uv[i] == null || uv[i].length != 2) continue;
                uvs[i][0] = uv[i][0] * uScale;
                uvs[i][1] = uv[i][1] * vScale;
                if(!detached[i]){
                    uvs[i][0] += x;
                    uvs[i][1] += y;
                }
            }
        }
        float uWidth = (uCircle * 2F) / segments;
        float segpi = PI / segments;
        //Temporary Arrays
        ArrayList<TexturedVertex> verts0 = new ArrayList<>();
        ArrayList<TexturedVertex> verts1 = new ArrayList<>();
        ArrayList<TexturedVertex> verts2 = new ArrayList<>();
        ArrayList<TexturedVertex> verts3 = new ArrayList<>();
        for(int repeat = 0; repeat < 2; repeat++){//top/base faces
            for(int index = 0; index < segments; index++){
                float xSize = (float)((root.mirror ^ dirMirror ? -1 : 1) * Math.sin((segpi) * index * 2F + PI + segOff) * radius * sCur);
                float zSize = (float)(-Math.cos((segpi) * index * 2F + PI + segOff) * radius3 * sCur);
                float xPlace = xCur + (!dirSide ? xSize : 0);
                float yPlace = yCur + (!dirTop ? zSize : 0);
                float zPlace = zCur + (dirSide ? xSize : (dirTop ? zSize : 0));
                verts0.add(new TexturedVertex(xPlace, yPlace, zPlace, 0, 0));
                if(index == segments - 1){
                    TexturedVertex copy = new TexturedVertex(verts0.get(0)); verts0.add(copy);
                }
                //
                float xSize2 = (float)((root.mirror ^ dirMirror ? -1 : 1) * Math.sin((segpi) * index * 2F + PI + segOff) * radius2 * sCur);
                float zSize2 = (float)(-Math.cos((segpi) * index * 2F + PI + segOff) * radius4 * sCur);
                xPlace = xCur + (!dirSide ? xSize2 : 0);
                yPlace = yCur + (!dirTop ? zSize2 : 0);
                zPlace = zCur + (dirSide ? xSize2 : (dirTop ? zSize2 : 0));
                verts1.add(new TexturedVertex(xPlace, yPlace, zPlace, 0, 0));
                if(index == segments - 1){
                    TexturedVertex copy = new TexturedVertex(verts1.get(0)); verts1.add(copy);
                }
            }
            if(repeat == 0){
                verts2.addAll(verts0);
                verts2.addAll(verts1);
            }
            else{
                verts3.addAll(verts0);
                verts3.addAll(verts1);
            }
            double xSize, ySize;
            boolean bool = repeat == 0 ? dirFront ? false : true : dirFront ? true : false;
            if(!invisible[repeat]){
                for(int i = 0; i < verts0.size(); i++){
                    if(i >= (verts0.size() - 1) || i >= segLimit){
                        if(repeat != 0 && topRot != null){
                            verts0.get(i).vector3F = topRot.getRelativeVector(verts0.get(i).vector3F);
                            verts1.get(i).vector3F = topRot.getRelativeVector(verts1.get(i).vector3F);
                        }
                        break;
                    }
                    TexturedVertex[] arr = new TexturedVertex[4];
                    if(!radialtexture){
                        xSize = Math.sin((segpi) * i * 2F + (!dirTop ? 0 : PI)) * (0.5F * uCircle);
                        ySize = Math.cos((segpi) * i * 2F + (!dirTop ? 0 : PI)) * (0.5F * vCircle);
                        arr[0] = verts0.get(i).setTexturePosition((float) (uvs[repeat][0] + .5f * uCircle + xSize), (float) (uvs[repeat][1] + 0.5F * vCircle + ySize));
                        //
                        xSize = Math.sin((segpi) * i * 2F + (!dirTop ? 0 : PI)) * (0.5F * uCircle2);
                        ySize = Math.cos((segpi) * i * 2F + (!dirTop ? 0 : PI)) * (0.5F * vCircle2);
                        arr[1] = verts1.get(i).setTexturePosition((float) (uvs[repeat][0] + .5f * uCircle + xSize), (float) (uvs[repeat][1] + 0.5F * vCircle + ySize));
                        //
                        xSize = Math.sin((segpi) * (i + 1) * 2F + (!dirTop ? 0 : PI)) * (0.5F * uCircle2);
                        ySize = Math.cos((segpi) * (i + 1) * 2F + (!dirTop ? 0 : PI)) * (0.5F * vCircle2);
                        arr[2] = verts1.get(i + 1).setTexturePosition((float) (uvs[repeat][0] + .5f * uCircle + xSize), (float) (uvs[repeat][1] + 0.5F * vCircle + ySize));
                        //
                        xSize = Math.sin((segpi) * (i + 1) * 2F + (!dirTop ? 0 : PI)) * (0.5F * uCircle);
                        ySize = Math.cos((segpi) * (i + 1) * 2F + (!dirTop ? 0 : PI)) * (0.5F * vCircle);
                        arr[3] = verts0.get(i + 1).setTexturePosition((float) (uvs[repeat][0] + .5f * uCircle + xSize), (float) (uvs[repeat][1] + 0.5F * vCircle + ySize));
                    }
                    else{
                        float diff = uSeg / 4;
                        arr[0] = verts0.get(i).setTexturePosition(uvs[repeat][0] + (i * seg_width) * uScale, uvs[repeat][1]);
                        arr[1] = verts1.get(i).setTexturePosition(uvs[repeat][0] + (i * seg_width) * uScale + diff, uvs[repeat][1] + (seg_height * vScale));
                        arr[2] = verts1.get(i + 1).setTexturePosition(uvs[repeat][0] + ((i + 1) * seg_width) * uScale - diff, uvs[repeat][1] + (seg_height * vScale));
                        arr[3] = verts0.get(i + 1).setTexturePosition(uvs[repeat][0] + ((i + 1) * seg_width) * uScale, uvs[repeat][1]);
                    }
                    if(repeat != 0 && topRot != null){
                        arr[0].vector3F = verts0.get(i).vector3F = topRot.getRelativeVector(arr[0].vector3F);
                        arr[1].vector3F = verts1.get(i).vector3F = topRot.getRelativeVector(arr[1].vector3F);
                        arr[2].vector3F = /*verts1.get(i + 1).vector =*/ topRot.getRelativeVector(arr[2].vector3F);
                        arr[3].vector3F = /*verts0.get(i + 1).vector =*/ topRot.getRelativeVector(arr[3].vector3F);
                    }
                    polis.add(new TexturedPolygon(arr));
                    if(bool) polis.get(polis.size() - 1).flipFace();
                }
            }
            verts0.clear(); verts1.clear(); xCur = xEnd; yCur = yEnd; zCur = zEnd; sCur = top_scale;
        }
        int halfv2 = verts2.size() / 2;
        for(int i = 0; i < halfv2; i++){
            if(i >= segLimit && segl){
                if(!invisible[4]){
                    TexturedVertex[] arr = new TexturedVertex[4];
                    arr[0] = verts2.get(0).setTexturePosition(uvs[4][0], uvs[4][1]);
                    arr[1] = verts3.get(0).setTexturePosition(uvs[4][0], uvs[4][1] + vHeight);
                    arr[2] = verts3.get(halfv2).setTexturePosition(uvs[4][0] + uSeg, uvs[4][1] + vHeight);
                    arr[3] = verts2.get(halfv2).setTexturePosition(uvs[4][0] + uSeg, uvs[4][1]);
                    polis.add(new TexturedPolygon(arr));
                    if(!dirFront) polis.get(polis.size() - 1).flipFace();
                }
                if(!invisible[5]){
                    TexturedVertex[] arr = new TexturedVertex[4];
                    arr[0] = verts2.get(segLimit).setTexturePosition(uvs[5][0], uvs[5][1]);
                    arr[1] = verts3.get(segLimit).setTexturePosition(uvs[5][0], uvs[5][1] + vHeight);
                    arr[2] = verts3.get(segLimit + halfv2).setTexturePosition(uvs[5][0] + uSeg, uvs[5][1] + vHeight);
                    arr[3] = verts2.get(segLimit + halfv2).setTexturePosition(uvs[5][0] + uSeg, uvs[5][1]);
                    polis.add(new TexturedPolygon(arr));
                    if(dirFront) polis.get(polis.size() - 1).flipFace();
                }
                break;
            }
            if(i >= (halfv2 - 1)) break;
            TexturedVertex[] arr = new TexturedVertex[4];
            if(!invisible[2]){
                arr[0] = verts2.get(i + 0).setTexturePosition(uvs[2][0] + uWidth * (i + 0), uvs[2][1]);
                arr[1] = verts3.get(i + 0).setTexturePosition(uvs[2][0] + uWidth * (i + 0), uvs[2][1] + vHeight);
                arr[2] = verts3.get(i + 1).setTexturePosition(uvs[2][0] + uWidth * (i + 1), uvs[2][1] + vHeight);
                arr[3] = verts2.get(i + 1).setTexturePosition(uvs[2][0] + uWidth * (i + 1), uvs[2][1]);
                polis.add(new TexturedPolygon(arr));
                if(dirFront) polis.get(polis.size() - 1).flipFace();
            }
            if(!invisible[3]){
                arr = new TexturedVertex[4];
                arr[0] = verts2.get(i + halfv2 + 0).setTexturePosition(uvs[3][0] + uWidth * (i + 0), uvs[3][1]);
                arr[1] = verts3.get(i + halfv2 + 0).setTexturePosition(uvs[3][0] + uWidth * (i + 0), uvs[3][1] + vHeight);
                arr[2] = verts3.get(i + halfv2 + 1).setTexturePosition(uvs[3][0] + uWidth * (i + 1), uvs[3][1] + vHeight);
                arr[3] = verts2.get(i + halfv2 + 1).setTexturePosition(uvs[3][0] + uWidth * (i + 1), uvs[3][1]);
                polis.add(new TexturedPolygon(arr));
                if(!dirFront) polis.get(polis.size() - 1).flipFace();
            }
        }
        return root.copyTo(polis);
    }

    public ModelRendererTurbo getRoot(){
        return root;
    }



    public static class Axis3DL {

        private Matrix4f matrix;
        private float yaw, pitch, roll;

        public Axis3DL(){ matrix = new Matrix4f(); }

        @Override public String toString(){ return "[ " + yaw + "y, " + pitch + "p, " + roll + "r ]";  }

        public Vec3f getRelativeVector(Vec3f vec){
            Matrix4f mat = new Matrix4f();
            mat.m00=(vec.xCoord); mat.m10=(vec.yCoord); mat.m20=(vec.zCoord);
            mat.rotate(roll  * 3.14159265F / 180f, new Vector3f(1F, 0F, 0F), mat);
            mat.rotate(pitch * 3.14159265F / 180f, new Vector3f(0F, 0F, 1F), mat);
            mat.rotate(yaw   * 3.14159265F / 180f, new Vector3f(0F, 1F, 0F), mat);
            return new Vec3f(mat.m00, mat.m10, mat.m20);
        }

        private final void convertMatrixToAngles(){
            yaw = (float)(Math.atan2(matrix.m20, matrix.m00) * 180F / 3.14159265F);
            pitch = (float)(Math.atan2(-matrix.m10, Math.sqrt(matrix.m12 * matrix.m12 + matrix.m11 * matrix.m11)) * 180F / 3.14159265F);
            roll = (float)(Math.atan2(matrix.m12, matrix.m11) * 180F / 3.14159265F);
        }

        private final void convertToMatrix(boolean rad){
            matrix = new Matrix4f();
            matrix.rotate((rad ? roll : roll * 3.14159265F / 180F), new Vector3f(1F, 0F, 0F));
            matrix.rotate((rad ? pitch : pitch * 3.14159265F / 180F), new Vector3f(0F, 0F, 1F));
            matrix.rotate((rad ? yaw : yaw * 3.14159265F / 180F), new Vector3f(0F, 1F, 0F));
            convertMatrixToAngles();
        }

        public void setAngles(float yaw, float pitch, float roll){
            this.yaw = yaw; this.pitch = pitch; this.roll = roll; convertToMatrix(false);
        }

    }
}
