package dev.moonrise.module.movement;

import dev.moonrise.module.Mod;
import org.lwjgl.glfw.GLFW;

import static dev.moonrise.MoonriseClient.mc;

public class Flight extends Mod {
    public Flight() {
        super("Flight", "allows you to fly!", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_F);
    }

    public void onTick() {
        mc.player.getAbilities().allowFlying = true;
        super.onTick();
    }

    public void onDisable() {
        mc.player.getAbilities().allowFlying = false;
        mc.player.getAbilities().flying = false;
        super.onDisable();
    }

}