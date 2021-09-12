/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int principal, numYears;
        double rateOfInterest, simpleInterest;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        principal = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        rateOfInterest = input.nextDouble();

        System.out.print("Enter the number of years: ");
        numYears = input.nextInt();

        simpleInterest = principal * (1 + ((rateOfInterest / 100) * numYears));

        System.out.print("After " + numYears + " years at " + rateOfInterest + "%, the investment will be worth $" + (int)Math.round(simpleInterest) + ".");
    }
}