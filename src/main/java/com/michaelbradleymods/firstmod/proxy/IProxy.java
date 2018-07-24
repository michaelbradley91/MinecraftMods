package com.michaelbradleymods.firstmod.proxy;

import net.minecraft.item.Item;

public interface IProxy
{
    void registerItemRenderer(final Item item, final int metadata, final String id);
}
