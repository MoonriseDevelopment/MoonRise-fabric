package dev.moonrise.module;

import java.util.ArrayList;
import java.util.List;

import dev.moonrise.module.movement.Flight;

public class ModuleManager {
    public static ModuleManager INSTANCE = new ModuleManager();
    private List<Mod> modules = new ArrayList<>();
    public ModuleManager(){
        addModules();
    }
    public List<Mod> getModules() {
        return modules;
    }
    public List<Mod> getEnabledModules(){
        List<Mod> enabled = new ArrayList<>();
        for(Mod module : modules){
            if(module.isEnabled()) enabled.add(module);
        }
        return enabled;
    }

    private void addModules(){
        modules.add(new Flight());
    }
}
