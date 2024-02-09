package com.crs.cab.car;

import com.crs.cab.PrimeCab;

public class PrimeSedan extends Car implements PrimeCab {
    private int totalPassengerSeatingCapacity;

    public int getTotalPassengerSeatingCapacity() {
        return totalPassengerSeatingCapacity;
    }

    public void setTotalPassengerSeatingCapacity(int totalPassengerSeatingCapacity) {
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
    }
}