package train.common.inventory;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import train.common.core.interfaces.ITCRecipe;
import train.common.recipes.OpenHearthFurnaceRecipe;
import train.common.recipes.ITCRecipe.ShapedTrainRecipes;
import train.common.recipes.ITCRecipe.ShapelessTrainRecipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TrainCraftingManager {
	/** The static instance of this class */
	public static final TrainCraftingManager instance = new TrainCraftingManager();

	/** A list of all the recipes added */
	private List recipes = new ArrayList();

	public void AddShapedRecipe(ShapedTrainRecipes shapedTrainRecipe)
	{
		this.shapedRecipes.add(shapedTrainRecipe);
	}

	public void AddRecipe(ShapedTrainRecipes shapedTrainRecipe)
	{
		this.recipes.add(shapedTrainRecipe);
	}

	private final ArrayList<ShapedTrainRecipes> shapedRecipes = new ArrayList<ShapedTrainRecipes>();

	/** Recipes for openHearthFurnace */
	private final HashMap<Integer, ArrayList<Integer>> hearthFurnaceMap = new HashMap();
	private final ArrayList<OpenHearthFurnaceRecipe> hearthFurnaceRecipes = new ArrayList<OpenHearthFurnaceRecipe>();
	private final HashMap<Integer, Float> hearthFurnaceXpMap = new HashMap();
	
	public static final TrainCraftingManager getInstance() {
		return instance;
	}

	private TrainCraftingManager() {}


	public void addRecipe(ItemStack output, Object... recipe) {
		String var3 = "";
		int idx = 0;
		int var5 = 0;
		int var6 = 0;

		if (recipe[idx] instanceof String[]) {
			String[] var7 = (String[]) recipe[idx++];

			for (int var8 = 0; var8 < var7.length; ++var8) {
				String var9 = var7[var8];
				++var6;
				var5 = var9.length();
				var3 = var3 + var9;
			}
		}
		else {
			while (recipe[idx] instanceof String) {
				String var11 = (String) recipe[idx++];
				++var6;
				var5 = var11.length();
				var3 = var3 + var11;
			}
		}

		HashMap<Character, Object> itemMap = new HashMap<Character, Object>();

		for (;idx < recipe.length; idx += 2)
		{
			Character chr = (Character) recipe[idx];

			Object in = recipe[idx + 1];

			if (in instanceof Item) {
				itemMap.put(chr, new ItemStack((Item) in));
			}
			else if (in instanceof Block) {
				itemMap.put(chr, new ItemStack((Block) in, 1, -1));
			}
			else if (in instanceof ItemStack) {
				itemMap.put(chr, (ItemStack) in);
			}
			else if (in instanceof String)
			{
				itemMap.put(chr, in);
			}

		}

		Object[] var15 = new Object[9];

		for (int var16 = 0; var16 < var5 * var6; ++var16) {
			char var10 = var3.charAt(var16);

			if (itemMap.containsKey(var10)) {

				Object ingredient = itemMap.get(var10);

				if (ingredient instanceof ItemStack) {
					var15[var16] = ((ItemStack) ingredient).copy();
				}
				else if (ingredient instanceof String) {
					// OreDictionary entry
					var15[var16] = ingredient;
				}

			} else {
				var15[var16] = null;
			}
		}

		this.recipes.add(new ShapedTrainRecipes(var5, var6, var15, output));
		this.shapedRecipes.add(new ShapedTrainRecipes(var5, var6, var15, output));
	}

	public void addShapelessRecipe(ItemStack par1ItemStack, Object... obj) {
		ArrayList var3 = new ArrayList();

		for (Object tempobj : obj) {

			if (tempobj instanceof ItemStack) {
				var3.add(((ItemStack) tempobj).copy());
			}
			else if (tempobj instanceof Item) {
				var3.add(new ItemStack((Item) tempobj));
			}
			else {
				if (!(tempobj instanceof Block)) {
					throw new RuntimeException("Invalid shapeless recipe!");
				}
				var3.add(new ItemStack((Block) tempobj));
			}
		}
		this.recipes.add(new ShapelessTrainRecipe(par1ItemStack, var3));
	}

	public ItemStack func_82787_a(IInventory inv, World world) {
		int occupedSlot = 0;
		ItemStack var3 = null;
		ItemStack var4 = null;
		int var5;

		for (var5 = 0; var5 < inv.getSizeInventory(); ++var5) {
			ItemStack var6 = inv.getStackInSlot(var5);

			if (var6 != null) {
				if (occupedSlot == 0) {
					var3 = var6;
				}

				if (occupedSlot == 1) {
					var4 = var6;
				}
				++occupedSlot;
			}
		}

		if (occupedSlot == 2 && var3.getItem() == var4.getItem() && var3.stackSize == 1 && var4.stackSize == 1 && var3.getItem().isRepairable()) {
			Item var11 = var3.getItem();
			int var10 = var11.getMaxDamage() - var3.getItemDamageForDisplay();
			int var7 = var11.getMaxDamage() - var4.getItemDamageForDisplay();
			int var8 = var10 + var7 + var11.getMaxDamage() * 10 / 100;
			int var9 = var11.getMaxDamage() - var8;

			if (var9 < 0) {
				var9 = 0;
			}
			return new ItemStack(var3.getItem(), 1, var9);
		}
		else {
			for (var5 = 0; var5 < this.recipes.size(); ++var5) {
				ITCRecipe recipe = (ITCRecipe) this.recipes.get(var5);
				if (recipe.matches(inv, world)) {
					return recipe.getCraftingResult(inv);
				}
			}
			return null;
		}
	}

	/**
	 * returns the List<> of all recipes
	 */
	public List getRecipeList() {
		return this.recipes;
	}
	
	public List<ShapedTrainRecipes> getShapedRecipes() {
        return Collections.unmodifiableList(shapedRecipes);
	}
	
	public void addHearthFurnaceRecipe(ItemStack item1, ItemStack item2, ItemStack output, float xp, int cooktime){
		if(getHearthFurnaceRecipe(item1, item2, true) != null){
			return;
		}
		
		int id1 = Item.getIdFromItem(item1.getItem());
		int id2 = Item.getIdFromItem(item2.getItem());
		
		hearthFurnaceRecipes.add(new OpenHearthFurnaceRecipe(item1, item2, output, cooktime));
		int recipeID = hearthFurnaceRecipes.size()-1;
		
		addIDtoHearthFurnaceMap(id1, recipeID);
		addIDtoHearthFurnaceMap(id2, recipeID);
		
		this.hearthFurnaceXpMap.put(Item.getIdFromItem(output.getItem()), xp);
	}
	
	public void addIDtoHearthFurnaceMap(int itemID, int recipeID){
		ArrayList<Integer> list = hearthFurnaceMap.remove(itemID);
		if(list == null){
			list = new ArrayList<Integer>();
		}
		list.add(recipeID);
		hearthFurnaceMap.put(itemID, list);
	}
		
	public OpenHearthFurnaceRecipe getHearthFurnaceRecipe(ItemStack item1, ItemStack item2, boolean onAdd){
		if(item1 == null || item2 == null)
			return null;
		
		int id1 = Item.getIdFromItem(item1.getItem());
		int id2 = Item.getIdFromItem(item2.getItem());
		
		ArrayList<Integer> recipes = hearthFurnaceMap.get(id1);
		if(recipes == null)
			return null;
		
		for(int recipeID : recipes){
			if(hearthFurnaceRecipes.get(recipeID).matches(new ItemStack[]{item1, item2})){
				return hearthFurnaceRecipes.get(recipeID);
			}
		}
		
		if(!onAdd){
			return null;
		}
		
		recipes = hearthFurnaceMap.get(id2);
		for(int recipeID : recipes){
			if(hearthFurnaceRecipes.get(recipeID).matches(new ItemStack[]{item1, item2})){
				return hearthFurnaceRecipes.get(recipeID);
			}
		}
		
		return null;
	}
	
	public int getHearthFurnaceRecipeDuration(ItemStack item1, ItemStack item2){
		OpenHearthFurnaceRecipe recipe = getHearthFurnaceRecipe(item1, item2, false);
		if(recipe != null)
			return recipe.getCooktime();
		return 600;
	}
	
	public ItemStack getHearthFurnaceRecipeResult(ItemStack item1, ItemStack item2){
		OpenHearthFurnaceRecipe recipe = getHearthFurnaceRecipe(item1, item2, false);
		if(recipe != null)
			return recipe.getCraftingResult();
		return null;
	}
	
	public float getHearthFurnaceRecipeExperience(ItemStack output){
		Object out = this.hearthFurnaceXpMap.get(Item.getIdFromItem(output.getItem()));
		if(out != null)
			return (Float) out;
		return 0;
	}
	
	public ArrayList<OpenHearthFurnaceRecipe> getHearthFurnaceRecipeList(){
		return hearthFurnaceRecipes;
	}
}
