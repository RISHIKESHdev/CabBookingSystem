package com.crs.journey;

import com.crs.cab.Cab;

import java.time.LocalDateTime;

public class RentTariff {
    private Cab cab;
    private double farePerHour;
    private LocalDateTime effectiveStartDateTime;
    private LocalDateTime effectiveEndDateTime;

    public RentTariff(Cab cab, double farePerHour, LocalDateTime effectiveStartDateTime, LocalDateTime effectiveEndDateTime) {
        this.cab = cab;
        this.farePerHour = farePerHour;
        this.effectiveStartDateTime = effectiveStartDateTime;
        this.effectiveEndDateTime = effectiveEndDateTime;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public double getFarePerHour() {
        return farePerHour;
    }

    public void setFarePerHour(double farePerHour) {
        this.farePerHour = farePerHour;
    }

    public LocalDateTime getEffectiveStartDateTime() {
        return effectiveStartDateTime;
    }

    public void setEffectiveStartDateTime(LocalDateTime effectiveStartDateTime) {
        this.effectiveStartDateTime = effectiveStartDateTime;
    }

    public LocalDateTime getEffectiveEndDateTime() {
        return effectiveEndDateTime;
    }

    public void setEffectiveEndDateTime(LocalDateTime effectiveEndDateTime) {
        this.effectiveEndDateTime = effectiveEndDateTime;
    }
}
