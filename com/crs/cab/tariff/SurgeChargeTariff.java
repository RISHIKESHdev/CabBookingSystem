package com.crs.cab.tariff;

import com.crs.cab.Cab;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SurgeChargeTariff extends Tariff{
    private double surgeChargePrice;
    private LocalTime waitTime;

    public SurgeChargeTariff(Cab cab, LocalDateTime effectiveStartDateTime, LocalDateTime effectiveEndDateTime, double surgeChargePrice, LocalTime waitTime) {
        super(cab, effectiveStartDateTime, effectiveEndDateTime);
        this.surgeChargePrice = surgeChargePrice;
        this.waitTime = waitTime;
    }

    public double getSurgeChargePrice() {
        return surgeChargePrice;
    }

    public void setSurgeChargePrice(double surgeChargePrice) {
        this.surgeChargePrice = surgeChargePrice;
    }

    public LocalTime getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(LocalTime waitTime) {
        this.waitTime = waitTime;
    }
}
