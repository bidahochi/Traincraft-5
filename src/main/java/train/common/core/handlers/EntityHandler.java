/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.registry.EntityRegistry;
import train.common.Traincraft;
import train.common.api.EntityBogie;
import train.common.core.EntityIds;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.zeppelin.EntityZeppelinOneBalloon;
import train.common.entity.zeppelin.EntityZeppelinTwoBalloons;
import train.common.library.*;

public class EntityHandler
{
	public EntityHandler()
	{
		EntityRegistry.registerModEntity(EntityZeppelinTwoBalloons.class, "zeppelin", EntityIds.ZEPPELIN, Traincraft.instance, 512, 1, true);//zepplin
		EntityRegistry.registerModEntity(EntityBogie.class, "Entity Front Bogie", EntityIds.LOCOMOTIVE_BOGIE, Traincraft.instance, 512, 1, true);//front bogie
		EntityRegistry.registerModEntity(EntityZeppelinOneBalloon.class, "zeppelin big", EntityIds.ZEPPELIN_BIG, Traincraft.instance, 512, 1, true);//zepplin big
		EntityRegistry.registerModEntity(EntityRotativeDigger.class, "rotative digger", EntityIds.ROTATIVE_DIGGER, Traincraft.instance, 512, 1, true);

		// Don't forget to add a record to insert the render record
		new RegisterTrains();

		for(EnumTrains trains : EnumTrains.values())
		{
			int id = Traincraft.traincraftRegistry.incrementTrainID();
			EntityRegistry.registerModEntity(trains.getEntityClass(), trains.getInternalName(), id, Traincraft.instance, 512, 1, true);
		}
	}
}