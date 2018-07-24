package com.michaelbradleymods.firstmod.constants;

public class ModInformation
{
    // This mod id must be set manually as otherwise you will be unable
    // to use the GradleStart(Server) commands to run the mod.
    public static final String MODID = "firstmod";
    public static final String NAME = "@MOD_NAME@";
    public static final String VERSION = "@VERSION@";

    private static final String PACKAGE_BASE = "com.michaelbradleymods.firstmod";
    public static final String CLIENT_PROXY_CLASS = ModInformation.PACKAGE_BASE + ".proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = ModInformation.PACKAGE_BASE + ".proxy.ServerProxy";
}
