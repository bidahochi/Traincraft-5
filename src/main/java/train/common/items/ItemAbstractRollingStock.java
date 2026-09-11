package train.common.items;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.mojang.authlib.GameProfile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.core.items.IMinecartItem;
import net.minecraft.block.BlockRailBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.*;
import train.common.core.handlers.ConfigHandler;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.library.*;
import train.common.library.register.ITrainRecord;
import train.common.library.track.EnumTracks;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackCellResolver;
import train.common.tile.TileTCRail;
import train.common.utils.devutils.DebugUtil;
import train.common.utils.lockout.ILockoutGroup;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class ItemAbstractRollingStock extends ItemMinecart implements IMinecart, IMinecartItem
{
    protected String iconName = "";
    protected String trainName;
    protected String trainCreator;
    protected String trainNote = "";
    protected int trainColor = -1;

    public ItemAbstractRollingStock(String iconName) {
        super(1);
        this.iconName = iconName;
        maxStackSize = 1;
        trainName = this.getUnlocalizedName();
    }

    public int setNewUniqueID(ItemStack stack, EntityPlayer player, int numberOfTrains) {
        NBTTagCompound var3 = stack.getTagCompound();
        if (numberOfTrains <= 0) {
            numberOfTrains = AbstractTrains.uniqueIDs++;
        } else {
            AbstractTrains.uniqueIDs = numberOfTrains++;
        }
        if (var3 == null) {
            var3 = new NBTTagCompound();
            stack.setTagCompound(var3);
        }
        stack.getTagCompound().setInteger("uniqueID", numberOfTrains);
        stack.getTagCompound().setString("trainCreator", player.getDisplayName());
        stack.getTagCompound().setString("trainNote", trainNote);
        return numberOfTrains;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List flavorList, boolean advanced)
    {
        flavorList.add("\u00a77" + "Pack: " + GetContentPackName());
        ITrainRecord trainRecord = Traincraft.traincraftRegistry.getCurrentTrain(this);
        if (trainRecord == null)
        {
            DebugUtil.log("CRITICAL ERROR: TRAIN RECORD IS COULD NOT BE FOUND FOR " + this.trainName + " REPORT TO MOD AUTHORS ASAP");
        }

        RollingStockItemCache itemCacheData = cache.getIfPresent(trainRecord.getInternalName());
        if (itemCacheData == null)
        {
            itemCacheData = new RollingStockItemCache(trainRecord, Traincraft.traincraftRegistry.getEntity(trainRecord.getEntityClass(), null));
            cache.put(trainRecord.getInternalName(), itemCacheData);
        }

        if (itemCacheData.TransportYear != "")
        {
            flavorList.add("\u00a77" + (itemCacheData.TransportYear != "" ? translate("menu.item.year") + ": " + itemCacheData.TransportYear : ""));
        }

        flavorList.add("\u00a77" + translate("menu.item.country") + ": " + translate("menu.item." + itemCacheData.TransportCountry.toLowerCase()));

        if (itemStack.hasTagCompound())
        {
            NBTTagCompound var5 = itemStack.getTagCompound();
            trainCreator = var5.getString("trainCreator");
            trainNote = var5.getString("trainNote");
			/*if (id > 0)
				flavorList.add("\u00a77" + "ID: " + id);*/
            if (trainCreator.length() > 0) {
                flavorList.add("\u00a77" + "Creator: " + trainCreator);
            }
            int color = var5.getInteger("trainColor");
            if (var5.hasKey("trainColor"))
            {
                int actualPos = 0;
                for (int colorPos = 0; colorPos < trainRecord.getColors().length; colorPos++)
                {
                    if (trainRecord.getColors()[colorPos] == color)
                    {
                        actualPos = colorPos;
                        break;
                    }

                }

                if (itemCacheData.textureDescriptionMap.containsKey(actualPos))
                {
                    flavorList.add("\u00a77" + "Scheme: " + itemCacheData.textureDescriptionMap.get(actualPos));
                }
                else
                {
                    flavorList.add("\u00a77" + "Color: " + AbstractTrains.getColorAsString(color));
                }
            }

            if (!trainNote.isEmpty()) {
                flavorList.add("\u00a77" + "Notes: " + trainNote);
            }
        }


        String[] additionnalInfo = trainRecord.getAdditionalTooltip();

        if (getTrainType().length() > 0)
        {
            flavorList.add("\u00a77" + translate("menu.item.types") + ": " + getTrainType());
        }

        flavorList.add("\u00a77" + translate("menu.item.fictional") + ": " + (itemCacheData.IsFictional ? translate("menu.item.yes") : translate("menu.item.no")));

        flavorList.add(EnumChatFormatting.RED + translate("menu.item.lockout") + ": " + (itemCacheData.HasPublicSkins ? EnumChatFormatting.GREEN + translate("menu.item.lockout.public") : EnumChatFormatting.RED + translate("menu.item.lockout.notpublic")));

        if (itemCacheData.TransportMetricHorsePower > 0) {
            flavorList.add("\u00a77" + "Power: " + itemCacheData.TransportMetricHorsePower + " " +  translate("menu.item.mhp"));
        }

        if (itemCacheData.TractiveEffort != 0){
            flavorList.add(EnumChatFormatting.GREEN + translate("menu.item.tractiveeffort") +": " + itemCacheData.TractiveEffort + " lbf");
        }

        if (trainRecord.getMass() != 0)
        {
            flavorList.add("\u00a77" + "Mass: " + (trainRecord.getMass() * 10));
        }
        else if (itemCacheData.WeightKg != 0)
        {
            flavorList.add(EnumChatFormatting.GREEN + translate("menu.item.weight") +": " + itemCacheData.WeightKg + "kg");
        }

        if (itemCacheData.maxSpeed > 0) {
            flavorList.add("\u00a77" + translate("menu.item.speed") + ": " + itemCacheData.maxSpeed + " km/h");
        }
        if (getCargoCapacity() > 0) {
            flavorList.add("\u00a77" + translate("menu.item.slots") + ": " + getCargoCapacity());
        }


        if (itemCacheData.TankCapacity > 0)
        {
            String trainType = trainRecord.getTrainType().toLowerCase();

            if (trainType.contains("tankcar"))
            {
                flavorList.add("\u00a77" + "Capacity: " + itemCacheData.TankCapacity + "mb.");
            }
            else if (trainType.contains("tender"))
            {
                flavorList.add("\u00a77" + "Water capacity: " + itemCacheData.TankCapacity + "mb.");
            }
            else if (trainType.contains("slug"))
            {
                flavorList.add("\u00a77" + "Reduces train weight when fueled");
            }
        }

        String cargoFlavorText = getCargoFlavorText(itemCacheData);

        if (cargoFlavorText != null)
        {
            flavorList.add("\u00a77" + cargoFlavorText);
        }

        if (additionnalInfo != null) {
            for (String info : additionnalInfo) {
                flavorList.add("\u00a77" + info);
            }
        }


        //flavorList.add("\u00a77" + "Notes: "+getCargoCapacity());
    }

    private String getCargoFlavorText(RollingStockItemCache itemCacheData)
    {
        if (itemCacheData.isAbstractStandardFreightCar)
        {
            switch (itemCacheData.cargoItemFilter)
            {
                case LOG_WOOD:
                    return "Cargo: Logs.";
                case AGGREGATE:
                    return "Cargo: Aggregates.";
                case ORE:
                    return "Cargo: Ores.";
                case ICE_MATERIAL:
                    return "Cargo: only ice";
                case WOOD_PRODUCTS:
                    return "Cargo: Wood Products";
                case INGOT:
                    return "Cargo: Ingots.";
                case WOOD_CHIPS:
                    return "Cargo: Woodchips/Sawdust.";
                case GRAIN:
                    return "Cargo: wheat, seeds";
                case ASSEMBLED_TRAIN_TRACK:
                    return "Cargo: only rails";
            }
        }

        return null;
    }

    private static String translate(String translate){
        return translate==null?"": StatCollector.translateToLocal(translate);
    }

    public abstract String GetContentPackName();

    private static Cache<String, RollingStockItemCache> cache = CacheBuilder.newBuilder()
            .maximumSize(500)
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .build();

    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.rare;
    }

    public String getTrainType()
    {
        ITrainRecord trainRecord = Traincraft.traincraftRegistry.getCurrentTrain(this);

        return trainRecord.getTrainType();
    }

    public double getMass()
    {
        ITrainRecord trainRecord = Traincraft.traincraftRegistry.getCurrentTrain(this);

        return trainRecord.getMass();
    }

    public int getCargoCapacity() {
        ITrainRecord trainRecord = Traincraft.traincraftRegistry.getCurrentTrain(this);

        return trainRecord.getCargoCapacity();
    }

    public String getTrainName() {
        return trainName;
    }

    /**
     * Places this rolling-stock item on a supported rail target.
     *
     * @param par1ItemStack rolling-stock item stack
     * @param par2EntityPlayer placing player
     * @param par3World target world
     * @param par4 target X coordinate
     * @param par5 target Y coordinate
     * @param par6 target Z coordinate
     * @param par7 clicked side
     * @param par8 hit X within the block
     * @param par9 hit Y within the block
     * @param par10 hit Z within the block
     * @return whether placement was handled
     */
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        int meta = par3World.getBlockMetadata(par4, par5, par6);
        if (par3World.isRemote)
            return false;
        TileTCRail tile = TrackCellResolver.resolveParent(par3World, par4, par5, par6);
        if (tile != null)
        {
            ITrackDefinition enumTracks = EnumTracks.GetTrackByLabel(tile.getType());
            if (enumTracks == null)
            {
                sendLocalChatMessage(par2EntityPlayer,"An error occurred please try replacing the track");
                return false;
            }

            if (enumTracks.getCoreTrack().isCoreTrackValidForRollingStockPlaceable())
            {
                this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
                return true;
            }
            else
            {
                sendLocalChatMessage(par2EntityPlayer,"Place me on a straight piece of track!");
                return false;
            }
        } else if (TrackCellResolver.isRailBlockAt(par3World, par4, par5, par6) && (meta < 2 || meta > 5)) {
            this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEntityPlusBogie(AbstractTrains abstractTrains, ITrainRecord trainRecord)
    {
        return abstractTrains instanceof Locomotive || trainRecord.getBogieLocoPosition() != 0;
    }

    /**
     * Creates and spawns this rolling stock at the resolved rail ride height.
     *
     * @param player placing player
     * @param itemStack rolling-stock item stack
     * @param world target world
     * @param railX rail X coordinate
     * @param railY rail Y coordinate
     * @param railZ rail Z coordinate
     * @return spawned minecart entity, or {@code null} when placement fails
     */
    public EntityMinecart placeCart(EntityPlayer player, ItemStack itemStack, World world, int railX, int railY, int railZ)
    {
        //System.out.println(train.getItem().getUnlocalizedName());
        //System.out.println(world!=null);
        ITrainRecord trainRecord = Traincraft.traincraftRegistry.getCurrentTrain(itemStack.getItem());
        EntityRollingStock rollingStock = (EntityRollingStock) Traincraft.traincraftRegistry.getEntity(trainRecord.getEntityClass(), world, railX + 0.5F, getRollingStockPlacementY(world, railX, railY, railZ), railZ + 0.5F);
        boolean isPlacementWithSkinValid = false;
        if (trainRecord.getColors() != null)
        {
            if (rollingStock != null)
            {
                //rollingStock.setColor(AbstractTrains.getColorFromString(train.getColors()[0]));
                ILockoutGroup lockoutGroup = rollingStock.lockoutMap.get(0);
                if (rollingStock.IsSkinLockedByLockout(0))
                {
                    if (Traincraft.lockoutPermissionsUtil.IsUserMemberOfGroup(player.getUniqueID(), lockoutGroup.name()))
                    {
                        isPlacementWithSkinValid = true;
                        rollingStock.setColor((trainRecord.getColors()[0]));
                    }
                    else
                    {
                        ArrayList<String> groupsToCheck = new ArrayList<>();
                        for (ILockoutGroup group : rollingStock.lockoutMap.values())
                        {
                            if (groupsToCheck.contains(group.name()) == false)
                            {
                                groupsToCheck.add(group.name());
                            }
                        }


                        for (int colorPos = 0; colorPos < trainRecord.getColors().length; colorPos++)
                        {
                            if (rollingStock.lockoutMap.containsKey(colorPos))
                            {
                                ILockoutGroup group = rollingStock.lockoutMap.get(colorPos);


                                for (String groupPartOf : Traincraft.lockoutPermissionsUtil.FindGroupsUserIsMemberOf(player.getUniqueID(), groupsToCheck))
                                {
                                    if (group.equals(groupPartOf))
                                    {
                                        rollingStock.setColor((trainRecord.getColors()[colorPos]));
                                        isPlacementWithSkinValid = true;
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                isPlacementWithSkinValid = true;
                                rollingStock.setColor((trainRecord.getColors()[colorPos]));
                                break;
                            }
                        }
                    }
                    //trainRecord.getColors()

                    //for (rollingStock.lockoutMap.get())
                }
                else
                {
                    isPlacementWithSkinValid = true;
                    rollingStock.setColor((trainRecord.getColors()[0]));
                }
            }
        }
        else
        {
            isPlacementWithSkinValid = true;
        }

        if (rollingStock != null)
        {
            if (!world.isRemote)
            {
                if (isPlacementWithSkinValid == false)
                {
                    sendLocalChatMessage(player,EnumChatFormatting.RED + "Lockout:" + EnumChatFormatting.GRAY + " Unable to place, no public domain skins available.");
                    rollingStock.setDead();
                    return rollingStock;
                }

                if ((rollingStock instanceof SteamTrain && !ConfigHandler.ENABLE_STEAM)
                    || (rollingStock instanceof ElectricTrain && !ConfigHandler.ENABLE_ELECTRIC)
                    || (rollingStock instanceof DieselTrain && !ConfigHandler.ENABLE_DIESEL)
                    || (rollingStock instanceof EntityTracksBuilder && !ConfigHandler.ENABLE_BUILDER)
                    || (rollingStock instanceof Tender && !ConfigHandler.ENABLE_TENDER))
                {
                    if (player != null)
                        sendLocalChatMessage(player,"This type of train has been deactivated by the OP");
                    rollingStock.setDead();
                    return rollingStock;
                }

                int dir = 0;
                int meta = world.getBlockMetadata(railX, railY, railZ);
                if (player != null)
                    dir = MathHelper.floor_double((player.rotationYaw * 8F) / 360F + 0.5D) & 7;
                // 0    = 0 = SOUTH
                // 45   = 1 = SOUTH-WEST
                // 90   = 2 = WEST
                // 135  = 3 = NORTH-WEST
                // 180  = 4 = NORTH
                // -135 = 5 = NORTH-EAST
                // -90  = 6 = EAST
                // -45  = 7 = SOUTH-EAST


                if (dir == 0) {

                    rollingStock.rotationYaw = 180; // BACK
                    if (meta == 0) {
                        rollingStock.serverRealRotation = 90; // RIGHT
                    }
                    else {
                        rollingStock.serverRealRotation = 0; // FRONT
                    }
                    if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ))) {

                        if (meta == 0 || meta == 2) {
                            rollingStock.rotationYaw = -90; // LEFT
                        }
                        else if (meta == 6 || meta == 4) {
                            rollingStock.rotationYaw = -45; // LEFT
                        }
                        else if (meta == 5 || meta == 7){
                            rollingStock.rotationYaw = -135;
                        }
                        else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                    if (isEntityPlusBogie(rollingStock, trainRecord)) {
                        if ((meta == 2 || meta == 0) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = 90;
                        } else if ((meta == 6 || meta == 4) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = 135; //RIGHT
                        } else if ((meta == 5 || meta == 7) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 1, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX + 1, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 2, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX + 2, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = 45;
                        } else {
                            if (player != null) {
                                sendLocalChatMessage(player,"Place me on a straight piece of track!");
                                rollingStock.setDead();
                                return rollingStock;
                            }


                        }
                    }

                }

                if (dir == 1) {
                    rollingStock.rotationYaw = -135; // BACK
                    if (meta == 0) {
                        rollingStock.serverRealRotation = 90; // RIGHT
                    }
                    else {
                        rollingStock.serverRealRotation = 180; // FRONT
                    }
                    if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ))) {
                        if (meta == 6 || meta == 4) {
                            rollingStock.rotationYaw = -45; // LEFT
                        } else if (meta == 2 || meta == 0) {
                            rollingStock.rotationYaw = -90; // LEFT
                        } else if (meta == 1 || meta == 3) {
                            rollingStock.rotationYaw = 0; // LEFT
                        } else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                    if (isEntityPlusBogie(rollingStock, trainRecord)) {
                        if ((meta == 2 || meta == 0) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = 90;
                        } else if ((meta == 1 || meta == 3) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ)))) {
                            rollingStock.serverRealRotation = 180;

                        } else if ((meta == 6 || meta == 4) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = 135; //RIGHT
                        } else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                }

                if (dir == 2) {
                    rollingStock.rotationYaw = -90; //BACK
                    if (meta == 1) {
                        rollingStock.serverRealRotation = 180; //RIGHT
                    } else {
                        rollingStock.serverRealRotation = 90; // FRONT
                    }
                    if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ))) {
                        if (meta == 1 || meta == 3){
                            rollingStock.rotationYaw = 0; // LEFT
                        }
                        else if(meta == 5 || meta == 7){
                            rollingStock.rotationYaw = 45;
                        }
                        else if (meta == 6 || meta == 4){
                            rollingStock.rotationYaw = -45;

                        }
                        else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                    if (isEntityPlusBogie(rollingStock, trainRecord) ) {
                        if ((meta == 1 || meta == 3) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ)))) {
                            rollingStock.serverRealRotation = 180; //RIGHT
                        }
                        else if ((meta == 5 || meta == 7) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ - 1)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ - 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ - 2)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ - 2)))) {
                            rollingStock.serverRealRotation = -135;
                        }
                        else if ((meta == 6 || meta == 4) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = 135;
                        }

                        else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                }

                if (dir == 3) {
                    rollingStock.rotationYaw = -45; // BACK
                    if (meta == 0) {
                        rollingStock.serverRealRotation = -90; // RIGHT
                    } else {
                        rollingStock.serverRealRotation = 180; // FRONT
                    }
                    if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ))) {
                        if (meta == 5 || meta == 7) {
                            rollingStock.rotationYaw = 45; // LEFT
                        }
                        else if (meta == 2 || meta == 0) {
                            rollingStock.rotationYaw = 90;
                        }
                        else if (meta == 1 || meta == 3){
                            rollingStock.rotationYaw = 0; // LEFT
                        }
                        else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                    if (isEntityPlusBogie(rollingStock, trainRecord) ) {
                        if ((meta == 5 || meta == 7) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ - 1)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ - 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ - 2)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ - 2)))) {
                            rollingStock.serverRealRotation = -135; //RIGHT
                        }
                        else if ((meta == 2 || meta == 0) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ + 2)))) {rollingStock.serverRealRotation = 90;
                            rollingStock.serverRealRotation = -90;
                        }
                        else if ((meta == 1 || meta == 3) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ)))) {
                            rollingStock.serverRealRotation = 180; //RIGHT
                        }
                        else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                }

                if (dir == 4) {
                    rollingStock.rotationYaw = 0; // BACK
                    if (meta == 0) {
                        rollingStock.serverRealRotation = -90; // RIGHT
                    } else {
                        rollingStock.serverRealRotation = 180; // FRONT
                    }
                    if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ))) {
                        if (meta == 0 || meta == 2) {
                            rollingStock.rotationYaw = 90; // LEFT
                        }
                        else if (meta == 5 || meta == 7) {
                            rollingStock.rotationYaw = 45; // LEFT
                        }
                        else if (meta == 6 || meta == 4){
                            rollingStock.rotationYaw = 135;
                        }

                        else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }

                    }

                    if (isEntityPlusBogie(rollingStock, trainRecord) ) {
                        if ((meta == 0 || meta == 2) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ - 1)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ - 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ - 2)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ - 2)))) {
                            rollingStock.serverRealRotation = -90; // RIGHT
                        }
                        else if ((meta == 5 || meta == 7) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ - 1)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ - 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ - 2)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ - 2)))) {
                            rollingStock.serverRealRotation = -135; //RIGHT
                        }
                        else if ((meta == 6 || meta == 4) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = -45;
                        }else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                }

                if (dir == 5) {
                    rollingStock.rotationYaw = 45; // BACK
                    if (meta == 0) {
                        rollingStock.serverRealRotation = -90; // RIGHT
                    } else {
                        rollingStock.serverRealRotation = 0; // FRONT
                    }
                    if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ))) {
                        if (meta == 6 || meta == 4) {
                            rollingStock.rotationYaw = 135; // LEFT
                        }
                        else if (meta == 0 || meta == 2) {
                            rollingStock.rotationYaw = 90; // LEFT
                        }
                        else if (meta == 1 || meta == 3){
                            rollingStock.rotationYaw = 178.5f; // LEFT
                        }
                        else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                    if (isEntityPlusBogie(rollingStock, trainRecord)) {
                        if ((meta == 6 || meta == 4) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 1, railY, railZ - 1)) || BlockRailBase.func_150051_a(world.getBlock(railX + 1, railY, railZ - 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 2, railY, railZ - 2)) || BlockRailBase.func_150051_a(world.getBlock(railX + 2, railY, railZ - 2)))) {
                            rollingStock.serverRealRotation = -45; //RIGHT
                        }
                        else if ((meta == 1 || meta == 3) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 1, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX + 1, railY, railZ))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 2, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX + 2, railY, railZ)))) {
                            rollingStock.serverRealRotation = 0; //RIGHT
                        }
                        else if ((meta == 0 || meta == 2) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ - 1)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ - 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ - 2)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ - 2)))) {
                            rollingStock.serverRealRotation = -90; // RIGHT
                        }else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                }

                if (dir == 6) {
                    rollingStock.rotationYaw = 90; // BACK
                    if (meta == 1) {
                        rollingStock.serverRealRotation = 0; // RIGHT
                    } else {
                        rollingStock.serverRealRotation = -90; // FRONT
                    }
                    if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ))) {
                        if (meta == 1 || meta == 3) {
                            rollingStock.rotationYaw = -178.5f; // LEFT
                        }
                        else if (meta == 6 || meta == 4) {
                            rollingStock.rotationYaw = 135; // LEFT
                        }
                        else if (meta == 5 || meta == 7) {
                            rollingStock.rotationYaw = -135; // LEFT
                        }else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                    if (isEntityPlusBogie(rollingStock, trainRecord) ) {
                        if ((meta == 1 || meta == 3) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 1, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX + 1, railY, railZ))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 2, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX + 2, railY, railZ)))) {
                            rollingStock.serverRealRotation = 0; //RIGHT
                        } else if ((meta == 5 || meta == 7) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 1, railY, railZ - 1)) || BlockRailBase.func_150051_a(world.getBlock(railX - 1, railY, railZ - 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX - 2, railY, railZ - 2)) || BlockRailBase.func_150051_a(world.getBlock(railX - 2, railY, railZ - 2)))) {
                            rollingStock.serverRealRotation = 45; //RIGHT
                        }
                        else if ((meta == 6 || meta == 4) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 1, railY, railZ - 1)) || BlockRailBase.func_150051_a(world.getBlock(railX + 1, railY, railZ - 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 2, railY, railZ - 2)) || BlockRailBase.func_150051_a(world.getBlock(railX + 2, railY, railZ - 2)))) {
                            rollingStock.serverRealRotation = -45; //RIGHT
                        }else {
                            sendLocalChatMessage(player,"Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                }

                if (dir == 7) {
                    rollingStock.rotationYaw = 135; // BACK
                    if (meta == 0) {
                        rollingStock.serverRealRotation = 90; // RIGHT
                    } else {
                        rollingStock.serverRealRotation = 0; // FRONT
                    }
                    if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ))) {
                        if (meta == 5 || meta == 7) {
                            rollingStock.rotationYaw = -135; // LEFT
                        }
                        else if (meta == 1 || meta == 3) {
                            rollingStock.rotationYaw = -178.5f; // LEFT
                        }
                        else if (meta == 0 || meta == 2) {
                            rollingStock.rotationYaw = -90; // LEFT
                        }
                        else {
                            sendLocalChatMessage(player, "Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }
                    }
                    if (isEntityPlusBogie(rollingStock, trainRecord)) {
                        if ((meta == 5 || meta == 7) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 1, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX + 1, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 2, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX + 2, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = 45; //RIGHT
                        }
                        else if ((meta == 1 || meta == 3) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 1, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX + 1, railY, railZ))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX + 2, railY, railZ)) || BlockRailBase.func_150051_a(world.getBlock(railX + 2, railY, railZ)))) {
                            rollingStock.serverRealRotation = 0; //RIGHT
                        }
                        else if ((meta == 0 || meta == 2) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ + 1)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ + 1))) && (TrackCellResolver.isTraincraftRailBlock(world.getBlock(railX, railY, railZ + 2)) || BlockRailBase.func_150051_a(world.getBlock(railX, railY, railZ + 2)))) {
                            rollingStock.serverRealRotation = 90; // RIGHT
                        }else {
                            sendLocalChatMessage(player, "Place me on a straight piece of track!");
                            rollingStock.setDead();
                            return rollingStock;
                        }

                    }
                }

                // System.out.println("ServerRealRotation: " + rollingStock.serverRealRotation + "
                // RotationYaw: "
                // + rollingStock.rotationYaw);

                rollingStock.trainType = ((ItemAbstractRollingStock) itemStack.getItem()).getTrainType();
                rollingStock.trainName = (itemStack.getItem()).getItemStackDisplayName(itemStack);

                if (player != null) {
                    rollingStock.trainOwner = player.getDisplayName();
                }
                rollingStock.mass = getMass();

                int uniID = -1;
                if (itemStack.hasTagCompound()) {
                    NBTTagCompound var5 = itemStack.getTagCompound();
                    uniID = var5.getInteger("uniqueID");
                    if (uniID != -1)
                        rollingStock.uniqueID = uniID;
                    if (uniID != -1)
                        rollingStock.getEntityData().setInteger("uniqueID", uniID);
                    trainCreator = var5.getString("trainCreator");
                    trainColor = var5.getInteger("trainColor");
                    trainNote = var5.getString("trainNote");
                    if (var5.hasKey("trainColor"))
                        rollingStock.setColor(trainColor);
                    rollingStock.trainCreator = trainCreator;
                    rollingStock.trainNote = trainNote;
                    rollingStock.importTrustedListFromNBT(var5);
                    if (var5.hasKey("cargoSelection")) {
                        if (rollingStock.getCargoManager().isValidCargoSelection(var5.getInteger("cargoSelection")))
                            rollingStock.getCargoManager().setSelectedCargo(var5.getInteger("cargoSelection"));
                    }
                    if (var5.hasKey("overlayTextureConfigTag")) // Import overlay configuration from NBT and apply it to the entity.
                        rollingStock.getOverlayTextureContainer().importFromConfigTag(var5.getCompoundTag("overlayTextureConfigTag"));
                    if (rollingStock instanceof Tender && var5.hasKey(Tender.NBT_TENDER_STORAGE_MODE)) {
                        ((Tender) rollingStock).restoreStorageModeFromItem(
                                var5.getInteger(Tender.NBT_TENDER_STORAGE_MODE)
                        );
                    }
                }
                if (player != null)
                    rollingStock.setInformation(((ItemAbstractRollingStock) itemStack.getItem()).getTrainType(), player.getDisplayName(), trainCreator, (itemStack.getItem()).getItemStackDisplayName(itemStack), uniID);
                if (player == null)
                    rollingStock.setInformation(((ItemAbstractRollingStock) itemStack.getItem()).getTrainType(), "", trainCreator, (itemStack.getItem()).getItemStackDisplayName(itemStack), uniID);

                if (ConfigHandler.SHOW_POSSIBLE_COLORS && rollingStock.acceptedColors != null && rollingStock.acceptedColors.size() > 0)
                {
                    if (player != null)
                    {
                        sendLocalChatMessage(player,"To paint, use the " + StatCollector.translateToLocal("item.tc:paintbrushThing.name"));
                    }
                }
                rollingStock.markPlacedNow();
                world.spawnEntityInWorld(rollingStock);
            }
            --itemStack.stackSize;
        }
        return rollingStock;
    }

    /**
     * Resolves the rolling-stock spawn height from the rail surface at one coordinate.
     *
     * @param world world containing the supporting rail
     * @param x supporting rail X coordinate
     * @param y supporting rail Y coordinate
     * @param z supporting rail Z coordinate
     * @return absolute rolling-stock placement Y coordinate
     */
    private static double getRollingStockPlacementY(World world, int x, int y, int z)
    {
        TileTCRail parent = TrackCellResolver.resolveParent(world, x, y, z);
        return y + 0.5D + (parent != null ? parent.getTrackRideYOffset() : 0.0D);
    }

    /**
     *
     * @param oldStack oldst ack
     * @param train train
     * @param trainID
     * @param player player
     * @param creator creator
     * @param color
     * @param note
     * @return
     */
    public static ItemStack setPersistentData(@Nullable ItemStack oldStack, @Nullable AbstractTrains train, @Nullable Integer trainID, @Nullable String player, @Nullable String creator, int color, String note) {

		ItemStack stack = oldStack;

        if (train != null)
        {
            ITrainRecord trainRecord = Traincraft.traincraftRegistry.getTrainRecord(train.getClass());
            stack = (new ItemStack(trainRecord.getItem()));
        }
        if (stack != null) {
            NBTTagCompound tag = stack.getTagCompound();
            if (tag == null) {
                tag = new NBTTagCompound();
            }
            if (train != null) {
                tag.setString("puuid", train.getPersistentUUID());
                tag.setString("trainCreator", creator == null ? train.getEntityData().getString("theCreator") : creator);

                tag.setString("trainNote", note);
                if (player != null && player.length() > 1) {
                    tag.setString("theOwner", player);
                }
                if (color != -1) {
                    tag.setInteger("trainColor", color);
                }
                if (train instanceof Tender) {
                    Tender tender = (Tender) train;
                    if (tender.supportsStorageMode(tender.getStorageMode())) {
                        tag.setInteger(
                                Tender.NBT_TENDER_STORAGE_MODE,
                                tender.getStorageMode().getId()
                        );
                    } else {
                        tag.removeTag(Tender.NBT_TENDER_STORAGE_MODE);
                    }
                }
            } else {
                tag.setString("trainCreator", creator != null && creator.length() > 1 ? creator : "Creative");
            }
            tag.setInteger("uniqueID", trainID == null ? AbstractTrains.uniqueIDs++ : trainID);


            stack.setTagCompound(tag);
        } else {
            return null;//THIS SHOULD NEVER HAPPEN, but compensate anyway because java is stupid and forge is unreliable.
        }
        return stack;

    }

    private void sendLocalChatMessage(EntityPlayer player, String msg)
    {
        player.addChatMessage(new ChatComponentText(msg));
    }

    @Override
    public boolean canBePlacedByNonPlayer(ItemStack cart) {
        return true;
    }

	@Override
	public EntityMinecart placeCart(GameProfile owner, ItemStack itemStack, World world,
			int railX, int railY, int railZ)
	{
		return placeCart((EntityPlayer)null, itemStack, world, railX, railY, railZ);
	}

    @Override
    public boolean doesCartMatchFilter(ItemStack stack, EntityMinecart cart) {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(GetTexturePath());
    }

    public abstract String GetTexturePath();
}
