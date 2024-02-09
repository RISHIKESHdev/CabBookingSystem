package com.crs.cab.tariff;

import com.crs.cab.Cab;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SurgeChargeTariff extends Tariff{
    private double surgeChargePrice;
    private double pickupDistance;

    public SurgeChargeTariff(Cab cab, LocalDateTime effectiveStartDateTime, LocalDateTime effectiveEndDateTime, double surgeChargePrice, double pickupDistance) {
        super(cab, effectiveStartDateTime, effectiveEndDateTime);
        this.surgeChargePrice = surgeChargePrice;
        this.pickupDistance = pickupDistance;
    }

    public double getSurgeChargePrice() {
        return surgeChargePrice;
    }

    public void setSurgeChargePrice(double surgeChargePrice) {
        this.surgeChargePrice = surgeChargePrice;
    }

    public double getWaitTime() {
        return pickupDistance;
    }

    public void setWaitTime(double pickupDistance) {
        this.pickupDistance = pickupDistance;
    }
}
