package com.crs.cab.aminities;

public class Monitor {
    private double screenSizeInches;
    String panelType;

    public Monitor(double screenSizeInches, String panelType) {
        this.screenSizeInches = screenSizeInches;
        this.panelType = panelType;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }
}
