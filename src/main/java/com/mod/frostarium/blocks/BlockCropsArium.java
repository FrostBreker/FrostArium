package com.mod.frostarium.blocks;

import com.mod.frostarium.init.ItemMod;

import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockCropsArium extends BlockCrops
{
    protected Item func_149866_i()
    {
        return ItemMod.seed_arium;
    }
    
    protected Item func_149865_P()
    {
        return ItemMod.item_nuggets_arium;
    }
}
