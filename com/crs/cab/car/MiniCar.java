package com.crs.cab.car;

import com.crs.cab.StandardCab;
import com.crs.cab.aminities.Aminity;

import java.time.LocalDateTime;
import java.util.List;

public class MiniCar extends Car implements StandardCab {
    private int totalPassengerSeatingCapacity;

    public int getTotalPassengerSeatingCapacity() {
        return totalPassengerSeatingCapacity;
    }

    public void setTotalPassengerSeatingCapacity(int totalPassengerSeatingCapacity) {
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
    }
}