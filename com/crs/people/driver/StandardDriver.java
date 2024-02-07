package com.crs.people.driver;

import com.crs.cab.StandardCab;

public class StandardDriver extends Driver{
    StandardCab cabDetail;

    public StandardDriver(String licenseNo, int totalYearOfExperience, int emergencyContactNo, StandardCab cabDetail) {
        super(licenseNo, totalYearOfExperience, emergencyContactNo);
        this.cabDetail = cabDetail;
    }

    public StandardCab getCabDetail() {
        return cabDetail;
    }

    public void setCabDetail(StandardCab cabDetail) {
        this.cabDetail = cabDetail;
    }
}
