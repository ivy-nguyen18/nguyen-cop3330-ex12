/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex12.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = input.nextFloat();
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextFloat();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        Interest simpleInterest = new Interest(principal, rate, years);

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.",years, rate, simpleInterest.investment());
    }
}
