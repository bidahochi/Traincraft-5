package com.jcirmodelsquad.tcjcir.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.library.ItemIDs;

public class DieselRecipes extends AbstractRecipeHandler {
    public DieselRecipes(ITierCraftingManager cm)
    {

        //doing bap recipes first
        //example of item order
        //cm.addRecipe(3, null, null, null, null, null, null, null, null, null, null, new ItemStack(ItemIDs.pennCentral.item, 1), 1);

        //=================== TIER II ==================//

        //bap teir 2 first for organization reasons and cus im a greedy fuck


        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), LIGHT_GRAY_DYE, new ItemStack(ItemIDs.minecartF3A.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, LIGHT_GRAY_DYE, new ItemStack(ItemIDs.minecartF3B.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartF7A.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, BLACK_DYE, new ItemStack(ItemIDs.minecartF7B.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartF9A.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, GREEN_DYE, new ItemStack(ItemIDs.minecartF9B.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartFP7A.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartFP9A.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartF7A.item, 1), null, null, YELLOW_DYE, new ItemStack(ItemIDs.minecartCF7angle.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartF7A.item, 1), null, null, YELLOW_DYE, new ItemStack(ItemIDs.minecartCF7round.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartE8A.item, 1), null, new ItemStack(ItemIDs.controls.item, 1), CYAN_DYE, new ItemStack(ItemIDs.minecartCE8.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), WHITE_DYE, new ItemStack(ItemIDs.minecartGP7.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), null, new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartGP7b.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartGP9.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), null, new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartGP9b.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, SteelIngot(3), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartGP7.item, 1), null, null, YELLOW_DYE, new ItemStack(ItemIDs.minecartGP7u.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, SteelIngot(3), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartGP7.item, 1), null, null, YELLOW_DYE, new ItemStack(ItemIDs.minecartGP7f.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartGP18.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecartGP30.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecartGP35.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecartGP20.item, 1), 1);


