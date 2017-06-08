package com.cmcc.online.smsapi;

import android.content.Context;

import com.cmcc.online.data.SmsCardData;
import com.ted.android.core.SmsParserEngine;
import com.ted.android.data.SmsEntity;
import com.ted.android.smscard.CardBase;

/**
 * Created by GoGoStop on 2017/6/7.
 */
public class SmsParserEntity {

    public static SmsCardData getCardData(Context context, long msgId, String number, String body, long date) {
        SmsCardData smsCardData = new SmsCardData();
        SmsEntity entity = SmsParserEngine.getInstance(context).parseMessage(msgId, body, number, date);
        if (entity != null) {
            smsCardData.setBubbleEntities(entity.getAllEntities());
            CardBase cardBase = entity.getCardBase();
            com.cmcc.online.data.CardBase cardBaseMy = new com.cmcc.online.data.CardBase(cardBase.getCardBaseType());
            cardBaseMy.setDetailType(cardBase.getSubCardBaseType());
//           TODO libyellowbubble cardBase 2 gogostop CardBase
            smsCardData.setCardBase(cardBaseMy);

            return smsCardData;
        }
        return null;
    }
}
