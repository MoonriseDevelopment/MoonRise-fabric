package dev.moonrise;

import dev.moonrise.module.Mod;
import dev.moonrise.module.ModuleManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoonriseClient implements ClientModInitializer{
    public static final String MOD_ID = "MoonRise-client";
    public static final String NAME;
    public static final Logger LOG;
    public static MinecraftClient mc;
    public static final MoonriseClient INSTANCE = new MoonriseClient();

    static {
        NAME = "MoonRise";
        LOG = LoggerFactory.getLogger(NAME);
    }

    @Override
    public void onInitializeClient() {
        LOG.info("Starting MoonRise client");
        mc = MinecraftClient.getInstance();
    }

    public void onKeyPress(int key, int action) {
        if(action == GLFW.GLFW_PRESS){
        for(Mod module : ModuleManager.INSTANCE.getModules()){
            if(key == module.getKey()) module.toggle();
        }
    }
    }
    public void onTick(){
        if(mc.player != null){
            for(Mod module : ModuleManager.INSTANCE.getEnabledModules()){
                module.onTick();
            }
        }
    }
}
