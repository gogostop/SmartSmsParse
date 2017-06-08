package com.cmcc.online.data;

/**
 * Created by GoGoStop on 2017/6/7.
 */
public class SmsProgress {
    private String title;
    private float total;
    private float used;
    private float left;
    private String unit;

    public SmsProgress() {

    }

    public SmsProgress(String title, float total, float used, float left, String unit) {
        this.title = title;
        this.total = total;
        this.used = used;
        this.left = left;
        this.unit = unit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getUsed() {
        return used;
    }

    public void setUsed(float used) {
        this.used = used;
    }

    public float getLeft() {
        return left;
    }

    public void setLeft(float left) {
        this.left = left;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
