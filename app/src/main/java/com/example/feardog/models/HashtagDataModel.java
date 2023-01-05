package com.example.feardog.models;

public class HashtagDataModel {
    String tvTravel,tvViews;

    public HashtagDataModel(String tvTravel, String tvViews) {
        this.tvTravel = tvTravel;
        this.tvViews = tvViews;
    }

    public String getTvTravel() {
        return tvTravel;
    }

    public void setTvTravel(String tvTravel) {
        this.tvTravel = tvTravel;
    }

    public String getTvViews() {
        return tvViews;
    }

    public void setTvViews(String tvViews) {
        this.tvViews = tvViews;
    }
}
