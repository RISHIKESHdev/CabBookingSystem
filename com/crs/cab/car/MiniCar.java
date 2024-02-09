package com.crs.cab.car;

import com.crs.cab.StandardCab;
import com.crs.cab.aminities.Aminity;

import java.time.LocalDateTime;
import java.util.List;

public class MiniCar extends Car implements StandardCab {
    private int totalPassengerSeatingCapacity;

    public MiniCar(String manufacturerName, String model, LocalDateTime manufactureDateTime, double mileage, String licensePlateNumber, List<Aminity> aminityList, int totalPassengerSeatingCapacity) {
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