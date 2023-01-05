package model;

public class ActionModel {
    int  ivIcon;
    String iconName;

    public ActionModel(int ivIcon, String iconName) {
        this.ivIcon = ivIcon;
        this.iconName = iconName;
    }

    public int getIvIcon() {
        return ivIcon;
    }

    public void setIvIcon(int ivIcon) {
        this.ivIcon = ivIcon;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
}
