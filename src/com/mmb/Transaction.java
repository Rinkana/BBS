package com.mmb;

import java.math.BigDecimal;

/**
 * Created by Max on 8-12-2014.
 */
public class Transaction {
    private String date = "";
    private Long amount = 0L; //All data is stored as Longs and later will be converted to doubles. Devide by 100000000L
    private String sender = "";
    private String receiver = "";


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
