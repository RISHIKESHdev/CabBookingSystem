package com.crs.payment;

import java.time.LocalDateTime;

public class NetBanking extends Transaction implements Payment{
    public NetBanking(String accountHolderName,String bankName,String IFSCCode,int AccountNumber,String transactionType, double totalFare, LocalDateTime transactionDateTime){
        super(transactionType,totalFare,transactionDateTime);
        this.accountHolderName = accountHolderName;
        this.bankName=bankName;
        this.IFSCCode=IFSCCode;
        this.AccountNumber=AccountNumber;
    }
    private String accountHolderName;
    private String bankName;
    private String IFSCCode;
    private int AccountNumber;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }
}
