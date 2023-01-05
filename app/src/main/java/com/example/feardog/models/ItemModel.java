package com.example.feardog.models;

public class ItemModel {
    int imgAvatar1,imgAvatar2;
    String tvFirstName, tvSecondName, tvLikeVideo, btnText;
    int eventImage;

    public ItemModel(int imgAvatar1, int imgAvatar2, String tvFirstName, String tvSecondName, String tvLikeVideo, String btnText, int eventImage) {
        this.imgAvatar1 = imgAvatar1;
        this.imgAvatar2 = imgAvatar2;
        this.tvFirstName = tvFirstName;
        this.tvSecondName = tvSecondName;
        this.tvLikeVideo = tvLikeVideo;
        this.btnText = btnText;
        this.eventImage = eventImage;
    }

    public int getImgAvatar1() {
        return imgAvatar1;
    }

    public void setImgAvatar1(int imgAvatar1) {
        this.imgAvatar1 = imgAvatar1;
    }

    public int getImgAvatar2() {
        return imgAvatar2;
    }

    public void setImgAvatar2(int imgAvatar2) {
        this.imgAvatar2 = imgAvatar2;
    }

    public String getTvFirstName() {
        return tvFirstName;
    }

    public void setTvFirstName(String tvFirstName) {
        this.tvFirstName = tvFirstName;
    }

    public String getTvSecondName() {
        return tvSecondName;
    }

    public void setTvSecondName(String tvSecondName) {
        this.tvSecondName = tvSecondName;
    }

    public String getTvLikeVideo() {
        return tvLikeVideo;
    }

    public void setTvLikeVideo(String tvLikeVideo) {
        this.tvLikeVideo = tvLikeVideo;
    }

    public String getBtnText() {
        return btnText;
    }

    public void setBtnText(String btnText) {
        this.btnText = btnText;
    }

    public int getEventImage() {
        return eventImage;
    }

    public void setEventImage(int eventImage) {
        this.eventImage = eventImage;
    }
}
