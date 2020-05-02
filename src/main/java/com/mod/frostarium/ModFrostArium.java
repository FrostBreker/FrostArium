package com.mod.frostarium;

import com.mod.frostarium.init.BiomesMod;
import com.mod.frostarium.init.BlockMod;
import com.mod.frostarium.init.EntityMod;
import com.mod.frostarium.init.ItemMod;
import com.mod.frostarium.init.Recipes;
import com.mod.frostarium.proxy.CommonProxy;
import com.mod.frostarium.tileentitymod.TileEntityAriumChestBlock;
import com.mod.frostarium.world.WorldRegister;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModFrostArium
{
    
    @Instance(Reference.MOD_ID)
    public static ModFrostArium instance;
    
    private static final String clientProxy = null;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    
    public static CreativeTabs tabFrostArium = new CreativeTabs("FrostArium")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(BlockMod.block_nuclerium_grass);
        }

    };
    
    public static CreativeTabs tabFrostAriumTool = new CreativeTabs("FrostArium Tool")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemMod.item_sword_rubyum;
        }

    };
    
    @EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
      
      
      BlockMod.init();
      BlockMod.register();
      ItemMod.init();
      ItemMod.register();
      Recipes.init();
      Recipes.register();
      WorldRegister.mainRegistry();
      BiomesMod.init();
    
  }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
        EntityMod.init();
        GameRegistry.registerTileEntity(TileEntityAriumChestBlock.class, "frostarium:AriumChest");
        
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandlerMod());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
