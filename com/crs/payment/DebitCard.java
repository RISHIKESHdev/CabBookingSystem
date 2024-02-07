package com.crs.payment;

import java.time.LocalDateTime;

public class DebitCard extends Transaction implements Payment{
    public DebitCard(String cardHolderName,String cardExpiryDate,int cardNumber,int cardCVV,int cardPIN,String transactionType, double totalFare, LocalDateTime transactionDateTime){
        super(transactionType,totalFare,transactionDateTime);
        this.cardHolderName=cardHolderName;
        this.cardExpiryDate=cardExpiryDate;
        this.cardNumber=cardNumber;
        this.cardCVV=cardCVV;
        this.cardPIN=cardPIN;
    }
    private String cardHolderName;
    private String cardExpiryDate;
    private int cardNumber;
    private int cardCVV;
    private int cardPIN;

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        this.cardCVV = cardCVV;
    }

    public int getCardPIN() {
        return cardPIN;
    }

    public void setCardPIN(int cardPIN) {
        this.cardPIN = cardPIN;
    }
}
