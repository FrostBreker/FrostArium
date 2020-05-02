package com.mod.frostarium.init;

import com.mod.frostarium.ModFrostArium;
import com.mod.frostarium.Reference;
import com.mod.frostarium.blocks.BlockNucleriumPlanks;
import com.mod.frostarium.blocks.AriumChestBlock;
import com.mod.frostarium.blocks.BlockAriumLeaves;
import com.mod.frostarium.blocks.BlockAriumPlanks;
import com.mod.frostarium.blocks.BlockAriumWood;
import com.mod.frostarium.blocks.BlockBasic;
import com.mod.frostarium.blocks.BlockCropsArium;
import com.mod.frostarium.blocks.BlockDirtNuclerium;
import com.mod.frostarium.blocks.BlockGrassNuclerium;
import com.mod.frostarium.blocks.BlockInvisbleBlock;
import com.mod.frostarium.blocks.BlockNucleriumLeaves;
import com.mod.frostarium.blocks.BlockNucleriumWood;
import com.mod.frostarium.items.BlockDirt;
import com.mod.frostarium.items.BlockGrass;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.BlockLeavesBase;
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
    public static Block block_green_screen, block_arium_block, block_arium_ore, block_nuclerium_block, block_nuclerium_ore, block_rubyum_block, block_rubyum_ore, block_optarium_block, block_optarium_ore;
    public static Block block_arium_grass, block_arium_dirt, block_test, block_arium_wood, block_arium_planks, block_arium_leaves, block_nuclerium_wood, block_nuclerium_planks, block_nuclerium_leaves, block_arium_sapling;
    public static Block block_nuclerium_grass, block_nuclerium_dirt;
    public static Block block_invisble_block;
    public static Block AriumChestBlock;
    public static Block culture_arium;
    
    
    public static void init()
    {
        //arium
        block_arium_block = new BlockBasic(Material.rock).setBlockName("block_arium_block").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":arium_block_frostarium").setHardness(10.0F);
        block_arium_ore = new BlockBasic(Material.rock).setBlockName("block_arium_ore").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":arium_ore_frostarium").setHardness(6.0F);
        
//Divers        
        block_green_screen = new BlockBasic(Material.rock).setBlockName("block_green_screen").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":green_screen").setHardness(2.0F).setLightLevel(50);
        block_arium_grass = new BlockGrass(Material.grass).setBlockName("block_arium_grass").setCreativeTab(ModFrostArium.tabFrostArium).setResistance(1.0F);
        block_arium_dirt = new BlockDirt(Material.ground).setBlockName("block_arium_dirt").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":dirt_arium_frostarium").setResistance(1.0F);
        block_arium_wood = new BlockAriumWood(Material.wood).setBlockName("block_arium_wood").setCreativeTab(ModFrostArium.tabFrostArium).setHardness(2.0F);
        block_arium_planks = new BlockAriumPlanks(Material.wood).setBlockName("block_arium_planks").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":planks_arium_frostarium").setHardness(3.0F);
        block_arium_leaves = new BlockAriumLeaves(Material.leaves).setBlockName("block_arium_leaves").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":leaves_arium_frostarium").setResistance(1.0F);
        block_nuclerium_wood = new BlockNucleriumWood(Material.wood).setBlockName("block_nuclerium_wood").setCreativeTab(ModFrostArium.tabFrostArium).setHardness(2.0F);
        block_nuclerium_planks = new BlockNucleriumPlanks(Material.wood).setBlockName("block_nuclerium_planks").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":planks_nuclerium_frostarium").setHardness(3.0F);
        block_nuclerium_leaves = new BlockNucleriumLeaves(Material.leaves).setBlockName("block_nuclerium_leaves").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":leaves_nuclerium_frostarium").setResistance(1.0F);
        block_nuclerium_grass = new BlockGrassNuclerium(Material.grass).setBlockName("block_nuclerium_grass").setCreativeTab(ModFrostArium.tabFrostArium).setResistance(1.0F);
        block_nuclerium_dirt = new BlockDirtNuclerium(Material.ground).setBlockName("block_nuclerium_dirt").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":dirt_nuclerium_frostarium").setResistance(1.0F);
        
        
        
        block_test = new BlockBasic(Material.grass).setBlockName("block_block_test").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":th_16").setHardness(2.0F);
        AriumChestBlock = new AriumChestBlock(Material.rock).setBlockName("block_arium_chest").setCreativeTab(ModFrostArium.tabFrostArium).setHardness(1.0F);
        block_invisble_block = new BlockInvisbleBlock(Material.rock).setBlockName("block_invisble_block").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":").setBlockUnbreakable();
        culture_arium = new BlockCropsArium().setBlockName("block_arium_crops").setCreativeTab(ModFrostArium.tabFrostArium).setBlockTextureName(Reference.MOD_ID + ":culture_arium");
        
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
        GameRegistry.registerBlock(block_green_screen, block_green_screen.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_block, block_arium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_ore, block_arium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_block, block_nuclerium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_ore, block_nuclerium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_rubyum_block, block_rubyum_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_rubyum_ore, block_rubyum_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_optarium_block, block_optarium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_optarium_ore, block_optarium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_grass, block_arium_grass.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_dirt, block_arium_dirt.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_wood, block_arium_wood.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_planks, block_arium_planks.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_arium_leaves, block_arium_leaves.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_wood, block_nuclerium_wood.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_planks, block_nuclerium_planks.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_leaves, block_nuclerium_leaves.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_grass, block_nuclerium_grass.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_nuclerium_dirt, block_nuclerium_dirt.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_invisble_block, block_invisble_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(AriumChestBlock, AriumChestBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(culture_arium, culture_arium.getUnlocalizedName().substring(5));
        
        GameRegistry.registerBlock(block_test, block_test.getUnlocalizedName().substring(5));
        
        
    }
}
