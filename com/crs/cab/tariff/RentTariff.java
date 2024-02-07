package com.crs.cab.tariff;

import com.crs.cab.Cab;

import java.time.LocalDateTime;

public class RentTariff extends Tariff{
    private double farePerHour;

    public RentTariff(Cab cab, LocalDateTime effectiveStartDateTime, LocalDateTime effectiveEndDateTime, double farePerHour) {
        super(cab, effectiveStartDateTime, effectiveEndDateTime);
        this.farePerHour = farePerHour;
    }

    public double getFarePerHour() {
        return farePerHour;
    }

    public void setFarePerHour(double farePerHour) {
        this.farePerHour = farePerHour;
    }
}
