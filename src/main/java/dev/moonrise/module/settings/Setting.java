package dev.moonrise.module.settings;

public class Setting {
    private String name;
    private Boolean visible = true;

    public Setting(String name){
        this.name = name;
    }

    public Boolean isVisible() {
        return visible;
    }
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
