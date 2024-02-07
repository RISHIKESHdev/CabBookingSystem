package com.crs.payment;

import java.time.LocalDateTime;

public class Upi extends Transaction implements Payment{
    public Upi(String virtualPaymentAddress,String transactionType, double totalFare, LocalDateTime transactionDateTime){
        super(transactionType,totalFare,transactionDateTime);
        this.virtualPaymentAddress=virtualPaymentAddress;
    }
    private String virtualPaymentAddress;

    public String getVirtualPaymentAddress() {
        return virtualPaymentAddress;
    }

    public void setVirtualPaymentAddress(String virtualPaymentAddress) {
        this.virtualPaymentAddress = virtualPaymentAddress;
    }
}
