package com.crs.cab.tariff;

import com.crs.cab.Cab;

import java.time.LocalDateTime;

public class RideTariff extends Tariff{
    public enum CityTier{TIER_ONE,TIER_TWO,TIER_THREE};
    private double farePerKM;
    private CityTier cityTier;

    public RideTariff(Cab cab, LocalDateTime effectiveStartDateTime, LocalDateTime effectiveEndDateTime, double farePerKM, CityTier cityTier) {
        super(cab, effectiveStartDateTime, effectiveEndDateTime);
        this.farePerKM = farePerKM;
        this.cityTier = cityTier;
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
}
