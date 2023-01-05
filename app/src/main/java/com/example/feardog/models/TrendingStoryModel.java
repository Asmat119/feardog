package com.example.feardog.models;

public class TrendingStoryModel {
    int ivBack, ivAvatar;
    String tvUserName;


    public TrendingStoryModel(int ivBack, int ivAvatar, String tvUserName) {
        this.ivBack = ivBack;
        this.ivAvatar = ivAvatar;
        this.tvUserName = tvUserName;
    }

    public int getIvBack() {
        return ivBack;
    }

    public void setIvBack(int ivBack) {
        this.ivBack = ivBack;
    }

    public int getIvAvatar() {
        return ivAvatar;
    }

    public void setIvAvatar(int ivAvatar) {
        this.ivAvatar = ivAvatar;
    }

    public String getTvUserName() {
        return tvUserName;
    }

    public void setTvUserName(String tvUserName) {
        this.tvUserName = tvUserName;
    }
}
