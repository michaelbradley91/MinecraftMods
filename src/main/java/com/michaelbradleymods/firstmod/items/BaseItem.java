package com.michaelbradleymods.firstmod.items;

import com.michaelbradleymods.firstmod.util.IHasModel;
import com.michaelbradleymods.firstmod.util.annotations.ItemDefinition;
import net.minecraft.item.Item;

@ItemDefinition
abstract class BaseItem extends Item implements IHasModel
{
    BaseItem(final String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
