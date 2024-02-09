package com.crs.cab.car;

import com.crs.cab.aminities.Aminity;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Car {
    private String manufacturerName;
    private String model;
    private LocalDateTime manufactureDateTime;
    private double mileage;
    private String licensePlateNumber;
    private List<Aminity> aminityList;

    public abstract int getTotalPassengerSeatingCapacity();

    public abstract void setTotalPassengerSeatingCapacity(int totalPassengerSeatingCapacity);

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getManufactureDateTime() {
        return manufactureDateTime;
    }

    public void setManufactureDateTime(LocalDateTime manufactureDateTime) {
        this.manufactureDateTime = manufactureDateTime;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }
}