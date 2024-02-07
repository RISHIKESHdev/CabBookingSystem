package com.crs.cab.aminities;

public class SOSSystem implements Aminity{
    private String SOSSystemType;

    public SOSSystem(String SOSSystemType) {
        this.SOSSystemType = SOSSystemType;
    }

    public String getSOSSystemType() {
        return SOSSystemType;
    }

    public void setSOSSystemType(String SOSSystemType) {
        this.SOSSystemType = SOSSystemType;
    }
}
