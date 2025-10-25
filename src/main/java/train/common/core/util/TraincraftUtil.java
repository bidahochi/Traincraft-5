package train.common.core.util;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;


public class TraincraftUtil{

    public static Item getItemFromName(String name){
        if (Item.itemRegistry.containsKey(name)){
            return (Item) Item.itemRegistry.getObject(name);
        } else {
            return null;
        }
    }

    public static ItemStack getItemFromUnlocalizedName(String itemName, int meta){
        Item item = getItemFromName(itemName);
        if(item != null){
            return new ItemStack(item, 1, meta);
        }
        return null;
    }
    
    public static boolean itemStackMatches(ItemStack item1, ItemStack item2){
    	return (item1.getItem() == item2.getItem()) && 
    			(item1.getItemDamage() == item2.getItemDamage() 
    				|| item1.getItemDamage() == OreDictionary.WILDCARD_VALUE
    				|| item2.getItemDamage() == OreDictionary.WILDCARD_VALUE);
    }

    public static boolean isRailBlockAt(World world, int x, int y, int z){
        return world.getBlock(x,y,z) instanceof BlockRailBase;
    }

    public static final double degrees = (180d / Math.PI);
    public static final double radian = (Math.PI / 180.0D);
    public static void updateRider(EntityRollingStock transport,double distance, double yOffset) {
        if (transport.riddenByEntity == null) { return; }
        double pitchRads = transport.anglePitchClient * radian;
        double rotationCos1 = Math.cos(Math.toRadians(transport.renderYaw+((transport instanceof Locomotive)?90:180)));
        double rotationSin1 = Math.sin(Math.toRadians(transport.renderYaw+((transport instanceof Locomotive)?90:180)));
        if(transport.side.isServer()){
            rotationCos1 =  Math.cos(Math.toRadians(transport.serverRealRotation + 90));
            rotationSin1 = Math.sin(Math.toRadians((transport.serverRealRotation + 90)));
            transport.anglePitchClient = transport.serverRealPitch*60;
        }
        float pitch = (float) (transport.posY + ((Math.tan(pitchRads) * distance) + transport.getMountedYOffset())
                + transport.riddenByEntity.getYOffset() + yOffset);

        double bogieX1 = (transport.posX + (rotationCos1 * distance));
        double bogieZ1 = (transport.posZ + (rotationSin1* distance));
        //System.out.println(rotationCos1+" "+rotationSin1);
        if(transport.anglePitchClient>20 && rotationCos1 == 1){
            bogieX1-=pitchRads*2;
            pitch-=pitchRads*1.2;
        }
        if(transport.anglePitchClient>20 && rotationSin1 == 1){
            bogieZ1-=pitchRads*2;
            pitch-=pitchRads*1.2;
        }
        if (pitchRads == 0.0) {
            transport.riddenByEntity.setPosition(bogieX1, (transport.posY + transport.getMountedYOffset() + transport.riddenByEntity.getYOffset() + yOffset), bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            transport.riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }

    public static void updateRider(EntityRollingStock transport, double distance, double yOffset, double leftOffset) {
        if (transport.riddenByEntity == null) { return; }
        double pitchRads = transport.anglePitchClient * radian;
        double rotationCos1 = Math.cos(Math.toRadians(transport.renderYaw + ((transport instanceof Locomotive)? 90 : 180)));
        double rotationSin1 = Math.sin(Math.toRadians(transport.renderYaw + ((transport instanceof Locomotive)? 90 : 180)));
        double rotationCosLR1 = Math.cos(Math.toRadians(transport.renderYaw));
        double rotationSinLR1 = Math.sin(Math.toRadians((transport.renderYaw)));
        if(transport.side.isServer()) {
            rotationCos1 =  Math.cos(Math.toRadians(transport.serverRealRotation + 90));
            rotationSin1 = Math.sin(Math.toRadians((transport.serverRealRotation + 90)));
            rotationCosLR1 = Math.cos(Math.toRadians(transport.serverRealRotation));
            rotationSinLR1 = Math.sin(Math.toRadians((transport.serverRealRotation)));
            transport.anglePitchClient = transport.serverRealPitch*60;
        }
        double pitch = (transport.posY + ((Math.tan(pitchRads) * distance) + transport.getMountedYOffset())
                + transport.riddenByEntity.getYOffset() + yOffset);
        double pitch1 = (transport.posY + transport.getMountedYOffset() + transport.riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (transport.posX + (rotationCos1 * distance) + (rotationCosLR1 * leftOffset));
        double bogieZ1 = (transport.posZ + (rotationSin1* distance) + (rotationSinLR1 * leftOffset));

        if(transport.anglePitchClient > 20) {
            if (rotationCos1 == 1) {
                bogieX1 -= pitchRads * 2;
                pitch -= pitchRads * 1.2;
            }
            if (rotationSin1 == 1) {
                bogieZ1-=pitchRads * 2 + 1;
                pitch-=pitchRads * 1.2;
            }
        }
        if (pitchRads == 0.0) {
            transport.riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            transport.riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }

    public static int getByteFromColor(String c){
        if(c.equals("Black")){
            return 0;
        } else if (c.equals("Red")){
            return 1;
        } else if(c.equals("Green")){
            return 2;
        } else if(c.equals("Brown")){
            return 3;
        } else if(c.equals("Blue")){
            return 4;
        } else if(c.equals("Purple")){
            return 5;
        } else if(c.equals("Cyan")){
            return 6;
        } else if(c.equals("LightGrey")){
            return 7;
        } else if(c.equals("Grey")){
            return 8;
        } else if(c.equals("Magenta")){
            return 13;
        } else if(c.equals("Lime")){
            return 10;
        } else if(c.equals("Yellow")){
            return 11;
        } else if(c.equals("LightBlue")){
            return 12;
        } else if(c.equals("Pink")){
            return 9;
        } else if(c.equals("Orange")){
            return 14;
        } else if(c.equals("White")) {
            return 15;
        } else if (c.equals("Skin16")) {
            return 16;
        } else if (c.equals("Skin17")) {
            return 17;
        } else if (c.equals("Skin18")) {
            return 18;
        } else if (c.equals("Skin19")) {
            return 19;
        } else if (c.equals("Skin20")) {
            return 20;
        } else if (c.equals("Skin21")) {
            return 21;
        } else if (c.equals("Skin22")) {
            return 22;
        } else if (c.equals("Skin23")) {
            return 23;
        } else if (c.equals("Skin24")) {
            return 24;
        } else if (c.equals("Skin25")) {
            return 25;
        } else if (c.equals("Skin26")) {
            return 26;
        } else if (c.equals("Skin27")) {
            return 27;
        } else if (c.equals("Skin28")) {
            return 28;
        } else if (c.equals("Skin29")) {
            return 29;
        } else if (c.equals("Skin30")) {
            return 30;
        } else if (c.equals("Skin31")) {
            return 31;
        } else if (c.equals("Skin32")) {
            return 32;
        } else if (c.equals("Skin33")) {
            return 33;
        } else if (c.equals("Skin34")) {
            return 34;
        } else if (c.equals("Skin35")) {
            return 35;
        } else if (c.equals("Skin36")) {
            return 36;
        } else if (c.equals("Skin37")) {
            return 37;
        } else if (c.equals("Skin38")) {
            return 38;
        } else if (c.equals("Skin39")) {
            return 39;
        } else if (c.equals("Skin40")) {
            return 40;
        } else if (c.equals("Skin41")) {
            return 41;
        } else if (c.equals("Skin42")) {
            return 42;
        } else if (c.equals("Skin43")) {
            return 43;
        } else if (c.equals("Skin44")) {
            return 44;
        } else if (c.equals("Skin45")) {
            return 45;
        } else if (c.equals("Skin46")) {
            return 46;
        } else if (c.equals("Skin47")) {
            return 47;
        } else if (c.equals("Skin48")) {
            return 48;
        } else if (c.equals("Skin49")) {
            return 49;
        } else if (c.equals("Skin50")) {
            return 50;
        } else if (c.equals("Skin51")) {
            return 51;
        } else if (c.equals("Skin52")) {
            return 52;
        } else if (c.equals("Skin53")) {
            return 53;
        } else if (c.equals("Skin54")) {
            return 54;
        } else if (c.equals("Skin55")) {
            return 55;
        } else if (c.equals("Skin56")) {
            return 56;
        } else if (c.equals("Skin57")) {
            return 57;
        } else if (c.equals("Skin58")) {
            return 58;
        } else if (c.equals("Skin59")) {
            return 59;
        } else if (c.equals("Skin60")) {
            return 60;
        } else if (c.equals("Skin61")) {
            return 61;
        } else if (c.equals("Skin62")) {
            return 62;
        } else if (c.equals("Skin63")) {
            return 63;
        } else if (c.equals("Skin64")) {
            return 64;
        } else if (c.equals("Skin65")) {
            return 65;
        } else if (c.equals("Skin66")) {
            return 66;
        } else if (c.equals("Skin67")) {
            return 67;
        } else if (c.equals("Skin68")) {
            return 68;
        } else if (c.equals("Skin69")) {
            return 69;
        } else if(c.equals("Full")){
            return 101;
        } else if (c.equals("Empty")){
            return 100;
        }
        return 0;
    }

    public static int[] getBytesFromColors(String[] c){
        int[] ret = new int[c.length];
        for(int i=0; i<c.length;i++){
            ret[i]=getByteFromColor(c[i]);
        }
        return ret;
    }

    public static float atan2f(double x, double z) {
        float pi = -3.141592653f;
        float multiplier = 1.0f;

        if (z < 0.0d) {
            if (x < 0.0d) {
                z = -z;
                x = -x;
            } else {
                z = -z;
                multiplier = -1.0f;
            }

        } else {
            if (x < 0.0d) {
                x = -x;
                multiplier = -1.0f;
            }

            pi = 0.0f;
        }

        double invDiv = 1.0D / ((Math.max(z, x)) * (1.0D / (ATAN2_SQRT - 1)));
        return (atan2[(int) (x * invDiv) * ATAN2_SQRT + (int) (z * invDiv)] + pi) * multiplier;
    }

    public static float atan2degreesf(double x, double y) {
        return atan2f(x, y) * degreesF;
    }

    private static final int ATAN2_SQRT = (int) Math.sqrt(1024);
    private static final float[] atan2 = new float[1024];

    static {
        for (int i = 0; i < ATAN2_SQRT; i++) {
            for (int j = 0; j < ATAN2_SQRT; j++) {
                atan2[j * ATAN2_SQRT + i] = (float) Math.atan2((float) j / ATAN2_SQRT, (float) i / ATAN2_SQRT);
            }
        }
    }

    public static final float degreesF = (float) (180.0d / Math.PI);
}
