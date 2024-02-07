package com.crs.navigate;

public class Location {
    private Address address;
    private GeoLocation geoLocation;

    public Location(Address address, GeoLocation geoLocation) {
        this.address = address;
        this.geoLocation = geoLocation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }
}
