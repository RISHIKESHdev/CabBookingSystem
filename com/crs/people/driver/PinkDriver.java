package com.crs.people.driver;

import com.crs.cab.bike.PinkBike;

public class PinkDriver {
    PinkBike bikeDetail;

    public PinkDriver(PinkBike bikeDetail) {
        this.bikeDetail = bikeDetail;
    }

    public PinkBike getBikeDetail() {
        return bikeDetail;
    }

    public void setBikeDetail(PinkBike bikeDetail) {
        this.bikeDetail = bikeDetail;
    }
}
