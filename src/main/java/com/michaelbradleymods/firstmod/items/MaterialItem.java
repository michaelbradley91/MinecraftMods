package com.michaelbradleymods.firstmod.items;

import com.michaelbradleymods.firstmod.Main;
import com.michaelbradleymods.firstmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;

public abstract class MaterialItem extends BaseItem implements IHasModel
{
    public MaterialItem(final String name)
    {
        this(name, CreativeTabs.MISC);
    }

    public MaterialItem(final String name, final CreativeTabs creativeTab)
    {
        super(name);
        setCreativeTab(creativeTab);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
