package com.crs.cab.car;

import com.crs.cab.PrimeCab;
import com.crs.cab.aminities.Aminity;

import java.time.LocalDateTime;
import java.util.List;

public class PrimeSUV extends Car implements PrimeCab {
    private int totalPassengerSeatingCapacity;

    public PrimeSUV(String manufacturerName, String model, LocalDateTime manufactureDateTime, double mileage, String licensePlateNumber, List<Aminity> aminityList, int totalPassengerSeatingCapacity) {
        super(manufacturerName, model, manufactureDateTime, mileage, licensePlateNumber, aminityList);
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
    }

    public int getTotalPassengerSeatingCapacity() {
        return totalPassengerSeatingCapacity;
    }

    public void setTotalPassengerSeatingCapacity(int totalPassengerSeatingCapacity) {
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
    }
}