package train.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

public class GuiCustomButton extends GuiButton {

	private String texture = Info.guiPrefix + "customButton.png";
	private int textureX = 0;
	private int textureY = 46;

	public GuiCustomButton(int id, int xPosition, int yPosition, String displayString, String texture, int textureX, int textureY) {
		this(id, xPosition, yPosition, 200, 20, displayString, texture, textureX, textureY);
	}

	public GuiCustomButton(int id, int xPosition, int yPosition, int buttonImageWidth, int buttonImageHeight, String displayString, String texture, int textureX, int textureY) {
		super(id, xPosition, yPosition, buttonImageWidth, buttonImageHeight, displayString);
		this.width = 200;
		this.height = 20;
		this.enabled = true;
		this.visible = true;
		this.id = id;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = buttonImageWidth;
		this.height = buttonImageHeight;
		this.displayString = displayString;
		this.texture = texture;
		this.textureX = textureX;
		this.textureY = textureY;
	}

	public void setTexture(String texture, int textureX, int textureY) {
		this.texture = texture;
		this.textureX = textureX;
		this.textureY = textureY;
	}

	@Override
	public void drawButton(Minecraft mc, int par2, int par3) {
		if (this.visible) {
			FontRenderer var4 = mc.fontRenderer;
			mc.getTextureManager().bindTexture(new ResourceLocation(Info.resourceLocation,this.texture));
			//GL11.glBindTexture(GL11.GL_TEXTURE_2D, textureInt);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			boolean var5 = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
			this.drawTexturedModalRect(this.xPosition, this.yPosition, textureX, textureY, this.width, this.height);
			this.mouseDragged(mc, par2, par3);
			int var7 = 14737632;

			if (!this.enabled) {
				var7 = -6250336;
			}
			else if (var5) {
				var7 = 16777120;
			}
			this.drawCenteredString(var4, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, var7);
		}
	}
}