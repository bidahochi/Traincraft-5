package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockMushroom;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.util.vector.Matrix2f;
import org.lwjgl.util.vector.Vector2f;
import train.common.enums.TCTrackDirection;
import train.common.library.*;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;
import static train.common.core.handlers.ConfigHandler.ENGINEERGAMING;

import javax.annotation.Nullable;
import java.util.List;

import static train.common.library.EnumCoreTrack.CORE_5X11_45DEGREE_TURN_R;
import static train.common.library.EnumTracks.*;

public class ItemTCRail extends ItemPart {
	private EnumTracks type;
	EnumTracks tempType;

	private String typeVariantStraightLabel = EnumTracks.SMALL_STRAIGHT.getLabel();
	private String typeVariantDiagonalStraightLabel = EnumTracks.SMALL_DIAGONAL_STRAIGHT.getLabel();
	private String typeVariant90Turn;

	public void setEnumTrack(EnumTracks enumTrack)
	{
		type = enumTrack;
	}

	public static boolean isTCTurnTrack(TileTCRail tile) {
		if(tile==null || tile.getType()==null){return false;}
		return (tile.getType().equals(EnumTracks.MEDIUM_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.LARGE_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.LARGE_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.LARGE_LEFT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())

				|| tile.getType().equals(EnumTracks.MEDIUM_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.VERY_LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.VERY_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.MEDIUM_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.SUPER_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.SUPER_LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.LEFT_TURN_29X29.getLabel())
				|| tile.getType().equals(EnumTracks.RIGHT_TURN_29X29.getLabel())
				|| tile.getType().equals(EnumTracks.LEFT_TURN_32X32.getLabel())
				|| tile.getType().equals(EnumTracks.RIGHT_TURN_32X32.getLabel())
				|| tile.getType().equals(EnumTracks.LEFT_TURN_1X1.getLabel())
				|| tile.getType().equals(EnumTracks.RIGHT_TURN_1X1.getLabel())

				|| tile.getType().equals(EnumTracks.SMALL_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.SMALL_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.MEDIUM_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.MEDIUM_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.LARGE_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.LARGE_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.S_CURVE_20x2_LEFT.getLabel())
				|| tile.getType().equals(EnumTracks.S_CURVE_20x2_RIGHT.getLabel())

				|| tile.getType().equals(EnumTracks.EMBEDDED_MEDIUM_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_VERY_LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_VERY_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_MEDIUM_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_SUPER_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_SUPER_LARGE_RIGHT_TURN.getLabel())

				|| tile.getType().equals(EnumTracks.EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_SMALL_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_LARGE_LEFT_PARALLEL_CURVE.getLabel());


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

	public static boolean isTCSwitch(TileTCRail tile) {
		if(tile==null || tile.getType()==null){return false;}
		return
				(tile.getType().equals(EnumTracks.MEDIUM_LEFT_SWITCH.getLabel()))
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_SWITCH.getLabel()))
				|| (tile.getType().equals(EnumTracks.LARGE_LEFT_SWITCH.getLabel()))
				|| (tile.getType().equals(EnumTracks.LARGE_RIGHT_SWITCH.getLabel()));
				//|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()))
				//|| (tile.getType().equals(EnumTracks.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()));
	}

	public ItemTCRail(EnumTracks t) {
		super(t.getItem().iconName);
		this.overridePath("tracks");
		this.type = t;
	}

	private boolean canPlaceTrack(EntityPlayer player, World world, int x, int y, int z) {
		Block l1 = world.getBlock(x, y - 1, z);

		if(player !=null && (!player.canPlayerEdit(x, y - 1, z, 0, player.getCurrentEquippedItem()) ||
				!player.canPlayerEdit(x, y, z, 0, player.getCurrentEquippedItem()))
		){
			return false;
		}

		return canBeReplaced(world, x, y, z) && (World.doesBlockHaveSolidTopSurface(world ,x, y - 1, z) || l1 == BlockIDs.bridgePillar.block);
	}

	private boolean canBeReplaced(World world, int x, int y, int z){
		Block block = world.getBlock(x, y, z);
		return block == null || block.isReplaceable(world, x, y, z) || block instanceof BlockFlower
				|| block == Blocks.double_plant || block instanceof BlockMushroom;
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
	private boolean putDownTurn(@Nullable EntityPlayer player, World world, boolean putDownEnterTrack, int x, int y, int z, int[] posX, int[] posZ,
								int l, boolean putDownExitTrack, int exitFacing, int posExitX, int posExitZ, double r, double cx, double cy,
								double cz, String type, Item idDrop) {
		TileTCRailGag[] tileGag = new TileTCRailGag[posX.length - 1];

		/** check if first straight rail can be placed */
		if (putDownEnterTrack && !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}

		/** check if Gag rails can be placed */
		for (int gag = 0; gag < posX.length; gag++) {
			if (!canPlaceTrack(player, world, posX[gag], y + 1, posZ[gag])) {
				return false;
			}
		}
		/** Check last block */
		if (putDownExitTrack && !canPlaceTrack(player, world, posExitX, y + 1, posExitZ)) {
			return false;
		}
		if (putDownEnterTrack) {
			/** first rail of the turn is a 1 block straight */
			placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
			TileTCRail tcRailStart = (TileTCRail) world.getTileEntity(x, y + 1, z);
			tcRailStart.setType(typeVariantStraightLabel);
			tcRailStart.setFacing(l);
			tcRailStart.isLinkedToRail = true;
			tcRailStart.linkedX = posX[0];
			tcRailStart.linkedY = y + 1;
			tcRailStart.linkedZ = posZ[0];
		}

		/** the turn starts with this rail */
		placeTrack(world,posX[0], y + 1, posZ[0], BlockIDs.tcRail.block, l);
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
			placeTrack(world,posX[gag], y + 1, posZ[gag], BlockIDs.tcRailGag.block, 0);
			tileGag[gag - 1] = (TileTCRailGag) world.getTileEntity(posX[gag], y + 1, posZ[gag]);
		}

		if (putDownExitTrack) {
			/** Last rail is a 1 block straight */
			placeTrack(world,posExitX, y + 1, posExitZ, BlockIDs.tcRail.block, exitFacing);
			TileTCRail tcRailEnd = (TileTCRail) world.getTileEntity(posExitX, y + 1, posExitZ);
			tcRailEnd.setFacing(exitFacing);
			tcRailEnd.setType(typeVariantStraightLabel);
			tcRailEnd.isLinkedToRail = true;
			tcRailEnd.linkedX = posX[0];
			tcRailEnd.linkedY = y + 1;
			tcRailEnd.linkedZ = posZ[0];
		}

		for (int i = 0; i < tileGag.length; i++) {
			tileGag[i].originX = posX[0];
			tileGag[i].originY = y + 1;
			tileGag[i].originZ = posZ[0];
			tileGag[i].type = type;
		}
		return true;
	}

