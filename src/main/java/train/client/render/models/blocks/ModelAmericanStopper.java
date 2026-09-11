/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.RenderTCRail;
import train.common.library.track.EnumTracks;
import train.common.library.Info;
import train.common.track.attachment.legacy.TrackBufferOrientation;
import train.client.render.ITrackAttachmentModelRenderer;
import train.client.render.TrackAttachmentRenderContext;

public class ModelAmericanStopper implements ITrackAttachmentModelRenderer
{
    private static final float[] HARDWARE_ROTATION_DEGREES =
            {90.0F, 0.0F, 270.0F, 180.0F, 135.0F, 45.0F, -45.0F, -135.0F};
    private static int listAmericanBumperPiece = -1;

    public ModelAmericanStopper()
    {
        if (listAmericanBumperPiece < 0) {

            listAmericanBumperPiece = GL11.glGenLists(1);
            IModelCustom track = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(
                    new ResourceLocation(Info.modelPrefix + "american_bumper.obj"));
            GL11.glNewList(listAmericanBumperPiece, GL11.GL_COMPILE);
            track.renderAll();
            GL11.glEndList();
        }
    }

    public void render(float f5, int facing, EnumTracks enumTrack)
    {
        switch (facing)
        {
            case 0: // West
                RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 1, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(90,0,1,0);
                renderBlock();
                break;
            case 7:
                RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(enumTrack.getVariant(), facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(-135, 0 , 1, 0);
                renderBlock();
                break;
            case 1:
                RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 2, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(0, 0 , 1, 0);
                renderBlock();
                break;
            case 4:
                RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(enumTrack.getVariant(), facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(135, 0 , 1, 0);
                renderBlock();
                break;
            case 2:
                RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 1, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(270,0,1,0);
                renderBlock();
                break;
            case 3:
                RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 2, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(180, 0 , 1, 0);
                renderBlock();
                break;
            case 6:
                RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(enumTrack.getVariant(), facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(-45F, 0 , 1, 0);
                renderBlock();
                break;
            case 5:
                RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(enumTrack.getVariant(), facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
                renderBlock();
                break;
        }
    }

    public void renderHardware(int facing)
    {
        GL11.glPushMatrix();
        int orientation = TrackBufferOrientation.normalize(facing);
        GL11.glRotatef(HARDWARE_ROTATION_DEGREES[orientation], 0.0F, 1.0F, 0.0F);
        tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,
                Info.modelTexPrefix + "american_stopper.png"));
        GL11.glColor4f(1, 1, 1, 1);
        GL11.glCallList(listAmericanBumperPiece);
        GL11.glPopMatrix();
    }

	@Override
	public void renderTrackAttachment(TrackAttachmentRenderContext context)
	{
		tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation,
				Info.modelTexPrefix + "american_stopper.png"));
		GL11.glColor4f(1, 1, 1, 1);
		GL11.glCallList(listAmericanBumperPiece);
	}

    private void renderBlock()
    {
        GL11.glTranslatef(0, 0, 0f);
        tmt.Tessellator
                .bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "american_stopper.png"));
        GL11.glColor4f(1, 1, 1, 1);
        GL11.glCallList(listAmericanBumperPiece);
        GL11.glPopMatrix();
    }

    public void renderInHand(float f5, EnumTracks enumTrack) {
        RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 1, -0.5, 0, -0.5, 1, 1, 1, 1);
        GL11.glRotatef(90, 0, 1, 0);
        tmt.Tessellator
                .bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "american_stopper.png"));
        GL11.glColor4f(1, 1, 1, 1);
        GL11.glCallList(listAmericanBumperPiece);
    }
}
