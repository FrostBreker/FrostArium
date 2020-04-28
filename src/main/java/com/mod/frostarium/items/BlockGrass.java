package com.mod.frostarium.items;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mod.frostarium.ModFrostArium;
import com.mod.frostarium.Reference;
import com.mod.frostarium.init.BlockMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGrass extends Block implements IGrowable
{

    private IIcon top, bottom;
    
    private static final Logger logger = LogManager.getLogger();
    @SideOnly(Side.CLIENT)
    private IIcon field_149991_b;
    @SideOnly(Side.CLIENT)
    private IIcon field_149993_M;
    @SideOnly(Side.CLIENT)
    private IIcon field_149994_N;
    private static final String __OBFID = "CL_00000251";
        
    public BlockGrass(Material grass)
    {
        super(Material.grass);
        this.setTickRandomly(true);
        this.setCreativeTab(ModFrostArium.tabFrostArium);
        }
    
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iiconRegister)
    {
        this.blockIcon = iiconRegister.registerIcon(Reference.MOD_ID + ":grass_arium_side_frostarium");
        this.top = iiconRegister.registerIcon(Reference.MOD_ID + ":grass_arium_top_frostarium");
        this.bottom = iiconRegister.registerIcon(Reference.MOD_ID + ":dirt_arium_frostarium");
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
    
    public static final Block.SoundType soundTypeAnvil = new Block.SoundType("anvil", 0.3F, 1.0F)
    {
        private static final String __OBFID = "CL_00000202";
        /**
         * Used when a block breaks, e.g.: Player break, Sheep eating grass, etc..
         */
        public String getBreakSound()
        {
            return "dig.stone";
        }
        public String func_150496_b()
        {
            return "random.anvil_land";
        }
    };
    
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote)
        {
            if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) < 4 && p_149674_1_.getBlockLightOpacity(p_149674_2_, p_149674_3_ + 1, p_149674_4_) > 2)
            {
                p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, BlockMod.block_arium_dirt);
            }
            else if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                    int j1 = p_149674_3_ + p_149674_5_.nextInt(5) - 3;
                    int k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;
                    Block block = p_149674_1_.getBlock(i1, j1 + 1, k1);

                    if (p_149674_1_.getBlock(i1, j1, k1) == BlockMod.block_arium_dirt && p_149674_1_.getBlockMetadata(i1, j1, k1) == 0 && p_149674_1_.getBlockLightValue(i1, j1 + 1, k1) >= 4 && p_149674_1_.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        p_149674_1_.setBlock(i1, j1, k1, BlockMod.block_arium_grass);
                    }
                }
            }
        }
    }
    
    
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return BlockMod.block_arium_dirt.getItemDropped(0, p_149650_2_, p_149650_3_);
    }

    public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
    {
        return true;
    }

    public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
    {
        return true;
    }



    /**
     * Returns the color this block should be rendered. Used by leaves.
     */


    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */

    @SideOnly(Side.CLIENT)
    public static IIcon getIconSideOverlay()
    {
        return null;
    }

    public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)
    {
        int l = 0;

        while (l < 128)
        {
            int i1 = p_149853_3_;
            int j1 = p_149853_4_ + 1;
            int k1 = p_149853_5_;
            int l1 = 0;

            while (true)
            {
                if (l1 < l / 16)
                {
                    i1 += p_149853_2_.nextInt(3) - 1;
                    j1 += (p_149853_2_.nextInt(3) - 1) * p_149853_2_.nextInt(3) / 2;
                    k1 += p_149853_2_.nextInt(3) - 1;

                    if (p_149853_1_.getBlock(i1, j1 - 1, k1) == BlockMod.block_arium_grass && !p_149853_1_.getBlock(i1, j1, k1).isNormalCube())
                    {
                        ++l1;
                        continue;
                    }
                }
                else if (p_149853_1_.getBlock(i1, j1, k1).getMaterial() == Material.air)
                {
                    if (p_149853_2_.nextInt(8) != 0)
                    {
                        if (Blocks.tallgrass.canBlockStay(p_149853_1_, i1, j1, k1))
                        {
                            p_149853_1_.setBlock(i1, j1, k1, Blocks.tallgrass, 1, 3);
                        }
                    }
                    else
                    {
                        p_149853_1_.getBiomeGenForCoords(i1, k1).plantFlower(p_149853_1_, p_149853_2_, i1, j1, k1);
                    }
                }

                ++l;
                break;
            }
        }
    }
    
   // public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float p_149727_7_, float hitY, float hitZ)
    {
       // if(world.isRemote)
        {
            //player.addChatMessage(new ChatComponentText("side : " + side));
        }
      // return true;
    }

}
