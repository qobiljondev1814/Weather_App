package com.example.myapplication.Domains;

public class Hourly {
    private String temp;
    private String picPath;
    private int tempTxt;

    public Hourly(String temp, String picPath, int tempTxt) {
        this.temp = temp;
        this.picPath = picPath;
        this.tempTxt = tempTxt;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getTempTxt() {
        return tempTxt;
    }

    public void setTempTxt(int tempTxt) {
        this.tempTxt = tempTxt;
    }
}
