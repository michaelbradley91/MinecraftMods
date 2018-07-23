package com.michaelbradleymods.firstmod.items;

import com.michaelbradleymods.firstmod.init.ModItems;
import com.michaelbradleymods.firstmod.util.IHasModel;
import net.minecraft.item.Item;

public abstract class BaseItem extends Item implements IHasModel
{
    public BaseItem(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }
}
