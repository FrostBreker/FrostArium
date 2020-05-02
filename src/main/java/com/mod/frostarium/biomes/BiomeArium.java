package com.mod.frostarium.biomes;

import java.util.ArrayList;
import java.util.Random;

import com.mod.frostarium.entity.EntityArium;
import com.mod.frostarium.init.BlockMod;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenSwamp;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeArium extends BiomeGenBase
{
    
    public static BiomeGenBase biome;

    public BiomeArium(int p_i1971_1_)
    {
        super(p_i1971_1_);
        setBiomeName("biomeArium");
        this.topBlock = BlockMod.block_arium_grass;
        this.fillerBlock = BlockMod.block_arium_dirt;
        this.enableSnow = false;
        this.enableRain = true;
        this.spawnableMonsterList.add(new SpawnListEntry(EntityArium.class, 50, 2, 6));
        this.heightVariation = height_Default.variation;
        this.worldGeneratorTrees = new WorldGenTrees(true);
        this.worldGeneratorBigTree = new WorldGenBigTree(true);
        this.addDefaultFlowers();
        
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityArium.class, 100, 4, 4));
    }
    
    public void decorate(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_)
    {
        this.theBiomeDecorator.decorateChunk(p_76728_1_, p_76728_2_, this, p_76728_3_, p_76728_4_);
    }
    
    
}
