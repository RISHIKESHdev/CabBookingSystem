package com.crs.people.driver;

import com.crs.cab.Cab;
import com.crs.cab.PrimeCab;

public class PrimeDriver extends Driver{
    PrimeCab cabDetail;

    public PrimeDriver(String licenseNo, int totalYearOfExperience, int emergencyContactNo, PrimeCab cabDetail) {
        super(licenseNo, totalYearOfExperience, emergencyContactNo);
        this.cabDetail = cabDetail;
    }

    public PrimeCab getCabDetail() {
        return cabDetail;
    }

    public void setCabDetail(PrimeCab cabDetail) {
        this.cabDetail = cabDetail;
    }
}
