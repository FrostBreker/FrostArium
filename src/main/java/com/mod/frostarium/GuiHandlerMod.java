package com.mod.frostarium;

import com.mod.frostarium.container.ContainerAriumChest;
import com.mod.frostarium.gui.GuiAriumChest;
import com.mod.frostarium.tileentitymod.TileEntityAriumChestBlock;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandlerMod implements IGuiHandler
{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getTileEntity(x, y, z);
        if(tile instanceof TileEntityAriumChestBlock)
        {
            return new ContainerAriumChest((TileEntityAriumChestBlock)tile, player.inventory);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getTileEntity(x, y, z);
        if(tile instanceof TileEntityAriumChestBlock)
        {
            return new GuiAriumChest((TileEntityAriumChestBlock)tile, player.inventory);
        }
        return null;
    }

}
