/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.ItemFluidContainer;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.Traincraft;
import train.common.api.*;
import train.common.entity.rollingStock.freight.*;
import train.common.enums.CargoItemFilter;
import train.common.items.ItemBlockOreTC;
import train.common.items.ItemTCRail;
import train.common.slots.util.ItemKey;
import train.common.slots.util.NbtContentsRule;
import train.common.slots.util.NonemptyContainerBlacklist;
import train.common.utils.devutils.DebugUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ItemHandler
{
	/** Active full cargo bans; contents rules cannot relax entries in this set. */
	public static final Set<ItemKey> BANNED_ITEMS = new HashSet<>();
	private static final Logger BLACKLIST_LOG = LogManager.getLogger("TraincraftInventoryBlacklist");
	private static final int WILDCARD_METADATA = -1;
	private static final int MAX_METADATA = 32767;
	private static final int MAX_METADATA_SELECTOR_LENGTH = 512;
	private static NonemptyContainerBlacklist nonemptyBlacklist = new NonemptyContainerBlacklist(
			Collections.<ItemKey>emptySet(), Collections.<NbtContentsRule>emptyList());

	/**
	 * Replaces unconditional bans after optional-mod items are registered, then clears
	 * the consumed raw config array. Missing mods are skipped; malformed metadata
	 * fully bans every variant of an identifiable item.
	 */
	public static void parseBannedItems(String[] entries)
	{
		BANNED_ITEMS.clear();
		parseBlacklistEntries(entries, BANNED_ITEMS, new HashSet<ItemKey>());
		ConfigHandler.ROLLINGSTOCK_INVENTORY_BLACKLIST_RAW = null;
	}

	/**
	 * Replaces the contents policy at post-init using the configured reader paths.
	 * An absent raw reader array uses defaults; an explicitly empty array disables
	 * readers and fully bans listed items. Both consumed config arrays are cleared.
	 */
	public static void parseNonemptyBannedItems(String[] entries)
	{
		String[] readers = ConfigHandler.ROLLINGSTOCK_CONTAINER_CONTENTS_RULES_RAW;
		if (readers == null)
		{
			readers = ConfigHandler.getDefaultContainerContentsRules();
		}
		parseNonemptyBannedItems(entries, readers);
	}

	/**
	 * Resolves item membership and NBT readers before installing a replacement policy.
	 * Invalid metadata retains a wildcard ban; missing or invalid readers cannot
	 * allow empty containers. Optional mods without registered items are skipped.
	 * Startup warnings identify these fallbacks, and both raw config arrays are cleared.
	 *
	 * @param entries blacklist selectors, or null to clear the contents policy
	 * @param readers selector/path definitions, or null to provide no readers
	 */
	public static void parseNonemptyBannedItems(String[] entries, String[] readers)
	{
		Set<ItemKey> parsed = new HashSet<>();
		Set<ItemKey> invalid = new HashSet<>();
		parseBlacklistEntries(entries, parsed, invalid);
		List<NbtContentsRule> rules = new ArrayList<NbtContentsRule>();
		for (ItemKey selector : invalid)
		{
			rules.add(new NbtContentsRule(selector, ""));
		}
		if (parsed.isEmpty() == false && readers != null)
		{
			for (String reader : readers)
			{
				if (reader == null || reader.trim().isEmpty())
				{
					continue;
				}
				String[] parts = reader.split("\\|", -1);
				Set<ItemKey> selectors = new HashSet<>();
				Set<ItemKey> invalidReaders = new HashSet<>();
				String[] readerSelectors =
				{
					parts[0]
				};
				parseBlacklistEntries(readerSelectors, selectors, invalidReaders);
				String path = parts.length == 2 ? parts[1] : "";
				for (ItemKey selector : selectors)
				{
					NbtContentsRule rule = new NbtContentsRule(selector,
							invalidReaders.contains(selector) ? "" : path);
					rules.add(rule);
					if (rule.isValid() == false)
					{
						BLACKLIST_LOG.warn("Invalid container contents rule '{}'; matching listed items are fully banned.", reader);
					}
				}
			}
		}
		nonemptyBlacklist = new NonemptyContainerBlacklist(parsed, rules);
		for (ItemKey entry : parsed)
		{
			boolean hasReader = false;
			for (NbtContentsRule rule : rules)
			{
				ItemKey selector = rule.getSelector();
				if (selector.item == entry.item && (entry.meta == WILDCARD_METADATA
						|| selector.meta == WILDCARD_METADATA || selector.meta == entry.meta))
				{
					hasReader = true;
					break;
				}
			}
			if (hasReader == false)
			{
				BLACKLIST_LOG.warn("No contents reader for {}:{}; this listed item is fully banned.",
						Item.itemRegistry.getNameForObject(entry.item), entry.meta);
			}
		}
		ConfigHandler.ROLLINGSTOCK_INVENTORY_NONEMPTY_BLACKLIST_RAW = null;
		ConfigHandler.ROLLINGSTOCK_CONTAINER_CONTENTS_RULES_RAW = null;
	}

	/** Returns an immutable snapshot of the configured conditional entries. */
	public static Set<ItemKey> getNonemptyBannedItems()
	{
		return nonemptyBlacklist.getEntries();
	}

	/** Returns the complete immutable reader definitions sent at login. */
	public static List<NbtContentsRule> getContainerContentsRules()
	{
		return nonemptyBlacklist.getRules();
	}

	/**
	 * Replaces server-provided bans and readers on the client thread, including empty
	 * collections. Local readers are never substituted: missing readers fully ban
	 * listed items. Caller collections are copied before modifying the active policy.
	 */
	public static void applySyncedBannedItems(Set<ItemKey> banned,
			Set<ItemKey> nonemptyBanned, List<NbtContentsRule> rules)
	{
		Set<ItemKey> bannedSnapshot = new HashSet<>(banned);
		NonemptyContainerBlacklist contentsPolicy = new NonemptyContainerBlacklist(nonemptyBanned, rules);
		BANNED_ITEMS.clear();
		BANNED_ITEMS.addAll(bannedSnapshot);
		nonemptyBlacklist = contentsPolicy;
	}

	/**
	 * Adds resolved selectors to the target and records malformed metadata as wildcard
	 * bans in invalid. The contents policy uses those markers to prevent valid readers
	 * from relaxing a malformed entry. Missing optional mods and blank entries are skipped.
	 * Ranges are validated before direct insertion; lists are staged until every value is valid.
	 */
	private static void parseBlacklistEntries(String[] entries, Set<ItemKey> target,
			Set<ItemKey> invalid)
	{
		if (entries == null)
		{
			return;
		}

		for (String line : entries)
		{
			if (line == null)
			{
				continue;
			}

			line = line.trim();
			if (line.isEmpty())
			{
				continue;
			}

			String modid = "minecraft";
			String name;
			String metaPart = null;

			String[] split = line.split(":", -1);

			if (split.length == 1)
			{
				name = split[0];
			}
			else if (split.length == 2)
			{
				modid = split[0];
				name  = split[1];
			}
			else
			{
				modid = split[0];
				name  = split[1];
				metaPart = split[2];
			}

			Item item = GameRegistry.findItem(modid, name);
			if (item == null)
			{
				continue;
			}

			if (metaPart == null || (split.length == 3 && (metaPart.equals("*") || metaPart.equals("-1"))))
			{
				target.add(new ItemKey(item, WILDCARD_METADATA));
				continue;
			}

			Set<Integer> metadataValues = Collections.emptySet();
			boolean valid = split.length == 3 && metaPart.length() <= MAX_METADATA_SELECTOR_LENGTH
					&& metaPart.matches("[0-9]{1,5}(-[0-9]{1,5}|(,[0-9]{1,5})*)");
			if (valid && metaPart.contains("-"))
			{
				String[] range = metaPart.split("-");
				int start = Integer.parseInt(range[0]);
				int end   = Integer.parseInt(range[1]);
				valid = start <= end && end <= MAX_METADATA;
				if (valid)
				{
					for (int metadata = start; metadata <= end; metadata++)
					{
						target.add(new ItemKey(item, metadata));
					}
					continue;
				}
			}
			else if (valid)
			{
				metadataValues = new HashSet<Integer>();
				for (String metadata : metaPart.split(","))
				{
					int value = Integer.parseInt(metadata);
					if (value > MAX_METADATA)
					{
						valid = false;
						break;
					}
					metadataValues.add(value);
				}
			}
			if (valid == false)
			{
				ItemKey fallback = new ItemKey(item, WILDCARD_METADATA);
				target.add(fallback);
				invalid.add(fallback);
				BLACKLIST_LOG.warn("Invalid blacklist selector '{}'; all metadata of this item are fully banned.", line);
				continue;
			}
			for (int metadata : metadataValues)
			{
				target.add(new ItemKey(item, metadata));
			}
		}
	}


	public static boolean handleItems(Entity entity, ItemStack itemstack) {
		if (itemstack != null) {
			if (entity instanceof Freight) {
				return handleFreight(entity, itemstack);
			} else if (entity instanceof DieselTrain) {
				return false;
			} else if (entity instanceof ElectricTrain) {
				return false;
			} else if (entity instanceof SteamTrain) {
				return false;
			} else if (entity instanceof Tender) {
				return false;
			} else {
				return false;
			}
		}
		return false;
	}

	/** Applies unconditional bans first, then tests configured containers for current contents. */
	public static boolean isBanned(ItemStack stack)
	{
		for (ItemKey key : BANNED_ITEMS)
		{
			if (key.matches(stack))
			{
				return true;
			}
		}
		return nonemptyBlacklist.isBanned(stack);
	}

	/**
	 * Finds a filled or unverified container and captures the verdict that prevents boarding.
	 * Reads all ordinary player slots and the cursor without changing them. Only the
	 * nonempty list applies; unconditional cargo bans do not restrict what players carry.
	 * Returns null when disabled or no carried stack matches. Nested mod inventories
	 * are not opened or searched. Each visited slot is inspected once, and a result
	 * is allocated only when boarding is denied. Consume it immediately; later boarding
	 * attempts inspect the current inventory again.
	 */
	public static BoardingRestriction findBoardingRestriction(InventoryPlayer inventory)
	{
		if (ConfigHandler.ROLLINGSTOCK_BOARDING_BAN_NONEMPTY_CONTAINERS == false
				|| nonemptyBlacklist.getEntries().isEmpty())
		{
			return null;
		}
		int inventorySize = inventory.getSizeInventory();
		// Treat the cursor as the final carried slot so all stacks share one inspection path.
		for (int slot = 0; slot <= inventorySize; slot++)
		{
			ItemStack stack = slot == inventorySize
					? inventory.getItemStack() : inventory.getStackInSlot(slot);
			if (stack == null || stack.stackSize <= 0)
			{
				continue;
			}
			NbtContentsRule.Result contents = nonemptyBlacklist.inspect(stack);
			if (contents != NbtContentsRule.Result.EMPTY)
			{
				return new BoardingRestriction(stack, contents);
			}
		}
		return null;
	}

	public static boolean handleFreight(Entity entity, ItemStack itemstack)
	{
		if(itemstack == null)
		{
			return false;
		}

		Block block = Block.getBlockFromItem(itemstack.getItem());
		if (block == null)
		{
			return false;
		}

		if (isBanned(itemstack))
		{
			return false;
		}

		if (entity instanceof AbstractStandardFreightCar)
		{
			AbstractStandardFreightCar car = (AbstractStandardFreightCar) entity;
			int oreDicID;
			switch (car.GetCargoFilterCategory())
			{
				case WOOD_PRODUCTS:
					oreDicID = OreDictionary.getOreID(itemstack);
					return oreDicID == OreDictionary.getOreID("plankWood")
							|| oreDicID == OreDictionary.getOreID("logWood")
							|| oreDicID == OreDictionary.getOreID("slabWood")
							|| oreDicID == OreDictionary.getOreID("stairWood")
							|| oreDicID == OreDictionary.getOreID("woodRubber")
							|| oreDicID == OreDictionary.getOreID("drywallFinished")
							|| itemstack.getItem() == Item.getItemFromBlock(Blocks.ladder)
							|| itemstack.getItem() == Item.getItemFromBlock(Blocks.fence)
							|| itemstack.getItem() == Item.getItemFromBlock(Blocks.fence_gate)
							|| oreDicID == OreDictionary.getOreID("woodRubber");
				case LOG_WOOD:
					oreDicID = OreDictionary.getOreID(itemstack);
					return oreDicID == OreDictionary.getOreID("logWood");
				case ASSEMBLED_TRAIN_TRACK:
					return block instanceof BlockRailBase || itemstack.getItem() instanceof ItemTCRail;
				case GRAIN:
					Item item = itemstack.getItem();
					if (item == Items.wheat
							|| item == Items.wheat_seeds
							|| item == Items.melon_seeds
							|| item == Items.pumpkin_seeds
							|| item instanceof ItemSeeds)
					{
						return true;
					}
					return cropStuff(itemstack);
				case OPAQUE_BLOCKS:
					return block.isOpaqueCube();
				case WOOD_CHIPS:
					return powderWood(itemstack);
				case ROCK_MATERIAL:
					return block.getMaterial() == Material.rock;
				case ICE_MATERIAL:
					return block.getMaterial() == Material.ice || block.getMaterial() == Material.packedIce;
				case ORE:
					return oreBlocks(itemstack);
				case INGOT:
					return ingotItems(itemstack);
				case REDSTONE:
					return itemstack.getItem() instanceof ItemRedstone;
				case FOOD:
					return itemstack.getItem() instanceof ItemFood;
				default:
					if (ConfigHandler.ROLLINGSTOCK_INVENTORY_BAN_OPEN_FLUID_CONTAINERS == false)
					{
						return true;
					}
					// Allowing Lava Buckets since not alot of cars for this
					if ((itemstack.getItem() == Items.lava_bucket) == false
							&& FluidContainerRegistry.isFilledContainer(itemstack))
					{
						return false;
					}
					return true;
			}

		}
		return true;
	}

	private static boolean oreCoal(ItemStack itemstack){
	    String[] names = new String[] { "cropPotato"};
	    for (String name: names){
	        if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
	            return true;
            }
        }
	    return false;
    }

	private static boolean powderWood(ItemStack itemstack){
		String[] names = new String[] { "dustWood", "pulpWood"};
		for (String name: names){
			if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
				return true;
			}
		}
		return false;
	}


	private static boolean cropStuff(ItemStack itemstack) {
		String[] names = new String[] { "cropCorn", "cropRice", "seedRice", "seedCorn", "listAllseed" };
		for (String name: names) {
			if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
				return true;
			}
		}
		return false;
	}

	private static LinkedList<String> OREDICT_ORES = null;

	public static boolean oreBlocks(ItemStack i){
		if (OREDICT_ORES==null){
			OREDICT_ORES = new LinkedList<>();
		}
		if (!OREDICT_ORES.contains(i.getUnlocalizedName())){
			for(Integer ore : OreDictionary.getOreIDs(i)) {
				if (OreDictionary.getOreName(ore).toLowerCase().startsWith("ore")){
					OREDICT_ORES.add(i.getUnlocalizedName());
					return true;
				}
			}
		}
		return OREDICT_ORES.contains(i.getUnlocalizedName());
	}

	private static LinkedList<String> OREDICT_INGOTS = null;

	public static boolean ingotItems(ItemStack i){
		if (OREDICT_INGOTS==null){
			OREDICT_INGOTS = new LinkedList<>();
		}
		if (!OREDICT_INGOTS.contains(i.getUnlocalizedName())){
			for(Integer ore : OreDictionary.getOreIDs(i)) {
				if (OreDictionary.getOreName(ore).toLowerCase().startsWith("ingot")){
					OREDICT_INGOTS.add(i.getUnlocalizedName());
					return true;
				}
			}
		}
		return OREDICT_INGOTS.contains(i.getUnlocalizedName());
	}
}
