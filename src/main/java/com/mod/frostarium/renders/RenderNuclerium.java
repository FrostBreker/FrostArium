package com.mod.frostarium.renders;

import com.mod.frostarium.Reference;
import com.mod.frostarium.entity.EntityNuclerium;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderNuclerium extends RenderLiving
{
    private ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/models/mobs/MobNuclerium.png");

public RenderNuclerium (ModelBase p_i1262_1_, float p_i1262_2_)
    {
        super(p_i1262_1_, p_i1262_2_);
    }

    protected ResourceLocation getEntiyTexture(EntityLiving living)
    {
        return this.getEntityTexture((EntityNuclerium) living);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_i1262_2_)
    {
        return texture;
    }
}    