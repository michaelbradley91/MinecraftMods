package com.michaelbradleymods.firstmod.init;

import com.michaelbradleymods.firstmod.constants.ModInformation;
import com.michaelbradleymods.firstmod.items.RubyItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashSet;
import java.util.Set;

@GameRegistry.ObjectHolder(ModInformation.MODID)
public class ModItems
{
    public final Set<Item> items = new HashSet<>();

    @GameRegistry.ObjectHolder(RubyItem.NAME)
    public static final Item RUBY = null;

    public void loadAllItems()
    {
        items.add(new RubyItem());
    }
}
