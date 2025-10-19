/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import train.client.render.models.ModelPassenger6;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.EntityBogie;
import train.common.core.EntityIds;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.rollingStock.passenger.EntityPassengerBlue;
import train.common.entity.zeppelin.EntityZeppelinOneBalloon;
import train.common.entity.zeppelin.EntityZeppelinTwoBalloons;
import train.common.items.TCItems;
import train.common.library.*;
import train.common.library.register.TrainRecord;

public class EntityHandler
{
	public static void init()
	{
		EntityRegistry.registerModEntity(EntityZeppelinTwoBalloons.class, "zeppelin", EntityIds.ZEPPELIN, Traincraft.instance, 512, 1, true);//zepplin
		EntityRegistry.registerModEntity(EntityBogie.class, "Entity Front Bogie", EntityIds.LOCOMOTIVE_BOGIE, Traincraft.instance, 512, 1, true);//front bogie
		EntityRegistry.registerModEntity(EntityZeppelinOneBalloon.class, "zeppelin big", EntityIds.ZEPPELIN_BIG, Traincraft.instance, 512, 1, true);//zepplin big
		EntityRegistry.registerModEntity(EntityRotativeDigger.class, "rotative digger", EntityIds.ROTATIVE_DIGGER, Traincraft.instance, 512, 1, true);
		Traincraft.traincraftRegistry.trainID = 32;

		// Don't forget to add a record to insert the render record
		new RegisterTrains();


		for(EnumHeritageTrainsLegacy trains : EnumHeritageTrainsLegacy.values()){
			EntityRegistry.registerModEntity(trains.getEntityClass(), trains.getInternalName(), Traincraft.traincraftRegistry.trainID, Traincraft.instance, 512, 1, true);
			Traincraft.traincraftRegistry.trainID++;
			if(Traincraft.traincraftRegistry.trainID== 112 || Traincraft.traincraftRegistry.trainID==51 || Traincraft.traincraftRegistry.trainID== 116){
				Traincraft.traincraftRegistry.trainID++;
			}
		}

		for(EnumTrains trains : EnumTrains.values())
		{
			EntityRegistry.registerModEntity(trains.getEntityClass(), trains.getInternalName(), Traincraft.traincraftRegistry.trainID, Traincraft.instance, 512, 1, true);
			Traincraft.traincraftRegistry.trainID++;
			if(Traincraft.traincraftRegistry.trainID== 112 || Traincraft.traincraftRegistry.trainID==51 || Traincraft.traincraftRegistry.trainID== 116){
				Traincraft.traincraftRegistry.trainID++;
			}
		}
	}
}