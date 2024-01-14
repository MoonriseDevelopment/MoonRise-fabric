package dev.moonrise;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoonriseClient implements ClientModInitializer{
    public static final String MOD_ID = "MoonRise-client";
    public static final ModMetadata MOD_META;
    public static final String NAME;
    public static final Logger LOG;
    public static MinecraftClient mc;

    static {
        MOD_META = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow().getMetadata();

        NAME = MOD_META.getName();
        LOG = LoggerFactory.getLogger(NAME);
    }

    @Override
    public void onInitializeClient() {
        LOG.info("Starting MoonRise client");
        mc = MinecraftClient.getInstance();
    }
}
