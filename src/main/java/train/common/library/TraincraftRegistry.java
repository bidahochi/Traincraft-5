package train.common.library;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;
import train.client.render.RenderEnum;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.library.sounds.TrainSoundRecord;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TraincraftRegistry
{
    public TraincraftRegistry()
    {

    }

    private List<ITrainRecord> trainRecords = new ArrayList<>();
    private Map<Item, ITrainRecord> trainRecordsByItem = new HashMap<>();

    private Map<Class<?>, ITrainRenderRecord> trainRenderRecords = new HashMap<>();

    /**
     * DO NOT TOUCH THIS
     */
    public static int trainID = 32;
    /**
     *
     * @param item train item record
     * @param trainRecord train record
     * @param trainRenderRecord render record
     * @param mod Instance of mod
     */
    public void RegisterRollingStock(Item item, ITrainRecord trainRecord, ITrainRenderRecord trainRenderRecord, Object mod)
    {
        trainRecordsByItem.put(item, trainRecord);
        trainRecords.add(trainRecord);
        trainRenderRecords.put(trainRenderRecord.getEntityClass(), trainRenderRecord);

        EntityRegistry.registerModEntity(trainRecord.getEntityClass(), trainRecord.getInternalName(), trainID, mod, 512, 1, true);
    }

    public AbstractTrains getEntityWithItem(Item item, World world, double x, double y, double z)
    {
        if (item == null)
        {
            return null;
        }

        ITrainRecord record = getCurrentTrain(item);
        return getEntity(record.getEntityClass(), world, x, y, z);
    }

    public ITrainRecord getCurrentTrain(Item item)
    {
        if(item==null)
        {
            return null;
        }

        for (EnumTrains trains : EnumTrains.values()) {
            if(trains!=null && trains.getItem()!=null && trains.getItem() == item){
                return trains;
            }
        }

        if (trainRecordsByItem.containsKey(item))
        {
            return trainRecordsByItem.get(item);
        }

        for (EnumHeritageTrainsLegacy trains : EnumHeritageTrainsLegacy.values())
        {
            if(trains!=null && trains.getItem()!=null && trains.getItem() == item){
                return trains;
            }
        }

        return null;
    }


    public ITrainRecord getTrainRecord(Class<?> entityClass)
    {
        for (EnumTrains trains : EnumTrains.values()) {
            if (trains.getEntityClass().equals(entityClass))
            {
                return trains;
            }
        }

        for (ITrainRecord trains : trainRecords) {
            if (trains.getEntityClass().equals(entityClass))
            {
                return trains;
            }
        }

        for (EnumHeritageTrainsLegacy trains : EnumHeritageTrainsLegacy.values())
        {
            if (trains.getEntityClass().equals(entityClass))
            {
                return trains;
            }
        }

        return null;
    }

    public ITrainRenderRecord getTrainRenderRecord(Class<?> entityClass)
    {
        for (RenderEnum render : train.client.render.RenderEnum.values())
        {
            if (render.getEntityClass().equals(entityClass))
            {
                return render;
            }
        }

        if (trainRenderRecords.containsKey(entityClass))
        {
            return trainRenderRecords.get(entityClass);
        }

        Traincraft.tcLog.log(Level.ERROR, "ERROR RENDER ENUM IS MISSING FOR " + entityClass.getName());
        return RenderEnum.fallback;
    }

    public AbstractTrains getEntity(Class entityClass, World world)
    {
        try
        {
            return (AbstractTrains) entityClass.getConstructor(World.class).newInstance(world);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public AbstractTrains getEntity(Class entityClass, World world, double x, double y, double z)
    {
        try
        {
            if(world.isRemote)
            {
                entityClass.getConstructor(World.class).newInstance(world);
            } else {
                return (AbstractTrains) entityClass.getConstructor(World.class, double.class, double.class, double.class).newInstance(world, x, y, z);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
