package com.crs.people.driver;

import com.crs.cab.bike.PinkBike;

public class PinkDriver extends Driver{
    PinkBike bikeDetail;

    public PinkDriver(String firstName, String middleName, String lastName, String emailId, String gender, int age, String password, String licenseNo, int totalYearOfExperience, int emergencyContactNo, PinkBike bikeDetail) {
        super(firstName, middleName, lastName, emailId, gender, age, password, licenseNo, totalYearOfExperience, emergencyContactNo);
        this.bikeDetail = bikeDetail;
    }

    public PinkBike getBikeDetail() {
        return bikeDetail;
    }

    public void setBikeDetail(PinkBike bikeDetail) {
        this.bikeDetail = bikeDetail;
    }
}
