package com.mod.frostarium.gui;

import org.lwjgl.opengl.GL11;

import com.mod.frostarium.Reference;
import com.mod.frostarium.container.ContainerAriumChest;
import com.mod.frostarium.tileentitymod.TileEntityAriumChestBlock;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class GuiAriumChest extends GuiContainer
{
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/gui/container/ariumContainer.png");
    private TileEntityAriumChestBlock tileArium;
    private IInventory playerInv;

    public GuiAriumChest(TileEntityAriumChestBlock tile, InventoryPlayer inventory)
    {
        super(new ContainerAriumChest(tile, inventory));
        this.tileArium = tile;
        this.playerInv = inventory;
        this.allowUserInput = false;
        this.ySize = 256;
        this.xSize = 238;
    }
    
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        this.fontRendererObj.drawString(this.tileArium.hasCustomInventoryName() ? this.tileArium.getInventoryName() : I18n.format(this.tileArium.getInventoryName(), new Object[0]), 8, 6, 4210752);
        this.fontRendererObj.drawString(this.playerInv.hasCustomInventoryName() ? this.playerInv.getInventoryName() : I18n.format(this.playerInv.getInventoryName(), new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int x = (this.width - this.xSize) / 2;
        int y = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
    }

}
