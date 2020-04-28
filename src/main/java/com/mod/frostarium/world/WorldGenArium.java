package com.mod.frostarium.world;

import java.util.Random;

import com.mod.frostarium.init.BlockMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenArium implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1:
                GenerateNether(world, chunkX * 16, chunkZ * 16, random);
                break;
         
            case 0:
                GenerateOverWorld(world, chunkX * 16, chunkZ * 16, random);
                break;

            case 1:
                GenerateEnd(world, chunkX * 16, chunkZ * 16, random);
                break;
        }
    }
    
    private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance)
    {
        for(int i = 0; i < spawnChance; i++)
        {
            int chunkSize = 16;
            int Xpos = posX + random.nextInt(chunkSize);
            int Ypos = minY + random.nextInt(maxY - minY);
            int Zpos = posZ + random.nextInt(chunkSize);
            
            new WorldGenMinable(block, maxV, blockSpawn).generate(world, random, Xpos, Ypos, Zpos);
        }
    }
    

    private void GenerateNether(World world, int i, int j, Random random)
    {
  
    }

    private void GenerateOverWorld(World world, int i, int j, Random random)
    {
        addOre(BlockMod.block_arium_ore, Blocks.stone, random, world, i, j, 0, 14, 1, 4, 20);
        addOre(BlockMod.block_nuclerium_ore, Blocks.stone, random, world, i, j, 0, 10, 1, 2, 10);
        addOre(BlockMod.block_rubyum_ore, Blocks.stone, random, world, i, j, 0, 12, 1, 3, 15);
        addOre(BlockMod.block_optarium_ore, Blocks.stone, random, world, i, j, 0, 12, 1, 3, 12);
    }

    private void GenerateEnd(World world, int i, int j, Random random)
    {
        
    }
}