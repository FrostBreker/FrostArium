package com.mod.frostarium.structures;

import com.mod.frostarium.init.BlockMod;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class StructureNuclerium
{
    public static void init(World world, int x, int y, int z)
    {
        if(world.getBlock(x, y-1, z) == BlockMod.block_nuclerium_grass && world.getBlock(x, y+7,z) == Blocks.air)
        {
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+1, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+2, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+3, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+4, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+5, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+6, z, BlockMod.block_nuclerium_leaves);
           //X Pos 
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+1, y+1, z, Blocks.air);
            world.setBlock(x+1, y+2, z, Blocks.air);
            world.setBlock(x+1, y+3, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+1, y+4, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+1, y+5, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+1, y+6, z, BlockMod.block_nuclerium_leaves);
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+2, y+1, z, Blocks.air);
            world.setBlock(x+2, y+2, z, Blocks.air);
            world.setBlock(x+2, y+3, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+2, y+4, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+2, y+5, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y, z, BlockMod.block_nuclerium_leaves);
          //X Neg  
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-1, y+1, z, Blocks.air);
            world.setBlock(x+-1, y+2, z, Blocks.air);
            world.setBlock(x+-1, y+3, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-1, y+4, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-1, y+5, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-1, y+6, z, BlockMod.block_nuclerium_leaves);
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-2, y+1, z, Blocks.air);
            world.setBlock(x+-2, y+2, z, Blocks.air);
            world.setBlock(x+-2, y+3, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-2, y+4, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-2, y+5, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y, z, BlockMod.block_nuclerium_leaves);
          //X Neg Neg  
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-1, y+1, z+-1, Blocks.air);
            world.setBlock(x+-1, y+2, z+-1, Blocks.air);
            world.setBlock(x+-1, y+3, z+-1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-1, y+4, z+-1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-1, y+5, z+-1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y, z, BlockMod.block_nuclerium_leaves);
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-2, y+1, z+-2, Blocks.air);
            world.setBlock(x+-2, y+2, z+-2, Blocks.air);
            world.setBlock(x+-2, y+3, z+-2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-2, y+4, z+-2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y, z, BlockMod.block_nuclerium_leaves);
          //X Pos Pos  
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+1, y+1, z+1, Blocks.air);
            world.setBlock(x+1, y+2, z+1, Blocks.air);
            world.setBlock(x+1, y+3, z+1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+1, y+4, z+1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+1, y+5, z+1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+1, y+6, z+1, BlockMod.block_nuclerium_leaves);
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+2, y+1, z+2, Blocks.air);
            world.setBlock(x+2, y+2, z+2, Blocks.air);
            world.setBlock(x+2, y+3, z+2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y, z, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y, z, BlockMod.block_nuclerium_leaves);
         //X NEg Pos et Pos Neg
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-1, y+1, z+1, Blocks.air);
            world.setBlock(x+-1, y+2, z+1, Blocks.air);
            world.setBlock(x+-1, y+3, z+1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-1, y+4, z+1, BlockMod.block_nuclerium_leaves);
            
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-2, y+1, z+2, Blocks.air);
            world.setBlock(x+-2, y+2, z+2, Blocks.air);
            world.setBlock(x+-2, y+3, z+2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+-2, y+4, z+2, BlockMod.block_nuclerium_leaves);
            
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+1, y+1, z+-1, Blocks.air);
            world.setBlock(x+1, y+2, z+-1, Blocks.air);
            world.setBlock(x+1, y+3, z+-1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+1, y+4, z+-1, BlockMod.block_nuclerium_leaves);
           
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+2, y+1, z+-2, Blocks.air);
            world.setBlock(x+2, y+2, z+-2, Blocks.air);
            world.setBlock(x+2, y+3, z+-2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x+2, y+4, z+-2, BlockMod.block_nuclerium_leaves);
           
            
            //Z Pos  
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+1, z+1, Blocks.air);
            world.setBlock(x, y+2, z+1, Blocks.air);
            world.setBlock(x, y+3, z+1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+4, z+1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+5, z+1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+6, z+1, BlockMod.block_nuclerium_leaves);
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+1, z+2, Blocks.air);
            world.setBlock(x, y+2, z+2, Blocks.air);
            world.setBlock(x, y+3, z+2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+4, z+2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+5, z+2, BlockMod.block_nuclerium_leaves);
           
           //Z Neg 
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+1, z+-1, Blocks.air);
            world.setBlock(x, y+2, z+-1, Blocks.air);
            world.setBlock(x, y+3, z+-1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+4, z+-1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+5, z+-1, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+6, z+-1, BlockMod.block_nuclerium_leaves);
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x, y+1, z+-2, Blocks.air);
            world.setBlock(x, y+2, z+-2, Blocks.air);
            world.setBlock(x, y+3, z+-2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+4, z+-2, BlockMod.block_nuclerium_leaves);
            world.setBlock(x, y+5, z+-2, BlockMod.block_nuclerium_leaves);
            
          //Z Neg Pos  
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-1, y+1, z+-1, Blocks.air);
            world.setBlock(x+-1, y+2, z+-1, Blocks.air);
          //  world.setBlock(x+-1, y+3, z+-1, BlockMod.block_arium_leaves);
          //  world.setBlock(x+-1, y+4, z+-1, BlockMod.block_arium_leaves);
            
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-2, y+1, z+-2, Blocks.air);
            world.setBlock(x+-2, y+2, z+-2, Blocks.air);
          //  world.setBlock(x+-2, y+3, z+-2, BlockMod.block_arium_leaves);
          //  world.setBlock(x+-2, y+4, z+-2, BlockMod.block_arium_leaves);
            
          //Neg Neg Et Pos Pos  
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+1, y+1, z+1, Blocks.air);
            world.setBlock(x+1, y+2, z+1, Blocks.air);
           // world.setBlock(x+1, y+3, z+1, BlockMod.block_arium_leaves);
           // world.setBlock(x+1, y+4, z+1, BlockMod.block_arium_leaves);
            
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+2, y+1, z+2, Blocks.air);
            world.setBlock(x+2, y+2, z+2, Blocks.air);
           // world.setBlock(x+2, y+3, z+2, BlockMod.block_arium_leaves);
           // world.setBlock(x+2, y+4, z+2, BlockMod.block_arium_leaves);
            
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-1, y+1, z+1, Blocks.air);
            world.setBlock(x+-1, y+2, z+1, Blocks.air);
          //  world.setBlock(x+-1, y+3, z+1, BlockMod.block_arium_leaves);
          //  world.setBlock(x+-1, y+4, z+1, BlockMod.block_arium_leaves);
            
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+-2, y+1, z+2, Blocks.air);
            world.setBlock(x+-2, y+2, z+2, Blocks.air);
          //  world.setBlock(x+-2, y+3, z+2, BlockMod.block_arium_leaves);
          //  world.setBlock(x+-2, y+4, z+2, BlockMod.block_arium_leaves);
            
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+1, y+1, z+-1, Blocks.air);
            world.setBlock(x+1, y+2, z+-1, Blocks.air);
          //  world.setBlock(x+1, y+3, z+-1, BlockMod.block_arium_leaves);
          //  world.setBlock(x+1, y+4, z+-1, BlockMod.block_arium_leaves);
            
            
            world.setBlock(x, y, z, BlockMod.block_nuclerium_wood);
            world.setBlock(x+2, y+1, z+-2, Blocks.air);
            world.setBlock(x+2, y+2, z+-2, Blocks.air);
           // world.setBlock(x+2, y+3, z+-2, BlockMod.block_arium_leaves);
           // world.setBlock(x+2, y+4, z+-2, BlockMod.block_arium_leaves);
            
        }
        
    }

}
