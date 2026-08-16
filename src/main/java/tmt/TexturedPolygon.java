package tmt;

import java.util.ArrayList;
import org.lwjgl.opengl.GL11;


public class TexturedPolygon {

    private float[] normals;
    private ArrayList<Vec3f> iNormals;
	public TexturedVertex[] vertices;
	
	public TexturedPolygon(TexturedVertex[] vertices){
		normals = new float[0];
		iNormals = new ArrayList<Vec3f>();
        this.
		vertices = vertices;
    }

	
	public void setNormals(float x, float y, float z){
		normals = new float[] {x, y, z};
	}
	
	public void setNormals(ArrayList<Vec3f> individualNormals){
		iNormals = individualNormals;
	}

	Vec3f getLegacyFaceNormal(){
		if(normals.length == 3){
			return new Vec3f(normals[0], normals[1], normals[2]);
		}
			return TurboFaceNormal.resolve(vertices);
	}

	public void draw(Tessellator tessellator, float scale){
        Vec3f faceNormal = null;
        if (iNormals.isEmpty())
        {
            faceNormal = getLegacyFaceNormal();
            if (faceNormal == null)
            {
                return;
            }
        }
        if(vertices.length == 3){
        	tessellator.startDrawing(GL11.GL_TRIANGLES);
        }
        else
        { if (vertices.length == 4){
        	tessellator.startDrawing(GL11.GL_QUADS);
        }
        else{
        	tessellator.startDrawing(GL11.GL_POLYGON);
        }
	        } if(faceNormal != null){
		        tessellator.setNormal(faceNormal.xCoord, faceNormal.yCoord, faceNormal.zCoord);
        }
        for(int index = 0; index < vertices.length; index++){
            TexturedVertex vertex = vertices[index];
            if(index < iNormals.size()){
                Vec3f normal = iNormals.get(index);
                tessellator.setNormal(normal.xCoord, normal.yCoord, normal.zCoord);
            }
            tessellator.addVertexWithUV(
                vertex.vector3F.xCoord * scale,
                vertex.vector3F.yCoord * scale,
                vertex.vector3F.zCoord * scale,
                vertex.textureX,
                vertex.textureY);
        }
        tessellator.draw();
    }


	public void flipFace() {
		TexturedVertex[] reversed = new TexturedVertex[vertices.length];

		for (int index = 0; index <vertices.length; index ++) {
            reversed[index] =vertices[vertices.length - index - 1];
		}vertices = reversed;
	}
	
}
