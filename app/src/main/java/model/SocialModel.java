package model;

public class SocialModel {
    int iconColor, ivIcon;
    String iconName;

    public SocialModel(int iconColor, int ivIcon, String iconName) {
        this.iconColor = iconColor;
        this.ivIcon = ivIcon;
        this.iconName = iconName;
    }

    public int getIconColor() {
        return iconColor;
    }

    public void setIconColor(int iconColor) {
        this.iconColor = iconColor;
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
