package com.michaelbradleymods.firstmod;

import com.michaelbradleymods.firstmod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    // This mod id must be set manually as otherwise you will be unable
    // to use the GradleStart(Server) commands to run the mod.
    public static final String MODID = "firstmod";
    public static final String NAME = "@MOD_NAME@";
    public static final String VERSION = "@VERSION@";
    public static final String CLIENT_PROXY_CLASS = "com.michaelbradleymods.firstmod.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.michaelbradleymods.firstmod.proxy.CommonProxy";

    private static Logger logger;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        logger.info("Post init");
    }
}
