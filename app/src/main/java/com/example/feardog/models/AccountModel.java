package com.example.feardog.models;

public class AccountModel {
    int imAvatar;
    String tvName, tvAcc;

    public AccountModel(int imAvatar, String tvName, String tvAcc) {
        this.imAvatar = imAvatar;
        this.tvName = tvName;
        this.tvAcc = tvAcc;
    }

    public int getImAvatar() {
        return imAvatar;
    }

    public String getTvName() {
        return tvName;
    }

    public String getTvAcc() {
        return tvAcc;
    }

    public void setImAvatar(int imAvatar) {
        this.imAvatar = imAvatar;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public void setTvAcc(String tvAcc) {
        this.tvAcc = tvAcc;
    }
}
