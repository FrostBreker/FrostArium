package com.mod.frostarium.handlers;

import java.awt.Color;
import java.util.Random;

import com.mod.frostarium.ModFrostArium;
import com.mod.frostarium.biomes.BiomeArium;
import com.mod.frostarium.init.BiomesMod;


import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager.BiomeEntry;

public class EntityHandler
{

    public static void registerMonster(Class entityClass, String string)
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        
        EntityRegistry.registerGlobalEntityID(entityClass, string, EntityRegistry.findGlobalUniqueEntityId(), new Color(10, 80, 206).getRGB(), new Color(254, 254, 255).getRGB());
        EntityRegistry.addSpawn(string, 50, 4, 10, EnumCreatureType.monster, BiomeGenBase.ocean);
        EntityRegistry.registerModEntity(entityClass, string, entityID, ModFrostArium.instance, 64, 1, true);
       
    }
    
    public static void registerMonster1(Class entityClass, String string)
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        
        EntityRegistry.registerGlobalEntityID(entityClass, string, EntityRegistry.findGlobalUniqueEntityId(), new Color(32, 255, 0).getRGB(), new Color(254, 254, 255).getRGB());
        EntityRegistry.addSpawn(string, 30, 2, 5, EnumCreatureType.monster, BiomeGenBase.ocean);
        EntityRegistry.registerModEntity(entityClass, string, entityID, ModFrostArium.instance, 64, 1, true);
    }
    
   
}
