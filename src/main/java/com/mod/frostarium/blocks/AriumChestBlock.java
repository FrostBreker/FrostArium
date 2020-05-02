package com.mod.frostarium.blocks;

import com.mod.frostarium.ModFrostArium;
import com.mod.frostarium.Reference;
import com.mod.frostarium.tileentitymod.TileEntityAriumChestBlock;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class AriumChestBlock extends Block
{

    private IIcon top;
    private IIcon bottom;

    public AriumChestBlock(Material material)
    {
        super(material);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iiconRegister)
    {
        this.blockIcon = iiconRegister.registerIcon(Reference.MOD_ID + ":");
        this.top = iiconRegister.registerIcon(Reference.MOD_ID + ":");
        this.bottom = iiconRegister.registerIcon(Reference.MOD_ID + ":");
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
    
    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileEntityAriumChestBlock();
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
            if (world.isRemote)
            {
                return true;
            }
            else
            {

                    player.openGui(ModFrostArium.instance, 0, world, x, y, z);

                return true;
            }  
    }        
    
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
    {
        TileEntity tile = world.getTileEntity(x, y, z);
        if(tile instanceof TileEntityAriumChestBlock)
        {
            int direction = MathHelper.floor_double((double)(living.prevRotationYaw * 4.0F / 360.0F));
            ((TileEntityAriumChestBlock)tile).setDirection((byte)direction);
            if(stack.hasDisplayName())
            {
                ((TileEntityAriumChestBlock)tile).setCustomName(stack.getDisplayName());
                
            }
        }
    }
    
    public void breakBlock(World wolrd, int x, int y, int z, Block block, int metadata)
    {
        TileEntity tileentity = wolrd.getTileEntity(x, y, z);

        if (tileentity  instanceof IInventory)
        {
            IInventory inv = (IInventory)tileentity;
            for (int i1 = 0; i1 < inv.getSizeInventory(); ++i1)
            {
                ItemStack itemstack = inv.getStackInSlot(i1);

                if (itemstack != null)
                {
                    float f = wolrd.rand.nextFloat() * 0.8F + 0.1F;
                    float f1 = wolrd.rand.nextFloat() * 0.8F + 0.1F;
                    EntityItem entityitem;

                    for (float f2 = wolrd.rand.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; wolrd.spawnEntityInWorld(entityitem))
                    {
                        int j1 = wolrd.rand.nextInt(21) + 10;

                        if (j1 > itemstack.stackSize)
                        {
                            j1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= j1;
                        entityitem = new EntityItem(wolrd, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entityitem.motionX = (double)((float)wolrd.rand.nextGaussian() * f3);
                        entityitem.motionY = (double)((float)wolrd.rand.nextGaussian() * f3 + 0.2F);
                        entityitem.motionZ = (double)((float)wolrd.rand.nextGaussian() * f3);

                        if (itemstack.hasTagCompound())
                        {
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                        }
                    }
                }
            }

            wolrd.func_147453_f(x, y, z, block);
        }

        super.breakBlock(wolrd, x, y, z, block, metadata);
    }

    public static Object[] values()
    {
        // TODO Auto-generated method stub
        return null;
    }


}
