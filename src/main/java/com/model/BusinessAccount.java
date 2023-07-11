package com.model;

public class BusinessAccount implements InterestCalculator {
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

    public BusinessAccount() {
        System.out.println("This is Banking account");
    }

    @Override
    public double calculate(double amount) {
        return amount*roi/duration;
    }
}
