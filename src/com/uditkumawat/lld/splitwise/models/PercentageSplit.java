package com.uditkumawat.lld.splitwise.models;

public class PercentageSplit extends Split{

    private double percentage;
    
    public PercentageSplit(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
