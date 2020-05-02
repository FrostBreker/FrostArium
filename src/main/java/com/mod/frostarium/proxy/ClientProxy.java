  package com.mod.frostarium.proxy;

import com.mod.frostarium.entity.EntityArium;
import com.mod.frostarium.entity.EntityNuclerium;
import com.mod.frostarium.init.RenderMod;
import com.mod.frostarium.models.ModelArium;
import com.mod.frostarium.models.ModelNuclerium;
import com.mod.frostarium.renders.RenderArium;
import com.mod.frostarium.renders.RenderNuclerium;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy
  {
      @Override
      public void registerRenders()
      {
          RenderMod.init();
          RenderingRegistry.registerEntityRenderingHandler(EntityArium.class, new RenderArium(new ModelArium(), 0.5F));
          RenderingRegistry.registerEntityRenderingHandler(EntityNuclerium.class, new RenderNuclerium(new ModelNuclerium(), 0.5F));
      }
  }
