package com.mod.frostarium.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister
{
    public static void mainRegistry()
    {
        registerWorldGen(new WorldGenArium(), -1);
        registerWorldGen(new WorldGenArium(), 0);
        registerWorldGen(new WorldGenArium(), 1);
    }
    
    public static void registerWorldGen(IWorldGenerator iGenerator, int probability)
    {
        GameRegistry.registerWorldGenerator(iGenerator, probability);
    }
}
