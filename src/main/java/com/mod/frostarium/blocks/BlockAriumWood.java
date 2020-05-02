package com.mod.frostarium.blocks;

import com.mod.frostarium.Reference;
import com.mod.frostarium.init.BlockMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockAriumWood extends Block
{
    

    private IIcon top;
    private IIcon bottom;

    public BlockAriumWood(Material p_i45394_1_)
    {
        super(p_i45394_1_);
        this.setStepSound(soundTypeWood);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iiconRegister)
    {
        this.blockIcon = iiconRegister.registerIcon(Reference.MOD_ID + ":logarium_frostarium");
        this.top = iiconRegister.registerIcon(Reference.MOD_ID + ":log_arium_top_frostarium");
        this.bottom = iiconRegister.registerIcon(Reference.MOD_ID + ":log_arium_top_frostarium");
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        if(side == 0)
        {
            return this.bottom;
        }
        else if(side == 1)
        {
            return this.top;
        }
        return this.blockIcon; 
        
    }  
}    
    
    
    