package com.mod.frostarium.init;

import com.mod.frostarium.entity.EntityArium;
import com.mod.frostarium.handlers.EntityHandler;

public class EntityMod
{
    public static void init()
    {
        EntityHandler.registerMonster(EntityArium.class, "MobArium");
    }
}
