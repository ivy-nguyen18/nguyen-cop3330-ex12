/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package ex12.base;

public class Interest {
    private double principal;
    private double rate;
    private int years;

    public Interest(double principal, double rate, int years){
        this.principal = principal;
        this.rate = rate/100;
        this.years = years;
    }

    public double investment(){
        double interest = principal * (1 + (rate * years));
        return interest;
    }
}
