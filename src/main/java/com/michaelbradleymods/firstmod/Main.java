package com.michaelbradleymods.firstmod;

import com.michaelbradleymods.firstmod.constants.ModInformation;
import com.michaelbradleymods.firstmod.init.ModItems;
import com.michaelbradleymods.firstmod.proxy.IProxy;
import com.michaelbradleymods.firstmod.util.handlers.RegistryHandler;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInformation.MODID, name = ModInformation.NAME, version = ModInformation.VERSION)
public class Main
{
    private static Logger logger;

    @SidedProxy(clientSide = ModInformation.CLIENT_PROXY_CLASS, serverSide = ModInformation.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(final FMLPreInitializationEvent event)
    {
        Main.logger = event.getModLog();

        final ModItems modItems = new ModItems();
        modItems.loadAllItems();

        registerEventHandlers(modItems);
    }

    private void registerEventHandlers(final ModItems modItems)
    {
        final RegistryHandler registryHandler = new RegistryHandler(modItems);
        MinecraftForge.EVENT_BUS.register(registryHandler);
    }

    @EventHandler
    public void init(final FMLInitializationEvent event)
    {
        // some example code
        Main.logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(final FMLPostInitializationEvent event)
    {
        Main.logger.info("Post init");
    }
}
