package com.michaelbradleymods.firstmod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

public class CommonProxy
{
    public void registerItemRenderer(Item item, int metadata, String id)
    {
        ModelLoader.setCustomModelResourceLocation(
                item,
                metadata,
                new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), id));
    }
}
