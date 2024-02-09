package com.crs.cab.bike;

import com.crs.cab.PrimeCab;
import com.crs.cab.aminities.Aminity;
import com.crs.cab.aminities.SOSSystem;
import com.crs.people.driver.Driver;

import java.time.LocalDateTime;
import java.util.List;

public class PinkBike extends Bike implements PrimeCab {
    private int totalPassengerSeatingCapacity;
    private SOSSystem sosSystem;

    public PinkBike(String manufacturerName, String model, LocalDateTime manufactureDateTime, double mileage, String licensePlateNumber, int totalPassengerSeatingCapacity, SOSSystem sosSystem) {
        super(manufacturerName, model, manufactureDateTime, mileage, licensePlateNumber);
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
        this.sosSystem = sosSystem;
    }

    public int getTotalPassengerSeatingCapacity() {
        return totalPassengerSeatingCapacity;
    }

    public void setTotalPassengerSeatingCapacity(int totalPassengerSeatingCapacity) {
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
    }
}
