package com.mod.frostarium.init;

import com.mod.frostarium.entity.EntityArium;
import com.mod.frostarium.entity.EntityNuclerium;
import com.mod.frostarium.handlers.EntityHandler;

public class EntityMod
{
    public static void init()
    {
        EntityHandler.registerMonster(EntityArium.class, "MobArium");
        EntityHandler.registerMonster1(EntityNuclerium.class, "MobNuclerium");
    }
}
