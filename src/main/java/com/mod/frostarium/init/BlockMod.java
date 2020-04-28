package com.mod.frostarium.init;

import com.mod.frostarium.ModFrostArium;
import com.mod.frostarium.Reference;
import com.mod.frostarium.blocks.BlockBasic;
import com.mod.frostarium.items.BlockGrass;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

public class BlockMod
{
    public static Block block_arium_block, block_green_screen, block_arium_ore, block_nuclerium_block, block_nuclerium_ore, block_rubyum_block, block_rubyum_ore, block_optarium_block, block_optarium_ore;
    public static Block block_arium_grass, block_arium_dirt, block_test;
    
    public static void init()
    {
        //arium
        block_arium_block = new BlockBasic(Material.rock).setBlockName("block_arium_block").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":arium_block_frostarium").setHardness(10.0F);
        block_arium_ore = new BlockBasic(Material.rock).setBlockName("block_arium_ore").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":arium_ore_frostarium").setHardness(6.0F);
        
//Divers        
        block_green_screen = new BlockBasic(Material.rock).setBlockName("block_green_screen").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":green_screen").setHardness(2.0F).setLightLevel(50);
        block_arium_grass = new BlockGrass(Material.grass).setBlockName("block_arium_grass").setCreativeTab(ModFrostArium.tabFrostArium).setHardness(2.0F);
        block_arium_dirt = new BlockBasic(Material.grass).setBlockName("block_arium_dirt").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":dirt_arium_frostarium").setHardness(1.0F);
        block_test = new BlockBasic(Material.sand).setBlockName("block_block_test").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":block_test").setHardness(2.0F);
        
        
//nuclerium        
        block_nuclerium_block = new BlockBasic(Material.rock).setBlockName("block_nuclerium_block").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":nuclerium_block_frostarium").setHardness(10.0F);
        block_nuclerium_ore = new BlockBasic(Material.rock).setBlockName("block_nuclerium_ore").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":nuclerium_ore_frostarium").setHardness(6.0F);
        
      //rubyum
        block_rubyum_block = new BlockBasic(Material.rock).setBlockName("block_rubyum_block").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":rubyum_block_frostarium").setHardness(10.0F);
        block_rubyum_ore = new BlockBasic(Material.rock).setBlockName("block_rubyum_ore").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":rubyum_ore_frostarium").setHardness(6.0F);
    //optarium
        block_optarium_block = new BlockBasic(Material.rock).setBlockName("block_optarium_block").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":optarium_block_frostarium").setHardness(10.0F);
        block_optarium_ore = new BlockBasic(Material.rock).setBlockName("block_optarium_ore").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":optarium_ore_frostarium").setHardness(6.0F);
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(block_arium_block, block_arium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_green_screen, block_green_screen.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_ore, block_arium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_block, block_nuclerium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_ore, block_nuclerium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_rubyum_block, block_rubyum_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_rubyum_ore, block_rubyum_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_optarium_block, block_optarium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_optarium_ore, block_optarium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_grass, block_arium_grass.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_dirt, block_arium_dirt.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_test, block_test.getUnlocalizedName().substring(5));
        
        //block_minerais
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_arium_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_ingot_arium});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_nuclerium_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_ingot_nuclerium});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_rubyum_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_ingot_rubyum});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_optarium_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_ingot_optarium});
        
        //divers
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_green_screen, 8), new Object[] {"#F#", "F#F", "#F#", '#', Items.slime_ball, 'F', Items.glowstone_dust});
        
        //furnace
        GameRegistry.addSmelting(BlockMod.block_arium_ore, new ItemStack(ItemMod.item_ingot_arium, 1), 1224F);
        GameRegistry.addSmelting(BlockMod.block_nuclerium_ore, new ItemStack(ItemMod.item_ingot_nuclerium, 1), 1624F);
        GameRegistry.addSmelting(BlockMod.block_rubyum_ore, new ItemStack(ItemMod.item_ingot_rubyum, 1), 1324F);
        GameRegistry.addSmelting(BlockMod.block_optarium_ore, new ItemStack(ItemMod.item_ingot_optarium, 1), 1424F);
    }
}
