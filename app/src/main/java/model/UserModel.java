package model;

public class UserModel {
    int ivAvatar;
    String tvName, tvUserName;

    public UserModel(int ivAvatar, String tvName, String tvUserName) {
        this.ivAvatar = ivAvatar;
        this.tvName = tvName;
        this.tvUserName = tvUserName;
    }

    public int getIvAvatar() {
        return ivAvatar;
    }

    public String getTvName() {
        return tvName;
    }

    public String getTvUserName() {
        return tvUserName;
    }

    public void setIvAvatar(int ivAvatar) {
        this.ivAvatar = ivAvatar;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public void setTvUserName(String tvUserName) {
        this.tvUserName = tvUserName;
    }
}
