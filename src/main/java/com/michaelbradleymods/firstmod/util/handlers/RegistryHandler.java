package com.michaelbradleymods.firstmod.util.handlers;

import com.michaelbradleymods.firstmod.init.ModItems;
import com.michaelbradleymods.firstmod.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistryHandler
{
    private final ModItems modItems;

    /**
     * Create a handler for registry events.
     *
     * @param modItems should be an initialised ModItems instance
     */
    public RegistryHandler(final ModItems modItems)
    {
        this.modItems = modItems;
    }

    @SubscribeEvent
    public void onItemRegister(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(modItems.items.toArray(new Item[0]));
    }

    @SubscribeEvent
    public void onModelRegister(final ModelRegistryEvent event)
    {
        for (final Item item : modItems.items)
        {
            if (item instanceof IHasModel)
            {
                ((IHasModel) item).registerModels();
            }
        }
    }
}
