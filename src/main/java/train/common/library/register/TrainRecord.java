package train.common.library.register;

import net.minecraft.item.Item;
import train.common.enums.InventorySize;
import train.common.library.EnumTrainType;
import train.common.appearance.LegacySkinMapping;

public class TrainRecord implements ITrainRecord
{
    private String stockId;

    /** Returns the explicit local resource identity, or null to use the internal-name convention. */
    @Override
    public String getStockId()
    {
        return stockId;
    }

    /** Assigns a stable local ID before registration; the registering content supplies its namespace. */
    public TrainRecord setStockId(String stockId)
    {
        if (stockId != null)
        {
            LegacySkinMapping.requireId("stock:" + stockId);
        }
        this.stockId = stockId;
        return this;
    }

    /**
     * Only used for
     * 1. Passenger Cars
     * 2. Standard Workcarts - Cabooses(Without Inventory Space)
     * @param internalName
     * @param entityClass
     * @param item
     * @param enumTrainType
     * @param mass
     */
    public TrainRecord(String internalName, Class entityClass, Item item, EnumTrainType enumTrainType, double mass,
                       String[] colors, int guiRenderScale)
    {
        this.internalName = internalName;
        this.entityClass = entityClass;
        this.item = item;
        this.trainType = enumTrainType.TrainType;
        this.mass = mass;
        this.colors = getBytesFromColors(colors);
        this.guiRenderScale = guiRenderScale;
    }

    public TrainRecord(String internalName, Class entityClass, Item item, String trainType, double mass,
                       String[] colors, int guiRenderScale)
    {
        this.internalName = internalName;
        this.entityClass = entityClass;
        this.item = item;
        this.trainType = trainType;
        this.mass = mass;
        this.colors = getBytesFromColors(colors);
        this.guiRenderScale = guiRenderScale;
    }

    /**
     * Only used for
     * 1. Passengers cars with internal inventory space
     * 2. Freight cars
     * 3. Workcarts - Cabooses(With Inventory Space)
     * @param internalName
     * @param entityClass
     * @param item
     * @param enumTrainType
     * @param mass
     * @param cargoCapacity
     */
    public TrainRecord(String internalName, Class entityClass, Item item, EnumTrainType enumTrainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity)
    {
        this(internalName, entityClass, item, enumTrainType, mass, colors, guiRenderScale);
        this.cargoCapacity = (byte) Math.min(128, cargoCapacity);
    }

    public TrainRecord(String internalName, Class entityClass, Item item, String trainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity)
    {
        this(internalName, entityClass, item, trainType, mass, colors, guiRenderScale);
        this.cargoCapacity = (byte) Math.min(128, cargoCapacity);
    }

    /**
     * Used for Electric Locomotives
     * @param internalName
     * @param entityClass
     * @param item
     * @param enumTrainType
     * @param maxSpeed
     * @param mass
     * @param brakeRate
     * @param colors
     * @param guiRenderScale
     */
    public TrainRecord(String internalName, Class entityClass, Item item, EnumTrainType enumTrainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity,
                       double brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition)
    {
        this(internalName, entityClass, item, enumTrainType, mass, colors, guiRenderScale, cargoCapacity);
        this.maxSpeed = maxSpeed;
        this.brakeRate = brakeRate;
        this.MHP = MHP;
        this.fuelConsumption = fuelConsumption;
        this.heatingTime = heatingTime;
        this.accelerationRate = accelerationRate;
        this.bogieLocoPosition = bogieLocoPosition;
    }

    public TrainRecord(String internalName, Class entityClass, Item item, String trainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity,
                       double brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition)
    {
        this(internalName, entityClass, item, trainType, mass, colors, guiRenderScale, cargoCapacity);
        this.maxSpeed = maxSpeed;
        this.brakeRate = brakeRate;
        this.MHP = MHP;
        this.fuelConsumption = fuelConsumption;
        this.heatingTime = heatingTime;
        this.accelerationRate = accelerationRate;
        this.bogieLocoPosition = bogieLocoPosition;
    }