	private void putDownSingleRail(World world, int posX, int posY, int posZ, int l, double cx, double cy, double cz, double r, String label, boolean hasModel, int linkedX, int linkedY, int linkedZ, boolean canTypeBeModifiedBySwitch, boolean shouldDrop) {
		/** Switch rail */
		placeTrack(world,posX, posY, posZ, BlockIDs.tcRail.block, l);
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

	public boolean tryToPlaceTrack( ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, boolean changeWorld )
	{
		if ( !(itemStack.getItem() instanceof ItemTCRail) )
			return false;

		y = getPlacementHeight(world, x, y, z);

		ItemTCRail item = (ItemTCRail) itemStack.getItem();
		float yaw = player.rotationYaw;
		int divisions = (type.getRailType() == TCRailTypes.RailTypes.DIAGONAL || type.getRailType() == TCRailTypes.RailTypes.STRAIGHT) ? 8 : 4;
		int facing0 = getDiscreteFacing(yaw, divisions);
		if (divisions == 8) {
			facing0 = TCTrackDirection.ConvertDiagonalDirectionInput(facing0);
		}
		Vector2f dir0 = ItemTCRail.getDirectionVector(facing0);

		yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
		boolean isLeftTurn = item.getTrackOrientation( facing0, yaw ).equals("left");
		int facing1 = isLeftTurn ? (facing0 + 4 - 1) % 4 : (facing0 + 1) % 4;
		Vector2f dir1 = getDirectionVector( facing1 );
		int[][] trackPositions;
		if (type.getRailType() == TCRailTypes.RailTypes.DIAGONAL || type.getRailType() == TCRailTypes.RailTypes.STRAIGHT) {
			tempType = getPlacementDirection(player, world, facing0, 0);
			trackPositions = tempType.getUsedSpaceFromType(player);
		}
		else {
			trackPositions = type.getUsedSpaceFromType(player);
		}
		if ( trackPositions != null )
		{

			for ( int[] pos : trackPositions )
			{
				int dx = (int) (pos[0] * dir0.getX() + pos[1] * dir1.getX());
				int dz = (int) (pos[0] * dir0.getY() + pos[1] * dir1.getY());

				if( !canPlaceTrack(player, world, x + dx, y+1, z + dz ))
					return false;
			}

			return true;
		}else {
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

	private void setSharedStraightTypeVariant()
	{
		switch (type.getVariant())
		{
			case NORMAL:
				typeVariantStraightLabel = EnumTracks.SMALL_STRAIGHT.getLabel();
				typeVariantDiagonalStraightLabel = EnumTracks.SMALL_DIAGONAL_STRAIGHT.getLabel();
				break;
			case EMBEDDED:
				typeVariantStraightLabel = EnumTracks.EMBEDDED_SMALL_STRAIGHT.getLabel();
				typeVariantDiagonalStraightLabel = EnumTracks.EMBEDDED_SMALL_DIAGONAL_STRAIGHT.getLabel();
				break;
			case CONCRETE_TYPE1:
				typeVariantStraightLabel = EnumTracks.CONCRETE_TYPE1_SMALL_STRAIGHT.getLabel();
				typeVariantDiagonalStraightLabel = EnumTracks.CONCRETE_TYPE1_SMALL_DIAGONAL_STRAIGHT.getLabel();
				break;
			case CONCRETE_TYPE2:
				typeVariantStraightLabel = EnumTracks.CONCRETE_TYPE2_SMALL_STRAIGHT.getLabel();
				typeVariantDiagonalStraightLabel = EnumTracks.CONCRETE_TYPE2_SMALL_DIAGONAL_STRAIGHT.getLabel();
				break;
			case TREATED_WOOD_TYPE1:
				typeVariantStraightLabel = WOOD_TYPE1_SMALL_STRAIGHT.getLabel();
				typeVariantDiagonalStraightLabel = EnumTracks.WOOD_TYPE1_SMALL_DIAGONAL_STRAIGHT.getLabel();
				break;
			case WOOD_TYPE2:
				typeVariantStraightLabel = WOOD_TYPE2_SMALL_STRAIGHT.getLabel();
				typeVariantDiagonalStraightLabel = EnumTracks.WOOD_TYPE2_SMALL_DIAGONAL_STRAIGHT.getLabel();
				break;
		}
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if (!world.isRemote)
		{
			boolean result = attemptPlacementOfTrack(itemstack, player, world, x, y, z, par7, par8, par9, par10);

			if (result)
			{
				if (player == null || !player.capabilities.isCreativeMode)
				{
					--itemstack.stackSize;
				}

				if (ENGINEERGAMING) {
					world.playSoundEffect(x, y, z,
							"tc:track",
							0.25F,//volume
							1.0F);//pitch & speed
				}
			}

			return result;
		}

		return false;
	}

	private boolean attemptPlacementOfTrack(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{

		y = getPlacementHeight(world, x, y, z);
		int l = MathHelper.floor_double((player!=null?player.rotationYaw:par10) * 4.0F / 360.0F + 0.5D) & 3;

		int[] curveXArray;
		int[] curveZArray;
		int[] curveXArray2;
		int[] curveZArray2;

		tempType = getPlacementDirection(player, world, l, par10);

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
		setSharedStraightTypeVariant();
		switch (tempType.getCoreTrack())
		{
			case CORE_SMALL_DIAGONAL_STRAIGHT:
				if (!smallDiagonalStraight(player, world, x, y, z,  getFacing(player, par10), tempType))
				{
					return false;
				}


				return true;

			case CORE_MEDIUM_DIAGONAL_STRAIGHT:
			case CORE_LONG_DIAGONAL_STRAIGHT:
			case CORE_VERY_LONG_DIAGONAL_STRAIGHT:
				if (!diagonalStraight(player, world, x, y, z, getFacing(player, par10), tempType))
				{
					return false;
				}


				return true;

			case CORE_1X_TURN_L:
				if (!turn1XLeft(player, world, x, y, z, l, tempType)) {return false;}


				return true;

			case CORE_1X_TURN_R:
				if (!turn1XRight(player, world, x, y, z, l, tempType))
				{return false;}


				return true;

			case CORE_3X_TURN_L:
			case CORE_3X_TURN_R:
				curveXArray = new int[]{0, 0, 1, 1, 2};
				curveZArray = new int[]{0, 1, 1, 2, 2};
				if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 2.5f))
				{
					return false;
				}


				return true;

			case CORE_5X_TURN_L:
			case CORE_5X_TURN_R:
				curveXArray = new int[]{0, 0, 1, 1, 2, 0, 1, 2, 3, 4, 3, 2};
				curveZArray = new int[]{0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
				if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 4.5f))
				{
					return false;
				}


				return true;

			case CORE_10X_TURN_L:
			case CORE_10X_TURN_R:
				curveXArray = new int[]{0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 9};
				curveZArray = new int[]{0, 1, 2, 2, 3, 3, 4, 4, 5, 4, 5, 6, 6, 7, 7, 8, 7, 8, 9, 8, 9, 8, 9, 9, 9};
				if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 9.5f))
				{
					return false;
				}


				return true;

			case CORE_16X_TURN_L:
			case CORE_16X_TURN_R:
				curveXArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 15};
				curveZArray = new int[]{0, 1, 2, 3, 4, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 14, 15, 14, 15, 15, 15, 15};
				if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 15.5f))
				{
					return false;
				}


				return true;


			case CORE_29X_TURN_L:
			case CORE_29X_TURN_R:
				curveXArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 14, 15, 15, 16, 16, 16, 17, 17, 18, 18, 18, 19, 19, 20, 20, 21, 21, 21, 22, 22, 23, 23, 24, 24, 25, 25, 26, 27, 28};
				curveZArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10, 11, 12, 10, 11, 12, 13, 14, 12, 13, 14, 15, 14, 15, 16, 17, 16, 17, 18, 17, 18, 19, 18, 19, 20, 19, 20, 21, 20, 21, 22, 21, 22, 23, 22, 23, 23, 24, 23, 24, 25, 24, 25, 24, 25, 26, 25, 26, 25, 26, 27, 26, 27, 26, 27, 26, 27, 28, 27, 28, 27, 28, 27, 28, 27, 28, 28, 28, 28};

				if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 28.5f)) {return false;}


				return true;

			case CORE_32X_TURN_L:
			case CORE_32X_TURN_R:
				curveXArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 21, 22, 22, 23, 23, 24, 24, 24, 25, 25, 26, 26, 27, 27, 28, 28, 29, 29, 30, 31};
				curveZArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10, 11, 12, 10, 11, 12, 13, 14, 15, 13, 14, 15, 16, 14, 15, 16, 17, 18, 16, 17, 18, 19, 18, 19, 20, 19, 20, 21, 20, 21, 22, 21, 22, 23, 22, 23, 24, 23, 24, 25, 24, 25, 26, 25, 26, 25, 26, 27, 26, 27, 28, 26, 27, 28, 27, 28, 28, 29, 28, 29, 28, 29, 30, 29, 30, 29, 30, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31, 31};

				if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 31.5f)) {return false;}


				return true;
			case CORE_3X4_45DEGREE_TURN_R: //TODO consolidate left/right
				if (!mediumRight45DegreeTurn(player, world, x, y, z, l, tempType))
				{
					return false;
				}



				return true;
			case CORE_3X4_45DEGREE_TURN_L: //TODO consolidate left/right
				if (!mediumLeft45DegreeTurn(player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_3X6_45DEGREE_TURN_R:
				if (!largeRight45DegreeTurn(player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_3X6_45DEGREE_TURN_L:
				if (!largeLeft45DegreeTurn(player, world, x, y, z, l, tempType)) {
					return false;
				}


				return true;
			case CORE_4X8_45DEGREE_TURN_R:
				if (!veryLargeRight45DegreeTurn(player, world, x, y, z, l, tempType)) {
					return false;
				}


				return true;
			case CORE_4X8_45DEGREE_TURN_L:
				if (!veryLargeLeft45DegreeTurn(player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_5X11_45DEGREE_TURN_R:
				if (!superLargeRight45DegreeTurn(player, world, x, y, z, l, tempType))
				{
					return false;
				}


				return true;
			case CORE_5X11_45DEGREE_TURN_L:
				if (!superLargeLeft45DegreeTurn(player, world, x, y, z, l, tempType))
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
				if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 27.85f)) {return false;}


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
				if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 30.22f)) {
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
				if (!SCurve(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 16.25f, 8, 2)) {
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
				if (!SCurve(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 18.50f, 12, 3)) {
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
				if (!SCurve(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 22f, 16, 4)) {
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

				if (!SCurve(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 100.25f, 20, 2)) {
					return false;
				}


				return true;
			}

			case CORE_4x11_PARALLEL_SWITCH_L:
			{
				if (l == 2) {
					if (!parallelLeftSwitchNorth(player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 0) {
					if (!parallelLeftSwitchSouth(player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 1) {
					if (!parallelLeftSwitchWest(player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 3) {
					if (!parallelLeftSwitchEast(player, world, x, y, z, l, tempType))
						return false;
				}

				return true;
			}

			case CORE_4x11_PARALLEL_SWITCH_R:
			{
				if (l == 2) {
					if (!parallelRightSwitchNorth(player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 0) {
					if (!parallelRightSwitchSouth(player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 1) {
					if (!parallelRightSwitchWest(player, world, x, y, z, l, tempType))
						return false;
				}
				if (l == 3) {
					if (!parallelRightSwitchEast(player, world, x, y, z, l, tempType))
						return false;
				}

				return true;
			}

			case CORE_4x17_PARALLEL_SWITCH_L:
			{
				if (!largeLeftParallelSwitch(player, world, x, y, z, l, tempType, typeVariantStraightLabel)){return false;}


				return true;
			}

			case CORE_4x17_PARALLEL_SWITCH_R:
			{
				if (!largeRightParallelSwitch(player, world, x, y, z, l, tempType, typeVariantStraightLabel)){return false;}


				return true;
			}

			case CORE_10x2_CROSSOVER_SWITCH_L:
				typeVariant90Turn = tempType.getLabel().contains("EMBEDDED") ? EnumTracks.EMBEDDED_LARGE_LEFT_TURN.getLabel() : EnumTracks.LARGE_LEFT_TURN.getLabel();
				if (!crossover10x2Switch(player, world, x, y, z, l, tempType, typeVariantStraightLabel, typeVariant90Turn, player.isSneaking(), false)) { return false; }
				break;
			case CORE_10x2_CROSSOVER_SWITCH_R:
				typeVariant90Turn = tempType.getLabel().contains("EMBEDDED") ? EnumTracks.EMBEDDED_LARGE_RIGHT_TURN.getLabel() : EnumTracks.LARGE_RIGHT_TURN.getLabel();
				if (!crossover10x2Switch(player, world, x, y, z, l, tempType, typeVariantStraightLabel, typeVariant90Turn, player.isSneaking(), true)) { return false; }
				break;

			case CORE_4x4_SWITCH_R:
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
						return false;
					}

					int[] xArray = { x + 1, x + 1, x + 2 };
					int[] zArray = { z - 2, z - 3, z - 3 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 3, z - 3, 2.5, x + 3, y + 1,
							z, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
					if (tcRailTurn != null) {
						tcRailTurn.hasModel = false;
					}
					world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z - 1, l, x + 3, y + 1, z, 2.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x + 3, y + 1, z, 2.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2 };
					int[] zArray = { z + 2, z + 3, z + 3 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z + 3, 2.5, x - 2, y + 1,
							z + 1, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z + 1, l, x - 2, y + 1, z + 1, 2.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x - 2, y + 1, z + 1, 2.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
						return false;
					}

					int[] xArray = { x - 2, x - 3, x - 3 };
					int[] zArray = { z - 1, z - 1, z - 2 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 3, z - 3, 2.5, x, y + 1,
							z - 2, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 2, 2.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 2, 2.5, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 2, y + 1, z - 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
						return false;
					}

					int[] xArray = { x + 2, x + 3, x + 3 };
					int[] zArray = { z + 1, z + 1, z + 2 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 3, z + 3, 2.5, x + 1, y + 1,
							z + 3, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 2, y + 1, z + 1, false, false);

				}

				return true;
			case CORE_4x4_SWITCH_L:
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2 };
					int[] zArray = { z - 2, z - 3, z - 3 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z - 3, 2.5, x - 2, y + 1,
							z, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
					if (tcRailTurn != null) {
						tcRailTurn.hasModel = false;
					}
					world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z - 1, l, x - 2, y + 1, z, 2.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x - 2, y + 1, z, 2.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2 };
					int[] zArray = { z + 2, z + 3, z + 3 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 3, z + 3, 2.5, x + 3, y + 1,
							z + 1, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z + 1, l, x + 3, y + 1, z + 1, 2.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x + 3, y + 1, z + 1, 2.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3 };
					int[] zArray = { z + 1, z + 1, z + 2 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x - 3, z + 3, 2.5, x, y + 1,
							z + 3, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 3, 2.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 3, 2.5, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 2, y + 1, z + 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3 };
					int[] zArray = { z - 1, z - 1, z - 2 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x + 3, z - 3, 2.5, x + 1, y + 1,
							z - 2, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 2, y + 1, z - 1, false, false);

				}

				return true;
			case CORE_6x6_SWITCH_R:
			{
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x, y + 1, z - 5) || !canPlaceTrack(player, world, x, y + 1, z - 4) || !canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 4, x + 3, x + 2 };
					int[] zArray = { z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z - 5, 4.5, x + 5, y + 1,
							z, EnumTracks.LARGE_RIGHT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z - 1, l, x + 5, y + 1, z, 4.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x + 5, y + 1, z, 4.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x + 5, y + 1, z, 4.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x, y + 1, z + 5) || !canPlaceTrack(player, world, x, y + 1, z + 4) || !canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 2, x - 3, x - 4 };
					int[] zArray = { z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z + 5, 4.5, x - 4, y + 1,
							z + 1, EnumTracks.LARGE_RIGHT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z + 1, l, x - 4, y + 1, z + 1, 4.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x - 4, y + 1, z + 1, 4.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x - 4, y + 1, z + 1, 4.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x - 5, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z) || !canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5 };
					int[] zArray = { z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z - 5, 4.5, x, y + 1,
							z - 4, EnumTracks.LARGE_RIGHT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 4, 4.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 4, 4.5, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z - 4, 4.5, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 2, y + 1, z - 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x + 5, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z) || !canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5 };
					int[] zArray = { z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z + 5, 4.5, x + 1, y + 1,
							z + 5, EnumTracks.LARGE_RIGHT_TURN.getLabel(), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 2, y + 1, z + 1, false, false);

				}

				return true;
			}
			case CORE_6x6_SWITCH_L:
			{
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x, y + 1, z - 5) || !canPlaceTrack(player, world, x, y + 1, z - 4) || !canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
						return false;
					}
					int[] xArray = { x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 4, x - 3, x - 2 };
					int[] zArray = { z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z - 5, 4.5, x - 4, y + 1,
							z, EnumTracks.LARGE_LEFT_TURN.getLabel(), type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z - 1, l, x - 4, y + 1, z, 4.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x - 4, y + 1, z, 4.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x - 4, y + 1, z, 4.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z - 2, false, false);

				}
				else if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x, y + 1, z + 5) || !canPlaceTrack(player, world, x, y + 1, z + 4) || !canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 2, x + 3, x + 4 };
					int[] zArray = { z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z + 5, 4.5, x + 5, y + 1,
							z + 1, EnumTracks.LARGE_LEFT_TURN.getLabel(), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z + 1, l, x + 5, y + 1, z + 1, 4.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x + 5, y + 1, z + 1, 4.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x + 5, y + 1, z + 1, 4.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z + 2, false, false);

				}
				else if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x - 5, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z) || !canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5 };
					int[] zArray = { z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z + 5, 4.5, x, y + 1,
							z + 5, EnumTracks.LARGE_LEFT_TURN.getLabel(), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 5, 4.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 5, 4.5, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z + 5, 4.5, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 2, y + 1, z + 1, false, false);

				}
				else if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(player, world, x + 5, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z) || !canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5 };
					int[] zArray = { z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z - 5, 4.5, x + 1, y + 1,
							z - 4, EnumTracks.LARGE_LEFT_TURN.getLabel(), type.getItem().item))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 2, y + 1, z - 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel,
							true, x + 2, y + 1, z - 1, false, false);

				}

				return true;
			}

			case CORE_11x11_SWITCH_R:
			{
				if (tempType == EnumTracks.VERY_LARGE_RIGHT_SWITCH) {
					typeVariant90Turn = EnumTracks.VERY_LARGE_RIGHT_TURN.getLabel();
				}
				else {
					typeVariant90Turn = EnumTracks.EMBEDDED_VERY_LARGE_RIGHT_TURN.getLabel();
				}

				int[] xArray = { 1,1,1,1,1,2,2,2,3,3,4,4,5,5,5,6,6,7,7,8,9};
				int[] zArray = { 2,3,4,5,6,6,6,7,7,8,8,9,8,9,10,9,10,9,10, 10,10};

				if(l == 2)
				{
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(player, world, x, y + 1, z - i)) return false;
					}

					if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, true, 3, x + 10, z - 10, 9.5, x + 10, y + 1,
							z, typeVariant90Turn, type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(world, x, y + 1, z - 1, l, x + 10, y + 1, z, 9.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x + 10, y + 1, z, 9.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x + 10, y + 1, z, 9.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(world, x, y + 1, z - 4, l, x + 10, y + 1, z, 9.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, false, false);
					}
				}

				if(l == 0) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(player, world, x, y + 1, z + i)) return false;
					}

					if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, true, 1, x - 10, z + 10, 9.5, x - 9, y + 1,
							z + 1, typeVariant90Turn, type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 0);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(world, x, y + 1, z + 1, l, x - 9, y + 1, z + 1, 9.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x - 9, y + 1, z + 1, 9.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x - 9, y + 1, z + 1, 9.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(world, x, y + 1, z + 4, l, x - 9, y + 1, z + 1, 9.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);


					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, false, false);
					}
				}

				if(l == 1)
				{
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(player, world, x - i, y + 1, z)) return false;
					}

					if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, true, 2, x - 10, z - 10, 9.5, x , y + 1,
							z - 9, typeVariant90Turn, type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x  - 2, y + 1, z - 1, l, 1);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(world, x - 1, y + 1, z , l, x , y + 1, z - 9, 9.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z , l, x, y + 1, z - 9, 9.5, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x - 3, y + 1, z , l, x , y + 1, z - 9, 9.5, typeVariantStraightLabel, false, x - 2 , y + 1, z - 1, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(world, x - 4, y + 1, z , l, x , y + 1, z - 9, 9.5, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, true, false);


					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, false, false);
					}
				}

				if(l == 3)
				{
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(player, world, x + i, y + 1, z)) return false;
					}

					if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, true, 0, x + 10, z + 10, 9.5, x + 1, y + 1,
							z + 10, typeVariant90Turn, type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x  + 2, y + 1, z + 1, l, 3);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(world, x + 1, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z , l, x + 1 , y + 1, z + 10, 9.5, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x + 3, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, typeVariantStraightLabel, false, x + 2 , y + 1, z + 1, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(world, x + 4, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, false, false);
					}
				}
			}
			return true;

			case CORE_11x11_SWITCH_L:
			{
				if (tempType == EnumTracks.VERY_LARGE_LEFT_SWITCH) {
					typeVariant90Turn = EnumTracks.VERY_LARGE_LEFT_TURN.getLabel();
				}
				else {
					typeVariant90Turn = EnumTracks.EMBEDDED_VERY_LARGE_LEFT_TURN.getLabel();
				}

				int[] xArray = { 1,1,1,1,1,2,2,2,3,3,4,4,5,5,5,6,6,7,7,8,9};
				int[] zArray = { 2,3,4,5,6,6,6,7,7,8,8,9,8,9,10,9,10,9,10, 10,10};


				if(l == 2) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(player, world, x, y + 1, z - i)) return false;
					}

					if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, true, 1, x - 10, z - 10, 9.5, x - 9, y + 1,
							z, typeVariant90Turn, type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(world, x, y + 1, z - 1, l, x - 9, y + 1, z, 9.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x - 9, y + 1, z, 9.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x - 9, y + 1, z, 9.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(world, x, y + 1, z - 4, l, x - 9, y + 1, z, 9.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, false, false);
					}
				}

				if(l == 0) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(player, world, x, y + 1, z + i)) return false;
					}

					if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, true, 1, x + 10, z + 10, 9.5, x + 10, y + 1,
							z + 1, typeVariant90Turn, type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 0);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(world, x, y + 1, z + 1, l, x + 10, y + 1, z + 1, 9.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x + 10, y + 1, z + 1, 9.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x + 10, y + 1, z + 1, 9.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(world, x, y + 1, z + 4, l, x + 10, y + 1, z + 1, 9.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);


					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, false, false);

					}

				}

				if(l == 1) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(player, world, x - i, y + 1, z)) return false;
					}

					if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, true, 0, x - 10, z + 10, 9.5, x , y + 1,
							z + 10, typeVariant90Turn, type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x  - 2, y + 1, z + 1, l, 1);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(world, x - 1, y + 1, z , l, x , y + 1, z + 10, 9.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z , l, x, y + 1, z + 10, 9.5, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x - 3, y + 1, z , l, x , y + 1, z + 10 , 9.5, typeVariantStraightLabel, false, x - 2 , y + 1, z + 1, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(world, x - 4, y + 1, z , l, x , y + 1, z + 10, 9.5, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, false, false);

					}

				}

				if(l == 3) {
					for (int i = 1; i < 7; i++) {

						if (!canPlaceTrack(player, world, x + i, y + 1, z)) return false;
					}

					if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, true, 2, x + 10, z - 10, 9.5, x + 1, y + 1,
							z - 9, typeVariant90Turn, type.getItem().item))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x  + 2, y + 1, z - 1, l, 3);//to force client update

					/** Switch rail 1 **/
					putDownSingleRail(world, x + 1, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z , l, x + 1 , y + 1, z - 9, 9.5, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x + 3, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, typeVariantStraightLabel, false, x + 2 , y + 1, z - 1, true, false);

					/** Switch rail 4 **/
					putDownSingleRail(world, x + 4, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, true, false);
					for (int straight = 5 ; straight < 7 ; straight++){
						putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, false, false);

					}

				}


				return true;
			}

			case CORE_3x5_45DEGREE_SWITCH_R:
				typeVariant90Turn = tempType.getLabel().contains("EMBEDDED") ? EnumTracks.EMBEDDED_MEDIUM_RIGHT_TURN.getLabel() : EnumTracks.MEDIUM_RIGHT_TURN.getLabel();
				if (!mediumRight45DegreeSwitch(player, world, x, y, z, l, tempType, typeVariantStraightLabel, typeVariant90Turn)) {
					return false;
				}


				return true;
			case CORE_3x5_45DEGREE_SWITCH_L:
				typeVariant90Turn = tempType.getLabel().contains("EMBEDDED") ? EnumTracks.EMBEDDED_LARGE_LEFT_TURN.getLabel() : EnumTracks.LARGE_LEFT_TURN.getLabel();
				if (!mediumLeft45DegreeSwitch(player, world, x, y, z, l, tempType, typeVariantStraightLabel, typeVariant90Turn)){
					return false;
				}


				return true;
			case CORE_4x8_45DEGREE_SWITCH_R:
				typeVariant90Turn = tempType.getLabel().contains("EMBEDDED") ? EnumTracks.EMBEDDED_LARGE_RIGHT_TURN.getLabel() : EnumTracks.LARGE_RIGHT_TURN.getLabel();
				if (!largeRight45DegreeSwitch(player, world, x, y, z, l, tempType, typeVariantStraightLabel, typeVariant90Turn)){
					return false;
				}


				return true;
			case CORE_4x8_45DEGREE_SWITCH_L:
				typeVariant90Turn = tempType.getLabel().contains("EMBEDDED") ? EnumTracks.EMBEDDED_LARGE_LEFT_TURN.getLabel() : EnumTracks.LARGE_LEFT_TURN.getLabel();
				if (!largeLeft45DegreeSwitch(player, world, x, y, z, l, tempType, typeVariantStraightLabel, typeVariant90Turn)){
					return false;
				}


				return true;
			case CORE_TWO_WAYS_CROSSING:
			{
				if (!canPlaceTrack(player, world, x, y + 1, z))
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

				if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace)
						|| !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2)))
				{
					return false;
				}
				if (!canPlaceTrack(player, world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
						z + (zDisplace) + (zSideDisplace)))
				{
					return false;
				}
				if (!canPlaceTrack(player, world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
						z + (zDisplace) - (zSideDisplace)))
				{
					return false;
				}

				switch (type) {
					case TWO_WAYS_CROSSING:
						typeVariantStraightLabel = EnumTracks.SMALL_STRAIGHT.getLabel();
						break;

					case EMBEDDED_TWO_WAYS_CROSSING:
						typeVariantStraightLabel = EnumTracks.EMBEDDED_SMALL_STRAIGHT.getLabel();
						break;

				}

				/*
				 * Bottom
				 */

				putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
						z + (zDisplace * 2), 0, typeVariantStraightLabel, true, x + (xDisplace), y + 1,
						z + (zDisplace), false, false);

				// putDownSingleRail(world, x+(xDisplace*4), y + 1, z+(zDisplace*4), l,
				// x+(xDisplace*4) , y + 1, z+(zDisplace*4), 0,
				// EnumTracks.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*3), y + 1,
				// z+(zDisplace*3), false, false);


				placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
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

				// putDownSingleRail(world, x + (xDisplace), y + 1, z + (zDisplace), l, x +
				// (xDisplace), y + 1,
				// z + (zDisplace), 0, EnumTracks.SMALL_STRAIGHT.getLabel(), true, x +
				// (xDisplace * 2), y + 1,
				// z + (zDisplace * 2), false, false);

				putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true,
						x + (xDisplace), y + 1, z + (zDisplace), false, false);

				/*
				 * Right
				 */

				putDownSingleRail(world, x + (xDisplace) + (xSideDisplace), y + 1,
						z + (zDisplace) + (zSideDisplace), sideFacing,
						x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace) + (zSideDisplace), 0,
						typeVariantStraightLabel, true, x + (xDisplace), y + 1, z + (zDisplace),
						false, false);

				// putDownSingleRail(world, x + (xDisplace * 2) + (xSideDisplace * 2), y + 1,
				// z + (zDisplace * 2) + (zSideDisplace * 2), sideFacing,
				// x + (xDisplace * 2) + (xSideDisplace * 2), y + 1, z + (zDisplace * 2) +
				// (zSideDisplace * 2), 0,
				// EnumTracks.SMALL_STRAIGHT.getLabel(), true, x + (xDisplace * 2) + (xSideDisplace
				//), y + 1,
				// z + (zDisplace * 2) + (zSideDisplace), false, false);

				/*
				 * Left
				 */

				putDownSingleRail(world, x + (xDisplace) - (xSideDisplace), y + 1,
						z + (zDisplace) - (zSideDisplace), sideFacing,
						x + (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace) - (zSideDisplace), 0,
						typeVariantStraightLabel, true, x + (xDisplace), y + 1, z + (zDisplace),
						false, false);

				//				putDownSingleRail(world, x+(xDisplace*2)-(xSideDisplace*2), y + 1, z+(zDisplace*2)-(zSideDisplace*2), sideFacing, x+(xDisplace*2)-(xSideDisplace*2) , y + 1, z+(zDisplace*2)-(zSideDisplace*2), 0, typeVariantStraightLabel, true, x+(xDisplace*2)-(xSideDisplace*1), y + 1, z+(zDisplace*2)-(zSideDisplace*1), false, false);


				return true;
			}

			case CORE_DIAMOND_CROSSING_R:
				if (!rightDiamondCrossing(player, world, x, y, z, l, tempType))
				{
					return false;
				}
				else
				{

					return true;
				}
			case CORE_DIAMOND_CROSSING_L:
				if (!leftDiamondCrossing(player, world, x, y, z, l, tempType))
				{
					return false;
				}
				else
				{

					return true;
				}
			case CORE_DOUBLE_DIAMOND_CROSSING:
				if (!doubleDiamondCrossing(player, world, x, y, z, l, type))
				{
					return false;
				}
				else
				{

					return true;
				}
			case CORE_DIAGONAL_TWO_WAYS_CROSSING:
				if (!diagonalTwoWaysCrossing(player, world, x, y, z, MathHelper.floor_double((player != null ? player.rotationYaw : par10) * 4.0F / 360.0F + 0.5D) & 3, tempType)){
					return false;
				}
				else
				{

					return true;
				}
			case CORE_FOUR_WAYS_CROSSING:
				if (!fourWaysCrossing(player, world, x, y, z, l, type)){
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
				if (!canPlaceTrack(player, world, x, y + 1, z)) {
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
					if (!canPlaceTrack(player, world, x, y + 1, z - 1) || !canPlaceTrack(player, world, x, y + 1, z - 2)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 4)
								|| !canPlaceTrack(player, world, x, y + 1, z - 5)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 4)
								|| !canPlaceTrack(player, world, x, y + 1, z - 5) || !canPlaceTrack(player, world, x, y+1, z - 6) || !canPlaceTrack(player, world, x, y+1, z - 7) || !canPlaceTrack(player, world, x, y+1, z - 8)  ||
								!canPlaceTrack(player, world, x, y+1, z - 9) || !canPlaceTrack(player, world,x, y+1, z - 10) || !canPlaceTrack(player, world, x, y+1, z - 11)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(world,x, y + 1, z - 1, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 1);

					placeTrack(world,x, y + 1, z - 2, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 2);

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight || isAnyTypeOfVeryLongStraight) {
						placeTrack(world,x, y + 1, z - 3, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z - 3);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z - 1;

						placeTrack(world,x, y + 1, z - 4, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 4);

						placeTrack(world,x, y + 1, z - 5, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 5);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(world,x, y+1, z - 6, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x, y + 1, z - 6);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z - 1;

						placeTrack(world,x, y + 1, z - 7, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 7);

						placeTrack(world,x, y + 1, z - 8, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 8);

						placeTrack(world,x, y+1, z - 9, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x, y + 1, z - 9);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z - 1;

						placeTrack(world,x, y + 1, z - 10, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 10);

						placeTrack(world,x, y + 1, z - 11, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 11);


					}

				}
				if (l == 0) {
					if (!canPlaceTrack(player, world, x, y + 1, z + 1) || !canPlaceTrack(player, world, x, y + 1, z + 2)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 4)
								|| !canPlaceTrack(player, world, x, y + 1, z + 5)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 4)
								|| !canPlaceTrack(player, world, x, y + 1, z + 5) || !canPlaceTrack(player, world, x, y+1, z + 6) || !canPlaceTrack(player, world, x, y+1, z + 7)  ||
								!canPlaceTrack(player, world, x, y+1, z + 8) || !canPlaceTrack(player, world, x, y+1, z + 9) || !canPlaceTrack(player, world, x, y+1, z + 10) || !canPlaceTrack(player, world, x, y+1, z + 11)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(world,x, y + 1, z + 1, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 1);

					placeTrack(world,x, y + 1, z + 2, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 2);

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(world,x, y + 1, z + 3, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z + 3);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z + 1;

						placeTrack(world,x, y + 1, z + 4, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 4);

						placeTrack(world,x, y + 1, z + 5, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 5);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(world,x, y+1, z + 6, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x, y + 1, z + 6);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z + 1;

						placeTrack(world,x, y + 1, z + 7, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 7);

						placeTrack(world,x, y + 1, z + 8, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 8);

						placeTrack(world,x, y+1, z + 9, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x, y + 1, z + 9);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z + 1;

						placeTrack(world,x, y + 1, z + 10, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 10);

						placeTrack(world,x, y + 1, z + 11, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 11);


					}

				}
				if (l == 1) {
					if (!canPlaceTrack(player, world, x - 1, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z)
								|| !canPlaceTrack(player, world, x - 5, y + 1, z)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if ( !canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z)
								|| !canPlaceTrack(player, world, x - 5, y + 1, z) || !canPlaceTrack(player, world, x - 6, y+1, z ) || !canPlaceTrack(player, world, x - 7, y+1, z )  ||
								!canPlaceTrack(player, world, x - 8, y+1, z) || !canPlaceTrack(player, world, x - 9, y+1, z) || !canPlaceTrack(player, world, x - 10, y+1, z ) || !canPlaceTrack(player, world, x - 11, y+1, z)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(world,x - 1, y + 1, z , BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x - 1, y + 1, z);

					placeTrack(world,x - 2, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x - 2, y + 1, z );

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(world,x - 3, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x - 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x - 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z ;

						placeTrack(world,x - 4, y + 1, z , BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x - 4, y + 1, z);

						placeTrack(world,x - 5, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x - 5, y + 1, z);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(world,x - 6, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x - 6, y + 1, z);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x - 1;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z ;

						placeTrack(world,x - 7, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x - 7, y + 1, z);

						placeTrack(world,x - 8, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x - 8, y + 1, z);

						placeTrack(world,x - 9, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x - 9, y + 1, z);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x - 1;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z;

						placeTrack(world,x - 10, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x - 10, y + 1, z);

						placeTrack(world,x - 11, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x - 11, y + 1, z);


					}

				}
				if (l == 3) {
					if (!canPlaceTrack(player, world, x + 1, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z)
								|| !canPlaceTrack(player, world, x + 5, y + 1, z)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if ( !canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z)
								|| !canPlaceTrack(player, world, x + 5, y + 1, z) || !canPlaceTrack(player, world, x + 6, y+1, z ) || !canPlaceTrack(player, world, x + 7, y+1, z )  ||
								!canPlaceTrack(player, world, x + 8, y+1, z) || !canPlaceTrack(player, world, x + 9, y+1, z) || !canPlaceTrack(player, world, x + 10, y+1, z ) || !canPlaceTrack(player, world, x + 11, y+1, z)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(world,x + 1, y + 1, z , BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x + 1, y + 1, z);

					placeTrack(world,x + 2, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x + 2, y + 1, z );

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(world,x + 3, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x + 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z ;

						placeTrack(world,x + 4, y + 1, z , BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x + 4, y + 1, z);

						placeTrack(world,x + 5, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x + 5, y + 1, z);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(world,x + 6, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x + 6, y + 1, z);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x + 1;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z ;

						placeTrack(world,x + 7, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x + 7, y + 1, z);

						placeTrack(world,x + 8, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x + 8, y + 1, z);

						placeTrack(world,x + 9, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x + 9, y + 1, z);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x + 1;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z;

						placeTrack(world,x + 10, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x + 10, y + 1, z);

						placeTrack(world,x + 11, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x + 11, y + 1, z);


					}

				}


				for (int i = 0; i < tileGag.length; i++) {
					if (player !=null && tileGag[i] == null) {
						player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
						return false;
					}
					tileGag[i].originX = x;
					tileGag[i].originY = y + 1;
					tileGag[i].originZ = z;
					tileGag[i].type = EnumTracks.MEDIUM_STRAIGHT.getLabel();
				}

				return true;
			}
			case CORE_SMALL_STRAIGHT:
				if (smallStraight(player,world,x,y,z,l,type) == false)
				{
					return false;
				}

				return true;
			default:
			{
				if (TCRailTypes.RailTypes.SLOPE.equals(type.getRailType()))
				{
					if (!canPlaceTrack(player, world, x, y + 1, z)) {
						return false;
					}

					if (type.getLabel().contains("DYNAMIC") && world.getBlock(x, y, z) == BlockIDs.bridgePillar.block)
					{
						return false;
					}

					int gagEnd = 0;
					double slopeAngle = 0;
					/**
					 * Explanation: normally you would divide 100 by (gagEnd+1) but this seems to be
					 * against TCs own brain. you need to divide 100 by (gagEnd+1)
					 **/
					if (EnumCoreTrack.CORE_3_SLOPE.equals(tempType.getCoreTrack()))
					{
						gagEnd = 2;
						slopeAngle = 0.26;
					}
					else if (EnumCoreTrack.CORE_3_DIAGONAL_SLOPE.equals(tempType.getCoreTrack())) {
						gagEnd = 2;
						slopeAngle = 0.23; //5 decimals of precision for track length, 2 dec for angle
						return handleDiagonalSlopes(world, player, getFacing(player, par10), tempType, gagEnd, slopeAngle, x, y, z, itemstack); //break out bc we use a different placement method for diagonals
					}
					else if (EnumCoreTrack.CORE_6_DIAGONAL_SLOPE.equals(tempType.getCoreTrack())) {
						gagEnd = 5;
						slopeAngle = 0.12; //5 decimals of precision for track length, 2 dec for angle
						return handleDiagonalSlopes(world, player, getFacing(player, par10), tempType, gagEnd, slopeAngle, x, y, z, itemstack); //break out bc we use a different placement method for diagonals
					}
					else if (EnumCoreTrack.CORE_12_DIAGONAL_SLOPE.equals(tempType.getCoreTrack())) {
						gagEnd = 11;
						slopeAngle = 0.06; //5 decimals of precision for track length, 2 dec for angle
						return handleDiagonalSlopes(world, player, getFacing(player, par10), tempType, gagEnd, slopeAngle, x, y, z, itemstack); //break out bc we use a different placement method for diagonals
					}
					else if (EnumCoreTrack.CORE_18_DIAGONAL_SLOPE.equals(tempType.getCoreTrack())) {
						gagEnd = 17;
						slopeAngle = 0.04; //5 decimals of precision for track length, 2 dec for angle
						return handleDiagonalSlopes(world, player, getFacing(player, par10), tempType, gagEnd, slopeAngle, x, y, z, itemstack); //break out bc we use a different placement method for diagonals
					}
					else if (EnumCoreTrack.CORE_6_SLOPE.equals(tempType.getCoreTrack())) {
						gagEnd = 5;
						slopeAngle = 0.13;
					}
					else if (EnumCoreTrack.CORE_12_SLOPE.equals(tempType.getCoreTrack()))
					{
						gagEnd = 11;
						slopeAngle = 0.0666;
					}
					else if (EnumCoreTrack.CORE_18_SLOPE.equals(tempType.getCoreTrack()))
					{
						gagEnd = 17;
						slopeAngle = 0.0444;
					}

					Item idDropped = this.type.getItem().item;
					TileTCRailGag[] tileGag = new TileTCRailGag[gagEnd];

					for (int i = 1; i <= gagEnd; i++) {
						if (l == 2) {
							if (!canPlaceTrack(player, world, x, y + 1, z - i)) {
								return false;
							}
						}
						if (l == 0) {
							if (!canPlaceTrack(player, world, x, y + 1, z + i)) {
								return false;
							}
						}
						if (l == 1) {
							if (!canPlaceTrack(player, world, x - i, y + 1, z)) {
								return false;
							}
						}
						if (l == 3) {
							if (!canPlaceTrack(player, world, x + i, y + 1, z)) {
								return false;
							}
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());
					tcRail.idDrop = idDropped;
					tcRail.slopeHeight = 1;
					tcRail.slopeAngle = slopeAngle;
					tcRail.slopeLength = gagEnd + 1;

					Block block = world.getBlock(x, y, z);
					int blockID = Block.getIdFromBlock(block);
					tcRail.setBallastMaterial(blockID);
					tcRail.ballastMetadata = world.getBlockMetadata(x, y, z);

					for (int i2 = 1; i2 <= gagEnd; i2++)
					{
						switch (l)
						{
							case 2:
								placeTrack(world,x, y + 1, z - i2, BlockIDs.tcRailGag.block, l);
								tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - i2);
								tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd ));
								break;
							case 0:
								placeTrack(world,x, y + 1, z + i2, BlockIDs.tcRailGag.block, l);
								tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + i2);
								tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
								break;
							case 1:
								placeTrack(world,x - i2, y + 1, z, BlockIDs.tcRailGag.block, l);
								tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x - i2, y + 1, z);
								tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
								break;
							case 3:
								placeTrack(world,x + i2, y + 1, z, BlockIDs.tcRailGag.block, l);
								tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x + i2, y + 1, z);
								tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
								break;
						}
					}
					for (int i = 0; i < tileGag.length; i++) {
						if (player != null && tileGag[i] == null) {
							player.addChatMessage(new ChatComponentText(
									"There was a problem when placing the track. Possibly too many tracks around"));
							return false;
						}
						tileGag[i].originX = x;
						tileGag[i].originY = y + 1;
						tileGag[i].originZ = z;
						tileGag[i].type = type.getLabel();
					}

					return true;
				}
			}
		}

		return true;

	}

	private boolean handleDiagonalSlopes(World world, EntityPlayer player, int facing, EnumTracks type, int gagEnd, double slopeAngle, int x, int y, int z, ItemStack itemstack) {
		Item idDropped = this.type.getItem().item;
		int[][] usedSpace = type.getUsedSpaceFromType(player);
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
            if (!canPlaceTrack(player, world, x + offsetX, y + 1, z + offsetZ)) {
                return false;
            }
        }
		//place host track
		placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, facing);
		//update data of host
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail.setFacing(facing);
		tcRail.setType(type.getLabel());
		tcRail.idDrop = idDropped;
		tcRail.slopeHeight = 1;
		tcRail.slopeAngle = slopeAngle;
		tcRail.slopeLength = gagEnd + 1;

		if ((this.type.getBallastType()) == BallastTypes.DYNAMIC)
		{
			Block block = world.getBlock(x, y, z);
			int blockID = Block.getIdFromBlock(block);
			tcRail.setBallastMaterial(blockID);
			tcRail.ballastMetadata = world.getBlockMetadata(x, y, z);
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
			placeTrack(world, x + offsetX, y + 1, z + offsetZ, BlockIDs.tcRailGag.block, facing);
			TileTCRailGag gag = ((TileTCRailGag)world.getTileEntity(x + offsetX, y + 1, z + offsetZ));
			if (player != null && gag == null) {
				player.addChatMessage(new ChatComponentText(
						"There was a problem when placing the track. Possibly too many tracks around"));
				return false;
			}
			gag.bbHeight = Math.max(0.125f, Math.min(1f, (float)Math.hypot(offsetX, offsetZ) / (gagEnd + 1)));
			//old way: tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));. seems unnecessary
			gag.originX = x;
			gag.originY = y+1;
			gag.originZ = z;
			gag.type = type.getLabel();
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

	private EnumTracks getPlacementDirection(EntityPlayer player, World world, int l, float par10)
	{
		tempType = type;

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
						tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("TWO_WAYS", "DIAGONAL_TWO_WAYS"));
						break;
				}

				return tempType;
			}
		}
		else if (TCRailTypes.RailTypes.SLOPE.equals(type.getRailType())) {
			if (facing == 4 || facing == 5 || facing == 6 || facing == 7)
			{
				String nameConverted = type.getLabel() + "_DIAGONAL";
				// Have to add this to convert older track that use older names.

				switch (type.getCoreTrack())
				{
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

				EnumTracks track = EnumTracks.GetTrackByLabel(nameConverted);
				if (track != null)
				{
					tempType = track;
					return tempType;
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
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("TURN_1X1", orientation.toUpperCase() + "_TURN_1X1"));
			}
		}

		if (EnumCoreTrack.CORE_3X_TURN.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("MEDIUM_",  "MEDIUM_" + orientation.toUpperCase() + "_"));
			}
		}

		if (EnumCoreTrack.CORE_5X_TURN.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_10X_TURN.equals(type.getCoreTrack())
				|| EnumCoreTrack.CORE_16X_TURN.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("LARGE_",  "LARGE_" + orientation.toUpperCase() + "_"));
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
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("TURN_", orientation.toUpperCase() + "_" + "TURN_"));
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
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("45DEGREE", orientation.toUpperCase() + "_" + "45DEGREE"));
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
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("PARALLEL", orientation.toUpperCase() + "_" + "PARALLEL"));
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
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("SWITCH", orientation.toUpperCase() + "_" + "SWITCH"));
			}
		}

		if (EnumCoreTrack.CORE_4x8_45DEGREE_SWITCH.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("45DEGREE_SWITCH", orientation.toUpperCase() + "_" + "45DEGREE_SWITCH"));
			}
		}

		if (EnumCoreTrack.CORE_S_CURVE_20x2.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("CURVE", "CURVE" + "_" + orientation.toUpperCase()));
			}
		}

		if (EnumCoreTrack.CORE_10x2_CROSSOVER_SWITCH.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace(EnumTracks.CROSSOVER_SWITCH_10X2.getLabel(),  EnumTracks.CROSSOVER_SWITCH_10X2.getLabel() + "_" + orientation.toUpperCase()));
			}

		}
		if (EnumCoreTrack.CORE_DIAMOND_CROSSING.equals(type.getCoreTrack()))
		{
			String orientation = getTrackOrientation(l, yaw);
			if (orientation != "")
			{
				tempType = EnumTracks.GetTrackByLabel(type.getLabel().replace("DIAMOND", orientation.toUpperCase() + "_" + "DIAMOND"));
			}
		}

		return tempType;
	}

	private boolean smallStraight(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks type)
	{
		if (!canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}

		if (type.getLabel().contains("DYNAMIC") && world.getBlock(x, y, z) == BlockIDs.bridgePillar.block)
		{
			return false;
		}


		placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail.setFacing(l);
		tcRail.cx = x;
		tcRail.cy = y + 1;
		tcRail.cz = z;
		tcRail.setType(type.getLabel());
		tcRail.idDrop = this.type.getItem().item;

		if (type.getLabel().contains("DYNAMIC"))
		{
			Block block = world.getBlock(x, y, z);
			int blockID = Block.getIdFromBlock(block);
			tcRail.setBallastMaterial(blockID);
			tcRail.ballastMetadata = world.getBlockMetadata(x, y, z);
		}


		return true;
	}

	public boolean SCurve(EntityPlayer player, World world, int x, int y, int z, int dir, EnumTracks tempType, float pyaw, int[] xArray, int[]zArray, int[] xArray2, int[] zArray2, float radius, int length, int width){
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
			if (!canPlaceTrack(player, world, usedXArray[check], y + 1, usedZArray[check])
					|| !canPlaceTrack(player, world, usedXArray2[check], y + 1, usedZArray2[check])){
				return false;
			}
		}


		if (!putDownTurn(player, world, false, x, y, z, usedXArray, usedZArray, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx,
				y + 1, z - cz, tempType.getLabel(), tempType.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);


		if (tcRailTurn != null) {
			tcRailTurn.hasModel = true;
			if (!putDownTurn(player, world, false, x, y, z, usedXArray2, usedZArray2, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx2,
					y + 1, z - cz2, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), (Item) null))
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

	private boolean parallelRightSwitchEast(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x + check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(player, world, x + 3, y + 1, z + 1) || !canPlaceTrack(player, world, x + 4, y + 1, z + 1) || !canPlaceTrack(player, world, x + 5, y + 1, z + 1) || !canPlaceTrack(player, world, x + 4, y + 1, z + 2) || !canPlaceTrack(player, world, x + 5, y + 1, z + 2) || !canPlaceTrack(player, world, x + 6, y + 1, z + 2) || !canPlaceTrack(player, world, x + 7, y + 1, z + 2) || !canPlaceTrack(player, world, x + 8, y + 1, z + 2) || !canPlaceTrack(player, world, x + 6, y + 1, z + 3) || !canPlaceTrack(player, world, x + 7, y + 1, z + 3) || !canPlaceTrack(player, world, x + 8, y + 1, z + 3) || !canPlaceTrack(player, world, x + 9, y + 1, z + 3) || !canPlaceTrack(player, world, x + 10, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 3, x + 2, x + 4, x + 5 };
		int[] zArray = { z + 1, z + 1, z + 1, z + 1 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z + 9,
				EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), tempType.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x + 3, y + 1, z + 1, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraightLabel, false, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraightLabel, false, x + 3, y + 1, z + 1, true, false);

			int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
			int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 0, true, 3, x + 10, z + 3, 8.5, x + 10, y + 1, z - 5,
					EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
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
		putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 3, y + 1, z + 1, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchWest(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x - check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(player, world, x - 3, y + 1, z - 1) || !canPlaceTrack(player, world, x - 4, y + 1, z - 1) || !canPlaceTrack(player, world, x - 5, y + 1, z - 1) || !canPlaceTrack(player, world, x - 4, y + 1, z - 2) || !canPlaceTrack(player, world, x - 5, y + 1, z - 2) || !canPlaceTrack(player, world, x - 6, y + 1, z - 2) || !canPlaceTrack(player, world, x - 7, y + 1, z - 2) || !canPlaceTrack(player, world, x - 8, y + 1, z - 2) || !canPlaceTrack(player, world, x - 6, y + 1, z - 3) || !canPlaceTrack(player, world, x - 7, y + 1, z - 3) || !canPlaceTrack(player, world, x - 8, y + 1, z - 3) || !canPlaceTrack(player, world, x - 9, y + 1, z - 3) || !canPlaceTrack(player, world, x - 10, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 3, x - 2, x - 4, x - 5 };
		int[] zArray = { z - 1, z - 1, z - 1, z - 1 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z - 8,
				EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x - 3, y + 1, z - 1, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraightLabel, false, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraightLabel, false, x - 3, y + 1, z - 1, true, false);

			int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
			int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 2, true, 1, x - 10, z - 3, 8.5, x - 9, y + 1, z + 6,
					EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
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
		putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 3, y + 1, z - 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchSouth(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x, y + 1, z + check))
				return false;
		}
		if (!canPlaceTrack(player, world, x - 1, y + 1, z + 3) || !canPlaceTrack(player, world, x - 1, y + 1, z + 4) || !canPlaceTrack(player, world, x - 1, y + 1, z + 5) || !canPlaceTrack(player, world, x - 2, y + 1, z + 4) || !canPlaceTrack(player, world, x - 2, y + 1, z + 5) || !canPlaceTrack(player, world, x - 2, y + 1, z + 6) || !canPlaceTrack(player, world, x - 2, y + 1, z + 7) || !canPlaceTrack(player, world, x - 2, y + 1, z + 8) || !canPlaceTrack(player, world, x - 3, y + 1, z + 6) || !canPlaceTrack(player, world, x - 3, y + 1, z + 7) || !canPlaceTrack(player, world, x - 3, y + 1, z + 8) || !canPlaceTrack(player, world, x - 3, y + 1, z + 9) || !canPlaceTrack(player, world, x - 3, y + 1, z + 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 1, x - 1, x - 1, x - 1 };
		int[] zArray = { z + 3, z + 2, z + 4, z + 5 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x - 8, y + 1, z + 0.5,
				EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z + 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z + 3, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z + 3, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 3, true, false);

			int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
			int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 1, true, 0, x - 3, z + 10, 8.5, x + 6, y + 1, z + 10,
					EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
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
		putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z + 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z + 3, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchNorth(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType)
	{
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x, y + 1, z - check))
				return false;
		}
		if (!canPlaceTrack(player, world, x + 1, y + 1, z - 3) || !canPlaceTrack(player, world, x + 1, y + 1, z - 4) || !canPlaceTrack(player, world, x + 1, y + 1, z - 5) || !canPlaceTrack(player, world, x + 2, y + 1, z - 4) || !canPlaceTrack(player, world, x + 2, y + 1, z - 5) || !canPlaceTrack(player, world, x + 2, y + 1, z - 6) || !canPlaceTrack(player, world, x + 2, y + 1, z - 7) || !canPlaceTrack(player, world, x + 2, y + 1, z - 8) || !canPlaceTrack(player, world, x + 3, y + 1, z - 6) || !canPlaceTrack(player, world, x + 3, y + 1, z - 7) || !canPlaceTrack(player, world, x + 3, y + 1, z - 8) || !canPlaceTrack(player, world, x + 3, y + 1, z - 9) || !canPlaceTrack(player, world, x + 3, y + 1, z - 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 1, x + 1, x + 1, x + 1 };
		int[] zArray = { z - 3, z - 2, z - 4, z - 5 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x + 9, y + 1, z + 0.5,
				EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z - 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z - 3, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z - 3, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 3, true, false);

			int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
			int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 3, true, 2, x + 3, z - 10, 8.5, x - 5, y + 1, z - 9,
					EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
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
		putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z - 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z - 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchNorth(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x, y + 1, z - check))
				return false;
		}
		if (!canPlaceTrack(player, world, x - 1, y + 1, z - 3) || !canPlaceTrack(player, world, x - 1, y + 1, z - 4) || !canPlaceTrack(player, world, x - 1, y + 1, z - 5) || !canPlaceTrack(player, world, x - 2, y + 1, z - 4) || !canPlaceTrack(player, world, x - 2, y + 1, z - 5) || !canPlaceTrack(player, world, x - 2, y + 1, z - 6) || !canPlaceTrack(player, world, x - 2, y + 1, z - 7) || !canPlaceTrack(player, world, x - 2, y + 1, z - 8) || !canPlaceTrack(player, world, x - 3, y + 1, z - 6) || !canPlaceTrack(player, world, x - 3, y + 1, z - 7) || !canPlaceTrack(player, world, x - 3, y + 1, z - 8) || !canPlaceTrack(player, world, x - 3, y + 1, z - 9) || !canPlaceTrack(player, world, x - 3, y + 1, z - 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 1, x - 1, x - 1, x - 1 };
		int[] zArray = { z - 3, z - 2, z - 4, z - 5 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x - 8, y + 1, z + 0.5,
				EnumTracks.MEDIUM_LEFT_TURN.getLabel(), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z - 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z - 3, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z - 3, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 3, true, false);

			int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
			int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 1, true, 2, x - 3, z - 10, 8.5, x + 6, y + 1, z - 9,
					EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
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
		putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z - 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z - 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchSouth(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x, y + 1, z + check))
				return false;
		}
		if (!canPlaceTrack(player, world, x + 1, y + 1, z + 3) || !canPlaceTrack(player, world, x + 1, y + 1, z + 4) || !canPlaceTrack(player, world, x + 1, y + 1, z + 5) || !canPlaceTrack(player, world, x + 2, y + 1, z + 4) || !canPlaceTrack(player, world, x + 2, y + 1, z + 5) || !canPlaceTrack(player, world, x + 2, y + 1, z + 6) || !canPlaceTrack(player, world, x + 2, y + 1, z + 7) || !canPlaceTrack(player, world, x + 2, y + 1, z + 8) || !canPlaceTrack(player, world, x + 3, y + 1, z + 6) || !canPlaceTrack(player, world, x + 3, y + 1, z + 7) || !canPlaceTrack(player, world, x + 3, y + 1, z + 8) || !canPlaceTrack(player, world, x + 3, y + 1, z + 9) || !canPlaceTrack(player, world, x + 3, y + 1, z + 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 1, x + 1, x + 1, x + 1 };
		int[] zArray = { z + 3, z + 2, z + 4, z + 5 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x + 9, y + 1, z + 0.5,
				EnumTracks.MEDIUM_LEFT_TURN.getLabel(), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z + 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z + 3, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z + 3, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 3, true, false);

			int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
			int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 3, true, 0, x + 3, z + 10, 8.5, x - 5, y + 1, z + 10,
					EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
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
		putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z + 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z + 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchEast(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x + check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(player, world, x + 3, y + 1, z - 1) || !canPlaceTrack(player, world, x + 4, y + 1, z - 1) || !canPlaceTrack(player, world, x + 5, y + 1, z - 1) || !canPlaceTrack(player, world, x + 4, y + 1, z - 2) || !canPlaceTrack(player, world, x + 5, y + 1, z - 2) || !canPlaceTrack(player, world, x + 6, y + 1, z - 2) || !canPlaceTrack(player, world, x + 7, y + 1, z - 2) || !canPlaceTrack(player, world, x + 8, y + 1, z - 2) || !canPlaceTrack(player, world, x + 6, y + 1, z - 3) || !canPlaceTrack(player, world, x + 7, y + 1, z - 3) || !canPlaceTrack(player, world, x + 8, y + 1, z - 3) || !canPlaceTrack(player, world, x + 9, y + 1, z - 3) || !canPlaceTrack(player, world, x + 10, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 3, x + 2, x + 4, x + 5 };
		int[] zArray = { z - 1, z - 1, z - 1, z - 1 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z - 8,
				EnumTracks.MEDIUM_LEFT_TURN.getLabel(), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x + 3, y + 1, z - 1, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraightLabel, false, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraightLabel, false, x + 3, y + 1, z - 1, true, false);

			int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
			int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 2, true, 3, x + 10, z - 3, 8.5, x + 10, y + 1, z + 6,
					EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
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
		putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 3, y + 1, z - 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchWest(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x - check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(player, world, x - 3, y + 1, z + 1) || !canPlaceTrack(player, world, x - 4, y + 1, z + 1) || !canPlaceTrack(player, world, x - 5, y + 1, z + 1) || !canPlaceTrack(player, world, x - 4, y + 1, z + 2) || !canPlaceTrack(player, world, x - 5, y + 1, z + 2) || !canPlaceTrack(player, world, x - 6, y + 1, z + 2) || !canPlaceTrack(player, world, x - 7, y + 1, z + 2) || !canPlaceTrack(player, world, x - 8, y + 1, z + 2) || !canPlaceTrack(player, world, x - 6, y + 1, z + 3) || !canPlaceTrack(player, world, x - 7, y + 1, z + 3) || !canPlaceTrack(player, world, x - 8, y + 1, z + 3) || !canPlaceTrack(player, world, x - 9, y + 1, z + 3) || !canPlaceTrack(player, world, x - 10, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 3, x - 2, x - 4, x - 5 };
		int[] zArray = { z + 1, z + 1, z + 1, z + 1 };

		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z + 9,
				EnumTracks.MEDIUM_LEFT_TURN.getLabel(), type.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x - 3, y + 1, z + 1, true, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraightLabel, false, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraightLabel, false, x - 3, y + 1, z + 1, true, false);

			int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
			int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 0, true, 1, x - 10, z + 3, 8.5, x - 9, y + 1, z - 5,
					EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
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
		putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 3, y + 1, z + 1, false, false);
		}
		return true;
	}

	private boolean largeRightParallelSwitch(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType, String typeVariantStraight){

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
			if (!canPlaceTrack(player, world, x + (dx * i), y + 1, z + (dz * i))){
				return false;
			}
		}
		for (int i = 14; i < 17 ; i++){
			if (!canPlaceTrack(player, world, x + ((dx * i) + (dx2 * 3)), y + 1, z + ((dz * i) + (dz2 * 3)))){
				return false;
			}
		}


		int[] xArray = new int[] {1,1,1,1,2};
		int[] zArray = new int[] {3,4,5,6,6};
		int[] xArray2 = new int[] {1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
		int[] zArray2 = new int[] {7, 7, 8, 9, 10, 11, 9, 10, 11, 12, 13};


		if (l == 2) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(player, world, x + xArray2[gag] , y + 1, z -  zArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 2, x + 2, z - 17, 18, x + 18.48,
					y + 1, z + 0.95, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x + 1, y + 1, z - 3, l, 2);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(world, x, y + 1, z - 1, l, x + 18.48, y + 1, z + 0.95, 18, tempType.getLabel(), true, x + 1, y + 1, z - 3, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(world, x, y + 1, z - 2, l, x + 18.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(world, x, y + 1, z - 3, l, x + 18.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(world, x, y + 1, z - 4, l, x + 18.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);

				if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, true), l, false, 2, x + 2, z - 20, 18, x - 14.5,
						y + 1, z - 13.5, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
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
				putDownSingleRail(world, x, y + 1, z - i, l , x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(world, x + 3, y + 1, z - i, l , x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
			}
			return true;

		}

		if (l == 0) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(player, world, x - xArray2[gag] , y + 1, z + zArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 0, x - 2, z + 17, 18, x - 17.48,
					y + 1, z + 0.05 , EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x - 1, y + 1, z + 3, l, 0);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(world, x, y + 1, z + 1, l, x - 17.48, y + 1, z + 0.05, 18, tempType.getLabel(), true, x - 1, y + 1, z + 3, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(world, x, y + 1, z + 2, l, x - 17.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(world, x, y + 1, z + 3, l, x - 17.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(world, x, y + 1, z + 4, l, x - 17.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);

				if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, false), l, false, 0, x - 2, z + 17, 18, x + 15.48,
						y + 1, z + 14.5, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
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
				putDownSingleRail(world, x, y + 1, z + i, l , x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(world, x - 3, y + 1, z + i, l , x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
			}
			return true;

		}

		if (l == 1) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(player, world, x - zArray2[gag] , y + 1, z -  xArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 1, x - 2, z - 17, 18, x + 0.95,
					y + 1, z - 17.48 , EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x - 3, y + 1, z - 1, l, 1);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(world, x - 1, y + 1, z , l, x + 0.95, y + 1, z - 17.48, 18, tempType.getLabel(), true, x - 3, y + 1, z - 1, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(world, x - 2, y + 1, z , l, x + 0.95, y + 1, z - 17.48, 18, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(world, x - 3, y + 1, z , l, x + 0.95, y + 1, z - 17.48, 18, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(world, x - 4, y + 1, z , l, x + 0.95, y + 1, z - 17.48, 18, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);

				if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, true), l, false, 1, x - 17, z - 3, 18, x - 13.5,
						y + 1, z + 15.5, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
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
				putDownSingleRail(world, x - i, y + 1, z, l , x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(world, x - i, y + 1, z - 3, l , x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
			}
			return true;

		}

		if (l == 3) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(player, world, x + zArray2[gag] , y + 1, z +  xArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 3, x + 2, z + 17, 18, x + 0.05,
					y + 1, z + 18.48 , EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x + 3, y + 1, z + 1, l, 3);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(world, x + 1, y + 1, z , l, x + 0.05, y + 1, z + 18.48, 18, tempType.getLabel(), true, x + 3, y + 1, z + 1, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(world, x + 2, y + 1, z , l, x + 0.05, y + 1, z + 18.48, 18, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(world, x + 3, y + 1, z , l, x + 0.05, y + 1, z + 18.48, 18, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(world, x + 4, y + 1, z , l, x + 0.05, y + 1, z + 18.48, 18, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);

				if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, false), l, false, 3, x + 17, z + 3, 18, x + 14.5,
						y + 1, z - 14.5, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
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
				putDownSingleRail(world, x + i, y + 1, z, l , x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(world, x + i, y + 1, z + 3, l , x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
			}
			return true;

		}



		return false;

	}

	private boolean largeLeftParallelSwitch(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType, String typeVariantStraight){

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
			if (!canPlaceTrack(player, world, x + (dx * i), y + 1, z + (dz * i))){
				return false;
			}
		}
		for (int i = 14; i < 17 ; i++){
			if (!canPlaceTrack(player, world, x + ((dx * i) + (dx2 * 3)), y + 1, z + ((dz * i) + (dz2 * 3)))){
				return false;
			}
		}


		int[] xArray = new int[] {1,1,1,1,2};
		int[] zArray = new int[] {3,4,5,6,6};
		int[] xArray2 = new int[] {1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
		int[] zArray2 = new int[] {7, 7, 8, 9, 10, 11, 9, 10, 11, 12, 13};


		if (l == 2) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(player, world, x - xArray2[gag] , y + 1, z -  zArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 2, x - 2, z - 17, 18, x -17.48,
					y + 1, z + 0.95, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x - 1, y + 1, z - 3, l, 2);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(world, x, y + 1, z - 1, l, x - 17.48, y + 1, z + 0.95, 18, tempType.getLabel(), true, x - 1, y + 1, z - 3, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(world, x, y + 1, z - 2, l, x - 17.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(world, x, y + 1, z - 3, l, x - 17.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(world, x, y + 1, z - 4, l, x - 17.48, y + 1, z + 0.95, 18, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);

				if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, true), l, false, 2, x - 2, z - 17, 18, x + 15.5,
						y + 1, z - 13.5, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
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
				putDownSingleRail(world, x, y + 1, z - i, l , x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(world, x - 3, y + 1, z - i, l , x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
			}
			return true;

		}

		if (l == 0) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(player, world, x + xArray2[gag] , y + 1, z + zArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 0, x + 2, z + 17, 18, x + 18.48,
					y + 1, z + 0.05 , EnumTracks.MEDIUM_LEFT_TURN.getLabel(), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x + 1, y + 1, z + 3, l, 0);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(world, x, y + 1, z + 1, l, x + 18.48, y + 1, z + 0.05, 18, tempType.getLabel(), true, x + 1, y + 1, z + 3, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(world, x, y + 1, z + 2, l, x + 18.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(world, x, y + 1, z + 3, l, x + 18.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(world, x, y + 1, z + 4, l, x + 18.48, y + 1, z + 0.05, 18, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);

				if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, false), l, false, 0, x - 2, z + 17, 18, x -14.48,
						y + 1, z + 14.5, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
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
				putDownSingleRail(world, x, y + 1, z + i, l , x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(world, x + 3, y + 1, z + i, l , x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
			}
			return true;

		}

		if (l == 1) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(player, world, x - zArray2[gag] , y + 1, z +  xArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 1, x - 2, z - 17, 18, x + 0.95,
					y + 1, z + 18.48 , EnumTracks.MEDIUM_LEFT_TURN.getLabel(), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x - 3, y + 1, z + 1, l, 1);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(world, x - 1, y + 1, z , l, x + 0.95, y + 1, z + 18.48, 18, tempType.getLabel(), true, x - 3, y + 1, z + 1, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(world, x - 2, y + 1, z , l, x + 0.95, y + 1, z + 18.48, 18, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(world, x - 3, y + 1, z , l, x + 0.95, y + 1, z + 18.48, 18, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(world, x - 4, y + 1, z , l, x + 0.95, y + 1, z + 18.48, 18, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);

				if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, false), l, false, 1, x - 17, z + 3, 18, x - 13.5,
						y + 1, z - 14.5, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
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
				putDownSingleRail(world, x - i, y + 1, z, l , x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(world, x - i, y + 1, z + 3, l , x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
			}
			return true;

		}

		if (l == 3) {
			for (int gag = 0; gag < xArray2.length; gag++) {
				if (!canPlaceTrack(player, world, x + zArray2[gag] , y + 1, z -  xArray2[gag] )) {
					return false;
				}
			}
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 3, x + 2, z + 17, 18, x + 0.05,
					y + 1, z - 17.48 , EnumTracks.MEDIUM_LEFT_TURN.getLabel(), tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
				world.setBlockMetadataWithNotify(x + 3, y + 1, z - 1, l, 3);//to force client update
				/** Switch rail 1 **/
				putDownSingleRail(world, x + 1, y + 1, z , l, x + 0.05, y + 1, z - 17.48, 18, tempType.getLabel(), true, x + 3, y + 1, z - 1, true, false);
				/** Switch rail 2 **/
				putDownSingleRail(world, x + 2, y + 1, z , l, x + 0.05, y + 1, z - 17.48, 18, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
				/** Switch rail 3 **/
				putDownSingleRail(world, x + 3, y + 1, z , l, x + 0.05, y + 1, z - 17.48, 18, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
				/** Switch rail 4 **/
				putDownSingleRail(world, x + 4, y + 1, z , l, x + 0.05, y + 1, z - 17.48, 18, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);

				if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, true), l, false, 3, x + 17, z + 3, 18, x + 14.5,
						y + 1, z + 15.5, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
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
				putDownSingleRail(world, x + i, y + 1, z, l , x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
			}
			for (int i = 14; i < 17 ; i++){
				putDownSingleRail(world, x + i, y + 1, z - 3, l , x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
			}
			return true;

		}



		return false;

	}

	private boolean crossover10x2Switch(EntityPlayer player, World world, int x, int y, int z, int facing, EnumTracks tempType, String typeVariantStraight, String typeVariant90Turn, boolean sneaking, boolean isRight) {
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

		if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), facing, false, exitDir, x + xArray[xArray.length-1], z + zArray[zArray.length-1] , radius, x + centerX,
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
			if (!canPlaceTrack(player, world, x + (dx*i), y + 1, z + (dz*i))) {
				return false;
			}
		}

		putDownSingleRail(world, x, y + 1, z, facing, x + centerX, y + 1, z + centerZ, radius, tempType.getLabel(), true, x + originShiftX, y + 1, z + originShiftZ, true, false);
		for (int i = 1; i < EnumTracks.GetSwitchSize(tempType.getCoreTrack()); i++) {
			putDownSingleRail(world, x + (dx*i), y + 1, z + (dz*i), facing, x + centerX, y + 1, z + centerZ, radius, typeVariantStraight, false, x+originShiftX, y + 1, z + originShiftZ, true, false);
		}
		for (int i = EnumTracks.GetSwitchSize(tempType.getCoreTrack()); i < 10; i++) {
			putDownSingleRail(world, x + (i * dx), y + 1, z + (i * dz), facing, x + 1 , y + 1, z - 7.99, 8.49, typeVariantStraight, false, x + originShiftX, y + 1, z + originShiftZ, false, false);
		}
		return true;
	}

	private boolean rightDiamondCrossing(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType)
	{
		if (!canPlaceTrack(player, world, x, y + 1, z)) {
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

		if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + (xDisplace * 2) + xSideDisplace, y + 1, z + (zDisplace * 2) + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x - (xSideDisplace), y + 1, z - zSideDisplace)) {
			return false;
		}

		//Top

		putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
				z + (zDisplace * 2), 0, typeVariantStraightLabel, false, x + (xDisplace), y + 1,
				z + (zDisplace), false, false);

		//Main

		placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(tempType.getLabel());
		tcRail2.idDrop = this.type.getItem().item;

		//Bottom


		putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false,
				x + (xDisplace), y + 1, z + (zDisplace), false, false);

		//Right

		putDownSingleRail(world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
				z + (zDisplace * 2) + (zSideDisplace), sideFacing,
				x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace * 2) + (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		//Left

		putDownSingleRail(world, x - (xSideDisplace), y + 1,
				z - (zSideDisplace), sideFacing,
				x - (xSideDisplace), y + 1, z - (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);


		return true;
	}
	private boolean leftDiamondCrossing(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType)
	{
		if (!canPlaceTrack(player, world, x, y + 1, z)) {
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


		if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + (xDisplace * 2) - xSideDisplace, y + 1, z + (zDisplace * 2) - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + (xSideDisplace), y + 1, z + zSideDisplace)) {
			return false;
		}

		//Top

		putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
				z + (zDisplace * 2), 0, typeVariantStraightLabel, false, x + (xDisplace), y + 1,
				z + (zDisplace), false, false);

		//Main

		placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(tempType.getLabel());
		tcRail2.idDrop = this.type.getItem().item;

		//Bottom


		putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false,
				x + (xDisplace), y + 1, z + (zDisplace), false, false);

		//Left

		putDownSingleRail(world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
				z + (zDisplace * 2) - (zSideDisplace), sideFacing,
				x - (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace * 2) - (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		//Right

		putDownSingleRail(world, x + (xSideDisplace), y + 1,
				z + (zSideDisplace), sideFacing,
				x + (xSideDisplace), y + 1, z + (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);


		return true;
	}

	private boolean doubleDiamondCrossing(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks type)
	{
		if (!canPlaceTrack(player, world, x, y + 1, z)) {
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

		if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + (xDisplace * 2) - xSideDisplace, y + 1, z + (zDisplace * 2) - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + (xSideDisplace), y + 1, z + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + (xDisplace * 2) + xSideDisplace, y + 1, z + (zDisplace * 2) + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x - (xSideDisplace), y + 1, z - zSideDisplace)) {
			return false;
		}

		//Top

		putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
				z + (zDisplace * 2), 0, typeVariantStraightLabel, false, x + (xDisplace), y + 1,
				z + (zDisplace), false, false);

		//Main

		placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(type.getLabel());
		tcRail2.idDrop = this.type.getItem().item;

		//Bottom


		putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false,
				x + (xDisplace), y + 1, z + (zDisplace), false, false);
		//RIGHT
		putDownSingleRail(world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
				z + (zDisplace * 2) + (zSideDisplace), sideFacing,
				x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace * 2) + (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		//Left

		putDownSingleRail(world, x - (xSideDisplace), y + 1,
				z - (zSideDisplace), sideFacing,
				x - (xSideDisplace), y + 1, z - (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);
		//Left2

		putDownSingleRail(world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
				z + (zDisplace * 2) - (zSideDisplace), sideFacing2,
				x - (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace * 2) - (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		//Right2

		putDownSingleRail(world, x + (xSideDisplace), y + 1,
				z + (zSideDisplace), sideFacing2,
				x + (xSideDisplace), y + 1, z + (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x + (xDisplace), y + 1, z + (zDisplace),
				false, false);

		return true;
	}
	private boolean diagonalTwoWaysCrossing(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks type)
	{
		if (!canPlaceTrack(player, world, x, y + 1, z)) {
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

		if (!canPlaceTrack(player, world, x + xDisplace + xSideDisplace, y + 1, z + zDisplace + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + xDisplace - xSideDisplace, y + 1, z + zDisplace - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + zSideDisplace)) {
			return false;
		}


		//Main
		placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(type.getLabel());
		tcRail2.idDrop = type.getItem().item;

		//RIGHT
		putDownSingleRail(world, x + xDisplace + (xSideDisplace), y + 1,
				z + zDisplace + (zSideDisplace), sideFacing,
				x + (xDisplace) + (xSideDisplace), y + 1, z + zDisplace + (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x, y + 1, z,
				false, false);

		//Left

		putDownSingleRail(world, x - xDisplace - (xSideDisplace), y + 1,
				z - zDisplace - (zSideDisplace), sideFacing,
				x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x, y + 1, z,
				false, false);
		//Left2

		putDownSingleRail(world, x + xDisplace - (xSideDisplace), y + 1,
				z + zDisplace - (zSideDisplace), sideFacing2,
				x + (xDisplace) - (xSideDisplace), y + 1, z + zDisplace - (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x, y + 1, z,
				false, false);

		//Right2

		putDownSingleRail(world, x - xDisplace + (xSideDisplace), y + 1,
				z - zDisplace + (zSideDisplace), sideFacing2,
				x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x, y + 1, z,
				false, false);


		return true;
	}
	private boolean fourWaysCrossing(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks type)
	{
		if (!canPlaceTrack(player, world, x, y + 1, z)) {
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

		if (!canPlaceTrack(player, world, x + xDisplace + xSideDisplace, y + 1, z + zDisplace + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + xDisplace - xSideDisplace, y + 1, z + zDisplace - zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x - xDisplace, y + 1, z - zDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x + xSideDisplace, y + 1, z + zSideDisplace)) {
			return false;
		}
		if (!canPlaceTrack(player, world, x - xSideDisplace, y + 1, z - zSideDisplace)) {
			return false;
		}


		//Main
		placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
		TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail2.setFacing(l);
		tcRail2.cx = x + (xDisplace);
		tcRail2.cy = y + 1;
		tcRail2.cz = z + (zDisplace);
		tcRail2.setType(type.getLabel());
		tcRail2.idDrop = this.type.getItem().item;


		//T
		putDownSingleRail(world, x + xDisplace, y + 1,
				z + zDisplace, l,
				x + (xDisplace), y + 1, z + zDisplace, 0,
				typeVariantStraightLabel, false, x, y + 1, z,
				false, false);
		//B
		putDownSingleRail(world, x - xDisplace, y + 1,
				z - zDisplace, l,
				x - (xDisplace), y + 1, z - zDisplace, 0,
				typeVariantStraightLabel, false, x, y + 1, z,
				false, false);
		//L
		putDownSingleRail(world, x + xSideDisplace, y + 1,
				z + zSideDisplace, facing,
				x + (xSideDisplace), y + 1, z + zSideDisplace, 0,
				typeVariantStraightLabel, false, x, y + 1, z,
				false, false);
		//R
		putDownSingleRail(world, x - xSideDisplace, y + 1,
				z - zSideDisplace, facing,
				x - (xSideDisplace), y + 1, z - zSideDisplace, 0,
				typeVariantStraightLabel, false, x, y + 1, z,
				false, false);


		//BR
		putDownSingleRail(world, x + xDisplace + (xSideDisplace), y + 1,
				z + zDisplace + (zSideDisplace), sideFacing,
				x + (xDisplace) + (xSideDisplace), y + 1, z + zDisplace + (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x, y + 1, z,
				false, false);

		//TL

		putDownSingleRail(world, x - xDisplace - (xSideDisplace), y + 1,
				z - zDisplace - (zSideDisplace), sideFacing,
				x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x, y + 1, z,
				false, false);
		//TR

		putDownSingleRail(world, x + xDisplace - (xSideDisplace), y + 1,
				z + zDisplace - (zSideDisplace), sideFacing2,
				x + (xDisplace) - (xSideDisplace), y + 1, z + zDisplace - (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x, y + 1, z,
				false, false);

		//BL

		putDownSingleRail(world, x - xDisplace + (xSideDisplace), y + 1,
				z - zDisplace + (zSideDisplace), sideFacing2,
				x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + (zSideDisplace), 0,
				typeVariantDiagonalStraightLabel, false, x, y + 1, z,
				false, false);


		return true;
	}
	
	private boolean smallDiagonalStraight(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks type)
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
			if (!canPlaceTrack(player, world, x, y + 1, z) || !canPlaceTrack(player, world, x, y + 1, z + dz) || !canPlaceTrack(player, world, x + dx, y + 1, z)) {
				return false;
			}
		}
		else {
			if (!canPlaceTrack(player, world, x, y + 1, z)) {
				return false;
			}
		}

		placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
		//do everything for the core track first
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail.setFacing(l);
		tcRail.setType(type.getLabel());
		tcRail.idDrop = this.type.getItem().item;

		//then we can mess with the gags
		if (tileGag != null) {
			placeTrack(world, x, y + 1, z + dz, BlockIDs.tcRailGag.block, l);
			tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + dz);
			//tileGag[0].canPlaceRollingstock = false;

			placeTrack(world, x + dx, y + 1, z, BlockIDs.tcRailGag.block, l);
			tileGag[1] = (TileTCRailGag) world.getTileEntity(x + dx, y + 1, z);
			//tileGag[1].canPlaceRollingstock = false;
			for (TileTCRailGag tileTCRailGag : tileGag) {
				if (player != null && tileTCRailGag == null) {
					player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
					return false;
				}
				tileTCRailGag.originX = x;
				tileTCRailGag.originY = y + 1;
				tileTCRailGag.originZ = z;
				tileTCRailGag.type = type.getLabel();
				//tileTCRailGag.canPlaceRollingstock = false;
			}
		}
		return true;
	}

	private boolean diagonalStraight(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks type)
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
			if (!canPlaceTrack(player, world, x + (i * dx), y + 1, z + (i * dz)) //main track
					|| !canPlaceTrack(player, world, x + (i * dx) + dx, y + 1, z + (i * dz) + dz) //second track
					|| !canPlaceTrack(player, world, x + (i * dx) + (2*dx), y + 1, z + (i * dz) + (2*dz))) //third track
				return false;

			for(int j = 0; j < 3 ; j++){
				if (player.isSneaking() && i == trackLength && j == 2) { //cut out the last two gags
					break;
				}
				else {
					if (!canPlaceTrack(player, world, x + (i * dx) + (j * dx) + dx, y + 1, z + (i * dz) + (j * dz)) //gag X
							|| !canPlaceTrack(player, world, x + (i * dx) + (j * dx), y + 1, z + (i * dz) + (j * dz) + dz)) //gag Z
						return false;
				}
			}


		}

		for (int i = 0; i <= trackLength; i += 3){
			placeTrack(world, x + (i * dx), y+ 1, z + (i * dz), BlockIDs.tcRail.block, l);
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

			placeTrack(world, x + (i * dx) + dx, y + 1, z + (i * dz) + dz, BlockIDs.tcRailGag.block, l);
			tcRailGag[(3* i) - (i / 3)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + dx, y + 1, z + (i * dz) + dz);

			placeTrack(world,x + (i * dx) + (2 * dx), y + 1, z + (i * dz) + (2 * dz), BlockIDs.tcRailGag.block, l);
			tcRailGag[((3* i) - (i / 3)) + 1] = (TileTCRailGag) world.getTileEntity(x + (i * dx) +  (2 * dx), y + 1, z + (i * dz) + (2 * dz));

			for (int j = 0; j < 3; j++){
				if (player.isSneaking() && i == trackLength && j == 2) {
					break;
				} else {
					placeTrack(world, x + (i * dx) + (j * dx) + dx, y + 1, z + (i * dz) + (j * dz), BlockIDs.tcRailGag.block, l);
					tcRailGag[((3 * i) - (i / 3)) + ((2 * j) + 2)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + (j * dx) + dx, y + 1, z + (i * dz) + (j * dz));

					placeTrack(world, x + (i * dx) + (j * dx), y + 1, z + (i * dz) + (j * dz) + dz, BlockIDs.tcRailGag.block, l);
					tcRailGag[((3 * i) - (i / 3)) + ((2 * j) + 3)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + (j * dx), y + 1, z + (i * dz) + (j * dz) + dz);

				}
			}

		}

		for (TileTCRailGag tileTCRailGag : tcRailGag) {
			if (player != null && tileTCRailGag == null) {
				player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
				return false;
			}
			tileTCRailGag.originX = x;
			tileTCRailGag.originY = y + 1;
			tileTCRailGag.originZ = z;
			tileTCRailGag.type = type.getLabel();

		}

		return true;
	}

	private boolean turn1XRight(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {

		int[] xArray = {0};
		int[] zArray = {0};

		if (l == 2) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z, 0.5, x + 1,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x - 1, z, 0.5, x,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 2, x, z - 1, 0.5, x + 1,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x, z + 1, 0.5, x, y + 1,
					z + 1, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean turn1XLeft(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {

		int[] xArray = {0};
		int[] zArray = {0};

		if (l == 2) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x - 1, z, 0.5, x,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z, 0.5, x + 1,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x, z + 1, 0.5, x + 1,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 2, x, z - 1, 0.5, x, y + 1,
					z, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}

	private boolean turnTrack(EntityPlayer player, World world, int x, int y, int z, int dir, EnumTracks tempType, float pyaw, int[] xArray, int[]zArray, float radius){

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
			if (!canPlaceTrack(player, world, usedXArray[check], y + 1, usedZArray[check])){
				return false;
			}
		}

		if (!putDownTurn(player, world, false, x, y, z, usedXArray, usedZArray, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx,
				y + 1, z - cz, tempType.getLabel(), tempType.getItem().item))
			return false;

		return true;
	}




	private boolean mediumRight45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {

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
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 1, z - 2, 3.75, x + 4.25,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 1, z + 2, 3.75, x - 3.25,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 2, z - 1, 3.75, x + 1,
					y + 1, z - 3.25, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 2, z + 1, 3.75, x, y + 1,
					z + 4.25, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean mediumLeft45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {

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
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 1, z - 2, 3.75, x - 3.25,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z + 2, 3.75, x + 4.25,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 2, z + 1, 3.75, x + 1,
					y + 1, z + 4.25, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 2, z - 1, 3.75, x, y + 1,
					z - 3.25, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean largeRight45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
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
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 2, z - 5, 8.49, x + 8.99,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 2, z + 5, 8.49, x - 7.99,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 5, z - 2, 8.49, x + 1,
					y + 1, z - 7.99, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 5, z + 2, 8.49, x,
					y + 1, z + 8.99, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	private boolean largeLeft45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
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
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 2, z - 5, 8.49, x - 7.99,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 2, z + 5, 8.49, x + 8.99,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 5, z + 2, 8.49, x + 1,
					y + 1, z + 8.99, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 5, z - 2, 8.49, x,
					y + 1, z - 7.99, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	public boolean veryLargeRight45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
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

			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 3, z - 7, 10.89, x + 11.39,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}

		if (l == 0) {

			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 3, z + 7, 10.89, x - 10.39,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 7, z - 3, 10.89, x + 1,
					y + 1, z - 10.39, tempType.getLabel(), tempType.getItem().item))
				return false;
		}

		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 7, z + 3, 10.89, x,
					y + 1, z + 11.39, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	public boolean veryLargeLeft45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
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
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 3, x + 3, z - 7, 10.89, x - 10.39,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x - 3, z + 7, 10.89, x + 11.39,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 2, x - 7, z - 3, 10.89, x + 1,
					y + 1, z + 11.39, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 7, z + 3, 10.89, x,
					y + 1, z - 10.39, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	public boolean superLargeRight45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {

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
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 4, z - 11, 15.69, x + 16.19,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 4, z + 11, 15.69, x - 15.19,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 11, z - 4, 15.69, x + 1,
					y + 1, z - 15.19, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 11, z + 4, 15.69, x,
					y + 1, z + 16.19, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}
	public boolean superLargeLeft45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {

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
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 4, z - 11, 15.69, x - 15.19,
					y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
				return false;
		}

		if (l == 0) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 4, z + 11, 15.69, x + 16.19,
					y + 1, z, tempType.getLabel(), tempType.getItem().item))
				return false;
		}
		if (l == 1) {
			if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 11, z + 4, 15.69, x + 1,
					y + 1, z + 16.19, tempType.getLabel(), tempType.getItem().item))
				return false;
		}

		if (l == 3) {
			return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 11, z - 4, 15.69, x,
					y + 1, z - 15.19, tempType.getLabel(), tempType.getItem().item);
		}
		return true;
	}

	private boolean mediumRight45DegreeSwitch(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType, String typeVariantStraight, String typeVariant90Turn){
		int dx = 0;
		int dz = 0;

		if (l == 0) dz = 1;
		if (l == 1) dx = -1;
		if (l == 2) dz = -1;
		if (l == 3) dx = 1;

		for (int i = 0; i <= 3 ; i++){
			if (!canPlaceTrack(player, world, x + (dx * i), y + 1, z + (dz * i))){
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
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 1, z - 3, 3.75, x + 4.25, y + 1,
					z, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z - 1, l, x + 4.25, y + 1, z, 3.75, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x + 4.25, y + 1, z, 3.75, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
		}

		if (l == 0) {
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 1, z + 3, 3.75, x - 3.25, y + 1,
					z + 1, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 0);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z + 1, l, x - 3.25, y + 1, z + 1, 3.75, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x - 3.25, y + 1, z + 1, 3.75, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);
		}
		if (l == 1) {
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 3, z - 1, 3.75, x, y + 1,
					z - 3.25, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 3.25, 3.75, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 3.25, 3.75, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);
		}
		if (l == 3) {
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 2, x + 3, z + 1, 3.75, x + 1, y + 1,
					z + 4.25, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 4.25, 3.75, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 4.25, 3.75, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
		}


		return true;
	}
	private boolean mediumLeft45DegreeSwitch(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType, String typeVariantStraight, String typeVariant90Turn){
		int dx = 0;
		int dz = 0;

		if (l == 0) dz = 1;
		if (l == 1) dx = -1;
		if (l == 2) dz = -1;
		if (l == 3) dx = 1;

		for (int i = 0; i <= 3 ; i++){
			if (!canPlaceTrack(player, world, x + (dx * i), y + 1, z + (dz * i))){
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

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 1, z - 3, 3.75, x - 3.25, y + 1,
					z, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z - 1, l, x - 3.25, y + 1, z, 3.75, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x - 3.25, y + 1, z, 3.75, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
		}

		if (l == 0) {
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z + 3, 3.75, x + 4.25, y + 1,
					z + 1, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z + 1, l, x + 4.25, y + 1, z + 1, 3.75, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x + 4.25, y + 1, z + 1, 3.75, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);
		}
		if (l == 1) {
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 3, z + 1, 3.75, x, y + 1,
					z + 4.25, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 4.25, 3.75, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 4.25, 3.75, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
		}
		if (l == 3) {
			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 3, z - 1, 3.75, x + 1, y + 1,
					z - 3.25, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}

			world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 3.25, 3.75, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 3.25, 3.75, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
		}


		return true;
	}

	private boolean largeRight45DegreeSwitch(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType, String typeVariantStraight, String typeVariant90Turn){

		int dx = 0;
		int dz = 0;

		if (l == 0) dz = 1;
		if (l == 1) dx = -1;
		if (l == 2) dz = -1;
		if (l == 3) dx = 1;

		for (int i = 0; i <= 6 ; i++){
			if (!canPlaceTrack(player, world, x + (dx * i), y + 1, z + (dz * i))){
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

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x, z - 7, 8.49, x + 8.99,
					y + 1, z, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x + 1, y + 1, z - 3, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z - 1 , l, x + 8.99, y + 1, z , 8.49, tempType.getLabel(), true, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x + 8.99, y + 1, z , 8.49, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z - 3 , l, x + 8.99, y + 1, z , 8.49, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 4, l, x + 8.99, y + 1, z , 8.49, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z - 6, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
		}

		if (l == 0) {

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x, z + 7, 8.49, x - 7.99,
					y + 1, z + 1, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x - 1, y + 1, z + 3, l, 0);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z + 1 , l, x - 7.99, y + 1, z + 1, 8.49, tempType.getLabel(), true, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x - 7.99, y + 1, z + 1 , 8.49, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z + 3 , l, x - 7.99, y + 1, z + 1 , 8.49, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 4, l, x - 7.99, y + 1, z + 1, 8.49, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z + 6, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
		}

		if (l == 1) {

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 7, z , 8.49, x ,
					y + 1, z - 7.99, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x - 3, y + 1, z - 1, l, 1);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x - 1, y + 1, z  , l, x , y + 1, z - 7.99, 8.49, tempType.getLabel(), true, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z , l, x , y + 1, z - 7.99 , 8.49, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(world, x - 3, y + 1, z , l, x , y + 1, z - 7.99 , 8.49, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x - 4, y + 1, z , l, x , y + 1, z - 7.99, 8.49, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x - 5, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x - 6, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
		}

		if (l == 3) {

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 7, z , 8.49, x + 1 ,
					y + 1, z + 8.99, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x + 3, y + 1, z + 1, l, 3);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x + 1, y + 1, z  , l, x + 1 , y + 1, z + 8.99, 8.49, tempType.getLabel(), true, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z , l, x + 1 , y + 1, z + 8.99 , 8.49, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(world, x + 3, y + 1, z , l, x + 1 , y + 1, z + 8.99 , 8.49, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x + 4, y + 1, z , l, x + 1 , y + 1, z + 8.99, 8.49, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x + 5, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x + 6, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
		}
		return true;
	}
	private boolean largeLeft45DegreeSwitch(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType, String typeVariantStraight, String typeVariant90Turn){

		int dx = 0;
		int dz = 0;

		if (l == 0) dz = 1;
		if (l == 1) dx = -1;
		if (l == 2) dz = -1;
		if (l == 3) dx = 1;

		for (int i = 0; i <= 6 ; i++){
			if (!canPlaceTrack(player, world, x + (dx * i), y + 1, z + (dz * i))){
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

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x, z - 7, 8.49, x - 7.99,
					y + 1, z, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x - 1, y + 1, z - 3, l, 2);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z - 1 , l, x - 7.99, y + 1, z , 8.49, tempType.getLabel(), true, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x - 7.99, y + 1, z , 8.49, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z - 3 , l, x - 7.99, y + 1, z , 8.49, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 4, l, x - 7.99, y + 1, z , 8.49, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z - 6, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
		}

		if (l == 0) {

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x, z + 7, 8.49, x + 8.99,
					y + 1, z + 1, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x + 1, y + 1, z + 3, l, 0);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z + 1 , l, x + 8.99, y + 1, z + 1, 8.49, tempType.getLabel(), true, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x + 8.99, y + 1, z + 1 , 8.49, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(world, x, y + 1, z + 3 , l, x + 8.99, y + 1, z + 1 , 8.49, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 4, l, x + 8.99, y + 1, z + 1, 8.49, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x, y + 1, z + 6, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
		}

		if (l == 1) {

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 7, z , 8.49, x ,
					y + 1, z + 8.99, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x - 3, y + 1, z + 1, l, 1);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x - 1, y + 1, z  , l, x , y + 1, z + 8.99, 8.49, tempType.getLabel(), true, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z , l, x , y + 1, z + 8.99 , 8.49, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(world, x - 3, y + 1, z , l, x , y + 1, z + 8.99 , 8.49, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x - 4, y + 1, z , l, x , y + 1, z + 8.99, 8.49, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x - 5, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x - 6, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
		}

		if (l == 3) {

			if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 7, z , 8.49, x + 1 ,
					y + 1, z - 7.99, typeVariant90Turn, tempType.getItem().item))
				return false;
			TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
			if (tcRailTurn != null) {
				tcRailTurn.hasModel = false;
			}


			world.setBlockMetadataWithNotify(x + 3, y + 1, z - 1, l, 3);//to force client update
			/** Switch rail 1 **/
			putDownSingleRail(world, x + 1, y + 1, z  , l, x + 1 , y + 1, z - 7.99, 8.49, tempType.getLabel(), true, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z , l, x + 1 , y + 1, z - 7.99 , 8.49, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 1 **/
			putDownSingleRail(world, x + 3, y + 1, z , l, x + 1 , y + 1, z - 7.99 , 8.49, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 2 **/
			putDownSingleRail(world, x + 4, y + 1, z , l, x + 1 , y + 1, z - 7.99, 8.49, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x + 5, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
			/** Put down straight exit **/
			putDownSingleRail(world, x + 6, y + 1, z , l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
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
	 * Drop the previous block before placing the track.
	 */
	private void placeTrack(World world, int x, int y, int z, Block block, int metadata){
		Block removed = world.getBlock(x, y, z);
		if(removed != null){
			removed.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
		}
		world.setBlock(x, y, z, block, metadata, 3);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if (this.getTrackType().getVariant() != null)
		{
			switch (this.getTrackType().getVariant())
			{
				case NORMAL:
					par3List.add(EnumChatFormatting.GRAY + "Variant: " + "Default");
					break;
				case EMBEDDED:
					par3List.add(EnumChatFormatting.GRAY + "Variant: " + "Sleeperless");
					break;
				default:
				{
					par3List.add(EnumChatFormatting.GRAY + "Variant: " + this.getTrackType().getVariant().name());
				}
			}
		}
		if (this.getTrackType().getBallastType() != null)
		{
			par3List.add(EnumChatFormatting.GRAY + "Ballast: " + this.getTrackType().getBallastType().name());
		}


		par3List.add("\u00a77" + type.getTooltip());
		if ((TCRailTypes.RailTypes.SLOPE.equals(this.getTrackType().getRailType()) && this.getTrackType().getBallastType() == BallastTypes.DYNAMIC)
				|| (TCRailTypes.RailTypes.STRAIGHT.equals(this.getTrackType().getRailType()) && this.getTrackType().getLabel().contains("ROAD_CROSSING") == false))
		{
			par3List.add("\u00a77" + "Shift+Scroll to");
			par3List.add("\u00a77" + "Cycle Between Straight And Slope");
		}
	}

	public EnumTracks getTrackType() {
		return this.type;
	}
}
