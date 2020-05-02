package com.mod.frostarium.init;

import com.mod.frostarium.ModFrostArium;
import com.mod.frostarium.Reference;
import com.mod.frostarium.items.ItemArmorArium;
import com.mod.frostarium.items.ItemArmorRubyum;
import com.mod.frostarium.items.ItemAxeArium;
import com.mod.frostarium.items.ItemAxeNuclerium;
import com.mod.frostarium.items.ItemAxeRubyum;
import com.mod.frostarium.items.ItemAxeoptarium;
import com.mod.frostarium.items.ItemHammerArium;
import com.mod.frostarium.items.ItemHoeArium;
import com.mod.frostarium.items.ItemHoeNuclerium;
import com.mod.frostarium.items.ItemHoeOptarium;
import com.mod.frostarium.items.ItemHoeRubyum;
import com.mod.frostarium.items.ItemPickaxeArium;
import com.mod.frostarium.items.ItemPickaxeNuclerium;
import com.mod.frostarium.items.ItemPickaxeOptarium;
import com.mod.frostarium.items.ItemPickaxeRubyum;
import com.mod.frostarium.items.ItemSeedArium;
import com.mod.frostarium.items.ItemShovelArium;
import com.mod.frostarium.items.ItemShovelNuclerium;
import com.mod.frostarium.items.ItemShovelOptarium;
import com.mod.frostarium.items.ItemShovelRubyum;
import com.mod.frostarium.items.ItemSwordArium;
import com.mod.frostarium.items.ItemSwordNuclerium;
import com.mod.frostarium.items.ItemSwordRubyum;
import com.mod.frostarium.items.ItemSwordoptarium;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod
{
    public static ToolMaterial toolArium = EnumHelper.addToolMaterial("toolArium", 4, 3000, 16, 6, 30);
    public static ToolMaterial toolNuclerium = EnumHelper.addToolMaterial("toolNuclerium", 4, 6000, 22, 9, 30);
    public static ToolMaterial toolRubyum = EnumHelper.addToolMaterial("toolRubyum", 4, 4000, 18, 7, 30);
    public static ToolMaterial toolOptarium = EnumHelper.addToolMaterial("toolOptarium", 4, 5000, 20, 8, 30);
    public static ToolMaterial toolHammerArium = EnumHelper.addToolMaterial("toolHammerArium", 4, 6000, 14, 9, 30);
    
    
    public static ArmorMaterial armorArium = EnumHelper.addArmorMaterial("armorArium", 202, new int[] {5, 11, 7, 5}, 30);
    public static ArmorMaterial armorNuclerium = EnumHelper.addArmorMaterial("armorNuclerium", 400, new int[] {8, 14, 10, 8}, 35);
    public static ArmorMaterial armorRubyum = EnumHelper.addArmorMaterial("armorRubyum", 245, new int[] {6, 12, 8, 6}, 33);
    public static ArmorMaterial armorOptarium = EnumHelper.addArmorMaterial("armorOptarium", 295, new int[] {7, 13, 9, 7}, 34);
    
    
//Arium
    public static Item item_ingot_arium, item_stick, item_sword_arium, item_pickaxe_arium, item_axe_arium, item_shovel_arium, item_hoe_arium, helmetArmorarium, chestplateArmorarium, leggingsArmorarium, bootsArmorarium;
//Nuclerium    
    public static Item item_ingot_nuclerium, item_stick_nuclerium, item_sword_nuclerium, item_pickaxe_nuclerium, item_axe_nuclerium, item_shovel_nuclerium, item_hoe_nuclerium, helmetArmornuclerium, chestplateArmornuclerium, leggingsArmornuclerium, bootsArmornuclerium;
//Rubyum    
    public static Item item_ingot_rubyum, item_stick_rubyum, item_sword_rubyum, item_pickaxe_rubyum, item_axe_rubyum, item_shovel_rubyum, item_hoe_rubyum, helmetArmorrubyum, chestplateArmorrubyum, leggingsArmorrubyum, bootsArmorrubyum;
//Optarium    
    public static Item item_stick_optarium, item_sword_optarium, item_pickaxe_optarium, item_axe_optarium, item_shovel_optarium, item_hoe_optarium, item_ingot_optarium, leggingsArmoroptarium, helmetArmoroptarium, chestplateArmoroptarium, bootsArmoroptarium;    
//Hammer
    public static Item item_hammer_arium;
    
    //Divers
    public static Item item_nuggets_arium, item_nuggets_rubyum, item_nuggets_optarium, item_nuggets_nuclerium, seed_arium;
    
    public static void init()
    {
        item_stick = new Item().setUnlocalizedName("item_stick").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":stick_frostarium");
        item_stick_nuclerium = new Item().setUnlocalizedName("item_stick_nuclerium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":stick_nuclerium_frostarium");
        item_stick_rubyum = new Item().setUnlocalizedName("item_stick_rubyum").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":rubyum_stick_frostarium");
        item_stick_optarium = new Item().setUnlocalizedName("item_stick_optarium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":optarium_stick_frostarium");
        item_ingot_arium = new Item().setUnlocalizedName("item_ingot_arium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":ingot_frostarium");
        item_sword_arium = new ItemSwordArium(toolArium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_sword_arium").setTextureName(Reference.MOD_ID + ":sword_frostarium");
        item_pickaxe_arium = new ItemPickaxeArium(toolArium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_pickaxe_arium").setTextureName(Reference.MOD_ID + ":pickaxe_frostarium");
        item_axe_arium = new ItemAxeArium(toolArium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_axe_arium").setTextureName(Reference.MOD_ID + ":axe_frostarium");
        item_shovel_arium = new ItemShovelArium(toolArium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_shovel_arium").setTextureName(Reference.MOD_ID + ":shovel_frostarium");
        item_hoe_arium = new ItemHoeArium(toolArium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_hoe_arium").setTextureName(Reference.MOD_ID + ":hoe_frostarium");
        helmetArmorarium = new ItemArmorArium(armorArium, 0).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_helmet_arium").setTextureName(Reference.MOD_ID + ":arium_helmet_frostarium");
        chestplateArmorarium = new ItemArmorArium(armorArium, 1).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_chestplate_arium").setTextureName(Reference.MOD_ID + ":arium_chestplate_frostarium");
        leggingsArmorarium = new ItemArmorArium(armorArium, 2).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_leggings_arium").setTextureName(Reference.MOD_ID + ":arium_leggings_frostarium");
        bootsArmorarium = new ItemArmorArium(armorArium, 3).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_boots_arium").setTextureName(Reference.MOD_ID + ":arium_boots_frostarium");
        item_ingot_nuclerium = new Item().setUnlocalizedName("item_ingot_nuclerium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":nuclerium_ingot_frostarium");
        item_sword_nuclerium = new ItemSwordNuclerium(toolNuclerium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_sword_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_sword_frostarium");
        item_pickaxe_nuclerium = new ItemPickaxeNuclerium(toolNuclerium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_pickaxe_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_pickaxe_frostarium");
        item_axe_nuclerium = new ItemAxeNuclerium(toolNuclerium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_axe_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_axe_frostarium");
        item_shovel_nuclerium = new ItemShovelNuclerium(toolNuclerium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_shovel_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_shovel_frostarium");
        item_hoe_nuclerium = new ItemHoeNuclerium(toolNuclerium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_hoe_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_hoe_frostarium");
        helmetArmornuclerium = new ItemArmorArium(armorNuclerium, 0).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_helmet_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_helmet_frostarium");
        chestplateArmornuclerium = new ItemArmorArium(armorNuclerium, 1).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_chestplate_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_chestplate_frostarium");
        leggingsArmornuclerium = new ItemArmorArium(armorNuclerium, 2).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_leggings_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_leggings_frostarium");
        bootsArmornuclerium = new ItemArmorArium(armorNuclerium, 3).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_boots_nuclerium").setTextureName(Reference.MOD_ID + ":nuclerium_boots_frostarium");
        item_ingot_rubyum = new Item().setUnlocalizedName("item_ingot_rubyum").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":rubyum_ingot_frostarium");
        item_sword_rubyum = new ItemSwordRubyum(toolRubyum).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_sword_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_sword_frostarium");
        item_pickaxe_rubyum = new ItemPickaxeRubyum(toolRubyum).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_pickaxe_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_pickaxe_frostarium");
        item_axe_rubyum = new ItemAxeRubyum(toolRubyum).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_axe_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_axe_frostarium");
        item_shovel_rubyum = new ItemShovelRubyum(toolRubyum).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_shovel_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_shovel_frostarium");
        item_hoe_rubyum = new ItemHoeRubyum(toolRubyum).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_hoe_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_hoe_frostarium");
        helmetArmorrubyum = new ItemArmorArium(armorRubyum, 0).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_helmet_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_helmet_frostarium");
        chestplateArmorrubyum = new ItemArmorArium(armorRubyum, 1).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_chestplate_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_chestplate_frostarium");
        leggingsArmorrubyum = new ItemArmorArium(armorRubyum, 2).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_leggings_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_leggings_frostarium");
        bootsArmorrubyum = new ItemArmorArium(armorRubyum, 3).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_boots_rubyum").setTextureName(Reference.MOD_ID + ":rubyum_boots_frostarium");
        item_ingot_optarium = new Item().setUnlocalizedName("item_ingot_optarium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":optarium_ingot_frostarium");
        item_sword_optarium = new ItemSwordoptarium(toolOptarium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_sword_optarium").setTextureName(Reference.MOD_ID + ":optarium_sword_frostarium");
        item_pickaxe_optarium = new ItemPickaxeOptarium(toolOptarium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_pickaxe_optarium").setTextureName(Reference.MOD_ID + ":optarium_pickaxe__frostarium");
        item_axe_optarium = new ItemAxeoptarium(toolOptarium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_axe_optarium").setTextureName(Reference.MOD_ID + ":optarium_axe_frostarium");
        item_shovel_optarium = new ItemShovelOptarium(toolOptarium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_shovel_optarium").setTextureName(Reference.MOD_ID + ":optarium_shovel_frostarium");
        item_hoe_optarium = new ItemHoeOptarium(toolOptarium).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_hoe_optarium").setTextureName(Reference.MOD_ID + ":optarium_hoe_frostarium");
        helmetArmoroptarium = new ItemArmorArium(armorOptarium, 0).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_helmet_optarium").setTextureName(Reference.MOD_ID + ":optarium_helmet_frostarium");
        chestplateArmoroptarium = new ItemArmorArium(armorOptarium, 1).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_chestplate_optarium").setTextureName(Reference.MOD_ID + ":optarium_chestplate_frostarium");
        leggingsArmoroptarium = new ItemArmorArium(armorOptarium, 2).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_leggings_optarium").setTextureName(Reference.MOD_ID + ":optarium_leggings_frostarium");
        bootsArmoroptarium = new ItemArmorArium(armorOptarium, 3).setCreativeTab(ModFrostArium.tabFrostAriumTool).setUnlocalizedName("item_boots_optarium").setTextureName(Reference.MOD_ID + ":optarium_boots_frostarium");
       
        item_nuggets_arium = new Item().setUnlocalizedName("item_nuggets_arium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":arium_nugget_frostarium");
        item_nuggets_nuclerium = new Item().setUnlocalizedName("item_nuggets_nuclerium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":nuclerium_nugget_frostarium");
        item_nuggets_rubyum = new Item().setUnlocalizedName("item_nuggets_rubyum").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":rubyum_nugget_frostarium");
        item_nuggets_optarium = new Item().setUnlocalizedName("item_nuggets_optarium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":optarium_nugget_frostarium");
        seed_arium = new ItemSeedArium(BlockMod.culture_arium, Blocks.farmland).setUnlocalizedName("item_seed_arium").setCreativeTab(ModFrostArium.tabFrostArium).setTextureName(Reference.MOD_ID + ":seed_arium");
        
        item_hammer_arium = new ItemHammerArium(toolHammerArium).setUnlocalizedName("item_hammer_arium").setCreativeTab(ModFrostArium.tabFrostAriumTool).setTextureName(Reference.MOD_ID + ":item_hammer_arium_frostarium");
        
    }
    
    public static void register()
    {
        GameRegistry.registerItem(item_ingot_arium, "item ingot arium");
        GameRegistry.registerItem(item_stick, "item stick");
        GameRegistry.registerItem(item_sword_arium, "item_sword_arium");
        GameRegistry.registerItem(item_pickaxe_arium, "item_pickaxe_arium");
        GameRegistry.registerItem(item_axe_arium, "item_axe_arium");
        GameRegistry.registerItem(item_shovel_arium, "item_shovel_arium");
        GameRegistry.registerItem(item_hoe_arium, "item_hoe_arium");
        GameRegistry.registerItem(helmetArmorarium, "helmetarmorarium");
        GameRegistry.registerItem(chestplateArmorarium, "chestplateArmorarium");
        GameRegistry.registerItem(leggingsArmorarium, "leggingsArmorarium");
        GameRegistry.registerItem(bootsArmorarium, "bootsArmorarium");
        GameRegistry.registerItem(item_ingot_nuclerium, "item ingot nuclerium");
        GameRegistry.registerItem(item_sword_nuclerium, "item_sword_nuclerium");
        GameRegistry.registerItem(item_stick_nuclerium, "item_stick_nuclerium");
        GameRegistry.registerItem(item_pickaxe_nuclerium, "item_pickaxe_nuclerium");
        GameRegistry.registerItem(item_axe_nuclerium, "item_axe_nuclerium");
        GameRegistry.registerItem(item_shovel_nuclerium, "item_shovel_nuclerium");
        GameRegistry.registerItem(item_hoe_nuclerium, "item_hoe_nuclerium");
        GameRegistry.registerItem(helmetArmornuclerium, "helmetarmornuclerium");
        GameRegistry.registerItem(chestplateArmornuclerium, "chestplateArmornuclerium");
        GameRegistry.registerItem(leggingsArmornuclerium, "leggingsArmornuclerium");
        GameRegistry.registerItem(bootsArmornuclerium, "bootsArmornuclerium");
        GameRegistry.registerItem(item_ingot_rubyum, "item_ingot_rubyum");
        GameRegistry.registerItem(item_sword_rubyum, "item_sword_rubyum");
        GameRegistry.registerItem(item_stick_rubyum, "item_stick_rubyum");
        GameRegistry.registerItem(item_pickaxe_rubyum, "item_pickaxe_rubyum");
        GameRegistry.registerItem(item_axe_rubyum, "item_axe_rubyum");
        GameRegistry.registerItem(item_shovel_rubyum, "item_shovel_rubyum");
        GameRegistry.registerItem(item_hoe_rubyum, "item_hoe_rubyum");
        GameRegistry.registerItem(helmetArmorrubyum, "helmetarmorrubyum");
        GameRegistry.registerItem(chestplateArmorrubyum, "chestplateArmorrubyum");
        GameRegistry.registerItem(leggingsArmorrubyum, "leggingsArmorrubyum");
        GameRegistry.registerItem(bootsArmorrubyum, "bootsArmorrubyum");
        GameRegistry.registerItem(item_ingot_optarium, "item_ingot_optarium");
        GameRegistry.registerItem(item_sword_optarium, "item_sword_optarium");
        GameRegistry.registerItem(item_stick_optarium, "item_stick_optarium");
        GameRegistry.registerItem(item_pickaxe_optarium, "item_pickaxe_optarium");
        GameRegistry.registerItem(item_axe_optarium, "item_axe_optarium");
        GameRegistry.registerItem(item_shovel_optarium, "item_shovel_optarium");
        GameRegistry.registerItem(item_hoe_optarium, "item_hoe_optarium");
        GameRegistry.registerItem(helmetArmoroptarium, "helmetarmoroptarium");
        GameRegistry.registerItem(chestplateArmoroptarium, "chestplateArmoroptarium");
        GameRegistry.registerItem(leggingsArmoroptarium, "leggingsArmoroptarium");
        GameRegistry.registerItem(bootsArmoroptarium, "bootsArmoroptarium");
        
        GameRegistry.registerItem(item_nuggets_arium, "item_nuggets_arium");
        GameRegistry.registerItem(item_nuggets_nuclerium, "item_nuggets_nuclerium");
        GameRegistry.registerItem(item_nuggets_rubyum, "item_nuggets_rubyum");
        GameRegistry.registerItem(item_nuggets_optarium, "item_nuggets_optarium");
        GameRegistry.registerItem(seed_arium, "seed_arium");
        
        GameRegistry.registerItem(item_hammer_arium, "item_hammer_arium");
        
 
        
        
    }
}
