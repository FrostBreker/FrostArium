package com.mod.frostarium.renders;

import com.mod.frostarium.Reference;
import com.mod.frostarium.entity.EntityArium;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderArium extends RenderLiving
{

    private ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/models/mobs/MobArium.png");
    
    public RenderArium(ModelBase p_i1262_1_, float p_i1262_2_)
    {
        super(p_i1262_1_, p_i1262_2_);
    }
    
    protected ResourceLocation getEntiyTexture(EntityLiving living)
    {
        return this.getEntityTexture((EntityArium) living);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return texture;
    }   
}