package com.crs.people.driver;

import com.crs.cab.StandardCab;

public class StandardDriver extends Driver{
    StandardCab cabDetail;

    public StandardDriver(String firstName, String middleName, String lastName, String emailId, String gender, int age, String password, String licenseNo, int totalYearOfExperience, int emergencyContactNo, StandardCab cabDetail) {
        super(firstName, middleName, lastName, emailId, gender, age, password, licenseNo, totalYearOfExperience, emergencyContactNo);
        this.cabDetail = cabDetail;
    }

    public StandardCab getCabDetail() {
        return cabDetail;
    }

    public void setCabDetail(StandardCab cabDetail) {
        this.cabDetail = cabDetail;
    }
}