    public TrainRecord(String internalName, Class entityClass, Item item, EnumTrainType enumTrainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity,
                       double brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition, int tankCapacity)
    {
        this(internalName, entityClass, item, enumTrainType, mass, colors, guiRenderScale, cargoCapacity, brakeRate, maxSpeed, MHP, fuelConsumption, heatingTime, accelerationRate, bogieLocoPosition);
        this.tankCapacity = tankCapacity;
    }

    public TrainRecord(String internalName, Class entityClass, Item item, String trainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity,
                       double brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition, int tankCapacity)
    {
        this(internalName, entityClass, item, trainType, mass, colors, guiRenderScale, cargoCapacity, brakeRate, maxSpeed, MHP, fuelConsumption, heatingTime, accelerationRate, bogieLocoPosition);
        this.tankCapacity = tankCapacity;
    }

    /**
     * Used for Steam Locomotives
     * @param internalName
     * @param entityClass
     * @param item
     * @param enumTrainType
     * @param mass
     * @param colors
     * @param guiRenderScale
     * @param cargoCapacity
     * @param brakeRate
     * @param maxSpeed
     * @param MHP
     * @param fuelConsumption
     * @param heatingTime
     * @param accelerationRate
     * @param tankCapacity
     * @param bogieLocoPosition
     * @param waterConsumption
     */
    public TrainRecord(String internalName, Class entityClass, Item item, EnumTrainType enumTrainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity,
                       double brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition, int tankCapacity,
                       int waterConsumption)
    {
        this(internalName, entityClass, item, enumTrainType, mass, colors, guiRenderScale, cargoCapacity, brakeRate, maxSpeed, MHP, fuelConsumption, heatingTime, accelerationRate, bogieLocoPosition, tankCapacity);
        this.waterConsumption = waterConsumption;
    }

    public TrainRecord(String internalName, Class entityClass, Item item, String trainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity,
                       double brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition, int tankCapacity,
                       int waterConsumption)
    {
        this(internalName, entityClass, item, trainType, mass, colors, guiRenderScale, cargoCapacity, brakeRate, maxSpeed, MHP, fuelConsumption, heatingTime, accelerationRate, bogieLocoPosition, tankCapacity);
        this.waterConsumption = waterConsumption;
    }

    /**
     * Used for segmented implementation
     * @param internalName
     */
    public TrainRecord(String internalName) { this.internalName = internalName; }

    public TrainRecord(String internalName, Class entityClass, Item item) { this.internalName = internalName; this.entityClass = entityClass; this.item = item; }

    private final String internalName;
    private Class entityClass;
    private Item item;
    private String trainType;
    private int MHP;
    public int maxSpeed;
    private double mass;
    private int fuelConsumption;
    private int waterConsumption;
    private int heatingTime;
    private double accelerationRate;
    private double brakeRate;
    private int tankCapacity;
    private int secondaryTankCapacity;

    private int[] colors;
    private int guiRenderScale;
    private double bogieLocoPosition;
    private String[] additionalTooltip;
    private byte cargoCapacity;

    public String getInternalName() { return this.internalName; }

    public Item getItem() { return this.item; }
    public TrainRecord setItem(Item item) { this.item = item; return this; }

    public String getTrainType() { return trainType; }
    public TrainRecord setTrainType(String type) { this.trainType = type; return this; }
    public TrainRecord setTrainType(EnumTrainType type) { this.trainType = type.TrainType; return this; }

    public int getMHP() { return this.MHP; }

    public TrainRecord setMHP(int mhp) { this.MHP = mhp; return this; }

    public int getMaxSpeed() { return this.maxSpeed; }
    public TrainRecord setMaxSpeed(int speed) { this.maxSpeed = speed; return this; }

    public double getMass() { return this.mass; }
    public TrainRecord setMass(double mass) { this.mass = mass; return this; }

    public int getFuelConsumption() { return this.fuelConsumption; }
    public TrainRecord setFuelConsumption(int consumption) { this.fuelConsumption = consumption; return this; }


    public int getWaterConsumption() { return this.waterConsumption; }

    public TrainRecord setWaterConsumption(int consumption) {this.waterConsumption = consumption; return this; }

