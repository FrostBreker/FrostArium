package com.mod.frostarium.biomes;

import com.mod.frostarium.entity.EntityArium;
import com.mod.frostarium.entity.EntityNuclerium;
import com.mod.frostarium.init.BlockMod;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeNuclerium extends BiomeGenBase
{

    public BiomeNuclerium(int p_i1971_1_)
    {
        super(p_i1971_1_);
        this.topBlock = BlockMod.block_nuclerium_grass;
        this.fillerBlock = BlockMod.block_nuclerium_dirt;
        theBiomeDecorator.generateLakes = true;
        theBiomeDecorator.treesPerChunk = 40;
        theBiomeDecorator.flowersPerChunk = 24;
        theBiomeDecorator.grassPerChunk = 32;
        theBiomeDecorator.deadBushPerChunk = 10;
        theBiomeDecorator.mushroomsPerChunk = 10;
        theBiomeDecorator.reedsPerChunk = 10;
        theBiomeDecorator.cactiPerChunk = 10;
        theBiomeDecorator.sandPerChunk = 10;
        waterColorMultiplier = 0x33cc00;
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityNuclerium.class, 100, 4, 4));
        setBiomeName("biomeNuclerium");
        
    }

}
