package com.crs.cab.bike;

import com.crs.cab.StandardCab;
import com.crs.cab.aminities.Aminity;
import com.crs.people.driver.Driver;

import java.time.LocalDateTime;
import java.util.List;

public class BikeStandard extends Bike implements StandardCab {
    private int totalPassengerSeatingCapacity;

    public BikeStandard(String manufacturerName, String model, LocalDateTime manufactureDateTime, double mileage, String licensePlateNumber, int totalPassengerSeatingCapacity) {
        super(manufacturerName, model, manufactureDateTime, mileage, licensePlateNumber);
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
    }

    public int getTotalPassengerSeatingCapacity() {
        return totalPassengerSeatingCapacity;
    }

    public void setTotalPassengerSeatingCapacity(int totalPassengerSeatingCapacity) {
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
    }
}
