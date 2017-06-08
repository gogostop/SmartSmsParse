package com.cmcc.online.data;

import java.util.List;

/**
 * Created by GoGoStop on 2017/6/7.
 */
public class CardBase {
    private int cardType;
    private int detailType;
    private List<CardItemInfo> mainData;
    private List<CardItemInfo> extraData;
    private List<SmsProgress> porgressData;
    private List<TravelInfo> travelData;

    public CardBase(int cardType) {
        this.cardType = cardType;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public int getDetailType() {
        return detailType;
    }

    public void setDetailType(int detailType) {
        this.detailType = detailType;
    }

    public List<CardItemInfo> getMainData() {
        return mainData;
    }

    public void setMainData(List<CardItemInfo> mainData) {
        this.mainData = mainData;
    }

    public List<CardItemInfo> getExtraData() {
        return extraData;
    }

    public void setExtraData(List<CardItemInfo> extraData) {
        this.extraData = extraData;
    }

    public List<SmsProgress> getPorgressData() {
        return porgressData;
    }

    public void setPorgressData(List<SmsProgress> porgressData) {
        this.porgressData = porgressData;
    }

    public List<TravelInfo> getTravelData() {
        return travelData;
    }

    public void setTravelData(List<TravelInfo> travelData) {
        this.travelData = travelData;
    }
}
