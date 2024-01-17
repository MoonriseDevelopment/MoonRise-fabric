package dev.moonrise.module.movement;

import dev.moonrise.module.Mod;
import org.lwjgl.glfw.GLFW;

import static dev.moonrise.MoonriseClient.mc;

public class Sprint extends Mod{

    public Sprint() {
        super("Sprint", "automaticly sprints for you!", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_V);
    }

    private void run() {
        if (mc.player.getHungerManager().getFoodLevel() <= 6){
            return;
        } else {
            mc.player.setSprinting(true);
        }
    }
    public void onTick() {
        if (mc.player.forwardSpeed > 0) {
            run();
        }
        super.onTick();
    }
}
