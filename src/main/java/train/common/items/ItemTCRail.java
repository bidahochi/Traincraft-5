package train.common.items;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.util.vector.Matrix2f;
import org.lwjgl.util.vector.Vector2f;
import train.common.Traincraft;
import train.common.core.ActionBarMessenger;
import train.common.enums.TCTrackDirection;
import train.common.library.track.TrackCellResolver;
import train.common.library.track.placement.TrackHostPlacementTransaction;
import train.common.library.track.placement.TrackPlacementContext;
import train.common.library.BlockIDs;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.EnumTracks;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackPlacementType;
import train.common.library.track.TrackSlopeParameters;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;
import train.common.core.network.PacketTrackPlacementSound;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class ItemTCRail extends ItemPart {
	private ITrackDefinition type;
	private static final String SELECTED_TRACK_DEFINITION_TAG = "tcSelectedTrackDefinition";
	private static final int FACING_POSITIVE_Z = 0;
	private static final int FACING_NEGATIVE_X = 1;
	private static final int FACING_NEGATIVE_Z = 2;
	private static final int FACING_POSITIVE_X = 3;
	private static final int DIAGONAL_FACING_NEGATIVE_X_POSITIVE_Z = 4;
	private static final int DIAGONAL_FACING_NEGATIVE_X_NEGATIVE_Z = 5;
	private static final int DIAGONAL_FACING_POSITIVE_X_NEGATIVE_Z = 6;

	private String typeVariant90Turn(TrackPlacementContext context,
			EnumCoreTrack enumCoreTrack, RailVariants variants)
	{
		return EnumTracks.GetTracksByGroup(variants, context.getPlacementType())
				.get(enumCoreTrack).get("").getLabel();
	}

	/**
	 * Resolves placement behavior from the selected support block. Supported tracks automatically use their
	 * matching slab-mounted definition when aimed at a lower slab. Every other target retains the track definition's
	 * ordinary placement behavior, including surface track placed above a stair's solid top face.
	 *
	 * @param definition selected track definition
	 * @param world world containing the selected support block
	 * @param x selected support-block X coordinate
	 * @param y selected support-block Y coordinate
	 * @param z selected support-block Z coordinate
	 * @return automatically resolved placement behavior
	 */
	public static TrackPlacementType getAutomaticPlacementType(ITrackDefinition definition, World world,
			int x, int y, int z)
	{
		if (world != null && isAutomaticSlabMountedTarget(
				definition, world.getBlock(x, y, z), world.getBlockMetadata(x, y, z)))
		{
			return TrackPlacementType.SLAB_MOUNTED;
		}
		return definition != null ? definition.getPlacementType() : TrackPlacementType.SURFACE;
	}

	/**
	 * Returns whether a selected block should automatically activate slab-mounted placement.
	 *
	 * @param definition selected track definition
	 * @param block selected support block
	 * @param metadata selected support-block metadata
	 * @return whether the target is a lower-half slab supported by the selected track
	 */
	public static boolean isAutomaticSlabMountedTarget(ITrackDefinition definition, Block block, int metadata)
	{
		boolean lowerHalfSlab = block instanceof BlockSlab
				&& block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0;
		return lowerHalfSlab && definition != null
				&& definition.getPlacementType() == TrackPlacementType.SURFACE
				&& supportsSlabMountedVariant(definition);
	}

	/**
	 * Returns whether one ordinary track definition exposes the injected slab-mounted placement variant.
	 *
	 * @param definition track definition being classified
	 * @return whether its existing item may toggle slab-mounted placement
	 */
	private static boolean supportsSlabMountedVariant(ITrackDefinition definition)
	{
		return definition != null && EnumTracks.GetTrackByLabel(
				"SLAB_MOUNTED_" + definition.getLabel()) != null;
	}

	public void setEnumTrack(ITrackDefinition enumTrack)
	{
		type = enumTrack;
	}

	@Deprecated
	private static Set<String> LegacyIsTCTurnTrackHash = new HashSet<String>()
	{{
		add("MEDIUM_RIGHT_TURN");
		add("LARGE_RIGHT_TURN");
		add("LARGE_LEFT_TURN");
		add("VERY_LARGE_RIGHT_TURN");
		add("VERY_LARGE_LEFT_TURN");
		add("MEDIUM_LEFT_TURN");
		add("SUPER_LARGE_LEFT_TURN");
		add("SUPER_LARGE_RIGHT_TURN");
		add("LEFT_TURN_29X29");
		add("RIGHT_TURN_29X29");
		add("LEFT_TURN_32X32");
		add("RIGHT_TURN_32X32");
		add("LEFT_TURN_1X1");
		add("RIGHT_TURN_1X1");

		add("EMBEDDED_MEDIUM_RIGHT_TURN");
		add("EMBEDDED_LARGE_RIGHT_TURN");
		add("EMBEDDED_LARGE_LEFT_TURN");
		add("EMBEDDED_VERY_LARGE_RIGHT_TURN");
		add("EMBEDDED_VERY_LARGE_LEFT_TURN");
		add("EMBEDDED_MEDIUM_LEFT_TURN");
		add("EMBEDDED_SUPER_LARGE_LEFT_TURN");
		add("EMBEDDED_SUPER_LARGE_RIGHT_TURN");

		add("EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE");
		add("EMBEDDED_SMALL_LEFT_PARALLEL_CURVE");
		add("EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE");
		add("EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE");
		add("EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE");
		add("EMBEDDED_LARGE_LEFT_PARALLEL_CURVE");
	}};

	@Deprecated
	private static Set<String> SwitchTrackHash = new HashSet<String>()
	{
		{
			add("MEDIUM_LEFT_SWITCH");
			add("MEDIUM_RIGHT_SWITCH");
			add("LARGE_LEFT_SWITCH");
			add("LARGE_RIGHT_SWITCH");
			add("MEDIUM_RIGHT_PARALLEL_SWITCH");
			add("MEDIUM_LEFT_PARALLEL_SWITCH");
			add("LARGE_LEFT_PARALLEL_SWITCH");
		}
	};

	public static boolean isTCTurnTrack(TileTCRail tile) {
		if(tile==null || tile.getType()==null){return false;}
		return (SwitchTrackHash.contains(tile.getType()) && tile.getSwitchState()) || LegacyIsTCTurnTrackHash.contains(tile.getType());
	}

	public static boolean isTCStraightTrack(TileTCRail tile) {
		if(tile==null || tile.getType()==null){return false;}
		return
				//(tile.getType().equals(EnumTracks.MEDIUM_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
				//|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
				//|| (tile.getType().equals(EnumTracks.LARGE_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
				//|| (tile.getType().equals(EnumTracks.LARGE_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
				//|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
				//|| (tile.getType().equals(EnumTracks.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
				EnumCoreTrack.CORE_SMALL_STRAIGHT.equals(EnumTracks.GetTrackByLabel(tile.getType()).getCoreTrack())
				|| (tile.getType().contains("STRAIGHT") && TCRailTypes.isDiagonalTrack(tile) == false && TCRailTypes.isSwitchTrack(tile) == false)
				;
	}

	public ItemTCRail(EnumTracks t) {
		super(t.getItem().iconName);
		this.overridePath("tracks");
		this.type = t;
	}

	/**
	 * Validates the complete selected track footprint before placement.
	 *
	 * @param context immutable state for this validation operation
	 * @param player placing player
	 * @param world target world
	 * @param x origin X coordinate
	 * @param y origin Y coordinate
	 * @param z origin Z coordinate
	 * @return whether every required parent and gag cell can be occupied
	 */
	private boolean canPlaceTrack(TrackPlacementContext context,
			EntityPlayer player, World world, int x, int y, int z) {
		Block l1 = world.getBlock(x, y - 1, z);
		boolean replaceTarget = context.getPlacementType().replacesTarget();

		if (player != null && (player.canPlayerEdit(x, y - 1, z, 0, player.getCurrentEquippedItem()) == false
				|| player.canPlayerEdit(x, y, z, 0, player.getCurrentEquippedItem()) == false)
		)
		{
			return false;
		}

		if (replaceTarget)
		{
			return canOccupyTrackTarget(world, x, y, z, true)
					&& canEmbedIntoTrackTarget(world, x, y, z)
					&& acceptsTrackHostSurface(context, world, x, y, z)
					&& hasRailOrGag(world, x, y - 1, z) == false
					&& hasRailOrGag(world, x, y + 1, z) == false;
		}

		return canOccupyTrackTarget(world, x, y, z, false)
				&& hasRailOrGag(world, x, y - 1, z) == false
				&& hasRailOrGag(world, x, y + 1, z) == false
				&& (World.doesBlockHaveSolidTopSurface(world ,x, y - 1, z) || l1 == BlockIDs.bridgePillar.block || l1.getUnlocalizedName().contains("invisiblock"));
	}

	private boolean canBeReplaced(World world, int x, int y, int z){
		Block block = world.getBlock(x, y, z);
		return block == null || block.isReplaceable(world, x, y, z) || block instanceof BlockFlower
				|| block == Blocks.double_plant || block instanceof BlockMushroom;
	}

	/**
	 * Returns whether a footprint cell may contain the selected rail placement.
	 *
	 * @param world world containing the candidate cell
	 * @param x candidate X coordinate
	 * @param y candidate Y coordinate
	 * @param z candidate Z coordinate
	 * @param replaceTarget whether placement may replace a solid host block
	 * @return whether the candidate cell is available
	 */
	private boolean canOccupyTrackTarget(World world, int x, int y, int z, boolean replaceTarget)
	{
		Block block = world.getBlock(x, y, z);
		if (hasRailOrGag(block))
		{
			return false;
		}
		if (canBeReplaced(world, x, y, z))
		{
			return true;
		}
		if (replaceTarget == false)
		{
			return false;
		}
		return block != null
				&& block.hasTileEntity(world.getBlockMetadata(x, y, z)) == false
				&& block.getBlockHardness(world, x, y, z) >= 0.0F;
	}

	/**
	 * Returns whether a target block can serve as a captured embedded host.
	 *
	 * @param world world containing the candidate host
	 * @param x candidate X coordinate
	 * @param y candidate Y coordinate
	 * @param z candidate Z coordinate
	 * @return whether the block can be captured and replaced
	 */
	private boolean canEmbedIntoTrackTarget(World world, int x, int y, int z)
	{
		Block block = world.getBlock(x, y, z);
		return block != null
				&& hasRailOrGag(block) == false
				&& (World.doesBlockHaveSolidTopSurface(world, x, y, z)
				|| block instanceof BlockSlab
				|| block == BlockIDs.bridgePillar.block
				|| block.getUnlocalizedName().contains("invisiblock"));
	}

	/**
	 * Returns whether a world coordinate contains any Traincraft parent or gag rail cell.
	 *
	 * @param world world containing the queried coordinate
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @return whether the coordinate contains a Traincraft rail cell
	 */
	private boolean hasRailOrGag(World world, int x, int y, int z)
	{
		return hasRailOrGag(world.getBlock(x, y, z));
	}

	/**
	 * Returns whether a block is any Traincraft parent or gag rail cell.
	 *
	 * @param block block to classify
	 * @return whether the block belongs to a Traincraft rail footprint
	 */
	private boolean hasRailOrGag(Block block)
	{
		return TrackCellResolver.isTraincraftRailBlock(block);
	}

	/**
	 *
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * //@param posX[] array of gag
	 * //@param posZ[] array of gag
	 * @param l orientation
	 * @param exitFacing
	 * @param posExitX
	 * @param posExitZ
	 * @param r ray
	 * @param cx circle center
	 * @param cy circle center
	 * @param cz circle center
	 * @param type
	 * @return
	 */
	private boolean putDownTurn(TrackPlacementContext context, @Nullable EntityPlayer player, World world, boolean putDownEnterTrack, int x, int y, int z, int[] posX, int[] posZ,
								int l, boolean putDownExitTrack, int exitFacing, int posExitX, int posExitZ, double r, double cx, double cy,
								double cz, String type, Item idDrop) {
		TileTCRailGag[] tileGag = new TileTCRailGag[posX.length - 1];

		/** check if first straight rail can be placed */
		if (putDownEnterTrack && !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}

		/** check if Gag rails can be placed */
		for (int gag = 0; gag < posX.length; gag++) {
			if (!canPlaceTrack(context, player, world, posX[gag], y + 1, posZ[gag])) {
				return false;
			}
		}
		/** Check last block */
		if (putDownExitTrack && !canPlaceTrack(context, player, world, posExitX, y + 1, posExitZ)) {
			return false;
		}
		if (putDownEnterTrack) {
			/** first rail of the turn is a 1 block straight */
			placeTrack(context, world,x, y + 1, z, BlockIDs.tcRail.block, l);
			TileTCRail tcRailStart = (TileTCRail) world.getTileEntity(x, y + 1, z);
			tcRailStart.setType(context.getStraightLabel());
			tcRailStart.setFacing(l);
			tcRailStart.isLinkedToRail = true;
			tcRailStart.linkedX = posX[0];
			tcRailStart.linkedY = y + 1;
			tcRailStart.linkedZ = posZ[0];
		}

		/** the turn starts with this rail */
		placeTrack(context, world,posX[0], y + 1, posZ[0], BlockIDs.tcRail.block, l);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(posX[0], y + 1, posZ[0]);
		tcRail.setFacing(l);
		tcRail.r = r;
		tcRail.cx = cx;
		tcRail.cy = cy;
		tcRail.cz = cz;
		tcRail.setType(type);
		tcRail.idDrop = idDrop;
		tcRail.exitDirection = exitFacing;

		/** Gag rails containing reference to first turn rail */
		for (int gag = 1; gag < posX.length; gag++) {
			placeTrack(context, world,posX[gag], y + 1, posZ[gag], BlockIDs.tcRailGag.block, 0);
			tileGag[gag - 1] = (TileTCRailGag) world.getTileEntity(posX[gag], y + 1, posZ[gag]);
		}

		if (putDownExitTrack) {
			/** Last rail is a 1 block straight */
			placeTrack(context, world,posExitX, y + 1, posExitZ, BlockIDs.tcRail.block, exitFacing);
			TileTCRail tcRailEnd = (TileTCRail) world.getTileEntity(posExitX, y + 1, posExitZ);
			tcRailEnd.setFacing(exitFacing);
			tcRailEnd.setType(context.getStraightLabel());
			tcRailEnd.isLinkedToRail = true;
			tcRailEnd.linkedX = posX[0];
			tcRailEnd.linkedY = y + 1;
			tcRailEnd.linkedZ = posZ[0];
		}

		for (int i = 0; i < tileGag.length; i++) {
			tileGag[i].initializeTrackReference(posX[0], y + 1, posZ[0], type);
		}
		return true;
	}

	private void putDownSingleRail(TrackPlacementContext context, World world, int posX, int posY, int posZ, int l, double cx, double cy, double cz, double r, String label, boolean hasModel, int linkedX, int linkedY, int linkedZ, boolean canTypeBeModifiedBySwitch, boolean shouldDrop) {
		/** Switch rail */
		placeTrack(context, world,posX, posY, posZ, BlockIDs.tcRail.block, l);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(posX, posY, posZ);
		//world.setBlockMetadataWithNotify(posX, posY, posZ, l, 2);
		tcRail.setFacing(l);
		tcRail.cx = cx;
		tcRail.cy = cy;
		tcRail.cz = cz;
		tcRail.r = r;
		tcRail.setType(label);
		tcRail.hasModel = hasModel;
		tcRail.isLinkedToRail = true;
		tcRail.linkedX = linkedX;
		tcRail.linkedY = linkedY;
		tcRail.linkedZ = linkedZ;
		tcRail.canTypeBeModifiedBySwitch = canTypeBeModifiedBySwitch;
		if(shouldDrop)
		{
			tcRail.idDrop = type.getItem().item;
		}
	}

	public String getTrackOrientation(int l, float yaw) {
		if (l == 2 && yaw >= -180 && yaw <= -135) {
			return "right";
		}
		if (l == 2 && yaw <= 180 && yaw >= 135) {
			return "left";
		}
		if (l == 3 && yaw > -135 && yaw <= -90) {
			return "left";
		}
		if (l == 3 && yaw > -90 && yaw <= -45) {
			return "right";
		}
		if (l == 0 && yaw > -45 && yaw <= 0) {
			return "left";
		}
		if (l == 0 && yaw > 0 && yaw <= 45) {
			return "right";
		}
		if (l == 1 && yaw > 45 && yaw <= 90) {
			return "left";
		}
		if (l == 1 && yaw > 90 && yaw <= 135) {
			return "right";
		}
		return "";
	}

	public static Vector2f getDirectionVector(int facing)
	{
		Matrix2f nrot90 = new Matrix2f();
		nrot90.m00 = +0; nrot90.m01 = +1;
		nrot90.m10 = -1; nrot90.m11 = +0;

		Vector2f vec = new Vector2f();
		vec.x = 0; vec.y = 1;

		for ( int i = 0; i < facing; i++ )
		{
			Vector2f nvec = new Vector2f();
			nvec.x = vec.x * nrot90.m00 + vec.y * nrot90.m10;
			nvec.y = vec.x * nrot90.m01 + vec.y * nrot90.m11;
			vec = nvec;
		}

		return vec;
	}

	/**
	 * Validates the selected track footprint using its definition-level placement behavior.
	 *
	 * @param itemStack held rail stack
	 * @param player player attempting placement
	 * @param world world containing the prospective footprint
	 * @param x selected block X coordinate
	 * @param y selected block Y coordinate
	 * @param z selected block Z coordinate
	 * @param changeWorld retained compatibility flag; validation does not mutate the world
	 * @return whether every required footprint cell can be placed
	 */
	public boolean tryToPlaceTrack(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z,
			boolean changeWorld)
	{
		ITrackDefinition selectedTrack = getTrackType(itemStack);
		TrackPlacementType placementType = getAutomaticPlacementType(selectedTrack, world, x, y, z);
		int primaryFacing = getDiscreteFacing(player.rotationYaw, 4);
		ITrackDefinition directionalTrack = getPlacementDirection(selectedTrack, player, primaryFacing, 0);

		// Preview validation needs the same resolved definitions, but must never capture or replace host blocks.
		TrackPlacementContext context = new TrackPlacementContext(
				selectedTrack, directionalTrack, placementType, null);
		if (context.isValid() == false)
		{
			return false;
		}
		return tryToPlaceTrackWithContext(context, itemStack, player, world, x, y, z, changeWorld);
	}

	/**
	 * Performs footprint validation using the explicit state for this operation.
	 *
	 * @param context immutable state for this validation operation
	 * @param itemStack held rail stack
	 * @param player player attempting placement
	 * @param world world containing the prospective footprint
	 * @param x selected block X coordinate
	 * @param y selected block Y coordinate
	 * @param z selected block Z coordinate
	 * @param changeWorld retained compatibility flag; validation does not mutate the world
	 * @return whether every required footprint cell can be placed
	 */
	private boolean tryToPlaceTrackWithContext(TrackPlacementContext context,
			ItemStack itemStack, EntityPlayer player, World world,
			int x, int y, int z, boolean changeWorld)
	{
		if ( !(itemStack.getItem() instanceof ItemTCRail) )
			return false;

		ITrackDefinition type = context.getSelectedTrack();
		ITrackDefinition tempType = context.getDirectionalTrack();
		y = getPlacementHeight(context, world, x, y, z);

		ItemTCRail item = (ItemTCRail) itemStack.getItem();
		float yaw = player.rotationYaw;
		int primaryFacing = getDiscreteFacing(yaw, 4);
		Vector2f forwardDirection = ItemTCRail.getDirectionVector(primaryFacing);

		yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
		boolean isLeftTurn = item.getTrackOrientation(primaryFacing, yaw).equals("left");
		int sideFacing = isLeftTurn ? (primaryFacing + 4 - 1) % 4 : (primaryFacing + 1) % 4;
		Vector2f sideDirection = getDirectionVector(sideFacing);
		int[][] trackPositions = EnumTracks.getUsedSpaceFromType(tempType, player);
		if (trackPositions == null && tempType != type)
		{
			/*
			 * Switch placement resolves the neutral item definition to a left- or right-handed runtime definition.
			 * The footprint tables intentionally live on the neutral definition because both hands occupy the same
			 * definition-space cells; orientation is applied below. Preserve the resolved definition for rotation, but
			 * use the item's neutral definition when the directional definition has no independent footprint table.
			 */
			trackPositions = EnumTracks.getUsedSpaceFromType(type, player);
		}
		if ( trackPositions != null )
		{
			int exactFacing = getFacing(player, 0);

			for (int[] trackPosition : trackPositions)
			{
				int[] worldOffset = getValidationFootprintOffset(
						tempType, exactFacing, trackPosition, forwardDirection, sideDirection);
				int offsetX = worldOffset[0];
				int offsetZ = worldOffset[1];

				if (canPlaceTrack(context, player, world, x + offsetX, y + 1, z + offsetZ) == false)
				{
					return false;
				}
			}

			return true;
		}else {
			return false;
		}
	}

	/**
	 * Rotates one definition-space footprint cell exactly as the corresponding placement helper does. Diagonal
	 * straight and slope helpers use signed X/Z offsets from the eight-way facing; applying the legacy cardinal and
	 * handed basis to those cells validates a different quadrant from the one that will actually be occupied.
	 *
	 * @param definition direction-specific definition selected for placement
	 * @param exactFacing converted eight-way placement facing
	 * @param position unrotated footprint X/Z offset
	 * @param forward legacy cardinal forward basis
	 * @param side legacy handed side basis
	 * @return world-space X/Z offset used for validation
	 */
	public static int[] getValidationFootprintOffset(ITrackDefinition definition, int exactFacing, int[] position,
			Vector2f forward, Vector2f side)
	{
		if (usesSignedDiagonalFootprint(definition))
		{
			int rotatedOffsetX = position[0];
			int rotatedOffsetZ = position[1];
			switch (exactFacing)
			{
				case DIAGONAL_FACING_NEGATIVE_X_POSITIVE_Z:
					rotatedOffsetX *= -1;
					break;
				case DIAGONAL_FACING_NEGATIVE_X_NEGATIVE_Z:
					rotatedOffsetX *= -1;
					rotatedOffsetZ *= -1;
					break;
				case DIAGONAL_FACING_POSITIVE_X_NEGATIVE_Z:
					rotatedOffsetZ *= -1;
					break;
				default:
					break;
			}
			return new int[]{rotatedOffsetX, rotatedOffsetZ};
		}
		return new int[]{
				(int) (position[0] * forward.getX() + position[1] * side.getX()),
				(int) (position[0] * forward.getY() + position[1] * side.getY())
		};
	}

	/** Returns whether placement consumes the definition footprint through signed diagonal offsets. */
	private static boolean usesSignedDiagonalFootprint(ITrackDefinition definition)
	{
		if (definition == null)
		{
			return false;
		}
		switch (definition.getCoreTrack())
		{
			case CORE_SMALL_DIAGONAL_STRAIGHT:
			case CORE_MEDIUM_DIAGONAL_STRAIGHT:
			case CORE_LONG_DIAGONAL_STRAIGHT:
			case CORE_VERY_LONG_DIAGONAL_STRAIGHT:
			case CORE_3_DIAGONAL_SLOPE:
			case CORE_6_DIAGONAL_SLOPE:
			case CORE_12_DIAGONAL_SLOPE:
			case CORE_18_DIAGONAL_SLOPE:
			case CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE:
			case CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE:
			case CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE:
			case CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE:
				return true;
			default:
				return false;
		}
	}

	public static int getDiscreteFacing(float yaw, int divisions) {
		//normalize
		yaw = (yaw % 360 + 360) % 360;
		float sectorSize = 360.0F / divisions;
		int index = (int) Math.floor((yaw + sectorSize / 2) / sectorSize) % divisions;
		return index;
	}

	public int getPlacementHeight( World world, int x, int y, int z )
	{
		if(canBeReplaced(world, x, y, z)){
			y--;
		}
		return y;
	}

	/**
	 * Resolves the placement routine's base coordinate for surface or replacement placement.
	 *
	 * @param context immutable state for this placement operation
	 * @param world world containing the selected block
	 * @param x selected block X coordinate
	 * @param y selected block Y coordinate
	 * @param z selected block Z coordinate
	 * @return placement routine base Y coordinate
	 */
	private int getPlacementHeight(TrackPlacementContext context, World world, int x, int y, int z)
	{
		if (context.getPlacementType().replacesTarget())
		{
			return y - 1;
		}
		return getPlacementHeight(world, x, y, z);
	}

	/**
	 * Handles player placement of the selected track and its automatic placement variant.
	 *
	 * @param itemstack held rail item
	 * @param player placing player
	 * @param world target world
	 * @param x clicked X coordinate
	 * @param y clicked Y coordinate
	 * @param z clicked Z coordinate
	 * @param par7 clicked side
	 * @param par8 hit X within the block
	 * @param par9 hit Y within the block
	 * @param par10 hit Z within the block
	 * @return whether placement was handled
	 */
	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if (world.isRemote == false)
		{
			ITrackDefinition selectedTrack = getTrackType(itemstack);
			TrackPlacementType placementType = getAutomaticPlacementType(selectedTrack, world, x, y, z);
			int facing = MathHelper.floor_double(
					(player != null ? player.rotationYaw : par10) * 4.0F / 360.0F + 0.5D) & 3;
			ITrackDefinition directionalTrack = getPlacementDirection(selectedTrack, player, facing, par10);

			// The transaction and all derived definitions now travel together through this single operation.
			TrackHostPlacementTransaction transaction = new TrackHostPlacementTransaction(selectedTrack, placementType);
			TrackPlacementContext context = new TrackPlacementContext(
					selectedTrack, directionalTrack, placementType, transaction);
			boolean committed = false;
			try
			{
				boolean result = context.isValid() && attemptPlacementOfTrack(
						context, itemstack, player, world, x, y, z, par7, par8, par9, par10);
				if (result == false || transaction.commit(world) == false)
				{
					ActionBarMessenger.display(player, EnumChatFormatting.RED + "Cannot place track here.");
					return false;
				}
				committed = true;
				if (player == null || player.capabilities.isCreativeMode == false)
				{
					--itemstack.stackSize;
				}



				Traincraft.modChannel.sendToAllAround(
						new PacketTrackPlacementSound(x + 0.5D, y + 0.5D, z + 0.5D),
						new NetworkRegistry.TargetPoint(world.provider.dimensionId, x, y, z, 16.0D));
				return true;
			}
			finally
			{
				// Any early return or failed commit restores every host block captured by this operation.
				if (committed == false)
				{
					transaction.rollback(world);
				}
			}
		}

		return false;
	}

	/**
	 * Places the selected track after the surrounding transaction has installed
	 * the stack's placement variant.
	 *
	 * @param context immutable state for this placement operation
	 * @param itemstack selected rail stack
	 * @param player player placing the track
	 * @param world destination world
	 * @param x selected block X coordinate
	 * @param y selected block Y coordinate
	 * @param z selected block Z coordinate
	 * @param par7 selected block side
	 * @param par8 hit X coordinate within the selected block
	 * @param par9 hit Y coordinate within the selected block
	 * @param par10 hit Z coordinate within the selected block, or fallback yaw for automated placement
	 * @return whether placement completed successfully
	 */
	private boolean attemptPlacementOfTrack(TrackPlacementContext context, ItemStack itemstack,
			EntityPlayer player, World world, int x, int y, int z,
			int par7, float par8, float par9, float par10)
	{
		ITrackDefinition type = context.getSelectedTrack();
		ITrackDefinition tempType = context.getDirectionalTrack();
		y = getPlacementHeight(context, world, x, y, z);
		int l = MathHelper.floor_double((player!=null?player.rotationYaw:par10) * 4.0F / 360.0F + 0.5D) & 3;

		int[] curveXArray;
		int[] curveZArray;
		int[] curveXArray2;
		int[] curveZArray2;

		/** This code below actually places the stuff
		 * l = direction
		 *  l = 1 = west
		 *  l = 2 = NORTH
		 *  l = 0 = SOUTH
		 *  l = 3 = east
		 *  l = 4 = south-west
		 *  l = 5 = north-west
		 *  l = 6 = north-east
		 *  l = 7 = south-east
		 **/
		//System.out.println(type +" "+l);
		switch (tempType.getCoreTrack())
		{
			case CORE_SMALL_DIAGONAL_STRAIGHT:
				if (!smallDiagonalStraight(context, player, world, x, y, z,  getFacing(player, par10), tempType))
				{
					return false;
				}


				return true;

			case CORE_MEDIUM_DIAGONAL_STRAIGHT:
			case CORE_LONG_DIAGONAL_STRAIGHT:
			case CORE_VERY_LONG_DIAGONAL_STRAIGHT:
				if (!diagonalStraight(context, player, world, x, y, z, getFacing(player, par10), tempType))
				{
					return false;
				}


				return true;

			case CORE_1X_TURN_L:
				if (!turn1XLeft(context, player, world, x, y, z, l, tempType)) {return false;}


				return true;

			case CORE_1X_TURN_R:
				if (!turn1XRight(context, player, world, x, y, z, l, tempType))
				{return false;}


				return true;

			case CORE_3X_TURN_L:
			case CORE_3X_TURN_R:
				curveXArray = new int[]{0, 0, 1, 1, 2};
				curveZArray = new int[]{0, 1, 1, 2, 2};
				if (!turnTrack(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 2.5f))
				{
					return false;
				}


				return true;

			case CORE_5X_TURN_L:
			case CORE_5X_TURN_R:
				curveXArray = new int[]{0, 0, 1, 1, 2, 0, 1, 2, 3, 4, 3, 2};
				curveZArray = new int[]{0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
				if (!turnTrack(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 4.5f))
				{
					return false;
				}


				return true;

			case CORE_10X_TURN_L:
			case CORE_10X_TURN_R:
				curveXArray = new int[]{0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 9};
				curveZArray = new int[]{0, 1, 2, 2, 3, 3, 4, 4, 5, 4, 5, 6, 6, 7, 7, 8, 7, 8, 9, 8, 9, 8, 9, 9, 9};
				if (!turnTrack(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 9.5f))
				{
					return false;
				}


				return true;

			case CORE_16X_TURN_L:
			case CORE_16X_TURN_R:
				curveXArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 15};
				curveZArray = new int[]{0, 1, 2, 3, 4, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 14, 15, 14, 15, 15, 15, 15};
				if (!turnTrack(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 15.5f))
				{
					return false;
				}


				return true;


			case CORE_29X_TURN_L:
			case CORE_29X_TURN_R:
				curveXArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 14, 15, 15, 16, 16, 16, 17, 17, 18, 18, 18, 19, 19, 20, 20, 21, 21, 21, 22, 22, 23, 23, 24, 24, 25, 25, 26, 27, 28};
				curveZArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10, 11, 12, 10, 11, 12, 13, 14, 12, 13, 14, 15, 14, 15, 16, 17, 16, 17, 18, 17, 18, 19, 18, 19, 20, 19, 20, 21, 20, 21, 22, 21, 22, 23, 22, 23, 23, 24, 23, 24, 25, 24, 25, 24, 25, 26, 25, 26, 25, 26, 27, 26, 27, 26, 27, 26, 27, 28, 27, 28, 27, 28, 27, 28, 27, 28, 28, 28, 28};

				if (!turnTrack(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 28.5f)) {return false;}


				return true;

			case CORE_32X_TURN_L:
			case CORE_32X_TURN_R:
				curveXArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 21, 22, 22, 23, 23, 24, 24, 24, 25, 25, 26, 26, 27, 27, 28, 28, 29, 29, 30, 31};
				curveZArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10, 11, 12, 10, 11, 12, 13, 14, 15, 13, 14, 15, 16, 14, 15, 16, 17, 18, 16, 17, 18, 19, 18, 19, 20, 19, 20, 21, 20, 21, 22, 21, 22, 23, 22, 23, 24, 23, 24, 25, 24, 25, 26, 25, 26, 25, 26, 27, 26, 27, 28, 26, 27, 28, 27, 28, 28, 29, 28, 29, 28, 29, 30, 29, 30, 29, 30, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31, 31};

				if (!turnTrack(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 31.5f)) {return false;}


				return true;
			case CORE_3X4_45DEGREE_TURN_R: //TODO consolidate left/right
				if (!mediumRight45DegreeTurn(context, player, world, x, y, z, l, tempType))
				{
					return false;
				}



				return true;
			case CORE_3X4_45DEGREE_TURN_L: //TODO consolidate left/right
				if (!mediumLeft45DegreeTurn(context, player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_3X6_45DEGREE_TURN_R:
				if (!largeRight45DegreeTurn(context, player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_3X6_45DEGREE_TURN_L:
				if (!largeLeft45DegreeTurn(context, player, world, x, y, z, l, tempType)) {
					return false;
				}


				return true;
			case CORE_4X8_45DEGREE_TURN_R:
				if (!veryLargeRight45DegreeTurn(context, player, world, x, y, z, l, tempType)) {
					return false;
				}


				return true;
			case CORE_4X8_45DEGREE_TURN_L:
				if (!veryLargeLeft45DegreeTurn(context, player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_5X11_45DEGREE_TURN_R:
				if (!superLargeRight45DegreeTurn(context, player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_5X11_45DEGREE_TURN_L:
				if (!superLargeLeft45DegreeTurn(context, player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_9X20_45DEGREE_TURN_L:
			case CORE_9X20_45DEGREE_TURN_R:
				if (player.isSneaking())
				{
					curveXArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8};
					curveZArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10, 11, 12, 10, 11, 12, 13, 14, 12, 13, 14, 15, 14, 15, 16, 17, 15, 16, 17, 18, 16, 17, 18, 19, 18, 19};
				}
				else
				{
					curveXArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9};
					curveZArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10, 11, 12, 10, 11, 12, 13, 14, 12, 13, 14, 15, 14, 15, 16, 17, 15, 16, 17, 18, 16, 17, 18, 19, 18, 19, 20, 19};

				}
				if (!turnTrack(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 27.85f)) {return false;}


				return true;
			case CORE_10x22_45DEGREE_TURN_L:
			case CORE_10x22_45DEGREE_TURN_R:
			{
				if (player.isSneaking()) {
					curveXArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9};
					curveZArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10, 11, 12, 13, 10, 11, 12, 13, 14, 13, 14, 15, 16, 15, 16, 17, 18, 16, 17, 18, 19, 17, 18, 19, 20, 19, 20, 21, 20, 21};
				}
				else {
					curveXArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10};
					curveZArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10, 11, 12, 13, 10, 11, 12, 13, 14, 13, 14, 15, 16, 15, 16, 17, 18, 16, 17, 18, 19, 17, 18, 19, 20, 19, 20, 21, 20, 21, 22, 21};
				}
				if (!turnTrack(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 30.22f)) {
					return false;
				}


				return true;
			}

			case CORE_S_CURVE_2x8_L:
			case CORE_S_CURVE_2x8_R:
			{
				curveXArray = new int[]{0, 0, 0, 0, 0, 0};
				curveZArray = new int[]{0, 1, 2, 3, 4, 5};
				curveXArray2 = new int[]{1, 1, 1, 1, 1, 1};
				curveZArray2 = new int[]{2, 3, 4, 5, 6, 7};
				if (!SCurve(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 16.25f, 8, 2)) {
					return false;
				}


				return true;
			}

			case CORE_S_CURVE_3x12_L:
			case CORE_S_CURVE_3x12_R:
			{
				curveXArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1};
				curveZArray = new int[]{0, 1, 2, 3, 4, 3, 4, 5};
				curveXArray2 = new int[]{1, 1, 1, 2, 2, 2, 2, 2};
				curveZArray2 = new int[]{6, 7, 8, 7, 8, 9, 10, 11};
				if (!SCurve(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 18.50f, 12, 3)) {
					return false;
				}


				return true;
			}

			case CORE_S_CURVE_4x16_L:
			case CORE_S_CURVE_4x16_R:
			{
				curveXArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
				curveZArray = new int[]{0, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8};
				curveXArray2 = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3};
				curveZArray2 = new int[]{7, 8, 9, 10, 11, 10, 11, 12, 13, 14, 15};
				if (!SCurve(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 22f, 16, 4)) {
					return false;
				}


				return true;
			}

			case CORE_S_CURVE_20x2_L:
			case CORE_S_CURVE_20x2_R:
			{
				curveXArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
				curveZArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 4, 5, 6, 7, 8, 9};
				curveXArray2 = new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
				curveZArray2 = new int[]{10, 11, 12, 13, 14, 15, 16, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

				if (!SCurve(context, player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 100.25f, 20, 2)) {
					return false;
				}


				return true;
			}

			case CORE_4x11_PARALLEL_SWITCH_L:
			{
				if (l == 2) {
					if (!parallelLeftSwitchNorth(context, player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 0) {
					if (!parallelLeftSwitchSouth(context, player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 1) {
					if (!parallelLeftSwitchWest(context, player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 3) {
					if (!parallelLeftSwitchEast(context, player, world, x, y, z, l, tempType))
						return false;
				}

				return true;
			}

			case CORE_4x11_PARALLEL_SWITCH_R:
			{
				if (l == 2) {
					if (!parallelRightSwitchNorth(context, player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 0) {
					if (!parallelRightSwitchSouth(context, player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 1) {
					if (!parallelRightSwitchWest(context, player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 3) {
					if (!parallelRightSwitchEast(context, player, world, x, y, z, l, tempType))
						return false;
				}

				return true;
			}

			case CORE_4x17_PARALLEL_SWITCH_L:
			{
				if (!largeLeftParallelSwitch(context, player, world, x, y, z, l, tempType, context.getStraightLabel())){return false;}


				return true;
			}

			case CORE_4x17_PARALLEL_SWITCH_R:
			{
				if (!largeRightParallelSwitch(context, player, world, x, y, z, l, tempType, context.getStraightLabel())){return false;}


				return true;
			}

			case CORE_10x2_CROSSOVER_SWITCH_L:
				if (!crossover10x2Switch(context, player, world, x, y, z, l, tempType, context.getStraightLabel(), typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_L, tempType.getVariant()), player.isSneaking(), false)) { return false; }
				break;
			case CORE_10x2_CROSSOVER_SWITCH_R:
				if (!crossover10x2Switch(context, player, world, x, y, z, l, tempType, context.getStraightLabel(), typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_R, tempType.getVariant()), player.isSneaking(), true)) { return false; }
				break;

			case CORE_4x4_SWITCH_R:
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x, y + 1, z - 3) || !canPlaceTrack(context, player, world, x, y + 1, z - 2) || !canPlaceTrack(context, player, world, x, y + 1, z - 1)) {
						return false;
					}

					int[] xArray = { x + 1, x + 1, x + 2 };
					int[] zArray = { z - 2, z - 3, z - 3 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 3, z - 3, 2.5, x + 3, y + 1,
							z, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
					if (tcRailTurn != null) {
						tcRailTurn.hasModel = false;
					}
					world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
					/** Switch rail 1 */
					putDownSingleRail(context, world, x, y + 1, z - 1, l, x + 3, y + 1, z, 2.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z - 2, l, x + 3, y + 1, z, 2.5, context.getStraightLabel(), false, x + 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z - 3, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x, y + 1, z + 3) || !canPlaceTrack(context, player, world, x, y + 1, z + 2) || !canPlaceTrack(context, player, world, x, y + 1, z + 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2 };
					int[] zArray = { z + 2, z + 3, z + 3 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z + 3, 2.5, x - 2, y + 1,
							z + 1, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x, y + 1, z + 1, l, x - 2, y + 1, z + 1, 2.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z + 2, l, x - 2, y + 1, z + 1, 2.5, context.getStraightLabel(), false, x - 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z + 3, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x - 3, y + 1, z) || !canPlaceTrack(context, player, world, x - 2, y + 1, z) || !canPlaceTrack(context, player, world, x - 1, y + 1, z)) {
						return false;
					}

					int[] xArray = { x - 2, x - 3, x - 3 };
					int[] zArray = { z - 1, z - 1, z - 2 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 3, z - 3, 2.5, x, y + 1,
							z - 2, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x - 1, y + 1, z, l, x, y + 1, z - 2, 2.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x - 2, y + 1, z, l, x, y + 1, z - 2, 2.5, context.getStraightLabel(), false, x - 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x - 3, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 2, y + 1, z - 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x + 3, y + 1, z) || !canPlaceTrack(context, player, world, x + 2, y + 1, z) || !canPlaceTrack(context, player, world, x + 1, y + 1, z)) {
						return false;
					}

					int[] xArray = { x + 2, x + 3, x + 3 };
					int[] zArray = { z + 1, z + 1, z + 2 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 3, z + 3, 2.5, x + 1, y + 1,
							z + 3, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x + 1, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x + 2, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, context.getStraightLabel(), false, x + 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x + 3, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 2, y + 1, z + 1, false, false);

				}

				return true;
			case CORE_4x4_SWITCH_L:
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x, y + 1, z - 3) || !canPlaceTrack(context, player, world, x, y + 1, z - 2) || !canPlaceTrack(context, player, world, x, y + 1, z - 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2 };
					int[] zArray = { z - 2, z - 3, z - 3 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z - 3, 2.5, x - 2, y + 1,
							z, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
					if (tcRailTurn != null) {
						tcRailTurn.hasModel = false;
					}
					world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x, y + 1, z - 1, l, x - 2, y + 1, z, 2.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z - 2, l, x - 2, y + 1, z, 2.5, context.getStraightLabel(), false, x - 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z - 3, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x, y + 1, z + 3) || !canPlaceTrack(context, player, world, x, y + 1, z + 2) || !canPlaceTrack(context, player, world, x, y + 1, z + 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2 };
					int[] zArray = { z + 2, z + 3, z + 3 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 3, z + 3, 2.5, x + 3, y + 1,
							z + 1, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x, y + 1, z + 1, l, x + 3, y + 1, z + 1, 2.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z + 2, l, x + 3, y + 1, z + 1, 2.5, context.getStraightLabel(), false, x + 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z + 3, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x - 3, y + 1, z) || !canPlaceTrack(context, player, world, x - 2, y + 1, z) || !canPlaceTrack(context, player, world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3 };
					int[] zArray = { z + 1, z + 1, z + 2 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 0, x - 3, z + 3, 2.5, x, y + 1,
							z + 3, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x - 1, y + 1, z, l, x, y + 1, z + 3, 2.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x - 2, y + 1, z, l, x, y + 1, z + 3, 2.5, context.getStraightLabel(), false, x - 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x - 3, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 2, y + 1, z + 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x + 3, y + 1, z) || !canPlaceTrack(context, player, world, x + 2, y + 1, z) || !canPlaceTrack(context, player, world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3 };
					int[] zArray = { z - 1, z - 1, z - 2 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 2, x + 3, z - 3, 2.5, x + 1, y + 1,
							z - 2, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x + 1, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x + 2, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, context.getStraightLabel(), false, x + 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x + 3, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 2, y + 1, z - 1, false, false);

				}

				return true;
			case CORE_6x6_SWITCH_R:
			{
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x, y + 1, z - 5) || !canPlaceTrack(context, player, world, x, y + 1, z - 4) || !canPlaceTrack(context, player, world, x, y + 1, z - 3) || !canPlaceTrack(context, player, world, x, y + 1, z - 2) || !canPlaceTrack(context, player, world, x, y + 1, z - 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 4, x + 3, x + 2 };
					int[] zArray = { z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z - 5, 4.5, x + 5, y + 1,
							z, typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
					/** Switch rail 1 */
					putDownSingleRail(context, world, x, y + 1, z - 1, l, x + 5, y + 1, z, 4.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z - 2, l, x + 5, y + 1, z, 4.5, context.getStraightLabel(), false, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x, y + 1, z - 3, l, x + 5, y + 1, z, 4.5, context.getStraightLabel(), false, x + 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z - 4, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 1, y + 1, z - 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z - 5, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x, y + 1, z + 5) || !canPlaceTrack(context, player, world, x, y + 1, z + 4) || !canPlaceTrack(context, player, world, x, y + 1, z + 3) || !canPlaceTrack(context, player, world, x, y + 1, z + 2) || !canPlaceTrack(context, player, world, x, y + 1, z + 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 2, x - 3, x - 4 };
					int[] zArray = { z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z + 5, 4.5, x - 4, y + 1,
							z + 1, typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x, y + 1, z + 1, l, x - 4, y + 1, z + 1, 4.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z + 2, l, x - 4, y + 1, z + 1, 4.5, context.getStraightLabel(), false, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x, y + 1, z + 3, l, x - 4, y + 1, z + 1, 4.5, context.getStraightLabel(), false, x - 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z + 4, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 1, y + 1, z + 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z + 5, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x - 5, y + 1, z) || !canPlaceTrack(context, player, world, x - 4, y + 1, z) || !canPlaceTrack(context, player, world, x - 3, y + 1, z) || !canPlaceTrack(context, player, world, x - 2, y + 1, z) || !canPlaceTrack(context, player, world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5 };
					int[] zArray = { z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z - 5, 4.5, x, y + 1,
							z - 4, typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x - 1, y + 1, z, l, x, y + 1, z - 4, 4.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x - 2, y + 1, z, l, x, y + 1, z - 4, 4.5, context.getStraightLabel(), false, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x - 3, y + 1, z, l, x, y + 1, z - 4, 4.5, context.getStraightLabel(), false, x - 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x - 4, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 2, y + 1, z - 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x - 5, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 2, y + 1, z - 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x + 5, y + 1, z) || !canPlaceTrack(context, player, world, x + 4, y + 1, z) || !canPlaceTrack(context, player, world, x + 3, y + 1, z) || !canPlaceTrack(context, player, world, x + 2, y + 1, z) || !canPlaceTrack(context, player, world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5 };
					int[] zArray = { z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z + 5, 4.5, x + 1, y + 1,
							z + 5, typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x + 1, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x + 2, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, context.getStraightLabel(), false, x + 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x + 3, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, context.getStraightLabel(), false, x + 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x + 4, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 2, y + 1, z + 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x + 5, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 2, y + 1, z + 1, false, false);

				}

				return true;
			}
			case CORE_6x6_SWITCH_L:
			{
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x, y + 1, z - 5) || !canPlaceTrack(context, player, world, x, y + 1, z - 4) || !canPlaceTrack(context, player, world, x, y + 1, z - 3) || !canPlaceTrack(context, player, world, x, y + 1, z - 2) || !canPlaceTrack(context, player, world, x, y + 1, z - 1)) {
						return false;
					}
					int[] xArray = { x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 4, x - 3, x - 2 };
					int[] zArray = { z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z - 5, 4.5, x - 4, y + 1,
							z, typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x, y + 1, z - 1, l, x - 4, y + 1, z, 4.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z - 2, l, x - 4, y + 1, z, 4.5, context.getStraightLabel(), false, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x, y + 1, z - 3, l, x - 4, y + 1, z, 4.5, context.getStraightLabel(), false, x - 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z - 4, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 1, y + 1, z - 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z - 5, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 1, y + 1, z - 2, false, false);

				}
				else if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x, y + 1, z + 5) || !canPlaceTrack(context, player, world, x, y + 1, z + 4) || !canPlaceTrack(context, player, world, x, y + 1, z + 3) || !canPlaceTrack(context, player, world, x, y + 1, z + 2) || !canPlaceTrack(context, player, world, x, y + 1, z + 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 2, x + 3, x + 4 };
					int[] zArray = { z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z + 5, 4.5, x + 5, y + 1,
							z + 1, typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x, y + 1, z + 1, l, x + 5, y + 1, z + 1, 4.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z + 2, l, x + 5, y + 1, z + 1, 4.5, context.getStraightLabel(), false, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x, y + 1, z + 3, l, x + 5, y + 1, z + 1, 4.5, context.getStraightLabel(), false, x + 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z + 4, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 1, y + 1, z + 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x, y + 1, z + 5, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 1, y + 1, z + 2, false, false);

				}
				else if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x - 5, y + 1, z) || !canPlaceTrack(context, player, world, x - 4, y + 1, z) || !canPlaceTrack(context, player, world, x - 3, y + 1, z) || !canPlaceTrack(context, player, world, x - 2, y + 1, z) || !canPlaceTrack(context, player, world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5 };
					int[] zArray = { z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z + 5, 4.5, x, y + 1,
							z + 5, typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x - 1, y + 1, z, l, x, y + 1, z + 5, 4.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x - 2, y + 1, z, l, x, y + 1, z + 5, 4.5, context.getStraightLabel(), false, x - 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x - 3, y + 1, z, l, x, y + 1, z + 5, 4.5, context.getStraightLabel(), false, x - 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x - 4, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 2, y + 1, z + 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x - 5, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 2, y + 1, z + 1, false, false);

				}
				else if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(context, player, world, x + 5, y + 1, z) || !canPlaceTrack(context, player, world, x + 4, y + 1, z) || !canPlaceTrack(context, player, world, x + 3, y + 1, z) || !canPlaceTrack(context, player, world, x + 2, y + 1, z) || !canPlaceTrack(context, player, world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5 };
					int[] zArray = { z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z - 5, 4.5, x + 1, y + 1,
							z - 4, typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(context, world, x + 1, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x + 2, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, context.getStraightLabel(), false, x + 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x + 3, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, context.getStraightLabel(), false, x + 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x + 4, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 2, y + 1, z - 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(context, world, x + 5, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(),
							true, x + 2, y + 1, z - 1, false, false);

				}

				return true;
			}

			case CORE_11x11_SWITCH_R:
			{
				int[] xArray = { 1,1,1,1,1,2,2,2,3,3,4,4,5,5,5,6,6,7,7,8,9};
				int[] zArray = { 2,3,4,5,6,6,6,7,7,8,8,9,8,9,10,9,10,9,10, 10,10};

				if(l == 2)
				{
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(context, player, world, x, y + 1, z - i)) return false;
					}

					if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, true, 3, x + 10, z - 10, 9.5, x + 10, y + 1,
							z, typeVariant90Turn(context, EnumCoreTrack. CORE_10X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(context, world, x, y + 1, z - 1, l, x + 10, y + 1, z, 9.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z - 2, l, x + 10, y + 1, z, 9.5, context.getStraightLabel(), false, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x, y + 1, z - 3, l, x + 10, y + 1, z, 9.5, context.getStraightLabel(), false, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(context, world, x, y + 1, z - 4, l, x + 10, y + 1, z, 9.5, context.getStraightLabel(), false, x + 1, y + 1, z - 2, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(context, world, x, y + 1, z - straight, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 1, y + 1, z - 2, false, false);
					}
				}

				if(l == 0) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(context, player, world, x, y + 1, z + i)) return false;
					}

					if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, true, 1, x - 10, z + 10, 9.5, x - 9, y + 1,
							z + 1, typeVariant90Turn(context, EnumCoreTrack. CORE_10X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 0);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(context, world, x, y + 1, z + 1, l, x - 9, y + 1, z + 1, 9.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z + 2, l, x - 9, y + 1, z + 1, 9.5, context.getStraightLabel(), false, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x, y + 1, z + 3, l, x - 9, y + 1, z + 1, 9.5, context.getStraightLabel(), false, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(context, world, x, y + 1, z + 4, l, x - 9, y + 1, z + 1, 9.5, context.getStraightLabel(), false, x - 1, y + 1, z + 2, true, false);


					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(context, world, x, y + 1, z + straight, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 1, y + 1, z + 2, false, false);
					}
				}

				if(l == 1)
				{
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(context, player, world, x - i, y + 1, z)) return false;
					}

					if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, true, 2, x - 10, z - 10, 9.5, x , y + 1,
							z - 9, typeVariant90Turn(context, EnumCoreTrack. CORE_10X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x  - 2, y + 1, z - 1, l, 1);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(context, world, x - 1, y + 1, z , l, x , y + 1, z - 9, 9.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x - 2, y + 1, z , l, x, y + 1, z - 9, 9.5, context.getStraightLabel(), false, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x - 3, y + 1, z , l, x , y + 1, z - 9, 9.5, context.getStraightLabel(), false, x - 2 , y + 1, z - 1, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(context, world, x - 4, y + 1, z , l, x , y + 1, z - 9, 9.5, context.getStraightLabel(), false, x - 2, y + 1, z - 1, true, false);


					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(context, world, x - straight, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 2, y + 1, z - 1, false, false);
					}
				}

				if(l == 3)
				{
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(context, player, world, x + i, y + 1, z)) return false;
					}

					if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, true, 0, x + 10, z + 10, 9.5, x + 1, y + 1,
							z + 10, typeVariant90Turn(context, EnumCoreTrack. CORE_10X_TURN_R, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x  + 2, y + 1, z + 1, l, 3);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(context, world, x + 1, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x + 2, y + 1, z , l, x + 1 , y + 1, z + 10, 9.5, context.getStraightLabel(), false, x + 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x + 3, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, context.getStraightLabel(), false, x + 2 , y + 1, z + 1, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(context, world, x + 4, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, context.getStraightLabel(), false, x + 2, y + 1, z + 1, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(context, world, x + straight, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 2, y + 1, z + 1, false, false);
					}
				}
			}
			return true;

			case CORE_11x11_SWITCH_L:
			{
				int[] xArray = { 1,1,1,1,1,2,2,2,3,3,4,4,5,5,5,6,6,7,7,8,9};
				int[] zArray = { 2,3,4,5,6,6,6,7,7,8,8,9,8,9,10,9,10,9,10, 10,10};


				if(l == 2) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(context, player, world, x, y + 1, z - i)) return false;
					}

					if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, true, 1, x - 10, z - 10, 9.5, x - 9, y + 1,
							z, typeVariant90Turn(context, EnumCoreTrack. CORE_10X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(context, world, x, y + 1, z - 1, l, x - 9, y + 1, z, 9.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z - 2, l, x - 9, y + 1, z, 9.5, context.getStraightLabel(), false, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x, y + 1, z - 3, l, x - 9, y + 1, z, 9.5, context.getStraightLabel(), false, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(context, world, x, y + 1, z - 4, l, x - 9, y + 1, z, 9.5, context.getStraightLabel(), false, x - 1, y + 1, z - 2, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(context, world, x, y + 1, z - straight, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 1, y + 1, z - 2, false, false);
					}
				}

				if(l == 0) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(context, player, world, x, y + 1, z + i)) return false;
					}

					if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, true, 1, x + 10, z + 10, 9.5, x + 10, y + 1,
							z + 1, typeVariant90Turn(context, EnumCoreTrack. CORE_10X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 0);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(context, world, x, y + 1, z + 1, l, x + 10, y + 1, z + 1, 9.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x, y + 1, z + 2, l, x + 10, y + 1, z + 1, 9.5, context.getStraightLabel(), false, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x, y + 1, z + 3, l, x + 10, y + 1, z + 1, 9.5, context.getStraightLabel(), false, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(context, world, x, y + 1, z + 4, l, x + 10, y + 1, z + 1, 9.5, context.getStraightLabel(), false, x + 1, y + 1, z + 2, true, false);


					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(context, world, x, y + 1, z + straight, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 1, y + 1, z + 2, false, false);

					}

				}

				if(l == 1) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(context, player, world, x - i, y + 1, z)) return false;
					}

					if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, true, 0, x - 10, z + 10, 9.5, x , y + 1,
							z + 10, typeVariant90Turn(context, EnumCoreTrack. CORE_10X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x  - 2, y + 1, z + 1, l, 1);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(context, world, x - 1, y + 1, z , l, x , y + 1, z + 10, 9.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x - 2, y + 1, z , l, x, y + 1, z + 10, 9.5, context.getStraightLabel(), false, x - 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x - 3, y + 1, z , l, x , y + 1, z + 10 , 9.5, context.getStraightLabel(), false, x - 2 , y + 1, z + 1, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(context, world, x - 4, y + 1, z , l, x , y + 1, z + 10, 9.5, context.getStraightLabel(), false, x - 2, y + 1, z + 1, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(context, world, x - straight, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 2, y + 1, z + 1, false, false);

					}

				}

				if(l == 3) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(context, player, world, x + i, y + 1, z)) return false;
					}

					if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, true, 2, x + 10, z - 10, 9.5, x + 1, y + 1,
							z - 9, typeVariant90Turn(context, EnumCoreTrack. CORE_10X_TURN_L, tempType.getVariant()), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x  + 2, y + 1, z - 1, l, 3);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(context, world, x + 1, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(context, world, x + 2, y + 1, z , l, x + 1 , y + 1, z - 9, 9.5, context.getStraightLabel(), false, x + 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(context, world, x + 3, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, context.getStraightLabel(), false, x + 2 , y + 1, z - 1, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(context, world, x + 4, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, context.getStraightLabel(), false, x + 2, y + 1, z - 1, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(context, world, x + straight, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 2, y + 1, z - 1, false, false);

					}

				}


				return true;
			}

			case CORE_3x5_45DEGREE_SWITCH_R:
				if (!mediumRight45DegreeSwitch(context, player, world, x, y, z, l, tempType, context.getStraightLabel(), typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()))) {
					return false;
				}


				return true;
			case CORE_3x5_45DEGREE_SWITCH_L:
				if (!mediumLeft45DegreeSwitch(context, player, world, x, y, z, l, tempType, context.getStraightLabel(), typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_L, tempType.getVariant()))){
					return false;
				}


				return true;
			case CORE_4x8_45DEGREE_SWITCH_R:
				if (!largeRight45DegreeSwitch(context, player, world, x, y, z, l, tempType, context.getStraightLabel(), typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_R, tempType.getVariant()))){
					return false;
				}


				return true;
			case CORE_4x8_45DEGREE_SWITCH_L:
				if (!largeLeft45DegreeSwitch(context, player, world, x, y, z, l, tempType, context.getStraightLabel(), typeVariant90Turn(context, EnumCoreTrack. CORE_5X_TURN_L, tempType.getVariant()))){
					return false;
				}


				return true;
			case CORE_TWO_WAYS_CROSSING:
			{
				if (!canPlaceTrack(context, player, world, x, y + 1, z))
				{
					return false;
				}

				int zDisplace = 0;
				int xDisplace = 0;
				int xSideDisplace = 0;
				int zSideDisplace = 0;
				int sideFacing = l;

				if (l == 2)
				{
					zDisplace = -1;
					xSideDisplace = 1;
					sideFacing = 1;
				}
				if (l == 3)
				{
					xDisplace = 1;
					zSideDisplace = 1;
					sideFacing = 2;
				}
				if (l == 0)
				{
					zDisplace = 1;
					xSideDisplace = 1;
					sideFacing = 1;
				}
				if (l == 1)
				{
					xDisplace = -1;
					zSideDisplace = 1;
					sideFacing = 2;
				}

				if (!canPlaceTrack(context, player, world, x + xDisplace, y + 1, z + zDisplace)
						|| !canPlaceTrack(context, player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2)))
				{
					return false;
				}
				if (!canPlaceTrack(context, player, world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
						z + (zDisplace) + (zSideDisplace)))
				{
					return false;
				}
				if (!canPlaceTrack(context, player, world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
						z + (zDisplace) - (zSideDisplace)))
				{
					return false;
				}

				/*
				 * Bottom
				 */

				putDownSingleRail(context, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
						z + (zDisplace * 2), 0, context.getStraightLabel(), true, x + (xDisplace), y + 1,
						z + (zDisplace), false, false);

				// putDownSingleRail(context, world, x+(xDisplace*4), y + 1, z+(zDisplace*4), l,
				// x+(xDisplace*4) , y + 1, z+(zDisplace*4), 0,
				// EnumTracks.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*3), y + 1,
				// z+(zDisplace*3), false, false);


				placeTrack(context, world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
				TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
				tcRail2.setFacing(l);
				tcRail2.cx = x + (xDisplace);
				tcRail2.cy = y + 1;
				tcRail2.cz = z + (zDisplace);
				tcRail2.setType(type.getLabel());
				tcRail2.idDrop = this.type.getItem().item;

				/*
				 * Top
				 */

				// putDownSingleRail(context, world, x + (xDisplace), y + 1, z + (zDisplace), l, x +
				// (xDisplace), y + 1,
				// z + (zDisplace), 0, EnumTracks.SMALL_STRAIGHT.getLabel(), true, x +
				// (xDisplace * 2), y + 1,
				// z + (zDisplace * 2), false, false);

				putDownSingleRail(context, world, x, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true,
						x + (xDisplace), y + 1, z + (zDisplace), false, false);

				/*
				 * Right
				 */

				putDownSingleRail(context, world, x + (xDisplace) + (xSideDisplace), y + 1,
						z + (zDisplace) + (zSideDisplace), sideFacing,
						x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace) + (zSideDisplace), 0,
						context.getStraightLabel(), true, x + (xDisplace), y + 1, z + (zDisplace),
						false, false);

				// putDownSingleRail(context, world, x + (xDisplace * 2) + (xSideDisplace * 2), y + 1,
				// z + (zDisplace * 2) + (zSideDisplace * 2), sideFacing,
				// x + (xDisplace * 2) + (xSideDisplace * 2), y + 1, z + (zDisplace * 2) +
				// (zSideDisplace * 2), 0,
				// EnumTracks.SMALL_STRAIGHT.getLabel(), true, x + (xDisplace * 2) + (xSideDisplace
				//), y + 1,
				// z + (zDisplace * 2) + (zSideDisplace), false, false);

				/*
				 * Left
				 */

				putDownSingleRail(context, world, x + (xDisplace) - (xSideDisplace), y + 1,
						z + (zDisplace) - (zSideDisplace), sideFacing,
						x + (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace) - (zSideDisplace), 0,
						context.getStraightLabel(), true, x + (xDisplace), y + 1, z + (zDisplace),
						false, false);

				//				putDownSingleRail(context, world, x+(xDisplace*2)-(xSideDisplace*2), y + 1, z+(zDisplace*2)-(zSideDisplace*2), sideFacing, x+(xDisplace*2)-(xSideDisplace*2) , y + 1, z+(zDisplace*2)-(zSideDisplace*2), 0, context.getStraightLabel(), true, x+(xDisplace*2)-(xSideDisplace*1), y + 1, z+(zDisplace*2)-(zSideDisplace*1), false, false);


				return true;
			}

			case CORE_DIAMOND_CROSSING_R:
				if (!rightDiamondCrossing(context, player, world, x, y, z, l, tempType))
				{
					return false;
				}
				else
				{

					return true;
				}
			case CORE_DIAMOND_CROSSING_L:
				if (!leftDiamondCrossing(context, player, world, x, y, z, l, tempType))
				{
					return false;
				}
				else
				{

					return true;
				}
			case CORE_DOUBLE_DIAMOND_CROSSING:
				if (!doubleDiamondCrossing(context, player, world, x, y, z, l, type))
				{
					return false;
				}
				else
				{

					return true;
				}
			case CORE_DIAGONAL_TWO_WAYS_CROSSING:
				if (!diagonalTwoWaysCrossing(context, player, world, x, y, z, MathHelper.floor_double((player != null ? player.rotationYaw : par10) * 4.0F / 360.0F + 0.5D) & 3, tempType)){
					return false;
				}
				else
				{

					return true;
				}
			case CORE_FOUR_WAYS_CROSSING:
				if (!fourWaysCrossing(context, player, world, x, y, z, l, type)){
					return false;
				}
				else
				{

					return true;
				}
			/** Placement of Medium and Long Straight */
			case CORE_MEDIUM_STRAIGHT:
			case CORE_LONG_STRAIGHT:
			case CORE_VERY_LONG_STRAIGHT:
			{
				/** check if first rail can be placed */
				if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
					return false;
				}

				Boolean isAnyTypeOfLongStraight = EnumCoreTrack.CORE_LONG_STRAIGHT.equals(type.getCoreTrack());
				Boolean isAnyTypeOfVeryLongStraight = EnumCoreTrack.CORE_VERY_LONG_STRAIGHT.equals(type.getCoreTrack());

				TileTCRailGag[] tileGag = new TileTCRailGag[2]; /** makes it so only 2 gags are placed */
				if (isAnyTypeOfLongStraight) {
					tileGag = new TileTCRailGag[4];
				}

				if (isAnyTypeOfVeryLongStraight){
					tileGag = new TileTCRailGag[8];
				}
				if (l == 2) {
					if (!canPlaceTrack(context, player, world, x, y + 1, z - 1) || !canPlaceTrack(context, player, world, x, y + 1, z - 2)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(context, player, world, x, y + 1, z - 3) || !canPlaceTrack(context, player, world, x, y + 1, z - 4)
								|| !canPlaceTrack(context, player, world, x, y + 1, z - 5)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if (!canPlaceTrack(context, player, world, x, y + 1, z - 3) || !canPlaceTrack(context, player, world, x, y + 1, z - 4)
								|| !canPlaceTrack(context, player, world, x, y + 1, z - 5) || !canPlaceTrack(context, player, world, x, y+1, z - 6) || !canPlaceTrack(context, player, world, x, y+1, z - 7) || !canPlaceTrack(context, player, world, x, y+1, z - 8)  ||
								!canPlaceTrack(context, player, world, x, y+1, z - 9) || !canPlaceTrack(context, player, world,x, y+1, z - 10) || !canPlaceTrack(context, player, world, x, y+1, z - 11)) {
							return false;
						}
					}
					placeTrack(context, world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(context, world,x, y + 1, z - 1, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 1);

					placeTrack(context, world,x, y + 1, z - 2, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 2);

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight || isAnyTypeOfVeryLongStraight) {
						placeTrack(context, world,x, y + 1, z - 3, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z - 3);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z - 1;

						placeTrack(context, world,x, y + 1, z - 4, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 4);

						placeTrack(context, world,x, y + 1, z - 5, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 5);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(context, world,x, y+1, z - 6, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x, y + 1, z - 6);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z - 1;

						placeTrack(context, world,x, y + 1, z - 7, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 7);

						placeTrack(context, world,x, y + 1, z - 8, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 8);

						placeTrack(context, world,x, y+1, z - 9, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x, y + 1, z - 9);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z - 1;

						placeTrack(context, world,x, y + 1, z - 10, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 10);

						placeTrack(context, world,x, y + 1, z - 11, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 11);


					}

				}
				if (l == 0) {
					if (!canPlaceTrack(context, player, world, x, y + 1, z + 1) || !canPlaceTrack(context, player, world, x, y + 1, z + 2)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(context, player, world, x, y + 1, z + 3) || !canPlaceTrack(context, player, world, x, y + 1, z + 4)
								|| !canPlaceTrack(context, player, world, x, y + 1, z + 5)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if (!canPlaceTrack(context, player, world, x, y + 1, z + 3) || !canPlaceTrack(context, player, world, x, y + 1, z + 4)
								|| !canPlaceTrack(context, player, world, x, y + 1, z + 5) || !canPlaceTrack(context, player, world, x, y+1, z + 6) || !canPlaceTrack(context, player, world, x, y+1, z + 7)  ||
								!canPlaceTrack(context, player, world, x, y+1, z + 8) || !canPlaceTrack(context, player, world, x, y+1, z + 9) || !canPlaceTrack(context, player, world, x, y+1, z + 10) || !canPlaceTrack(context, player, world, x, y+1, z + 11)) {
							return false;
						}
					}
					placeTrack(context, world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(context, world,x, y + 1, z + 1, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 1);

					placeTrack(context, world,x, y + 1, z + 2, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 2);

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(context, world,x, y + 1, z + 3, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z + 3);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z + 1;

						placeTrack(context, world,x, y + 1, z + 4, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 4);

						placeTrack(context, world,x, y + 1, z + 5, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 5);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(context, world,x, y+1, z + 6, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x, y + 1, z + 6);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z + 1;

						placeTrack(context, world,x, y + 1, z + 7, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 7);

						placeTrack(context, world,x, y + 1, z + 8, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 8);

						placeTrack(context, world,x, y+1, z + 9, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x, y + 1, z + 9);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z + 1;

						placeTrack(context, world,x, y + 1, z + 10, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 10);

						placeTrack(context, world,x, y + 1, z + 11, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 11);


					}

				}
				if (l == 1) {
					if (!canPlaceTrack(context, player, world, x - 1, y + 1, z) || !canPlaceTrack(context, player, world, x - 2, y + 1, z)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(context, player, world, x - 3, y + 1, z) || !canPlaceTrack(context, player, world, x - 4, y + 1, z)
								|| !canPlaceTrack(context, player, world, x - 5, y + 1, z)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if ( !canPlaceTrack(context, player, world, x - 3, y + 1, z) || !canPlaceTrack(context, player, world, x - 4, y + 1, z)
								|| !canPlaceTrack(context, player, world, x - 5, y + 1, z) || !canPlaceTrack(context, player, world, x - 6, y+1, z ) || !canPlaceTrack(context, player, world, x - 7, y+1, z )  ||
								!canPlaceTrack(context, player, world, x - 8, y+1, z) || !canPlaceTrack(context, player, world, x - 9, y+1, z) || !canPlaceTrack(context, player, world, x - 10, y+1, z ) || !canPlaceTrack(context, player, world, x - 11, y+1, z)) {
							return false;
						}
					}
					placeTrack(context, world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(context, world,x - 1, y + 1, z , BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x - 1, y + 1, z);

					placeTrack(context, world,x - 2, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x - 2, y + 1, z );

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(context, world,x - 3, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x - 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x - 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z ;

						placeTrack(context, world,x - 4, y + 1, z , BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x - 4, y + 1, z);

						placeTrack(context, world,x - 5, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x - 5, y + 1, z);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(context, world,x - 6, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x - 6, y + 1, z);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x - 1;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z ;

						placeTrack(context, world,x - 7, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x - 7, y + 1, z);

						placeTrack(context, world,x - 8, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x - 8, y + 1, z);

						placeTrack(context, world,x - 9, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x - 9, y + 1, z);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x - 1;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z;

						placeTrack(context, world,x - 10, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x - 10, y + 1, z);

						placeTrack(context, world,x - 11, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x - 11, y + 1, z);


					}

				}
				if (l == 3) {
					if (!canPlaceTrack(context, player, world, x + 1, y + 1, z) || !canPlaceTrack(context, player, world, x + 2, y + 1, z)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(context, player, world, x + 3, y + 1, z) || !canPlaceTrack(context, player, world, x + 4, y + 1, z)
								|| !canPlaceTrack(context, player, world, x + 5, y + 1, z)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if ( !canPlaceTrack(context, player, world, x + 3, y + 1, z) || !canPlaceTrack(context, player, world, x + 4, y + 1, z)
								|| !canPlaceTrack(context, player, world, x + 5, y + 1, z) || !canPlaceTrack(context, player, world, x + 6, y+1, z ) || !canPlaceTrack(context, player, world, x + 7, y+1, z )  ||
								!canPlaceTrack(context, player, world, x + 8, y+1, z) || !canPlaceTrack(context, player, world, x + 9, y+1, z) || !canPlaceTrack(context, player, world, x + 10, y+1, z ) || !canPlaceTrack(context, player, world, x + 11, y+1, z)) {
							return false;
						}
					}
					placeTrack(context, world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(context, world,x + 1, y + 1, z , BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x + 1, y + 1, z);

					placeTrack(context, world,x + 2, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x + 2, y + 1, z );

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(context, world,x + 3, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x + 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z ;

						placeTrack(context, world,x + 4, y + 1, z , BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x + 4, y + 1, z);

						placeTrack(context, world,x + 5, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x + 5, y + 1, z);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(context, world,x + 6, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x + 6, y + 1, z);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x + 1;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z ;

						placeTrack(context, world,x + 7, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x + 7, y + 1, z);

						placeTrack(context, world,x + 8, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x + 8, y + 1, z);

						placeTrack(context, world,x + 9, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x + 9, y + 1, z);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x + 1;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z;

						placeTrack(context, world,x + 10, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x + 10, y + 1, z);

						placeTrack(context, world,x + 11, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x + 11, y + 1, z);


					}

				}


				for (int i = 0; i < tileGag.length; i++) {
					if (player !=null && tileGag[i] == null) {
						return false;
					}
					tileGag[i].initializeTrackReference(x, y + 1, z, context.getMediumStraightLabel());
				}

				return true;
			}
			case CORE_SMALL_STRAIGHT:
				if (smallStraight(context, player,world,x,y,z,l,type) == false)
				{
					return false;
				}

				return true;
			default:
			{
				if (TCRailTypes.RailTypes.SLOPE.equals(type.getRailType()))
				{
					if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
						return false;
					}

					if (type.getLabel().contains("DYNAMIC") && world.getBlock(x, y, z) == BlockIDs.bridgePillar.block)
					{
						return false;
					}

					if (tempType.getCoreTrack().isEmbeddedTransitionSlope())
					{
						if (EnumCoreTrack.CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE.equals(tempType.getCoreTrack()))
						{
							return embeddedDiagonalTransitionSlope(context, player, world, x, y, z, getFacing(player, par10), tempType);
						}
						return embeddedTransitionSlope(context, player, world, x, y, z, l, tempType);
					}

					TrackSlopeParameters slopeParameters = TrackSlopeParameters.canonical(tempType);
					if (slopeParameters == null)
					{
						return false;
					}
					int gagEnd = (int)slopeParameters.getLength() - 1;
					double slopeAngle = slopeParameters.getAngle();
					if (slopeParameters.isDiagonal())
					{
						return handleDiagonalSlopes(context, world, player, getFacing(player, par10), tempType,
								gagEnd, slopeAngle, x, y, z, itemstack);
					}

					Item idDropped = this.type.getItem().item;
					TileTCRailGag[] tileGag = new TileTCRailGag[gagEnd];

					for (int i = 1; i <= gagEnd; i++) {
						if (l == 2) {
							if (!canPlaceTrack(context, player, world, x, y + 1, z - i)) {
								return false;
							}
						}
						if (l == 0) {
							if (!canPlaceTrack(context, player, world, x, y + 1, z + i)) {
								return false;
							}
						}
						if (l == 1) {
							if (!canPlaceTrack(context, player, world, x - i, y + 1, z)) {
								return false;
							}
						}
						if (l == 3) {
							if (!canPlaceTrack(context, player, world, x + i, y + 1, z)) {
								return false;
							}
						}
					}
					placeTrack(context, world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());
					tcRail.idDrop = idDropped;
					final double slopeHeight = tempType.getCoreTrack().isHalfHeightSlope() ? 0.5D : 1.0D;
					tcRail.slopeHeight = slopeHeight;
					tcRail.slopeAngle = slopeAngle;
					tcRail.slopeLength = gagEnd + 1;
					tcRail.setOwnerUUID(handleTrackOwner(player));

					if (BallastTypes.DYNAMIC.equals(tempType.getBallastType()))
					{
						ActionBarMessenger.display(player, EnumChatFormatting.YELLOW
								+ "Right-click the first tile to change slope ballast material.");
						setDynamicBallastFromSupport(context, tcRail, world, x, y, z);
					}

					for (int i2 = 1; i2 <= gagEnd; i2++)
					{
						switch (l)
						{
							case 2:
								placeTrack(context, world,x, y + 1, z - i2, BlockIDs.tcRailGag.block, l);
								tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - i2);
								tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min((float)slopeHeight, (float)(slopeHeight * i2 / gagEnd)));
								break;
							case 0:
								placeTrack(context, world,x, y + 1, z + i2, BlockIDs.tcRailGag.block, l);
								tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + i2);
								tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min((float)slopeHeight, (float)(slopeHeight * i2 / gagEnd)));
								break;
							case 1:
								placeTrack(context, world,x - i2, y + 1, z, BlockIDs.tcRailGag.block, l);
								tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x - i2, y + 1, z);
								tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min((float)slopeHeight, (float)(slopeHeight * i2 / gagEnd)));
								break;
							case 3:
								placeTrack(context, world,x + i2, y + 1, z, BlockIDs.tcRailGag.block, l);
								tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x + i2, y + 1, z);
								tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min((float)slopeHeight, (float)(slopeHeight * i2 / gagEnd)));
								break;
						}
					}
					for (int i = 0; i < tileGag.length; i++) {
						if (player != null && tileGag[i] == null) {
							return false;
						}
						tileGag[i].initializeTrackReference(x, y + 1, z, type.getLabel());
					}

					return true;
				}
			}
		}

		return true;

	}

	private String handleTrackOwner(EntityPlayer entityPlayer)
	{
		return entityPlayer != null ? entityPlayer.getUniqueID().toString() : "Villager Joe";
	}

	/**
	 * Places a cardinal transition from an embedded rail to the next block level.
	 *
	 * @param player player placing the track
	 * @param world destination world
	 * @param x parent support X coordinate
	 * @param y parent support Y coordinate
	 * @param z parent support Z coordinate
	 * @param facing cardinal track facing
	 * @param type transition definition being placed
	 * @return whether the complete transition was placed
	 */
	private boolean embeddedTransitionSlope(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int facing, ITrackDefinition type)
	{
		TrackSlopeParameters slope = TrackSlopeParameters.canonical(type);
		if (slope == null)
		{
			return false;
		}
		int slopeLength = (int)slope.getLength();
		int stepX = 0;
		int stepZ = 0;
		if (facing == FACING_POSITIVE_Z)
		{
			stepZ = 1;
		}
		if (facing == FACING_NEGATIVE_Z)
		{
			stepZ = -1;
		}
		if (facing == FACING_NEGATIVE_X)
		{
			stepX = -1;
		}
		if (facing == FACING_POSITIVE_X)
		{
			stepX = 1;
		}

		for (int i = 0; i < slopeLength; i++)
		{
			if (canPlaceTrack(context, player, world, x + stepX * i, y + 1, z + stepZ * i) == false)
			{
				return false;
			}
		}

		TileTCRail parent = placeEmbeddedTransitionParent(context, player, world, x, y, z, facing, type);
		if (parent == null)
		{
			return false;
		}

		for (int i = 1; i < slopeLength; i++)
		{
			if (placeEmbeddedTransitionGag(context, player, world, x + stepX * i, y + 1, z + stepZ * i,
					x, y + 1, z, facing, type) == false)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Places a diagonal transition from an embedded rail to the next block level.
	 *
	 * @param player player placing the track
	 * @param world destination world
	 * @param x parent support X coordinate
	 * @param y parent support Y coordinate
	 * @param z parent support Z coordinate
	 * @param facing diagonal track facing
	 * @param type transition definition being placed
	 * @return whether the complete transition was placed
	 */
	private boolean embeddedDiagonalTransitionSlope(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int facing, ITrackDefinition type)
	{
		int directionX = 1;
		int directionZ = 1;
		switch (facing)
		{
			case DIAGONAL_FACING_POSITIVE_X_NEGATIVE_Z:
				directionZ = -1;
				break;
			case DIAGONAL_FACING_NEGATIVE_X_POSITIVE_Z:
				directionX = -1;
				break;
			case DIAGONAL_FACING_NEGATIVE_X_NEGATIVE_Z:
				directionX = -1;
				directionZ = -1;
				break;
			default:
				break;
		}

		int[][] usedSpace = EnumTracks.getUsedSpaceFromType(type, player);
		for (int[] offset : usedSpace)
		{
			int offsetX = offset[0] * directionX;
			int offsetZ = offset[1] * directionZ;
			if (canPlaceTrack(context, player, world, x + offsetX, y + 1, z + offsetZ) == false)
			{
				return false;
			}
		}

		TileTCRail parent = placeEmbeddedTransitionParent(context, player, world, x, y, z, facing, type);
		if (parent == null)
		{
			return false;
		}

		for (int i = 1; i < usedSpace.length; i++)
		{
			int offsetX = usedSpace[i][0] * directionX;
			int offsetZ = usedSpace[i][1] * directionZ;
			if (placeEmbeddedTransitionGag(context, player, world, x + offsetX, y + 1, z + offsetZ,
					x, y + 1, z, facing, type) == false)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Creates and initializes the parent rail for an embedded transition.
	 *
	 * @param player player placing the track
	 * @param world destination world
	 * @param x parent support X coordinate
	 * @param y parent support Y coordinate
	 * @param z parent support Z coordinate
	 * @param facing track facing
	 * @param type transition definition being placed
	 * @return initialized parent rail, or {@code null} when placement failed
	 */
	private TileTCRail placeEmbeddedTransitionParent(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int facing, ITrackDefinition type)
	{
		TrackSlopeParameters slope = TrackSlopeParameters.canonical(type);
		if (slope == null)
		{
			return null;
		}
		placeTrack(context, world, x, y + 1, z, BlockIDs.tcRail.block, facing);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
		if (tcRail == null)
		{
			return null;
		}
		tcRail.setFacing(facing);
		tcRail.setType(type.getLabel());
		tcRail.idDrop = this.type.getItem().item;
		tcRail.slopeHeight = slope.getHeight();
		tcRail.slopeLength = slope.getLength();
		tcRail.slopeAngle = slope.getAngle();
		tcRail.setOwnerUUID(handleTrackOwner(player));
		return tcRail;
	}

	/**
	 * Creates one gag cell linked to an embedded-transition parent.
	 *
	 * @param player player placing the track
	 * @param world destination world
	 * @param x gag X coordinate
	 * @param y gag Y coordinate
	 * @param z gag Z coordinate
	 * @param originX parent X coordinate
	 * @param originY parent Y coordinate
	 * @param originZ parent Z coordinate
	 * @param facing track facing
	 * @param type transition definition being placed
	 * @return whether the gag was placed and initialized
	 */
	private boolean placeEmbeddedTransitionGag(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int originX, int originY, int originZ, int facing, ITrackDefinition type)
	{
		placeTrack(context, world, x, y, z, BlockIDs.tcRailGag.block, facing);
		TileTCRailGag gag = (TileTCRailGag) world.getTileEntity(x, y, z);
		if (gag == null)
		{
			return false;
		}
		gag.initializeTrackReference(originX, originY, originZ, type.getLabel());
		return true;
	}

	/**
	 * Places a full- or half-height diagonal slope and its gag footprint.
	 *
	 * @param world destination world
	 * @param player player placing the slope
	 * @param facing diagonal facing metadata
	 * @param type effective diagonal slope definition
	 * @param gagEnd final gag index
	 * @param slopeAngle constant diagonal path angle in radians
	 * @param x parent X coordinate
	 * @param y supporting-block Y coordinate
	 * @param z parent Z coordinate
	 * @param itemstack selected rail stack
	 * @return whether the complete slope was placed
	 */
	private boolean handleDiagonalSlopes(TrackPlacementContext context, World world, EntityPlayer player, int facing, ITrackDefinition type, int gagEnd, double slopeAngle, int x, int y, int z, ItemStack itemstack) {
		Item idDropped = this.type.getItem().item;
		int[][] usedSpace = EnumTracks.getUsedSpaceFromType(type, player);
		//make sure space is usable
        for (int[] ints : usedSpace) {
            int offsetX = ints[0];
            int offsetZ = ints[1];
            if (facing == 4) offsetX *= -1;
            if (facing == 6) offsetZ *= -1;
            if (facing == 5) {
                offsetX *= -1;
                offsetZ *= -1;
            }
            if (!canPlaceTrack(context, player, world, x + offsetX, y + 1, z + offsetZ)) {
                return false;
            }
        }
		//place host track
		placeTrack(context, world,x, y + 1, z, BlockIDs.tcRail.block, facing);
		//update data of host
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail.setFacing(facing);
		tcRail.setType(type.getLabel());
		tcRail.idDrop = idDropped;
		final double slopeHeight = type.getCoreTrack().isHalfHeightSlope() ? 0.5D : 1.0D;
		tcRail.slopeHeight = slopeHeight;
		tcRail.slopeAngle = slopeAngle;
		tcRail.slopeLength = gagEnd + 1;
		tcRail.setOwnerUUID(handleTrackOwner(player));
		if ((this.type.getBallastType()) == BallastTypes.DYNAMIC)
		{
			setDynamicBallastFromSupport(context, tcRail, world, x, y, z);
			ActionBarMessenger.display(player, EnumChatFormatting.YELLOW
					+ "Right-click the first tile to change slope ballast material.");
		}
		else
		{
			switch (this.type.getBallastType())
			{
				case GRAVEL:
					tcRail.setBallastMaterial(Block.getIdFromBlock(Blocks.gravel));
					tcRail.ballastMetadata = world.getBlockMetadata(x, y, z);
					break;
				case BALLAST:
					tcRail.setBallastMaterial(Block.getIdFromBlock(BlockIDs.oreTC.block));
					tcRail.ballastMetadata = 3;
					break;
				case SNOWGRAVEL:
					tcRail.setBallastMaterial(Block.getIdFromBlock(BlockIDs.oreTC.block));
					tcRail.ballastMetadata = 4;
					break;
			}
		}
		//tcRail.enableSlabs = player.isSneaking();

		for (int i = 1; i < usedSpace.length; i++) {
			int[] ints = usedSpace[i];
			int offsetX = ints[0];
			int offsetZ = ints[1];
			if (facing == 4) offsetX *= -1;
			if (facing == 6) offsetZ *= -1;
			if (facing == 5) {
				offsetX *= -1;
				offsetZ *= -1;
			}
			placeTrack(context, world, x + offsetX, y + 1, z + offsetZ, BlockIDs.tcRailGag.block, facing);
			TileTCRailGag gag = ((TileTCRailGag)world.getTileEntity(x + offsetX, y + 1, z + offsetZ));
			if (player != null && gag == null) {
				return false;
			}
			gag.bbHeight = Math.max(0.125f, Math.min((float)slopeHeight,
					(float)(slopeHeight * Math.hypot(offsetX, offsetZ) / (gagEnd + 1))));
			//old way: tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));. seems unnecessary
			gag.initializeTrackReference(x, y + 1, z, type.getLabel());
		}


		return true;
	}

	private int getFacing(EntityPlayer player, float par10)
	{
		if (player != null)
		{
			return TCTrackDirection.ConvertDiagonalDirectionInput(MathHelper.floor_double(((player.rotationYaw) * 8.0F / 360.0F + 0.5D)) & 7);
		}

		return MathHelper.floor_double((par10 * 4.0F / 360.0F + 0.5D)) & 3;
	}

	/**
	 * Resolves the handed or oriented definition selected by player facing and hit position.
	 *
	 * @param selectedTrack definition selected on the item stack
	 * @param player placing player
	 * @param l legacy horizontal facing index
	 * @param par10 hit Z within the clicked block
	 * @return oriented track definition used for placement
	 */
	private ITrackDefinition getPlacementDirection(ITrackDefinition selectedTrack,
			EntityPlayer player, int l, float par10)
	{
		ITrackDefinition type = selectedTrack;
		ITrackDefinition directionalTrack = type;

		int facing = getFacing(player, par10);
		if (TCRailTypes.RailTypes.STRAIGHT.equals(type.getRailType()))
		{
			if (facing == 6 || facing == 4 || facing == 7 || facing == 5)
			{
				return EnumTracks.GetTrackByLabel(type.getLabel().replace("_STRAIGHT", "_DIAGONAL_STRAIGHT"));
			}
		}
		else if (TCRailTypes.RailTypes.CROSSING.equals(type.getRailType()))
		{
			if (facing == 6 || facing == 4 || facing == 7 || facing == 5)
			{
				switch (type.getCoreTrack())
				{
					case CORE_TWO_WAYS_CROSSING:
						directionalTrack = EnumTracks.GetTrackByLabel(
								type.getLabel().replace("TWO_WAYS", "DIAGONAL_TWO_WAYS"));
						break;
				}

				return directionalTrack;
			}
		}
		else if (TCRailTypes.RailTypes.SLOPE.equals(type.getRailType())) {
			if (facing == 4 || facing == 5 || facing == 6 || facing == 7)
			{
				String nameConverted = type.getLabel() + "_DIAGONAL";
				// Have to add this to convert older track that use older names.

				switch (type.getCoreTrack())
				{
					case CORE_EMBEDDED_TRANSITION_SLOPE:
						nameConverted = "TRUE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE";
						break;
					case CORE_6_SLOPE:
						nameConverted = nameConverted.replace("SLOPE", "SLOPE_1X6");
						break;
					case CORE_12_SLOPE:
						nameConverted = nameConverted.replace("LARGE_SLOPE", "SLOPE_1X12");
						break;
					case CORE_18_SLOPE:
						nameConverted = nameConverted.replace("VERY_LARGE_SLOPE", "SLOPE_1X18");
						break;
				}
				nameConverted = nameConverted.replace("GRAVEL", "DYNAMIC")
											 .replace("BALLAST", "DYNAMIC")
											 .replace("_SNOW", "");

				ITrackDefinition track = EnumTracks.GetTrackByLabel(nameConverted);
				if (track != null)
				{
					directionalTrack = track;
					return directionalTrack;
				}
			}
		}

		/** Determines if track is left or right*/
		float yaw = MathHelper.wrapAngleTo180_float(player!=null?player.rotationYaw:par10);

		if (EnumCoreTrack.CORE_1X_TURN.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("TURN_1X1", orientation.toUpperCase() + "_TURN_1X1"));
			}
		}

		if (EnumCoreTrack.CORE_3X_TURN.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("MEDIUM_", "MEDIUM_" + orientation.toUpperCase() + "_"));
			}
		}

		if (EnumCoreTrack.CORE_5X_TURN.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_10X_TURN.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_16X_TURN.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("LARGE_", "LARGE_" + orientation.toUpperCase() + "_"));
			}
		}

		if (EnumCoreTrack.CORE_29X_TURN.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_32X_TURN.equals(type.getCoreTrack())

				|| EnumCoreTrack.CORE_9X20_45DEGREE_TURN.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_10x22_45DEGREE_TURN.equals(type.getCoreTrack())
		)
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("TURN_", orientation.toUpperCase() + "_TURN_"));
			}
		}

		if (EnumCoreTrack.CORE_3X4_45DEGREE_TURN.equals(type.getCoreTrack())
			|| EnumCoreTrack.CORE_3x5_45DEGREE_SWITCH.equals(type.getCoreTrack())
			|| EnumCoreTrack.CORE_3X6_45DEGREE_TURN.equals(type.getCoreTrack())
			|| EnumCoreTrack.CORE_4X8_45DEGREE_TURN.equals(type.getCoreTrack())
			|| EnumCoreTrack.CORE_5X11_45DEGREE_TURN.equals(type.getCoreTrack())
		)
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("45DEGREE", orientation.toUpperCase() + "_45DEGREE"));
			}
		}

		if (EnumCoreTrack.CORE_S_CURVE_2x8.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_S_CURVE_3x12.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_S_CURVE_4x16.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_4x17_PARALLEL_SWITCH.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_4x11_PARALLEL_SWITCH.equals(type.getCoreTrack())
		)
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("PARALLEL", orientation.toUpperCase() + "_PARALLEL"));
			}
		}

		if (EnumCoreTrack.CORE_4x4_SWITCH.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_6x6_SWITCH.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_11x11_SWITCH.equals(type.getCoreTrack())
		)
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("SWITCH", orientation.toUpperCase() + "_SWITCH"));
			}
		}

		if (EnumCoreTrack.CORE_4x8_45DEGREE_SWITCH.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(type.getLabel().replace(
						"45DEGREE_SWITCH", orientation.toUpperCase() + "_45DEGREE_SWITCH"));
			}
		}

		if (EnumCoreTrack.CORE_S_CURVE_20x2.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("CURVE", "CURVE_" + orientation.toUpperCase()));
			}
		}

		if (EnumCoreTrack.CORE_10x2_CROSSOVER_SWITCH.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(type.getLabel().replace(
						EnumTracks.CROSSOVER_SWITCH_10X2.getLabel(),
						EnumTracks.CROSSOVER_SWITCH_10X2.getLabel() + "_" + orientation.toUpperCase()));
			}

		}
		if (EnumCoreTrack.CORE_DIAMOND_CROSSING.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				directionalTrack = EnumTracks.GetTrackByLabel(
						type.getLabel().replace("DIAMOND", orientation.toUpperCase() + "_DIAMOND"));
			}
		}

		return directionalTrack;
	}

	/**
	 * Places a short straight parent cell and initializes its tile data.
	 *
	 * @param player placing player
	 * @param world target world
	 * @param x origin X coordinate
	 * @param y origin Y coordinate
	 * @param z origin Z coordinate
	 * @param l placed facing
	 * @param type selected track definition
	 * @return whether the straight was placed successfully
	 */
	private boolean smallStraight(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition type)
	{
		if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}

		if (type.getLabel().contains("DYNAMIC") && world.getBlock(x, y, z) == BlockIDs.bridgePillar.block)
		{
			return false;
		}


		placeTrack(context, world,x, y + 1, z, BlockIDs.tcRail.block, l);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail.setFacing(l);
		tcRail.cx = x;
		tcRail.cy = y + 1;
		tcRail.cz = z;
		tcRail.setType(type.getLabel());
		tcRail.idDrop = this.type.getItem().item;

		if (type.getLabel().contains("DYNAMIC"))
		{
			setDynamicBallastFromSupport(context, tcRail, world, x, y, z);
		}


		return true;
	}

	/**
	 * Assigns dynamic ballast from the support represented by one placed parent rail. Replacement placement uses the
	 * transaction's pre-mutation capture at {@code supportY + 1}; ordinary surface placement continues sampling the
	 * live support block at {@code supportY}.
	 *
	 * @param context immutable state for this placement operation
	 * @param rail placed parent rail receiving ballast data
	 * @param world world containing the support or replacement capture
	 * @param x parent/support X coordinate
	 * @param supportY placement routine's support-block Y coordinate
	 * @param z parent/support Z coordinate
	 */
	private void setDynamicBallastFromSupport(TrackPlacementContext context,
			TileTCRail rail, World world, int x, int supportY, int z)
	{
		TrackHostPlacementTransaction transaction = context.getTransaction();
		if (transaction != null && transaction.applyCapturedBallast(rail, x, supportY + 1, z))
		{
			return;
		}
		Block block = world.getBlock(x, supportY, z);
		rail.setBallastMaterial(Block.getIdFromBlock(block));
		rail.ballastMetadata = world.getBlockMetadata(x, supportY, z);
	}

	private boolean SCurve(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int dir, ITrackDefinition tempType, float pyaw, int[] xArray, int[]zArray, int[] xArray2, int[] zArray2, float radius, int length, int width){
		float yaw = MathHelper.wrapAngleTo180_float(player != null ? player.rotationYaw : pyaw);
		String ori = getTrackOrientation(dir,yaw);

		if (ori.equals("right")) {
			xArray = flipArraySign(xArray);
			xArray2 = flipArraySign(xArray2);
		}

		int xOffset = 0;
		int zOffset = 0;
		double cx = 0;
		double cz = 0;
		double cx2 = 0;
		double cz2 = 0;
		int[] usedXArray = new int[0];
		int[] usedZArray = new int[0];
		int[] usedXArray2 = new int[0];
		int[] usedZArray2 = new int[0];

		if (dir==2) {
			usedXArray = flipArraySign(xArray,x,true);
			usedZArray = flipArraySign(zArray,z,true);
			usedXArray2 = flipArraySign(xArray2, x, true);
			usedZArray2 = flipArraySign(zArray2, z, true);

			if (ori.equals("right")) {
				xOffset = width;
				cx = -(radius + 0.5f);
				cx2 = -(-radius + (width - 0.5f));
			} else {
				xOffset = -width;
				cx = (radius - 0.5);
				cx2 = -(radius - width + 1.5f);

			}
			zOffset = -length;
			cz = -1f;
			cz2 = -(-length + 1);
		}
		else if (dir == 0) {
			usedXArray = flipArraySign(xArray,x,false);
			usedZArray = flipArraySign(zArray,z,false);
			usedXArray2 = flipArraySign(xArray2, x, false);
			usedZArray2 = flipArraySign(zArray2, z, false);

			if (ori.equals("right")) {
				xOffset = -width;
				cx = radius - 0.5f;
				cx2 = -(radius - (width - 0.5f - 1));

			} else {
				xOffset = width;
				cx = -(radius + 0.5);
				cx2 = -(-radius + width - 0.5f);
			}
			cz2 = -(length);
			zOffset = length;

		}
		else if (dir == 1) {
			usedXArray = flipArraySign(zArray, x, true);
			usedZArray = flipArraySign(xArray, z, false);
			usedXArray2 = flipArraySign(zArray2, x, true);
			usedZArray2 = flipArraySign(xArray2, z, false);

			if (ori.equals("right")) {
				zOffset = -width;
				cz = -(-radius + 0.5f);
				cz2 = -(radius - width + 1.5f);
			} else {
				zOffset = width;
				cz = -(radius + 0.5f);
				cz2 = -(-radius + (width - 0.5f));
			}
			xOffset = -length;
			cx = -1f;
			cx2 = -(-length + 1);
		}
		else if (dir == 3){
			usedXArray = flipArraySign(zArray, x, false);
			usedZArray = flipArraySign(xArray, z, true);
			usedXArray2 = flipArraySign(zArray2, x, false);
			usedZArray2 = flipArraySign(xArray2, z, true);
			if (ori.equals("right")) {
				zOffset = width;
				cz = -(radius + 0.5f);
				cz2 = radius - (width - 0.5f);

			} else {
				zOffset = -width;
				cz = -(-radius + 0.5f);
				cz2 = -(radius - (width - 0.5) + 1);
			}
			cx2 = -length;
			xOffset = length;

		}
		if (usedXArray.length == 0) {
			return false;
		}

		for (int check = 0; check < usedXArray.length; check++){
			if (!canPlaceTrack(context, player, world, usedXArray[check], y + 1, usedZArray[check])
					|| !canPlaceTrack(context, player, world, usedXArray2[check], y + 1, usedZArray2[check])){
				return false;
			}
		}


		if (!putDownTurn(context, player, world, false, x, y, z, usedXArray, usedZArray, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx,
				y + 1, z - cz, tempType.getLabel(), tempType.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);


		if (tcRailTurn != null) {
			tcRailTurn.hasModel = true;
			if (!putDownTurn(context, player, world, false, x, y, z, usedXArray2, usedZArray2, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx2,
					y + 1, z - cz2, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), (Item) null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(usedXArray2[0], y + 1, usedZArray2[0]);

			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = usedXArray2[0];
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = usedZArray2[0];
		}
		return true;

	}

	private boolean parallelRightSwitchEast(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(context, player, world, x + check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(context, player, world, x + 3, y + 1, z + 1) || !canPlaceTrack(context, player, world, x + 4, y + 1, z + 1) || !canPlaceTrack(context, player, world, x + 5, y + 1, z + 1) || !canPlaceTrack(context, player, world, x + 4, y + 1, z + 2) || !canPlaceTrack(context, player, world, x + 5, y + 1, z + 2) || !canPlaceTrack(context, player, world, x + 6, y + 1, z + 2) || !canPlaceTrack(context, player, world, x + 7, y + 1, z + 2) || !canPlaceTrack(context, player, world, x + 8, y + 1, z + 2) || !canPlaceTrack(context, player, world, x + 6, y + 1, z + 3) || !canPlaceTrack(context, player, world, x + 7, y + 1, z + 3) || !canPlaceTrack(context, player, world, x + 8, y + 1, z + 3) || !canPlaceTrack(context, player, world, x + 9, y + 1, z + 3) || !canPlaceTrack(context, player, world, x + 10, y + 1, z + 3) || !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 3, x + 2, x + 4, x + 5 };
		int[] zArray = { z + 1, z + 1, z + 1, z + 1 };
		if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z + 9,
				typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), tempType.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(context, world, x + 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x + 3, y + 1, z + 1, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(context, world, x + 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, context.getStraightLabel(), false, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(context, world, x + 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, context.getStraightLabel(), false, x + 3, y + 1, z + 1, true, false);

			int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
			int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
			if (!putDownTurn(context, player, world, false, x, y, z, xArray2, zArray2, 0, true, 3, x + 10, z + 3, 8.5, x + 10, y + 1, z - 5,
					typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 4, y + 1, z + 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 2;
		}
		/** Put down straight **/
		putDownSingleRail(context, world, x + 4, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(context, world, x + straight, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 3, y + 1, z + 1, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchWest(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(context, player, world, x - check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(context, player, world, x - 3, y + 1, z - 1) || !canPlaceTrack(context, player, world, x - 4, y + 1, z - 1) || !canPlaceTrack(context, player, world, x - 5, y + 1, z - 1) || !canPlaceTrack(context, player, world, x - 4, y + 1, z - 2) || !canPlaceTrack(context, player, world, x - 5, y + 1, z - 2) || !canPlaceTrack(context, player, world, x - 6, y + 1, z - 2) || !canPlaceTrack(context, player, world, x - 7, y + 1, z - 2) || !canPlaceTrack(context, player, world, x - 8, y + 1, z - 2) || !canPlaceTrack(context, player, world, x - 6, y + 1, z - 3) || !canPlaceTrack(context, player, world, x - 7, y + 1, z - 3) || !canPlaceTrack(context, player, world, x - 8, y + 1, z - 3) || !canPlaceTrack(context, player, world, x - 9, y + 1, z - 3) || !canPlaceTrack(context, player, world, x - 10, y + 1, z - 3) || !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 3, x - 2, x - 4, x - 5 };
		int[] zArray = { z - 1, z - 1, z - 1, z - 1 };
		if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z - 8,
				typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(context, world, x - 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x - 3, y + 1, z - 1, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(context, world, x - 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, context.getStraightLabel(), false, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(context, world, x - 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, context.getStraightLabel(), false, x - 3, y + 1, z - 1, true, false);

			int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
			int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
			if (!putDownTurn(context, player, world, false, x, y, z, xArray2, zArray2, 2, true, 1, x - 10, z - 3, 8.5, x - 9, y + 1, z + 6,
					typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 4, y + 1, z - 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 2;
		}

		/** Put down straight **/
		putDownSingleRail(context, world, x - 4, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 3, y + 1, z - 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(context, world, x - straight, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchSouth(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(context, player, world, x, y + 1, z + check))
				return false;
		}
		if (!canPlaceTrack(context, player, world, x - 1, y + 1, z + 3) || !canPlaceTrack(context, player, world, x - 1, y + 1, z + 4) || !canPlaceTrack(context, player, world, x - 1, y + 1, z + 5) || !canPlaceTrack(context, player, world, x - 2, y + 1, z + 4) || !canPlaceTrack(context, player, world, x - 2, y + 1, z + 5) || !canPlaceTrack(context, player, world, x - 2, y + 1, z + 6) || !canPlaceTrack(context, player, world, x - 2, y + 1, z + 7) || !canPlaceTrack(context, player, world, x - 2, y + 1, z + 8) || !canPlaceTrack(context, player, world, x - 3, y + 1, z + 6) || !canPlaceTrack(context, player, world, x - 3, y + 1, z + 7) || !canPlaceTrack(context, player, world, x - 3, y + 1, z + 8) || !canPlaceTrack(context, player, world, x - 3, y + 1, z + 9) || !canPlaceTrack(context, player, world, x - 3, y + 1, z + 10) || !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 1, x - 1, x - 1, x - 1 };
		int[] zArray = { z + 3, z + 2, z + 4, z + 5 };
		if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x - 8, y + 1, z + 0.5,
				typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(context, world, x, y + 1, z + 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z + 3, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z + 2, l, x - 8, y + 1, z + 0.5, 8.5, context.getStraightLabel(), false, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(context, world, x, y + 1, z + 3, l, x - 8, y + 1, z + 0.5, 8.5, context.getStraightLabel(), false, x - 1, y + 1, z + 3, true, false);

			int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
			int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
			if (!putDownTurn(context, player, world, false, x, y, z, xArray2, zArray2, 1, true, 0, x - 3, z + 10, 8.5, x + 6, y + 1, z + 10,
					typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 4;
		}
		/** Put down straight **/
		putDownSingleRail(context, world, x, y + 1, z + 4, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 1, y + 1, z + 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(context, world, x, y + 1, z + straight, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 1, y + 1, z + 3, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchNorth(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType)
	{
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(context, player, world, x, y + 1, z - check))
				return false;
		}
		if (!canPlaceTrack(context, player, world, x + 1, y + 1, z - 3) || !canPlaceTrack(context, player, world, x + 1, y + 1, z - 4) || !canPlaceTrack(context, player, world, x + 1, y + 1, z - 5) || !canPlaceTrack(context, player, world, x + 2, y + 1, z - 4) || !canPlaceTrack(context, player, world, x + 2, y + 1, z - 5) || !canPlaceTrack(context, player, world, x + 2, y + 1, z - 6) || !canPlaceTrack(context, player, world, x + 2, y + 1, z - 7) || !canPlaceTrack(context, player, world, x + 2, y + 1, z - 8) || !canPlaceTrack(context, player, world, x + 3, y + 1, z - 6) || !canPlaceTrack(context, player, world, x + 3, y + 1, z - 7) || !canPlaceTrack(context, player, world, x + 3, y + 1, z - 8) || !canPlaceTrack(context, player, world, x + 3, y + 1, z - 9) || !canPlaceTrack(context, player, world, x + 3, y + 1, z - 10) || !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 1, x + 1, x + 1, x + 1 };
		int[] zArray = { z - 3, z - 2, z - 4, z - 5 };
		if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x + 9, y + 1, z + 0.5,
				typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(context, world, x, y + 1, z - 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z - 3, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z - 2, l, x + 9, y + 1, z + 0.5, 8.5, context.getStraightLabel(), false, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(context, world, x, y + 1, z - 3, l, x + 9, y + 1, z + 0.5, 8.5, context.getStraightLabel(), false, x + 1, y + 1, z - 3, true, false);

			int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
			int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
			if (!putDownTurn(context, player, world, false, x, y, z, xArray2, zArray2, 3, true, 2, x + 3, z - 10, 8.5, x - 5, y + 1, z - 9,
					typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 4;
		}
		/** Put down straight **/
		putDownSingleRail(context, world, x, y + 1, z - 4, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 1, y + 1, z - 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(context, world, x, y + 1, z - straight, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 1, y + 1, z - 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchNorth(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(context, player, world, x, y + 1, z - check))
				return false;
		}
		if (!canPlaceTrack(context, player, world, x - 1, y + 1, z - 3) || !canPlaceTrack(context, player, world, x - 1, y + 1, z - 4) || !canPlaceTrack(context, player, world, x - 1, y + 1, z - 5) || !canPlaceTrack(context, player, world, x - 2, y + 1, z - 4) || !canPlaceTrack(context, player, world, x - 2, y + 1, z - 5) || !canPlaceTrack(context, player, world, x - 2, y + 1, z - 6) || !canPlaceTrack(context, player, world, x - 2, y + 1, z - 7) || !canPlaceTrack(context, player, world, x - 2, y + 1, z - 8) || !canPlaceTrack(context, player, world, x - 3, y + 1, z - 6) || !canPlaceTrack(context, player, world, x - 3, y + 1, z - 7) || !canPlaceTrack(context, player, world, x - 3, y + 1, z - 8) || !canPlaceTrack(context, player, world, x - 3, y + 1, z - 9) || !canPlaceTrack(context, player, world, x - 3, y + 1, z - 10) || !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 1, x - 1, x - 1, x - 1 };
		int[] zArray = { z - 3, z - 2, z - 4, z - 5 };
		if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x - 8, y + 1, z + 0.5,
				typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(context, world, x, y + 1, z - 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z - 3, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z - 2, l, x - 8, y + 1, z + 0.5, 8.5, context.getStraightLabel(), false, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(context, world, x, y + 1, z - 3, l, x - 8, y + 1, z + 0.5, 8.5, context.getStraightLabel(), false, x - 1, y + 1, z - 3, true, false);

			int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
			int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
			if (!putDownTurn(context, player, world, false, x, y, z, xArray2, zArray2, 1, true, 2, x - 3, z - 10, 8.5, x + 6, y + 1, z - 9,
					typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 4;
		}
		/** Put down straight **/
		putDownSingleRail(context, world, x, y + 1, z - 4, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 1, y + 1, z - 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(context, world, x, y + 1, z - straight, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 1, y + 1, z - 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchSouth(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(context, player, world, x, y + 1, z + check))
				return false;
		}
		if (!canPlaceTrack(context, player, world, x + 1, y + 1, z + 3) || !canPlaceTrack(context, player, world, x + 1, y + 1, z + 4) || !canPlaceTrack(context, player, world, x + 1, y + 1, z + 5) || !canPlaceTrack(context, player, world, x + 2, y + 1, z + 4) || !canPlaceTrack(context, player, world, x + 2, y + 1, z + 5) || !canPlaceTrack(context, player, world, x + 2, y + 1, z + 6) || !canPlaceTrack(context, player, world, x + 2, y + 1, z + 7) || !canPlaceTrack(context, player, world, x + 2, y + 1, z + 8) || !canPlaceTrack(context, player, world, x + 3, y + 1, z + 6) || !canPlaceTrack(context, player, world, x + 3, y + 1, z + 7) || !canPlaceTrack(context, player, world, x + 3, y + 1, z + 8) || !canPlaceTrack(context, player, world, x + 3, y + 1, z + 9) || !canPlaceTrack(context, player, world, x + 3, y + 1, z + 10) || !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 1, x + 1, x + 1, x + 1 };
		int[] zArray = { z + 3, z + 2, z + 4, z + 5 };
		if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x + 9, y + 1, z + 0.5,
				typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(context, world, x, y + 1, z + 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z + 3, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z + 2, l, x + 9, y + 1, z + 0.5, 8.5, context.getStraightLabel(), false, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(context, world, x, y + 1, z + 3, l, x + 9, y + 1, z + 0.5, 8.5, context.getStraightLabel(), false, x + 1, y + 1, z + 3, true, false);

			int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
			int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
			if (!putDownTurn(context, player, world, false, x, y, z, xArray2, zArray2, 3, true, 0, x + 3, z + 10, 8.5, x - 5, y + 1, z + 10,
					typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 4;
		}
		/** Put down straight **/
		putDownSingleRail(context, world, x, y + 1, z + 4, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 1, y + 1, z + 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(context, world, x, y + 1, z + straight, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 1, y + 1, z + 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchEast(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(context, player, world, x + check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(context, player, world, x + 3, y + 1, z - 1) || !canPlaceTrack(context, player, world, x + 4, y + 1, z - 1) || !canPlaceTrack(context, player, world, x + 5, y + 1, z - 1) || !canPlaceTrack(context, player, world, x + 4, y + 1, z - 2) || !canPlaceTrack(context, player, world, x + 5, y + 1, z - 2) || !canPlaceTrack(context, player, world, x + 6, y + 1, z - 2) || !canPlaceTrack(context, player, world, x + 7, y + 1, z - 2) || !canPlaceTrack(context, player, world, x + 8, y + 1, z - 2) || !canPlaceTrack(context, player, world, x + 6, y + 1, z - 3) || !canPlaceTrack(context, player, world, x + 7, y + 1, z - 3) || !canPlaceTrack(context, player, world, x + 8, y + 1, z - 3) || !canPlaceTrack(context, player, world, x + 9, y + 1, z - 3) || !canPlaceTrack(context, player, world, x + 10, y + 1, z - 3) || !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 3, x + 2, x + 4, x + 5 };
		int[] zArray = { z - 1, z - 1, z - 1, z - 1 };
		if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z - 8,
				typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(context, world, x + 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x + 3, y + 1, z - 1, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(context, world, x + 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, context.getStraightLabel(), false, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(context, world, x + 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, context.getStraightLabel(), false, x + 3, y + 1, z - 1, true, false);

			int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
			int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
			if (!putDownTurn(context, player, world, false, x, y, z, xArray2, zArray2, 2, true, 3, x + 10, z - 3, 8.5, x + 10, y + 1, z + 6,
					typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 4, y + 1, z - 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;

				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 1;
			}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x + 4;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z - 2;
		}
		/** Put down straight **/
		putDownSingleRail(context, world, x + 4, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x + 3, y + 1, z - 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(context, world, x + straight, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x + 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchWest(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(context, player, world, x - check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(context, player, world, x - 3, y + 1, z + 1) || !canPlaceTrack(context, player, world, x - 4, y + 1, z + 1) || !canPlaceTrack(context, player, world, x - 5, y + 1, z + 1) || !canPlaceTrack(context, player, world, x - 4, y + 1, z + 2) || !canPlaceTrack(context, player, world, x - 5, y + 1, z + 2) || !canPlaceTrack(context, player, world, x - 6, y + 1, z + 2) || !canPlaceTrack(context, player, world, x - 7, y + 1, z + 2) || !canPlaceTrack(context, player, world, x - 8, y + 1, z + 2) || !canPlaceTrack(context, player, world, x - 6, y + 1, z + 3) || !canPlaceTrack(context, player, world, x - 7, y + 1, z + 3) || !canPlaceTrack(context, player, world, x - 8, y + 1, z + 3) || !canPlaceTrack(context, player, world, x - 9, y + 1, z + 3) || !canPlaceTrack(context, player, world, x - 10, y + 1, z + 3) || !canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 3, x - 2, x - 4, x - 5 };
		int[] zArray = { z + 1, z + 1, z + 1, z + 1 };

		if (!putDownTurn(context, player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z + 9,
				typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(context, world, x - 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x - 3, y + 1, z + 1, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(context, world, x - 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, context.getStraightLabel(), false, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(context, world, x - 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, context.getStraightLabel(), false, x - 3, y + 1, z + 1, true, false);

			int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
			int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
			if (!putDownTurn(context, player, world, false, x, y, z, xArray2, zArray2, 0, true, 1, x - 10, z + 3, 8.5, x - 9, y + 1, z - 5,
					typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 4, y + 1, z + 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 2;
		}
		/** Put down straight **/
		putDownSingleRail(context, world, x - 4, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false, x - 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(context, world, x - straight, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), true, x - 3, y + 1, z + 1, false, false);
		}
		return true;
	}

	private boolean largeRightParallelSwitch(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType, String typeVariantStraight){

		int dx = 0;
		int dz = 0;
		int dx2 = 0;
		int dz2 = 0;

		if (l == 0) {
			dz = 1;
			dx2 = -1;
		}
		if (l == 1) {
			dx = -1;
			dz2 = -1;
		}
		if (l == 2) {
			dz = -1;
			dx2 = 1;

		}
		if (l == 3) {
			dx = 1;
			dz2 = 1;
		}

		for (int i = 0; i < 17 ; i++){
			if (!canPlaceTrack(context, player, world, x + (dx * i), y + 1, z + (dz * i))){
				return false;
			}
		}
		for (int i = 14; i < 17 ; i++){
			if (!canPlaceTrack(context, player, world, x + ((dx * i) + (dx2 * 3)), y + 1, z + ((dz * i) + (dz2 * 3)))){
				return false;
			}
		}


		int[] xArray = new int[] {1,1,1,1,2};
		int[] zArray = new int[] {3,4,5,6,6};
		int[] xArray2 = new int[] {1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
		int[] zArray2 = new int[] {7, 7, 8, 9, 10, 11, 9, 10, 11, 12, 13};


		if (l == 2) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(context, player, world, x + xArray2[gag] , y + 1, z -  zArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 2, x + 2, z - 17, 18, x + 18.48,
					y + 1, z + 0.95, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x + 1, y + 1, z - 3, l, 2);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(context, world, x, y + 1, z - 1, l, x + 18.48, y + 1, z + 0.95, 18, tempType.getLabel(), true, x + 1, y + 1, z - 3, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(context, world, x, y + 1, z - 2, l, x + 18.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(context, world, x, y + 1, z - 3, l, x + 18.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(context, world, x, y + 1, z - 4, l, x + 18.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);

				if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, true), l, false, 2, x + 2, z - 20, 18, x - 14.5,
						y + 1, z - 13.5, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), null))
					return false;
				TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 7);
				if (tcRailTurn2 != null) {
					tcRailTurn2.hasModel = false;
					tcRailTurn2.isLinkedToRail = true;
					tcRailTurn2.linkedX = x + 1;
					tcRailTurn2.linkedY = y + 1;
					tcRailTurn2.linkedZ = z - 3;
				}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x + 1;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z - 7;

			}
			/** Straight rail exit**/
			for (int i = 5; i < 17 ; i++){
				putDownSingleRail(context, world, x, y + 1, z - i, l , x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(context, world, x + 3, y + 1, z - i, l , x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
			}
			return true;

		}

		if (l == 0) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(context, player, world, x - xArray2[gag] , y + 1, z + zArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 0, x - 2, z + 17, 18, x - 17.48,
					y + 1, z + 0.05 , typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x - 1, y + 1, z + 3, l, 0);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(context, world, x, y + 1, z + 1, l, x - 17.48, y + 1, z + 0.05, 18, tempType.getLabel(), true, x - 1, y + 1, z + 3, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(context, world, x, y + 1, z + 2, l, x - 17.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(context, world, x, y + 1, z + 3, l, x - 17.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(context, world, x, y + 1, z + 4, l, x - 17.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);

				if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, false), l, false, 0, x - 2, z + 17, 18, x + 15.48,
						y + 1, z + 14.5, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), null))
					return false;
				TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 7);
				if (tcRailTurn2 != null) {
					tcRailTurn2.hasModel = false;
					tcRailTurn2.isLinkedToRail = true;
					tcRailTurn2.linkedX = x - 1;
					tcRailTurn2.linkedY = y + 1;
					tcRailTurn2.linkedZ = z + 3;
				}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x - 1;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z + 7;

			}
			/** Straight rail exit**/
			for (int i = 5; i < 17 ; i++){
				putDownSingleRail(context, world, x, y + 1, z + i, l , x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(context, world, x - 3, y + 1, z + i, l , x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
			}
			return true;

		}

		if (l == 1) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(context, player, world, x - zArray2[gag] , y + 1, z -  xArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 1, x - 2, z - 17, 18, x + 0.95,
					y + 1, z - 17.48 , typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x - 3, y + 1, z - 1, l, 1);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(context, world, x - 1, y + 1, z , l, x + 0.95, y + 1, z - 17.48, 18, tempType.getLabel(), true, x - 3, y + 1, z - 1, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(context, world, x - 2, y + 1, z , l, x + 0.95, y + 1, z - 17.48, 18, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(context, world, x - 3, y + 1, z , l, x + 0.95, y + 1, z - 17.48, 18, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(context, world, x - 4, y + 1, z , l, x + 0.95, y + 1, z - 17.48, 18, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);

				if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, true), l, false, 1, x - 17, z - 3, 18, x - 13.5,
						y + 1, z + 15.5, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), null))
					return false;
				TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 7, y + 1, z - 1);
				if (tcRailTurn2 != null) {
					tcRailTurn2.hasModel = false;
					tcRailTurn2.isLinkedToRail = true;
					tcRailTurn2.linkedX = x - 3;
					tcRailTurn2.linkedY = y + 1;
					tcRailTurn2.linkedZ = z - 1;
				}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x - 7;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z - 1;

			}
			/** Straight rail exit**/
			for (int i = 5; i < 17 ; i++){
				putDownSingleRail(context, world, x - i, y + 1, z, l , x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(context, world, x - i, y + 1, z - 3, l , x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
			}
			return true;

		}

		if (l == 3) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(context, player, world, x + zArray2[gag] , y + 1, z +  xArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 3, x + 2, z + 17, 18, x + 0.05,
					y + 1, z + 18.48 , typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x + 3, y + 1, z + 1, l, 3);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(context, world, x + 1, y + 1, z , l, x + 0.05, y + 1, z + 18.48, 18, tempType.getLabel(), true, x + 3, y + 1, z + 1, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(context, world, x + 2, y + 1, z , l, x + 0.05, y + 1, z + 18.48, 18, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(context, world, x + 3, y + 1, z , l, x + 0.05, y + 1, z + 18.48, 18, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(context, world, x + 4, y + 1, z , l, x + 0.05, y + 1, z + 18.48, 18, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);

				if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, false), l, false, 3, x + 17, z + 3, 18, x + 14.5,
						y + 1, z - 14.5, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), null))
					return false;
				TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 7, y + 1, z + 1);
				if (tcRailTurn2 != null) {
					tcRailTurn2.hasModel = false;
					tcRailTurn2.isLinkedToRail = true;
					tcRailTurn2.linkedX = x + 3;
					tcRailTurn2.linkedY = y + 1;
					tcRailTurn2.linkedZ = z + 1;
				}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x + 7;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z + 1;

			}
			/** Straight rail exit**/
			for (int i = 5; i < 17 ; i++){
				putDownSingleRail(context, world, x + i, y + 1, z, l , x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(context, world, x + i, y + 1, z + 3, l , x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
			}
			return true;

		}



		return false;

	}

	private boolean largeLeftParallelSwitch(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType, String typeVariantStraight){

		int dx = 0;
		int dz = 0;
		int dx2 = 0;
		int dz2 = 0;

		if (l == 0) {
			dz = 1;
			dx2 = 1;
		}
		if (l == 1) {
			dx = -1;
			dz2 = 1;
		}
		if (l == 2) {
			dz = -1;
			dx2 = -1;

		}
		if (l == 3) {
			dx = 1;
			dz2 = -1;
		}

		for (int i = 0; i < 17 ; i++){
			if (!canPlaceTrack(context, player, world, x + (dx * i), y + 1, z + (dz * i))){
				return false;
			}
		}
		for (int i = 14; i < 17 ; i++){
			if (!canPlaceTrack(context, player, world, x + ((dx * i) + (dx2 * 3)), y + 1, z + ((dz * i) + (dz2 * 3)))){
				return false;
			}
		}


		int[] xArray = new int[] {1,1,1,1,2};
		int[] zArray = new int[] {3,4,5,6,6};
		int[] xArray2 = new int[] {1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
		int[] zArray2 = new int[] {7, 7, 8, 9, 10, 11, 9, 10, 11, 12, 13};


		if (l == 2) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(context, player, world, x - xArray2[gag] , y + 1, z -  zArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 2, x - 2, z - 17, 18, x -17.48,
					y + 1, z + 0.95, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x - 1, y + 1, z - 3, l, 2);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(context, world, x, y + 1, z - 1, l, x - 17.48, y + 1, z + 0.95, 18, tempType.getLabel(), true, x - 1, y + 1, z - 3, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(context, world, x, y + 1, z - 2, l, x - 17.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(context, world, x, y + 1, z - 3, l, x - 17.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(context, world, x, y + 1, z - 4, l, x - 17.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);

				if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, true), l, false, 2, x - 2, z - 17, 18, x + 15.5,
						y + 1, z - 13.5, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), null))
					return false;
				TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 7);
				if (tcRailTurn2 != null) {
					tcRailTurn2.hasModel = false;
					tcRailTurn2.isLinkedToRail = true;
					tcRailTurn2.linkedX = x - 1;
					tcRailTurn2.linkedY = y + 1;
					tcRailTurn2.linkedZ = z - 3;
				}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x - 1;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z - 7;

			}
			/** Straight rail exit**/
			for (int i = 5; i < 17 ; i++){
				putDownSingleRail(context, world, x, y + 1, z - i, l , x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(context, world, x - 3, y + 1, z - i, l , x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
			}
			return true;

		}

		if (l == 0) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(context, player, world, x + xArray2[gag] , y + 1, z + zArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 0, x + 2, z + 17, 18, x + 18.48,
					y + 1, z + 0.05 , typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x + 1, y + 1, z + 3, l, 0);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(context, world, x, y + 1, z + 1, l, x + 18.48, y + 1, z + 0.05, 18, tempType.getLabel(), true, x + 1, y + 1, z + 3, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(context, world, x, y + 1, z + 2, l, x + 18.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(context, world, x, y + 1, z + 3, l, x + 18.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(context, world, x, y + 1, z + 4, l, x + 18.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);

				if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, false), l, false, 0, x - 2, z + 17, 18, x -14.48,
						y + 1, z + 14.5, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), null))
					return false;
				TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 7);
				if (tcRailTurn2 != null) {
					tcRailTurn2.hasModel = false;
					tcRailTurn2.isLinkedToRail = true;
					tcRailTurn2.linkedX = x + 1;
					tcRailTurn2.linkedY = y + 1;
					tcRailTurn2.linkedZ = z + 3;
				}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x + 1;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z + 7;

			}
			/** Straight rail exit**/
			for (int i = 5; i < 17 ; i++){
				putDownSingleRail(context, world, x, y + 1, z + i, l , x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(context, world, x + 3, y + 1, z + i, l , x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
			}
			return true;

		}

		if (l == 1) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(context, player, world, x - zArray2[gag] , y + 1, z +  xArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 1, x - 2, z - 17, 18, x + 0.95,
					y + 1, z + 18.48 , typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x - 3, y + 1, z + 1, l, 1);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(context, world, x - 1, y + 1, z , l, x + 0.95, y + 1, z + 18.48, 18, tempType.getLabel(), true, x - 3, y + 1, z + 1, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(context, world, x - 2, y + 1, z , l, x + 0.95, y + 1, z + 18.48, 18, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(context, world, x - 3, y + 1, z , l, x + 0.95, y + 1, z + 18.48, 18, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(context, world, x - 4, y + 1, z , l, x + 0.95, y + 1, z + 18.48, 18, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);

				if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, false), l, false, 1, x - 17, z + 3, 18, x - 13.5,
						y + 1, z - 14.5, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), null))
					return false;
				TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 7, y + 1, z + 1);
				if (tcRailTurn2 != null) {
					tcRailTurn2.hasModel = false;
					tcRailTurn2.isLinkedToRail = true;
					tcRailTurn2.linkedX = x - 3;
					tcRailTurn2.linkedY = y + 1;
					tcRailTurn2.linkedZ = z + 1;
				}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x - 7;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z + 1;

			}
			/** Straight rail exit**/
			for (int i = 5; i < 17 ; i++){
				putDownSingleRail(context, world, x - i, y + 1, z, l , x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(context, world, x - i, y + 1, z + 3, l , x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
			}
			return true;

		}

		if (l == 3) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(context, player, world, x + zArray2[gag] , y + 1, z -  xArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 3, x + 2, z + 17, 18, x + 0.05,
					y + 1, z - 17.48 , typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_L, tempType.getVariant()), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x + 3, y + 1, z - 1, l, 3);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(context, world, x + 1, y + 1, z , l, x + 0.05, y + 1, z - 17.48, 18, tempType.getLabel(), true, x + 3, y + 1, z - 1, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(context, world, x + 2, y + 1, z , l, x + 0.05, y + 1, z - 17.48, 18, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(context, world, x + 3, y + 1, z , l, x + 0.05, y + 1, z - 17.48, 18, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(context, world, x + 4, y + 1, z , l, x + 0.05, y + 1, z - 17.48, 18, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);

				if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, true), l, false, 3, x + 17, z + 3, 18, x + 14.5,
						y + 1, z + 15.5, typeVariant90Turn(context, EnumCoreTrack. CORE_3X_TURN_R, tempType.getVariant()), null))
					return false;
				TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 7, y + 1, z - 1);
				if (tcRailTurn2 != null) {
					tcRailTurn2.hasModel = false;
					tcRailTurn2.isLinkedToRail = true;
					tcRailTurn2.linkedX = x + 3;
					tcRailTurn2.linkedY = y + 1;
					tcRailTurn2.linkedZ = z - 1;
				}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x + 7;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z - 1;

			}
			/** Straight rail exit**/
			for (int i = 5; i < 17 ; i++){
				putDownSingleRail(context, world, x + i, y + 1, z, l , x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(context, world, x + i, y + 1, z - 3, l , x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
			}
			return true;

		}



		return false;

	}

	private boolean crossover10x2Switch(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int facing, ITrackDefinition tempType, String typeVariantStraight, String typeVariant90Turn, boolean sneaking, boolean isRight) {
		int dx = 1;
		int dz = 1;
		int[] xArray, zArray, tArray;
		xArray = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 2};
		zArray = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 9};

		double centerX = 0; double centerZ = 0;
		double radius = 34.08;

		if (facing == 1) {
			tArray = zArray;
			zArray = isRight?flipArraySign(xArray):xArray;
			xArray = flipArraySign(tArray);
			dx = -1;
			centerZ = isRight ? -(radius + 0.5) + 1: radius + 0.5;
			centerX = 1;
		}
		else if (facing == 2) {
			xArray = isRight?xArray:flipArraySign(xArray);
			zArray = flipArraySign(zArray);
			dz = -1;
			centerX = isRight ? radius + 0.5 : -(radius + 0.5) + 1;
			centerZ = 1;
		}
		else if (facing == 3) {
			tArray = xArray;
			xArray = zArray;
			zArray = isRight?tArray:flipArraySign(tArray);
			centerZ = isRight ? radius + 0.5 : -(radius + 0.5) + 1;
			dx = 1;
		}
		else {
			if (isRight)
				xArray = flipArraySign(xArray);
			dz = 1;
			centerX = isRight? -(radius + 0.5) + 1 : radius + 0.5;
			centerZ = 0;
		}

		int exitDir = (facing + (isRight ? 4 : 3)) & 7;

		if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), facing, false, exitDir, x + xArray[xArray.length-1], z + zArray[zArray.length-1] , radius, x + centerX,
				y + 1, z + centerZ, typeVariant90Turn, tempType.getItem().item))
			return false;


		int originShiftX, originShiftZ;

		if (facing == 3) {
			originShiftX = 2;
			originShiftZ = isRight?1:-1;
			dz = 0;
		}
		else if (facing == 2) {
			originShiftX = isRight?1:-1;
			originShiftZ = -2;
			dx = 0;

		}
		else if (facing == 1) {
			originShiftX = -2;
			originShiftZ = isRight?-1:1;
			dz = 0;
		}
		else {
			originShiftX = isRight?-1:1;
			originShiftZ = 2;
			dx = 0;
		}
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + originShiftX, y + 1, z + originShiftZ);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;
		}
		world.setBlockMetadataWithNotify(x + originShiftX, y + 1, z + originShiftZ, facing, 3);//to force client update

		for (int i = 0; i < 10; i++) { //check the spaces the straight should take up *before* trying to place it. Prevent tile corruption/track duping.
			if (!canPlaceTrack(context, player, world, x + (dx*i), y + 1, z + (dz*i))) {
				return false;
			}
		}

		putDownSingleRail(context, world, x, y + 1, z, facing, x + centerX, y + 1, z + centerZ, radius, tempType.getLabel(), true, x + originShiftX, y + 1, z + originShiftZ, true, false);
		for (int i = 1; i < EnumTracks.GetSwitchSize(tempType.getCoreTrack()); i++) {
			putDownSingleRail(context, world, x + (dx*i), y + 1, z + (dz*i), facing, x + centerX, y + 1, z + centerZ, radius, typeVariantStraight, false, x+originShiftX, y + 1, z + originShiftZ, true, false);
		}
		for (int i = EnumTracks.GetSwitchSize(tempType.getCoreTrack()); i < 10; i++) {
			putDownSingleRail(context, world, x + (i * dx), y + 1, z + (i * dz), facing, x + 1 , y + 1, z - 7.99, 8.49, typeVariantStraight, false, x + originShiftX, y + 1, z + originShiftZ, false, false);
		}
		return true;
	}

	private boolean rightDiamondCrossing(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType)
	{
		if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}

		int zDisplace = 0;
		int xDisplace = 0;
		int xSideDisplace = 0;
		int zSideDisplace = 0;
		int sideFacing = l;

		if (l == 2) {
			zDisplace = -1;
			xSideDisplace = 1;
			sideFacing = 6;
		}
		if (l == 0) {
			zDisplace = 1;
			xSideDisplace = -1;
			sideFacing = 4;
		}
		if (l == 1) {
			xDisplace = -1;
			zSideDisplace = -1;
			sideFacing = 5;
		}
		if (l == 3) {
			xDisplace = 1;
			zSideDisplace = 1;
			sideFacing = 7;
		}

		if (!canPlaceTrack(context, player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(context, player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + (xDisplace * 2) + xSideDisplace, y + 1, z + (zDisplace * 2) + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x - (xSideDisplace), y + 1, z - zSideDisplace)) {
			return false;
		}

		//Top

		putDownSingleRail(context, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
				z + (zDisplace * 2), 0, context.getStraightLabel(), false, x + (xDisplace), y + 1,
				z + (zDisplace), false, false);

		//Main

		placeTrack(context, world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(tempType.getLabel());
		tcRail2.idDrop = this.type.getItem().item;

		//Bottom


		putDownSingleRail(context, world, x, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false,
				x + (xDisplace), y + 1, z + (zDisplace), false, false);

		//Right

		putDownSingleRail(context, world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
				z + (zDisplace * 2) + (zSideDisplace), sideFacing,
				x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace * 2) + (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		//Left

		putDownSingleRail(context, world, x - (xSideDisplace), y + 1,
				z - (zSideDisplace), sideFacing,
				x - (xSideDisplace), y + 1, z - (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);


		return true;
	}
	private boolean leftDiamondCrossing(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType)
	{
		if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}

		int zDisplace = 0;
		int xDisplace = 0;
		int xSideDisplace = 0;
		int zSideDisplace = 0;
		int sideFacing = l;

		if (l == 2) {
			zDisplace = -1;
			xSideDisplace = 1;
			sideFacing = 5;
		}
		if (l == 0) {
			zDisplace = 1;
			xSideDisplace = -1;
			sideFacing = 7;
		}
		if (l == 1) {
			xDisplace = -1;
			zSideDisplace = -1;
			sideFacing = 4;
		}
		if (l == 3) {
			xDisplace = 1;
			zSideDisplace = 1;
			sideFacing = 6;
		}


		if (!canPlaceTrack(context, player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(context, player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + (xDisplace * 2) - xSideDisplace, y + 1, z + (zDisplace * 2) - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + (xSideDisplace), y + 1, z + zSideDisplace)) {
			return false;
		}

		//Top

		putDownSingleRail(context, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
				z + (zDisplace * 2), 0, context.getStraightLabel(), false, x + (xDisplace), y + 1,
				z + (zDisplace), false, false);

		//Main

		placeTrack(context, world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(tempType.getLabel());
		tcRail2.idDrop = this.type.getItem().item;

		//Bottom


		putDownSingleRail(context, world, x, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false,
				x + (xDisplace), y + 1, z + (zDisplace), false, false);

		//Left

		putDownSingleRail(context, world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
				z + (zDisplace * 2) - (zSideDisplace), sideFacing,
				x - (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace * 2) - (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		//Right

		putDownSingleRail(context, world, x + (xSideDisplace), y + 1,
				z + (zSideDisplace), sideFacing,
				x + (xSideDisplace), y + 1, z + (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);


		return true;
	}

	private boolean doubleDiamondCrossing(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition type)
	{
		if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}

		int zDisplace = 0;
		int xDisplace = 0;
		int xSideDisplace = 0;
		int zSideDisplace = 0;
		int sideFacing = l;
		int sideFacing2 = l;

		if (l == 2) {
			zDisplace = -1;
			xSideDisplace = 1;
			sideFacing = 6;
			sideFacing2 = 5;
		}
		if (l == 0) {
			zDisplace = 1;
			xSideDisplace = -1;
			sideFacing = 4;
			sideFacing2 = 7;
		}
		if (l == 1) {
			xDisplace = -1;
			zSideDisplace = -1;
			sideFacing = 5;
			sideFacing2 = 4;
		}
		if (l == 3) {
			xDisplace = 1;
			zSideDisplace = 1;
			sideFacing = 7;
			sideFacing2 = 6;
		}

		if (!canPlaceTrack(context, player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(context, player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + (xDisplace * 2) - xSideDisplace, y + 1, z + (zDisplace * 2) - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + (xSideDisplace), y + 1, z + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + (xDisplace * 2) + xSideDisplace, y + 1, z + (zDisplace * 2) + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x - (xSideDisplace), y + 1, z - zSideDisplace)) {
			return false;
		}

		//Top

		putDownSingleRail(context, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
				z + (zDisplace * 2), 0, context.getStraightLabel(), false, x + (xDisplace), y + 1,
				z + (zDisplace), false, false);

		//Main

		placeTrack(context, world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(type.getLabel());
		tcRail2.idDrop = this.type.getItem().item;

		//Bottom


		putDownSingleRail(context, world, x, y + 1, z, l, x, y + 1, z, 0, context.getStraightLabel(), false,
				x + (xDisplace), y + 1, z + (zDisplace), false, false);
		//RIGHT
		putDownSingleRail(context, world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
				z + (zDisplace * 2) + (zSideDisplace), sideFacing,
				x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace * 2) + (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		//Left

		putDownSingleRail(context, world, x - (xSideDisplace), y + 1,
				z - (zSideDisplace), sideFacing,
				x - (xSideDisplace), y + 1, z - (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);
		//Left2

		putDownSingleRail(context, world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
				z + (zDisplace * 2) - (zSideDisplace), sideFacing2,
				x - (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace * 2) - (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		//Right2

		putDownSingleRail(context, world, x + (xSideDisplace), y + 1,
				z + (zSideDisplace), sideFacing2,
				x + (xSideDisplace), y + 1, z + (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		return true;
	}
	private boolean diagonalTwoWaysCrossing(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition type)
	{
		if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}

		int zDisplace = 0;
		int xDisplace = 0;
		int xSideDisplace = 0;
		int zSideDisplace = 0;
		int sideFacing = l;
		int sideFacing2 = l;

		if (l == 2) {
			zDisplace = -1;
			xSideDisplace = 1;
			sideFacing = 6;
			sideFacing2 = 5;
		}
		if (l == 0) {
			zDisplace = 1;
			xSideDisplace = -1;
			sideFacing = 4;
			sideFacing2 = 7;
		}
		if (l == 1) {
			xDisplace = -1;
			zSideDisplace = -1;
			sideFacing = 5;
			sideFacing2 = 4;
		}
		if (l == 3) {
			xDisplace = 1;
			zSideDisplace = 1;
			sideFacing = 7;
			sideFacing2 = 6;
		}

		if (!canPlaceTrack(context, player, world, x + xDisplace + xSideDisplace, y + 1, z + zDisplace + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + xDisplace - xSideDisplace, y + 1, z + zDisplace - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + zSideDisplace)) {
			return false;
		}


		//Main
		placeTrack(context, world, x, y + 1, z, BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(type.getLabel());
		tcRail2.idDrop = type.getItem().item;

		//RIGHT
		putDownSingleRail(context, world, x + xDisplace + (xSideDisplace), y + 1,
				z + zDisplace + (zSideDisplace), sideFacing,
				x + (xDisplace) + (xSideDisplace), y + 1, z + zDisplace + (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x, y + 1, z,
				false, false);

		//Left

		putDownSingleRail(context, world, x - xDisplace - (xSideDisplace), y + 1,
				z - zDisplace - (zSideDisplace), sideFacing,
				x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x, y + 1, z,
				false, false);
		//Left2

		putDownSingleRail(context, world, x + xDisplace - (xSideDisplace), y + 1,
				z + zDisplace - (zSideDisplace), sideFacing2,
				x + (xDisplace) - (xSideDisplace), y + 1, z + zDisplace - (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x, y + 1, z,
				false, false);

		//Right2

		putDownSingleRail(context, world, x - xDisplace + (xSideDisplace), y + 1,
				z - zDisplace + (zSideDisplace), sideFacing2,
				x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x, y + 1, z,
				false, false);


		return true;
	}
	private boolean fourWaysCrossing(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition type)
	{
		if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
			return false;
		}

		int zDisplace = 0;
		int xDisplace = 0;
		int xSideDisplace = 0;
		int zSideDisplace = 0;
		int sideFacing = l;
		int sideFacing2 = l;
		int facing = l;

		if (l == 2) {
			zDisplace = -1;
			xSideDisplace = 1;
			sideFacing = 6;
			sideFacing2 = 5;
			facing = 1;
		}
		if (l == 0) {
			zDisplace = 1;
			xSideDisplace = -1;
			sideFacing = 4;
			sideFacing2 = 7;
			facing = 1;
		}
		if (l == 1) {
			xDisplace = -1;
			zSideDisplace = -1;
			sideFacing = 5;
			sideFacing2 = 4;
			facing = 2;
		}
		if (l == 3) {
			xDisplace = 1;
			zSideDisplace = 1;
			sideFacing = 7;
			sideFacing2 = 6;
			facing = 2;
		}

		if (!canPlaceTrack(context, player, world, x + xDisplace + xSideDisplace, y + 1, z + zDisplace + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + xDisplace - xSideDisplace, y + 1, z + zDisplace - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + xDisplace, y + 1, z + zDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x - xDisplace, y + 1, z - zDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x + xSideDisplace, y + 1, z + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(context, player, world, x - xSideDisplace, y + 1, z - zSideDisplace)) {
			return false;
		}


		//Main
		placeTrack(context, world, x, y + 1, z, BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(type.getLabel());
		tcRail2.idDrop = this.type.getItem().item;


		//T
		putDownSingleRail(context, world, x + xDisplace, y + 1,
				z + zDisplace, l,
				x + (xDisplace), y + 1, z + zDisplace, 0,
				context.getStraightLabel(), false, x, y + 1, z,
				false, false);
		//B
		putDownSingleRail(context, world, x - xDisplace, y + 1,
				z - zDisplace, l,
				x - (xDisplace), y + 1, z - zDisplace, 0,
				context.getStraightLabel(), false, x, y + 1, z,
				false, false);
		//L
		putDownSingleRail(context, world, x + xSideDisplace, y + 1,
				z + zSideDisplace, facing,
				x + (xSideDisplace), y + 1, z + zSideDisplace, 0,
				context.getStraightLabel(), false, x, y + 1, z,
				false, false);
		//R
		putDownSingleRail(context, world, x - xSideDisplace, y + 1,
				z - zSideDisplace, facing,
				x - (xSideDisplace), y + 1, z - zSideDisplace, 0,
				context.getStraightLabel(), false, x, y + 1, z,
				false, false);


		//BR
		putDownSingleRail(context, world, x + xDisplace + (xSideDisplace), y + 1,
				z + zDisplace + (zSideDisplace), sideFacing,
				x + (xDisplace) + (xSideDisplace), y + 1, z + zDisplace + (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x, y + 1, z,
				false, false);

		//TL

		putDownSingleRail(context, world, x - xDisplace - (xSideDisplace), y + 1,
				z - zDisplace - (zSideDisplace), sideFacing,
				x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x, y + 1, z,
				false, false);
		//TR

		putDownSingleRail(context, world, x + xDisplace - (xSideDisplace), y + 1,
				z + zDisplace - (zSideDisplace), sideFacing2,
				x + (xDisplace) - (xSideDisplace), y + 1, z + zDisplace - (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x, y + 1, z,
				false, false);

		//BL

		putDownSingleRail(context, world, x - xDisplace + (xSideDisplace), y + 1,
				z - zDisplace + (zSideDisplace), sideFacing2,
				x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + (zSideDisplace), 0,
				context.getDiagonalStraightLabel(), false, x, y + 1, z,
				false, false);


		return true;
	}

	private boolean smallDiagonalStraight(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition type)
	{
		TileTCRailGag[] tileGag;
		if (player.isSneaking()) {
			tileGag = null;
		} else {
			tileGag = new TileTCRailGag[2];
		}

		int dx = 1;
		int dz = 1;

		if (l == 6) dz = -1;

		if (l == 4) dx = -1;

		if (l == 5){
			dx = -1;
			dz = -1;
		}
		if (tileGag != null) {
			if (!canPlaceTrack(context, player, world, x, y + 1, z) || !canPlaceTrack(context, player, world, x, y + 1, z + dz) || !canPlaceTrack(context, player, world, x + dx, y + 1, z)) {
				return false;
			}
		}
		else {
			if (!canPlaceTrack(context, player, world, x, y + 1, z)) {
				return false;
			}
		}

		placeTrack(context, world, x, y + 1, z, BlockIDs.tcRail.block, l);
		//do everything for the core track first
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail.setFacing(l);
		tcRail.setType(type.getLabel());
		tcRail.idDrop = this.type.getItem().item;

		//then we can mess with the gags
		if (tileGag != null) {
			placeTrack(context, world, x, y + 1, z + dz, BlockIDs.tcRailGag.block, l);
			tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + dz);
			//tileGag[0].canPlaceRollingstock = false;

			placeTrack(context, world, x + dx, y + 1, z, BlockIDs.tcRailGag.block, l);
			tileGag[1] = (TileTCRailGag) world.getTileEntity(x + dx, y + 1, z);
			//tileGag[1].canPlaceRollingstock = false;
			for (TileTCRailGag tileTCRailGag : tileGag) {
				if (player != null && tileTCRailGag == null) {
					return false;
				}
				tileTCRailGag.initializeTrackReference(x, y + 1, z, type.getLabel());
				//tileTCRailGag.canPlaceRollingstock = false;
			}
		}
		return true;
	}

	private boolean diagonalStraight(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition type)
	{
		int trackLength = 0;
		if (EnumCoreTrack.CORE_LONG_DIAGONAL_STRAIGHT.equals(type.getCoreTrack())) trackLength = 3;
		if (EnumCoreTrack.CORE_VERY_LONG_DIAGONAL_STRAIGHT.equals(type.getCoreTrack())) trackLength = 9;

		TileTCRail[] tcRail = new TileTCRail[(trackLength / 3) + 1];
		TileTCRailGag[] tcRailGag;
		if (player.isSneaking()) {
			tcRailGag = new TileTCRailGag[8 * (trackLength / 3) + 6]; // +6 instead of +8 b/c we are cutting the last two gags out.
		} else {
			tcRailGag = new TileTCRailGag[8 * (trackLength / 3) + 8];
		}

		int dx = 1;
		int dz = 1;

		if (l == 6) dz = -1;

		if (l == 4) dx = -1;

		if (l == 5){
			dx = -1;
			dz = -1;
		}

		for (int i = 0; i <= trackLength; i += 3){
			if (!canPlaceTrack(context, player, world, x + (i * dx), y + 1, z + (i * dz)) //main track
					|| !canPlaceTrack(context, player, world, x + (i * dx) + dx, y + 1, z + (i * dz) + dz) //second track
					|| !canPlaceTrack(context, player, world, x + (i * dx) + (2*dx), y + 1, z + (i * dz) + (2*dz))) //third track
				return false;

			for(int j = 0; j < 3 ; j++){
				if (player.isSneaking() && i == trackLength && j == 2) { //cut out the last two gags
					break;
				}
				else {
					if (!canPlaceTrack(context, player, world, x + (i * dx) + (j * dx) + dx, y + 1, z + (i * dz) + (j * dz)) //gag X
							|| !canPlaceTrack(context, player, world, x + (i * dx) + (j * dx), y + 1, z + (i * dz) + (j * dz) + dz)) //gag Z
						return false;
				}
			}


		}

		for (int i = 0; i <= trackLength; i += 3){
			placeTrack(context, world, x + (i * dx), y+ 1, z + (i * dz), BlockIDs.tcRail.block, l);
			tcRail[i / 3] = (TileTCRail) world.getTileEntity(x + (i * dx), y+ 1, z + (i * dz));
			tcRail[i / 3].setFacing(l);
			tcRail[(i / 3)].setType(type.getLabel());
			//tcRail[0].setRailLength((double) trackLength + 3);
			tcRail[0].idDrop = this.type.getItem().item;
			//tcRail[i / 3].setRailLength(3D);
			if (i / 3 != 0){
				tcRail[i / 3].isLinkedToRail = true;
				tcRail[i / 3].linkedX = x + dx;
				tcRail[i / 3].linkedY = y + 1;
				tcRail[i / 3].linkedZ = z + dz;
			}

			placeTrack(context, world, x + (i * dx) + dx, y + 1, z + (i * dz) + dz, BlockIDs.tcRailGag.block, l);
			tcRailGag[(3* i) - (i / 3)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + dx, y + 1, z + (i * dz) + dz);

			placeTrack(context, world,x + (i * dx) + (2 * dx), y + 1, z + (i * dz) + (2 * dz), BlockIDs.tcRailGag.block, l);
			tcRailGag[((3* i) - (i / 3)) + 1] = (TileTCRailGag) world.getTileEntity(x + (i * dx) +  (2 * dx), y + 1, z + (i * dz) + (2 * dz));

			for (int j = 0; j < 3; j++){
				if (player.isSneaking() && i == trackLength && j == 2) {
					break;
				} else {
					placeTrack(context, world, x + (i * dx) + (j * dx) + dx, y + 1, z + (i * dz) + (j * dz), BlockIDs.tcRailGag.block, l);
					tcRailGag[((3 * i) - (i / 3)) + ((2 * j) + 2)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + (j * dx) + dx, y + 1, z + (i * dz) + (j * dz));

					placeTrack(context, world, x + (i * dx) + (j * dx), y + 1, z + (i * dz) + (j * dz) + dz, BlockIDs.tcRailGag.block, l);
					tcRailGag[((3 * i) - (i / 3)) + ((2 * j) + 3)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + (j * dx), y + 1, z + (i * dz) + (j * dz) + dz);

				}
			}

		}

		for (TileTCRailGag tileTCRailGag : tcRailGag) {
			if (player != null && tileTCRailGag == null) {
				return false;
			}
			tileTCRailGag.initializeTrackReference(x, y + 1, z, type.getLabel());

		}

		return true;
	}

	private boolean turn1XRight(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {

		int[] xArray = {0};
		int[] zArray = {0};

		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z, 0.5, x + 1,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x - 1, z, 0.5, x,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 2, x, z - 1, 0.5, x + 1,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x, z + 1, 0.5, x, y + 1,
					z + 1, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean turn1XLeft(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {

		int[] xArray = {0};
		int[] zArray = {0};

		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x - 1, z, 0.5, x,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z, 0.5, x + 1,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x, z + 1, 0.5, x + 1,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 2, x, z - 1, 0.5, x, y + 1,
					z, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}

	private boolean turnTrack(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int dir, ITrackDefinition tempType, float pyaw, int[] xArray, int[]zArray, float radius){

		float yaw = MathHelper.wrapAngleTo180_float(player != null ? player.rotationYaw : pyaw);
		String orientation = getTrackOrientation(dir,yaw);

		if (orientation.equals("right")) {
			xArray = flipArraySign(xArray);
		}

		double cx = 0;
		double cz = 0;
		int[] usedXArray = new int[0];
		int[] usedZArray = new int[0];

		int xOffset = 0;
		int zOffset = 0;

		if (dir == 2){
			usedXArray = flipArraySign(xArray,x,true);
			usedZArray = flipArraySign(zArray,z,true);
			cx = orientation.equals("right") ? -(radius + 0.5f) : (radius - 0.5);
			cz = -1f;
		}
		else if (dir == 0){
			usedXArray = flipArraySign(xArray,x,false);
			usedZArray = flipArraySign(zArray,z,false);
			cx = orientation.equals("right") ? radius - 0.5f : -(radius + 0.5);
		}
		else if (dir == 1){
			usedXArray = flipArraySign(zArray, x, true);
			usedZArray = flipArraySign(xArray, z, false);
			cz = orientation.equals("right") ? -(-radius + 0.5f) : -(radius + 0.5f);
			cx = -1f;
		}
		else if (dir == 3){
			usedXArray = flipArraySign(zArray, x, false);
			usedZArray = flipArraySign(xArray, z, true);
			cz = orientation.equals("right") ? -(radius + 0.5f) : -(-radius + 0.5f) ;
		}

		if (usedXArray.length == 0) {
			return false;
		}

		for (int check = 0; check < usedXArray.length; check++){
			if (!canPlaceTrack(context, player, world, usedXArray[check], y + 1, usedZArray[check])){
				return false;
			}
		}

		if (!putDownTurn(context, player, world, false, x, y, z, usedXArray, usedZArray, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx,
				y + 1, z - cz, tempType.getLabel(), tempType.getItem().item))
			return false;

		return true;
	}




	private boolean mediumRight45DegreeTurn(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {

		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{0, 0, 0, 1, 1};
			zArray = new int[]{0, 1, 2, 1, 2};
		} else {
			xArray = new int[]{0, 0, 0, 1, 1, 1, 2};
			zArray = new int[]{0, 1, 2, 1, 2, 3, 2};
		}
		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 1, z - 2, 3.75, x + 4.25,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 1, z + 2, 3.75, x - 3.25,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 2, z - 1, 3.75, x + 1,
					y + 1, z - 3.25, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 2, z + 1, 3.75, x, y + 1,
					z + 4.25, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean mediumLeft45DegreeTurn(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {

		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{0, 0, 0, 1, 1};
			zArray = new int[]{0, 1, 2, 1, 2};
		} else {
			xArray = new int[]{0, 0, 0, 1, 1, 1, 2};
			zArray = new int[]{0, 1, 2, 1, 2, 3, 2};
		}

		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 1, z - 2, 3.75, x - 3.25,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z + 2, 3.75, x + 4.25,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 2, z + 1, 3.75, x + 1,
					y + 1, z + 4.25, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 2, z - 1, 3.75, x, y + 1,
					z - 3.25, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean largeRight45DegreeTurn(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
			zArray = new int[]{0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 5};
		} else {
			xArray = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3};
			zArray = new int[]{0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 5, 6, 5};
		}
		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 2, z - 5, 8.49, x + 8.99,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 2, z + 5, 8.49, x - 7.99,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 5, z - 2, 8.49, x + 1,
					y + 1, z - 7.99, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 5, z + 2, 8.49, x,
					y + 1, z + 8.99, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean largeLeft45DegreeTurn(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
			zArray = new int[]{0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 5};
		} else {
			xArray = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3};
			zArray = new int[]{0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 5, 6, 5};
		}
		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 2, z - 5, 8.49, x - 7.99,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 2, z + 5, 8.49, x + 8.99,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 5, z + 2, 8.49, x + 1,
					y + 1, z + 8.99, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 5, z - 2, 8.49, x,
					y + 1, z - 7.99, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean veryLargeRight45DegreeTurn(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3};
			zArray = new int[]{0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 6, 7};
		} else {
			xArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4};
			zArray = new int[]{0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 6, 7, 8, 7};

		}
		if (l == 2) {

			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 3, z - 7, 10.89, x + 11.39,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}

		if (l == 0) {

			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 3, z + 7, 10.89, x - 10.39,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 7, z - 3, 10.89, x + 1,
					y + 1, z - 10.39, tempType.getLabel(), tempType.getItem().item))
				return false;
		}

		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 7, z + 3, 10.89, x,
					y + 1, z + 11.39, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean veryLargeLeft45DegreeTurn(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {
		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3};
			zArray = new int[]{0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 6, 7};
		} else {
			xArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4};
			zArray = new int[]{0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 6, 7, 8, 7};
		}
		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 3, x + 3, z - 7, 10.89, x - 10.39,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x - 3, z + 7, 10.89, x + 11.39,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 2, x - 7, z - 3, 10.89, x + 1,
					y + 1, z + 11.39, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 7, z + 3, 10.89, x,
					y + 1, z - 10.39, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean superLargeRight45DegreeTurn(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {

		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4};
			zArray = new int[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 7, 8, 9, 10, 9, 10};
		} else {
			xArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5};
			zArray = new int[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 7, 8, 9, 10, 9, 10, 11, 10};
		}

		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 4, z - 11, 15.69, x + 16.19,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 4, z + 11, 15.69, x - 15.19,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 11, z - 4, 15.69, x + 1,
					y + 1, z - 15.19, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 11, z + 4, 15.69, x,
					y + 1, z + 16.19, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean superLargeLeft45DegreeTurn(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType) {

		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4};
			zArray = new int[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 7, 8, 9, 10, 9, 10};
		} else {
			xArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5};
			zArray = new int[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 7, 8, 9, 10, 9, 10, 11, 10};
		}
		if (l == 2) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 4, z - 11, 15.69, x - 15.19,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}

		if (l == 0) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 4, z + 11, 15.69, x + 16.19,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 11, z + 4, 15.69, x + 1,
					y + 1, z + 16.19, tempType.getLabel(), tempType.getItem().item))
				return false;
		}

		if (l == 3) {
			return putDownTurn(context, player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 11, z - 4, 15.69, x,
					y + 1, z - 15.19, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}

	private boolean mediumRight45DegreeSwitch(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType, String typeVariantStraight, String typeVariant90Turn){
		int dx = 0;
		int dz = 0;

		if (l == 0) dz = 1;
		if (l == 1) dx = -1;
		if (l == 2) dz = -1;
		if (l == 3) dx = 1;

		for (int i = 0; i <= 3 ; i++){
			if (!canPlaceTrack(context, player, world, x + (dx * i), y + 1, z + (dz * i))){
				return false;
			}
		}
		int[] xArray;
		int[] zArray;

		if (player.isSneaking()) {
			xArray = new int[]{1, 1};
			zArray = new int[]{2, 3};
		}

		else {
			xArray = new int[]{1, 1, 1, 2};
			zArray = new int[]{2, 3, 4, 3};
		}

		if (l == 2) {
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 1, z - 3, 3.75, x + 4.25, y + 1,
					z, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z - 1, l, x + 4.25, y + 1, z, 3.75, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z - 2, l, x + 4.25, y + 1, z, 3.75, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
		}

		if (l == 0) {
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 1, z + 3, 3.75, x - 3.25, y + 1,
					z + 1, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 0);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z + 1, l, x - 3.25, y + 1, z + 1, 3.75, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z + 2, l, x - 3.25, y + 1, z + 1, 3.75, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 3, z - 1, 3.75, x, y + 1,
					z - 3.25, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x - 1, y + 1, z, l, x, y + 1, z - 3.25, 3.75, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x - 2, y + 1, z, l, x, y + 1, z - 3.25, 3.75, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);
		}
		if (l == 3) {
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 2, x + 3, z + 1, 3.75, x + 1, y + 1,
					z + 4.25, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x + 1, y + 1, z, l, x + 1, y + 1, z + 4.25, 3.75, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x + 2, y + 1, z, l, x + 1, y + 1, z + 4.25, 3.75, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x + 3, y + 1, z, l, x + 1, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
		}


		return true;
	}
	private boolean mediumLeft45DegreeSwitch(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType, String typeVariantStraight, String typeVariant90Turn){
		int dx = 0;
		int dz = 0;

		if (l == 0) dz = 1;
		if (l == 1) dx = -1;
		if (l == 2) dz = -1;
		if (l == 3) dx = 1;

		for (int i = 0; i <= 3 ; i++){
			if (!canPlaceTrack(context, player, world, x + (dx * i), y + 1, z + (dz * i))){
				return false;
			}
		}
		int[] xArray;
		int[] zArray;
		if (player.isSneaking()) {
			xArray = new int[]{1, 1};
			zArray = new int[]{2, 3};
		}
		else {
			xArray = new int[]{1, 1, 1, 2};
			zArray = new int[]{2, 3, 4, 3};
		}
		if (l == 2) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 1, z - 3, 3.75, x - 3.25, y + 1,
					z, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z - 1, l, x - 3.25, y + 1, z, 3.75, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z - 2, l, x - 3.25, y + 1, z, 3.75, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
		}

		if (l == 0) {
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z + 3, 3.75, x + 4.25, y + 1,
					z + 1, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z + 1, l, x + 4.25, y + 1, z + 1, 3.75, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z + 2, l, x + 4.25, y + 1, z + 1, 3.75, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);
		}
		if (l == 1) {
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 3, z + 1, 3.75, x, y + 1,
					z + 4.25, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x - 1, y + 1, z, l, x, y + 1, z + 4.25, 3.75, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x - 2, y + 1, z, l, x, y + 1, z + 4.25, 3.75, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
		}
		if (l == 3) {
			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 3, z - 1, 3.75, x + 1, y + 1,
					z - 3.25, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x + 1, y + 1, z, l, x + 1, y + 1, z - 3.25, 3.75, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x + 2, y + 1, z, l, x + 1, y + 1, z - 3.25, 3.75, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x + 3, y + 1, z, l, x + 1, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
		}


		return true;
	}

	private boolean largeRight45DegreeSwitch(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType, String typeVariantStraight, String typeVariant90Turn){

		int dx = 0;
		int dz = 0;

		if (l == 0) dz = 1;
		if (l == 1) dx = -1;
		if (l == 2) dz = -1;
		if (l == 3) dx = 1;

		for (int i = 0; i <= 6 ; i++){
			if (!canPlaceTrack(context, player, world, x + (dx * i), y + 1, z + (dz * i))){
				return false;
			}
		}


		int[] xArray;
		int[] zArray;

		if (player.isSneaking()){
			xArray = new int[] {1, 1, 1, 1, 2, 2 };
			zArray = new int[] {3, 4, 5, 6, 5, 6};
		}
		else {
			xArray = new int[] {1, 1, 1, 1, 2, 2, 2, 3};
			zArray = new int[] {3, 4, 5, 6, 5, 6, 7, 6};
		}

		if (l == 2) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x, z - 7, 8.49, x + 8.99,
					y + 1, z, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x + 1, y + 1, z - 3, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z - 1 , l, x + 8.99, y + 1, z , 8.49, tempType.getLabel(), true, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z - 2, l, x + 8.99, y + 1, z , 8.49, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z - 3 , l, x + 8.99, y + 1, z , 8.49, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z - 4, l, x + 8.99, y + 1, z , 8.49, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z - 6, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
		}

		if (l == 0) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x, z + 7, 8.49, x - 7.99,
					y + 1, z + 1, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x - 1, y + 1, z + 3, l, 0);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z + 1 , l, x - 7.99, y + 1, z + 1, 8.49, tempType.getLabel(), true, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z + 2, l, x - 7.99, y + 1, z + 1 , 8.49, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z + 3 , l, x - 7.99, y + 1, z + 1 , 8.49, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z + 4, l, x - 7.99, y + 1, z + 1, 8.49, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z + 6, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
		}

		if (l == 1) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 7, z , 8.49, x ,
					y + 1, z - 7.99, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x - 3, y + 1, z - 1, l, 1);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x - 1, y + 1, z  , l, x , y + 1, z - 7.99, 8.49, tempType.getLabel(), true, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x - 2, y + 1, z , l, x , y + 1, z - 7.99 , 8.49, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x - 3, y + 1, z , l, x , y + 1, z - 7.99 , 8.49, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x - 4, y + 1, z , l, x , y + 1, z - 7.99, 8.49, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x - 5, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x - 6, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
		}

		if (l == 3) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 7, z , 8.49, x + 1 ,
					y + 1, z + 8.99, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x + 3, y + 1, z + 1, l, 3);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x + 1, y + 1, z  , l, x + 1 , y + 1, z + 8.99, 8.49, tempType.getLabel(), true, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x + 2, y + 1, z , l, x + 1 , y + 1, z + 8.99 , 8.49, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x + 3, y + 1, z , l, x + 1 , y + 1, z + 8.99 , 8.49, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x + 4, y + 1, z , l, x + 1 , y + 1, z + 8.99, 8.49, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x + 5, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x + 6, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
		}
		return true;
	}
	private boolean largeLeft45DegreeSwitch(TrackPlacementContext context, EntityPlayer player, World world, int x, int y, int z, int l, ITrackDefinition tempType, String typeVariantStraight, String typeVariant90Turn){

		int dx = 0;
		int dz = 0;

		if (l == 0) dz = 1;
		if (l == 1) dx = -1;
		if (l == 2) dz = -1;
		if (l == 3) dx = 1;

		for (int i = 0; i <= 6 ; i++){
			if (!canPlaceTrack(context, player, world, x + (dx * i), y + 1, z + (dz * i))){
				return false;
			}
		}


		int[] xArray;
		int[] zArray;

		if (player.isSneaking()){
			xArray = new int[] {1, 1, 1, 1, 2, 2 };
			zArray = new int[] {3, 4, 5, 6, 5, 6};
		}
		else {
			xArray = new int[] {1, 1, 1, 1, 2, 2, 2, 3};
			zArray = new int[] {3, 4, 5, 6, 5, 6, 7, 6};
		}

		if (l == 2) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x, z - 7, 8.49, x - 7.99,
					y + 1, z, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x - 1, y + 1, z - 3, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z - 1 , l, x - 7.99, y + 1, z , 8.49, tempType.getLabel(), true, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z - 2, l, x - 7.99, y + 1, z , 8.49, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z - 3 , l, x - 7.99, y + 1, z , 8.49, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z - 4, l, x - 7.99, y + 1, z , 8.49, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z - 6, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
		}

		if (l == 0) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x, z + 7, 8.49, x + 8.99,
					y + 1, z + 1, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x + 1, y + 1, z + 3, l, 0);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z + 1 , l, x + 8.99, y + 1, z + 1, 8.49, tempType.getLabel(), true, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z + 2, l, x + 8.99, y + 1, z + 1 , 8.49, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x, y + 1, z + 3 , l, x + 8.99, y + 1, z + 1 , 8.49, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x, y + 1, z + 4, l, x + 8.99, y + 1, z + 1, 8.49, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x, y + 1, z + 6, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
		}

		if (l == 1) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 7, z , 8.49, x ,
					y + 1, z + 8.99, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x - 3, y + 1, z + 1, l, 1);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x - 1, y + 1, z  , l, x , y + 1, z + 8.99, 8.49, tempType.getLabel(), true, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x - 2, y + 1, z , l, x , y + 1, z + 8.99 , 8.49, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x - 3, y + 1, z , l, x , y + 1, z + 8.99 , 8.49, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x - 4, y + 1, z , l, x , y + 1, z + 8.99, 8.49, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x - 5, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x - 6, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
		}

		if (l == 3) {

			if (!putDownTurn(context, player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 7, z , 8.49, x + 1 ,
					y + 1, z - 7.99, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x + 3, y + 1, z - 1, l, 3);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x + 1, y + 1, z  , l, x + 1 , y + 1, z - 7.99, 8.49, tempType.getLabel(), true, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x + 2, y + 1, z , l, x + 1 , y + 1, z - 7.99 , 8.49, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(context, world, x + 3, y + 1, z , l, x + 1 , y + 1, z - 7.99 , 8.49, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(context, world, x + 4, y + 1, z , l, x + 1 , y + 1, z - 7.99, 8.49, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x + 5, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
			/** Put down straight exit **/
			putDownSingleRail(context, world, x + 6, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	/**
	 * changes the sign of an array and adds the current world pos to it
	 */
	public int[] flipArraySign(int[] array, int pos, boolean needsConverting) {
		if (needsConverting)
			for (int i = 0; i < array.length; i++) {
				array[i] = (array[i] * -1) + pos;
			}
		else {
			for (int i = 0; i < array.length; i++) {
				array[i] = (array[i] + pos);
			}
		}

		return array;
	}

	public int[] flipArraySign(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i] = (array[i] * -1);
		}
		return array;
	}

	/**
	 * Replaces one cell with the requested rail block. An active replacement transaction captures a different removed
	 * block for restoration; ordinary placement follows the legacy removed-block drop behavior.
	 *
	 * @param context immutable state for this placement operation
	 * @param world world receiving the rail cell
	 * @param x target world block X coordinate
	 * @param y target world block Y coordinate
	 * @param z target world block Z coordinate
	 * @param block ordinary parent or gag block requested by the placement routine
	 * @param metadata rail-cell metadata
	 */
	private void placeTrack(TrackPlacementContext context,
			World world, int x, int y, int z, Block block, int metadata)
	{
		TrackHostPlacementTransaction transaction = context.getTransaction();
		Block removed = world.getBlock(x, y, z);

		// Active host placement selects the matching embedded, slab, or stair rail block.
		Block placedBlock = getTrackHostPlacementBlock(block, removed, transaction);
		if (removed != null && transaction != null && transaction.isActive() && removed != placedBlock)
		{
			int removedMetadata = world.getBlockMetadata(x, y, z);
			transaction.capture(x, y, z, removed, removedMetadata);
		}
		if (removed != null && (transaction == null || transaction.isActive() == false))
		{
			removed.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
		}
		boolean placed = world.setBlock(x, y, z, placedBlock, metadata,
				TrackHostConstants.NOTIFY_NEIGHBORS_AND_CLIENTS);
		if (transaction != null && transaction.isActive())
		{
			if (placed == false)
			{
				transaction.recordPlacementFailure();
			}
			else if (block == BlockIDs.tcRail.block)
			{
				transaction.recordParentCoordinate(x, y, z);
			}
		}
	}

	/**
	 * Validates that every replacement cell shares one rail-supporting surface height.
	 *
	 * @param context immutable state for this validation or placement operation
	 * @param world world containing the candidate host
	 * @param x candidate world block X coordinate
	 * @param y candidate world block Y coordinate
	 * @param z candidate world block Z coordinate
	 * @return whether the active placement transaction accepts the host height
	 */
	private boolean acceptsTrackHostSurface(TrackPlacementContext context,
			World world, int x, int y, int z)
	{
		TrackHostPlacementTransaction transaction = context.getTransaction();
		if (transaction != null)
		{
			return transaction.acceptHostSurface(world, x, y, z);
		}
		Block block = world.getBlock(x, y, z);
		TrackPlacementType placementType = context.getPlacementType();
		if (placementType == TrackPlacementType.SLAB_MOUNTED)
		{
			return block instanceof BlockSlab && block.isOpaqueCube() == false
					&& (world.getBlockMetadata(x, y, z) & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0;
		}
		return placementType != TrackPlacementType.STAIR_MOUNTED
				|| World.doesBlockHaveSolidTopSurface(world, x, y, z)
				&& (block instanceof BlockStairs || block.isOpaqueCube());
	}

	/**
	 * Selects the hidden parent or gag block whose static ambient-occlusion behavior matches the captured host shape.
	 *
	 * @param block ordinary parent or gag block requested by the placement routine
	 * @param capturedHost block being replaced at this exact cell
	 * @param transaction active replacement transaction
	 * @return ordinary block outside replacement placement, or the matching full, slab, or stair host block
	 */
	private Block getTrackHostPlacementBlock(Block block, Block capturedHost,
			TrackHostPlacementTransaction transaction)
	{
		if (transaction == null || transaction.isActive() == false)
		{
			return block;
		}
		if (block == BlockIDs.tcRail.block)
		{
			if (capturedHost instanceof BlockStairs)
			{
				return BlockIDs.tcRailStairMounted.block;
			}
			return capturedHost instanceof BlockSlab && capturedHost.isOpaqueCube() == false
					? BlockIDs.tcRailSlabMounted.block : BlockIDs.tcRailEmbedded.block;
		}
		if (block == BlockIDs.tcRailGag.block)
		{
			if (capturedHost instanceof BlockStairs)
			{
				return BlockIDs.tcRailGagStairMounted.block;
			}
			return capturedHost instanceof BlockSlab && capturedHost.isOpaqueCube() == false
					? BlockIDs.tcRailGagSlabMounted.block : BlockIDs.tcRailGagEmbedded.block;
		}
		return block;
	}

	/**
	 * Adds track type, ballast, placement, and scroll-family guidance to the item tooltip.
	 *
	 * @param par1ItemStack displayed rail item stack
	 * @param par2EntityPlayer player viewing the tooltip
	 * @param par3List tooltip lines receiving the track information
	 * @param par4 whether advanced tooltip details are enabled
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		ITrackDefinition track = getTrackType(par1ItemStack);
		if (track.getVariant() != null)
		{
			switch (track.getVariant())
			{
				case NORMAL:
					par3List.add(EnumChatFormatting.GRAY + "Variant: " + "Default");
					break;
				case EMBEDDED:
					String embeddedName = track.getPlacementType() == TrackPlacementType.REPLACE_TARGET
							? "Embedded Rail" : "Sleeperless";
					par3List.add(EnumChatFormatting.GRAY + "Variant: " + embeddedName);
					break;
				default:
				{
					par3List.add(EnumChatFormatting.GRAY + "Variant: " + track.getVariant().name());
				}
			}
		}
		if (track.getBallastType() != null)
		{
			par3List.add(EnumChatFormatting.GRAY + "Ballast: " + track.getBallastType().name());
		}


		par3List.add("\u00a77" + getTooltip(track));
		String slopeGrade = getSlopeGradeTooltip(track);
		if (slopeGrade.length() > 0)
		{
			par3List.add(EnumChatFormatting.GRAY + slopeGrade);
		}
		if (track.getPlacementType() != TrackPlacementType.REPLACE_TARGET
				&& ((TCRailTypes.RailTypes.SLOPE.equals(track.getRailType())
				&& track.getBallastType() == BallastTypes.DYNAMIC)
				|| TCRailTypes.RailTypes.STRAIGHT.equals(track.getRailType()))
				&& track.getCoreTrack().isEmbeddedTransitionSlope() == false)
		{
			par3List.add("\u00a77" + "Shift+Scroll to");
			par3List.add("\u00a77" + "Cycle Between Straight And Slope");
		}
		boolean transitionScrollFamily = track.getCoreTrack().isEmbeddedTransitionSlope()
				|| EnumCoreTrack.CORE_MEDIUM_STRAIGHT.equals(track.getCoreTrack());
		if (RailVariants.EMBEDDED.equals(track.getVariant())
				&& ((TCRailTypes.RailTypes.SLOPE.equals(track.getRailType()) == false
				&& TCRailTypes.RailTypes.CURVED_SLOPE.equals(track.getRailType()) == false)
				|| track.getCoreTrack().isEmbeddedTransitionSlope()))
		{
			par3List.add("\u00a77" + "Shift+Scroll to cycle");
			if (transitionScrollFamily)
			{
				par3List.add("\u00a77" + "Sleeperless, Embedded,");
				par3List.add("\u00a77" + "and Transition");
			}
			else
			{
				par3List.add("\u00a77" + "Sleeperless and Embedded Rail");
			}
		}
	}

	public ITrackDefinition getTrackType() {
		return this.type;
	}

	/** Resolves the placement definition selected on an individual stack. */
	public ITrackDefinition getTrackType(ItemStack stack)
	{
		if (stack != null && stack.hasTagCompound()
				&& stack.getTagCompound().hasKey(SELECTED_TRACK_DEFINITION_TAG))
		{
			ITrackDefinition selected = EnumTracks.GetTrackByLabel(
					stack.getTagCompound().getString(SELECTED_TRACK_DEFINITION_TAG));
			if (selected != null && selected.getItem() == type.getItem()
					&& selected.getPlacementType() != TrackPlacementType.SLAB_MOUNTED
					&& selected.getPlacementType() != TrackPlacementType.STAIR_MOUNTED)
			{
				return selected;
			}
		}
		return type;
	}

	/** Stores a scroll-selected placement definition without creating another registered item. */
	public void setTrackType(ItemStack stack, ITrackDefinition selected)
	{
		if (stack == null || selected == null || selected.getItem() != type.getItem())
		{
			return;
		}
		if (selected.getLabel().equals(type.getLabel()))
		{
			if (stack.hasTagCompound())
			{
				stack.getTagCompound().removeTag(SELECTED_TRACK_DEFINITION_TAG);
			}
			return;
		}
		if (stack.hasTagCompound() == false)
		{
			stack.setTagCompound(new net.minecraft.nbt.NBTTagCompound());
		}
		stack.getTagCompound().setString(SELECTED_TRACK_DEFINITION_TAG, selected.getLabel());
	}

	/**
	 * Returns the compact footprint description displayed in a rail tooltip.
	 *
	 * @param trackDefinition definition whose footprint should be described
	 * @return human-readable footprint text, or a diagnostic fallback when the core has no defined footprint
	 */
	public static String getTooltip(ITrackDefinition trackDefinition)
	{
		String toolTipDetail = "";
		switch (trackDefinition.getCoreTrack())
		{
			case CORE_SMALL_STRAIGHT:
			case CORE_1X_TURN:
				toolTipDetail = "1x1";
				break;
			case CORE_3_SLOPE:
			case CORE_MEDIUM_STRAIGHT:
			case CORE_3_DIAGONAL_SLOPE:
				toolTipDetail = "1x3";
				break;
			case CORE_6_SLOPE:
			case CORE_LONG_STRAIGHT:
			case CORE_6_DIAGONAL_SLOPE:
				toolTipDetail = "1x6";
				break;
			case CORE_12_SLOPE:
			case CORE_VERY_LONG_STRAIGHT:
			case CORE_12_DIAGONAL_SLOPE:
				toolTipDetail = "1x12";
				break;
			case CORE_18_SLOPE:
			case CORE_18_DIAGONAL_SLOPE:
				toolTipDetail = "1x18";
				break;
			case CORE_3_HALF_HEIGHT_SLOPE:
				toolTipDetail = "1x3, +1/2 block";
				break;
			case CORE_6_HALF_HEIGHT_SLOPE:
				toolTipDetail = "1x6, +1/2 block";
				break;
			case CORE_9_HALF_HEIGHT_SLOPE:
				toolTipDetail = "1x9, +1/2 block";
				break;
			case CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE:
				toolTipDetail = "3x3 diagonal, +1/2 block";
				break;
			case CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE:
				toolTipDetail = "6x6 diagonal, +1/2 block";
				break;
			case CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE:
				toolTipDetail = "9x9 diagonal, +1/2 block";
				break;
			case CORE_4x4_SWITCH:
				toolTipDetail = "4x4";
				break;
			case CORE_6x6_SWITCH:
				toolTipDetail = "6x6";
				break;
			case CORE_11x11_SWITCH:
				toolTipDetail = "11x11";
				break;
			case CORE_10x2_CROSSOVER_SWITCH:
				toolTipDetail = "10x3";
				break;
			case CORE_4x11_PARALLEL_SWITCH:
				toolTipDetail = "4x11";
				break;
			case CORE_4x17_PARALLEL_SWITCH:
				toolTipDetail = "4x17";
				break;
			case CORE_3x5_45DEGREE_SWITCH:
				toolTipDetail = "3x5";
				break;
			case CORE_4x8_45DEGREE_SWITCH:
				toolTipDetail = "4x8";
				break;
			case CORE_DIAMOND_CROSSING:
			case CORE_DIAMOND_CROSSING_R:
			case CORE_DIAMOND_CROSSING_L:
			case CORE_DOUBLE_DIAMOND_CROSSING:
			case CORE_TWO_WAYS_CROSSING:
			case CORE_DIAGONAL_TWO_WAYS_CROSSING:
			case CORE_FOUR_WAYS_CROSSING:
			case CORE_3X_TURN:
				toolTipDetail = "3x3";
				break;
			case CORE_3X4_45DEGREE_TURN:
				toolTipDetail = "3x4";
				break;
			//case CORE_3X5_45DEGREE_TURN:
			//    toolTipDetail = "3x5";
			//    break;
			case CORE_3X6_45DEGREE_TURN:
				toolTipDetail = "3x6";
				break;
			case CORE_4X8_45DEGREE_TURN:
				toolTipDetail = "4x8";
				break;
			case CORE_9X20_45DEGREE_TURN:
				toolTipDetail = "9x20";
				break;
			case CORE_10x22_45DEGREE_TURN:
				toolTipDetail = "10x20";
				break;
			case CORE_5X11_45DEGREE_TURN:
				toolTipDetail = "5x11";
				break;
			case CORE_S_CURVE_20x2:
				toolTipDetail = "2x20";
				break;
			case CORE_S_CURVE_4x16:
				toolTipDetail = "4x16";
				break;
			case CORE_S_CURVE_3x12:
				toolTipDetail = "3x12";
				break;
			case CORE_S_CURVE_2x8:
				toolTipDetail = "2x8";
				break;
			case CORE_32X_TURN:
				toolTipDetail = "32x32";
				break;
			case CORE_29X_TURN:
				toolTipDetail = "29x29";
				break;
			case CORE_16X_TURN:
				toolTipDetail = "16x16";
				break;
			case CORE_10X_TURN:
				toolTipDetail = "10x10";
				break;
			case CORE_5X_TURN:
				toolTipDetail = "5x5";
				break;
		}

		if (TCRailTypes.RailTypes.DIAGONALTURN.equals(trackDefinition.getRailType()) && !toolTipDetail.isEmpty())
		{
			toolTipDetail += " hold sneak to attach to the back of another curve";
			return toolTipDetail;
		}

		if (!toolTipDetail.isEmpty())
		{
			return toolTipDetail;
		}

		return "HOW DID YOU EVEN DO THIS";
	}

	/**
	 * Returns the rounded grade shown as flavor text for a slope item. Cardinal slopes use their horizontal footprint
	 * length, while diagonal slopes use the corresponding diagonal distance. The result intentionally uses two decimal
	 * places so nearby practical grades remain distinguishable without exposing excessive precision.
	 *
	 * @param trackDefinition slope definition whose grade should be described
	 * @return grade label containing a percentage rounded to two decimal places, or an empty string for non-slope tracks
	 */
	public static String getSlopeGradeTooltip(ITrackDefinition trackDefinition)
	{
		TrackSlopeParameters slope = TrackSlopeParameters.canonical(trackDefinition);
		if (slope == null)
		{
			return "";
		}
		return String.format(Locale.ROOT, "Grade: %.2f%%", slope.getGradePercent());
	}
}
