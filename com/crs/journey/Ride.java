package com.crs.journey;

import com.crs.navigate.GeoLocation;
import com.crs.navigate.Location;
import com.crs.payment.Payment;
import com.crs.people.driver.Driver;

import java.time.LocalDateTime;

public class Ride implements Trip{
    private Location pickUpLocation;
    private Location dropLocation;
    private GeoLocation cabGeoLocation;
    private double totalDistanceKM;
    private double baseFarePerKM;
    private double surgeCharge;
    private double gstAmount;
    private double totalFare;
    private Payment paymentDetail;
    private LocalDateTime bookedDateTime;
    private LocalDateTime rideStartDateTime;
    private LocalDateTime rideEndDateTime;
    private Driver driverDetail;

    public Ride(Location pickUpLocation, Location dropLocation, GeoLocation cabGeoLocation, double totalDistanceKM, double baseFarePerKM, double surgeCharge, double gstAmount, double totalFare, Payment paymentDetail, LocalDateTime bookedDateTime, LocalDateTime rideStartDateTime, LocalDateTime rideEndDateTime, Driver driverDetail) {
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.cabGeoLocation = cabGeoLocation;
        this.totalDistanceKM = totalDistanceKM;
        this.baseFarePerKM = baseFarePerKM;
        this.surgeCharge = surgeCharge;
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

    public double getBaseFarePerKM() {
        return baseFarePerKM;
    }

    public void setBaseFarePerKM(double baseFarePerKM) {
        this.baseFarePerKM = baseFarePerKM;
    }

    public double getSurgeCharge() {
        return surgeCharge;
    }

    public void setSurgeCharge(double surgeCharge) {
        this.surgeCharge = surgeCharge;
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
