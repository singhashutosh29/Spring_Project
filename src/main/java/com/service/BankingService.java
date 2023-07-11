package com.service;

import com.model.InterestCalculator;

public class BankingService {

    private InterestCalculator ic;

    public InterestCalculator getIc() {
        return ic;
    }

    public void setIc(InterestCalculator ic) {
        this.ic = ic;
    }

    public double calculate(double amount){
        return ic.calculate(amount);
    }
    public void init(){
        System.out.println("Init method called in banking service...");
    }

    public void destroy(){
        System.out.println("Destroy method called banking service...");
    }
}
