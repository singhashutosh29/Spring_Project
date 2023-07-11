package com.model;

public class FDACalculator implements InterestCalculator {

    private int duration;
    private double roi;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public FDACalculator(int duration, double roi) {
        super();
        this.duration=duration;
        this.roi=roi;
        System.out.println("This is FDA account");
    }

    @Override
    public double calculate(double amount){
        return amount*roi/duration;
    }
}
