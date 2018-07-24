package com.michaelbradleymods.firstmod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

public class ClientProxy extends CommonProxy
{
    public void registerItemRenderer(final Item item, final int metadata, final String id)
    {
        ModelLoader.setCustomModelResourceLocation(
                item,
                metadata,
                new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), id));
    }
}
