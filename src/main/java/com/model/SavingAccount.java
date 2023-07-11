package com.model;

public class SavingAccount implements InterestCalculator{

    private int duration;
    private double roi;

//    public int getDuration() {
//        return duration;
//    }
//
//    public void setDuration(int duration) {
//        this.duration = duration;
//    }
//
//    public double getRoi() {
//        return roi;
//    }
//
//    public void setRoi(double roi) {
//        this.roi = roi;
//    }

    public SavingAccount(int duration, double roi) {
        super();
        this.duration=duration;
        this.roi=roi;
    }

    @Override
    public double calculate(double amount){
        return amount*roi/duration;
    }

    public void init(){
        System.out.println("Init method called ins Saving account...");
    }

    public void destroy(){
        System.out.println("Destroy method called in saving account...");
    }
}
