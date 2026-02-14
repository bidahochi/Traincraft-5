package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import train.client.core.handlers.RecipeBookHandler;
import train.common.core.managers.TierRecipe;
import train.common.core.managers.TierRecipeManager;
import train.common.inventory.TrainCraftingManager;
import train.common.items.ItemAbstractRollingStock;
import train.common.items.ItemRecipeBook;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.library.ItemIDs;
import train.common.recipes.ITCRecipe.ShapedTrainRecipes;
import train.common.recipes.ITCRecipe.ShapelessTrainRecipe;

import java.util.ArrayList;
import java.util.List;

@SideOnly(Side.CLIENT)
public class GUICreditsBook extends GuiScreen {
    /** The player editing the book */
    private final EntityPlayer editingPlayer;
    private final ItemStack itemstackBook;

    /** Update ticks since the gui was opened */
    private int bookImageWidth = 206;
    private int bookImageHeight = 200;
    public static int bookTotalPages = 102;
    private int currPage;
    private int currRecipe;
    public ArrayList<String> leftPage = new ArrayList<String>();
    public ArrayList<String> leftPageImage = new ArrayList<String>();
    public ArrayList<ArrayList> leftPageItemStacks = new ArrayList<ArrayList>();
    public ArrayList<String> rightPage = new ArrayList<String>();
    public ArrayList<String> rightPageImage = new ArrayList<String>();
    public ArrayList<ArrayList> rightPageItemStacks = new ArrayList<ArrayList>();
    private List recipeListWB = RecipeBookHandler.workbenchListCleaner(TrainCraftingManager.getInstance().getRecipeList());
    private List<TierRecipe> recipeList = RecipeBookHandler.assemblyListCleaner(TierRecipeManager.getInstance().getRecipeList());

    private GuiButtonNextPage buttonRead;
    private GuiButtonNextPage buttonNextPage;
    private GuiButtonNextPage buttonPreviousPage;
    private GuiButtonNextPage buttonBack;
    private RenderItem renderItem = new RenderItem();

