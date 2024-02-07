package com.crs.cab.tariff;

import com.crs.cab.Cab;

import java.time.LocalDateTime;

public abstract class Tariff {
    private Cab cab;
    private LocalDateTime effectiveStartDateTime;
    private LocalDateTime effectiveEndDateTime;

    public Tariff(Cab cab, LocalDateTime effectiveStartDateTime, LocalDateTime effectiveEndDateTime) {
        this.cab = cab;
        this.effectiveStartDateTime = effectiveStartDateTime;
        this.effectiveEndDateTime = effectiveEndDateTime;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
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
