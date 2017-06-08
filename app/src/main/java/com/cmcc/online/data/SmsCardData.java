package com.cmcc.online.data;

import com.ted.android.data.BubbleEntity;

import java.util.List;

/**
 * Created by GoGoStop on 2017/6/7.
 */
public class SmsCardData {
    private String title;
    private String subTitle;
    private CardBase cardBase;
    private List<BubbleEntity> bubbleEntities;
    private String icon;
    private String primaryColor;

    public SmsCardData() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public CardBase getCardBase() {
        return cardBase;
    }

    public void setCardBase(CardBase cardBase) {
        this.cardBase = cardBase;
    }

    public List<BubbleEntity> getBubbleEntities() {
        return bubbleEntities;
    }

    public void setBubbleEntities(List<BubbleEntity> bubbleEntities) {
        this.bubbleEntities = bubbleEntities;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }
}

