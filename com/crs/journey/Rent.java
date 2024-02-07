package com.crs.journey;

import com.crs.navigate.GeoLocation;
import com.crs.navigate.Location;
import com.crs.payment.Payment;
import com.crs.people.driver.Driver;

import java.time.LocalDateTime;

public class Rent implements Trip{
    private Location pickUpLocation;
    private Location dropLocation;
    private GeoLocation cabGeoLocation;
    private double totalDistanceKM;
    private double baseFarePerHour;
    private double gstAmount;
    private double totalFare;
    private Payment paymentDetail;
    private LocalDateTime bookedDateTime;
    private LocalDateTime rideStartDateTime;
    private LocalDateTime rideEndDateTime;
    private Driver driverDetail;

    public Rent(Location pickUpLocation, Location dropLocation, GeoLocation cabGeoLocation, double totalDistanceKM, double baseFarePerHour, double gstAmount, double totalFare, Payment paymentDetail, LocalDateTime bookedDateTime, LocalDateTime rideStartDateTime, LocalDateTime rideEndDateTime, Driver driverDetail) {
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.cabGeoLocation = cabGeoLocation;
        this.totalDistanceKM = totalDistanceKM;
        this.baseFarePerHour = baseFarePerHour;
        this.gstAmount = gstAmount;
        this.totalFare = totalFare;
        this.paymentDetail = paymentDetail;
        this.bookedDateTime = bookedDateTime;
        this.rideStartDateTime = rideStartDateTime;
        this.rideEndDateTime = rideEndDateTime;
        this.driverDetail = driverDetail;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public GeoLocation getCabGeoLocation() {
        return cabGeoLocation;
    }

    public void setCabGeoLocation(GeoLocation cabGeoLocation) {
        this.cabGeoLocation = cabGeoLocation;
    }

    public double getTotalDistanceKM() {
        return totalDistanceKM;
    }

    public void setTotalDistanceKM(double totalDistanceKM) {
        this.totalDistanceKM = totalDistanceKM;
    }

    public double getBaseFarePerHour() {
        return baseFarePerHour;
    }

    public void setBaseFarePerHour(double baseFarePerHour) {
        this.baseFarePerHour = baseFarePerHour;
    }

    public double getGstAmount() {
        return gstAmount;
    }

    public void setGstAmount(double gstAmount) {
        this.gstAmount = gstAmount;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public Payment getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(Payment paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    public LocalDateTime getBookedDateTime() {
        return bookedDateTime;
    }

    public void setBookedDateTime(LocalDateTime bookedDateTime) {
        this.bookedDateTime = bookedDateTime;
    }

    public LocalDateTime getRideStartDateTime() {
        return rideStartDateTime;
    }

    public void setRideStartDateTime(LocalDateTime rideStartDateTime) {
        this.rideStartDateTime = rideStartDateTime;
    }

    public LocalDateTime getRideEndDateTime() {
        return rideEndDateTime;
    }

    public void setRideEndDateTime(LocalDateTime rideEndDateTime) {
        this.rideEndDateTime = rideEndDateTime;
    }

    public Driver getDriverDetail() {
        return driverDetail;
    }

    public void setDriverDetail(Driver driverDetail) {
        this.driverDetail = driverDetail;
    }
}
