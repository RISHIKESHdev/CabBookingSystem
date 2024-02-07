package com.crs.payment;

import java.time.LocalDateTime;

class Transaction {
    private static int transactionIndex=1;
    Transaction(String transactionType,double totalFare,LocalDateTime transactionDateTime){
        this.transactionId="Trans-"+(Transaction.transactionIndex++);
        this.transactionType=transactionType;
        this.totalFare=totalFare;
        this.transactionDateTime=transactionDateTime;
    }
    private String transactionId;
    private String transactionType;
    private String responseMessage;
    private boolean transactionStatus;
    private double totalFare;
    private int responseCode;
    private LocalDateTime transactionDateTime;

    public String getTransactionID() {
        return transactionId;
    }

    public void setTransactionID(String transactionID) {
        transactionId = transactionID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(LocalDateTime transactionDate) {
        this.transactionDateTime = transactionDate;
    }
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public boolean isTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(boolean transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}