package com.michaelbradleymods.firstmod.util.handlers;

import com.michaelbradleymods.firstmod.init.ModItems;
import com.michaelbradleymods.firstmod.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandlers
{
    @SubscribeEvent
    public static void onItemRegister(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(final ModelRegistryEvent event)
    {
        for (final Item item : ModItems.ITEMS)
        {
            if (item instanceof IHasModel)
            {
                ((IHasModel) item).registerModels();
            }
        }
    }
}
