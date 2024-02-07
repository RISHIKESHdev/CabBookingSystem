package com.crs.cab.bike;

import com.crs.cab.StandardCab;
import com.crs.cab.aminities.Aminity;
import com.crs.people.driver.Driver;

import java.time.LocalDateTime;
import java.util.List;

public class BikeStandard implements Bike, StandardCab {
    private String manufacturerName;
    private String model;
    private String licensePlateNumber;
    private double mileage;
    private int totalPassengerSeatingCapacity;
    private LocalDateTime manufactureDateTime;
    private List<Aminity> aminityList;

    public BikeStandard(String manufacturerName, String model, String licensePlateNumber, double mileage, int totalPassengerSeatingCapacity, LocalDateTime manufactureDateTime) {
        this.manufacturerName = manufacturerName;
        this.model = model;
        this.licensePlateNumber = licensePlateNumber;
        this.mileage = mileage;
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
        this.manufactureDateTime = manufactureDateTime;
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

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getTotalPassengerSeatingCapacity() {
        return totalPassengerSeatingCapacity;
    }

    public void setTotalPassengerSeatingCapacity(int totalPassengerSeatingCapacity) {
        this.totalPassengerSeatingCapacity = totalPassengerSeatingCapacity;
    }

    public LocalDateTime getManufactureDateTime() {
        return manufactureDateTime;
    }

    public void setManufactureDateTime(LocalDateTime manufactureDateTime) {
        this.manufactureDateTime = manufactureDateTime;
    }

    public List<Aminity> getAminityList() {
        return aminityList;
    }

    public void addAminityList(Aminity aminity) {
        this.aminityList.add(aminity);
    }
}
