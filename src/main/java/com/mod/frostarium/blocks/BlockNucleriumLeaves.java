package com.mod.frostarium.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockNucleriumLeaves extends Block
{

     private boolean field_150121_P;

    public BlockNucleriumLeaves(Material p_i45394_1_)
    {
        super(p_i45394_1_);
        this.setStepSound(soundTypeGrass);
    }
     


public boolean isOpaqueCube()
{
    return false;
}

@SideOnly(Side.CLIENT)
public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
{
    Block block = p_149646_1_.getBlock(p_149646_2_, p_149646_3_, p_149646_4_);
    return !this.field_150121_P && block == this ? false : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
   }

}
