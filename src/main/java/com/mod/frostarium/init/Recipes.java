package com.mod.frostarium.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        
    }

    public static void register()
    {
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_ingot_arium, 9), new Object[] {"#", '#', BlockMod.block_arium_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_ingot_nuclerium, 9), new Object[] {"#", '#', BlockMod.block_nuclerium_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_ingot_rubyum, 9), new Object[] {"#", '#', BlockMod.block_rubyum_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_ingot_optarium, 9), new Object[] {"#", '#', BlockMod.block_optarium_block});
      //block_minerais
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_arium_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_ingot_arium});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_nuclerium_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_ingot_nuclerium});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_rubyum_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_ingot_rubyum});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_optarium_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_ingot_optarium});
        
        //divers
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_green_screen, 8), new Object[] {"#F#", "F#F", "#F#", '#', Items.slime_ball, 'F', Items.glowstone_dust});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_arium_planks, 4), new Object[] {"#", '#', BlockMod.block_arium_wood});
        GameRegistry.addRecipe(new ItemStack(BlockMod.block_nuclerium_planks, 4), new Object[] {"#", '#', BlockMod.block_nuclerium_wood});
        GameRegistry.addRecipe(new ItemStack(ItemMod.seed_arium, 2), new Object[] {"###", "#F#", "###", '#', ItemMod.item_nuggets_arium, 'F', Items.wheat_seeds});
        
        //furnace
        GameRegistry.addSmelting(BlockMod.block_arium_ore, new ItemStack(ItemMod.item_ingot_arium, 1), 1224F);
        GameRegistry.addSmelting(BlockMod.block_nuclerium_ore, new ItemStack(ItemMod.item_ingot_nuclerium, 1), 1624F);
        GameRegistry.addSmelting(BlockMod.block_rubyum_ore, new ItemStack(ItemMod.item_ingot_rubyum, 1), 1324F);
        GameRegistry.addSmelting(BlockMod.block_optarium_ore, new ItemStack(ItemMod.item_ingot_optarium, 1), 1424F);
        
        //Arium     
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_stick, 2), new Object[] {"#", "#", '#', ItemMod.item_ingot_arium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_sword_arium, 1), new Object[] {"#", "#", "F", '#', ItemMod.item_ingot_arium, 'F', ItemMod.item_stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_pickaxe_arium, 1), new Object[] {"EEE", " F ", " F ", 'E', ItemMod.item_ingot_arium, 'F', ItemMod.item_stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_axe_arium, 1), new Object[] {"EE ", "EF ", " F ", 'E', ItemMod.item_ingot_arium, 'F', ItemMod.item_stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_shovel_arium, 1), new Object[] {" E ", " F ", " F ", 'E', ItemMod.item_ingot_arium, 'F', ItemMod.item_stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_hoe_arium, 1), new Object[] {"EE ", " F ", " F ", 'E', ItemMod.item_ingot_arium, 'F', ItemMod.item_stick});
        
        GameRegistry.addRecipe(new ItemStack(ItemMod.helmetArmorarium, 1), new Object[] {"###", "# #", '#', ItemMod.item_ingot_arium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.chestplateArmorarium, 1), new Object[] {"# #", "###", "###", '#', ItemMod.item_ingot_arium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.leggingsArmorarium, 1), new Object[] {"###", "# #", "# #", '#', ItemMod.item_ingot_arium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.bootsArmorarium, 1), new Object[] {"# #", "# #", '#', ItemMod.item_ingot_arium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_hammer_arium, 1), new Object[] {"###", "###", " F ", '#', ItemMod.item_ingot_arium, 'F', ItemMod.item_stick_nuclerium});
        
       
 //Nugget       
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_ingot_arium, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_nuggets_arium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_ingot_nuclerium, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_nuggets_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_ingot_rubyum, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_nuggets_rubyum}); 
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_ingot_optarium, 1), new Object[] {"###", "###", "###", '#', ItemMod.item_nuggets_optarium});
        
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_nuggets_arium, 9), new Object[] {"E", 'E', ItemMod.item_ingot_arium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_nuggets_nuclerium, 9), new Object[] {"E", 'E', ItemMod.item_ingot_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_nuggets_rubyum, 9), new Object[] {"E", 'E', ItemMod.item_ingot_rubyum});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_nuggets_optarium, 9), new Object[] {"E", 'E', ItemMod.item_ingot_optarium});
        
        
        
   //Nuclerium  
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_stick_nuclerium, 2), new Object[] {"#", "#", '#', ItemMod.item_ingot_nuclerium});
        
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_sword_nuclerium, 1), new Object[] {"#", "#", "F", '#', ItemMod.item_ingot_nuclerium, 'F', ItemMod.item_stick_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_pickaxe_nuclerium, 1), new Object[] {"EEE", " F ", " F ", 'E', ItemMod.item_ingot_nuclerium, 'F', ItemMod.item_stick_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_axe_nuclerium, 1), new Object[] {"EE ", "EF ", " F ", 'E', ItemMod.item_ingot_nuclerium, 'F', ItemMod.item_stick_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_shovel_nuclerium, 1), new Object[] {" E ", " F ", " F ", 'E', ItemMod.item_ingot_nuclerium, 'F', ItemMod.item_stick_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_hoe_nuclerium, 1), new Object[] {"EE ", " F ", " F ", 'E', ItemMod.item_ingot_nuclerium, 'F', ItemMod.item_stick_nuclerium});
        
        GameRegistry.addRecipe(new ItemStack(ItemMod.helmetArmornuclerium, 1), new Object[] {"###", "# #", '#', ItemMod.item_ingot_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.chestplateArmornuclerium, 1), new Object[] {"# #", "###", "###", '#', ItemMod.item_ingot_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.leggingsArmornuclerium, 1), new Object[] {"###", "# #", "# #", '#', ItemMod.item_ingot_nuclerium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.bootsArmornuclerium, 1), new Object[] {"# #", "# #", '#', ItemMod.item_ingot_nuclerium});
        
      //Rubyum
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_stick_rubyum, 2), new Object[] {"#", "#", '#', ItemMod.item_ingot_rubyum});
       
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_sword_rubyum, 1), new Object[] {"#", "#", "F", '#', ItemMod.item_ingot_rubyum, 'F', ItemMod.item_stick_rubyum});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_pickaxe_rubyum, 1), new Object[] {"EEE", " F ", " F ", 'E', ItemMod.item_ingot_rubyum, 'F', ItemMod.item_stick_rubyum});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_axe_rubyum, 1), new Object[] {"EE ", "EF ", " F ", 'E', ItemMod.item_ingot_rubyum, 'F', ItemMod.item_stick_rubyum});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_shovel_rubyum, 1), new Object[] {" E ", " F ", " F ", 'E', ItemMod.item_ingot_rubyum, 'F', ItemMod.item_stick_rubyum});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_hoe_rubyum, 1), new Object[] {"EE ", " F ", " F ", 'E', ItemMod.item_ingot_rubyum, 'F', ItemMod.item_stick_rubyum});
        
        GameRegistry.addRecipe(new ItemStack(ItemMod.helmetArmorrubyum, 1), new Object[] {"###", "# #", '#', ItemMod.item_ingot_rubyum});
        GameRegistry.addRecipe(new ItemStack(ItemMod.chestplateArmorrubyum, 1), new Object[] {"# #", "###", "###", '#', ItemMod.item_ingot_rubyum});
        GameRegistry.addRecipe(new ItemStack(ItemMod.leggingsArmorrubyum, 1), new Object[] {"###", "# #", "# #", '#', ItemMod.item_ingot_rubyum});
        GameRegistry.addRecipe(new ItemStack(ItemMod.bootsArmorrubyum, 1), new Object[] {"# #", "# #", '#', ItemMod.item_ingot_rubyum});
        
        //Optarium
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_stick_optarium, 2), new Object[] {"#", "#", '#', ItemMod.item_ingot_optarium});
      
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_sword_optarium, 1), new Object[] {"#", "#", "F", '#', ItemMod.item_ingot_optarium, 'F', ItemMod.item_stick_optarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_pickaxe_optarium, 1), new Object[] {"EEE", " F ", " F ", 'E', ItemMod.item_ingot_optarium, 'F', ItemMod.item_stick_optarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_axe_optarium, 1), new Object[] {"EE ", "EF ", " F ", 'E', ItemMod.item_ingot_optarium, 'F', ItemMod.item_stick_optarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_shovel_optarium, 1), new Object[] {" E ", " F ", " F ", 'E', ItemMod.item_ingot_optarium, 'F', ItemMod.item_stick_optarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.item_hoe_optarium, 1), new Object[] {"EE ", " F ", " F ", 'E', ItemMod.item_ingot_optarium, 'F', ItemMod.item_stick_optarium});
        
        GameRegistry.addRecipe(new ItemStack(ItemMod.helmetArmoroptarium, 1), new Object[] {"###", "# #", '#', ItemMod.item_ingot_optarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.chestplateArmoroptarium, 1), new Object[] {"# #", "###", "###", '#', ItemMod.item_ingot_optarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.leggingsArmoroptarium, 1), new Object[] {"###", "# #", "# #", '#', ItemMod.item_ingot_optarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.bootsArmoroptarium, 1), new Object[] {"# #", "# #", '#', ItemMod.item_ingot_optarium});
    }
}
