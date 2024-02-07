package com.crs.people;

public class Admin extends User{
    private boolean isActive;

    public Admin(String firstName, String middleName, String lastName, String emailId, String gender, int age, String password, boolean isActive) {
        super(firstName, middleName, lastName, emailId, gender, age, password);
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
