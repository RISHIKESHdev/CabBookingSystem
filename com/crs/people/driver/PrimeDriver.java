package com.crs.people.driver;

import com.crs.cab.Cab;
import com.crs.cab.PrimeCab;

public class PrimeDriver extends Driver{
    PrimeCab cabDetail;

    public PrimeDriver(String firstName, String middleName, String lastName, String emailId, String gender, int age, String password, String licenseNo, int totalYearOfExperience, int emergencyContactNo, PrimeCab cabDetail) {
        super(firstName, middleName, lastName, emailId, gender, age, password, licenseNo, totalYearOfExperience, emergencyContactNo);
        this.cabDetail = cabDetail;
    }

    public PrimeCab getCabDetail() {
        return cabDetail;
    }

    public void setCabDetail(PrimeCab cabDetail) {
        this.cabDetail = cabDetail;
    }
}
