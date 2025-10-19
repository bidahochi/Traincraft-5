package train.common.library.register;

import net.minecraft.item.Item;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumTrainType;

public class TrainRecord implements ITrainRecord
{
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
        this.trainType = enumTrainType;
        this.mass = mass;
        this.colors = TraincraftUtil.getBytesFromColors(colors);
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
        this.cargoCapacity = cargoCapacity;
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
                       int brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition)
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

    public TrainRecord(String internalName, Class entityClass, Item item, EnumTrainType enumTrainType, double mass,
                       String[] colors, int guiRenderScale, int cargoCapacity,
                       int brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition, int tankCapacity)
    {
        this(internalName, entityClass, item, enumTrainType, mass, colors, guiRenderScale, cargoCapacity, brakeRate, maxSpeed, MHP, fuelConsumption, heatingTime, accelerationRate, bogieLocoPosition);
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
                       int brakeRate, int maxSpeed, int MHP, int fuelConsumption, int heatingTime, double accelerationRate, double bogieLocoPosition, int tankCapacity,
                       int waterConsumption)
    {
        this(internalName, entityClass, item, enumTrainType, mass, colors, guiRenderScale, cargoCapacity, brakeRate, maxSpeed, MHP, fuelConsumption, heatingTime, accelerationRate, bogieLocoPosition, tankCapacity);
        this.waterConsumption = waterConsumption;
    }

    private final String internalName;
    private Class entityClass;
    private Item item;
    private EnumTrainType trainType;
    private int MHP;
    public int maxSpeed;
    private double mass;
    private int fuelConsumption;
    private int waterConsumption;
    private int heatingTime;
    private double accelerationRate;
    private double brakeRate;
    private int tankCapacity;
    private int[] colors;
    private int guiRenderScale;
    private double bogieLocoPosition;
    private String[] additionnalTooltip;
    private int cargoCapacity;

    public String getInternalName(){
        return this.internalName;
    }

    public Item getItem(){
        return this.item;
    }

    public String getTrainType(){
        return this.trainType.TrainType;
    }

    public int getMHP(){
        return this.MHP;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public double getMass(){
        return this.mass;
    }

    public int getFuelConsumption(){
        return this.fuelConsumption;
    }

    public int getWaterConsumption(){
        return this.waterConsumption;
    }

    public int getHeatingTime(){
        return this.heatingTime;
    }

    public double getAccelerationRate(){
        return this.accelerationRate;
    }

    public double getBrakeRate(){
        return this.brakeRate;
    }

    public int getTankCapacity(){
        return this.tankCapacity;
    }

    public int[] getColors(){
        return this.colors;
    }

    public double getBogieLocoPosition(){
        return this.bogieLocoPosition;
    }


    public Class getEntityClass() {
        return this.entityClass;
    }

    public int getGuiRenderScale(){
        return this.guiRenderScale;
    }

    public String[] getAdditionnalTooltip(){
        return this.additionnalTooltip;
    }

    public void SetAdditionnalTooltip(String[] additionnalTooltip)
    {
        this.additionnalTooltip = additionnalTooltip;
    }


    public int getCargoCapacity(){
        return cargoCapacity;
    }

    @Override
    public String name()
    {
        return this.entityClass.getName();
    }
}