    public int getHeatingTime() { return this.heatingTime; }
    public TrainRecord setHeatingTime (int heatingTime) { this.heatingTime = heatingTime; return this; }

    public double getAccelerationRate() { return this.accelerationRate; }
    public TrainRecord setAccelerationRate(double rate) { this.accelerationRate = rate; return this; }

    public double getBrakeRate() { return this.brakeRate; }
    public TrainRecord setBrakeRate(double rate) { this.brakeRate = rate; return this; }

    public int getTankCapacity() { return this.tankCapacity; }

    public TrainRecord setTankCapacity(int capacity) { this.tankCapacity = capacity; return this; }

    public int getSecondaryTankCapacity() { return this.secondaryTankCapacity; }

    public TrainRecord setSecondaryCapacity(int capacity) { this.secondaryTankCapacity = capacity; return this; }

    public int[] getColors() { return this.colors; }
    public TrainRecord setColors(String[] colors) { this.colors = getBytesFromColors(colors); return this; }

    public double getBogieLocoPosition() { return this.bogieLocoPosition; }
    public TrainRecord setBogieLocoPosition(double offset) { this.bogieLocoPosition = offset; return this; }

    public Class getEntityClass() { return this.entityClass; }
    public TrainRecord setEntityClass(Class entity) { this.entityClass = entity; return this; }

    public int getGuiRenderScale() { return this.guiRenderScale; }
    public TrainRecord setGuiRenderScale(int scale) { this.guiRenderScale = scale; return this; }

    public String[] getAdditionalTooltip() { return this.additionalTooltip; }

    /**
     * @deprecated use the lowercase version Correct Method -> setAdditionalTooltip
     */
    @Deprecated
    public TrainRecord SetAdditionalTooltip(String[] additionalTooltip) { this.additionalTooltip = additionalTooltip; return this; }

    public TrainRecord setAdditionalTooltip(String[] additionalTooltip) { this.additionalTooltip = additionalTooltip; return this; }

    public int getCargoCapacity() { return cargoCapacity; }

    /*
        USE setCargoCapacity(InventorySize inventorySize)
     */
    public TrainRecord setCargoCapacity(int capacity)
    {
        this.cargoCapacity = (byte) Math.min(128, capacity); return this;
    }

    public TrainRecord setCargoCapacity(InventorySize inventorySize)
    {
        switch (inventorySize)
        {
            case STYLE_PROFILE_0x0:
                cargoCapacity = 0;
                break;
            case STYLE_PROFILE_1x9:
                cargoCapacity = 9;
                break;
            case STYLE_PROFILE_2x9:
                cargoCapacity = 18;
                break;
            case STYLE_PROFILE_3x9:
                cargoCapacity = 27;
                break;
            case STYLE_PROFILE_4x9:
                cargoCapacity = 36;
                break;
            case STYLE_PROFILE_5x9:
                cargoCapacity = 45;
                break;
            case STYLE_PROFILE_6x9:
                cargoCapacity = 54;
                break;
        }

        return this;
    }

    @Override
    public String name() { return this.entityClass.getName(); }

    private static int[] getBytesFromColors(String[] c){
        int[] ret = new int[c.length];
        for(int i=0; i<c.length;i++){
            ret[i]=getByteFromColor(c[i]);
        }
        return ret;
    }

    public static int getByteFromColor(String color)
    {
        switch (color)
        {
            case "Black":
                return 0;
            case "Red":
                return 1;
            case "Green":
                return 2;
            case "Brown":
                return 3;
            case "Blue":
                return 4;
            case "Purple":
                return 5;
            case "Cyan":
                return 6;
            case "LightGrey":
                return 7;
            case "Grey":
                return 8;
            case "Magenta":
                return 13;
            case "Lime":
                return 10;
            case "Yellow":
                return 11;
            case "LightBlue":
                return 12;
            case "Pink":
                return 9;
            case "Orange":
                return 14;
            case "White":
                return 15;
            default:
            {
                if (color.startsWith("Skin"))
                {
                    return Integer.parseInt(color.substring(4));
                }
            }
        }

        if (color.equals("Empty"))
        {
            return 100;
        }
        if (color.equals("Full"))
        {
            return 101;
        }
        return 0;
    }
}
