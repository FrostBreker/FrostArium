package com.mod.frostarium.items;

import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

public class ItemSwordNuclerium extends ItemSword
{

    public ItemSwordNuclerium(ToolMaterial p_i45356_1_)
    {
        super(p_i45356_1_);
    }
    
    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
        ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.poison.getId(), 400, 1));
        return super.onLeftClickEntity(stack, player, entity);
    }
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List, boolean par4)
    {
    par2List.add("\u00A73" + "> Cet épée est ultra rare");
 
    par2List.add("\u00A7e" + "> Et met des degats de poison");
    
    par2List.add("\u00A7e" + "> Enjoy");
    }

}

