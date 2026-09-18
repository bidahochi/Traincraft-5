package train.common.library;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ModContainer;
import train.common.appearance.StockLightingIdentity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;
import train.client.render.RenderEnum;
import train.client.render.register.ITrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.library.register.ITrainRecord;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class TraincraftRegistry
{
    public TraincraftRegistry()
    {

    }

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
     * @param mod Instance of mod
     */
    public void RegisterRollingStockEntity(Item item, ITrainRecord trainRecord, Object mod)
    {
        trainRecordsByItem.put(item, trainRecord);

        int id = incrementTrainID();

        registerModEntity(trainRecord, id, mod);
    }

    public void RegisterRollingStockEntities(Map<Item, ITrainRecord> entries, Object mod)
    {
        RegisterRollingStockEntities(entries, mod, null);
    }

    /** Registers a content group under one namespace without changing entity registry names. */
    public void RegisterRollingStockEntities(Map<Item, ITrainRecord> entries, Object mod, String contentNamespace)
    {
        trainRecordsByItem.putAll(entries);

        for (Map.Entry<Item, ITrainRecord> entry : entries.entrySet())
        {
            int id = incrementTrainID();
            if (contentNamespace != null)
            {
                StockLightingIdentity.register(entry.getValue(), contentNamespace);
            }
            registerModEntity(entry.getValue(), id, mod);
        }
    }

    private void registerModEntity(ITrainRecord trainRecord, int entityID, Object mod)
    {
        ModContainer container = FMLCommonHandler.instance().findContainerFor(mod);
        if (container != null)
        {
            StockLightingIdentity.registerIfAbsent(trainRecord, container.getModId());
        }
        EntityRegistry.registerModEntity(trainRecord.getEntityClass(), trainRecord.getInternalName(), entityID, mod, 512, 1, true);
    }

    public final int incrementTrainID()
    {
        trainID++;
        if (Traincraft.traincraftRegistry.trainID== 112 || Traincraft.traincraftRegistry.trainID==51 || Traincraft.traincraftRegistry.trainID== 116)
        {
            trainID++;
        }

        return trainID;
    }

    /**
     * DO NOT CALL THIS FROM THE SERVER SIDE
     * @param trainRenderRecord
     */
    public void RegisterRollingStockModel(ITrainRenderRecord trainRenderRecord)
    {
        if (trainRenderRecords.containsKey(trainRenderRecord.getEntityClass()) == false)
        {
            trainRenderRecords.put(trainRenderRecord.getEntityClass(), trainRenderRecord);
        }
        else
        {
            Traincraft.tcLog.fatal("ERROR: YOU HAVE ATTEMPTED TO INSERT A DUPLICATE RENDER RECORD " + trainRenderRecord.getEntityClass().getName());
        }
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

    public HashMap<Item, ITrainRecord> getAllTrains()
    {

        HashMap<Item, ITrainRecord> trainRecords = new HashMap<>(trainRecordsByItem);

        return trainRecords;
    }

    public ITrainRecord getCurrentTrain(Item item)
    {
        if(item== null)
        {
            return null;
        }

        if (trainRecordsByItem.containsKey(item))
        {
            return trainRecordsByItem.get(item);
        }

        return null;
    }


    public ITrainRecord getTrainRecord(Class<?> entityClass)
    {

        for (ITrainRecord trains : trainRecordsByItem.values()) {
            if (trains.getEntityClass().equals(entityClass))
            {
                return trains;
            }
        }

        return null;
    }

    public ITrainRenderRecord getTrainRenderRecord(Class<?> entityClass, AbstractTrains trainInstance)
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

        if (trainInstance != null)
        {
            trainInstance.onRenderInsertRecord();
            if (trainRenderRecords.containsKey(entityClass))
            {
                return trainRenderRecords.get(entityClass);
            }
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
                return (AbstractTrains) entityClass.getConstructor(World.class).newInstance(world);
            }
            else
            {
                AbstractTrains abstractTrains = (AbstractTrains) entityClass.getConstructor(World.class).newInstance(world);
                abstractTrains.SetupRollingStockSpawn(x, y, z);
                return abstractTrains;
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
