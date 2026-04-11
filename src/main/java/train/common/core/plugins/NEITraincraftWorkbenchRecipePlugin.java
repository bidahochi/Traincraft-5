package train.common.core.plugins;

import codechicken.nei.NEIClientUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.ShapedRecipeHandler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.oredict.OreDictionary;
import train.client.gui.GuiTrainCraftingBlock;
import train.common.inventory.TrainCraftingManager;
import train.common.library.Info;
import train.common.recipes.ITCRecipe.ShapedTrainRecipes;
import train.common.recipes.ITCRecipe.ShapelessTrainRecipe;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NEITraincraftWorkbenchRecipePlugin extends ShapedRecipeHandler {
	private List<ShapedTrainRecipes> recipeListWB = workbenchListCleaner(TrainCraftingManager.getInstance().getShapedRecipes());

	private CachedShapedRecipe getShape(ShapedTrainRecipes recipe) {
		CachedShapedRecipe shape = new CachedShapedRecipe(0, 0, null, recipe.getRecipeOutput());
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (recipe.recipeItems[y * 3 + x] == null) {
					continue;
				}

				Object filteredObject = recipe.recipeItems [y * 3 + x];



				if (filteredObject instanceof String)
				{
					filteredObject = ShapedTrainRecipes.getOreVariants((String) filteredObject);
				}

				PositionedStack stack = new PositionedStack(filteredObject, 25 + x * 18, 6 + y * 18);
				stack.setMaxSize(1);
				shape.ingredients.add(stack);
			}
		}
		shape.result.relx = 119;
		shape.result.rely = 25;
		return shape;
	}

	public class CachedShapedRecipe extends CachedRecipe {
		public ArrayList<PositionedStack> ingredients;
		public PositionedStack result;

		public CachedShapedRecipe(int width, int height, Object[] items, ItemStack out) {
			result = new PositionedStack(out, 119, 24);
			ingredients = new ArrayList<PositionedStack>();
			setIngredients(width, height, items);
		}

		public CachedShapedRecipe(ShapedRecipes recipe) {
			this(recipe.recipeWidth, recipe.recipeHeight, recipe.recipeItems, recipe.getRecipeOutput());
		}

		/**
		 * @param width
		 * @param height
		 * @param items
		 * an ItemStack[] or ItemStack[][]
		 */
		public void setIngredients(int width, int height, Object[] items) {
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					if (items[y * width + x] == null) continue;

					PositionedStack stack = new PositionedStack(items[y * width + x], 25 + x * 18, 6 + y * 18, false);
					stack.setMaxSize(1);
					ingredients.add(stack);
				}
			}
		}

		@Override
		public List<PositionedStack> getIngredients() {
			return getCycledIngredients(cycleticks % 20, ingredients);
		}

		public PositionedStack getResult() {
			return result;
		}

		public void computeVisuals() {
			for (PositionedStack p : ingredients)
				p.generatePermutations();

			result.generatePermutations();
		}

		/**
		 * This will perform default cycling of ingredients, mulitItem capable
		 * 
		 * @return
		 */
		private int cycleTicks = 0;

		@Override
		public List<PositionedStack> getCycledIngredients(int cycle, List<PositionedStack> ingredients) {
			cycleTicks++;
			final int CYCLE_DELAY = 15;
			for (int itemIndex = 0; itemIndex < ingredients.size(); itemIndex++)
			{
				PositionedStack stack = ingredients.get(itemIndex);
				ItemStack item = stack.item;

				// Get the OreDictionary name
				String oreName = OreDictionary.getOreName(OreDictionary.getOreID(item));

				// Check if we need to cycle ore-dictionary variants
				if (oreName != null)
				{
					List<ItemStack> oreList = OreDictionary.getOres(oreName);

					// Apply strict filtering for dyes: only include stacks with the same metadata
					if (oreName.startsWith("dye")) {
						final int itemMeta = item.getItemDamage(); // current item's metadata
						oreList = oreList.stream()
								.filter(s -> {
									int meta = s.getItemDamage();
									// Match only if metadata is the same OR the OreDictionary entry is not a wildcard
									return meta == itemMeta || meta != OreDictionary.WILDCARD_VALUE;
								})
								.map(ItemStack::copy)
								.collect(Collectors.toList());
					}

					// Only cycle every 15 ticks
					if (cycleTicks % CYCLE_DELAY == 0 && !oreList.isEmpty()) {

						// Keep the original stack size
						int stackSize = item.stackSize;

						// Use a stable index for cycling
						int index = Math.floorMod((cycle + itemIndex), oreList.size());

						// Assign a new item but preserve size
						ItemStack next = oreList.get(index).copy();
						next.stackSize = stackSize;

						stack.item = next;
					}
				}
				else
				{
					randomRenderPermutation(ingredients.get(itemIndex), cycle + itemIndex);
				}
			}

			return ingredients;
		}
	}

	@Override
	public void loadCraftingRecipes(ItemStack result) {
		for (ShapedTrainRecipes recipe : recipeListWB) {
			if (NEIClientUtils.areStacksSameTypeCrafting(recipe.getRecipeOutput(), result)) {
				this.arecipes.add(getShape(recipe));
			}
		}
	}

	@Override
	public Class<? extends GuiContainer> getGuiClass() {
		return GuiTrainCraftingBlock.class;
	}

	@Override
	public String getRecipeName() {
		return "Train Workbench";
	}

	@Override
	public String getGuiTexture()
	{
		return "tc:textures/gui/crafting_table.png";
	}

	@Override
	public boolean hasOverlay(GuiContainer gui, Container container, int recipe) {
		return false;
	}

	@Override
	public void loadTransferRects() {
		transferRects.add(new RecipeTransferRect(new Rectangle(84, 23, 24, 18), "train workbench"));
	}

	@Override
	public void loadUsageRecipes(ItemStack ingredient) {
		for (ShapedTrainRecipes recipe : recipeListWB) {
			for (Object source : recipe.recipeItems)
			{
				if (source instanceof ItemStack)
				{
					if (NEIClientUtils.areStacksSameTypeCrafting((ItemStack)source, ingredient)) {
						this.arecipes.add(getShape(recipe));
						break;
					}
				}
				else if(source instanceof String)
				{
					for (ItemStack stack : ShapedTrainRecipes.getOreVariants((String) source))
					{
						if (NEIClientUtils.areStacksSameTypeCrafting(stack, ingredient)) {
							this.arecipes.add(getShape(recipe));
							break;
						}
					}
				}
			}
		}
	}

	@Override
	public void loadCraftingRecipes(String outputId, Object... results) {
		if (outputId.equals("train workbench") && getClass() == NEITraincraftWorkbenchRecipePlugin.class) {
			for (ShapedTrainRecipes recipe : recipeListWB) {
				this.arecipes.add(getShape(recipe));
			}
		}
		else {
			super.loadCraftingRecipes(outputId, results);
		}
	}

	public static List workbenchListCleaner(List recipeList) {
		ArrayList outputList = new ArrayList();
		ArrayList cleanedList = new ArrayList();
		for (int i = 0; i < recipeList.size(); i++) {
			if (recipeList.get(i) instanceof ShapedTrainRecipes) {
				if (outputList != null) {
					if (!outputList.contains(((ShapedTrainRecipes) recipeList.get(i)).getRecipeOutput().getItem())) {
						cleanedList.add(recipeList.get(i));
					}
				}
				else {
					cleanedList.add(recipeList.get(i));
				}
				outputList.add(((ShapedTrainRecipes) recipeList.get(i)).getRecipeOutput().getItem());
			}
			if (recipeList.get(i) instanceof ShapelessTrainRecipe) {

				if (outputList != null) {
					if (!outputList.contains(((ShapelessTrainRecipe) recipeList.get(i)).getRecipeOutput().getItem())) {
						cleanedList.add(recipeList.get(i));
					}
				}
				else {
					cleanedList.add(recipeList.get(i));
				}
				outputList.add(((ShapelessTrainRecipe) recipeList.get(i)).getRecipeOutput().getItem());
			}
		}
		return cleanedList;
	}
}