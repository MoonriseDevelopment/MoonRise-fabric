package dev.moonrise.module.settings;

public class BooleanSetting extends Setting{

    private Boolean enabled;
    public BooleanSetting(String name, boolean defaultvalue){
        super(name);
        this.enabled = defaultvalue;
    }
    public void toggle(){
        this.enabled = !this.enabled;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
