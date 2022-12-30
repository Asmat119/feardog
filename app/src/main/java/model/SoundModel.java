package model;

public class SoundModel {
    int ivBk;
    String tvSname, tvStrack;

    public SoundModel(int ivBk, String tvSname, String tvStrack) {
        this.ivBk = ivBk;
        this.tvSname = tvSname;
        this.tvStrack = tvStrack;
    }

    public int getIvBk() {
        return ivBk;
    }

    public String getTvSname() {
        return tvSname;
    }

    public String getTvStrack() {
        return tvStrack;
    }

    public void setIvBk(int ivBk) {
        this.ivBk = ivBk;
    }

    public void setTvSname(String tvSname) {
        this.tvSname = tvSname;
    }

    public void setTvStrack(String tvStrack) {
        this.tvStrack = tvStrack;
    }
}