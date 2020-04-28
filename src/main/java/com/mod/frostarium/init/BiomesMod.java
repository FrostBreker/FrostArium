package com.mod.frostarium.init;

import com.mod.frostarium.biomes.BiomeArium;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomesMod
{
    public static void init()
    {
        BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(new BiomeArium(100), 100));
    }

}
