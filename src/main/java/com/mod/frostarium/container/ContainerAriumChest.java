package com.mod.frostarium.container;

import com.mod.frostarium.tileentitymod.TileEntityAriumChestBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerAriumChest extends Container
{
    private final TileEntityAriumChestBlock tileArium;
    
    public ContainerAriumChest(TileEntityAriumChestBlock tile, InventoryPlayer inventory)
    {
        this.tileArium = tile;
        tile.openInventory();
        for (int j = 0; j < 4; ++j)
        {
            for (int k = 0; k < 9; ++k)
            {
                this.addSlotToContainer(new Slot(tile, k + j * 9, 8 + k * 18, 18 + j * 18));
            }
        }
        this.bindPlayerInventory(inventory);
    }
    
    private void bindPlayerInventory(InventoryPlayer inventory)
    {
        int j;
        for (j = 0; j < 3; ++j)
        {
            for (int k = 0; k < 9; ++k)
            {
                this.addSlotToContainer(new Slot(inventory, k + j * 9 + 9, 8 + k * 18, 50 + j * 18));
            }
        }
        
        for (j = 0; j < 9; ++j)
        {
            this.addSlotToContainer(new Slot(inventory, j, 8 + j * 18, 1)
                    {
                       @Override
                       public boolean isItemValid(ItemStack p_75214_1_)
                       {
                           return true;
                       }
                    });
        }
    }
    
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ < this.tileArium.getSizeInventory())
            {
                if (!this.mergeItemStack(itemstack1, this.tileArium.getSizeInventory(), this.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.tileArium.getSizeInventory(), false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return this.tileArium.isUseableByPlayer(player);
   }
    
    public void onContainerClosed(EntityPlayer player)
    {
        super.onContainerClosed(player);
        this.tileArium.closeInventory();
    }
    
        
    

}