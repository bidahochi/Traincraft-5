package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.gui.sideTabs.SideTabInfo;
import train.client.gui.sideTabs.SideTabRecipes;
import train.client.gui.sideTabs.SideTabSlots;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.containers.ContainerTier;
import train.common.core.interfaces.ITier;
import train.common.core.managers.TierRecipe;
import train.common.core.managers.TierRecipeManager;
import train.common.core.network.PacketUpdateTCBenchPage;
import train.common.library.*;
import train.common.library.register.ITrainRecord;

import java.awt.Rectangle;
import java.util.List;

/** Crafting interface shared by all three bench tiers, including a fitted rolling-stock recipe preview. */
public class GuiCrafterTier extends GuiTraincraft
{
    private static final float MINIMUM_PREVIEW_TILT_DEGREES = -5;
    private static final float MAXIMUM_PREVIEW_TILT_DEGREES = 15;

	private IInventory tier;
	public static ITier tier1;
	private static int[] states = new int[10];
	public static int[] slotStates = new int[8];
	public static int recipeSize = 0;
	public static List<Item> recipes;
	public static List<TierRecipe> recipeList;

	public static boolean isShow = false;
	public static boolean isClear = false;
	public static boolean isTabRecipeOpen = false;

	private float yaw;
	private float roll;
	private boolean rollDown;
	public Item currentKnownItem=null;
	private int ticksInGui=0;
	private Item previousItem;
    private AbstractTrains renderEntity;
    private final RollingStockGuiPreview modelPreview;
    private final Rectangle previewBounds = new Rectangle(0, 0, 96, 80);
	private int color = 0;
	private final int START_Y=40;
	private final int END_Y=120;
	private int currentRenderTabY = START_Y;
    /** Creates a crafting GUI whose preview reserves the full configured animation tilt range. */
    public GuiCrafterTier(InventoryPlayer playerInventory, IInventory tierInventory)
    {
        super(new ContainerTier(playerInventory, tierInventory), tierInventory);
        this.tier = tierInventory;
        tier1 = (ITier) tierInventory;
        // The legacy interface returns a raw List; TierRecipeManager constructs each entry as TierRecipe.
        @SuppressWarnings("unchecked")
        List<TierRecipe> recipesForTier = TierRecipeManager.getInstance().getTierRecipeList(tier1.Tier());
        recipeList = recipesForTier;
        recipes = tier1.knownRecipes();
        ySize = 256;
        float maximumTiltMagnitudeDegrees = Math.max(Math.abs(MINIMUM_PREVIEW_TILT_DEGREES),
                Math.abs(MAXIMUM_PREVIEW_TILT_DEGREES));
        final float previewDepth = 350;
        modelPreview = new RollingStockGuiPreview(maximumTiltMagnitudeDegrees, previewDepth,
                RollingStockGuiPreview.CargoSizing.CURRENT_LOAD);
    }

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);

		fontRendererObj.drawString(tier1.getGUIName(), 9 + 1, 6, 0x000000);
		fontRendererObj.drawString("Output:      " + (tier1.getPageNumber() + 1) + "/" + tier1.getTotalPage(), 90 + 1, 118, 0x000000);
		fontRendererObj.drawString("Storage:", 9 + 1, 118, 0xffffff);
		fontRendererObj.drawString("Inventory: " + tier1.getTotalPage(), 9 + 1, 164, 0xffffff);

		fontRendererObj.drawString(tier1.getGUIName(), 9, 6, 0xd3a900);
		fontRendererObj.drawString("Output:      " + (tier1.getPageNumber() + 1) + "/" + tier1.getTotalPage(), 90, 118, 0xd3a900);
		fontRendererObj.drawString("Storage:", 9, 118, 0x202020);
		fontRendererObj.drawString("Inventory: ", 9, 164, 0x202020);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);

		super.drawGuiContainerForegroundLayer(i, j);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		List cs = inventorySlots.inventorySlots;

		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		mc.renderEngine.bindTexture(new ResourceLocation(tier1.getGUITexture()));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(j, k, 0, 0, this.xSize, this.ySize);

		borderSlots(recipeList, states);
		
		if(!isTabRecipeOpen){
			currentRenderTabY=this.START_Y;
		}
		/**Render the entity in GUI*/
		if(currentKnownItem!=null && isTabRecipeOpen){
			if(currentRenderTabY<END_Y)currentRenderTabY++;
			ticksInGui++;
			for(int a=0;a<6;a++){
				for(int b=0;b<5;b++){
					drawTexturedModalRect(j - 120 + a*16, (k + currentRenderTabY + b*16), 240, 48, 16, 16);//black squares

					drawTexturedModalRect(j -120 -1, (k + currentRenderTabY+b*16), 252, 68, 2, 16);//border left
					drawTexturedModalRect(j -120 -1 + 6*16, (k + currentRenderTabY+b*16), 254, 68, 2, 16);//border right
					drawTexturedModalRect(j -120 + a*16, (k + (currentRenderTabY-1) +5*16), 240, 64, 16, 2);//border bottom
				}
			}
            if (currentRenderTabY == END_Y)
            {
                drawRollingStockPreview();
            }
		}
		
		if (isShow) {
			if (!tier1.knownRecipes().isEmpty()) {
				drawOverlays(recipeSize, recipes);
			}
		}
		
		for (int i = 0; i < slotStates.length / 2; i++) {
			if (slotStates[i] == 1) {
				colorSlot(92 + i * 18, 128);
			}
			if (slotStates[i + 4] == 1) {
				colorSlot(92 + i * 18, 146);
			}
		}

		if (recipeSize > tier1.knownRecipes().size() - 1) {
			recipeSize = 0;
		}
		else if (recipeSize < 0) {
			recipeSize = tier1.knownRecipes().size() - 1;
		}

		recipes = tier1.knownRecipes();
	}

    /**
     * Fits the current recipe's rolling stock inside the expanded 96-by-80-pixel side panel.
     * The renderer reserves the full turn and the existing -5 to 15 degree tilt. Item changes
     * create one temporary entity; livery cycling reuses that entity and the GUI-owned fit cache.
     */
    private void drawRollingStockPreview()
    {
        Item item = currentKnownItem;
        ITrainRecord record = Traincraft.traincraftRegistry.getCurrentTrain(item);
        if (record == null)
        {
            return;
        }
        if (previousItem != item)
        {
            Entity candidate = Traincraft.traincraftRegistry.getEntityWithItem(item, mc.theWorld, 0, 0, 0);
            renderEntity = candidate instanceof AbstractTrains ? (AbstractTrains) candidate : null;
            previousItem = item;
        }
        if (renderEntity == null)
        {
            return;
        }
        int[] colors = record.getColors();
        if (colors != null && colors.length > 0)
        {
            if (color < 0 || color >= colors.length)
            {
                color = 0;
            }
            final int framesPerLivery = 400;
            if (ticksInGui % framesPerLivery == 0)
            {
                color = (color + 1) % colors.length;
            }
            renderEntity.setColor(colors[color]);
        }
        final int panelOffsetLeftPixels = 120;
        final int preferredCenterOffsetPixels = 170;
        previewBounds.setLocation(guiLeft - panelOffsetLeftPixels, guiTop + currentRenderTabY);
        float preferredCenterGuiY = guiTop + preferredCenterOffsetPixels;
        modelPreview.render(renderEntity, record, previewBounds, yaw, roll, preferredCenterGuiY, false);
        yaw += 0.5F;
        if (rollDown)
        {
            roll -= 0.05F;
            if (roll < MINIMUM_PREVIEW_TILT_DEGREES)
            {
                rollDown = false;
                roll = MINIMUM_PREVIEW_TILT_DEGREES;
            }
        }
        else
        {
            roll += 0.05F;
            if (roll > MAXIMUM_PREVIEW_TILT_DEGREES)
            {
                rollDown = true;
                roll = MAXIMUM_PREVIEW_TILT_DEGREES;
            }
        }
    }

    /** Releases the crafting preview's target and measurements before inventory GUI cleanup. */
    @Override
    public void onGuiClosed()
    {
        modelPreview.close();
        super.onGuiClosed();
    }

    /** Adds the crafting page controls using Minecraft's legacy raw button-list contract. */
    @Override
    public void initGui()
    {
        super.initGui();
        buttonList.clear();
        // GuiScreen's raw list is owned by this GUI and contains only GuiButton instances.
        @SuppressWarnings("unchecked")
        List<GuiButton> buttons = buttonList;
        final int pagerOffsetLeftPixels = 125;
        final int pagerOffsetTopPixels = 116;
        final int buttonSizePixels = 10;
        int buttonLeftPixels = (width - xSize) / 2 + pagerOffsetLeftPixels;
        int buttonTopPixels = (height - ySize) / 2 + pagerOffsetTopPixels;
        GuiCustomButton previousButton = new GuiCustomButton(99, buttonLeftPixels, buttonTopPixels,
                buttonSizePixels, buttonSizePixels, "", Info.guiPrefix + "Icons.png", 48, 0);
        buttons.add(previousButton);
        buttonLeftPixels += buttonSizePixels;
        GuiCustomButton nextButton = new GuiCustomButton(100, buttonLeftPixels, buttonTopPixels,
                buttonSizePixels, buttonSizePixels, "", Info.guiPrefix + "Icons.png", 64, 0);
        buttons.add(nextButton);
    }

	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		switch (guibutton.id) {
			case 99:
				if (tier1.getPageNumber() > 0) {
					tier1.setPageNumber(tier1.getPageNumber() - 1);
					inventorySlots.detectAndSendChanges();
					Traincraft.tcCraftingBenchChannel.sendToServer(
							new PacketUpdateTCBenchPage(tier1.getPageNumber(), tile)
					);
				}
				break;
			case 100:
				tier1.setPageNumber(tier1.getPageNumber() + 1);
				inventorySlots.detectAndSendChanges();
				Traincraft.tcCraftingBenchChannel.sendToServer(
						new PacketUpdateTCBenchPage(tier1.getPageNumber(), tile)
				);
				break;
		}
	}

	@Override
	protected void initSideTabs(IInventory inventory) {
		super.initSideTabs(inventory);
		sideTabManager.add(new SideTabInfo(this, true, true, true, Info.tooltipsTierI));
		sideTabManager.add(new SideTabRecipes(this, true, true, true));
		sideTabManager.add(new SideTabSlots(tier1, this, true, true, true, slotStates));
	}
}