    public GUICreditsBook(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
        this.editingPlayer = par1EntityPlayer;
        this.itemstackBook = par2ItemStack;
        this.currPage = this.itemstackBook.getTagCompound().getInteger("currPage");
        this.currRecipe = this.itemstackBook.getTagCompound().getInteger("currRecipe");

        addPage("", "", "left", null);
        addPage("", "", "right", null);
        addPage("This is the JCIR-Traincraft Contributers Book! \nThis book has a list of who made what.\nWarning: This is HIGHLY out of date.\nContributers:\nPeachMaster\nBidahochi\nProf_Binky\nJCRail\nhariesh\nMessicrew\nBigJ\nEddie Dalton", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartS2.item), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.trainWorkbench.block), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCabooseWork.item), 60, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartRibbedHopper.item), 80, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartMillGondola.item), 100, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecart40highcube.item), 120, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartWoodchipHopper.item), 140, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCF7angle.item), 160, 175));
            }
        });
        addPage("Big thanks to the Mod Creators:\nSpitfire4466,\nMrbrutal,\nEternalBlueFlame,\nNitroxydeX,\nand the many people who\nhave submitted stuff into base TC.\n\nAnd by Players like you,\nThank You!\n\n-JCIRTC Dev Team\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartgtavthing.item), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableII.block), 170, 16));

                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH120Commute.item), 20, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH120Car.item), 40, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH120Car.item), 60, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH120Car.item), 80, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH120Car.item), 100, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH120Commute.item), 120, 175));
            }
        });
        addPage("Table of Contents:\n1- Cover\n2- Thanks Page\n3- ToC\n4- Model Contributions (Bida)\n6- Model Contributions (PeachMaster)\n7- Model Contributions (Prof_Binky)\n8- Model Contributions (Hariesh)\n9- Model Contributions (Messicrew)\n10- Model Contributions (Others)\n\n\n\n", "", "left", null);
        addPage("11- Code Contributions (PeachMaster)\n12- Code Contributions (Hariesh)\n13- Code Contributions (Bida)\n14- Code Contributions (JCRail)\n15- Texture Contributions (JCRail)\n16- Texture Contributions (Prof_Binky)\n17- Others", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartF40PH.item), 20, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartAmfleet.item), 40, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartAmfleet.item), 60, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartAmfleet2.item), 80, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartAmfleet2.item), 100, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartAmfleet.item), 120, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartAmfleet.item), 140, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartAmfleet2.item), 160, 155));
            }
        });
        addPage("Content Credits:\n\nBida:\nS2\nPCH120 Cab and Coach\nSW1\nH10-44\nRibbed Hopper\nThanos Cart\nU23B\nSW1500\nSD45-2 and 45B\nSD40-2\nF.R.E.D\nCF7s", "", "left", new ArrayList<StackToDraw>() {
            {
               /* add(new StackToDraw(new ItemStack(ItemIDs.minecartAlcoS2.item), 18, 62));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH120.item), 160, 72));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH120Coach.item), 180, 72));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartSW1.item), 18, 80));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartH1044.item), 80, 89));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartRibbedHopper.item), 18, 98));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartThanos.item), 110, 104));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartU23B.item), 18, 115));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartSW1500.item), 80, 125));*/ //basically i had this idea to put an icon next to each contribution, boy that was a pain
                add(new StackToDraw(new ItemStack(ItemIDs.minecartThanos.item), 170, 16));
            }
        });

        addPage("Bida (continued):\nSD9\nSF30C\nBombcart\n23 Ton Boxcab\nGP30\n2 Truck VB Shay\n52' Mill Gondola\nFOL-M1B\nC424/425\nTGV Van\nGP7/GP9\nGP7U\nGTAV Locomotive\nHH660/HHGregg600",
                "", "right", new ArrayList<StackToDraw>() {
                    {
                        add(new StackToDraw(new ItemStack(ItemIDs.diesel.item), 160, 160));
                    }
                });
        addPage("Bida (continued):\nMP15DCW-9\nGP7B\nSD40T-2\nSkookum & Tender\nOWO 60' Verticube\nGP38-2\nB23-7\nLeslie Trailer\nC415's\nPolar Express Coaches\nVersaflood Hoppers\n3GS21B\nDash 9-44CW\nGP15", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartHHgregg.item), 170, 16));
            }
        });

        addPage("Bida (continued):\n\n\n\n\n\n\n\n\n\n\n\n\nyes this page is blank, get over it lol\n",
                "", "right", new ArrayList<StackToDraw>() {
                    {
                        add(new StackToDraw(new ItemStack(ItemIDs.minecartPower.item), 160, 160));
                    }
                });
        addPage("Peachmaster:\nPCH100H Cab and Coach\nAipkit Explorer\nApikit Explorer II", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartExperimentalHydrogenTrain.item), 40, 145));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH100HCoach.item), 60, 145));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH100HCoach.item), 80, 145));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH100HCoach.item), 100, 145));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH100HCoach.item), 120, 145));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH100HCoach.item), 140, 145));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH100HCoach.item), 160, 145));
            }
        });
        addPage("\n\n(If your looking for the code-contributions, check the ToC) \n", "", "right",
                new ArrayList<StackToDraw>() {
                    {
                        add(new StackToDraw(new ItemStack(Items.stick), 140, 135));
                    }
                });//13 lines average
        addPage("Prof_Binky:\n40' Highcuble Boxcar\nWoodchip Hopper\nOre Jenny\nSDL39\nF7s (with bida)\nSDP40F\nF45 & FP45\n60, 66, & 73 foot Centerbeams\n40,50, & 60 foot PS1 Boxcars\nWide Vision Caboose\nEF1 & EP1\nall 3 DOT111 Tankers\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartTender.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartLocomogulBlue.item), 170, 16));
                add(new StackToDraw(new ItemStack(Items.coal), 40, 155));
                add(new StackToDraw(new ItemStack(Items.water_bucket), 60, 155));
                add(new StackToDraw(new ItemStack(Blocks.planks), 80, 155));
                add(new StackToDraw(new ItemStack(Items.blaze_rod), 100, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.diesel.item), 120, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.refinedFuel.item), 140, 155));
            }
        });
        addPage("Prof_Binky:\nU36C\nE8s\nE9s\nSDL39\nF3\n\n\n\n\n\n\n\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartU36C.item), 20, 16));
            }
        });

        addPage("hariesh Model Contribution\n\n•LU 1996 Engine\n•LU 1996 Passenger\n•Class 345\n•Class 345 Coach\n•Boulder Wagon\n",
                "", "right", new ArrayList<StackToDraw>() {
                    {
                        add(new StackToDraw(new ItemStack(ItemIDs.minecartBR_E69.item), 20, 16));
                        add(new StackToDraw(new ItemStack(Items.redstone), 170, 16));
                    }
                });
        addPage("Messicrew Model Contributions\n\nP42 [aka Genesis]\n F40PH \n Generic Highrail Truck\n",
                "", "right", new ArrayList<StackToDraw>() {
                    {
                        add(new StackToDraw(new ItemStack(ItemIDs.minecartGeGenesis.item), 20, 16));
                        add(new StackToDraw(new ItemStack(ItemIDs.refinedFuel.item), 170, 16));
                    }
                });
        addPage("Other Model Contributions\n\n Eddie Dalton: ES44, Dash9, and SD70MAC base models\n BigJ:NP logcar, Hustler\n",
                "", "right", new ArrayList<StackToDraw>() {
                    {
                        add(new StackToDraw(new ItemStack(ItemIDs.minecartGeGenesis.item), 20, 16));
                        add(new StackToDraw(new ItemStack(ItemIDs.refinedFuel.item), 170, 16));
                    }
                });
        addPage("PeachMaster Code Contribution\ntilting trains\npaintbrush item\ndead in tow pulling", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.firebox.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH100HCoach.item), 170, 16));
            }
        });

        addPage("hariesh Code Contribution\n\n•Increase of Texture limit per Model\n•Recipes of Trains\n•Adding track recipe to crafting table\n•Train Imports\n•Texture Imports\n•Achievements Added\n•Bug Testing and Bug Fixes\n•Funny Quotes Added\n•Working Lights on Trains\n•More Switches added and coded in", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.firebox.item), 20, 16));
                //add(new StackToDraw(new ItemStack(ItemIDs.minecartLUengine.item), 170, 16));
            }
        });
        addPage("Bida Code Contribution\n- Dynamic Freight Car Loads\n- Specific Wheels per Locomotive\n\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.paintbrushThing.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartMillGondola.item), 170, 16));
            }
        });
        addPage("JCRail Code Contribution\n\n\n\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.firebox.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPCH100HCoach.item), 170, 16));
            }
        });
        addPage("JCRail Texture Contibutions\nliterally like every atsf texture besides the CF7\n\n\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Items.skull, 1, 1), 20, 16));
            }
        });
        addPage("Binky Texture Contibutions\n\n\n\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Items.skull, 1, 1), 20, 16));
            }
        });
        addPage("Messicrew Texture Contibutions\n\nMT&S SD45-2\nMT&S SD40-2\nMT&S SW1500\nMT&S SW1\nMT&S SD70MAC\n MT&S U23B\n MT&S CF7\n JCTransit skins on several Passenger Locos and Cars  ,", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Items.skull, 1, 1), 20, 16));
            }
        });
        addPage("hariesh's Texture Contribution\n\n•LU 1996 Skin\n•Class345 Skin\n•PCH100H Overground Skin\n•PCH120 Underground Skin\n•Pumpkin Wagon Skin\n•Tank Wagon Skin Chemtech & Britain", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 20, 16));
                //add(new StackToDraw(new ItemStack(ItemIDs.minecartClass345.item), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoBR01_DB.item), 40, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 60, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightCart2.item), 80, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 100, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightClosed.item), 120, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 140, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartWatertransp.item), 160, 165));
            }
        });
        /*
        addPage("blank\n\n\n\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Items.skull, 1, 1), 20, 16));
            }
        });

        addPage("Pulling:\n\nL\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCaboose.item), 40, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 60, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBoxCartUS.item), 80, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 100, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartLogs_DB.item), 120, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 140, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 160, 165));
            }
        });
        addPage("\n\n\n\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.chunkLoaderActivator.item), 20, 16));
                add(new StackToDraw(new ItemStack(Items.ender_pearl), 170, 16));
            }
        });
        addPage("\n\n\n\n\n\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Items.dye, 1, 1), 20, 16));
                add(new StackToDraw(new ItemStack(Items.dye, 1, 11), 170, 16));
            }
        });
        addPage("\n\n\n\n(Railcraft required).\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartStockCar.item), 20, 16));
                add(new StackToDraw(new ItemStack(Items.skull, 1, 4), 170, 16));
            }
        });
        addPage("\n\n\nT.\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 16));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 32));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 48));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 64));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 80));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 96));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 112));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 128));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 144));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 160));
                add(new StackToDraw(new ItemStack(Blocks.golden_rail), 170, 16));
            }
        });
        addPage(":\nT\n.\n","","left",new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Blocks.activator_rail), 17, 16));
                add(new StackToDraw(new ItemStack(Blocks.golden_rail), 170, 16));
            }
        });
        addPage("","","right",new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Blocks.detector_rail), 17, 16));
                add(new StackToDraw(new ItemStack(Blocks.golden_rail), 170, 16));
            }
        });
        addPage("\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 60, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 80, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightClosed.item), 100, 165));
            }
        });
        addPage(":\n\n \n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 60, 125));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 80, 125));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightClosed.item), 100, 125));
            }
        });
        addPage("", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Blocks.detector_rail), 20, 16));
                add(new StackToDraw(new ItemStack(Blocks.rail), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPower.item), 40, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartWoodUS.item), 60, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBoxCartUS.item), 80, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPassenger9_2class_DB.item), 100, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartLogs_DB.item), 120, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightCart2.item), 140, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCaboose.item), 160, 165));
            }
        });
        addPage("", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(BlockIDs.trainWorkbench.block), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableI.block), 40, 165));
                add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableII.block), 80, 165));
                add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableIII.block), 140, 165));
            }
        });
        addPage("", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(BlockIDs.openFurnaceIdle.block), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.openFurnaceActive.block), 80, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.graphite.item), 70, 135));
                add(new StackToDraw(new ItemStack(Items.iron_ingot), 90, 135));
                add(new StackToDraw(new ItemStack(Items.coal), 80, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.steel.item), 120, 155));
            }
        });

        addPage("", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(BlockIDs.distilIdle.block), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.distilActive.block), 150, 40));
                add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block, 1, 1), 150, 20));
                add(new StackToDraw(new ItemStack(Items.coal), 150, 60));
                add(new StackToDraw(new ItemStack(ItemIDs.diesel.item), 167, 40));
                add(new StackToDraw(new ItemStack(ItemIDs.rawPlastic.item), 167, 60));
            }
        });
        addPage("", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoBR80_DB.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCabooseWork.item), 40, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartTankWagon_DB.item), 60, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartRail_DB.item), 80, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 100, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 120, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 140, 165));
            }
        });
        addPage("", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartLoco3.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 40, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 60, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 80, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 100, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 120, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 140, 165));
            }
        });
        addPage("", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.hat.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.hat_ticketMan_paintable.item), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.hat_driver_paintable.item), 40, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.jacket_driver_paintable.item), 90, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.pants_driver_paintable.item), 140, 165));
            }
        });
        addPage("", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.helmet_suit_paintable.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.reinforcedPlates.item), 170, 16));
            }
        });
        addPage("","","left",new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(BlockIDs.windMill.block, 1, 4), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.waterWheel.block, 1, 4), 170, 16));
            }
        });
        addPage("","","right",new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1, 4), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.hat_driver_paintable.item, 1, 4), 170, 16));
            }
        });
        addPage("\n",
                "", "left", new ArrayList<StackToDraw>() {
                    {
                        add(new StackToDraw(new ItemStack(Items.skull, 1, 4), 20, 16));
                        add(new StackToDraw(new ItemStack(Items.skull, 1, 4), 170, 16));
                    }
                });

        addPage("\n","","right",new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartTankWagon_DB.item), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCaboose3.item), 40, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWellcar.item), 60, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartOpenWagon.item), 80, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartStockCar.item), 100, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartOpenWagon.item), 120, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBR_E69.item), 140, 155));
            }
        });

        addPage("", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(BlockIDs.trainWorkbench.block), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.hat.item), 40, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.jacket.item), 90, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.overalls.item), 140, 155));
            }
        }); */
        addPage("this page was intentionally left blank, as a joke.","","right",null);
        if (rightPage != null && recipeList != null && recipeListWB != null)
            bookTotalPages = this.rightPage.size() + (recipeList.size() / 2) + (recipeListWB.size() / 2);
    }

    public class StackToDraw {
        private ItemStack stack;
        private int x;
        private int y;

        public StackToDraw(ItemStack stack, int x, int y) {
            this.stack = stack;
            this.x = x;
            this.y = y;
        }

        public ItemStack getItemStack() {
            return stack;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private void addPage(String text, String image, String side, ArrayList<StackToDraw> stacks) {
        if (side.equals("left")) {
            leftPage.add(text);
            leftPageImage.add(image);
            leftPageItemStacks.add(stacks);
        }
        if (side.equals("right")) {
            rightPage.add(text);
            rightPageImage.add(image);
            rightPageItemStacks.add(stacks);
        }
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    @Override
    public void initGui() {
        this.buttonList.clear();

        int var1 = (this.width) / 2;
        int var2 = (this.height) / 2;
        this.buttonList.add(this.buttonBack = new GuiButtonNextPage(4, var1 + 150, var2 + 80, 23, 13, true));
        this.buttonList.add(this.buttonRead = new GuiButtonNextPage(3, var1 - 8, var2 + 98, 40, 20, true));
        this.buttonList.add(this.buttonNextPage = new GuiButtonNextPage(1, var1 + 150, var2 + 80, 23, 13, true));
        this.buttonList.add(this.buttonPreviousPage = new GuiButtonNextPage(2, var1 - 180, var2 + 80, 23, 13, false));
        this.updateButtons();
    }

    private void updateButtons() {
        this.buttonBack.visible = (this.currPage == bookTotalPages-1);
        this.buttonBack.showButton = true;
        this.buttonRead.visible = (this.currPage == 0);
        this.buttonRead.showButton = false;
        this.buttonNextPage.visible = (this.currPage > 0 && this.currPage < bookTotalPages - 1);
        this.buttonNextPage.showButton = (this.currPage > 0 && this.currPage < bookTotalPages - 1);
        this.buttonPreviousPage.visible = this.currPage > 0;
        this.buttonPreviousPage.showButton = this.currPage > 0;
    }

    /**
     * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
     */
    @Override
    protected void actionPerformed(GuiButton par1GuiButton) {
        if (par1GuiButton.enabled) {
            if (par1GuiButton.id == 1) {
                if (this.currPage < bookTotalPages - 1) {
                    ++this.currPage;
                    this.currRecipe += 2;
                }
            }
            else if (par1GuiButton.id == 2) {
                if (this.currPage > 0) {
                    --this.currPage;
                    this.currRecipe -= 2;
                }
            }
            else if (par1GuiButton.id == 3) {
                if (this.currPage == 0) {
                    ++this.currPage;
                    this.currRecipe += 2;
                }
            }
            else if (par1GuiButton.id == 4) {
                if (this.currPage == bookTotalPages-1) {
                    this.currPage = 0;
                    this.currRecipe = 0;
                }
            }
            this.updateButtons();
        }
    }

    /**
     * Draws the screen and all the components in it.
     */

    @Override
    public void drawScreen(int par1, int par2, float par3) {
        String pageIndic;
        int var9;
        int var5 = (this.width) / 2;
        int var6 = (this.height) / 2 - bookImageHeight / 2;

        if (this.currPage > 0) {
            //GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookright2.png"));
            this.drawTexturedModalRect(var5, var6, 0, 0, this.bookImageWidth, this.bookImageHeight + 20);
            //GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookleft2.png"));
            var5 -= this.bookImageWidth;
            this.drawTexturedModalRect(var5, var6, 256 - this.bookImageWidth, 0, this.bookImageWidth, this.bookImageHeight);
        }
        else {
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookcover2.png"));
            this.drawTexturedModalRect(var5 - 55, var6 - 15, 0, 0, 256, 256);
        }

        pageIndic = String.format(StatCollector.translateToLocal("book.pageIndicator"), new Object[] {this.currPage + 1, this.bookTotalPages});

        var9 = this.fontRendererObj.getStringWidth(pageIndic);
        if (this.currPage > 0) {
            this.fontRendererObj.drawString(pageIndic, var5 - var9 + this.bookImageWidth - 44, var6 + 7, 0);
        }
        super.drawScreen(par1, par2, par3);


        if (this.currPage < rightPage.size()) {
            this.fontRendererObj.drawSplitString(leftPage.get(this.currPage), var5 + 36, var6 + 16 + 16, 140, 0);

            this.fontRendererObj.drawSplitString(rightPage.get(this.currPage), var5 + 250, var6 + 16 + 16, 140, 0);

            GL11.glEnable(32826);
            RenderHelper.enableGUIStandardItemLighting();
            if (this.leftPageItemStacks != null && this.leftPageItemStacks.get(this.currPage) != null && this.leftPageItemStacks.get(this.currPage).get(0) != null) {
                for (int t = 0; t < this.leftPageItemStacks.get(this.currPage).size(); t++) {
                    if (this.leftPageItemStacks.get(this.currPage).get(t) != null) {
                        renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getItemStack(), var5 + ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getX(), var6 + ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getY());
                    }
                }
            }
            if (this.rightPageItemStacks != null && this.rightPageItemStacks.get(this.currPage) != null && this.rightPageItemStacks.get(this.currPage).get(0) != null) {
                for (int t = 0; t < this.rightPageItemStacks.get(this.currPage).size(); t++) {
                    if (this.rightPageItemStacks.get(this.currPage).get(t) != null) {
                        renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getItemStack(), var5 + ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getX() + 210, var6 + ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getY());
                    }
                }
            }
            GL11.glDisable(32826);
        }
        if (this.currPage > rightPage.size() - 1) {
            //System.out.println((rightPage.size()*2) -1);
            int page = this.currRecipe - (rightPage.size() * 2) + 1;
            if (!(page > recipeListWB.size() - 1)) {
                drawWorkBenchBackground(recipeListWB, var5, var6, 0, var9, "right");
                drawWorkBenchBackground(recipeListWB, var5, var6, 0, var9, "left");
                RenderHelper.enableGUIStandardItemLighting();
                drawWorkBenchRecipe(recipeListWB, var5, var6, page - 1, var9, "right");
                drawWorkBenchRecipe(recipeListWB, var5, var6, page, var9, "left");
            }
            else if ((page - recipeListWB.size()) >= 0 && (page - recipeListWB.size()) < recipeList.size() && recipeList.get(page - recipeListWB.size()) != null) {
                drawAssemblyBackground(recipeList, var5 - 125, var6 - 33, page - recipeListWB.size(), var9, "right");
                drawAssemblyBackground(recipeList, var5 - 50, var6 - 33, page - recipeListWB.size() - 1, var9, "left");
                RenderHelper.enableGUIStandardItemLighting();
                drawAssemblyRecipe(recipeList, var5 - 125, var6 - 33, page - recipeListWB.size(), var9, "right");
                drawAssemblyRecipe(recipeList, var5 - 50, var6 - 33, page - recipeListWB.size() - 1, var9, "left");
            }
        }
        GL11.glDisable(GL11.GL_LIGHTING);
    }


    private void drawAssemblyBackground(List<TierRecipe> recipeList, int var5, int var6, int page, int var9, String side) {
        if (page < 0)
            return;
        int tier = recipeList.get(page).getTier();
        if (tier == 1)
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.TEX_TIER_I));
        if (tier == 2)
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.TEX_TIER_II));
        if (tier == 3)
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.TEX_TIER_III));
        //if (side.equals("right"))
        //GL11.glScaled(0.7, 0.7, 0.7);
        if (side.equals("left"))
            this.drawTexturedModalRect(var5 + 70, var6 + 50, 0, 0, 177, 163);
        if (side.equals("right"))
            this.drawTexturedModalRect(var5 + 340, var6 + 50, 0, 0, 177, 163);
    }

    private void drawWorkBenchBackground(List<ShapedTrainRecipes> recipeListWB, int var5, int var6, int page, int var9, String side) {
        //int var4 = this.mc.renderEngine.getTexture("/gui/crafting.png");
        //GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix+"crafting_table.png"));
        if (side.equals("left"))
            this.drawTexturedModalRect(var5 + 20, var6 + 50, 0, 0, 177, 80);
        if (side.equals("right"))
            this.drawTexturedModalRect(var5 + 215, var6 + 50, 0, 0, 177, 80);
    }

    private void drawWorkBenchRecipe(List recipeList, int var5, int var6, int page, int var9, String side) {
        if (recipeList.get(page) == null)
            return;
        Object[] itemList = new ItemStack[9];
        ItemStack itemOutput = null;
        if (recipeList.get(page) instanceof ShapedTrainRecipes) {
            itemList = ((ShapedTrainRecipes) recipeList.get(page)).recipeItems;
            itemOutput = ((ShapedTrainRecipes) recipeList.get(page)).getRecipeOutput();
        }
        if (recipeList.get(page) instanceof ShapelessTrainRecipe) {
            List<ItemStack> itemListShapeless = ((ShapelessTrainRecipe) recipeList.get(page)).recipeItems;
            for (int t = 0; t < itemListShapeless.size(); t++) {
                if (itemListShapeless != null && itemListShapeless.get(t) != null)
                    itemList[t] = itemListShapeless.get(t);
            }
            itemOutput = ((ShapelessTrainRecipe) recipeList.get(page)).getRecipeOutput();
        }

        //System.out.println(itemOutput);
        int offset = 0;
        if (side.equals("right"))
            offset = 194;
        GL11.glEnable(32826);
        //if (itemList[0] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[0], var5 + 50 + offset, var6 + 67);
        //if (itemList[1] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[1], var5 + 68 + offset, var6 + 67);
        //if (itemList[2] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[2], var5 + 86 + offset, var6 + 67);
        //if (itemList[3] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[3], var5 + 50 + offset, var6 + 85);
        //if (itemList[4] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[4], var5 + 68 + offset, var6 + 85);
        //if (itemList[5] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[5], var5 + 86 + offset, var6 + 85);
        //if (itemList[6] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[6], var5 + 50 + offset, var6 + 103);
        //if (itemList[7] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[7], var5 + 68 + offset, var6 + 103);
        //if (itemList[8] != null)
        //    renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[8], var5 + 86 + offset, var6 + 103);
        if (itemOutput != null && itemOutput.getItem() !=null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemOutput, var5 + 145 + offset, var6 + 85);
        if (itemOutput != null && itemOutput.getItem() !=null)
            this.fontRendererObj.drawString(itemOutput.getItem().getItemStackDisplayName(itemOutput), var5 + 20 + offset, var6 + 40, 0);
        if (itemOutput != null)
            this.fontRendererObj.drawString("Crafted in: Train Workbench", var5 + 20 + offset, var6 + 130, 0);
        if (itemOutput != null) {
            for (int z = 0; z < RecipeBookHandler.vanillaWorkTableRecipes.length; z++) {
                if (itemOutput.getItem()!= null && RecipeBookHandler.vanillaWorkTableRecipes[z]!=null && RecipeBookHandler.vanillaWorkTableRecipes[z].equals(itemOutput.getItem().getItemStackDisplayName(itemOutput))) {
                    this.fontRendererObj.drawString("Also crafted in: Crafting Table", var5 + 20 + offset, var6 + 140, 0);
                    break;
                }
            }
        }
        GL11.glDisable(32826);
    }

    private void drawAssemblyRecipe(List<TierRecipe> recipeList, int var5, int var6, int page, int var9, String side) {
        if (page < 0)
            return;
        int tier = recipeList.get(page).getTier();

        List<ItemStack> itemList = recipeList.get(page).getInput();
        int offset = 0;
        if (side.equals("right"))
            offset = 271;
        GL11.glEnable(32826);
        if (itemList.get(0) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(0), var5 + 94 + offset, var6 + 76);
        if (itemList.get(0) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(0), var5 + 94 + offset, var6 + 76);
        if (itemList.get(1) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(1), var5 + 113 + offset, var6 + 143);
        if (itemList.get(1) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(1), var5 + 113 + offset, var6 + 143);
        if (itemList.get(2) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(2), var5 + 148 + offset, var6 + 143);
        if (itemList.get(2) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(2), var5 + 148 + offset, var6 + 143);
        if (itemList.get(3) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(3), var5 + 214 + offset, var6 + 143);
        if (itemList.get(3) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(3), var5 + 214 + offset, var6 + 143);
        if (itemList.get(4) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(4), var5 + 148 + offset, var6 + 77);
        if (itemList.get(4) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(4), var5 + 148 + offset, var6 + 77);
        if (itemList.get(5) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(5), var5 + 184 + offset, var6 + 77);
        if (itemList.get(5) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(5), var5 + 184 + offset, var6 + 77);
        if (itemList.get(6) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(6), var5 + 149 + offset, var6 + 110);
        if (itemList.get(6) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(6), var5 + 149 + offset, var6 + 110);
        if (itemList.get(7) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(7), var5 + 185 + offset, var6 + 110);
        if (itemList.get(7) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(7), var5 + 185 + offset, var6 + 110);
        if (itemList.get(8) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(8), var5 + 94 + offset, var6 + 110);
        if (itemList.get(8) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(8), var5 + 94 + offset, var6 + 110);
        if (itemList.get(9) != null)
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(9), var5 + 214 + offset, var6 + 77);
        if (itemList.get(9) != null)
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(9), var5 + 214 + offset, var6 + 77);
        ItemStack output = recipeList.get(page).getOutput();
        if (output != null && side.equals("left"))
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, output, var5 + 162, var6 + 177);
        if (output != null && side.equals("right"))
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, output, var5 + 432, var6 + 177);
        String name = "";
        if (output != null && output.getItem() instanceof ItemAbstractRollingStock)
            name = output.getDisplayName();
        if (side.equals("left")) {
            this.fontRendererObj.drawString("Tier: " + tier, var5 - var9 + this.bookImageWidth - 56, var6 + 40, 0);
            this.fontRendererObj.drawString(name, var5 - var9 + this.bookImageWidth - 55, var6 + 56, 0xffffff);
        }
        if (side.equals("right")) {
            this.fontRendererObj.drawString(name, var5 - var9 + this.bookImageWidth + 215, var6 + 56, 0xffffff);
            this.fontRendererObj.drawString("Tier: " + tier, var5 - var9 + this.bookImageWidth + 338, var6 + 40, 0);
        }
        GL11.glDisable(32826);
    }

    @Override
    public void onGuiClosed() {
        ItemRecipeBook.page = this.currPage;
        ItemRecipeBook.recipe = this.currRecipe;
        this.itemstackBook.getTagCompound().setInteger("currPage", this.currPage);
        this.itemstackBook.getTagCompound().setInteger("currRecipe", this.currRecipe);
        super.onGuiClosed();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    protected void keyTyped(char par1, int par2) {
        if(par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
            this.mc.thePlayer.closeScreen();
        }
    }


}