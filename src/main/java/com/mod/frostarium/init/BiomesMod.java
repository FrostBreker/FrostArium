package com.mod.frostarium.init;

import com.mod.frostarium.biomes.BiomeArium;
import com.mod.frostarium.biomes.BiomeNuclerium;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomesMod
{
    public static void init()
    {
        BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(new BiomeArium(100), 50));
        BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(new BiomeNuclerium(101), 30));
    }

}
