package com.crs.cab.car;

import com.crs.cab.StandardCab;
import com.crs.cab.aminities.Aminity;
import com.crs.people.driver.Driver;

import java.time.LocalDateTime;
import java.util.List;

public class MiniCar implements Car, StandardCab {
    private String manufacturerName;
    private String model;
    private LocalDateTime manufactureDateTime;
    private int totalPassengerSeatingCapacity;
    private double mileage;
    private String licensePlateNumber;
    private List<Aminity> aminityList;

    public MiniCar(String manufacturerName, String model, LocalDateTime manufactureDateTime, int totalPassengerSeatingCapacity, double mileage, String licensePlateNumber) {
        this.manufacturerName = manufacturerName;
        this.model = model;
        this.manufactureDateTime = manufactureDateTime;
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
        this.mileage = mileage;
        this.licensePlateNumber = licensePlateNumber;
    }

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

    public int getTotalPassengerSeatingCapacity() {
        return totalPassengerSeatingCapacity;
    }

    public void setTotalPassengerSeatingCapacity(int totalPassengerSeatingCapacity) {
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
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
