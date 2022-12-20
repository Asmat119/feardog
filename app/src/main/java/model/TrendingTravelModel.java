package model;

public class TrendingTravelModel {
    int ivtravel;
    String tvtravel;

    public int getIvtravel() {
        return ivtravel;
    }

    public String getTvtravel() {
        return tvtravel;
    }

    public void setIvtravel(int ivtravel) {
        this.ivtravel = ivtravel;
    }

    public void setTvtravel(String tvtravel) {
        this.tvtravel = tvtravel;
    }

    public TrendingTravelModel(int ivtravel, String tvtravel) {
        this.ivtravel = ivtravel;
        this.tvtravel = tvtravel;
    }
}
