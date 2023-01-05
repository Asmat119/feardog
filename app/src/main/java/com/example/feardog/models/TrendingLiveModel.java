package com.example.feardog.models;

public class TrendingLiveModel {
    int ivbak, ivAva;
    String tvViewrs;

    public TrendingLiveModel(int ivbak, int ivAva, String tvViewrs) {
        this.ivbak = ivbak;
        this.ivAva = ivAva;
        this.tvViewrs = tvViewrs;
    }

    public int getIvbak() {
        return ivbak;
    }

    public int getIvAva() {
        return ivAva;
    }

    public void setIvbak(int ivbak) {
        this.ivbak = ivbak;
    }

    public void setIvAva(int ivAva) {
        this.ivAva = ivAva;
    }

    public void setTvViewrs(String tvViewrs) {
        this.tvViewrs = tvViewrs;
    }

    public String getTvViewrs() {
        return tvViewrs;
    }
}


