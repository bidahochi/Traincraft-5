package train.client.render.models.blocks.track.switchs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;
import train.common.items.RailVariants;

@SideOnly(Side.CLIENT)
public class ModelRightSwitchTCTrack extends AbstractSwitchTCTrack
{
	public ModelRightSwitchTCTrack()
	{
		bake("right");
	}

	public void renderMedium(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyMediumTransform(facing);
		if (active) this.renderMediumActive();
		else this.renderMediumInactive();
		GL11.glPopMatrix();
	}

	public void renderLarge90(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyLarge90Transform(facing);
		if (active) this.renderLarge90Active();
		else this.renderLarge90Inactive();
		GL11.glPopMatrix();
	}

	public void renderVeryLarge90(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyVeryLarge90Transform(facing);
		if (active) this.renderVeryLarge90Active();
		else this.renderVeryLarge90Inactive();
		GL11.glPopMatrix();
	}

	public void renderMediumParallel(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyMediumParallelTransform(facing);
		if (active) this.renderMediumParallelActive();
		else this.renderMediumParallelInactive();
		GL11.glPopMatrix();
	}

	public void renderLargeParallel(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyVeryLarge90Transform(facing);
		if (active) this.renderLargeParallelActive();
		else this.renderLargeParallelInactive();
		GL11.glPopMatrix();
	}

	public void renderMedium45(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyMedium45Transform(facing);
		if (active) this.renderMedium45degreeActive();
		else this.renderMedium45degreeInActive();
		GL11.glPopMatrix();
	}

	public void renderLarge45(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyLarge45Transform(facing);
		if (active) this.renderLarge45degreeActive();
		else this.renderLarge45degreeInActive();
		GL11.glPopMatrix();
	}

	public void renderCrossover10x2(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyCrossover10x2Transform(facing);
		if (active) this.renderCrossover10x2Active();
		else this.renderCrossover10x2Inactive();
		GL11.glPopMatrix();
	}

	public void renderDiagonal4x3(RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a)
	{
		beginRender(railVariant, x, y, z, r, g, b, a);
		applyDiagonal4x3Transform(facing);
        if (active) this.renderDiagonal4x3Active();
		else this.renderDiagonal4x3Inactive();
		GL11.glPopMatrix();
	}

	private void beginRender(RailVariants railVariant, double x, double y, double z, float r, float g, float b, float a)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
		tmt.Tessellator.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(railVariant));
		GL11.glColor4f(r, g, b, a);
	}

	private void applyMediumTransform(int facing)
	{
		switch (facing)
		{
			case 1: GL11.glRotatef(180, 0, 1, 0); break;
			case 2: GL11.glRotatef(90, 0, 1, 0); break;
			case 0: GL11.glRotatef(-90, 0, 1, 0); break;
		}
		GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
	}

	private void applyLarge90Transform(int facing)
	{
		switch (facing)
		{
			case 1: GL11.glRotatef(180, 0, 1, 0); break;
			case 2: GL11.glRotatef(90, 0, 1, 0); break;
			case 0: GL11.glRotatef(-90, 0, 1, 0); break;
			default: GL11.glRotatef(0, 0, 1, 0); break;
		}
		GL11.glTranslatef(0.0f, 0.0f, 4.0f);
	}

	private void applyVeryLarge90Transform(int facing)
	{
		switch (facing)
		{
			case 3: GL11.glRotatef(-90, 0, 1, 0); break;
			case 1: GL11.glRotatef(90, 0, 1, 0); break;
			case 2: GL11.glRotatef(0, 0, 1, 0); break;
			case 0: GL11.glRotatef(180, 0, 1, 0); break;
		}
		GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
	}

	private void applyMediumParallelTransform(int facing)
	{
		switch (facing)
		{
			case 3: GL11.glRotatef(-90, 0, 1, 0); break;
			case 1: GL11.glRotatef(90, 0, 1, 0); break;
			case 2:
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0.0f);
				break;
			case 0: GL11.glRotatef(180, 0, 1, 0); break;
		}
	}

	private void applyMedium45Transform(int facing)
	{
		switch (facing)
		{
			case 3:
				GL11.glTranslatef(0.0f, 0.0f, 0);
				GL11.glRotatef(-90, 0, 1, 0);
				break;
			case 1:
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0);
				break;
			case 2:
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0f);
				break;
			case 0:
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0.0f);
				break;
		}
	}

	private void applyLarge45Transform(int facing)
	{
		switch (facing)
		{
			case 3: GL11.glRotatef(-90, 0, 1, 0); break;
			case 1: GL11.glRotatef(90, 0, 1, 0); break;
			case 2: GL11.glRotatef(0, 0, 1, 0); break;
			case 0: GL11.glRotatef(180, 0, 1, 0); break;
		}
		GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
	}

	private void applyCrossover10x2Transform(int facing)
	{
		switch (facing)
		{
			case 3: GL11.glRotatef(-90, 0, 1, 0); break;
			case 1: GL11.glRotatef(90, 0, 1, 0); break;
			case 0: GL11.glRotatef(180, 0, 1, 0); break;
		}
		GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
	}

	private void applyDiagonal4x3Transform(int facing)
	{
		switch (facing)
		{
			case 0: GL11.glRotatef(180, 0, 1, 0); break;
			case 1: GL11.glRotatef(90, 0, 1, 0); break;
			case 3: GL11.glRotatef(-90, 0, 1, 0); break;
			case 4: GL11.glRotatef(90, 0, 1, 0); break;
			case 6: GL11.glRotatef(-90, 0, 1, 0); break;
			case 7: GL11.glRotatef(180, 0, 1, 0); break;
		}
		GL11.glTranslatef(0.5f, 0.0f, 0.5f);
	}
}
