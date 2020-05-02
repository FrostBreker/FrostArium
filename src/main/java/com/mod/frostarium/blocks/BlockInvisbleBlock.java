package com.mod.frostarium.blocks;

import com.mod.frostarium.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockInvisbleBlock extends Block
{

    private IIcon top;
    private IIcon bottom;

    public BlockInvisbleBlock(Material p_i45394_1_)
    {
        super(p_i45394_1_);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iiconRegister)
    {
        this.blockIcon = iiconRegister.registerIcon(Reference.MOD_ID + ":block_invisble_block");
        this.top = iiconRegister.registerIcon(Reference.MOD_ID + ":block_invisble_block");
        this.bottom = iiconRegister.registerIcon(Reference.MOD_ID + ":block_invisble_block");
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
