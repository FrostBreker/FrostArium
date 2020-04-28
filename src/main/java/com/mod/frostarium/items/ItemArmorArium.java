package com.mod.frostarium.items;

import com.mod.frostarium.Reference;
import com.mod.frostarium.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorArium extends ItemArmor
{

    public ItemArmorArium(ArmorMaterial material, int metaData)
    {
        super(material, 0, metaData);
    }
    
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemMod.leggingsArmorarium)
        {
            return Reference.MOD_ID + ":textures/models/armor/arium_layer_2_frostarium.png";
        }
        
        else if(stack.getItem() == ItemMod.helmetArmorarium || stack.getItem() == ItemMod.chestplateArmorarium || stack.getItem() == ItemMod.bootsArmorarium)
        {
            return Reference.MOD_ID + ":textures/models/armor/arium_layer_1_frostarium.png";
        }
        
        else if(stack.getItem() == ItemMod.leggingsArmornuclerium)
        {
            return Reference.MOD_ID + ":textures/models/armor/nuclerium_layer_2_frostarium.png";
        }
        
        else if(stack.getItem() == ItemMod.helmetArmornuclerium || stack.getItem() == ItemMod.chestplateArmornuclerium || stack.getItem() == ItemMod.bootsArmornuclerium)
        {
            return Reference.MOD_ID + ":textures/models/armor/nuclerium_layer_1_frostarium.png";
        }
        
        else if(stack.getItem() == ItemMod.leggingsArmorrubyum)
        {
            return Reference.MOD_ID + ":textures/models/armor/rubyum_layer_2_frostarium.png";
        }
        
        else if(stack.getItem() == ItemMod.helmetArmorrubyum || stack.getItem() == ItemMod.chestplateArmorrubyum || stack.getItem() == ItemMod.bootsArmorrubyum)
        {
            return Reference.MOD_ID + ":textures/models/armor/rubyum_layer_1_frostarium.png";
        }
        
        else if(stack.getItem() == ItemMod.leggingsArmoroptarium)
        {
            return Reference.MOD_ID + ":textures/models/armor/optarium_layer_2_frostarium.png";
        }
        
        else if(stack.getItem() == ItemMod.helmetArmoroptarium || stack.getItem() == ItemMod.chestplateArmoroptarium || stack.getItem() == ItemMod.bootsArmoroptarium)
        {
            return Reference.MOD_ID + ":textures/models/armor/optarium_layer_1_frostarium.png";
        }
        return null;
    }
}
