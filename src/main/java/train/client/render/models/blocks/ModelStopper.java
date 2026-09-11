/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.client.render.RenderTCRail;
import train.common.library.track.EnumTracks;
import train.common.library.Info;
import train.common.track.attachment.legacy.TrackBufferOrientation;
import train.client.render.ITrackAttachmentModelRenderer;
import train.client.render.TrackAttachmentRenderContext;

public class ModelStopper extends ModelBase implements ITrackAttachmentModelRenderer
{
	private static final float[] HARDWARE_ROTATION_DEGREES =
			{0.0F, -90.0F, 180.0F, 90.0F, 45.0F, -45.0F, 225.0F, -225.0F};
	private final float modelScale;
	public static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "buffer.png");
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box2;
	public CustomModelRenderer box3;
	public CustomModelRenderer box35;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;

	public ModelStopper()
	{
		this(1.0F / 16.0F);
	}

	public ModelStopper(float scale)
	{
		modelScale = scale;
		box = new CustomModelRenderer(this, 43, 4, 64, 64);
		box.addBox(0F, 0F, 0F, 2, 15, 1, scale);
		box.setPosition(-8F, 0F, 4F);
		box.rotateAngleZ = -0.8028514559173916F;

		box0 = new CustomModelRenderer(this, 36, 4, 64, 64);
		box0.addBox(0F, 0F, 0F, 2, 15, 1, scale);
		box0.setPosition(-8F, 0F, -5F);
		box0.rotateAngleZ = -0.8028514559173916F;

		box1 = new CustomModelRenderer(this, 57, 4, 64, 64);
		box1.addBox(-2F, 0F, 0F, 2, 9, 1, scale);
		box1.setPosition(8F, 0F, -5F);
		box1.rotateAngleZ = -5.759586531581287F;

		box10 = new CustomModelRenderer(this, 5, 5, 64, 64);
		box10.addBox(0F, 0F, 0F, 2, 4, 16, scale);
		box10.setPosition(4F, 7F, -8F);

		box2 = new CustomModelRenderer(this, 50, 4, 64, 64);
		box2.addBox(-2F, 0F, 0F, 2, 9, 1, scale);
		box2.setPosition(8F, 0F, 4F);
		box2.rotateAngleZ = -5.759586531581287F;

		box3 = new CustomModelRenderer(this, 26, 7, 64, 64);
		box3.addBox(0F, 0F, 0F, 1, 3, 3, scale);
		box3.setPosition(4F, 11F, -5F);

		box35 = new CustomModelRenderer(this, 6, 5, 64, 64);
		box35.addBox(0F, 0F, 0F, 2, 12, 1, scale);
		box35.setPosition(2F, 0F, 5F);

		box4 = new CustomModelRenderer(this, 0, 27, 64, 64);
		box4.addBox(0F, 0F, 0F, 16, 1, 16, scale);
		box4.setPosition(-8F, 0F, -8F);

		box5 = new CustomModelRenderer(this, 13, 5, 64, 64);
		box5.addBox(0F, 0F, 0F, 2, 12, 1, scale);
		box5.setPosition(2F, 0F, -6F);
	}

	public void render(float f5, int facing, EnumTracks enumTrack)
	{
		switch (facing)
		{
			case 0:
				RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 1, -0.5, 0, -0.5, 1, 1, 1, 1);
				break;
			case 7:
				RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(enumTrack.getVariant(), facing, -0.5, 0, -0.5, 1, 1, 1, 1);
				break;
			case 1:
				RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 2, -0.5, 0, -0.5, 1, 1, 1, 1);
				break;
			case 4:
				RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(enumTrack.getVariant(), facing, -0.5, 0, -0.5, 1, 1, 1, 1);
				break;
			case 2:
				RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 1, -0.5, 0, -0.5, 1, 1, 1, 1);
				break;
			case 3:
				RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 2, -0.5, 0, -0.5, 1, 1, 1, 1);
				break;
			case 6:
				RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(enumTrack.getVariant(), facing, -0.5, 0, -0.5, 1, 1, 1, 1);
				break;
			case 5:
				RenderTCRail.modelSmallDiagonalStraight.renderDiagonal(enumTrack.getVariant(), facing, -0.5, 0, -0.5, 1, 1, 1, 1);
				break;
		}
		renderHardware(f5, facing);
	}

	@Override
	public void renderTrackAttachment(TrackAttachmentRenderContext context)
	{
		renderAttachmentHardware(modelScale);
	}

	public void renderHardware(float scale, int facing)
	{
		GL11.glPushMatrix();
		int orientation = TrackBufferOrientation.normalize(facing);
		GL11.glRotatef(HARDWARE_ROTATION_DEGREES[orientation], 0.0F, 1.0F, 0.0F);
		renderAttachmentHardware(scale);
		GL11.glPopMatrix();
	}

	private void renderAttachmentHardware(float scale)
	{
		tmt.Tessellator.bindTexture(texture);
		box.render(scale);
		box0.render(scale);
		box1.render(scale);
		box10.render(scale);
		box2.render(scale);
		box3.render(scale);
		box35.render(scale);
		// box4.render(f5);
		box5.render(scale);


		GL11.glTranslatef(0, 0, 0);
		GL11.glColor4f(1, 1, 1, 1);

	}

	public void render2(float f5, int facing, EnumTracks enumTrack)
	{
		RenderTCRail.modelSmallStraight.renderStraight(enumTrack, 1, -0.5, 0, -0.5, 1, 1, 1, 1);

		tmt.Tessellator.bindTexture(texture);
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box2.render(f5);
		box3.render(f5);
		box35.render(f5);
		// box4.render(f5);
		box5.render(f5);
		GL11.glRotatef(90, 0, 1, 0);
		GL11.glColor4f(1, 1, 1, 1);

	}
}
