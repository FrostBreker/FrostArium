package com.mod.frostarium.init;

import java.util.Random;

import net.minecraft.world.World;



public class StructureGenMod
{
    private static final String StructureArium = "StructureArium";
    
    public boolean generate(String string, World world, Random random, int x, int y, int z)
    {
        switch(string)
        {
            case StructureArium:
                com.mod.frostarium.structures.StructureArium.init(world, x, y, z);
                break;    
        }
         
        
        return true;
    }
    
    private static final String StructureNuclerium = "StructureNuclerium";
    
        public boolean generate1(String string, World world, Random random, int x, int y, int z)
        {
            switch(string)
            {
                case StructureNuclerium:
                    com.mod.frostarium.structures.StructureNuclerium.init(world, x, y, z);
                    break;    
            }
         
        
            return true;
        }
}

