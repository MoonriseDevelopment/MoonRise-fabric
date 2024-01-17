package dev.moonrise.ui;

import dev.moonrise.module.Mod;
import dev.moonrise.module.ModuleManager;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import java.util.Comparator;
import java.util.List;

import static dev.moonrise.MoonriseClient.mc;

public class Hud {

    public static void render(DrawContext context, float tickDelta){
        renderArrayList(context);
    }
    public static void renderArrayList(DrawContext context){
        int index = 0;
        int sWidth = mc.getWindow().getScaledWidth();
        int sHeight = mc.getWindow().getScaledHeight();
        List<Mod> enabled = ModuleManager.INSTANCE.getEnabledModules();
        enabled.sort(Comparator.comparingInt(m -> (int)mc.textRenderer.getWidth(((Mod)m).getDisplayName())).reversed());
        for(Mod mod : enabled){
            context.drawTextWithShadow(mc.textRenderer, mod.getDisplayName(), (sWidth - 4) - mc.textRenderer.getWidth(mod.getDisplayName()), 15 + (index * mc.textRenderer.fontHeight), -1);
            index++;
        }
    }
}