        //phase 2 babyface
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), CYAN_DYE, new ItemStack(ItemIDs.minecartDR441500Phase2.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, CYAN_DYE, new ItemStack(ItemIDs.minecartDR441500BPhase2.item, 1), 1);

        //phase 3 babyface (sharknose)
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(4), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartDR441500Shark.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, RED_DYE, new ItemStack(ItemIDs.minecartDR441500BShark.item, 1), 1);

        //RF-16
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(4), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartRF16.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, BLACK_DYE, new ItemStack(ItemIDs.minecartRF16B.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), LIGHT_GRAY_DYE, new ItemStack(ItemIDs.minecartU18BWH.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), LIGHT_GRAY_DYE, new ItemStack(ItemIDs.minecartU18BW.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartU18Balt.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartU23B.item, 1), 1);

        //u23bw
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartU23BW.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, SteelIngot(1), SteelIngot(3), null, new ItemStack(ItemIDs.partComponentGE.item, 2), new ItemStack(ItemIDs.minecartU23B.item, 1), null, new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartSF30B.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartU25B.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), BROWN_DYE, new ItemStack(ItemIDs.minecartU30BH.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), PURPLE_DYE, new ItemStack(ItemIDs.minecartU36B.item, 1), 1);

        //u23c
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB3.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), LIGHT_BLUE_DYE, new ItemStack(ItemIDs.minecartU23C.item, 1), 1);

        //u30c
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB3.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), LIGHT_BLUE_DYE, new ItemStack(ItemIDs.minecartU30C.item, 1), 1);

        //u50
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 4), new ItemStack(ItemIDs.steelframe.item, 6), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartU50.item, 1), 1);


        //u56
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 4), new ItemStack(ItemIDs.steelframe.item, 6), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentCEE.item, 8), new ItemStack(ItemIDs.partAlternator.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.controls.item, 1), CYAN_DYE, new ItemStack(ItemIDs.minecartU56.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), LIGHT_GRAY_DYE, new ItemStack(ItemIDs.minecartSB18R.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), LIGHT_GRAY_DYE, new ItemStack(ItemIDs.minecartSB18E.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), LIGHT_GRAY_DYE, new ItemStack(ItemIDs.minecartSB18B.item, 1), 1);

        //b23
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartB23.item, 1), 1);

        //super7 & bq23
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, SteelIngot(3), null, new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.minecartU23B.item, 3), new ItemStack(ItemIDs.partComponentGE.item, 3), null, GRAY_DYE, new ItemStack(ItemIDs.minecartB23S7.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 4), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartBQ23.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartB30.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartB36.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), PINK_DYE, new ItemStack(ItemIDs.minecartSB36X.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecartSW1.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecartSW8.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecartSW9.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), WHITE_DYE, new ItemStack(ItemIDs.minecartSW900.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartSW1000.item, 1), 1);

        //sw1500
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), LIGHT_BLUE_DYE, new ItemStack(ItemIDs.minecartSW1500.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), CYAN_DYE, new ItemStack(ItemIDs.minecartMP900.item, 1), 1);

        //tr4
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartTR4.item, 1), 1);
        cm.addRecipe(2, null, new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartTR4B.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), LIME_DYE, new ItemStack(ItemIDs.minecartSW1200.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 2), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecart4ED172T.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartSD9.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartVO1000.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 2), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartS12.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartDS441000.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentFM.item, 2), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartH1044.item, 1), 1);

        //h16-66
        cm.addRecipe(2, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 3), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentFM.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartH16_66.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentFM.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartH24_66.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartS2.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.partTypeA.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartHH660.item, 1), 1);

        //todo redo this at somepoint to be a rebuild of regular FA
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), CYAN_DYE, new ItemStack(ItemIDs.minecartFAFDL.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, CYAN_DYE, new ItemStack(ItemIDs.minecartFBFDL.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecartRS1.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartRS2.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartRS3.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 5), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), PURPLE_DYE, new ItemStack(ItemIDs.minecartC415H.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 5), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartC415S.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 5), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartC415L.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartC424.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartC425.item, 1), 1);

        //dh643
        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.transmition.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartDH643.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 4), new ItemStack(ItemIDs.steelframe.item, 6), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentALCO.item, 6), new ItemStack(ItemIDs.generator.item, 6), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartC855a.item, 1), 1);
        cm.addRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 1), new ItemStack(ItemIDs.partTypeB.item, 4), new ItemStack(ItemIDs.steelframe.item, 6), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentALCO.item, 6), new ItemStack(ItemIDs.generator.item, 6), new ItemStack(ItemIDs.dieselengine.item, 5), null, YELLOW_DYE, new ItemStack(ItemIDs.minecartC855b.item, 1), 1);

        cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartTB27.item, 1), 1);


        cm.addRecipe(2, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(2), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.generator.item, 3), GREEN_DYE, new ItemStack(ItemIDs.minecartDD55.item, 1), 1);


        //=================== TIER III =================//


        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartM420.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartM420B.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartM630.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartM630R.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartM630W.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 4), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartM640.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartM636.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 4), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartM640W.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartM636R.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartGP15.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartGP15T.item, 1), 1);

        //gp38
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartGP38.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartGP38dash2.item, 1), 1);


        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartGP39.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), LIME_DYE, new ItemStack(ItemIDs.minecartGP39Dash2.item, 1), 1);

        //gp40
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartGP40.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartGP40Dash2.item, 1), 1);


        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), CYAN_DYE, new ItemStack(ItemIDs.minecartDash818BE.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB3.item, 2), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), CYAN_DYE, new ItemStack(ItemIDs.minecartDash839CE.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), WHITE_DYE, new ItemStack(ItemIDs.minecartDash832BWH.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB3.item, 2), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), WHITE_DYE, new ItemStack(ItemIDs.minecartDash940C.item, 1), 1);

        //c39-8
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB3.item, 2), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), LIGHT_BLUE_DYE, new ItemStack(ItemIDs.minecartDash839C.item, 1), 1);

        //b39-8
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartDash839B.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB3.item, 2), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(6), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartDash841C.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(6), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 5), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartAC4400CW.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(6), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 5), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), GREEN_DYE, new ItemStack(ItemIDs.minecartAC4400C.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartP32.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartGeGenesis.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartP42.item, 1), 1);


        //sd38
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), RED_DYE, new ItemStack(ItemIDs.minecartSD38.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), ORANGE_DYE, new ItemStack(ItemIDs.minecartSD39.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), BLUE_DYE, new ItemStack(ItemIDs.minecartSD40.item, 1), 1);

        //sd40-2
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartSD40dash2.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartSD40T2.item, 1), 1);
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartSD40A.item, 1), 1);

        //sdp40
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartSDP40.item, 1), 1);

        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), BLACK_DYE, new ItemStack(ItemIDs.minecartSDP45.item, 1), 1);

        //sd50
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), GRAY_DYE, new ItemStack(ItemIDs.minecartSD50.item, 1), 1);

        //sd60
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), LIGHT_BLUE_DYE, new ItemStack(ItemIDs.minecartSD60.item, 1), 1);

        //sd70ace
        cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), SteelIngot(3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), YELLOW_DYE, new ItemStack(ItemIDs.minecartSD70ACe.item, 1), 1);


    }
}
