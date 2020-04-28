package com.mod.frostarium.init;

import com.mod.frostarium.entity.EntityArium;
import com.mod.frostarium.models.ModelArium;
import com.mod.frostarium.renders.RenderArium;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderMod
{
    public static void init()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityArium.class, new RenderArium(new ModelArium(), 0.5F));
    }
}
