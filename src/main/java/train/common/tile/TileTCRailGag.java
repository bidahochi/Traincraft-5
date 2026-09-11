package train.common.tile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockTCRail;

import java.util.Random;

public class TileTCRailGag extends TileEntity implements ITileTCRail
{

	protected Random rand = new Random();
	protected Side side;

	public int originX;
	public int originY;
	public int originZ;
	public String type = "";

	public String getType() {

		return this.type;
	}

	/**
	 * Assigns the authoritative rail origin and synchronizes the completed gag state.
	 * Gag fields are populated after the block itself is placed, so the initial block
	 * update cannot carry these values to clients.
	 *
	 * @param parentX authoritative parent X coordinate
	 * @param parentY authoritative parent Y coordinate
	 * @param parentZ authoritative parent Z coordinate
	 * @param trackType registry label used by this gag cell
	 */
	public void initializeTrackReference(int parentX, int parentY, int parentZ, String trackType)
	{
		originX = parentX;
		originY = parentY;
		originZ = parentZ;
		type = trackType;
		synchronizeTrackReference();
	}

	/** Marks the completed tile state dirty and sends it to observing clients. */
	private void synchronizeTrackReference()
	{
		markDirty();
		if (worldObj != null && worldObj.isRemote == false)
		{
			worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
		}
	}

	public float bbHeight = 0.125f;

	/**
	 * USED AS COMPATIBILITY TO CONVERT FROM TCCE
	 */
	private boolean isFoxTCXOriginsCompatabilityModeEnabled = false;

	@Override
	public void readFromNBT(NBTTagCompound nbt) {

		if (nbt.hasKey("Xorigins"))
		{
			isFoxTCXOriginsCompatabilityModeEnabled = true;
			int[] org=nbt.getIntArray("Xorigins");
			originX= org[0];

			org=nbt.getIntArray("Yorigins");
			originY = org[0];

			org=nbt.getIntArray("Zorigins");
			originZ = org[0];
		}
		else
		{
			originX = nbt.getInteger("originX");
			originY = nbt.getInteger("originY");
			originZ = nbt.getInteger("originZ");
		}

		bbHeight = nbt.getFloat("bbHeight");
		type = nbt.getString("type");

		super.readFromNBT(nbt);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {

		nbt.setInteger("originX", originX);
		nbt.setInteger("originY", originY);
		nbt.setInteger("originZ", originZ);

		if (isFoxTCXOriginsCompatabilityModeEnabled)
		{
			nbt.setIntArray("Xorigins", new int[] { originX });

			nbt.setIntArray("Yorigins", new int[] { originY });

			nbt.setIntArray("Zorigins", new int[] { originZ });
		}

		nbt.setFloat("bbHeight", bbHeight);
		if (type.equals("")){
			type = "null";
		}
		nbt.setString("type", type);

		super.writeToNBT(nbt);
	}

	private static final int[] matrixXZ = {0,-1,1}, matrixY = {0,-1,+1};
	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
		for(int x : matrixXZ){
			for(int z : matrixXZ){
				for(int y : matrixY){
					if(p_149749_1_.getBlock(xCoord,yCoord,zCoord)instanceof BlockTCRail){
						p_149749_1_.func_147453_f(p_149749_2_,p_149749_3_,p_149749_4_, Blocks.air);
						p_149749_1_.markBlockForUpdate(p_149749_2_,p_149749_3_,p_149749_4_);
					}
				}
			}
		}
	}

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
		this.readFromNBT(pkt.func_148857_g());
		super.onDataPacket(net, pkt);
	}

	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return 24567.0D;
	}
}
