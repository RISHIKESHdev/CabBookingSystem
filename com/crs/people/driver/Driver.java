package com.crs.people.driver;

import com.crs.people.User;

public abstract class Driver extends User {
    private String licenseNo;
    private int totalYearOfExperience;
    private int emergencyContactNo;

    public Driver(String firstName, String middleName, String lastName, String emailId, String gender, int age, String password, String licenseNo, int totalYearOfExperience, int emergencyContactNo) {
        super(firstName, middleName, lastName, emailId, gender, age, password);
        this.licenseNo = licenseNo;
        this.totalYearOfExperience = totalYearOfExperience;
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public int getTotalYearOfExperience() {
        return totalYearOfExperience;
    }

    public void setTotalYearOfExperience(int totalYearOfExperience) {
        this.totalYearOfExperience = totalYearOfExperience;
    }

    public int getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(int emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }
}