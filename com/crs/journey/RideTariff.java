package com.crs.journey;

import com.crs.cab.Cab;

import java.time.LocalDateTime;

public class RideTariff {
    public enum CityTier{TIER_ONE,TIER_TWO,TIER_THREE};
    private Cab cab;
    private double farePerKM;
    private CityTier cityTier;
    private LocalDateTime effectiveStartDateTime;
    private LocalDateTime effectiveEndDateTime;

    public RideTariff(Cab cab, double farePerKM, CityTier cityTier, LocalDateTime effectiveStartDateTime, LocalDateTime effectiveEndDateTime) {
        this.cab = cab;
        this.farePerKM = farePerKM;
        this.cityTier = cityTier;
        this.effectiveStartDateTime = effectiveStartDateTime;
        this.effectiveEndDateTime = effectiveEndDateTime;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public double getFarePerKM() {
        return farePerKM;
    }

    public void setFarePerKM(double farePerKM) {
        this.farePerKM = farePerKM;
    }

    public CityTier getCityTier() {
        return cityTier;
    }

    public void setCityTier(CityTier cityTier) {
        this.cityTier = cityTier;
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
